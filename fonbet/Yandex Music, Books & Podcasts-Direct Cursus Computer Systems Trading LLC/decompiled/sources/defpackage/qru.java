package defpackage;

/* loaded from: classes4.dex */
public final class qru implements tru {
    public final boolean a;

    public qru(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qru) && this.a == ((qru) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    @Override // defpackage.tru
    public final boolean k() {
        return this.a;
    }

    public final String toString() {
        return vz1.q("Error(isRefreshing=", ")", this.a);
    }
}
