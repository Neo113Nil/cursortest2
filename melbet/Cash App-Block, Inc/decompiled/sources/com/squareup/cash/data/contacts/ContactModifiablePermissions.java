package com.squareup.cash.data.contacts;

import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardModelView$getActiveHeat$2$2;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.permissions.AndroidPermissionManager$create$1;
import com.squareup.cash.permissions.ModifiablePermissions;
import com.squareup.cash.permissions.ReadOnlyPermissions;
import com.squareup.preferences.EnumPreference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class ContactModifiablePermissions implements ModifiablePermissions {
    public final EnumPreference contactsSyncPreference;
    public final AndroidPermissionManager$create$1 permissions;

    public final class PermissionTuple {
        public final boolean granted;
        public final ContactsSyncState syncState;

        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ContactsSyncState.values().length];
                try {
                    ContactsSyncState contactsSyncState = ContactsSyncState.DEFAULT;
                    iArr[2] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public PermissionTuple(boolean z, ContactsSyncState contactsSyncState) {
            contactsSyncState.getClass();
            this.granted = z;
            this.syncState = contactsSyncState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PermissionTuple)) {
                return false;
            }
            PermissionTuple permissionTuple = (PermissionTuple) obj;
            return this.granted == permissionTuple.granted && this.syncState == permissionTuple.syncState;
        }

        public final int hashCode() {
            return this.syncState.hashCode() + (Boolean.hashCode(this.granted) * 31);
        }

        public final String toString() {
            return "PermissionTuple(granted=" + this.granted + ", syncState=" + this.syncState + ")";
        }
    }

    public ContactModifiablePermissions(AndroidPermissionManager$create$1 androidPermissionManager$create$1, EnumPreference enumPreference) {
        this.permissions = androidPermissionManager$create$1;
        this.contactsSyncPreference = enumPreference;
    }

    @Override // com.squareup.cash.permissions.ReadOnlyPermissions
    public final boolean check() {
        boolean check = this.permissions.$readonly.check();
        if (PermissionTuple.WhenMappings.$EnumSwitchMapping$0[((ContactsSyncState) this.contactsSyncPreference.get()).ordinal()] == 1) {
            return false;
        }
        return check;
    }

    @Override // com.squareup.cash.permissions.ReadOnlyPermissions
    public final Flow denied() {
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(this.permissions.$readonly.denied(), new TemporaryStorage$getDir$2(this, null, 29), 3);
    }

    @Override // com.squareup.cash.permissions.ReadOnlyPermissions
    public final Flow granted() {
        ReadOnlyPermissions readOnlyPermissions = this.permissions.$readonly;
        Flow granted = readOnlyPermissions.granted();
        EnumPreference enumPreference = this.contactsSyncPreference;
        return FlowKt.distinctUntilChanged(new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new FlowUtil$createFlow$$inlined$map$1(new PermissionTuple(readOnlyPermissions.check(), (ContactsSyncState) enumPreference.get()), new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(granted, enumPreference.asFlow(), ContactModifiablePermissions$granted$3.INSTANCE, 0), new CardModelView$getActiveHeat$2$2(this, (Continuation) null, 6)), 28));
    }

    @Override // com.squareup.cash.permissions.ModifiablePermissions
    public final void request() {
        EnumPreference enumPreference = this.contactsSyncPreference;
        if (enumPreference.get() == ContactsSyncState.OFF) {
            enumPreference.set(ContactsSyncState.ON);
        }
        AndroidPermissionManager$create$1 androidPermissionManager$create$1 = this.permissions;
        if (androidPermissionManager$create$1.$readonly.check()) {
            return;
        }
        androidPermissionManager$create$1.request();
    }

    @Override // com.squareup.cash.permissions.ModifiablePermissions
    public final Object shouldShowOverridePrompt(ContinuationImpl continuationImpl) {
        AndroidPermissionManager$create$1 androidPermissionManager$create$1 = this.permissions;
        if (androidPermissionManager$create$1.$readonly.check()) {
            EnumPreference enumPreference = this.contactsSyncPreference;
            if (enumPreference.get() == ContactsSyncState.OFF) {
                enumPreference.set(ContactsSyncState.ON);
                return Boolean.FALSE;
            }
        }
        return androidPermissionManager$create$1.shouldShowOverridePrompt(continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.squareup.cash.permissions.ModifiablePermissions
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object shouldShowRequestPermissionRationale(ContinuationImpl continuationImpl) {
        ContactModifiablePermissions$shouldShowRequestPermissionRationale$1 contactModifiablePermissions$shouldShowRequestPermissionRationale$1;
        int i;
        RealGooglePayer$createWallet$$inlined$filter$1 realGooglePayer$createWallet$$inlined$filter$1;
        RealGooglePayer$createWallet$$inlined$filter$1 realGooglePayer$createWallet$$inlined$filter$12;
        if (continuationImpl instanceof ContactModifiablePermissions$shouldShowRequestPermissionRationale$1) {
            contactModifiablePermissions$shouldShowRequestPermissionRationale$1 = (ContactModifiablePermissions$shouldShowRequestPermissionRationale$1) continuationImpl;
            int i2 = contactModifiablePermissions$shouldShowRequestPermissionRationale$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                contactModifiablePermissions$shouldShowRequestPermissionRationale$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = contactModifiablePermissions$shouldShowRequestPermissionRationale$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = contactModifiablePermissions$shouldShowRequestPermissionRationale$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AndroidPermissionManager$create$1 androidPermissionManager$create$1 = this.permissions;
                    RealGooglePayer$createWallet$$inlined$filter$1 realGooglePayer$createWallet$$inlined$filter$13 = new RealGooglePayer$createWallet$$inlined$filter$1(androidPermissionManager$create$1.$readonly.granted(), 7);
                    RealGooglePayer$createWallet$$inlined$filter$1 realGooglePayer$createWallet$$inlined$filter$14 = new RealGooglePayer$createWallet$$inlined$filter$1(this.contactsSyncPreference.asFlow(), 8);
                    contactModifiablePermissions$shouldShowRequestPermissionRationale$1.L$0 = realGooglePayer$createWallet$$inlined$filter$13;
                    contactModifiablePermissions$shouldShowRequestPermissionRationale$1.L$1 = realGooglePayer$createWallet$$inlined$filter$14;
                    contactModifiablePermissions$shouldShowRequestPermissionRationale$1.label = 1;
                    obj = androidPermissionManager$create$1.shouldShowRequestPermissionRationale(contactModifiablePermissions$shouldShowRequestPermissionRationale$1);
                    if (obj != coroutineSingletons) {
                        realGooglePayer$createWallet$$inlined$filter$1 = realGooglePayer$createWallet$$inlined$filter$14;
                        realGooglePayer$createWallet$$inlined$filter$12 = realGooglePayer$createWallet$$inlined$filter$13;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                realGooglePayer$createWallet$$inlined$filter$1 = contactModifiablePermissions$shouldShowRequestPermissionRationale$1.L$1;
                realGooglePayer$createWallet$$inlined$filter$12 = contactModifiablePermissions$shouldShowRequestPermissionRationale$1.L$0;
                SafeTrace.throwOnFailure(obj);
                FinishSetupTileBadgeCounter combine = FlowKt.combine(realGooglePayer$createWallet$$inlined$filter$12, realGooglePayer$createWallet$$inlined$filter$1, new AppLockMonitor$special$$inlined$map$2(obj, 19), new ContactModifiablePermissions$shouldShowRequestPermissionRationale$4(4, null, 0));
                contactModifiablePermissions$shouldShowRequestPermissionRationale$1.L$0 = null;
                contactModifiablePermissions$shouldShowRequestPermissionRationale$1.L$1 = null;
                contactModifiablePermissions$shouldShowRequestPermissionRationale$1.label = 2;
                Object first = FlowKt.first(combine, contactModifiablePermissions$shouldShowRequestPermissionRationale$1);
                return first != coroutineSingletons ? coroutineSingletons : first;
            }
        }
        contactModifiablePermissions$shouldShowRequestPermissionRationale$1 = new ContactModifiablePermissions$shouldShowRequestPermissionRationale$1(this, continuationImpl);
        Object obj2 = contactModifiablePermissions$shouldShowRequestPermissionRationale$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = contactModifiablePermissions$shouldShowRequestPermissionRationale$1.label;
        if (i != 0) {
        }
        FinishSetupTileBadgeCounter combine2 = FlowKt.combine(realGooglePayer$createWallet$$inlined$filter$12, realGooglePayer$createWallet$$inlined$filter$1, new AppLockMonitor$special$$inlined$map$2(obj2, 19), new ContactModifiablePermissions$shouldShowRequestPermissionRationale$4(4, null, 0));
        contactModifiablePermissions$shouldShowRequestPermissionRationale$1.L$0 = null;
        contactModifiablePermissions$shouldShowRequestPermissionRationale$1.L$1 = null;
        contactModifiablePermissions$shouldShowRequestPermissionRationale$1.label = 2;
        Object first2 = FlowKt.first(combine2, contactModifiablePermissions$shouldShowRequestPermissionRationale$1);
        if (first2 != coroutineSingletons2) {
        }
    }
}
