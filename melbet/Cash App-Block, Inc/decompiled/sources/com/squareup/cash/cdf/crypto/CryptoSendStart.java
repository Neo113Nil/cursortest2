package com.squareup.cash.cdf.crypto;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class CryptoSendStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final CryptoSendStartSource source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class CryptoSendStartSource {
        public static final /* synthetic */ CryptoSendStartSource[] $VALUES;
        public static final CryptoSendStartSource CRYPTO_TAB_SEND_BUTTON;
        public static final CryptoSendStartSource DEEP_LINK;
        public static final CryptoSendStartSource MAIN_QR_SCANNER;
        public static final CryptoSendStartSource NFC;
        public static final CryptoSendStartSource REVERSE_DEPOSIT;

        static {
            CryptoSendStartSource cryptoSendStartSource = new CryptoSendStartSource("CRYPTO_TAB_SEND_BUTTON", 0);
            CRYPTO_TAB_SEND_BUTTON = cryptoSendStartSource;
            CryptoSendStartSource cryptoSendStartSource2 = new CryptoSendStartSource("CRYPTO_TAB_TOOLBAR_SCAN_QR_BUTTON", 1);
            CryptoSendStartSource cryptoSendStartSource3 = new CryptoSendStartSource("DEEP_LINK", 2);
            DEEP_LINK = cryptoSendStartSource3;
            CryptoSendStartSource cryptoSendStartSource4 = new CryptoSendStartSource("MAIN_PAYMENT_PAD_SEND_BUTTON", 3);
            CryptoSendStartSource cryptoSendStartSource5 = new CryptoSendStartSource("MAIN_QR_SCANNER", 4);
            MAIN_QR_SCANNER = cryptoSendStartSource5;
            CryptoSendStartSource cryptoSendStartSource6 = new CryptoSendStartSource("NFC", 5);
            NFC = cryptoSendStartSource6;
            CryptoSendStartSource cryptoSendStartSource7 = new CryptoSendStartSource("REVERSE_DEPOSIT", 6);
            REVERSE_DEPOSIT = cryptoSendStartSource7;
            $VALUES = new CryptoSendStartSource[]{cryptoSendStartSource, cryptoSendStartSource2, cryptoSendStartSource3, cryptoSendStartSource4, cryptoSendStartSource5, cryptoSendStartSource6, cryptoSendStartSource7, new CryptoSendStartSource("REVERSE_DEPOSIT_LIMIT", 7), new CryptoSendStartSource("REVERSE_DEPOSIT_NOT_ACCEPTED", 8)};
        }

        public static CryptoSendStartSource valueOf(String str) {
            return (CryptoSendStartSource) Enum.valueOf(CryptoSendStartSource.class, str);
        }

        public static CryptoSendStartSource[] values() {
            return (CryptoSendStartSource[]) $VALUES.clone();
        }
    }

    public CryptoSendStart(CryptoSendStartSource cryptoSendStartSource) {
        this.source = cryptoSendStartSource;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Crypto", "cdf_action", "Send");
        Countries.putSafe(m, "source", cryptoSendStartSource);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CryptoSendStart) && this.source == ((CryptoSendStart) obj).source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Send Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.source.hashCode();
    }

    public final String toString() {
        return "CryptoSendStart(source=" + this.source + ")";
    }
}
