package ru.yandex.taxi.translations.interactor;

import defpackage.bvf0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.translations.interactor.TranslationsLoadInteractor$fetchStrings$2", f = "TranslationsLoadInteractor.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class TranslationsLoadInteractor$fetchStrings$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationsLoadInteractor$fetchStrings$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TranslationsLoadInteractor$fetchStrings$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TranslationsLoadInteractor$fetchStrings$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                TranslationsLoadInteractor$fetchStrings$2$1$1 translationsLoadInteractor$fetchStrings$2$1$1 = new TranslationsLoadInteractor$fetchStrings$2$1$1(kotlin.collections.a.I(scc.g("common_strings", "order_chain")), this.this$0, null);
                this.L$0 = null;
                this.label = 1;
                if (bvf0.n(translationsLoadInteractor$fetchStrings$2$1$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Cannot retrieve strings");
        }
        return zy11.a;
    }
}
