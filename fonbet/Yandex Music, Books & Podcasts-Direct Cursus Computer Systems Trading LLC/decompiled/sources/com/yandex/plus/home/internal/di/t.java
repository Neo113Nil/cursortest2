package com.yandex.plus.home.internal.di;

/* loaded from: classes5.dex */
public final class t {
    public final com.yandex.plus.paymentsdk.internal.method.e a;
    public final com.yandex.passport.internal.entities.j b;
    public final com.yandex.plus.core.graphql.daily.progress.s c;
    public final com.yandex.passport.internal.core.accounts.h d;

    public t(com.yandex.plus.paymentsdk.internal.method.e eVar, com.yandex.passport.internal.entities.j jVar, com.yandex.plus.core.graphql.daily.progress.s sVar, com.yandex.passport.internal.core.accounts.h hVar) {
        this.a = eVar;
        this.b = jVar;
        this.c = sVar;
        this.d = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.a.equals(tVar.a) && this.b.equals(tVar.b) && this.c.equals(tVar.c) && this.d.equals(tVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 29791)) * 31);
    }

    public final String toString() {
        return "SdkComponentDependenciesModule(paymentMethodsFacade=" + this.a + ", activityLifecycle=" + this.b + ", homeLoadingAnimationController=null, panelLoadingAnimationController=null, selectedCardIdProvider=" + this.c + ", messagesAdapter=" + this.d + ')';
    }
}
