package ru.yandex.taxi.summary.solid.repository;

import defpackage.evu0;
import defpackage.f0c0;
import defpackage.lub0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rj6;
import defpackage.vpr;
import defpackage.ybo;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.solid.repository.SummaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$3", f = "SummaryPinV2DataRepository.kt", l = {337, 344, MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class SummaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$3(Continuation continuation, f fVar) {
        super(3, continuation);
        this.this$0 = fVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SummaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$3 summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$3 = new SummaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$3((Continuation) obj3, this.this$0);
        summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return summaryPinV2DataRepository$stateInternalFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0156, code lost:
    
        if (r6.emit(r10, r19) == r7) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0123, code lost:
    
        if (r0 == r7) goto L33;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object e;
        String str;
        Object e2;
        rj6 rj6Var;
        SourceOnMapControl.a aVar;
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            lub0 lub0Var = (lub0) objArr[5];
            rj6 rj6Var2 = (rj6) obj6;
            ybo yboVar = (ybo) obj5;
            boolean booleanValue = ((Boolean) obj4).booleanValue();
            AddressResolveRepository.State state = (AddressResolveRepository.State) obj3;
            String str2 = (String) obj2;
            if (state != AddressResolveRepository.State.LOADED || str2 == null || str2.length() == 0) {
                f fVar = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.Z$0 = booleanValue;
                this.label = 1;
                e = f.e(fVar, state, booleanValue, yboVar, lub0Var, this);
            } else {
                str = !booleanValue ? "" : rj6Var2.a;
                f fVar2 = this.this$0;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = vprVar;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = rj6Var2;
                this.L$8 = null;
                this.L$9 = null;
                this.L$10 = null;
                this.L$11 = str;
                this.Z$0 = booleanValue;
                this.label = 2;
                e2 = f.e(fVar2, state, booleanValue, yboVar, lub0Var, this);
                if (e2 != coroutineSingletons) {
                    rj6Var = rj6Var2;
                    aVar = new SourceOnMapControl.a((f0c0) e2, rj6Var.b, str, evu0.J(rj6Var.a), rj6Var.d, null, null, 1968);
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            e = obj;
            aVar = new SourceOnMapControl.a((f0c0) e, null, null, false, false, null, null, 2046);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str3 = (String) this.L$11;
            rj6Var = (rj6) this.L$7;
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            str = str3;
            e2 = obj;
            aVar = new SourceOnMapControl.a((f0c0) e2, rj6Var.b, str, evu0.J(rj6Var.a), rj6Var.d, null, null, 1968);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.L$7 = null;
        this.L$8 = null;
        this.L$9 = null;
        this.L$10 = null;
        this.L$11 = null;
        this.label = 3;
    }
}
