package ru.yandex.taxi.banners.model;

import defpackage.ctf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/yandex/taxi/promotions/model/Promotion;", "Lru/yandex/taxi/communications/api/dto/Banner;", "banner", "Lctf0;", "storage", "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/promotions/model/Promotion;Lctf0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.model.CompositeBannersStorage$promotionChangedListener$1", f = "CompositeBannersStorage.kt", l = {19, 20}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class CompositeBannersStorage$promotionChangedListener$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompositeBannersStorage$promotionChangedListener$1(e eVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        CompositeBannersStorage$promotionChangedListener$1 compositeBannersStorage$promotionChangedListener$1 = new CompositeBannersStorage$promotionChangedListener$1(this.this$0, (Continuation) obj3);
        compositeBannersStorage$promotionChangedListener$1.L$0 = (Promotion) obj;
        compositeBannersStorage$promotionChangedListener$1.L$1 = (ctf0) obj2;
        return compositeBannersStorage$promotionChangedListener$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0040, code lost:
    
        if (r9 == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        Promotion promotion = (Promotion) this.L$0;
        ctf0 ctf0Var = (ctf0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.go.coroutines.h hVar = this.this$0.d;
            this.L$0 = promotion;
            this.L$1 = ctf0Var;
            this.label = 1;
            obj = hVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                it = (Iterator) this.L$3;
                kotlin.b.b(obj);
                while (it.hasNext()) {
                    ctf0 ctf0Var2 = (ctf0) it.next();
                    this.L$0 = promotion;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = it;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.label = 2;
                    if (ctf0Var2.b(promotion, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (((ctf0) obj2) != ctf0Var) {
                arrayList.add(obj2);
            }
        }
        it = arrayList.iterator();
        while (it.hasNext()) {
        }
        return zy11.a;
    }
}
