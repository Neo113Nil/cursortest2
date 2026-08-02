package ru.yandex.taxi.persuggest.source;

import android.location.LocationManager;
import defpackage.bvf0;
import defpackage.dai0;
import defpackage.dhe0;
import defpackage.dox0;
import defpackage.fe61;
import defpackage.fif;
import defpackage.fw2;
import defpackage.hq0;
import defpackage.ht2;
import defpackage.hzk;
import defpackage.jc00;
import defpackage.k0b0;
import defpackage.kc00;
import defpackage.km21;
import defpackage.lk6;
import defpackage.mk6;
import defpackage.ny61;
import defpackage.o3u;
import defpackage.ohf;
import defpackage.rta0;
import defpackage.tta0;
import defpackage.v03;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;

/* loaded from: classes9.dex */
public final class a {
    public final km21 a;
    public final ru.yandex.taxi.persuggest.fingerprint.a b;
    public final ru.yandex.taxi.persuggest.fingerprint.c c;
    public final dox0 d;
    public final ru.yandex.taxi.preorder.source.userposition.b e;
    public final rta0 f;
    public final fif g;
    public final ru.yandex.taxi.preorder.source.userposition.a h;
    public final ohf i;
    public final tta0 j;
    public final dhe0 k;
    public final ru.yandex.taxi.location.lbs.wifi.a l;
    public final o3u m;
    public final hq0 n;
    public final jc00 o;
    public final ht2 p;
    public final com.yandex.go.address.search.perf.c q;

    public a(km21 km21Var, ru.yandex.taxi.persuggest.fingerprint.a aVar, ru.yandex.taxi.persuggest.fingerprint.c cVar, dox0 dox0Var, ru.yandex.taxi.preorder.source.userposition.b bVar, rta0 rta0Var, fif fifVar, ru.yandex.taxi.preorder.source.userposition.a aVar2, ohf ohfVar, tta0 tta0Var, dhe0 dhe0Var, ru.yandex.taxi.location.lbs.wifi.a aVar3, o3u o3uVar, hq0 hq0Var, jc00 jc00Var, ht2 ht2Var, com.yandex.go.address.search.perf.c cVar2) {
        this.a = km21Var;
        this.b = aVar;
        this.c = cVar;
        this.d = dox0Var;
        this.e = bVar;
        this.f = rta0Var;
        this.g = fifVar;
        this.h = aVar2;
        this.i = ohfVar;
        this.j = tta0Var;
        this.k = dhe0Var;
        this.l = aVar3;
        this.m = o3uVar;
        this.n = hq0Var;
        this.o = jc00Var;
        this.p = ht2Var;
        this.q = cVar2;
    }

    public static /* synthetic */ Object b(a aVar, String str, Float f, Action action, LinkedHashMap linkedHashMap, String str2, List list, lk6 lk6Var, boolean z, ContinuationImpl continuationImpl, int i) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            f = null;
        }
        if ((i & 4) != 0) {
            action = null;
        }
        if ((i & 8) != 0) {
            linkedHashMap = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            list = null;
        }
        if ((i & 64) != 0) {
            lk6Var = null;
        }
        if ((i & 128) != 0) {
            z = false;
        }
        return aVar.a(str, f, action, linkedHashMap, str2, list, lk6Var, z, continuationImpl);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x017d, code lost:
    
        if (r0 == r11) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r0v14, types: [v03] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Float f, Action action, Map map, String str2, List list, lk6 lk6Var, boolean z, ContinuationImpl continuationImpl) {
        ApplicationStateFactoryImpl$create$1 applicationStateFactoryImpl$create$1;
        Object obj;
        int i;
        boolean z2;
        String str3;
        Map map2;
        List list2;
        int i2;
        Action action2;
        String str4;
        lk6 lk6Var2;
        Float f2;
        ApplicationStateFactoryImpl$create$1 applicationStateFactoryImpl$create$12;
        boolean z3;
        Object obj2;
        a aVar = this;
        if (continuationImpl instanceof ApplicationStateFactoryImpl$create$1) {
            applicationStateFactoryImpl$create$1 = (ApplicationStateFactoryImpl$create$1) continuationImpl;
            int i3 = applicationStateFactoryImpl$create$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                applicationStateFactoryImpl$create$1.label = i3 - Integer.MIN_VALUE;
                ApplicationStateFactoryImpl$create$1 applicationStateFactoryImpl$create$13 = applicationStateFactoryImpl$create$1;
                obj = applicationStateFactoryImpl$create$13.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = applicationStateFactoryImpl$create$13.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aVar.c.b();
                    aVar.a.getClass();
                    applicationStateFactoryImpl$create$13.L$0 = str;
                    applicationStateFactoryImpl$create$13.L$1 = f;
                    applicationStateFactoryImpl$create$13.L$2 = action;
                    applicationStateFactoryImpl$create$13.L$3 = map;
                    applicationStateFactoryImpl$create$13.L$4 = str2;
                    applicationStateFactoryImpl$create$13.L$5 = list;
                    applicationStateFactoryImpl$create$13.L$6 = lk6Var;
                    z2 = z;
                    applicationStateFactoryImpl$create$13.Z$0 = z2;
                    applicationStateFactoryImpl$create$13.label = 1;
                    Object a = aVar.q.a(applicationStateFactoryImpl$create$13);
                    if (a != obj3) {
                        str3 = str;
                        obj = a;
                        map2 = map;
                        list2 = list;
                        i2 = 3;
                        action2 = action;
                        str4 = str2;
                        lk6Var2 = lk6Var;
                        f2 = f;
                    }
                    return obj3;
                }
                if (i != 1) {
                    if (i == 2) {
                        z3 = applicationStateFactoryImpl$create$13.Z$0;
                        kotlin.b.b(obj);
                        aVar = this;
                        z2 = z3;
                        applicationStateFactoryImpl$create$12 = applicationStateFactoryImpl$create$13;
                        obj2 = (v03) obj;
                        if (z2) {
                        }
                        return obj2;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    boolean z4 = applicationStateFactoryImpl$create$13.Z$0;
                    kotlin.b.b(obj);
                    z2 = z4;
                    applicationStateFactoryImpl$create$12 = applicationStateFactoryImpl$create$13;
                    obj2 = (v03) obj;
                    if (z2) {
                        applicationStateFactoryImpl$create$12.L$0 = null;
                        applicationStateFactoryImpl$create$12.L$1 = null;
                        applicationStateFactoryImpl$create$12.L$2 = null;
                        applicationStateFactoryImpl$create$12.L$3 = null;
                        applicationStateFactoryImpl$create$12.L$4 = null;
                        applicationStateFactoryImpl$create$12.L$5 = null;
                        applicationStateFactoryImpl$create$12.L$6 = null;
                        applicationStateFactoryImpl$create$12.L$7 = null;
                        applicationStateFactoryImpl$create$12.Z$0 = z2;
                        applicationStateFactoryImpl$create$12.label = 4;
                        obj2 = aVar.b.a(obj2, applicationStateFactoryImpl$create$12);
                        if (obj2 == obj3) {
                            return obj3;
                        }
                    }
                    return obj2;
                }
                boolean z5 = applicationStateFactoryImpl$create$13.Z$0;
                lk6 lk6Var3 = (lk6) applicationStateFactoryImpl$create$13.L$6;
                List list3 = (List) applicationStateFactoryImpl$create$13.L$5;
                String str5 = (String) applicationStateFactoryImpl$create$13.L$4;
                Map map3 = (Map) applicationStateFactoryImpl$create$13.L$3;
                Action action3 = (Action) applicationStateFactoryImpl$create$13.L$2;
                f2 = (Float) applicationStateFactoryImpl$create$13.L$1;
                String str6 = (String) applicationStateFactoryImpl$create$13.L$0;
                kotlin.b.b(obj);
                z2 = z5;
                str3 = str6;
                i2 = 3;
                action2 = action3;
                lk6Var2 = lk6Var3;
                map2 = map3;
                list2 = list3;
                str4 = str5;
                if (((Boolean) obj).booleanValue()) {
                    applicationStateFactoryImpl$create$13.L$0 = null;
                    applicationStateFactoryImpl$create$13.L$1 = null;
                    applicationStateFactoryImpl$create$13.L$2 = null;
                    applicationStateFactoryImpl$create$13.L$3 = null;
                    applicationStateFactoryImpl$create$13.L$4 = null;
                    applicationStateFactoryImpl$create$13.L$5 = null;
                    applicationStateFactoryImpl$create$13.L$6 = null;
                    applicationStateFactoryImpl$create$13.Z$0 = z2;
                    applicationStateFactoryImpl$create$13.label = i2;
                    obj = c(lk6Var2, str3, action2, f2, map2, str4, list2, applicationStateFactoryImpl$create$13);
                    aVar = this;
                    applicationStateFactoryImpl$create$12 = applicationStateFactoryImpl$create$13;
                } else {
                    applicationStateFactoryImpl$create$13.L$0 = null;
                    applicationStateFactoryImpl$create$13.L$1 = null;
                    applicationStateFactoryImpl$create$13.L$2 = null;
                    applicationStateFactoryImpl$create$13.L$3 = null;
                    applicationStateFactoryImpl$create$13.L$4 = null;
                    applicationStateFactoryImpl$create$13.L$5 = null;
                    applicationStateFactoryImpl$create$13.L$6 = null;
                    applicationStateFactoryImpl$create$13.Z$0 = z2;
                    applicationStateFactoryImpl$create$13.label = 2;
                    obj = bvf0.n(new ApplicationStateFactoryImpl$createAsyncApplicationState$2(aVar, str3, action2, f2, map2, str4, list2, lk6Var2, null), applicationStateFactoryImpl$create$13);
                    if (obj != obj3) {
                        z3 = z2;
                        aVar = this;
                        z2 = z3;
                        applicationStateFactoryImpl$create$12 = applicationStateFactoryImpl$create$13;
                        obj2 = (v03) obj;
                        if (z2) {
                        }
                        return obj2;
                    }
                }
                return obj3;
            }
        }
        applicationStateFactoryImpl$create$1 = new ApplicationStateFactoryImpl$create$1(aVar, continuationImpl);
        ApplicationStateFactoryImpl$create$1 applicationStateFactoryImpl$create$132 = applicationStateFactoryImpl$create$1;
        obj = applicationStateFactoryImpl$create$132.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applicationStateFactoryImpl$create$132.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return obj32;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0219, code lost:
    
        if (r1.isLocationEnabled() != false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(lk6 lk6Var, String str, Action action, Float f, Map map, String str2, List list, ContinuationImpl continuationImpl) {
        ApplicationStateFactoryImpl$createSyncApplicationState$1 applicationStateFactoryImpl$createSyncApplicationState$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Float f2;
        Map map2;
        lk6 lk6Var2;
        String str3;
        List list2;
        Action action2;
        String str4;
        Object b;
        List list3;
        List list4;
        List list5;
        String str5;
        Float f3;
        String str6;
        lk6 lk6Var3;
        Action action3;
        Map map3;
        Serializable a;
        List list6;
        List list7;
        List list8;
        lk6 lk6Var4;
        List list9;
        List list10;
        String str7;
        Map map4;
        Float f4;
        String str8;
        List list11;
        List list12;
        List list13;
        List list14;
        List list15;
        String str9;
        Map map5;
        Float f5;
        Action action4;
        String str10;
        hzk hzkVar;
        if (continuationImpl instanceof ApplicationStateFactoryImpl$createSyncApplicationState$1) {
            applicationStateFactoryImpl$createSyncApplicationState$1 = (ApplicationStateFactoryImpl$createSyncApplicationState$1) continuationImpl;
            int i2 = applicationStateFactoryImpl$createSyncApplicationState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                applicationStateFactoryImpl$createSyncApplicationState$1.label = i2 - Integer.MIN_VALUE;
                Object obj = applicationStateFactoryImpl$createSyncApplicationState$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = applicationStateFactoryImpl$createSyncApplicationState$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$0 = lk6Var;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$1 = str;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$2 = action;
                    f2 = f;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$3 = f2;
                    map2 = map;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$4 = map2;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$5 = str2;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$6 = list;
                    applicationStateFactoryImpl$createSyncApplicationState$1.label = 1;
                    Object g = this.h.g(applicationStateFactoryImpl$createSyncApplicationState$1);
                    if (g != coroutineSingletons) {
                        lk6Var2 = lk6Var;
                        obj = g;
                        str3 = str;
                        list2 = list;
                        action2 = action;
                        str4 = str2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        list5 = (List) applicationStateFactoryImpl$createSyncApplicationState$1.L$8;
                        List list16 = (List) applicationStateFactoryImpl$createSyncApplicationState$1.L$7;
                        List list17 = (List) applicationStateFactoryImpl$createSyncApplicationState$1.L$6;
                        String str11 = (String) applicationStateFactoryImpl$createSyncApplicationState$1.L$5;
                        Map map6 = (Map) applicationStateFactoryImpl$createSyncApplicationState$1.L$4;
                        Float f6 = (Float) applicationStateFactoryImpl$createSyncApplicationState$1.L$3;
                        Action action5 = (Action) applicationStateFactoryImpl$createSyncApplicationState$1.L$2;
                        String str12 = (String) applicationStateFactoryImpl$createSyncApplicationState$1.L$1;
                        lk6 lk6Var5 = (lk6) applicationStateFactoryImpl$createSyncApplicationState$1.L$0;
                        kotlin.b.b(obj);
                        list3 = list16;
                        lk6Var3 = lk6Var5;
                        str5 = str12;
                        action3 = action5;
                        f3 = f6;
                        map3 = map6;
                        str6 = str11;
                        list4 = list17;
                        List list18 = (List) obj;
                        applicationStateFactoryImpl$createSyncApplicationState$1.L$0 = lk6Var3;
                        applicationStateFactoryImpl$createSyncApplicationState$1.L$1 = str5;
                        applicationStateFactoryImpl$createSyncApplicationState$1.L$2 = action3;
                        applicationStateFactoryImpl$createSyncApplicationState$1.L$3 = f3;
                        applicationStateFactoryImpl$createSyncApplicationState$1.L$4 = map3;
                        applicationStateFactoryImpl$createSyncApplicationState$1.L$5 = str6;
                        applicationStateFactoryImpl$createSyncApplicationState$1.L$6 = list4;
                        applicationStateFactoryImpl$createSyncApplicationState$1.L$7 = list3;
                        applicationStateFactoryImpl$createSyncApplicationState$1.L$8 = list5;
                        applicationStateFactoryImpl$createSyncApplicationState$1.L$9 = list18;
                        applicationStateFactoryImpl$createSyncApplicationState$1.label = 3;
                        a = this.m.a.a(applicationStateFactoryImpl$createSyncApplicationState$1);
                        if (a != coroutineSingletons) {
                            List list19 = list5;
                            list6 = list18;
                            obj = a;
                            list7 = list19;
                            List list20 = (List) obj;
                            if (lk6Var3 == null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 3) {
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list12 = (List) applicationStateFactoryImpl$createSyncApplicationState$1.L$10;
                        list6 = (List) applicationStateFactoryImpl$createSyncApplicationState$1.L$9;
                        list13 = (List) applicationStateFactoryImpl$createSyncApplicationState$1.L$8;
                        list14 = (List) applicationStateFactoryImpl$createSyncApplicationState$1.L$7;
                        list15 = (List) applicationStateFactoryImpl$createSyncApplicationState$1.L$6;
                        str9 = (String) applicationStateFactoryImpl$createSyncApplicationState$1.L$5;
                        map5 = (Map) applicationStateFactoryImpl$createSyncApplicationState$1.L$4;
                        f5 = (Float) applicationStateFactoryImpl$createSyncApplicationState$1.L$3;
                        action4 = (Action) applicationStateFactoryImpl$createSyncApplicationState$1.L$2;
                        str10 = (String) applicationStateFactoryImpl$createSyncApplicationState$1.L$1;
                        kotlin.b.b(obj);
                        lk6Var4 = (lk6) obj;
                        list8 = list12;
                        list9 = list13;
                        list11 = list14;
                        list10 = list15;
                        str7 = str9;
                        map4 = map5;
                        f4 = f5;
                        str8 = str10;
                        action3 = action4;
                        List list21 = list6;
                        if (str8 == null && (str8 = this.g.a()) == null) {
                            str8 = "";
                        }
                        String str13 = str8;
                        mk6 a2 = this.d.a();
                        fw2 fw2Var = (fw2) this.f.a.getValue();
                        hzkVar = this.j.a;
                        if (((k0b0) hzkVar.b).b()) {
                            LocationManager locationManager = (LocationManager) hzkVar.a;
                            WeakHashMap weakHashMap = androidx.core.location.j.a;
                        }
                        z = false;
                        boolean z2 = z;
                        boolean a3 = this.k.a();
                        hq0 hq0Var = this.n;
                        hq0Var.getClass();
                        Action action6 = Action.REDIRECT;
                        fe61 fe61Var = hq0Var.a;
                        fe61 fe61Var2 = action6 == action3 ? fe61Var : fe61Var != null ? new fe61(fe61Var.a, null, fe61Var.c) : null;
                        getClass();
                        return dai0.y(list11, list9, lk6Var4, str13, a2, fw2Var, z2, a3, f4, fe61Var2, ((kc00) this.o).a, list21, list8, map4, str7, list10);
                    }
                    list6 = (List) applicationStateFactoryImpl$createSyncApplicationState$1.L$9;
                    list7 = (List) applicationStateFactoryImpl$createSyncApplicationState$1.L$8;
                    list3 = (List) applicationStateFactoryImpl$createSyncApplicationState$1.L$7;
                    list4 = (List) applicationStateFactoryImpl$createSyncApplicationState$1.L$6;
                    str6 = (String) applicationStateFactoryImpl$createSyncApplicationState$1.L$5;
                    map3 = (Map) applicationStateFactoryImpl$createSyncApplicationState$1.L$4;
                    f3 = (Float) applicationStateFactoryImpl$createSyncApplicationState$1.L$3;
                    action3 = (Action) applicationStateFactoryImpl$createSyncApplicationState$1.L$2;
                    str5 = (String) applicationStateFactoryImpl$createSyncApplicationState$1.L$1;
                    lk6Var3 = (lk6) applicationStateFactoryImpl$createSyncApplicationState$1.L$0;
                    kotlin.b.b(obj);
                    List list202 = (List) obj;
                    if (lk6Var3 == null) {
                        list8 = list202;
                        lk6Var4 = lk6Var3;
                        list9 = list7;
                        list10 = list4;
                        str7 = str6;
                        map4 = map3;
                        f4 = f3;
                        str8 = str5;
                        list11 = list3;
                        List list212 = list6;
                        if (str8 == null) {
                        }
                        String str132 = str8;
                        mk6 a22 = this.d.a();
                        fw2 fw2Var2 = (fw2) this.f.a.getValue();
                        hzkVar = this.j.a;
                        if (((k0b0) hzkVar.b).b()) {
                        }
                        z = false;
                        boolean z22 = z;
                        boolean a32 = this.k.a();
                        hq0 hq0Var2 = this.n;
                        hq0Var2.getClass();
                        Action action62 = Action.REDIRECT;
                        fe61 fe61Var3 = hq0Var2.a;
                        if (action62 == action3) {
                        }
                        getClass();
                        return dai0.y(list11, list9, lk6Var4, str132, a22, fw2Var2, z22, a32, f4, fe61Var2, ((kc00) this.o).a, list212, list8, map4, str7, list10);
                    }
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$0 = null;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$1 = str5;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$2 = action3;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$3 = f3;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$4 = map3;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$5 = str6;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$6 = list4;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$7 = list3;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$8 = list7;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$9 = list6;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$10 = list202;
                    applicationStateFactoryImpl$createSyncApplicationState$1.label = 4;
                    Object a4 = this.e.a(applicationStateFactoryImpl$createSyncApplicationState$1);
                    if (a4 != coroutineSingletons) {
                        list12 = list202;
                        obj = a4;
                        list13 = list7;
                        list14 = list3;
                        list15 = list4;
                        str9 = str6;
                        map5 = map3;
                        f5 = f3;
                        action4 = action3;
                        str10 = str5;
                        lk6Var4 = (lk6) obj;
                        list8 = list12;
                        list9 = list13;
                        list11 = list14;
                        list10 = list15;
                        str7 = str9;
                        map4 = map5;
                        f4 = f5;
                        str8 = str10;
                        action3 = action4;
                        List list2122 = list6;
                        if (str8 == null) {
                            str8 = "";
                        }
                        String str1322 = str8;
                        mk6 a222 = this.d.a();
                        fw2 fw2Var22 = (fw2) this.f.a.getValue();
                        hzkVar = this.j.a;
                        if (((k0b0) hzkVar.b).b()) {
                        }
                        z = false;
                        boolean z222 = z;
                        boolean a322 = this.k.a();
                        hq0 hq0Var22 = this.n;
                        hq0Var22.getClass();
                        Action action622 = Action.REDIRECT;
                        fe61 fe61Var32 = hq0Var22.a;
                        if (action622 == action3) {
                        }
                        getClass();
                        return dai0.y(list11, list9, lk6Var4, str1322, a222, fw2Var22, z222, a322, f4, fe61Var2, ((kc00) this.o).a, list2122, list8, map4, str7, list10);
                    }
                    return coroutineSingletons;
                }
                list2 = (List) applicationStateFactoryImpl$createSyncApplicationState$1.L$6;
                str4 = (String) applicationStateFactoryImpl$createSyncApplicationState$1.L$5;
                Map map7 = (Map) applicationStateFactoryImpl$createSyncApplicationState$1.L$4;
                Float f7 = (Float) applicationStateFactoryImpl$createSyncApplicationState$1.L$3;
                action2 = (Action) applicationStateFactoryImpl$createSyncApplicationState$1.L$2;
                str3 = (String) applicationStateFactoryImpl$createSyncApplicationState$1.L$1;
                lk6Var2 = (lk6) applicationStateFactoryImpl$createSyncApplicationState$1.L$0;
                kotlin.b.b(obj);
                map2 = map7;
                f2 = f7;
                List list22 = (List) obj;
                ArrayList a5 = this.i.a();
                applicationStateFactoryImpl$createSyncApplicationState$1.L$0 = lk6Var2;
                applicationStateFactoryImpl$createSyncApplicationState$1.L$1 = str3;
                applicationStateFactoryImpl$createSyncApplicationState$1.L$2 = action2;
                applicationStateFactoryImpl$createSyncApplicationState$1.L$3 = f2;
                applicationStateFactoryImpl$createSyncApplicationState$1.L$4 = map2;
                applicationStateFactoryImpl$createSyncApplicationState$1.L$5 = str4;
                applicationStateFactoryImpl$createSyncApplicationState$1.L$6 = list2;
                applicationStateFactoryImpl$createSyncApplicationState$1.L$7 = list22;
                applicationStateFactoryImpl$createSyncApplicationState$1.L$8 = a5;
                applicationStateFactoryImpl$createSyncApplicationState$1.label = 2;
                b = this.l.b(applicationStateFactoryImpl$createSyncApplicationState$1);
                if (b != coroutineSingletons) {
                    list3 = list22;
                    obj = b;
                    Float f8 = f2;
                    list4 = list2;
                    list5 = a5;
                    str5 = str3;
                    f3 = f8;
                    Map map8 = map2;
                    str6 = str4;
                    lk6Var3 = lk6Var2;
                    action3 = action2;
                    map3 = map8;
                    List list182 = (List) obj;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$0 = lk6Var3;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$1 = str5;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$2 = action3;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$3 = f3;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$4 = map3;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$5 = str6;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$6 = list4;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$7 = list3;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$8 = list5;
                    applicationStateFactoryImpl$createSyncApplicationState$1.L$9 = list182;
                    applicationStateFactoryImpl$createSyncApplicationState$1.label = 3;
                    a = this.m.a.a(applicationStateFactoryImpl$createSyncApplicationState$1);
                    if (a != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        applicationStateFactoryImpl$createSyncApplicationState$1 = new ApplicationStateFactoryImpl$createSyncApplicationState$1(this, continuationImpl);
        Object obj2 = applicationStateFactoryImpl$createSyncApplicationState$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = applicationStateFactoryImpl$createSyncApplicationState$1.label;
        boolean z3 = true;
        if (i != 0) {
        }
        List list222 = (List) obj2;
        ArrayList a52 = this.i.a();
        applicationStateFactoryImpl$createSyncApplicationState$1.L$0 = lk6Var2;
        applicationStateFactoryImpl$createSyncApplicationState$1.L$1 = str3;
        applicationStateFactoryImpl$createSyncApplicationState$1.L$2 = action2;
        applicationStateFactoryImpl$createSyncApplicationState$1.L$3 = f2;
        applicationStateFactoryImpl$createSyncApplicationState$1.L$4 = map2;
        applicationStateFactoryImpl$createSyncApplicationState$1.L$5 = str4;
        applicationStateFactoryImpl$createSyncApplicationState$1.L$6 = list2;
        applicationStateFactoryImpl$createSyncApplicationState$1.L$7 = list222;
        applicationStateFactoryImpl$createSyncApplicationState$1.L$8 = a52;
        applicationStateFactoryImpl$createSyncApplicationState$1.label = 2;
        b = this.l.b(applicationStateFactoryImpl$createSyncApplicationState$1);
        if (b != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
