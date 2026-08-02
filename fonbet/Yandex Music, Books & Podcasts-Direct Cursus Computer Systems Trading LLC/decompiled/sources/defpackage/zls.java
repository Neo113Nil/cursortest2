package defpackage;

/* loaded from: classes3.dex */
public final class zls implements ams {
    public final String a;

    public /* synthetic */ zls(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zls) {
            return this.a.equals(((zls) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ouj.k(')', "Str(value=", this.a);
    }
}
