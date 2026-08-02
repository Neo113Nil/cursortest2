package ru.yandex.taxi.translations.interactor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\b\u0002\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lkotlin/Pair;", "", "", "<anonymous>", "(Ltse;)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.translations.interactor.TranslationsLoadInteractor$fetchStrings$2$1$1$requestsJobs$1$1", f = "TranslationsLoadInteractor.kt", l = {33}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class TranslationsLoadInteractor$fetchStrings$2$1$1$requestsJobs$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $keySetName;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationsLoadInteractor$fetchStrings$2$1$1$requestsJobs$1$1(String str, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$keySetName = str;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TranslationsLoadInteractor$fetchStrings$2$1$1$requestsJobs$1$1(this.$keySetName, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TranslationsLoadInteractor$fetchStrings$2$1$1$requestsJobs$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            String str2 = this.$keySetName;
            a aVar = this.this$0;
            this.L$0 = str2;
            this.label = 1;
            Object b = aVar.b(str2, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = b;
            str = str2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) this.L$0;
            b.b(obj);
        }
        return new Pair(str, obj);
    }
}
