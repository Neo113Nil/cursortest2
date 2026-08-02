package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class AnyThinkImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private static final String f22144a = "AnyThinkImageView";

    /* renamed from: b, reason: collision with root package name */
    private Xfermode f22145b;

    /* renamed from: c, reason: collision with root package name */
    private int f22146c;

    /* renamed from: d, reason: collision with root package name */
    private int f22147d;

    /* renamed from: e, reason: collision with root package name */
    private int f22148e;

    /* renamed from: f, reason: collision with root package name */
    private int f22149f;

    /* renamed from: g, reason: collision with root package name */
    private int f22150g;

    /* renamed from: h, reason: collision with root package name */
    private int f22151h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f22152j;

    /* renamed from: k, reason: collision with root package name */
    private int f22153k;

    /* renamed from: l, reason: collision with root package name */
    private float[] f22154l;

    /* renamed from: m, reason: collision with root package name */
    private float[] f22155m;

    /* renamed from: n, reason: collision with root package name */
    private RectF f22156n;

    /* renamed from: o, reason: collision with root package name */
    private RectF f22157o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f22158p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f22159q;

    /* renamed from: r, reason: collision with root package name */
    private Path f22160r;

    /* renamed from: s, reason: collision with root package name */
    private Paint f22161s;

    public AnyThinkImageView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        a(canvas, this.f22152j, this.f22153k, this.f22157o, this.f22154l);
    }

    private void b() {
        int i;
        int i4;
        int i6;
        try {
            if (this.f22154l == null || this.f22155m == null) {
                return;
            }
            int i9 = 0;
            while (true) {
                i = 2;
                if (i9 >= 2) {
                    break;
                }
                float[] fArr = this.f22154l;
                int i10 = this.f22149f;
                fArr[i9] = i10;
                this.f22155m[i9] = i10 - (this.f22152j / 2.0f);
                i9++;
            }
            while (true) {
                i4 = 4;
                if (i >= 4) {
                    break;
                }
                float[] fArr2 = this.f22154l;
                int i11 = this.f22150g;
                fArr2[i] = i11;
                this.f22155m[i] = i11 - (this.f22152j / 2.0f);
                i++;
            }
            while (true) {
                if (i4 >= 6) {
                    break;
                }
                float[] fArr3 = this.f22154l;
                int i12 = this.f22151h;
                fArr3[i4] = i12;
                this.f22155m[i4] = i12 - (this.f22152j / 2.0f);
                i4++;
            }
            for (i6 = 6; i6 < 8; i6++) {
                float[] fArr4 = this.f22154l;
                int i13 = this.i;
                fArr4[i6] = i13;
                this.f22155m[i6] = i13 - (this.f22152j / 2.0f);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.f22157o;
        if (rectF != null) {
            int i = this.f22152j;
            rectF.set(i / 2.0f, i / 2.0f, this.f22146c - (i / 2.0f), this.f22147d - (i / 2.0f));
        }
    }

    private void d() {
        RectF rectF = this.f22156n;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.f22146c, this.f22147d);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f22156n, null, 31);
            int i = this.f22146c;
            int i4 = this.f22152j;
            int i6 = this.f22147d;
            canvas.scale(((i - (i4 * 2)) * 1.0f) / i, ((i6 - (i4 * 2)) * 1.0f) / i6, i / 2.0f, i6 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f22161s;
            if (paint != null) {
                paint.reset();
                this.f22161s.setAntiAlias(true);
                this.f22161s.setStyle(Paint.Style.FILL);
                this.f22161s.setXfermode(this.f22145b);
            }
            Path path = this.f22160r;
            if (path != null) {
                path.reset();
                this.f22160r.addRoundRect(this.f22156n, this.f22155m, Path.Direction.CCW);
            }
            canvas.drawPath(this.f22160r, this.f22161s);
            Paint paint2 = this.f22161s;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f22158p) {
                a(canvas, this.f22152j, this.f22153k, this.f22157o, this.f22154l);
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i4, int i6, int i9) {
        int i10;
        int i11;
        int i12;
        super.onSizeChanged(i, i4, i6, i9);
        this.f22146c = i;
        this.f22147d = i4;
        int i13 = 0;
        if (this.f22159q) {
            try {
                if (this.f22154l != null && this.f22155m != null) {
                    while (true) {
                        i10 = 2;
                        if (i13 >= 2) {
                            break;
                        }
                        float[] fArr = this.f22154l;
                        int i14 = this.f22149f;
                        fArr[i13] = i14;
                        this.f22155m[i13] = i14 - (this.f22152j / 2.0f);
                        i13++;
                    }
                    while (true) {
                        i11 = 4;
                        if (i10 >= 4) {
                            break;
                        }
                        float[] fArr2 = this.f22154l;
                        int i15 = this.f22150g;
                        fArr2[i10] = i15;
                        this.f22155m[i10] = i15 - (this.f22152j / 2.0f);
                        i10++;
                    }
                    while (true) {
                        if (i11 >= 6) {
                            break;
                        }
                        float[] fArr3 = this.f22154l;
                        int i16 = this.f22151h;
                        fArr3[i11] = i16;
                        this.f22155m[i11] = i16 - (this.f22152j / 2.0f);
                        i11++;
                    }
                    for (i12 = 6; i12 < 8; i12++) {
                        float[] fArr4 = this.f22154l;
                        int i17 = this.i;
                        fArr4[i12] = i17;
                        this.f22155m[i12] = i17 - (this.f22152j / 2.0f);
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        } else if (this.f22154l != null && this.f22155m != null) {
            while (true) {
                try {
                    float[] fArr5 = this.f22154l;
                    if (i13 >= fArr5.length) {
                        break;
                    }
                    int i18 = this.f22148e;
                    fArr5[i13] = i18;
                    this.f22155m[i13] = i18 - (this.f22152j / 2.0f);
                    i13++;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        RectF rectF = this.f22157o;
        if (rectF != null) {
            int i19 = this.f22152j;
            rectF.set(i19 / 2.0f, i19 / 2.0f, this.f22146c - (i19 / 2.0f), this.f22147d - (i19 / 2.0f));
        }
        RectF rectF2 = this.f22156n;
        if (rectF2 != null) {
            rectF2.set(0.0f, 0.0f, this.f22146c, this.f22147d);
        }
    }

    public void setBorder(int i, int i4, int i6) {
        this.f22158p = true;
        this.f22152j = i4;
        this.f22153k = i6;
        this.f22148e = i;
    }

    public void setCornerRadius(int i) {
        this.f22148e = i;
    }

    public void setCustomBorder(int i, int i4, int i6, int i9, int i10, int i11) {
        this.f22158p = true;
        this.f22159q = true;
        this.f22152j = i10;
        this.f22153k = i11;
        this.f22149f = i;
        this.f22151h = i6;
        this.f22150g = i4;
        this.i = i9;
    }

    public AnyThinkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Canvas canvas, int i, int i4, RectF rectF, float[] fArr) {
        try {
            a(i, i4);
            Path path = this.f22160r;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f22160r, this.f22161s);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public AnyThinkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22160r = new Path();
        this.f22161s = new Paint();
        this.f22154l = new float[8];
        this.f22155m = new float[8];
        this.f22157o = new RectF();
        this.f22156n = new RectF();
        this.f22145b = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void a(int i, int i4) {
        Path path = this.f22160r;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f22161s;
        if (paint != null) {
            paint.setStrokeWidth(i);
            this.f22161s.setColor(i4);
            this.f22161s.setStyle(Paint.Style.STROKE);
        }
    }

    private void a() {
        if (this.f22154l == null || this.f22155m == null) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                float[] fArr = this.f22154l;
                if (i >= fArr.length) {
                    return;
                }
                int i4 = this.f22148e;
                fArr[i] = i4;
                this.f22155m[i] = i4 - (this.f22152j / 2.0f);
                i++;
            } catch (Exception e9) {
                e9.printStackTrace();
                return;
            }
        }
    }
}
