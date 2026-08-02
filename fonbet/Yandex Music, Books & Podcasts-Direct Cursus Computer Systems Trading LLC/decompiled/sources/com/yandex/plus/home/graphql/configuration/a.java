package com.yandex.plus.home.graphql.configuration;

import com.yandex.plus.core.data.common.y;
import com.yandex.plus.home.internal.di.l;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.c6;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.p4;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.t1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.w;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.x;
import com.yandex.plus.home.repository.api.model.panel.d0;
import com.yandex.plus.home.repository.api.model.panel.v;
import com.yandex.pulse.metrics.o;
import defpackage.jyr;
import defpackage.quj;
import defpackage.qy0;
import defpackage.tkr;
import defpackage.udb;
import defpackage.wsd;
import defpackage.x3f;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new qy0(tkr.a, 2);
            case 1:
                return new qy0(tkr.a, 2);
            case 2:
                return new qy0(tkr.a, 2);
            case 3:
                return new v("debug-panel", "debug panel", "open debug panel", "", new com.yandex.plus.core.data.common.v(null, null), new com.yandex.plus.core.data.common.v(null, null), new com.yandex.plus.core.data.common.v(null, null), new d0("open debug panel", new com.yandex.plus.core.data.common.v(null, null), "", "", com.yandex.plus.home.repository.api.model.panel.a.e, new com.yandex.plus.core.data.common.v(null, null)), false, new y(null, null));
            case 4:
                jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                String uuid = com.yandex.plus.core.analytics.logging.e.c().toString();
                uuid.getClass();
                return uuid;
            case 5:
                return new com.yandex.plus.core.location.a();
            case 6:
                return new com.yandex.plus.home.state.a();
            case 7:
                return null;
            case 8:
                return new com.yandex.plus.home.payment.google.g();
            case 9:
                return new com.yandex.plus.home.core.network.d();
            case 10:
                return quj.r(x3f.d, new com.yandex.plus.home.feature.webviews.internal.webview.e(5));
            case 11:
                return new com.yandex.plus.core.network.api.interceptors.d();
            case 12:
                jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
                return com.yandex.plus.core.analytics.logging.e.a(com.yandex.plus.core.analytics.logging.b.a);
            case 13:
                return new udb("JustInteract", com.yandex.plus.home.plaque.repository.graphql.cache.dto.e.INSTANCE, new Annotation[0]);
            case 14:
                tkr tkrVar = tkr.a;
                return new wsd(tkrVar, tkrVar, 1);
            case 15:
                return new qy0(com.yandex.plus.home.plaque.repository.graphql.cache.dto.j.a, 0);
            case 16:
                return new qy0(com.yandex.plus.home.plaque.repository.graphql.cache.dto.j.a, 0);
            case 17:
                return new udb("Transparent", w.INSTANCE, new Annotation[0]);
            case 18:
                return c6.Companion.serializer();
            case 19:
                tkr tkrVar2 = tkr.a;
                return new wsd(tkrVar2, tkrVar2, 1);
            case 20:
                return t1.Companion.serializer();
            case 21:
                tkr tkrVar3 = tkr.a;
                return new wsd(tkrVar3, tkrVar3, 1);
            case 22:
                return p4.Companion.serializer();
            case 23:
                return new qy0(tkr.a, 0);
            case 24:
                return c6.Companion.serializer();
            case 25:
                tkr tkrVar4 = tkr.a;
                return new wsd(tkrVar4, tkrVar4, 1);
            case 26:
                return t1.Companion.serializer();
            case 27:
                tkr tkrVar5 = tkr.a;
                return new wsd(tkrVar5, tkrVar5, 1);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return p4.Companion.serializer();
            default:
                return new qy0(x.Companion.serializer(), 0);
        }
    }

    public /* synthetic */ a(l lVar, int i) {
        this.a = i;
    }
}
