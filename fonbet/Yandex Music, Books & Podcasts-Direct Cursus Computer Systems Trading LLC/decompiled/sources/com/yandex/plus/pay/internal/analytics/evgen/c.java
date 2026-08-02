package com.yandex.plus.pay.internal.analytics.evgen;

import com.yandex.plus.metrica.utils.n;
import defpackage.dck;
import defpackage.mka;
import defpackage.vdr;
import defpackage.xdr;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class c {
    public final String a;
    public final String b;
    public final String c;
    public final com.yandex.plus.pay.internal.di.a d;
    public final com.yandex.plus.pay.internal.di.b e;
    public final vdr f;
    public final n g;
    public final com.yandex.plus.pay.internal.di.a h;

    public c(String str, String str2, String str3, com.yandex.plus.pay.internal.di.a aVar, com.yandex.plus.pay.internal.di.b bVar, xdr xdrVar, n nVar, com.yandex.plus.pay.internal.di.a aVar2) {
        str3.getClass();
        xdrVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aVar;
        this.e = bVar;
        this.f = xdrVar;
        this.g = nVar;
        this.h = aVar2;
    }

    public final mka a() {
        String str;
        String str2;
        String l;
        String str3 = (String) this.d.invoke();
        vdr vdrVar = this.f;
        Long id = ((com.yandex.plus.domain.auth.api.e) vdrVar.getValue()).getId();
        String str4 = (id == null || (l = id.toString()) == null) ? "no_value" : l;
        com.yandex.plus.pay.internal.di.b bVar = this.e;
        com.yandex.plus.experiments.api.a aVar = (com.yandex.plus.experiments.api.a) bVar.invoke();
        String str5 = (aVar == null || (str2 = aVar.a) == null) ? "no_value" : str2;
        com.yandex.plus.experiments.api.a aVar2 = (com.yandex.plus.experiments.api.a) bVar.invoke();
        String str6 = (aVar2 == null || (str = aVar2.b) == null) ? "no_value" : str;
        com.yandex.plus.core.user.a aVar3 = (com.yandex.plus.core.user.a) this.g.invoke();
        dck dckVar = vdrVar.getValue() instanceof com.yandex.plus.domain.auth.api.d ? dck.NotLoggedIn : aVar3 == com.yandex.plus.core.user.a.a ? dck.NoSubscription : aVar3 == com.yandex.plus.core.user.a.b ? dck.Active : dck.Unknown;
        String language = ((Locale) this.h.invoke()).getLanguage();
        language.getClass();
        return new mka(this.a, this.b, this.c, dckVar, str5, str6, str4, str3, language);
    }
}
