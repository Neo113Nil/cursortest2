package com.yandex.passport.data.network;

/* loaded from: classes4.dex */
public final class t7 {
    public final com.yandex.passport.data.models.g a;

    public t7(com.yandex.passport.data.models.g gVar) {
        this.a = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7) && this.a.equals(((t7) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.a);
    }

    public final String toString() {
        return "Params(environment=" + this.a + ')';
    }
}
