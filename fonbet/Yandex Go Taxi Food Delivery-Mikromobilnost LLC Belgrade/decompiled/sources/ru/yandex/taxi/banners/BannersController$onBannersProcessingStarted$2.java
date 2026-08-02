package ru.yandex.taxi.banners;

import defpackage.cay0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.banners.model.g;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.BannersController$onBannersProcessingStarted$2", f = "BannersController.kt", l = {103}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class BannersController$onBannersProcessingStarted$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersController$onBannersProcessingStarted$2(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannersController$onBannersProcessingStarted$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannersController$onBannersProcessingStarted$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar = this.this$0;
                ((cay0) cVar.e).a(cVar.x);
                c cVar2 = this.this$0;
                g gVar = cVar2.f;
                b bVar = cVar2.y;
                gVar.h.add(bVar);
                Promotion promotion = gVar.i;
                if (promotion != null) {
                    bVar.accept(promotion);
                }
                c cVar3 = this.this$0;
                cVar3.a.a.setOnHierarchyChangeListener(cVar3.s);
                this.label = 1;
                if (kotlinx.coroutines.a.d(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            c cVar4 = this.this$0;
            ((cay0) cVar4.e).c(cVar4.x);
            c cVar5 = this.this$0;
            g gVar2 = cVar5.f;
            gVar2.h.remove(cVar5.y);
            this.this$0.e();
            this.this$0.a.a.setOnHierarchyChangeListener(null);
            c cVar6 = this.this$0;
            cVar6.a.a.removeCallbacks(cVar6.w);
            throw th;
        }
    }
}
