package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ylq {
    public uif a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function0, uif] */
    public ylq(gc8 gc8Var, Function0 function0) {
        this.a = (uif) function0;
        if (gc8Var.isAttachedToWindow()) {
            ?? r1 = this.a;
            if (r1 != 0) {
                r1.invoke();
            }
            this.a = null;
        }
    }
}
