package defpackage;

import com.yandex.go.scooters.driver_license_notification.domain.c;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes13.dex */
public final /* synthetic */ class q6n0 implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ q6n0(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                cVar.b((xno0) obj);
                break;
            default:
                cVar.b((xno0) obj);
                break;
        }
        return zy11Var;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
        }
        return new AdaptedFunctionReference(2, this.b, c.class, "showNotification", "showNotification(Lcom/yandex/go/scooters/promotions/api/domain/model/ScootersPromotions$TopBannerCommunication;)V", 4);
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
