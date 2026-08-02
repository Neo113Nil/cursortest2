package ru.yandex.taxi.masstransit.mapper;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bzy0;
import defpackage.fj40;
import defpackage.h640;
import defpackage.hj40;
import defpackage.jm30;
import defpackage.l540;
import defpackage.lj40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qm30;
import defpackage.r440;
import defpackage.rm30;
import defpackage.sm30;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "<unused var>", "Lfj40;", "section", "", "Ltm30;", "<anonymous>", "(ILfj40;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.mapper.MtViewOnMapOverlayUiStateMapper$mapOverlaySections$2", f = "MtViewOnMapOverlayUiStateMapper.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, 69, 70}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtViewOnMapOverlayUiStateMapper$mapOverlaySections$2 extends SuspendLambda implements zls {
    final /* synthetic */ hj40 $selectedStop;
    final /* synthetic */ float $topZIndex;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtViewOnMapOverlayUiStateMapper$mapOverlaySections$2(g gVar, hj40 hj40Var, float f, Continuation continuation) {
        super(3, continuation);
        this.this$0 = gVar;
        this.$selectedStop = hj40Var;
        this.$topZIndex = f;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        MtViewOnMapOverlayUiStateMapper$mapOverlaySections$2 mtViewOnMapOverlayUiStateMapper$mapOverlaySections$2 = new MtViewOnMapOverlayUiStateMapper$mapOverlaySections$2(this.this$0, this.$selectedStop, this.$topZIndex, (Continuation) obj3);
        mtViewOnMapOverlayUiStateMapper$mapOverlaySections$2.L$0 = (fj40) obj2;
        return mtViewOnMapOverlayUiStateMapper$mapOverlaySections$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r14 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        if (r14 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a6, code lost:
    
        if (r14 == r1) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fj40 fj40Var = (fj40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return (List) obj;
            }
            if (i == 2) {
                kotlin.b.b(obj);
                return (List) obj;
            }
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return (List) obj;
        }
        kotlin.b.b(obj);
        this.this$0.c.getClass();
        bzy0 a = h640.a(fj40Var);
        sm30 rm30Var = a != null ? new rm30(a) : qm30.a;
        if (fj40Var instanceof jm30) {
            hj40 hj40Var = this.$selectedStop;
            float f = this.$topZIndex;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = this.this$0.d.c((jm30) fj40Var, hj40Var, f, rm30Var, this);
        } else if (fj40Var instanceof r440) {
            hj40 hj40Var2 = this.$selectedStop;
            float f2 = this.$topZIndex;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            obj = this.this$0.d.h((r440) fj40Var, hj40Var2, f2, rm30Var, this);
        } else {
            if (!(fj40Var instanceof lj40)) {
                if (fj40Var instanceof l540) {
                    return EmptyList.a;
                }
                w511.b();
                return null;
            }
            hj40 hj40Var3 = this.$selectedStop;
            float f3 = this.$topZIndex;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            obj = this.this$0.d.i((lj40) fj40Var, hj40Var3, f3, rm30Var, this);
        }
        return coroutineSingletons;
    }
}
