package com.yandex.plus.home;

/* loaded from: classes5.dex */
public final class g {
    public final com.yandex.passport.internal.entities.j a;
    public final com.yandex.plus.paymentsdk.internal.method.e b;

    public g(com.yandex.passport.internal.entities.j jVar, com.yandex.plus.paymentsdk.internal.method.e eVar) {
        this.a = jVar;
        this.b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.a) && this.b.equals(gVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RequiredDependencies(activityLifecycle=" + this.a + ", paymentMethodsFacade=" + this.b + ')';
    }
}
