package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class bof implements eun {
    public final Function2 a;
    public final tf6 b;
    public r2f c;

    public bof(CoroutineContext coroutineContext, Function2 function2) {
        this.a = function2;
        this.b = gld.e(coroutineContext);
    }

    @Override // defpackage.eun
    public final void b() {
        r2f r2fVar = this.c;
        if (r2fVar != null) {
            r2fVar.g(n7w.c("Old job was still running!", null));
        }
        this.c = x97.y(this.b, null, null, this.a, 3);
    }

    @Override // defpackage.eun
    public final void d() {
        r2f r2fVar = this.c;
        if (r2fVar != null) {
            r2fVar.g(new yrc(1));
        }
        this.c = null;
    }

    @Override // defpackage.eun
    public final void e() {
        r2f r2fVar = this.c;
        if (r2fVar != null) {
            r2fVar.g(new yrc(1));
        }
        this.c = null;
    }
}
