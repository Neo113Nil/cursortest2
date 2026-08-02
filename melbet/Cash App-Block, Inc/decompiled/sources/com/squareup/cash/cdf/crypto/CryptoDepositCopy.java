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
public final class CryptoDepositCopy implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final CopyContentType content_type;
    public final LinkedHashMap parameters;
    public final Source source;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CopyContentType {
        public static final /* synthetic */ CopyContentType[] $VALUES;
        public static final CopyContentType BITCOIN_ADDRESS;
        public static final CopyContentType LIGHTNING_INVOICE;

        static {
            CopyContentType copyContentType = new CopyContentType("LIGHTNING_INVOICE", 0);
            LIGHTNING_INVOICE = copyContentType;
            CopyContentType copyContentType2 = new CopyContentType("BITCOIN_ADDRESS", 1);
            BITCOIN_ADDRESS = copyContentType2;
            $VALUES = new CopyContentType[]{copyContentType, copyContentType2};
        }

        public static CopyContentType valueOf(String str) {
            return (CopyContentType) Enum.valueOf(CopyContentType.class, str);
        }

        public static CopyContentType[] values() {
            return (CopyContentType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Source {
        public static final /* synthetic */ Source[] $VALUES;
        public static final Source INVOICE;
        public static final Source WALLET_WIDGET;

        static {
            Source source = new Source("WALLET_WIDGET", 0);
            WALLET_WIDGET = source;
            Source source2 = new Source("INVOICE", 1);
            INVOICE = source2;
            $VALUES = new Source[]{source, source2};
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }
    }

    public CryptoDepositCopy(CopyContentType copyContentType, Source source) {
        this.content_type = copyContentType;
        this.source = source;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "Crypto", "cdf_action", "Deposit");
        Countries.putSafe(m, "content_type", copyContentType);
        Countries.putSafe(m, "source", source);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CryptoDepositCopy)) {
            return false;
        }
        CryptoDepositCopy cryptoDepositCopy = (CryptoDepositCopy) obj;
        return this.content_type == cryptoDepositCopy.content_type && this.source == cryptoDepositCopy.source;
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Crypto Deposit Copy";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.source.hashCode() + (this.content_type.hashCode() * 31);
    }

    public final String toString() {
        return "CryptoDepositCopy(content_type=" + this.content_type + ", source=" + this.source + ")";
    }
}
