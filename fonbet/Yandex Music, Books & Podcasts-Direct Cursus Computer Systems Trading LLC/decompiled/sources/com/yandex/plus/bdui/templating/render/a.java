package com.yandex.plus.bdui.templating.render;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.webkit.PermissionRequest;
import com.yandex.passport.data.network.l;
import com.yandex.plus.core.debug.panel.internal.presentation.view.o;
import com.yandex.plus.core.network.error.k;
import com.yandex.plus.core.templating.render.n;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.GiftProgressView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.pluspoints.PlusPanelTextWithIconView;
import com.yandex.plus.home.internal.di.y;
import com.yandex.plus.pay.api.model.PlusPayCompositeUpsale;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.j;
import com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.i;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.s;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.u;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.h0;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.w;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.m;
import defpackage.c5b;
import defpackage.cz0;
import defpackage.e3o;
import defpackage.e5b;
import defpackage.ezc;
import defpackage.f1d;
import defpackage.omb;
import defpackage.ot0;
import defpackage.s9f;
import defpackage.t75;
import defpackage.tf6;
import defpackage.x97;
import defpackage.xdr;
import defpackage.ze1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(Function2 function2, k kVar) {
        this.a = 2;
        this.b = (ezc) function2;
        this.c = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v24, types: [ezc, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r6v3, types: [ezc, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v5, types: [c5b] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Integer intOrNull;
        int i = this.a;
        int i2 = 1;
        Object[] objArr = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                String str = (String) obj;
                str.getClass();
                g a = d.a(((com.yandex.plus.bdui.plus.templating.render.a) obj4).b, str);
                ArrayList arrayList = a instanceof e ? ((e) a).a : null;
                if (arrayList != null) {
                    linkedHashSet.addAll(com.yandex.plus.core.templating.render.a.a(arrayList));
                    break;
                }
                break;
            case 1:
                Function1 function1 = (Function1) obj4;
                boolean[] zArr = (boolean[]) obj3;
                s9f[] s9fVarArr = o.I;
                ((List) obj).getClass();
                int length = zArr.length;
                if (length == 0) {
                    obj2 = c5b.a;
                } else if (length != 1) {
                    obj2 = new ArrayList(zArr.length);
                    for (boolean z : zArr) {
                        obj2.add(Boolean.valueOf(z));
                    }
                } else {
                    obj2 = t75.c(Boolean.valueOf(zArr[0]));
                }
                function1.invoke(obj2);
                break;
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                break;
            case 3:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                break;
            case 4:
                LinkedHashSet linkedHashSet2 = (LinkedHashSet) obj3;
                String str2 = (String) obj;
                str2.getClass();
                ArrayList r = ((com.yandex.plus.bdui.plus.content.controller.f) ((n) obj4).a).r(str2);
                if (!r.isEmpty() && !r.isEmpty()) {
                    Iterator it = r.iterator();
                    while (it.hasNext()) {
                        if (!(((com.yandex.plus.core.templating.template.d) it.next()) instanceof com.yandex.plus.core.templating.template.b)) {
                            linkedHashSet2.addAll(com.yandex.plus.core.templating.render.a.a(r));
                            break;
                        }
                    }
                }
                break;
            case 5:
                ((WeakHashMap) ((l) obj4).a).put((View) obj3, null);
                break;
            case 6:
                Float f = (Float) obj;
                f.getClass();
                ((Function2) obj4).invoke((View) obj3, f);
                break;
            case 7:
                com.yandex.plus.home.feature.panel.internalapi.analytics.b bVar = (com.yandex.plus.home.feature.panel.internalapi.analytics.b) obj;
                bVar.getClass();
                String str3 = ((com.yandex.plus.home.feature.panel.internal.shortcuts.daily.analytics.a) obj4).a;
                String str4 = ((com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.c) obj3).a;
                str4.getClass();
                omb ombVar = ((com.yandex.plus.home.analytics.b) bVar).a;
                int intValue = (str3 == null || (intOrNull = StringsKt.toIntOrNull(str3)) == null) ? -1 : intOrNull.intValue();
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                ombVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("counter_val", String.valueOf(intValue));
                linkedHashMap.put("origin", e5bVar);
                linkedHashMap.put("shortcut_id", str4);
                linkedHashMap.put("_meta", omb.a(1, new HashMap()));
                ombVar.d("PlusPult.DailyWidget.Bottom.Clicked", linkedHashMap);
                break;
            case 8:
                GiftProgressView giftProgressView = (GiftProgressView) obj4;
                com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.d dVar = (com.yandex.plus.home.feature.panel.internalapi.shortcuts.daily.progress.d) obj3;
                float floatValue = ((Float) obj).floatValue();
                int i3 = GiftProgressView.n;
                giftProgressView.q(dVar, floatValue);
                giftProgressView.r(dVar, floatValue);
                giftProgressView.invalidate();
                break;
            case 9:
                PlusPanelTextWithIconView plusPanelTextWithIconView = (PlusPanelTextWithIconView) obj4;
                Paint paint = plusPanelTextWithIconView.d;
                Context context = (Context) obj3;
                TypedArray typedArray = (TypedArray) obj;
                int i4 = PlusPanelTextWithIconView.t;
                typedArray.getClass();
                int resourceId = typedArray.getResourceId(0, 0);
                if (resourceId > 0) {
                    paint.setTypeface(e3o.a(context, resourceId));
                }
                context.getResources().getClass();
                paint.setTextSize(typedArray.getDimension(1, (int) (32 * r1.getDisplayMetrics().scaledDensity)));
                Drawable drawable = typedArray.getDrawable(2);
                plusPanelTextWithIconView.g = drawable;
                if (drawable != null) {
                    float f2 = paint.getFontMetrics().descent - paint.getFontMetrics().ascent;
                    drawable.setBounds(0, 0, (int) ((f2 / drawable.getIntrinsicHeight()) * drawable.getIntrinsicWidth()), (int) f2);
                    break;
                }
                break;
            case 10:
                x97.y((tf6) obj4, null, null, new ze1(((Boolean) obj).booleanValue(), (com.yandex.plus.core.analytics.metrica.f) obj3, (Continuation) null), 3);
                break;
            case 11:
                String str5 = (String) obj3;
                Exception exc = (Exception) obj;
                exc.getClass();
                com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) ((y) obj4).b;
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                if (bVar2.b(aVar)) {
                    bVar2.a(aVar, "IntentPlusPayUrlLauncher", f1d.g("No application found to handle the link: ", str5), exc);
                }
                break;
            case 12:
                com.yandex.plus.core.debug.panel.internal.presentation.adapter.b bVar3 = (com.yandex.plus.core.debug.panel.internal.presentation.adapter.b) obj3;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.d dVar2 = ((com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale.d) obj4).u;
                if (dVar2 != null) {
                    ((ezc) bVar3.h).invoke(dVar2.b.a, bool);
                }
                break;
            case 13:
                u uVar = (u) obj4;
                com.yandex.plus.bdui.l lVar = (com.yandex.plus.bdui.l) obj;
                lVar.getClass();
                x97.y(ot0.F(uVar), null, null, new s(uVar, objArr == true ? 1 : 0, i2), 3);
                ((Function1) obj3).invoke(lVar);
                break;
            case 14:
                h0 h0Var = (h0) obj4;
                i iVar = (i) obj;
                xdr xdrVar = h0Var.B;
                String str6 = iVar.a;
                str6.getClass();
                w wVar = new w(str6, false);
                xdrVar.getClass();
                xdrVar.m(null, wVar);
                h0Var.J.a(((com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a) obj3).b.a, iVar.a);
                break;
            case 15:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.l lVar2 = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.l) obj4;
                j jVar = ((com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a) obj3).b;
                String str7 = ((i) obj).a;
                lVar2.t.a(jVar.a, str7);
                xdr xdrVar2 = lVar2.u;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.f fVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.f(str7, false, lVar2.a(jVar));
                xdrVar2.getClass();
                xdrVar2.m(null, fVar);
                break;
            case 16:
                m mVar = (m) obj4;
                String str8 = ((i) obj).a;
                mVar.x.a(((PlusPayCompositeUpsale) obj3).getOffer(), str8);
                xdr xdrVar3 = mVar.y;
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.e eVar = new com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale.e(str8);
                xdrVar3.getClass();
                xdrVar3.m(null, eVar);
                break;
            default:
                PermissionRequest permissionRequest = (PermissionRequest) obj4;
                cz0 cz0Var = (cz0) obj3;
                Map map = (Map) obj;
                map.getClass();
                for (Map.Entry entry : map.entrySet()) {
                    String str9 = (String) entry.getKey();
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        String str10 = Intrinsics.d(str9, "android.permission.CAMERA") ? "android.webkit.resource.VIDEO_CAPTURE" : null;
                        if (str10 != null) {
                            cz0Var.add(str10);
                        }
                    }
                }
                permissionRequest.grant((String[]) cz0Var.toArray(new String[0]));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ a(PermissionRequest permissionRequest, cz0 cz0Var, com.yandex.passport.internal.ui.challenge.vpn.d dVar) {
        this.a = 17;
        this.b = permissionRequest;
        this.c = cz0Var;
    }

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
