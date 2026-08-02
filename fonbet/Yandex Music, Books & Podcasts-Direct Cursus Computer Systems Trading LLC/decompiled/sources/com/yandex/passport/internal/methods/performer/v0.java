package com.yandex.passport.internal.methods.performer;

import android.view.View;
import com.yandex.passport.R;
import com.yandex.passport.internal.methods.t4;
import com.yandex.passport.internal.methods.z3;
import defpackage.a0g;
import defpackage.b0o;
import defpackage.d43;
import defpackage.d85;
import defpackage.fae;
import defpackage.hq5;
import defpackage.i95;
import defpackage.irf;
import defpackage.j95;
import defpackage.n5g;
import defpackage.oq5;
import defpackage.rqv;
import defpackage.rvf;
import defpackage.uah;
import defpackage.w4f;
import defpackage.z7l;
import java.util.ArrayList;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final /* synthetic */ class v0 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ v0(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Pair pair;
        switch (this.a) {
            case 0:
                com.yandex.passport.internal.provider.a aVar = (com.yandex.passport.internal.provider.a) obj;
                aVar.getClass();
                ((z3) obj2).getClass();
                try {
                    return aVar.i.a();
                } catch (JSONException e) {
                    com.yandex.passport.legacy.a.c("getDebugJSon()", e);
                    throw new com.yandex.passport.api.exception.t(e);
                }
            case 1:
                com.yandex.passport.internal.provider.a aVar2 = (com.yandex.passport.internal.provider.a) obj;
                aVar2.getClass();
                ((t4) obj2).getClass();
                com.yandex.passport.internal.storage.m mVar = aVar2.a;
                return (Boolean) mVar.h.getValue(mVar, com.yandex.passport.internal.storage.m.m[6]);
            case 2:
                hq5 hq5Var = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                com.yandex.passport.internal.ui.a.i(null, null, false, hq5Var, 0, 7);
                return Unit.a;
            case 3:
                hq5 hq5Var2 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        return Unit.a;
                    }
                }
                fae.a(a0g.E(R.drawable.passport_ic_arrow_back, 0, hq5Var2), rvf.M(R.string.passport_common_back_button_content_description, hq5Var2), null, ((i95) ((oq5) hq5Var2).j(j95.a)).a, hq5Var2, 0, 4);
                return Unit.a;
            case 4:
                hq5 hq5Var3 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var3 = (oq5) hq5Var3;
                    if (oq5Var3.z()) {
                        oq5Var3.S();
                        return Unit.a;
                    }
                }
                irf.r(a0g.E(R.drawable.passport_bottomsheet_pin, 0, hq5Var3), null, null, null, null, 0.0f, new d43(d85.b(d85.f, 0.45f, 0.0f, 0.0f, 0.0f, 14), 5), hq5Var3, 1572912, 60);
                return Unit.a;
            case 5:
                ((Integer) obj2).getClass();
                oq5 oq5Var4 = (oq5) ((hq5) obj);
                oq5Var4.Z(1371407857);
                WeakHashMap weakHashMap = rqv.w;
                n5g n5gVar = new n5g(z7l.h(oq5Var4).k, 16);
                oq5Var4.p(false);
                return n5gVar;
            case 6:
                hq5 hq5Var4 = (hq5) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    oq5 oq5Var5 = (oq5) hq5Var4;
                    if (oq5Var5.z()) {
                        oq5Var5.S();
                        return Unit.a;
                    }
                }
                fae.a(a0g.E(R.drawable.passport_error_slab_copy, 0, hq5Var4), null, null, ((i95) ((oq5) hq5Var4).j(j95.a)).f, hq5Var4, 48, 4);
                return Unit.a;
            case 7:
                com.yandex.plus.bdui.query.g gVar = (com.yandex.plus.bdui.query.g) obj;
                com.yandex.plus.bdui.query.g gVar2 = (com.yandex.plus.bdui.query.g) obj2;
                gVar.getClass();
                gVar2.getClass();
                return Boolean.valueOf(com.yandex.plus.bdui.query.h.a(gVar, gVar2));
            case 8:
                ((com.yandex.plus.bdui.plus.action.a0) obj).getClass();
                ((com.yandex.plus.bdui.query.b) obj2).getClass();
                return null;
            case 9:
                ((com.yandex.plus.bdui.s) obj).getClass();
                ((com.yandex.plus.bdui.m) obj2).getClass();
                return new com.yandex.plus.bdui.plus.checkout.content.controller.g0();
            case 10:
                b0o b0oVar = (b0o) obj;
                String str = (String) obj2;
                b0oVar.getClass();
                str.getClass();
                b0oVar.d("Authorization", "OAuth ".concat(str));
                return b0oVar;
            case 11:
                return new com.yandex.plus.bdui.plus.checkout.content.n((com.yandex.plus.bdui.action.a) obj2);
            case 12:
                Map map = (Map) obj2;
                ((String) obj).getClass();
                map.getClass();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        ((String) key).getClass();
                        Object t = com.yandex.plus.bdui.plus.analytics.b.t((w4f) value);
                        if (t != null) {
                            pair = new Pair(key, t);
                            if (pair == null) {
                                arrayList.add(pair);
                            }
                        }
                    }
                    pair = null;
                    if (pair == null) {
                    }
                }
                if (arrayList.isEmpty()) {
                    arrayList = null;
                }
                if (arrayList != null) {
                    return uah.n(arrayList);
                }
                return null;
            case 13:
                View view = (View) obj;
                float floatValue = ((Float) obj2).floatValue();
                view.getClass();
                view.setTranslationX(floatValue);
                view.setTranslationY(floatValue);
                return Unit.a;
            case 14:
                View view2 = (View) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                view2.getClass();
                view2.setTranslationX(-floatValue2);
                view2.setTranslationY(floatValue2);
                return Unit.a;
            case 15:
                View view3 = (View) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                view3.getClass();
                view3.setTranslationX(floatValue3);
                return Unit.a;
            case 16:
                View view4 = (View) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                view4.getClass();
                view4.setTranslationY(floatValue4);
                return Unit.a;
            case 17:
                b0o b0oVar2 = (b0o) obj;
                String str2 = (String) obj2;
                b0oVar2.getClass();
                str2.getClass();
                b0oVar2.d("Authorization", "OAuth ".concat(str2));
                return b0oVar2;
            case 18:
                ((com.yandex.plus.pay.api.exception.a) obj2).getClass();
                return Unit.a;
            case 19:
                b0o b0oVar3 = (b0o) obj;
                String str3 = (String) obj2;
                b0oVar3.getClass();
                str3.getClass();
                b0oVar3.d("Authorization", "OAuth ".concat(str3));
                b0oVar3.d("X-OAuth-Token", str3);
                return b0oVar3;
            case 20:
                com.yandex.plus.plaquesdk.plaque.api.models.x xVar = (com.yandex.plus.plaquesdk.plaque.api.models.x) obj;
                com.yandex.plus.plaquesdk.plaque.api.models.x xVar2 = (com.yandex.plus.plaquesdk.plaque.api.models.x) obj2;
                xVar.getClass();
                xVar2.getClass();
                return Boolean.valueOf(Intrinsics.d(xVar.getId(), xVar2.getId()));
            default:
                com.yandex.plus.plaquesdk.plaque.api.models.x xVar3 = (com.yandex.plus.plaquesdk.plaque.api.models.x) obj;
                com.yandex.plus.plaquesdk.plaque.api.models.x xVar4 = (com.yandex.plus.plaquesdk.plaque.api.models.x) obj2;
                xVar3.getClass();
                xVar4.getClass();
                return Boolean.valueOf(Intrinsics.d(xVar3, xVar4));
        }
    }
}
