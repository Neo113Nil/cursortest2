package ru.yandex.taxi.logistics.sdk.tracking.impl.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Triple;", "", "", "", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Triple;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.TrackingViewModel$subscribeOnForceOpenEditOrderDetailsView$2", f = "TrackingViewModel.kt", l = {297, 298, 299}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class TrackingViewModel$subscribeOnForceOpenEditOrderDetailsView$2 extends SuspendLambda implements wls {
    long J$0;
    /* synthetic */ Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackingViewModel$subscribeOnForceOpenEditOrderDetailsView$2(Continuation continuation, k kVar) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrackingViewModel$subscribeOnForceOpenEditOrderDetailsView$2 trackingViewModel$subscribeOnForceOpenEditOrderDetailsView$2 = new TrackingViewModel$subscribeOnForceOpenEditOrderDetailsView$2(continuation, this.this$0);
        trackingViewModel$subscribeOnForceOpenEditOrderDetailsView$2.L$0 = obj;
        return trackingViewModel$subscribeOnForceOpenEditOrderDetailsView$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackingViewModel$subscribeOnForceOpenEditOrderDetailsView$2) create((Triple) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a4, code lost:
    
        if (kotlinx.coroutines.a.i(r8, r11) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (r12 == r1) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        long longValue;
        boolean z;
        Triple triple = (Triple) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            str = (String) triple.getFirst();
            boolean booleanValue = ((Boolean) triple.getSecond()).booleanValue();
            longValue = ((Number) triple.getThird()).longValue();
            ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.domain.a aVar = this.this$0.G;
            this.L$0 = null;
            this.L$1 = str;
            this.Z$0 = booleanValue;
            this.J$0 = longValue;
            this.label = 1;
            Object a = aVar.a(str, this, booleanValue);
            if (a != coroutineSingletons) {
                z = booleanValue;
                obj = a;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            longValue = this.J$0;
            z = this.Z$0;
            str = (String) this.L$1;
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.this$0.F.a(true);
                return zy11Var;
            }
            longValue = this.J$0;
            z = this.Z$0;
            kotlin.b.b(obj);
            this.L$0 = null;
            this.L$1 = null;
            this.Z$0 = z;
            this.J$0 = longValue;
            this.label = 3;
        }
        if (((Boolean) obj).booleanValue()) {
            ru.yandex.taxi.logistics.sdk.tracking.impl.edit_order_details.domain.a aVar2 = this.this$0.G;
            this.L$0 = null;
            this.L$1 = null;
            this.Z$0 = z;
            this.J$0 = longValue;
            this.label = 2;
            Object b = aVar2.a.b(str, this);
            if (b != coroutineSingletons) {
                b = zy11Var;
            }
        }
        return zy11Var;
    }
}
