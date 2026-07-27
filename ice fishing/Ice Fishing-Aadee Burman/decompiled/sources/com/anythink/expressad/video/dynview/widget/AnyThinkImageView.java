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
    private static final String f21357a = "AnyThinkImageView";

    /* renamed from: b, reason: collision with root package name */
    private Xfermode f21358b;

    /* renamed from: c, reason: collision with root package name */
    private int f21359c;

    /* renamed from: d, reason: collision with root package name */
    private int f21360d;

    /* renamed from: e, reason: collision with root package name */
    private int f21361e;

    /* renamed from: f, reason: collision with root package name */
    private int f21362f;

    /* renamed from: g, reason: collision with root package name */
    private int f21363g;

    /* renamed from: h, reason: collision with root package name */
    private int f21364h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f21365j;

    /* renamed from: k, reason: collision with root package name */
    private int f21366k;

    /* renamed from: l, reason: collision with root package name */
    private float[] f21367l;

    /* renamed from: m, reason: collision with root package name */
    private float[] f21368m;

    /* renamed from: n, reason: collision with root package name */
    private RectF f21369n;

    /* renamed from: o, reason: collision with root package name */
    private RectF f21370o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f21371p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f21372q;

    /* renamed from: r, reason: collision with root package name */
    private Path f21373r;

    /* renamed from: s, reason: collision with root package name */
    private Paint f21374s;

    public AnyThinkImageView(Context context) {
        this(context, null);
    }

    private void a(Canvas canvas) {
        a(canvas, this.f21365j, this.f21366k, this.f21370o, this.f21367l);
    }

    private void b() {
        int i;
        int i6;
        int i9;
        try {
            if (this.f21367l == null || this.f21368m == null) {
                return;
            }
            int i10 = 0;
            while (true) {
                i = 2;
                if (i10 >= 2) {
                    break;
                }
                float[] fArr = this.f21367l;
                int i11 = this.f21362f;
                fArr[i10] = i11;
                this.f21368m[i10] = i11 - (this.f21365j / 2.0f);
                i10++;
            }
            while (true) {
                i6 = 4;
                if (i >= 4) {
                    break;
                }
                float[] fArr2 = this.f21367l;
                int i12 = this.f21363g;
                fArr2[i] = i12;
                this.f21368m[i] = i12 - (this.f21365j / 2.0f);
                i++;
            }
            while (true) {
                if (i6 >= 6) {
                    break;
                }
                float[] fArr3 = this.f21367l;
                int i13 = this.f21364h;
                fArr3[i6] = i13;
                this.f21368m[i6] = i13 - (this.f21365j / 2.0f);
                i6++;
            }
            for (i9 = 6; i9 < 8; i9++) {
                float[] fArr4 = this.f21367l;
                int i14 = this.i;
                fArr4[i9] = i14;
                this.f21368m[i9] = i14 - (this.f21365j / 2.0f);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    private void c() {
        RectF rectF = this.f21370o;
        if (rectF != null) {
            int i = this.f21365j;
            rectF.set(i / 2.0f, i / 2.0f, this.f21359c - (i / 2.0f), this.f21360d - (i / 2.0f));
        }
    }

    private void d() {
        RectF rectF = this.f21369n;
        if (rectF != null) {
            rectF.set(0.0f, 0.0f, this.f21359c, this.f21360d);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f21369n, null, 31);
            int i = this.f21359c;
            int i6 = this.f21365j;
            int i9 = this.f21360d;
            canvas.scale(((i - (i6 * 2)) * 1.0f) / i, ((i9 - (i6 * 2)) * 1.0f) / i9, i / 2.0f, i9 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f21374s;
            if (paint != null) {
                paint.reset();
                this.f21374s.setAntiAlias(true);
                this.f21374s.setStyle(Paint.Style.FILL);
                this.f21374s.setXfermode(this.f21358b);
            }
            Path path = this.f21373r;
            if (path != null) {
                path.reset();
                this.f21373r.addRoundRect(this.f21369n, this.f21368m, Path.Direction.CCW);
            }
            canvas.drawPath(this.f21373r, this.f21374s);
            Paint paint2 = this.f21374s;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f21371p) {
                a(canvas, this.f21365j, this.f21366k, this.f21370o, this.f21367l);
            }
        } catch (Exception e9) {
            e9.getMessage();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i6, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        super.onSizeChanged(i, i6, i9, i10);
        this.f21359c = i;
        this.f21360d = i6;
        int i14 = 0;
        if (this.f21372q) {
            try {
                if (this.f21367l != null && this.f21368m != null) {
                    while (true) {
                        i11 = 2;
                        if (i14 >= 2) {
                            break;
                        }
                        float[] fArr = this.f21367l;
                        int i15 = this.f21362f;
                        fArr[i14] = i15;
                        this.f21368m[i14] = i15 - (this.f21365j / 2.0f);
                        i14++;
                    }
                    while (true) {
                        i12 = 4;
                        if (i11 >= 4) {
                            break;
                        }
                        float[] fArr2 = this.f21367l;
                        int i16 = this.f21363g;
                        fArr2[i11] = i16;
                        this.f21368m[i11] = i16 - (this.f21365j / 2.0f);
                        i11++;
                    }
                    while (true) {
                        if (i12 >= 6) {
                            break;
                        }
                        float[] fArr3 = this.f21367l;
                        int i17 = this.f21364h;
                        fArr3[i12] = i17;
                        this.f21368m[i12] = i17 - (this.f21365j / 2.0f);
                        i12++;
                    }
                    for (i13 = 6; i13 < 8; i13++) {
                        float[] fArr4 = this.f21367l;
                        int i18 = this.i;
                        fArr4[i13] = i18;
                        this.f21368m[i13] = i18 - (this.f21365j / 2.0f);
                    }
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        } else if (this.f21367l != null && this.f21368m != null) {
            while (true) {
                try {
                    float[] fArr5 = this.f21367l;
                    if (i14 >= fArr5.length) {
                        break;
                    }
                    int i19 = this.f21361e;
                    fArr5[i14] = i19;
                    this.f21368m[i14] = i19 - (this.f21365j / 2.0f);
                    i14++;
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        RectF rectF = this.f21370o;
        if (rectF != null) {
            int i20 = this.f21365j;
            rectF.set(i20 / 2.0f, i20 / 2.0f, this.f21359c - (i20 / 2.0f), this.f21360d - (i20 / 2.0f));
        }
        RectF rectF2 = this.f21369n;
        if (rectF2 != null) {
            rectF2.set(0.0f, 0.0f, this.f21359c, this.f21360d);
        }
    }

    public void setBorder(int i, int i6, int i9) {
        this.f21371p = true;
        this.f21365j = i6;
        this.f21366k = i9;
        this.f21361e = i;
    }

    public void setCornerRadius(int i) {
        this.f21361e = i;
    }

    public void setCustomBorder(int i, int i6, int i9, int i10, int i11, int i12) {
        this.f21371p = true;
        this.f21372q = true;
        this.f21365j = i11;
        this.f21366k = i12;
        this.f21362f = i;
        this.f21364h = i9;
        this.f21363g = i6;
        this.i = i10;
    }

    public AnyThinkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a(Canvas canvas, int i, int i6, RectF rectF, float[] fArr) {
        try {
            a(i, i6);
            Path path = this.f21373r;
            if (path != null) {
                path.addRoundRect(rectF, fArr, Path.Direction.CCW);
            }
            if (canvas != null) {
                canvas.drawPath(this.f21373r, this.f21374s);
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public AnyThinkImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21373r = new Path();
        this.f21374s = new Paint();
        this.f21367l = new float[8];
        this.f21368m = new float[8];
        this.f21370o = new RectF();
        this.f21369n = new RectF();
        this.f21358b = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }

    private void a(int i, int i6) {
        Path path = this.f21373r;
        if (path != null) {
            path.reset();
        }
        Paint paint = this.f21374s;
        if (paint != null) {
            paint.setStrokeWidth(i);
            this.f21374s.setColor(i6);
            this.f21374s.setStyle(Paint.Style.STROKE);
        }
    }

    private void a() {
        if (this.f21367l == null || this.f21368m == null) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                float[] fArr = this.f21367l;
                if (i >= fArr.length) {
                    return;
                }
                int i6 = this.f21361e;
                fArr[i] = i6;
                this.f21368m[i] = i6 - (this.f21365j / 2.0f);
                i++;
            } catch (Exception e9) {
                e9.printStackTrace();
                return;
            }
        }
    }
}
