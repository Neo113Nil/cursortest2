package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fh2 implements pt3 {
    public final eh2[] a;

    public fh2(eh2[] eh2VarArr) {
        this.a = eh2VarArr;
    }

    public final void a() {
        for (eh2 eh2Var : this.a) {
            qa8 qa8Var = eh2Var.f;
            if (qa8Var == null) {
                Intrinsics.j("handle");
                throw null;
            }
            qa8Var.a();
        }
    }

    @Override // defpackage.pt3
    public final void b(Throwable th) {
        a();
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
