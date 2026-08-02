package com.yandex.plus.core.network.error;

/* loaded from: classes4.dex */
public final class c implements k {
    public final com.yandex.plus.core.network.response.b a;

    public c(com.yandex.plus.core.network.response.b bVar) {
        this.a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.a.equals(((c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Authorization error; code = ");
        com.yandex.plus.core.network.response.b bVar = this.a;
        sb.append(bVar.c);
        sb.append(", message = ");
        sb.append(bVar.d);
        return sb.toString();
    }
}
