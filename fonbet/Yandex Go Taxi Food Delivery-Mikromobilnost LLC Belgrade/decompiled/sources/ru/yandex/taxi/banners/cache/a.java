package ru.yandex.taxi.banners.cache;

import defpackage.ctf0;
import defpackage.fb7;
import defpackage.g050;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.ir4;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes9.dex */
public final class a implements ctf0 {
    public final b a;
    public final ir4 b;
    public final fb7 c;
    public final tt2 d;
    public ctf0 e;
    public final kotlinx.coroutines.sync.a f = gtq0.a();

    public a(b bVar, ir4 ir4Var, fb7 fb7Var, tt2 tt2Var) {
        this.a = bVar;
        this.b = ir4Var;
        this.c = fb7Var;
        this.d = tt2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (m(r8, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.ctf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Promotion promotion, ContinuationImpl continuationImpl) {
        BannersCache$savePromotion$1 bannersCache$savePromotion$1;
        Object obj;
        Object obj2;
        int i;
        Promotion promotion2;
        if (continuationImpl instanceof BannersCache$savePromotion$1) {
            bannersCache$savePromotion$1 = (BannersCache$savePromotion$1) continuationImpl;
            int i2 = bannersCache$savePromotion$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersCache$savePromotion$1.label = i2 - Integer.MIN_VALUE;
                obj = bannersCache$savePromotion$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersCache$savePromotion$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bannersCache$savePromotion$1.L$0 = promotion;
                    bannersCache$savePromotion$1.label = 1;
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
                        promotion2 = (Promotion) bannersCache$savePromotion$1.L$0;
                        kotlin.b.b(obj);
                        bannersCache$savePromotion$1.L$0 = null;
                        bannersCache$savePromotion$1.label = 3;
                        Object a = ((ctf0) obj).a(promotion2, bannersCache$savePromotion$1);
                        return a != obj2 ? obj2 : a;
                    }
                    promotion = (Promotion) bannersCache$savePromotion$1.L$0;
                    kotlin.b.b(obj);
                }
                bannersCache$savePromotion$1.L$0 = promotion;
                bannersCache$savePromotion$1.label = 2;
                obj = j(bannersCache$savePromotion$1);
                if (obj != obj2) {
                    promotion2 = promotion;
                    bannersCache$savePromotion$1.L$0 = null;
                    bannersCache$savePromotion$1.label = 3;
                    Object a2 = ((ctf0) obj).a(promotion2, bannersCache$savePromotion$1);
                    if (a2 != obj2) {
                    }
                }
            }
        }
        bannersCache$savePromotion$1 = new BannersCache$savePromotion$1(this, continuationImpl);
        obj = bannersCache$savePromotion$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersCache$savePromotion$1.label;
        if (i != 0) {
        }
        bannersCache$savePromotion$1.L$0 = promotion;
        bannersCache$savePromotion$1.label = 2;
        obj = j(bannersCache$savePromotion$1);
        if (obj != obj2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ctf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Promotion promotion, ContinuationImpl continuationImpl) {
        BannersCache$updatePromotion$1 bannersCache$updatePromotion$1;
        int i;
        if (continuationImpl instanceof BannersCache$updatePromotion$1) {
            bannersCache$updatePromotion$1 = (BannersCache$updatePromotion$1) continuationImpl;
            int i2 = bannersCache$updatePromotion$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersCache$updatePromotion$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bannersCache$updatePromotion$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersCache$updatePromotion$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bannersCache$updatePromotion$1.L$0 = promotion;
                    bannersCache$updatePromotion$1.label = 1;
                    obj = j(bannersCache$updatePromotion$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    promotion = (Promotion) bannersCache$updatePromotion$1.L$0;
                    kotlin.b.b(obj);
                }
                bannersCache$updatePromotion$1.L$0 = null;
                bannersCache$updatePromotion$1.label = 2;
                Object b = ((ctf0) obj).b(promotion, bannersCache$updatePromotion$1);
                return b != obj2 ? obj2 : b;
            }
        }
        bannersCache$updatePromotion$1 = new BannersCache$updatePromotion$1(this, continuationImpl);
        Object obj3 = bannersCache$updatePromotion$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersCache$updatePromotion$1.label;
        if (i != 0) {
        }
        bannersCache$updatePromotion$1.L$0 = null;
        bannersCache$updatePromotion$1.label = 2;
        Object b2 = ((ctf0) obj3).b(promotion, bannersCache$updatePromotion$1);
        if (b2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a6, code lost:
    
        if (l(r10, r0) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (((defpackage.ctf0) r11).c(r2, r0) != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (r11 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.ctf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, ContinuationImpl continuationImpl) {
        BannersCache$removePromotion$1 bannersCache$removePromotion$1;
        Object obj;
        int i;
        Object j;
        String str2;
        Promotion promotion;
        if (continuationImpl instanceof BannersCache$removePromotion$1) {
            bannersCache$removePromotion$1 = (BannersCache$removePromotion$1) continuationImpl;
            int i2 = bannersCache$removePromotion$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersCache$removePromotion$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = bannersCache$removePromotion$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersCache$removePromotion$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    bannersCache$removePromotion$1.L$0 = str;
                    bannersCache$removePromotion$1.label = 1;
                    obj2 = g(str, bannersCache$removePromotion$1);
                } else if (i == 1) {
                    str = (String) bannersCache$removePromotion$1.L$0;
                    kotlin.b.b(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj2);
                            return zy11.a;
                        }
                        promotion = (Promotion) bannersCache$removePromotion$1.L$1;
                        kotlin.b.b(obj2);
                        if (promotion != null) {
                            List b = promotion.b();
                            bannersCache$removePromotion$1.L$0 = null;
                            bannersCache$removePromotion$1.L$1 = null;
                            bannersCache$removePromotion$1.L$2 = null;
                            bannersCache$removePromotion$1.label = 4;
                        }
                        return zy11.a;
                    }
                    promotion = (Promotion) bannersCache$removePromotion$1.L$1;
                    str2 = (String) bannersCache$removePromotion$1.L$0;
                    kotlin.b.b(obj2);
                    bannersCache$removePromotion$1.L$0 = null;
                    bannersCache$removePromotion$1.L$1 = promotion;
                    bannersCache$removePromotion$1.label = 3;
                }
                Promotion promotion2 = (Promotion) obj2;
                bannersCache$removePromotion$1.L$0 = str;
                bannersCache$removePromotion$1.L$1 = promotion2;
                bannersCache$removePromotion$1.label = 2;
                j = j(bannersCache$removePromotion$1);
                if (j != obj) {
                    str2 = str;
                    promotion = promotion2;
                    obj2 = j;
                    bannersCache$removePromotion$1.L$0 = null;
                    bannersCache$removePromotion$1.L$1 = promotion;
                    bannersCache$removePromotion$1.label = 3;
                }
                return obj;
            }
        }
        bannersCache$removePromotion$1 = new BannersCache$removePromotion$1(this, continuationImpl);
        Object obj22 = bannersCache$removePromotion$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersCache$removePromotion$1.label;
        if (i != 0) {
        }
        Promotion promotion22 = (Promotion) obj22;
        bannersCache$removePromotion$1.L$0 = str;
        bannersCache$removePromotion$1.L$1 = promotion22;
        bannersCache$removePromotion$1.label = 2;
        j = j(bannersCache$removePromotion$1);
        if (j != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.ctf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(List list, ContinuationImpl continuationImpl) {
        BannersCache$setPromotions$1 bannersCache$setPromotions$1;
        int i;
        List list2;
        Iterator it;
        List list3;
        if (continuationImpl instanceof BannersCache$setPromotions$1) {
            bannersCache$setPromotions$1 = (BannersCache$setPromotions$1) continuationImpl;
            int i2 = bannersCache$setPromotions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersCache$setPromotions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bannersCache$setPromotions$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersCache$setPromotions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    list2 = list;
                    it = list.iterator();
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
                        list3 = (List) bannersCache$setPromotions$1.L$0;
                        kotlin.b.b(obj);
                        bannersCache$setPromotions$1.L$0 = null;
                        bannersCache$setPromotions$1.label = 3;
                        Object d = ((ctf0) obj).d(list3, bannersCache$setPromotions$1);
                        return d == obj2 ? obj2 : d;
                    }
                    it = (Iterator) bannersCache$setPromotions$1.L$2;
                    List list4 = (List) bannersCache$setPromotions$1.L$0;
                    kotlin.b.b(obj);
                    list2 = list4;
                }
                while (true) {
                    if (it.hasNext()) {
                        bannersCache$setPromotions$1.L$0 = list2;
                        bannersCache$setPromotions$1.L$1 = null;
                        bannersCache$setPromotions$1.L$2 = null;
                        bannersCache$setPromotions$1.L$3 = null;
                        bannersCache$setPromotions$1.L$4 = null;
                        bannersCache$setPromotions$1.label = 2;
                        Object j = j(bannersCache$setPromotions$1);
                        if (j != obj2) {
                            List list5 = list2;
                            obj = j;
                            list3 = list5;
                        }
                    } else {
                        Promotion promotion = (Promotion) it.next();
                        bannersCache$setPromotions$1.L$0 = list2;
                        bannersCache$setPromotions$1.L$1 = null;
                        bannersCache$setPromotions$1.L$2 = it;
                        bannersCache$setPromotions$1.L$3 = null;
                        bannersCache$setPromotions$1.L$4 = null;
                        bannersCache$setPromotions$1.label = 1;
                        if (m(promotion, bannersCache$setPromotions$1) == obj2) {
                            break;
                        }
                    }
                }
            }
        }
        bannersCache$setPromotions$1 = new BannersCache$setPromotions$1(this, continuationImpl);
        Object obj3 = bannersCache$setPromotions$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersCache$setPromotions$1.label;
        if (i != 0) {
        }
        while (true) {
            if (it.hasNext()) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ctf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ContinuationImpl continuationImpl) {
        BannersCache$loadInMemCache$1 bannersCache$loadInMemCache$1;
        int i;
        if (continuationImpl instanceof BannersCache$loadInMemCache$1) {
            bannersCache$loadInMemCache$1 = (BannersCache$loadInMemCache$1) continuationImpl;
            int i2 = bannersCache$loadInMemCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersCache$loadInMemCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bannersCache$loadInMemCache$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersCache$loadInMemCache$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bannersCache$loadInMemCache$1.label = 1;
                    obj = j(bannersCache$loadInMemCache$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                bannersCache$loadInMemCache$1.label = 2;
                Object e = ((ctf0) obj).e(bannersCache$loadInMemCache$1);
                return e != obj2 ? obj2 : e;
            }
        }
        bannersCache$loadInMemCache$1 = new BannersCache$loadInMemCache$1(this, continuationImpl);
        Object obj3 = bannersCache$loadInMemCache$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersCache$loadInMemCache$1.label;
        if (i != 0) {
        }
        bannersCache$loadInMemCache$1.label = 2;
        Object e2 = ((ctf0) obj3).e(bannersCache$loadInMemCache$1);
        if (e2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ctf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(wls wlsVar, ContinuationImpl continuationImpl) {
        BannersCache$setPromotionRemovedListener$1 bannersCache$setPromotionRemovedListener$1;
        int i;
        if (continuationImpl instanceof BannersCache$setPromotionRemovedListener$1) {
            bannersCache$setPromotionRemovedListener$1 = (BannersCache$setPromotionRemovedListener$1) continuationImpl;
            int i2 = bannersCache$setPromotionRemovedListener$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersCache$setPromotionRemovedListener$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bannersCache$setPromotionRemovedListener$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersCache$setPromotionRemovedListener$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bannersCache$setPromotionRemovedListener$1.L$0 = wlsVar;
                    bannersCache$setPromotionRemovedListener$1.label = 1;
                    obj = j(bannersCache$setPromotionRemovedListener$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    wlsVar = (wls) bannersCache$setPromotionRemovedListener$1.L$0;
                    kotlin.b.b(obj);
                }
                bannersCache$setPromotionRemovedListener$1.L$0 = null;
                bannersCache$setPromotionRemovedListener$1.label = 2;
                Object f = ((ctf0) obj).f(wlsVar, bannersCache$setPromotionRemovedListener$1);
                return f != obj2 ? obj2 : f;
            }
        }
        bannersCache$setPromotionRemovedListener$1 = new BannersCache$setPromotionRemovedListener$1(this, continuationImpl);
        Object obj3 = bannersCache$setPromotionRemovedListener$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersCache$setPromotionRemovedListener$1.label;
        if (i != 0) {
        }
        bannersCache$setPromotionRemovedListener$1.L$0 = null;
        bannersCache$setPromotionRemovedListener$1.label = 2;
        Object f2 = ((ctf0) obj3).f(wlsVar, bannersCache$setPromotionRemovedListener$1);
        if (f2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.ctf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, ContinuationImpl continuationImpl) {
        BannersCache$getPromotion$1 bannersCache$getPromotion$1;
        int i;
        if (continuationImpl instanceof BannersCache$getPromotion$1) {
            bannersCache$getPromotion$1 = (BannersCache$getPromotion$1) continuationImpl;
            int i2 = bannersCache$getPromotion$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersCache$getPromotion$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bannersCache$getPromotion$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersCache$getPromotion$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bannersCache$getPromotion$1.L$0 = str;
                    bannersCache$getPromotion$1.label = 1;
                    obj = j(bannersCache$getPromotion$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    str = (String) bannersCache$getPromotion$1.L$0;
                    kotlin.b.b(obj);
                }
                bannersCache$getPromotion$1.L$0 = null;
                bannersCache$getPromotion$1.label = 2;
                Object g = ((ctf0) obj).g(str, bannersCache$getPromotion$1);
                return g != obj2 ? obj2 : g;
            }
        }
        bannersCache$getPromotion$1 = new BannersCache$getPromotion$1(this, continuationImpl);
        Object obj3 = bannersCache$getPromotion$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersCache$getPromotion$1.label;
        if (i != 0) {
        }
        bannersCache$getPromotion$1.L$0 = null;
        bannersCache$getPromotion$1.label = 2;
        Object g2 = ((ctf0) obj3).g(str, bannersCache$getPromotion$1);
        if (g2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.ctf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        BannersCache$getAllPromotions$1 bannersCache$getAllPromotions$1;
        int i;
        if (continuationImpl instanceof BannersCache$getAllPromotions$1) {
            bannersCache$getAllPromotions$1 = (BannersCache$getAllPromotions$1) continuationImpl;
            int i2 = bannersCache$getAllPromotions$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersCache$getAllPromotions$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bannersCache$getAllPromotions$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersCache$getAllPromotions$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bannersCache$getAllPromotions$1.label = 1;
                    obj = j(bannersCache$getAllPromotions$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                bannersCache$getAllPromotions$1.label = 2;
                Object h = ((ctf0) obj).h(bannersCache$getAllPromotions$1);
                return h != obj2 ? obj2 : h;
            }
        }
        bannersCache$getAllPromotions$1 = new BannersCache$getAllPromotions$1(this, continuationImpl);
        Object obj3 = bannersCache$getAllPromotions$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersCache$getAllPromotions$1.label;
        if (i != 0) {
        }
        bannersCache$getAllPromotions$1.label = 2;
        Object h2 = ((ctf0) obj3).h(bannersCache$getAllPromotions$1);
        if (h2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        if (r10 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x005f, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(ListBuilder listBuilder, ContinuationImpl continuationImpl) {
        BannersCache$cleanUp$1 bannersCache$cleanUp$1;
        int i;
        Collection collection;
        Collection collection2;
        if (continuationImpl instanceof BannersCache$cleanUp$1) {
            bannersCache$cleanUp$1 = (BannersCache$cleanUp$1) continuationImpl;
            int i2 = bannersCache$cleanUp$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersCache$cleanUp$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bannersCache$cleanUp$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersCache$cleanUp$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bannersCache$cleanUp$1.L$0 = listBuilder;
                    bannersCache$cleanUp$1.label = 1;
                    obj = j(bannersCache$cleanUp$1);
                    collection = listBuilder;
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
                        Collection collection3 = (List) bannersCache$cleanUp$1.L$0;
                        kotlin.b.b(obj);
                        collection2 = collection3;
                        Set N0 = kotlin.collections.a.N0(collection2);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : (List) obj) {
                            Promotion promotion = (Promotion) obj3;
                            if (!N0.contains(promotion) && promotion.getE()) {
                                arrayList.add(obj3);
                            }
                        }
                        bannersCache$cleanUp$1.L$0 = null;
                        bannersCache$cleanUp$1.L$1 = null;
                        bannersCache$cleanUp$1.L$2 = null;
                        bannersCache$cleanUp$1.L$3 = null;
                        bannersCache$cleanUp$1.label = 3;
                        Object k = k(arrayList, bannersCache$cleanUp$1);
                        return k == obj2 ? obj2 : k;
                    }
                    Collection collection4 = (List) bannersCache$cleanUp$1.L$0;
                    kotlin.b.b(obj);
                    collection = collection4;
                }
                bannersCache$cleanUp$1.L$0 = collection;
                bannersCache$cleanUp$1.label = 2;
                obj = ((ctf0) obj).h(bannersCache$cleanUp$1);
                collection2 = collection;
            }
        }
        bannersCache$cleanUp$1 = new BannersCache$cleanUp$1(this, continuationImpl);
        Object obj4 = bannersCache$cleanUp$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersCache$cleanUp$1.label;
        if (i != 0) {
        }
        bannersCache$cleanUp$1.L$0 = collection;
        bannersCache$cleanUp$1.label = 2;
        obj4 = ((ctf0) obj4).h(bannersCache$cleanUp$1);
        collection2 = collection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0051, code lost:
    
        if (r7.a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c A[Catch: all -> 0x007c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007c, blocks: (B:27:0x0054, B:31:0x005c), top: B:26:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v5, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(ContinuationImpl continuationImpl) {
        BannersCache$getDelegate$1 bannersCache$getDelegate$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        g050 g050Var;
        ctf0 ctf0Var;
        a aVar2;
        ctf0 ctf0Var2;
        try {
            if (continuationImpl instanceof BannersCache$getDelegate$1) {
                bannersCache$getDelegate$1 = (BannersCache$getDelegate$1) continuationImpl;
                int i2 = bannersCache$getDelegate$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bannersCache$getDelegate$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = bannersCache$getDelegate$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bannersCache$getDelegate$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = this.f;
                        bannersCache$getDelegate$1.L$0 = aVar;
                        bannersCache$getDelegate$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            aVar2 = (a) bannersCache$getDelegate$1.L$1;
                            g050Var = (g050) bannersCache$getDelegate$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                aVar2.e = (ctf0) obj;
                                g050Var.d(null);
                                ctf0Var2 = this.e;
                                if (ctf0Var2 != null) {
                                    return null;
                                }
                                return ctf0Var2;
                            } catch (Throwable th) {
                                th = th;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r2 = (g050) bannersCache$getDelegate$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r2;
                    }
                    ctf0Var = this.e;
                    if (ctf0Var == null) {
                        aVar.d(null);
                        return ctf0Var;
                    }
                    b bVar = this.a;
                    bannersCache$getDelegate$1.L$0 = aVar;
                    bannersCache$getDelegate$1.L$1 = this;
                    bannersCache$getDelegate$1.label = 2;
                    Object a = bVar.a(bannersCache$getDelegate$1);
                    if (a != coroutineSingletons) {
                        g050Var = aVar;
                        obj = a;
                        aVar2 = this;
                        aVar2.e = (ctf0) obj;
                        g050Var.d(null);
                        ctf0Var2 = this.e;
                        if (ctf0Var2 != null) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            ctf0Var = this.e;
            if (ctf0Var == null) {
            }
        } catch (Throwable th2) {
            th = th2;
            g050Var = aVar;
            g050Var.d(null);
            throw th;
        }
        bannersCache$getDelegate$1 = new BannersCache$getDelegate$1(this, continuationImpl);
        Object obj2 = bannersCache$getDelegate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersCache$getDelegate$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r10v0, types: [ru.yandex.taxi.banners.cache.a] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d1 -> B:17:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(ArrayList arrayList, ContinuationImpl continuationImpl) {
        BannersCache$remove$1 bannersCache$remove$1;
        int i;
        ArrayList t;
        Iterator it;
        Promotion promotion;
        ArrayList arrayList2;
        Iterator it2;
        String b;
        if (continuationImpl instanceof BannersCache$remove$1) {
            bannersCache$remove$1 = (BannersCache$remove$1) continuationImpl;
            int i2 = bannersCache$remove$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersCache$remove$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bannersCache$remove$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersCache$remove$1.label;
                if (i != 0) {
                    t = g8e.t(obj);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ycc.r(((Promotion) it3.next()).b(), t);
                    }
                    it = arrayList.iterator();
                } else {
                    if (i == 1) {
                        promotion = (Promotion) bannersCache$remove$1.L$5;
                        it2 = (Iterator) bannersCache$remove$1.L$3;
                        ?? r7 = (List) bannersCache$remove$1.L$1;
                        kotlin.b.b(obj);
                        arrayList2 = r7;
                        b = promotion.getB();
                        bannersCache$remove$1.L$0 = null;
                        bannersCache$remove$1.L$1 = arrayList2;
                        bannersCache$remove$1.L$2 = null;
                        bannersCache$remove$1.L$3 = it2;
                        bannersCache$remove$1.L$4 = null;
                        bannersCache$remove$1.L$5 = null;
                        bannersCache$remove$1.label = 2;
                        if (((ctf0) obj).c(b, bannersCache$remove$1) != coroutineSingletons) {
                            it = it2;
                            t = arrayList2;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    it = (Iterator) bannersCache$remove$1.L$3;
                    ?? r2 = (List) bannersCache$remove$1.L$1;
                    kotlin.b.b(obj);
                    t = r2;
                }
                if (it.hasNext()) {
                    bannersCache$remove$1.L$0 = null;
                    bannersCache$remove$1.L$1 = null;
                    bannersCache$remove$1.L$2 = null;
                    bannersCache$remove$1.L$3 = null;
                    bannersCache$remove$1.L$4 = null;
                    bannersCache$remove$1.L$5 = null;
                    bannersCache$remove$1.label = 3;
                    Object l = l(t, bannersCache$remove$1);
                    if (l != coroutineSingletons) {
                        return l;
                    }
                } else {
                    Promotion promotion2 = (Promotion) it.next();
                    bannersCache$remove$1.L$0 = null;
                    bannersCache$remove$1.L$1 = t;
                    bannersCache$remove$1.L$2 = null;
                    bannersCache$remove$1.L$3 = it;
                    bannersCache$remove$1.L$4 = null;
                    bannersCache$remove$1.L$5 = promotion2;
                    bannersCache$remove$1.label = 1;
                    Object j = j(bannersCache$remove$1);
                    if (j != coroutineSingletons) {
                        it2 = it;
                        promotion = promotion2;
                        arrayList2 = t;
                        obj = j;
                        b = promotion.getB();
                        bannersCache$remove$1.L$0 = null;
                        bannersCache$remove$1.L$1 = arrayList2;
                        bannersCache$remove$1.L$2 = null;
                        bannersCache$remove$1.L$3 = it2;
                        bannersCache$remove$1.L$4 = null;
                        bannersCache$remove$1.L$5 = null;
                        bannersCache$remove$1.label = 2;
                        if (((ctf0) obj).c(b, bannersCache$remove$1) != coroutineSingletons) {
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
        bannersCache$remove$1 = new BannersCache$remove$1(this, continuationImpl);
        Object obj2 = bannersCache$remove$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersCache$remove$1.label;
        if (i != 0) {
        }
        if (it.hasNext()) {
        }
        return coroutineSingletons2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0069, code lost:
    
        if (r9 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005b, code lost:
    
        if (r9 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(List list, ContinuationImpl continuationImpl) {
        BannersCache$removeAssets$1 bannersCache$removeAssets$1;
        int i;
        if (continuationImpl instanceof BannersCache$removeAssets$1) {
            bannersCache$removeAssets$1 = (BannersCache$removeAssets$1) continuationImpl;
            int i2 = bannersCache$removeAssets$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersCache$removeAssets$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bannersCache$removeAssets$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersCache$removeAssets$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bannersCache$removeAssets$1.L$0 = list;
                    bannersCache$removeAssets$1.label = 1;
                    obj = j(bannersCache$removeAssets$1);
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
                        list = (List) bannersCache$removeAssets$1.L$0;
                        kotlin.b.b(obj);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = ((Iterable) obj).iterator();
                        while (it.hasNext()) {
                            ycc.r(((Promotion) it.next()).b(), arrayList);
                        }
                        Set N0 = kotlin.collections.a.N0(arrayList);
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list) {
                            if (!N0.contains((String) obj3)) {
                                arrayList2.add(obj3);
                            }
                        }
                        bannersCache$removeAssets$1.L$0 = null;
                        bannersCache$removeAssets$1.L$1 = null;
                        bannersCache$removeAssets$1.L$2 = null;
                        bannersCache$removeAssets$1.label = 3;
                        this.d.getClass();
                        sjh sjhVar = uyj.a;
                        Object k0 = tje.k0(mdh.b, new BannersCache$forceRemoveAssets$2(arrayList2, this, null), bannersCache$removeAssets$1);
                        if (k0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            k0 = zy11.a;
                        }
                        return k0 == obj2 ? obj2 : k0;
                    }
                    list = (List) bannersCache$removeAssets$1.L$0;
                    kotlin.b.b(obj);
                }
                bannersCache$removeAssets$1.L$0 = list;
                bannersCache$removeAssets$1.label = 2;
                obj = ((ctf0) obj).h(bannersCache$removeAssets$1);
            }
        }
        bannersCache$removeAssets$1 = new BannersCache$removeAssets$1(this, continuationImpl);
        Object obj4 = bannersCache$removeAssets$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersCache$removeAssets$1.label;
        if (i != 0) {
        }
        bannersCache$removeAssets$1.L$0 = list;
        bannersCache$removeAssets$1.label = 2;
        obj4 = ((ctf0) obj4).h(bannersCache$removeAssets$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Promotion promotion, ContinuationImpl continuationImpl) {
        BannersCache$updateBannerAssets$1 bannersCache$updateBannerAssets$1;
        int i;
        Set set;
        Set N0;
        List b;
        if (continuationImpl instanceof BannersCache$updateBannerAssets$1) {
            bannersCache$updateBannerAssets$1 = (BannersCache$updateBannerAssets$1) continuationImpl;
            int i2 = bannersCache$updateBannerAssets$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannersCache$updateBannerAssets$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bannersCache$updateBannerAssets$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannersCache$updateBannerAssets$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Set N02 = kotlin.collections.a.N0(promotion.b());
                    String b2 = promotion.getB();
                    bannersCache$updateBannerAssets$1.L$0 = null;
                    bannersCache$updateBannerAssets$1.L$1 = N02;
                    bannersCache$updateBannerAssets$1.label = 1;
                    Object g = g(b2, bannersCache$updateBannerAssets$1);
                    if (g != obj2) {
                        obj = g;
                        set = N02;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                set = (Set) bannersCache$updateBannerAssets$1.L$1;
                kotlin.b.b(obj);
                Promotion promotion2 = (Promotion) obj;
                N0 = (promotion2 != null || (b = promotion2.b()) == null) ? null : kotlin.collections.a.N0(b);
                if (N0 == null) {
                    N0 = EmptySet.a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : N0) {
                    if (!set.contains((String) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                bannersCache$updateBannerAssets$1.L$0 = null;
                bannersCache$updateBannerAssets$1.L$1 = null;
                bannersCache$updateBannerAssets$1.L$2 = null;
                bannersCache$updateBannerAssets$1.L$3 = null;
                bannersCache$updateBannerAssets$1.label = 2;
                Object l = l(arrayList, bannersCache$updateBannerAssets$1);
                return l != obj2 ? obj2 : l;
            }
        }
        bannersCache$updateBannerAssets$1 = new BannersCache$updateBannerAssets$1(this, continuationImpl);
        Object obj4 = bannersCache$updateBannerAssets$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannersCache$updateBannerAssets$1.label;
        if (i != 0) {
        }
        Promotion promotion22 = (Promotion) obj4;
        if (promotion22 != null) {
        }
        if (N0 == null) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r10.hasNext()) {
        }
        bannersCache$updateBannerAssets$1.L$0 = null;
        bannersCache$updateBannerAssets$1.L$1 = null;
        bannersCache$updateBannerAssets$1.L$2 = null;
        bannersCache$updateBannerAssets$1.L$3 = null;
        bannersCache$updateBannerAssets$1.label = 2;
        Object l2 = l(arrayList2, bannersCache$updateBannerAssets$1);
        if (l2 != obj22) {
        }
    }
}
