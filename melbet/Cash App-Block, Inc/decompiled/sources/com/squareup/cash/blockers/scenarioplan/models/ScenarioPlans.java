package com.squareup.cash.blockers.scenarioplan.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zza;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ScenarioPlans implements Parcelable {
    public static final /* synthetic */ ScenarioPlans[] $VALUES;
    public static final ScenarioPlans CONFIRM_BITCOIN_DEPOSIT_INTENT;
    public static final Parcelable.Creator<ScenarioPlans> CREATOR;
    public static final ScenarioPlans CRYPTO_ONBOARDING;
    public static final ScenarioPlans INITIATE_BITCOIN_EXCHANGE;
    public static final ScenarioPlans INITIATE_BITCOIN_WITHDRAWAL;
    public static final ScenarioPlans INITIATE_INVESTMENT_ORDER;
    public static final ScenarioPlans INITIATE_STABLECOIN_EXCHANGE;
    public static final ScenarioPlans INITIATE_STABLECOIN_WITHDRAWAL;
    public static final ScenarioPlans REFRESH_LIGHTNING_INVOICE;

    static {
        ScenarioPlans scenarioPlans = new ScenarioPlans("CRYPTO_ONBOARDING", 0);
        CRYPTO_ONBOARDING = scenarioPlans;
        ScenarioPlans scenarioPlans2 = new ScenarioPlans("INITIATE_BITCOIN_WITHDRAWAL", 1);
        INITIATE_BITCOIN_WITHDRAWAL = scenarioPlans2;
        ScenarioPlans scenarioPlans3 = new ScenarioPlans("INITIATE_BITCOIN_EXCHANGE", 2);
        INITIATE_BITCOIN_EXCHANGE = scenarioPlans3;
        ScenarioPlans scenarioPlans4 = new ScenarioPlans("INITIATE_STABLECOIN_EXCHANGE", 3);
        INITIATE_STABLECOIN_EXCHANGE = scenarioPlans4;
        ScenarioPlans scenarioPlans5 = new ScenarioPlans("CONFIGURE_BITCOIN_PAYROLL", 4);
        ScenarioPlans scenarioPlans6 = new ScenarioPlans("REFRESH_LIGHTNING_INVOICE", 5);
        REFRESH_LIGHTNING_INVOICE = scenarioPlans6;
        ScenarioPlans scenarioPlans7 = new ScenarioPlans("CONFIRM_BITCOIN_DEPOSIT_INTENT", 6);
        CONFIRM_BITCOIN_DEPOSIT_INTENT = scenarioPlans7;
        ScenarioPlans scenarioPlans8 = new ScenarioPlans("INITIATE_INVESTMENT_ORDER", 7);
        INITIATE_INVESTMENT_ORDER = scenarioPlans8;
        ScenarioPlans scenarioPlans9 = new ScenarioPlans("INITIATE_STABLECOIN_WITHDRAWAL", 8);
        INITIATE_STABLECOIN_WITHDRAWAL = scenarioPlans9;
        $VALUES = new ScenarioPlans[]{scenarioPlans, scenarioPlans2, scenarioPlans3, scenarioPlans4, scenarioPlans5, scenarioPlans6, scenarioPlans7, scenarioPlans8, scenarioPlans9};
        CREATOR = new zza(14);
    }

    public static ScenarioPlans valueOf(String str) {
        return (ScenarioPlans) Enum.valueOf(ScenarioPlans.class, str);
    }

    public static ScenarioPlans[] values() {
        return (ScenarioPlans[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
