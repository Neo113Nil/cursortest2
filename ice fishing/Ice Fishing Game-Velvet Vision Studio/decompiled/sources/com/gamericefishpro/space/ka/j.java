package com.gamericefishpro.space.ka;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
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
import android.util.Log;
import android.util.StateSet;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class j extends Drawable implements y {
    public static final Paint X;
    public static final i[] Y;
    public final Matrix A;
    public final Path B;
    public final Path C;
    public final RectF D;
    public final RectF E;
    public final Region F;
    public final Region G;
    public final Paint H;
    public final Paint I;
    public final com.gamericefishpro.space.ja.a J;
    public final g K;
    public final p L;
    public PorterDuffColorFilter M;
    public PorterDuffColorFilter N;
    public final RectF O;
    public final boolean P;
    public boolean Q;
    public n R;
    public com.gamericefishpro.space.r4.f S;
    public final com.gamericefishpro.space.r4.e[] T;
    public float[] U;
    public float[] V;
    public com.gamericefishpro.space.a8.b W;
    public final g d;
    public h e;
    public final w[] i;
    public final w[] v;
    public final BitSet w;
    public boolean y;
    public boolean z;

    static {
        Paint paint = new Paint(1);
        X = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        Y = new i[4];
        int i = 0;
        while (true) {
            i[] iVarArr = Y;
            if (i >= iVarArr.length) {
                return;
            }
            iVarArr[i] = new i(i);
            i++;
        }
    }

    public j() {
        this(new n());
    }

    public static float b(RectF rectF, n nVar, float[] fArr) {
        if (fArr == null) {
            if (nVar.e(rectF)) {
                return nVar.e.a(rectF);
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
        if (nVar.d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final void a(RectF rectF, Path path) {
        h hVar = this.e;
        this.L.a(hVar.a, this.U, hVar.j, rectF, this.K, path);
        if (this.e.i != 1.0f) {
            Matrix matrix = this.A;
            matrix.reset();
            float f = this.e.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.O, true);
    }

    public final int c(int i) {
        int i2;
        h hVar = this.e;
        float f = hVar.n + 0.0f + hVar.m;
        com.gamericefishpro.space.ea.a aVar = hVar.c;
        if (aVar == null || !aVar.a || com.gamericefishpro.space.u3.a.d(i, 255) != aVar.d) {
            return i;
        }
        float f2 = aVar.e;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iZ = com.gamericefishpro.space.b9.a.z(fMin, com.gamericefishpro.space.u3.a.d(i, 255), aVar.b);
        if (fMin > 0.0f && (i2 = aVar.c) != 0) {
            iZ = com.gamericefishpro.space.u3.a.b(com.gamericefishpro.space.u3.a.d(i2, com.gamericefishpro.space.ea.a.f), iZ);
        }
        return com.gamericefishpro.space.u3.a.d(iZ, iAlpha);
    }

    public final void d(Canvas canvas) {
        if (this.w.cardinality() > 0) {
            Log.w("j", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.e.p;
        Path path = this.B;
        com.gamericefishpro.space.ja.a aVar = this.J;
        if (i != 0) {
            canvas.drawPath(path, aVar.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            w wVar = this.i[i2];
            int i3 = this.e.o;
            Matrix matrix = w.b;
            wVar.a(matrix, aVar, i3, canvas);
            this.v[i2].a(matrix, aVar, this.e.o, canvas);
        }
        if (this.P) {
            double d = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d)) * ((double) this.e.p));
            int iCos = (int) (Math.cos(Math.toRadians(d)) * ((double) this.e.p));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, X);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:32:0x009d  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f8 A[ADDED_TO_REGION] */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        int iWidth;
        PorterDuffColorFilter porterDuffColorFilter = this.M;
        Paint paint2 = this.H;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.e.l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.N;
        Paint paint3 = this.I;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.e.k);
        int alpha2 = paint3.getAlpha();
        int i2 = this.e.l;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.e.q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z = this.y;
            paint = paint2;
            Path path = this.B;
            if (z) {
                a(g(), path);
                this.y = false;
            }
            h hVar = this.e;
            hVar.getClass();
            if (hVar.o > 0 && !hVar.a.e(g())) {
                float[] fArr = this.U;
                if (fArr != null) {
                    int i3 = 1;
                    if (fArr.length > 1) {
                        float f = fArr[0];
                        while (true) {
                            if (i3 < fArr.length) {
                                if (fArr[i3] == f) {
                                    i3++;
                                }
                            } else if (!this.e.a.d()) {
                            }
                            if (!path.isConvex()) {
                                canvas.save();
                                double d = 0;
                                canvas.translate((int) (Math.sin(Math.toRadians(d)) * ((double) this.e.p)), (int) (Math.cos(Math.toRadians(d)) * ((double) this.e.p)));
                                if (!this.P) {
                                    RectF rectF = this.O;
                                    iWidth = (int) (rectF.width() - getBounds().width());
                                    int iHeight = (int) (rectF.height() - getBounds().height());
                                    if (iWidth >= 0) {
                                    }
                                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                                }
                                d(canvas);
                                canvas.restore();
                            }
                        }
                    } else if (!this.e.a.d()) {
                        if (!path.isConvex() && Build.VERSION.SDK_INT < 29) {
                            canvas.save();
                            double d2 = 0;
                            canvas.translate((int) (Math.sin(Math.toRadians(d2)) * ((double) this.e.p)), (int) (Math.cos(Math.toRadians(d2)) * ((double) this.e.p)));
                            if (!this.P) {
                                d(canvas);
                                canvas.restore();
                            } else {
                                RectF rectF2 = this.O;
                                iWidth = (int) (rectF2.width() - getBounds().width());
                                int iHeight2 = (int) (rectF2.height() - getBounds().height());
                                if (iWidth >= 0 || iHeight2 < 0) {
                                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                                }
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.e.o * 2) + ((int) rectF2.width()) + iWidth, (this.e.o * 2) + ((int) rectF2.height()) + iHeight2, Bitmap.Config.ARGB_8888);
                                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                                float f2 = (getBounds().left - this.e.o) - iWidth;
                                float f3 = (getBounds().top - this.e.o) - iHeight2;
                                canvas2.translate(-f2, -f3);
                                d(canvas2);
                                canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
                                bitmapCreateBitmap.recycle();
                                canvas.restore();
                            }
                        }
                    }
                } else if (!path.isConvex()) {
                    canvas.save();
                    double d3 = 0;
                    canvas.translate((int) (Math.sin(Math.toRadians(d3)) * ((double) this.e.p)), (int) (Math.cos(Math.toRadians(d3)) * ((double) this.e.p)));
                    if (!this.P) {
                        RectF rectF3 = this.O;
                        iWidth = (int) (rectF3.width() - getBounds().width());
                        int iHeight3 = (int) (rectF3.height() - getBounds().height());
                        if (iWidth >= 0) {
                        }
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    d(canvas);
                    canvas.restore();
                }
            }
            e(canvas, paint, path, this.e.a, this.U, g());
        } else {
            paint = paint2;
        }
        if (j()) {
            if (this.z) {
                n nVar = this.e.a;
                m mVarF = nVar.f();
                d dVar = nVar.e;
                g gVar = this.d;
                mVarF.e = gVar.a(dVar);
                mVarF.f = gVar.a(nVar.f);
                mVarF.h = gVar.a(nVar.h);
                mVarF.g = gVar.a(nVar.g);
                this.R = mVarF.a();
                float[] fArr2 = this.U;
                if (fArr2 != null) {
                    if (this.V == null) {
                        this.V = new float[fArr2.length];
                    }
                    float fI = i();
                    int i4 = 0;
                    while (true) {
                        float[] fArr3 = this.U;
                        if (i4 >= fArr3.length) {
                            break;
                        }
                        this.V[i4] = Math.max(0.0f, fArr3[i4] - fI);
                        i4++;
                    }
                } else {
                    this.V = null;
                }
                n nVar2 = this.R;
                float[] fArr4 = this.V;
                float f4 = this.e.j;
                RectF rectFG = g();
                RectF rectF4 = this.E;
                rectF4.set(rectFG);
                float fI2 = i();
                rectF4.inset(fI2, fI2);
                this.L.a(nVar2, fArr4, f4, rectF4, null, this.C);
                this.z = false;
            }
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, n nVar, float[] fArr, RectF rectF) {
        float fB = b(rectF, nVar, fArr);
        if (fB < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fB * this.e.j;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public void f(Canvas canvas) {
        n nVar = this.R;
        float[] fArr = this.V;
        RectF rectFG = g();
        RectF rectF = this.E;
        rectF.set(rectFG);
        float fI = i();
        rectF.inset(fI, fI);
        e(canvas, this.I, this.C, nVar, fArr, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.D;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.e.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.e.getClass();
        RectF rectFG = g();
        if (rectFG.isEmpty()) {
            return;
        }
        float fB = b(rectFG, this.e.a, this.U);
        if (fB >= 0.0f) {
            outline.setRoundRect(getBounds(), fB * this.e.j);
            return;
        }
        boolean z = this.y;
        Path path = this.B;
        if (z) {
            a(rectFG, path);
            this.y = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            com.gamericefishpro.space.da.b.a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                com.gamericefishpro.space.da.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            com.gamericefishpro.space.da.a.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.e.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.F;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.B;
        a(rectFG, path);
        Region region2 = this.G;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final float h() {
        float[] fArr = this.U;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFG = g();
        n nVar = this.e.a;
        p pVar = this.L;
        pVar.getClass();
        float fA = nVar.e.a(rectFG);
        n nVar2 = this.e.a;
        pVar.getClass();
        float fA2 = nVar2.h.a(rectFG) + fA;
        n nVar3 = this.e.a;
        pVar.getClass();
        float fA3 = fA2 - nVar3.g.a(rectFG);
        n nVar4 = this.e.a;
        pVar.getClass();
        return (fA3 - nVar4.f.a(rectFG)) / 2.0f;
    }

    public final float i() {
        if (j()) {
            return this.I.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.y = true;
        this.z = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.e.f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.e.getClass();
        ColorStateList colorStateList2 = this.e.e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.e.d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        b0 b0Var = this.e.b;
        return b0Var != null && b0Var.d();
    }

    public final boolean j() {
        Paint.Style style = this.e.q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.I.getStrokeWidth() > 0.0f;
    }

    public final void k(Context context) {
        this.e.c = new com.gamericefishpro.space.ea.a(context);
        s();
    }

    public final void l(com.gamericefishpro.space.r4.f fVar) {
        if (this.S == fVar) {
            return;
        }
        this.S = fVar;
        int i = 0;
        while (true) {
            com.gamericefishpro.space.r4.e[] eVarArr = this.T;
            if (i >= eVarArr.length) {
                q(getState(), true);
                invalidateSelf();
                return;
            }
            if (eVarArr[i] == null) {
                eVarArr[i] = new com.gamericefishpro.space.r4.e(this, Y[i]);
            }
            com.gamericefishpro.space.r4.e eVar = eVarArr[i];
            com.gamericefishpro.space.r4.f fVar2 = new com.gamericefishpro.space.r4.f();
            fVar2.a((float) fVar.b);
            double d = fVar.a;
            fVar2.b((float) (d * d));
            eVar.m = fVar2;
            i++;
        }
    }

    public final void m(float f) {
        h hVar = this.e;
        if (hVar.n != f) {
            hVar.n = f;
            s();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.e = new h(this.e);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        h hVar = this.e;
        if (hVar.d != colorStateList) {
            hVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void o(b0 b0Var) {
        h hVar = this.e;
        if (hVar.b != b0Var) {
            hVar.b = b0Var;
            q(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.y = true;
        this.z = true;
        super.onBoundsChange(rect);
        if (this.e.b != null && !rect.isEmpty()) {
            q(getState(), this.Q);
        }
        this.Q = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.e.b != null) {
            q(iArr, false);
        }
        boolean z = p(iArr) || r();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean p(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.e.d == null || color2 == (colorForState2 = this.e.d.getColorForState(iArr, (color2 = (paint2 = this.H).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.e.e == null || color == (colorForState = this.e.e.getColorForState(iArr, (color = (paint = this.I).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final void q(int[] iArr, boolean z) {
        n nVarA;
        d dVar;
        int i;
        RectF rectFG = g();
        if (this.e.b == null || rectFG.isEmpty()) {
            return;
        }
        boolean z2 = z | (this.S == null);
        if (this.U == null) {
            this.U = new float[4];
        }
        b0 b0Var = this.e.b;
        n[] nVarArr = b0Var.d;
        int i2 = b0Var.a;
        int[][] iArr2 = b0Var.c;
        z zVar = b0Var.h;
        z zVar2 = b0Var.g;
        z zVar3 = b0Var.f;
        z zVar4 = b0Var.e;
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
        if (zVar4 == null && zVar3 == null && zVar2 == null && zVar == null) {
            nVarA = nVarArr[i3];
        } else {
            m mVarF = nVarArr[i3].f();
            if (zVar4 != null) {
                mVarF.e = zVar4.c(iArr);
            }
            if (zVar3 != null) {
                mVarF.f = zVar3.c(iArr);
            }
            if (zVar2 != null) {
                mVarF.h = zVar2.c(iArr);
            }
            if (zVar != null) {
                mVarF.g = zVar.c(iArr);
            }
            nVarA = mVarF.a();
        }
        int i5 = 0;
        while (i5 < 4) {
            this.L.getClass();
            if (i5 == 1) {
                dVar = nVarA.g;
            } else if (i5 != 2) {
                dVar = i5 != 3 ? nVarA.f : nVarA.e;
            } else {
                dVar = nVarA.h;
            }
            float fA = dVar.a(rectFG);
            if (z2) {
                this.U[i5] = fA;
            }
            com.gamericefishpro.space.r4.e[] eVarArr = this.T;
            com.gamericefishpro.space.r4.e eVar = eVarArr[i5];
            if (eVar != null) {
                eVar.a(fA);
                if (z2) {
                    eVarArr[i5].d();
                }
            }
            i5++;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    public final boolean r() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.M;
        PorterDuffColorFilter porterDuffColorFilter3 = this.N;
        h hVar = this.e;
        ColorStateList colorStateList = hVar.f;
        PorterDuff.Mode mode = hVar.g;
        if (colorStateList == null || mode == null) {
            int color = this.H.getColor();
            int iC = c(color);
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.M = porterDuffColorFilter;
        this.e.getClass();
        this.N = null;
        this.e.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.M) && Objects.equals(porterDuffColorFilter3, this.N)) ? false : true;
    }

    public final void s() {
        h hVar = this.e;
        float f = hVar.n + 0.0f;
        hVar.o = (int) Math.ceil(0.75f * f);
        this.e.p = (int) Math.ceil(f * 0.25f);
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        h hVar = this.e;
        if (hVar.l != i) {
            hVar.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.e.getClass();
        super.invalidateSelf();
    }

    @Override // com.gamericefishpro.space.ka.y
    public final void setShapeAppearanceModel(n nVar) {
        h hVar = this.e;
        hVar.a = nVar;
        hVar.b = null;
        this.U = null;
        this.V = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.e.f = colorStateList;
        r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        h hVar = this.e;
        if (hVar.g != mode) {
            hVar.g = mode;
            r();
            super.invalidateSelf();
        }
    }

    public j(n nVar) {
        this(new h(nVar));
    }

    public j(h hVar) {
        p pVar;
        this.d = new g(this);
        this.i = new w[4];
        this.v = new w[4];
        this.w = new BitSet(8);
        this.A = new Matrix();
        this.B = new Path();
        this.C = new Path();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new Region();
        this.G = new Region();
        Paint paint = new Paint(1);
        this.H = paint;
        Paint paint2 = new Paint(1);
        this.I = paint2;
        this.J = new com.gamericefishpro.space.ja.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            pVar = o.a;
        } else {
            pVar = new p();
        }
        this.L = pVar;
        this.O = new RectF();
        this.P = true;
        this.Q = true;
        this.T = new com.gamericefishpro.space.r4.e[4];
        this.e = hVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        r();
        p(getState());
        this.K = new g(this);
    }
}
