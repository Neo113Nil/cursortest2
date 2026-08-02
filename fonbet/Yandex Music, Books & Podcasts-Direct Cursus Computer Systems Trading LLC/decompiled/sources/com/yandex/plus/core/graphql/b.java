package com.yandex.plus.core.graphql;

import defpackage.jtj;

/* loaded from: classes4.dex */
public final class b implements jtj {
    public final a a;

    public b(a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a.equals(((b) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Data(changeVoluntaryAgreementStatus=" + this.a + ')';
    }
}
