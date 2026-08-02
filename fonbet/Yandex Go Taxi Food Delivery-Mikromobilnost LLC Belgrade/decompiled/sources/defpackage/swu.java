package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.util.Arrays;
import ru.rt.ebs.cryptosdk.core.common.controllers.ICommonController;
import ru.rt.ebs.cryptosdk.core.common.entities.models.ISdkDispatchers;

/* loaded from: classes13.dex */
public final /* synthetic */ class swu implements sls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ swu(bu0 bu0Var, String str, boolean z, boolean z2) {
        this.w = bu0Var;
        this.x = str;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                bu0 bu0Var = (bu0) this.w;
                String str = (String) this.x;
                boolean z = this.b;
                boolean z2 = this.c;
                rwu rwuVar = (rwu) ((hio) bu0Var.d).a.get(Boolean.valueOf(z));
                if (rwuVar != null) {
                    return new qwu(str, rwuVar, (u3u) bu0Var.c, z2, (twu) bu0Var.e, (ICommonController) bu0Var.f, (ISdkDispatchers) bu0Var.g);
                }
                throw new IllegalStateException("No configurator for useCryptoProTLS = " + z);
            case 1:
                boolean z3 = this.b;
                boolean z4 = this.c;
                tls tlsVar = (tls) this.w;
                ixz ixzVar = (ixz) this.x;
                if (!z3 && !z4) {
                    tlsVar.invoke(ixzVar.a);
                }
                return zy11.a;
            default:
                return String.format("taxi order=%s, with state=%s | stateChanged=%s, orderUiActive=%s", Arrays.copyOf(new Object[]{(String) this.x, ((TaxiOrder) this.w).h.b, Boolean.valueOf(this.b), Boolean.valueOf(this.c)}, 4));
        }
    }

    public /* synthetic */ swu(tls tlsVar, ixz ixzVar, boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
        this.w = tlsVar;
        this.x = ixzVar;
    }

    public /* synthetic */ swu(String str, TaxiOrder taxiOrder, boolean z, boolean z2) {
        this.x = str;
        this.w = taxiOrder;
        this.b = z;
        this.c = z2;
    }
}
