package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class q72 implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ s72 b;

    public /* synthetic */ q72(s72 s72Var, int i) {
        this.a = i;
        this.b = s72Var;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        s72 s72Var = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                s72Var.n();
                break;
            default:
                String str = (String) obj;
                d72[] d72VarArr = d72.b;
                if (Intrinsics.d(str, "EMPTY_OFFLINE_BLOCK_STUB_MEDIA_ID")) {
                    ((z66) s72Var.a.k.getValue()).i(u0j.b);
                } else if (Intrinsics.d(str, "EMPTY_NO_NETWORK_BLOCK_STUB_MEDIA_ID")) {
                    s72Var.n();
                }
                break;
        }
        return Unit.a;
    }
}
