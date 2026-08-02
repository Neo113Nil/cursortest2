package flex.feature.timed.action;

import defpackage.etg;
import defpackage.ftg;
import defpackage.mvg;
import defpackage.n6u;
import defpackage.ny61;
import defpackage.rzo;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "flex.feature.timed.action.DebounceActionHandler$startDebounce$currentJob$1", f = "DebounceAction.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DebounceActionHandler$startDebounce$currentJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ ftg $key;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebounceActionHandler$startDebounce$currentJob$1(ftg ftgVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$key = ftgVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DebounceActionHandler$startDebounce$currentJob$1(this.$key, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DebounceActionHandler$startDebounce$currentJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long j = this.$key.a.b;
            this.label = 1;
            if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        etg etgVar = (etg) this.this$0.b.get(this.$key);
        this.this$0.b.remove(this.$key);
        if (etgVar != null) {
            this.this$0.getClass();
            n6u n6uVar = etgVar.b;
            rzo.p(n6uVar.c, etgVar.a, n6uVar.b);
        }
        return zy11.a;
    }
}
