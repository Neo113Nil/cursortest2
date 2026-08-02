package ru.yandex.taxi.controller;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.controller.WebViewCacheLoader$newCacheRequest$2$1", f = "WebViewCacheLoader.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class WebViewCacheLoader$newCacheRequest$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $token;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewCacheLoader$newCacheRequest$2$1(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$token = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WebViewCacheLoader$newCacheRequest$2$1(this.this$0, this.$token, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WebViewCacheLoader$newCacheRequest$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return b.a(this.this$0, this.$token, true);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
