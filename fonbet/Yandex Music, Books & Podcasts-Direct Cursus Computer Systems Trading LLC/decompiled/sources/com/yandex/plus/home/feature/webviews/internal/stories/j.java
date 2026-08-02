package com.yandex.plus.home.feature.webviews.internal.stories;

/* loaded from: classes5.dex */
public final class j implements com.yandex.plus.home.feature.webviews.internalapi.analytics.a {
    public final /* synthetic */ k a;
    public final /* synthetic */ com.yandex.plus.home.feature.webviews.internalapi.analytics.a b;

    public j(k kVar, com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar) {
        this.a = kVar;
        this.b = aVar;
    }

    @Override // com.yandex.plus.home.feature.webviews.internalapi.analytics.a
    public final void a(String str) {
        str.getClass();
        com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar = this.a.F0 ? this.b : null;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internalapi.analytics.a
    public final void d(String str, String str2) {
        str.getClass();
        str2.getClass();
        com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar = this.a.F0 ? this.b : null;
        if (aVar != null) {
            aVar.d(str, str2);
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internalapi.analytics.a
    public final void e(String str, String str2) {
        str.getClass();
        str2.getClass();
        com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar = this.a.F0 ? this.b : null;
        if (aVar != null) {
            aVar.e(str, str2);
        }
    }

    @Override // com.yandex.plus.home.feature.webviews.internalapi.analytics.a
    public final void f(String str) {
        str.getClass();
        com.yandex.plus.home.feature.webviews.internalapi.analytics.a aVar = this.a.F0 ? this.b : null;
        if (aVar != null) {
            aVar.f(str);
        }
    }
}
