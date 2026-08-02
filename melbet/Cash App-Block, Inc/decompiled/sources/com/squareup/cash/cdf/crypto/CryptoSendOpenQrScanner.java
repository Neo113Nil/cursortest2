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
public final class CryptoSendOpenQrScanner implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final CryptoSendOpenQrScannerSource source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class CryptoSendOpenQrScannerSource {
        public static final /* synthetic */ CryptoSendOpenQrScannerSource[] $VALUES;
        public static final CryptoSendOpenQrScannerSource CRYPTO_AMOUNT_ONLY_SCAN_QR_BUTTON;
        public static final CryptoSendOpenQrScannerSource CRYPTO_TAB_TOOLBAR_SCAN_QR_BUTTON;

        static {
            CryptoSendOpenQrScannerSource cryptoSendOpenQrScannerSource = new CryptoSendOpenQrScannerSource("CRYPTO_AMOUNT_ONLY_SCAN_QR_BUTTON", 0);
            CRYPTO_AMOUNT_ONLY_SCAN_QR_BUTTON = cryptoSendOpenQrScannerSource;
            CryptoSendOpenQrScannerSource cryptoSendOpenQrScannerSource2 = new CryptoSendOpenQrScannerSource("CRYPTO_TAB_TOOLBAR_SCAN_QR_BUTTON", 1);
            CRYPTO_TAB_TOOLBAR_SCAN_QR_BUTTON = cryptoSendOpenQrScannerSource2;
            $VALUES = new CryptoSendOpenQrScannerSource[]{cryptoSendOpenQrScannerSource, cryptoSendOpenQrScannerSource2};
        }

        public static CryptoSendOpenQrScannerSource valueOf(String str) {
            return (CryptoSendOpenQrScannerSource) Enum.valueOf(CryptoSendOpenQrScannerSource.class, str);
        }

        public static CryptoSendOpenQrScannerSource[] values() {
            return (CryptoSendOpenQrScannerSource[]) $VALUES.clone();
        }
    }

    public CryptoSendOpenQrScanner(CryptoSendOpenQrScannerSource cryptoSendOpenQrScannerSource) {
        this.source = cryptoSendOpenQrScannerSource;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Crypto", "cdf_action", "Send");
        Countries.putSafe(m, "source", cryptoSendOpenQrScannerSource);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CryptoSendOpenQrScanner) && this.source == ((CryptoSendOpenQrScanner) obj).source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Send OpenQrScanner";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.source.hashCode();
    }

    public final String toString() {
        return "CryptoSendOpenQrScanner(source=" + this.source + ")";
    }
}
