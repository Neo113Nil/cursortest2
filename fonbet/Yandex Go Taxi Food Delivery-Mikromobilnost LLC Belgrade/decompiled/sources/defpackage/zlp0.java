package defpackage;

import com.yandex.go.zone.dto.objects.CustomEndpoint;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.model.Zone;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.sdc.route.presentation.f;

/* loaded from: classes6.dex */
public final class zlp0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ f b;

    public /* synthetic */ zlp0(f fVar, int i) {
        this.a = i;
        this.b = fVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                fnx0 fnx0Var = (fnx0) obj;
                Zone zone = (Zone) this.b.b.a.getValue();
                if (zone != null) {
                    f fVar = this.b;
                    String str = fnx0Var.c.b;
                    fVar.getClass();
                    Iterator it = zone.k.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            ZoneTariffInfo zoneTariffInfo = (ZoneTariffInfo) it.next();
                            if (jl40.l(str, zoneTariffInfo.e) && !zoneTariffInfo.G.isEmpty() && ((CustomEndpoint) zoneTariffInfo.G.get(0)).a == CustomEndpoint.Type.ROUTE) {
                                fVar.d.b = ((CustomEndpoint) zoneTariffInfo.G.get(0)).b;
                            }
                        }
                    }
                }
                break;
            case 1:
                this.b.b();
                break;
            case 2:
                this.b.b();
                break;
            default:
                this.b.d((d0l0) obj);
                break;
        }
        return zy11.a;
    }
}
