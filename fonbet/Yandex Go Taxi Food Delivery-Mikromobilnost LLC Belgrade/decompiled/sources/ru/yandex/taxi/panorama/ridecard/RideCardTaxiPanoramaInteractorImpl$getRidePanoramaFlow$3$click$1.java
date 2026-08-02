package ru.yandex.taxi.panorama.ridecard;

import android.graphics.Bitmap;
import defpackage.d6z;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.s8y0;
import defpackage.sjh;
import defpackage.tb90;
import defpackage.tje;
import defpackage.tls;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.panorama.d;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.panorama.ridecard.RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$3$click$1", f = "RideCardTaxiPanoramaInteractorImpl.kt", l = {HProv.PP_NK_SYNC}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$3$click$1 extends SuspendLambda implements tls {
    final /* synthetic */ ru.yandex.taxi.panorama.d $experiment;
    final /* synthetic */ tb90 $panoramaData;
    final /* synthetic */ Bitmap $pinImage;
    final /* synthetic */ String $pinType;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$3$click$1(d dVar, ru.yandex.taxi.panorama.d dVar2, tb90 tb90Var, String str, Bitmap bitmap, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
        this.$experiment = dVar2;
        this.$panoramaData = tb90Var;
        this.$pinType = str;
        this.$pinImage = bitmap;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$3$click$1(this.this$0, this.$experiment, this.$panoramaData, this.$pinType, this.$pinImage, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((RideCardTaxiPanoramaInteractorImpl$getRidePanoramaFlow$3$click$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        ru.yandex.taxi.panorama.d dVar2 = this.$experiment;
        tb90 tb90Var = this.$panoramaData;
        String str = this.$pinType;
        Bitmap bitmap = this.$pinImage;
        this.label = 1;
        dVar.b.d(tb90Var.a, "ride_card", str, tb90Var.c);
        double d = dVar2.i;
        d.a aVar = dVar2.l;
        boolean l = jl40.l(str, "a");
        d.b bVar = dVar2.k;
        s8y0 s8y0Var = new s8y0(tb90Var, "ride_card", str, d, bitmap, l ? d6z.Y(dVar2, bVar.a) : d6z.Y(dVar2, bVar.b), EmptyList.a, d6z.Y(dVar2, aVar.a), d6z.Y(dVar2, aVar.b), "", "", "", 0, null, false);
        dVar.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new RideCardTaxiPanoramaInteractorImpl$clickPanorama$2(dVar, s8y0Var, null), this);
        if (k0 != coroutineSingletons) {
            k0 = zy11Var;
        }
        return k0 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
