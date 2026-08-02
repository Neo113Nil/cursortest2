package ru.yandex.taxi.banners.model;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.Lifecycle;
import defpackage.at4;
import defpackage.atc;
import defpackage.b7z0;
import defpackage.ctf0;
import defpackage.d7z0;
import defpackage.dsf0;
import defpackage.dxf0;
import defpackage.eja1;
import defpackage.evu0;
import defpackage.fb7;
import defpackage.fuc;
import defpackage.hux0;
import defpackage.isf0;
import defpackage.ltc;
import defpackage.n8s0;
import defpackage.ny61;
import defpackage.o9y0;
import defpackage.puc;
import defpackage.pzt0;
import defpackage.shs;
import defpackage.tcc;
import defpackage.tg60;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.usf0;
import defpackage.v4r0;
import defpackage.yk;
import defpackage.yu4;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes9.dex */
public final class h {
    public static final shs x = new shs(null, null, null, 4095);
    public final dxf0 a;
    public final b7z0 b;
    public final o9y0 c;
    public final hux0 d;
    public final dsf0 e;
    public final g f;
    public final d g;
    public final e h;
    public final ctf0 i;
    public final ltc j;
    public final usf0 k;
    public final at4 l;
    public final puc m;
    public final boolean n;
    public final CopyOnWriteArrayList o = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList p;
    public final b q;
    public tse r;
    public isf0 s;
    public String t;
    public boolean u;
    public pzt0 v;
    public String w;

    public h(dxf0 dxf0Var, b7z0 b7z0Var, o9y0 o9y0Var, hux0 hux0Var, dsf0 dsf0Var, g gVar, d dVar, e eVar, ru.yandex.taxi.banners.cache.a aVar, ltc ltcVar, fuc fucVar, tt2 tt2Var, Context context, usf0 usf0Var, at4 at4Var, puc pucVar, boolean z) {
        this.a = dxf0Var;
        this.b = b7z0Var;
        this.c = o9y0Var;
        this.d = hux0Var;
        this.e = dsf0Var;
        this.f = gVar;
        this.g = dVar;
        this.h = eVar;
        this.i = aVar;
        this.j = ltcVar;
        this.k = usf0Var;
        this.l = at4Var;
        this.m = pucVar;
        this.n = z;
        new CopyOnWriteArrayList();
        this.p = new CopyOnWriteArrayList();
        this.q = new b(tt2Var, fucVar, new fb7(context), ltcVar);
        this.w = "NO_CODE";
    }

    public static boolean a(h hVar, Promotion promotion, String str) {
        boolean after;
        List d;
        Calendar b = hVar.b.b();
        List d2 = promotion.getD();
        boolean z = d2 == null || d2.isEmpty() || !(str == null || str.length() == 0 || (d = promotion.getD()) == null || !d.contains(str));
        Promotion.Companion.getClass();
        Calendar f = promotion.getF();
        if (f == null) {
            after = false;
        } else {
            after = b.getTime().after(f.getTime());
            Calendar d3 = promotion.getD();
            if (after && d3 != null) {
                after = b.getTime().before(d3.getTime());
            }
        }
        return z && after && !hVar.e.b(promotion.getB()) && hVar.l.b(promotion);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Promotion promotion, ContinuationImpl continuationImpl) {
        PromotionsProvider$canShowGeoBanner$1 promotionsProvider$canShowGeoBanner$1;
        int i;
        if (continuationImpl instanceof PromotionsProvider$canShowGeoBanner$1) {
            promotionsProvider$canShowGeoBanner$1 = (PromotionsProvider$canShowGeoBanner$1) continuationImpl;
            int i2 = promotionsProvider$canShowGeoBanner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promotionsProvider$canShowGeoBanner$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promotionsProvider$canShowGeoBanner$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionsProvider$canShowGeoBanner$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String b = promotion.getB();
                    promotionsProvider$canShowGeoBanner$1.L$0 = promotion;
                    promotionsProvider$canShowGeoBanner$1.label = 1;
                    obj = this.f.e(b, promotionsProvider$canShowGeoBanner$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    promotion = (Promotion) promotionsProvider$canShowGeoBanner$1.L$0;
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf(!((Boolean) obj).booleanValue() && a(this, promotion, this.c.a.a()));
            }
        }
        promotionsProvider$canShowGeoBanner$1 = new PromotionsProvider$canShowGeoBanner$1(this, continuationImpl);
        Object obj2 = promotionsProvider$canShowGeoBanner$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsProvider$canShowGeoBanner$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!((Boolean) obj2).booleanValue() && a(this, promotion, this.c.a.a()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005a, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(String str, ContinuationImpl continuationImpl) {
        PromotionsProvider$getAllBannersForScreen$1 promotionsProvider$getAllBannersForScreen$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        Set set;
        Set set2;
        if (continuationImpl instanceof PromotionsProvider$getAllBannersForScreen$1) {
            promotionsProvider$getAllBannersForScreen$1 = (PromotionsProvider$getAllBannersForScreen$1) continuationImpl;
            int i2 = promotionsProvider$getAllBannersForScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promotionsProvider$getAllBannersForScreen$1.label = i2 - Integer.MIN_VALUE;
                obj = promotionsProvider$getAllBannersForScreen$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionsProvider$getAllBannersForScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    promotionsProvider$getAllBannersForScreen$1.L$0 = str;
                    promotionsProvider$getAllBannersForScreen$1.label = 1;
                    obj = this.f.d(str, promotionsProvider$getAllBannersForScreen$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        set = (Set) promotionsProvider$getAllBannersForScreen$1.L$4;
                        set2 = (Set) promotionsProvider$getAllBannersForScreen$1.L$2;
                        str2 = (String) promotionsProvider$getAllBannersForScreen$1.L$0;
                        kotlin.b.b(obj);
                        set.addAll(eja1.o(str2, (List) obj));
                        return ((SetBuilder) set2).b();
                    }
                    str = (String) promotionsProvider$getAllBannersForScreen$1.L$0;
                    kotlin.b.b(obj);
                }
                SetBuilder setBuilder = new SetBuilder();
                setBuilder.addAll((Set) obj);
                promotionsProvider$getAllBannersForScreen$1.L$0 = str;
                promotionsProvider$getAllBannersForScreen$1.L$1 = null;
                promotionsProvider$getAllBannersForScreen$1.L$2 = setBuilder;
                promotionsProvider$getAllBannersForScreen$1.L$3 = null;
                promotionsProvider$getAllBannersForScreen$1.L$4 = setBuilder;
                promotionsProvider$getAllBannersForScreen$1.label = 2;
                obj = this.i.h(promotionsProvider$getAllBannersForScreen$1);
                if (obj != coroutineSingletons) {
                    str2 = str;
                    set = setBuilder;
                    set2 = set;
                    set.addAll(eja1.o(str2, (List) obj));
                    return ((SetBuilder) set2).b();
                }
                return coroutineSingletons;
            }
        }
        promotionsProvider$getAllBannersForScreen$1 = new PromotionsProvider$getAllBannersForScreen$1(this, continuationImpl);
        obj = promotionsProvider$getAllBannersForScreen$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsProvider$getAllBannersForScreen$1.label;
        if (i != 0) {
        }
        SetBuilder setBuilder2 = new SetBuilder();
        setBuilder2.addAll((Set) obj);
        promotionsProvider$getAllBannersForScreen$1.L$0 = str;
        promotionsProvider$getAllBannersForScreen$1.L$1 = null;
        promotionsProvider$getAllBannersForScreen$1.L$2 = setBuilder2;
        promotionsProvider$getAllBannersForScreen$1.L$3 = null;
        promotionsProvider$getAllBannersForScreen$1.L$4 = setBuilder2;
        promotionsProvider$getAllBannersForScreen$1.label = 2;
        obj = this.i.h(promotionsProvider$getAllBannersForScreen$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        PromotionsProvider$getBanner$1 promotionsProvider$getBanner$1;
        int i;
        Object i2;
        if (continuationImpl instanceof PromotionsProvider$getBanner$1) {
            promotionsProvider$getBanner$1 = (PromotionsProvider$getBanner$1) continuationImpl;
            int i3 = promotionsProvider$getBanner$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                promotionsProvider$getBanner$1.label = i3 - Integer.MIN_VALUE;
                Object obj = promotionsProvider$getBanner$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionsProvider$getBanner$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    promotionsProvider$getBanner$1.L$0 = null;
                    promotionsProvider$getBanner$1.label = 1;
                    i2 = this.g.i(str, this.i, promotionsProvider$getBanner$1);
                    if (i2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    i2 = ((Result) obj).getValue();
                }
                return i2 instanceof Result.Failure ? ((Promotion) i2).a() : i2;
            }
        }
        promotionsProvider$getBanner$1 = new PromotionsProvider$getBanner$1(this, continuationImpl);
        Object obj2 = promotionsProvider$getBanner$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsProvider$getBanner$1.label;
        if (i != 0) {
        }
        if (i2 instanceof Result.Failure) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        PromotionsProvider$getBannerForScreen$1 promotionsProvider$getBannerForScreen$1;
        int i;
        if (continuationImpl instanceof PromotionsProvider$getBannerForScreen$1) {
            promotionsProvider$getBannerForScreen$1 = (PromotionsProvider$getBannerForScreen$1) continuationImpl;
            int i2 = promotionsProvider$getBannerForScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promotionsProvider$getBannerForScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promotionsProvider$getBannerForScreen$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionsProvider$getBannerForScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    promotionsProvider$getBannerForScreen$1.L$0 = null;
                    promotionsProvider$getBannerForScreen$1.L$1 = this;
                    promotionsProvider$getBannerForScreen$1.label = 1;
                    obj = c(str, promotionsProvider$getBannerForScreen$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (h) promotionsProvider$getBannerForScreen$1.L$1;
                    kotlin.b.b(obj);
                }
                Promotion promotion = (Promotion) kotlin.collections.a.R(this.f((Set) obj));
                return promotion != null ? x : promotion;
            }
        }
        promotionsProvider$getBannerForScreen$1 = new PromotionsProvider$getBannerForScreen$1(this, continuationImpl);
        Object obj3 = promotionsProvider$getBannerForScreen$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsProvider$getBannerForScreen$1.label;
        if (i != 0) {
        }
        Promotion promotion2 = (Promotion) kotlin.collections.a.R(this.f((Set) obj3));
        if (promotion2 != null) {
        }
    }

    public final List f(Set set) {
        if (set.isEmpty()) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (a(this, (Promotion) obj, this.c.a.a())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Promotion) it.next()).a());
        }
        return kotlin.collections.a.x0(arrayList2, new yu4(new yk(22), 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, ContinuationImpl continuationImpl) {
        PromotionsProvider$getGeoBannerForScreen$1 promotionsProvider$getGeoBannerForScreen$1;
        int i;
        if (continuationImpl instanceof PromotionsProvider$getGeoBannerForScreen$1) {
            promotionsProvider$getGeoBannerForScreen$1 = (PromotionsProvider$getGeoBannerForScreen$1) continuationImpl;
            int i2 = promotionsProvider$getGeoBannerForScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promotionsProvider$getGeoBannerForScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promotionsProvider$getGeoBannerForScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionsProvider$getGeoBannerForScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    promotionsProvider$getGeoBannerForScreen$1.L$0 = null;
                    promotionsProvider$getGeoBannerForScreen$1.label = 1;
                    obj = this.f.d(str, promotionsProvider$getGeoBannerForScreen$1);
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
                Promotion promotion = (Promotion) kotlin.collections.a.R(f((Set) obj));
                return promotion != null ? x : promotion;
            }
        }
        promotionsProvider$getGeoBannerForScreen$1 = new PromotionsProvider$getGeoBannerForScreen$1(this, continuationImpl);
        Object obj2 = promotionsProvider$getGeoBannerForScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsProvider$getGeoBannerForScreen$1.label;
        if (i != 0) {
        }
        Promotion promotion2 = (Promotion) kotlin.collections.a.R(f((Set) obj2));
        if (promotion2 != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable h(String str, ContinuationImpl continuationImpl) {
        PromotionsProvider$getNotificationBannersForScreen$1 promotionsProvider$getNotificationBannersForScreen$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof PromotionsProvider$getNotificationBannersForScreen$1) {
            promotionsProvider$getNotificationBannersForScreen$1 = (PromotionsProvider$getNotificationBannersForScreen$1) continuationImpl;
            int i2 = promotionsProvider$getNotificationBannersForScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promotionsProvider$getNotificationBannersForScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promotionsProvider$getNotificationBannersForScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionsProvider$getNotificationBannersForScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    promotionsProvider$getNotificationBannersForScreen$1.L$0 = null;
                    promotionsProvider$getNotificationBannersForScreen$1.L$1 = this;
                    promotionsProvider$getNotificationBannersForScreen$1.label = 1;
                    obj = c(str, promotionsProvider$getNotificationBannersForScreen$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (h) promotionsProvider$getNotificationBannersForScreen$1.L$1;
                    kotlin.b.b(obj);
                }
                List f = this.f((Set) obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : f) {
                    if (((Promotion) obj2).m() == Promotion.Type.NOTIFICATION) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                it = arrayList.iterator();
                while (it.hasNext()) {
                    Promotion promotion = (Promotion) it.next();
                    tg60 tg60Var = promotion instanceof tg60 ? (tg60) promotion : null;
                    if (tg60Var != null) {
                        arrayList2.add(tg60Var);
                    }
                }
                return arrayList2;
            }
        }
        promotionsProvider$getNotificationBannersForScreen$1 = new PromotionsProvider$getNotificationBannersForScreen$1(this, continuationImpl);
        Object obj3 = promotionsProvider$getNotificationBannersForScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsProvider$getNotificationBannersForScreen$1.label;
        if (i != 0) {
        }
        List f2 = this.f((Set) obj3);
        ArrayList arrayList3 = new ArrayList();
        while (r5.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList();
        it = arrayList3.iterator();
        while (it.hasNext()) {
        }
        return arrayList22;
    }

    public final void i(Lifecycle lifecycle, tse tseVar) {
        this.r = tseVar;
        tje.N(tseVar, null, null, new PromotionsProvider$init$1(this, lifecycle, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(String str, ContinuationImpl continuationImpl) {
        PromotionsProvider$isBannerCached$1 promotionsProvider$isBannerCached$1;
        int i;
        if (continuationImpl instanceof PromotionsProvider$isBannerCached$1) {
            promotionsProvider$isBannerCached$1 = (PromotionsProvider$isBannerCached$1) continuationImpl;
            int i2 = promotionsProvider$isBannerCached$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promotionsProvider$isBannerCached$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promotionsProvider$isBannerCached$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionsProvider$isBannerCached$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    promotionsProvider$isBannerCached$1.L$0 = null;
                    promotionsProvider$isBannerCached$1.label = 1;
                    obj = this.i.g(str, promotionsProvider$isBannerCached$1);
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
                Promotion promotion = (Promotion) obj;
                return Boolean.valueOf(promotion == null && this.l.b(promotion));
            }
        }
        promotionsProvider$isBannerCached$1 = new PromotionsProvider$isBannerCached$1(this, continuationImpl);
        Object obj2 = promotionsProvider$isBannerCached$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsProvider$isBannerCached$1.label;
        if (i != 0) {
        }
        Promotion promotion2 = (Promotion) obj2;
        return Boolean.valueOf(promotion2 == null && this.l.b(promotion2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0043, code lost:
    
        if (r2 >= r8.b) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(String str, n8s0 n8s0Var, Promotion.Type type, boolean z, String str2, boolean z2) {
        if (evu0.J(str)) {
            return;
        }
        dsf0 dsf0Var = this.e;
        if (n8s0Var != null) {
            String str3 = n8s0Var.a;
            int i = dsf0Var.a().getInt("ru.yandex.taxi.PromotionsProvider.FIELD_PROMOTIONS_SHOW_POLICY" + str3, 0) + 1;
            SharedPreferences.Editor edit = dsf0Var.a().edit();
            edit.putInt("ru.yandex.taxi.PromotionsProvider.FIELD_PROMOTIONS_SHOW_POLICY" + str3, i);
            edit.apply();
        }
        SharedPreferences a = dsf0Var.a();
        Set<String> set = EmptySet.a;
        Set<String> stringSet = a.getStringSet("ru.yandex.taxi.PromotionsProvider.FIELD_WATCHED_PROMOTIONS_IDS", set);
        if (stringSet != null) {
            set = stringSet;
        }
        LinkedHashSet i2 = v4r0.i(set, str);
        SharedPreferences.Editor edit2 = dsf0Var.a().edit();
        edit2.putStringSet("ru.yandex.taxi.PromotionsProvider.FIELD_WATCHED_PROMOTIONS_IDS", i2);
        edit2.apply();
        this.t = str;
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).accept(str);
        }
        if (this.n && z2) {
            this.m.a.add(new atc(str, type, str2, d7z0.a(this.b)));
            if (z) {
                pzt0 pzt0Var = this.v;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                tse tseVar = this.r;
                this.v = tseVar != null ? tje.N(tseVar, null, null, new PromotionsProvider$onPromoCompleted$1(this, null), 3) : null;
            }
        }
    }

    public final void l(String str, boolean z) {
        tse tseVar;
        if (!evu0.J(str) && z && this.e.b(str) && (tseVar = this.r) != null) {
            tje.N(tseVar, null, null, new PromotionsProvider$onPromoHidden$1(this, str, null), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(ContinuationImpl continuationImpl) {
        PromotionsProvider$updatePromotions$1 promotionsProvider$updatePromotions$1;
        int i;
        if (continuationImpl instanceof PromotionsProvider$updatePromotions$1) {
            promotionsProvider$updatePromotions$1 = (PromotionsProvider$updatePromotions$1) continuationImpl;
            int i2 = promotionsProvider$updatePromotions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promotionsProvider$updatePromotions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promotionsProvider$updatePromotions$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionsProvider$updatePromotions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    promotionsProvider$updatePromotions$1.label = 1;
                    obj = ((ru.yandex.taxi.launch.c) this.a.a).c(promotionsProvider$updatePromotions$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                promotionsProvider$updatePromotions$1.L$0 = null;
                promotionsProvider$updatePromotions$1.label = 2;
                Object n = n((String) obj, promotionsProvider$updatePromotions$1);
                return n != obj2 ? obj2 : n;
            }
        }
        promotionsProvider$updatePromotions$1 = new PromotionsProvider$updatePromotions$1(this, continuationImpl);
        Object obj3 = promotionsProvider$updatePromotions$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsProvider$updatePromotions$1.label;
        if (i != 0) {
        }
        promotionsProvider$updatePromotions$1.L$0 = null;
        promotionsProvider$updatePromotions$1.label = 2;
        Object n2 = n((String) obj3, promotionsProvider$updatePromotions$1);
        if (n2 != obj22) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(2:10|11)(2:21|22))(3:23|24|(1:26))|12|(2:15|13)|16|17|18))|31|6|7|(0)(0)|12|(1:13)|16|17|18|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0072, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
    
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x002c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        r5 = (defpackage.iux0) r5.j;
        r5.getClass();
        r5.c("Error caught while fetching promotions", r6, "Error caught while fetching promotions", new java.lang.String[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056 A[Catch: all -> 0x002c, CancellationException -> 0x0072, LOOP:0: B:13:0x0050->B:15:0x0056, LOOP_END, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0072, all -> 0x002c, blocks: (B:11:0x0028, B:12:0x0046, B:13:0x0050, B:15:0x0056, B:24:0x0037), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(String str, ContinuationImpl continuationImpl) {
        PromotionsProvider$updatePromotionsInternal$1 promotionsProvider$updatePromotionsInternal$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof PromotionsProvider$updatePromotionsInternal$1) {
            promotionsProvider$updatePromotionsInternal$1 = (PromotionsProvider$updatePromotionsInternal$1) continuationImpl;
            int i2 = promotionsProvider$updatePromotionsInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promotionsProvider$updatePromotionsInternal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promotionsProvider$updatePromotionsInternal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionsProvider$updatePromotionsInternal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = this.g;
                    ctf0 ctf0Var = this.i;
                    promotionsProvider$updatePromotionsInternal$1.L$0 = null;
                    promotionsProvider$updatePromotionsInternal$1.label = 1;
                    obj = dVar.g(str, ctf0Var, promotionsProvider$updatePromotionsInternal$1);
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
                isf0 isf0Var = (isf0) obj;
                this.s = isf0Var;
                it = this.o.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).accept(isf0Var);
                }
                return zy11.a;
            }
        }
        promotionsProvider$updatePromotionsInternal$1 = new PromotionsProvider$updatePromotionsInternal$1(this, continuationImpl);
        Object obj2 = promotionsProvider$updatePromotionsInternal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsProvider$updatePromotionsInternal$1.label;
        if (i != 0) {
        }
        isf0 isf0Var2 = (isf0) obj2;
        this.s = isf0Var2;
        it = this.o.iterator();
        while (it.hasNext()) {
        }
        return zy11.a;
    }
}
