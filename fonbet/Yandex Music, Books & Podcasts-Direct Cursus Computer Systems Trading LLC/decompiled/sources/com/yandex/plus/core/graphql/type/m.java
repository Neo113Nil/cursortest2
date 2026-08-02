package com.yandex.plus.core.graphql.type;

import defpackage.q7g;

/* loaded from: classes4.dex */
public final class m {
    public final q7g a;
    public final q7g b;

    public m(q7g q7gVar, q7g q7gVar2) {
        this.a = q7gVar;
        this.b = q7gVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a.equals(mVar.a) && this.b.equals(mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CheckoutAdditionalOffersInput(offers=" + this.a + ", passedUpsaleSteps=" + this.b + ')';
    }
}
