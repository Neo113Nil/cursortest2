package com.yandex.passport.internal.ui.bouncer.model.middleware;

import defpackage.cg6;
import defpackage.eno;
import defpackage.j0v;
import defpackage.nm6;
import defpackage.pd;
import defpackage.qgg;
import defpackage.x0q;
import defpackage.xdr;
import defpackage.xq0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class s implements com.yandex.passport.common.mvi.a {
    public final com.yandex.passport.internal.usecase.ui.b0 a;

    public s(com.yandex.passport.internal.usecase.ui.b0 b0Var) {
        b0Var.getClass();
        this.a = b0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(s sVar, com.yandex.passport.internal.ui.bouncer.model.k kVar, com.yandex.passport.internal.ui.bouncer.model.l1 l1Var, cg6 cg6Var) {
        r rVar;
        int i;
        com.yandex.passport.internal.ui.bouncer.model.l1 l1Var2;
        com.yandex.passport.internal.l lVar;
        com.yandex.passport.common.core.f fVar;
        if (cg6Var instanceof r) {
            rVar = (r) cg6Var;
            int i2 = rVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rVar.m = i2 - Integer.MIN_VALUE;
                Object obj = rVar.k;
                nm6 nm6Var = nm6.a;
                i = rVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    List list = kVar.a;
                    if (list.isEmpty()) {
                        return new com.yandex.passport.internal.ui.bouncer.model.o("CreateProfileActor", "Can't find phone number for the new profile.", null);
                    }
                    com.yandex.passport.internal.properties.l lVar2 = l1Var.c;
                    boolean z = false;
                    if (lVar2 != null && lVar2.C) {
                        z = true;
                    }
                    if (list.size() > 1 || z) {
                        return new com.yandex.passport.internal.ui.bouncer.model.b0(list);
                    }
                    com.yandex.passport.common.core.f fVar2 = ((com.yandex.passport.internal.ui.bouncer.model.y0) CollectionsKt.Q(list)).a;
                    com.yandex.passport.internal.usecase.ui.b0 b0Var = sVar.a;
                    com.yandex.passport.internal.usecase.ui.a0 a0Var = new com.yandex.passport.internal.usecase.ui.a0(fVar2);
                    rVar.j = l1Var;
                    rVar.m = 1;
                    obj = b0Var.g(a0Var, rVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    l1Var2 = l1Var;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l1Var2 = rVar.j;
                    qgg.h0(obj);
                }
                lVar = (com.yandex.passport.internal.l) obj;
                if (lVar != null || (fVar = lVar.b) == null) {
                    return new com.yandex.passport.internal.ui.bouncer.model.o("CreateProfileActor", "No related accounts to create a profile.", null);
                }
                com.yandex.passport.internal.properties.l lVar3 = l1Var2.c;
                return lVar3 != null ? new com.yandex.passport.internal.ui.bouncer.model.c0(com.yandex.passport.internal.properties.l.a(lVar3, null, null, null, 1073741567), null, null, null, false, false, fVar, null, 190) : new com.yandex.passport.internal.ui.bouncer.model.o("CreateProfileActor", "No login properties", null);
            }
        }
        rVar = new r(sVar, cg6Var);
        Object obj2 = rVar.k;
        nm6 nm6Var2 = nm6.a;
        i = rVar.m;
        if (i != 0) {
        }
        lVar = (com.yandex.passport.internal.l) obj2;
        if (lVar != null) {
        }
        return new com.yandex.passport.internal.ui.bouncer.model.o("CreateProfileActor", "No related accounts to create a profile.", null);
    }

    @Override // com.yandex.passport.common.mvi.a
    public final eno a(x0q x0qVar, xdr xdrVar) {
        x0qVar.getClass();
        xdrVar.getClass();
        return pd.e0(new com.yandex.passport.internal.t(x0qVar, 5), xdrVar, new j0v(this, (Continuation) null, 12));
    }
}
