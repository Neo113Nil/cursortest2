package com.squareup.cash.autofillweb.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.autofillweb.api.AutofillWebManager;
import com.squareup.cash.autofillweb.api.CashFillConfig;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$CashFillWalmartShoppingAutofillDisabled;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fillr.real.RealFillrWebManager;
import com.squareup.scannerview.SizeMap;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class RealAutofillWebManagerProvider {
    public final AutofillWebManager autofillWebManager;
    public final RealCashFillJsStore cashFillJsStore;
    public final CoroutineScope coroutineScope;
    public final FeatureFlagManager featureFlagManager;
    public final SizeMap fieldDetectionLogger;
    public final RealFillrWebManager fillrManager;
    public final Set walmartTokens = ArraysKt___ArraysKt.toSet(new String[]{"M_fopbedhc", "M_bwydsw2l"});

    public RealAutofillWebManagerProvider(FeatureFlagManager featureFlagManager, RealFillrWebManager realFillrWebManager, AutofillWebManager autofillWebManager, RealCashFillJsStore realCashFillJsStore, SizeMap sizeMap, CoroutineScope coroutineScope) {
        this.featureFlagManager = featureFlagManager;
        this.fillrManager = realFillrWebManager;
        this.autofillWebManager = autofillWebManager;
        this.cashFillJsStore = realCashFillJsStore;
        this.fieldDetectionLogger = sizeMap;
        this.coroutineScope = coroutineScope;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (r9.equals("DISABLED") != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AggregateAutofillWebManager get(String str) {
        boolean contains = CollectionsKt.contains(this.walmartTokens, str);
        CashFillConfig cashFillConfig = CashFillConfig.Disabled.INSTANCE;
        if (contains) {
            String str2 = ((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$CashFillWalmartShoppingAutofillDisabled.INSTANCE)).value;
            int hashCode = str2.hashCode();
            if (hashCode == -891611359) {
                if (str2.equals("ENABLED")) {
                    cashFillConfig = CashFillConfig.Enabled.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("Unknown CashFillWalmartShoppingAutofillDisabled: ".concat(str2));
                return null;
            }
            if (hashCode != 1053567612) {
                if (hashCode == 1102001359 && str2.equals("SPECTATOR")) {
                    cashFillConfig = CashFillConfig.Spectator.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("Unknown CashFillWalmartShoppingAutofillDisabled: ".concat(str2));
                return null;
            }
        }
        return new AggregateAutofillWebManager(cashFillConfig, this.cashFillJsStore, this.fillrManager, this.autofillWebManager, this.coroutineScope, this.fieldDetectionLogger);
    }
}
