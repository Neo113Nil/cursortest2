package defpackage;

import kotlin.collections.a;

/* loaded from: classes8.dex */
public final class v950 extends h55 {
    public final /* synthetic */ w950 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v950(w950 w950Var) {
        super(null);
        this.D = w950Var;
    }

    public final void P() {
        w950 w950Var = this.D;
        if (!w950Var.f) {
            p950.a.j(new IllegalStateException("Can't attach current stack while canAttachChildRouters is false"));
            return;
        }
        w950Var.g = true;
        try {
            h55 b = w950Var.b();
            for (azt0 azt0Var : a.J0(w950Var.d)) {
                if (azt0Var.u()) {
                    azt0Var.P();
                } else {
                    azt0Var.g();
                }
                if (b != null && !b.w()) {
                    break;
                }
            }
            w950Var.g = false;
            w950.a(w950Var);
        } catch (Throwable th) {
            w950Var.g = false;
            throw th;
        }
    }
}
