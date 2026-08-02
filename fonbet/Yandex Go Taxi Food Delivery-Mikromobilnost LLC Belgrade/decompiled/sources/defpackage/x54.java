package defpackage;

import defpackage.c3f;

/* loaded from: classes.dex */
public final class x54 extends c3f.e.f {
    public final String a;

    public x54(String str) {
        this.a = str;
    }

    @Override // c3f.e.f
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c3f.e.f) {
            return this.a.equals(((c3f.e.f) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return oyr.t(new StringBuilder("User{identifier="), this.a, "}");
    }
}
