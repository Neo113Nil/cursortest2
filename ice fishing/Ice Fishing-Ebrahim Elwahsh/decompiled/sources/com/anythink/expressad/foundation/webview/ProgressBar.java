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
    private static final float f19910C = 1200.0f;

    /* renamed from: L, reason: collision with root package name */
    private static final long f19911L = 25;

    /* renamed from: g, reason: collision with root package name */
    private static final String f19912g = "ProgressBar";

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f19913h = false;

    /* renamed from: t, reason: collision with root package name */
    private static final float f19914t = 0.05f;

    /* renamed from: u, reason: collision with root package name */
    private static final float f19915u = 0.2f;

    /* renamed from: v, reason: collision with root package name */
    private static final float f19916v = 0.4f;

    /* renamed from: w, reason: collision with root package name */
    private static final float f19917w = 1.0f;

    /* renamed from: x, reason: collision with root package name */
    private static final long f19918x = 2000;

    /* renamed from: y, reason: collision with root package name */
    private static final float f19919y = 0.2f;

    /* renamed from: A, reason: collision with root package name */
    private int f19920A;

    /* renamed from: B, reason: collision with root package name */
    private int f19921B;

    /* renamed from: D, reason: collision with root package name */
    private long f19922D;

    /* renamed from: E, reason: collision with root package name */
    private Drawable f19923E;

    /* renamed from: F, reason: collision with root package name */
    private Drawable f19924F;

    /* renamed from: G, reason: collision with root package name */
    private Drawable f19925G;

    /* renamed from: H, reason: collision with root package name */
    private Drawable f19926H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f19927I;
    private b.a J;

    /* renamed from: K, reason: collision with root package name */
    private Handler f19928K;

    /* renamed from: M, reason: collision with root package name */
    private boolean f19929M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f19930N;

    /* renamed from: f, reason: collision with root package name */
    Runnable f19931f;
    private Rect i;

    /* renamed from: j, reason: collision with root package name */
    private float f19932j;

    /* renamed from: k, reason: collision with root package name */
    private float f19933k;

    /* renamed from: l, reason: collision with root package name */
    private long f19934l;

    /* renamed from: m, reason: collision with root package name */
    private float f19935m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f19936n;

    /* renamed from: o, reason: collision with root package name */
    private float f19937o;

    /* renamed from: p, reason: collision with root package name */
    private float f19938p;

    /* renamed from: q, reason: collision with root package name */
    private float f19939q;

    /* renamed from: r, reason: collision with root package name */
    private long f19940r;

    /* renamed from: s, reason: collision with root package name */
    private int f19941s;

    /* renamed from: z, reason: collision with root package name */
    private int f19942z;

    public ProgressBar(Context context) {
        super(context);
        this.i = new Rect();
        this.f19933k = 0.95f;
        this.f19922D = f19911L;
        this.f19927I = false;
        this.f19928K = new Handler(Looper.getMainLooper());
        this.f19931f = new Runnable() { // from class: com.anythink.expressad.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f19930N = false;
        setWillNotDraw(false);
    }

    private void a() {
        setWillNotDraw(false);
    }

    private float b() {
        if (this.f19936n) {
            return this.f19929M ? f19917w : f19916v;
        }
        if (this.f19940r < 2000) {
            if (this.f19920A == 1) {
                return this.f19929M ? f19917w : f19916v;
            }
            if (this.f19942z == 1) {
                if (this.f19929M) {
                    return f19916v;
                }
                return 0.2f;
            }
            if (this.f19929M) {
                return 0.2f;
            }
        }
        return f19914t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r11.f19929M != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r5 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x004c, code lost:
    
        if (r11.f19929M == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0052, code lost:
    
        if (r11.f19929M != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0059, code lost:
    
        if (r11.f19929M != false) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        if (!this.f19927I) {
            this.f19927I = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j9 = this.f19930N ? 0L : currentTimeMillis - this.f19934l;
        float abs = Math.abs(j9 / 1000.0f);
        this.f19935m = abs;
        this.f19934l = currentTimeMillis;
        long j10 = this.f19940r + j9;
        this.f19940r = j10;
        boolean z8 = this.f19936n;
        float f6 = f19916v;
        if (!z8) {
            if (j10 < 2000) {
                if (this.f19920A != 1) {
                    if (this.f19942z == 1) {
                    }
                    f6 = 0.2f;
                }
            }
            f6 = 0.05f;
        }
        this.f19939q = f6;
        float f9 = (f6 * abs) + this.f19938p;
        this.f19938p = f9;
        if (!z8) {
            float f10 = this.f19933k;
            if (f9 > f10) {
                this.f19938p = f10;
            }
        }
        this.i.right = (int) (this.f19938p * this.f19932j);
        this.f19928K.removeCallbacksAndMessages(null);
        this.f19928K.postDelayed(this.f19931f, this.f19922D);
        super.draw(canvas);
        float f11 = this.f19935m;
        if (this.f19936n) {
            float f12 = this.f19937o;
            float f13 = this.f19932j;
            int i = (int) ((f19917w - (f12 / (f13 * 0.5f))) * 255.0f);
            if (i < 0) {
                i = 0;
            }
            if (f12 > f13 * 0.5f) {
                setVisible(false);
            }
            Drawable drawable3 = this.f19924F;
            if (drawable3 != null) {
                drawable3.setAlpha(i);
            }
            Drawable drawable4 = this.f19925G;
            if (drawable4 != null) {
                drawable4.setAlpha(i);
            }
            Drawable drawable5 = this.f19923E;
            if (drawable5 != null) {
                drawable5.setAlpha(i);
            }
            canvas.save();
            canvas.translate(this.f19937o, 0.0f);
        }
        if (this.f19924F != null && this.f19923E != null) {
            int width = (int) (this.i.width() - (this.f19923E.getIntrinsicWidth() * f19914t));
            Drawable drawable6 = this.f19924F;
            drawable6.setBounds(0, 0, width, drawable6.getIntrinsicHeight());
            this.f19924F.draw(canvas);
        }
        if (this.f19936n && (drawable2 = this.f19925G) != null && this.f19923E != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.f19925G;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.f19925G.draw(canvas);
            canvas.restore();
        }
        if (this.f19923E != null) {
            canvas.save();
            canvas.translate(this.i.width() - getWidth(), 0.0f);
            this.f19923E.draw(canvas);
            canvas.restore();
        }
        if (!this.f19936n && Math.abs(this.f19938p - this.f19933k) < 1.0E-5f && (drawable = this.f19926H) != null) {
            int i4 = (int) ((f11 * 0.2f * this.f19932j) + this.f19941s);
            this.f19941s = i4;
            if (drawable.getIntrinsicWidth() + i4 >= this.i.width()) {
                this.f19941s = -this.f19926H.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f19941s, 0.0f);
            this.f19926H.draw(canvas);
            canvas.restore();
        }
        if (this.f19936n) {
            canvas.restore();
        }
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z8) {
        return null;
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public float getProgress() {
        return this.f19938p;
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void initResource(boolean z8) {
        if (z8 || (this.f19926H == null && this.f19923E == null && this.f19924F == null && this.f19925G == null)) {
            Drawable drawable = getResources().getDrawable(k.a(getContext(), "anythink_cm_highlight", k.f19790c));
            this.f19926H = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f19926H.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(k.a(getContext(), "anythink_cm_head", k.f19790c));
            this.f19923E = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f19923E.getIntrinsicHeight());
            }
            this.f19924F = getResources().getDrawable(k.a(getContext(), "anythink_cm_tail", k.f19790c));
            this.f19925G = getResources().getDrawable(k.a(getContext(), "anythink_cm_end_animation", k.f19790c));
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i4, int i9, int i10) {
        super.onSizeChanged(i, i4, i9, i10);
        this.f19932j = getMeasuredWidth();
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void onThemeChange() {
        if (this.f19927I) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        Drawable drawable = this.f19926H;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f19923E;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void setPaused(boolean z8) {
        this.f19930N = z8;
        if (z8) {
            return;
        }
        this.f19934l = System.currentTimeMillis();
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void setProgress(float f6, boolean z8) {
        if (!z8 || f6 < f19917w) {
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
            this.f19942z = 1;
            this.f19920A = 0;
            this.f19921B = 0;
            this.f19940r = 0L;
            return;
        }
        if (i == 6) {
            this.f19920A = 1;
            if (this.f19921B == 1) {
                startEndAnimation();
            }
            this.f19940r = 0L;
            return;
        }
        if (i == 7) {
            startEndAnimation();
        } else {
            if (i != 8) {
                return;
            }
            this.f19921B = 1;
            if (this.f19920A == 1) {
                startEndAnimation();
            }
        }
    }

    @Override // android.view.View, com.anythink.expressad.foundation.webview.b
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void setVisible(boolean z8) {
        if (!z8) {
            setVisibility(4);
            return;
        }
        this.f19929M = true;
        this.f19934l = System.currentTimeMillis();
        this.f19935m = 0.0f;
        this.f19940r = 0L;
        this.f19936n = false;
        this.f19937o = 0.0f;
        this.f19938p = 0.0f;
        this.f19932j = getMeasuredWidth();
        this.f19930N = false;
        this.f19942z = 0;
        this.f19920A = 0;
        this.f19921B = 0;
        Drawable drawable = this.f19926H;
        if (drawable != null) {
            this.f19941s = -drawable.getIntrinsicWidth();
        } else {
            this.f19941s = 0;
        }
        Drawable drawable2 = this.f19924F;
        if (drawable2 != null) {
            drawable2.setAlpha(p.f8630b);
        }
        Drawable drawable3 = this.f19925G;
        if (drawable3 != null) {
            drawable3.setAlpha(p.f8630b);
        }
        Drawable drawable4 = this.f19923E;
        if (drawable4 != null) {
            drawable4.setAlpha(p.f8630b);
        }
        setVisibility(0);
        invalidate();
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void startEndAnimation() {
        if (this.f19936n) {
            return;
        }
        this.f19936n = true;
        this.f19937o = 0.0f;
    }

    private void a(Canvas canvas, float f6) {
        Drawable drawable;
        Drawable drawable2;
        if (this.f19936n) {
            float f9 = this.f19937o;
            float f10 = this.f19932j;
            int i = (int) ((f19917w - (f9 / (f10 * 0.5f))) * 255.0f);
            if (i < 0) {
                i = 0;
            }
            if (f9 > f10 * 0.5f) {
                setVisible(false);
            }
            Drawable drawable3 = this.f19924F;
            if (drawable3 != null) {
                drawable3.setAlpha(i);
            }
            Drawable drawable4 = this.f19925G;
            if (drawable4 != null) {
                drawable4.setAlpha(i);
            }
            Drawable drawable5 = this.f19923E;
            if (drawable5 != null) {
                drawable5.setAlpha(i);
            }
            canvas.save();
            canvas.translate(this.f19937o, 0.0f);
        }
        if (this.f19924F != null && this.f19923E != null) {
            int width = (int) (this.i.width() - (this.f19923E.getIntrinsicWidth() * f19914t));
            Drawable drawable6 = this.f19924F;
            drawable6.setBounds(0, 0, width, drawable6.getIntrinsicHeight());
            this.f19924F.draw(canvas);
        }
        if (this.f19936n && (drawable2 = this.f19925G) != null && this.f19923E != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.f19925G;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.f19925G.draw(canvas);
            canvas.restore();
        }
        if (this.f19923E != null) {
            canvas.save();
            canvas.translate(this.i.width() - getWidth(), 0.0f);
            this.f19923E.draw(canvas);
            canvas.restore();
        }
        if (!this.f19936n && Math.abs(this.f19938p - this.f19933k) < 1.0E-5f && (drawable = this.f19926H) != null) {
            int i4 = (int) ((f6 * 0.2f * this.f19932j) + this.f19941s);
            this.f19941s = i4;
            if (drawable.getIntrinsicWidth() + i4 >= this.i.width()) {
                this.f19941s = -this.f19926H.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f19941s, 0.0f);
            this.f19926H.draw(canvas);
            canvas.restore();
        }
        if (this.f19936n) {
            canvas.restore();
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new Rect();
        this.f19933k = 0.95f;
        this.f19922D = f19911L;
        this.f19927I = false;
        this.f19928K = new Handler(Looper.getMainLooper());
        this.f19931f = new Runnable() { // from class: com.anythink.expressad.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f19930N = false;
        setWillNotDraw(false);
    }
}
