package com.anythink.basead.mixad.b;

import android.app.Activity;
import com.anythink.core.common.l.f.a.a;

/* loaded from: classes.dex */
public final class f extends a implements com.anythink.core.common.l.c.a.e {

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.core.common.l.f.a.a f9662b;

    @Override // com.anythink.core.common.l.c.a.e
    public final void a(Activity activity, com.anythink.core.basead.b.c cVar, a.InterfaceC0083a interfaceC0083a) {
        com.anythink.core.common.l.f.a.a aVar = this.f9662b;
        if (aVar != null) {
            aVar.a(activity, cVar, interfaceC0083a);
        }
    }

    @Override // com.anythink.core.common.l.c.a.e
    public final void a(com.anythink.core.common.l.f.a.a aVar) {
        this.f9662b = aVar;
    }
}
