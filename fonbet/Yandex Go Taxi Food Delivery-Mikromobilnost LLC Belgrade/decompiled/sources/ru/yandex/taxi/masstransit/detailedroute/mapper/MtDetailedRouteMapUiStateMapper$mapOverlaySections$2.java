package ru.yandex.taxi.masstransit.detailedroute.mapper;

import defpackage.fay0;
import defpackage.fj40;
import defpackage.hj40;
import defpackage.jm30;
import defpackage.l540;
import defpackage.lj40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.obm;
import defpackage.qm30;
import defpackage.r440;
import defpackage.su30;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "index", "Lfj40;", "section", "", "Ltm30;", "<anonymous>", "(ILfj40;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.detailedroute.mapper.MtDetailedRouteMapUiStateMapper$mapOverlaySections$2", f = "MtDetailedRouteMapUiStateMapper.kt", l = {HProv.ALG_SID_KECCAK_256, HProv.PP_RESERVED1, 103}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtDetailedRouteMapUiStateMapper$mapOverlaySections$2 extends SuspendLambda implements zls {
    final /* synthetic */ su30 $route;
    final /* synthetic */ hj40 $selectedStop;
    final /* synthetic */ fay0 $taxiSectionData;
    final /* synthetic */ float $topZIndex;
    /* synthetic */ int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtDetailedRouteMapUiStateMapper$mapOverlaySections$2(su30 su30Var, fay0 fay0Var, a aVar, hj40 hj40Var, float f, Continuation continuation) {
        super(3, continuation);
        this.$route = su30Var;
        this.$taxiSectionData = fay0Var;
        this.this$0 = aVar;
        this.$selectedStop = hj40Var;
        this.$topZIndex = f;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        MtDetailedRouteMapUiStateMapper$mapOverlaySections$2 mtDetailedRouteMapUiStateMapper$mapOverlaySections$2 = new MtDetailedRouteMapUiStateMapper$mapOverlaySections$2(this.$route, this.$taxiSectionData, this.this$0, this.$selectedStop, this.$topZIndex, (Continuation) obj3);
        mtDetailedRouteMapUiStateMapper$mapOverlaySections$2.I$0 = intValue;
        mtDetailedRouteMapUiStateMapper$mapOverlaySections$2.L$0 = (fj40) obj2;
        return mtDetailedRouteMapUiStateMapper$mapOverlaySections$2.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009b, code lost:
    
        if (r15 == r2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r15 == r2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e6, code lost:
    
        if (r15 == r2) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        boolean z;
        fay0 fay0Var;
        int i2 = this.I$0;
        fj40 fj40Var = (fj40) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 != 0) {
            if (i3 == 1) {
                b.b(obj);
                return (List) obj;
            }
            if (i3 == 2) {
                b.b(obj);
                return (List) obj;
            }
            if (i3 != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            return (List) obj;
        }
        b.b(obj);
        if (!(kotlin.collections.a.S(i2 - 2, this.$route.a) instanceof l540)) {
            if (!(kotlin.collections.a.S(i2 - 1, this.$route.a) instanceof l540)) {
                i = 0;
                if (i != 0 && (fay0Var = this.$taxiSectionData) != null) {
                    obm obmVar = fay0Var.c;
                }
                z = fj40Var instanceof jm30;
                qm30 qm30Var = qm30.a;
                if (!z) {
                    hj40 hj40Var = this.$selectedStop;
                    float f = this.$topZIndex;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.label = 1;
                    obj = this.this$0.c.c((jm30) fj40Var, hj40Var, f, qm30Var, this);
                } else if (fj40Var instanceof r440) {
                    hj40 hj40Var2 = this.$selectedStop;
                    float f2 = this.$topZIndex;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.label = 2;
                    obj = this.this$0.c.h((r440) fj40Var, hj40Var2, f2, qm30Var, this);
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
                    this.L$2 = null;
                    this.I$0 = i2;
                    this.I$1 = i;
                    this.label = 3;
                    obj = this.this$0.c.i((lj40) fj40Var, hj40Var3, f3, qm30Var, this);
                }
                return coroutineSingletons;
            }
        }
        i = 1;
        if (i != 0) {
            obm obmVar2 = fay0Var.c;
        }
        z = fj40Var instanceof jm30;
        qm30 qm30Var2 = qm30.a;
        if (!z) {
        }
        return coroutineSingletons;
    }
}
