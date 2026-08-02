package ru.yandex.taxi.banners;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.nu4;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.vby;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.banners.model.h;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.banners.BannersController$processGeoCardAndFullscreenBanners$1", f = "BannersController.kt", l = {HProv.PP_HANDLE_COUNT}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class BannersController$processGeoCardAndFullscreenBanners$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersController$processGeoCardAndFullscreenBanners$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BannersController$processGeoCardAndFullscreenBanners$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BannersController$processGeoCardAndFullscreenBanners$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
                sjh sjhVar = uyj.a;
                mdh mdhVar = mdh.b;
                BannersController$processGeoCardAndFullscreenBanners$1$1$loadedBannerInfo$1 bannersController$processGeoCardAndFullscreenBanners$1$1$loadedBannerInfo$1 = new BannersController$processGeoCardAndFullscreenBanners$1$1$loadedBannerInfo$1(cVar2, null);
                this.L$0 = cVar2;
                this.label = 1;
                Object k0 = tje.k0(mdhVar, bannersController$processGeoCardAndFullscreenBanners$1$1$loadedBannerInfo$1, this);
                if (k0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = k0;
                cVar = cVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cVar = (c) this.L$0;
                kotlin.b.b(obj);
            }
            nu4 nu4Var = (nu4) obj;
            Promotion promotion = nu4Var.a;
            String str = nu4Var.b;
            if (promotion != h.x) {
                vby vbyVar = xby.d;
                String.format("handleBanner %s on screen %s", Arrays.copyOf(new Object[]{promotion.getB(), str}, 2));
                vbyVar.getClass();
                if (c.f(cVar, nu4Var.a, cVar.r)) {
                    String.format("mark screen %s as already used to show banner", Arrays.copyOf(new Object[]{str}, 1));
                    cVar.d.a.add(str);
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            xby.d.k(th, "Failed to process banners for screen");
        }
        return zy11.a;
    }
}
