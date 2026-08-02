package com.yandex.plus.acquisition.sdk.common.api.di;

import android.content.Context;
import com.appsflyer.internal.k;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f;
import com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.g;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.i0;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.k0;
import com.yandex.plus.home.feature.webviews.internalapi.subscription.l;
import com.yandex.plus.home.feature.webviews.internalapi.subscription.p;
import com.yandex.plus.home.repository.api.model.webconfig.a0;
import com.yandex.plus.home.repository.api.model.webconfig.v;
import com.yandex.plus.home.repository.api.model.webconfig.x;
import com.yandex.plus.home.repository.api.model.webconfig.y;
import com.yandex.plus.home.repository.api.model.webconfig.z;
import com.yandex.plus.pay.adapter.api.g0;
import com.yandex.plus.pay.adapter.api.h;
import com.yandex.plus.pay.adapter.api.h0;
import com.yandex.plus.pay.adapter.api.j;
import com.yandex.plus.pay.adapter.internal.c1;
import com.yandex.plus.pay.adapter.internal.h1;
import com.yandex.plus.pay.adapter.internal.i;
import com.yandex.plus.pay.adapter.internal.y0;
import com.yandex.plus.pay.api.model.PlusPayCompositeOffers;
import com.yandex.plus.pay.internal.network.d;
import com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.c;
import com.yandex.plus.paywall.sdk.analytics.impl.evgen.diagnostic.e;
import defpackage.a6m;
import defpackage.b6e;
import defpackage.btf;
import defpackage.c5b;
import defpackage.e5b;
import defpackage.ezc;
import defpackage.fkn;
import defpackage.gik;
import defpackage.hrg;
import defpackage.jyr;
import defpackage.nm6;
import defpackage.omb;
import defpackage.su4;
import defpackage.tkb;
import defpackage.v75;
import defpackage.wkb;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class b {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Serializable g;
    public final Object h;
    public final Object i;

    public b(com.yandex.plus.paywall.sdk.analytics.api.a aVar) {
        final int i = 0;
        this.a = btf.b(new Function0(this) { // from class: com.yandex.plus.paywall.sdk.analytics.impl.b
            public final /* synthetic */ com.yandex.plus.acquisition.sdk.common.api.di.b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new c((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue());
                    case 1:
                        return (a) ((jyr) this.b.i).getValue();
                    case 2:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar2 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar.d;
                        return new com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar2, 0), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar.c, bVar2, (DecimalFormat) ((jyr) bVar.g).getValue(), 0), new d(1));
                    case 3:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar4 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar3.d;
                        return new e(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar4, 1), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar3.c, bVar4, (DecimalFormat) ((jyr) bVar3.g).getValue(), 1), new d(2));
                    case 4:
                        ((gik) ((jyr) this.b.h).getValue()).getClass();
                        return new a();
                    case 5:
                        ((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 6:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 7:
                        return new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a((e) ((jyr) this.b.f).getValue());
                    case 8:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 9:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    default:
                        return (a) ((jyr) this.b.i).getValue();
                }
            }
        });
        final int i2 = 5;
        btf.b(new Function0(this) { // from class: com.yandex.plus.paywall.sdk.analytics.impl.b
            public final /* synthetic */ com.yandex.plus.acquisition.sdk.common.api.di.b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new c((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue());
                    case 1:
                        return (a) ((jyr) this.b.i).getValue();
                    case 2:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar2 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar.d;
                        return new com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar2, 0), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar.c, bVar2, (DecimalFormat) ((jyr) bVar.g).getValue(), 0), new d(1));
                    case 3:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar4 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar3.d;
                        return new e(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar4, 1), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar3.c, bVar4, (DecimalFormat) ((jyr) bVar3.g).getValue(), 1), new d(2));
                    case 4:
                        ((gik) ((jyr) this.b.h).getValue()).getClass();
                        return new a();
                    case 5:
                        ((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 6:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 7:
                        return new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a((e) ((jyr) this.b.f).getValue());
                    case 8:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 9:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    default:
                        return (a) ((jyr) this.b.i).getValue();
                }
            }
        });
        final int i3 = 6;
        btf.b(new Function0(this) { // from class: com.yandex.plus.paywall.sdk.analytics.impl.b
            public final /* synthetic */ com.yandex.plus.acquisition.sdk.common.api.di.b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new c((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue());
                    case 1:
                        return (a) ((jyr) this.b.i).getValue();
                    case 2:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar2 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar.d;
                        return new com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar2, 0), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar.c, bVar2, (DecimalFormat) ((jyr) bVar.g).getValue(), 0), new d(1));
                    case 3:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar4 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar3.d;
                        return new e(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar4, 1), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar3.c, bVar4, (DecimalFormat) ((jyr) bVar3.g).getValue(), 1), new d(2));
                    case 4:
                        ((gik) ((jyr) this.b.h).getValue()).getClass();
                        return new a();
                    case 5:
                        ((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 6:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 7:
                        return new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a((e) ((jyr) this.b.f).getValue());
                    case 8:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 9:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    default:
                        return (a) ((jyr) this.b.i).getValue();
                }
            }
        });
        final int i4 = 7;
        this.b = btf.b(new Function0(this) { // from class: com.yandex.plus.paywall.sdk.analytics.impl.b
            public final /* synthetic */ com.yandex.plus.acquisition.sdk.common.api.di.b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return new c((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue());
                    case 1:
                        return (a) ((jyr) this.b.i).getValue();
                    case 2:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar2 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar.d;
                        return new com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar2, 0), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar.c, bVar2, (DecimalFormat) ((jyr) bVar.g).getValue(), 0), new d(1));
                    case 3:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar4 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar3.d;
                        return new e(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar4, 1), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar3.c, bVar4, (DecimalFormat) ((jyr) bVar3.g).getValue(), 1), new d(2));
                    case 4:
                        ((gik) ((jyr) this.b.h).getValue()).getClass();
                        return new a();
                    case 5:
                        ((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 6:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 7:
                        return new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a((e) ((jyr) this.b.f).getValue());
                    case 8:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 9:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    default:
                        return (a) ((jyr) this.b.i).getValue();
                }
            }
        });
        final int i5 = 8;
        btf.b(new Function0(this) { // from class: com.yandex.plus.paywall.sdk.analytics.impl.b
            public final /* synthetic */ com.yandex.plus.acquisition.sdk.common.api.di.b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return new c((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue());
                    case 1:
                        return (a) ((jyr) this.b.i).getValue();
                    case 2:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar2 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar.d;
                        return new com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar2, 0), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar.c, bVar2, (DecimalFormat) ((jyr) bVar.g).getValue(), 0), new d(1));
                    case 3:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar4 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar3.d;
                        return new e(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar4, 1), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar3.c, bVar4, (DecimalFormat) ((jyr) bVar3.g).getValue(), 1), new d(2));
                    case 4:
                        ((gik) ((jyr) this.b.h).getValue()).getClass();
                        return new a();
                    case 5:
                        ((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 6:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 7:
                        return new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a((e) ((jyr) this.b.f).getValue());
                    case 8:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 9:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    default:
                        return (a) ((jyr) this.b.i).getValue();
                }
            }
        });
        final int i6 = 9;
        btf.b(new Function0(this) { // from class: com.yandex.plus.paywall.sdk.analytics.impl.b
            public final /* synthetic */ com.yandex.plus.acquisition.sdk.common.api.di.b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return new c((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue());
                    case 1:
                        return (a) ((jyr) this.b.i).getValue();
                    case 2:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar2 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar.d;
                        return new com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar2, 0), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar.c, bVar2, (DecimalFormat) ((jyr) bVar.g).getValue(), 0), new d(1));
                    case 3:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar4 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar3.d;
                        return new e(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar4, 1), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar3.c, bVar4, (DecimalFormat) ((jyr) bVar3.g).getValue(), 1), new d(2));
                    case 4:
                        ((gik) ((jyr) this.b.h).getValue()).getClass();
                        return new a();
                    case 5:
                        ((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 6:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 7:
                        return new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a((e) ((jyr) this.b.f).getValue());
                    case 8:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 9:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    default:
                        return (a) ((jyr) this.b.i).getValue();
                }
            }
        });
        final int i7 = 10;
        btf.b(new Function0(this) { // from class: com.yandex.plus.paywall.sdk.analytics.impl.b
            public final /* synthetic */ com.yandex.plus.acquisition.sdk.common.api.di.b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return new c((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue());
                    case 1:
                        return (a) ((jyr) this.b.i).getValue();
                    case 2:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar2 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar.d;
                        return new com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar2, 0), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar.c, bVar2, (DecimalFormat) ((jyr) bVar.g).getValue(), 0), new d(1));
                    case 3:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar4 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar3.d;
                        return new e(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar4, 1), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar3.c, bVar4, (DecimalFormat) ((jyr) bVar3.g).getValue(), 1), new d(2));
                    case 4:
                        ((gik) ((jyr) this.b.h).getValue()).getClass();
                        return new a();
                    case 5:
                        ((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 6:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 7:
                        return new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a((e) ((jyr) this.b.f).getValue());
                    case 8:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 9:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    default:
                        return (a) ((jyr) this.b.i).getValue();
                }
            }
        });
        final int i8 = 1;
        btf.b(new Function0(this) { // from class: com.yandex.plus.paywall.sdk.analytics.impl.b
            public final /* synthetic */ com.yandex.plus.acquisition.sdk.common.api.di.b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        return new c((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue());
                    case 1:
                        return (a) ((jyr) this.b.i).getValue();
                    case 2:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar2 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar.d;
                        return new com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar2, 0), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar.c, bVar2, (DecimalFormat) ((jyr) bVar.g).getValue(), 0), new d(1));
                    case 3:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar4 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar3.d;
                        return new e(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar4, 1), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar3.c, bVar4, (DecimalFormat) ((jyr) bVar3.g).getValue(), 1), new d(2));
                    case 4:
                        ((gik) ((jyr) this.b.h).getValue()).getClass();
                        return new a();
                    case 5:
                        ((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 6:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 7:
                        return new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a((e) ((jyr) this.b.f).getValue());
                    case 8:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 9:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    default:
                        return (a) ((jyr) this.b.i).getValue();
                }
            }
        });
        this.c = aVar.a;
        this.d = aVar.b;
        final int i9 = 2;
        this.e = btf.b(new Function0(this) { // from class: com.yandex.plus.paywall.sdk.analytics.impl.b
            public final /* synthetic */ com.yandex.plus.acquisition.sdk.common.api.di.b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        return new c((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue());
                    case 1:
                        return (a) ((jyr) this.b.i).getValue();
                    case 2:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar2 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar.d;
                        return new com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar2, 0), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar.c, bVar2, (DecimalFormat) ((jyr) bVar.g).getValue(), 0), new d(1));
                    case 3:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar4 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar3.d;
                        return new e(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar4, 1), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar3.c, bVar4, (DecimalFormat) ((jyr) bVar3.g).getValue(), 1), new d(2));
                    case 4:
                        ((gik) ((jyr) this.b.h).getValue()).getClass();
                        return new a();
                    case 5:
                        ((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 6:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 7:
                        return new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a((e) ((jyr) this.b.f).getValue());
                    case 8:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 9:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    default:
                        return (a) ((jyr) this.b.i).getValue();
                }
            }
        });
        final int i10 = 3;
        this.f = btf.b(new Function0(this) { // from class: com.yandex.plus.paywall.sdk.analytics.impl.b
            public final /* synthetic */ com.yandex.plus.acquisition.sdk.common.api.di.b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return new c((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue());
                    case 1:
                        return (a) ((jyr) this.b.i).getValue();
                    case 2:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar2 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar.d;
                        return new com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar2, 0), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar.c, bVar2, (DecimalFormat) ((jyr) bVar.g).getValue(), 0), new d(1));
                    case 3:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar4 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar3.d;
                        return new e(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar4, 1), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar3.c, bVar4, (DecimalFormat) ((jyr) bVar3.g).getValue(), 1), new d(2));
                    case 4:
                        ((gik) ((jyr) this.b.h).getValue()).getClass();
                        return new a();
                    case 5:
                        ((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 6:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 7:
                        return new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a((e) ((jyr) this.b.f).getValue());
                    case 8:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 9:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    default:
                        return (a) ((jyr) this.b.i).getValue();
                }
            }
        });
        this.g = btf.b(new com.yandex.plus.paymentsdk.api.d(i10));
        final int i11 = 4;
        this.h = btf.b(new com.yandex.plus.paymentsdk.api.d(i11, this));
        this.i = btf.b(new Function0(this) { // from class: com.yandex.plus.paywall.sdk.analytics.impl.b
            public final /* synthetic */ com.yandex.plus.acquisition.sdk.common.api.di.b b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return new c((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue());
                    case 1:
                        return (a) ((jyr) this.b.i).getValue();
                    case 2:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar2 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar.d;
                        return new com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar2, 0), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar.c, bVar2, (DecimalFormat) ((jyr) bVar.g).getValue(), 0), new d(1));
                    case 3:
                        com.yandex.plus.acquisition.sdk.common.api.di.b bVar3 = this.b;
                        com.yandex.plus.acquisition.sdk.pay.impl.b bVar4 = (com.yandex.plus.acquisition.sdk.pay.impl.b) bVar3.d;
                        return new e(new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.b(bVar4, 1), new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.analytics.a((com.yandex.plus.acquisition.sdk.common.impl.di.b) bVar3.c, bVar4, (DecimalFormat) ((jyr) bVar3.g).getValue(), 1), new d(2));
                    case 4:
                        ((gik) ((jyr) this.b.h).getValue()).getClass();
                        return new a();
                    case 5:
                        ((com.yandex.plus.paywall.sdk.analytics.impl.evgen.analytics.a) ((jyr) this.b.e).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 6:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 7:
                        return new com.yandex.plus.paywall.sdk.analytics.impl.acquisition.diagnostic.a((e) ((jyr) this.b.f).getValue());
                    case 8:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    case 9:
                        ((e) ((jyr) this.b.f).getValue()).getClass();
                        return new com.yandex.plus.home.plaque.animator.internal.utils.a();
                    default:
                        return (a) ((jyr) this.b.i).getValue();
                }
            }
        });
    }

    public static com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.e c(b bVar, a0 a0Var, j jVar) {
        f fVar;
        h e;
        z zVar = a0Var.c;
        bVar.getClass();
        y yVar = zVar.e;
        String str = null;
        if (yVar == y.b) {
            fVar = f.c;
        } else if (yVar == y.c) {
            fVar = f.a;
        } else {
            x xVar = zVar.d;
            fVar = xVar == x.a ? f.b : xVar == x.b ? f.d : null;
        }
        if (jVar != null && (e = ((i) jVar).e()) != null) {
            str = ((h1) e).a.getId();
        }
        return bVar.b(a0Var, jVar, fVar, str);
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [ezc, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.Map] */
    public static void f(b bVar, String str, k0 k0Var, i0 i0Var, p pVar, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            pVar = null;
        }
        bVar.getClass();
        ((ezc) bVar.g).invoke(new com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.k0(str, k0Var, i0Var, pVar != null ? r1.M(pVar) : null));
        if (pVar != null) {
            com.yandex.plus.home.analytics.payment.a aVar = (com.yandex.plus.home.analytics.payment.a) bVar.e;
            aVar.getClass();
            jyr jyrVar = aVar.b;
            String X = CollectionsKt.X(aVar.a.a().a.entrySet(), StringUtil.LF, null, null, null, 62);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String message = pVar.getMessage();
            if (message != null) {
                linkedHashMap.put(Constants.KEY_MESSAGE, message);
            }
            String place = pVar.getPlace();
            if (place != null) {
                linkedHashMap.put("place", place);
            }
            String y = pVar.y();
            if (y != null) {
                linkedHashMap.put("storyId", y);
            }
            if (pVar instanceof l) {
                linkedHashMap.put("paymentMethod", ((l) pVar).d);
            } else if (pVar instanceof com.yandex.plus.home.feature.webviews.internalapi.subscription.i) {
                com.yandex.plus.home.feature.webviews.internalapi.subscription.i iVar = (com.yandex.plus.home.feature.webviews.internalapi.subscription.i) pVar;
                linkedHashMap.put("targetId", iVar.d);
                linkedHashMap.put("paymentMethod", iVar.f);
                String str2 = iVar.e;
                if (str2 != null) {
                    linkedHashMap.put("errorMessage", str2);
                }
            } else if (pVar instanceof com.yandex.plus.home.feature.webviews.internalapi.subscription.c) {
                com.yandex.plus.home.feature.webviews.internalapi.subscription.c cVar = (com.yandex.plus.home.feature.webviews.internalapi.subscription.c) pVar;
                linkedHashMap.put("targetId", cVar.d);
                linkedHashMap.put("vendorType", cVar.e);
                linkedHashMap.put("offersIds", CollectionsKt.X(cVar.f, null, null, null, null, 63));
                linkedHashMap.put("paymentMethod", cVar.g);
            } else if (pVar instanceof com.yandex.plus.home.feature.webviews.internalapi.subscription.f) {
                com.yandex.plus.home.feature.webviews.internalapi.subscription.f fVar = (com.yandex.plus.home.feature.webviews.internalapi.subscription.f) pVar;
                linkedHashMap.put("targetId", fVar.d);
                linkedHashMap.put("paymentMethod", fVar.e);
            }
            String X2 = CollectionsKt.X(linkedHashMap.entrySet(), StringUtil.LF, null, null, null, 62);
            String name = r1.M(pVar).name();
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.d, com.yandex.plus.core.analytics.logging.b.e, hrg.r("Error when trying to show native buy button, error=", name, " errorParams=", X2), null);
            com.yandex.plus.core.analytics.e eVar = (com.yandex.plus.core.analytics.e) jyrVar.getValue();
            if (eVar != null) {
                eVar.reportError(String.format("error.native.button.show.%s", Arrays.copyOf(new Object[]{name}, 1)), hrg.s("globalParams: {\n", X, "\n}\nerrorParams: {\n", X2, "\n}"), null);
            }
            com.yandex.plus.core.analytics.e eVar2 = (com.yandex.plus.core.analytics.e) jyrVar.getValue();
            if (eVar2 != null) {
                eVar2.a();
            }
        }
    }

    public void a(a0 a0Var, j jVar, f fVar, String str) {
        com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.e b = b(a0Var, jVar, fVar, str);
        if (b != null) {
            com.yandex.plus.home.analytics.payment.d dVar = (com.yandex.plus.home.analytics.payment.d) this.d;
            com.yandex.plus.home.internal.di.b bVar = dVar.b;
            omb ombVar = dVar.a;
            g gVar = b.a;
            List list = b.e;
            String str2 = b.d;
            com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d dVar2 = b.c;
            f fVar2 = b.b;
            int ordinal = gVar.ordinal();
            if (ordinal == 0) {
                wkb I = com.yandex.plus.bdui.plus.analytics.b.I(fVar2);
                tkb G = com.yandex.plus.bdui.plus.analytics.b.G(dVar2);
                String str3 = str2 == null ? "no_value" : str2;
                boolean booleanValue = ((Boolean) bVar.invoke()).booleanValue();
                ombVar.getClass();
                list.getClass();
                LinkedHashMap r = su4.r("purchase_session_id", "no_value");
                r.put("purchase_type", I.a);
                r.put("purchase_button", G.a);
                r.put("product_id", str3);
                k.z(r, "options_id", list, false, "is_one_click_payment");
                r.put("is_tarifficator", String.valueOf(true));
                r.put("is_authenticated", String.valueOf(booleanValue));
                HashMap hashMap = new HashMap();
                k.w("version", 1, hashMap, "Payment");
                r.put("_meta", omb.a(2, hashMap));
                ombVar.d("PlusHome.BuySubscription.Button.Shown", r);
                return;
            }
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            wkb I2 = com.yandex.plus.bdui.plus.analytics.b.I(fVar2);
            tkb G2 = com.yandex.plus.bdui.plus.analytics.b.G(dVar2);
            String str4 = str2 == null ? "no_value" : str2;
            boolean booleanValue2 = ((Boolean) bVar.invoke()).booleanValue();
            ombVar.getClass();
            list.getClass();
            LinkedHashMap r2 = su4.r("purchase_session_id", "no_value");
            r2.put("purchase_type", I2.a);
            r2.put("purchase_button", G2.a);
            r2.put("product_id", str4);
            k.z(r2, "options_id", list, false, "is_one_click_payment");
            r2.put("is_tarifficator", String.valueOf(true));
            r2.put("is_authenticated", String.valueOf(booleanValue2));
            HashMap hashMap2 = new HashMap();
            k.w("version", 1, hashMap2, "Payment");
            r2.put("_meta", omb.a(2, hashMap2));
            ombVar.d("PlusStories.BuySubscription.Button.Shown", r2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    public com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.e b(a0 a0Var, j jVar, f fVar, String str) {
        ?? r2;
        com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d dVar;
        com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d dVar2;
        f fVar2;
        String str2;
        h e;
        List d;
        if (jVar == null || (d = ((i) jVar).d()) == null) {
            r2 = 0;
        } else {
            List list = d;
            r2 = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r2.add(((y0) ((com.yandex.plus.pay.adapter.api.e) it.next())).a.getId());
            }
        }
        if (r2 == 0) {
            r2 = c5b.a;
        }
        List list2 = r2;
        z zVar = a0Var.c;
        if (zVar.e == y.c) {
            dVar2 = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d.a;
        } else {
            v vVar = zVar.c;
            if (vVar == v.a) {
                dVar2 = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d.b;
            } else {
                if (vVar != v.b) {
                    dVar = null;
                    if (fVar != null || dVar == null) {
                        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.e;
                        String str3 = "Can't create PlusPaymentStatData subscriptionConfig = " + a0Var + ", purchaseType = " + fVar + ", buttonType = " + dVar;
                        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
                        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, str3, null);
                        return null;
                    }
                    g gVar = (g) this.c;
                    if (str == null) {
                        if (jVar == null || (e = ((i) jVar).e()) == null) {
                            fVar2 = fVar;
                            str2 = null;
                            return new com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.e(gVar, fVar2, dVar, str2, list2);
                        }
                        str = ((h1) e).a.getId();
                    }
                    fVar2 = fVar;
                    str2 = str;
                    return new com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.e(gVar, fVar2, dVar, str2, list2);
                }
                dVar2 = com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d.c;
            }
        }
        dVar = dVar2;
        if (fVar != null) {
        }
        com.yandex.plus.core.analytics.logging.b bVar2 = com.yandex.plus.core.analytics.logging.b.e;
        String str32 = "Can't create PlusPaymentStatData subscriptionConfig = " + a0Var + ", purchaseType = " + fVar + ", buttonType = " + dVar;
        jyr jyrVar2 = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar2, str32, null);
        return null;
    }

    public Unit d(j jVar) {
        g0 g0Var = (g0) this.a;
        h0 h0Var = (h0) this.b;
        c1 c1Var = (c1) g0Var;
        c1Var.getClass();
        PlusPayCompositeOffers.Offer a = c1.a(jVar);
        com.yandex.plus.pay.api.analytics.tarifficator.e g = ((com.yandex.plus.pay.internal.g) ((com.yandex.plus.pay.a) c1Var.a.getValue())).g();
        String str = h0Var.b;
        String str2 = h0Var.c;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        g.b(a, 0, str2, "purchase_button", str, e5bVar);
        Unit unit = Unit.a;
        nm6 nm6Var = nm6.a;
        return unit;
    }

    public void e(com.yandex.plus.home.feature.webviews.internal.purchase.button.section.d dVar) {
        a0 a = dVar.a();
        com.yandex.plus.home.feature.webviews.internal.purchase.button.offers.a c = dVar.c();
        com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.e c2 = c(this, a, c != null ? c.a : null);
        if (c2 != null) {
            com.yandex.plus.home.analytics.payment.d dVar2 = (com.yandex.plus.home.analytics.payment.d) this.d;
            com.yandex.plus.home.internal.di.b bVar = dVar2.b;
            omb ombVar = dVar2.a;
            g gVar = c2.a;
            List list = c2.e;
            String str = c2.d;
            com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d dVar3 = c2.c;
            f fVar = c2.b;
            int ordinal = gVar.ordinal();
            if (ordinal == 0) {
                wkb I = com.yandex.plus.bdui.plus.analytics.b.I(fVar);
                tkb G = com.yandex.plus.bdui.plus.analytics.b.G(dVar3);
                String str2 = str == null ? "no_value" : str;
                boolean booleanValue = ((Boolean) bVar.invoke()).booleanValue();
                ombVar.getClass();
                list.getClass();
                LinkedHashMap r = su4.r("purchase_session_id", "no_value");
                r.put("purchase_type", I.a);
                r.put("purchase_button", G.a);
                r.put("product_id", str2);
                k.z(r, "options_id", list, false, "is_one_click_payment");
                r.put("is_tarifficator", String.valueOf(true));
                r.put("is_authenticated", String.valueOf(booleanValue));
                HashMap hashMap = new HashMap();
                k.w("version", 1, hashMap, "Payment");
                r.put("_meta", omb.a(2, hashMap));
                ombVar.d("PlusHome.BuySubscription.Button.Clicked", r);
                return;
            }
            if (ordinal != 1) {
                b6e.s();
                return;
            }
            wkb I2 = com.yandex.plus.bdui.plus.analytics.b.I(fVar);
            tkb G2 = com.yandex.plus.bdui.plus.analytics.b.G(dVar3);
            String str3 = str == null ? "no_value" : str;
            boolean booleanValue2 = ((Boolean) bVar.invoke()).booleanValue();
            ombVar.getClass();
            list.getClass();
            LinkedHashMap r2 = su4.r("purchase_session_id", "no_value");
            r2.put("purchase_type", I2.a);
            r2.put("purchase_button", G2.a);
            r2.put("product_id", str3);
            k.z(r2, "options_id", list, false, "is_one_click_payment");
            r2.put("is_tarifficator", String.valueOf(true));
            r2.put("is_authenticated", String.valueOf(booleanValue2));
            HashMap hashMap2 = new HashMap();
            k.w("version", 1, hashMap2, "Payment");
            r2.put("_meta", omb.a(2, hashMap2));
            ombVar.d("PlusStories.BuySubscription.Button.Clicked", r2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(g0 g0Var, h0 h0Var, g gVar, com.yandex.plus.home.analytics.payment.d dVar, com.yandex.plus.home.analytics.payment.a aVar, com.yandex.plus.home.analytics.payment.c cVar, Function1 function1, com.yandex.plus.home.analytics.payment.e eVar, com.yandex.plus.home.analytics.payment.b bVar) {
        g0Var.getClass();
        dVar.getClass();
        aVar.getClass();
        cVar.getClass();
        eVar.getClass();
        bVar.getClass();
        this.a = g0Var;
        this.b = h0Var;
        this.c = gVar;
        this.d = dVar;
        this.e = aVar;
        this.f = cVar;
        this.g = (ezc) function1;
        this.h = eVar;
        this.i = bVar;
    }

    public b(Context context, com.yandex.plus.adapter.auth.passport750.i iVar, fkn fknVar, com.yandex.plus.core.config.a aVar, a6m a6mVar) {
        com.yandex.plus.metrica.api.b bVar = com.yandex.plus.metrica.api.b.a;
        context.getClass();
        String h = com.yandex.plus.home.common.utils.a.h(context);
        context.getClass();
        com.yandex.plus.home.common.utils.a.g(context);
        context.getClass();
        String packageName = context.getPackageName();
        packageName.getClass();
        com.yandex.plus.core.strings.a aVar2 = com.yandex.plus.core.strings.a.a;
        context.getClass();
        iVar.getClass();
        this.a = "music";
        this.d = iVar;
        this.e = bVar;
        this.b = h;
        this.c = packageName;
        this.f = aVar;
        this.g = aVar2;
        this.h = a.a;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.i = applicationContext;
    }
}
