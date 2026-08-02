package defpackage;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kh4 {
    public final qdc a;
    public final k0i b;
    public final kue c;
    public ih4 d = new gh4(this);

    public kh4(vbv vbvVar) {
        this.a = vbvVar.r;
        this.b = (k0i) vbvVar.x.getValue();
        this.c = (kue) vbvVar.z.getValue();
    }

    public final ih4 a(dh4 dh4Var) {
        Object obj = this.d;
        eh4 eh4Var = obj instanceof eh4 ? (eh4) obj : null;
        if (eh4Var != null && Intrinsics.d(eh4Var.a(), dh4Var)) {
            return this.d;
        }
        return null;
    }

    public final void b(ih4 ih4Var) {
        this.a.sendEvent("wm_chat_background", uah.e(new Pair("from", this.d.a), new Pair("to", ih4Var.a)));
        this.d = ih4Var;
    }
}
