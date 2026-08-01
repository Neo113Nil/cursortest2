package com.anythink.expressad.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.anythink.basead.exoplayer.k.p;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.webview.b;

/* loaded from: classes.dex */
public class ProgressBar extends View implements b {

    /* renamed from: C, reason: collision with root package name */
    private static final float f19752C = 1200.0f;

    /* renamed from: L, reason: collision with root package name */
    private static final long f19753L = 25;

    /* renamed from: g, reason: collision with root package name */
    private static final String f19754g = "ProgressBar";

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f19755h = false;

    /* renamed from: t, reason: collision with root package name */
    private static final float f19756t = 0.05f;

    /* renamed from: u, reason: collision with root package name */
    private static final float f19757u = 0.2f;

    /* renamed from: v, reason: collision with root package name */
    private static final float f19758v = 0.4f;

    /* renamed from: w, reason: collision with root package name */
    private static final float f19759w = 1.0f;

    /* renamed from: x, reason: collision with root package name */
    private static final long f19760x = 2000;

    /* renamed from: y, reason: collision with root package name */
    private static final float f19761y = 0.2f;

    /* renamed from: A, reason: collision with root package name */
    private int f19762A;

    /* renamed from: B, reason: collision with root package name */
    private int f19763B;

    /* renamed from: D, reason: collision with root package name */
    private long f19764D;

    /* renamed from: E, reason: collision with root package name */
    private Drawable f19765E;

    /* renamed from: F, reason: collision with root package name */
    private Drawable f19766F;

    /* renamed from: G, reason: collision with root package name */
    private Drawable f19767G;

    /* renamed from: H, reason: collision with root package name */
    private Drawable f19768H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f19769I;
    private b.a J;

    /* renamed from: K, reason: collision with root package name */
    private Handler f19770K;

    /* renamed from: M, reason: collision with root package name */
    private boolean f19771M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f19772N;

    /* renamed from: f, reason: collision with root package name */
    Runnable f19773f;
    private Rect i;

    /* renamed from: j, reason: collision with root package name */
    private float f19774j;

    /* renamed from: k, reason: collision with root package name */
    private float f19775k;

    /* renamed from: l, reason: collision with root package name */
    private long f19776l;

    /* renamed from: m, reason: collision with root package name */
    private float f19777m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f19778n;

    /* renamed from: o, reason: collision with root package name */
    private float f19779o;

    /* renamed from: p, reason: collision with root package name */
    private float f19780p;

    /* renamed from: q, reason: collision with root package name */
    private float f19781q;

    /* renamed from: r, reason: collision with root package name */
    private long f19782r;

    /* renamed from: s, reason: collision with root package name */
    private int f19783s;

    /* renamed from: z, reason: collision with root package name */
    private int f19784z;

    public ProgressBar(Context context) {
        super(context);
        this.i = new Rect();
        this.f19775k = 0.95f;
        this.f19764D = f19753L;
        this.f19769I = false;
        this.f19770K = new Handler(Looper.getMainLooper());
        this.f19773f = new Runnable() { // from class: com.anythink.expressad.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f19772N = false;
        setWillNotDraw(false);
    }

    private void a() {
        setWillNotDraw(false);
    }

    private float b() {
        if (this.f19778n) {
            return this.f19771M ? f19759w : f19758v;
        }
        if (this.f19782r < 2000) {
            if (this.f19762A == 1) {
                return this.f19771M ? f19759w : f19758v;
            }
            if (this.f19784z == 1) {
                if (this.f19771M) {
                    return f19758v;
                }
                return 0.2f;
            }
            if (this.f19771M) {
                return 0.2f;
            }
        }
        return f19756t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r11.f19771M != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r5 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x004c, code lost:
    
        if (r11.f19771M == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0052, code lost:
    
        if (r11.f19771M != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0059, code lost:
    
        if (r11.f19771M != false) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        if (!this.f19769I) {
            this.f19769I = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j6 = this.f19772N ? 0L : currentTimeMillis - this.f19776l;
        float abs = Math.abs(j6 / 1000.0f);
        this.f19777m = abs;
        this.f19776l = currentTimeMillis;
        long j9 = this.f19782r + j6;
        this.f19782r = j9;
        boolean z3 = this.f19778n;
        float f3 = f19758v;
        if (!z3) {
            if (j9 < 2000) {
                if (this.f19762A != 1) {
                    if (this.f19784z == 1) {
                    }
                    f3 = 0.2f;
                }
            }
            f3 = 0.05f;
        }
        this.f19781q = f3;
        float f9 = (f3 * abs) + this.f19780p;
        this.f19780p = f9;
        if (!z3) {
            float f10 = this.f19775k;
            if (f9 > f10) {
                this.f19780p = f10;
            }
        }
        this.i.right = (int) (this.f19780p * this.f19774j);
        this.f19770K.removeCallbacksAndMessages(null);
        this.f19770K.postDelayed(this.f19773f, this.f19764D);
        super.draw(canvas);
        float f11 = this.f19777m;
        if (this.f19778n) {
            float f12 = this.f19779o;
            float f13 = this.f19774j;
            int i = (int) ((f19759w - (f12 / (f13 * 0.5f))) * 255.0f);
            if (i < 0) {
                i = 0;
            }
            if (f12 > f13 * 0.5f) {
                setVisible(false);
            }
            Drawable drawable3 = this.f19766F;
            if (drawable3 != null) {
                drawable3.setAlpha(i);
            }
            Drawable drawable4 = this.f19767G;
            if (drawable4 != null) {
                drawable4.setAlpha(i);
            }
            Drawable drawable5 = this.f19765E;
            if (drawable5 != null) {
                drawable5.setAlpha(i);
            }
            canvas.save();
            canvas.translate(this.f19779o, 0.0f);
        }
        if (this.f19766F != null && this.f19765E != null) {
            int width = (int) (this.i.width() - (this.f19765E.getIntrinsicWidth() * f19756t));
            Drawable drawable6 = this.f19766F;
            drawable6.setBounds(0, 0, width, drawable6.getIntrinsicHeight());
            this.f19766F.draw(canvas);
        }
        if (this.f19778n && (drawable2 = this.f19767G) != null && this.f19765E != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.f19767G;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.f19767G.draw(canvas);
            canvas.restore();
        }
        if (this.f19765E != null) {
            canvas.save();
            canvas.translate(this.i.width() - getWidth(), 0.0f);
            this.f19765E.draw(canvas);
            canvas.restore();
        }
        if (!this.f19778n && Math.abs(this.f19780p - this.f19775k) < 1.0E-5f && (drawable = this.f19768H) != null) {
            int i6 = (int) ((f11 * 0.2f * this.f19774j) + this.f19783s);
            this.f19783s = i6;
            if (drawable.getIntrinsicWidth() + i6 >= this.i.width()) {
                this.f19783s = -this.f19768H.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f19783s, 0.0f);
            this.f19768H.draw(canvas);
            canvas.restore();
        }
        if (this.f19778n) {
            canvas.restore();
        }
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z3) {
        return null;
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public float getProgress() {
        return this.f19780p;
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void initResource(boolean z3) {
        if (z3 || (this.f19768H == null && this.f19765E == null && this.f19766F == null && this.f19767G == null)) {
            Drawable drawable = getResources().getDrawable(k.a(getContext(), "anythink_cm_highlight", k.f19632c));
            this.f19768H = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f19768H.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(k.a(getContext(), "anythink_cm_head", k.f19632c));
            this.f19765E = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f19765E.getIntrinsicHeight());
            }
            this.f19766F = getResources().getDrawable(k.a(getContext(), "anythink_cm_tail", k.f19632c));
            this.f19767G = getResources().getDrawable(k.a(getContext(), "anythink_cm_end_animation", k.f19632c));
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i6) {
        super.onMeasure(i, i6);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i6, int i9, int i10) {
        super.onSizeChanged(i, i6, i9, i10);
        this.f19774j = getMeasuredWidth();
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void onThemeChange() {
        if (this.f19769I) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        Drawable drawable = this.f19768H;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f19765E;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void setPaused(boolean z3) {
        this.f19772N = z3;
        if (z3) {
            return;
        }
        this.f19776l = System.currentTimeMillis();
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void setProgress(float f3, boolean z3) {
        if (!z3 || f3 < f19759w) {
            return;
        }
        startEndAnimation();
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void setProgressBarListener(b.a aVar) {
        this.J = aVar;
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void setProgressState(int i) {
        if (i == 5) {
            this.f19784z = 1;
            this.f19762A = 0;
            this.f19763B = 0;
            this.f19782r = 0L;
            return;
        }
        if (i == 6) {
            this.f19762A = 1;
            if (this.f19763B == 1) {
                startEndAnimation();
            }
            this.f19782r = 0L;
            return;
        }
        if (i == 7) {
            startEndAnimation();
        } else {
            if (i != 8) {
                return;
            }
            this.f19763B = 1;
            if (this.f19762A == 1) {
                startEndAnimation();
            }
        }
    }

    @Override // android.view.View, com.anythink.expressad.foundation.webview.b
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void setVisible(boolean z3) {
        if (!z3) {
            setVisibility(4);
            return;
        }
        this.f19771M = true;
        this.f19776l = System.currentTimeMillis();
        this.f19777m = 0.0f;
        this.f19782r = 0L;
        this.f19778n = false;
        this.f19779o = 0.0f;
        this.f19780p = 0.0f;
        this.f19774j = getMeasuredWidth();
        this.f19772N = false;
        this.f19784z = 0;
        this.f19762A = 0;
        this.f19763B = 0;
        Drawable drawable = this.f19768H;
        if (drawable != null) {
            this.f19783s = -drawable.getIntrinsicWidth();
        } else {
            this.f19783s = 0;
        }
        Drawable drawable2 = this.f19766F;
        if (drawable2 != null) {
            drawable2.setAlpha(p.f8473b);
        }
        Drawable drawable3 = this.f19767G;
        if (drawable3 != null) {
            drawable3.setAlpha(p.f8473b);
        }
        Drawable drawable4 = this.f19765E;
        if (drawable4 != null) {
            drawable4.setAlpha(p.f8473b);
        }
        setVisibility(0);
        invalidate();
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void startEndAnimation() {
        if (this.f19778n) {
            return;
        }
        this.f19778n = true;
        this.f19779o = 0.0f;
    }

    private void a(Canvas canvas, float f3) {
        Drawable drawable;
        Drawable drawable2;
        if (this.f19778n) {
            float f9 = this.f19779o;
            float f10 = this.f19774j;
            int i = (int) ((f19759w - (f9 / (f10 * 0.5f))) * 255.0f);
            if (i < 0) {
                i = 0;
            }
            if (f9 > f10 * 0.5f) {
                setVisible(false);
            }
            Drawable drawable3 = this.f19766F;
            if (drawable3 != null) {
                drawable3.setAlpha(i);
            }
            Drawable drawable4 = this.f19767G;
            if (drawable4 != null) {
                drawable4.setAlpha(i);
            }
            Drawable drawable5 = this.f19765E;
            if (drawable5 != null) {
                drawable5.setAlpha(i);
            }
            canvas.save();
            canvas.translate(this.f19779o, 0.0f);
        }
        if (this.f19766F != null && this.f19765E != null) {
            int width = (int) (this.i.width() - (this.f19765E.getIntrinsicWidth() * f19756t));
            Drawable drawable6 = this.f19766F;
            drawable6.setBounds(0, 0, width, drawable6.getIntrinsicHeight());
            this.f19766F.draw(canvas);
        }
        if (this.f19778n && (drawable2 = this.f19767G) != null && this.f19765E != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.f19767G;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.f19767G.draw(canvas);
            canvas.restore();
        }
        if (this.f19765E != null) {
            canvas.save();
            canvas.translate(this.i.width() - getWidth(), 0.0f);
            this.f19765E.draw(canvas);
            canvas.restore();
        }
        if (!this.f19778n && Math.abs(this.f19780p - this.f19775k) < 1.0E-5f && (drawable = this.f19768H) != null) {
            int i6 = (int) ((f3 * 0.2f * this.f19774j) + this.f19783s);
            this.f19783s = i6;
            if (drawable.getIntrinsicWidth() + i6 >= this.i.width()) {
                this.f19783s = -this.f19768H.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f19783s, 0.0f);
            this.f19768H.draw(canvas);
            canvas.restore();
        }
        if (this.f19778n) {
            canvas.restore();
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new Rect();
        this.f19775k = 0.95f;
        this.f19764D = f19753L;
        this.f19769I = false;
        this.f19770K = new Handler(Looper.getMainLooper());
        this.f19773f = new Runnable() { // from class: com.anythink.expressad.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f19772N = false;
        setWillNotDraw(false);
    }
}
