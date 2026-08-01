package com.anythink.core.common.n.b.a.c;

import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.af;
import com.anythink.core.common.n.b.w;
import com.anythink.core.common.n.c.n;
import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.net.ProtocolException;

/* loaded from: classes.dex */
public final class b implements w {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15048a;

    public b(boolean z3) {
        this.f15048a = z3;
    }

    @Override // com.anythink.core.common.n.b.w
    public final af a(w.a aVar) {
        g gVar = (g) aVar;
        com.anythink.core.common.n.b.a.b.c h9 = gVar.h();
        ad a9 = gVar.a();
        long currentTimeMillis = System.currentTimeMillis();
        h9.a(a9);
        af.a aVar2 = null;
        if (!f.c(a9.b()) || a9.d() == null) {
            h9.j();
        } else {
            if ("100-continue".equalsIgnoreCase(a9.a("Expect"))) {
                h9.c();
                aVar2 = h9.a(true);
            }
            if (aVar2 == null) {
                a9.d();
                com.anythink.core.common.n.c.d a10 = n.a(h9.b(a9));
                a9.d().a(a10);
                a10.close();
            } else {
                h9.j();
                if (!h9.a().g()) {
                    h9.h();
                }
            }
        }
        if (a9.d() != null) {
            a9.d();
        }
        h9.d();
        if (aVar2 == null) {
            aVar2 = h9.a(false);
        }
        af a11 = aVar2.a(a9).a(h9.a().c()).a(currentTimeMillis).b(System.currentTimeMillis()).a();
        int c9 = a11.c();
        if (c9 == 100) {
            a11 = h9.a(false).a(a9).a(h9.a().c()).a(currentTimeMillis).b(System.currentTimeMillis()).a();
            c9 = a11.c();
        }
        af a12 = (this.f15048a && c9 == 101) ? a11.h().a(com.anythink.core.common.n.b.a.c.f15039d).a() : a11.h().a(h9.a(a11)).a();
        if (com.anythink.expressad.foundation.d.d.cs.equalsIgnoreCase(a12.a().a("Connection")) || com.anythink.expressad.foundation.d.d.cs.equalsIgnoreCase(a12.a("Connection"))) {
            h9.h();
        }
        if ((c9 != 204 && c9 != 205) || a12.g().b() <= 0) {
            return a12;
        }
        StringBuilder i = AbstractC4404f.i(c9, "HTTP ", " had non-zero Content-Length: ");
        i.append(a12.g().b());
        throw new ProtocolException(i.toString());
    }
}
