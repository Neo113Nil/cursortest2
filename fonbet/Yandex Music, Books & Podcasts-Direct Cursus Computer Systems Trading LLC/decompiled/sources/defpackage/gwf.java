package defpackage;

import java.util.TreeSet;

/* loaded from: classes.dex */
public final class gwf implements rp3 {
    public final long a;
    public final TreeSet b = new TreeSet(new mj(21));
    public long c;

    public gwf(long j) {
        this.a = j;
    }

    @Override // defpackage.rp3
    public final void a(liq liqVar, miq miqVar) {
        TreeSet treeSet = this.b;
        treeSet.add(miqVar);
        this.c += miqVar.c;
        while (this.c > this.a && !treeSet.isEmpty()) {
            liqVar.s((jq3) treeSet.first());
        }
    }

    @Override // defpackage.rp3
    public final void b(liq liqVar, miq miqVar, miq miqVar2) {
        e(liqVar, miqVar);
        a(liqVar, miqVar2);
    }

    @Override // defpackage.rp3
    public final boolean c() {
        return true;
    }

    @Override // defpackage.rp3
    public final void d(liq liqVar, String str, long j) {
        if (j != -1) {
            while (this.c + j > this.a) {
                TreeSet treeSet = this.b;
                if (treeSet.isEmpty()) {
                    return;
                } else {
                    liqVar.s((jq3) treeSet.first());
                }
            }
        }
    }

    @Override // defpackage.rp3
    public final void e(liq liqVar, jq3 jq3Var) {
        this.b.remove(jq3Var);
        this.c -= jq3Var.c;
    }
}
