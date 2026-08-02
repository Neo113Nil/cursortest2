package com.yandex.passport.internal.ui.util;

import defpackage.dzf;
import defpackage.voi;
import defpackage.xjj;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class q extends voi {
    public final AtomicBoolean l = new AtomicBoolean(false);

    @Override // defpackage.voi, defpackage.qdg
    public final void l(Object obj) {
        if (obj != null) {
            this.l.set(true);
            super.l(obj);
        }
    }

    public final void n(dzf dzfVar, final l lVar) {
        if (e()) {
            com.yandex.passport.legacy.a.e(6, "Multiple observers registered but only one will be notified of changes.", null);
        }
        f(dzfVar, new xjj() { // from class: com.yandex.passport.internal.ui.util.p
            @Override // defpackage.xjj
            public final void onChanged(Object obj) {
                if (q.this.l.compareAndSet(true, false)) {
                    obj.getClass();
                    lVar.onChanged(obj);
                }
            }
        });
    }
}
