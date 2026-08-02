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
public final class CryptoDepositStart implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SEGMENT, EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final LinkedHashMap parameters;
    public final CryptoDepositStartSource source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class CryptoDepositStartSource {
        public static final /* synthetic */ CryptoDepositStartSource[] $VALUES;
        public static final CryptoDepositStartSource ACCOUNT;
        public static final CryptoDepositStartSource BITCOIN_APPLET_RECEIVE;
        public static final CryptoDepositStartSource BITCOIN_APPLET_WALLET_WIDGET;
        public static final CryptoDepositStartSource MAIN_PAYMENT_PAD;

        static {
            CryptoDepositStartSource cryptoDepositStartSource = new CryptoDepositStartSource("ACCOUNT", 0);
            ACCOUNT = cryptoDepositStartSource;
            CryptoDepositStartSource cryptoDepositStartSource2 = new CryptoDepositStartSource("BITCOIN_APPLET_RECEIVE", 1);
            BITCOIN_APPLET_RECEIVE = cryptoDepositStartSource2;
            CryptoDepositStartSource cryptoDepositStartSource3 = new CryptoDepositStartSource("BITCOIN_APPLET_WALLET_WIDGET", 2);
            BITCOIN_APPLET_WALLET_WIDGET = cryptoDepositStartSource3;
            CryptoDepositStartSource cryptoDepositStartSource4 = new CryptoDepositStartSource("DEEP_LINK", 3);
            CryptoDepositStartSource cryptoDepositStartSource5 = new CryptoDepositStartSource("MAIN_PAYMENT_PAD", 4);
            MAIN_PAYMENT_PAD = cryptoDepositStartSource5;
            $VALUES = new CryptoDepositStartSource[]{cryptoDepositStartSource, cryptoDepositStartSource2, cryptoDepositStartSource3, cryptoDepositStartSource4, cryptoDepositStartSource5};
        }

        public static CryptoDepositStartSource valueOf(String str) {
            return (CryptoDepositStartSource) Enum.valueOf(CryptoDepositStartSource.class, str);
        }

        public static CryptoDepositStartSource[] values() {
            return (CryptoDepositStartSource[]) $VALUES.clone();
        }
    }

    public CryptoDepositStart(CryptoDepositStartSource cryptoDepositStartSource) {
        this.source = cryptoDepositStartSource;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 3, "Crypto", "cdf_action", "Deposit");
        Countries.putSafe(m, "source", cryptoDepositStartSource);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CryptoDepositStart) && this.source == ((CryptoDepositStart) obj).source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Deposit Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        CryptoDepositStartSource cryptoDepositStartSource = this.source;
        if (cryptoDepositStartSource == null) {
            return 0;
        }
        return cryptoDepositStartSource.hashCode();
    }

    public final String toString() {
        return "CryptoDepositStart(source=" + this.source + ")";
    }
}
