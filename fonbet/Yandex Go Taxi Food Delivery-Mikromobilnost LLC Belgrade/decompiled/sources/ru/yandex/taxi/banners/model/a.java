package ru.yandex.taxi.banners.model;

import defpackage.tje;
import defpackage.tls;
import kotlinx.coroutines.CoroutineStart;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ b a;
    public final /* synthetic */ String b;

    public /* synthetic */ a(b bVar, String str) {
        this.a = bVar;
        this.b = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        b bVar = this.a;
        return tje.h(bVar.e, null, CoroutineStart.LAZY, new BannerMediaLoader$cacheFileOrNull$2$1$1(bVar, this.b, null), 1);
    }
}
