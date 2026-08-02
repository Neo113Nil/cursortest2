package com.yandex.plus.bdui.plus.scenario;

import defpackage.xqn;

/* loaded from: classes4.dex */
public final class j implements com.yandex.plus.bdui.b {
    public com.yandex.plus.bdui.document.e a;
    public final /* synthetic */ com.yandex.passport.internal.social.d b;
    public final /* synthetic */ xqn c;
    public final /* synthetic */ m d;
    public final /* synthetic */ boolean e;

    public j(com.yandex.passport.internal.social.d dVar, xqn xqnVar, m mVar, boolean z) {
        this.b = dVar;
        this.c = xqnVar;
        this.d = mVar;
        this.e = z;
    }

    @Override // com.yandex.plus.bdui.b
    public final void d(com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.query.e eVar, com.yandex.plus.bdui.document.e eVar2) {
        this.a = eVar2;
    }

    @Override // com.yandex.plus.bdui.b
    public final void o(com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.query.e eVar, Throwable th) {
        com.yandex.passport.internal.social.d dVar = this.b;
        int i = dVar.b;
        boolean z = this.e;
        boolean z2 = i == 0 ? z : false;
        xqn xqnVar = this.c;
        if (!z2) {
            xqnVar.a = new com.yandex.plus.bdui.plus.checkout.h(this.d, mVar);
        } else {
            m.c(z, dVar, mVar, null);
            xqnVar.a = null;
        }
    }

    @Override // com.yandex.plus.bdui.b
    public final void p() {
        com.yandex.passport.internal.social.d dVar = this.b;
        dVar.c = null;
        dVar.d = null;
        dVar.b = 0;
    }

    @Override // com.yandex.plus.bdui.b
    public final void r(com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.query.e eVar) {
        this.a = null;
        this.c.a = null;
    }

    @Override // com.yandex.plus.bdui.b
    public final void x(com.yandex.plus.bdui.m mVar, com.yandex.plus.bdui.document.e eVar) {
        com.yandex.plus.bdui.shared.b bVar;
        com.yandex.plus.bdui.action.a a;
        com.yandex.plus.bdui.document.e eVar2 = this.a;
        if (eVar2 != null && eVar2.equals(eVar)) {
            this.a = null;
            this.b.b++;
        }
        if (eVar == null || (bVar = eVar.c) == null) {
            bVar = com.yandex.plus.bdui.shared.b.a;
        }
        com.yandex.plus.bdui.action.h hVar = new com.yandex.plus.bdui.action.h(bVar);
        com.yandex.plus.bdui.content.a aVar = eVar != null ? eVar.a : null;
        com.yandex.plus.bdui.action.j jVar = aVar instanceof com.yandex.plus.bdui.action.j ? (com.yandex.plus.bdui.action.j) aVar : null;
        if (jVar == null || (a = jVar.b()) == null) {
            com.yandex.plus.bdui.content.a aVar2 = eVar != null ? eVar.a : null;
            com.yandex.plus.bdui.action.k kVar = aVar2 instanceof com.yandex.plus.bdui.action.k ? (com.yandex.plus.bdui.action.k) aVar2 : null;
            if (kVar == null || (a = kVar.a()) == null) {
                a = aVar2 instanceof com.yandex.plus.bdui.plus.content.j ? com.yandex.plus.bdui.plus.checkout.action.a.a(bVar) : null;
            }
        }
        this.c.a = a != null ? new com.yandex.plus.bdui.flex.factory.p(7, mVar, a, hVar) : null;
    }
}
