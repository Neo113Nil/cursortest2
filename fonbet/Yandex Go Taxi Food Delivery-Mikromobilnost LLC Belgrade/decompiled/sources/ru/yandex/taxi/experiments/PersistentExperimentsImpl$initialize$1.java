package ru.yandex.taxi.experiments;

import com.yandex.go.experiments.api.ExperimentSource;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.experiments.PersistentExperimentsImpl$initialize$1", f = "PersistentExperimentsImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class PersistentExperimentsImpl$initialize$1 extends SuspendLambda implements wls {
    final /* synthetic */ ExperimentSource $source;
    int label;
    final /* synthetic */ p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersistentExperimentsImpl$initialize$1(p pVar, ExperimentSource experimentSource, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pVar;
        this.$source = experimentSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PersistentExperimentsImpl$initialize$1(this.this$0, this.$source, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PersistentExperimentsImpl$initialize$1 persistentExperimentsImpl$initialize$1 = (PersistentExperimentsImpl$initialize$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        persistentExperimentsImpl$initialize$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        try {
            this.this$0.d.a(this.$source, true);
            this.this$0.j.j0();
            return zy11.a;
        } catch (Throwable th) {
            this.this$0.j.j0();
            throw th;
        }
    }
}
