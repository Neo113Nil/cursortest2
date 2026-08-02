package defpackage;

/* loaded from: classes10.dex */
public final class wxc0 {
    public final hfr a;

    public wxc0(hfr hfrVar) {
        this.a = hfrVar;
    }

    public final boolean a(int... iArr) {
        for (int i : iArr) {
            if (this.a.a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wxc0) {
            return this.a.equals(((wxc0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
