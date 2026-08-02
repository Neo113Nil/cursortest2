package defpackage;

/* loaded from: classes.dex */
public final class e3t {
    public static final e3t b;
    public static final String c;
    public final yde a;

    static {
        ude udeVar = yde.b;
        b = new e3t(qsn.e);
        int i = dvt.a;
        c = Integer.toString(0, 36);
    }

    public e3t(qsn qsnVar) {
        this.a = yde.v(qsnVar);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            yde ydeVar = this.a;
            if (i2 >= ydeVar.size()) {
                return false;
            }
            d3t d3tVar = (d3t) ydeVar.get(i2);
            boolean[] zArr = d3tVar.e;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (d3tVar.b.c == i) {
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e3t.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((e3t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
