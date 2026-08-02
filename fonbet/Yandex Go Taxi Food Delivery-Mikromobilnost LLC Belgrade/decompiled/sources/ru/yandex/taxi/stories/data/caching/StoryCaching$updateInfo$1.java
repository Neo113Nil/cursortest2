package ru.yandex.taxi.stories.data.caching;

import defpackage.evu0;
import defpackage.j63;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qa7;
import defpackage.sa7;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.api.dto.Story;
import ru.yandex.taxi.promotions.model.PromotionBackground;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.stories.data.caching.StoryCaching$updateInfo$1", f = "StoryCaching.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class StoryCaching$updateInfo$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryCaching$updateInfo$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StoryCaching$updateInfo$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        StoryCaching$updateInfo$1 storyCaching$updateInfo$1 = (StoryCaching$updateInfo$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        storyCaching$updateInfo$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        aVar.getClass();
        j63 j63Var = new j63(0);
        for (Story story : aVar.g) {
            ArrayList s = story.s(PromotionBackground.Type.VIDEO);
            ArrayList arrayList = new ArrayList();
            Iterator it = s.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (aVar.e((String) next)) {
                    arrayList.add(next);
                }
            }
            j63Var.addAll(arrayList);
            ArrayList s2 = story.s(PromotionBackground.Type.ANIMATION);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = s2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                String str = (String) next2;
                sa7 sa7Var = ((ru.yandex.taxi.communications.common.repository.a) aVar.d).a;
                sa7Var.getClass();
                qa7 qa7Var = new qa7(sa7Var);
                while (true) {
                    if (!qa7Var.hasNext()) {
                        break;
                    }
                    if (evu0.y((String) qa7Var.next(), str, false)) {
                        arrayList2.add(next2);
                        break;
                    }
                }
            }
            j63Var.addAll(arrayList2);
        }
        synchronized (aVar.f) {
            aVar.f.clear();
            aVar.f.addAll(j63Var);
        }
        return zy11.a;
    }
}
