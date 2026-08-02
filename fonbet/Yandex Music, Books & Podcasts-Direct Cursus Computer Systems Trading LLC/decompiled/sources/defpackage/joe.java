package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class joe implements tv6 {
    public final /* synthetic */ int a;
    public final ArrayList b;

    public joe(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new ArrayList();
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // defpackage.tv6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(uv6 uv6Var, long j) {
        boolean z;
        int size;
        long j2 = uv6Var.b;
        vq1.v(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = uv6Var.d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
                ArrayList arrayList = this.b;
                for (size = arrayList.size() - 1; size >= 0; size--) {
                    if (j2 >= ((uv6) arrayList.get(size)).b) {
                        arrayList.add(size + 1, uv6Var);
                        return z;
                    }
                    if (((uv6) arrayList.get(size)).b <= j) {
                        z = false;
                    }
                }
                arrayList.add(0, uv6Var);
                return z;
            }
        }
        z = false;
        ArrayList arrayList2 = this.b;
        while (size >= 0) {
        }
        arrayList2.add(0, uv6Var);
        return z;
    }

    @Override // defpackage.tv6
    public yde b(long j) {
        int g = g(j);
        if (g == 0) {
            ude udeVar = yde.b;
            return qsn.e;
        }
        uv6 uv6Var = (uv6) this.b.get(g - 1);
        long j2 = uv6Var.d;
        if (j2 == -9223372036854775807L || j < j2) {
            return uv6Var.a;
        }
        ude udeVar2 = yde.b;
        return qsn.e;
    }

    @Override // defpackage.tv6
    public long c(long j) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty() || j < ((uv6) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((uv6) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                uv6 uv6Var = (uv6) arrayList.get(i - 1);
                long j3 = uv6Var.d;
                return (j3 == -9223372036854775807L || j3 > j) ? uv6Var.b : j3;
            }
        }
        uv6 uv6Var2 = (uv6) ild.x(arrayList);
        long j4 = uv6Var2.d;
        return (j4 == -9223372036854775807L || j < j4) ? uv6Var2.b : j4;
    }

    @Override // defpackage.tv6
    public void clear() {
        this.b.clear();
    }

    @Override // defpackage.tv6
    public long d(long j) {
        ArrayList arrayList = this.b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((uv6) arrayList.get(0)).b) {
            return ((uv6) arrayList.get(0)).b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            uv6 uv6Var = (uv6) arrayList.get(i);
            long j2 = uv6Var.b;
            long j3 = uv6Var.b;
            if (j < j2) {
                long j4 = ((uv6) arrayList.get(i - 1)).d;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((uv6) ild.x(arrayList)).d;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    @Override // defpackage.tv6
    public void e(long j) {
        int g = g(j);
        if (g == 0) {
            return;
        }
        ArrayList arrayList = this.b;
        long j2 = ((uv6) arrayList.get(g - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            g--;
        }
        arrayList.subList(0, g).clear();
    }

    public void f(Object obj, String str) {
        this.b.add(str + "=" + obj);
    }

    public int g(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return arrayList.size();
            }
            if (j < ((uv6) arrayList.get(i)).b) {
                return i;
            }
            i++;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return this.b.toString();
            default:
                return super.toString();
        }
    }
}
