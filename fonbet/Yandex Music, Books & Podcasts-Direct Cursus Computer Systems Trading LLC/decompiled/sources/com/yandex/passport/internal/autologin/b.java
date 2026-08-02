package com.yandex.passport.internal.autologin;

/* loaded from: classes4.dex */
public final class b extends c {
    public final com.yandex.passport.internal.entities.n b;

    public b(com.yandex.passport.internal.entities.n nVar) {
        super(nVar.a);
        this.b = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.b.equals(((b) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "MasterMember(memberAccount=" + this.b + ')';
    }
}
