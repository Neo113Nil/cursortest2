package com.yandex.passport.internal.entities;

import android.animation.ValueAnimator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.view.View;
import com.yandex.passport.api.k0;
import com.yandex.passport.api.n1;
import com.yandex.passport.api.o1;
import com.yandex.passport.api.p0;
import com.yandex.passport.internal.entities.j;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.di.c;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.view.d;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.a1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.b6;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.c6;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.d1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.d5;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.g1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.i5;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.j1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.j5;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.k1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.l0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.m5;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.n0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.o0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.p5;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.r0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.r1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.s0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.s1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.s5;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.t0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.t1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.v5;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.w0;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.w1;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.y5;
import com.yandex.plus.home.plaque.repository.graphql.cache.dto.z4;
import com.yandex.plus.plaquesdk.plaque.api.models.b0;
import com.yandex.plus.plaquesdk.plaque.api.models.c0;
import com.yandex.plus.plaquesdk.plaque.api.models.d0;
import com.yandex.plus.plaquesdk.plaque.api.models.e0;
import com.yandex.plus.plaquesdk.plaque.api.models.f0;
import com.yandex.plus.plaquesdk.plaque.api.models.g0;
import com.yandex.plus.plaquesdk.plaque.api.models.h0;
import com.yandex.plus.plaquesdk.plaque.api.models.i0;
import com.yandex.plus.plaquesdk.plaque.api.models.j0;
import defpackage.aa0;
import defpackage.axt;
import defpackage.b6e;
import defpackage.bow;
import defpackage.btf;
import defpackage.bxt;
import defpackage.bz9;
import defpackage.c5b;
import defpackage.c85;
import defpackage.cg6;
import defpackage.cxt;
import defpackage.dxt;
import defpackage.dzf;
import defpackage.e5b;
import defpackage.ext;
import defpackage.f1d;
import defpackage.get;
import defpackage.gxt;
import defpackage.het;
import defpackage.hrg;
import defpackage.hxt;
import defpackage.ixt;
import defpackage.jyr;
import defpackage.kxt;
import defpackage.lm4;
import defpackage.lyf;
import defpackage.mm6;
import defpackage.mu7;
import defpackage.nm6;
import defpackage.nsa;
import defpackage.q5b;
import defpackage.qgg;
import defpackage.ru2;
import defpackage.ryc;
import defpackage.su4;
import defpackage.t75;
import defpackage.tah;
import defpackage.uah;
import defpackage.v75;
import defpackage.wop;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.zwt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData$UgcLiveStatus;

/* loaded from: classes4.dex */
public final class j implements p0, com.yandex.plus.pay.ui.webview.family.ui.b {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public j() {
        o1.r0.getClass();
        this.c = n1.b;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.d = e5bVar;
        this.e = new com.yandex.passport.common.bitflag.b(xz0.q(new com.yandex.passport.api.n[]{com.yandex.passport.api.n.PORTAL, com.yandex.passport.api.n.SOCIAL, com.yandex.passport.api.n.LITE, com.yandex.passport.api.n.PDD, com.yandex.passport.api.n.UNDEFINED}));
    }

    public static c0 C(com.yandex.plus.home.plaque.repository.graphql.cache.dto.i iVar) {
        if (iVar instanceof com.yandex.plus.home.plaque.repository.graphql.cache.dto.d) {
            return new com.yandex.plus.plaquesdk.plaque.api.models.y("", ((com.yandex.plus.home.plaque.repository.graphql.cache.dto.d) iVar).a);
        }
        if (iVar instanceof com.yandex.plus.home.plaque.repository.graphql.cache.dto.h) {
            com.yandex.plus.home.plaque.repository.graphql.cache.dto.h hVar = (com.yandex.plus.home.plaque.repository.graphql.cache.dto.h) iVar;
            return new com.yandex.plus.plaquesdk.plaque.api.models.a0("", hVar.a, hVar.b);
        }
        if (iVar instanceof com.yandex.plus.home.plaque.repository.graphql.cache.dto.e) {
            return new com.yandex.plus.plaquesdk.plaque.api.models.z("");
        }
        b6e.s();
        return null;
    }

    public static f0 F(s1 s1Var) {
        int ordinal = s1Var.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return null;
        }
        if (ordinal == 2) {
            return f0.a;
        }
        if (ordinal == 3) {
            return f0.b;
        }
        b6e.s();
        return null;
    }

    public static void J(com.yandex.plus.home.api.lifecycle.b bVar, com.yandex.plus.home.api.lifecycle.a aVar) {
        switch (aVar.ordinal()) {
            case 0:
                bVar.getClass();
                bVar.d();
                break;
            case 1:
                bVar.b();
                bVar.c();
                break;
            case 2:
                bVar.a();
                break;
            case 3:
                bVar.onResume();
                break;
            case 4:
                bVar.onStop();
                break;
            case 5:
                bVar.onDestroy();
                break;
            case 6:
                break;
            default:
                b6e.s();
                break;
        }
    }

    public static String K(j jVar, String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            str = kotlin.text.c.r(str, (String) entry.getKey(), (String) entry.getValue(), false);
        }
        return str;
    }

    public Object A(t1 t1Var, Map map, cg6 cg6Var) {
        s1 s1Var;
        f0 F;
        if (t1Var instanceof r1) {
            Object z = z((r1) t1Var, map, cg6Var);
            return z == nm6.a ? z : (g0) z;
        }
        if (!(t1Var instanceof com.yandex.plus.home.plaque.repository.graphql.cache.dto.o1)) {
            b6e.s();
            return null;
        }
        com.yandex.plus.home.plaque.repository.graphql.cache.dto.o1 o1Var = (com.yandex.plus.home.plaque.repository.graphql.cache.dto.o1) t1Var;
        int i = o1Var.b;
        if (i < 1 || (s1Var = o1Var.a) == null || (F = F(s1Var)) == null) {
            return null;
        }
        return new d0(i, F);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r12 == null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.yandex.plus.plaquesdk.plaque.api.models.i B(j1 j1Var, Map map) {
        com.yandex.plus.plaquesdk.plaque.api.models.c cVar;
        com.yandex.plus.plaquesdk.plaque.api.models.d dVar;
        ?? r1;
        String K = K(this, j1Var.a, map);
        String str = j1Var.g;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            cVar = com.yandex.plus.plaquesdk.plaque.api.models.c.valueOf(upperCase);
        }
        cVar = com.yandex.plus.plaquesdk.plaque.api.models.c.a;
        com.yandex.plus.plaquesdk.plaque.api.models.c cVar2 = cVar;
        String str2 = j1Var.h;
        if (str2 != null) {
            String upperCase2 = str2.toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            dVar = com.yandex.plus.plaquesdk.plaque.api.models.d.valueOf(upperCase2);
        } else {
            dVar = null;
        }
        Integer num = j1Var.f;
        List<String> list = j1Var.b;
        if (list != null) {
            r1 = new ArrayList();
            for (String str3 : list) {
                com.yandex.plus.plaquesdk.plaque.api.models.j valueOf = str3 != null ? com.yandex.plus.plaquesdk.plaque.api.models.j.valueOf(str3) : null;
                if (valueOf != null) {
                    r1.add(valueOf);
                }
            }
        } else {
            r1 = c5b.a;
        }
        List list2 = r1;
        c5b c5bVar = c5b.a;
        String str4 = j1Var.c;
        if (str4 == null) {
            str4 = "";
        }
        return new com.yandex.plus.plaquesdk.plaque.api.models.i(K, cVar2, dVar, num, list2, c5bVar, str4, j1Var.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x017f, code lost:
    
        if (r1 == r7) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r12v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x017f -> B:11:0x0182). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00fe -> B:26:0x0100). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object D(w1 w1Var, Map map, cg6 cg6Var) {
        com.yandex.plus.home.plaque.repository.graphql.m mVar;
        int i;
        LinkedHashMap x;
        w1 w1Var2;
        Iterator it;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        Map map2;
        com.yandex.plus.home.plaque.repository.graphql.m mVar2;
        LinkedHashMap linkedHashMap;
        Collection arrayList2;
        com.yandex.plus.home.plaque.repository.graphql.m mVar3;
        List list;
        int i5;
        int i6;
        int i7;
        Iterator it2;
        j jVar = this;
        if (cg6Var instanceof com.yandex.plus.home.plaque.repository.graphql.m) {
            mVar = (com.yandex.plus.home.plaque.repository.graphql.m) cg6Var;
            int i8 = mVar.x;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                mVar.x = i8 - Integer.MIN_VALUE;
                Object obj = mVar.v;
                nm6 nm6Var = nm6.a;
                i = mVar.x;
                if (i != 0) {
                    qgg.h0(obj);
                    LinkedHashMap S = S(w1Var);
                    if (S != null) {
                        x = x(w1Var);
                        List list2 = w1Var.d;
                        ArrayList arrayList3 = new ArrayList();
                        w1Var2 = w1Var;
                        it = list2.iterator();
                        arrayList = arrayList3;
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                        map2 = map;
                        mVar2 = mVar;
                        linkedHashMap = S;
                        if (it.hasNext()) {
                        }
                    }
                    return null;
                }
                if (i == 1) {
                    int i9 = mVar.u;
                    int i10 = mVar.t;
                    int i11 = mVar.s;
                    Iterator it3 = mVar.q;
                    Collection collection = mVar.p;
                    Collection collection2 = mVar.o;
                    List list3 = mVar.n;
                    Map map3 = mVar.m;
                    Map map4 = mVar.l;
                    Map map5 = mVar.k;
                    w1Var2 = mVar.j;
                    qgg.h0(obj);
                    mVar2 = mVar;
                    linkedHashMap = map4;
                    i4 = i11;
                    ArrayList arrayList4 = collection2;
                    i2 = i9;
                    x = map3;
                    i3 = i10;
                    map2 = map5;
                    it = it3;
                    com.yandex.plus.home.plaque.repository.api.model.b bVar = (com.yandex.plus.home.plaque.repository.api.model.b) obj;
                    if (bVar != null) {
                        arrayList4.add(bVar);
                    }
                    arrayList = arrayList4;
                    if (it.hasNext()) {
                        com.yandex.plus.home.plaque.repository.graphql.cache.dto.g0 g0Var = (com.yandex.plus.home.plaque.repository.graphql.cache.dto.g0) it.next();
                        i0 i0Var = i0.a;
                        mVar2.j = w1Var2;
                        mVar2.k = map2;
                        mVar2.l = linkedHashMap;
                        mVar2.m = x;
                        mVar2.n = null;
                        mVar2.o = arrayList;
                        mVar2.p = null;
                        mVar2.q = it;
                        mVar2.r = null;
                        mVar2.s = i4;
                        mVar2.t = i3;
                        mVar2.u = i2;
                        mVar2.x = 1;
                        obj = jVar.t(g0Var, linkedHashMap, x, map2, i0Var, mVar2);
                        if (obj != nm6Var) {
                            arrayList4 = arrayList;
                            com.yandex.plus.home.plaque.repository.api.model.b bVar2 = (com.yandex.plus.home.plaque.repository.api.model.b) obj;
                            if (bVar2 != null) {
                            }
                            arrayList = arrayList4;
                            if (it.hasNext()) {
                                ArrayList arrayList5 = arrayList;
                                if (arrayList5.isEmpty()) {
                                    arrayList5 = null;
                                }
                                if (arrayList5 == null) {
                                    com.yandex.plus.log.api.b bVar3 = (com.yandex.plus.log.api.b) jVar.d;
                                    com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                                    if (bVar3.b(aVar)) {
                                        bVar3.c(aVar, "PlaqueMapper", "defaultPlaques is empty");
                                    }
                                    return null;
                                }
                                List list4 = w1Var2.b;
                                arrayList2 = new ArrayList();
                                mVar3 = mVar2;
                                list = arrayList5;
                                i5 = 0;
                                i6 = 0;
                                i7 = 0;
                                it2 = list4.iterator();
                                if (it2.hasNext()) {
                                }
                            }
                        }
                        return nm6Var;
                    }
                } else {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i12 = mVar.u;
                    int i13 = mVar.t;
                    int i14 = mVar.s;
                    it2 = mVar.r;
                    arrayList2 = mVar.p;
                    Collection collection3 = mVar.o;
                    list = mVar.n;
                    Map map6 = mVar.m;
                    Map map7 = mVar.l;
                    Map map8 = mVar.k;
                    qgg.h0(obj);
                    mVar3 = mVar;
                    linkedHashMap = map7;
                    i7 = i12;
                    x = map6;
                    i6 = i13;
                    map2 = map8;
                    i5 = i14;
                    com.yandex.plus.home.plaque.repository.api.model.a aVar2 = (com.yandex.plus.home.plaque.repository.api.model.a) obj;
                    if (aVar2 != null) {
                        arrayList2.add(aVar2);
                    }
                    jVar = this;
                    if (it2.hasNext()) {
                        return new com.yandex.plus.home.plaque.repository.api.model.d((List) arrayList2, list);
                    }
                    com.yandex.plus.home.plaque.repository.graphql.cache.dto.a0 a0Var = (com.yandex.plus.home.plaque.repository.graphql.cache.dto.a0) it2.next();
                    mVar3.j = null;
                    mVar3.k = map2;
                    mVar3.l = linkedHashMap;
                    mVar3.m = x;
                    mVar3.n = list;
                    mVar3.o = null;
                    mVar3.p = arrayList2;
                    mVar3.q = null;
                    mVar3.r = it2;
                    mVar3.s = i5;
                    mVar3.t = i6;
                    mVar3.u = i7;
                    mVar3.x = 2;
                    obj = jVar.s(a0Var, linkedHashMap, x, map2, mVar3);
                }
            }
        }
        mVar = new com.yandex.plus.home.plaque.repository.graphql.m(jVar, cg6Var);
        Object obj2 = mVar.v;
        nm6 nm6Var2 = nm6.a;
        i = mVar.x;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cc, code lost:
    
        if (r15 != null) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00b0 -> B:10:0x00b3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object E(w1 w1Var, Map map, cg6 cg6Var) {
        com.yandex.plus.home.plaque.repository.graphql.n nVar;
        int i;
        w1 w1Var2;
        Iterator it;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        int i5;
        Map map2;
        com.yandex.plus.home.plaque.repository.graphql.n nVar2;
        ArrayList arrayList2;
        j jVar = this;
        if (cg6Var instanceof com.yandex.plus.home.plaque.repository.graphql.n) {
            nVar = (com.yandex.plus.home.plaque.repository.graphql.n) cg6Var;
            int i6 = nVar.u;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                nVar.u = i6 - Integer.MIN_VALUE;
                Object obj = nVar.s;
                nm6 nm6Var = nm6.a;
                i = nVar.u;
                if (i != 0) {
                    qgg.h0(obj);
                    if (w1Var != null && (r2 = S(w1Var)) != null) {
                        List list = w1Var.e;
                        ArrayList arrayList3 = new ArrayList();
                        w1Var2 = w1Var;
                        it = list.iterator();
                        arrayList = arrayList3;
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        map2 = map;
                        nVar2 = nVar;
                        if (it.hasNext()) {
                        }
                    }
                    arrayList2 = t75.c(com.yandex.plus.home.plaque.repository.api.model.b.g);
                    return new com.yandex.plus.home.plaque.repository.api.model.d(c5b.a, arrayList2);
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i7 = nVar.r;
                int i8 = nVar.q;
                int i9 = nVar.p;
                int i10 = nVar.o;
                Iterator it2 = nVar.n;
                Collection collection = nVar.m;
                Map map3 = nVar.l;
                Map map4 = nVar.k;
                w1 w1Var3 = nVar.j;
                qgg.h0(obj);
                int i11 = i8;
                it = it2;
                arrayList = collection;
                map2 = map4;
                w1Var2 = w1Var3;
                i2 = i7;
                i4 = i9;
                i5 = i10;
                nVar2 = nVar;
                LinkedHashMap linkedHashMap = map3;
                com.yandex.plus.home.plaque.repository.api.model.b bVar = (com.yandex.plus.home.plaque.repository.api.model.b) obj;
                if (bVar != null) {
                    arrayList.add(bVar);
                }
                LinkedHashMap S = linkedHashMap;
                i3 = i11;
                jVar = this;
                if (it.hasNext()) {
                    com.yandex.plus.home.plaque.repository.graphql.cache.dto.g0 g0Var = (com.yandex.plus.home.plaque.repository.graphql.cache.dto.g0) it.next();
                    LinkedHashMap x = jVar.x(w1Var2);
                    i0 i0Var = i0.d;
                    nVar2.j = w1Var2;
                    nVar2.k = map2;
                    nVar2.l = S;
                    nVar2.m = arrayList;
                    nVar2.n = it;
                    nVar2.o = i5;
                    nVar2.p = i4;
                    nVar2.q = i3;
                    nVar2.r = i2;
                    nVar2.u = 1;
                    Object t = jVar.t(g0Var, S, x, map2, i0Var, nVar2);
                    if (t == nm6Var) {
                        return nm6Var;
                    }
                    i11 = i3;
                    linkedHashMap = S;
                    obj = t;
                    com.yandex.plus.home.plaque.repository.api.model.b bVar2 = (com.yandex.plus.home.plaque.repository.api.model.b) obj;
                    if (bVar2 != null) {
                    }
                    LinkedHashMap S2 = linkedHashMap;
                    i3 = i11;
                    jVar = this;
                    if (it.hasNext()) {
                        arrayList2 = arrayList;
                        if (arrayList2.isEmpty()) {
                            arrayList2 = null;
                        }
                    }
                }
            }
        }
        nVar = new com.yandex.plus.home.plaque.repository.graphql.n(jVar, cg6Var);
        Object obj2 = nVar.s;
        nm6 nm6Var2 = nm6.a;
        i = nVar.u;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.yandex.passport.internal.entities.j] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00ac -> B:10:0x00af). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object G(w1 w1Var, Map map, cg6 cg6Var) {
        com.yandex.plus.home.plaque.repository.graphql.o oVar;
        int i;
        LinkedHashMap x;
        Iterator it;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        Map map2;
        com.yandex.plus.home.plaque.repository.graphql.o oVar2;
        LinkedHashMap linkedHashMap;
        if (cg6Var instanceof com.yandex.plus.home.plaque.repository.graphql.o) {
            oVar = (com.yandex.plus.home.plaque.repository.graphql.o) cg6Var;
            int i5 = oVar.t;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                oVar.t = i5 - Integer.MIN_VALUE;
                Object obj = oVar.r;
                nm6 nm6Var = nm6.a;
                i = oVar.t;
                if (i != 0) {
                    qgg.h0(obj);
                    LinkedHashMap S = S(w1Var);
                    if (S != null) {
                        x = x(w1Var);
                        List list = w1Var.c;
                        ArrayList arrayList2 = new ArrayList();
                        it = list.iterator();
                        arrayList = arrayList2;
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                        map2 = map;
                        oVar2 = oVar;
                        linkedHashMap = S;
                        if (it.hasNext()) {
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                int i6 = oVar.q;
                int i7 = oVar.p;
                int i8 = oVar.o;
                Iterator it2 = oVar.n;
                Collection collection = oVar.m;
                Map map3 = oVar.l;
                Map map4 = oVar.k;
                Map map5 = oVar.j;
                qgg.h0(obj);
                arrayList = collection;
                i2 = i6;
                x = map3;
                i3 = i7;
                map2 = map5;
                it = it2;
                oVar2 = oVar;
                linkedHashMap = map4;
                i4 = i8;
                com.yandex.plus.home.plaque.repository.api.model.b bVar = (com.yandex.plus.home.plaque.repository.api.model.b) obj;
                if (bVar != null) {
                    arrayList.add(bVar);
                }
                if (it.hasNext()) {
                    com.yandex.plus.home.plaque.repository.graphql.cache.dto.g0 g0Var = (com.yandex.plus.home.plaque.repository.graphql.cache.dto.g0) it.next();
                    i0 i0Var = i0.c;
                    oVar2.j = map2;
                    oVar2.k = linkedHashMap;
                    oVar2.l = x;
                    oVar2.m = arrayList;
                    oVar2.n = it;
                    oVar2.o = i4;
                    oVar2.p = i3;
                    oVar2.q = i2;
                    oVar2.t = 1;
                    obj = t(g0Var, linkedHashMap, x, map2, i0Var, oVar2);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                    com.yandex.plus.home.plaque.repository.api.model.b bVar2 = (com.yandex.plus.home.plaque.repository.api.model.b) obj;
                    if (bVar2 != null) {
                    }
                    if (it.hasNext()) {
                        ArrayList arrayList3 = arrayList;
                        if (arrayList3.isEmpty()) {
                            arrayList3 = null;
                        }
                        if (arrayList3 != null) {
                            return new com.yandex.plus.home.plaque.repository.api.model.d(c5b.a, arrayList3);
                        }
                        com.yandex.plus.log.api.b bVar3 = (com.yandex.plus.log.api.b) this.d;
                        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                        if (bVar3.b(aVar)) {
                            bVar3.c(aVar, "PlaqueMapper", "prefetchPlaques is empty");
                        }
                        return null;
                    }
                }
            }
        }
        oVar = new com.yandex.plus.home.plaque.repository.graphql.o(this, cg6Var);
        Object obj2 = oVar.r;
        nm6 nm6Var2 = nm6.a;
        i = oVar.t;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object H(cg6 cg6Var, List list, List list2, Map map) {
        com.yandex.plus.home.plaque.repository.graphql.p pVar;
        int i;
        com.yandex.plus.plaquesdk.plaque.api.models.l lVar;
        if (cg6Var instanceof com.yandex.plus.home.plaque.repository.graphql.p) {
            pVar = (com.yandex.plus.home.plaque.repository.graphql.p) cg6Var;
            int i2 = pVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.m = i2 - Integer.MIN_VALUE;
                Object obj = pVar.k;
                nm6 nm6Var = nm6.a;
                i = pVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (!map.containsKey((String) it.next())) {
                            return null;
                        }
                    }
                    List list3 = list;
                    ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(I((k1) it2.next(), map));
                    }
                    lVar = new com.yandex.plus.plaquesdk.plaque.api.models.l(arrayList);
                    com.yandex.plus.bdui.flex.ui.s sVar = (com.yandex.plus.bdui.flex.ui.s) this.a;
                    pVar.j = lVar;
                    pVar.m = 1;
                    obj = sVar.k(lVar, pVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lVar = pVar.j;
                    qgg.h0(obj);
                }
                return new com.yandex.plus.plaquesdk.plaque.api.models.w((CharSequence) obj, lVar);
            }
        }
        pVar = new com.yandex.plus.home.plaque.repository.graphql.p(this, cg6Var);
        Object obj2 = pVar.k;
        nm6 nm6Var2 = nm6.a;
        i = pVar.m;
        if (i != 0) {
        }
        return new com.yandex.plus.plaquesdk.plaque.api.models.w((CharSequence) obj2, lVar);
    }

    public com.yandex.plus.plaquesdk.plaque.api.models.g I(k1 k1Var, Map map) {
        com.yandex.plus.plaquesdk.plaque.api.models.k kVar;
        if (k1Var instanceof j1) {
            return B((j1) k1Var, map);
        }
        if (k1Var instanceof g1) {
            g1 g1Var = (g1) k1Var;
            return new com.yandex.plus.plaquesdk.plaque.api.models.h(g1Var.a, B(g1Var.b, map));
        }
        if (!(k1Var instanceof d1)) {
            if (!(k1Var instanceof a1)) {
                b6e.s();
                return null;
            }
            a1 a1Var = (a1) k1Var;
            String str = a1Var.a;
            com.yandex.plus.plaquesdk.plaque.api.models.e eVar = str != null ? new com.yandex.plus.plaquesdk.plaque.api.models.e(str) : null;
            List list = a1Var.b;
            ArrayList arrayList = new ArrayList(v75.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(I((k1) it.next(), map));
            }
            return new com.yandex.plus.plaquesdk.plaque.api.models.b(eVar, arrayList);
        }
        d1 d1Var = (d1) k1Var;
        String str2 = d1Var.d;
        String str3 = d1Var.c;
        if (str3 == null || (kVar = com.yandex.plus.plaquesdk.plaque.api.models.k.valueOf(str3)) == null) {
            kVar = com.yandex.plus.plaquesdk.plaque.api.models.k.a;
        }
        com.yandex.plus.plaquesdk.plaque.api.models.k kVar2 = kVar;
        String str4 = d1Var.a;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = str4;
        Integer num = d1Var.e;
        int intValue = num != null ? num.intValue() : 0;
        Integer num2 = d1Var.f;
        return new com.yandex.plus.plaquesdk.plaque.api.models.f(str2, kVar2, str5, intValue, num2 != null ? num2.intValue() : 0);
    }

    public void L(p0 p0Var) {
        com.yandex.passport.common.bitflag.b bVar = (com.yandex.passport.common.bitflag.b) this.e;
        if (p0Var != null) {
            bVar.a.a = 0;
            k0 f = p0Var.f();
            com.yandex.passport.api.h.b.getClass();
            this.a = com.yandex.passport.api.q.b(f);
            k0 e = p0Var.e();
            this.b = e != null ? com.yandex.passport.api.q.b(e) : null;
            for (com.yandex.passport.api.n nVar : p0Var.j()) {
                nVar.getClass();
                com.yandex.passport.common.bitflag.a aVar = bVar.a;
                int i = nVar.a;
                int i2 = aVar.a;
                get getVar = het.b;
                aVar.a = (1 << i) | i2;
            }
            o1 h = p0Var.h();
            h.getClass();
            this.c = h;
            Map d = p0Var.d();
            d.getClass();
            this.d = d;
        }
    }

    public Object M(com.yandex.plus.home.repository.api.model.user.a aVar, com.yandex.plus.home.feature.panel.internal.b bVar) {
        com.yandex.plus.core.analytics.logging.d dVar = (com.yandex.plus.core.analytics.logging.d) this.e;
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.b;
        Continuation continuation = null;
        if (dVar.b(aVar2)) {
            dVar.a(aVar2, "PanelRouterImpl", "routeByFamilyShortcutClick() action=" + aVar, null);
        }
        ((com.yandex.plus.core.dispatcher.a) ((com.yandex.plus.core.dispatcher.b) this.d)).getClass();
        return x97.V(com.yandex.plus.core.dispatcher.a.c, new com.yandex.passport.sloth.ui.q(this, aVar, false, continuation, 12), bVar);
    }

    public void N(com.yandex.passport.api.h hVar) {
        hVar.getClass();
        this.a = hVar;
    }

    public void O(k0 k0Var) {
        k0Var.getClass();
        com.yandex.passport.api.h.b.getClass();
        this.a = com.yandex.passport.api.q.b(k0Var);
    }

    public Object P(aa0 aa0Var, com.yandex.plus.bdui.flex.ui.j jVar) {
        Object N = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1.N((com.yandex.plus.bdui.flex.utils.c) this.a, new com.yandex.passport.internal.ui.sloth.q(this, aa0Var, (Continuation) null, 27), jVar);
        return N == nm6.a ? N : Unit.a;
    }

    public void Q() {
        com.yandex.plus.bdui.flex.utils.c cVar = (com.yandex.plus.bdui.flex.utils.c) this.a;
        View view = (View) this.b;
        if (cVar.indexOfChild(view) < 0) {
            cVar.a(0, view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0063, code lost:
    
        ((com.yandex.plus.core.benchmark.l) r1.b).c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void R() {
        if (((Boolean) ((xdr) this.b).getValue()).booleanValue() && ((Boolean) ((xdr) this.c).getValue()).booleanValue()) {
            ReentrantLock reentrantLock = (ReentrantLock) this.e;
            reentrantLock.lock();
            try {
                com.yandex.passport.internal.flags.experiments.p pVar = (com.yandex.passport.internal.flags.experiments.p) this.d;
                if (pVar != null) {
                    AtomicReference atomicReference = (AtomicReference) pVar.d;
                    com.yandex.plus.home.benchmark.a aVar = com.yandex.plus.home.benchmark.a.b;
                    com.yandex.plus.home.benchmark.a aVar2 = com.yandex.plus.home.benchmark.a.d;
                    while (true) {
                        if (atomicReference.compareAndSet(aVar, aVar2)) {
                            ((com.yandex.plus.core.benchmark.l) pVar.b).d();
                            break;
                        } else if (atomicReference.get() != aVar) {
                            break;
                        }
                    }
                }
                com.yandex.passport.internal.flags.experiments.p pVar2 = (com.yandex.passport.internal.flags.experiments.p) ((com.yandex.plus.home.feature.panel.internal.shortcuts.daily.animation.a) this.a).invoke();
                this.d = pVar2;
                AtomicReference atomicReference2 = (AtomicReference) pVar2.d;
                com.yandex.plus.home.benchmark.a aVar3 = com.yandex.plus.home.benchmark.a.a;
                com.yandex.plus.home.benchmark.a aVar4 = com.yandex.plus.home.benchmark.a.b;
                while (true) {
                    if (atomicReference2.compareAndSet(aVar3, aVar4)) {
                        break;
                    } else if (atomicReference2.get() != aVar3) {
                        break;
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public LinkedHashMap S(w1 w1Var) {
        List list = w1Var.a;
        List list2 = list;
        int a = tah.a(v75.o(list2, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : list2) {
            linkedHashMap.put(((c6) obj).getId(), obj);
        }
        if (linkedHashMap.size() == list.size()) {
            return linkedHashMap;
        }
        com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.d;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        if (!bVar.b(aVar)) {
            return null;
        }
        StringBuilder sb = new StringBuilder("There are equal ids for widgets: ");
        List list3 = list;
        ArrayList arrayList = new ArrayList(v75.o(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(((c6) it.next()).getId());
        }
        sb.append(CollectionsKt.e0(arrayList, linkedHashMap.keySet()));
        bVar.c(aVar, "PlaqueMapper", sb.toString());
        return null;
    }

    @Override // com.yandex.plus.pay.ui.webview.family.ui.b
    public void a() {
        com.yandex.plus.log.api.b bVar = ((com.yandex.plus.bdui.plus.checkout.webview.contract.a) this.a).b;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "FamilyContractWrapper", "onWebPageLoadingFinished()");
        }
        com.yandex.plus.pay.ui.webview.family.domain.a aVar2 = (com.yandex.plus.pay.ui.webview.family.domain.a) this.b;
        String str = (String) this.c;
        String uri = ((com.yandex.plus.bdui.plus.webview.q) this.d).b.a.c().toString();
        uri.getClass();
        aVar2.c(str, uri, "");
    }

    @Override // com.yandex.plus.pay.ui.webview.family.ui.b
    public void b(String str) {
        com.yandex.plus.log.api.b bVar = ((com.yandex.plus.bdui.plus.checkout.webview.contract.a) this.a).b;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "FamilyContractWrapper", "onWebPageLoadingFailed(); reason = ".concat(str));
        }
        com.yandex.plus.pay.ui.webview.family.domain.a aVar2 = (com.yandex.plus.pay.ui.webview.family.domain.a) this.b;
        String str2 = (String) this.c;
        String uri = ((com.yandex.plus.bdui.plus.webview.q) this.d).b.a.c().toString();
        uri.getClass();
        aVar2.b(str2, uri, "", str);
    }

    @Override // com.yandex.plus.pay.ui.webview.family.ui.b
    public void c() {
        com.yandex.plus.log.api.b bVar = ((com.yandex.plus.bdui.plus.checkout.webview.contract.a) this.a).b;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "FamilyContractWrapper", "onWebPageReadyTimeout()");
        }
        com.yandex.plus.pay.ui.webview.common.diagnostic.a aVar2 = (com.yandex.plus.pay.ui.webview.common.diagnostic.a) this.e;
        String uri = ((com.yandex.plus.bdui.plus.webview.q) this.d).b.a.c().toString();
        uri.getClass();
        aVar2.a(15000L, uri, UgcLiveVideoData$UgcLiveStatus.READY);
    }

    @Override // com.yandex.passport.api.p0
    public Map d() {
        return (Map) this.d;
    }

    @Override // com.yandex.passport.api.p0
    public k0 e() {
        return (com.yandex.passport.api.h) this.b;
    }

    @Override // com.yandex.passport.api.p0
    public k0 f() {
        com.yandex.passport.api.h hVar = (com.yandex.passport.api.h) this.a;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.j("primaryEnvironment");
        throw null;
    }

    @Override // com.yandex.plus.pay.ui.webview.family.ui.b
    public void g(String str) {
        str.getClass();
        com.yandex.plus.log.api.b bVar = ((com.yandex.plus.bdui.plus.checkout.webview.contract.a) this.a).b;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.d;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "FamilyContractWrapper", "onWebPageUnknownMessage(); message = rawMessage");
        }
        com.yandex.plus.pay.ui.webview.common.diagnostic.a aVar2 = (com.yandex.plus.pay.ui.webview.common.diagnostic.a) this.e;
        String uri = ((com.yandex.plus.bdui.plus.webview.q) this.d).b.a.c().toString();
        uri.getClass();
        aVar2.b(uri, str);
    }

    @Override // com.yandex.passport.api.p0
    public o1 h() {
        return (o1) this.c;
    }

    @Override // com.yandex.plus.pay.ui.webview.family.ui.b
    public void i(String str, String str2, String str3) {
        str2.getClass();
        str3.getClass();
        com.yandex.plus.bdui.plus.checkout.webview.contract.a aVar = (com.yandex.plus.bdui.plus.checkout.webview.contract.a) this.a;
        com.yandex.plus.log.api.b bVar = aVar.b;
        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar2)) {
            StringBuilder m = f1d.m("onWebPageOpensNativeSharing(); title = ", str, ", text = ", str2, ", mime type = ");
            m.append(str3);
            bVar.c(aVar2, "FamilyContractWrapper", m.toString());
        }
        Context context = aVar.d;
        context.getClass();
        try {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(str3);
            intent.putExtra("android.intent.extra.TITLE", str);
            intent.putExtra("android.intent.extra.TEXT", str2);
            Intent createChooser = Intent.createChooser(intent, null);
            createChooser.addFlags(268435456);
            context.startActivity(createChooser);
        } catch (ActivityNotFoundException e) {
            com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.e;
            if (bVar.b(aVar3)) {
                bVar.a(aVar3, "FamilyContractWrapper", "onWebPageOpensNativeSharing); intent handler for sharing not found!", e);
            }
        }
    }

    @Override // com.yandex.passport.api.p0
    public EnumSet j() {
        com.yandex.passport.common.bitflag.b bVar = (com.yandex.passport.common.bitflag.b) this.e;
        com.yandex.passport.api.n[] values = com.yandex.passport.api.n.values();
        ArrayList arrayList = new ArrayList();
        for (com.yandex.passport.api.n nVar : values) {
            if (bVar.a.a(nVar.a)) {
                arrayList.add(nVar);
            }
        }
        EnumSet noneOf = EnumSet.noneOf(com.yandex.passport.api.n.class);
        noneOf.addAll(arrayList);
        return noneOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r0 != 4) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k(com.yandex.plus.home.api.lifecycle.b bVar) {
        dzf dzfVar = (dzf) this.d;
        Set set = (Set) this.b;
        if (set.isEmpty()) {
            lyf b = dzfVar.getLifecycle().b();
            p(b.compareTo(lyf.e) >= 0 ? com.yandex.plus.home.api.lifecycle.a.d : b.compareTo(lyf.d) >= 0 ? com.yandex.plus.home.api.lifecycle.a.b : com.yandex.plus.home.api.lifecycle.a.g);
            dzfVar.getLifecycle().a((ru2) this.e);
        }
        set.add(bVar);
        int ordinal = ((com.yandex.plus.home.api.lifecycle.a) this.c).ordinal();
        if (ordinal != 1) {
            if (ordinal == 2 || ordinal == 3) {
                bVar.d();
                bVar.c();
            }
            J(bVar, (com.yandex.plus.home.api.lifecycle.a) this.c);
        }
        bVar.d();
        J(bVar, (com.yandex.plus.home.api.lifecycle.a) this.c);
    }

    public k l() {
        com.yandex.passport.api.h hVar = (com.yandex.passport.api.h) this.a;
        if (hVar == null) {
            bow.t("You must set Primary Environment");
            throw null;
        }
        if (hVar == null) {
            Intrinsics.j("primaryEnvironment");
            throw null;
        }
        com.yandex.passport.api.impl.b bVar = com.yandex.passport.api.impl.b.c;
        com.yandex.passport.api.impl.b a = com.yandex.passport.api.impl.b.a(hVar.a.a);
        a.getClass();
        com.yandex.passport.api.h hVar2 = (com.yandex.passport.api.h) this.b;
        com.yandex.passport.api.impl.b a2 = hVar2 != null ? com.yandex.passport.api.impl.b.a(hVar2.a.a) : null;
        if (a2 == null || (!a.e() && a2.e())) {
            return com.yandex.passport.internal.ui.a.s(this);
        }
        bow.t("You must set non-team as primary environment and team as secondary environment");
        throw null;
    }

    public com.yandex.plus.core.featureflags.g m() {
        if (((com.yandex.plus.core.featureflags.t) this.b) == null && ((com.yandex.plus.core.featureflags.t) this.c) == null) {
            xq0.x("At least one of settings, experiments or configuration must be set!");
            return null;
        }
        lm4 lm4Var = (lm4) this.a;
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: com.yandex.plus.core.featureflags.c
            public final /* synthetic */ com.yandex.passport.internal.entities.j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        com.yandex.passport.internal.entities.j jVar = this.b;
                        t tVar = (t) jVar.b;
                        l lVar = tVar instanceof l ? (l) tVar : null;
                        t tVar2 = (t) jVar.c;
                        l lVar2 = tVar2 instanceof l ? (l) tVar2 : null;
                        Object obj = jVar.d;
                        return new h(null, lVar, lVar2, obj instanceof Boolean ? (Boolean) obj : null, 1);
                    case 1:
                        com.yandex.passport.internal.entities.j jVar2 = this.b;
                        t tVar3 = (t) jVar2.b;
                        o oVar = tVar3 instanceof o ? (o) tVar3 : null;
                        t tVar4 = (t) jVar2.c;
                        o oVar2 = tVar4 instanceof o ? (o) tVar4 : null;
                        Object obj2 = jVar2.d;
                        return new j((y) null, oVar, oVar2, obj2 instanceof String ? (String) obj2 : null, 1);
                    case 2:
                        com.yandex.passport.internal.entities.j jVar3 = this.b;
                        t tVar5 = (t) jVar3.b;
                        p pVar = tVar5 instanceof p ? (p) tVar5 : null;
                        t tVar6 = (t) jVar3.c;
                        p pVar2 = tVar6 instanceof p ? (p) tVar6 : null;
                        Object obj3 = jVar3.d;
                        return new j((y) null, pVar, pVar2, obj3 != null ? com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.H(obj3) : null, 1);
                    case 3:
                        com.yandex.passport.internal.entities.j jVar4 = this.b;
                        t tVar7 = (t) jVar4.b;
                        n nVar = tVar7 instanceof n ? (n) tVar7 : null;
                        t tVar8 = (t) jVar4.c;
                        n nVar2 = tVar8 instanceof n ? (n) tVar8 : null;
                        Object obj4 = jVar4.d;
                        Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
                        r rVar = (r) jVar4.e;
                        return new i((y) null, nVar, nVar2, num, rVar != null ? rVar : null, 1);
                    default:
                        com.yandex.passport.internal.entities.j jVar5 = this.b;
                        t tVar9 = (t) jVar5.b;
                        m mVar = tVar9 instanceof m ? (m) tVar9 : null;
                        t tVar10 = (t) jVar5.c;
                        m mVar2 = tVar10 instanceof m ? (m) tVar10 : null;
                        Object obj5 = jVar5.d;
                        Float f = obj5 instanceof Float ? (Float) obj5 : null;
                        r rVar2 = (r) jVar5.e;
                        return new i((y) null, mVar, mVar2, f, rVar2 != null ? rVar2 : null, 1);
                }
            }
        };
        final int i2 = 1;
        Function0 function02 = new Function0(this) { // from class: com.yandex.plus.core.featureflags.c
            public final /* synthetic */ com.yandex.passport.internal.entities.j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        com.yandex.passport.internal.entities.j jVar = this.b;
                        t tVar = (t) jVar.b;
                        l lVar = tVar instanceof l ? (l) tVar : null;
                        t tVar2 = (t) jVar.c;
                        l lVar2 = tVar2 instanceof l ? (l) tVar2 : null;
                        Object obj = jVar.d;
                        return new h(null, lVar, lVar2, obj instanceof Boolean ? (Boolean) obj : null, 1);
                    case 1:
                        com.yandex.passport.internal.entities.j jVar2 = this.b;
                        t tVar3 = (t) jVar2.b;
                        o oVar = tVar3 instanceof o ? (o) tVar3 : null;
                        t tVar4 = (t) jVar2.c;
                        o oVar2 = tVar4 instanceof o ? (o) tVar4 : null;
                        Object obj2 = jVar2.d;
                        return new j((y) null, oVar, oVar2, obj2 instanceof String ? (String) obj2 : null, 1);
                    case 2:
                        com.yandex.passport.internal.entities.j jVar3 = this.b;
                        t tVar5 = (t) jVar3.b;
                        p pVar = tVar5 instanceof p ? (p) tVar5 : null;
                        t tVar6 = (t) jVar3.c;
                        p pVar2 = tVar6 instanceof p ? (p) tVar6 : null;
                        Object obj3 = jVar3.d;
                        return new j((y) null, pVar, pVar2, obj3 != null ? com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.H(obj3) : null, 1);
                    case 3:
                        com.yandex.passport.internal.entities.j jVar4 = this.b;
                        t tVar7 = (t) jVar4.b;
                        n nVar = tVar7 instanceof n ? (n) tVar7 : null;
                        t tVar8 = (t) jVar4.c;
                        n nVar2 = tVar8 instanceof n ? (n) tVar8 : null;
                        Object obj4 = jVar4.d;
                        Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
                        r rVar = (r) jVar4.e;
                        return new i((y) null, nVar, nVar2, num, rVar != null ? rVar : null, 1);
                    default:
                        com.yandex.passport.internal.entities.j jVar5 = this.b;
                        t tVar9 = (t) jVar5.b;
                        m mVar = tVar9 instanceof m ? (m) tVar9 : null;
                        t tVar10 = (t) jVar5.c;
                        m mVar2 = tVar10 instanceof m ? (m) tVar10 : null;
                        Object obj5 = jVar5.d;
                        Float f = obj5 instanceof Float ? (Float) obj5 : null;
                        r rVar2 = (r) jVar5.e;
                        return new i((y) null, mVar, mVar2, f, rVar2 != null ? rVar2 : null, 1);
                }
            }
        };
        final int i3 = 2;
        Function0 function03 = new Function0(this) { // from class: com.yandex.plus.core.featureflags.c
            public final /* synthetic */ com.yandex.passport.internal.entities.j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        com.yandex.passport.internal.entities.j jVar = this.b;
                        t tVar = (t) jVar.b;
                        l lVar = tVar instanceof l ? (l) tVar : null;
                        t tVar2 = (t) jVar.c;
                        l lVar2 = tVar2 instanceof l ? (l) tVar2 : null;
                        Object obj = jVar.d;
                        return new h(null, lVar, lVar2, obj instanceof Boolean ? (Boolean) obj : null, 1);
                    case 1:
                        com.yandex.passport.internal.entities.j jVar2 = this.b;
                        t tVar3 = (t) jVar2.b;
                        o oVar = tVar3 instanceof o ? (o) tVar3 : null;
                        t tVar4 = (t) jVar2.c;
                        o oVar2 = tVar4 instanceof o ? (o) tVar4 : null;
                        Object obj2 = jVar2.d;
                        return new j((y) null, oVar, oVar2, obj2 instanceof String ? (String) obj2 : null, 1);
                    case 2:
                        com.yandex.passport.internal.entities.j jVar3 = this.b;
                        t tVar5 = (t) jVar3.b;
                        p pVar = tVar5 instanceof p ? (p) tVar5 : null;
                        t tVar6 = (t) jVar3.c;
                        p pVar2 = tVar6 instanceof p ? (p) tVar6 : null;
                        Object obj3 = jVar3.d;
                        return new j((y) null, pVar, pVar2, obj3 != null ? com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.H(obj3) : null, 1);
                    case 3:
                        com.yandex.passport.internal.entities.j jVar4 = this.b;
                        t tVar7 = (t) jVar4.b;
                        n nVar = tVar7 instanceof n ? (n) tVar7 : null;
                        t tVar8 = (t) jVar4.c;
                        n nVar2 = tVar8 instanceof n ? (n) tVar8 : null;
                        Object obj4 = jVar4.d;
                        Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
                        r rVar = (r) jVar4.e;
                        return new i((y) null, nVar, nVar2, num, rVar != null ? rVar : null, 1);
                    default:
                        com.yandex.passport.internal.entities.j jVar5 = this.b;
                        t tVar9 = (t) jVar5.b;
                        m mVar = tVar9 instanceof m ? (m) tVar9 : null;
                        t tVar10 = (t) jVar5.c;
                        m mVar2 = tVar10 instanceof m ? (m) tVar10 : null;
                        Object obj5 = jVar5.d;
                        Float f = obj5 instanceof Float ? (Float) obj5 : null;
                        r rVar2 = (r) jVar5.e;
                        return new i((y) null, mVar, mVar2, f, rVar2 != null ? rVar2 : null, 1);
                }
            }
        };
        final int i4 = 3;
        Function0 function04 = new Function0(this) { // from class: com.yandex.plus.core.featureflags.c
            public final /* synthetic */ com.yandex.passport.internal.entities.j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        com.yandex.passport.internal.entities.j jVar = this.b;
                        t tVar = (t) jVar.b;
                        l lVar = tVar instanceof l ? (l) tVar : null;
                        t tVar2 = (t) jVar.c;
                        l lVar2 = tVar2 instanceof l ? (l) tVar2 : null;
                        Object obj = jVar.d;
                        return new h(null, lVar, lVar2, obj instanceof Boolean ? (Boolean) obj : null, 1);
                    case 1:
                        com.yandex.passport.internal.entities.j jVar2 = this.b;
                        t tVar3 = (t) jVar2.b;
                        o oVar = tVar3 instanceof o ? (o) tVar3 : null;
                        t tVar4 = (t) jVar2.c;
                        o oVar2 = tVar4 instanceof o ? (o) tVar4 : null;
                        Object obj2 = jVar2.d;
                        return new j((y) null, oVar, oVar2, obj2 instanceof String ? (String) obj2 : null, 1);
                    case 2:
                        com.yandex.passport.internal.entities.j jVar3 = this.b;
                        t tVar5 = (t) jVar3.b;
                        p pVar = tVar5 instanceof p ? (p) tVar5 : null;
                        t tVar6 = (t) jVar3.c;
                        p pVar2 = tVar6 instanceof p ? (p) tVar6 : null;
                        Object obj3 = jVar3.d;
                        return new j((y) null, pVar, pVar2, obj3 != null ? com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.H(obj3) : null, 1);
                    case 3:
                        com.yandex.passport.internal.entities.j jVar4 = this.b;
                        t tVar7 = (t) jVar4.b;
                        n nVar = tVar7 instanceof n ? (n) tVar7 : null;
                        t tVar8 = (t) jVar4.c;
                        n nVar2 = tVar8 instanceof n ? (n) tVar8 : null;
                        Object obj4 = jVar4.d;
                        Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
                        r rVar = (r) jVar4.e;
                        return new i((y) null, nVar, nVar2, num, rVar != null ? rVar : null, 1);
                    default:
                        com.yandex.passport.internal.entities.j jVar5 = this.b;
                        t tVar9 = (t) jVar5.b;
                        m mVar = tVar9 instanceof m ? (m) tVar9 : null;
                        t tVar10 = (t) jVar5.c;
                        m mVar2 = tVar10 instanceof m ? (m) tVar10 : null;
                        Object obj5 = jVar5.d;
                        Float f = obj5 instanceof Float ? (Float) obj5 : null;
                        r rVar2 = (r) jVar5.e;
                        return new i((y) null, mVar, mVar2, f, rVar2 != null ? rVar2 : null, 1);
                }
            }
        };
        final int i5 = 4;
        return com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.g(lm4Var, function0, function02, function03, function04, new Function0(this) { // from class: com.yandex.plus.core.featureflags.c
            public final /* synthetic */ com.yandex.passport.internal.entities.j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        com.yandex.passport.internal.entities.j jVar = this.b;
                        t tVar = (t) jVar.b;
                        l lVar = tVar instanceof l ? (l) tVar : null;
                        t tVar2 = (t) jVar.c;
                        l lVar2 = tVar2 instanceof l ? (l) tVar2 : null;
                        Object obj = jVar.d;
                        return new h(null, lVar, lVar2, obj instanceof Boolean ? (Boolean) obj : null, 1);
                    case 1:
                        com.yandex.passport.internal.entities.j jVar2 = this.b;
                        t tVar3 = (t) jVar2.b;
                        o oVar = tVar3 instanceof o ? (o) tVar3 : null;
                        t tVar4 = (t) jVar2.c;
                        o oVar2 = tVar4 instanceof o ? (o) tVar4 : null;
                        Object obj2 = jVar2.d;
                        return new j((y) null, oVar, oVar2, obj2 instanceof String ? (String) obj2 : null, 1);
                    case 2:
                        com.yandex.passport.internal.entities.j jVar3 = this.b;
                        t tVar5 = (t) jVar3.b;
                        p pVar = tVar5 instanceof p ? (p) tVar5 : null;
                        t tVar6 = (t) jVar3.c;
                        p pVar2 = tVar6 instanceof p ? (p) tVar6 : null;
                        Object obj3 = jVar3.d;
                        return new j((y) null, pVar, pVar2, obj3 != null ? com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.H(obj3) : null, 1);
                    case 3:
                        com.yandex.passport.internal.entities.j jVar4 = this.b;
                        t tVar7 = (t) jVar4.b;
                        n nVar = tVar7 instanceof n ? (n) tVar7 : null;
                        t tVar8 = (t) jVar4.c;
                        n nVar2 = tVar8 instanceof n ? (n) tVar8 : null;
                        Object obj4 = jVar4.d;
                        Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
                        r rVar = (r) jVar4.e;
                        return new i((y) null, nVar, nVar2, num, rVar != null ? rVar : null, 1);
                    default:
                        com.yandex.passport.internal.entities.j jVar5 = this.b;
                        t tVar9 = (t) jVar5.b;
                        m mVar = tVar9 instanceof m ? (m) tVar9 : null;
                        t tVar10 = (t) jVar5.c;
                        m mVar2 = tVar10 instanceof m ? (m) tVar10 : null;
                        Object obj5 = jVar5.d;
                        Float f = obj5 instanceof Float ? (Float) obj5 : null;
                        r rVar2 = (r) jVar5.e;
                        return new i((y) null, mVar, mVar2, f, rVar2 != null ? rVar2 : null, 1);
                }
            }
        });
    }

    @Override // com.yandex.plus.pay.ui.webview.family.ui.b
    public void n(String str, String str2) {
        str.getClass();
        str2.getClass();
        com.yandex.plus.log.api.b bVar = ((com.yandex.plus.bdui.plus.checkout.webview.contract.a) this.a).b;
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "FamilyContractWrapper", hrg.r("onWebPageSendsMetrics(); name = ", str, ", value = ", str2));
        }
        ((com.yandex.plus.pay.ui.webview.family.domain.a) this.b).a.a(str, str2);
    }

    public void o() {
        ValueAnimator valueAnimator = (ValueAnimator) this.e;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = (ValueAnimator) this.e;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        this.e = null;
    }

    public void p(com.yandex.plus.home.api.lifecycle.a aVar) {
        ReentrantLock reentrantLock = (ReentrantLock) this.a;
        reentrantLock.lock();
        try {
            this.c = aVar;
            Iterator it = ((Set) this.b).iterator();
            while (it.hasNext()) {
                J((com.yandex.plus.home.api.lifecycle.b) it.next(), (com.yandex.plus.home.api.lifecycle.a) this.c);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void q(com.yandex.plus.core.featureflags.e eVar, String str) {
        eVar.getClass();
        this.c = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.h((lm4) this.a, new com.yandex.plus.core.featureflags.d(eVar, str, 5), new com.yandex.plus.core.featureflags.d(eVar, str, 6), new com.yandex.plus.core.featureflags.d(eVar, str, 7), new com.yandex.plus.core.featureflags.d(eVar, str, 8), new com.yandex.plus.core.featureflags.d(eVar, str, 9));
    }

    public void r(com.yandex.plus.core.featureflags.f fVar, String str) {
        fVar.getClass();
        this.b = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.h((lm4) this.a, new com.yandex.plus.core.featureflags.d(fVar, str, 0), new com.yandex.plus.core.featureflags.d(fVar, str, 1), new com.yandex.plus.core.featureflags.d(fVar, str, 2), new com.yandex.plus.core.featureflags.d(fVar, str, 3), new com.yandex.plus.core.featureflags.d(fVar, str, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object s(com.yandex.plus.home.plaque.repository.graphql.cache.dto.a0 a0Var, Map map, Map map2, Map map3, cg6 cg6Var) {
        com.yandex.plus.home.plaque.repository.graphql.j jVar;
        int i;
        Map map4;
        com.yandex.plus.home.plaque.repository.graphql.cache.dto.a0 a0Var2;
        com.yandex.plus.plaquesdk.plaque.api.models.x xVar;
        com.yandex.plus.plaquesdk.plaque.api.models.x xVar2;
        g0 g0Var;
        String str;
        com.yandex.plus.plaquesdk.plaque.api.models.x xVar3;
        com.yandex.plus.home.plaque.repository.graphql.cache.dto.a0 a0Var3;
        String str2;
        nsa nsaVar;
        long j;
        nsa nsaVar2;
        if (cg6Var instanceof com.yandex.plus.home.plaque.repository.graphql.j) {
            jVar = (com.yandex.plus.home.plaque.repository.graphql.j) cg6Var;
            int i2 = jVar.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.p = i2 - Integer.MIN_VALUE;
                com.yandex.plus.home.plaque.repository.graphql.j jVar2 = jVar;
                Object obj = jVar2.n;
                Object obj2 = nm6.a;
                i = jVar2.p;
                if (i != 0) {
                    qgg.h0(obj);
                    c6 c6Var = a0Var.b;
                    Set set = q5b.a;
                    jVar2.j = a0Var;
                    jVar2.k = map2;
                    jVar2.p = 1;
                    obj = u(c6Var, map3, map, map2, set, jVar2);
                    if (obj != obj2) {
                        map4 = map2;
                        a0Var2 = a0Var;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar3 = jVar2.m;
                    str2 = jVar2.l;
                    Map map5 = jVar2.k;
                    a0Var3 = jVar2.j;
                    qgg.h0(obj);
                    g0Var = (g0) obj;
                    xVar2 = xVar3;
                    str = str2;
                    a0Var2 = a0Var3;
                    j0 j0Var = new j0(str, xVar2, g0Var, i0.b, h0.b, false);
                    String str3 = a0Var2.a;
                    Map map6 = a0Var2.c;
                    Map map7 = a0Var2.e;
                    String str4 = a0Var2.i;
                    com.yandex.plus.home.plaque.repository.api.model.s l = com.yandex.plus.home.plaque.animator.internal.utils.a.l(a0Var2.j);
                    int i3 = a0Var2.f;
                    nsaVar = a0Var2.g;
                    long j2 = 0;
                    if (nsaVar != null) {
                        j = nsaVar.a;
                    } else {
                        nsa.b.getClass();
                        j = 0;
                    }
                    nsaVar2 = a0Var2.h;
                    if (nsaVar2 != null) {
                        j2 = nsaVar2.a;
                    } else {
                        nsa.b.getClass();
                    }
                    return new com.yandex.plus.home.plaque.repository.api.model.a(j0Var, str3, map6, map7, i3, l, str4, j, j2);
                }
                map4 = jVar2.k;
                a0Var2 = jVar2.j;
                qgg.h0(obj);
                xVar = (com.yandex.plus.plaquesdk.plaque.api.models.x) obj;
                if (xVar != null) {
                    return null;
                }
                String str5 = a0Var2.a;
                t1 t1Var = a0Var2.d;
                if (t1Var == null) {
                    xVar2 = xVar;
                    g0Var = null;
                    str = str5;
                    j0 j0Var2 = new j0(str, xVar2, g0Var, i0.b, h0.b, false);
                    String str32 = a0Var2.a;
                    Map map62 = a0Var2.c;
                    Map map72 = a0Var2.e;
                    String str42 = a0Var2.i;
                    com.yandex.plus.home.plaque.repository.api.model.s l2 = com.yandex.plus.home.plaque.animator.internal.utils.a.l(a0Var2.j);
                    int i32 = a0Var2.f;
                    nsaVar = a0Var2.g;
                    long j22 = 0;
                    if (nsaVar != null) {
                    }
                    nsaVar2 = a0Var2.h;
                    if (nsaVar2 != null) {
                    }
                    return new com.yandex.plus.home.plaque.repository.api.model.a(j0Var2, str32, map62, map72, i32, l2, str42, j, j22);
                }
                jVar2.j = a0Var2;
                jVar2.k = null;
                jVar2.l = str5;
                jVar2.m = xVar;
                jVar2.p = 2;
                Object A = A(t1Var, map4, jVar2);
                if (A != obj2) {
                    xVar3 = xVar;
                    obj = A;
                    a0Var3 = a0Var2;
                    str2 = str5;
                    g0Var = (g0) obj;
                    xVar2 = xVar3;
                    str = str2;
                    a0Var2 = a0Var3;
                    j0 j0Var22 = new j0(str, xVar2, g0Var, i0.b, h0.b, false);
                    String str322 = a0Var2.a;
                    Map map622 = a0Var2.c;
                    Map map722 = a0Var2.e;
                    String str422 = a0Var2.i;
                    com.yandex.plus.home.plaque.repository.api.model.s l22 = com.yandex.plus.home.plaque.animator.internal.utils.a.l(a0Var2.j);
                    int i322 = a0Var2.f;
                    nsaVar = a0Var2.g;
                    long j222 = 0;
                    if (nsaVar != null) {
                    }
                    nsaVar2 = a0Var2.h;
                    if (nsaVar2 != null) {
                    }
                    return new com.yandex.plus.home.plaque.repository.api.model.a(j0Var22, str322, map622, map722, i322, l22, str422, j, j222);
                }
                return obj2;
            }
        }
        jVar = new com.yandex.plus.home.plaque.repository.graphql.j(this, cg6Var);
        com.yandex.plus.home.plaque.repository.graphql.j jVar22 = jVar;
        Object obj3 = jVar22.n;
        Object obj22 = nm6.a;
        i = jVar22.p;
        if (i != 0) {
        }
        xVar = (com.yandex.plus.plaquesdk.plaque.api.models.x) obj3;
        if (xVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(com.yandex.plus.home.plaque.repository.graphql.cache.dto.g0 g0Var, Map map, Map map2, Map map3, i0 i0Var, cg6 cg6Var) {
        com.yandex.plus.home.plaque.repository.graphql.i iVar;
        int i;
        i0 i0Var2;
        Map map4;
        com.yandex.plus.home.plaque.repository.graphql.cache.dto.g0 g0Var2;
        com.yandex.plus.plaquesdk.plaque.api.models.x xVar;
        g0 g0Var3;
        String str;
        String str2;
        com.yandex.plus.home.plaque.repository.graphql.cache.dto.g0 g0Var4;
        i0 i0Var3;
        if (cg6Var instanceof com.yandex.plus.home.plaque.repository.graphql.i) {
            iVar = (com.yandex.plus.home.plaque.repository.graphql.i) cg6Var;
            int i2 = iVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.q = i2 - Integer.MIN_VALUE;
                com.yandex.plus.home.plaque.repository.graphql.i iVar2 = iVar;
                Object obj = iVar2.o;
                Object obj2 = nm6.a;
                i = iVar2.q;
                if (i != 0) {
                    qgg.h0(obj);
                    c6 c6Var = g0Var.b;
                    Set set = q5b.a;
                    iVar2.j = g0Var;
                    iVar2.k = map2;
                    i0Var2 = i0Var;
                    iVar2.l = i0Var2;
                    iVar2.q = 1;
                    obj = u(c6Var, map3, map, map2, set, iVar2);
                    if (obj != obj2) {
                        map4 = map2;
                        g0Var2 = g0Var;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xVar = iVar2.n;
                    str2 = iVar2.m;
                    i0Var3 = iVar2.l;
                    Map map5 = iVar2.k;
                    g0Var4 = iVar2.j;
                    qgg.h0(obj);
                    g0Var3 = (g0) obj;
                    str = str2;
                    i0Var2 = i0Var3;
                    g0Var2 = g0Var4;
                    return new com.yandex.plus.home.plaque.repository.api.model.b(new j0(str, xVar, g0Var3, i0Var2, h0.b, false), g0Var2.a, g0Var2.c, g0Var2.e, g0Var2.f, com.yandex.plus.home.plaque.animator.internal.utils.a.l(g0Var2.g));
                }
                i0 i0Var4 = iVar2.l;
                map4 = iVar2.k;
                g0Var2 = iVar2.j;
                qgg.h0(obj);
                i0Var2 = i0Var4;
                xVar = (com.yandex.plus.plaquesdk.plaque.api.models.x) obj;
                g0Var3 = null;
                if (xVar != null) {
                    return null;
                }
                String str3 = g0Var2.a;
                t1 t1Var = g0Var2.d;
                if (t1Var == null) {
                    str = str3;
                    return new com.yandex.plus.home.plaque.repository.api.model.b(new j0(str, xVar, g0Var3, i0Var2, h0.b, false), g0Var2.a, g0Var2.c, g0Var2.e, g0Var2.f, com.yandex.plus.home.plaque.animator.internal.utils.a.l(g0Var2.g));
                }
                iVar2.j = g0Var2;
                iVar2.k = null;
                iVar2.l = i0Var2;
                iVar2.m = str3;
                iVar2.n = xVar;
                iVar2.q = 2;
                obj = A(t1Var, map4, iVar2);
                if (obj != obj2) {
                    str2 = str3;
                    g0Var4 = g0Var2;
                    i0Var3 = i0Var2;
                    g0Var3 = (g0) obj;
                    str = str2;
                    i0Var2 = i0Var3;
                    g0Var2 = g0Var4;
                    return new com.yandex.plus.home.plaque.repository.api.model.b(new j0(str, xVar, g0Var3, i0Var2, h0.b, false), g0Var2.a, g0Var2.c, g0Var2.e, g0Var2.f, com.yandex.plus.home.plaque.animator.internal.utils.a.l(g0Var2.g));
                }
                return obj2;
            }
        }
        iVar = new com.yandex.plus.home.plaque.repository.graphql.i(this, cg6Var);
        com.yandex.plus.home.plaque.repository.graphql.i iVar22 = iVar;
        Object obj3 = iVar22.o;
        Object obj22 = nm6.a;
        i = iVar22.q;
        if (i != 0) {
        }
        xVar = (com.yandex.plus.plaquesdk.plaque.api.models.x) obj3;
        g0Var3 = null;
        if (xVar != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v29, types: [com.yandex.plus.plaquesdk.plaque.api.models.v[]] */
    /* JADX WARN: Type inference failed for: r17v10, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r1v54, types: [com.yandex.plus.plaquesdk.plaque.api.models.v[]] */
    /* JADX WARN: Type inference failed for: r1v56, types: [com.yandex.plus.plaquesdk.plaque.api.models.c0] */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r31v0, types: [com.yandex.passport.internal.entities.j] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v29, types: [com.yandex.plus.plaquesdk.plaque.api.models.v[]] */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r9v25, types: [com.yandex.plus.plaquesdk.plaque.api.models.v[], java.io.Serializable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0750 -> B:12:0x0760). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0771 -> B:13:0x0775). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u(c6 c6Var, Map map, Map map2, Map map3, Set set, cg6 cg6Var) {
        com.yandex.plus.home.plaque.repository.graphql.k kVar;
        int i;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar;
        com.yandex.plus.plaquesdk.plaque.api.models.display.u uVar;
        com.yandex.plus.plaquesdk.plaque.api.models.display.w vVar;
        int i2;
        int i3;
        com.yandex.plus.plaquesdk.plaque.api.models.a aVar;
        int i4;
        String str;
        String str2;
        boolean z;
        nm6 nm6Var;
        Set set2;
        c6 c6Var2;
        com.yandex.plus.plaquesdk.plaque.api.models.a aVar2;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar2;
        int i5;
        int i6;
        int i7;
        ArrayList arrayList;
        com.yandex.plus.home.plaque.repository.graphql.k kVar2;
        Map map4;
        Iterator it;
        Map map5;
        String str3;
        b0 b0Var;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar3;
        c0 c0Var;
        int i8;
        Serializable serializable;
        Object obj;
        String str4;
        c0 c0Var2;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar4;
        com.yandex.plus.plaquesdk.plaque.api.models.a aVar3;
        Object obj2;
        int i9;
        String str5;
        c0 c0Var3;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar5;
        c0 C;
        String str6;
        Object obj3;
        String str7;
        c0 c0Var4;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar6;
        com.yandex.plus.plaquesdk.plaque.api.models.w wVar;
        Drawable drawable;
        com.yandex.plus.plaquesdk.plaque.api.models.w wVar2;
        com.yandex.plus.plaquesdk.plaque.api.models.v[] vVarArr;
        com.yandex.plus.plaquesdk.plaque.api.models.display.u uVar2;
        String str8;
        c0 c0Var5;
        com.yandex.plus.plaquesdk.plaque.api.models.v vVar2;
        com.yandex.plus.plaquesdk.plaque.api.models.v[] vVarArr2;
        Object H;
        nm6 nm6Var2;
        String str9;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar7;
        com.yandex.plus.plaquesdk.plaque.api.models.a aVar4;
        int i10;
        c0 c0Var6;
        String str10;
        com.yandex.plus.plaquesdk.plaque.api.models.a aVar5;
        c6 c6Var3;
        Serializable serializable2;
        com.yandex.plus.plaquesdk.plaque.api.models.v[] vVarArr3;
        com.yandex.plus.plaquesdk.plaque.api.models.w wVar3;
        ?? r8;
        com.yandex.plus.plaquesdk.plaque.api.models.w wVar4;
        int i11;
        ?? r17;
        Object obj4;
        c0 c0Var7;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar8;
        com.yandex.plus.plaquesdk.plaque.api.models.a aVar6;
        String str11;
        Serializable serializable3;
        c0 c0Var8;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar9;
        com.yandex.plus.plaquesdk.plaque.api.models.a aVar7;
        String str12;
        com.yandex.plus.plaquesdk.plaque.api.models.v vVar3;
        ?? r1;
        Serializable serializable4;
        com.yandex.plus.plaquesdk.plaque.api.models.w wVar5;
        com.yandex.plus.plaquesdk.plaque.api.models.w wVar6;
        int i12;
        com.yandex.plus.plaquesdk.plaque.api.models.x xVar10;
        Map map6;
        Map map7;
        int i13;
        int i14;
        Map map8;
        Set set3;
        Iterator it2;
        ArrayList arrayList2;
        com.yandex.plus.plaquesdk.plaque.api.models.a aVar8;
        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar11;
        c6 c6Var4;
        c6 c6Var5 = c6Var;
        Map map9 = map;
        if (cg6Var instanceof com.yandex.plus.home.plaque.repository.graphql.k) {
            kVar = (com.yandex.plus.home.plaque.repository.graphql.k) cg6Var;
            int i15 = kVar.E;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                kVar.E = i15 - Integer.MIN_VALUE;
                Object obj5 = kVar.C;
                nm6 nm6Var3 = nm6.a;
                i = kVar.E;
                com.yandex.plus.plaquesdk.plaque.api.models.display.u uVar3 = com.yandex.plus.plaquesdk.plaque.api.models.display.u.a;
                com.yandex.plus.plaquesdk.plaque.api.models.a aVar9 = com.yandex.plus.plaquesdk.plaque.api.models.a.d;
                switch (i) {
                    case 0:
                        qgg.h0(obj5);
                        if (set.contains(c6Var5.getId())) {
                            return null;
                        }
                        t0 a = c6Var5.a();
                        boolean z2 = c6Var5 instanceof p5;
                        a.getClass();
                        w0 w0Var = a.a;
                        List list = a.b;
                        z4 z4Var = a.c;
                        uVar = uVar3;
                        com.yandex.plus.plaquesdk.plaque.api.models.display.a aVar10 = new com.yandex.plus.plaquesdk.plaque.api.models.display.a(new com.yandex.plus.core.android.extensions.e(Integer.valueOf(w0Var.a)), new com.yandex.plus.core.android.extensions.e(Integer.valueOf(w0Var.c)), new com.yandex.plus.core.android.extensions.e(Integer.valueOf(w0Var.b)), new com.yandex.plus.core.android.extensions.e(Integer.valueOf(w0Var.d)));
                        int size = list.size();
                        com.yandex.plus.plaquesdk.plaque.api.models.display.j jVar = com.yandex.plus.plaquesdk.plaque.api.models.display.i.a;
                        if (size != 0) {
                            if (size != 1) {
                                List list2 = list;
                                ArrayList arrayList3 = new ArrayList(v75.o(list2, 10));
                                Iterator it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    arrayList3.add(com.yandex.plus.home.plaque.animator.internal.utils.a.n((com.yandex.plus.home.plaque.repository.graphql.cache.dto.x) it3.next()));
                                }
                                ArrayList arrayList4 = new ArrayList();
                                Iterator it4 = arrayList3.iterator();
                                while (it4.hasNext()) {
                                    Object next = it4.next();
                                    if (!Intrinsics.d((com.yandex.plus.plaquesdk.plaque.api.models.display.g) next, jVar)) {
                                        arrayList4.add(next);
                                    }
                                }
                                int size2 = arrayList4.size();
                                if (size2 != 0) {
                                    if (size2 != 1) {
                                        jVar = new com.yandex.plus.plaquesdk.plaque.api.models.display.c(arrayList4);
                                    } else {
                                        jVar = (com.yandex.plus.plaquesdk.plaque.api.models.display.j) arrayList4.get(0);
                                    }
                                }
                            } else {
                                jVar = com.yandex.plus.home.plaque.animator.internal.utils.a.n((com.yandex.plus.home.plaque.repository.graphql.cache.dto.x) list.get(0));
                            }
                        }
                        com.yandex.plus.plaquesdk.plaque.api.models.display.b bVar = new com.yandex.plus.plaquesdk.plaque.api.models.display.b(aVar10, new com.yandex.plus.plaquesdk.plaque.api.models.display.p(jVar, new com.yandex.plus.plaquesdk.plaque.api.models.display.o(com.yandex.plus.home.plaque.animator.internal.utils.a.m(z4Var.a), com.yandex.plus.home.plaque.animator.internal.utils.a.m(z4Var.b), com.yandex.plus.home.plaque.animator.internal.utils.a.m(z4Var.d), com.yandex.plus.home.plaque.animator.internal.utils.a.m(z4Var.c)), z2));
                        s0 s0Var = a.g;
                        if (s0Var instanceof n0) {
                            vVar = com.yandex.plus.plaquesdk.plaque.api.models.display.t.a;
                        } else if (s0Var instanceof o0) {
                            vVar = uVar;
                        } else {
                            if (!(s0Var instanceof r0)) {
                                b6e.s();
                                return null;
                            }
                            vVar = new com.yandex.plus.plaquesdk.plaque.api.models.display.v(new com.yandex.plus.core.android.extensions.e(Integer.valueOf(((r0) s0Var).a)));
                        }
                        com.yandex.plus.home.plaque.repository.graphql.cache.dto.k0 k0Var = a.e;
                        l0 l0Var = a.f;
                        int i16 = k0Var == null ? -1 : com.yandex.plus.home.plaque.repository.graphql.a.a[k0Var.ordinal()];
                        if (i16 == -1) {
                            i2 = 0;
                        } else if (i16 == 1) {
                            i2 = 3;
                        } else if (i16 == 2) {
                            i2 = 5;
                        } else {
                            if (i16 != 3) {
                                b6e.s();
                                return null;
                            }
                            i2 = 1;
                        }
                        int i17 = l0Var == null ? -1 : com.yandex.plus.home.plaque.repository.graphql.a.b[l0Var.ordinal()];
                        if (i17 == -1) {
                            i3 = 0;
                        } else if (i17 == 1) {
                            i3 = 48;
                        } else if (i17 == 2) {
                            i3 = 80;
                        } else {
                            if (i17 != 3) {
                                b6e.s();
                                return null;
                            }
                            i3 = 16;
                        }
                        xVar = new com.yandex.plus.plaquesdk.plaque.api.models.display.x(bVar, vVar, i3 | i2);
                        com.yandex.plus.home.plaque.repository.graphql.cache.dto.d0 contentDescription = c6Var5.getContentDescription();
                        List list3 = contentDescription != null ? contentDescription.b : null;
                        if (list3 == null) {
                            list3 = c5b.a;
                        }
                        Iterator it5 = list3.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                Boolean bool = contentDescription != null ? contentDescription.d : null;
                                if (Intrinsics.d(bool, Boolean.TRUE)) {
                                    i4 = 1;
                                } else {
                                    if (!Intrinsics.d(bool, Boolean.FALSE) && bool != null) {
                                        b6e.s();
                                        return null;
                                    }
                                    i4 = 2;
                                }
                                aVar = new com.yandex.plus.plaquesdk.plaque.api.models.a(i4, (contentDescription == null || (str2 = contentDescription.a) == null) ? null : K(this, str2, map9), (contentDescription == null || (str = contentDescription.c) == null) ? null : K(this, str, map9));
                            } else if (!map9.containsKey((String) it5.next())) {
                                aVar = null;
                            }
                        }
                        if (aVar == null) {
                            aVar = aVar9;
                        }
                        if (c6Var5 instanceof b6) {
                            b6 b6Var = (b6) c6Var5;
                            String str13 = b6Var.a;
                            com.yandex.plus.home.plaque.repository.graphql.cache.dto.i iVar = b6Var.c;
                            c0 C2 = iVar != null ? C(iVar) : null;
                            List list4 = b6Var.e;
                            List list5 = b6Var.f;
                            kVar.j = c6Var5;
                            kVar.k = null;
                            kVar.l = null;
                            kVar.m = null;
                            kVar.n = null;
                            kVar.o = xVar;
                            kVar.p = aVar;
                            kVar.q = str13;
                            kVar.r = C2;
                            kVar.E = 1;
                            Object H2 = H(kVar, list4, list5, map9);
                            if (H2 != nm6Var3) {
                                obj3 = H2;
                                str7 = str13;
                                c0Var4 = C2;
                                xVar6 = xVar;
                                wVar = (com.yandex.plus.plaquesdk.plaque.api.models.w) obj3;
                                if (wVar != null) {
                                    return null;
                                }
                                Integer num = ((b6) c6Var5).g;
                                if (num == null) {
                                    num = null;
                                }
                                return new com.yandex.plus.plaquesdk.plaque.api.models.v(str7, c0Var4, aVar, xVar6, wVar, num != null ? new com.yandex.plus.core.android.extensions.f(num) : null);
                            }
                        } else {
                            z = true;
                            if (c6Var5 instanceof v5) {
                                return new com.yandex.plus.plaquesdk.plaque.api.models.t(((v5) c6Var5).a, null, aVar9, xVar);
                            }
                            aVar9 = aVar9;
                            if (c6Var5 instanceof s5) {
                                s5 s5Var = (s5) c6Var5;
                                String str14 = s5Var.a;
                                com.yandex.plus.home.plaque.repository.graphql.cache.dto.i iVar2 = s5Var.c;
                                C = iVar2 != null ? C(iVar2) : null;
                                mu7 mu7Var = (mu7) map3.get(s5Var.e);
                                if (mu7Var != null) {
                                    kVar.j = c6Var5;
                                    kVar.k = null;
                                    kVar.l = null;
                                    kVar.m = null;
                                    kVar.n = null;
                                    kVar.o = xVar;
                                    kVar.p = aVar;
                                    kVar.q = str14;
                                    kVar.r = C;
                                    kVar.E = 2;
                                    Object H3 = mu7Var.H(kVar);
                                    if (H3 != nm6Var3) {
                                        obj5 = H3;
                                        str6 = str14;
                                        drawable = (Drawable) obj5;
                                        if (drawable == null) {
                                            str14 = str6;
                                        }
                                        return new com.yandex.plus.plaquesdk.plaque.api.models.p(str6, C, aVar, xVar, new com.yandex.plus.plaquesdk.plaque.api.models.q(drawable, ((s5) c6Var5).e));
                                    }
                                }
                                String str15 = str14;
                                drawable = com.yandex.plus.plaquesdk.widget.a.a;
                                str6 = str15;
                                return new com.yandex.plus.plaquesdk.plaque.api.models.p(str6, C, aVar, xVar, new com.yandex.plus.plaquesdk.plaque.api.models.q(drawable, ((s5) c6Var5).e));
                            }
                            if (z2) {
                                p5 p5Var = (p5) c6Var5;
                                String str16 = p5Var.a;
                                com.yandex.plus.home.plaque.repository.graphql.cache.dto.i iVar3 = p5Var.c;
                                c0 C3 = iVar3 != null ? C(iVar3) : null;
                                List list6 = p5Var.e;
                                List list7 = p5Var.f;
                                kVar.j = null;
                                kVar.k = null;
                                kVar.l = null;
                                kVar.m = null;
                                kVar.n = null;
                                kVar.o = xVar;
                                kVar.p = aVar;
                                kVar.q = str16;
                                kVar.r = C3;
                                kVar.E = 3;
                                Object H4 = H(kVar, list6, list7, map9);
                                if (H4 != nm6Var3) {
                                    str5 = str16;
                                    c0Var3 = C3;
                                    xVar5 = xVar;
                                    obj5 = H4;
                                    com.yandex.plus.plaquesdk.plaque.api.models.a aVar11 = aVar;
                                    wVar2 = (com.yandex.plus.plaquesdk.plaque.api.models.w) obj5;
                                    if (wVar2 != null) {
                                        return null;
                                    }
                                    return new com.yandex.plus.plaquesdk.plaque.api.models.n(str5, c0Var3, aVar11, xVar5, wVar2);
                                }
                            } else if (c6Var5 instanceof m5) {
                                m5 m5Var = (m5) c6Var5;
                                String str17 = m5Var.a;
                                com.yandex.plus.home.plaque.repository.graphql.cache.dto.i iVar4 = m5Var.c;
                                c0 C4 = iVar4 != null ? C(iVar4) : null;
                                ?? r9 = new com.yandex.plus.plaquesdk.plaque.api.models.v[3];
                                List list8 = m5Var.e;
                                if (list8 != null) {
                                    List list9 = m5Var.h;
                                    kVar.j = c6Var5;
                                    kVar.k = map9;
                                    obj = null;
                                    kVar.l = null;
                                    kVar.m = null;
                                    kVar.n = null;
                                    kVar.o = null;
                                    kVar.p = null;
                                    kVar.q = r9;
                                    kVar.r = null;
                                    kVar.s = str17;
                                    kVar.t = C4;
                                    kVar.u = aVar;
                                    kVar.v = xVar;
                                    kVar.w = r9;
                                    kVar.z = 0;
                                    kVar.A = 0;
                                    kVar.E = 4;
                                    Object H5 = H(kVar, list8, list9, map9);
                                    if (H5 != nm6Var3) {
                                        str4 = str17;
                                        c0Var2 = C4;
                                        serializable = r9;
                                        xVar4 = xVar;
                                        aVar3 = aVar;
                                        obj2 = H5;
                                        i9 = 0;
                                        vVarArr3 = r9;
                                        wVar3 = (com.yandex.plus.plaquesdk.plaque.api.models.w) obj2;
                                        if (wVar3 == null) {
                                            int i18 = i9;
                                            uVar2 = uVar;
                                            i8 = i18;
                                            aVar = aVar3;
                                            vVar2 = new com.yandex.plus.plaquesdk.plaque.api.models.v(su4.o(new StringBuilder(), ((m5) c6Var5).a, ":title"), null, aVar9, new com.yandex.plus.plaquesdk.plaque.api.models.display.x(com.yandex.plus.plaquesdk.plaque.api.models.display.b.c, uVar2, 0), wVar3, null);
                                            c0Var5 = c0Var2;
                                            str8 = str4;
                                            xVar = xVar4;
                                            vVarArr2 = vVarArr3;
                                            Serializable serializable5 = serializable;
                                            vVarArr2[i8] = vVar2;
                                            m5 m5Var2 = (m5) c6Var5;
                                            String o = su4.o(new StringBuilder(), m5Var2.a, ":balance");
                                            com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar12 = new com.yandex.plus.plaquesdk.plaque.api.models.display.x(com.yandex.plus.plaquesdk.plaque.api.models.display.b.c, uVar2, 0);
                                            List list10 = m5Var2.g;
                                            List list11 = m5Var2.h;
                                            kVar.j = c6Var5;
                                            kVar.k = map9;
                                            kVar.l = null;
                                            kVar.m = null;
                                            kVar.n = null;
                                            kVar.o = null;
                                            kVar.p = null;
                                            kVar.q = serializable5;
                                            kVar.r = str8;
                                            kVar.s = c0Var5;
                                            kVar.t = aVar;
                                            kVar.u = xVar;
                                            kVar.v = serializable5;
                                            kVar.w = o;
                                            kVar.x = aVar9;
                                            kVar.y = xVar12;
                                            kVar.z = 1;
                                            kVar.E = 5;
                                            H = H(kVar, list10, list11, map9);
                                            nm6Var2 = nm6Var3;
                                            if (H == nm6Var2) {
                                                return nm6Var2;
                                            }
                                            str9 = o;
                                            xVar7 = xVar12;
                                            aVar4 = aVar9;
                                            i10 = 1;
                                            Serializable serializable6 = serializable5;
                                            c0Var6 = c0Var5;
                                            str10 = str8;
                                            aVar5 = aVar;
                                            c6Var3 = c6Var5;
                                            serializable2 = serializable6;
                                            r8 = serializable6;
                                            wVar4 = (com.yandex.plus.plaquesdk.plaque.api.models.w) H;
                                            if (wVar4 != null) {
                                                return null;
                                            }
                                            r8[i10] = new com.yandex.plus.plaquesdk.plaque.api.models.v(str9, null, aVar4, xVar7, wVar4, null);
                                            m5 m5Var3 = (m5) c6Var3;
                                            List list12 = m5Var3.f;
                                            if (list12 == null) {
                                                i11 = 2;
                                                r17 = serializable2;
                                                serializable3 = serializable2;
                                                c0Var8 = c0Var6;
                                                i11 = i11;
                                                xVar9 = xVar;
                                                aVar7 = aVar5;
                                                str12 = str10;
                                                vVar3 = null;
                                                r1 = serializable3;
                                                r1[i11] = vVar3;
                                                r17.getClass();
                                                return new com.yandex.plus.plaquesdk.plaque.api.models.r(str12, c0Var8, aVar7, xVar9, xz0.w(r17), 1);
                                            }
                                            List list13 = m5Var3.h;
                                            kVar.j = c6Var3;
                                            kVar.k = null;
                                            kVar.l = null;
                                            kVar.m = null;
                                            kVar.n = null;
                                            kVar.o = null;
                                            kVar.p = null;
                                            kVar.q = serializable2;
                                            kVar.r = null;
                                            kVar.s = str10;
                                            kVar.t = c0Var6;
                                            kVar.u = aVar5;
                                            kVar.v = xVar;
                                            kVar.w = serializable2;
                                            kVar.x = null;
                                            kVar.y = null;
                                            kVar.z = 0;
                                            i11 = 2;
                                            kVar.A = 2;
                                            kVar.E = 6;
                                            Object H6 = H(kVar, list12, list13, map9);
                                            if (H6 == nm6Var2) {
                                                return nm6Var2;
                                            }
                                            r17 = serializable2;
                                            obj4 = H6;
                                            c0Var7 = c0Var6;
                                            xVar8 = xVar;
                                            aVar6 = aVar5;
                                            str11 = str10;
                                            serializable4 = serializable2;
                                            wVar5 = (com.yandex.plus.plaquesdk.plaque.api.models.w) obj4;
                                            if (wVar5 == null) {
                                                com.yandex.plus.plaquesdk.plaque.api.models.v vVar4 = new com.yandex.plus.plaquesdk.plaque.api.models.v(su4.o(new StringBuilder(), ((m5) c6Var3).a, ":subtitle"), null, aVar9, new com.yandex.plus.plaquesdk.plaque.api.models.display.x(com.yandex.plus.plaquesdk.plaque.api.models.display.b.c, uVar2, 0), wVar5, null);
                                                aVar7 = aVar6;
                                                c0Var8 = c0Var7;
                                                str12 = str11;
                                                vVar3 = vVar4;
                                                xVar9 = xVar8;
                                                r1 = serializable4;
                                                r1[i11] = vVar3;
                                                r17.getClass();
                                                return new com.yandex.plus.plaquesdk.plaque.api.models.r(str12, c0Var8, aVar7, xVar9, xz0.w(r17), 1);
                                            }
                                            xVar = xVar8;
                                            aVar5 = aVar6;
                                            c0Var6 = c0Var7;
                                            str10 = str11;
                                            serializable3 = serializable4;
                                            c0Var8 = c0Var6;
                                            i11 = i11;
                                            xVar9 = xVar;
                                            aVar7 = aVar5;
                                            str12 = str10;
                                            vVar3 = null;
                                            r1 = serializable3;
                                            r1[i11] = vVar3;
                                            r17.getClass();
                                            return new com.yandex.plus.plaquesdk.plaque.api.models.r(str12, c0Var8, aVar7, xVar9, xz0.w(r17), 1);
                                        }
                                        i8 = i9;
                                        aVar = aVar3;
                                        xVar = xVar4;
                                        c0Var = c0Var2;
                                        str17 = str4;
                                        vVarArr = vVarArr3;
                                        uVar2 = uVar;
                                        str8 = str17;
                                        c0Var5 = c0Var;
                                        vVar2 = null;
                                        vVarArr2 = vVarArr;
                                        Serializable serializable52 = serializable;
                                        vVarArr2[i8] = vVar2;
                                        m5 m5Var22 = (m5) c6Var5;
                                        String o2 = su4.o(new StringBuilder(), m5Var22.a, ":balance");
                                        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar122 = new com.yandex.plus.plaquesdk.plaque.api.models.display.x(com.yandex.plus.plaquesdk.plaque.api.models.display.b.c, uVar2, 0);
                                        List list102 = m5Var22.g;
                                        List list112 = m5Var22.h;
                                        kVar.j = c6Var5;
                                        kVar.k = map9;
                                        kVar.l = null;
                                        kVar.m = null;
                                        kVar.n = null;
                                        kVar.o = null;
                                        kVar.p = null;
                                        kVar.q = serializable52;
                                        kVar.r = str8;
                                        kVar.s = c0Var5;
                                        kVar.t = aVar;
                                        kVar.u = xVar;
                                        kVar.v = serializable52;
                                        kVar.w = o2;
                                        kVar.x = aVar9;
                                        kVar.y = xVar122;
                                        kVar.z = 1;
                                        kVar.E = 5;
                                        H = H(kVar, list102, list112, map9);
                                        nm6Var2 = nm6Var3;
                                        if (H == nm6Var2) {
                                        }
                                    }
                                } else {
                                    c0Var = C4;
                                    i8 = 0;
                                    serializable = r9;
                                    vVarArr = r9;
                                    uVar2 = uVar;
                                    str8 = str17;
                                    c0Var5 = c0Var;
                                    vVar2 = null;
                                    vVarArr2 = vVarArr;
                                    Serializable serializable522 = serializable;
                                    vVarArr2[i8] = vVar2;
                                    m5 m5Var222 = (m5) c6Var5;
                                    String o22 = su4.o(new StringBuilder(), m5Var222.a, ":balance");
                                    com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar1222 = new com.yandex.plus.plaquesdk.plaque.api.models.display.x(com.yandex.plus.plaquesdk.plaque.api.models.display.b.c, uVar2, 0);
                                    List list1022 = m5Var222.g;
                                    List list1122 = m5Var222.h;
                                    kVar.j = c6Var5;
                                    kVar.k = map9;
                                    kVar.l = null;
                                    kVar.m = null;
                                    kVar.n = null;
                                    kVar.o = null;
                                    kVar.p = null;
                                    kVar.q = serializable522;
                                    kVar.r = str8;
                                    kVar.s = c0Var5;
                                    kVar.t = aVar;
                                    kVar.u = xVar;
                                    kVar.v = serializable522;
                                    kVar.w = o22;
                                    kVar.x = aVar9;
                                    kVar.y = xVar1222;
                                    kVar.z = 1;
                                    kVar.E = 5;
                                    H = H(kVar, list1022, list1122, map9);
                                    nm6Var2 = nm6Var3;
                                    if (H == nm6Var2) {
                                    }
                                }
                            } else {
                                nm6Var = nm6Var3;
                                if (c6Var5 instanceof y5) {
                                    y5 y5Var = (y5) c6Var5;
                                    String str18 = y5Var.a;
                                    b0 b0Var2 = new b0(str18);
                                    List list14 = y5Var.e;
                                    List list15 = y5Var.f;
                                    kVar.j = null;
                                    kVar.k = null;
                                    kVar.l = null;
                                    kVar.m = null;
                                    kVar.n = null;
                                    kVar.o = xVar;
                                    kVar.p = aVar;
                                    kVar.q = str18;
                                    kVar.r = b0Var2;
                                    kVar.E = 7;
                                    Object H7 = H(kVar, list14, list15, map9);
                                    if (H7 == nm6Var) {
                                        return nm6Var;
                                    }
                                    str3 = str18;
                                    b0Var = b0Var2;
                                    xVar3 = xVar;
                                    obj5 = H7;
                                    com.yandex.plus.plaquesdk.plaque.api.models.a aVar12 = aVar;
                                    wVar6 = (com.yandex.plus.plaquesdk.plaque.api.models.w) obj5;
                                    if (wVar6 != null) {
                                        return null;
                                    }
                                    return new com.yandex.plus.plaquesdk.plaque.api.models.u(str3, b0Var, aVar12, xVar3, wVar6, false);
                                }
                                if (!(c6Var5 instanceof j5)) {
                                    b6e.s();
                                    return null;
                                }
                                List b = ((j5) c6Var5).b();
                                set2 = set;
                                c6Var2 = c6Var5;
                                aVar2 = aVar;
                                xVar2 = xVar;
                                i5 = 0;
                                i6 = 0;
                                i7 = 0;
                                arrayList = new ArrayList();
                                kVar2 = kVar;
                                map4 = map3;
                                it = b.iterator();
                                map5 = map2;
                                if (!it.hasNext()) {
                                    com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar13 = xVar2;
                                    ArrayList arrayList5 = arrayList;
                                    j5 j5Var = (j5) c6Var2;
                                    if (arrayList5.size() != j5Var.b().size()) {
                                        return null;
                                    }
                                    if (j5Var instanceof d5) {
                                        d5 d5Var = (d5) c6Var2;
                                        String str19 = d5Var.a;
                                        com.yandex.plus.home.plaque.repository.graphql.cache.dto.i iVar5 = d5Var.c;
                                        return new com.yandex.plus.plaquesdk.plaque.api.models.m(str19, iVar5 != null ? C(iVar5) : null, aVar2, xVar13, arrayList5);
                                    }
                                    com.yandex.plus.plaquesdk.plaque.api.models.a aVar13 = aVar2;
                                    if (!(j5Var instanceof i5)) {
                                        b6e.s();
                                        return null;
                                    }
                                    i5 i5Var = (i5) c6Var2;
                                    String str20 = i5Var.a;
                                    com.yandex.plus.home.plaque.repository.graphql.cache.dto.i iVar6 = i5Var.c;
                                    c0 C5 = iVar6 != null ? C(iVar6) : null;
                                    int ordinal = i5Var.f.ordinal();
                                    if (ordinal == 0) {
                                        i12 = 0;
                                    } else {
                                        if (ordinal != 1) {
                                            b6e.s();
                                            return null;
                                        }
                                        i12 = 1;
                                    }
                                    return new com.yandex.plus.plaquesdk.plaque.api.models.r(str20, C5, aVar13, xVar13, arrayList5, i12);
                                }
                                c6 c6Var6 = (c6) map5.get((String) it.next());
                                if (c6Var6 != null) {
                                    LinkedHashSet j = wop.j(set2, c6Var2.getId());
                                    kVar2.j = c6Var2;
                                    kVar2.k = map9;
                                    kVar2.l = map5;
                                    kVar2.m = map4;
                                    kVar2.n = set2;
                                    kVar2.o = xVar2;
                                    kVar2.p = aVar2;
                                    kVar2.q = null;
                                    kVar2.r = null;
                                    kVar2.s = arrayList;
                                    kVar2.t = null;
                                    kVar2.u = it;
                                    kVar2.v = null;
                                    kVar2.w = null;
                                    kVar2.x = null;
                                    kVar2.z = i6;
                                    kVar2.A = i7;
                                    kVar2.B = i5;
                                    kVar2.E = 8;
                                    int i19 = i5;
                                    com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar14 = xVar2;
                                    Object u = u(c6Var6, map9, map5, map4, j, kVar2);
                                    if (u == nm6Var) {
                                        return nm6Var;
                                    }
                                    Map map10 = map5;
                                    obj5 = u;
                                    i5 = i19;
                                    map6 = map10;
                                    map7 = map9;
                                    i13 = i6;
                                    i14 = i7;
                                    map8 = map4;
                                    kVar = kVar2;
                                    set3 = set2;
                                    it2 = it;
                                    arrayList2 = arrayList;
                                    aVar8 = aVar2;
                                    xVar11 = xVar14;
                                    c6Var4 = c6Var2;
                                    Map map11 = map6;
                                    xVar10 = (com.yandex.plus.plaquesdk.plaque.api.models.x) obj5;
                                    map5 = map11;
                                    c6Var2 = c6Var4;
                                    arrayList = arrayList2;
                                    set2 = set3;
                                    i6 = i13;
                                    xVar2 = xVar11;
                                    aVar2 = aVar8;
                                    it = it2;
                                    kVar2 = kVar;
                                    map4 = map8;
                                    i7 = i14;
                                    map9 = map7;
                                    if (xVar10 != null) {
                                        arrayList.add(xVar10);
                                    }
                                    if (!it.hasNext()) {
                                    }
                                } else {
                                    xVar10 = null;
                                    if (xVar10 != null) {
                                    }
                                    if (!it.hasNext()) {
                                    }
                                }
                            }
                        }
                        return nm6Var3;
                    case 1:
                        c0 c0Var9 = (c0) kVar.r;
                        String str21 = (String) kVar.q;
                        aVar = kVar.p;
                        xVar6 = kVar.o;
                        Set set4 = kVar.n;
                        Map map12 = kVar.m;
                        Map map13 = kVar.l;
                        Map map14 = kVar.k;
                        c6 c6Var7 = kVar.j;
                        qgg.h0(obj5);
                        c0Var4 = c0Var9;
                        c6Var5 = c6Var7;
                        str7 = str21;
                        obj3 = obj5;
                        wVar = (com.yandex.plus.plaquesdk.plaque.api.models.w) obj3;
                        if (wVar != null) {
                        }
                        break;
                    case 2:
                        c0 c0Var10 = (c0) kVar.r;
                        str6 = (String) kVar.q;
                        aVar = kVar.p;
                        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar15 = kVar.o;
                        Set set5 = kVar.n;
                        Map map15 = kVar.m;
                        Map map16 = kVar.l;
                        Map map17 = kVar.k;
                        c6 c6Var8 = kVar.j;
                        qgg.h0(obj5);
                        xVar = xVar15;
                        C = c0Var10;
                        c6Var5 = c6Var8;
                        drawable = (Drawable) obj5;
                        if (drawable == null) {
                        }
                        return new com.yandex.plus.plaquesdk.plaque.api.models.p(str6, C, aVar, xVar, new com.yandex.plus.plaquesdk.plaque.api.models.q(drawable, ((s5) c6Var5).e));
                    case 3:
                        c0 c0Var11 = (c0) kVar.r;
                        String str22 = (String) kVar.q;
                        aVar = kVar.p;
                        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar16 = kVar.o;
                        Set set6 = kVar.n;
                        Map map18 = kVar.m;
                        Map map19 = kVar.l;
                        Map map20 = kVar.k;
                        qgg.h0(obj5);
                        c0Var3 = c0Var11;
                        str5 = str22;
                        xVar5 = xVar16;
                        com.yandex.plus.plaquesdk.plaque.api.models.a aVar112 = aVar;
                        wVar2 = (com.yandex.plus.plaquesdk.plaque.api.models.w) obj5;
                        if (wVar2 != null) {
                        }
                        break;
                    case 4:
                        int i20 = kVar.A;
                        com.yandex.plus.plaquesdk.plaque.api.models.v[] vVarArr4 = (com.yandex.plus.plaquesdk.plaque.api.models.v[]) kVar.w;
                        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar17 = (com.yandex.plus.plaquesdk.plaque.api.models.display.x) kVar.v;
                        aVar3 = (com.yandex.plus.plaquesdk.plaque.api.models.a) kVar.u;
                        c0 c0Var12 = (c0) kVar.t;
                        String str23 = (String) kVar.s;
                        ?? r12 = (com.yandex.plus.plaquesdk.plaque.api.models.v[]) kVar.q;
                        Set set7 = kVar.n;
                        Map map21 = kVar.m;
                        Map map22 = kVar.l;
                        Map map23 = kVar.k;
                        c6 c6Var9 = kVar.j;
                        qgg.h0(obj5);
                        xVar4 = xVar17;
                        uVar = uVar3;
                        c0Var2 = c0Var12;
                        str4 = str23;
                        serializable = r12;
                        z = true;
                        vVarArr3 = vVarArr4;
                        obj2 = obj5;
                        map9 = map23;
                        obj = null;
                        i9 = i20;
                        c6Var5 = c6Var9;
                        wVar3 = (com.yandex.plus.plaquesdk.plaque.api.models.w) obj2;
                        if (wVar3 == null) {
                        }
                        break;
                    case 5:
                        int i21 = kVar.z;
                        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar18 = kVar.y;
                        com.yandex.plus.plaquesdk.plaque.api.models.a aVar14 = kVar.x;
                        String str24 = (String) kVar.w;
                        com.yandex.plus.plaquesdk.plaque.api.models.v[] vVarArr5 = (com.yandex.plus.plaquesdk.plaque.api.models.v[]) kVar.v;
                        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar19 = (com.yandex.plus.plaquesdk.plaque.api.models.display.x) kVar.u;
                        aVar5 = (com.yandex.plus.plaquesdk.plaque.api.models.a) kVar.t;
                        c0 c0Var13 = (c0) kVar.s;
                        str10 = (String) kVar.r;
                        ?? r82 = (com.yandex.plus.plaquesdk.plaque.api.models.v[]) kVar.q;
                        Set set8 = kVar.n;
                        Map map24 = kVar.m;
                        Map map25 = kVar.l;
                        Map map26 = kVar.k;
                        c6 c6Var10 = kVar.j;
                        qgg.h0(obj5);
                        aVar4 = aVar14;
                        str9 = str24;
                        xVar7 = xVar18;
                        map9 = map26;
                        c6Var3 = c6Var10;
                        serializable2 = r82;
                        i10 = i21;
                        xVar = xVar19;
                        r8 = vVarArr5;
                        nm6Var2 = nm6Var3;
                        c0Var6 = c0Var13;
                        H = obj5;
                        uVar2 = uVar3;
                        wVar4 = (com.yandex.plus.plaquesdk.plaque.api.models.w) H;
                        if (wVar4 != null) {
                        }
                        break;
                    case 6:
                        int i22 = kVar.A;
                        ?? r13 = (com.yandex.plus.plaquesdk.plaque.api.models.v[]) kVar.w;
                        xVar8 = (com.yandex.plus.plaquesdk.plaque.api.models.display.x) kVar.v;
                        com.yandex.plus.plaquesdk.plaque.api.models.a aVar15 = (com.yandex.plus.plaquesdk.plaque.api.models.a) kVar.u;
                        c0 c0Var14 = (c0) kVar.t;
                        String str25 = (String) kVar.s;
                        com.yandex.plus.plaquesdk.plaque.api.models.v[] vVarArr6 = (com.yandex.plus.plaquesdk.plaque.api.models.v[]) kVar.q;
                        Set set9 = kVar.n;
                        Map map27 = kVar.m;
                        Map map28 = kVar.l;
                        Map map29 = kVar.k;
                        c6 c6Var11 = kVar.j;
                        qgg.h0(obj5);
                        obj4 = obj5;
                        uVar2 = uVar3;
                        i11 = i22;
                        str11 = str25;
                        c0Var7 = c0Var14;
                        aVar6 = aVar15;
                        c6Var3 = c6Var11;
                        r17 = vVarArr6;
                        serializable4 = r13;
                        wVar5 = (com.yandex.plus.plaquesdk.plaque.api.models.w) obj4;
                        if (wVar5 == null) {
                        }
                        break;
                    case 7:
                        ?? r14 = (c0) kVar.r;
                        String str26 = (String) kVar.q;
                        aVar = kVar.p;
                        com.yandex.plus.plaquesdk.plaque.api.models.display.x xVar20 = kVar.o;
                        Set set10 = kVar.n;
                        Map map30 = kVar.m;
                        Map map31 = kVar.l;
                        Map map32 = kVar.k;
                        qgg.h0(obj5);
                        b0Var = r14;
                        str3 = str26;
                        xVar3 = xVar20;
                        com.yandex.plus.plaquesdk.plaque.api.models.a aVar122 = aVar;
                        wVar6 = (com.yandex.plus.plaquesdk.plaque.api.models.w) obj5;
                        if (wVar6 != null) {
                        }
                        break;
                    case 8:
                        i5 = kVar.B;
                        i14 = kVar.A;
                        i13 = kVar.z;
                        it2 = (Iterator) kVar.u;
                        ?? r83 = (Collection) kVar.s;
                        aVar8 = kVar.p;
                        xVar11 = kVar.o;
                        set3 = kVar.n;
                        map8 = kVar.m;
                        map6 = kVar.l;
                        Map map33 = kVar.k;
                        c6Var4 = kVar.j;
                        qgg.h0(obj5);
                        map7 = map33;
                        nm6Var = nm6Var3;
                        arrayList2 = r83;
                        Map map112 = map6;
                        xVar10 = (com.yandex.plus.plaquesdk.plaque.api.models.x) obj5;
                        map5 = map112;
                        c6Var2 = c6Var4;
                        arrayList = arrayList2;
                        set2 = set3;
                        i6 = i13;
                        xVar2 = xVar11;
                        aVar2 = aVar8;
                        it = it2;
                        kVar2 = kVar;
                        map4 = map8;
                        i7 = i14;
                        map9 = map7;
                        if (xVar10 != null) {
                        }
                        if (!it.hasNext()) {
                        }
                        break;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        kVar = new com.yandex.plus.home.plaque.repository.graphql.k(this, cg6Var);
        Object obj52 = kVar.C;
        nm6 nm6Var32 = nm6.a;
        i = kVar.E;
        com.yandex.plus.plaquesdk.plaque.api.models.display.u uVar32 = com.yandex.plus.plaquesdk.plaque.api.models.display.u.a;
        com.yandex.plus.plaquesdk.plaque.api.models.a aVar92 = com.yandex.plus.plaquesdk.plaque.api.models.a.d;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0062 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(com.yandex.plus.bdui.plus.content.controller.e eVar, Uri uri, JSONObject jSONObject, com.yandex.plus.divkit.impl.n nVar, ryc rycVar) {
        Map map;
        Pair pair;
        JSONArray optJSONArray;
        com.yandex.plus.divkit.api.p pVar;
        Pair pair2;
        com.yandex.plus.divkit.api.p lVar;
        com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) this.e;
        if (eVar == null) {
            com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.d;
            if (bVar.b(aVar)) {
                bVar.c(aVar, "PlusDivContentController.ActionHandler", "handleAction(); divHolder is null!");
                return;
            }
            return;
        }
        String host = uri.getHost();
        if (host == null) {
            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
            if (bVar.b(aVar2)) {
                bVar.c(aVar2, "PlusDivContentController.ActionHandler", "handleAction(); action name is null!");
                return;
            }
            return;
        }
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("params")) == null) {
            map = null;
        } else {
            int length = optJSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                Object obj = optJSONArray.get(i);
                obj.getClass();
                String str = obj instanceof String ? (String) obj : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                com.yandex.plus.divkit.impl.p pVar2 = eVar.b;
                str2.getClass();
                kxt e = ((bz9) pVar2.a.getValue()).e(str2);
                if (e != null) {
                    if (e instanceof axt) {
                        axt axtVar = (axt) e;
                        Object d = axtVar.d();
                        Boolean bool = d instanceof Boolean ? (Boolean) d : null;
                        if (bool != null) {
                            pVar = new com.yandex.plus.divkit.api.i(axtVar.b, bool.booleanValue());
                        }
                    } else if (e instanceof ext) {
                        ext extVar = (ext) e;
                        Object d2 = extVar.d();
                        Long l = d2 instanceof Long ? (Long) d2 : null;
                        if (l != null) {
                            lVar = new com.yandex.plus.divkit.api.m(extVar.b, l.longValue());
                            pVar = lVar;
                        }
                    } else if (e instanceof dxt) {
                        dxt dxtVar = (dxt) e;
                        Object d3 = dxtVar.d();
                        Double d4 = d3 instanceof Double ? (Double) d3 : null;
                        if (d4 != null) {
                            lVar = new com.yandex.plus.divkit.api.l(dxtVar.b, d4.doubleValue());
                            pVar = lVar;
                        }
                    } else if (e instanceof hxt) {
                        hxt hxtVar = (hxt) e;
                        Object d5 = hxtVar.d();
                        String str3 = d5 instanceof String ? (String) d5 : null;
                        if (str3 != null) {
                            pVar = new com.yandex.plus.divkit.api.n(hxtVar.b, str3);
                        }
                    } else if (e instanceof zwt) {
                        zwt zwtVar = (zwt) e;
                        Object d6 = zwtVar.d();
                        JSONArray jSONArray = d6 instanceof JSONArray ? (JSONArray) d6 : null;
                        if (jSONArray != null) {
                            pVar = new com.yandex.plus.divkit.api.h(zwtVar.b, com.yandex.plus.bdui.flex.ui.a.L(jSONArray));
                        }
                    } else if (e instanceof cxt) {
                        cxt cxtVar = (cxt) e;
                        Object d7 = cxtVar.d();
                        JSONObject jSONObject2 = d7 instanceof JSONObject ? (JSONObject) d7 : null;
                        if (jSONObject2 != null) {
                            pVar = new com.yandex.plus.divkit.api.k(cxtVar.b, com.yandex.plus.bdui.flex.ui.a.M(jSONObject2));
                        }
                    } else if (e instanceof bxt) {
                        bxt bxtVar = (bxt) e;
                        Object d8 = bxtVar.d();
                        c85 c85Var = d8 instanceof c85 ? (c85) d8 : null;
                        if (c85Var != null) {
                            pVar = new com.yandex.plus.divkit.api.j(bxtVar.b, c85Var.a);
                        }
                    } else if (e instanceof ixt) {
                        ixt ixtVar = (ixt) e;
                        Object d9 = ixtVar.d();
                        Uri uri2 = d9 instanceof Uri ? (Uri) d9 : null;
                        if (uri2 != null) {
                            pVar = new com.yandex.plus.divkit.api.o(uri2, ixtVar.b);
                        }
                    } else if (!(e instanceof gxt)) {
                        b6e.s();
                        return;
                    }
                    Object value = pVar == null ? pVar.getValue() : null;
                    pair2 = value == null ? new Pair(str2, value) : null;
                    if (pair2 == null) {
                        arrayList2.add(pair2);
                    }
                }
                pVar = null;
                if (pVar == null) {
                }
                if (value == null) {
                }
                if (pair2 == null) {
                }
            }
            map = uah.n(arrayList2);
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        queryParameterNames.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (String str4 : queryParameterNames) {
            List<String> queryParameters = uri.getQueryParameters(str4);
            if (!queryParameters.isEmpty()) {
                if (queryParameters.size() == 1) {
                    String str5 = queryParameters.get(0);
                    if (str5 != null) {
                        pair = new Pair(str4, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.z(str5));
                        if (pair != null) {
                            arrayList3.add(pair);
                        }
                    }
                } else {
                    ArrayList O = CollectionsKt.O(queryParameters);
                    ArrayList arrayList4 = new ArrayList(v75.o(O, 10));
                    Iterator it2 = O.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.z((String) it2.next()));
                    }
                    if (arrayList4.isEmpty()) {
                        arrayList4 = null;
                    }
                    if (arrayList4 != null) {
                        pair = new Pair(str4, arrayList4);
                        if (pair != null) {
                        }
                    }
                }
            }
            pair = null;
            if (pair != null) {
            }
        }
        Map n = uah.n(arrayList3);
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.putAll(n);
            n = linkedHashMap;
        }
        rycVar.invoke(eVar, host, n, nVar);
    }

    public void w() {
        com.yandex.passport.internal.flags.experiments.p pVar = (com.yandex.passport.internal.flags.experiments.p) this.d;
        View view = pVar != null ? (View) pVar.d : null;
        if (view != null) {
            ((com.yandex.plus.bdui.flex.utils.c) this.a).removeViewInLayout(view);
        }
    }

    public LinkedHashMap x(w1 w1Var) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = w1Var.d.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.yandex.plus.home.plaque.repository.graphql.cache.dto.g0) it.next()).d);
        }
        Iterator it2 = w1Var.e.iterator();
        while (it2.hasNext()) {
            arrayList.add(((com.yandex.plus.home.plaque.repository.graphql.cache.dto.g0) it2.next()).d);
        }
        Iterator it3 = w1Var.c.iterator();
        while (it3.hasNext()) {
            arrayList.add(((com.yandex.plus.home.plaque.repository.graphql.cache.dto.g0) it3.next()).d);
        }
        Iterator it4 = w1Var.b.iterator();
        while (it4.hasNext()) {
            arrayList.add(((com.yandex.plus.home.plaque.repository.graphql.cache.dto.a0) it4.next()).d);
        }
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            t1 t1Var = (t1) it5.next();
            if (t1Var != null && (t1Var instanceof r1)) {
                linkedHashSet.add(((r1) t1Var).b);
            }
        }
        for (c6 c6Var : w1Var.a) {
            if (c6Var instanceof s5) {
                linkedHashSet.add(((s5) c6Var).e);
            }
        }
        int a = tah.a(v75.o(linkedHashSet, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        for (Object obj : linkedHashSet) {
            linkedHashMap.put(obj, x97.p((mm6) this.e, (kotlinx.coroutines.a) this.c, null, new com.yandex.plus.home.api.prefetch.j(this, (String) obj, (Continuation) null, 19), 2));
        }
        return linkedHashMap;
    }

    public void y(com.yandex.passport.api.n... nVarArr) {
        for (com.yandex.passport.api.n nVar : nVarArr) {
            ((com.yandex.passport.common.bitflag.b) this.e).a(nVar, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        if (r7 != null) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object z(r1 r1Var, Map map, cg6 cg6Var) {
        com.yandex.plus.home.plaque.repository.graphql.l lVar;
        int i;
        f0 F;
        Object H;
        Drawable drawable;
        if (cg6Var instanceof com.yandex.plus.home.plaque.repository.graphql.l) {
            lVar = (com.yandex.plus.home.plaque.repository.graphql.l) cg6Var;
            int i2 = lVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.n = i2 - Integer.MIN_VALUE;
                Object obj = lVar.l;
                nm6 nm6Var = nm6.a;
                i = lVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    s1 s1Var = r1Var.a;
                    if (s1Var == null || (F = F(s1Var)) == null) {
                        return null;
                    }
                    mu7 mu7Var = (mu7) map.get(r1Var.b);
                    if (mu7Var != null) {
                        lVar.j = r1Var;
                        lVar.k = F;
                        lVar.n = 1;
                        H = mu7Var.H(lVar);
                        if (H == nm6Var) {
                            return nm6Var;
                        }
                    }
                    drawable = com.yandex.plus.plaquesdk.widget.a.a;
                    return new e0(new com.yandex.plus.plaquesdk.plaque.api.models.q(drawable, r1Var.b), F);
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f0 f0Var = lVar.k;
                r1 r1Var2 = lVar.j;
                qgg.h0(obj);
                F = f0Var;
                r1Var = r1Var2;
                H = obj;
                drawable = (Drawable) H;
            }
        }
        lVar = new com.yandex.plus.home.plaque.repository.graphql.l(this, cg6Var);
        Object obj2 = lVar.l;
        nm6 nm6Var2 = nm6.a;
        i = lVar.n;
        if (i != 0) {
        }
        drawable = (Drawable) H;
    }

    public j(com.yandex.plus.pay.log.impl.b bVar, com.yandex.plus.pay.ui.common.api.b bVar2, String str) {
        bVar.getClass();
        this.a = str;
        this.b = bVar;
        this.c = bVar2;
        final int i = 0;
        this.d = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.common.api.log.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        Object systemService = ((com.yandex.plus.pay.ui.common.api.b) this.b.c).getSystemService("connectivity");
                        systemService.getClass();
                        return (ConnectivityManager) systemService;
                    default:
                        j jVar = this.b;
                        return new f((String) jVar.a, (com.yandex.plus.pay.log.impl.b) jVar.b, (ConnectivityManager) ((jyr) jVar.d).getValue());
                }
            }
        });
        final int i2 = 1;
        this.e = btf.b(new Function0(this) { // from class: com.yandex.plus.pay.ui.common.api.log.e
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        Object systemService = ((com.yandex.plus.pay.ui.common.api.b) this.b.c).getSystemService("connectivity");
                        systemService.getClass();
                        return (ConnectivityManager) systemService;
                    default:
                        j jVar = this.b;
                        return new f((String) jVar.a, (com.yandex.plus.pay.log.impl.b) jVar.b, (ConnectivityManager) ((jyr) jVar.d).getValue());
                }
            }
        });
    }

    public j(lm4 lm4Var) {
        this.a = lm4Var;
    }

    public j(com.yandex.plus.acquisition.sdk.button.section.ui.impl.di.c cVar, com.yandex.plus.acquisition.sdk.pay.impl.b bVar) {
        this.a = cVar;
        this.b = bVar;
        final int i = 0;
        this.c = btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.adapter.internal.adapter.b
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        j jVar = this.b;
                        return new com.yandex.plus.acquisition.adapter.internal.controller.b((c) jVar.a, (com.yandex.plus.acquisition.sdk.pay.impl.b) jVar.b, (com.yandex.plus.acquisition.adapter.internal.processor.b) ((jyr) jVar.d).getValue(), (com.yandex.plus.acquisition.adapter.internal.analytics.a) ((jyr) jVar.e).getValue());
                    default:
                        j jVar2 = this.b;
                        return new com.yandex.plus.acquisition.adapter.internal.processor.b((com.yandex.plus.acquisition.sdk.pay.impl.b) jVar2.b, (d) ((c) jVar2.a).c.getValue(), (com.yandex.plus.acquisition.adapter.internal.analytics.a) ((jyr) jVar2.e).getValue());
                }
            }
        });
        final int i2 = 1;
        this.d = btf.b(new Function0(this) { // from class: com.yandex.plus.acquisition.adapter.internal.adapter.b
            public final /* synthetic */ j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        j jVar = this.b;
                        return new com.yandex.plus.acquisition.adapter.internal.controller.b((c) jVar.a, (com.yandex.plus.acquisition.sdk.pay.impl.b) jVar.b, (com.yandex.plus.acquisition.adapter.internal.processor.b) ((jyr) jVar.d).getValue(), (com.yandex.plus.acquisition.adapter.internal.analytics.a) ((jyr) jVar.e).getValue());
                    default:
                        j jVar2 = this.b;
                        return new com.yandex.plus.acquisition.adapter.internal.processor.b((com.yandex.plus.acquisition.sdk.pay.impl.b) jVar2.b, (d) ((c) jVar2.a).c.getValue(), (com.yandex.plus.acquisition.adapter.internal.analytics.a) ((jyr) jVar2.e).getValue());
                }
            }
        });
        this.e = btf.b(new com.yandex.passport.sloth.command.data.k0(3));
    }
}
