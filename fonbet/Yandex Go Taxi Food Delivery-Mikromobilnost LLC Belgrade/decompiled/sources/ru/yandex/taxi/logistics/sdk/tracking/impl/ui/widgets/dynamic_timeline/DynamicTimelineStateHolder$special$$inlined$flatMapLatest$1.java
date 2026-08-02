package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline;

import defpackage.b9n;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline.DynamicTimelineStateHolder$special$$inlined$flatMapLatest$1", f = "DynamicTimelineStateHolder.kt", l = {190, 189}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class DynamicTimelineStateHolder$special$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ f $receiver$inlined;
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicTimelineStateHolder$special$$inlined$flatMapLatest$1(Continuation continuation, f fVar) {
        super(3, continuation);
        this.$receiver$inlined = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DynamicTimelineStateHolder$special$$inlined$flatMapLatest$1 dynamicTimelineStateHolder$special$$inlined$flatMapLatest$1 = new DynamicTimelineStateHolder$special$$inlined$flatMapLatest$1((Continuation) obj3, this.$receiver$inlined);
        dynamicTimelineStateHolder$special$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        dynamicTimelineStateHolder$special$$inlined$flatMapLatest$1.L$1 = obj2;
        return dynamicTimelineStateHolder$special$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
    
        if (kotlinx.coroutines.flow.e.u((defpackage.tpr) r8, r1, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r8 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vprVar = (vpr) this.L$0;
            b9n b9nVar = (b9n) this.L$1;
            f fVar = this.$receiver$inlined;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = vprVar;
            this.L$3 = null;
            this.L$4 = null;
            this.I$0 = 0;
            this.label = 1;
            obj = f.b(fVar, b9nVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 2;
    }
}
