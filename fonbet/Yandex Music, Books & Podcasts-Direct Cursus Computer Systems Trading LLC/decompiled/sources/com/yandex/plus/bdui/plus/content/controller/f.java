package com.yandex.plus.bdui.plus.content.controller;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.BackgroundColorSpan;
import android.widget.ImageView;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.benchmark.z;
import com.yandex.plus.core.graphql.a3;
import com.yandex.plus.core.graphql.daily.progress.b0;
import com.yandex.plus.core.graphql.daily.progress.c0;
import com.yandex.plus.core.graphql.daily.progress.k0;
import com.yandex.plus.core.graphql.fragment.a7;
import com.yandex.plus.core.graphql.fragment.an;
import com.yandex.plus.core.graphql.fragment.b6;
import com.yandex.plus.core.graphql.fragment.b7;
import com.yandex.plus.core.graphql.fragment.dn;
import com.yandex.plus.core.graphql.fragment.en;
import com.yandex.plus.core.graphql.fragment.hb;
import com.yandex.plus.core.graphql.fragment.hn;
import com.yandex.plus.core.graphql.fragment.in;
import com.yandex.plus.core.graphql.fragment.j7;
import com.yandex.plus.core.graphql.fragment.n7;
import com.yandex.plus.core.graphql.fragment.s6;
import com.yandex.plus.core.graphql.fragment.t6;
import com.yandex.plus.core.graphql.fragment.w6;
import com.yandex.plus.core.graphql.fragment.x6;
import com.yandex.plus.core.graphql.fragment.zm;
import com.yandex.plus.core.graphql.type.a1;
import com.yandex.plus.core.graphql.type.i0;
import com.yandex.plus.core.graphql.x2;
import com.yandex.plus.core.graphql.y2;
import com.yandex.plus.core.graphql.z2;
import com.yandex.plus.core.openapi.a;
import com.yandex.plus.core.templating.render.s;
import com.yandex.plus.core.templating.render.t;
import com.yandex.plus.core.templating.render.u;
import com.yandex.plus.core.templating.render.v;
import com.yandex.plus.core.templating.render.w;
import com.yandex.plus.core.templating.render.x;
import com.yandex.plus.core.templating.render.y;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.d5;
import com.yandex.plus.home.repository.api.model.panel.a0;
import com.yandex.plus.home.repository.api.model.panel.d0;
import defpackage.aa5;
import defpackage.arf;
import defpackage.aur;
import defpackage.b6e;
import defpackage.bca;
import defpackage.bqr;
import defpackage.btf;
import defpackage.bwf;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.d0o;
import defpackage.d7e;
import defpackage.dfi;
import defpackage.dkn;
import defpackage.dnb;
import defpackage.e5b;
import defpackage.eeh;
import defpackage.eno;
import defpackage.ern;
import defpackage.ezc;
import defpackage.gld;
import defpackage.hrg;
import defpackage.i5f;
import defpackage.jyr;
import defpackage.l3o;
import defpackage.mlr;
import defpackage.my1;
import defpackage.ncs;
import defpackage.nm6;
import defpackage.o3o;
import defpackage.ocu;
import defpackage.os3;
import defpackage.pce;
import defpackage.pgb;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.quj;
import defpackage.r7o;
import defpackage.rce;
import defpackage.s9f;
import defpackage.sce;
import defpackage.sjn;
import defpackage.skn;
import defpackage.su4;
import defpackage.sy6;
import defpackage.t7o;
import defpackage.tah;
import defpackage.u75;
import defpackage.uah;
import defpackage.v75;
import defpackage.w40;
import defpackage.x0q;
import defpackage.x3f;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.ybf;
import defpackage.z7o;
import defpackage.zhp;
import io.appmetrica.analytics.impl.C0479n3;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import retrofit2.Call;
import retrofit2.Response;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class f implements com.yandex.plus.core.templating.render.b, os3, com.yandex.plus.core.templating.parser.b, sjn {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public f(com.yandex.plus.pay.ui.core.debug.internal.c cVar, com.yandex.plus.pay.ui.core.debug.internal.a aVar) {
        this.a = 12;
        this.c = aVar;
        com.yandex.plus.bdui.plus.checkout.h hVar = new com.yandex.plus.bdui.plus.checkout.h(20, this);
        arf a = btf.a(bwf.c, new ncs(13, new com.yandex.plus.di.e(cVar, 0)));
        this.b = new ybf(ern.a(com.yandex.plus.di.f.class), new sy6(a, 20), hVar, new sy6(a, 21));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(f fVar, com.yandex.plus.home.feature.webviews.internal.settings.model.a aVar, cg6 cg6Var) {
        com.yandex.plus.home.feature.webviews.internal.settings.domain.e eVar;
        int i;
        fVar.getClass();
        if (cg6Var instanceof com.yandex.plus.home.feature.webviews.internal.settings.domain.e) {
            eVar = (com.yandex.plus.home.feature.webviews.internal.settings.domain.e) cg6Var;
            int i2 = eVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.l = i2 - Integer.MIN_VALUE;
                Object obj = eVar.j;
                nm6 nm6Var = nm6.a;
                i = eVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (aVar.a != null) {
                        ((a1) fVar.c).getClass();
                    }
                    throw new com.yandex.plus.home.feature.webviews.internal.settings.domain.b(aVar);
                }
                if (i == 1) {
                    qgg.h0(obj);
                    return;
                } else {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return;
                }
            }
        }
        eVar = new com.yandex.plus.home.feature.webviews.internal.settings.domain.e(fVar, cg6Var);
        Object obj2 = eVar.j;
        nm6 nm6Var2 = nm6.a;
        i = eVar.l;
        if (i != 0) {
        }
    }

    public static Integer d(String str, float f) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Integer.valueOf(aa5.l(Color.parseColor(str), eeh.b(f * KotlinVersion.MAX_COMPONENT_VALUE)));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
            String p = su4.p(a, new StringBuilder("DailyProgressMapper parse hex color error="));
            jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, p, null);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        return (Integer) t7oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable e(f fVar, Set set, com.yandex.plus.bdui.shared.b bVar, long j, cg6 cg6Var) {
        com.yandex.plus.core.templating.data.b bVar2;
        int i;
        if (cg6Var instanceof com.yandex.plus.core.templating.data.b) {
            bVar2 = (com.yandex.plus.core.templating.data.b) cg6Var;
            int i2 = bVar2.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar2.l = i2 - Integer.MIN_VALUE;
                com.yandex.plus.core.templating.data.b bVar3 = bVar2;
                Object obj = bVar3.j;
                nm6 nm6Var = nm6.a;
                i = bVar3.l;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.plus.log.api.b bVar4 = (com.yandex.plus.log.api.b) fVar.b;
                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                    if (bVar4.b(aVar)) {
                        bVar4.c(aVar, "DefaultDataProvider", "getData(); placeholders = " + set);
                    }
                    d7e d7eVar = new d7e((Set) fVar.c, null, set, fVar, j, bVar);
                    bVar3.l = 1;
                    obj = gld.Q(d7eVar, bVar3);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return (Serializable) r1.h((List) obj, false);
            }
        }
        bVar2 = new com.yandex.plus.core.templating.data.b(fVar, cg6Var);
        com.yandex.plus.core.templating.data.b bVar32 = bVar2;
        Object obj2 = bVar32.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar32.l;
        if (i != 0) {
        }
        return (Serializable) r1.h((List) obj2, false);
    }

    public static Object s(y yVar, Map map) {
        Object B;
        if (Intrinsics.d(yVar, v.a)) {
            B = JSONObject.wrap(null);
        } else if (yVar instanceof com.yandex.plus.core.templating.render.p) {
            B = JSONObject.wrap(Boolean.valueOf(((com.yandex.plus.core.templating.render.p) yVar).a));
        } else if (yVar instanceof t) {
            B = JSONObject.wrap(Integer.valueOf(((t) yVar).a));
        } else if (yVar instanceof u) {
            B = JSONObject.wrap(Long.valueOf(((u) yVar).a));
        } else if (yVar instanceof s) {
            B = JSONObject.wrap(Float.valueOf(((s) yVar).a));
        } else if (yVar instanceof com.yandex.plus.core.templating.render.r) {
            B = JSONObject.wrap(Double.valueOf(((com.yandex.plus.core.templating.render.r) yVar).a));
        } else if (yVar instanceof w) {
            B = JSONObject.wrap(((w) yVar).a);
        } else if (yVar instanceof com.yandex.plus.core.templating.render.o) {
            List list = ((com.yandex.plus.core.templating.render.o) yVar).a;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(s((y) it.next(), map));
            }
            B = JSONObject.wrap(arrayList);
        } else if (yVar instanceof com.yandex.plus.core.templating.render.q) {
            Map map2 = ((com.yandex.plus.core.templating.render.q) yVar).a;
            LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(map2.size()));
            for (Map.Entry entry : map2.entrySet()) {
                linkedHashMap.put(entry.getKey(), s((y) entry.getValue(), map));
            }
            B = JSONObject.wrap(linkedHashMap);
        } else {
            if (!(yVar instanceof x)) {
                b6e.s();
                return null;
            }
            B = r1.B(((x) yVar).a, map);
        }
        B.getClass();
        return B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x002d A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.yandex.plus.core.data.common.r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.yandex.plus.core.data.common.k x(List list) {
        com.yandex.plus.core.data.common.o oVar;
        com.yandex.plus.core.graphql.daily.progress.h hVar = (com.yandex.plus.core.graphql.daily.progress.h) CollectionsKt.firstOrNull(list);
        if (hVar instanceof com.yandex.plus.core.graphql.daily.progress.g) {
            com.yandex.plus.core.graphql.daily.progress.g gVar = (com.yandex.plus.core.graphql.daily.progress.g) hVar;
            Integer d = d(gVar.c, gVar.b);
            if (d != null) {
                return new com.yandex.plus.core.data.common.f(d.intValue());
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.yandex.plus.core.graphql.daily.progress.h hVar2 = (com.yandex.plus.core.graphql.daily.progress.h) it.next();
            com.yandex.plus.core.graphql.daily.progress.d dVar = hVar2 instanceof com.yandex.plus.core.graphql.daily.progress.d ? (com.yandex.plus.core.graphql.daily.progress.d) hVar2 : null;
            if (dVar != null) {
                c0 c0Var = dVar.b;
                int size = c0Var.a().size();
                ArrayList arrayList2 = new ArrayList(size);
                ArrayList arrayList3 = new ArrayList(size);
                int i = 0;
                for (Object obj : c0Var.a()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        u75.n();
                        throw null;
                    }
                    com.yandex.plus.core.graphql.daily.progress.g gVar2 = ((com.yandex.plus.core.graphql.daily.progress.q) obj).b;
                    Integer d2 = d(gVar2.c, gVar2.b);
                    if (d2 != null) {
                        arrayList3.add(i, d2);
                        arrayList2.add(i, Double.valueOf(r7.a));
                        i = i2;
                    }
                }
                if (c0Var instanceof com.yandex.plus.core.graphql.daily.progress.v) {
                    oVar = new com.yandex.plus.core.data.common.o(arrayList3, arrayList2, ((com.yandex.plus.core.graphql.daily.progress.v) c0Var).c);
                } else {
                    if (!(c0Var instanceof b0)) {
                        b6e.s();
                        return null;
                    }
                    b0 b0Var = (b0) c0Var;
                    com.yandex.plus.core.graphql.daily.progress.y yVar = b0Var.d;
                    Pair pair = new Pair(Double.valueOf(yVar.a), Double.valueOf(yVar.b));
                    com.yandex.plus.core.graphql.daily.progress.y yVar2 = b0Var.c;
                    oVar = new com.yandex.plus.core.data.common.r(arrayList3, arrayList2, pair, new Pair(Double.valueOf(yVar2.a), Double.valueOf(yVar2.b)));
                }
                if (oVar == null) {
                    arrayList.add(oVar);
                }
            }
            oVar = null;
            if (oVar == null) {
            }
        }
        return new com.yandex.plus.core.data.common.j(arrayList);
    }

    public static com.yandex.plus.core.data.common.v z(com.yandex.plus.core.graphql.daily.progress.k kVar, com.yandex.plus.core.graphql.daily.progress.k kVar2) {
        List list;
        return new com.yandex.plus.core.data.common.v(x(kVar.a), (kVar2 == null || (list = kVar2.a) == null) ? null : x(list));
    }

    @Override // defpackage.os3
    public void A(Call call, Throwable th) {
        call.getClass();
        com.yandex.plus.core.network.api.c cVar = (com.yandex.plus.core.network.api.c) this.c;
        d0o a = cVar.a();
        a.getClass();
        com.yandex.plus.core.openapi.b bVar = new com.yandex.plus.core.openapi.b(a.b, a.a.i, uah.n(a.c));
        ((os3) this.b).D(cVar, Response.b(th instanceof zhp ? new a.AbstractC0017a.d(bVar, (IllegalArgumentException) th) : th instanceof IOException ? new a.AbstractC0017a.b(bVar, (IOException) th) : new a.AbstractC0017a.c(bVar, th)));
    }

    @Override // defpackage.os3
    public void D(Call call, Response response) {
        Object bVar;
        Object obj;
        call.getClass();
        com.yandex.plus.core.network.api.c cVar = (com.yandex.plus.core.network.api.c) this.c;
        l3o l3oVar = response.a;
        Object obj2 = response.b;
        d0o d0oVar = l3oVar.a;
        com.yandex.plus.core.openapi.b bVar2 = new com.yandex.plus.core.openapi.b(d0oVar.b, d0oVar.a.i, uah.n(d0oVar.c));
        if (l3oVar.b()) {
            obj = obj2 != null ? new a.b(obj2, bVar2) : new a.AbstractC0017a.d(bVar2, new IllegalArgumentException("deserializedBody is null, but expected non-null value"));
        } else {
            int i = l3oVar.d;
            String str = l3oVar.c;
            o3o o3oVar = response.c;
            String I = o3oVar != null ? com.yandex.plus.bdui.flex.ui.a.I(o3oVar) : null;
            if (500 > i || i >= 600) {
                str.getClass();
                bVar = new a.AbstractC0017a.AbstractC0018a.b(bVar2, i, str, I);
            } else {
                str.getClass();
                bVar = new a.AbstractC0017a.AbstractC0018a.C0019a(bVar2, i, str, I);
            }
            obj = bVar;
        }
        ((os3) this.b).D(cVar, Response.b(obj));
    }

    @Override // com.yandex.plus.core.templating.render.b
    public Object a(Object obj, Map map) {
        LinkedHashMap linkedHashMap;
        switch (this.a) {
            case 2:
                com.yandex.plus.bdui.templating.render.c cVar = (com.yandex.plus.bdui.templating.render.c) obj;
                cVar.getClass();
                map.getClass();
                String obj2 = cVar.a.a(map).toString();
                LinkedHashMap linkedHashMap2 = cVar.b;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(tah.a(linkedHashMap2.size()));
                for (Map.Entry entry : linkedHashMap2.entrySet()) {
                    Object key = entry.getKey();
                    List list = (List) entry.getValue();
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((com.yandex.plus.bdui.templating.render.g) it.next()).a(map).toString());
                    }
                    linkedHashMap3.put(key, arrayList);
                }
                Map map2 = cVar.c;
                if (map2 != null) {
                    com.yandex.plus.bdui.templating.render.b bVar = new com.yandex.plus.bdui.templating.render.b(0, map);
                    linkedHashMap = new LinkedHashMap(tah.a(map2.size()));
                    for (Map.Entry entry2 : map2.entrySet()) {
                        linkedHashMap.put(entry2.getKey(), com.yandex.plus.bdui.plus.analytics.b.o(entry2.getValue(), com.yandex.plus.bdui.templating.render.g.class, bVar));
                    }
                } else {
                    linkedHashMap = null;
                }
                com.yandex.plus.log.api.b bVar2 = (com.yandex.plus.log.api.b) this.b;
                com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                if (bVar2.b(aVar)) {
                    bVar2.c(aVar, "QueryRenderableAdapterImpl", "render(); succeeded with renderedPath = " + obj2 + ", renderedParams = " + linkedHashMap3 + ", renderedBody = " + linkedHashMap);
                }
                return (com.yandex.plus.bdui.query.g) ((w40) this.c).invoke(obj2, linkedHashMap3, linkedHashMap);
            default:
                return t((y) obj, map);
        }
    }

    public com.yandex.plus.home.feature.webviews.internal.treasury.e c() {
        return null;
    }

    public com.yandex.plus.acquisition.adapter.api.d f() {
        Object f = ((com.yandex.plus.experiments.impl.providers.h) this.b).f();
        r7o r7oVar = z7o.b;
        com.yandex.plus.acquisition.adapter.api.c cVar = null;
        if (f instanceof t7o) {
            f = null;
        }
        com.yandex.plus.experiments.api.a aVar = (com.yandex.plus.experiments.api.a) f;
        if (aVar != null) {
            List list = aVar.c;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.yandex.plus.acquisition.adapter.api.b(((Number) it.next()).longValue(), -1L));
            }
            cVar = new com.yandex.plus.acquisition.adapter.api.c(CollectionsKt.A0(arrayList), aVar.d);
        }
        String str = (String) this.c;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        return new com.yandex.plus.acquisition.adapter.api.d(cVar, str, e5bVar);
    }

    public Object g(s9f s9fVar) {
        s9fVar.getClass();
        if (this.b == com.yandex.plus.home.common.utils.n.a) {
            Function1 function1 = (Function1) this.c;
            function1.getClass();
            this.b = function1.invoke(s9fVar);
            this.c = null;
        }
        return this.b;
    }

    @Override // defpackage.sjn
    public Object getValue(Object obj, s9f s9fVar) {
        switch (this.a) {
            case 11:
                s9fVar.getClass();
                break;
            default:
                s9fVar.getClass();
                break;
        }
        return ((com.yandex.plus.di.f) ((ybf) this.b).getValue()).k;
    }

    public com.yandex.plus.core.debug.panel.internal.model.ui.d h(com.yandex.plus.core.debug.panel.internal.model.ui.d dVar, com.yandex.plus.core.debug.panel.internal.model.log.g gVar, boolean z) {
        dVar.getClass();
        gVar.getClass();
        SpannedString spannedString = dVar.b;
        int i = z ? R.color.plus_sdk_current_match_highlight : R.color.plus_sdk_match_highlight;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) spannedString);
        int i2 = gVar.b;
        int i3 = gVar.c;
        Context context = ((com.yandex.plus.core.debug.panel.internal.utils.resource.a) this.c).a;
        context.getClass();
        spannableStringBuilder.setSpan(new BackgroundColorSpan(com.yandex.plus.home.common.utils.a.a(context, i)), i2, i3, 17);
        return com.yandex.plus.core.debug.panel.internal.model.ui.d.a(dVar, new SpannedString(spannableStringBuilder));
    }

    public void i(ImageView imageView) {
        imageView.getClass();
        pce pceVar = (pce) this.c;
        pceVar.f(imageView);
        ((com.yandex.plus.coil.b) this.b).b.d(pceVar.a());
    }

    public void j(com.yandex.plus.core.imageloader.a aVar) {
        pce pceVar = (pce) this.c;
        com.yandex.plus.coil.b bVar = (com.yandex.plus.coil.b) this.b;
        pceVar.d = new com.yandex.passport.internal.core.accounts.h(aVar, bVar, aVar, aVar, 10);
        pceVar.d();
        bVar.c.put(aVar, bVar.b.d(pceVar.a()));
    }

    public bca k(String str) {
        return new bca(new eno(new ocu(new dkn((x0q) ((f) this.c).b), str, this, (Continuation) null, 28)), 18);
    }

    public bca l(String str) {
        return new bca(new eno(new com.yandex.plus.home.api.prefetch.j(new dkn((x0q) ((f) this.c).b), str, (Continuation) null, 10)), 18);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (r9 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.yandex.plus.home.graphql.panel.mappers.shortcut.a m(String str, in inVar, b7 b7Var, Map map, boolean z, com.yandex.plus.home.graphql.panel.mappers.a aVar) {
        String str2;
        ArrayList arrayList;
        com.yandex.plus.core.data.common.v vVar;
        com.yandex.plus.core.data.common.k kVar;
        String str3;
        int i;
        String str4;
        d0 d0Var;
        com.yandex.plus.core.graphql.fragment.a aVar2;
        com.yandex.plus.core.graphql.fragment.b bVar;
        w6 w6Var;
        x6 x6Var;
        x6 x6Var2;
        a7 a7Var;
        hb hbVar;
        b7 b7Var2 = b7Var;
        com.yandex.plus.core.graphql.utils.b bVar2 = (com.yandex.plus.core.graphql.utils.b) ((com.yandex.passport.data.network.l) this.c).a;
        str.getClass();
        inVar.getClass();
        String str5 = inVar.a;
        String str6 = inVar.b;
        aVar.getClass();
        LinkedList linkedList = aVar.a;
        List list = (List) map.get("widgetDirection");
        boolean d = Intrinsics.d((list == null || (hbVar = (hb) CollectionsKt.firstOrNull(list)) == null) ? null : hbVar.a, "horizontal");
        hn hnVar = inVar.h;
        com.yandex.plus.core.data.common.v c = bVar2.c(hnVar != null ? hnVar.a : null, (b7Var2 == null || (a7Var = b7Var2.e) == null) ? null : a7Var.a);
        com.yandex.plus.core.data.common.k kVar2 = c.b;
        com.yandex.plus.core.data.common.k kVar3 = c.a;
        Map b = a1.b("subtitle", (List) map.get("textWithColor"));
        if (b != null && (str2 = (String) b.get("text")) != null) {
            if (StringsKt.U(str2)) {
                str2 = null;
            }
        }
        str2 = inVar.g;
        String str7 = str2;
        com.yandex.plus.core.data.common.v c2 = bVar2.c(b != null ? (String) b.get("lightThemeColor") : null, b != null ? (String) b.get("darkThemeColor") : null);
        com.yandex.plus.core.data.common.k kVar4 = c2.a;
        if (kVar4 == null) {
            kVar4 = kVar3;
        }
        com.yandex.plus.core.data.common.k kVar5 = c2.b;
        if (kVar5 == null) {
            kVar5 = kVar2;
        }
        com.yandex.plus.core.data.common.v vVar2 = new com.yandex.plus.core.data.common.v(kVar4, kVar5);
        en enVar = inVar.i;
        com.yandex.plus.core.data.common.v b2 = bVar2.b(enVar != null ? enVar.b.b : null, enVar != null ? enVar.a : null, (b7Var2 == null || (x6Var2 = b7Var2.f) == null) ? null : x6Var2.b.b, (b7Var2 == null || (x6Var = b7Var2.f) == null) ? null : x6Var.a);
        com.yandex.plus.core.graphql.utils.b bVar3 = (com.yandex.plus.core.graphql.utils.b) ((com.yandex.passport.data.network.l) ((com.yandex.passport.data.network.l) this.b).a).a;
        ArrayList arrayList2 = inVar.d;
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        for (Object obj : arrayList2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                u75.n();
                throw null;
            }
            com.yandex.plus.core.graphql.fragment.c cVar = ((dn) obj).b;
            com.yandex.plus.core.graphql.type.b bVar4 = cVar.h;
            com.yandex.plus.core.data.common.k kVar6 = kVar2;
            com.yandex.plus.core.graphql.fragment.c cVar2 = (b7Var2 == null || (w6Var = (w6) CollectionsKt.S(b7Var2.d, i2)) == null) ? null : w6Var.b;
            if (z && bVar4 == com.yandex.plus.core.graphql.type.b.none) {
                d0Var = null;
                str4 = str6;
            } else {
                String str8 = cVar.a;
                String str9 = str8 == null ? "" : str8;
                com.yandex.plus.core.graphql.fragment.b bVar5 = cVar.c;
                str4 = str6;
                com.yandex.plus.core.data.common.v b3 = bVar3.b(bVar5 != null ? bVar5.b : null, cVar.b, (cVar2 == null || (bVar = cVar2.c) == null) ? null : bVar.b, cVar2 != null ? cVar2.b : null);
                String str10 = cVar.f;
                String str11 = str10 == null ? "" : str10;
                String str12 = cVar.g;
                String str13 = str12 == null ? "" : str12;
                int ordinal = bVar4.ordinal();
                com.yandex.plus.home.repository.api.model.panel.a aVar3 = ordinal != 7 ? ordinal != 11 ? ordinal != 13 ? com.yandex.plus.home.repository.api.model.panel.a.d : com.yandex.plus.home.repository.api.model.panel.a.b : com.yandex.plus.home.repository.api.model.panel.a.c : com.yandex.plus.home.repository.api.model.panel.a.a;
                com.yandex.plus.core.graphql.fragment.a aVar4 = cVar.e;
                d0Var = new d0(str9, b3, str11, str13, aVar3, bVar3.b(aVar4 != null ? aVar4.b : null, cVar.d, (cVar2 == null || (aVar2 = cVar2.e) == null) ? null : aVar2.b, cVar2 != null ? cVar2.d : null));
            }
            if (d0Var != null) {
                arrayList3.add(d0Var);
            }
            b7Var2 = b7Var;
            kVar2 = kVar6;
            i2 = i3;
            str6 = str4;
        }
        com.yandex.plus.core.data.common.k kVar7 = kVar2;
        String str14 = str6;
        String str15 = inVar.f;
        if (str15 == null || StringsKt.U(str15)) {
            arrayList = arrayList3;
            vVar = vVar2;
            kVar = kVar3;
            str3 = str14;
            i = 0;
            linkedList.add(new com.yandex.plus.home.repository.api.model.panel.l(str, str3, null, "title", null, str5, true, 52));
        } else {
            kVar = kVar3;
            vVar = vVar2;
            arrayList = arrayList3;
            str3 = str14;
            i = 0;
        }
        if (kVar == null && kVar7 == null) {
            linkedList.add(new com.yandex.plus.home.repository.api.model.panel.l(str, str3, null, "titleColor", null, str5, true, 52));
        }
        if (b2.a == null && b2.b == null) {
            linkedList.add(new com.yandex.plus.home.repository.api.model.panel.l(str, str3, null, "backgroundColor", null, str5, true, 52));
        }
        return new com.yandex.plus.home.graphql.panel.mappers.shortcut.a(c, vVar, b2, (d0) CollectionsKt.S(arrayList, i), (d0) CollectionsKt.S(arrayList, 1), str3, inVar.c, inVar.f, str7 == null ? "" : str7, d);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01f9, code lost:
    
        if (r20 == null) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:190:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0d27  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0d4c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0d4f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList n(ArrayList arrayList, ArrayList arrayList2, boolean z, com.yandex.plus.home.graphql.panel.mappers.a aVar) {
        com.yandex.plus.home.graphql.panel.mappers.a aVar2;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList3;
        Iterator it;
        i0 i0Var;
        com.yandex.plus.home.repository.api.model.panel.b0 b0Var;
        com.yandex.plus.home.repository.api.model.panel.b0 b0Var2;
        a0 a0Var;
        a0 a0Var2;
        String str;
        an anVar;
        List list;
        com.yandex.plus.home.repository.api.model.panel.b0 b0Var3;
        LinkedHashMap linkedHashMap2;
        ?? r14;
        String str2;
        String str3;
        com.yandex.plus.home.graphql.panel.mappers.a aVar3;
        Parcelable oVar;
        boolean z2;
        String str4;
        String str5;
        Map map;
        String str6;
        Pair pair;
        Parcelable parcelable;
        String str7;
        String str8;
        String str9;
        com.yandex.plus.home.repository.api.model.panel.s rVar;
        x6 x6Var;
        hb hbVar;
        Map map2;
        in inVar;
        in inVar2;
        in inVar3;
        String str10;
        com.yandex.plus.home.graphql.panel.mappers.a aVar4;
        Parcelable parcelable2;
        String str11;
        com.yandex.plus.home.repository.api.model.panel.e eVar;
        String str12;
        ArrayList arrayList4;
        String str13;
        b6 b6Var;
        in inVar4;
        String str14;
        Map map3;
        Map map4;
        in inVar5;
        com.yandex.plus.home.repository.api.model.panel.d dVar;
        List i;
        Iterator it2;
        in inVar6;
        Map map5;
        f fVar = this;
        int i2 = 10;
        int a = tah.a(v75.o(arrayList2, 10));
        int i3 = 16;
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(a);
        for (Object obj : arrayList2) {
            linkedHashMap3.put(((t6) obj).b, obj);
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            an anVar2 = (an) it3.next();
            String str15 = anVar2.a;
            String str16 = anVar2.a;
            i0 i0Var2 = anVar2.c;
            t6 t6Var = (t6) linkedHashMap3.get(str15);
            if (t6Var != null) {
                List list2 = t6Var.a;
                List list3 = anVar2.d;
                int ordinal = i0Var2.ordinal();
                if (ordinal == 15) {
                    a0Var = a0.b;
                } else if (ordinal == i3) {
                    a0Var = a0.c;
                } else if (ordinal != 84) {
                    a0Var2 = null;
                    if (a0Var2 != null) {
                        aVar2 = aVar;
                        linkedHashMap = linkedHashMap3;
                        arrayList3 = arrayList5;
                        it = it3;
                        i0Var = i0Var2;
                        b0Var = null;
                        b0Var3 = null;
                    } else {
                        int i4 = 0;
                        boolean z3 = !z && Intrinsics.d(anVar2.e, Boolean.TRUE);
                        if (z3) {
                            aVar2 = aVar;
                            str = str16;
                            linkedHashMap = linkedHashMap3;
                            arrayList3 = arrayList5;
                            it = it3;
                            anVar = anVar2;
                            i0Var = i0Var2;
                            b0Var = null;
                            list = c5b.a;
                        } else {
                            f fVar2 = (f) fVar.b;
                            com.yandex.plus.home.analytics.diagnostic.panel.a aVar5 = (com.yandex.plus.home.analytics.diagnostic.panel.a) fVar2.c;
                            com.yandex.passport.internal.core.accounts.h hVar = (com.yandex.passport.internal.core.accounts.h) fVar2.b;
                            int ordinal2 = a0Var2.ordinal();
                            b0Var = null;
                            if (ordinal2 == 0) {
                                com.yandex.plus.home.graphql.panel.mappers.a aVar6 = aVar;
                                String str17 = str16;
                                linkedHashMap = linkedHashMap3;
                                arrayList3 = arrayList5;
                                it = it3;
                                anVar = anVar2;
                                i0Var = i0Var2;
                                com.yandex.passport.sloth.ui.dependencies.m mVar = (com.yandex.passport.sloth.ui.dependencies.m) fVar.c;
                                aVar6.getClass();
                                LinkedList linkedList = aVar6.a;
                                if (list2 != null) {
                                    List list4 = list2;
                                    int a2 = tah.a(v75.o(list4, 10));
                                    if (a2 < 16) {
                                        a2 = 16;
                                    }
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(a2);
                                    Iterator it4 = list4.iterator();
                                    while (it4.hasNext()) {
                                        b7 b7Var = ((s6) it4.next()).b;
                                        linkedHashMap4.put(b7Var.a, b7Var);
                                    }
                                    linkedHashMap2 = linkedHashMap4;
                                } else {
                                    linkedHashMap2 = null;
                                }
                                if (list3 != null) {
                                    r14 = new ArrayList();
                                    Iterator it5 = list3.iterator();
                                    while (it5.hasNext()) {
                                        in inVar7 = ((zm) it5.next()).b;
                                        String str18 = inVar7.a;
                                        String str19 = inVar7.b;
                                        b7 b7Var2 = linkedHashMap2 != null ? (b7) linkedHashMap2.get(str19) : null;
                                        Map h = a1.h(inVar7);
                                        Map d = a1.d(b7Var2);
                                        List list5 = (List) h.get("widgetType");
                                        if (list5 == null || (hbVar = (hb) CollectionsKt.firstOrNull(list5)) == null || (str2 = hbVar.a) == null) {
                                            str2 = "not_plus";
                                        }
                                        if (b7Var2 == null) {
                                            linkedList.add(new com.yandex.plus.home.repository.api.model.panel.k(str2, str19));
                                        }
                                        switch (str2.hashCode()) {
                                            case -1281860764:
                                                b7 b7Var3 = b7Var2;
                                                str3 = str17;
                                                String str20 = str2;
                                                if (str20.equals("family")) {
                                                    com.yandex.plus.home.graphql.panel.mappers.shortcut.d dVar2 = (com.yandex.plus.home.graphql.panel.mappers.shortcut.d) mVar.i;
                                                    dVar2.getClass();
                                                    com.yandex.plus.home.graphql.panel.mappers.shortcut.a m = dVar2.a.m(str20, inVar7, b7Var3, h, true, aVar);
                                                    aVar3 = aVar;
                                                    if (m.c == null) {
                                                        parcelable = null;
                                                        break;
                                                    } else {
                                                        List list6 = (List) h.get("sharing_family_invitations");
                                                        String str21 = m.a;
                                                        String str22 = m.b;
                                                        String str23 = m.c;
                                                        String str24 = m.d;
                                                        com.yandex.plus.core.data.common.v vVar = m.e;
                                                        com.yandex.plus.core.data.common.v vVar2 = m.f;
                                                        d0 d0Var = m.h;
                                                        boolean z4 = m.j;
                                                        com.yandex.plus.core.data.common.v vVar3 = m.g;
                                                        List list7 = (List) h.get("pluralForms");
                                                        if (list7 != null) {
                                                            ArrayList arrayList6 = new ArrayList();
                                                            Iterator it6 = list7.iterator();
                                                            while (it6.hasNext()) {
                                                                Iterator it7 = it6;
                                                                Map j = a1.j((hb) it6.next());
                                                                boolean z5 = z4;
                                                                String str25 = (String) j.get("form");
                                                                String str26 = str21;
                                                                if (str25 != null) {
                                                                    str6 = str22;
                                                                    String str27 = (String) j.get("text");
                                                                    if (str27 == null) {
                                                                        str27 = "";
                                                                    }
                                                                    pair = new Pair(str25, str27);
                                                                } else {
                                                                    str6 = str22;
                                                                    pair = null;
                                                                }
                                                                if (pair != null) {
                                                                    arrayList6.add(pair);
                                                                }
                                                                it6 = it7;
                                                                str21 = str26;
                                                                str22 = str6;
                                                                z4 = z5;
                                                            }
                                                            z2 = z4;
                                                            str4 = str21;
                                                            str5 = str22;
                                                            map = uah.n(arrayList6);
                                                        } else {
                                                            z2 = z4;
                                                            str4 = str21;
                                                            str5 = str22;
                                                            map = null;
                                                        }
                                                        oVar = new com.yandex.plus.home.repository.api.model.panel.o(str4, str5, str23, str24, vVar, vVar2, d0Var, z2, vVar3, map, list6 != null);
                                                        parcelable = oVar;
                                                        break;
                                                    }
                                                }
                                                parcelable = null;
                                                aVar3 = aVar;
                                                break;
                                            case -892481550:
                                                b7 b7Var4 = b7Var2;
                                                str3 = str17;
                                                String str28 = str2;
                                                if (str28.equals("status")) {
                                                    com.yandex.plus.home.graphql.panel.mappers.shortcut.d dVar3 = (com.yandex.plus.home.graphql.panel.mappers.shortcut.d) mVar.f;
                                                    dVar3.getClass();
                                                    com.yandex.plus.home.graphql.panel.mappers.shortcut.a m2 = dVar3.a.m(str28, inVar7, b7Var4, h, true, aVar);
                                                    if (m2.c != null) {
                                                        String str29 = inVar7.e;
                                                        String str30 = b7Var4 != null ? b7Var4.c : null;
                                                        com.yandex.plus.core.data.common.y yVar = new com.yandex.plus.core.data.common.y(str29, str30);
                                                        if (str29 != null && com.yandex.plus.bdui.flex.ui.a.x(str29)) {
                                                            linkedList.add(new com.yandex.plus.home.repository.api.model.panel.l(str28, str19, null, "iconUrl", str29, str18, true, 36));
                                                        }
                                                        if (str30 != null && com.yandex.plus.bdui.flex.ui.a.x(str30)) {
                                                            linkedList.add(new com.yandex.plus.home.repository.api.model.panel.l(str28, str19, null, "iconUrl", str30, str18, false, 36));
                                                        }
                                                        oVar = new com.yandex.plus.home.repository.api.model.panel.x(m2.a, m2.b, m2.c, m2.d, m2.e, m2.f, m2.g, m2.h, m2.j, yVar);
                                                        aVar3 = aVar;
                                                        parcelable = oVar;
                                                        break;
                                                    }
                                                    parcelable = null;
                                                    aVar3 = aVar;
                                                    break;
                                                }
                                                parcelable = null;
                                                aVar3 = aVar;
                                                break;
                                            case -813264053:
                                                b7 b7Var5 = b7Var2;
                                                String str31 = str2;
                                                if (str31.equals("redAlert")) {
                                                    com.yandex.plus.home.graphql.panel.mappers.shortcut.d dVar4 = (com.yandex.plus.home.graphql.panel.mappers.shortcut.d) mVar.c;
                                                    dVar4.getClass();
                                                    str3 = str17;
                                                    com.yandex.plus.home.graphql.panel.mappers.shortcut.a m3 = dVar4.a.m(str31, inVar7, b7Var5, h, true, aVar);
                                                    if (m3.c != null) {
                                                        List list8 = (List) h.get("logo");
                                                        hb hbVar2 = list8 != null ? (hb) CollectionsKt.firstOrNull(list8) : null;
                                                        List list9 = (List) d.get("logo");
                                                        b6 b6Var2 = list9 != null ? (b6) CollectionsKt.firstOrNull(list9) : null;
                                                        String str32 = hbVar2 != null ? hbVar2.e : null;
                                                        String str33 = b6Var2 != null ? b6Var2.e : null;
                                                        com.yandex.plus.core.data.common.y yVar2 = new com.yandex.plus.core.data.common.y(str32, str33);
                                                        if (hbVar2 == null || b6Var2 == null) {
                                                            linkedList.add(new com.yandex.plus.home.repository.api.model.panel.m(str31, str19, str18, hbVar2 == null));
                                                        }
                                                        if (str32 == null || !com.yandex.plus.bdui.flex.ui.a.x(str32)) {
                                                            str7 = str18;
                                                            str8 = str31;
                                                            str9 = str19;
                                                        } else {
                                                            str7 = str18;
                                                            str8 = str31;
                                                            str9 = str19;
                                                            linkedList.add(new com.yandex.plus.home.repository.api.model.panel.l(str8, str9, null, "iconUrl", str32, str7, true, 36));
                                                        }
                                                        if (str33 != null && com.yandex.plus.bdui.flex.ui.a.x(str33)) {
                                                            linkedList.add(new com.yandex.plus.home.repository.api.model.panel.l(str8, str9, null, "iconUrl", str33, str7, false, 36));
                                                        }
                                                        oVar = new com.yandex.plus.home.repository.api.model.panel.w(m3.a, m3.b, m3.c, m3.d, m3.e, m3.f, m3.g, m3.h, m3.j, yVar2, m3.i);
                                                        aVar3 = aVar;
                                                        parcelable = oVar;
                                                        break;
                                                    }
                                                    parcelable = null;
                                                    aVar3 = aVar;
                                                    break;
                                                }
                                                str3 = str17;
                                                parcelable = null;
                                                aVar3 = aVar;
                                                break;
                                            case -443445851:
                                                b7 b7Var6 = b7Var2;
                                                String str34 = str2;
                                                if (str34.equals("familyAndStatus")) {
                                                    com.yandex.plus.home.graphql.panel.mappers.shortcut.d dVar5 = (com.yandex.plus.home.graphql.panel.mappers.shortcut.d) mVar.j;
                                                    dVar5.getClass();
                                                    com.yandex.plus.home.graphql.panel.mappers.shortcut.a m4 = dVar5.a.m(str34, inVar7, b7Var6, h, true, aVar);
                                                    String str35 = m4.c;
                                                    if (str35 != null) {
                                                        oVar = new com.yandex.plus.home.repository.api.model.panel.y(m4.e, m4.f, m4.g, m4.h, m4.i, m4.a, m4.b, str35, m4.d, m4.j);
                                                        aVar3 = aVar;
                                                        str3 = str17;
                                                        parcelable = oVar;
                                                        break;
                                                    }
                                                    parcelable = null;
                                                    aVar3 = aVar;
                                                    str3 = str17;
                                                    break;
                                                }
                                                str3 = str17;
                                                parcelable = null;
                                                aVar3 = aVar;
                                                break;
                                            case 3444122:
                                                b7 b7Var7 = b7Var2;
                                                String str36 = str2;
                                                if (str36.equals("plus")) {
                                                    f fVar3 = (f) mVar.d;
                                                    fVar3.getClass();
                                                    com.yandex.plus.home.graphql.panel.mappers.shortcut.a m5 = ((f) fVar3.b).m(str36, inVar7, b7Var7, h, true, aVar);
                                                    com.yandex.plus.core.data.common.v vVar4 = m5.e;
                                                    if (m5.c != null) {
                                                        com.yandex.plus.core.graphql.utils.b bVar = (com.yandex.plus.core.graphql.utils.b) ((com.yandex.passport.data.network.l) fVar3.c).a;
                                                        Map b = a1.b("plus_points", (List) h.get("textWithColor"));
                                                        com.yandex.plus.core.data.common.v c = b != null ? bVar.c((String) b.get("lightThemeColor"), (String) b.get("darkThemeColor")) : null;
                                                        Map b2 = a1.b("logo", (List) h.get("textWithColor"));
                                                        com.yandex.plus.core.data.common.v c2 = b2 != null ? bVar.c((String) b2.get("lightThemeColor"), (String) b2.get("darkThemeColor")) : null;
                                                        if (c == null || c2 == null) {
                                                            if (c == null) {
                                                                c = c2 == null ? vVar4 : c2;
                                                            }
                                                            rVar = new com.yandex.plus.home.repository.api.model.panel.r(c);
                                                        } else {
                                                            rVar = new com.yandex.plus.home.repository.api.model.panel.q(c, c2);
                                                        }
                                                        oVar = new com.yandex.plus.home.repository.api.model.panel.t(m5.a, m5.b, m5.c, m5.d, vVar4, m5.f, m5.g, m5.h, m5.j, rVar);
                                                        aVar3 = aVar;
                                                        str3 = str17;
                                                        parcelable = oVar;
                                                        break;
                                                    }
                                                    parcelable = null;
                                                    aVar3 = aVar;
                                                    str3 = str17;
                                                    break;
                                                }
                                                str3 = str17;
                                                parcelable = null;
                                                aVar3 = aVar;
                                                break;
                                            case 106940687:
                                                b7 b7Var8 = b7Var2;
                                                String str37 = str2;
                                                if (str37.equals("promo")) {
                                                    com.yandex.plus.home.graphql.panel.mappers.shortcut.d dVar6 = (com.yandex.plus.home.graphql.panel.mappers.shortcut.d) mVar.g;
                                                    dVar6.getClass();
                                                    com.yandex.plus.home.graphql.panel.mappers.shortcut.a m6 = dVar6.a.m(str37, inVar7, b7Var8, h, true, aVar);
                                                    if (m6.c != null) {
                                                        List list10 = (List) h.get("teaser");
                                                        hb hbVar3 = list10 != null ? (hb) CollectionsKt.firstOrNull(list10) : null;
                                                        List list11 = (List) d.get("teaser");
                                                        b6 b6Var3 = list11 != null ? (b6) CollectionsKt.firstOrNull(list11) : null;
                                                        String str38 = hbVar3 != null ? hbVar3.e : null;
                                                        String str39 = b6Var3 != null ? b6Var3.e : null;
                                                        com.yandex.plus.core.data.common.y yVar3 = new com.yandex.plus.core.data.common.y(str38, str39);
                                                        List list12 = (List) h.get("logo");
                                                        hb hbVar4 = list12 != null ? (hb) CollectionsKt.firstOrNull(list12) : null;
                                                        List list13 = (List) d.get("logo");
                                                        b6 b6Var4 = list13 != null ? (b6) CollectionsKt.firstOrNull(list13) : null;
                                                        String str40 = hbVar4 != null ? hbVar4.e : null;
                                                        String str41 = b6Var4 != null ? b6Var4.e : null;
                                                        com.yandex.plus.core.data.common.y yVar4 = new com.yandex.plus.core.data.common.y(str40, str41);
                                                        en enVar = inVar7.i;
                                                        String str42 = enVar != null ? enVar.c : null;
                                                        String str43 = (b7Var8 == null || (x6Var = b7Var8.f) == null) ? null : x6Var.c;
                                                        com.yandex.plus.core.data.common.y yVar5 = new com.yandex.plus.core.data.common.y(str42, str43);
                                                        String str44 = str39;
                                                        if (str38 != null) {
                                                            String str45 = str38;
                                                            if (com.yandex.plus.bdui.flex.ui.a.x(str38)) {
                                                                linkedList.add(new com.yandex.plus.home.repository.api.model.panel.l(str37, str19, "teaser", "imageUrl", str45, str18, true, 32));
                                                            }
                                                        }
                                                        if (str44 != null && com.yandex.plus.bdui.flex.ui.a.x(str44)) {
                                                            linkedList.add(new com.yandex.plus.home.repository.api.model.panel.l(str37, str19, "teaser", "imageUrl", str44, str18, false, 32));
                                                        }
                                                        if (str40 != null && com.yandex.plus.bdui.flex.ui.a.x(str40)) {
                                                            linkedList.add(new com.yandex.plus.home.repository.api.model.panel.l(str37, str19, "logo", "imageUrl", str40, str18, true, 32));
                                                        }
                                                        if (str41 != null && com.yandex.plus.bdui.flex.ui.a.x(str41)) {
                                                            linkedList.add(new com.yandex.plus.home.repository.api.model.panel.l(str37, str19, "logo", "imageUrl", str41, str18, false, 32));
                                                        }
                                                        if (str42 != null && com.yandex.plus.bdui.flex.ui.a.x(str42)) {
                                                            linkedList.add(new com.yandex.plus.home.repository.api.model.panel.l(str37, str19, null, C0479n3.g, str42, str18, true, 36));
                                                        }
                                                        if (str43 != null && com.yandex.plus.bdui.flex.ui.a.x(str43)) {
                                                            linkedList.add(new com.yandex.plus.home.repository.api.model.panel.l(str37, str19, null, C0479n3.g, str43, str18, false, 36));
                                                        }
                                                        oVar = new com.yandex.plus.home.repository.api.model.panel.u(m6.a, m6.b, m6.c, m6.d, m6.e, m6.f, m6.g, m6.h, m6.j, yVar5, yVar3, yVar4);
                                                        aVar3 = aVar;
                                                        str3 = str17;
                                                        parcelable = oVar;
                                                        break;
                                                    }
                                                    parcelable = null;
                                                    aVar3 = aVar;
                                                    str3 = str17;
                                                    break;
                                                }
                                                str3 = str17;
                                                parcelable = null;
                                                aVar3 = aVar;
                                                break;
                                            case 974939527:
                                                b7 b7Var9 = b7Var2;
                                                String str46 = str2;
                                                if (str46.equals("promo_mini")) {
                                                    com.yandex.plus.home.graphql.panel.mappers.shortcut.d dVar7 = (com.yandex.plus.home.graphql.panel.mappers.shortcut.d) mVar.h;
                                                    dVar7.getClass();
                                                    com.yandex.plus.home.graphql.panel.mappers.shortcut.a m7 = dVar7.a.m(str46, inVar7, b7Var9, h, true, aVar);
                                                    if (m7.c != null) {
                                                        List list14 = (List) h.get("logo");
                                                        hb hbVar5 = list14 != null ? (hb) CollectionsKt.firstOrNull(list14) : null;
                                                        List list15 = (List) d.get("logo");
                                                        b6 b6Var5 = list15 != null ? (b6) CollectionsKt.firstOrNull(list15) : null;
                                                        String str47 = hbVar5 != null ? hbVar5.e : null;
                                                        String str48 = b6Var5 != null ? b6Var5.e : null;
                                                        com.yandex.plus.core.data.common.y yVar6 = new com.yandex.plus.core.data.common.y(str47, str48);
                                                        if (str47 != null && com.yandex.plus.bdui.flex.ui.a.x(str47)) {
                                                            linkedList.add(new com.yandex.plus.home.repository.api.model.panel.l(str46, str19, null, "iconUrl", str47, str18, true, 36));
                                                        }
                                                        if (str48 != null && com.yandex.plus.bdui.flex.ui.a.x(str48)) {
                                                            linkedList.add(new com.yandex.plus.home.repository.api.model.panel.l(str46, str19, null, "iconUrl", str48, str18, false, 36));
                                                        }
                                                        oVar = new com.yandex.plus.home.repository.api.model.panel.v(m7.a, m7.b, m7.c, m7.d, m7.e, m7.f, m7.g, m7.h, m7.j, yVar6);
                                                        aVar3 = aVar;
                                                        str3 = str17;
                                                        parcelable = oVar;
                                                        break;
                                                    }
                                                    parcelable = null;
                                                    aVar3 = aVar;
                                                    str3 = str17;
                                                    break;
                                                } else {
                                                    str3 = str17;
                                                    parcelable = null;
                                                    aVar3 = aVar;
                                                    break;
                                                }
                                            case 1576429446:
                                                if (str2.equals("not_plus")) {
                                                    com.yandex.plus.home.graphql.panel.mappers.shortcut.d dVar8 = (com.yandex.plus.home.graphql.panel.mappers.shortcut.d) mVar.e;
                                                    dVar8.getClass();
                                                    com.yandex.plus.home.graphql.panel.mappers.shortcut.a m8 = dVar8.a.m(str2, inVar7, b7Var2, h, true, aVar);
                                                    String str49 = m8.c;
                                                    if (str49 != null) {
                                                        oVar = new com.yandex.plus.home.repository.api.model.panel.p(m8.a, m8.b, str49, m8.d, m8.e, m8.f, m8.g, m8.h, m8.j);
                                                        aVar3 = aVar;
                                                        str3 = str17;
                                                        parcelable = oVar;
                                                        break;
                                                    }
                                                    parcelable = null;
                                                    aVar3 = aVar;
                                                    str3 = str17;
                                                    break;
                                                }
                                                str3 = str17;
                                                parcelable = null;
                                                aVar3 = aVar;
                                                break;
                                            default:
                                                str3 = str17;
                                                parcelable = null;
                                                aVar3 = aVar;
                                                break;
                                        }
                                        if (parcelable != null) {
                                            r14.add(parcelable);
                                        }
                                        aVar6 = aVar3;
                                        str17 = str3;
                                    }
                                } else {
                                    r14 = 0;
                                }
                                aVar2 = aVar6;
                                str = str17;
                                List list16 = r14;
                                if (r14 == 0) {
                                    list16 = c5b.a;
                                }
                                list = list16;
                                if (((Boolean) ((com.yandex.plus.home.internal.di.f) mVar.b).invoke()).booleanValue()) {
                                    ?? y0 = CollectionsKt.y0(list16);
                                    y0.add((com.yandex.plus.home.repository.api.model.panel.v) ((jyr) mVar.k).getValue());
                                    list = y0;
                                }
                            } else if (ordinal2 != 1) {
                                if (ordinal2 != 2) {
                                    i = c5b.a;
                                } else {
                                    aVar.getClass();
                                    if (list2 != null) {
                                        List list17 = list2;
                                        int a3 = tah.a(v75.o(list17, i2));
                                        if (a3 < 16) {
                                            a3 = 16;
                                        }
                                        map4 = new LinkedHashMap(a3);
                                        Iterator it8 = list17.iterator();
                                        while (it8.hasNext()) {
                                            b7 b7Var10 = ((s6) it8.next()).b;
                                            map4.put(b7Var10.a, b7Var10);
                                        }
                                    } else {
                                        map4 = e5b.a;
                                        map4.getClass();
                                    }
                                    if (list3 != null) {
                                        in inVar8 = null;
                                        for (Iterator it9 = list3.iterator(); it9.hasNext(); it9 = it2) {
                                            in inVar9 = ((zm) it9.next()).b;
                                            List list18 = (List) a1.h(inVar9).get("widgetType");
                                            if (list18 != null) {
                                                List list19 = list18;
                                                it2 = it9;
                                                int a4 = tah.a(v75.o(list19, 10));
                                                inVar6 = inVar8;
                                                if (a4 < 16) {
                                                    a4 = 16;
                                                }
                                                map5 = new LinkedHashMap(a4);
                                                for (Iterator it10 = list19.iterator(); it10.hasNext(); it10 = it10) {
                                                    Object next = it10.next();
                                                    map5.put(((hb) next).a, next);
                                                }
                                            } else {
                                                it2 = it9;
                                                inVar6 = inVar8;
                                                map5 = e5b.a;
                                                map5.getClass();
                                            }
                                            inVar8 = map5.get("dailyTopShortcut") != null ? inVar9 : inVar6;
                                        }
                                        inVar5 = inVar8;
                                    } else {
                                        inVar5 = null;
                                    }
                                    if (inVar5 != null) {
                                        b7 b7Var11 = (b7) map4.get(inVar5.b);
                                        hVar.getClass();
                                        com.yandex.plus.home.graphql.panel.mappers.shortcut.b l = hVar.l("DAILY_MINI", str16, inVar5, b7Var11, aVar);
                                        dVar = l == null ? null : new com.yandex.plus.home.repository.api.model.panel.d(l.a, l.b, l.c, l.d, l.e, l.f, l.g, l.h, l.i, l.j, l.k, l.l, l.m, l.n, l.o, l.p, l.q, l.r, l.s, l.t, l.u, l.v, l.w);
                                    }
                                    aVar5.a(str16, "dailyTopShortcut");
                                    dVar = null;
                                    i = u75.i(dVar);
                                }
                                str = str16;
                                linkedHashMap = linkedHashMap3;
                                arrayList3 = arrayList5;
                                it = it3;
                                anVar = anVar2;
                                i0Var = i0Var2;
                                list = i;
                                aVar2 = aVar;
                            } else {
                                aVar.getClass();
                                if (list2 != null) {
                                    List list20 = list2;
                                    int a5 = tah.a(v75.o(list20, 10));
                                    if (a5 < 16) {
                                        a5 = 16;
                                    }
                                    map2 = new LinkedHashMap(a5);
                                    Iterator it11 = list20.iterator();
                                    while (it11.hasNext()) {
                                        b7 b7Var12 = ((s6) it11.next()).b;
                                        map2.put(b7Var12.a, b7Var12);
                                    }
                                } else {
                                    map2 = e5b.a;
                                    map2.getClass();
                                }
                                if (list3 != null) {
                                    Iterator it12 = list3.iterator();
                                    in inVar10 = null;
                                    in inVar11 = null;
                                    inVar3 = null;
                                    while (it12.hasNext()) {
                                        Iterator it13 = it12;
                                        in inVar12 = ((zm) it12.next()).b;
                                        List list21 = (List) a1.h(inVar12).get("widgetType");
                                        if (list21 != null) {
                                            List list22 = list21;
                                            inVar4 = inVar10;
                                            int a6 = tah.a(v75.o(list22, 10));
                                            if (a6 < 16) {
                                                a6 = 16;
                                            }
                                            map3 = new LinkedHashMap(a6);
                                            Iterator it14 = list22.iterator();
                                            while (it14.hasNext()) {
                                                Iterator it15 = it14;
                                                Object next2 = it15.next();
                                                map3.put(((hb) next2).a, next2);
                                                it14 = it15;
                                                str16 = str16;
                                            }
                                            str14 = str16;
                                        } else {
                                            inVar4 = inVar10;
                                            str14 = str16;
                                            map3 = e5b.a;
                                            map3.getClass();
                                        }
                                        inVar10 = map3.get("dailyBigShortcut") != null ? inVar12 : inVar4;
                                        if (map3.get("dailyTopShortcut") != null) {
                                            inVar11 = inVar12;
                                        }
                                        if (map3.get("dailyBottomShortcut") != null) {
                                            inVar3 = inVar12;
                                        }
                                        it12 = it13;
                                        str16 = str14;
                                    }
                                    inVar = inVar11;
                                    inVar2 = inVar10;
                                } else {
                                    inVar = null;
                                    inVar2 = null;
                                    inVar3 = null;
                                }
                                String str50 = str16;
                                if (inVar2 != null) {
                                    b7 b7Var13 = (b7) map2.get(inVar2.b);
                                    hVar.getClass();
                                    com.yandex.plus.home.graphql.panel.mappers.shortcut.b l2 = hVar.l("DAILY_FULL", str50, inVar2, b7Var13, aVar);
                                    if (l2 == null) {
                                        parcelable2 = null;
                                        aVar4 = aVar;
                                        str10 = str50;
                                        linkedHashMap = linkedHashMap3;
                                        arrayList3 = arrayList5;
                                        it = it3;
                                        anVar = anVar2;
                                        i0Var = i0Var2;
                                    } else {
                                        aVar4 = aVar;
                                        str10 = str50;
                                        arrayList3 = arrayList5;
                                        it = it3;
                                        anVar = anVar2;
                                        i0Var = i0Var2;
                                        parcelable2 = new com.yandex.plus.home.repository.api.model.panel.b(l2.a, l2.b, l2.c, l2.d, l2.e, l2.f, l2.g, l2.h, l2.i, l2.j, l2.k, l2.l, l2.m, l2.n, l2.o, l2.p, l2.q, l2.r, l2.s, l2.t, l2.u, l2.v, l2.w);
                                        linkedHashMap = linkedHashMap3;
                                    }
                                } else {
                                    if (inVar == null || inVar3 == null) {
                                        in inVar13 = inVar3;
                                        str10 = str50;
                                        aVar4 = aVar;
                                        linkedHashMap = linkedHashMap3;
                                        arrayList3 = arrayList5;
                                        it = it3;
                                        anVar = anVar2;
                                        i0Var = i0Var2;
                                        if (inVar == null) {
                                            aVar5.a(str10, "dailyBigShortcut|dailyTopShortcut");
                                        }
                                        if (inVar13 == null) {
                                            aVar5.a(str10, "dailyBigShortcut|dailyBottomShortcut");
                                        }
                                    } else {
                                        String str51 = inVar3.b;
                                        b7 b7Var14 = (b7) map2.get(inVar.b);
                                        b7 b7Var15 = (b7) map2.get(str51);
                                        hVar.getClass();
                                        aVar4 = aVar;
                                        com.yandex.plus.home.graphql.panel.mappers.shortcut.b l3 = hVar.l("DAILY_FULL", str50, inVar, b7Var14, aVar4);
                                        if (l3 == null) {
                                            str10 = str50;
                                            linkedHashMap = linkedHashMap3;
                                            arrayList3 = arrayList5;
                                            it = it3;
                                            anVar = anVar2;
                                            i0Var = i0Var2;
                                        } else {
                                            com.yandex.plus.home.analytics.diagnostic.panel.a aVar7 = (com.yandex.plus.home.analytics.diagnostic.panel.a) hVar.e;
                                            if (b7Var15 == null) {
                                                str11 = "DAILY_FULL";
                                                aVar4.a.add(new com.yandex.plus.home.repository.api.model.panel.k("DAILY_FULL", str51));
                                            } else {
                                                str11 = "DAILY_FULL";
                                            }
                                            Map h2 = a1.h(inVar3);
                                            Map d2 = a1.d(b7Var15);
                                            String str52 = str11;
                                            linkedHashMap = linkedHashMap3;
                                            in inVar14 = inVar3;
                                            str10 = str50;
                                            it = it3;
                                            com.yandex.plus.home.graphql.panel.mappers.shortcut.a m9 = ((f) hVar.d).m(str52, inVar14, b7Var15, h2, false, aVar);
                                            aVar4 = aVar;
                                            String str53 = m9.a;
                                            String str54 = m9.c;
                                            if (str54 == null || StringsKt.U(str54)) {
                                                arrayList3 = arrayList5;
                                                anVar = anVar2;
                                                i0Var = i0Var2;
                                                aVar7.b(str10, str53);
                                            } else {
                                                d0 d0Var2 = m9.i;
                                                d0 d0Var3 = (d0Var2 == null || StringsKt.U(d0Var2.a)) ? null : d0Var2;
                                                com.yandex.plus.home.graphql.panel.mappers.shortcut.c y = hVar.y(h2, d2);
                                                List list23 = (List) d2.get("dailyServices");
                                                List list24 = (List) h2.get("dailyServices");
                                                if (list24 != null) {
                                                    List list25 = list24;
                                                    str12 = str53;
                                                    arrayList3 = arrayList5;
                                                    i0Var = i0Var2;
                                                    ArrayList arrayList7 = new ArrayList(v75.o(list25, 10));
                                                    Iterator it16 = list25.iterator();
                                                    while (true) {
                                                        int i5 = i4;
                                                        if (it16.hasNext()) {
                                                            Object next3 = it16.next();
                                                            i4 = i5 + 1;
                                                            if (i5 < 0) {
                                                                u75.n();
                                                                throw null;
                                                            }
                                                            hb hbVar6 = (hb) next3;
                                                            Iterator it17 = it16;
                                                            an anVar3 = anVar2;
                                                            String str55 = hbVar6.a;
                                                            if (list23 == null || (b6Var = (b6) CollectionsKt.S(list23, i5)) == null || (str13 = b6Var.a) == null) {
                                                                str13 = hbVar6.a;
                                                            }
                                                            arrayList7.add(new com.yandex.plus.core.data.common.y(str55, str13));
                                                            it16 = it17;
                                                            anVar2 = anVar3;
                                                        } else {
                                                            arrayList4 = arrayList7;
                                                        }
                                                    }
                                                } else {
                                                    str12 = str53;
                                                    arrayList3 = arrayList5;
                                                    i0Var = i0Var2;
                                                    arrayList4 = null;
                                                }
                                                anVar = anVar2;
                                                if (d0Var3 == null && y == null && (arrayList4 == null || arrayList4.isEmpty())) {
                                                    aVar7.getClass();
                                                    dnb dnbVar = aVar7.a;
                                                    dnbVar.getClass();
                                                    LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                                                    linkedHashMap5.put("section_id", str10);
                                                    linkedHashMap5.put("shortcut_id", str51);
                                                    linkedHashMap5.put("_meta", dnb.b(new HashMap()));
                                                    dnbVar.c("Error.Panel.DailyWidget.Missed.ButtonWithDescriptionWithServices", linkedHashMap5);
                                                } else {
                                                    com.yandex.plus.home.graphql.panel.mappers.shortcut.c D = hVar.D(h2, d2, m9);
                                                    List list26 = (List) h2.get("dailyIcons");
                                                    hb hbVar7 = list26 != null ? (hb) CollectionsKt.firstOrNull(list26) : null;
                                                    List list27 = (List) d2.get("dailyIcons");
                                                    b6 b6Var6 = list27 != null ? (b6) CollectionsKt.firstOrNull(list27) : null;
                                                    eVar = new com.yandex.plus.home.repository.api.model.panel.e(str12, m9.g, hVar.F("dailyConfettiStart", hbVar7, b6Var6), hVar.F("dailyConfettiEnd", hbVar7, b6Var6), m9.h, m9.c, D != null ? D.a : null, y != null ? y.a : null, m9.e, D != null ? D.b : null, y != null ? y.b : null, D != null ? D.d : null, y != null ? y.d : null, D != null ? D.c : null, y != null ? y.c : null, d0Var3, arrayList4);
                                                    if (eVar != null) {
                                                        parcelable2 = new com.yandex.plus.home.repository.api.model.panel.f(l3.a, l3.b, l3.c, l3.d, l3.e, l3.f, l3.g, l3.h, l3.i, l3.j, l3.k, l3.l, l3.m, l3.n, l3.o, l3.p, l3.q, l3.r, l3.s, l3.t, l3.u, l3.v, l3.w, eVar);
                                                    }
                                                }
                                            }
                                            eVar = null;
                                            if (eVar != null) {
                                            }
                                        }
                                    }
                                    parcelable2 = null;
                                }
                                list = u75.i(parcelable2);
                                aVar2 = aVar4;
                                str = str10;
                            }
                        }
                        b0Var3 = new com.yandex.plus.home.repository.api.model.panel.b0(str, anVar.b, a0Var2, z3, list);
                    }
                    if (b0Var3 != null) {
                        b0Var2 = b0Var3;
                        ArrayList arrayList8 = arrayList3;
                        if (b0Var2 == null) {
                            arrayList8.add(b0Var2);
                        }
                        arrayList5 = arrayList8;
                        linkedHashMap3 = linkedHashMap;
                        it3 = it;
                        i2 = 10;
                        i3 = 16;
                        fVar = this;
                    }
                } else {
                    a0Var = a0.a;
                }
                a0Var2 = a0Var;
                if (a0Var2 != null) {
                }
                if (b0Var3 != null) {
                }
            } else {
                aVar2 = aVar;
                linkedHashMap = linkedHashMap3;
                arrayList3 = arrayList5;
                it = it3;
                i0Var = i0Var2;
                b0Var = null;
            }
            com.yandex.plus.home.repository.api.model.panel.j jVar = new com.yandex.plus.home.repository.api.model.panel.j(i0Var.a);
            aVar2.getClass();
            aVar2.a.add(jVar);
            b0Var2 = b0Var;
            ArrayList arrayList82 = arrayList3;
            if (b0Var2 == null) {
            }
            arrayList5 = arrayList82;
            linkedHashMap3 = linkedHashMap;
            it3 = it;
            i2 = 10;
            i3 = 16;
            fVar = this;
        }
        return arrayList5;
    }

    public com.yandex.plus.home.repository.api.model.user.b o(a3 a3Var) {
        String str = a3Var.a;
        com.yandex.plus.core.graphql.fragment.u uVar = a3Var.b.b;
        String str2 = ((com.yandex.plus.home.internal.di.k) this.b).a.c() + uVar.b + "/islands-150";
        com.yandex.passport.data.network.l lVar = (com.yandex.passport.data.network.l) this.c;
        x2 x2Var = a3Var.c;
        int i = x2Var.a;
        com.yandex.plus.home.repository.api.model.user.c cVar = new com.yandex.plus.home.repository.api.model.user.c(str, lVar.u(uVar.b), true);
        ArrayList arrayList = x2Var.b;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j7 j7Var = ((y2) it.next()).b;
            arrayList2.add(new com.yandex.plus.home.repository.api.model.user.c(j7Var.a, lVar.u(j7Var.b.b.b), false));
        }
        ArrayList arrayList3 = x2Var.c;
        ArrayList arrayList4 = new ArrayList(v75.o(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            n7 n7Var = ((z2) it2.next()).b;
            arrayList4.add(new com.yandex.plus.home.repository.api.model.user.c(n7Var.a, lVar.u(n7Var.b.b.b), true));
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (!((com.yandex.plus.home.repository.api.model.user.c) next).a.equals(str)) {
                arrayList5.add(next);
            }
        }
        ArrayList arrayList6 = new ArrayList(arrayList5);
        arrayList6.addAll(arrayList2);
        return new com.yandex.plus.home.repository.api.model.user.b(str, str2, new com.yandex.plus.home.repository.api.model.user.d(i, cVar, arrayList6));
    }

    public void p() {
        com.yandex.plus.home.benchmark.c cVar = (com.yandex.plus.home.benchmark.c) this.b;
        if (cVar != null) {
            cVar.c = false;
            com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
            String str = "onViewLoadError with benchmark " + cVar.a.a;
            jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, str, null);
        }
        this.b = null;
    }

    public void q(String str) {
        str.getClass();
        com.yandex.plus.home.benchmark.c cVar = (com.yandex.plus.home.benchmark.c) this.b;
        if (cVar != null) {
            com.yandex.plus.core.benchmark.l lVar = cVar.a;
            String str2 = lVar.a;
            lVar.d();
            com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
            jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
            com.yandex.plus.core.analytics.logging.a aVar = com.yandex.plus.core.analytics.logging.a.a;
            com.yandex.plus.core.analytics.logging.e.e(aVar, bVar, "onViewLoaded with benchmark " + str2, null);
            if (cVar.c) {
                cVar.c = false;
                com.yandex.plus.core.analytics.logging.e.e(aVar, bVar, "track duration=" + z.a(lVar) + " ms with benchmark " + str2, null);
                cVar.b.invoke(lVar, tah.b(new Pair("page_url", str)));
            } else {
                com.yandex.plus.core.analytics.logging.e.e(aVar, bVar, "already tracked track with benchmark " + str2, null);
            }
        }
        this.b = null;
    }

    public ArrayList r(String str) {
        int T;
        String substring;
        a1 a1Var = (a1) this.c;
        str.getClass();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            a1Var.getClass();
            if (i >= str.length()) {
                return arrayList;
            }
            int T2 = StringsKt.T(str, "${", i, false, 4);
            String str2 = null;
            if (T2 < 0) {
                substring = str.substring(i);
                if (substring.length() <= 0) {
                    substring = null;
                }
                T = str.length();
            } else {
                int i2 = T2 + 2;
                int T3 = StringsKt.T(str, "}", i2, false, 4);
                if (T3 < 0) {
                    substring = str.substring(i);
                    if (substring.length() <= 0) {
                        substring = null;
                    }
                    T = str.length();
                } else {
                    T = StringsKt.T(str, "${", i2, false, 4);
                    if (T < 0 || T3 < T) {
                        substring = str.substring(i, T2);
                        str2 = str.substring(i2, T3);
                        T = T3 + 1;
                    } else {
                        substring = str.substring(i, T);
                        if (substring.length() <= 0) {
                            substring = null;
                        }
                    }
                }
            }
            if (substring != null && substring.length() != 0) {
                arrayList.add(new com.yandex.plus.core.templating.template.b(substring));
            }
            if (str2 != null) {
                String obj = StringsKt.t0(str2).toString();
                ((com.yandex.plus.core.templating.parser.a) this.b).getClass();
                obj.getClass();
                if (obj.length() != 0 && com.yandex.plus.core.templating.parser.a.b.contains(Character.valueOf(mlr.G(obj)))) {
                    for (int i3 = 0; i3 < obj.length(); i3++) {
                        if (com.yandex.plus.core.templating.parser.a.c.contains(Character.valueOf(obj.charAt(i3)))) {
                        }
                    }
                    arrayList.add(new com.yandex.plus.core.templating.template.c(obj));
                }
                arrayList.add(new com.yandex.plus.core.templating.template.b(hrg.q("${", str2, "}")));
                break;
            }
            i = T;
        }
    }

    public Object t(y yVar, Map map) {
        yVar.getClass();
        map.getClass();
        Object s = s(yVar, map);
        Object invoke = ((Function1) this.c).invoke(s);
        if (invoke != null) {
            return invoke;
        }
        StringBuilder sb = new StringBuilder();
        String h = ern.a(s.getClass()).h();
        sb.append(h != null ? com.yandex.plus.bdui.flex.ui.a.h(h) : null);
        sb.append(" was rendered instead of ");
        throw new my1(dfi.i(sb, (String) this.b, '!'), null);
    }

    public Object u(d5 d5Var, aur aurVar) {
        Object V = x97.V((kotlinx.coroutines.a) this.c, new com.yandex.plus.bdui.ui.b(this, d5Var, null, 17), aurVar);
        return V == nm6.a ? V : Unit.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ezc, kotlin.jvm.functions.Function0] */
    public void v() {
        com.yandex.plus.home.benchmark.c cVar = (com.yandex.plus.home.benchmark.c) ((ezc) this.c).invoke();
        this.b = cVar;
        com.yandex.plus.core.benchmark.l lVar = cVar.a;
        lVar.c();
        com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
        String str = "onViewShowed with benchmark " + lVar.a;
        jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
        com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.a, bVar, str, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object w(cg6 cg6Var) {
        com.yandex.plus.coil.a aVar;
        int i;
        sce sceVar;
        if (cg6Var instanceof com.yandex.plus.coil.a) {
            aVar = (com.yandex.plus.coil.a) cg6Var;
            int i2 = aVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.l = i2 - Integer.MIN_VALUE;
                Object obj = aVar.j;
                nm6 nm6Var = nm6.a;
                i = aVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    skn sknVar = ((com.yandex.plus.coil.b) this.b).b;
                    rce a = ((pce) this.c).a();
                    aVar.l = 1;
                    obj = sknVar.a(a, aVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                sceVar = (sce) obj;
                if (!(sceVar instanceof bqr)) {
                    return ((bqr) sceVar).a;
                }
                if (!(sceVar instanceof pgb)) {
                    b6e.s();
                    return null;
                }
                pgb pgbVar = (pgb) sceVar;
                Drawable drawable = pgbVar.a;
                if (drawable != null) {
                    return drawable;
                }
                throw pgbVar.c;
            }
        }
        aVar = new com.yandex.plus.coil.a(this, cg6Var);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
        if (i != 0) {
        }
        sceVar = (sce) obj2;
        if (!(sceVar instanceof bqr)) {
        }
    }

    public com.yandex.plus.core.graphql.daily.progress.n y(String str) {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            t7oVar = ((k0) ((x3f) this.b).b(k0.Companion.serializer(), str)).a;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            com.yandex.plus.core.analytics.logging.b bVar = com.yandex.plus.core.analytics.logging.b.a;
            String p = su4.p(a, new StringBuilder("DailyProgressMapper toRawProgressData() error="));
            jyr jyrVar = com.yandex.plus.core.analytics.logging.e.a;
            com.yandex.plus.core.analytics.logging.e.e(com.yandex.plus.core.analytics.logging.a.e, bVar, p, null);
            t7oVar = null;
        }
        return (com.yandex.plus.core.graphql.daily.progress.n) t7oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(com.yandex.plus.core.network.error.k kVar, pyc pycVar) {
        this.a = 6;
        this.c = kVar;
        this.b = (aur) pycVar;
    }

    public f(int i) {
        this.a = i;
        switch (i) {
            case 18:
                x0q b = y0q.b(1, 0, null, 6);
                this.c = b;
                this.b = b;
                break;
        }
    }

    public f(String str, com.yandex.plus.experiments.impl.providers.h hVar) {
        this.a = 20;
        str.getClass();
        hVar.getClass();
        this.c = str;
        this.b = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(Function0 function0) {
        this.a = 17;
        this.c = (ezc) function0;
    }

    public f(com.yandex.plus.home.ybsdk.a aVar, com.yandex.plus.core.location.a aVar2, kotlinx.coroutines.a aVar3) {
        this.a = 22;
        aVar2.getClass();
        aVar3.getClass();
        this.c = aVar2;
        this.b = aVar3;
    }

    public f(f fVar, com.yandex.plus.acquisition.adapter.internal.processor.b bVar) {
        this.a = 19;
        bVar.getClass();
        this.c = fVar;
        this.b = bVar;
    }

    public f(a1 a1Var) {
        this.a = 9;
        com.yandex.plus.core.templating.parser.a aVar = com.yandex.plus.core.templating.parser.a.a;
        this.c = a1Var;
        this.b = aVar;
    }

    public f(Map map, com.yandex.plus.log.api.b bVar) {
        this.a = 1;
        bVar.getClass();
        this.c = map;
        this.b = bVar;
    }

    public f(f fVar, com.yandex.passport.internal.core.accounts.h hVar) {
        this.a = 15;
        hVar.getClass();
        this.c = fVar;
        this.b = hVar;
    }

    public f(kotlinx.coroutines.a aVar) {
        this.a = 16;
        aVar.getClass();
        this.c = aVar;
        this.b = y0q.b(0, 0, null, 7);
    }

    public f(com.yandex.plus.bdui.m mVar, com.yandex.plus.log.api.b bVar) {
        this.a = 0;
        mVar.getClass();
        bVar.getClass();
        this.c = mVar;
        this.b = bVar;
    }

    public f(a1 a1Var, kotlinx.coroutines.a aVar) {
        this.a = 21;
        a1Var.getClass();
        aVar.getClass();
        this.c = a1Var;
        this.b = aVar;
    }

    public f(Set set, com.yandex.plus.log.api.b bVar) {
        this.a = 8;
        set.getClass();
        bVar.getClass();
        this.c = set;
        this.b = bVar;
    }

    public f(com.yandex.passport.data.network.l lVar, f fVar, a1 a1Var) {
        this.a = 28;
        this.c = lVar;
        this.b = fVar;
    }

    public f(com.yandex.passport.data.network.l lVar, a1 a1Var, com.yandex.passport.data.network.l lVar2) {
        this.a = 26;
        this.c = lVar;
        this.b = lVar2;
    }

    public f(com.yandex.plus.core.debug.panel.internal.utils.resource.a aVar) {
        this.a = 4;
        this.c = aVar;
        this.b = btf.b(new com.yandex.plus.bdui.plus.checkout.h(13, this));
    }

    public f(com.yandex.passport.data.network.l lVar, f fVar, a1 a1Var, a1 a1Var2, f fVar2, com.yandex.plus.home.analytics.diagnostic.panel.a aVar) {
        this.a = 25;
        aVar.getClass();
        this.c = aVar;
        this.b = new com.yandex.passport.internal.core.accounts.h(lVar, fVar, a1Var, a1Var2, fVar2, aVar);
    }

    public f(com.yandex.passport.data.network.l lVar) {
        this.a = 27;
        i5f r = quj.r(x3f.d, new com.yandex.plus.home.feature.webviews.internal.webview.e(2));
        this.c = lVar;
        this.b = r;
    }

    public f(com.yandex.plus.pay.ui.common.api.b bVar, Function0 function0) {
        this.a = 11;
        this.c = function0;
        this.b = new ybf(ern.a(com.yandex.plus.di.f.class), new com.yandex.plus.di.b(bVar, 0), new com.yandex.plus.bdui.plus.checkout.h(19, this), new com.yandex.plus.di.b(bVar, 1));
    }

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public f(com.yandex.plus.home.internal.di.z zVar, com.yandex.plus.home.api.webview.a aVar) {
        this.a = 23;
        zVar.getClass();
        this.c = zVar;
        this.b = aVar;
    }

    public f(Function1 function1) {
        this.a = 13;
        this.c = function1;
        this.b = com.yandex.plus.home.common.utils.n.a;
    }

    public f(w40 w40Var, com.yandex.plus.log.api.b bVar) {
        this.a = 2;
        bVar.getClass();
        this.c = w40Var;
        this.b = bVar;
    }
}
