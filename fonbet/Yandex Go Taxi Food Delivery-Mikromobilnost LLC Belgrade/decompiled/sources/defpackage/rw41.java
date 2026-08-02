package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class rw41 implements e2v0, fh81 {
    public final List a;
    public final long[] b;
    public final long[] c;

    public rw41(ArrayList arrayList, int i) {
        int i2 = 0;
        switch (i) {
            case 1:
                this.a = Collections.unmodifiableList(new ArrayList(arrayList));
                this.b = new long[arrayList.size() * 2];
                while (i2 < arrayList.size()) {
                    oz71 oz71Var = (oz71) arrayList.get(i2);
                    int i3 = i2 * 2;
                    long[] jArr = this.b;
                    jArr[i3] = oz71Var.b;
                    jArr[i3 + 1] = oz71Var.c;
                    i2++;
                }
                long[] jArr2 = this.b;
                long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
                this.c = copyOf;
                Arrays.sort(copyOf);
                break;
            default:
                this.a = Collections.unmodifiableList(new ArrayList(arrayList));
                this.b = new long[arrayList.size() * 2];
                while (i2 < arrayList.size()) {
                    jw41 jw41Var = (jw41) arrayList.get(i2);
                    int i4 = i2 * 2;
                    long[] jArr3 = this.b;
                    jArr3[i4] = jw41Var.b;
                    jArr3[i4 + 1] = jw41Var.c;
                    i2++;
                }
                long[] jArr4 = this.b;
                long[] copyOf2 = Arrays.copyOf(jArr4, jArr4.length);
                this.c = copyOf2;
                Arrays.sort(copyOf2);
                break;
        }
    }

    @Override // defpackage.fh81
    public int a(long j) {
        long[] jArr = this.c;
        int f = rf71.f(jArr, j, false);
        if (f < jArr.length) {
            return f;
        }
        return -1;
    }

    @Override // defpackage.fh81
    public long b(int i) {
        if (i < 0) {
            w511.q();
            return 0L;
        }
        long[] jArr = this.c;
        if (i < jArr.length) {
            return jArr[i];
        }
        w511.q();
        return 0L;
    }

    @Override // defpackage.e2v0
    public long c(int i) {
        d6z.l(i >= 0);
        long[] jArr = this.c;
        d6z.l(i < jArr.length);
        return jArr[i];
    }

    @Override // defpackage.fh81
    public List d(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (true) {
            List list = this.a;
            if (i2 >= list.size()) {
                break;
            }
            int i3 = i2 * 2;
            long[] jArr = this.b;
            if (jArr[i3] <= j && j < jArr[i3 + 1]) {
                oz71 oz71Var = (oz71) list.get(i2);
                r871 r871Var = oz71Var.a;
                if (r871Var.x == -3.4028235E38f) {
                    arrayList2.add(oz71Var);
                } else {
                    arrayList.add(r871Var);
                }
            }
            i2++;
        }
        Collections.sort(arrayList2, new uw21(17));
        while (i < arrayList2.size()) {
            r871 r871Var2 = ((oz71) arrayList2.get(i)).a;
            arrayList.add(new r871(r871Var2.a, r871Var2.b, r871Var2.c, r871Var2.w, (-1) - i, 1, r871Var2.z, r871Var2.A, r871Var2.B, r871Var2.G, r871Var2.H, r871Var2.C, r871Var2.D, r871Var2.E, r871Var2.F, r871Var2.I, r871Var2.J));
            i++;
            arrayList2 = arrayList2;
        }
        return arrayList;
    }

    @Override // defpackage.e2v0
    public int g() {
        return this.c.length;
    }

    @Override // defpackage.e2v0
    public int h(long j) {
        long[] jArr = this.c;
        int a = tw21.a(jArr, j, false);
        if (a < jArr.length) {
            return a;
        }
        return -1;
    }

    @Override // defpackage.e2v0
    public List i(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.b;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                jw41 jw41Var = (jw41) list.get(i);
                odf odfVar = jw41Var.a;
                if (odfVar.e == -3.4028235E38f) {
                    arrayList2.add(jw41Var);
                } else {
                    arrayList.add(odfVar);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new uw21(2));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            ndf a = ((jw41) arrayList2.get(i3)).a.a();
            a.e = (-1) - i3;
            a.f = 1;
            arrayList.add(a.a());
        }
        return arrayList;
    }

    @Override // defpackage.fh81
    public int a() {
        return this.c.length;
    }
}
