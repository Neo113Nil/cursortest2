package com.squareup.cash.instruments.backend.api;

import com.squareup.cash.instruments.common.Instrument;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.api.CashInstrumentType;

/* loaded from: classes6.dex */
public abstract class InstrumentManagerKt {
    public static final Instrument toCommonInstrument(com.squareup.protos.franklin.api.Instrument instrument) {
        instrument.getClass();
        String str = instrument.token;
        if (str == null) {
            str = "";
        }
        CashInstrumentType cashInstrumentType = instrument.cash_instrument_type;
        if (cashInstrumentType == null) {
            cashInstrumentType = CashInstrumentType.DEBIT_CARD;
        }
        InstrumentType instrumentType = instrument.card_brand;
        String str2 = str;
        CashInstrumentType cashInstrumentType2 = cashInstrumentType;
        String str3 = instrument.suffix;
        String str4 = instrument.bank_name;
        String str5 = instrument.icon_url;
        String str6 = instrument.detail_icon_url;
        String str7 = instrument.display_name;
        String str8 = instrument.display_name_compact;
        Boolean bool = instrument.pending_verification;
        String str9 = instrument.selection_icon_url;
        String str10 = instrument.accessory_text;
        String str11 = instrument.accessory_icon_id;
        Boolean bool2 = instrument.is_default_for_instrument_type;
        return new Instrument(str2, cashInstrumentType2, instrumentType, str3, str4, str5, str6, str7, str8, bool, str9, str10, str11, bool2 != null ? bool2.booleanValue() : false, instrument.card_art_url, instrument.version, 65536);
    }

    public static final com.squareup.protos.franklin.api.Instrument toProto(Instrument instrument) {
        String str = instrument.token;
        CashInstrumentType cashInstrumentType = instrument.cashInstrumentType;
        InstrumentType instrumentType = instrument.cardBrand;
        String str2 = instrument.suffix;
        String str3 = instrument.bankName;
        String str4 = instrument.iconUrl;
        String str5 = instrument.selectionIconUrl;
        String str6 = instrument.displayName;
        String str7 = instrument.displayNameCompact;
        String str8 = instrument.detailIconUrl;
        String str9 = instrument.accessoryText;
        String str10 = instrument.accessoryIconId;
        boolean z = instrument.defaultForInstrumentType;
        return new com.squareup.protos.franklin.api.Instrument(str, cashInstrumentType, instrumentType, str2, str3, str4, str8, null, instrument.version, str6, str5, null, str10, str9, str7, Boolean.valueOf(z), instrument.cardImageUrl, 312454144);
    }
}
