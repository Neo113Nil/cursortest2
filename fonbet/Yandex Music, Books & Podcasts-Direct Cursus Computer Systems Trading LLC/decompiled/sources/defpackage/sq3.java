package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class sq3 {
    public final int a;
    public final String b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public tk7 e;

    public sq3(int i, String str, tk7 tk7Var) {
        this.a = i;
        this.b = str;
        this.e = tk7Var;
    }

    public final long a(long j, long j2) {
        vq1.v(j >= 0);
        vq1.v(j2 >= 0);
        miq b = b(j, j2);
        long j3 = b.c;
        if (!b.d) {
            if (j3 == -1) {
                j3 = Long.MAX_VALUE;
            }
            return -Math.min(j3, j2);
        }
        long j4 = j + j2;
        long j5 = j4 >= 0 ? j4 : Long.MAX_VALUE;
        long j6 = b.b + j3;
        if (j6 < j5) {
            for (miq miqVar : this.c.tailSet(b, false)) {
                long j7 = miqVar.b;
                if (j7 > j6) {
                    break;
                }
                j6 = Math.max(j6, j7 + miqVar.c);
                if (j6 >= j5) {
                    break;
                }
            }
        }
        return Math.min(j6 - j, j2);
    }

    public final miq b(long j, long j2) {
        long j3 = j2;
        miq miqVar = new miq(this.b, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.c;
        miq miqVar2 = (miq) treeSet.floor(miqVar);
        if (miqVar2 != null && miqVar2.b + miqVar2.c > j) {
            return miqVar2;
        }
        miq miqVar3 = (miq) treeSet.ceiling(miqVar);
        if (miqVar3 != null) {
            long j4 = miqVar3.b - j;
            j3 = j3 == -1 ? j4 : Math.min(j4, j3);
        }
        return new miq(this.b, j, j3, -9223372036854775807L, null);
    }

    public final boolean c(long j, long j2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            rq3 rq3Var = (rq3) arrayList.get(i);
            long j3 = rq3Var.a;
            long j4 = rq3Var.b;
            if (j4 == -1) {
                if (j >= j3) {
                    return true;
                }
            } else if (j2 != -1 && j3 <= j && j + j2 <= j3 + j4) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sq3.class == obj.getClass()) {
            sq3 sq3Var = (sq3) obj;
            if (this.a == sq3Var.a && this.b.equals(sq3Var.b) && this.c.equals(sq3Var.c) && this.e.equals(sq3Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c(this.a * 31, 31, this.b);
    }
}
