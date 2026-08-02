package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data;

import defpackage.g050;
import defpackage.gtq0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.uyj;
import defpackage.zy11;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$2", f = "ScootersCompletionPhotoVehicleDetectionModelDownloadRepository.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $link;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$2(a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$link = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$2(this.this$0, this.$link, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeeded$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object putIfAbsent;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        String str = this.$link;
        this.label = 1;
        File b = aVar.d.b(str);
        ConcurrentHashMap concurrentHashMap = aVar.e.a;
        Object obj2 = concurrentHashMap.get(str);
        if (obj2 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj2 = gtq0.a()))) != null) {
            obj2 = putIfAbsent;
        }
        aVar.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new ScootersCompletionPhotoVehicleDetectionModelDownloadRepository$downloadIfNeededInActivityScope$2((g050) obj2, aVar, str, b, null), this);
        if (k0 != coroutineSingletons) {
            k0 = zy11Var;
        }
        return k0 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
