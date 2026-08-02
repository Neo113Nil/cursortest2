package ru.yandex.taxi.delivery;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.avj0;
import defpackage.b64;
import defpackage.fa90;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Lkotlin/Pair;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.delivery.DeliveryTitleUpdater$getTitleSubtitleFlow$1", f = "DeliveryTitleUpdater.kt", l = {52, 53, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DeliveryTitleUpdater$getTitleSubtitleFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$LongRef $delta;
    final /* synthetic */ String $modelDescription;
    final /* synthetic */ fa90 $paidWaitingInfo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryTitleUpdater$getTitleSubtitleFlow$1(Ref$LongRef ref$LongRef, b bVar, String str, fa90 fa90Var, Continuation continuation) {
        super(2, continuation);
        this.$delta = ref$LongRef;
        this.this$0 = bVar;
        this.$modelDescription = str;
        this.$paidWaitingInfo = fa90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryTitleUpdater$getTitleSubtitleFlow$1 deliveryTitleUpdater$getTitleSubtitleFlow$1 = new DeliveryTitleUpdater$getTitleSubtitleFlow$1(this.$delta, this.this$0, this.$modelDescription, this.$paidWaitingInfo, continuation);
        deliveryTitleUpdater$getTitleSubtitleFlow$1.L$0 = obj;
        return deliveryTitleUpdater$getTitleSubtitleFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeliveryTitleUpdater$getTitleSubtitleFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        if (r1.emit(r3, r20) == r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
    
        if (kotlinx.coroutines.a.i(1000, r20) == r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e9, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e7, code lost:
    
        if (r1.emit(r3, r20) == r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003a, code lost:
    
        if (r20.$delta.element > 0) goto L14;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00b0 -> B:13:0x00b3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        long j = 0;
        if (i == 0) {
            kotlin.b.b(obj);
        } else if (i == 1) {
            kotlin.b.b(obj);
            this.L$0 = vprVar;
            this.label = 2;
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.$delta.element -= 1000;
            j = 0;
            if (kotlinx.coroutines.a.p(get_context())) {
                long j2 = this.$delta.element;
                if (j2 > j) {
                    b bVar = this.this$0;
                    bVar.getClass();
                    long j3 = j2 / 60000;
                    long millis = (j2 - TimeUnit.MINUTES.toMillis(j3)) / 1000;
                    Pair pair = new Pair(((avj0) bVar.b).h(kyh0.delivery_free_waiting_title) + " " + j3 + ":" + (millis < 10 ? qv10.j(millis, "0") : String.valueOf(millis)), this.$modelDescription);
                    this.L$0 = vprVar;
                    this.label = 1;
                }
            }
            b bVar2 = this.this$0;
            fa90 fa90Var = this.$paidWaitingInfo;
            String str = fa90Var.b;
            String str2 = fa90Var.c;
            bVar2.getClass();
            Pair pair2 = new Pair(b64.j(str, str2 != null ? " ".concat(str2) : ""), this.$modelDescription);
            this.L$0 = null;
            this.label = 3;
        }
    }
}
