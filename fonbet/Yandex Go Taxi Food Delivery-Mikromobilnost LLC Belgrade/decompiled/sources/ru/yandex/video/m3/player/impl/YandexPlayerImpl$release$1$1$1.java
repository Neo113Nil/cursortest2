package ru.yandex.video.m3.player.impl;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", CA20Status.STATUS_CERTIFICATE_H, "Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.player.impl.YandexPlayerImpl$release$1$1$1", f = "YandexPlayerImpl.kt", l = {813}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class YandexPlayerImpl$release$1$1$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ YandexPlayerImpl<H> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YandexPlayerImpl$release$1$1$1(YandexPlayerImpl<H> yandexPlayerImpl, Continuation<? super YandexPlayerImpl$release$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = yandexPlayerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new YandexPlayerImpl$release$1$1$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((YandexPlayerImpl$release$1$1$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object releaseInternalSuspend;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            YandexPlayerImpl<H> yandexPlayerImpl = this.this$0;
            this.label = 1;
            releaseInternalSuspend = yandexPlayerImpl.releaseInternalSuspend(this);
            if (releaseInternalSuspend == coroutineSingletons) {
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
