package defpackage;

/* loaded from: classes3.dex */
public final class zmp {
    public final String a;

    public zmp(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zmp) && this.a.equals(((zmp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return dfi.i(new StringBuilder("SessionDetails(sessionId="), this.a, ')');
    }
}
