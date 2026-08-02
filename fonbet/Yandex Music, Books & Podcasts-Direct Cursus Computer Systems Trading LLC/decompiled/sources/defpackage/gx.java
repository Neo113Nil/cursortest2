package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class gx {
    public final ox a;
    public final Function0 b;
    public final tf6 c;

    public gx(ox oxVar, Function0 function0) {
        function0.getClass();
        this.a = oxVar;
        this.b = function0;
        this.c = gld.e(dm6.b);
    }

    public final void a(fx fxVar, String str, gj gjVar) {
        gjVar.getClass();
        if (((Boolean) this.b.invoke()).booleanValue()) {
            x97.y(this.c, null, null, new v3(this, fxVar, str, gjVar, (Continuation) null, 1), 3);
        }
    }
}
