package ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor;

import defpackage.ifb1;
import defpackage.k7z;
import defpackage.lpw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.y2u;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "jumpDiscarded", "timedOut", "Ly2u;", "<anonymous>", "(ZZ)Ly2u;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.GroupStateSource$toGroupStateFlow$1", f = "GroupStateSource.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class GroupStateSource$toGroupStateFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ lpw $this_toGroupStateFlow;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupStateSource$toGroupStateFlow$1(lpw lpwVar, Continuation continuation) {
        super(3, continuation);
        this.$this_toGroupStateFlow = lpwVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        GroupStateSource$toGroupStateFlow$1 groupStateSource$toGroupStateFlow$1 = new GroupStateSource$toGroupStateFlow$1(this.$this_toGroupStateFlow, (Continuation) obj3);
        groupStateSource$toGroupStateFlow$1.Z$0 = booleanValue;
        groupStateSource$toGroupStateFlow$1.Z$1 = booleanValue2;
        return groupStateSource$toGroupStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        lpw lpwVar = this.$this_toGroupStateFlow;
        k7z k7zVar = lpwVar.b;
        return new y2u(k7zVar, lpwVar.c, !z, z2, ifb1.c(k7zVar));
    }
}
