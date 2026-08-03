package f1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements o {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f2214a = c.f2217a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f2215b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f2216c;

    @Override // f1.o
    public final void a(float f10, float f11) {
        this.f2214a.scale(f10, f11);
    }

    @Override // f1.o
    public final void b(float f10, long j3, l6.l lVar) {
        this.f2214a.drawCircle(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), f10, (Paint) lVar.f4199b);
    }

    @Override // f1.o
    public final void c(float f10, float f11, float f12, float f13, l6.l lVar) {
        this.f2214a.drawRect(f10, f11, f12, f13, (Paint) lVar.f4199b);
    }

    @Override // f1.o
    public final void d(float f10, float f11, float f12, float f13, int i10) {
        this.f2214a.clipRect(f10, f11, f12, f13, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // f1.o
    public final void e(float f10, float f11) {
        this.f2214a.translate(f10, f11);
    }

    @Override // f1.o
    public final void f(g gVar, long j3, long j6, long j10, l6.l lVar) {
        if (this.f2215b == null) {
            this.f2215b = new Rect();
            this.f2216c = new Rect();
        }
        Canvas canvas = this.f2214a;
        if (!(gVar instanceof g)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        Bitmap bitmap = gVar.f2252a;
        Rect rect = this.f2215b;
        pc.j.b(rect);
        int i10 = (int) (j3 >> 32);
        rect.left = i10;
        int i11 = (int) (j3 & 4294967295L);
        rect.top = i11;
        rect.right = i10 + ((int) (j6 >> 32));
        rect.bottom = i11 + ((int) (j6 & 4294967295L));
        Rect rect2 = this.f2216c;
        pc.j.b(rect2);
        int i12 = (int) 0;
        rect2.left = i12;
        int i13 = (int) 0;
        rect2.top = i13;
        rect2.right = i12 + ((int) (j10 >> 32));
        rect2.bottom = i13 + ((int) (4294967295L & j10));
        canvas.drawBitmap(bitmap, rect, rect2, (Paint) lVar.f4199b);
    }

    @Override // f1.o
    public final void g() {
        this.f2214a.restore();
    }

    @Override // f1.o
    public final void h(float f10, float f11, float f12, float f13, float f14, float f15, l6.l lVar) {
        this.f2214a.drawRoundRect(f10, f11, f12, f13, f14, f15, (Paint) lVar.f4199b);
    }

    @Override // f1.o
    public final void i(i iVar) {
        Canvas canvas = this.f2214a;
        if (!(iVar instanceof i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(iVar.f2261a, Region.Op.INTERSECT);
    }

    @Override // f1.o
    public final void j(i iVar, l6.l lVar) {
        Canvas canvas = this.f2214a;
        if (!(iVar instanceof i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(iVar.f2261a, (Paint) lVar.f4199b);
    }

    @Override // f1.o
    public final void k() {
        this.f2214a.save();
    }

    @Override // f1.o
    public final void l(long j3, long j6, l6.l lVar) {
        this.f2214a.drawLine(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j6 >> 32)), Float.intBitsToFloat((int) (j6 & 4294967295L)), (Paint) lVar.f4199b);
    }

    @Override // f1.o
    public final void m() {
        d0.j(this.f2214a, false);
    }

    @Override // f1.o
    public final void n(e1.c cVar, l6.l lVar) {
        this.f2214a.saveLayer(cVar.f1931a, cVar.f1932b, cVar.f1933c, cVar.f1934d, (Paint) lVar.f4199b, 31);
    }

    @Override // f1.o
    public final void o(float[] fArr) {
        if (d0.k(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[2];
        float f13 = fArr[3];
        float f14 = fArr[4];
        float f15 = fArr[5];
        float f16 = fArr[6];
        float f17 = fArr[7];
        float f18 = fArr[8];
        float f19 = fArr[12];
        float f20 = fArr[13];
        float f21 = fArr[15];
        fArr[0] = f10;
        fArr[1] = f14;
        fArr[2] = f19;
        fArr[3] = f11;
        fArr[4] = f15;
        fArr[5] = f20;
        fArr[6] = f13;
        fArr[7] = f17;
        fArr[8] = f21;
        matrix.setValues(fArr);
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        fArr[3] = f13;
        fArr[4] = f14;
        fArr[5] = f15;
        fArr[6] = f16;
        fArr[7] = f17;
        fArr[8] = f18;
        this.f2214a.concat(matrix);
    }

    @Override // f1.o
    public final void p() {
        d0.j(this.f2214a, true);
    }
}
