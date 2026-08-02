package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.z;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class ur10 implements sdf {
    public static final z b = z.c().f(new ak00(6)).a(z.c().g().f(new ak00(7)));
    public final ArrayList a = new ArrayList();

    @Override // defpackage.sdf
    public final boolean a(tdf tdfVar, long j) {
        long j2 = tdfVar.b;
        d6z.l(j2 != -9223372036854775807L);
        d6z.l(tdfVar.c != -9223372036854775807L);
        boolean z = j2 <= j && j < tdfVar.d;
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((tdf) arrayList.get(size)).b) {
                arrayList.add(size + 1, tdfVar);
                return z;
            }
        }
        arrayList.add(0, tdfVar);
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sdf
    public final ImmutableList b(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j >= ((tdf) arrayList.get(0)).b) {
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < arrayList.size(); i++) {
                    tdf tdfVar = (tdf) arrayList.get(i);
                    if (j >= tdfVar.b && j < tdfVar.d) {
                        arrayList2.add(tdfVar);
                    }
                    if (j < tdfVar.b) {
                        break;
                    }
                }
                ImmutableList x = ImmutableList.x(b, arrayList2);
                ImmutableList.a aVar = new ImmutableList.a();
                for (int i2 = 0; i2 < x.size(); i2++) {
                    aVar.d(((tdf) x.get(i2)).a);
                }
                return aVar.g();
            }
        }
        return ImmutableList.p();
    }

    @Override // defpackage.sdf
    public final long c(long j) {
        int i = 0;
        long j2 = -9223372036854775807L;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                break;
            }
            long j3 = ((tdf) arrayList.get(i)).b;
            long j4 = ((tdf) arrayList.get(i)).d;
            if (j < j3) {
                j2 = j2 == -9223372036854775807L ? j3 : Math.min(j2, j3);
            } else {
                if (j < j4) {
                    j2 = j2 == -9223372036854775807L ? j4 : Math.min(j2, j4);
                }
                i++;
            }
        }
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.sdf
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.sdf
    public final void d(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            long j2 = ((tdf) arrayList.get(i)).b;
            if (j > j2 && j > ((tdf) arrayList.get(i)).d) {
                arrayList.remove(i);
                i--;
            } else if (j < j2) {
                return;
            }
            i++;
        }
    }

    @Override // defpackage.sdf
    public final long e(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j < ((tdf) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        long j2 = ((tdf) arrayList.get(0)).b;
        for (int i = 0; i < arrayList.size(); i++) {
            long j3 = ((tdf) arrayList.get(i)).b;
            long j4 = ((tdf) arrayList.get(i)).d;
            if (j4 > j) {
                if (j3 > j) {
                    break;
                }
                j2 = Math.max(j2, j3);
            } else {
                j2 = Math.max(j2, j4);
            }
        }
        return j2;
    }
}
