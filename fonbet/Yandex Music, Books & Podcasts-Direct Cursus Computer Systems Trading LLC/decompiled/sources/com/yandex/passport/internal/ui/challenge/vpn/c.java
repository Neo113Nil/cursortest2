package com.yandex.passport.internal.ui.challenge.vpn;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.yandex.passport.api.w1;
import com.yandex.passport.internal.analytics.i0;
import com.yandex.passport.internal.methods.z5;
import com.yandex.passport.internal.ui.sloth.c0;
import com.yandex.passport.internal.ui.sloth.d0;
import com.yandex.plus.bdui.plus.checkout.content.serializer.b2;
import com.yandex.plus.bdui.plus.checkout.content.serializer.p3;
import defpackage.c5b;
import defpackage.dfi;
import defpackage.ezc;
import defpackage.hrg;
import defpackage.k5r;
import defpackage.tah;
import defpackage.vwb;
import defpackage.x97;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class c extends ezc implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [c5b] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ?? r1;
        Object obj2;
        b2 b2Var;
        switch (this.a) {
            case 0:
                x xVar = (x) obj;
                xVar.getClass();
                ((y) this.receiver).a(xVar);
                return Unit.a;
            case 1:
                com.yandex.passport.internal.ui.domik.a0 a0Var = (com.yandex.passport.internal.ui.domik.a0) obj;
                a0Var.getClass();
                com.yandex.passport.internal.interaction.e eVar = ((com.yandex.passport.internal.ui.domik.call.a) this.receiver).s;
                eVar.getClass();
                eVar.c.m(Boolean.TRUE);
                eVar.a.a(z5.d(new com.yandex.passport.internal.interaction.c(1, eVar, a0Var)));
                return Unit.a;
            case 2:
                com.yandex.passport.internal.ui.domik.e eVar2 = (com.yandex.passport.internal.ui.domik.e) obj;
                eVar2.getClass();
                ((com.yandex.passport.internal.ui.domik.common.g) this.receiver).L(eVar2);
                return Unit.a;
            case 3:
                ((com.yandex.passport.internal.ui.domik.d) obj).getClass();
                com.yandex.passport.internal.ui.domik.relogin.d dVar = (com.yandex.passport.internal.ui.domik.relogin.d) this.receiver;
                dVar.t.e(i0.a);
                dVar.r.c();
                return Unit.a;
            case 4:
                com.yandex.passport.internal.ui.domik.d dVar2 = (com.yandex.passport.internal.ui.domik.d) obj;
                dVar2.getClass();
                com.yandex.passport.internal.ui.domik.v vVar = ((com.yandex.passport.internal.ui.domik.relogin.d) this.receiver).r;
                vVar.getClass();
                List list = dVar2.i;
                if (list != null) {
                    r1 = new ArrayList();
                    for (Object obj3 : list) {
                        int i = com.yandex.passport.internal.ui.domik.a.a[((com.yandex.passport.internal.network.response.b) obj3).ordinal()];
                        r1.add(obj3);
                    }
                } else {
                    r1 = c5b.a;
                }
                r1.size();
                Iterator it = ((Iterable) r1).iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((com.yandex.passport.internal.network.response.b) obj2).c) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                com.yandex.passport.internal.network.response.b bVar = (com.yandex.passport.internal.network.response.b) obj2;
                bVar.getClass();
                w1 w1Var = bVar.b;
                com.yandex.passport.internal.a0 a = w1Var != null ? com.yandex.passport.internal.y.a(w1Var) : null;
                a.getClass();
                vVar.e(false, a, true, null);
                return Unit.a;
            case 5:
                Bundle bundle = (Bundle) obj;
                bundle.getClass();
                ((c0) this.receiver).getClass();
                Parcelable parcelable = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(bundle, d0.class, "StandaloneSlothProperties") : bundle.getParcelable("StandaloneSlothProperties");
                if (parcelable != null) {
                    return (d0) parcelable;
                }
                xq0.q("can't get required parcelable StandaloneSlothProperties");
                return null;
            case 6:
                Bundle bundle2 = (Bundle) obj;
                bundle2.getClass();
                ((com.yandex.passport.sloth.data.l) this.receiver).getClass();
                Parcelable parcelable2 = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(bundle2, com.yandex.passport.sloth.data.m.class, "SlothParams") : bundle2.getParcelable("SlothParams");
                if (parcelable2 != null) {
                    return (com.yandex.passport.sloth.data.m) parcelable2;
                }
                xq0.q("can't get required parcelable SlothParams");
                return null;
            case 7:
                Bundle bundle3 = (Bundle) obj;
                bundle3.getClass();
                ((com.yandex.passport.internal.ui.sloth.ebs.d) this.receiver).getClass();
                Parcelable parcelable3 = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(bundle3, com.yandex.passport.internal.ui.sloth.ebs.f.class, "biometric_verification_props") : bundle3.getParcelable("biometric_verification_props");
                if (parcelable3 != null) {
                    return (com.yandex.passport.internal.ui.sloth.ebs.f) parcelable3;
                }
                xq0.q("can't get required parcelable biometric_verification_props");
                return null;
            case 8:
                Bundle bundle4 = (Bundle) obj;
                bundle4.getClass();
                ((com.yandex.passport.internal.properties.n) this.receiver).getClass();
                Parcelable parcelable4 = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(bundle4, com.yandex.passport.internal.properties.o.class, "key_managing_plus_devices_properties") : bundle4.getParcelable("key_managing_plus_devices_properties");
                if (parcelable4 != null) {
                    return (com.yandex.passport.internal.properties.o) parcelable4;
                }
                xq0.q("can't get required parcelable key_managing_plus_devices_properties");
                return null;
            case 9:
                Bundle bundle5 = (Bundle) obj;
                bundle5.getClass();
                ((com.yandex.passport.internal.ui.sloth.webauthn.d) this.receiver).getClass();
                Parcelable parcelable5 = Build.VERSION.SDK_INT >= 33 ? (Parcelable) vwb.O(bundle5, com.yandex.passport.internal.ui.sloth.webauthn.f.class, "register_webauthn_props") : bundle5.getParcelable("register_webauthn_props");
                if (parcelable5 != null) {
                    return (com.yandex.passport.internal.ui.sloth.webauthn.f) parcelable5;
                }
                xq0.q("can't get required parcelable register_webauthn_props");
                return null;
            case 10:
                ((Function0) this.receiver).invoke();
                return Unit.a;
            case 11:
                com.yandex.plus.bdui.flex.ui.n nVar = (com.yandex.plus.bdui.flex.ui.n) obj;
                nVar.getClass();
                ((com.yandex.plus.bdui.flex.ui.o) this.receiver).a(nVar);
                return Unit.a;
            case 12:
                com.yandex.plus.bdui.failure.d dVar3 = (com.yandex.plus.bdui.failure.d) obj;
                dVar3.getClass();
                return ((com.yandex.plus.bdui.plus.e) this.receiver).a(dVar3);
            case 13:
                String str = (String) obj;
                str.getClass();
                return ((com.yandex.plus.core.benchmark.c) ((com.yandex.plus.core.benchmark.x) this.receiver)).b(str);
            case 14:
                String str2 = (String) obj;
                str2.getClass();
                com.yandex.plus.bdui.plus.checkout.content.controller.l lVar = (com.yandex.plus.bdui.plus.checkout.content.controller.l) this.receiver;
                com.yandex.plus.log.api.b bVar2 = lVar.i;
                String str3 = lVar.o;
                lVar.o = str2;
                LinkedHashMap linkedHashMap = lVar.n;
                if (linkedHashMap == null || (b2Var = (b2) linkedHashMap.get(str2)) == null) {
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.d;
                    if (bVar2.b(aVar)) {
                        bVar2.c(aVar, "PlusPayCheckoutContentController", hrg.q("onPaymentMethodClick(); paymentMethodId ", str2, " not found"));
                    }
                } else {
                    com.yandex.plus.bdui.content.d dVar4 = lVar.l;
                    if (dVar4 != null) {
                        x97.y(lVar.j, null, null, new com.yandex.passport.sloth.ui.p(lVar, dVar4, str2, str3, b2Var, (Continuation) null, 1), 3);
                    } else {
                        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.d;
                        if (bVar2.b(aVar2)) {
                            bVar2.c(aVar2, "PlusPayCheckoutContentController", "onPaymentMethodClick(); update is null!");
                        }
                    }
                }
                return Unit.a;
            case 15:
                int intValue = ((Number) obj).intValue();
                com.yandex.plus.bdui.plus.checkout.content.controller.u uVar = (com.yandex.plus.bdui.plus.checkout.content.controller.u) this.receiver;
                com.yandex.plus.log.api.b bVar3 = uVar.f;
                com.yandex.plus.bdui.content.d dVar5 = uVar.h;
                if (dVar5 != null) {
                    com.yandex.plus.bdui.content.a aVar3 = dVar5.b;
                    Map b = tah.b(new Pair("counterOfferIndex", Integer.valueOf(intValue)));
                    com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                    if (bVar3.b(aVar4)) {
                        StringBuilder q = k5r.q(intValue, "onOfferShow(", "); dispatch offer shown action = ");
                        q.append(((p3) aVar3).i);
                        q.append(" with payload ");
                        q.append(b);
                        bVar3.c(aVar4, "PlusPayCounterOffersContentController", q.toString());
                    }
                    uVar.e(dVar5, ((p3) aVar3).i, b);
                } else {
                    com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.d;
                    if (bVar3.b(aVar5)) {
                        bVar3.c(aVar5, "PlusPayCounterOffersContentController", dfi.c(intValue, "onOfferShow(", "); update is null!"));
                    }
                }
                return Unit.a;
            case 16:
                int intValue2 = ((Number) obj).intValue();
                com.yandex.plus.bdui.plus.checkout.content.controller.u uVar2 = (com.yandex.plus.bdui.plus.checkout.content.controller.u) this.receiver;
                com.yandex.plus.log.api.b bVar4 = uVar2.f;
                com.yandex.plus.bdui.content.d dVar6 = uVar2.h;
                if (dVar6 != null) {
                    com.yandex.plus.bdui.content.a aVar6 = dVar6.b;
                    Map b2 = tah.b(new Pair("counterOfferIndex", Integer.valueOf(intValue2)));
                    com.yandex.plus.log.api.a aVar7 = com.yandex.plus.log.api.a.c;
                    if (bVar4.b(aVar7)) {
                        StringBuilder q2 = k5r.q(intValue2, "onOfferClick(", "); dispatch offer click action = ");
                        q2.append(((p3) aVar6).j);
                        q2.append(" with payload ");
                        q2.append(b2);
                        bVar4.c(aVar7, "PlusPayCounterOffersContentController", q2.toString());
                    }
                    uVar2.e(dVar6, ((p3) aVar6).j, b2);
                } else {
                    com.yandex.plus.log.api.a aVar8 = com.yandex.plus.log.api.a.d;
                    if (bVar4.b(aVar8)) {
                        bVar4.c(aVar8, "PlusPayCounterOffersContentController", dfi.c(intValue2, "onOfferClick(", "); update is null!"));
                    }
                }
                return Unit.a;
            case 17:
                obj.getClass();
                ((com.yandex.plus.core.templating.template.a) this.receiver).getClass();
                return com.yandex.plus.core.templating.template.a.f(obj);
            case 18:
                obj.getClass();
                ((com.yandex.plus.core.templating.template.a) this.receiver).getClass();
                return com.yandex.plus.core.templating.template.a.l(obj);
            case 19:
                obj.getClass();
                ((com.yandex.plus.core.templating.template.a) this.receiver).getClass();
                return com.yandex.plus.core.templating.template.a.d(obj);
            case 20:
                obj.getClass();
                ((com.yandex.plus.core.templating.template.a) this.receiver).getClass();
                return com.yandex.plus.core.templating.template.a.e(obj);
            case 21:
                obj.getClass();
                ((com.yandex.plus.core.templating.template.a) this.receiver).getClass();
                return com.yandex.plus.core.templating.template.a.k(obj);
            case 22:
                obj.getClass();
                ((com.yandex.plus.core.templating.template.a) this.receiver).getClass();
                return com.yandex.plus.core.templating.template.a.i(obj);
            case 23:
                obj.getClass();
                ((com.yandex.plus.core.templating.template.a) this.receiver).getClass();
                return com.yandex.plus.core.templating.template.a.j(obj);
            case 24:
                obj.getClass();
                ((com.yandex.plus.core.templating.template.a) this.receiver).getClass();
                return com.yandex.plus.core.templating.template.a.c(obj);
            case 25:
                obj.getClass();
                ((com.yandex.plus.core.templating.template.a) this.receiver).getClass();
                return com.yandex.plus.core.templating.template.a.h(obj);
            case 26:
                obj.getClass();
                ((com.yandex.plus.core.templating.template.a) this.receiver).getClass();
                return com.yandex.plus.core.templating.template.a.g(obj);
            case 27:
                obj.getClass();
                ((com.yandex.plus.core.templating.template.a) this.receiver).getClass();
                return com.yandex.plus.core.templating.template.a.d(obj);
            case com.yandex.pulse.metrics.o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                obj.getClass();
                ((com.yandex.plus.core.templating.template.a) this.receiver).getClass();
                return com.yandex.plus.core.templating.template.a.b(obj);
            default:
                obj.getClass();
                ((com.yandex.plus.core.templating.template.a) this.receiver).getClass();
                return com.yandex.plus.core.templating.template.a.f(obj);
        }
    }
}
