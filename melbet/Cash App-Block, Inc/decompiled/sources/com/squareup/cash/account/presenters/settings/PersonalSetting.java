package com.squareup.cash.account.presenters.settings;

import androidx.compose.runtime.GapComposer;
import app.cash.badging.api.BadgingState;
import com.google.mlkit.vision.text.internal.zzr;
import com.google.zxing.Result;
import com.squareup.cash.R;
import com.squareup.cash.account.settings.viewmodels.AccountSettingsRow;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.preferences.BooleanPreference;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class PersonalSetting extends AccountSettingsCapability {
    public final /* synthetic */ int $r8$classId;
    public final RealBitcoinCapabilityProvider bitcoinCapabilityProvider;
    public final Object stringManager;

    public /* synthetic */ PersonalSetting(RealBitcoinCapabilityProvider realBitcoinCapabilityProvider, Object obj, int i) {
        this.$r8$classId = i;
        this.bitcoinCapabilityProvider = realBitcoinCapabilityProvider;
        this.stringManager = obj;
    }

    @Override // com.squareup.cash.bitcoin.capability.BTCxCapability
    public Object checkAdditionalIsAvailable(Continuation continuation) {
        switch (this.$r8$classId) {
            case 1:
                return Boolean.valueOf(((BooleanPreference) this.stringManager).get());
            default:
                return super.checkAdditionalIsAvailable(continuation);
        }
    }

    @Override // com.squareup.cash.bitcoin.capability.BTCxCapability
    public final RealBitcoinCapabilityProvider getBitcoinCapabilityProvider() {
        int i = this.$r8$classId;
        return this.bitcoinCapabilityProvider;
    }

    @Override // com.squareup.cash.account.presenters.settings.AccountSettingsCapability
    public final AccountSettingsRow getRow(BadgingState badgingState, GapComposer gapComposer) {
        int i = this.$r8$classId;
        badgingState.getClass();
        switch (i) {
            case 0:
                gapComposer.startReplaceGroup(-13416060);
                AccountSettingsRow.Personal personal = new AccountSettingsRow.Personal(badgingState.profilePersonal > 0 || badgingState.identityVerification > 0, ((AndroidStringManager) this.stringManager).get(R.string.account_settings_personal_title));
                gapComposer.end(false);
                return personal;
            default:
                gapComposer.startReplaceGroup(703307364);
                gapComposer.end(false);
                return AccountSettingsRow.LinkedBusinesses.INSTANCE;
        }
    }

    /* loaded from: classes.dex */
    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider bitcoinCapabilityProvider;
        public final LambdaProvider stringManager;

        public /* synthetic */ MetroFactory(LambdaProvider lambdaProvider, Factory factory, int i) {
            this.$r8$classId = i;
            this.stringManager = lambdaProvider;
            this.bitcoinCapabilityProvider = factory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.bitcoinCapabilityProvider;
            LambdaProvider lambdaProvider = this.stringManager;
            switch (i) {
                case 0:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) provider.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) lambdaProvider.lambda.invoke();
                    realBitcoinCapabilityProvider.getClass();
                    androidStringManager.getClass();
                    return new PersonalSetting(realBitcoinCapabilityProvider, androidStringManager, 0);
                case 1:
                    ErrorReporter errorReporter = (ErrorReporter) lambdaProvider.lambda.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) provider.invoke();
                    errorReporter.getClass();
                    sampleStrategy.getClass();
                    return new Result(16, errorReporter, sampleStrategy);
                case 2:
                    RealCustomerStore realCustomerStore = (RealCustomerStore) provider.invoke();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) lambdaProvider.lambda.invoke();
                    realCustomerStore.getClass();
                    realUuidGenerator.getClass();
                    return new zzr(realCustomerStore, realUuidGenerator);
                case 3:
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider.invoke();
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) lambdaProvider.lambda.invoke();
                    factory.getClass();
                    androidStringManager2.getClass();
                    return new EglCore(factory, androidStringManager2);
                default:
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) lambdaProvider.lambda.invoke();
                    LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) provider.invoke();
                    androidStringManager3.getClass();
                    factory2.getClass();
                    return new ToolbarTuckTargets(factory2, androidStringManager3);
            }
        }

        public /* synthetic */ MetroFactory(Factory factory, LambdaProvider lambdaProvider, int i) {
            this.$r8$classId = i;
            this.bitcoinCapabilityProvider = factory;
            this.stringManager = lambdaProvider;
        }
    }
}
