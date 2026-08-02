package ru.yandex.taxi.banners;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tg60;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.banners.model.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.BannersController$processNotificationBanners$1", f = "BannersController.kt", l = {195}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class BannersController$processNotificationBanners$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersController$processNotificationBanners$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannersController$processNotificationBanners$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannersController$processNotificationBanners$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
                Serializable h = hVar.h(str, this);
                if (h == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = h;
                cVar = cVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = (c) this.L$0;
                kotlin.b.b(obj);
            }
            cVar.getClass();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                cVar.n((tg60) it.next());
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.d.k(th, "Failed to process notifications for screen");
        }
        return zy11.a;
    }
}
