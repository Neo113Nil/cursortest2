package ru.yandex.taxi.promotions.storage;

import defpackage.ctf0;
import defpackage.jl40;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes9.dex */
public class RamPromotionsStorage implements ctf0 {
    public final Set a = Collections.newSetFromMap(new ConcurrentHashMap());
    public final wls b = new RamPromotionsStorage$promotionChangedListener$1(2, null);
    public volatile wls c = new RamPromotionsStorage$promotionRemovedListener$1(2, null);

    @Override // defpackage.ctf0
    public final Object a(Promotion promotion, ContinuationImpl continuationImpl) {
        this.a.add(promotion);
        ((RamPromotionsStorage$promotionChangedListener$1) this.b).invoke(promotion, continuationImpl);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return zy11.a;
    }

    @Override // defpackage.ctf0
    public final Object b(Promotion promotion, ContinuationImpl continuationImpl) {
        Set set = this.a;
        boolean contains = set.contains(promotion);
        zy11 zy11Var = zy11.a;
        if (!contains) {
            return zy11Var;
        }
        set.remove(promotion);
        set.add(promotion);
        return zy11Var;
    }

    @Override // defpackage.ctf0
    public final Object c(String str, ContinuationImpl continuationImpl) {
        Object obj;
        Object invoke;
        zy11 zy11Var = zy11.a;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (jl40.l(((Promotion) obj).getB(), str)) {
                break;
            }
        }
        Promotion promotion = (Promotion) obj;
        return (promotion != null && this.a.remove(promotion) && (invoke = this.c.invoke(promotion, continuationImpl)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? invoke : zy11Var;
    }

    @Override // defpackage.ctf0
    public final Object d(List list, ContinuationImpl continuationImpl) {
        this.a.addAll(list);
        return zy11.a;
    }

    @Override // defpackage.ctf0
    public final Object e(ContinuationImpl continuationImpl) {
        return zy11.a;
    }

    @Override // defpackage.ctf0
    public final Object f(wls wlsVar, ContinuationImpl continuationImpl) {
        this.c = wlsVar;
        return zy11.a;
    }

    @Override // defpackage.ctf0
    public final Object g(String str, ContinuationImpl continuationImpl) {
        for (Object obj : this.a) {
            if (jl40.l(((Promotion) obj).getB(), str)) {
                return obj;
            }
        }
        return null;
    }

    @Override // defpackage.ctf0
    public final Object h(ContinuationImpl continuationImpl) {
        return kotlin.collections.a.J0(this.a);
    }
}
