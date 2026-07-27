package com.giderosmobile.android;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.giderosmobile.android.player.GiderosApplication;
import com.giderosmobile.android.player.WeakActivityHolder;
import com.pishtech.ifd2.R;

/* loaded from: classes.dex */
public class ifd2Activity extends Activity implements View.OnTouchListener, SurfaceHolder.Callback {
    private static String[] externalClasses;
    private static int hasSplash;
    private static FrameLayout layout;
    private static ImageView splash;
    private static FrameLayout splashLayout;
    private SurfaceView mGLView;
    private long mNativeHandle;
    private SurfaceHolder mSurfaceHolder;
    private boolean mHasFocus = false;
    private boolean mPlaying = false;
    int[] id = new int[256];
    int[] x = new int[256];
    int[] y = new int[256];
    float[] pressure = new float[256];

    static {
        System.loadLibrary("gvfs");
        System.loadLibrary("lua");
        System.loadLibrary("gideros");
        System.loadLibrary("iab");
        System.loadLibrary("json");
        System.loadLibrary("lfs");
        externalClasses = new String[]{"com.giderosmobile.android.plugins.iab.Iab", null};
        hasSplash = -1;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        WindowInsetsController windowInsetsController;
        super.onCreate(bundle);
        if (GiderosSettings.oculusNative) {
            SurfaceView surfaceView = new SurfaceView(this);
            this.mGLView = surfaceView;
            setContentView(surfaceView);
            this.mGLView.getHolder().addCallback(this);
        } else {
            GiderosGLSurfaceView giderosGLSurfaceView = new GiderosGLSurfaceView(this);
            this.mGLView = giderosGLSurfaceView;
            GiderosSettings.mainView = giderosGLSurfaceView;
            setContentView(this.mGLView);
            this.mGLView.setOnTouchListener(this);
            if (GiderosSettings.notchReady && Build.VERSION.SDK_INT >= 28) {
                getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                windowInsetsController = getWindow().getDecorView().getWindowInsetsController();
                windowInsetsController.setSystemBarsBehavior(2);
            }
            if (getResources().getIdentifier("splash", "drawable", getPackageName()) != 0) {
                layout = (FrameLayout) getWindow().getDecorView();
                hasSplash = 11;
                splashLayout = new FrameLayout(this);
                splashLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                splashLayout.setBackgroundColor(Color.parseColor("#e8f4ff"));
                splash = new ImageView(this);
                splash.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                splash.setScaleType(ImageView.ScaleType.CENTER);
                splash.setBackgroundResource(R.drawable.splash);
                splashLayout.addView(splash);
                layout.addView(splashLayout);
            }
        }
        WeakActivityHolder.set(this);
        GiderosApplication.onCreate(externalClasses, this.mGLView);
        if (GiderosSettings.oculusNative) {
            new Thread() { // from class: com.giderosmobile.android.ifd2Activity.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    GiderosApplication.oculusRunThread();
                }
            }.start();
            GiderosApplication.oculusPostCreate();
        }
        processIntent(getIntent());
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        processIntent(intent);
    }

    protected void processIntent(Intent intent) {
        if ("android.intent.action.VIEW".equals(intent.getAction())) {
            GiderosApplication.getInstance().onHandleOpenUrl(intent.getData().toString());
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        GiderosApplication.getInstance().onStart();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        GiderosApplication.getInstance().onRestart();
    }

    @Override // android.app.Activity
    public void onStop() {
        GiderosApplication.getInstance().onStop();
        super.onStop();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        GiderosApplication.onDestroy();
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPause() {
        if (this.mPlaying) {
            this.mPlaying = false;
            GiderosApplication.getInstance().onPause();
            if (!GiderosSettings.oculusNative) {
                ((GiderosGLSurfaceView) this.mGLView).onPause();
            }
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.mHasFocus || this.mPlaying) {
            return;
        }
        if (!GiderosSettings.oculusNative) {
            ((GiderosGLSurfaceView) this.mGLView).onResume();
        }
        this.mPlaying = true;
        GiderosApplication.getInstance().onResume();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        GiderosApplication giderosApplication = GiderosApplication.getInstance();
        if (giderosApplication != null) {
            giderosApplication.onLowMemory();
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        GiderosApplication.getInstance().onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        GiderosApplication.getInstance().onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        this.mHasFocus = z;
        if (!z || this.mPlaying) {
            return;
        }
        if (!GiderosSettings.oculusNative) {
            ((GiderosGLSurfaceView) this.mGLView).onResume();
        }
        GiderosApplication.getInstance().onResume();
        this.mPlaying = true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        GiderosApplication giderosApplication = GiderosApplication.getInstance();
        if (giderosApplication == null) {
            return false;
        }
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            this.id[i] = motionEvent.getPointerId(i);
            this.x[i] = (int) motionEvent.getX(i);
            this.y[i] = (int) motionEvent.getY(i);
            this.pressure[i] = motionEvent.getPressure(i);
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = (actionMasked == 5 || actionMasked == 6) ? motionEvent.getActionIndex() : 0;
        if (actionMasked == 0 || actionMasked == 5) {
            giderosApplication.onTouchesBegin(pointerCount, this.id, this.x, this.y, this.pressure, actionIndex);
        } else if (actionMasked == 2) {
            giderosApplication.onTouchesMove(pointerCount, this.id, this.x, this.y, this.pressure);
        } else if (actionMasked == 1 || actionMasked == 6) {
            giderosApplication.onTouchesEnd(pointerCount, this.id, this.x, this.y, this.pressure, actionIndex);
        } else if (actionMasked == 3) {
            giderosApplication.onTouchesCancel(pointerCount, this.id, this.x, this.y, this.pressure);
        }
        return true;
    }

    @Override // android.app.Activity
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        GiderosApplication giderosApplication;
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && (giderosApplication = GiderosApplication.getInstance()) != null) {
            giderosApplication.onMouseWheel((int) motionEvent.getX(), (int) motionEvent.getY(), motionEvent.getButtonState(), motionEvent.getAxisValue(9));
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        GiderosApplication giderosApplication = GiderosApplication.getInstance();
        if (giderosApplication == null || !giderosApplication.onKeyDown(i, keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        GiderosApplication giderosApplication = GiderosApplication.getInstance();
        if (giderosApplication == null || !giderosApplication.onKeyUp(i, keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyMultiple(int i, int i2, KeyEvent keyEvent) {
        GiderosApplication giderosApplication = GiderosApplication.getInstance();
        if (giderosApplication == null || !giderosApplication.onKeyMultiple(i, i2, keyEvent)) {
            return super.onKeyMultiple(i, i2, keyEvent);
        }
        return true;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        GiderosApplication.getInstance().onSurfaceCreated(surfaceHolder.getSurface());
        this.mSurfaceHolder = surfaceHolder;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        GiderosApplication.getInstance().onSurfaceChanged(i2, i3, surfaceHolder.getSurface());
        this.mSurfaceHolder = surfaceHolder;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        GiderosApplication.getInstance().onSurfaceDestroyed();
        this.mSurfaceHolder = null;
    }

    public static void dismisSplash() {
        int i = hasSplash;
        if (i == -1) {
            return;
        }
        if (i == 0) {
            hasSplash = -1;
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.giderosmobile.android.ifd2Activity.2
                @Override // java.lang.Runnable
                public void run() {
                    if (ifd2Activity.splashLayout != null) {
                        ifd2Activity.splashLayout.setVisibility(8);
                        ifd2Activity.splash.setBackgroundResource(0);
                        ifd2Activity.layout.removeView(ifd2Activity.splashLayout);
                    }
                    FrameLayout unused = ifd2Activity.splashLayout = null;
                    ImageView unused2 = ifd2Activity.splash = null;
                    FrameLayout unused3 = ifd2Activity.layout = null;
                }
            });
        } else if (i > 0) {
            hasSplash = i - 1;
        }
    }
}
