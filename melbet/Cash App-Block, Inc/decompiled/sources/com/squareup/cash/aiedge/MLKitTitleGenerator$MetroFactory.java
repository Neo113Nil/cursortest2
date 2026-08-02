package com.squareup.cash.aiedge;

import android.app.Activity;
import android.content.Context;
import androidx.credentials.CredentialManagerImpl;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.family.familyhub.backend.real.RealDependentAllowanceManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotDisclosureManager;
import com.squareup.cash.passkeys.backend.CredentialManagerBindingContainer$provideCredentialManagerWrapper$1;
import com.squareup.cash.permissions.AndroidPermissionChecker;
import com.squareup.cash.recurringpayments.backend.RealRecurringPaymentsManager;
import com.squareup.preferences.KeyValue;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class MLKitTitleGenerator$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final InstanceFactory coroutineScope;
    public final DoubleCheck featureFlagManager;

    public MLKitTitleGenerator$MetroFactory(DoubleCheck doubleCheck, InstanceFactory instanceFactory) {
        this.$r8$classId = 4;
        this.coroutineScope = instanceFactory;
        this.featureFlagManager = doubleCheck;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        DoubleCheck doubleCheck = this.featureFlagManager;
        InstanceFactory instanceFactory = this.coroutineScope;
        switch (i) {
            case 0:
                FeatureFlagManager featureFlagManager = (FeatureFlagManager) doubleCheck.getValue();
                CoroutineScope coroutineScope = (CoroutineScope) instanceFactory.value;
                featureFlagManager.getClass();
                coroutineScope.getClass();
                return new BinaryBitmap(featureFlagManager, coroutineScope);
            case 1:
                RealRecurringPaymentsManager realRecurringPaymentsManager = (RealRecurringPaymentsManager) doubleCheck.getValue();
                CoroutineScope coroutineScope2 = (CoroutineScope) instanceFactory.value;
                realRecurringPaymentsManager.getClass();
                coroutineScope2.getClass();
                return new RealDependentAllowanceManager(realRecurringPaymentsManager, coroutineScope2);
            case 2:
                SyncValueReader syncValueReader = (SyncValueReader) doubleCheck.getValue();
                CoroutineScope coroutineScope3 = (CoroutineScope) instanceFactory.value;
                syncValueReader.getClass();
                coroutineScope3.getClass();
                return new RealMoneybotDisclosureManager(syncValueReader, coroutineScope3);
            case 3:
                CredentialManagerImpl credentialManagerImpl = (CredentialManagerImpl) doubleCheck.getValue();
                Activity activity = (Activity) instanceFactory.value;
                credentialManagerImpl.getClass();
                activity.getClass();
                return new CredentialManagerBindingContainer$provideCredentialManagerWrapper$1(credentialManagerImpl, activity);
            default:
                Context context = (Context) instanceFactory.value;
                KeyValue keyValue = (KeyValue) doubleCheck.getValue();
                context.getClass();
                keyValue.getClass();
                return new AndroidPermissionChecker(context, keyValue);
        }
    }

    public /* synthetic */ MLKitTitleGenerator$MetroFactory(int i, DoubleCheck doubleCheck, InstanceFactory instanceFactory) {
        this.$r8$classId = i;
        this.featureFlagManager = doubleCheck;
        this.coroutineScope = instanceFactory;
    }
}
