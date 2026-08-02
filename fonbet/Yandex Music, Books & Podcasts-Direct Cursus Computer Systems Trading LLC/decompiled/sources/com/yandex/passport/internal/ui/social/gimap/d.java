package com.yandex.passport.internal.ui.social.gimap;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class d implements com.yandex.passport.internal.ui.base.k {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // com.yandex.passport.internal.ui.base.k
    public final void a() {
        e eVar = this.a;
        q F = eVar.F();
        synchronized (F) {
            F.u = eVar.G(F.u);
        }
        eVar.A(false);
        ((ArrayList) ((com.yandex.passport.internal.ui.base.a) eVar.requireActivity()).d.c).remove(this);
    }
}
