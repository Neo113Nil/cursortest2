package ru.yandex.taxi.banners.presentation.fullscreen;

import defpackage.eis;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.shs;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPresenter$initData$1", f = "FullScreenBannerPresenter.kt", l = {139}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FullScreenBannerPresenter$initData$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenBannerPresenter$initData$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FullScreenBannerPresenter$initData$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FullScreenBannerPresenter$initData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        a aVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar3 = this.this$0;
                try {
                    h hVar = aVar3.k;
                    shs shsVar = aVar3.f;
                    this.L$0 = aVar3;
                    this.L$1 = aVar3;
                    this.label = 1;
                    Object l = hVar.g.l(shsVar.a(), false, this);
                    if (l == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    aVar = aVar3;
                    obj = l;
                    aVar2 = aVar;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar3;
                    xby.d.k(th, String.format("Failed to load full screen banner %s", Arrays.copyOf(new Object[]{aVar.f.b}, 1)));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = (a) this.L$1;
                aVar2 = (a) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    xby.d.k(th, String.format("Failed to load full screen banner %s", Arrays.copyOf(new Object[]{aVar.f.b}, 1)));
                    return zy11.a;
                }
            }
            Promotion promotion = (Promotion) obj;
            if (promotion instanceof shs) {
                aVar2.f = (shs) promotion;
                ((eis) aVar2.a).onBannerMediaLoaded((shs) promotion);
            }
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
