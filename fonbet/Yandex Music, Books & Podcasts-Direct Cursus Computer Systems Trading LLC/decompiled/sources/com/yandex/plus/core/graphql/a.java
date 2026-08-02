package com.yandex.plus.core.graphql;

/* loaded from: classes4.dex */
public final class a {
    public final com.yandex.plus.core.graphql.type.d a;

    public a(com.yandex.plus.core.graphql.type.d dVar) {
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.a == ((a) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChangeVoluntaryAgreementStatus(status=" + this.a + ')';
    }
}
