package com.squareup.cash.card.onboarding;

import androidx.compose.runtime.MutableState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.franklin.api.PaymentDeviceOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaymentDeviceCustomizationPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $notifiedDeviceIds$delegate;
    public final /* synthetic */ List $options;
    public int I$0;
    public int I$1;
    public PaymentDeviceCustomizationPresenter L$1;
    public Collection L$3;
    public Iterator L$4;
    public Object L$5;
    public int label;
    public final /* synthetic */ PaymentDeviceCustomizationPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDeviceCustomizationPresenter$models$1$1(List list, PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$options = list;
        this.this$0 = paymentDeviceCustomizationPresenter;
        this.$notifiedDeviceIds$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentDeviceCustomizationPresenter$models$1$1(this.$options, this.this$0, this.$notifiedDeviceIds$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentDeviceCustomizationPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x008a -> B:5:0x008d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Collection arrayList;
        Iterator it;
        int i2;
        PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            SafeTrace.throwOnFailure(obj);
            List list = this.$options;
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = ((PaymentDeviceOption) it2.next()).payment_device_id;
                if (str != null) {
                    arrayList2.add(str);
                }
            }
            i = 0;
            arrayList = new ArrayList();
            it = arrayList2.iterator();
            i2 = 0;
            paymentDeviceCustomizationPresenter = this.this$0;
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = this.I$1;
            i = this.I$0;
            Object next = this.L$5;
            it = this.L$4;
            arrayList = this.L$3;
            paymentDeviceCustomizationPresenter = this.L$1;
            SafeTrace.throwOnFailure(obj);
            if (((Boolean) obj).booleanValue()) {
                arrayList.add(next);
            }
            if (it.hasNext()) {
                next = it.next();
                String str2 = (String) next;
                PdpNotifiedPreference pdpNotifiedPreference = paymentDeviceCustomizationPresenter.pdpNotifiedPreference;
                str2.getClass();
                Flow observe = ((KeyValue) pdpNotifiedPreference.keyValueFactory.invoke(str2)).observe();
                this.L$1 = paymentDeviceCustomizationPresenter;
                this.L$3 = arrayList;
                this.L$4 = it;
                this.L$5 = next;
                this.I$0 = i;
                this.I$1 = i2;
                this.label = 1;
                obj = FlowKt.first(observe, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (((Boolean) obj).booleanValue()) {
                }
                if (it.hasNext()) {
                    Set set = CollectionsKt.toSet((List) arrayList);
                    if (!set.isEmpty()) {
                        MutableState mutableState = this.$notifiedDeviceIds$delegate;
                        mutableState.setValue(SetsKt___SetsKt.plus((Set) mutableState.getValue(), (Iterable) set));
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
