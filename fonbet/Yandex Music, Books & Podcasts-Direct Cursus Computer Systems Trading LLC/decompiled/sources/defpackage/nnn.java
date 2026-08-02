package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class nnn implements mnn {
    public final String a;
    public final anf b;
    public final kzn c;

    public nnn(String str, anf anfVar, kzn kznVar) {
        this.a = str;
        this.b = anfVar;
        this.c = kznVar;
    }

    @Override // defpackage.mnn
    public final void a(String str, RuntimeException runtimeException, long j) {
        str.getClass();
        this.c.c.a(new fnn(this.a, str, runtimeException, j));
    }

    @Override // defpackage.mnn
    public final void c(boolean z, long j, kgk kgkVar) {
        if (z) {
            return;
        }
        this.c.b.a(new dnn(j, this.a, (String) kgkVar.invoke()));
    }

    @Override // defpackage.mnn
    public final void d(String str, long j, long j2, long j3) {
        this.b.a(new hnn(str, j, j2, j3));
    }

    @Override // defpackage.mnn
    public final boolean e() {
        return true;
    }

    @Override // defpackage.mnn
    public final void f(long j, Function0 function0) {
        this.b.a(new enn((String) function0.invoke(), j));
    }
}
