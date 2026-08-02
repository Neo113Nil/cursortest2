package com.yandex.passport.data.network;

/* loaded from: classes4.dex */
public final class u5 {
    public final com.yandex.passport.data.models.g a;

    public u5(com.yandex.passport.data.models.g gVar) {
        this.a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u5) && this.a.equals(((u5) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.a);
    }

    public final String toString() {
        return "Params(environment=" + this.a + ')';
    }
}
