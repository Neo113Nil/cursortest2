package ru.yandex.taxi.logistics.sdk.address_details.impl.ui;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ot0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vu0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.address_details.impl.ui.AddressDetailsViewModel$onAddressClicked$1", f = "AddressDetailsViewModel.kt", l = {110, 112}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AddressDetailsViewModel$onAddressClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ vu0 $addressFlow;
    final /* synthetic */ int $addressIndex;
    final /* synthetic */ boolean $closeDetails;
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressDetailsViewModel$onAddressClicked$1(vu0 vu0Var, e eVar, int i, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$addressFlow = vu0Var;
        this.this$0 = eVar;
        this.$addressIndex = i;
        this.$closeDetails = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressDetailsViewModel$onAddressClicked$1(this.$addressFlow, this.this$0, this.$addressIndex, this.$closeDetails, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressDetailsViewModel$onAddressClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0030, code lost:
    
        if (r6 == r0) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vu0 vu0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            vu0Var = this.$addressFlow;
            if (vu0Var == null) {
                tpr tprVar = this.this$0.A;
                this.label = 1;
                obj = kotlinx.coroutines.flow.e.A(tprVar, this);
            }
            ru.yandex.taxi.logistics.sdk.address_details.api.a aVar = this.this$0.b;
            int i2 = this.$addressIndex;
            this.L$0 = null;
            this.label = 2;
            obj = aVar.a.invoke(new Integer(i2), vu0Var, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (this.$closeDetails && booleanValue) {
                    this.this$0.b.x.dismiss();
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        ot0 ot0Var = (ot0) obj;
        vu0Var = ot0Var != null ? ot0Var.f : null;
        ru.yandex.taxi.logistics.sdk.address_details.api.a aVar2 = this.this$0.b;
        int i22 = this.$addressIndex;
        this.L$0 = null;
        this.label = 2;
        obj = aVar2.a.invoke(new Integer(i22), vu0Var, this);
    }
}
