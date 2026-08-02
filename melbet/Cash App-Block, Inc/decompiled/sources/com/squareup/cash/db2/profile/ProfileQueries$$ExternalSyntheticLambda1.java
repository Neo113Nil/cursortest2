package com.squareup.cash.db2.profile;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.sqldelight.EnumColumnAdapter;
import app.cash.sqldelight.driver.android.AndroidCursor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.db.WireRepeatedAdapter;
import com.squareup.cash.db2.InstrumentQueries;
import com.squareup.cash.db2.profile.Profile;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.api.RatePlan;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.common.DepositPreferenceData;
import com.squareup.protos.franklin.common.NearbyVisibility;
import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;
import java.util.List;
import kotlin.jvm.functions.Function1;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes.dex */
public final /* synthetic */ class ProfileQueries$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InstrumentQueries f$1;

    public /* synthetic */ ProfileQueries$$ExternalSyntheticLambda1(InstrumentQueries instrumentQueries, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                ProfileQueries$select$2 profileQueries$select$2 = ProfileQueries$select$2.INSTANCE;
                break;
            default:
                int i2 = ProfileQueries$selectRegion$2.$r8$clinit;
                break;
        }
        this.f$1 = instrumentQueries;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v31, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [byte[], java.io.Serializable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        char c;
        GlobalAddress globalAddress;
        IncomingRequestPolicy incomingRequestPolicy;
        Boolean bool;
        char c2;
        DepositPreference depositPreference;
        Long l;
        Boolean bool2;
        String str;
        char c3;
        Integer num;
        Enum r14;
        CurrencyCode currencyCode;
        Enum r24;
        String str2;
        List list;
        String str3;
        Boolean bool3;
        char c4;
        char c5;
        char c6;
        BitcoinDisplayUnits bitcoinDisplayUnits;
        char c7;
        char c8;
        DepositPreferenceData depositPreferenceData;
        Country country;
        String str4;
        Region region;
        char c9;
        char c10;
        int i = this.$r8$classId;
        InstrumentQueries instrumentQueries = this.f$1;
        switch (i) {
            case 0:
                int i2 = ProfileQueries$selectRegion$2.$r8$clinit;
                AndroidCursor androidCursor = (AndroidCursor) obj;
                androidCursor.getClass();
                String string2 = androidCursor.getString(0);
                return new SelectRegion(string2 != null ? (Region) ((EnumColumnAdapter) ((Profile.Adapter) instrumentQueries.instrumentAdapter).regionAdapter).decode(string2) : null);
            default:
                ProfileQueries$select$2 profileQueries$select$2 = ProfileQueries$select$2.INSTANCE;
                AndroidCursor androidCursor2 = (AndroidCursor) obj;
                String m1431m = re$$ExternalSyntheticOutline0.m1431m(androidCursor2, 0);
                String string3 = androidCursor2.getString(1);
                String string4 = androidCursor2.getString(2);
                Boolean bool4 = androidCursor2.getBoolean(3);
                Boolean m = Matcher$$ExternalSyntheticOutline0.m(bool4, androidCursor2, 4);
                Profile.Adapter adapter = (Profile.Adapter) instrumentQueries.instrumentAdapter;
                Enum m2 = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 5, (EnumColumnAdapter) adapter.nearby_visibilityAdapter);
                String string5 = androidCursor2.getString(6);
                String string6 = androidCursor2.getString(7);
                String string7 = androidCursor2.getString(8);
                Boolean bool5 = androidCursor2.getBoolean(9);
                bool5.getClass();
                Enum m3 = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 10, (EnumColumnAdapter) adapter.rate_planAdapter);
                Boolean bool6 = androidCursor2.getBoolean(11);
                Boolean m4 = Matcher$$ExternalSyntheticOutline0.m(bool6, androidCursor2, 12);
                Boolean bool7 = androidCursor2.getBoolean(13);
                bool7.getClass();
                String string8 = androidCursor2.getString(14);
                String string9 = androidCursor2.getString(15);
                DepositPreference depositPreference2 = string9 != null ? (DepositPreference) ((EnumColumnAdapter) adapter.deposit_preferenceAdapter).decode(string9) : null;
                ?? bytes = androidCursor2.getBytes(16);
                GlobalAddress globalAddress2 = bytes != 0 ? (GlobalAddress) ((WireAdapter) adapter.addressAdapter).decode(bytes) : null;
                ?? bytes2 = androidCursor2.getBytes(17);
                DepositPreferenceData depositPreferenceData2 = bytes2 != 0 ? (DepositPreferenceData) ((WireAdapter) adapter.deposit_preference_dataAdapter).decode(bytes2) : null;
                Long l2 = androidCursor2.getLong(18);
                l2.getClass();
                Integer valueOf = Integer.valueOf((int) l2.longValue());
                DepositPreferenceData depositPreferenceData3 = depositPreferenceData2;
                String string10 = androidCursor2.getString(19);
                Country country2 = string10 != null ? (Country) ((EnumColumnAdapter) adapter.country_codeAdapter).decode(string10) : null;
                Enum m5 = NavAction$$ExternalSyntheticOutline0.m(androidCursor2, 20, (EnumColumnAdapter) adapter.default_currencyAdapter);
                Long l3 = androidCursor2.getLong(21);
                String string11 = androidCursor2.getString(22);
                String string12 = androidCursor2.getString(23);
                IncomingRequestPolicy incomingRequestPolicy2 = string12 != null ? (IncomingRequestPolicy) ((EnumColumnAdapter) adapter.incoming_request_policyAdapter).decode(string12) : null;
                Boolean bool8 = androidCursor2.getBoolean(24);
                IncomingRequestPolicy incomingRequestPolicy3 = incomingRequestPolicy2;
                String string13 = androidCursor2.getString(25);
                String string14 = androidCursor2.getString(26);
                ?? bytes3 = androidCursor2.getBytes(27);
                List list2 = bytes3 != 0 ? (List) ((WireRepeatedAdapter) adapter.available_p2p_target_regionsAdapter).decode(bytes3) : null;
                String string15 = androidCursor2.getString(28);
                List list3 = list2;
                String string16 = androidCursor2.getString(29);
                Region region2 = string16 != null ? (Region) ((EnumColumnAdapter) adapter.regionAdapter).decode(string16) : null;
                Boolean bool9 = androidCursor2.getBoolean(30);
                bool9.getClass();
                Region region3 = region2;
                String string17 = androidCursor2.getString(31);
                BitcoinDisplayUnits bitcoinDisplayUnits2 = string17 != null ? (BitcoinDisplayUnits) ((EnumColumnAdapter) adapter.bitcoin_display_unitsAdapter).decode(string17) : null;
                String string18 = androidCursor2.getString(32);
                if (string18 != null) {
                    c = 6;
                    globalAddress = globalAddress2;
                    incomingRequestPolicy = incomingRequestPolicy3;
                    bool = bool8;
                    c2 = 3;
                    depositPreference = depositPreference2;
                    l = l3;
                    bool2 = bool6;
                    str = string14;
                    c3 = 4;
                    num = valueOf;
                    r14 = m3;
                    currencyCode = (CurrencyCode) ((EnumColumnAdapter) adapter.bitcoin_amount_entry_currency_preferenceAdapter).decode(string18);
                    r24 = m5;
                    str2 = string11;
                    list = list3;
                    str3 = string15;
                    bool3 = bool9;
                    c5 = 18;
                    c6 = 16;
                    bitcoinDisplayUnits = bitcoinDisplayUnits2;
                    c7 = 2;
                    c8 = 1;
                    depositPreferenceData = depositPreferenceData3;
                    country = country2;
                    str4 = string13;
                    region = region3;
                    c9 = 17;
                    c10 = 5;
                    c4 = 19;
                } else {
                    c = 6;
                    globalAddress = globalAddress2;
                    incomingRequestPolicy = incomingRequestPolicy3;
                    bool = bool8;
                    c2 = 3;
                    depositPreference = depositPreference2;
                    l = l3;
                    bool2 = bool6;
                    str = string14;
                    c3 = 4;
                    num = valueOf;
                    r14 = m3;
                    currencyCode = null;
                    r24 = m5;
                    str2 = string11;
                    list = list3;
                    str3 = string15;
                    bool3 = bool9;
                    c4 = 19;
                    c5 = 18;
                    c6 = 16;
                    bitcoinDisplayUnits = bitcoinDisplayUnits2;
                    c7 = 2;
                    c8 = 1;
                    depositPreferenceData = depositPreferenceData3;
                    country = country2;
                    str4 = string13;
                    region = region3;
                    c9 = 17;
                    c10 = 5;
                }
                Object[] objArr = {m1431m, string3, string4, bool4, m, m2, string5, string6, string7, bool5, r14, bool2, m4, bool7, string8, depositPreference, globalAddress, depositPreferenceData, num, country, r24, l, str2, incomingRequestPolicy, bool, str4, str, list, str3, region, bool3, bitcoinDisplayUnits, currencyCode};
                if (objArr.length != 33) {
                    a$$ExternalSyntheticBUOutline0.m$3("Expected 33 arguments");
                    return null;
                }
                String str5 = (String) objArr[0];
                String str6 = (String) objArr[c8];
                String str7 = (String) objArr[c7];
                boolean booleanValue = ((Boolean) objArr[c2]).booleanValue();
                boolean booleanValue2 = ((Boolean) objArr[c3]).booleanValue();
                NearbyVisibility nearbyVisibility = (NearbyVisibility) objArr[c10];
                String str8 = (String) objArr[c];
                String str9 = (String) objArr[7];
                String str10 = (String) objArr[8];
                boolean booleanValue3 = ((Boolean) objArr[9]).booleanValue();
                RatePlan ratePlan = (RatePlan) objArr[10];
                boolean booleanValue4 = ((Boolean) objArr[11]).booleanValue();
                boolean booleanValue5 = ((Boolean) objArr[12]).booleanValue();
                boolean booleanValue6 = ((Boolean) objArr[13]).booleanValue();
                String str11 = (String) objArr[14];
                DepositPreference depositPreference3 = (DepositPreference) objArr[15];
                GlobalAddress globalAddress3 = (GlobalAddress) objArr[c6];
                DepositPreferenceData depositPreferenceData4 = (DepositPreferenceData) objArr[c9];
                int intValue = ((Number) objArr[c5]).intValue();
                Country country3 = (Country) objArr[c4];
                CurrencyCode currencyCode2 = (CurrencyCode) objArr[20];
                Long l4 = (Long) objArr[21];
                String str12 = (String) objArr[22];
                IncomingRequestPolicy incomingRequestPolicy4 = (IncomingRequestPolicy) objArr[23];
                Boolean bool10 = (Boolean) objArr[24];
                String str13 = (String) objArr[25];
                String str14 = (String) objArr[26];
                List list4 = (List) objArr[27];
                String str15 = (String) objArr[28];
                Region region4 = (Region) objArr[29];
                boolean booleanValue7 = ((Boolean) objArr[30]).booleanValue();
                BitcoinDisplayUnits bitcoinDisplayUnits3 = (BitcoinDisplayUnits) objArr[31];
                CurrencyCode currencyCode3 = (CurrencyCode) objArr[32];
                str5.getClass();
                nearbyVisibility.getClass();
                ratePlan.getClass();
                currencyCode2.getClass();
                return new Profile(str5, str6, str7, booleanValue, booleanValue2, nearbyVisibility, str8, str9, str10, booleanValue3, ratePlan, booleanValue4, booleanValue5, booleanValue6, str11, depositPreference3, globalAddress3, depositPreferenceData4, intValue, country3, currencyCode2, l4, str12, incomingRequestPolicy4, bool10, str13, str14, list4, str15, region4, booleanValue7, bitcoinDisplayUnits3, currencyCode3);
        }
    }
}
