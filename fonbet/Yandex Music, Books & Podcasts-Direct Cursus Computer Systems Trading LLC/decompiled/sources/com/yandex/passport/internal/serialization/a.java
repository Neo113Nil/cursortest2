package com.yandex.passport.internal.serialization;

import com.yandex.passport.common.core.f;
import com.yandex.passport.common.network.r;
import defpackage.avf;
import defpackage.eg7;
import defpackage.k5r;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.ohp;
import defpackage.t9f;
import defpackage.tq5;
import defpackage.wq5;
import defpackage.zhp;

/* loaded from: classes4.dex */
public final class a implements t9f {
    public static final a a = new a();
    public static final ohp b = avf.v("uid", new mhp[0], new r(27));

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        eg7Var.getClass();
        ohp ohpVar = b;
        tq5 c = eg7Var.c(ohpVar);
        com.yandex.passport.common.core.b bVar = null;
        Long l = null;
        while (true) {
            int w = c.w(ohpVar);
            if (w == -1) {
                if (bVar == null || l == null) {
                    throw new zhp("Not found serialize Uid(" + bVar + ',' + l + ')');
                }
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Success deserialize Uid(" + bVar + ',' + l + ')', 8);
                }
                f fVar = new f(bVar, l.longValue());
                c.b(ohpVar);
                return fVar;
            }
            if (w == 0) {
                com.yandex.passport.common.core.a aVar = com.yandex.passport.common.core.b.b;
                int k = c.k(ohpVar, 0);
                aVar.getClass();
                bVar = com.yandex.passport.common.core.a.b(k);
            } else {
                if (w != 1) {
                    throw new zhp(k5r.i(w, "Unknown index "));
                }
                l = Long.valueOf(c.q(ohpVar, 1));
            }
        }
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return b;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        f fVar = (f) obj;
        l6bVar.getClass();
        fVar.getClass();
        ohp ohpVar = b;
        wq5 c = l6bVar.c(ohpVar);
        c.k(ohpVar, 0, com.yandex.passport.internal.util.serialization.a.a, fVar.a);
        c.g(ohpVar, 1, fVar.b);
        c.b(ohpVar);
    }
}
