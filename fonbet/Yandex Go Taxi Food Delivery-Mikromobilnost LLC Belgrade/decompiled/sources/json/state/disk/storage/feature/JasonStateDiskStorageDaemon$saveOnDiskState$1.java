package json.state.disk.storage.feature;

import defpackage.d6x;
import defpackage.jse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zse;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "json.state.disk.storage.feature.JasonStateDiskStorageDaemon$saveOnDiskState$1", f = "JasonStateDiskStorageDaemon.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes9.dex */
final class JasonStateDiskStorageDaemon$saveOnDiskState$1 extends SuspendLambda implements wls {
    final /* synthetic */ d6x $filteredState;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JasonStateDiskStorageDaemon$saveOnDiskState$1(b bVar, d6x d6xVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$filteredState = d6xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JasonStateDiskStorageDaemon$saveOnDiskState$1(this.this$0, this.$filteredState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JasonStateDiskStorageDaemon$saveOnDiskState$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0.b;
            d6x d6xVar = this.$filteredState;
            this.label = 1;
            cVar.getClass();
            sjh sjhVar = uyj.a;
            Object k0 = tje.k0((jse) zse.a.c, new JasonStateDiskStorageImpl$saveState$2(cVar, d6xVar, null), this);
            if (k0 != coroutineSingletons) {
                k0 = zy11Var;
            }
            if (k0 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
