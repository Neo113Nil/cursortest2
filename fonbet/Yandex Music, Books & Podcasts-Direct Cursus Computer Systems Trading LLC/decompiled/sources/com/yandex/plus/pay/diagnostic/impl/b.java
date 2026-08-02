package com.yandex.plus.pay.diagnostic.impl;

import com.yandex.plus.pay.data.mb.dto.c1;
import defpackage.bck;
import defpackage.btf;
import defpackage.jyr;

/* loaded from: classes5.dex */
public final class b {
    public final jyr a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;

    public b(bck bckVar) {
        this.a = btf.b(new a(bckVar, 0));
        this.b = btf.b(new a(bckVar, this));
        this.c = btf.b(new a(bckVar, 2));
        this.d = btf.b(new a(bckVar, 3));
        btf.b(new c1(19, bckVar));
        this.e = btf.b(new a(bckVar, 4));
    }
}
