package com.anythink.core.b;

import com.anythink.core.common.h.ar;
import com.anythink.core.common.m.q;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g extends e {
    public g(com.anythink.core.common.h.a aVar) {
        super(aVar);
    }

    @Override // com.anythink.core.b.e
    public final void a(List<JSONObject> list, q qVar) {
        ar arVar;
        com.anythink.core.b.a.b bVar = new com.anythink.core.b.a.b();
        bVar.f11830f = this.f11893f.f13495n.a().aL();
        com.anythink.core.common.h.a aVar = this.f11893f;
        bVar.f11843t = (aVar == null || (arVar = aVar.f13485c) == null) ? null : arVar.b();
        com.anythink.core.b.a.a aVar2 = new com.anythink.core.b.a.a(this.f11980q, this.f11979p, this.f11978o, list, 1, this.f11893f.f13495n.a());
        aVar2.a(bVar);
        aVar2.a(0, qVar);
    }

    @Override // com.anythink.core.b.e
    public final String b() {
        return this.f11893f.f13497p;
    }
}
