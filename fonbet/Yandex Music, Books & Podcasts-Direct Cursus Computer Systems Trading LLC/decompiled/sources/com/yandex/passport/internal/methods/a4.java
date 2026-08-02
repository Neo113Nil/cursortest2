package com.yandex.passport.internal.methods;

import android.os.Bundle;
import defpackage.u75;
import java.util.List;

/* loaded from: classes4.dex */
public final class a4 extends v5 {
    public final b c;
    public final b d;
    public final w e;
    public final List f;
    public final p g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(Bundle bundle) {
        super(w5.x0);
        bundle.getClass();
        i iVar = i.j;
        com.yandex.passport.api.impl.b bVar = (com.yandex.passport.api.impl.b) iVar.e(bundle);
        m mVar = m.d;
        mVar.getClass();
        String string = bundle.getString(mVar.b, null);
        a aVar = a.h;
        Boolean a = aVar.a(bundle);
        b bVar2 = new b(iVar, bVar);
        b bVar3 = new b(mVar, string);
        w wVar = new w(aVar, a);
        this.c = bVar2;
        this.d = bVar3;
        this.e = wVar;
        this.f = u75.h(bVar2, bVar3, wVar);
        this.g = p.d;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final List a() {
        return this.f;
    }

    @Override // com.yandex.passport.internal.methods.v5
    public final f b() {
        return this.g;
    }
}
