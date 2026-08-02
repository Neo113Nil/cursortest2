package defpackage;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class d3a implements xwt {
    public static final d3a a = new d3a();
    public static final j6e b = j6e.s("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // defpackage.xwt
    public final Object r(b7f b7fVar, float f) {
        PointF pointF;
        PointF pointF2;
        b7fVar.b();
        String str = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        int i4 = 3;
        String str2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        while (b7fVar.hasNext()) {
            switch (b7fVar.D(b)) {
                case 0:
                    str = b7fVar.f0();
                    break;
                case 1:
                    str2 = b7fVar.f0();
                    break;
                case 2:
                    pointF = pointF3;
                    f2 = (float) b7fVar.nextDouble();
                    pointF3 = pointF;
                    break;
                case 3:
                    PointF pointF5 = pointF3;
                    pointF2 = pointF4;
                    int nextInt = b7fVar.nextInt();
                    i4 = (nextInt > 2 || nextInt < 0) ? 3 : ouj.E(3)[nextInt];
                    pointF3 = pointF5;
                    pointF4 = pointF2;
                    break;
                case 4:
                    i = b7fVar.nextInt();
                    break;
                case 5:
                    pointF = pointF3;
                    f3 = (float) b7fVar.nextDouble();
                    pointF3 = pointF;
                    break;
                case 6:
                    pointF = pointF3;
                    f4 = (float) b7fVar.nextDouble();
                    pointF3 = pointF;
                    break;
                case 7:
                    i2 = p7f.a(b7fVar);
                    break;
                case 8:
                    i3 = p7f.a(b7fVar);
                    break;
                case 9:
                    pointF = pointF3;
                    f5 = (float) b7fVar.nextDouble();
                    pointF3 = pointF;
                    break;
                case 10:
                    z = b7fVar.nextBoolean();
                    break;
                case 11:
                    b7fVar.a();
                    pointF2 = pointF4;
                    PointF pointF6 = new PointF(((float) b7fVar.nextDouble()) * f, ((float) b7fVar.nextDouble()) * f);
                    b7fVar.g();
                    pointF3 = pointF6;
                    pointF4 = pointF2;
                    break;
                case 12:
                    b7fVar.a();
                    pointF = pointF3;
                    pointF4 = new PointF(((float) b7fVar.nextDouble()) * f, ((float) b7fVar.nextDouble()) * f);
                    b7fVar.g();
                    pointF3 = pointF;
                    break;
                default:
                    b7fVar.H();
                    b7fVar.w();
                    break;
            }
        }
        b7fVar.o();
        c3a c3aVar = new c3a();
        c3aVar.a = str;
        c3aVar.b = str2;
        c3aVar.c = f2;
        c3aVar.d = i4;
        c3aVar.e = i;
        c3aVar.f = f3;
        c3aVar.g = f4;
        c3aVar.h = i2;
        c3aVar.i = i3;
        c3aVar.j = f5;
        c3aVar.k = z;
        c3aVar.l = pointF3;
        c3aVar.m = pointF4;
        return c3aVar;
    }
}
