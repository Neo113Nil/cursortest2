package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.orderpopup.a;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class wt6 implements y880 {
    public final /* synthetic */ int a = 1;
    public final wiq0 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public wt6(a aVar, md6 md6Var, wiq0 wiq0Var, xcv0 xcv0Var, yt6 yt6Var) {
        this.c = aVar;
        this.d = md6Var;
        this.b = wiq0Var;
        this.e = xcv0Var;
        this.f = yt6Var;
    }

    @Override // defpackage.y880
    public final void a(x880 x880Var) {
        int i = this.a;
        Object obj = this.c;
        wiq0 wiq0Var = this.b;
        Object obj2 = this.d;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                cu6 n = ((md6) obj2).n();
                if (n != null && n != cu6.d && !n.b) {
                    pex0 m = ((k) wiq0Var).m();
                    if (m != null) {
                        ((xcv0) obj3).j("tariff_info", m.b, null, null, null, null);
                    }
                    ((a) obj).a(n, new ut6(this, x880Var, 1));
                    break;
                } else {
                    x880Var.n();
                    break;
                }
                break;
            default:
                oep0 oep0Var = (oep0) obj3;
                u0g u0gVar = (u0g) obj2;
                pex0 m2 = ((k) wiq0Var).m();
                if (m2 != null) {
                    String str = m2.G;
                    if (m2.u0 == TariffOrderFlow.DRIVE_FLOW) {
                        com.yandex.go.taxi.tariffs.internal.repository.a aVar = ((yvw) this.f).a;
                        aVar.a.set(null);
                        aVar.b.clear();
                        if (!"drive_not_registered".equals(str)) {
                            if (!"drive_unknown_error".equals(str)) {
                                dhm dhmVar = m2.Y;
                                if (dhmVar != null) {
                                    String str2 = dhmVar.a;
                                    if (str2.length() != 0) {
                                        x880Var.o();
                                        ((pep0) oep0Var).f((m950) u0gVar.get(), new qdm(str2), hxx.a);
                                        break;
                                    }
                                }
                                x880Var.o();
                                break;
                            } else {
                                x880Var.o();
                                r0 r0Var = ((kdm) obj).a.a;
                                Long valueOf = Long.valueOf(System.currentTimeMillis());
                                r0Var.getClass();
                                r0Var.m(null, valueOf);
                                break;
                            }
                        } else {
                            ((pep0) oep0Var).f((m950) u0gVar.get(), pdm.a, hxx.a);
                            x880Var.o();
                            break;
                        }
                    } else {
                        x880Var.n();
                        break;
                    }
                } else {
                    x880Var.n();
                    break;
                }
        }
    }

    public wt6(kdm kdmVar, wiq0 wiq0Var, u0g u0gVar, oep0 oep0Var, yvw yvwVar) {
        this.c = kdmVar;
        this.b = wiq0Var;
        this.d = u0gVar;
        this.e = oep0Var;
        this.f = yvwVar;
    }
}
