package ru.yandex.taxi.personalstate.data.local;

import defpackage.g4z;
import defpackage.h4z;
import defpackage.j7b0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xnt;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lj7b0;", "<anonymous>", "(Ltse;)Lj7b0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.personalstate.data.local.LocalPersonalStateRepository$save$2", f = "LocalPersonalStateRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class LocalPersonalStateRepository$save$2 extends SuspendLambda implements wls {
    final /* synthetic */ j7b0 $personalState;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalPersonalStateRepository$save$2(a aVar, j7b0 j7b0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$personalState = j7b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocalPersonalStateRepository$save$2(this.this$0, this.$personalState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LocalPersonalStateRepository$save$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        try {
            h4z h4zVar = this.this$0.b;
            j7b0 j7b0Var = this.$personalState;
            h4zVar.b.r(ClidProvider.STATE, ((xnt) h4zVar.a).e(j7b0Var, j7b0.Companion.serializer()));
            this.this$0.c.a(new g4z(this.$personalState, 0));
        } catch (Exception e) {
            jst.e.k(e, "PersonalState.Local.Saving.Failed Can't save local state");
        }
        return this.$personalState;
    }
}
