package ru.yandex.taxi.promotions.storage;

import android.content.Context;
import defpackage.bvf0;
import defpackage.ctf0;
import defpackage.ftf0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.ike;
import defpackage.in2;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.v4r0;
import defpackage.wls;
import defpackage.wnt;
import defpackage.zy11;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes9.dex */
public abstract class a implements ctf0 {
    public static final ike e = bvf0.a(jl40.a());
    public final ru.yandex.taxi.utils.storage.a a;
    public final kotlinx.coroutines.sync.a b = gtq0.a();
    public final wls c = new PromotionsStorageImpl$promotionChangedListener$1(2, null);
    public volatile wls d = new PromotionsStorageImpl$promotionRemovedListener$1(2, null);

    public a(String str, Context context, wnt wntVar) {
        this.a = new ru.yandex.taxi.utils.storage.a(kotlin.a.a(new in2(19, wntVar, context, str)), e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        if (r8.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v11, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable i(a aVar, ContinuationImpl continuationImpl) {
        PromotionsStorageImpl$getAllPromotions$1 promotionsStorageImpl$getAllPromotions$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar2;
        Throwable th;
        g050 g050Var;
        Object a;
        try {
            if (continuationImpl instanceof PromotionsStorageImpl$getAllPromotions$1) {
                promotionsStorageImpl$getAllPromotions$1 = (PromotionsStorageImpl$getAllPromotions$1) continuationImpl;
                int i2 = promotionsStorageImpl$getAllPromotions$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    promotionsStorageImpl$getAllPromotions$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = promotionsStorageImpl$getAllPromotions$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = promotionsStorageImpl$getAllPromotions$1.label;
                    if (i != 0) {
                        b.b(obj);
                        aVar2 = aVar.b;
                        promotionsStorageImpl$getAllPromotions$1.L$0 = aVar;
                        promotionsStorageImpl$getAllPromotions$1.L$1 = aVar2;
                        promotionsStorageImpl$getAllPromotions$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) promotionsStorageImpl$getAllPromotions$1.L$1;
                            try {
                                b.b(obj);
                                List a2 = ((ftf0) obj).a();
                                g050Var.d(null);
                                return (Serializable) a2;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r7 = (g050) promotionsStorageImpl$getAllPromotions$1.L$1;
                        a aVar3 = (a) promotionsStorageImpl$getAllPromotions$1.L$0;
                        b.b(obj);
                        aVar2 = r7;
                        aVar = aVar3;
                    }
                    ru.yandex.taxi.utils.storage.a aVar4 = aVar.a;
                    promotionsStorageImpl$getAllPromotions$1.L$0 = null;
                    promotionsStorageImpl$getAllPromotions$1.L$1 = aVar2;
                    promotionsStorageImpl$getAllPromotions$1.label = 2;
                    a = aVar4.a(promotionsStorageImpl$getAllPromotions$1);
                    if (a != coroutineSingletons) {
                        kotlinx.coroutines.sync.a aVar5 = aVar2;
                        obj = a;
                        g050Var = aVar5;
                        List a22 = ((ftf0) obj).a();
                        g050Var.d(null);
                        return (Serializable) a22;
                    }
                    return coroutineSingletons;
                }
            }
            ru.yandex.taxi.utils.storage.a aVar42 = aVar.a;
            promotionsStorageImpl$getAllPromotions$1.L$0 = null;
            promotionsStorageImpl$getAllPromotions$1.L$1 = aVar2;
            promotionsStorageImpl$getAllPromotions$1.label = 2;
            a = aVar42.a(promotionsStorageImpl$getAllPromotions$1);
            if (a != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar6 = aVar2;
            th = th3;
            g050Var = aVar6;
            g050Var.d(null);
            throw th;
        }
        promotionsStorageImpl$getAllPromotions$1 = new PromotionsStorageImpl$getAllPromotions$1(aVar, continuationImpl);
        Object obj2 = promotionsStorageImpl$getAllPromotions$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsStorageImpl$getAllPromotions$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object j(a aVar, String str, ContinuationImpl continuationImpl) {
        PromotionsStorageImpl$getPromotion$1 promotionsStorageImpl$getPromotion$1;
        int i;
        Set set;
        Promotion promotion;
        Object obj;
        if (continuationImpl instanceof PromotionsStorageImpl$getPromotion$1) {
            promotionsStorageImpl$getPromotion$1 = (PromotionsStorageImpl$getPromotion$1) continuationImpl;
            int i2 = promotionsStorageImpl$getPromotion$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promotionsStorageImpl$getPromotion$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = promotionsStorageImpl$getPromotion$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionsStorageImpl$getPromotion$1.label;
                if (i != 0) {
                    b.b(obj2);
                    ru.yandex.taxi.utils.storage.a aVar2 = aVar.a;
                    promotionsStorageImpl$getPromotion$1.L$0 = null;
                    promotionsStorageImpl$getPromotion$1.L$1 = str;
                    promotionsStorageImpl$getPromotion$1.label = 1;
                    obj2 = aVar2.a(promotionsStorageImpl$getPromotion$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) promotionsStorageImpl$getPromotion$1.L$1;
                    b.b(obj2);
                }
                set = ((ftf0) obj2).a;
                if (set == null) {
                    Iterator it = set.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        Promotion promotion2 = (Promotion) obj;
                        if (promotion2 != null && jl40.l(str, promotion2.getB())) {
                            break;
                        }
                    }
                    promotion = (Promotion) obj;
                } else {
                    promotion = null;
                }
                if (promotion == null) {
                    return promotion;
                }
                return null;
            }
        }
        promotionsStorageImpl$getPromotion$1 = new PromotionsStorageImpl$getPromotion$1(aVar, continuationImpl);
        Object obj22 = promotionsStorageImpl$getPromotion$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsStorageImpl$getPromotion$1.label;
        if (i != 0) {
        }
        set = ((ftf0) obj22).a;
        if (set == null) {
        }
        if (promotion == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object k(a aVar, ContinuationImpl continuationImpl) {
        PromotionsStorageImpl$loadInMemCache$1 promotionsStorageImpl$loadInMemCache$1;
        int i;
        if (continuationImpl instanceof PromotionsStorageImpl$loadInMemCache$1) {
            promotionsStorageImpl$loadInMemCache$1 = (PromotionsStorageImpl$loadInMemCache$1) continuationImpl;
            int i2 = promotionsStorageImpl$loadInMemCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promotionsStorageImpl$loadInMemCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = promotionsStorageImpl$loadInMemCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionsStorageImpl$loadInMemCache$1.label;
                if (i != 0) {
                    b.b(obj);
                    ru.yandex.taxi.utils.storage.a aVar2 = aVar.a;
                    promotionsStorageImpl$loadInMemCache$1.L$0 = null;
                    promotionsStorageImpl$loadInMemCache$1.label = 1;
                    if (aVar2.a(promotionsStorageImpl$loadInMemCache$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        promotionsStorageImpl$loadInMemCache$1 = new PromotionsStorageImpl$loadInMemCache$1(aVar, continuationImpl);
        Object obj2 = promotionsStorageImpl$loadInMemCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsStorageImpl$loadInMemCache$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5 A[Catch: all -> 0x00fc, TryCatch #0 {all -> 0x00fc, blocks: (B:31:0x00d0, B:32:0x00df, B:34:0x00e5, B:37:0x00f5, B:42:0x00fe), top: B:30:0x00d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object l(a aVar, ArrayList arrayList, ContinuationImpl continuationImpl) {
        PromotionsStorageImpl$removeAllPromotionsExcept$1 promotionsStorageImpl$removeAllPromotionsExcept$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object obj;
        ArrayList arrayList2;
        a aVar2;
        ftf0 ftf0Var;
        kotlinx.coroutines.sync.a aVar3;
        a aVar4;
        List list;
        a aVar5;
        ftf0 ftf0Var2;
        g050 g050Var;
        List list2;
        Iterator it;
        Iterator it2;
        ftf0 ftf0Var3;
        a aVar6;
        a aVar7;
        if (continuationImpl instanceof PromotionsStorageImpl$removeAllPromotionsExcept$1) {
            promotionsStorageImpl$removeAllPromotionsExcept$1 = (PromotionsStorageImpl$removeAllPromotionsExcept$1) continuationImpl;
            int i2 = promotionsStorageImpl$removeAllPromotionsExcept$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promotionsStorageImpl$removeAllPromotionsExcept$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = promotionsStorageImpl$removeAllPromotionsExcept$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionsStorageImpl$removeAllPromotionsExcept$1.label;
                if (i != 0) {
                    b.b(obj2);
                    ru.yandex.taxi.utils.storage.a aVar8 = aVar.a;
                    promotionsStorageImpl$removeAllPromotionsExcept$1.L$0 = aVar;
                    promotionsStorageImpl$removeAllPromotionsExcept$1.L$1 = arrayList;
                    promotionsStorageImpl$removeAllPromotionsExcept$1.L$2 = aVar;
                    promotionsStorageImpl$removeAllPromotionsExcept$1.label = 1;
                    Object a = aVar8.a(promotionsStorageImpl$removeAllPromotionsExcept$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        arrayList2 = arrayList;
                        aVar2 = aVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        g050Var = (g050) promotionsStorageImpl$removeAllPromotionsExcept$1.L$6;
                        list = (List) promotionsStorageImpl$removeAllPromotionsExcept$1.L$5;
                        ftf0Var = (ftf0) promotionsStorageImpl$removeAllPromotionsExcept$1.L$4;
                        ftf0Var2 = (ftf0) promotionsStorageImpl$removeAllPromotionsExcept$1.L$3;
                        aVar4 = (a) promotionsStorageImpl$removeAllPromotionsExcept$1.L$2;
                        list2 = (List) promotionsStorageImpl$removeAllPromotionsExcept$1.L$1;
                        aVar5 = (a) promotionsStorageImpl$removeAllPromotionsExcept$1.L$0;
                        b.b(obj2);
                        try {
                            ArrayList arrayList3 = new ArrayList(ftf0Var.a());
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                                Promotion promotion = (Promotion) it.next();
                                if (!list2.contains(promotion.getB())) {
                                    it.remove();
                                    list.add(promotion);
                                }
                            }
                            ftf0Var.a = kotlin.collections.a.N0(arrayList3);
                            g050Var.d(null);
                            it2 = list.iterator();
                            ftf0Var3 = ftf0Var2;
                            aVar6 = aVar4;
                            aVar7 = aVar5;
                            while (it2.hasNext()) {
                            }
                            if (!list.isEmpty()) {
                            }
                            return zy11.a;
                        } catch (Throwable th) {
                            g050Var.d(null);
                            throw th;
                        }
                    }
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it2 = (Iterator) promotionsStorageImpl$removeAllPromotionsExcept$1.L$6;
                    list = (List) promotionsStorageImpl$removeAllPromotionsExcept$1.L$5;
                    ftf0Var3 = (ftf0) promotionsStorageImpl$removeAllPromotionsExcept$1.L$3;
                    aVar6 = (a) promotionsStorageImpl$removeAllPromotionsExcept$1.L$2;
                    aVar7 = (a) promotionsStorageImpl$removeAllPromotionsExcept$1.L$0;
                    b.b(obj2);
                    while (it2.hasNext()) {
                        Promotion promotion2 = (Promotion) it2.next();
                        wls wlsVar = aVar7.d;
                        promotionsStorageImpl$removeAllPromotionsExcept$1.L$0 = aVar7;
                        promotionsStorageImpl$removeAllPromotionsExcept$1.L$1 = null;
                        promotionsStorageImpl$removeAllPromotionsExcept$1.L$2 = aVar6;
                        promotionsStorageImpl$removeAllPromotionsExcept$1.L$3 = ftf0Var3;
                        promotionsStorageImpl$removeAllPromotionsExcept$1.L$4 = null;
                        promotionsStorageImpl$removeAllPromotionsExcept$1.L$5 = list;
                        promotionsStorageImpl$removeAllPromotionsExcept$1.L$6 = it2;
                        promotionsStorageImpl$removeAllPromotionsExcept$1.L$7 = null;
                        promotionsStorageImpl$removeAllPromotionsExcept$1.label = 3;
                        if (wlsVar.invoke(promotion2, promotionsStorageImpl$removeAllPromotionsExcept$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    if (!list.isEmpty()) {
                        aVar6.a.b(ftf0Var3);
                    }
                    return zy11.a;
                }
                a aVar9 = (a) promotionsStorageImpl$removeAllPromotionsExcept$1.L$2;
                ?? r14 = (List) promotionsStorageImpl$removeAllPromotionsExcept$1.L$1;
                a aVar10 = (a) promotionsStorageImpl$removeAllPromotionsExcept$1.L$0;
                b.b(obj2);
                aVar2 = aVar9;
                aVar = aVar10;
                obj = obj2;
                arrayList2 = r14;
                ftf0Var = (ftf0) obj;
                ArrayList arrayList4 = new ArrayList();
                aVar3 = aVar.b;
                promotionsStorageImpl$removeAllPromotionsExcept$1.L$0 = aVar;
                promotionsStorageImpl$removeAllPromotionsExcept$1.L$1 = arrayList2;
                promotionsStorageImpl$removeAllPromotionsExcept$1.L$2 = aVar2;
                promotionsStorageImpl$removeAllPromotionsExcept$1.L$3 = ftf0Var;
                promotionsStorageImpl$removeAllPromotionsExcept$1.L$4 = ftf0Var;
                promotionsStorageImpl$removeAllPromotionsExcept$1.L$5 = arrayList4;
                promotionsStorageImpl$removeAllPromotionsExcept$1.L$6 = aVar3;
                promotionsStorageImpl$removeAllPromotionsExcept$1.L$7 = null;
                promotionsStorageImpl$removeAllPromotionsExcept$1.label = 2;
                if (aVar3.a(promotionsStorageImpl$removeAllPromotionsExcept$1) != coroutineSingletons) {
                    aVar4 = aVar2;
                    list = arrayList4;
                    aVar5 = aVar;
                    ftf0Var2 = ftf0Var;
                    g050Var = aVar3;
                    list2 = arrayList2;
                    ArrayList arrayList32 = new ArrayList(ftf0Var.a());
                    it = arrayList32.iterator();
                    while (it.hasNext()) {
                    }
                    ftf0Var.a = kotlin.collections.a.N0(arrayList32);
                    g050Var.d(null);
                    it2 = list.iterator();
                    ftf0Var3 = ftf0Var2;
                    aVar6 = aVar4;
                    aVar7 = aVar5;
                    while (it2.hasNext()) {
                    }
                    if (!list.isEmpty()) {
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        promotionsStorageImpl$removeAllPromotionsExcept$1 = new PromotionsStorageImpl$removeAllPromotionsExcept$1(aVar, continuationImpl);
        Object obj22 = promotionsStorageImpl$removeAllPromotionsExcept$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsStorageImpl$removeAllPromotionsExcept$1.label;
        if (i != 0) {
        }
        ftf0Var = (ftf0) obj;
        ArrayList arrayList42 = new ArrayList();
        aVar3 = aVar.b;
        promotionsStorageImpl$removeAllPromotionsExcept$1.L$0 = aVar;
        promotionsStorageImpl$removeAllPromotionsExcept$1.L$1 = arrayList2;
        promotionsStorageImpl$removeAllPromotionsExcept$1.L$2 = aVar2;
        promotionsStorageImpl$removeAllPromotionsExcept$1.L$3 = ftf0Var;
        promotionsStorageImpl$removeAllPromotionsExcept$1.L$4 = ftf0Var;
        promotionsStorageImpl$removeAllPromotionsExcept$1.L$5 = arrayList42;
        promotionsStorageImpl$removeAllPromotionsExcept$1.L$6 = aVar3;
        promotionsStorageImpl$removeAllPromotionsExcept$1.L$7 = null;
        promotionsStorageImpl$removeAllPromotionsExcept$1.label = 2;
        if (aVar3.a(promotionsStorageImpl$removeAllPromotionsExcept$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2 A[Catch: all -> 0x0127, TryCatch #0 {all -> 0x0127, blocks: (B:22:0x00be, B:24:0x00c2, B:25:0x00ce, B:26:0x00d2, B:28:0x00d8, B:31:0x00e1, B:35:0x00ed, B:37:0x00f1, B:52:0x00c9), top: B:21:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8 A[Catch: all -> 0x0127, TryCatch #0 {all -> 0x0127, blocks: (B:22:0x00be, B:24:0x00c2, B:25:0x00ce, B:26:0x00d2, B:28:0x00d8, B:31:0x00e1, B:35:0x00ed, B:37:0x00f1, B:52:0x00c9), top: B:21:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1 A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #0 {all -> 0x0127, blocks: (B:22:0x00be, B:24:0x00c2, B:25:0x00ce, B:26:0x00d2, B:28:0x00d8, B:31:0x00e1, B:35:0x00ed, B:37:0x00f1, B:52:0x00c9), top: B:21:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9 A[Catch: all -> 0x0127, TryCatch #0 {all -> 0x0127, blocks: (B:22:0x00be, B:24:0x00c2, B:25:0x00ce, B:26:0x00d2, B:28:0x00d8, B:31:0x00e1, B:35:0x00ed, B:37:0x00f1, B:52:0x00c9), top: B:21:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m(a aVar, String str, ContinuationImpl continuationImpl) {
        PromotionsStorageImpl$removePromotion$1 promotionsStorageImpl$removePromotion$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object obj;
        String str2;
        a aVar2;
        ftf0 ftf0Var;
        kotlinx.coroutines.sync.a aVar3;
        a aVar4;
        a aVar5;
        ftf0 ftf0Var2;
        g050 g050Var;
        String str3;
        Iterator it;
        Object obj2;
        Promotion promotion;
        ftf0 ftf0Var3;
        a aVar6;
        Promotion promotion2;
        if (continuationImpl instanceof PromotionsStorageImpl$removePromotion$1) {
            promotionsStorageImpl$removePromotion$1 = (PromotionsStorageImpl$removePromotion$1) continuationImpl;
            int i2 = promotionsStorageImpl$removePromotion$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promotionsStorageImpl$removePromotion$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = promotionsStorageImpl$removePromotion$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promotionsStorageImpl$removePromotion$1.label;
                if (i != 0) {
                    b.b(obj3);
                    ru.yandex.taxi.utils.storage.a aVar7 = aVar.a;
                    promotionsStorageImpl$removePromotion$1.L$0 = aVar;
                    promotionsStorageImpl$removePromotion$1.L$1 = str;
                    promotionsStorageImpl$removePromotion$1.L$2 = aVar;
                    promotionsStorageImpl$removePromotion$1.label = 1;
                    Object a = aVar7.a(promotionsStorageImpl$removePromotion$1);
                    if (a != coroutineSingletons) {
                        obj = a;
                        str2 = str;
                        aVar2 = aVar;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        promotion2 = (Promotion) promotionsStorageImpl$removePromotion$1.L$6;
                        ftf0Var3 = (ftf0) promotionsStorageImpl$removePromotion$1.L$3;
                        aVar6 = (a) promotionsStorageImpl$removePromotion$1.L$2;
                        b.b(obj3);
                        promotion = promotion2;
                        ftf0Var = ftf0Var3;
                        aVar5 = aVar6;
                        if (promotion != null) {
                            aVar5.a.b(ftf0Var);
                        }
                        return zy11.a;
                    }
                    g050Var = (g050) promotionsStorageImpl$removePromotion$1.L$5;
                    ftf0Var2 = (ftf0) promotionsStorageImpl$removePromotion$1.L$4;
                    ftf0Var = (ftf0) promotionsStorageImpl$removePromotion$1.L$3;
                    aVar5 = (a) promotionsStorageImpl$removePromotion$1.L$2;
                    str3 = (String) promotionsStorageImpl$removePromotion$1.L$1;
                    aVar4 = (a) promotionsStorageImpl$removePromotion$1.L$0;
                    b.b(obj3);
                    try {
                        Set set = ftf0Var2.a;
                        Set M0 = set == null ? kotlin.collections.a.M0(set) : new LinkedHashSet();
                        it = M0.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = it.next();
                                Promotion promotion3 = (Promotion) obj2;
                                if (promotion3 != null && jl40.l(str3, promotion3.getB())) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        promotion = (Promotion) obj2;
                        if (promotion != null) {
                            M0.remove(promotion);
                            ftf0Var2.a = M0;
                        }
                        if (promotion == null) {
                            promotion = null;
                        }
                        if (promotion != null) {
                            wls wlsVar = aVar4.d;
                            promotionsStorageImpl$removePromotion$1.L$0 = null;
                            promotionsStorageImpl$removePromotion$1.L$1 = null;
                            promotionsStorageImpl$removePromotion$1.L$2 = aVar5;
                            promotionsStorageImpl$removePromotion$1.L$3 = ftf0Var;
                            promotionsStorageImpl$removePromotion$1.L$4 = null;
                            promotionsStorageImpl$removePromotion$1.L$5 = null;
                            promotionsStorageImpl$removePromotion$1.L$6 = promotion;
                            promotionsStorageImpl$removePromotion$1.label = 3;
                            if (wlsVar.invoke(promotion, promotionsStorageImpl$removePromotion$1) != coroutineSingletons) {
                                ftf0Var3 = ftf0Var;
                                aVar6 = aVar5;
                                promotion2 = promotion;
                                promotion = promotion2;
                                ftf0Var = ftf0Var3;
                                aVar5 = aVar6;
                            }
                            return coroutineSingletons;
                        }
                        if (promotion != null) {
                        }
                        return zy11.a;
                    } finally {
                        g050Var.d(null);
                    }
                }
                a aVar8 = (a) promotionsStorageImpl$removePromotion$1.L$2;
                String str4 = (String) promotionsStorageImpl$removePromotion$1.L$1;
                a aVar9 = (a) promotionsStorageImpl$removePromotion$1.L$0;
                b.b(obj3);
                aVar2 = aVar8;
                aVar = aVar9;
                obj = obj3;
                str2 = str4;
                ftf0Var = (ftf0) obj;
                aVar3 = aVar.b;
                promotionsStorageImpl$removePromotion$1.L$0 = aVar;
                promotionsStorageImpl$removePromotion$1.L$1 = str2;
                promotionsStorageImpl$removePromotion$1.L$2 = aVar2;
                promotionsStorageImpl$removePromotion$1.L$3 = ftf0Var;
                promotionsStorageImpl$removePromotion$1.L$4 = ftf0Var;
                promotionsStorageImpl$removePromotion$1.L$5 = aVar3;
                promotionsStorageImpl$removePromotion$1.L$6 = null;
                promotionsStorageImpl$removePromotion$1.label = 2;
                if (aVar3.a(promotionsStorageImpl$removePromotion$1) != coroutineSingletons) {
                    aVar4 = aVar;
                    aVar5 = aVar2;
                    ftf0Var2 = ftf0Var;
                    g050Var = aVar3;
                    str3 = str2;
                    Set set2 = ftf0Var2.a;
                    if (set2 == null) {
                    }
                    it = M0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                        }
                    }
                    promotion = (Promotion) obj2;
                    if (promotion != null) {
                    }
                    if (promotion == null) {
                    }
                    if (promotion != null) {
                    }
                    if (promotion != null) {
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        promotionsStorageImpl$removePromotion$1 = new PromotionsStorageImpl$removePromotion$1(aVar, continuationImpl);
        Object obj32 = promotionsStorageImpl$removePromotion$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsStorageImpl$removePromotion$1.label;
        if (i != 0) {
        }
        ftf0Var = (ftf0) obj;
        aVar3 = aVar.b;
        promotionsStorageImpl$removePromotion$1.L$0 = aVar;
        promotionsStorageImpl$removePromotion$1.L$1 = str2;
        promotionsStorageImpl$removePromotion$1.L$2 = aVar2;
        promotionsStorageImpl$removePromotion$1.L$3 = ftf0Var;
        promotionsStorageImpl$removePromotion$1.L$4 = ftf0Var;
        promotionsStorageImpl$removePromotion$1.L$5 = aVar3;
        promotionsStorageImpl$removePromotion$1.L$6 = null;
        promotionsStorageImpl$removePromotion$1.label = 2;
        if (aVar3.a(promotionsStorageImpl$removePromotion$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
    
        if (r10.a(r0) == r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:18:0x0052, B:19:0x0099, B:21:0x009f, B:22:0x00a8, B:28:0x00a4), top: B:17:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a4 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:18:0x0052, B:19:0x0099, B:21:0x009f, B:22:0x00a8, B:28:0x00a4), top: B:17:0x0052 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r8v10, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object n(a aVar, Promotion promotion, ContinuationImpl continuationImpl) {
        PromotionsStorageImpl$savePromotion$1 promotionsStorageImpl$savePromotion$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar2;
        g050 g050Var;
        Object a;
        Promotion promotion2;
        a aVar3;
        try {
            if (continuationImpl instanceof PromotionsStorageImpl$savePromotion$1) {
                promotionsStorageImpl$savePromotion$1 = (PromotionsStorageImpl$savePromotion$1) continuationImpl;
                int i2 = promotionsStorageImpl$savePromotion$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    promotionsStorageImpl$savePromotion$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = promotionsStorageImpl$savePromotion$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = promotionsStorageImpl$savePromotion$1.label;
                    zy11 zy11Var = zy11.a;
                    if (i != 0) {
                        b.b(obj);
                        aVar2 = aVar.b;
                        promotionsStorageImpl$savePromotion$1.L$0 = aVar;
                        promotionsStorageImpl$savePromotion$1.L$1 = promotion;
                        promotionsStorageImpl$savePromotion$1.L$2 = aVar2;
                        promotionsStorageImpl$savePromotion$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                b.b(obj);
                                return zy11Var;
                            }
                            aVar = (a) promotionsStorageImpl$savePromotion$1.L$3;
                            g050Var = (g050) promotionsStorageImpl$savePromotion$1.L$2;
                            promotion2 = (Promotion) promotionsStorageImpl$savePromotion$1.L$1;
                            aVar3 = (a) promotionsStorageImpl$savePromotion$1.L$0;
                            try {
                                b.b(obj);
                                ftf0 ftf0Var = (ftf0) obj;
                                Set set = ftf0Var.a;
                                ftf0Var.a = set == null ? v4r0.i(set, promotion2) : Collections.singleton(promotion2);
                                aVar.a.b(ftf0Var);
                                g050Var.d(null);
                                wls wlsVar = aVar3.c;
                                promotionsStorageImpl$savePromotion$1.L$0 = null;
                                promotionsStorageImpl$savePromotion$1.L$1 = null;
                                promotionsStorageImpl$savePromotion$1.L$2 = null;
                                promotionsStorageImpl$savePromotion$1.L$3 = null;
                                promotionsStorageImpl$savePromotion$1.L$4 = null;
                                promotionsStorageImpl$savePromotion$1.label = 3;
                                ((PromotionsStorageImpl$promotionChangedListener$1) wlsVar).invoke(promotion2, promotionsStorageImpl$savePromotion$1);
                                return zy11Var != coroutineSingletons ? coroutineSingletons : zy11Var;
                            } catch (Throwable th) {
                                th = th;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r8 = (g050) promotionsStorageImpl$savePromotion$1.L$2;
                        promotion = (Promotion) promotionsStorageImpl$savePromotion$1.L$1;
                        a aVar4 = (a) promotionsStorageImpl$savePromotion$1.L$0;
                        b.b(obj);
                        aVar2 = r8;
                        aVar = aVar4;
                    }
                    ru.yandex.taxi.utils.storage.a aVar5 = aVar.a;
                    promotionsStorageImpl$savePromotion$1.L$0 = aVar;
                    promotionsStorageImpl$savePromotion$1.L$1 = promotion;
                    promotionsStorageImpl$savePromotion$1.L$2 = aVar2;
                    promotionsStorageImpl$savePromotion$1.L$3 = aVar;
                    promotionsStorageImpl$savePromotion$1.L$4 = null;
                    promotionsStorageImpl$savePromotion$1.label = 2;
                    a = aVar5.a(promotionsStorageImpl$savePromotion$1);
                    if (a != coroutineSingletons) {
                        promotion2 = promotion;
                        g050Var = aVar2;
                        obj = a;
                        aVar3 = aVar;
                        ftf0 ftf0Var2 = (ftf0) obj;
                        Set set2 = ftf0Var2.a;
                        ftf0Var2.a = set2 == null ? v4r0.i(set2, promotion2) : Collections.singleton(promotion2);
                        aVar.a.b(ftf0Var2);
                        g050Var.d(null);
                        wls wlsVar2 = aVar3.c;
                        promotionsStorageImpl$savePromotion$1.L$0 = null;
                        promotionsStorageImpl$savePromotion$1.L$1 = null;
                        promotionsStorageImpl$savePromotion$1.L$2 = null;
                        promotionsStorageImpl$savePromotion$1.L$3 = null;
                        promotionsStorageImpl$savePromotion$1.L$4 = null;
                        promotionsStorageImpl$savePromotion$1.label = 3;
                        ((PromotionsStorageImpl$promotionChangedListener$1) wlsVar2).invoke(promotion2, promotionsStorageImpl$savePromotion$1);
                        if (zy11Var != coroutineSingletons) {
                        }
                    }
                }
            }
            ru.yandex.taxi.utils.storage.a aVar52 = aVar.a;
            promotionsStorageImpl$savePromotion$1.L$0 = aVar;
            promotionsStorageImpl$savePromotion$1.L$1 = promotion;
            promotionsStorageImpl$savePromotion$1.L$2 = aVar2;
            promotionsStorageImpl$savePromotion$1.L$3 = aVar;
            promotionsStorageImpl$savePromotion$1.L$4 = null;
            promotionsStorageImpl$savePromotion$1.label = 2;
            a = aVar52.a(promotionsStorageImpl$savePromotion$1);
            if (a != coroutineSingletons) {
            }
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar2;
            g050Var.d(null);
            throw th;
        }
        promotionsStorageImpl$savePromotion$1 = new PromotionsStorageImpl$savePromotion$1(aVar, continuationImpl);
        Object obj2 = promotionsStorageImpl$savePromotion$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsStorageImpl$savePromotion$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
    
        if (r8.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v9, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object o(a aVar, List list, ContinuationImpl continuationImpl) {
        PromotionsStorageImpl$setPromotions$1 promotionsStorageImpl$setPromotions$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar2;
        g050 g050Var;
        Object a;
        List list2;
        try {
            if (continuationImpl instanceof PromotionsStorageImpl$setPromotions$1) {
                promotionsStorageImpl$setPromotions$1 = (PromotionsStorageImpl$setPromotions$1) continuationImpl;
                int i2 = promotionsStorageImpl$setPromotions$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    promotionsStorageImpl$setPromotions$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = promotionsStorageImpl$setPromotions$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = promotionsStorageImpl$setPromotions$1.label;
                    if (i != 0) {
                        b.b(obj);
                        aVar2 = aVar.b;
                        promotionsStorageImpl$setPromotions$1.L$0 = aVar;
                        promotionsStorageImpl$setPromotions$1.L$1 = list;
                        promotionsStorageImpl$setPromotions$1.L$2 = aVar2;
                        promotionsStorageImpl$setPromotions$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            aVar = (a) promotionsStorageImpl$setPromotions$1.L$3;
                            g050Var = (g050) promotionsStorageImpl$setPromotions$1.L$2;
                            list2 = (List) promotionsStorageImpl$setPromotions$1.L$1;
                            try {
                                b.b(obj);
                                ftf0 ftf0Var = (ftf0) obj;
                                ftf0Var.getClass();
                                ftf0Var.a = kotlin.collections.a.N0(list2);
                                aVar.a.b(ftf0Var);
                                g050Var.d(null);
                                return zy11.a;
                            } catch (Throwable th) {
                                th = th;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r6 = (g050) promotionsStorageImpl$setPromotions$1.L$2;
                        list = (List) promotionsStorageImpl$setPromotions$1.L$1;
                        a aVar3 = (a) promotionsStorageImpl$setPromotions$1.L$0;
                        b.b(obj);
                        aVar2 = r6;
                        aVar = aVar3;
                    }
                    ru.yandex.taxi.utils.storage.a aVar4 = aVar.a;
                    promotionsStorageImpl$setPromotions$1.L$0 = null;
                    promotionsStorageImpl$setPromotions$1.L$1 = list;
                    promotionsStorageImpl$setPromotions$1.L$2 = aVar2;
                    promotionsStorageImpl$setPromotions$1.L$3 = aVar;
                    promotionsStorageImpl$setPromotions$1.L$4 = null;
                    promotionsStorageImpl$setPromotions$1.label = 2;
                    a = aVar4.a(promotionsStorageImpl$setPromotions$1);
                    if (a != coroutineSingletons) {
                        list2 = list;
                        g050Var = aVar2;
                        obj = a;
                        ftf0 ftf0Var2 = (ftf0) obj;
                        ftf0Var2.getClass();
                        ftf0Var2.a = kotlin.collections.a.N0(list2);
                        aVar.a.b(ftf0Var2);
                        g050Var.d(null);
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
            }
            ru.yandex.taxi.utils.storage.a aVar42 = aVar.a;
            promotionsStorageImpl$setPromotions$1.L$0 = null;
            promotionsStorageImpl$setPromotions$1.L$1 = list;
            promotionsStorageImpl$setPromotions$1.L$2 = aVar2;
            promotionsStorageImpl$setPromotions$1.L$3 = aVar;
            promotionsStorageImpl$setPromotions$1.L$4 = null;
            promotionsStorageImpl$setPromotions$1.label = 2;
            a = aVar42.a(promotionsStorageImpl$setPromotions$1);
            if (a != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar2;
            g050Var.d(null);
            throw th;
        }
        promotionsStorageImpl$setPromotions$1 = new PromotionsStorageImpl$setPromotions$1(aVar, continuationImpl);
        Object obj2 = promotionsStorageImpl$setPromotions$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsStorageImpl$setPromotions$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x006b, code lost:
    
        if (r8.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:12:0x003b, B:13:0x0086, B:15:0x008c, B:21:0x0095, B:23:0x0099, B:24:0x00a5, B:26:0x00a0), top: B:11:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095 A[Catch: all -> 0x003f, TryCatch #1 {all -> 0x003f, blocks: (B:12:0x003b, B:13:0x0086, B:15:0x008c, B:21:0x0095, B:23:0x0099, B:24:0x00a5, B:26:0x00a0), top: B:11:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v9, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object p(a aVar, Promotion promotion, ContinuationImpl continuationImpl) {
        PromotionsStorageImpl$updatePromotion$1 promotionsStorageImpl$updatePromotion$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.coroutines.sync.a aVar2;
        g050 g050Var;
        Object a;
        Promotion promotion2;
        Set set;
        try {
            if (continuationImpl instanceof PromotionsStorageImpl$updatePromotion$1) {
                promotionsStorageImpl$updatePromotion$1 = (PromotionsStorageImpl$updatePromotion$1) continuationImpl;
                int i2 = promotionsStorageImpl$updatePromotion$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    promotionsStorageImpl$updatePromotion$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = promotionsStorageImpl$updatePromotion$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = promotionsStorageImpl$updatePromotion$1.label;
                    if (i != 0) {
                        b.b(obj);
                        aVar2 = aVar.b;
                        promotionsStorageImpl$updatePromotion$1.L$0 = aVar;
                        promotionsStorageImpl$updatePromotion$1.L$1 = promotion;
                        promotionsStorageImpl$updatePromotion$1.L$2 = aVar2;
                        promotionsStorageImpl$updatePromotion$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            aVar = (a) promotionsStorageImpl$updatePromotion$1.L$3;
                            g050Var = (g050) promotionsStorageImpl$updatePromotion$1.L$2;
                            promotion2 = (Promotion) promotionsStorageImpl$updatePromotion$1.L$1;
                            try {
                                b.b(obj);
                                ftf0 ftf0Var = (ftf0) obj;
                                set = ftf0Var.a;
                                if (set == null ? set.contains(promotion2) : false) {
                                    Set set2 = ftf0Var.a;
                                    Set M0 = set2 != null ? kotlin.collections.a.M0(set2) : new LinkedHashSet();
                                    M0.remove(promotion2);
                                    M0.add(promotion2);
                                    ftf0Var.a = M0;
                                    aVar.a.b(ftf0Var);
                                }
                                g050Var.d(null);
                                return zy11.a;
                            } catch (Throwable th) {
                                th = th;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r6 = (g050) promotionsStorageImpl$updatePromotion$1.L$2;
                        promotion = (Promotion) promotionsStorageImpl$updatePromotion$1.L$1;
                        a aVar3 = (a) promotionsStorageImpl$updatePromotion$1.L$0;
                        b.b(obj);
                        aVar2 = r6;
                        aVar = aVar3;
                    }
                    ru.yandex.taxi.utils.storage.a aVar4 = aVar.a;
                    promotionsStorageImpl$updatePromotion$1.L$0 = null;
                    promotionsStorageImpl$updatePromotion$1.L$1 = promotion;
                    promotionsStorageImpl$updatePromotion$1.L$2 = aVar2;
                    promotionsStorageImpl$updatePromotion$1.L$3 = aVar;
                    promotionsStorageImpl$updatePromotion$1.L$4 = null;
                    promotionsStorageImpl$updatePromotion$1.label = 2;
                    a = aVar4.a(promotionsStorageImpl$updatePromotion$1);
                    if (a != coroutineSingletons) {
                        promotion2 = promotion;
                        g050Var = aVar2;
                        obj = a;
                        ftf0 ftf0Var2 = (ftf0) obj;
                        set = ftf0Var2.a;
                        if (set == null ? set.contains(promotion2) : false) {
                        }
                        g050Var.d(null);
                        return zy11.a;
                    }
                    return coroutineSingletons;
                }
            }
            ru.yandex.taxi.utils.storage.a aVar42 = aVar.a;
            promotionsStorageImpl$updatePromotion$1.L$0 = null;
            promotionsStorageImpl$updatePromotion$1.L$1 = promotion;
            promotionsStorageImpl$updatePromotion$1.L$2 = aVar2;
            promotionsStorageImpl$updatePromotion$1.L$3 = aVar;
            promotionsStorageImpl$updatePromotion$1.L$4 = null;
            promotionsStorageImpl$updatePromotion$1.label = 2;
            a = aVar42.a(promotionsStorageImpl$updatePromotion$1);
            if (a != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar2;
            g050Var.d(null);
            throw th;
        }
        promotionsStorageImpl$updatePromotion$1 = new PromotionsStorageImpl$updatePromotion$1(aVar, continuationImpl);
        Object obj2 = promotionsStorageImpl$updatePromotion$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promotionsStorageImpl$updatePromotion$1.label;
        if (i != 0) {
        }
    }

    @Override // defpackage.ctf0
    public final Object a(Promotion promotion, ContinuationImpl continuationImpl) {
        return n(this, promotion, continuationImpl);
    }

    @Override // defpackage.ctf0
    public final Object b(Promotion promotion, ContinuationImpl continuationImpl) {
        return p(this, promotion, continuationImpl);
    }

    @Override // defpackage.ctf0
    public final Object c(String str, ContinuationImpl continuationImpl) {
        return m(this, str, continuationImpl);
    }

    @Override // defpackage.ctf0
    public final Object d(List list, ContinuationImpl continuationImpl) {
        return o(this, list, continuationImpl);
    }

    @Override // defpackage.ctf0
    public final Object e(ContinuationImpl continuationImpl) {
        return k(this, continuationImpl);
    }

    @Override // defpackage.ctf0
    public final Object f(wls wlsVar, ContinuationImpl continuationImpl) {
        this.d = wlsVar;
        return zy11.a;
    }

    @Override // defpackage.ctf0
    public final Object g(String str, ContinuationImpl continuationImpl) {
        return j(this, str, continuationImpl);
    }

    @Override // defpackage.ctf0
    public final Object h(ContinuationImpl continuationImpl) {
        return i(this, continuationImpl);
    }
}
