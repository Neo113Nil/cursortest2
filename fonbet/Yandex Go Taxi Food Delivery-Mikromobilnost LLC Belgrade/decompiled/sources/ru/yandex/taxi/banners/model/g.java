package ru.yandex.taxi.banners.model;

import defpackage.azs;
import defpackage.b7z0;
import defpackage.bzs;
import defpackage.dsf0;
import defpackage.eja1;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.jl40;
import defpackage.ltc;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.uyj;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Consumer;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes9.dex */
public final class g {
    public final dsf0 a;
    public final b7z0 b;
    public final d c;
    public final bzs d;
    public final ltc e;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final kotlinx.coroutines.sync.a g = gtq0.a();
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public volatile Promotion i;

    public g(dsf0 dsf0Var, b7z0 b7z0Var, d dVar, bzs bzsVar, ltc ltcVar) {
        this.a = dsf0Var;
        this.b = b7z0Var;
        this.c = dVar;
        this.d = bzsVar;
        this.e = ltcVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(2:10|11)(2:23|24))(3:25|26|(1:28))|12|(5:14|(2:17|15)|18|19|20)(1:22)))|33|6|7|(0)(0)|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0094, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0034, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        r4 = (defpackage.iux0) r4.e;
        r4.getClass();
        r4.c("Error downloading suggest banner", r6, "Error downloading suggest banner " + r5, "CRITICAL");
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[Catch: all -> 0x0034, CancellationException -> 0x0093, TryCatch #2 {CancellationException -> 0x0093, all -> 0x0034, blocks: (B:11:0x002a, B:12:0x004f, B:14:0x0055, B:15:0x005f, B:17:0x0065, B:22:0x006f, B:26:0x0040), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[Catch: all -> 0x0034, CancellationException -> 0x0093, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x0093, all -> 0x0034, blocks: (B:11:0x002a, B:12:0x004f, B:14:0x0055, B:15:0x005f, B:17:0x0065, B:22:0x006f, B:26:0x0040), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(g gVar, String str, ContinuationImpl continuationImpl) {
        GeoBannersInteractor$getOrDownloadBanner$1 geoBannersInteractor$getOrDownloadBanner$1;
        int i;
        Object i2;
        Throwable a;
        gVar.getClass();
        if (continuationImpl instanceof GeoBannersInteractor$getOrDownloadBanner$1) {
            geoBannersInteractor$getOrDownloadBanner$1 = (GeoBannersInteractor$getOrDownloadBanner$1) continuationImpl;
            int i3 = geoBannersInteractor$getOrDownloadBanner$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                geoBannersInteractor$getOrDownloadBanner$1.label = i3 - Integer.MIN_VALUE;
                Object obj = geoBannersInteractor$getOrDownloadBanner$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoBannersInteractor$getOrDownloadBanner$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = gVar.c;
                    bzs bzsVar = gVar.d;
                    geoBannersInteractor$getOrDownloadBanner$1.L$0 = str;
                    geoBannersInteractor$getOrDownloadBanner$1.label = 1;
                    i2 = dVar.i(str, bzsVar, geoBannersInteractor$getOrDownloadBanner$1);
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
                a = Result.a(i2);
                if (a == null) {
                    throw a;
                }
                Promotion promotion = (Promotion) i2;
                gVar.i = promotion;
                Iterator it = gVar.h.iterator();
                while (it.hasNext()) {
                    ((Consumer) it.next()).accept(promotion);
                }
                return zy11.a;
            }
        }
        geoBannersInteractor$getOrDownloadBanner$1 = new GeoBannersInteractor$getOrDownloadBanner$1(gVar, continuationImpl);
        Object obj2 = geoBannersInteractor$getOrDownloadBanner$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoBannersInteractor$getOrDownloadBanner$1.label;
        if (i != 0) {
        }
        a = Result.a(i2);
        if (a == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x0080, code lost:
    
        if (r15 == r1) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0175 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131 A[LOOP:3: B:63:0x012b->B:65:0x0131, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, long j, ContinuationImpl continuationImpl) {
        GeoBannersInteractor$actualizeBanners$1 geoBannersInteractor$actualizeBanners$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Iterator it;
        ArrayList arrayList;
        Iterator it2;
        bzs bzsVar;
        long j2;
        List list2;
        Object k0;
        if (continuationImpl instanceof GeoBannersInteractor$actualizeBanners$1) {
            geoBannersInteractor$actualizeBanners$1 = (GeoBannersInteractor$actualizeBanners$1) continuationImpl;
            int i2 = geoBannersInteractor$actualizeBanners$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoBannersInteractor$actualizeBanners$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoBannersInteractor$actualizeBanners$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoBannersInteractor$actualizeBanners$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dsf0 dsf0Var = this.a;
                    geoBannersInteractor$actualizeBanners$1.L$0 = list;
                    geoBannersInteractor$actualizeBanners$1.J$0 = j;
                    geoBannersInteractor$actualizeBanners$1.label = 1;
                    List list3 = dsf0Var.e;
                    if (list3 == null) {
                        dsf0Var.c.getClass();
                        sjh sjhVar = uyj.a;
                        obj = tje.k0(mdh.b, new PromotionPreferences$geoBanners$2(dsf0Var, null), geoBannersInteractor$actualizeBanners$1);
                    } else {
                        obj = list3;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            List list4 = (List) geoBannersInteractor$actualizeBanners$1.L$2;
                            kotlin.b.b(obj);
                            return list4;
                        }
                        j2 = geoBannersInteractor$actualizeBanners$1.J$0;
                        list2 = (List) geoBannersInteractor$actualizeBanners$1.L$2;
                        kotlin.b.b(obj);
                        dsf0 dsf0Var2 = this.a;
                        geoBannersInteractor$actualizeBanners$1.L$0 = null;
                        geoBannersInteractor$actualizeBanners$1.L$1 = null;
                        geoBannersInteractor$actualizeBanners$1.L$2 = list2;
                        geoBannersInteractor$actualizeBanners$1.J$0 = j2;
                        geoBannersInteractor$actualizeBanners$1.label = 3;
                        dsf0Var2.e = list2;
                        dsf0Var2.c.getClass();
                        sjh sjhVar2 = uyj.a;
                        k0 = tje.k0(mdh.b, new PromotionPreferences$setGeoBanners$2(dsf0Var2, list2, null), geoBannersInteractor$actualizeBanners$1);
                        if (k0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            k0 = zy11.a;
                        }
                        return k0 != coroutineSingletons ? coroutineSingletons : list2;
                    }
                    j = geoBannersInteractor$actualizeBanners$1.J$0;
                    list = (List) geoBannersInteractor$actualizeBanners$1.L$0;
                    kotlin.b.b(obj);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    azs azsVar = (azs) obj2;
                    List list5 = list;
                    if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                        Iterator it3 = list5.iterator();
                        while (it3.hasNext()) {
                            if (jl40.l(((azs) it3.next()).a, azsVar.a)) {
                                break;
                            }
                        }
                    }
                    arrayList2.add(obj2);
                }
                ArrayList m0 = kotlin.collections.a.m0(list, arrayList2);
                ArrayList arrayList3 = new ArrayList();
                it = m0.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    azs azsVar2 = (azs) next;
                    if (azsVar2.b >= j && !this.a.b(azsVar2.a)) {
                        arrayList3.add(next);
                    }
                }
                geoBannersInteractor$actualizeBanners$1.L$0 = null;
                geoBannersInteractor$actualizeBanners$1.L$1 = null;
                geoBannersInteractor$actualizeBanners$1.L$2 = arrayList3;
                geoBannersInteractor$actualizeBanners$1.J$0 = j;
                geoBannersInteractor$actualizeBanners$1.label = 2;
                List J = arrayList3.size() <= 20 ? kotlin.collections.a.J(arrayList3, arrayList3.size() - 20) : arrayList3;
                arrayList = new ArrayList(tcc.n(J, 10));
                it2 = J.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((azs) it2.next()).a);
                }
                bzsVar = this.d;
                bzsVar.getClass();
                if (ru.yandex.taxi.promotions.storage.a.l(bzsVar, arrayList, geoBannersInteractor$actualizeBanners$1) != coroutineSingletons) {
                    j2 = j;
                    list2 = arrayList3;
                    dsf0 dsf0Var22 = this.a;
                    geoBannersInteractor$actualizeBanners$1.L$0 = null;
                    geoBannersInteractor$actualizeBanners$1.L$1 = null;
                    geoBannersInteractor$actualizeBanners$1.L$2 = list2;
                    geoBannersInteractor$actualizeBanners$1.J$0 = j2;
                    geoBannersInteractor$actualizeBanners$1.label = 3;
                    dsf0Var22.e = list2;
                    dsf0Var22.c.getClass();
                    sjh sjhVar22 = uyj.a;
                    k0 = tje.k0(mdh.b, new PromotionPreferences$setGeoBanners$2(dsf0Var22, list2, null), geoBannersInteractor$actualizeBanners$1);
                    if (k0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                    if (k0 != coroutineSingletons) {
                    }
                }
            }
        }
        geoBannersInteractor$actualizeBanners$1 = new GeoBannersInteractor$actualizeBanners$1(this, continuationImpl);
        Object obj3 = geoBannersInteractor$actualizeBanners$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoBannersInteractor$actualizeBanners$1.label;
        if (i != 0) {
        }
        ArrayList arrayList22 = new ArrayList();
        while (r15.hasNext()) {
        }
        ArrayList m02 = kotlin.collections.a.m0(list, arrayList22);
        ArrayList arrayList32 = new ArrayList();
        it = m02.iterator();
        while (it.hasNext()) {
        }
        geoBannersInteractor$actualizeBanners$1.L$0 = null;
        geoBannersInteractor$actualizeBanners$1.L$1 = null;
        geoBannersInteractor$actualizeBanners$1.L$2 = arrayList32;
        geoBannersInteractor$actualizeBanners$1.J$0 = j;
        geoBannersInteractor$actualizeBanners$1.label = 2;
        List J2 = arrayList32.size() <= 20 ? kotlin.collections.a.J(arrayList32, arrayList32.size() - 20) : arrayList32;
        arrayList = new ArrayList(tcc.n(J2, 10));
        it2 = J2.iterator();
        while (it2.hasNext()) {
        }
        bzsVar = this.d;
        bzsVar.getClass();
        if (ru.yandex.taxi.promotions.storage.a.l(bzsVar, arrayList, geoBannersInteractor$actualizeBanners$1) != coroutineSingletons) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(List list, ContinuationImpl continuationImpl) {
        GeoBannersInteractor$downloadGeoBanners$1 geoBannersInteractor$downloadGeoBanners$1;
        int i;
        if (continuationImpl instanceof GeoBannersInteractor$downloadGeoBanners$1) {
            geoBannersInteractor$downloadGeoBanners$1 = (GeoBannersInteractor$downloadGeoBanners$1) continuationImpl;
            int i2 = geoBannersInteractor$downloadGeoBanners$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoBannersInteractor$downloadGeoBanners$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoBannersInteractor$downloadGeoBanners$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoBannersInteractor$downloadGeoBanners$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    GeoBannersInteractor$downloadGeoBanners$2 geoBannersInteractor$downloadGeoBanners$2 = new GeoBannersInteractor$downloadGeoBanners$2(list, this, null);
                    geoBannersInteractor$downloadGeoBanners$1.L$0 = null;
                    geoBannersInteractor$downloadGeoBanners$1.label = 1;
                    if (jl40.O(geoBannersInteractor$downloadGeoBanners$2, geoBannersInteractor$downloadGeoBanners$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        geoBannersInteractor$downloadGeoBanners$1 = new GeoBannersInteractor$downloadGeoBanners$1(this, continuationImpl);
        Object obj2 = geoBannersInteractor$downloadGeoBanners$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoBannersInteractor$downloadGeoBanners$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009e, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        if (r9 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x009c -> B:11:0x009f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        GeoBannersInteractor$getBannersForScreen$1 geoBannersInteractor$getBannersForScreen$1;
        int i;
        Iterator it;
        Collection collection;
        if (continuationImpl instanceof GeoBannersInteractor$getBannersForScreen$1) {
            geoBannersInteractor$getBannersForScreen$1 = (GeoBannersInteractor$getBannersForScreen$1) continuationImpl;
            int i2 = geoBannersInteractor$getBannersForScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoBannersInteractor$getBannersForScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoBannersInteractor$getBannersForScreen$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoBannersInteractor$getBannersForScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    geoBannersInteractor$getBannersForScreen$1.L$0 = str;
                    geoBannersInteractor$getBannersForScreen$1.label = 1;
                    bzs bzsVar = this.d;
                    bzsVar.getClass();
                    obj = ru.yandex.taxi.promotions.storage.a.i(bzsVar, geoBannersInteractor$getBannersForScreen$1);
                } else if (i == 1) {
                    str = (String) geoBannersInteractor$getBannersForScreen$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object next = geoBannersInteractor$getBannersForScreen$1.L$5;
                    it = (Iterator) geoBannersInteractor$getBannersForScreen$1.L$4;
                    collection = (Collection) geoBannersInteractor$getBannersForScreen$1.L$3;
                    kotlin.b.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        collection.add(next);
                    }
                    if (!it.hasNext()) {
                        return kotlin.collections.a.N0((List) collection);
                    }
                    next = it.next();
                    String b = ((Promotion) next).getB();
                    geoBannersInteractor$getBannersForScreen$1.L$0 = null;
                    geoBannersInteractor$getBannersForScreen$1.L$1 = null;
                    geoBannersInteractor$getBannersForScreen$1.L$2 = null;
                    geoBannersInteractor$getBannersForScreen$1.L$3 = collection;
                    geoBannersInteractor$getBannersForScreen$1.L$4 = it;
                    geoBannersInteractor$getBannersForScreen$1.L$5 = next;
                    geoBannersInteractor$getBannersForScreen$1.L$6 = null;
                    geoBannersInteractor$getBannersForScreen$1.label = 2;
                    obj = e(b, geoBannersInteractor$getBannersForScreen$1);
                }
                ArrayList o = eja1.o(str, (List) obj);
                ArrayList arrayList = new ArrayList();
                it = o.iterator();
                collection = arrayList;
                if (!it.hasNext()) {
                }
            }
        }
        geoBannersInteractor$getBannersForScreen$1 = new GeoBannersInteractor$getBannersForScreen$1(this, continuationImpl);
        Object obj3 = geoBannersInteractor$getBannersForScreen$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoBannersInteractor$getBannersForScreen$1.label;
        if (i != 0) {
        }
        ArrayList o2 = eja1.o(str, (List) obj3);
        ArrayList arrayList2 = new ArrayList();
        it = o2.iterator();
        collection = arrayList2;
        if (!it.hasNext()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[EDGE_INSN: B:26:0x0072->B:17:0x0072 BREAK  A[LOOP:0: B:11:0x005c->B:25:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, ContinuationImpl continuationImpl) {
        GeoBannersInteractor$isValidGeoBanner$1 geoBannersInteractor$isValidGeoBanner$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof GeoBannersInteractor$isValidGeoBanner$1) {
            geoBannersInteractor$isValidGeoBanner$1 = (GeoBannersInteractor$isValidGeoBanner$1) continuationImpl;
            int i2 = geoBannersInteractor$isValidGeoBanner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoBannersInteractor$isValidGeoBanner$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoBannersInteractor$isValidGeoBanner$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoBannersInteractor$isValidGeoBanner$1.label;
                Object obj2 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dsf0 dsf0Var = this.a;
                    geoBannersInteractor$isValidGeoBanner$1.L$0 = str;
                    geoBannersInteractor$isValidGeoBanner$1.label = 1;
                    List list = dsf0Var.e;
                    if (list == null) {
                        dsf0Var.c.getClass();
                        sjh sjhVar = uyj.a;
                        obj = tje.k0(mdh.b, new PromotionPreferences$geoBanners$2(dsf0Var, null), geoBannersInteractor$isValidGeoBanner$1);
                    } else {
                        obj = list;
                    }
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) geoBannersInteractor$isValidGeoBanner$1.L$0;
                    kotlin.b.b(obj);
                }
                it = ((Iterable) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (jl40.l(((azs) next).a, str)) {
                        obj2 = next;
                        break;
                    }
                }
                azs azsVar = (azs) obj2;
                return Boolean.valueOf(azsVar == null && azsVar.b >= this.b.a());
            }
        }
        geoBannersInteractor$isValidGeoBanner$1 = new GeoBannersInteractor$isValidGeoBanner$1(this, continuationImpl);
        Object obj3 = geoBannersInteractor$isValidGeoBanner$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoBannersInteractor$isValidGeoBanner$1.label;
        Object obj22 = null;
        if (i != 0) {
        }
        it = ((Iterable) obj3).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        azs azsVar2 = (azs) obj22;
        return Boolean.valueOf(azsVar2 == null && azsVar2.b >= this.b.a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0073, code lost:
    
        if (r11.a(r0) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r10v9, types: [g050] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v0, types: [ru.yandex.taxi.banners.model.g] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ArrayList arrayList, ContinuationImpl continuationImpl) {
        GeoBannersInteractor$processGeoBanners$1 geoBannersInteractor$processGeoBanners$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        long a;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        Object b;
        long j;
        try {
            if (continuationImpl instanceof GeoBannersInteractor$processGeoBanners$1) {
                geoBannersInteractor$processGeoBanners$1 = (GeoBannersInteractor$processGeoBanners$1) continuationImpl;
                int i2 = geoBannersInteractor$processGeoBanners$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    geoBannersInteractor$processGeoBanners$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = geoBannersInteractor$processGeoBanners$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = geoBannersInteractor$processGeoBanners$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        a = this.b.a();
                        geoBannersInteractor$processGeoBanners$1.L$0 = arrayList;
                        aVar = this.g;
                        geoBannersInteractor$processGeoBanners$1.L$1 = aVar;
                        geoBannersInteractor$processGeoBanners$1.J$0 = a;
                        geoBannersInteractor$processGeoBanners$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                kotlin.b.b(obj);
                                return obj;
                            }
                            j = geoBannersInteractor$processGeoBanners$1.J$0;
                            g050Var = (g050) geoBannersInteractor$processGeoBanners$1.L$1;
                            try {
                                kotlin.b.b(obj);
                                List list = (List) obj;
                                g050Var.d(null);
                                geoBannersInteractor$processGeoBanners$1.L$0 = null;
                                geoBannersInteractor$processGeoBanners$1.L$1 = null;
                                geoBannersInteractor$processGeoBanners$1.J$0 = j;
                                geoBannersInteractor$processGeoBanners$1.label = 3;
                                Object c = c(list, geoBannersInteractor$processGeoBanners$1);
                                return c != coroutineSingletons ? coroutineSingletons : c;
                            } catch (Throwable th) {
                                th = th;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        a = geoBannersInteractor$processGeoBanners$1.J$0;
                        ?? r10 = (g050) geoBannersInteractor$processGeoBanners$1.L$1;
                        ?? r2 = (List) geoBannersInteractor$processGeoBanners$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r10;
                        arrayList = r2;
                    }
                    geoBannersInteractor$processGeoBanners$1.L$0 = null;
                    geoBannersInteractor$processGeoBanners$1.L$1 = aVar;
                    geoBannersInteractor$processGeoBanners$1.J$0 = a;
                    geoBannersInteractor$processGeoBanners$1.label = 2;
                    b = b(arrayList, a, geoBannersInteractor$processGeoBanners$1);
                    if (b != coroutineSingletons) {
                        kotlinx.coroutines.sync.a aVar2 = aVar;
                        obj = b;
                        g050Var = aVar2;
                        j = a;
                        List list2 = (List) obj;
                        g050Var.d(null);
                        geoBannersInteractor$processGeoBanners$1.L$0 = null;
                        geoBannersInteractor$processGeoBanners$1.L$1 = null;
                        geoBannersInteractor$processGeoBanners$1.J$0 = j;
                        geoBannersInteractor$processGeoBanners$1.label = 3;
                        Object c2 = c(list2, geoBannersInteractor$processGeoBanners$1);
                        if (c2 != coroutineSingletons) {
                        }
                    }
                }
            }
            geoBannersInteractor$processGeoBanners$1.L$0 = null;
            geoBannersInteractor$processGeoBanners$1.L$1 = aVar;
            geoBannersInteractor$processGeoBanners$1.J$0 = a;
            geoBannersInteractor$processGeoBanners$1.label = 2;
            b = b(arrayList, a, geoBannersInteractor$processGeoBanners$1);
            if (b != coroutineSingletons) {
            }
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
        geoBannersInteractor$processGeoBanners$1 = new GeoBannersInteractor$processGeoBanners$1(this, continuationImpl);
        Object obj2 = geoBannersInteractor$processGeoBanners$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoBannersInteractor$processGeoBanners$1.label;
        if (i != 0) {
        }
    }
}
