package ru.yandex.taxi.masstransit.geopayment.checkout;

import defpackage.e3n;
import defpackage.f4a0;
import defpackage.h4z0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.on30;
import defpackage.r6f;
import defpackage.vpr;
import defpackage.zjb;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutInteractor$listenUIState$2$invokeSuspend$$inlined$combine$1$3", f = "MtCheckoutInteractor.kt", l = {338, MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class MtCheckoutInteractor$listenUIState$2$invokeSuspend$$inlined$combine$1$3 extends SuspendLambda implements zls {
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
    boolean Z$1;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtCheckoutInteractor$listenUIState$2$invokeSuspend$$inlined$combine$1$3(Continuation continuation, k kVar) {
        super(3, continuation);
        this.this$0 = kVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MtCheckoutInteractor$listenUIState$2$invokeSuspend$$inlined$combine$1$3 mtCheckoutInteractor$listenUIState$2$invokeSuspend$$inlined$combine$1$3 = new MtCheckoutInteractor$listenUIState$2$invokeSuspend$$inlined$combine$1$3((Continuation) obj3, this.this$0);
        mtCheckoutInteractor$listenUIState$2$invokeSuspend$$inlined$combine$1$3.L$0 = (vpr) obj;
        mtCheckoutInteractor$listenUIState$2$invokeSuspend$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return mtCheckoutInteractor$listenUIState$2$invokeSuspend$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d6, code lost:
    
        if (r10.emit(r0, r15) == r11) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d8, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b5, code lost:
    
        if (r0 == r11) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m;
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
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            e3n e3nVar = (e3n) objArr[7];
            on30 on30Var = (on30) obj8;
            f4a0 f4a0Var = (f4a0) obj7;
            boolean booleanValue = ((Boolean) obj6).booleanValue();
            boolean booleanValue2 = ((Boolean) obj5).booleanValue();
            r6f r6fVar = (r6f) obj4;
            h4z0 h4z0Var = (h4z0) obj3;
            zjb zjbVar = (zjb) obj2;
            b bVar = this.this$0.c;
            int i2 = h4z0Var != null ? h4z0Var.a : 1;
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
            this.L$11 = null;
            this.Z$0 = booleanValue;
            this.Z$1 = booleanValue2;
            this.label = 1;
            m = bVar.m(i2, zjbVar, f4a0Var, r6fVar, booleanValue2, booleanValue, on30Var, e3nVar, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$2;
            kotlin.b.b(obj);
            m = obj;
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
        this.label = 2;
    }
}
