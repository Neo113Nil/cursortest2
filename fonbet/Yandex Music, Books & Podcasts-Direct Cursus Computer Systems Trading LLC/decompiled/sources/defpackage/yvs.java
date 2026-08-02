package defpackage;

/* loaded from: classes.dex */
public final class yvs {
    public static final yvs d = new yvs(new xvs[0]);
    public static final String e;
    public final int a;
    public final qsn b;
    public int c;

    static {
        int i = dvt.a;
        e = Integer.toString(0, 36);
    }

    public yvs(xvs... xvsVarArr) {
        qsn w = yde.w(xvsVarArr);
        this.b = w;
        this.a = xvsVarArr.length;
        int i = 0;
        while (i < w.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < w.d; i3++) {
                if (((xvs) w.get(i)).equals(w.get(i3))) {
                    vq1.L("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final xvs a(int i) {
        return (xvs) this.b.get(i);
    }

    public final int b(xvs xvsVar) {
        int indexOf = this.b.indexOf(xvsVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yvs.class != obj.getClass()) {
            return false;
        }
        yvs yvsVar = (yvs) obj;
        return this.a == yvsVar.a && this.b.equals(yvsVar.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }
}
