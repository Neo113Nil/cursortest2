package com.anythink.basead.mixad.b;

import com.anythink.core.api.IATBaseAdAdapter;

/* loaded from: classes.dex */
public final class b {
    private static com.anythink.core.common.l.c.a.a a(IATBaseAdAdapter iATBaseAdAdapter) {
        return a(iATBaseAdAdapter, null);
    }

    private static com.anythink.core.common.l.c.a.a b(IATBaseAdAdapter iATBaseAdAdapter, com.anythink.core.common.l.d.a aVar) {
        if (iATBaseAdAdapter == null) {
            return null;
        }
        com.anythink.core.common.l.d.b serverExtraInfo = iATBaseAdAdapter.getServerExtraInfo();
        if (serverExtraInfo != null) {
            if (aVar != null) {
                aVar.a(serverExtraInfo);
            }
            r0 = serverExtraInfo.j() ? new e() : null;
            if (r0 != null) {
                r0.a(new com.anythink.basead.mixad.c.b(aVar));
            }
        }
        return r0;
    }

    public static com.anythink.core.common.l.c.a.a a(IATBaseAdAdapter iATBaseAdAdapter, com.anythink.core.common.l.d.a aVar) {
        com.anythink.core.common.l.c.a.a aVar2 = null;
        if (iATBaseAdAdapter == null) {
            return null;
        }
        com.anythink.core.common.l.d.b serverExtraInfo = iATBaseAdAdapter.getServerExtraInfo();
        if (serverExtraInfo != null && serverExtraInfo.k()) {
            if (aVar != null) {
                aVar.a(serverExtraInfo);
            }
            if (serverExtraInfo.f()) {
                aVar2 = new c();
            } else if (serverExtraInfo.g()) {
                aVar2 = new g();
            } else if (serverExtraInfo.h()) {
                aVar2 = new d();
            } else if (serverExtraInfo.i()) {
                aVar2 = new f();
            } else if (serverExtraInfo.j()) {
                aVar2 = new e();
            }
            if (aVar2 != null) {
                if (serverExtraInfo.l()) {
                    aVar2.a(new com.anythink.basead.mixad.c.b(aVar));
                    return aVar2;
                }
                if (serverExtraInfo.m()) {
                    if (aVar2 instanceof com.anythink.core.common.l.c.a.e) {
                        ((com.anythink.core.common.l.c.a.e) aVar2).a(new com.anythink.basead.mixad.d.a());
                        return aVar2;
                    }
                    if (aVar2 instanceof com.anythink.core.common.l.c.a.c) {
                        ((com.anythink.core.common.l.c.a.c) aVar2).a(new com.anythink.basead.mixad.d.a());
                        return aVar2;
                    }
                } else if (serverExtraInfo.n() && (aVar2 instanceof com.anythink.core.common.l.c.a.f)) {
                    ((com.anythink.core.common.l.c.a.f) aVar2).a(new com.anythink.basead.mixad.a.a(aVar));
                }
            }
        }
        return aVar2;
    }
}
