package defpackage;

import android.net.Uri;
import com.yandex.quark.webchat.auth.internal.synchronizer.c;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class xa41 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ xa41(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        Object a;
        Object value2;
        ya41 a2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                Uri uri = ((le41) obj).a;
                cVar.d.c("WebAuthorizationSynchronizer", "Web chat url changed: ".concat(le41.a(uri)));
                r0 r0Var = cVar.k;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, ya41.a((ya41) value, null, null, null, uri, false, 23)));
                return zy11Var;
            case 1:
                ya41 ya41Var = (ya41) obj;
                return (ya41Var.b() || (a = c.a(cVar, ya41Var, continuation)) != CoroutineSingletons.COROUTINE_SUSPENDED) ? zy11Var : a;
            default:
                tn3 tn3Var = (tn3) obj;
                r0 r0Var2 = cVar.k;
                do {
                    value2 = r0Var2.getValue();
                    ya41 ya41Var2 = (ya41) value2;
                    if (tn3Var instanceof rn3) {
                        cVar.d.c("WebAuthorizationSynchronizer", "Account changed: ".concat(((rn3) tn3Var).a()));
                        a2 = ya41.a(ya41Var2, null, null, tn3Var, null, false, 27);
                    } else {
                        if (!jl40.l(tn3Var, sn3.a)) {
                            w511.b();
                            return null;
                        }
                        a2 = ya41Var2.a instanceof rn3 ? ya41.a(ya41Var2, null, null, tn3Var, null, false, 27) : ya41.a(ya41Var2, null, null, null, null, true, 15);
                    }
                } while (!r0Var2.k(value2, a2));
                return zy11Var;
        }
    }
}
