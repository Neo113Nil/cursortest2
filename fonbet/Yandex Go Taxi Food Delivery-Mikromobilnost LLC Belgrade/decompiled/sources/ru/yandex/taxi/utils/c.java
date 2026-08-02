package ru.yandex.taxi.utils;

import defpackage.hbp0;
import defpackage.hit;
import defpackage.m25;
import defpackage.obv;
import defpackage.pav;
import defpackage.qbv;
import defpackage.tje;

/* loaded from: classes10.dex */
public final class c implements m25 {
    public final pav a;
    public final hbp0 b;

    public c(hit hitVar, pav pavVar) {
        this.a = pavVar;
        this.b = hitVar.a;
    }

    public final void a(String str) {
        com.yandex.go.image.domain.requests.g gVar = (com.yandex.go.image.domain.requests.g) this.a.e();
        gVar.b(new obv(str, null, 6, 0));
        tje.N(this.b, null, null, new GetImageHelper$executePreloadRequest$1(gVar, null), 3);
    }

    public final void b(String str) {
        com.yandex.go.image.domain.requests.g gVar = (com.yandex.go.image.domain.requests.g) this.a.e();
        gVar.b(new qbv(str));
        tje.N(this.b, null, null, new GetImageHelper$executePreloadRequest$1(gVar, null), 3);
    }
}
