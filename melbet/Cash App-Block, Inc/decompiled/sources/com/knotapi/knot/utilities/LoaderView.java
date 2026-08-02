package com.knotapi.knot.utilities;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.knotapi.knot.R;
import com.knotapi.knot.services.Reporter;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class LoaderView extends SurfaceView implements SurfaceHolder.Callback {
    private static final int FPS = 60;
    private static final long FRAME_TIME_NS = 16666666;
    private static final int LOADER_SIZE_DP = 73;
    private static final long NANOSECONDS_PER_SECOND = 1000000000;
    private static final String TAG = "LoaderView";
    private static final long THREAD_JOIN_TIMEOUT_MS = 500;
    private Activity activity;
    private float animationProgress;
    private ViewGroup customRootView;
    private volatile boolean isLottieReady;
    private volatile boolean isRunning;
    private final AtomicBoolean isShowing;
    private volatile LottieComposition lottieComposition;
    private volatile LottieDrawable lottieDrawable;
    private View overlayView;
    private RenderThread renderThread;
    private ViewGroup rootView;
    private int viewHeight;
    private int viewWidth;

    public class RenderThread extends Thread {
        private volatile boolean running;

        private RenderThread() {
            this.running = false;
        }

        private void advanceAnimation(long j) {
            LottieComposition lottieComposition = LoaderView.this.lottieComposition;
            if (lottieComposition == null) {
                return;
            }
            LoaderView.access$416(LoaderView.this, j / lottieComposition.getDuration());
            if (LoaderView.this.animationProgress >= 1.0f) {
                LoaderView.access$448(LoaderView.this, 1.0f);
            }
            LoaderView.this.lottieDrawable.setProgress(LoaderView.this.animationProgress);
        }

        private void renderFrame() {
            SurfaceHolder holder;
            Canvas canvas = null;
            try {
                try {
                    canvas = LoaderView.this.getHolder().lockCanvas();
                    if (canvas != null) {
                        canvas.drawColor(-1);
                        LoaderView.this.lottieDrawable.draw(canvas);
                    }
                } catch (Exception unused) {
                    return;
                }
            } catch (Exception unused2) {
                if (canvas == null) {
                    return;
                } else {
                    holder = LoaderView.this.getHolder();
                }
            } catch (Throwable th) {
                if (canvas != null) {
                    try {
                        LoaderView.this.getHolder().unlockCanvasAndPost(canvas);
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
            if (canvas != null) {
                holder = LoaderView.this.getHolder();
                holder.unlockCanvasAndPost(canvas);
            }
        }

        private void sleepForFrameRate(long j) {
            long nanoTime = LoaderView.FRAME_TIME_NS - (System.nanoTime() - j);
            if (nanoTime > 0) {
                try {
                    Thread.sleep(nanoTime / 1000000, (int) (nanoTime % 1000000));
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long nanoTime = System.nanoTime();
            while (this.running) {
                long nanoTime2 = System.nanoTime();
                long j = (nanoTime2 - nanoTime) / 1000000;
                if (LoaderView.this.isLottieReady && LoaderView.this.lottieDrawable != null) {
                    advanceAnimation(j);
                    renderFrame();
                }
                sleepForFrameRate(nanoTime2);
                nanoTime = nanoTime2;
            }
        }

        public void setRunning(boolean z) {
            this.running = z;
        }
    }

    public LoaderView(Context context) {
        super(context);
        this.isRunning = false;
        this.isLottieReady = false;
        this.animationProgress = RecyclerView.DECELERATION_RATE;
        this.isShowing = new AtomicBoolean(false);
        init(context);
    }

    public static /* synthetic */ float access$416(LoaderView loaderView, float f) {
        float f2 = loaderView.animationProgress + f;
        loaderView.animationProgress = f2;
        return f2;
    }

    public static /* synthetic */ float access$448(LoaderView loaderView, float f) {
        float f2 = loaderView.animationProgress % f;
        loaderView.animationProgress = f2;
        return f2;
    }

    public static LoaderView createOverlayLoader(Context context, ViewGroup viewGroup) {
        if (!(context instanceof Activity)) {
            a$$ExternalSyntheticBUOutline0.m$3("Context must be an Activity");
            return null;
        }
        Activity activity = (Activity) context;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.overlay_smooth_loader, viewGroup != null ? viewGroup : new FrameLayout(activity), false);
        LoaderView loaderView = (LoaderView) inflate.findViewById(R.id.smooth_loader_view);
        if (loaderView == null) {
            a$$ExternalSyntheticBUOutline0.m$1("LoaderView not found in layout R.layout.overlay_smooth_loader. Ensure the layout contains a view with id @id/smooth_loader_view");
            return null;
        }
        loaderView.activity = activity;
        loaderView.overlayView = inflate;
        loaderView.customRootView = viewGroup;
        return loaderView;
    }

    private void init(Context context) {
        getHolder().addCallback(this);
        setZOrderOnTop(false);
        getHolder().setFormat(-3);
        LottieCompositionFactory.fromRawRes(context, R.raw.knot_loading).addListener(new LoaderView$$ExternalSyntheticLambda1(this, 0)).addFailureListener(new LoaderView$$ExternalSyntheticLambda2(0));
    }

    private void initializeOverlay() {
        Activity activity;
        if (this.overlayView == null || (activity = this.activity) == null) {
            return;
        }
        try {
            ViewGroup viewGroup = this.customRootView;
            if (viewGroup == null) {
                viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            }
            this.rootView = viewGroup;
            if (!(this.overlayView.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                this.overlayView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            }
            this.overlayView.setElevation(100.0f);
            this.overlayView.setZ(Float.MAX_VALUE);
        } catch (Exception e) {
            Reporter.error(e, "Error initializing overlay loader");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hide$2() {
        ViewGroup viewGroup;
        try {
            stop();
            View view = this.overlayView;
            if (view == null || (viewGroup = this.rootView) == null) {
                return;
            }
            viewGroup.removeView(view);
        } catch (IllegalArgumentException unused) {
        } catch (Exception e) {
            Reporter.error(e, "Error hiding overlay loader");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$init$0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$1() {
        try {
            initializeOverlay();
            View view = this.overlayView;
            if (view == null || this.rootView == null) {
                this.isShowing.set(false);
                return;
            }
            if (view.getParent() != null) {
                ((ViewGroup) this.overlayView.getParent()).removeView(this.overlayView);
            }
            this.rootView.addView(this.overlayView);
            this.overlayView.bringToFront();
            this.overlayView.invalidate();
            start();
        } catch (Exception e) {
            Reporter.error(e, "Error showing overlay loader");
            this.isShowing.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setupLottieDrawable(LottieComposition lottieComposition) {
        this.lottieComposition = lottieComposition;
        this.lottieDrawable = new LottieDrawable();
        this.lottieDrawable.setComposition(lottieComposition);
        this.lottieDrawable.setRepeatCount(-1);
        this.isLottieReady = true;
        this.animationProgress = RecyclerView.DECELERATION_RATE;
        if (this.viewWidth <= 0 || this.viewHeight <= 0) {
            return;
        }
        updateLottieBounds();
    }

    private void start() {
        this.isRunning = true;
        if (getHolder().getSurface() == null || !getHolder().getSurface().isValid()) {
            return;
        }
        startRendering();
    }

    private void startRendering() {
        RenderThread renderThread = this.renderThread;
        if (renderThread == null || !renderThread.isAlive()) {
            RenderThread renderThread2 = new RenderThread();
            this.renderThread = renderThread2;
            renderThread2.setRunning(true);
            this.renderThread.start();
        }
    }

    private void stop() {
        this.isRunning = false;
        stopRendering();
    }

    private void stopRendering() {
        RenderThread renderThread = this.renderThread;
        if (renderThread == null) {
            return;
        }
        renderThread.setRunning(false);
        try {
            this.renderThread.join(THREAD_JOIN_TIMEOUT_MS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        this.renderThread = null;
    }

    private void updateLottieBounds() {
        if (this.lottieDrawable == null || this.viewWidth <= 0 || this.viewHeight <= 0) {
            return;
        }
        int i = (int) (getContext().getResources().getDisplayMetrics().density * 73.0f);
        int i2 = (this.viewWidth - i) / 2;
        int i3 = (this.viewHeight - i) / 2;
        this.lottieDrawable.setBounds(i2, i3, i2 + i, i + i3);
    }

    public void cleanup() {
        try {
            if (this.isShowing.get()) {
                hide();
            }
            stop();
            this.overlayView = null;
            this.activity = null;
            this.rootView = null;
            this.customRootView = null;
        } catch (Exception e) {
            Reporter.error(e, "Error during cleanup");
        }
    }

    public void hide() {
        if (this.activity == null || !this.isShowing.compareAndSet(true, false)) {
            return;
        }
        this.activity.runOnUiThread(new LoaderView$$ExternalSyntheticLambda0(this, 0));
    }

    public boolean isShowing() {
        return this.isShowing.get();
    }

    public void show() {
        if (this.activity == null || !this.isShowing.compareAndSet(false, true)) {
            return;
        }
        this.activity.runOnUiThread(new LoaderView$$ExternalSyntheticLambda0(this, 1));
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.viewWidth = i2;
        this.viewHeight = i3;
        updateLottieBounds();
        if (this.isRunning) {
            RenderThread renderThread = this.renderThread;
            if (renderThread == null || !renderThread.isAlive()) {
                startRendering();
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        stopRendering();
    }

    public LoaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isRunning = false;
        this.isLottieReady = false;
        this.animationProgress = RecyclerView.DECELERATION_RATE;
        this.isShowing = new AtomicBoolean(false);
        init(context);
    }

    public LoaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.isRunning = false;
        this.isLottieReady = false;
        this.animationProgress = RecyclerView.DECELERATION_RATE;
        this.isShowing = new AtomicBoolean(false);
        init(context);
    }

    public static LoaderView createOverlayLoader(Context context) {
        return createOverlayLoader(context, null);
    }
}
