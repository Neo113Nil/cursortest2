package ru.yandex.taxi.preorder.suggested;

import defpackage.mtj0;
import defpackage.mvg;
import defpackage.ntj0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lntj0;", "Lic61;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.suggested.ZeroSuggestInteractorImpl$loadSuggestsFlow$2", f = "ZeroSuggestInteractorImpl.kt", l = {HProv.PP_CIPHEROID}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ZeroSuggestInteractorImpl$loadSuggestsFlow$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ZeroSuggestInteractorImpl$loadSuggestsFlow$2 zeroSuggestInteractorImpl$loadSuggestsFlow$2 = new ZeroSuggestInteractorImpl$loadSuggestsFlow$2(2, continuation);
        zeroSuggestInteractorImpl$loadSuggestsFlow$2.L$0 = obj;
        return zeroSuggestInteractorImpl$loadSuggestsFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ZeroSuggestInteractorImpl$loadSuggestsFlow$2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            mtj0 mtj0Var = ntj0.a;
            mtj0 mtj0Var2 = ntj0.a;
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(mtj0Var2, this) == coroutineSingletons) {
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
