package com.yandex.plus.bdui.plus.analytics;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceResponse;
import android.widget.Toast;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.data.common.j;
import com.yandex.plus.core.data.common.k;
import com.yandex.plus.core.data.common.o;
import com.yandex.plus.core.data.common.r;
import com.yandex.plus.core.data.common.s;
import com.yandex.plus.core.data.pay.p;
import com.yandex.plus.core.data.pay.u;
import com.yandex.plus.core.graphql.type.r0;
import com.yandex.plus.core.graphql.type.t0;
import com.yandex.plus.core.graphql.type.w0;
import com.yandex.plus.core.network.error.l;
import com.yandex.plus.pay.api.feature.tarifficator.payment.i;
import com.yandex.plus.pay.api.feature.tarifficator.payment.m;
import com.yandex.plus.pay.api.feature.tarifficator.payment.n;
import com.yandex.plus.pay.repository.api.model.offers.l1;
import defpackage.b6e;
import defpackage.c4f;
import defpackage.cg6;
import defpackage.dfi;
import defpackage.dzf;
import defpackage.ern;
import defpackage.eta;
import defpackage.ezf;
import defpackage.f1d;
import defpackage.fv;
import defpackage.m5f;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.ome;
import defpackage.pkr;
import defpackage.q5f;
import defpackage.qgg;
import defpackage.qyf;
import defpackage.r7o;
import defpackage.saf;
import defpackage.swf;
import defpackage.t7g;
import defpackage.t7o;
import defpackage.tah;
import defpackage.tkb;
import defpackage.uah;
import defpackage.v6f;
import defpackage.v75;
import defpackage.vkb;
import defpackage.w3f;
import defpackage.w4f;
import defpackage.wis;
import defpackage.wkb;
import defpackage.wqn;
import defpackage.x3f;
import defpackage.x4f;
import defpackage.xq0;
import defpackage.y2x;
import defpackage.z75;
import defpackage.z7o;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData$UgcLiveStatus;

/* loaded from: classes4.dex */
public abstract class b {
    public static final Object A(w4f w4fVar) {
        w4fVar.getClass();
        if (w4fVar.equals(m5f.INSTANCE)) {
            return null;
        }
        if (w4fVar instanceof v6f) {
            v6f v6fVar = (v6f) w4fVar;
            ome omeVar = x4f.a;
            Object b = pkr.b(v6fVar.a());
            return (b == null && (b = x4f.e(v6fVar)) == null && (b = x4f.h(v6fVar)) == null && (b = kotlin.text.b.i(v6fVar.a())) == null) ? v6fVar.a() : b;
        }
        if (!(w4fVar instanceof c4f)) {
            if (w4fVar instanceof q5f) {
                return O((q5f) w4fVar);
            }
            b6e.s();
            return null;
        }
        c4f c4fVar = (c4f) w4fVar;
        ArrayList arrayList = new ArrayList(v75.o(c4fVar, 10));
        Iterator it = c4fVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(A((w4f) it.next()));
        }
        return arrayList;
    }

    public static final Drawable B(k kVar, float f, float f2, float f3, float f4) {
        Drawable D;
        kVar.getClass();
        if (kVar instanceof com.yandex.plus.core.data.common.f) {
            D = new ColorDrawable(((com.yandex.plus.core.data.common.f) kVar).b);
        } else {
            if (!(kVar instanceof j)) {
                b6e.s();
                return null;
            }
            D = D(((j) kVar).b);
        }
        Drawable drawable = D;
        drawable.getClass();
        return e(f, f2, f3, f4) ? new com.yandex.plus.home.common.utils.k(drawable, f, f2, f3, f4) : drawable;
    }

    public static final Drawable C(k kVar, int i, float f, float f2, float f3, float f4) {
        if (kVar != null) {
            return B(kVar, f, f2, f3, f4);
        }
        ColorDrawable colorDrawable = new ColorDrawable(i);
        return e(f, f2, f3, f4) ? new com.yandex.plus.home.common.utils.k(colorDrawable, f, f2, f3, f4) : colorDrawable;
    }

    public static final com.yandex.plus.core.gradient.api.e D(List list) {
        Object fVar;
        list.getClass();
        List<s> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (s sVar : list2) {
            if (sVar instanceof o) {
                o oVar = (o) sVar;
                fVar = new com.yandex.plus.core.gradient.api.b((float) oVar.d, oVar.b, J(oVar.c));
            } else {
                if (!(sVar instanceof r)) {
                    b6e.s();
                    return null;
                }
                r rVar = (r) sVar;
                Pair pair = rVar.e;
                PointF pointF = new PointF((float) ((Number) pair.a).doubleValue(), (float) ((Number) pair.b).doubleValue());
                Pair pair2 = rVar.d;
                fVar = new com.yandex.plus.core.gradient.api.f(pointF, new PointF((float) ((Number) pair2.a).doubleValue(), (float) ((Number) pair2.b).doubleValue()), rVar.b, J(rVar.c));
            }
            arrayList.add(fVar);
        }
        return arrayList.size() == 1 ? (com.yandex.plus.core.gradient.api.e) arrayList.get(0) : new com.yandex.plus.core.gradient.api.d(0, arrayList);
    }

    public static /* synthetic */ Drawable E(k kVar, int i, float f, float f2, float f3, float f4, int i2) {
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            f4 = 0.0f;
        }
        return C(kVar, i, f, f2, f3, f4);
    }

    public static final Drawable F(k kVar, Context context, int i) {
        kVar.getClass();
        context.getClass();
        if (kVar instanceof com.yandex.plus.core.data.common.f) {
            Drawable drawable = context.getDrawable(i);
            if (drawable == null) {
                return null;
            }
            drawable.setTint(((com.yandex.plus.core.data.common.f) kVar).b);
            return drawable;
        }
        if (!(kVar instanceof j)) {
            b6e.s();
            return null;
        }
        Drawable drawable2 = context.getDrawable(i);
        if (drawable2 == null) {
            return null;
        }
        drawable2.setTint(((Number) CollectionsKt.Q(((s) CollectionsKt.Q(((j) kVar).b)).d())).intValue());
        return drawable2;
    }

    public static tkb G(com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.d dVar) {
        dVar.getClass();
        int ordinal = dVar.ordinal();
        if (ordinal == 0) {
            return tkb.Host;
        }
        if (ordinal == 1) {
            return tkb.Native;
        }
        if (ordinal == 2) {
            return tkb.Web;
        }
        b6e.s();
        return null;
    }

    public static final vkb H(com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.b bVar) {
        bVar.getClass();
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            return null;
        }
        if (ordinal == 1) {
            return vkb.Option;
        }
        if (ordinal == 2) {
            return vkb.Tariff;
        }
        b6e.s();
        return null;
    }

    public static wkb I(com.yandex.plus.home.feature.webviews.internalapi.analytics.payment.f fVar) {
        fVar.getClass();
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            return wkb.Host;
        }
        if (ordinal == 1) {
            return wkb.Native;
        }
        if (ordinal == 2) {
            return wkb.Web;
        }
        if (ordinal == 3) {
            return wkb.InApp;
        }
        b6e.s();
        return null;
    }

    public static final ArrayList J(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf((float) ((Number) it.next()).doubleValue()));
        }
        return arrayList;
    }

    public static final w4f K(Object obj) {
        if (obj instanceof Number) {
            return x4f.b((Number) obj);
        }
        if (obj instanceof Boolean) {
            return x4f.a((Boolean) obj);
        }
        if (obj instanceof String) {
            return x4f.c((String) obj);
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                arrayList.add(K(obj2));
            }
            return new c4f(arrayList);
        }
        if (!(obj instanceof Collection)) {
            return obj instanceof Map ? L((Map) obj) : obj instanceof w4f ? (w4f) obj : m5f.INSTANCE;
        }
        Collection collection = (Collection) obj;
        ArrayList arrayList2 = new ArrayList(v75.o(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(K(it.next()));
        }
        return new c4f(arrayList2);
    }

    public static final q5f L(Map map) {
        map.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            String str = key instanceof String ? (String) key : null;
            Pair pair = str != null ? new Pair(str, K(value)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return new q5f(uah.n(arrayList));
    }

    public static final String M(u uVar) {
        uVar.getClass();
        if (uVar.equals(com.yandex.plus.core.data.pay.h.INSTANCE)) {
            return UgcLiveVideoData$UgcLiveStatus.CANCELLED;
        }
        if (uVar instanceof com.yandex.plus.core.data.pay.k) {
            StringBuilder sb = new StringBuilder("error: message=");
            com.yandex.plus.core.data.pay.k kVar = (com.yandex.plus.core.data.pay.k) uVar;
            sb.append(kVar.a);
            sb.append(", code=");
            sb.append(kVar.b);
            sb.append(", status=");
            sb.append(kVar.c);
            sb.append(", kind=");
            sb.append(kVar.d);
            return sb.toString();
        }
        if (!(uVar instanceof com.yandex.plus.core.data.pay.o)) {
            if (uVar.equals(p.INSTANCE)) {
                return "started";
            }
            if (!(uVar instanceof com.yandex.plus.core.data.pay.s)) {
                b6e.s();
                return null;
            }
            return "success: " + ((com.yandex.plus.core.data.pay.s) uVar).b.getId();
        }
        StringBuilder sb2 = new StringBuilder("not terminal error: message=");
        com.yandex.plus.core.data.pay.o oVar = (com.yandex.plus.core.data.pay.o) uVar;
        sb2.append(oVar.a);
        sb2.append(", code=");
        sb2.append(oVar.b);
        sb2.append(", status=");
        sb2.append(oVar.c);
        sb2.append(", kind=");
        sb2.append(oVar.d);
        return sb2.toString();
    }

    public static final String N(t0 t0Var) {
        t0Var.getClass();
        StringBuilder sb = new StringBuilder("appVersion=");
        sb.append((String) t0Var.b.H());
        sb.append(", sdkVersion=");
        sb.append((String) t0Var.v.H());
        sb.append(", service=");
        sb.append(t0Var.x);
        sb.append(", consumerType=");
        com.yandex.plus.core.graphql.type.h hVar = (com.yandex.plus.core.graphql.type.h) t0Var.d.H();
        sb.append(hVar != null ? hVar.name() : null);
        sb.append(", place=");
        sb.append((String) t0Var.r.H());
        sb.append(", message=");
        sb.append((String) t0Var.o.H());
        sb.append(", language=");
        sb.append(t0Var.k);
        sb.append(", testIds=");
        sb.append(t0Var.A.H());
        sb.append(", location=");
        eta.q(t0Var.m.H());
        sb.append((String) null);
        sb.append(", appMetricaUUID=");
        sb.append((String) t0Var.a.H());
        return sb.toString();
    }

    public static final LinkedHashMap O(q5f q5fVar) {
        q5fVar.getClass();
        Map map = q5fVar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), A((w4f) entry.getValue()));
        }
        return linkedHashMap;
    }

    public static final int P(k kVar) {
        if (kVar instanceof com.yandex.plus.core.data.common.f) {
            return ((com.yandex.plus.core.data.common.f) kVar).b;
        }
        if (kVar instanceof j) {
            return ((Number) CollectionsKt.Q(((s) CollectionsKt.Q(((j) kVar).b)).d())).intValue();
        }
        return 0;
    }

    public static final l1 Q(w0 w0Var) {
        w0Var.getClass();
        int ordinal = w0Var.ordinal();
        if (ordinal == 0) {
            return l1.a;
        }
        if (ordinal == 1) {
            return l1.c;
        }
        if (ordinal == 2) {
            return l1.b;
        }
        if (ordinal == 3) {
            throw new com.yandex.plus.core.graphql.exception.d("Unexpected UPSALE_STEP_VIEW value", null);
        }
        b6e.s();
        return null;
    }

    public static final Intent a(Intent intent, String str) {
        intent.getClass();
        str.getClass();
        Intent putExtra = intent.putExtra("INSTANCE_ID", str);
        putExtra.getClass();
        return putExtra;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [t7o] */
    public static final String b(String str, UUID uuid) {
        String t7oVar;
        Uri parse;
        str.getClass();
        uuid.getClass();
        try {
            r7o r7oVar = z7o.b;
            parse = Uri.parse(str);
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (parse.getQueryParameterNames().contains("crossSessionId")) {
            return str;
        }
        t7oVar = parse.buildUpon().appendQueryParameter("crossSessionId", uuid.toString()).build().toString();
        if (!(t7oVar instanceof t7o)) {
            str = t7oVar;
        }
        return str;
    }

    public static final com.yandex.plus.core.network.call.a c(l lVar) {
        lVar.getClass();
        return new com.yandex.plus.core.network.call.a(lVar);
    }

    public static void d(mm6 mm6Var) {
        mm6Var.getClass();
        saf.D(mm6Var.getCoroutineContext(), null);
    }

    public static final boolean e(float... fArr) {
        boolean z;
        boolean z2;
        int length = fArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (fArr[i] < 0.0f) {
                z = false;
                break;
            }
            i++;
        }
        int length2 = fArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                z2 = false;
                break;
            }
            if (fArr[i2] > 0.0f) {
                z2 = true;
                break;
            }
            i2++;
        }
        return z && z2;
    }

    public static final int f(int i, View view) {
        Context context = view.getContext();
        context.getClass();
        return context.getColor(i);
    }

    public static final void g(Context context, String str) {
        context.getClass();
        str.getClass();
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(ClipboardManager.class);
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(context.getString(R.string.plus_sdk_copied_info), str));
            Toast.makeText(context, context.getString(R.string.plus_sdk_debug_panel_copied), 0).show();
        }
    }

    public static com.yandex.plus.home.plaque.plugin.internal.proxy.a h(List list) {
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.yandex.plus.webview.api.contract.d) it.next()).getClass());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            z75.t(arrayList2, ((com.yandex.plus.webview.api.contract.d) it2.next()).r());
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            Class cls = (Class) next;
            if (!arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    if (cls.isAssignableFrom((Class) it4.next())) {
                        break;
                    }
                }
            }
            arrayList3.add(next);
        }
        if (!arrayList3.isEmpty()) {
            xq0.x(f1d.h("Required contracts ", " are not found", arrayList3));
            return null;
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : list2) {
            if (obj instanceof com.yandex.plus.webview.api.container.a) {
                arrayList4.add(obj);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            z75.t(arrayList5, ((com.yandex.plus.webview.api.container.a) it5.next()).n());
        }
        if (arrayList5.size() != CollectionsKt.A0(arrayList5).size()) {
            xq0.x("Multiple contracts cannot control one WebView container");
            return null;
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj2 : list2) {
            if (obj2 instanceof com.yandex.plus.webview.internal.insets.c) {
                arrayList6.add(obj2);
            }
        }
        if (arrayList6.size() <= 1) {
            return new com.yandex.plus.home.plaque.plugin.internal.proxy.a(25, list);
        }
        xq0.x("Multiple contracts cannot control WebView insets");
        return null;
    }

    public static final int i(int i, View view) {
        Context context = view.getContext();
        context.getClass();
        return context.getResources().getDimensionPixelSize(i);
    }

    public static final WebResourceResponse j() {
        return new WebResourceResponse("text/html", "utf-8", new ByteArrayInputStream(new byte[0]));
    }

    public static final com.yandex.plus.bdui.analytics.c k(com.yandex.plus.bdui.analytics.c cVar, Function0 function0) {
        cVar.getClass();
        Map map = function0 != null ? (Map) function0.invoke() : null;
        if (map == null) {
            return cVar;
        }
        Map w = r1.w(cVar.b, map, false);
        String str = cVar.a;
        str.getClass();
        return new com.yandex.plus.bdui.analytics.c(str, w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.fragment.app.t] */
    public static final ArrayList l(androidx.fragment.app.o oVar) {
        oVar.getClass();
        ArrayList arrayList = new ArrayList();
        while (oVar != null) {
            if (oVar instanceof androidx.fragment.app.o) {
                androidx.fragment.app.o oVar2 = oVar;
                androidx.fragment.app.o parentFragment = oVar2.getParentFragment();
                oVar = parentFragment == null ? oVar2.l() : parentFragment;
            } else {
                oVar = null;
            }
            com.yandex.plus.di.d dVar = oVar instanceof com.yandex.plus.di.d ? (com.yandex.plus.di.d) oVar : null;
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        return arrayList;
    }

    public static final String m(com.yandex.plus.pay.api.feature.tarifficator.payment.p pVar) {
        pVar.getClass();
        if (pVar instanceof n) {
            return "Waiting";
        }
        if (pVar instanceof m) {
            return "SyncWaiting";
        }
        if (pVar instanceof com.yandex.plus.pay.api.feature.tarifficator.payment.j) {
            return "CompleteWaiting";
        }
        if (pVar instanceof com.yandex.plus.pay.api.feature.tarifficator.payment.o) {
            StringBuilder sb = new StringBuilder("WebAction(url=");
            com.yandex.plus.pay.api.feature.tarifficator.payment.o oVar = (com.yandex.plus.pay.api.feature.tarifficator.payment.o) pVar;
            sb.append(oVar.a);
            sb.append(", qrCodeParams=");
            sb.append(oVar.b);
            sb.append(')');
            return sb.toString();
        }
        if (pVar instanceof com.yandex.plus.pay.api.feature.tarifficator.payment.l) {
            return dfi.i(new StringBuilder("Success(invoiceId="), ((com.yandex.plus.pay.api.feature.tarifficator.payment.l) pVar).a, ')');
        }
        if (pVar instanceof com.yandex.plus.pay.api.feature.tarifficator.payment.k) {
            return "Error(reason=" + ((com.yandex.plus.pay.api.feature.tarifficator.payment.k) pVar).b + ')';
        }
        if (pVar instanceof i) {
            return "Cancel";
        }
        b6e.s();
        return null;
    }

    public static final qyf n(androidx.fragment.app.o oVar) {
        oVar.getClass();
        dzf viewLifecycleOwner = oVar.getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        return ezf.D(viewLifecycleOwner);
    }

    public static Object o(Object obj, Class cls, Function1 function1) {
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            ArrayList arrayList = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                arrayList.add(o(obj2, cls, function1));
            }
            return arrayList;
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            ArrayList arrayList2 = new ArrayList(v75.o(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList2.add(o(it.next(), cls, function1));
            }
            return arrayList2;
        }
        if (!(obj instanceof Map)) {
            return cls.isAssignableFrom(obj.getClass()) ? function1.invoke(obj) : obj;
        }
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), o(entry.getValue(), cls, function1));
        }
        return linkedHashMap;
    }

    public static void p(com.yandex.plus.pay.ui.common.api.b bVar) {
        ViewGroup viewGroup = (ViewGroup) bVar.findViewById(android.R.id.content);
        View inflate = LayoutInflater.from(bVar).inflate(R.layout.pay_sdk_view_debug_button, viewGroup, false);
        inflate.getClass();
        com.yandex.plus.core.insets.d dVar = new com.yandex.plus.core.insets.d(0);
        com.yandex.plus.core.insets.j jVar = com.yandex.plus.core.insets.j.b;
        com.yandex.plus.core.insets.a aVar = new com.yandex.plus.core.insets.a();
        aVar.b = new LinkedHashSet(2);
        aVar.d();
        aVar.c();
        dVar.b.put(jVar, aVar);
        dVar.b(inflate);
        r1.E(inflate, new com.yandex.plus.home.feature.webviews.internal.home.i(2, bVar));
        viewGroup.addView(inflate);
    }

    public static final boolean q(com.yandex.plus.pay.api.feature.tarifficator.payment.p pVar) {
        pVar.getClass();
        if ((pVar instanceof n) || (pVar instanceof m) || (pVar instanceof com.yandex.plus.pay.api.feature.tarifficator.payment.j) || (pVar instanceof com.yandex.plus.pay.api.feature.tarifficator.payment.o)) {
            return false;
        }
        if ((pVar instanceof com.yandex.plus.pay.api.feature.tarifficator.payment.l) || (pVar instanceof com.yandex.plus.pay.api.feature.tarifficator.payment.k) || (pVar instanceof i)) {
            return true;
        }
        b6e.s();
        return false;
    }

    public static final t0 r(t0 t0Var) {
        t0Var.getClass();
        return t0.a(t0Var, r1.K(r0.LIGHT));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s(w4f w4fVar, Function0 function0, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18) {
        Object invoke;
        Function1 function19 = function16;
        w4fVar.getClass();
        if (w4fVar.equals(m5f.INSTANCE)) {
            return function0.invoke();
        }
        if (!(w4fVar instanceof v6f)) {
            Function1 function110 = function14;
            Function1 function111 = function15;
            if (!(w4fVar instanceof c4f)) {
                if (w4fVar instanceof q5f) {
                    return function18.invoke(uah.n(r1.u((Map) w4fVar, new fv(function0, function1, function12, function13, function14, function15, function16, function17, function18))));
                }
                b6e.s();
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) w4fVar).iterator();
            while (it.hasNext()) {
                Object s = s((w4f) it.next(), function0, function1, function12, function13, function110, function111, function19, function17, function18);
                if (s != null) {
                    arrayList.add(s);
                }
                function110 = function14;
                function111 = function15;
                function19 = function16;
            }
            return function17.invoke(arrayList);
        }
        v6f v6fVar = (v6f) w4fVar;
        if (v6fVar.g()) {
            return function19.invoke(v6fVar.a());
        }
        ome omeVar = x4f.a;
        Boolean b = pkr.b(v6fVar.a());
        if (b != null && (invoke = function1.invoke(b)) != null) {
            return invoke;
        }
        Integer e = x4f.e(v6fVar);
        if (e != null) {
            return function12.invoke(e);
        }
        Long h = x4f.h(v6fVar);
        Object invoke2 = h != null ? function13.invoke(h) : null;
        if (invoke2 == null) {
            Float i = kotlin.text.b.i(v6fVar.a());
            if (i != null) {
                float floatValue = i.floatValue();
                w3f w3fVar = x3f.d;
                w4f S = t7g.S(w3fVar, Float.valueOf(floatValue), swf.g0(w3fVar.b, ern.c(Float.TYPE)));
                v6f v6fVar2 = S instanceof v6f ? (v6f) S : null;
                if (Intrinsics.d(v6fVar2 != null ? v6fVar2.a() : null, v6fVar.a())) {
                    invoke2 = function14.invoke(Float.valueOf(floatValue));
                    if (invoke2 == null) {
                        Double h2 = kotlin.text.b.h(v6fVar.a());
                        Object invoke3 = h2 != null ? function15.invoke(h2) : null;
                        return invoke3 == null ? function19.invoke(v6fVar.a()) : invoke3;
                    }
                }
            }
            invoke2 = null;
            if (invoke2 == null) {
            }
        }
        return invoke2;
    }

    public static final Object t(w4f w4fVar) {
        w4fVar.getClass();
        return s(w4fVar, new com.yandex.plus.core.graphql.daily.progress.s(11), new com.yandex.plus.bdui.plus.webview.navigation.a(5), new com.yandex.plus.bdui.plus.webview.navigation.a(6), new com.yandex.plus.bdui.plus.webview.navigation.a(7), new com.yandex.plus.bdui.plus.webview.navigation.a(8), new com.yandex.plus.bdui.plus.webview.navigation.a(9), new com.yandex.plus.bdui.plus.webview.navigation.a(10), new com.yandex.plus.bdui.plus.webview.navigation.a(11), new com.yandex.plus.bdui.plus.webview.navigation.a(12));
    }

    public static final String u(Activity activity) {
        Bundle extras;
        activity.getClass();
        Intent intent = activity.getIntent();
        String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("INSTANCE_ID");
        if (string != null) {
            return string;
        }
        xq0.q("instanceId must be passed as argument for Activity");
        return null;
    }

    public static final TypedValue v(int i, Resources.Theme theme) {
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, true);
        return typedValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v6, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0151 -> B:18:0x015d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object w(int i, long j, long j2, double d, com.yandex.plus.home.feature.webviews.internal.stories.m mVar, Function1 function1, cg6 cg6Var) {
        com.yandex.plus.home.common.utils.b bVar;
        int i2;
        long j3;
        double d2;
        Object obj;
        Function1 function12;
        wqn wqnVar;
        com.yandex.plus.home.common.utils.b bVar2;
        int i3;
        int i4;
        int i5;
        long j4;
        Function1 function13;
        int i6;
        long j5;
        long j6;
        double d3;
        Function1 function14;
        int i7;
        int i8;
        int i9;
        int i10;
        Throwable th;
        com.yandex.plus.home.common.utils.b bVar3;
        t7o t7oVar;
        com.yandex.plus.home.feature.webviews.internal.stories.m mVar2;
        int i11;
        com.yandex.plus.home.common.utils.b bVar4;
        com.yandex.plus.home.feature.webviews.internal.stories.m mVar3;
        Throwable a;
        long j7;
        wis e;
        try {
            if (cg6Var instanceof com.yandex.plus.home.common.utils.b) {
                bVar = (com.yandex.plus.home.common.utils.b) cg6Var;
                int i12 = bVar.v;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    bVar.v = i12 - Integer.MIN_VALUE;
                    Object obj2 = bVar.u;
                    nm6 nm6Var = nm6.a;
                    i2 = bVar.v;
                    if (i2 != 0) {
                        qgg.h0(obj2);
                        wqn wqnVar2 = new wqn();
                        j3 = j;
                        wqnVar2.a = j3;
                        d2 = d;
                        obj = mVar;
                        function12 = function1;
                        wqnVar = wqnVar2;
                        bVar2 = bVar;
                        i3 = i - 1;
                        i4 = 0;
                        i5 = i;
                        j4 = j2;
                        if (i4 < i3) {
                        }
                        return nm6Var;
                    }
                    if (i2 == 1) {
                        i10 = bVar.n;
                        i9 = bVar.m;
                        i8 = bVar.l;
                        i7 = bVar.k;
                        d3 = bVar.q;
                        j6 = bVar.p;
                        j5 = bVar.o;
                        i6 = bVar.j;
                        wqnVar = bVar.t;
                        function14 = bVar.s;
                        function13 = bVar.r;
                        try {
                            qgg.h0(obj2);
                            return obj2;
                        } catch (wis e2) {
                            e = e2;
                            r7o r7oVar = z7o.b;
                            bVar3 = bVar;
                            t7oVar = new t7o(e);
                            mVar2 = function13;
                            int i13 = i9;
                            int i14 = i10;
                            i11 = i8;
                            bVar4 = bVar3;
                            t7o t7oVar2 = t7oVar;
                            Function1 function15 = function14;
                            mVar3 = mVar2;
                            a = z7o.a(t7oVar2);
                            if (a != null) {
                            }
                            j7 = wqnVar.a;
                            bVar4.r = mVar3;
                            bVar4.s = function15;
                            bVar4.t = wqnVar;
                            bVar4.j = i6;
                            bVar4.o = j5;
                            bVar4.p = j6;
                            bVar4.q = d3;
                            bVar4.k = i7;
                            bVar4.l = i11;
                            bVar4.m = i13;
                            bVar4.n = i14;
                            bVar4.v = 2;
                            nm6Var = nm6Var;
                            if (y2x.o(j7, bVar4) != nm6Var) {
                            }
                            return nm6Var;
                        } catch (Throwable th2) {
                            th = th2;
                            r7o r7oVar2 = z7o.b;
                            bVar3 = bVar;
                            t7oVar = new t7o(th);
                            mVar2 = function13;
                            int i132 = i9;
                            int i142 = i10;
                            i11 = i8;
                            bVar4 = bVar3;
                            t7o t7oVar22 = t7oVar;
                            Function1 function152 = function14;
                            mVar3 = mVar2;
                            a = z7o.a(t7oVar22);
                            if (a != null) {
                            }
                            j7 = wqnVar.a;
                            bVar4.r = mVar3;
                            bVar4.s = function152;
                            bVar4.t = wqnVar;
                            bVar4.j = i6;
                            bVar4.o = j5;
                            bVar4.p = j6;
                            bVar4.q = d3;
                            bVar4.k = i7;
                            bVar4.l = i11;
                            bVar4.m = i132;
                            bVar4.n = i142;
                            bVar4.v = 2;
                            nm6Var = nm6Var;
                            if (y2x.o(j7, bVar4) != nm6Var) {
                            }
                            return nm6Var;
                        }
                    }
                    if (i2 != 2) {
                        if (i2 != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Function1 function16 = bVar.s;
                        Function1 function17 = bVar.r;
                        qgg.h0(obj2);
                        return obj2;
                    }
                    i11 = bVar.l;
                    int i15 = bVar.k;
                    double d4 = bVar.q;
                    long j8 = bVar.p;
                    long j9 = bVar.o;
                    int i16 = bVar.j;
                    wqn wqnVar3 = bVar.t;
                    Function1 function18 = bVar.s;
                    Object obj3 = (Function1) bVar.r;
                    qgg.h0(obj2);
                    int i17 = i15;
                    long j10 = j8;
                    j5 = j9;
                    obj = obj3;
                    wqnVar = wqnVar3;
                    d2 = d4;
                    bVar2 = bVar;
                    i5 = i16;
                    function12 = function18;
                    long j11 = (long) (wqnVar.a * d2);
                    if (j11 > j10) {
                        j11 = j10;
                    }
                    wqnVar.a = j11;
                    long j12 = j5;
                    i4 = i11 + 1;
                    j3 = j12;
                    j4 = j10;
                    i3 = i17;
                    if (i4 < i3) {
                        try {
                        } catch (wis e3) {
                            e = e3;
                            i6 = i5;
                            function13 = obj;
                            bVar = bVar2;
                            d3 = d2;
                            function14 = function12;
                            j6 = j4;
                            i8 = i4;
                            i7 = i3;
                            j5 = j3;
                            i9 = i8;
                            i10 = 0;
                            r7o r7oVar3 = z7o.b;
                            bVar3 = bVar;
                            t7oVar = new t7o(e);
                            mVar2 = function13;
                            int i1322 = i9;
                            int i1422 = i10;
                            i11 = i8;
                            bVar4 = bVar3;
                            t7o t7oVar222 = t7oVar;
                            Function1 function1522 = function14;
                            mVar3 = mVar2;
                            a = z7o.a(t7oVar222);
                            if (a != null && mVar3 != null) {
                                mVar3.invoke(a);
                            }
                            j7 = wqnVar.a;
                            bVar4.r = mVar3;
                            bVar4.s = function1522;
                            bVar4.t = wqnVar;
                            bVar4.j = i6;
                            bVar4.o = j5;
                            bVar4.p = j6;
                            bVar4.q = d3;
                            bVar4.k = i7;
                            bVar4.l = i11;
                            bVar4.m = i1322;
                            bVar4.n = i1422;
                            bVar4.v = 2;
                            nm6Var = nm6Var;
                            if (y2x.o(j7, bVar4) != nm6Var) {
                                d2 = d3;
                                i5 = i6;
                                obj = mVar3;
                                long j13 = j6;
                                function12 = function1522;
                                bVar2 = bVar4;
                                i17 = i7;
                                j10 = j13;
                                long j112 = (long) (wqnVar.a * d2);
                                if (j112 > j10) {
                                }
                                wqnVar.a = j112;
                                long j122 = j5;
                                i4 = i11 + 1;
                                j3 = j122;
                                j4 = j10;
                                i3 = i17;
                                if (i4 < i3) {
                                }
                            }
                            return nm6Var;
                        } catch (Throwable th3) {
                            th = th3;
                            i6 = i5;
                            function13 = obj;
                            bVar = bVar2;
                            d3 = d2;
                            function14 = function12;
                            j6 = j4;
                            i8 = i4;
                            i7 = i3;
                            j5 = j3;
                            i9 = i8;
                            i10 = 0;
                            r7o r7oVar22 = z7o.b;
                            bVar3 = bVar;
                            t7oVar = new t7o(th);
                            mVar2 = function13;
                            int i13222 = i9;
                            int i14222 = i10;
                            i11 = i8;
                            bVar4 = bVar3;
                            t7o t7oVar2222 = t7oVar;
                            Function1 function15222 = function14;
                            mVar3 = mVar2;
                            a = z7o.a(t7oVar2222);
                            if (a != null) {
                                mVar3.invoke(a);
                            }
                            j7 = wqnVar.a;
                            bVar4.r = mVar3;
                            bVar4.s = function15222;
                            bVar4.t = wqnVar;
                            bVar4.j = i6;
                            bVar4.o = j5;
                            bVar4.p = j6;
                            bVar4.q = d3;
                            bVar4.k = i7;
                            bVar4.l = i11;
                            bVar4.m = i13222;
                            bVar4.n = i14222;
                            bVar4.v = 2;
                            nm6Var = nm6Var;
                            if (y2x.o(j7, bVar4) != nm6Var) {
                            }
                            return nm6Var;
                        }
                        r7o r7oVar4 = z7o.b;
                        bVar2.r = (Function1) obj;
                        bVar2.s = function12;
                        bVar2.t = wqnVar;
                        bVar2.j = i5;
                        bVar2.o = j3;
                        bVar2.p = j4;
                        bVar2.q = d2;
                        bVar2.k = i3;
                        bVar2.l = i4;
                        bVar2.m = i4;
                        bVar2.n = 0;
                        bVar2.v = 1;
                        Object invoke = function12.invoke(bVar2);
                        if (invoke != nm6Var) {
                            return invoke;
                        }
                    } else {
                        bVar2.r = null;
                        bVar2.s = null;
                        bVar2.t = null;
                        bVar2.j = i5;
                        bVar2.o = j3;
                        bVar2.p = j4;
                        bVar2.q = d2;
                        bVar2.v = 3;
                        Object invoke2 = function12.invoke(bVar2);
                        if (invoke2 != nm6Var) {
                            return invoke2;
                        }
                    }
                    return nm6Var;
                }
            }
            if (i2 != 0) {
            }
        } catch (CancellationException e4) {
            throw e4;
        }
        bVar = new com.yandex.plus.home.common.utils.b(cg6Var);
        Object obj22 = bVar.u;
        nm6 nm6Var2 = nm6.a;
        i2 = bVar.v;
    }

    public static final Drawable y(Drawable drawable, float f) {
        return f > 0.0f ? new com.yandex.plus.home.common.utils.k(drawable, f, f, f, f) : drawable;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:20|21))(3:22|23|(1:25))|12|13|(1:15)|16|17))|33|6|7|(0)(0)|12|13|(0)|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r6 = defpackage.z7o.b;
        r6 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        r6 = defpackage.z7o.b;
        r6 = new defpackage.t7o(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object z(Function1 function1, Function1 function12, cg6 cg6Var) {
        com.yandex.plus.core.network.call.d dVar;
        int i;
        Throwable a;
        if (cg6Var instanceof com.yandex.plus.core.network.call.d) {
            dVar = (com.yandex.plus.core.network.call.d) cg6Var;
            int i2 = dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dVar.k;
                Object obj2 = nm6.a;
                i = dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    dVar.j = function1;
                    dVar.l = 1;
                    obj = function12.invoke(dVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function1 = dVar.j;
                    qgg.h0(obj);
                }
                obj.getClass();
                Object obj3 = new com.yandex.plus.core.network.call.b(obj);
                r7o r7oVar2 = z7o.b;
                a = z7o.a(obj3);
                if (a != null) {
                    obj3 = c((l) function1.invoke(a));
                }
                return (com.yandex.plus.core.network.call.c) obj3;
            }
        }
        dVar = new com.yandex.plus.core.network.call.d(cg6Var);
        Object obj4 = dVar.k;
        Object obj22 = nm6.a;
        i = dVar.l;
        if (i != 0) {
        }
        obj4.getClass();
        Object obj32 = new com.yandex.plus.core.network.call.b(obj4);
        r7o r7oVar22 = z7o.b;
        a = z7o.a(obj32);
        if (a != null) {
        }
        return (com.yandex.plus.core.network.call.c) obj32;
    }
}
