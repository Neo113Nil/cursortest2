package defpackage;

import com.yandex.quark.yango.ActiveMode;
import kotlin.collections.b;
import ru.yandex.alice.protos.data.yango.TLatLon;
import ru.yandex.alice.protos.endpoint.capabilities.yango.TGoCapability;
import ru.yandex.alice.protos.endpoint.platform.utils.TCapability;

/* loaded from: classes8.dex */
public final class ymt extends hy4 {
    public final t830 b = new t830(b.f(), true);
    public final String c = "QuarkGoCapability";
    public wmt d;
    public ul2 e;
    public final yvi0 f;
    public final String g;

    public ymt(zwf0 zwf0Var) {
        wmt wmtVar = new wmt(null, null);
        this.d = wmtVar;
        this.e = f(wmtVar);
        this.f = new yvi0(zwf0Var);
        this.g = "YangoModule";
    }

    @Override // defpackage.u28
    public final String a() {
        return this.c;
    }

    @Override // defpackage.u28
    public final String c() {
        return this.g;
    }

    @Override // defpackage.u28
    public final bnj d() {
        return this.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ul2 f(wmt wmtVar) {
        TGoCapability.EActiveMode eActiveMode;
        t6z t6zVar = wmtVar.a;
        TLatLon tLatLon = t6zVar != null ? new TLatLon(t6zVar.a, t6zVar.b, t6zVar.c, null, 8, null) : null;
        ActiveMode activeMode = wmtVar.b;
        int i = activeMode == null ? -1 : xmt.a[activeMode.ordinal()];
        if (i == -1) {
            eActiveMode = TGoCapability.EActiveMode.Undefined;
        } else if (i == 1) {
            eActiveMode = TGoCapability.EActiveMode.Go;
        } else if (i == 2) {
            eActiveMode = TGoCapability.EActiveMode.Eats;
        } else if (i == 3) {
            eActiveMode = TGoCapability.EActiveMode.Delivery;
        } else if (i == 4) {
            eActiveMode = TGoCapability.EActiveMode.Grocery;
        } else {
            if (i != 5) {
                w511.b();
                return null;
            }
            eActiveMode = TGoCapability.EActiveMode.Market;
        }
        return new ul2(TCapability.ECapabilityType.GoCapabilityType, new TGoCapability(null, 0 == true ? 1 : 0, new TGoCapability.TState(tLatLon, eActiveMode, null, 4, null), null, 11, null), this.b);
    }

    @Override // defpackage.u28
    public final synchronized png getCurrentState() {
        return this.e;
    }
}
