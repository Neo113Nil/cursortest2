package defpackage;

/* loaded from: classes.dex */
public abstract class hiu {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public hiu(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final int a(pfg pfgVar) {
        pfgVar.getClass();
        int ordinal = pfgVar.ordinal();
        if (ordinal == 0) {
            xq0.x("Cannot get presentedItems for loadType: REFRESH");
            return 0;
        }
        if (ordinal == 1) {
            return this.a;
        }
        if (ordinal == 2) {
            return this.b;
        }
        b6e.s();
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hiu)) {
            return false;
        }
        hiu hiuVar = (hiu) obj;
        return this.a == hiuVar.a && this.b == hiuVar.b && this.c == hiuVar.c && this.d == hiuVar.d;
    }

    public int hashCode() {
        return Integer.hashCode(this.d) + Integer.hashCode(this.c) + Integer.hashCode(this.b) + Integer.hashCode(this.a);
    }
}
