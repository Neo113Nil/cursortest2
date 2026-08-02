package defpackage;

import yads.t31;
import yads.wk2;

/* loaded from: classes7.dex */
public final class wx71 implements kq71 {
    public static final wx71 w = new wx71(new tu71[0]);
    public final int a;
    public final wk2 b;
    public int c;

    public wx71(tu71... tu71VarArr) {
        this.b = t31.q(tu71VarArr);
        this.a = tu71VarArr.length;
        int i = 0;
        while (i < this.b.w) {
            int i2 = i + 1;
            int i3 = i2;
            while (true) {
                wk2 wk2Var = this.b;
                if (i3 < wk2Var.w) {
                    if (((tu71) wk2Var.get(i)).equals(this.b.get(i3))) {
                        nba1.c("TrackGroupArray", nba1.b("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray.")));
                    }
                    i3++;
                }
            }
            i = i2;
        }
    }

    public final tu71 a(int i) {
        return (tu71) this.b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wx71.class == obj.getClass()) {
            wx71 wx71Var = (wx71) obj;
            if (this.a == wx71Var.a && this.b.equals(wx71Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}
