package defpackage;

import android.content.Context;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class nsb implements ze9 {
    public final Context b;
    public final qxp c;

    public nsb(Context context, qxp qxpVar) {
        this.b = context;
        this.c = qxpVar;
    }

    @Override // defpackage.ze9
    public final jf9 a(ArrayList arrayList) {
        return c(arrayList, lhb.t);
    }

    @Override // defpackage.ze9
    public final jf9 b(ArrayList arrayList, Function1 function1) {
        return c(arrayList, function1);
    }

    public final jf9 c(ArrayList arrayList, Function1 function1) {
        if (arrayList.isEmpty()) {
            return gos.c;
        }
        dq7 dq7Var = ca8.a;
        final rar y = x97.y(cmd.a, mn7.d, null, new n71(this, arrayList, function1, (Continuation) null), 2);
        return new jf9() { // from class: msb
            @Override // defpackage.jf9
            public final void cancel() {
                rar.this.g(null);
            }
        };
    }
}
