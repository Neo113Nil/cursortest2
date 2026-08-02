package ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor;

import defpackage.ajc;
import defpackage.e3n;
import defpackage.g92;
import defpackage.lpw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.z2u;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.locationsdk.core.time.TimestampSelector;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.GroupStateSource$createGroupStateFlow$$inlined$flatMapLatest$1", f = "GroupStateSource.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class GroupStateSource$createGroupStateFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ z2u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupStateSource$createGroupStateFlow$$inlined$flatMapLatest$1(Continuation continuation, z2u z2uVar) {
        super(3, continuation);
        this.this$0 = z2uVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GroupStateSource$createGroupStateFlow$$inlined$flatMapLatest$1 groupStateSource$createGroupStateFlow$$inlined$flatMapLatest$1 = new GroupStateSource$createGroupStateFlow$$inlined$flatMapLatest$1((Continuation) obj3, this.this$0);
        groupStateSource$createGroupStateFlow$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        groupStateSource$createGroupStateFlow$$inlined$flatMapLatest$1.L$1 = obj2;
        return groupStateSource$createGroupStateFlow$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tpr g92Var;
        long j;
        tpr a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            lpw lpwVar = (lpw) this.L$1;
            if (lpwVar != null) {
                TimestampSelector timestampSelector = this.this$0.a;
                boolean z = lpwVar.d;
                ajc ajcVar = lpwVar.a;
                if (z) {
                    a = new g92(2, Boolean.FALSE);
                } else {
                    ajc ajcVar2 = lpwVar.e;
                    if (ajcVar2 != null) {
                        j = timestampSelector.a(ajcVar2, ajcVar);
                    } else {
                        o430 o430Var = e3n.b;
                        j = 0;
                    }
                    a = ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.utils.a.a(j);
                }
                g92Var = new m0(a, ru.yandex.taxi.locationsdk.processor_on_jump_or_divergence.internal.processor.utils.a.a(timestampSelector.a(lpwVar.f, ajcVar)), new GroupStateSource$toGroupStateFlow$1(lpwVar, null));
            } else {
                g92Var = new g92(2, null);
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(g92Var, vprVar, this) == coroutineSingletons) {
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
