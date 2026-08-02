package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes6.dex */
public final /* synthetic */ class yo21 implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ so21 b;

    public /* synthetic */ yo21(so21 so21Var, int i) {
        this.a = i;
        this.b = so21Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        so21 so21Var = this.b;
        switch (i) {
            case 0:
                so21Var.updateAzimuth(((Number) obj).floatValue());
                break;
            default:
                so21Var.updateUserLocation((mo21) obj);
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
            case 0:
                return new AdaptedFunctionReference(2, this.b, so21.class, "updateAzimuth", "updateAzimuth(F)V", 4);
            default:
                return new AdaptedFunctionReference(2, this.b, so21.class, "updateUserLocation", "updateUserLocation(Lru/yandex/taxi/preorder/source/userposition/UserLocation;)V", 4);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
