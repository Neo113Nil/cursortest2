package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mit {
    public rjp a;
    public rjp b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[LOOP:0: B:24:0x0060->B:29:0x0070, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[EDGE_INSN: B:30:0x0075->B:31:0x0075 BREAK  A[LOOP:0: B:24:0x0060->B:29:0x0070], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(ybs ybsVar) {
        rjp rjpVar;
        ybs ybsVar2;
        this.e = false;
        rjp rjpVar2 = this.a;
        if (Intrinsics.d(ybsVar, rjpVar2 != null ? (ybs) rjpVar2.b : null)) {
            return;
        }
        String str = ybsVar.a.b;
        rjp rjpVar3 = this.a;
        boolean d = Intrinsics.d(str, (rjpVar3 == null || (ybsVar2 = (ybs) rjpVar3.b) == null) ? null : ybsVar2.a.b);
        rjp rjpVar4 = this.a;
        if (d) {
            if (rjpVar4 == null) {
                return;
            }
            rjpVar4.b = ybsVar;
            return;
        }
        this.a = new rjp(rjpVar4, ybsVar);
        this.b = null;
        int length = ybsVar.a.b.length() + this.c;
        this.c = length;
        if (length > 100000) {
            rjp rjpVar5 = this.a;
            if ((rjpVar5 != null ? (rjp) rjpVar5.a : null) == null) {
                return;
            }
            while (true) {
                if (rjpVar5 != null) {
                    rjp rjpVar6 = (rjp) rjpVar5.a;
                    if (rjpVar6 != null) {
                        rjpVar = (rjp) rjpVar6.a;
                        if (rjpVar != null) {
                            break;
                        } else {
                            rjpVar5 = (rjp) rjpVar5.a;
                        }
                    }
                }
                rjpVar = null;
                if (rjpVar != null) {
                }
            }
            if (rjpVar5 == null) {
                return;
            }
            rjpVar5.a = null;
        }
    }
}
