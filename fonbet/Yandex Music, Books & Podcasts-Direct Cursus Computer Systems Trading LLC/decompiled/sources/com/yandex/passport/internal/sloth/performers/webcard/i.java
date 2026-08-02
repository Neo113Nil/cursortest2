package com.yandex.passport.internal.sloth.performers.webcard;

import com.yandex.passport.common.network.n;
import com.yandex.passport.internal.sloth.performers.j;
import com.yandex.passport.internal.sloth.performers.l;
import com.yandex.passport.internal.sloth.performers.q;
import com.yandex.passport.sloth.command.t;

/* loaded from: classes4.dex */
public final class i implements com.yandex.passport.sloth.dependencies.f {
    public final n a;
    public final n b;
    public final com.yandex.passport.internal.sloth.performers.e c;
    public final l d;
    public final com.yandex.passport.internal.sloth.performers.b e;
    public final j f;
    public final q g;

    public i(n nVar, n nVar2, com.yandex.passport.internal.sloth.performers.e eVar, l lVar, com.yandex.passport.internal.sloth.performers.b bVar, j jVar, q qVar) {
        nVar.getClass();
        nVar2.getClass();
        eVar.getClass();
        lVar.getClass();
        bVar.getClass();
        jVar.getClass();
        qVar.getClass();
        this.a = nVar;
        this.b = nVar2;
        this.c = eVar;
        this.d = lVar;
        this.e = bVar;
        this.f = jVar;
        this.g = qVar;
    }

    @Override // com.yandex.passport.sloth.dependencies.f
    public final t a(com.yandex.passport.common.web.a aVar) {
        int ordinal = aVar.ordinal();
        t tVar = ordinal != 4 ? ordinal != 19 ? ordinal != 29 ? ordinal != 9 ? ordinal != 10 ? ordinal != 15 ? ordinal != 16 ? null : this.b : this.e : this.d : this.c : this.g : this.a : this.f;
        if (tVar != null) {
            return tVar;
        }
        return null;
    }
}
