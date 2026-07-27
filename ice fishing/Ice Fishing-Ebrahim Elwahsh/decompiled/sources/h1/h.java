package h1;

import android.graphics.PointF;
import i1.AbstractC4574a;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public final class h implements D {

    /* renamed from: n, reason: collision with root package name */
    public static final h f38167n = new h();

    /* renamed from: u, reason: collision with root package name */
    public static final S0.s f38168u = S0.s.i("t", "f", com.anythink.core.common.s.f16407a, com.anythink.expressad.foundation.d.j.cD, "tr", "lh", "ls", "fc", com.anythink.expressad.f.a.b.bI, "sw", "of", com.anythink.core.common.m.e.bc, "sz");

    @Override // h1.D
    public final Object a(AbstractC4574a abstractC4574a, float f6) {
        String str;
        abstractC4574a.j();
        String str2 = null;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i = 0;
        int i4 = 0;
        int i9 = 0;
        boolean z8 = true;
        int i10 = 3;
        String str3 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (abstractC4574a.D()) {
            switch (abstractC4574a.K(f38168u)) {
                case 0:
                    str2 = abstractC4574a.H();
                    continue;
                case 1:
                    str = str2;
                    str3 = abstractC4574a.H();
                    break;
                case 2:
                    str = str2;
                    f9 = (float) abstractC4574a.F();
                    break;
                case 3:
                    str = str2;
                    int G7 = abstractC4574a.G();
                    if (G7 <= 2 && G7 >= 0) {
                        i10 = AbstractC5088e.e(3)[G7];
                        break;
                    } else {
                        i10 = 3;
                        break;
                    }
                case 4:
                    str = str2;
                    i = abstractC4574a.G();
                    break;
                case 5:
                    str = str2;
                    f10 = (float) abstractC4574a.F();
                    break;
                case 6:
                    str = str2;
                    f11 = (float) abstractC4574a.F();
                    break;
                case 7:
                    str = str2;
                    i4 = n.a(abstractC4574a);
                    break;
                case 8:
                    str = str2;
                    i9 = n.a(abstractC4574a);
                    break;
                case 9:
                    str = str2;
                    f12 = (float) abstractC4574a.F();
                    break;
                case 10:
                    str = str2;
                    z8 = abstractC4574a.E();
                    break;
                case 11:
                    str = str2;
                    abstractC4574a.b();
                    pointF = new PointF(((float) abstractC4574a.F()) * f6, ((float) abstractC4574a.F()) * f6);
                    abstractC4574a.z();
                    break;
                case 12:
                    abstractC4574a.b();
                    str = str2;
                    pointF2 = new PointF(((float) abstractC4574a.F()) * f6, ((float) abstractC4574a.F()) * f6);
                    abstractC4574a.z();
                    break;
                default:
                    abstractC4574a.V();
                    abstractC4574a.W();
                    continue;
            }
            str2 = str;
        }
        abstractC4574a.B();
        c1.b bVar = new c1.b();
        bVar.f5657a = str2;
        bVar.f5658b = str3;
        bVar.f5659c = f9;
        bVar.f5660d = i10;
        bVar.f5661e = i;
        bVar.f5662f = f10;
        bVar.f5663g = f11;
        bVar.f5664h = i4;
        bVar.i = i9;
        bVar.f5665j = f12;
        bVar.f5666k = z8;
        bVar.f5667l = pointF;
        bVar.f5668m = pointF2;
        return bVar;
    }
}
