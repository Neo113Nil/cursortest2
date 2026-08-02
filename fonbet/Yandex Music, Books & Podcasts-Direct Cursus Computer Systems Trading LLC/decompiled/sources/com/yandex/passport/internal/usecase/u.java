package com.yandex.passport.internal.usecase;

import defpackage.cg6;
import defpackage.e5b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class u extends com.yandex.passport.common.domain.a {
    public final z b;
    public final com.yandex.passport.internal.report.reporters.f1 c;
    public final com.yandex.passport.internal.database.d d;
    public final com.yandex.passport.common.ui.lang.b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.yandex.passport.common.coroutine.a aVar, z zVar, com.yandex.passport.internal.report.reporters.f1 f1Var, com.yandex.passport.internal.database.d dVar, com.yandex.passport.common.ui.lang.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        zVar.getClass();
        f1Var.getClass();
        dVar.getClass();
        bVar.getClass();
        this.b = zVar;
        this.c = f1Var;
        this.d = dVar;
        this.e = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable u(u uVar, s sVar, cg6 cg6Var) {
        t tVar;
        int i;
        Object obj;
        if (cg6Var instanceof t) {
            tVar = (t) cg6Var;
            int i2 = tVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = tVar.l;
                nm6 nm6Var = nm6.a;
                i = tVar.n;
                if (i != 0) {
                    qgg.h0(obj2);
                    Locale b = ((com.yandex.passport.internal.ui.lang.a) uVar.e).b();
                    int i3 = com.yandex.passport.common.ui.lang.a.a;
                    String language = b.getLanguage();
                    language.getClass();
                    z zVar = uVar.b;
                    x xVar = new x(sVar.c, sVar.a, sVar.b, language, null);
                    tVar.j = uVar;
                    tVar.k = sVar;
                    tVar.n = 1;
                    obj2 = zVar.g(xVar, tVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sVar = tVar.k;
                    uVar = tVar.j;
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    r7o r7oVar = z7o.b;
                    w wVar = (w) obj;
                    com.yandex.passport.common.core.g gVar = wVar.a;
                    uVar.c.w(gVar.d, gVar.Y, gVar.Z, sVar.e, new Long(sVar.b));
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    com.yandex.passport.internal.stash.a aVar = new com.yandex.passport.internal.stash.a(e5bVar);
                    if (gVar.h == 12) {
                        com.yandex.passport.internal.stash.b bVar = com.yandex.passport.internal.stash.b.MAILISH_SOCIAL_CODE;
                        com.yandex.passport.api.x1 x1Var = sVar.d;
                        aVar = aVar.b(bVar, x1Var != null ? x1Var.a : null, true);
                    }
                    com.yandex.passport.common.core.b bVar2 = sVar.a;
                    com.yandex.passport.common.account.a aVar2 = wVar.e;
                    if (aVar2 == null) {
                        aVar2 = sVar.c;
                    }
                    com.yandex.passport.internal.l d = com.yandex.passport.internal.m.d(bVar2, aVar2, gVar, aVar, null);
                    uVar.d.D(d.j, wVar.c);
                    com.yandex.passport.api.o oVar = wVar.b;
                    obj = oVar != null ? com.yandex.passport.internal.l.e(d, null, null, null, aVar.b(com.yandex.passport.internal.stash.b.UPGRADE_STATUS, String.valueOf(oVar.ordinal()), true), 31) : d;
                }
                return new z7o(obj);
            }
        }
        tVar = new t(uVar, cg6Var);
        Object obj22 = tVar.l;
        nm6 nm6Var2 = nm6.a;
        i = tVar.n;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        return new z7o(obj);
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        return u(this, (s) obj, rhwVar);
    }
}
