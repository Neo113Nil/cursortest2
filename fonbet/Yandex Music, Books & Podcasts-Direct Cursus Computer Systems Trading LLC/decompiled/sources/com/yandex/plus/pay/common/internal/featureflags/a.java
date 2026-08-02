package com.yandex.plus.pay.common.internal.featureflags;

import com.yandex.passport.internal.entities.j;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import com.yandex.plus.core.featureflags.f;
import com.yandex.plus.core.featureflags.g;
import com.yandex.plus.home.featureflags.d;
import defpackage.ern;
import java.util.Set;

/* loaded from: classes5.dex */
public final class a extends com.yandex.plus.core.featureflags.b implements c {
    public final g h;
    public final g i;
    public final g j;

    public a() {
        u.g(ern.a(Boolean.class), new d(10), new d(11), new d(12), new d(13), new d(14));
        Set set = b.b;
        f fVar = (f) this.f.getValue();
        j jVar = new j(ern.a(Set.class));
        jVar.r(fVar, "allowed_countries_for_yandex_payment");
        jVar.d = set;
        jVar.e = null;
        this.h = jVar.m();
        Boolean bool = Boolean.FALSE;
        f fVar2 = (f) this.f.getValue();
        j jVar2 = new j(ern.a(Boolean.class));
        jVar2.r(fVar2, "tarifficator_presale_from_backend_sdk");
        jVar2.d = bool;
        jVar2.e = null;
        this.i = jVar2.m();
        f fVar3 = (f) this.f.getValue();
        j jVar3 = new j(ern.a(Boolean.class));
        jVar3.r(fVar3, "mobile_metrica_rtm_regular_reporter_enabled");
        jVar3.d = bool;
        jVar3.e = null;
        this.j = jVar3.m();
    }
}
