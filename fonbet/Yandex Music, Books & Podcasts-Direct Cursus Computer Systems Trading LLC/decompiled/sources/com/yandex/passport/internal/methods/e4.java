package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class e4 extends v5 {
    public final c6 c;
    public final l d;
    public final List e;
    public final m f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(Bundle bundle) {
        super(w5.v0);
        bundle.getClass();
        i iVar = i.i;
        com.yandex.passport.api.z1 z1Var = (com.yandex.passport.api.z1) iVar.e(bundle);
        i iVar2 = i.f;
        com.yandex.passport.api.z1 z1Var2 = (com.yandex.passport.api.z1) iVar2.e(bundle);
        c6 c6Var = new c6(iVar, z1Var);
        l lVar = new l(iVar2, z1Var2);
        this.c = c6Var;
        this.d = lVar;
        this.e = u75.h(c6Var, lVar);
        this.f = m.h;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final List a() {
        return this.e;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final f b() {
        return this.f;
    }
}
