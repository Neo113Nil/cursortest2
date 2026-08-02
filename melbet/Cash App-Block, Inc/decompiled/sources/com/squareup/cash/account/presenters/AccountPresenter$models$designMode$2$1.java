package com.squareup.cash.account.presenters;

import androidx.compose.runtime.ProduceStateScope;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.nimbusds.jose.jca.JCAContext;
import com.squareup.cash.account.presenters.settings.AccountSettingsCapabilityProvider;
import com.squareup.cash.eligibility.backend.api.SettingsEligibilityManager$AccountSettingsResult;
import com.squareup.cash.eligibility.backend.real.InMemoryAccountSettingsCache;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.preferences.KeyValue;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class AccountPresenter$models$designMode$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public ProduceStateScope L$1;
    public int label;
    public final /* synthetic */ AccountPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AccountPresenter$models$designMode$2$1(AccountPresenter accountPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = accountPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        AccountPresenter accountPresenter = this.this$0;
        switch (i) {
            case 0:
                AccountPresenter$models$designMode$2$1 accountPresenter$models$designMode$2$1 = new AccountPresenter$models$designMode$2$1(accountPresenter, continuation, 0);
                accountPresenter$models$designMode$2$1.L$0 = obj;
                return accountPresenter$models$designMode$2$1;
            case 1:
                AccountPresenter$models$designMode$2$1 accountPresenter$models$designMode$2$12 = new AccountPresenter$models$designMode$2$1(accountPresenter, continuation, 1);
                accountPresenter$models$designMode$2$12.L$0 = obj;
                return accountPresenter$models$designMode$2$12;
            case 2:
                AccountPresenter$models$designMode$2$1 accountPresenter$models$designMode$2$13 = new AccountPresenter$models$designMode$2$1(accountPresenter, continuation, 2);
                accountPresenter$models$designMode$2$13.L$0 = obj;
                return accountPresenter$models$designMode$2$13;
            default:
                AccountPresenter$models$designMode$2$1 accountPresenter$models$designMode$2$14 = new AccountPresenter$models$designMode$2$1(accountPresenter, continuation, 3);
                accountPresenter$models$designMode$2$14.L$0 = obj;
                return accountPresenter$models$designMode$2$14;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ProduceStateScope produceStateScope = (ProduceStateScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((AccountPresenter$models$designMode$2$1) create(produceStateScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        AccountPresenter accountPresenter = this.this$0;
        InMemoryAccountSettingsCache inMemoryAccountSettingsCache = null;
        switch (i) {
            case 0:
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    JCAContext jCAContext = accountPresenter.settingsFeatureManager;
                    this.L$0 = null;
                    this.L$1 = produceStateScope;
                    this.label = 1;
                    obj = jCAContext.getSettingsDesignMode(this);
                    if (obj == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    produceStateScope = this.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                produceStateScope.setValue(obj);
                break;
            case 1:
                ProduceStateScope produceStateScope2 = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealSettingsEligibilityManager realSettingsEligibilityManager = accountPresenter.settingsManager;
                    this.L$0 = null;
                    this.L$1 = produceStateScope2;
                    this.label = 1;
                    obj = realSettingsEligibilityManager.settings(this);
                    if (obj == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    produceStateScope2 = this.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                SettingsEligibilityManager$AccountSettingsResult settingsEligibilityManager$AccountSettingsResult = (SettingsEligibilityManager$AccountSettingsResult) obj;
                if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsError)) {
                    if (!(settingsEligibilityManager$AccountSettingsResult instanceof SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        inMemoryAccountSettingsCache = ((SettingsEligibilityManager$AccountSettingsResult.SettingsLoaded) settingsEligibilityManager$AccountSettingsResult).cache;
                    }
                }
                produceStateScope2.setValue(inMemoryAccountSettingsCache);
                break;
            case 2:
                ProduceStateScope produceStateScope3 = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AccountSettingsCapabilityProvider accountSettingsCapabilityProvider = accountPresenter.accountSettingsCapabilityProvider;
                    this.L$0 = null;
                    this.L$1 = produceStateScope3;
                    this.label = 1;
                    obj = accountSettingsCapabilityProvider.availableCapabilities(this);
                    if (obj == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    produceStateScope3 = this.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                produceStateScope3.setValue(obj);
                break;
            default:
                ProduceStateScope produceStateScope4 = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    KeyValue keyValue = accountPresenter.paymentPadThemeSelection;
                    this.L$0 = null;
                    this.L$1 = produceStateScope4;
                    this.label = 1;
                    obj = keyValue.get(this);
                    if (obj == coroutineSingletons4) {
                        break;
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    produceStateScope4 = this.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                produceStateScope4.setValue(PaymentPadTheme.valueOf((String) obj));
                break;
        }
        return Unit.INSTANCE;
    }
}
