package ru.yandex.taxi.address.repository;

import defpackage.a721;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "tariffClass", "", "clarifyDestinationVisible", "La721;", "<anonymous>", "(Ljava/lang/String;Z)La721;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.address.repository.SuggestIconRepository$updateIconFlow$2", f = "SuggestIconRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SuggestIconRepository$updateIconFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        SuggestIconRepository$updateIconFlow$2 suggestIconRepository$updateIconFlow$2 = new SuggestIconRepository$updateIconFlow$2(3, (Continuation) obj3);
        suggestIconRepository$updateIconFlow$2.L$0 = (String) obj;
        suggestIconRepository$updateIconFlow$2.Z$0 = booleanValue;
        return suggestIconRepository$updateIconFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return new a721(str, z);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
