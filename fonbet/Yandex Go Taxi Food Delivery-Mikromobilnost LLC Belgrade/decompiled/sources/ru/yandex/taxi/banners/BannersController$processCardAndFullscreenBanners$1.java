package ru.yandex.taxi.banners;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.cv4;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zi20;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.BannersController$processCardAndFullscreenBanners$1", f = "BannersController.kt", l = {PollMessageDraft.MAX_ANSWER_LENGTH}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class BannersController$processCardAndFullscreenBanners$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersController$processCardAndFullscreenBanners$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannersController$processCardAndFullscreenBanners$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannersController$processCardAndFullscreenBanners$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar2 = this.this$0;
                h hVar = cVar2.b;
                String str = cVar2.r;
                this.L$0 = cVar2;
                this.label = 1;
                Object e = hVar.e(str, this);
                if (e == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = e;
                cVar = cVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = (c) this.L$0;
                kotlin.b.b(obj);
            }
            Promotion promotion = (Promotion) obj;
            if (c.f(cVar, promotion, cVar.r) && !(promotion instanceof zi20)) {
                cv4 cv4Var = cVar.d;
                cv4Var.a.add(cVar.r);
            }
            cVar.q = cVar.r;
            cVar.j();
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            xby.d.k(th, "Failed to process banners for screen");
        }
        return zy11.a;
    }
}
