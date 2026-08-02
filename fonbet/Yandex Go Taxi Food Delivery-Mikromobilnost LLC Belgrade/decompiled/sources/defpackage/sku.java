package defpackage;

import com.yandex.pulse.histogram.ComponentHistograms;

/* loaded from: classes8.dex */
public class sku {
    public final String a;
    public final Class b;
    public int c;
    public int d;
    public int e;

    public sku(String str, Class cls, int i, int i2, int i3) {
        this.a = str;
        this.b = cls;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public vku a(po6 po6Var) {
        return new uku(this.a, po6Var);
    }

    public final vku b(ComponentHistograms componentHistograms) {
        vku a = componentHistograms.a(this.a);
        if (a == null) {
            po6 c = c();
            String str = componentHistograms.a;
            c.b();
            synchronized (gp50.c) {
                try {
                    if (gp50.x == null) {
                        new gp50(1);
                    }
                    if (!((ycs0) gp50.x.b).containsKey(str)) {
                        ((ycs0) gp50.x.b).put(str, new t7u0());
                    }
                    ycs0 ycs0Var = ((t7u0) ((ycs0) gp50.x.b).get(str)).b;
                    po6 po6Var = (po6) ycs0Var.get(c);
                    if (po6Var == null) {
                        ycs0Var.put(c, c);
                    } else {
                        c = po6Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.e == 0) {
                int a2 = c.a();
                this.e = a2;
                int[] iArr = c.a;
                this.c = iArr[1];
                this.d = iArr[a2 - 1];
            }
            int[] iArr2 = c.a;
            int i = iArr2[1];
            int i2 = iArr2[this.e - 1];
            a = componentHistograms.e(a(c));
        }
        if (!this.b.equals(a.getClass())) {
            xfo.g(oyr.t(new StringBuilder("Histogram "), this.a, " has mismatched type"));
            return null;
        }
        int i3 = this.e;
        if (i3 == 0 || a.e(this.c, this.d, i3)) {
            return a;
        }
        xfo.g(oyr.t(new StringBuilder("Histogram "), this.a, " has mismatched construction arguments"));
        return null;
    }

    public po6 c() {
        po6 po6Var = new po6(this.e + 1);
        int i = this.c;
        double log = Math.log(this.d);
        int[] iArr = po6Var.a;
        iArr[1] = i;
        int a = po6Var.a();
        int i2 = 1;
        while (true) {
            i2++;
            if (a <= i2) {
                iArr[po6Var.a()] = Integer.MAX_VALUE;
                po6Var.b = po6Var.b();
                return po6Var;
            }
            double log2 = Math.log(i);
            int a2 = m810.a(Math.exp(((log - log2) / (a - i2)) + log2));
            i = a2 > i ? a2 : i + 1;
            iArr[i2] = i;
        }
    }
}
