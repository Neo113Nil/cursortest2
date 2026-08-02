package com.squareup.cash.localization;

import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.preferences.KeyValue;
import kotlin.Lazy;
import kotlin.LazyKt;

/* loaded from: classes.dex */
public final class RealLanguageManager {
    public final CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteGate;
    public final KeyValue isSpanishEnabled;
    public final Lazy isSpanishEnabledForThisSession$delegate = LazyKt.lazy(new RealBrazeManager$$ExternalSyntheticLambda0(this, 23));

    public RealLanguageManager(CashAppLiteReleaseModule$$ExternalSyntheticLambda0 cashAppLiteReleaseModule$$ExternalSyntheticLambda0, KeyValue keyValue) {
        this.cashAppLiteGate = cashAppLiteReleaseModule$$ExternalSyntheticLambda0;
        this.isSpanishEnabled = keyValue;
    }
}
