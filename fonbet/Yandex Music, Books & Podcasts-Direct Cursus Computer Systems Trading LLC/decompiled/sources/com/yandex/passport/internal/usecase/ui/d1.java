package com.yandex.passport.internal.usecase.ui;

import com.yandex.passport.data.network.ra;
import com.yandex.passport.data.network.wa;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class d1 extends com.yandex.passport.common.domain.a {
    public final wa b;
    public final com.yandex.passport.common.common.a c;
    public final com.yandex.passport.internal.network.mappers.b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(com.yandex.passport.common.coroutine.a aVar, wa waVar, com.yandex.passport.common.common.a aVar2, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        waVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        this.b = waVar;
        this.c = aVar2;
        this.d = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(b1 b1Var, cg6 cg6Var) {
        c1 c1Var;
        int i;
        if (cg6Var instanceof c1) {
            c1Var = (c1) cg6Var;
            int i2 = c1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = c1Var.j;
                nm6 nm6Var = nm6.a;
                i = c1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "execute", 8);
                    }
                    com.yandex.passport.common.core.b bVar = b1Var.a;
                    this.d.getClass();
                    com.yandex.passport.data.models.g a = com.yandex.passport.internal.network.mappers.b.a(bVar);
                    String str = b1Var.b;
                    String str2 = b1Var.c;
                    String str3 = b1Var.d;
                    String str4 = b1Var.e;
                    String a2 = ((com.yandex.passport.internal.common.d) this.c).a();
                    com.yandex.passport.internal.entities.g gVar = com.yandex.passport.internal.entities.g.BY_SMS;
                    ra raVar = new ra(a, str, str2, str3, str4, a2, b1Var.f);
                    c1Var.l = 1;
                    obj = this.b.g(raVar, c1Var);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new z7o(((z7o) obj).a);
            }
        }
        c1Var = new c1(this, cg6Var);
        Object obj2 = c1Var.j;
        nm6 nm6Var2 = nm6.a;
        i = c1Var.l;
        if (i != 0) {
        }
        return new z7o(((z7o) obj2).a);
    }
}
