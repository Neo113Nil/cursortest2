package com.yandex.plus.divkit.impl;

import defpackage.a39;
import defpackage.ffg;
import defpackage.mm6;
import defpackage.n7w;
import defpackage.tf6;
import defpackage.x97;

/* loaded from: classes4.dex */
public final class i implements a39 {
    public final com.yandex.plus.core.imageloader.b a;
    public final mm6 b;
    public final kotlinx.coroutines.a c;

    public i(com.yandex.plus.core.imageloader.b bVar, tf6 tf6Var, kotlinx.coroutines.a aVar) {
        bVar.getClass();
        tf6Var.getClass();
        aVar.getClass();
        this.a = bVar;
        this.b = tf6Var;
        this.c = aVar;
    }

    @Override // defpackage.a39
    public final ffg a(String str, n7w n7wVar) {
        str.getClass();
        n7wVar.V();
        return new f(x97.y(this.b, this.c, null, new h(this, str, n7wVar, null, 1), 2), 0);
    }

    @Override // defpackage.a39
    public final ffg b(String str, n7w n7wVar) {
        str.getClass();
        n7wVar.V();
        return new f(x97.y(this.b, null, null, new h(this, str, n7wVar, null, 0), 3), 1);
    }
}
