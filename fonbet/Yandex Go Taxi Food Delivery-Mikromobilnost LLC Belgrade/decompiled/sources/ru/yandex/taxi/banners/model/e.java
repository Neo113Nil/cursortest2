package ru.yandex.taxi.banners.model;

import defpackage.ctf0;
import defpackage.hu4;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes9.dex */
public final class e {
    public final hu4 a;
    public final hu4 b;
    public final zls c = new CompositeBannersStorage$promotionChangedListener$1(this, null);
    public final com.yandex.go.coroutines.h d = new com.yandex.go.coroutines.h(new CompositeBannersStorage$storageList$1(this, null));

    public e(hu4 hu4Var, hu4 hu4Var2) {
        this.a = hu4Var;
        this.b = hu4Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0074 -> B:11:0x0077). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        CompositeBannersStorage$getBanner$1 compositeBannersStorage$getBanner$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof CompositeBannersStorage$getBanner$1) {
            compositeBannersStorage$getBanner$1 = (CompositeBannersStorage$getBanner$1) continuationImpl;
            int i2 = compositeBannersStorage$getBanner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                compositeBannersStorage$getBanner$1.label = i2 - Integer.MIN_VALUE;
                Object obj = compositeBannersStorage$getBanner$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = compositeBannersStorage$getBanner$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    compositeBannersStorage$getBanner$1.L$0 = str;
                    compositeBannersStorage$getBanner$1.label = 1;
                    obj = this.d.a(compositeBannersStorage$getBanner$1);
                } else if (i == 1) {
                    str = (String) compositeBannersStorage$getBanner$1.L$0;
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = (Iterator) compositeBannersStorage$getBanner$1.L$1;
                    str = (String) compositeBannersStorage$getBanner$1.L$0;
                    kotlin.b.b(obj);
                    Promotion promotion = (Promotion) obj;
                    if (promotion != null) {
                        return promotion;
                    }
                    if (!it.hasNext()) {
                        return null;
                    }
                    ctf0 ctf0Var = (ctf0) it.next();
                    compositeBannersStorage$getBanner$1.L$0 = str;
                    compositeBannersStorage$getBanner$1.L$1 = it;
                    compositeBannersStorage$getBanner$1.L$2 = null;
                    compositeBannersStorage$getBanner$1.label = 2;
                    obj = ctf0Var.g(str, compositeBannersStorage$getBanner$1);
                }
                it = ((List) obj).iterator();
                if (!it.hasNext()) {
                }
            }
        }
        compositeBannersStorage$getBanner$1 = new CompositeBannersStorage$getBanner$1(this, continuationImpl);
        Object obj2 = compositeBannersStorage$getBanner$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compositeBannersStorage$getBanner$1.label;
        if (i != 0) {
        }
        it = ((List) obj2).iterator();
        if (!it.hasNext()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        CompositeBannersStorage$removeBanner$1 compositeBannersStorage$removeBanner$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof CompositeBannersStorage$removeBanner$1) {
            compositeBannersStorage$removeBanner$1 = (CompositeBannersStorage$removeBanner$1) continuationImpl;
            int i2 = compositeBannersStorage$removeBanner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                compositeBannersStorage$removeBanner$1.label = i2 - Integer.MIN_VALUE;
                Object obj = compositeBannersStorage$removeBanner$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = compositeBannersStorage$removeBanner$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    compositeBannersStorage$removeBanner$1.L$0 = str;
                    compositeBannersStorage$removeBanner$1.label = 1;
                    obj = this.d.a(compositeBannersStorage$removeBanner$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = (Iterator) compositeBannersStorage$removeBanner$1.L$1;
                        str = (String) compositeBannersStorage$removeBanner$1.L$0;
                        kotlin.b.b(obj);
                        while (it.hasNext()) {
                            ctf0 ctf0Var = (ctf0) it.next();
                            compositeBannersStorage$removeBanner$1.L$0 = str;
                            compositeBannersStorage$removeBanner$1.L$1 = it;
                            compositeBannersStorage$removeBanner$1.L$2 = null;
                            compositeBannersStorage$removeBanner$1.label = 2;
                            if (ctf0Var.c(str, compositeBannersStorage$removeBanner$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11.a;
                    }
                    str = (String) compositeBannersStorage$removeBanner$1.L$0;
                    kotlin.b.b(obj);
                }
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                return zy11.a;
            }
        }
        compositeBannersStorage$removeBanner$1 = new CompositeBannersStorage$removeBanner$1(this, continuationImpl);
        Object obj2 = compositeBannersStorage$removeBanner$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compositeBannersStorage$removeBanner$1.label;
        if (i != 0) {
        }
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0052, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(wls wlsVar, ContinuationImpl continuationImpl) {
        CompositeBannersStorage$setBannerRemovalListener$1 compositeBannersStorage$setBannerRemovalListener$1;
        int i;
        wls wlsVar2;
        Iterator it;
        if (continuationImpl instanceof CompositeBannersStorage$setBannerRemovalListener$1) {
            compositeBannersStorage$setBannerRemovalListener$1 = (CompositeBannersStorage$setBannerRemovalListener$1) continuationImpl;
            int i2 = compositeBannersStorage$setBannerRemovalListener$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                compositeBannersStorage$setBannerRemovalListener$1.label = i2 - Integer.MIN_VALUE;
                Object obj = compositeBannersStorage$setBannerRemovalListener$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = compositeBannersStorage$setBannerRemovalListener$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    compositeBannersStorage$setBannerRemovalListener$1.L$0 = wlsVar;
                    compositeBannersStorage$setBannerRemovalListener$1.label = 1;
                    obj = this.d.a(compositeBannersStorage$setBannerRemovalListener$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = (Iterator) compositeBannersStorage$setBannerRemovalListener$1.L$1;
                        wlsVar2 = (wls) compositeBannersStorage$setBannerRemovalListener$1.L$0;
                        kotlin.b.b(obj);
                        while (it.hasNext()) {
                            ctf0 ctf0Var = (ctf0) it.next();
                            CompositeBannersStorage$setBannerRemovalListener$2 compositeBannersStorage$setBannerRemovalListener$2 = new CompositeBannersStorage$setBannerRemovalListener$2(this, wlsVar2, null);
                            compositeBannersStorage$setBannerRemovalListener$1.L$0 = wlsVar2;
                            compositeBannersStorage$setBannerRemovalListener$1.L$1 = it;
                            compositeBannersStorage$setBannerRemovalListener$1.L$2 = null;
                            compositeBannersStorage$setBannerRemovalListener$1.label = 2;
                            if (ctf0Var.f(compositeBannersStorage$setBannerRemovalListener$2, compositeBannersStorage$setBannerRemovalListener$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11.a;
                    }
                    wlsVar = (wls) compositeBannersStorage$setBannerRemovalListener$1.L$0;
                    kotlin.b.b(obj);
                }
                wlsVar2 = wlsVar;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                return zy11.a;
            }
        }
        compositeBannersStorage$setBannerRemovalListener$1 = new CompositeBannersStorage$setBannerRemovalListener$1(this, continuationImpl);
        Object obj2 = compositeBannersStorage$setBannerRemovalListener$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compositeBannersStorage$setBannerRemovalListener$1.label;
        if (i != 0) {
        }
        wlsVar2 = wlsVar;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Promotion promotion, ContinuationImpl continuationImpl) {
        CompositeBannersStorage$updateBanner$1 compositeBannersStorage$updateBanner$1;
        int i;
        Iterator it;
        if (continuationImpl instanceof CompositeBannersStorage$updateBanner$1) {
            compositeBannersStorage$updateBanner$1 = (CompositeBannersStorage$updateBanner$1) continuationImpl;
            int i2 = compositeBannersStorage$updateBanner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                compositeBannersStorage$updateBanner$1.label = i2 - Integer.MIN_VALUE;
                Object obj = compositeBannersStorage$updateBanner$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = compositeBannersStorage$updateBanner$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    compositeBannersStorage$updateBanner$1.L$0 = promotion;
                    compositeBannersStorage$updateBanner$1.label = 1;
                    obj = this.d.a(compositeBannersStorage$updateBanner$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = (Iterator) compositeBannersStorage$updateBanner$1.L$1;
                        promotion = (Promotion) compositeBannersStorage$updateBanner$1.L$0;
                        kotlin.b.b(obj);
                        while (it.hasNext()) {
                            ctf0 ctf0Var = (ctf0) it.next();
                            compositeBannersStorage$updateBanner$1.L$0 = promotion;
                            compositeBannersStorage$updateBanner$1.L$1 = it;
                            compositeBannersStorage$updateBanner$1.L$2 = null;
                            compositeBannersStorage$updateBanner$1.label = 2;
                            if (ctf0Var.b(promotion, compositeBannersStorage$updateBanner$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11.a;
                    }
                    promotion = (Promotion) compositeBannersStorage$updateBanner$1.L$0;
                    kotlin.b.b(obj);
                }
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                return zy11.a;
            }
        }
        compositeBannersStorage$updateBanner$1 = new CompositeBannersStorage$updateBanner$1(this, continuationImpl);
        Object obj2 = compositeBannersStorage$updateBanner$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = compositeBannersStorage$updateBanner$1.label;
        if (i != 0) {
        }
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return zy11.a;
    }
}
