package com.google.android.material.shape;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import defpackage.eer;
import defpackage.eup;
import defpackage.fup;
import defpackage.fvp;
import defpackage.h4b;
import defpackage.her;
import defpackage.iz7;
import defpackage.mdh;
import defpackage.mi;
import defpackage.ndh;
import defpackage.nwh;
import defpackage.qec;
import defpackage.stp;
import defpackage.u2b;
import defpackage.uvg;
import defpackage.wup;
import defpackage.xq0;
import defpackage.y8r;
import defpackage.z8r;
import defpackage.zl6;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes3.dex */
public class a extends Drawable implements fvp {
    public static final Paint F;
    public static final ndh[] G;
    public z8r A;
    public final y8r[] B;
    public float[] C;
    public float[] D;
    public uvg E;
    public final h4b a;
    public mdh b;
    public final wup[] c;
    public final wup[] d;
    public final BitSet e;
    public boolean f;
    public boolean g;
    public final Matrix h;
    public final Path i;
    public final Path j;
    public final RectF k;
    public final RectF l;
    public final Region m;
    public final Region n;
    public final Paint o;
    public final Paint p;
    public final stp q;
    public final qec r;
    public final nwh s;
    public PorterDuffColorFilter t;
    public PorterDuffColorFilter u;
    public int v;
    public final RectF w;
    public boolean x;
    public boolean y;
    public eup z;

    static {
        Paint paint = new Paint(1);
        F = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        G = new ndh[4];
        int i = 0;
        while (true) {
            ndh[] ndhVarArr = G;
            if (i >= ndhVarArr.length) {
                return;
            }
            ndhVarArr[i] = new ndh(i);
            i++;
        }
    }

    public a(mdh mdhVar) {
        this.a = new h4b(this);
        this.c = new wup[4];
        this.d = new wup[4];
        this.e = new BitSet(8);
        this.h = new Matrix();
        this.i = new Path();
        this.j = new Path();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Region();
        this.n = new Region();
        Paint paint = new Paint(1);
        this.o = paint;
        Paint paint2 = new Paint(1);
        this.p = paint2;
        this.q = new stp();
        this.s = Looper.getMainLooper().getThread() == Thread.currentThread() ? fup.a : new nwh();
        this.w = new RectF();
        this.x = true;
        this.y = true;
        this.B = new y8r[4];
        this.b = mdhVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        A();
        y(getState());
        this.r = new qec(12, this);
    }

    public static float c(RectF rectF, eup eupVar, float[] fArr) {
        if (fArr == null) {
            if (eupVar.g(rectF)) {
                return eupVar.e.a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f) {
                    return -1.0f;
                }
            }
        }
        if (eupVar.f()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final boolean A() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        PorterDuffColorFilter porterDuffColorFilter3 = this.u;
        mdh mdhVar = this.b;
        ColorStateList colorStateList = mdhVar.f;
        PorterDuff.Mode mode = mdhVar.g;
        if (colorStateList == null || mode == null) {
            int color = this.o.getColor();
            int d = d(color);
            this.v = d;
            porterDuffColorFilter = d != color ? new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int d2 = d(colorStateList.getColorForState(getState(), 0));
            this.v = d2;
            porterDuffColorFilter = new PorterDuffColorFilter(d2, mode);
        }
        this.t = porterDuffColorFilter;
        this.b.getClass();
        this.u = null;
        this.b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.t) && Objects.equals(porterDuffColorFilter3, this.u)) ? false : true;
    }

    public final void B() {
        mdh mdhVar = this.b;
        float f = mdhVar.n + 0.0f;
        mdhVar.p = (int) Math.ceil(0.75f * f);
        this.b.q = (int) Math.ceil(f * 0.25f);
        A();
        super.invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        mdh mdhVar = this.b;
        this.s.e(mdhVar.a, this.C, mdhVar.j, rectF, this.r, path);
        if (this.b.i != 1.0f) {
            Matrix matrix = this.h;
            matrix.reset();
            float f = this.b.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.w, true);
    }

    public final int d(int i) {
        mdh mdhVar = this.b;
        float f = mdhVar.n + 0.0f + mdhVar.m;
        u2b u2bVar = mdhVar.c;
        return u2bVar != null ? u2bVar.a(i, f) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.t;
        Paint paint2 = this.o;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.b.l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        Paint paint3 = this.p;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.b.k);
        int alpha2 = paint3.getAlpha();
        int i2 = this.b.l;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.b.r;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z = this.f;
            paint = paint2;
            Path path = this.i;
            if (z) {
                b(h(), path);
                this.f = false;
            }
            mdh mdhVar = this.b;
            int i3 = mdhVar.o;
            if (i3 != 1 && mdhVar.p > 0 && (i3 == 2 || (!o() && !path.isConvex() && Build.VERSION.SDK_INT < 29))) {
                canvas.save();
                canvas.translate((int) (Math.sin(Math.toRadians(0)) * this.b.q), j());
                if (this.x) {
                    RectF rectF = this.w;
                    int width = (int) (rectF.width() - getBounds().width());
                    int height = (int) (rectF.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        xq0.q("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        return;
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.b.p * 2) + ((int) rectF.width()) + width, (this.b.p * 2) + ((int) rectF.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f = (getBounds().left - this.b.p) - width;
                    float f2 = (getBounds().top - this.b.p) - height;
                    canvas2.translate(-f, -f2);
                    e(canvas2);
                    canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            f(canvas, paint, path, this.b.a, this.C, h());
        } else {
            paint = paint2;
        }
        if (m()) {
            if (this.g) {
                eup eupVar = this.b.a;
                iz7 h = eupVar.h();
                zl6 zl6Var = eupVar.e;
                h4b h4bVar = this.a;
                h.e = h4bVar.b(zl6Var);
                h.f = h4bVar.b(eupVar.f);
                h.h = h4bVar.b(eupVar.h);
                h.g = h4bVar.b(eupVar.g);
                this.z = h.e();
                float[] fArr = this.C;
                if (fArr != null) {
                    if (this.D == null) {
                        this.D = new float[fArr.length];
                    }
                    float k = k();
                    int i4 = 0;
                    while (true) {
                        float[] fArr2 = this.C;
                        if (i4 >= fArr2.length) {
                            break;
                        }
                        this.D[i4] = Math.max(0.0f, fArr2[i4] - k);
                        i4++;
                    }
                } else {
                    this.D = null;
                }
                eup eupVar2 = this.z;
                float[] fArr3 = this.D;
                float f3 = this.b.j;
                RectF h2 = h();
                RectF rectF2 = this.l;
                rectF2.set(h2);
                float k2 = k();
                rectF2.inset(k2, k2);
                this.s.e(eupVar2, fArr3, f3, rectF2, null, this.j);
                this.g = false;
            }
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.e.cardinality() > 0) {
            Log.w("a", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.b.q;
        Path path = this.i;
        stp stpVar = this.q;
        if (i != 0) {
            canvas.drawPath(path, stpVar.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            wup wupVar = this.c[i2];
            int i3 = this.b.p;
            Matrix matrix = wup.b;
            wupVar.a(matrix, stpVar, i3, canvas);
            this.d[i2].a(matrix, stpVar, this.b.p, canvas);
        }
        if (this.x) {
            int sin = (int) (Math.sin(Math.toRadians(0)) * this.b.q);
            int j = j();
            canvas.translate(-sin, -j);
            canvas.drawPath(path, F);
            canvas.translate(sin, j);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, eup eupVar, float[] fArr, RectF rectF) {
        float c = c(rectF, eupVar, fArr);
        if (c < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = c * this.b.j;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public void g(Canvas canvas) {
        eup eupVar = this.z;
        float[] fArr = this.D;
        RectF h = h();
        RectF rectF = this.l;
        rectF.set(h);
        float k = k();
        rectF.inset(k, k);
        f(canvas, this.p, this.j, eupVar, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.b.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.b.o == 2) {
            return;
        }
        RectF h = h();
        if (h.isEmpty()) {
            return;
        }
        float c = c(h, this.b.a, this.C);
        if (c >= 0.0f) {
            outline.setRoundRect(getBounds(), c * this.b.j);
            return;
        }
        boolean z = this.f;
        Path path = this.i;
        if (z) {
            b(h, path);
            this.f = false;
        }
        mi.H(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.b.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.m;
        region.set(bounds);
        RectF h = h();
        Path path = this.i;
        b(h, path);
        Region region2 = this.n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.k;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        float[] fArr = this.C;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF h = h();
        eup eupVar = this.b.a;
        nwh nwhVar = this.s;
        nwhVar.getClass();
        float a = eupVar.e.a(h);
        eup eupVar2 = this.b.a;
        nwhVar.getClass();
        float a2 = eupVar2.h.a(h) + a;
        eup eupVar3 = this.b.a;
        nwhVar.getClass();
        float a3 = a2 - eupVar3.g.a(h);
        eup eupVar4 = this.b.a;
        nwhVar.getClass();
        return (a3 - eupVar4.f.a(h)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f = true;
        this.g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.b.f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.b.getClass();
        ColorStateList colorStateList2 = this.b.e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.b.d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        her herVar = this.b.b;
        return herVar != null && herVar.d();
    }

    public final int j() {
        return (int) (Math.cos(Math.toRadians(0)) * this.b.q);
    }

    public final float k() {
        if (m()) {
            return this.p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float l() {
        float[] fArr = this.C;
        return fArr != null ? fArr[3] : this.b.a.e.a(h());
    }

    public final boolean m() {
        Paint.Style style = this.b.r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.p.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.b = new mdh(this.b);
        return this;
    }

    public final void n(Context context) {
        this.b.c = new u2b(context);
        B();
    }

    public final boolean o() {
        if (!this.b.a.g(h())) {
            float[] fArr = this.C;
            if (fArr != null) {
                if (fArr.length > 1) {
                    float f = fArr[0];
                    for (int i = 1; i < fArr.length; i++) {
                        if (fArr[i] != f) {
                            break;
                        }
                    }
                }
                if (this.b.a.f()) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f = true;
        this.g = true;
        super.onBoundsChange(rect);
        if (this.b.b != null && !rect.isEmpty()) {
            z(getState(), this.y);
        }
        this.y = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.b.b != null) {
            z(iArr, false);
        }
        boolean z = y(iArr) || A();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(z8r z8rVar) {
        if (this.A == z8rVar) {
            return;
        }
        this.A = z8rVar;
        int i = 0;
        while (true) {
            y8r[] y8rVarArr = this.B;
            if (i >= y8rVarArr.length) {
                z(getState(), true);
                invalidateSelf();
                return;
            }
            if (y8rVarArr[i] == null) {
                y8rVarArr[i] = new y8r(this, G[i]);
            }
            y8r y8rVar = y8rVarArr[i];
            z8r z8rVar2 = new z8r();
            z8rVar2.a((float) z8rVar.b);
            double d = z8rVar.a;
            z8rVar2.b((float) (d * d));
            y8rVar.m = z8rVar2;
            i++;
        }
    }

    public final void q(float f) {
        mdh mdhVar = this.b;
        if (mdhVar.n != f) {
            mdhVar.n = f;
            B();
        }
    }

    public final void r(ColorStateList colorStateList) {
        mdh mdhVar = this.b;
        if (mdhVar.d != colorStateList) {
            mdhVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void s(float f) {
        mdh mdhVar = this.b;
        if (mdhVar.j != f) {
            mdhVar.j = f;
            this.f = true;
            this.g = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        mdh mdhVar = this.b;
        if (mdhVar.l != i) {
            mdhVar.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.fvp
    public final void setShapeAppearanceModel(eup eupVar) {
        mdh mdhVar = this.b;
        mdhVar.a = eupVar;
        mdhVar.b = null;
        this.C = null;
        this.D = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.b.f = colorStateList;
        A();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        mdh mdhVar = this.b;
        if (mdhVar.g != mode) {
            mdhVar.g = mode;
            A();
            super.invalidateSelf();
        }
    }

    public final void t() {
        this.b.r = Paint.Style.FILL;
        super.invalidateSelf();
    }

    public final void u() {
        this.q.a(-12303292);
        this.b.getClass();
        super.invalidateSelf();
    }

    public final void v(int i) {
        mdh mdhVar = this.b;
        if (mdhVar.o != i) {
            mdhVar.o = i;
            super.invalidateSelf();
        }
    }

    public final void w(her herVar) {
        mdh mdhVar = this.b;
        if (mdhVar.b != herVar) {
            mdhVar.b = herVar;
            z(getState(), true);
            invalidateSelf();
        }
    }

    public final void x(ColorStateList colorStateList) {
        mdh mdhVar = this.b;
        if (mdhVar.e != colorStateList) {
            mdhVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean y(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.b.d == null || color2 == (colorForState2 = this.b.d.getColorForState(iArr, (color2 = (paint2 = this.o).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.b.e == null || color == (colorForState = this.b.e.getColorForState(iArr, (color = (paint = this.p).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void z(int[] iArr, boolean z) {
        eup e;
        int i;
        RectF h = h();
        if (this.b.b == null || h.isEmpty()) {
            return;
        }
        boolean z2 = z | (this.A == null);
        if (this.C == null) {
            this.C = new float[4];
        }
        her herVar = this.b.b;
        eup[] eupVarArr = herVar.d;
        int i2 = herVar.a;
        int[][] iArr2 = herVar.c;
        eer eerVar = herVar.h;
        eer eerVar2 = herVar.g;
        eer eerVar3 = herVar.f;
        eer eerVar4 = herVar.e;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    i = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i4], iArr3)) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
            }
            i3 = i;
        }
        if (eerVar4 == null && eerVar3 == null && eerVar2 == null && eerVar == null) {
            e = eupVarArr[i3];
        } else {
            iz7 h2 = eupVarArr[i3].h();
            if (eerVar4 != null) {
                h2.e = eerVar4.c(iArr);
            }
            if (eerVar3 != null) {
                h2.f = eerVar3.c(iArr);
            }
            if (eerVar2 != null) {
                h2.h = eerVar2.c(iArr);
            }
            if (eerVar != null) {
                h2.g = eerVar.c(iArr);
            }
            e = h2.e();
        }
        int i5 = 0;
        while (i5 < 4) {
            this.s.getClass();
            float a = (i5 != 1 ? i5 != 2 ? i5 != 3 ? e.f : e.e : e.h : e.g).a(h);
            if (z2) {
                this.C[i5] = a;
            }
            y8r[] y8rVarArr = this.B;
            y8r y8rVar = y8rVarArr[i5];
            if (y8rVar != null) {
                y8rVar.a(a);
                if (z2) {
                    y8rVarArr[i5].d();
                }
            }
            i5++;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public a(Context context, AttributeSet attributeSet, int i, int i2) {
        this(eup.c(context, attributeSet, i, i2).e());
    }

    public a(eup eupVar) {
        this(new mdh(eupVar));
    }

    public a() {
        this(new eup());
    }
}
