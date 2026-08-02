package com.anythink.basead.mixad.b;

import android.app.Activity;
import com.anythink.core.common.l.e.a.a;
import com.anythink.core.common.l.f.a.a;

/* loaded from: classes.dex */
public final class d extends a implements com.anythink.core.common.l.c.a.c {

    /* renamed from: b, reason: collision with root package name */
    private com.anythink.core.common.l.f.a.a f10288b;

    @Override // com.anythink.core.common.l.c.a.c
    public final void a(Activity activity, com.anythink.core.basead.b.c cVar, a.InterfaceC0083a interfaceC0083a) {
        com.anythink.core.common.l.e.a.a aVar = this.f10287a;
        if (aVar != null) {
            aVar.a(activity, cVar, interfaceC0083a);
        }
    }

    @Override // com.anythink.core.common.l.c.a.c
    public final void a(Activity activity, com.anythink.core.basead.b.c cVar, a.InterfaceC0084a interfaceC0084a) {
        com.anythink.core.common.l.f.a.a aVar = this.f10288b;
        if (aVar != null) {
            aVar.a(activity, cVar, interfaceC0084a);
        }
    }

    @Override // com.anythink.core.common.l.c.a.c
    public final void a(com.anythink.core.common.l.f.a.a aVar) {
        this.f10288b = aVar;
    }
}
