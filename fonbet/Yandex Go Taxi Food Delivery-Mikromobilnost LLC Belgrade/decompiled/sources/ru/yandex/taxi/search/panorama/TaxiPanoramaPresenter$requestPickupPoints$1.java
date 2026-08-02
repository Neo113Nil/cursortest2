package ru.yandex.taxi.search.panorama;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r8y0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.u6r;
import defpackage.uyj;
import defpackage.wb90;
import defpackage.wls;
import defpackage.xpb0;
import defpackage.y8y0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.search.panorama.TaxiPanoramaPresenter$requestPickupPoints$1", f = "TaxiPanoramaPresenter.kt", l = {HProv.PP_SAME_MEDIA}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TaxiPanoramaPresenter$requestPickupPoints$1 extends SuspendLambda implements wls {
    final /* synthetic */ wb90 $panoramaInfo;
    int label;
    final /* synthetic */ y8y0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxiPanoramaPresenter$requestPickupPoints$1(y8y0 y8y0Var, wb90 wb90Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = y8y0Var;
        this.$panoramaInfo = wb90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TaxiPanoramaPresenter$requestPickupPoints$1(this.this$0, this.$panoramaInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TaxiPanoramaPresenter$requestPickupPoints$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.B.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            TaxiPanoramaPresenter$requestPickupPoints$1$response$1 taxiPanoramaPresenter$requestPickupPoints$1$response$1 = new TaxiPanoramaPresenter$requestPickupPoints$1$response$1(this.this$0, this.$panoramaInfo, null);
            this.label = 1;
            obj = tje.k0(mdhVar, taxiPanoramaPresenter$requestPickupPoints$1$response$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        List list2 = ((u6r) obj).a;
        if (list2 != null) {
            list = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                zzs zzsVar = ((xpb0) it.next()).b;
                if (zzsVar != null) {
                    list.add(zzsVar);
                }
            }
        } else {
            list = EmptyList.a;
        }
        ((r8y0) this.this$0.Dg()).Yb(list);
        return zy11.a;
    }
}
