package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class v3 extends v5 {
    public final l c;
    public final c6 d;
    public final b e;
    public final n f;
    public final List g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(Bundle bundle) {
        super(w5.q);
        bundle.getClass();
        i iVar = i.f;
        com.yandex.passport.api.z1 z1Var = (com.yandex.passport.api.z1) iVar.e(bundle);
        i iVar2 = i.i;
        com.yandex.passport.api.z1 z1Var2 = (com.yandex.passport.api.z1) iVar2.e(bundle);
        o oVar = o.d;
        com.yandex.passport.internal.credentials.e eVar = (com.yandex.passport.internal.credentials.e) oVar.e(bundle);
        l lVar = new l(iVar, z1Var);
        c6 c6Var = new c6(iVar2, z1Var2);
        b bVar = new b(oVar, eVar);
        this.c = lVar;
        this.d = c6Var;
        this.e = bVar;
        this.f = n.d;
        this.g = u75.h(lVar, c6Var, bVar);
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final List a() {
        return this.g;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final f b() {
        return this.f;
    }
}
