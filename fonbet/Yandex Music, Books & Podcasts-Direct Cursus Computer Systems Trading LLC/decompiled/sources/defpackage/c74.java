package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class c74 {
    public final Context a;
    public final jyr b;
    public String c;
    public String d;

    public c74(Context context, jyr jyrVar) {
        this.a = context;
        this.b = jyrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var, String str, List list) {
        b74 b74Var;
        int i;
        c74 c74Var;
        if (cg6Var instanceof b74) {
            b74Var = (b74) cg6Var;
            int i2 = b74Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b74Var.m = i2 - Integer.MIN_VALUE;
                Object obj = b74Var.k;
                nm6 nm6Var = nm6.a;
                i = b74Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    n71 n71Var = new n71(this, list, str, (Continuation) null, 3);
                    mn7 mn7Var = dm6.b;
                    b74Var.j = this;
                    b74Var.m = 1;
                    obj = x97.V(mn7Var, n71Var, b74Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    c74Var = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c74Var = b74Var.j;
                    qgg.h0(obj);
                }
                c74Var.c = (String) obj;
                return Unit.a;
            }
        }
        b74Var = new b74(this, cg6Var);
        Object obj2 = b74Var.k;
        nm6 nm6Var2 = nm6.a;
        i = b74Var.m;
        if (i != 0) {
        }
        c74Var.c = (String) obj2;
        return Unit.a;
    }
}
