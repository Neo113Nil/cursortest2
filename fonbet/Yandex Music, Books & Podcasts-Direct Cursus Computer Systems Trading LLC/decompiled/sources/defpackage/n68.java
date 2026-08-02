package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class n68 {
    public final List a;

    public n68(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n68) && this.a.equals(((n68) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return v3w.f("DisclaimersData(podcastOrBook=false, disclaimers=", ")", this.a);
    }
}
