package ru.yandex.taxi.superapp;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/net/Uri;", "<anonymous>", "(Ltse;)Landroid/net/Uri;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.SuperAppShareDelegate$processImageUrls$2$1$1$1", f = "SuperAppShareDelegate.kt", l = {105}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SuperAppShareDelegate$processImageUrls$2$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ m this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppShareDelegate$processImageUrls$2$1$1$1(m mVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppShareDelegate$processImageUrls$2$1$1$1(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppShareDelegate$processImageUrls$2$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        m mVar = this.this$0;
        String str = this.$url;
        this.label = 1;
        Comparable a = m.a(mVar, str, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
