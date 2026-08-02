package defpackage;

import com.yandex.go.masstransit.sdk.ble.impl.domain.a;
import com.yandex.go.masstransit.sdk.ble.impl.modal.d;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class tk30 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ n26 c;
    public final /* synthetic */ tse w;

    public /* synthetic */ tk30(d dVar, n26 n26Var, tse tseVar, int i) {
        this.a = i;
        this.b = dVar;
        this.c = n26Var;
        this.w = tseVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        k26 k26Var;
        k26 k26Var2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tse tseVar = this.w;
        u26 u26Var = null;
        n26 n26Var = this.c;
        d dVar = this.b;
        switch (i) {
            case 0:
                if (((Boolean) dVar.i.d.a.getValue()).booleanValue()) {
                    a aVar = dVar.g;
                    r26 r26Var = n26Var.a;
                    if (r26Var != null && (k26Var = r26Var.b) != null) {
                        u26Var = k26Var.f;
                    }
                    aVar.a.d(u26Var, tseVar);
                    break;
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    a aVar2 = dVar.g;
                    r26 r26Var2 = n26Var.a;
                    if (r26Var2 != null && (k26Var2 = r26Var2.b) != null) {
                        u26Var = k26Var2.f;
                    }
                    aVar2.a.d(u26Var, tseVar);
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
