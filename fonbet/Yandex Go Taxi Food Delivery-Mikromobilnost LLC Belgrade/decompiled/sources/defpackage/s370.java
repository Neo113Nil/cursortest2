package defpackage;

/* loaded from: classes.dex */
public final class s370 {
    public final String a;

    public s370(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s370) && this.a.equals(((s370) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("OpaqueKey(key="), this.a, ')');
    }
}
