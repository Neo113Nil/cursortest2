package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public final class m9r {
    public final int a;
    public final String b;
    public final long c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final String i;
    public final dsc[] j;
    public final int k;
    public final String l;
    public final String m;
    public final List n;
    public final long[] o;
    public final long p;

    public m9r(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, dsc[] dscVarArr, List list, long[] jArr, long j2) {
        this.l = str;
        this.m = str2;
        this.a = i;
        this.b = str3;
        this.c = j;
        this.d = str4;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = str5;
        this.j = dscVarArr;
        this.n = list;
        this.o = jArr;
        this.p = j2;
        this.k = list.size();
    }

    public final Uri a(int i, int i2) {
        dsc[] dscVarArr = this.j;
        vq1.A(dscVarArr != null);
        List list = this.n;
        vq1.A(list != null);
        vq1.A(i2 < list.size());
        String num = Integer.toString(dscVarArr[i].j);
        String l = ((Long) list.get(i2)).toString();
        return p1g.N(this.l, this.m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l).replace("{start_time}", l));
    }

    public final m9r b(dsc[] dscVarArr) {
        return new m9r(this.l, this.m, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, dscVarArr, this.n, this.o, this.p);
    }

    public final long c(int i) {
        if (i == this.k - 1) {
            return this.p;
        }
        long[] jArr = this.o;
        return jArr[i + 1] - jArr[i];
    }
}
