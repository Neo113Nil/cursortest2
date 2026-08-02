package ru.yandex.taxi.summary.requirements.list.interactors;

import defpackage.lmw0;
import defpackage.lot0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.roj0;
import defpackage.sjh;
import defpackage.tej0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes6.dex */
public final class v {
    public final ru.yandex.taxi.banners.c a;
    public final lot0 b;
    public final roj0 c;
    public final tt2 d;

    public v(ru.yandex.taxi.banners.c cVar, lot0 lot0Var, roj0 roj0Var, tt2 tt2Var) {
        this.a = cVar;
        this.b = lot0Var;
        this.c = roj0Var;
        this.d = tt2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00b0 -> B:10:0x00b3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(v vVar, List list, ContinuationImpl continuationImpl) {
        RequirementCommunicationsInteractor$notLoadedBannerIds$1 requirementCommunicationsInteractor$notLoadedBannerIds$1;
        int i;
        Collection arrayList;
        Iterator it;
        vVar.getClass();
        if (continuationImpl instanceof RequirementCommunicationsInteractor$notLoadedBannerIds$1) {
            requirementCommunicationsInteractor$notLoadedBannerIds$1 = (RequirementCommunicationsInteractor$notLoadedBannerIds$1) continuationImpl;
            int i2 = requirementCommunicationsInteractor$notLoadedBannerIds$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementCommunicationsInteractor$notLoadedBannerIds$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementCommunicationsInteractor$notLoadedBannerIds$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementCommunicationsInteractor$notLoadedBannerIds$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        tej0 d = ((lmw0) it2.next()).d();
                        String str = d != null ? d.a : null;
                        if (str == null || str.length() == 0) {
                            str = null;
                        }
                        if (str != null) {
                            arrayList2.add(str);
                        }
                    }
                    arrayList = new ArrayList();
                    it = arrayList2.iterator();
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object next = requirementCommunicationsInteractor$notLoadedBannerIds$1.L$5;
                    it = (Iterator) requirementCommunicationsInteractor$notLoadedBannerIds$1.L$4;
                    arrayList = (Collection) requirementCommunicationsInteractor$notLoadedBannerIds$1.L$3;
                    kotlin.b.b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        arrayList.add(next);
                    }
                    if (it.hasNext()) {
                        next = it.next();
                        ru.yandex.taxi.banners.c cVar = vVar.a;
                        requirementCommunicationsInteractor$notLoadedBannerIds$1.L$0 = null;
                        requirementCommunicationsInteractor$notLoadedBannerIds$1.L$1 = null;
                        requirementCommunicationsInteractor$notLoadedBannerIds$1.L$2 = null;
                        requirementCommunicationsInteractor$notLoadedBannerIds$1.L$3 = arrayList;
                        requirementCommunicationsInteractor$notLoadedBannerIds$1.L$4 = it;
                        requirementCommunicationsInteractor$notLoadedBannerIds$1.L$5 = next;
                        requirementCommunicationsInteractor$notLoadedBannerIds$1.L$6 = null;
                        requirementCommunicationsInteractor$notLoadedBannerIds$1.label = 1;
                        obj = cVar.b.j((String) next, requirementCommunicationsInteractor$notLoadedBannerIds$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (!((Boolean) obj).booleanValue()) {
                        }
                        if (it.hasNext()) {
                            return kotlin.collections.a.J0((List) arrayList);
                        }
                    }
                }
            }
        }
        requirementCommunicationsInteractor$notLoadedBannerIds$1 = new RequirementCommunicationsInteractor$notLoadedBannerIds$1(vVar, continuationImpl);
        Object obj2 = requirementCommunicationsInteractor$notLoadedBannerIds$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementCommunicationsInteractor$notLoadedBannerIds$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r6.intValue() == r5.a().i(r0, 0)) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(tej0 tej0Var, ContinuationImpl continuationImpl) {
        RequirementCommunicationsInteractor$cachedBanner$1 requirementCommunicationsInteractor$cachedBanner$1;
        int i;
        Promotion promotion;
        if (continuationImpl instanceof RequirementCommunicationsInteractor$cachedBanner$1) {
            requirementCommunicationsInteractor$cachedBanner$1 = (RequirementCommunicationsInteractor$cachedBanner$1) continuationImpl;
            int i2 = requirementCommunicationsInteractor$cachedBanner$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requirementCommunicationsInteractor$cachedBanner$1.label = i2 - Integer.MIN_VALUE;
                Object obj = requirementCommunicationsInteractor$cachedBanner$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = requirementCommunicationsInteractor$cachedBanner$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str = tej0Var.a;
                    requirementCommunicationsInteractor$cachedBanner$1.L$0 = tej0Var;
                    requirementCommunicationsInteractor$cachedBanner$1.label = 1;
                    obj = this.a.b.i.g(str, requirementCommunicationsInteractor$cachedBanner$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tej0Var = (tej0) requirementCommunicationsInteractor$cachedBanner$1.L$0;
                    kotlin.b.b(obj);
                }
                promotion = (Promotion) obj;
                if (promotion != null) {
                    return null;
                }
                String str2 = tej0Var.a;
                Integer num = tej0Var.b;
                lot0 lot0Var = this.b;
                if (num == null) {
                    lot0Var.getClass();
                }
                z = false;
                promotion.r(z);
                return promotion;
            }
        }
        requirementCommunicationsInteractor$cachedBanner$1 = new RequirementCommunicationsInteractor$cachedBanner$1(this, continuationImpl);
        Object obj2 = requirementCommunicationsInteractor$cachedBanner$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = requirementCommunicationsInteractor$cachedBanner$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        promotion = (Promotion) obj2;
        if (promotion != null) {
        }
    }

    public final Object c(List list, SuspendLambda suspendLambda) {
        this.d.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new RequirementCommunicationsInteractor$preloadRequiredCommunications$2(this, list, null), suspendLambda);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
