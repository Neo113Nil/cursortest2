package com.yandex.plus.home;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.internal.di.u;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.z7o;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class k implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ k(t tVar, int i) {
        this.a = i;
        this.b = tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        t tVar = this.b;
        switch (i) {
            case 0:
                return ((com.yandex.plus.home.analytics.evgen.a) tVar.d.f.getValue()).a().a;
            case 1:
                Object f = tVar.f.a().f();
                r7o r7oVar = z7o.b;
                if (f instanceof t7o) {
                    f = null;
                }
                return (com.yandex.plus.experiments.api.a) f;
            case 2:
                return (com.yandex.plus.domain.auth.api.e) tVar.h.h.getValue();
            case 3:
                return Boolean.valueOf(r1.l(((com.yandex.plus.home.featureflags.e) tVar.b.q).v));
            case 4:
                u uVar = tVar.b;
                return Boolean.valueOf(!com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.r(uVar.a, (com.yandex.plus.ui.core.theme.a) uVar.c.a.getValue()));
            case 5:
                return (com.yandex.plus.domain.auth.api.e) tVar.h.h.getValue();
            case 6:
                com.yandex.plus.home.internal.di.e eVar = tVar.c;
                eVar.getClass();
                return eVar.a.e("Plaque.Definitions.DataLoading", "Plaque.Definitions.DataParsing");
            case 7:
                return tVar.c.a("Plaque.SeenRequest.Loading");
            case 8:
                return tVar.c.a("Plaque.ClickedRequest.Loading");
            case 9:
                u uVar2 = tVar.b;
                return Boolean.valueOf(!com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.r(uVar2.a, (com.yandex.plus.ui.core.theme.a) uVar2.c.a.getValue()));
            case 10:
                return (com.yandex.plus.domain.auth.api.e) tVar.h.h.getValue();
            case 11:
                com.yandex.plus.home.internal.di.e eVar2 = tVar.c;
                eVar2.getClass();
                return eVar2.a.e("Plaque.Definitions.DataLoading", "Plaque.Definitions.DataParsing");
            case 12:
                return tVar.c.a("Plaque.SeenRequest.Loading");
            default:
                return tVar.c.a("Plaque.ClickedRequest.Loading");
        }
    }
}
