package com.squareup.cash.db2.profile;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.protos.common.CurrencyCode;
import kotlin.jvm.functions.Function1;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes6.dex */
public final /* synthetic */ class ProfileQueries$$ExternalSyntheticLambda2 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InstrumentQueries f$0;

    public /* synthetic */ ProfileQueries$$ExternalSyntheticLambda2(InstrumentQueries instrumentQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                int i2 = ProfileQueries$btcDisplayUnits$2.$r8$clinit;
                break;
            case 2:
                int i3 = ProfileQueries$bitcoinAmountEntryCurrencyPreference$2.$r8$clinit;
                break;
        }
        this.f$0 = instrumentQueries;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.f$0;
        switch (i) {
            case 0:
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                return (CurrencyCode) NavAction$$ExternalSyntheticOutline0.m(androidCursor, 0, (EnumColumnAdapter) ((Profile.Adapter) instrumentQueries.instrumentAdapter).default_currencyAdapter);
            case 1:
                int i2 = ProfileQueries$btcDisplayUnits$2.$r8$clinit;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                androidCursor2.getClass();
                String string2 = androidCursor2.getString(0);
                return new BtcDisplayUnits(string2 != null ? (BitcoinDisplayUnits) ((EnumColumnAdapter) ((Profile.Adapter) instrumentQueries.instrumentAdapter).bitcoin_display_unitsAdapter).decode(string2) : null);
            default:
                int i3 = ProfileQueries$bitcoinAmountEntryCurrencyPreference$2.$r8$clinit;
                AndroidCursor androidCursor3 = (AndroidCursor) obj;
                androidCursor3.getClass();
                String string3 = androidCursor3.getString(0);
                return new BitcoinAmountEntryCurrencyPreference(string3 != null ? (CurrencyCode) ((EnumColumnAdapter) ((Profile.Adapter) instrumentQueries.instrumentAdapter).bitcoin_amount_entry_currency_preferenceAdapter).decode(string3) : null);
        }
    }
}
