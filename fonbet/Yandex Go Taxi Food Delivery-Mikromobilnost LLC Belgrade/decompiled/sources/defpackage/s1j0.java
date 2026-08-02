package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class s1j0 implements sdf {
    public final ArrayList a = new ArrayList();

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // defpackage.sdf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(tdf tdfVar, long j) {
        boolean z;
        int size;
        long j2 = tdfVar.b;
        d6z.l(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = tdfVar.d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
                ArrayList arrayList = this.a;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j2 >= ((tdf) arrayList.get(size)).b) {
                        arrayList.add(size + 1, tdfVar);
                        return z;
                    }
                    if (((tdf) arrayList.get(size)).b <= j) {
                        z = false;
                    }
                }
                arrayList.add(0, tdfVar);
                return z;
            }
        }
        z = false;
        ArrayList arrayList2 = this.a;
        while (size >= 0) {
        }
        arrayList2.add(0, tdfVar);
        return z;
    }

    @Override // defpackage.sdf
    public final ImmutableList b(long j) {
        int f = f(j);
        if (f == 0) {
            return ImmutableList.p();
        }
        tdf tdfVar = (tdf) this.a.get(f - 1);
        long j2 = tdfVar.d;
        return (j2 == -9223372036854775807L || j < j2) ? tdfVar.a : ImmutableList.p();
    }

    @Override // defpackage.sdf
    public final long c(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((tdf) arrayList.get(0)).b) {
            return ((tdf) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            tdf tdfVar = (tdf) arrayList.get(i);
            long j2 = tdfVar.b;
            long j3 = tdfVar.b;
            if (j < j2) {
                long j4 = ((tdf) arrayList.get(i - 1)).d;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((tdf) eab1.c(arrayList)).d;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    @Override // defpackage.sdf
    public final void clear() {
        this.a.clear();
    }

    @Override // defpackage.sdf
    public final void d(long j) {
        int f = f(j);
        if (f == 0) {
            return;
        }
        ArrayList arrayList = this.a;
        long j2 = ((tdf) arrayList.get(f - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            f--;
        }
        arrayList.subList(0, f).clear();
    }

    @Override // defpackage.sdf
    public final long e(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j < ((tdf) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((tdf) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                tdf tdfVar = (tdf) arrayList.get(i - 1);
                long j3 = tdfVar.d;
                return (j3 == -9223372036854775807L || j3 > j) ? tdfVar.b : j3;
            }
        }
        tdf tdfVar2 = (tdf) eab1.c(arrayList);
        long j4 = tdfVar2.d;
        return (j4 == -9223372036854775807L || j < j4) ? tdfVar2.b : j4;
    }

    public final int f(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((tdf) arrayList.get(i)).b) {
                return i;
            }
            i++;
        }
    }
}
