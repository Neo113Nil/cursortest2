package com.squareup.cash.data.contacts;

import com.squareup.cash.crypto.backend.balance.CryptoBalance$StablecoinBalance;
import com.squareup.cash.stablecoin.presenters.widgets.state.StablecoinHomeWidgetState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ContactModifiablePermissions$shouldShowRequestPermissionRationale$4 extends SuspendLambda implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public /* synthetic */ boolean Z$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContactModifiablePermissions$shouldShowRequestPermissionRationale$4(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 4;
        switch (this.$r8$classId) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                ContactModifiablePermissions$shouldShowRequestPermissionRationale$4 contactModifiablePermissions$shouldShowRequestPermissionRationale$4 = new ContactModifiablePermissions$shouldShowRequestPermissionRationale$4(i, (Continuation) obj4, 0);
                contactModifiablePermissions$shouldShowRequestPermissionRationale$4.Z$0 = booleanValue;
                contactModifiablePermissions$shouldShowRequestPermissionRationale$4.L$0 = (ContactsSyncState) obj2;
                contactModifiablePermissions$shouldShowRequestPermissionRationale$4.Z$1 = booleanValue2;
                return contactModifiablePermissions$shouldShowRequestPermissionRationale$4.invokeSuspend(Unit.INSTANCE);
            default:
                boolean booleanValue3 = ((Boolean) obj2).booleanValue();
                boolean booleanValue4 = ((Boolean) obj3).booleanValue();
                ContactModifiablePermissions$shouldShowRequestPermissionRationale$4 contactModifiablePermissions$shouldShowRequestPermissionRationale$42 = new ContactModifiablePermissions$shouldShowRequestPermissionRationale$4(i, (Continuation) obj4, 1);
                contactModifiablePermissions$shouldShowRequestPermissionRationale$42.L$0 = (CryptoBalance$StablecoinBalance) obj;
                contactModifiablePermissions$shouldShowRequestPermissionRationale$42.Z$0 = booleanValue3;
                contactModifiablePermissions$shouldShowRequestPermissionRationale$42.Z$1 = booleanValue4;
                return contactModifiablePermissions$shouldShowRequestPermissionRationale$42.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                boolean z = this.Z$0;
                ContactsSyncState contactsSyncState = (ContactsSyncState) this.L$0;
                boolean z2 = this.Z$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf((z && contactsSyncState == ContactsSyncState.OFF) ? true : z2);
            default:
                CryptoBalance$StablecoinBalance cryptoBalance$StablecoinBalance = (CryptoBalance$StablecoinBalance) this.L$0;
                boolean z3 = this.Z$0;
                boolean z4 = this.Z$1;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (!z4) {
                    if ((cryptoBalance$StablecoinBalance != null ? cryptoBalance$StablecoinBalance.amount : 0L) <= 0) {
                        r1 = false;
                    }
                }
                return new StablecoinHomeWidgetState(cryptoBalance$StablecoinBalance, z3, r1);
        }
    }
}
