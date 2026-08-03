package f1;

import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Path f2261a;

    /* renamed from: b, reason: collision with root package name */
    public RectF f2262b;

    /* renamed from: c, reason: collision with root package name */
    public float[] f2263c;

    public i(Path path) {
        this.f2261a = path;
    }

    public static void a(i iVar, e1.d dVar) {
        if (iVar.f2262b == null) {
            iVar.f2262b = new RectF();
        }
        RectF rectF = iVar.f2262b;
        pc.j.b(rectF);
        float f10 = dVar.f1935a;
        long j3 = dVar.f1942h;
        long j6 = dVar.f1941g;
        long j10 = dVar.f1940f;
        long j11 = dVar.f1939e;
        rectF.set(f10, dVar.f1936b, dVar.f1937c, dVar.f1938d);
        if (iVar.f2263c == null) {
            iVar.f2263c = new float[8];
        }
        float[] fArr = iVar.f2263c;
        pc.j.b(fArr);
        fArr[0] = Float.intBitsToFloat((int) (j11 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j11 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j10 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j10 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j6 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j6 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        Path path = iVar.f2261a;
        RectF rectF2 = iVar.f2262b;
        pc.j.b(rectF2);
        float[] fArr2 = iVar.f2263c;
        pc.j.b(fArr2);
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final e1.c b() {
        if (this.f2262b == null) {
            this.f2262b = new RectF();
        }
        RectF rectF = this.f2262b;
        pc.j.b(rectF);
        this.f2261a.computeBounds(rectF, true);
        return new e1.c(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean c(i iVar, i iVar2, int i10) {
        Path.Op op = i10 == 0 ? Path.Op.DIFFERENCE : i10 == 1 ? Path.Op.INTERSECT : i10 == 4 ? Path.Op.REVERSE_DIFFERENCE : i10 == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(iVar instanceof i)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = iVar.f2261a;
        if (iVar2 instanceof i) {
            return this.f2261a.op(path, iVar2.f2261a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    public final void d() {
        this.f2261a.reset();
    }
}
