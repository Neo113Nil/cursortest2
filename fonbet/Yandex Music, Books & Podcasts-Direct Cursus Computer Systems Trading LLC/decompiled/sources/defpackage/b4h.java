package defpackage;

/* loaded from: classes4.dex */
public final class b4h implements e4h {
    public final boolean a;

    public b4h(boolean z) {
        this.a = z;
    }

    @Override // defpackage.e4h
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b4h) && this.a == ((b4h) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return vz1.q("Loading(isFullScreen=", ")", this.a);
    }
}
