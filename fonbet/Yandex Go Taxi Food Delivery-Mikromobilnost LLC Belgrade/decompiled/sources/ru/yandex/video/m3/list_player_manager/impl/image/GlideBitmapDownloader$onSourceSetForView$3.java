package ru.yandex.video.m3.list_player_manager.impl.image;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader$onSourceSetForView$3", f = "GlideBitmapDownloader.kt", l = {HProv.PP_NK_SYNC}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class GlideBitmapDownloader$onSourceSetForView$3 extends SuspendLambda implements wls {
    final /* synthetic */ tls $loadFirstFrame;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlideBitmapDownloader$onSourceSetForView$3(tls tlsVar, Continuation<? super GlideBitmapDownloader$onSourceSetForView$3> continuation) {
        super(2, continuation);
        this.$loadFirstFrame = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new GlideBitmapDownloader$onSourceSetForView$3(this.$loadFirstFrame, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((GlideBitmapDownloader$onSourceSetForView$3) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tls tlsVar = this.$loadFirstFrame;
            this.label = 1;
            if (tlsVar.invoke(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
