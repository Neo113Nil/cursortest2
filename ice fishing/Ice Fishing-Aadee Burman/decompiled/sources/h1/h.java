package h1;

import android.graphics.PointF;
import i1.AbstractC4579a;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class h implements D {

    /* renamed from: n, reason: collision with root package name */
    public static final h f37967n = new h();

    /* renamed from: u, reason: collision with root package name */
    public static final S0.l f37968u = S0.l.F("t", "f", com.anythink.core.common.s.f16249a, com.anythink.expressad.foundation.d.j.cD, "tr", "lh", "ls", "fc", com.anythink.expressad.f.a.b.bI, "sw", "of", com.anythink.core.common.m.e.bc, "sz");

    @Override // h1.D
    public final Object b(AbstractC4579a abstractC4579a, float f3) {
        String str;
        abstractC4579a.j();
        String str2 = null;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i = 0;
        int i6 = 0;
        int i9 = 0;
        boolean z3 = true;
        int i10 = 3;
        String str3 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (abstractC4579a.D()) {
            switch (abstractC4579a.K(f37968u)) {
                case 0:
                    str2 = abstractC4579a.H();
                    continue;
                case 1:
                    str = str2;
                    str3 = abstractC4579a.H();
                    break;
                case 2:
                    str = str2;
                    f9 = (float) abstractC4579a.F();
                    break;
                case 3:
                    str = str2;
                    int G7 = abstractC4579a.G();
                    if (G7 <= 2 && G7 >= 0) {
                        i10 = AbstractC5049e.e(3)[G7];
                        break;
                    } else {
                        i10 = 3;
                        break;
                    }
                case 4:
                    str = str2;
                    i = abstractC4579a.G();
                    break;
                case 5:
                    str = str2;
                    f10 = (float) abstractC4579a.F();
                    break;
                case 6:
                    str = str2;
                    f11 = (float) abstractC4579a.F();
                    break;
                case 7:
                    str = str2;
                    i6 = n.a(abstractC4579a);
                    break;
                case 8:
                    str = str2;
                    i9 = n.a(abstractC4579a);
                    break;
                case 9:
                    str = str2;
                    f12 = (float) abstractC4579a.F();
                    break;
                case 10:
                    str = str2;
                    z3 = abstractC4579a.E();
                    break;
                case 11:
                    str = str2;
                    abstractC4579a.b();
                    pointF = new PointF(((float) abstractC4579a.F()) * f3, ((float) abstractC4579a.F()) * f3);
                    abstractC4579a.z();
                    break;
                case 12:
                    abstractC4579a.b();
                    str = str2;
                    pointF2 = new PointF(((float) abstractC4579a.F()) * f3, ((float) abstractC4579a.F()) * f3);
                    abstractC4579a.z();
                    break;
                default:
                    abstractC4579a.V();
                    abstractC4579a.W();
                    continue;
            }
            str2 = str;
        }
        abstractC4579a.B();
        c1.b bVar = new c1.b();
        bVar.f5497a = str2;
        bVar.f5498b = str3;
        bVar.f5499c = f9;
        bVar.f5500d = i10;
        bVar.f5501e = i;
        bVar.f5502f = f10;
        bVar.f5503g = f11;
        bVar.f5504h = i6;
        bVar.i = i9;
        bVar.f5505j = f12;
        bVar.f5506k = z3;
        bVar.f5507l = pointF;
        bVar.f5508m = pointF2;
        return bVar;
    }
}
