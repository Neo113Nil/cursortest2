package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class ys6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dt6 b;
    public final /* synthetic */ zq6 c;

    public /* synthetic */ ys6(dt6 dt6Var, zq6 zq6Var, int i) {
        this.a = i;
        this.b = dt6Var;
        this.c = zq6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ls6 ls6Var = this.b.e;
                if (ls6Var != null) {
                    ls6Var.f(this.c);
                    return;
                } else {
                    Intrinsics.j("callback");
                    throw null;
                }
            default:
                ls6 ls6Var2 = this.b.e;
                if (ls6Var2 != null) {
                    ls6Var2.f(this.c);
                    return;
                } else {
                    Intrinsics.j("callback");
                    throw null;
                }
        }
    }
}
