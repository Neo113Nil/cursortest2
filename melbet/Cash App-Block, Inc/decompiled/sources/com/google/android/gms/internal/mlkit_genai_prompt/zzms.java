package com.google.android.gms.internal.mlkit_genai_prompt;

import com.squareup.cash.payments.backend.api.PaymentActionComplete;
import com.squareup.protos.franklin.common.SyncCustomer;
import com.squareup.protos.franklin.ui.UiCustomer;
import com.withpersona.sdk2.inquiry.permissions.permissionRequest.PermissionRequestFragment;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class zzms extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object zza;
    public final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zzms(String str, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.zzb = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        String str = this.zzb;
        switch (i) {
            case 0:
                zzms zzmsVar = new zzms(str, continuation, 0);
                zzmsVar.zza = obj;
                return zzmsVar;
            case 1:
                zzms zzmsVar2 = new zzms(str, continuation, 1);
                zzmsVar2.zza = obj;
                return zzmsVar2;
            case 2:
                zzms zzmsVar3 = new zzms(str, continuation, 2);
                zzmsVar3.zza = obj;
                return zzmsVar3;
            case 3:
                zzms zzmsVar4 = new zzms(str, continuation, 3);
                zzmsVar4.zza = obj;
                return zzmsVar4;
            case 4:
                zzms zzmsVar5 = new zzms(str, continuation, 4);
                zzmsVar5.zza = obj;
                return zzmsVar5;
            default:
                zzms zzmsVar6 = new zzms(str, continuation, 5);
                zzmsVar6.zza = obj;
                return zzmsVar6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((zzms) create((Map) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((zzms) create((PaymentActionComplete) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((zzms) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((zzms) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((zzms) create((PaymentActionComplete) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((zzms) create((PermissionRequestFragment.PermissionRequestFragmentResult) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        int i = this.$r8$classId;
        UiCustomer uiCustomer = null;
        String str = this.zzb;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return ((Map) this.zza).get(str);
            case 1:
                PaymentActionComplete paymentActionComplete = (PaymentActionComplete) this.zza;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(!Intrinsics.areEqual(paymentActionComplete.action.getFlowToken(), str));
            case 2:
                List list = (List) this.zza;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        SyncCustomer syncCustomer = (SyncCustomer) obj2;
                        UiCustomer uiCustomer2 = syncCustomer.customer;
                        if (!Intrinsics.areEqual(uiCustomer2 != null ? uiCustomer2.threaded_customer_id : null, str)) {
                            UiCustomer uiCustomer3 = syncCustomer.customer;
                            if (Intrinsics.areEqual(uiCustomer3 != null ? uiCustomer3.id : null, str)) {
                            }
                        }
                    } else {
                        obj2 = null;
                    }
                }
                SyncCustomer syncCustomer2 = (SyncCustomer) obj2;
                if (syncCustomer2 != null) {
                    return syncCustomer2.customer;
                }
                return null;
            case 3:
                List list2 = (List) this.zza;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                List list3 = list2;
                Iterator it2 = list3.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj3 = it2.next();
                        UiCustomer uiCustomer4 = ((SyncCustomer) obj3).customer;
                        if (Intrinsics.areEqual(uiCustomer4 != null ? uiCustomer4.id : null, str)) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                SyncCustomer syncCustomer3 = (SyncCustomer) obj3;
                UiCustomer uiCustomer5 = syncCustomer3 != null ? syncCustomer3.customer : null;
                String str2 = uiCustomer5 != null ? uiCustomer5.threaded_customer_id : null;
                if (str2 != null) {
                    Iterator it3 = list3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj4 = it3.next();
                            UiCustomer uiCustomer6 = ((SyncCustomer) obj4).customer;
                            if (Intrinsics.areEqual(uiCustomer6 != null ? uiCustomer6.id : null, str2)) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    SyncCustomer syncCustomer4 = (SyncCustomer) obj4;
                    if (syncCustomer4 != null) {
                        uiCustomer = syncCustomer4.customer;
                    }
                }
                return uiCustomer == null ? uiCustomer5 : uiCustomer;
            case 4:
                PaymentActionComplete paymentActionComplete2 = (PaymentActionComplete) this.zza;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(!Intrinsics.areEqual(paymentActionComplete2.action.getFlowToken(), str));
            default:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(Intrinsics.areEqual(((PermissionRequestFragment.PermissionRequestFragmentResult) this.zza).requestId, str));
        }
    }
}
