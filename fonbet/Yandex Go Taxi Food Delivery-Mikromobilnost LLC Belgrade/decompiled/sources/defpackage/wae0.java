package defpackage;

import ru.yandex.taxi.e;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes5.dex */
public final class wae0 {
    public final e a;
    public final n3a b;

    public wae0(e eVar, n3a n3aVar) {
        this.a = eVar;
        this.b = n3aVar;
    }

    public final boolean a(TariffOrderFlow tariffOrderFlow) {
        e eVar = this.a;
        if ((!eVar.f() || eVar.j((rtb0) eVar.e().c()).h) && !((Boolean) this.b.b.b()).booleanValue()) {
            switch (tariffOrderFlow == null ? -1 : vae0.a[tariffOrderFlow.ordinal()]) {
                case -1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                case 0:
                default:
                    w511.b();
                    break;
                case 1:
                    break;
            }
            return false;
        }
        return false;
    }
}
