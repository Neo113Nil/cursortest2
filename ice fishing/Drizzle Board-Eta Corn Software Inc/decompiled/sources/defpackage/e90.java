package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class e90 {
    public final long MdtA4re8;
    public final List NCTxEWno;
    public final i90 qoPGr6Ce;
    public final boolean wxUZMvaN;

    public e90(i90 i90Var, List list, long j, boolean z) {
        i90Var.getClass();
        list.getClass();
        this.qoPGr6Ce = i90Var;
        this.NCTxEWno = list;
        this.MdtA4re8 = j;
        this.wxUZMvaN = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    public static e90 qoPGr6Ce(e90 e90Var, i90 i90Var, ArrayList arrayList, long j, boolean z, int i) {
        if ((i & 1) != 0) {
            i90Var = e90Var.qoPGr6Ce;
        }
        i90 i90Var2 = i90Var;
        ArrayList arrayList2 = arrayList;
        if ((i & 2) != 0) {
            arrayList2 = e90Var.NCTxEWno;
        }
        ArrayList arrayList3 = arrayList2;
        if ((i & 4) != 0) {
            j = e90Var.MdtA4re8;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = e90Var.wxUZMvaN;
        }
        e90Var.getClass();
        i90Var2.getClass();
        arrayList3.getClass();
        return new e90(i90Var2, arrayList3, j2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e90)) {
            return false;
        }
        e90 e90Var = (e90) obj;
        return this.qoPGr6Ce == e90Var.qoPGr6Ce && fn.qoPGr6Ce(this.NCTxEWno, e90Var.NCTxEWno) && this.MdtA4re8 == e90Var.MdtA4re8 && this.wxUZMvaN == e90Var.wxUZMvaN;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.wxUZMvaN) + ((Long.hashCode(this.MdtA4re8) + ((this.NCTxEWno.hashCode() + (this.qoPGr6Ce.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SprintRoundState(trait=" + this.qoPGr6Ce + ", cards=" + this.NCTxEWno + ", elapsedMillis=" + this.MdtA4re8 + ", submitEnabled=" + this.wxUZMvaN + ")";
    }
}
