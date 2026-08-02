package ru.yandex.taxi.banners.model;

import defpackage.tje;
import defpackage.tls;
import defpackage.tse;

/* loaded from: classes5.dex */
public final /* synthetic */ class f implements tls {
    public final /* synthetic */ tse a;
    public final /* synthetic */ g b;
    public final /* synthetic */ String c;

    public /* synthetic */ f(tse tseVar, g gVar, String str) {
        this.a = tseVar;
        this.b = gVar;
        this.c = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return tje.N(this.a, null, null, new GeoBannersInteractor$downloadGeoBanners$2$1$job$1$1(this.b, this.c, null), 3);
    }
}
