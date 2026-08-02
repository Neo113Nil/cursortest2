package com.anythink.basead.mixad.d;

import android.app.Activity;
import com.anythink.basead.ui.activity.ATMixSplashActivity;
import com.anythink.core.basead.b.c;
import com.anythink.core.common.l.f.a.a;

/* loaded from: classes.dex */
public final class a implements com.anythink.core.common.l.f.a.a {
    @Override // com.anythink.core.common.l.f.a.a
    public final void a(Activity activity, c cVar, a.InterfaceC0084a interfaceC0084a) {
        if (activity == null || cVar == null || interfaceC0084a == null) {
            return;
        }
        com.anythink.basead.mixad.a.a().a(cVar.f12706d, interfaceC0084a);
        ATMixSplashActivity.b(activity, cVar);
    }
}
