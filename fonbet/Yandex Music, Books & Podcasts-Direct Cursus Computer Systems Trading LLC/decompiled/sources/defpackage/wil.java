package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class wil {
    public static int a() {
        long j;
        l18 l18Var = l18.b;
        bdt I = hag.I(kmd.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        mjs mjsVar = (mjs) ((kmd) qdcVar.C(I)).e.getValue();
        if (mjsVar instanceof kjs) {
            j = ((kjs) mjsVar).b();
        } else {
            if (!Intrinsics.d(mjsVar, ljs.a)) {
                b6e.s();
                return 0;
            }
            nsa.b.getClass();
            j = 0;
        }
        return (int) nsa.s(j, ssa.SECONDS);
    }
}
