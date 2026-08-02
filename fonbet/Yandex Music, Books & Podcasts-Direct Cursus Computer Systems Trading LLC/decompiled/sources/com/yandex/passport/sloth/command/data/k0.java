package com.yandex.passport.sloth.command.data;

import android.os.Bundle;
import defpackage.ern;
import defpackage.ff7;
import defpackage.kgm;
import defpackage.quj;
import defpackage.qy0;
import defpackage.t75;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.upn;
import defpackage.wsd;
import defpackage.x3f;
import defpackage.zf6;
import java.lang.annotation.Annotation;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class k0 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ k0(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return com.yandex.passport.common.url.b.Companion.serializer();
            case 1:
                tkr tkrVar = tkr.a;
                return new wsd(tkrVar, tkrVar, 1);
            case 2:
                return new Bundle();
            case 3:
                return new com.yandex.plus.acquisition.adapter.internal.analytics.a();
            case 4:
                return new com.yandex.plus.acquisition.sdk.button.section.ui.impl.di.b();
            case 5:
                return new com.yandex.plus.acquisition.sdk.common.impl.data.mappers.a();
            case 6:
                return quj.r(x3f.d, new com.yandex.passport.internal.storage.d(24));
            case 7:
                return com.yandex.plus.core.dispatcher.b.a;
            case 8:
                return new com.yandex.plus.acquisition.sdk.pay.impl.analytics.b();
            case 9:
                return new com.yandex.plus.acquisition.sdk.pay.impl.providers.b();
            case 10:
                return new com.yandex.plus.acquisition.sdk.pay.impl.analytics.a();
            case 11:
                return new wsd(tkr.a, com.yandex.plus.core.serialization.kotlin.kserializer.a.a, 1);
            case 12:
                return new qy0(com.yandex.plus.analytics.dwh.internal.network.dto.a.a, 0);
            case 13:
                return quj.r(x3f.d, new com.yandex.passport.internal.ui.bouncer.roundabout.k(18, (Object) null));
            case 14:
                return com.yandex.plus.bdui.flex.action.i.Companion.serializer();
            case 15:
                return upn.c;
            case 16:
                return upn.b;
            case 17:
                return upn.d;
            case 18:
                return new com.yandex.plus.core.reflect.i();
            case 19:
                return t75.c(new com.yandex.plus.bdui.plus.data.a());
            case 20:
                return ConcurrentHashMap.newKeySet();
            case 21:
                com.yandex.plus.bdui.plus.action.a.c.getClass();
                return new com.yandex.plus.bdui.plus.action.y(t75.c(new com.yandex.plus.bdui.plus.action.t(new com.yandex.plus.bdui.flex.ui.content.c(5), new com.yandex.passport.internal.methods.performer.v0(7), new com.yandex.plus.bdui.flex.ui.content.c(6))));
            case 22:
                com.yandex.plus.bdui.plus.action.a.c.getClass();
                return new com.yandex.plus.bdui.plus.action.y(t75.c(new com.yandex.plus.bdui.plus.action.t(new com.yandex.plus.bdui.flex.ui.content.c(5), new com.yandex.passport.internal.methods.performer.v0(7), new com.yandex.plus.bdui.flex.ui.content.c(6))));
            case 23:
                return new zf6(ern.a(com.yandex.plus.bdui.action.a.class), new kgm(ern.a(com.yandex.plus.bdui.action.a.class), new Annotation[0]), new t9f[0]);
            case 24:
                return new zf6(ern.a(com.yandex.plus.bdui.action.a.class), ff7.C(new kgm(ern.a(com.yandex.plus.bdui.action.a.class), new Annotation[0])), new t9f[0]);
            case 25:
                return new zf6(ern.a(com.yandex.plus.bdui.action.a.class), ff7.C(new kgm(ern.a(com.yandex.plus.bdui.action.a.class), new Annotation[0])), new t9f[0]);
            case 26:
                return new zf6(ern.a(com.yandex.plus.bdui.query.b.class), (t9f) null, new t9f[0]);
            case 27:
                return new zf6(ern.a(com.yandex.plus.bdui.action.a.class), new kgm(ern.a(com.yandex.plus.bdui.action.a.class), new Annotation[0]), new t9f[0]);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new qy0(new zf6(ern.a(com.yandex.plus.bdui.action.a.class), new kgm(ern.a(com.yandex.plus.bdui.action.a.class), new Annotation[0]), new t9f[0]), 0);
            default:
                return new zf6(ern.a(com.yandex.plus.bdui.query.e.class), (t9f) null, new t9f[0]);
        }
    }
}
