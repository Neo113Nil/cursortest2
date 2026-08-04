package com.gamericefishpro.space.o1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements q {
    public Canvas a = c.a;
    public Rect b;
    public Rect c;

    @Override // com.gamericefishpro.space.o1.q
    public final void a(h hVar) {
        Canvas canvas = this.a;
        if (!(hVar instanceof h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(hVar.a, Region.Op.INTERSECT);
    }

    @Override // com.gamericefishpro.space.o1.q
    public final void b(float f, float f2, float f3, float f4, float f5, float f6, com.gamericefishpro.space.r8.m mVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) mVar.b);
    }

    @Override // com.gamericefishpro.space.o1.q
    public final void c(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // com.gamericefishpro.space.o1.q
    public final void d(com.gamericefishpro.space.n1.c cVar, com.gamericefishpro.space.r8.m mVar) {
        this.a.saveLayer(cVar.a, cVar.b, cVar.c, cVar.d, (Paint) mVar.b, 31);
    }

    @Override // com.gamericefishpro.space.o1.q
    public final void e(float f, float f2, float f3, float f4, com.gamericefishpro.space.r8.m mVar) {
        this.a.drawRect(f, f2, f3, f4, (Paint) mVar.b);
    }

    @Override // com.gamericefishpro.space.o1.q
    public final void f(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // com.gamericefishpro.space.o1.q
    public final void g(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // com.gamericefishpro.space.o1.q
    public final void h(h hVar, com.gamericefishpro.space.r8.m mVar) {
        Canvas canvas = this.a;
        if (!(hVar instanceof h)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(hVar.a, (Paint) mVar.b);
    }

    @Override // com.gamericefishpro.space.o1.q
    public final void i() {
        this.a.restore();
    }

    @Override // com.gamericefishpro.space.o1.q
    public final void j(f fVar, long j, long j2, long j3, com.gamericefishpro.space.r8.m mVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        if (!(fVar instanceof f)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = fVar.a;
        Rect rect = this.b;
        Intrinsics.b(rect);
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Unit unit = Unit.a;
        Rect rect2 = this.c;
        Intrinsics.b(rect2);
        int i3 = (int) 0;
        rect2.left = i3;
        int i4 = (int) 0;
        rect2.top = i4;
        rect2.right = i3 + ((int) (j3 >> 32));
        rect2.bottom = i4 + ((int) (4294967295L & j3));
        canvas.drawBitmap(bitmap, rect, rect2, (Paint) mVar.b);
    }

    @Override // com.gamericefishpro.space.o1.q
    public final void k() {
        this.a.save();
    }

    @Override // com.gamericefishpro.space.o1.q
    public final void l(float f, long j, com.gamericefishpro.space.r8.m mVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) mVar.b);
    }

    @Override // com.gamericefishpro.space.o1.q
    public final void m() {
        o.j(this.a, false);
    }

    @Override // com.gamericefishpro.space.o1.q
    public final void n(float[] fArr) {
        if (o.p(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = fArr[6];
        float f8 = fArr[7];
        float f9 = fArr[8];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        fArr[0] = f;
        fArr[1] = f5;
        fArr[2] = f10;
        fArr[3] = f2;
        fArr[4] = f6;
        fArr[5] = f11;
        fArr[6] = f4;
        fArr[7] = f8;
        fArr[8] = f12;
        matrix.setValues(fArr);
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
        fArr[8] = f9;
        this.a.concat(matrix);
    }

    @Override // com.gamericefishpro.space.o1.q
    public final void o() {
        o.j(this.a, true);
    }
}
