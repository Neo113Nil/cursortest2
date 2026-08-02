package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class xs6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dt6 b;

    public /* synthetic */ xs6(dt6 dt6Var, int i) {
        this.a = i;
        this.b = dt6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ls6 ls6Var = this.b.e;
                if (ls6Var != null) {
                    ls6Var.f(new as6(new o2(26), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
                    return;
                } else {
                    Intrinsics.j("callback");
                    throw null;
                }
            default:
                ls6 ls6Var2 = this.b.e;
                if (ls6Var2 != null) {
                    ls6Var2.f(new yq6("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 4));
                    return;
                } else {
                    Intrinsics.j("callback");
                    throw null;
                }
        }
    }
}
