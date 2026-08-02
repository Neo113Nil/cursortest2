package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class qz implements sz {
    public final List a;

    public qz(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qz) && this.a.equals(((qz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v3w.f("Available(availableDonations=", ")", this.a);
    }
}
