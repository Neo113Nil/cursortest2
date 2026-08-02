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
    private static final float f20539C = 1200.0f;

    /* renamed from: L, reason: collision with root package name */
    private static final long f20540L = 25;

    /* renamed from: g, reason: collision with root package name */
    private static final String f20541g = "ProgressBar";

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f20542h = false;

    /* renamed from: t, reason: collision with root package name */
    private static final float f20543t = 0.05f;

    /* renamed from: u, reason: collision with root package name */
    private static final float f20544u = 0.2f;

    /* renamed from: v, reason: collision with root package name */
    private static final float f20545v = 0.4f;

    /* renamed from: w, reason: collision with root package name */
    private static final float f20546w = 1.0f;

    /* renamed from: x, reason: collision with root package name */
    private static final long f20547x = 2000;

    /* renamed from: y, reason: collision with root package name */
    private static final float f20548y = 0.2f;

    /* renamed from: A, reason: collision with root package name */
    private int f20549A;

    /* renamed from: B, reason: collision with root package name */
    private int f20550B;

    /* renamed from: D, reason: collision with root package name */
    private long f20551D;

    /* renamed from: E, reason: collision with root package name */
    private Drawable f20552E;

    /* renamed from: F, reason: collision with root package name */
    private Drawable f20553F;

    /* renamed from: G, reason: collision with root package name */
    private Drawable f20554G;

    /* renamed from: H, reason: collision with root package name */
    private Drawable f20555H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f20556I;
    private b.a J;

    /* renamed from: K, reason: collision with root package name */
    private Handler f20557K;

    /* renamed from: M, reason: collision with root package name */
    private boolean f20558M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f20559N;

    /* renamed from: f, reason: collision with root package name */
    Runnable f20560f;
    private Rect i;

    /* renamed from: j, reason: collision with root package name */
    private float f20561j;

    /* renamed from: k, reason: collision with root package name */
    private float f20562k;

    /* renamed from: l, reason: collision with root package name */
    private long f20563l;

    /* renamed from: m, reason: collision with root package name */
    private float f20564m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f20565n;

    /* renamed from: o, reason: collision with root package name */
    private float f20566o;

    /* renamed from: p, reason: collision with root package name */
    private float f20567p;

    /* renamed from: q, reason: collision with root package name */
    private float f20568q;

    /* renamed from: r, reason: collision with root package name */
    private long f20569r;

    /* renamed from: s, reason: collision with root package name */
    private int f20570s;

    /* renamed from: z, reason: collision with root package name */
    private int f20571z;

    public ProgressBar(Context context) {
        super(context);
        this.i = new Rect();
        this.f20562k = 0.95f;
        this.f20551D = f20540L;
        this.f20556I = false;
        this.f20557K = new Handler(Looper.getMainLooper());
        this.f20560f = new Runnable() { // from class: com.anythink.expressad.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f20559N = false;
        setWillNotDraw(false);
    }

    private void a() {
        setWillNotDraw(false);
    }

    private float b() {
        if (this.f20565n) {
            return this.f20558M ? f20546w : f20545v;
        }
        if (this.f20569r < 2000) {
            if (this.f20549A == 1) {
                return this.f20558M ? f20546w : f20545v;
            }
            if (this.f20571z == 1) {
                if (this.f20558M) {
                    return f20545v;
                }
                return 0.2f;
            }
            if (this.f20558M) {
                return 0.2f;
            }
        }
        return f20543t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r11.f20558M != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        r5 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x004c, code lost:
    
        if (r11.f20558M == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0052, code lost:
    
        if (r11.f20558M != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0059, code lost:
    
        if (r11.f20558M != false) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        if (!this.f20556I) {
            this.f20556I = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j6 = this.f20559N ? 0L : currentTimeMillis - this.f20563l;
        float abs = Math.abs(j6 / 1000.0f);
        this.f20564m = abs;
        this.f20563l = currentTimeMillis;
        long j9 = this.f20569r + j6;
        this.f20569r = j9;
        boolean z6 = this.f20565n;
        float f2 = f20545v;
        if (!z6) {
            if (j9 < 2000) {
                if (this.f20549A != 1) {
                    if (this.f20571z == 1) {
                    }
                    f2 = 0.2f;
                }
            }
            f2 = 0.05f;
        }
        this.f20568q = f2;
        float f9 = (f2 * abs) + this.f20567p;
        this.f20567p = f9;
        if (!z6) {
            float f10 = this.f20562k;
            if (f9 > f10) {
                this.f20567p = f10;
            }
        }
        this.i.right = (int) (this.f20567p * this.f20561j);
        this.f20557K.removeCallbacksAndMessages(null);
        this.f20557K.postDelayed(this.f20560f, this.f20551D);
        super.draw(canvas);
        float f11 = this.f20564m;
        if (this.f20565n) {
            float f12 = this.f20566o;
            float f13 = this.f20561j;
            int i = (int) ((f20546w - (f12 / (f13 * 0.5f))) * 255.0f);
            if (i < 0) {
                i = 0;
            }
            if (f12 > f13 * 0.5f) {
                setVisible(false);
            }
            Drawable drawable3 = this.f20553F;
            if (drawable3 != null) {
                drawable3.setAlpha(i);
            }
            Drawable drawable4 = this.f20554G;
            if (drawable4 != null) {
                drawable4.setAlpha(i);
            }
            Drawable drawable5 = this.f20552E;
            if (drawable5 != null) {
                drawable5.setAlpha(i);
            }
            canvas.save();
            canvas.translate(this.f20566o, 0.0f);
        }
        if (this.f20553F != null && this.f20552E != null) {
            int width = (int) (this.i.width() - (this.f20552E.getIntrinsicWidth() * f20543t));
            Drawable drawable6 = this.f20553F;
            drawable6.setBounds(0, 0, width, drawable6.getIntrinsicHeight());
            this.f20553F.draw(canvas);
        }
        if (this.f20565n && (drawable2 = this.f20554G) != null && this.f20552E != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.f20554G;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.f20554G.draw(canvas);
            canvas.restore();
        }
        if (this.f20552E != null) {
            canvas.save();
            canvas.translate(this.i.width() - getWidth(), 0.0f);
            this.f20552E.draw(canvas);
            canvas.restore();
        }
        if (!this.f20565n && Math.abs(this.f20567p - this.f20562k) < 1.0E-5f && (drawable = this.f20555H) != null) {
            int i4 = (int) ((f11 * 0.2f * this.f20561j) + this.f20570s);
            this.f20570s = i4;
            if (drawable.getIntrinsicWidth() + i4 >= this.i.width()) {
                this.f20570s = -this.f20555H.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f20570s, 0.0f);
            this.f20555H.draw(canvas);
            canvas.restore();
        }
        if (this.f20565n) {
            canvas.restore();
        }
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z6) {
        return null;
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public float getProgress() {
        return this.f20567p;
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void initResource(boolean z6) {
        if (z6 || (this.f20555H == null && this.f20552E == null && this.f20553F == null && this.f20554G == null)) {
            Drawable drawable = getResources().getDrawable(k.a(getContext(), "anythink_cm_highlight", k.f20419c));
            this.f20555H = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f20555H.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(k.a(getContext(), "anythink_cm_head", k.f20419c));
            this.f20552E = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f20552E.getIntrinsicHeight());
            }
            this.f20553F = getResources().getDrawable(k.a(getContext(), "anythink_cm_tail", k.f20419c));
            this.f20554G = getResources().getDrawable(k.a(getContext(), "anythink_cm_end_animation", k.f20419c));
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i4, int i6, int i9) {
        super.onSizeChanged(i, i4, i6, i9);
        this.f20561j = getMeasuredWidth();
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void onThemeChange() {
        if (this.f20556I) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z6) {
        super.onWindowFocusChanged(z6);
        Drawable drawable = this.f20555H;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f20552E;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void setPaused(boolean z6) {
        this.f20559N = z6;
        if (z6) {
            return;
        }
        this.f20563l = System.currentTimeMillis();
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void setProgress(float f2, boolean z6) {
        if (!z6 || f2 < f20546w) {
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
            this.f20571z = 1;
            this.f20549A = 0;
            this.f20550B = 0;
            this.f20569r = 0L;
            return;
        }
        if (i == 6) {
            this.f20549A = 1;
            if (this.f20550B == 1) {
                startEndAnimation();
            }
            this.f20569r = 0L;
            return;
        }
        if (i == 7) {
            startEndAnimation();
        } else {
            if (i != 8) {
                return;
            }
            this.f20550B = 1;
            if (this.f20549A == 1) {
                startEndAnimation();
            }
        }
    }

    @Override // android.view.View, com.anythink.expressad.foundation.webview.b
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void setVisible(boolean z6) {
        if (!z6) {
            setVisibility(4);
            return;
        }
        this.f20558M = true;
        this.f20563l = System.currentTimeMillis();
        this.f20564m = 0.0f;
        this.f20569r = 0L;
        this.f20565n = false;
        this.f20566o = 0.0f;
        this.f20567p = 0.0f;
        this.f20561j = getMeasuredWidth();
        this.f20559N = false;
        this.f20571z = 0;
        this.f20549A = 0;
        this.f20550B = 0;
        Drawable drawable = this.f20555H;
        if (drawable != null) {
            this.f20570s = -drawable.getIntrinsicWidth();
        } else {
            this.f20570s = 0;
        }
        Drawable drawable2 = this.f20553F;
        if (drawable2 != null) {
            drawable2.setAlpha(p.f9259b);
        }
        Drawable drawable3 = this.f20554G;
        if (drawable3 != null) {
            drawable3.setAlpha(p.f9259b);
        }
        Drawable drawable4 = this.f20552E;
        if (drawable4 != null) {
            drawable4.setAlpha(p.f9259b);
        }
        setVisibility(0);
        invalidate();
    }

    @Override // com.anythink.expressad.foundation.webview.b
    public void startEndAnimation() {
        if (this.f20565n) {
            return;
        }
        this.f20565n = true;
        this.f20566o = 0.0f;
    }

    private void a(Canvas canvas, float f2) {
        Drawable drawable;
        Drawable drawable2;
        if (this.f20565n) {
            float f9 = this.f20566o;
            float f10 = this.f20561j;
            int i = (int) ((f20546w - (f9 / (f10 * 0.5f))) * 255.0f);
            if (i < 0) {
                i = 0;
            }
            if (f9 > f10 * 0.5f) {
                setVisible(false);
            }
            Drawable drawable3 = this.f20553F;
            if (drawable3 != null) {
                drawable3.setAlpha(i);
            }
            Drawable drawable4 = this.f20554G;
            if (drawable4 != null) {
                drawable4.setAlpha(i);
            }
            Drawable drawable5 = this.f20552E;
            if (drawable5 != null) {
                drawable5.setAlpha(i);
            }
            canvas.save();
            canvas.translate(this.f20566o, 0.0f);
        }
        if (this.f20553F != null && this.f20552E != null) {
            int width = (int) (this.i.width() - (this.f20552E.getIntrinsicWidth() * f20543t));
            Drawable drawable6 = this.f20553F;
            drawable6.setBounds(0, 0, width, drawable6.getIntrinsicHeight());
            this.f20553F.draw(canvas);
        }
        if (this.f20565n && (drawable2 = this.f20554G) != null && this.f20552E != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.f20554G;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.f20554G.draw(canvas);
            canvas.restore();
        }
        if (this.f20552E != null) {
            canvas.save();
            canvas.translate(this.i.width() - getWidth(), 0.0f);
            this.f20552E.draw(canvas);
            canvas.restore();
        }
        if (!this.f20565n && Math.abs(this.f20567p - this.f20562k) < 1.0E-5f && (drawable = this.f20555H) != null) {
            int i4 = (int) ((f2 * 0.2f * this.f20561j) + this.f20570s);
            this.f20570s = i4;
            if (drawable.getIntrinsicWidth() + i4 >= this.i.width()) {
                this.f20570s = -this.f20555H.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.f20570s, 0.0f);
            this.f20555H.draw(canvas);
            canvas.restore();
        }
        if (this.f20565n) {
            canvas.restore();
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new Rect();
        this.f20562k = 0.95f;
        this.f20551D = f20540L;
        this.f20556I = false;
        this.f20557K = new Handler(Looper.getMainLooper());
        this.f20560f = new Runnable() { // from class: com.anythink.expressad.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f20559N = false;
        setWillNotDraw(false);
    }
}
