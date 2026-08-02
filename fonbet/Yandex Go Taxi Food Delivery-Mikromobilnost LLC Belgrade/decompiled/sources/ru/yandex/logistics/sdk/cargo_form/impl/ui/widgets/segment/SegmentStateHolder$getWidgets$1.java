package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.segment;

import defpackage.dms;
import defpackage.j6s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q8q0;
import defpackage.v7q0;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "<unused var>", "Lq8q0;", "coreWidget", "Lj6s;", ClidProvider.STATE, "", "", "", "Ln351;", "<anonymous>", "(ZLq8q0;Lj6s;Ljava/util/Set;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.segment.SegmentStateHolder$getWidgets$1", f = "SegmentStateHolder.kt", l = {38}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class SegmentStateHolder$getWidgets$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentStateHolder$getWidgets$1(b bVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Boolean) obj).booleanValue();
        SegmentStateHolder$getWidgets$1 segmentStateHolder$getWidgets$1 = new SegmentStateHolder$getWidgets$1(this.this$0, (Continuation) obj5);
        segmentStateHolder$getWidgets$1.L$0 = (q8q0) obj2;
        segmentStateHolder$getWidgets$1.L$1 = (j6s) obj3;
        return segmentStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        v7q0 v7q0Var;
        q8q0 q8q0Var = (q8q0) this.L$0;
        j6s j6sVar = (j6s) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (q8q0Var == null || this.this$0.f.C(q8q0Var) || (v7q0Var = q8q0Var.b) == null) {
                return EmptyList.a;
            }
            a aVar = this.this$0.c;
            String str = q8q0Var.a;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = aVar.a(v7q0Var, j6sVar, str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return Collections.singletonList(obj);
    }
}
