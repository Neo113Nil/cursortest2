package ru.yandex.taxi.banners.model;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.aev;
import defpackage.at4;
import defpackage.bvf0;
import defpackage.ctf0;
import defpackage.dsf0;
import defpackage.dt4;
import defpackage.dux0;
import defpackage.fb7;
import defpackage.fuc;
import defpackage.g050;
import defpackage.ga1;
import defpackage.gtq0;
import defpackage.hr4;
import defpackage.ike;
import defpackage.ir4;
import defpackage.isf0;
import defpackage.iuc;
import defpackage.iux0;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.k4o;
import defpackage.klf0;
import defpackage.ksq0;
import defpackage.l8x;
import defpackage.lei0;
import defpackage.lq2;
import defpackage.ltc;
import defpackage.md3;
import defpackage.mdh;
import defpackage.n9y0;
import defpackage.ny61;
import defpackage.pav;
import defpackage.puc;
import defpackage.qqy;
import defpackage.qu;
import defpackage.rcc;
import defpackage.scc;
import defpackage.shs;
import defpackage.sjh;
import defpackage.ssf0;
import defpackage.tbv;
import defpackage.tcc;
import defpackage.tg60;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vby0;
import defpackage.vez0;
import defpackage.xcc;
import defpackage.yk;
import defpackage.yu4;
import defpackage.zpf0;
import defpackage.zu4;
import defpackage.zy11;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import kotlin.Result;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.promotions.model.Promotion;
import ru.yandex.taxi.promotions.model.PromotionBackground;

/* loaded from: classes9.dex */
public final class d {
    public final tt2 a;
    public final e b;
    public final fuc c;
    public final int d;
    public final dsf0 e;
    public final klf0 f;
    public final zpf0 g;
    public final ltc h;
    public final ru.yandex.taxi.banners.cache.a i;
    public final ir4 j;
    public final ru.yandex.taxi.communications.d k;
    public final at4 l;
    public final pav m;
    public final ru.yandex.taxi.banners.data.remote.a n;
    public final vby0 o;
    public final puc p;
    public final lq2 q;
    public final fb7 r;
    public final b s;
    public final ike t;
    public final ConcurrentHashMap u;
    public final CopyOnWriteArrayList v;
    public final dt4 w;
    public final kotlinx.coroutines.sync.a x;

    public d(Context context, tt2 tt2Var, e eVar, fuc fucVar, int i, dsf0 dsf0Var, klf0 klf0Var, zpf0 zpf0Var, dux0 dux0Var, ltc ltcVar, ru.yandex.taxi.banners.cache.a aVar, ir4 ir4Var, ru.yandex.taxi.communications.d dVar, at4 at4Var, pav pavVar, ru.yandex.taxi.banners.data.remote.a aVar2, vby0 vby0Var, puc pucVar, lq2 lq2Var) {
        this.a = tt2Var;
        this.b = eVar;
        this.c = fucVar;
        this.d = i;
        this.e = dsf0Var;
        this.f = klf0Var;
        this.g = zpf0Var;
        this.h = ltcVar;
        this.i = aVar;
        this.j = ir4Var;
        this.k = dVar;
        this.l = at4Var;
        this.m = pavVar;
        this.n = aVar2;
        this.o = vby0Var;
        this.p = pucVar;
        this.q = lq2Var;
        fb7 fb7Var = new fb7(context);
        this.r = fb7Var;
        this.s = new b(tt2Var, fucVar, fb7Var, ltcVar);
        sjh sjhVar = uyj.a;
        this.t = bvf0.a(mdh.b.plus(jl40.a()));
        this.u = new ConcurrentHashMap();
        this.v = new CopyOnWriteArrayList();
        this.w = new dt4();
        this.x = gtq0.a();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:3|(8:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(4:18|19|20|21))(7:33|34|(4:36|(1:44)(1:40)|41|(2:43|28))|23|(1:26)|13|14)|22|23|(0)|26))|7|(0)(0)|22|23|(0)|26) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        if (ru.yandex.taxi.utils.a.e(r13, r1) == r2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x003b, code lost:
    
        r13 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(d dVar, String str, Promotion promotion, boolean z, ContinuationImpl continuationImpl) {
        BannersLoader$loadBannerImage$1 bannersLoader$loadBannerImage$1;
        int i;
        tbv e;
        pav pavVar = dVar.m;
        try {
            if (continuationImpl instanceof BannersLoader$loadBannerImage$1) {
                bannersLoader$loadBannerImage$1 = (BannersLoader$loadBannerImage$1) continuationImpl;
                int i2 = bannersLoader$loadBannerImage$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bannersLoader$loadBannerImage$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = bannersLoader$loadBannerImage$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bannersLoader$loadBannerImage$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (promotion instanceof tg60) {
                            com.yandex.go.image.domain.requests.e h = pavVar.h();
                            aev aevVar = h.d;
                            aevVar.c = (str == null || (e = vez0.e(str)) == null) ? null : vez0.S(e, h.a, h.c);
                            h.d = aevVar;
                            bannersLoader$loadBannerImage$1.L$0 = str;
                            bannersLoader$loadBannerImage$1.L$1 = promotion;
                            bannersLoader$loadBannerImage$1.Z$0 = z;
                            bannersLoader$loadBannerImage$1.label = 1;
                            obj = h.a(bannersLoader$loadBannerImage$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        if ((promotion instanceof tg60) || z) {
                            com.yandex.go.image.domain.requests.g gVar = (com.yandex.go.image.domain.requests.g) pavVar.e();
                            gVar.c(str);
                            gVar.g = z;
                            bannersLoader$loadBannerImage$1.L$0 = str;
                            bannersLoader$loadBannerImage$1.L$1 = null;
                            bannersLoader$loadBannerImage$1.Z$0 = z;
                            bannersLoader$loadBannerImage$1.label = 2;
                        }
                        return zy11.a;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        ((Result) obj).getClass();
                        return zy11.a;
                    }
                    z = bannersLoader$loadBannerImage$1.Z$0;
                    Promotion promotion2 = (Promotion) bannersLoader$loadBannerImage$1.L$1;
                    String str2 = (String) bannersLoader$loadBannerImage$1.L$0;
                    try {
                        kotlin.b.b(obj);
                        promotion = promotion2;
                        str = str2;
                    } catch (Throwable th) {
                        th = th;
                        str = str2;
                        iux0 iux0Var = (iux0) dVar.h;
                        iux0Var.getClass();
                        iux0Var.c("Error downloading media file", th, "Error downloading media file " + str, "CRITICAL");
                        return zy11.a;
                    }
                    ir4 ir4Var = dVar.j;
                    String absolutePath = ((File) obj).getAbsolutePath();
                    SharedPreferences.Editor edit = ir4Var.a.edit();
                    edit.putString(str, absolutePath);
                    edit.apply();
                    if (promotion instanceof tg60) {
                    }
                    com.yandex.go.image.domain.requests.g gVar2 = (com.yandex.go.image.domain.requests.g) pavVar.e();
                    gVar2.c(str);
                    gVar2.g = z;
                    bannersLoader$loadBannerImage$1.L$0 = str;
                    bannersLoader$loadBannerImage$1.L$1 = null;
                    bannersLoader$loadBannerImage$1.Z$0 = z;
                    bannersLoader$loadBannerImage$1.label = 2;
                }
            }
            if (i != 0) {
            }
            ir4 ir4Var2 = dVar.j;
            String absolutePath2 = ((File) obj).getAbsolutePath();
            SharedPreferences.Editor edit2 = ir4Var2.a.edit();
            edit2.putString(str, absolutePath2);
            edit2.apply();
            if (promotion instanceof tg60) {
            }
            com.yandex.go.image.domain.requests.g gVar22 = (com.yandex.go.image.domain.requests.g) pavVar.e();
            gVar22.c(str);
            gVar22.g = z;
            bannersLoader$loadBannerImage$1.L$0 = str;
            bannersLoader$loadBannerImage$1.L$1 = null;
            bannersLoader$loadBannerImage$1.Z$0 = z;
            bannersLoader$loadBannerImage$1.label = 2;
        } catch (CancellationException e2) {
            throw e2;
        }
        bannersLoader$loadBannerImage$1 = new BannersLoader$loadBannerImage$1(dVar, continuationImpl);
        Object obj2 = bannersLoader$loadBannerImage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersLoader$loadBannerImage$1.label;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(1:(2:13|14)(2:16|17))(3:18|19|20))(5:21|22|23|(2:25|26)|27))(3:28|29|30))(3:39|(2:41|(1:43))(2:44|(0)(1:27))|26)|31|(2:33|(2:35|26)(4:36|23|(0)|27))(2:37|38)))|49|6|7|(0)(0)|31|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[Catch: CancellationException -> 0x00f8, all -> 0x0109, TryCatch #2 {CancellationException -> 0x00f8, all -> 0x0109, blocks: (B:19:0x0059, B:22:0x006b, B:23:0x00d0, B:29:0x0079, B:31:0x00a5, B:33:0x00a9, B:37:0x00e4, B:38:0x00f7, B:41:0x0090), top: B:7:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4 A[Catch: CancellationException -> 0x00f8, all -> 0x0109, TryCatch #2 {CancellationException -> 0x00f8, all -> 0x0109, blocks: (B:19:0x0059, B:22:0x006b, B:23:0x00d0, B:29:0x0079, B:31:0x00a5, B:33:0x00a9, B:37:0x00e4, B:38:0x00f7, B:41:0x0090), top: B:7:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(d dVar, PromotionBackground promotionBackground, shs shsVar, ContinuationImpl continuationImpl) {
        BannersLoader$loadBannerVideo$1 bannersLoader$loadBannerVideo$1;
        int i;
        boolean contains;
        Object b;
        File file;
        PromotionBackground promotionBackground2;
        boolean z;
        PromotionBackground promotionBackground3 = promotionBackground;
        shs shsVar2 = shsVar;
        ir4 ir4Var = dVar.j;
        if (continuationImpl instanceof BannersLoader$loadBannerVideo$1) {
            bannersLoader$loadBannerVideo$1 = (BannersLoader$loadBannerVideo$1) continuationImpl;
            int i2 = bannersLoader$loadBannerVideo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersLoader$loadBannerVideo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bannersLoader$loadBannerVideo$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersLoader$loadBannerVideo$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    contains = ir4Var.a.contains(promotionBackground3.b);
                    if (contains) {
                        bannersLoader$loadBannerVideo$1.L$0 = null;
                        bannersLoader$loadBannerVideo$1.L$1 = null;
                        bannersLoader$loadBannerVideo$1.Z$0 = contains;
                        bannersLoader$loadBannerVideo$1.label = 4;
                        if (dVar.e(shsVar2, promotionBackground3, bannersLoader$loadBannerVideo$1) != obj2) {
                            return zy11Var;
                        }
                    } else {
                        b bVar = dVar.s;
                        String str = shsVar2.b;
                        String str2 = promotionBackground3.b;
                        bannersLoader$loadBannerVideo$1.L$0 = promotionBackground3;
                        bannersLoader$loadBannerVideo$1.L$1 = shsVar2;
                        bannersLoader$loadBannerVideo$1.Z$0 = contains;
                        bannersLoader$loadBannerVideo$1.label = 1;
                        b = bVar.b(str, str2, bannersLoader$loadBannerVideo$1);
                        if (b == obj2) {
                        }
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        if (i != 4) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    z = bannersLoader$loadBannerVideo$1.Z$0;
                    shsVar2 = (shs) bannersLoader$loadBannerVideo$1.L$1;
                    promotionBackground2 = (PromotionBackground) bannersLoader$loadBannerVideo$1.L$0;
                    kotlin.b.b(obj);
                    dVar.c(shsVar2);
                    bannersLoader$loadBannerVideo$1.L$0 = null;
                    bannersLoader$loadBannerVideo$1.L$1 = null;
                    bannersLoader$loadBannerVideo$1.L$2 = null;
                    bannersLoader$loadBannerVideo$1.Z$0 = z;
                    bannersLoader$loadBannerVideo$1.label = 3;
                    if (dVar.e(shsVar2, promotionBackground2, bannersLoader$loadBannerVideo$1) == obj2) {
                        return obj2;
                    }
                    return zy11Var;
                }
                boolean z2 = bannersLoader$loadBannerVideo$1.Z$0;
                shsVar2 = (shs) bannersLoader$loadBannerVideo$1.L$1;
                PromotionBackground promotionBackground4 = (PromotionBackground) bannersLoader$loadBannerVideo$1.L$0;
                kotlin.b.b(obj);
                contains = z2;
                promotionBackground3 = promotionBackground4;
                b = obj;
                file = (File) b;
                if (file != null) {
                    throw new IllegalStateException("Unable to download or cache video. Url: " + promotionBackground3.b);
                }
                String str3 = promotionBackground3.b;
                String absolutePath = file.getAbsolutePath();
                SharedPreferences.Editor edit = ir4Var.a.edit();
                edit.putString(str3, absolutePath);
                edit.apply();
                e eVar = dVar.b;
                bannersLoader$loadBannerVideo$1.L$0 = promotionBackground3;
                bannersLoader$loadBannerVideo$1.L$1 = shsVar2;
                bannersLoader$loadBannerVideo$1.L$2 = null;
                bannersLoader$loadBannerVideo$1.Z$0 = contains;
                bannersLoader$loadBannerVideo$1.label = 2;
                if (eVar.d(shsVar2, bannersLoader$loadBannerVideo$1) == obj2) {
                    return obj2;
                }
                promotionBackground2 = promotionBackground3;
                z = contains;
                dVar.c(shsVar2);
                bannersLoader$loadBannerVideo$1.L$0 = null;
                bannersLoader$loadBannerVideo$1.L$1 = null;
                bannersLoader$loadBannerVideo$1.L$2 = null;
                bannersLoader$loadBannerVideo$1.Z$0 = z;
                bannersLoader$loadBannerVideo$1.label = 3;
                if (dVar.e(shsVar2, promotionBackground2, bannersLoader$loadBannerVideo$1) == obj2) {
                }
                return zy11Var;
            }
        }
        bannersLoader$loadBannerVideo$1 = new BannersLoader$loadBannerVideo$1(dVar, continuationImpl);
        Object obj3 = bannersLoader$loadBannerVideo$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersLoader$loadBannerVideo$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        file = (File) b;
        if (file != null) {
        }
    }

    public final void c(Promotion promotion) {
        if (this.l.b(promotion)) {
            dt4 dt4Var = this.w;
            String b = promotion.getB();
            synchronized (dt4Var) {
                if (dt4Var.a.contains(b)) {
                    dt4Var.a.remove(b);
                    n9y0 n9y0Var = (n9y0) this.f;
                    n9y0Var.getClass();
                    n9y0Var.b("FS_ENABLED", promotion, true).m();
                    Iterator it = this.v.iterator();
                    while (it.hasNext()) {
                        ((Consumer) it.next()).accept(promotion);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bf, code lost:
    
        if (r9 == r3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, ContinuationImpl continuationImpl) {
        BannersLoader$createPromotionsParam$1 bannersLoader$createPromotionsParam$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        List list;
        String str3;
        String str4;
        Object b;
        Object a;
        String str5;
        String str6;
        String str7;
        List g;
        Object a2;
        String str8;
        List list2;
        jsq0 jsq0Var;
        String str9;
        List list3;
        String str10;
        int i2;
        String str11;
        if (continuationImpl instanceof BannersLoader$createPromotionsParam$1) {
            bannersLoader$createPromotionsParam$1 = (BannersLoader$createPromotionsParam$1) continuationImpl;
            int i3 = bannersLoader$createPromotionsParam$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bannersLoader$createPromotionsParam$1.label = i3 - Integer.MIN_VALUE;
                Object obj = bannersLoader$createPromotionsParam$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersLoader$createPromotionsParam$1.label;
                vby0 vby0Var = this.o;
                if (i != 0) {
                    kotlin.b.b(obj);
                    List J0 = kotlin.collections.a.J0(this.p.a);
                    list = J0.isEmpty() ? null : J0;
                    str3 = str;
                    bannersLoader$createPromotionsParam$1.L$0 = str3;
                    str4 = str2;
                    bannersLoader$createPromotionsParam$1.L$1 = str4;
                    bannersLoader$createPromotionsParam$1.L$2 = list;
                    bannersLoader$createPromotionsParam$1.label = 1;
                    b = ((com.yandex.go.ultima_mode.domain.c) vby0Var.a).b(bannersLoader$createPromotionsParam$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            int i4 = bannersLoader$createPromotionsParam$1.I$0;
                            List list4 = (List) bannersLoader$createPromotionsParam$1.L$7;
                            jsq0 jsq0Var2 = (jsq0) bannersLoader$createPromotionsParam$1.L$6;
                            g = (List) bannersLoader$createPromotionsParam$1.L$5;
                            String str12 = (String) bannersLoader$createPromotionsParam$1.L$4;
                            String str13 = (String) bannersLoader$createPromotionsParam$1.L$3;
                            List list5 = (List) bannersLoader$createPromotionsParam$1.L$2;
                            String str14 = (String) bannersLoader$createPromotionsParam$1.L$1;
                            String str15 = (String) bannersLoader$createPromotionsParam$1.L$0;
                            kotlin.b.b(obj);
                            list2 = list5;
                            str9 = str13;
                            list3 = list4;
                            str10 = str14;
                            str11 = str12;
                            jsq0Var = jsq0Var2;
                            i2 = i4;
                            str8 = str15;
                            lq2 lq2Var = this.q;
                            return new ssf0(str8, str10, i2, g, jsq0Var, list3, str9, str11, (iuc) obj, Integer.valueOf(lq2Var.a.b()), lq2Var.a.c().getTitle(), list2, 8);
                        }
                        str7 = (String) bannersLoader$createPromotionsParam$1.L$3;
                        list = (List) bannersLoader$createPromotionsParam$1.L$2;
                        String str16 = (String) bannersLoader$createPromotionsParam$1.L$1;
                        str5 = (String) bannersLoader$createPromotionsParam$1.L$0;
                        kotlin.b.b(obj);
                        str6 = str16;
                        List list6 = list;
                        String str17 = (String) obj;
                        g = scc.g("close_button", "menu_burger", "switch_button", "arrow_button", "link", "action_button");
                        k4o b2 = PromotionBackground.Type.b();
                        jsq0 jsq0Var3 = ksq0.a;
                        jsq0 jsq0Var4 = new jsq0(b2);
                        List singletonList = Collections.singletonList("animation");
                        bannersLoader$createPromotionsParam$1.L$0 = str5;
                        bannersLoader$createPromotionsParam$1.L$1 = str6;
                        bannersLoader$createPromotionsParam$1.L$2 = list6;
                        bannersLoader$createPromotionsParam$1.L$3 = str7;
                        bannersLoader$createPromotionsParam$1.L$4 = str17;
                        bannersLoader$createPromotionsParam$1.L$5 = g;
                        bannersLoader$createPromotionsParam$1.L$6 = jsq0Var4;
                        bannersLoader$createPromotionsParam$1.L$7 = singletonList;
                        int i5 = this.d;
                        bannersLoader$createPromotionsParam$1.I$0 = i5;
                        bannersLoader$createPromotionsParam$1.label = 3;
                        a2 = this.k.a(bannersLoader$createPromotionsParam$1);
                        if (a2 != coroutineSingletons) {
                            str8 = str5;
                            list2 = list6;
                            jsq0Var = jsq0Var4;
                            str9 = str7;
                            list3 = singletonList;
                            str10 = str6;
                            i2 = i5;
                            str11 = str17;
                            obj = a2;
                            lq2 lq2Var2 = this.q;
                            return new ssf0(str8, str10, i2, g, jsq0Var, list3, str9, str11, (iuc) obj, Integer.valueOf(lq2Var2.a.b()), lq2Var2.a.c().getTitle(), list2, 8);
                        }
                        return coroutineSingletons;
                    }
                    List list7 = (List) bannersLoader$createPromotionsParam$1.L$2;
                    String str18 = (String) bannersLoader$createPromotionsParam$1.L$1;
                    String str19 = (String) bannersLoader$createPromotionsParam$1.L$0;
                    kotlin.b.b(obj);
                    b = obj;
                    str3 = str19;
                    list = list7;
                    str4 = str18;
                }
                String str20 = (String) b;
                bannersLoader$createPromotionsParam$1.L$0 = str3;
                bannersLoader$createPromotionsParam$1.L$1 = str4;
                bannersLoader$createPromotionsParam$1.L$2 = list;
                bannersLoader$createPromotionsParam$1.L$3 = str20;
                bannersLoader$createPromotionsParam$1.label = 2;
                a = ((com.yandex.go.ultima_mode.domain.c) vby0Var.a).a(bannersLoader$createPromotionsParam$1);
                if (a != coroutineSingletons) {
                    str5 = str3;
                    str6 = str4;
                    obj = a;
                    str7 = str20;
                    List list62 = list;
                    String str172 = (String) obj;
                    g = scc.g("close_button", "menu_burger", "switch_button", "arrow_button", "link", "action_button");
                    k4o b22 = PromotionBackground.Type.b();
                    jsq0 jsq0Var32 = ksq0.a;
                    jsq0 jsq0Var42 = new jsq0(b22);
                    List singletonList2 = Collections.singletonList("animation");
                    bannersLoader$createPromotionsParam$1.L$0 = str5;
                    bannersLoader$createPromotionsParam$1.L$1 = str6;
                    bannersLoader$createPromotionsParam$1.L$2 = list62;
                    bannersLoader$createPromotionsParam$1.L$3 = str7;
                    bannersLoader$createPromotionsParam$1.L$4 = str172;
                    bannersLoader$createPromotionsParam$1.L$5 = g;
                    bannersLoader$createPromotionsParam$1.L$6 = jsq0Var42;
                    bannersLoader$createPromotionsParam$1.L$7 = singletonList2;
                    int i52 = this.d;
                    bannersLoader$createPromotionsParam$1.I$0 = i52;
                    bannersLoader$createPromotionsParam$1.label = 3;
                    a2 = this.k.a(bannersLoader$createPromotionsParam$1);
                    if (a2 != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
        }
        bannersLoader$createPromotionsParam$1 = new BannersLoader$createPromotionsParam$1(this, continuationImpl);
        Object obj2 = bannersLoader$createPromotionsParam$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersLoader$createPromotionsParam$1.label;
        vby0 vby0Var2 = this.o;
        if (i != 0) {
        }
        String str202 = (String) b;
        bannersLoader$createPromotionsParam$1.L$0 = str3;
        bannersLoader$createPromotionsParam$1.L$1 = str4;
        bannersLoader$createPromotionsParam$1.L$2 = list;
        bannersLoader$createPromotionsParam$1.L$3 = str202;
        bannersLoader$createPromotionsParam$1.label = 2;
        a = ((com.yandex.go.ultima_mode.domain.c) vby0Var2.a).a(bannersLoader$createPromotionsParam$1);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cf, code lost:
    
        if (r12.d(r11, r0) != r1) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b1 A[Catch: all -> 0x003f, CancellationException -> 0x00ed, TryCatch #0 {CancellationException -> 0x00ed, blocks: (B:12:0x003a, B:13:0x00d2, B:20:0x0056, B:22:0x00a9, B:24:0x00b1, B:25:0x00bd, B:42:0x0084, B:44:0x008a, B:47:0x00d6, B:48:0x00dd), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0084 A[Catch: all -> 0x003f, CancellationException -> 0x00ed, TRY_ENTER, TryCatch #0 {CancellationException -> 0x00ed, blocks: (B:12:0x003a, B:13:0x00d2, B:20:0x0056, B:22:0x00a9, B:24:0x00b1, B:25:0x00bd, B:42:0x0084, B:44:0x008a, B:47:0x00d6, B:48:0x00dd), top: B:7:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(shs shsVar, PromotionBackground promotionBackground, ContinuationImpl continuationImpl) {
        BannersLoader$createVideoPreview$1 bannersLoader$createVideoPreview$1;
        int i;
        int i2;
        Object k0;
        String a;
        try {
            try {
                if (continuationImpl instanceof BannersLoader$createVideoPreview$1) {
                    bannersLoader$createVideoPreview$1 = (BannersLoader$createVideoPreview$1) continuationImpl;
                    int i3 = bannersLoader$createVideoPreview$1.label;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        bannersLoader$createVideoPreview$1.label = i3 - Integer.MIN_VALUE;
                        Object obj = bannersLoader$createVideoPreview$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = bannersLoader$createVideoPreview$1.label;
                        ir4 ir4Var = this.j;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            String a2 = promotionBackground.a();
                            if (a2 != null) {
                                String a3 = hr4.a(ir4Var, a2);
                                if (a3 == null ? false : new File(a3).exists()) {
                                    i2 = 1;
                                    if (i2 == 0) {
                                        return shsVar;
                                    }
                                    String c = hr4.c(promotionBackground, ir4Var);
                                    if (c == null) {
                                        throw new IllegalStateException("Missed video url");
                                    }
                                    bannersLoader$createVideoPreview$1.L$0 = shsVar;
                                    bannersLoader$createVideoPreview$1.L$1 = promotionBackground;
                                    bannersLoader$createVideoPreview$1.L$2 = null;
                                    bannersLoader$createVideoPreview$1.I$0 = i2;
                                    bannersLoader$createVideoPreview$1.label = 1;
                                    this.a.getClass();
                                    sjh sjhVar = uyj.a;
                                    k0 = tje.k0(mdh.b, new BannersLoader$createVideoPreview$5(c, this, shsVar, null), bannersLoader$createVideoPreview$1);
                                    if (k0 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            }
                            i2 = 0;
                            if (i2 == 0) {
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                shsVar = (shs) bannersLoader$createVideoPreview$1.L$0;
                                kotlin.b.b(obj);
                                c(shsVar);
                                return shsVar;
                            }
                            int i4 = bannersLoader$createVideoPreview$1.I$0;
                            promotionBackground = (PromotionBackground) bannersLoader$createVideoPreview$1.L$1;
                            shs shsVar2 = (shs) bannersLoader$createVideoPreview$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                i2 = i4;
                                shsVar = shsVar2;
                                k0 = obj;
                            } catch (Throwable th) {
                                th = th;
                                shsVar = shsVar2;
                                iux0 iux0Var = (iux0) this.h;
                                iux0Var.getClass();
                                iux0Var.c("Couldn't generate video preview", th, "Couldn't generate video preview", new String[0]);
                                return shsVar;
                            }
                        }
                        String str = (String) k0;
                        a = promotionBackground.a();
                        if (a != null) {
                            SharedPreferences.Editor edit = ir4Var.a.edit();
                            edit.putString(a, str);
                            edit.apply();
                        }
                        e eVar = this.b;
                        bannersLoader$createVideoPreview$1.L$0 = shsVar;
                        bannersLoader$createVideoPreview$1.L$1 = null;
                        bannersLoader$createVideoPreview$1.L$2 = null;
                        bannersLoader$createVideoPreview$1.L$3 = null;
                        bannersLoader$createVideoPreview$1.I$0 = i2;
                        bannersLoader$createVideoPreview$1.label = 2;
                    }
                }
                if (i != 0) {
                }
                String str2 = (String) k0;
                a = promotionBackground.a();
                if (a != null) {
                }
                e eVar2 = this.b;
                bannersLoader$createVideoPreview$1.L$0 = shsVar;
                bannersLoader$createVideoPreview$1.L$1 = null;
                bannersLoader$createVideoPreview$1.L$2 = null;
                bannersLoader$createVideoPreview$1.L$3 = null;
                bannersLoader$createVideoPreview$1.I$0 = i2;
                bannersLoader$createVideoPreview$1.label = 2;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        bannersLoader$createVideoPreview$1 = new BannersLoader$createVideoPreview$1(this, continuationImpl);
        Object obj2 = bannersLoader$createVideoPreview$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersLoader$createVideoPreview$1.label;
        ir4 ir4Var2 = this.j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
    
        if (((defpackage.l8x) r8).u0(r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005d, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Promotion promotion, ContinuationImpl continuationImpl) {
        BannersLoader$downloadBannerFiles$1 bannersLoader$downloadBannerFiles$1;
        int i;
        Promotion promotion2;
        if (continuationImpl instanceof BannersLoader$downloadBannerFiles$1) {
            bannersLoader$downloadBannerFiles$1 = (BannersLoader$downloadBannerFiles$1) continuationImpl;
            int i2 = bannersLoader$downloadBannerFiles$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersLoader$downloadBannerFiles$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bannersLoader$downloadBannerFiles$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersLoader$downloadBannerFiles$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.l.b(promotion)) {
                        return promotion;
                    }
                    bannersLoader$downloadBannerFiles$1.L$0 = promotion;
                    bannersLoader$downloadBannerFiles$1.label = 1;
                    obj = k(promotion, false, bannersLoader$downloadBannerFiles$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            promotion2 = (Promotion) bannersLoader$downloadBannerFiles$1.L$0;
                            kotlin.b.b(obj);
                            Promotion promotion3 = (Promotion) obj;
                            return promotion3 != null ? promotion2 : promotion3;
                        }
                        promotion = (Promotion) bannersLoader$downloadBannerFiles$1.L$0;
                        kotlin.b.b(obj);
                        String b = promotion.getB();
                        bannersLoader$downloadBannerFiles$1.L$0 = promotion;
                        bannersLoader$downloadBannerFiles$1.label = 3;
                        obj = this.b.a(b, bannersLoader$downloadBannerFiles$1);
                        if (obj != obj2) {
                            promotion2 = promotion;
                            Promotion promotion32 = (Promotion) obj;
                            if (promotion32 != null) {
                            }
                        }
                        return obj2;
                    }
                    promotion = (Promotion) bannersLoader$downloadBannerFiles$1.L$0;
                    kotlin.b.b(obj);
                }
                bannersLoader$downloadBannerFiles$1.L$0 = promotion;
                bannersLoader$downloadBannerFiles$1.label = 2;
            }
        }
        bannersLoader$downloadBannerFiles$1 = new BannersLoader$downloadBannerFiles$1(this, continuationImpl);
        Object obj3 = bannersLoader$downloadBannerFiles$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersLoader$downloadBannerFiles$1.label;
        if (i != 0) {
        }
        bannersLoader$downloadBannerFiles$1.L$0 = promotion;
        bannersLoader$downloadBannerFiles$1.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r10 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, ctf0 ctf0Var, ContinuationImpl continuationImpl) {
        BannersLoader$fetchPromotions$1 bannersLoader$fetchPromotions$1;
        Object obj;
        Object obj2;
        int i;
        ctf0 ctf0Var2;
        if (continuationImpl instanceof BannersLoader$fetchPromotions$1) {
            bannersLoader$fetchPromotions$1 = (BannersLoader$fetchPromotions$1) continuationImpl;
            int i2 = bannersLoader$fetchPromotions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersLoader$fetchPromotions$1.label = i2 - Integer.MIN_VALUE;
                obj = bannersLoader$fetchPromotions$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersLoader$fetchPromotions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bannersLoader$fetchPromotions$1.L$0 = null;
                    bannersLoader$fetchPromotions$1.L$1 = ctf0Var;
                    bannersLoader$fetchPromotions$1.label = 1;
                    obj = d(str, null, bannersLoader$fetchPromotions$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            isf0 isf0Var = (isf0) bannersLoader$fetchPromotions$1.L$3;
                            kotlin.b.b(obj);
                            return isf0Var;
                        }
                        ctf0Var2 = (ctf0) bannersLoader$fetchPromotions$1.L$1;
                        kotlin.b.b(obj);
                        isf0 isf0Var2 = (isf0) obj;
                        bannersLoader$fetchPromotions$1.L$0 = null;
                        bannersLoader$fetchPromotions$1.L$1 = null;
                        bannersLoader$fetchPromotions$1.L$2 = null;
                        bannersLoader$fetchPromotions$1.L$3 = isf0Var2;
                        bannersLoader$fetchPromotions$1.label = 3;
                        return j(isf0Var2, ctf0Var2, bannersLoader$fetchPromotions$1) != obj2 ? obj2 : isf0Var2;
                    }
                    ctf0Var = (ctf0) bannersLoader$fetchPromotions$1.L$1;
                    kotlin.b.b(obj);
                }
                bannersLoader$fetchPromotions$1.L$0 = null;
                bannersLoader$fetchPromotions$1.L$1 = ctf0Var;
                bannersLoader$fetchPromotions$1.L$2 = null;
                bannersLoader$fetchPromotions$1.label = 2;
                obj = ((ru.yandex.taxi.communications.common.repository.a) this.c).c((ssf0) obj, bannersLoader$fetchPromotions$1);
                if (obj != obj2) {
                    ctf0Var2 = ctf0Var;
                    isf0 isf0Var22 = (isf0) obj;
                    bannersLoader$fetchPromotions$1.L$0 = null;
                    bannersLoader$fetchPromotions$1.L$1 = null;
                    bannersLoader$fetchPromotions$1.L$2 = null;
                    bannersLoader$fetchPromotions$1.L$3 = isf0Var22;
                    bannersLoader$fetchPromotions$1.label = 3;
                    if (j(isf0Var22, ctf0Var2, bannersLoader$fetchPromotions$1) != obj2) {
                    }
                }
            }
        }
        bannersLoader$fetchPromotions$1 = new BannersLoader$fetchPromotions$1(this, continuationImpl);
        obj = bannersLoader$fetchPromotions$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersLoader$fetchPromotions$1.label;
        if (i != 0) {
        }
        bannersLoader$fetchPromotions$1.L$0 = null;
        bannersLoader$fetchPromotions$1.L$1 = ctf0Var;
        bannersLoader$fetchPromotions$1.L$2 = null;
        bannersLoader$fetchPromotions$1.label = 2;
        obj = ((ru.yandex.taxi.communications.common.repository.a) this.c).c((ssf0) obj, bannersLoader$fetchPromotions$1);
        if (obj != obj2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, ctf0 ctf0Var, ContinuationImpl continuationImpl) {
        BannersLoader$getBannerFromServer$1 bannersLoader$getBannerFromServer$1;
        int i;
        if (continuationImpl instanceof BannersLoader$getBannerFromServer$1) {
            bannersLoader$getBannerFromServer$1 = (BannersLoader$getBannerFromServer$1) continuationImpl;
            int i2 = bannersLoader$getBannerFromServer$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersLoader$getBannerFromServer$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bannersLoader$getBannerFromServer$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersLoader$getBannerFromServer$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    BannersLoader$getBannerFromServer$2 bannersLoader$getBannerFromServer$2 = new BannersLoader$getBannerFromServer$2(this, str, ctf0Var, null);
                    bannersLoader$getBannerFromServer$1.L$0 = null;
                    bannersLoader$getBannerFromServer$1.L$1 = null;
                    bannersLoader$getBannerFromServer$1.label = 1;
                    obj = tje.k0(mdhVar, bannersLoader$getBannerFromServer$2, bannersLoader$getBannerFromServer$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        bannersLoader$getBannerFromServer$1 = new BannersLoader$getBannerFromServer$1(this, continuationImpl);
        Object obj2 = bannersLoader$getBannerFromServer$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersLoader$getBannerFromServer$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
    
        if (r11 != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bb, code lost:
    
        if (r9 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
    
        if (r11 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, ctf0 ctf0Var, ContinuationImpl continuationImpl) {
        BannersLoader$getOrDownloadBanner$1 bannersLoader$getOrDownloadBanner$1;
        int i;
        Promotion promotion;
        String str2;
        Promotion promotion2;
        Object h;
        try {
            if (continuationImpl instanceof BannersLoader$getOrDownloadBanner$1) {
                bannersLoader$getOrDownloadBanner$1 = (BannersLoader$getOrDownloadBanner$1) continuationImpl;
                int i2 = bannersLoader$getOrDownloadBanner$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bannersLoader$getOrDownloadBanner$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = bannersLoader$getOrDownloadBanner$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bannersLoader$getOrDownloadBanner$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        bannersLoader$getOrDownloadBanner$1.L$0 = str;
                        bannersLoader$getOrDownloadBanner$1.L$1 = ctf0Var;
                        bannersLoader$getOrDownloadBanner$1.label = 1;
                        obj = this.b.a(str, bannersLoader$getOrDownloadBanner$1);
                    } else if (i == 1) {
                        ctf0Var = (ctf0) bannersLoader$getOrDownloadBanner$1.L$1;
                        str = (String) bannersLoader$getOrDownloadBanner$1.L$0;
                        kotlin.b.b(obj);
                    } else if (i == 2) {
                        promotion2 = (Promotion) bannersLoader$getOrDownloadBanner$1.L$2;
                        ctf0Var = (ctf0) bannersLoader$getOrDownloadBanner$1.L$1;
                        str2 = (String) bannersLoader$getOrDownloadBanner$1.L$0;
                        kotlin.b.b(obj);
                        if (promotion2 == null) {
                            bannersLoader$getOrDownloadBanner$1.L$0 = null;
                            bannersLoader$getOrDownloadBanner$1.L$1 = null;
                            bannersLoader$getOrDownloadBanner$1.L$2 = null;
                            bannersLoader$getOrDownloadBanner$1.L$3 = null;
                            bannersLoader$getOrDownloadBanner$1.label = 3;
                            h = h(str2, ctf0Var, bannersLoader$getOrDownloadBanner$1);
                        }
                        bannersLoader$getOrDownloadBanner$1.L$0 = null;
                        bannersLoader$getOrDownloadBanner$1.L$1 = null;
                        bannersLoader$getOrDownloadBanner$1.L$2 = null;
                        bannersLoader$getOrDownloadBanner$1.L$3 = null;
                        bannersLoader$getOrDownloadBanner$1.label = 4;
                        obj = f(promotion2, bannersLoader$getOrDownloadBanner$1);
                    } else {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            if (this.l.b((Promotion) obj)) {
                                return (Promotion) obj;
                            }
                            throw new Exception("Couldn't load banner files");
                        }
                        kotlin.b.b(obj);
                        h = ((Result) obj).getValue();
                        Throwable a = Result.a(h);
                        if (a != null) {
                            return new Result.Failure(a);
                        }
                        promotion2 = (Promotion) h;
                        bannersLoader$getOrDownloadBanner$1.L$0 = null;
                        bannersLoader$getOrDownloadBanner$1.L$1 = null;
                        bannersLoader$getOrDownloadBanner$1.L$2 = null;
                        bannersLoader$getOrDownloadBanner$1.L$3 = null;
                        bannersLoader$getOrDownloadBanner$1.label = 4;
                        obj = f(promotion2, bannersLoader$getOrDownloadBanner$1);
                    }
                    promotion = (Promotion) obj;
                    if (promotion == null) {
                        bannersLoader$getOrDownloadBanner$1.L$0 = str;
                        bannersLoader$getOrDownloadBanner$1.L$1 = ctf0Var;
                        bannersLoader$getOrDownloadBanner$1.L$2 = promotion;
                        bannersLoader$getOrDownloadBanner$1.L$3 = null;
                        bannersLoader$getOrDownloadBanner$1.label = 2;
                        if (ctf0Var.a(promotion, bannersLoader$getOrDownloadBanner$1) != obj2) {
                            str2 = str;
                            promotion2 = promotion;
                        }
                        return obj2;
                    }
                    str2 = str;
                    promotion2 = null;
                    if (promotion2 == null) {
                    }
                    bannersLoader$getOrDownloadBanner$1.L$0 = null;
                    bannersLoader$getOrDownloadBanner$1.L$1 = null;
                    bannersLoader$getOrDownloadBanner$1.L$2 = null;
                    bannersLoader$getOrDownloadBanner$1.L$3 = null;
                    bannersLoader$getOrDownloadBanner$1.label = 4;
                    obj = f(promotion2, bannersLoader$getOrDownloadBanner$1);
                }
            }
            if (i != 0) {
            }
            promotion = (Promotion) obj;
            if (promotion == null) {
            }
            if (promotion2 == null) {
            }
            bannersLoader$getOrDownloadBanner$1.L$0 = null;
            bannersLoader$getOrDownloadBanner$1.L$1 = null;
            bannersLoader$getOrDownloadBanner$1.L$2 = null;
            bannersLoader$getOrDownloadBanner$1.L$3 = null;
            bannersLoader$getOrDownloadBanner$1.label = 4;
            obj = f(promotion2, bannersLoader$getOrDownloadBanner$1);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            return new Result.Failure(e2);
        }
        bannersLoader$getOrDownloadBanner$1 = new BannersLoader$getOrDownloadBanner$1(this, continuationImpl);
        Object obj3 = bannersLoader$getOrDownloadBanner$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersLoader$getOrDownloadBanner$1.label;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0114, code lost:
    
        if (r15 == r1) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0196 A[LOOP:3: B:63:0x0190->B:65:0x0196, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r12v0, types: [ru.yandex.taxi.banners.model.d] */
    /* JADX WARN: Type inference failed for: r13v23, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(isf0 isf0Var, ctf0 ctf0Var, ContinuationImpl continuationImpl) {
        BannersLoader$handlePromotions$1 bannersLoader$handlePromotions$1;
        int i;
        ListBuilder<Promotion> listBuilder;
        Iterator it;
        ctf0 ctf0Var2;
        Iterator it2;
        int i2;
        if (continuationImpl instanceof BannersLoader$handlePromotions$1) {
            bannersLoader$handlePromotions$1 = (BannersLoader$handlePromotions$1) continuationImpl;
            int i3 = bannersLoader$handlePromotions$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bannersLoader$handlePromotions$1.label = i3 - Integer.MIN_VALUE;
                Object obj = bannersLoader$handlePromotions$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersLoader$handlePromotions$1.label;
                int i4 = 0;
                int i5 = 2;
                int i6 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ListBuilder a = rcc.a();
                    a.addAll(isf0Var.a);
                    a.addAll(isf0Var.b);
                    a.addAll(isf0Var.c);
                    a.addAll(isf0Var.d);
                    a.addAll(isf0Var.e);
                    a.addAll(isf0Var.f);
                    a.removeIf(new md3(i6, new qu(8)));
                    ListIterator listIterator = a.listIterator(0);
                    while (true) {
                        qqy qqyVar = (qqy) listIterator;
                        if (!qqyVar.hasNext()) {
                            break;
                        }
                        Promotion promotion = (Promotion) qqyVar.next();
                        zpf0 zpf0Var = this.g;
                        zpf0Var.getClass();
                        Map c = promotion.getC();
                        if (c != null) {
                            ((com.yandex.go.analytics.realtime.a) zpf0Var.a).d(new lei0(zpf0.f(promotion), promotion.getB(), c));
                        }
                    }
                    SharedPreferences a2 = this.e.a();
                    Set<String> set = EmptySet.a;
                    Set<String> stringSet = a2.getStringSet("ru.yandex.taxi.PromotionsProvider.FIELD_WATCHED_PROMOTIONS_IDS", set);
                    if (stringSet != null) {
                        set = stringSet;
                    }
                    if (!set.isEmpty()) {
                        a.removeIf(new md3(i5, new zu4(set)));
                    }
                    xcc.q(a, new yu4(new yk(i6), i4));
                    ListBuilder j = a.j();
                    bannersLoader$handlePromotions$1.L$0 = null;
                    bannersLoader$handlePromotions$1.L$1 = ctf0Var;
                    bannersLoader$handlePromotions$1.L$2 = j;
                    bannersLoader$handlePromotions$1.label = 1;
                    Object i7 = this.i.i(j, bannersLoader$handlePromotions$1);
                    listBuilder = j;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = bannersLoader$handlePromotions$1.I$0;
                        it2 = (Iterator) bannersLoader$handlePromotions$1.L$3;
                        ctf0Var2 = (ctf0) bannersLoader$handlePromotions$1.L$1;
                        kotlin.b.b(obj);
                        while (it2.hasNext()) {
                            int i8 = i2 + 1;
                            Promotion promotion2 = (Promotion) it2.next();
                            boolean z = i2 == 0;
                            bannersLoader$handlePromotions$1.L$0 = null;
                            bannersLoader$handlePromotions$1.L$1 = ctf0Var2;
                            bannersLoader$handlePromotions$1.L$2 = null;
                            bannersLoader$handlePromotions$1.L$3 = it2;
                            bannersLoader$handlePromotions$1.L$4 = null;
                            bannersLoader$handlePromotions$1.I$0 = i8;
                            bannersLoader$handlePromotions$1.I$1 = i2;
                            bannersLoader$handlePromotions$1.label = 2;
                            if (m(promotion2, z, ctf0Var2, bannersLoader$handlePromotions$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            i2 = i8;
                        }
                        return zy11.a;
                    }
                    ?? r13 = (List) bannersLoader$handlePromotions$1.L$2;
                    ctf0Var = (ctf0) bannersLoader$handlePromotions$1.L$1;
                    kotlin.b.b(obj);
                    listBuilder = r13;
                }
                for (Promotion promotion3 : listBuilder) {
                    Set<String> d = promotion3.getD();
                    ArrayList arrayList = new ArrayList(tcc.n(d, 10));
                    for (String str : d) {
                        int hashCode = str.hashCode();
                        if (hashCode != -1479414442) {
                            if (hashCode != 1436111861) {
                                if (hashCode == 1609711746 && str.equals("taxi_on_the_way")) {
                                    str = "taxi_transporting";
                                }
                            } else if (str.equals("chargers")) {
                                str = "chargers_discovery";
                            }
                        } else if (str.equals("order_feedback")) {
                            str = "taxi_feedback";
                        }
                        arrayList.add(str);
                    }
                    promotion3.q(kotlin.collections.a.N0(arrayList));
                }
                it = listBuilder.iterator();
                while (it.hasNext()) {
                    ((Promotion) it.next()).p();
                }
                ctf0Var2 = ctf0Var;
                it2 = listBuilder.iterator();
                i2 = 0;
                while (it2.hasNext()) {
                }
                return zy11.a;
            }
        }
        bannersLoader$handlePromotions$1 = new BannersLoader$handlePromotions$1(this, continuationImpl);
        Object obj2 = bannersLoader$handlePromotions$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersLoader$handlePromotions$1.label;
        int i42 = 0;
        int i52 = 2;
        int i62 = 1;
        if (i != 0) {
        }
        while (r15.hasNext()) {
        }
        it = listBuilder.iterator();
        while (it.hasNext()) {
        }
        ctf0Var2 = ctf0Var;
        it2 = listBuilder.iterator();
        i2 = 0;
        while (it2.hasNext()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c A[Catch: all -> 0x0079, TRY_LEAVE, TryCatch #0 {all -> 0x0079, blocks: (B:11:0x0050, B:13:0x005c), top: B:10:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v3, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Promotion promotion, boolean z, ContinuationImpl continuationImpl) {
        BannersLoader$loadBannerMedia$1 bannersLoader$loadBannerMedia$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        l8x l8xVar;
        ConcurrentHashMap concurrentHashMap = this.u;
        try {
            if (continuationImpl instanceof BannersLoader$loadBannerMedia$1) {
                bannersLoader$loadBannerMedia$1 = (BannersLoader$loadBannerMedia$1) continuationImpl;
                int i2 = bannersLoader$loadBannerMedia$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bannersLoader$loadBannerMedia$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = bannersLoader$loadBannerMedia$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bannersLoader$loadBannerMedia$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        bannersLoader$loadBannerMedia$1.L$0 = promotion;
                        aVar = this.x;
                        bannersLoader$loadBannerMedia$1.L$1 = aVar;
                        bannersLoader$loadBannerMedia$1.Z$0 = z;
                        bannersLoader$loadBannerMedia$1.label = 1;
                        if (aVar.a(bannersLoader$loadBannerMedia$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = bannersLoader$loadBannerMedia$1.Z$0;
                        ?? r7 = (g050) bannersLoader$loadBannerMedia$1.L$1;
                        Promotion promotion2 = (Promotion) bannersLoader$loadBannerMedia$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r7;
                        promotion = promotion2;
                    }
                    l8xVar = (l8x) concurrentHashMap.get(promotion.getB());
                    if (l8xVar == null) {
                        l8xVar = tje.N(this.t, null, null, new BannersLoader$loadBannerFilesAndVideosJob$1(this, promotion, z, null), 3);
                        concurrentHashMap.put(promotion.getB(), l8xVar);
                        l8xVar.w(new ga1(2, this, promotion, l8xVar));
                    }
                    return l8xVar;
                }
            }
            l8xVar = (l8x) concurrentHashMap.get(promotion.getB());
            if (l8xVar == null) {
            }
            return l8xVar;
        } finally {
            aVar.d(null);
        }
        bannersLoader$loadBannerMedia$1 = new BannersLoader$loadBannerMedia$1(this, continuationImpl);
        Object obj2 = bannersLoader$loadBannerMedia$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersLoader$loadBannerMedia$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(shs shsVar, boolean z, ContinuationImpl continuationImpl) {
        BannersLoader$loadBannerVideos$1 bannersLoader$loadBannerVideos$1;
        int i;
        if (continuationImpl instanceof BannersLoader$loadBannerVideos$1) {
            bannersLoader$loadBannerVideos$1 = (BannersLoader$loadBannerVideos$1) continuationImpl;
            int i2 = bannersLoader$loadBannerVideos$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersLoader$loadBannerVideos$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bannersLoader$loadBannerVideos$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersLoader$loadBannerVideos$1.label;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    shs shsVar2 = (shs) bannersLoader$loadBannerVideos$1.L$0;
                    kotlin.b.b(obj);
                    return shsVar2;
                }
                kotlin.b.b(obj);
                BannersLoader$loadBannerVideos$2 bannersLoader$loadBannerVideos$2 = new BannersLoader$loadBannerVideos$2(shsVar, this, z, null);
                bannersLoader$loadBannerVideos$1.L$0 = shsVar;
                bannersLoader$loadBannerVideos$1.Z$0 = z;
                bannersLoader$loadBannerVideos$1.label = 1;
                return bvf0.n(bannersLoader$loadBannerVideos$2, bannersLoader$loadBannerVideos$1) == coroutineSingletons ? coroutineSingletons : shsVar;
            }
        }
        bannersLoader$loadBannerVideos$1 = new BannersLoader$loadBannerVideos$1(this, continuationImpl);
        Object obj2 = bannersLoader$loadBannerVideos$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersLoader$loadBannerVideos$1.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0111, code lost:
    
        if (k(r11, r12, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
    
        if (defpackage.tje.k0(r2, r6, r0) == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
    
        if (n(r14, r0) == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Promotion promotion, boolean z, ctf0 ctf0Var, ContinuationImpl continuationImpl) {
        BannersLoader$processBanner$1 bannersLoader$processBanner$1;
        Object obj;
        Object obj2;
        int i;
        Promotion promotion2;
        boolean z2;
        ctf0 ctf0Var2;
        Promotion promotion3;
        boolean z3;
        Promotion promotion4;
        dt4 dt4Var;
        if (continuationImpl instanceof BannersLoader$processBanner$1) {
            bannersLoader$processBanner$1 = (BannersLoader$processBanner$1) continuationImpl;
            int i2 = bannersLoader$processBanner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersLoader$processBanner$1.label = i2 - Integer.MIN_VALUE;
                obj = bannersLoader$processBanner$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersLoader$processBanner$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String b = promotion.getB();
                    bannersLoader$processBanner$1.L$0 = promotion;
                    bannersLoader$processBanner$1.L$1 = ctf0Var;
                    bannersLoader$processBanner$1.Z$0 = z;
                    bannersLoader$processBanner$1.label = 1;
                } else if (i == 1) {
                    z = bannersLoader$processBanner$1.Z$0;
                    ctf0Var = (ctf0) bannersLoader$processBanner$1.L$1;
                    promotion = (Promotion) bannersLoader$processBanner$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i == 2) {
                        z2 = bannersLoader$processBanner$1.Z$0;
                        ctf0Var2 = (ctf0) bannersLoader$processBanner$1.L$1;
                        promotion2 = (Promotion) bannersLoader$processBanner$1.L$0;
                        kotlin.b.b(obj);
                        promotion3 = (Promotion) obj;
                        if (promotion3 != null) {
                            this.a.getClass();
                            sjh sjhVar = uyj.a;
                            mdh mdhVar = mdh.b;
                            BannersLoader$processBanner$2 bannersLoader$processBanner$2 = new BannersLoader$processBanner$2(this, promotion3, promotion2, null);
                            bannersLoader$processBanner$1.L$0 = promotion2;
                            bannersLoader$processBanner$1.L$1 = ctf0Var2;
                            bannersLoader$processBanner$1.L$2 = null;
                            bannersLoader$processBanner$1.Z$0 = z2;
                            bannersLoader$processBanner$1.label = 3;
                        }
                        bannersLoader$processBanner$1.L$0 = promotion2;
                        bannersLoader$processBanner$1.L$1 = null;
                        bannersLoader$processBanner$1.L$2 = null;
                        bannersLoader$processBanner$1.Z$0 = z2;
                        bannersLoader$processBanner$1.label = 4;
                        if (ctf0Var2.a(promotion2, bannersLoader$processBanner$1) != obj2) {
                        }
                        return obj2;
                    }
                    if (i == 3) {
                        z2 = bannersLoader$processBanner$1.Z$0;
                        ctf0Var2 = (ctf0) bannersLoader$processBanner$1.L$1;
                        promotion2 = (Promotion) bannersLoader$processBanner$1.L$0;
                        kotlin.b.b(obj);
                        bannersLoader$processBanner$1.L$0 = promotion2;
                        bannersLoader$processBanner$1.L$1 = null;
                        bannersLoader$processBanner$1.L$2 = null;
                        bannersLoader$processBanner$1.Z$0 = z2;
                        bannersLoader$processBanner$1.label = 4;
                        if (ctf0Var2.a(promotion2, bannersLoader$processBanner$1) != obj2) {
                            z3 = z2;
                            promotion4 = promotion2;
                            dt4Var = this.w;
                            String b2 = promotion4.getB();
                            synchronized (dt4Var) {
                            }
                        }
                        return obj2;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        promotion4 = (Promotion) bannersLoader$processBanner$1.L$0;
                        kotlin.b.b(obj);
                        n9y0 n9y0Var = (n9y0) this.f;
                        n9y0Var.getClass();
                        n9y0Var.b("FS_RECEIVED", promotion4, true).m();
                        return zy11.a;
                    }
                    boolean z4 = bannersLoader$processBanner$1.Z$0;
                    Promotion promotion5 = (Promotion) bannersLoader$processBanner$1.L$0;
                    kotlin.b.b(obj);
                    z3 = z4;
                    promotion4 = promotion5;
                    dt4Var = this.w;
                    String b22 = promotion4.getB();
                    synchronized (dt4Var) {
                        dt4Var.a.add(b22);
                    }
                    c(promotion4);
                    bannersLoader$processBanner$1.L$0 = promotion4;
                    bannersLoader$processBanner$1.L$1 = null;
                    bannersLoader$processBanner$1.L$2 = null;
                    bannersLoader$processBanner$1.Z$0 = z3;
                    bannersLoader$processBanner$1.label = 5;
                }
                e eVar = this.b;
                String b3 = promotion.getB();
                bannersLoader$processBanner$1.L$0 = promotion;
                bannersLoader$processBanner$1.L$1 = ctf0Var;
                bannersLoader$processBanner$1.Z$0 = z;
                bannersLoader$processBanner$1.label = 2;
                obj = eVar.a(b3, bannersLoader$processBanner$1);
                if (obj != obj2) {
                    ctf0 ctf0Var3 = ctf0Var;
                    promotion2 = promotion;
                    z2 = z;
                    ctf0Var2 = ctf0Var3;
                    promotion3 = (Promotion) obj;
                    if (promotion3 != null) {
                    }
                    bannersLoader$processBanner$1.L$0 = promotion2;
                    bannersLoader$processBanner$1.L$1 = null;
                    bannersLoader$processBanner$1.L$2 = null;
                    bannersLoader$processBanner$1.Z$0 = z2;
                    bannersLoader$processBanner$1.label = 4;
                    if (ctf0Var2.a(promotion2, bannersLoader$processBanner$1) != obj2) {
                    }
                }
                return obj2;
            }
        }
        bannersLoader$processBanner$1 = new BannersLoader$processBanner$1(this, continuationImpl);
        obj = bannersLoader$processBanner$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersLoader$processBanner$1.label;
        if (i != 0) {
        }
        e eVar2 = this.b;
        String b32 = promotion.getB();
        bannersLoader$processBanner$1.L$0 = promotion;
        bannersLoader$processBanner$1.L$1 = ctf0Var;
        bannersLoader$processBanner$1.Z$0 = z;
        bannersLoader$processBanner$1.label = 2;
        obj = eVar2.a(b32, bannersLoader$processBanner$1);
        if (obj != obj2) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:11:0x004a, B:13:0x0052), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, ContinuationImpl continuationImpl) {
        BannersLoader$stopFileDownloadsFor$1 bannersLoader$stopFileDownloadsFor$1;
        int i;
        g050 g050Var;
        l8x l8xVar;
        ConcurrentHashMap concurrentHashMap = this.u;
        try {
            if (continuationImpl instanceof BannersLoader$stopFileDownloadsFor$1) {
                bannersLoader$stopFileDownloadsFor$1 = (BannersLoader$stopFileDownloadsFor$1) continuationImpl;
                int i2 = bannersLoader$stopFileDownloadsFor$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bannersLoader$stopFileDownloadsFor$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = bannersLoader$stopFileDownloadsFor$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bannersLoader$stopFileDownloadsFor$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        bannersLoader$stopFileDownloadsFor$1.L$0 = str;
                        g050Var = this.x;
                        bannersLoader$stopFileDownloadsFor$1.L$1 = g050Var;
                        bannersLoader$stopFileDownloadsFor$1.label = 1;
                        if (g050Var.a(bannersLoader$stopFileDownloadsFor$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g050Var = (g050) bannersLoader$stopFileDownloadsFor$1.L$1;
                        str = (String) bannersLoader$stopFileDownloadsFor$1.L$0;
                        kotlin.b.b(obj);
                    }
                    l8xVar = (l8x) concurrentHashMap.get(str);
                    if (l8xVar != null) {
                        l8xVar.a(null);
                    }
                    g050Var.d(null);
                    return zy11.a;
                }
            }
            l8xVar = (l8x) concurrentHashMap.get(str);
            if (l8xVar != null) {
            }
            g050Var.d(null);
            return zy11.a;
        } catch (Throwable th) {
            g050Var.d(null);
            throw th;
        }
        bannersLoader$stopFileDownloadsFor$1 = new BannersLoader$stopFileDownloadsFor$1(this, continuationImpl);
        Object obj2 = bannersLoader$stopFileDownloadsFor$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersLoader$stopFileDownloadsFor$1.label;
        if (i != 0) {
        }
    }
}
