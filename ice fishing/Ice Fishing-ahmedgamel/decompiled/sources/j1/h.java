package j1;

import android.graphics.PointF;
import k1.AbstractC4640b;
import k1.C4639a;
import u.AbstractC5050e;

/* loaded from: classes.dex */
public final class h implements D {

    /* renamed from: n, reason: collision with root package name */
    public static final h f38436n = new h();

    /* renamed from: u, reason: collision with root package name */
    public static final C4639a f38437u = C4639a.d("t", "f", com.anythink.core.common.s.f17036a, com.anythink.expressad.foundation.d.j.cD, "tr", "lh", "ls", "fc", com.anythink.expressad.f.a.b.bI, "sw", "of", com.anythink.core.common.m.e.bc, "sz");

    @Override // j1.D
    public final Object b(AbstractC4640b abstractC4640b, float f2) {
        String str;
        abstractC4640b.j();
        String str2 = null;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i = 0;
        int i4 = 0;
        int i6 = 0;
        boolean z6 = true;
        int i9 = 3;
        String str3 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (abstractC4640b.D()) {
            switch (abstractC4640b.K(f38437u)) {
                case 0:
                    str2 = abstractC4640b.H();
                    continue;
                case 1:
                    str = str2;
                    str3 = abstractC4640b.H();
                    break;
                case 2:
                    str = str2;
                    f9 = (float) abstractC4640b.F();
                    break;
                case 3:
                    str = str2;
                    int G2 = abstractC4640b.G();
                    if (G2 <= 2 && G2 >= 0) {
                        i9 = AbstractC5050e.e(3)[G2];
                        break;
                    } else {
                        i9 = 3;
                        break;
                    }
                case 4:
                    str = str2;
                    i = abstractC4640b.G();
                    break;
                case 5:
                    str = str2;
                    f10 = (float) abstractC4640b.F();
                    break;
                case 6:
                    str = str2;
                    f11 = (float) abstractC4640b.F();
                    break;
                case 7:
                    str = str2;
                    i4 = n.a(abstractC4640b);
                    break;
                case 8:
                    str = str2;
                    i6 = n.a(abstractC4640b);
                    break;
                case 9:
                    str = str2;
                    f12 = (float) abstractC4640b.F();
                    break;
                case 10:
                    str = str2;
                    z6 = abstractC4640b.E();
                    break;
                case 11:
                    str = str2;
                    abstractC4640b.b();
                    pointF = new PointF(((float) abstractC4640b.F()) * f2, ((float) abstractC4640b.F()) * f2);
                    abstractC4640b.z();
                    break;
                case 12:
                    abstractC4640b.b();
                    str = str2;
                    pointF2 = new PointF(((float) abstractC4640b.F()) * f2, ((float) abstractC4640b.F()) * f2);
                    abstractC4640b.z();
                    break;
                default:
                    abstractC4640b.V();
                    abstractC4640b.W();
                    continue;
            }
            str2 = str;
        }
        abstractC4640b.B();
        e1.b bVar = new e1.b();
        bVar.f37215a = str2;
        bVar.f37216b = str3;
        bVar.f37217c = f9;
        bVar.f37218d = i9;
        bVar.f37219e = i;
        bVar.f37220f = f10;
        bVar.f37221g = f11;
        bVar.f37222h = i4;
        bVar.i = i6;
        bVar.f37223j = f12;
        bVar.f37224k = z6;
        bVar.f37225l = pointF;
        bVar.f37226m = pointF2;
        return bVar;
    }
}
