package com.yandex.passport.internal.ui.bouncer.sloth;

import com.yandex.passport.internal.ui.bouncer.model.y1;
import com.yandex.passport.internal.ui.bouncer.s;
import com.yandex.passport.sloth.ui.dependencies.q;
import com.yandex.passport.sloth.ui.e1;
import defpackage.b6e;

/* loaded from: classes4.dex */
public final class h implements q {
    public final s a;

    public h(s sVar) {
        sVar.getClass();
        this.a = sVar;
    }

    @Override // com.yandex.passport.sloth.ui.dependencies.q
    public final void a(e1 e1Var) {
        int ordinal = e1Var.ordinal();
        s sVar = this.a;
        if (ordinal == 0) {
            sVar.a(y1.a);
        } else if (ordinal == 1) {
            sVar.a(y1.b);
        } else {
            if (ordinal == 2) {
                return;
            }
            b6e.s();
        }
    }
}
