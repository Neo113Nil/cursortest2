package ru.yandex.taxi.utils;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tls;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.xur;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.utils.ImageLoaderExtenstionsKt$submit$$inlined$collectIn$1", f = "ImageLoaderExtenstions.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class ImageLoaderExtenstionsKt$submit$$inlined$collectIn$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $onBitmapReady$inlined;
    final /* synthetic */ sls $onLoadFailed$inlined;
    final /* synthetic */ tpr $this_collectIn;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderExtenstionsKt$submit$$inlined$collectIn$1(tpr tprVar, Continuation continuation, tls tlsVar, sls slsVar) {
        super(2, continuation);
        this.$this_collectIn = tprVar;
        this.$onBitmapReady$inlined = tlsVar;
        this.$onLoadFailed$inlined = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ImageLoaderExtenstionsKt$submit$$inlined$collectIn$1(this.$this_collectIn, continuation, this.$onBitmapReady$inlined, this.$onLoadFailed$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ImageLoaderExtenstionsKt$submit$$inlined$collectIn$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_collectIn;
            xur xurVar = new xur(4, this.$onBitmapReady$inlined, this.$onLoadFailed$inlined);
            this.label = 1;
            if (tprVar.collect(xurVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
