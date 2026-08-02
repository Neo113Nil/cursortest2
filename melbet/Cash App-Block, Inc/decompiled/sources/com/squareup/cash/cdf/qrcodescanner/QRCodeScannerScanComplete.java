package com.squareup.cash.cdf.qrcodescanner;

import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.util.cash.Countries;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class QRCodeScannerScanComplete implements Event {
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.AMPLITUDE});
    public final Category category;
    public final Boolean is_valid;
    public final LinkedHashMap parameters;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Category {
        public static final /* synthetic */ Category[] $VALUES;
        public static final Category BITCOIN_ADDRESS;
        public static final Category BITCOIN_URI;
        public static final Category CARD_ACTIVATION;
        public static final Category LIGHTNING_ADDRESS;
        public static final Category UNSPECIFIED;

        static {
            Category category = new Category("UNSPECIFIED", 0);
            UNSPECIFIED = category;
            Category category2 = new Category("CARD_ACTIVATION", 1);
            CARD_ACTIVATION = category2;
            Category category3 = new Category("BITCOIN_ADDRESS", 2);
            BITCOIN_ADDRESS = category3;
            Category category4 = new Category("BITCOIN_URI", 3);
            BITCOIN_URI = category4;
            Category category5 = new Category("CASHTAG", 4);
            Category category6 = new Category("LIGHTNING_ADDRESS", 5);
            LIGHTNING_ADDRESS = category6;
            $VALUES = new Category[]{category, category2, category3, category4, category5, category6};
        }

        public static Category valueOf(String str) {
            return (Category) Enum.valueOf(Category.class, str);
        }

        public static Category[] values() {
            return (Category[]) $VALUES.clone();
        }
    }

    public QRCodeScannerScanComplete(Category category, Boolean bool) {
        this.category = category;
        this.is_valid = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 4, "QRCodeScanner", "cdf_action", "Scan");
        Countries.putSafe(m, "category", category);
        Countries.putSafe(m, "is_valid", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QRCodeScannerScanComplete)) {
            return false;
        }
        QRCodeScannerScanComplete qRCodeScannerScanComplete = (QRCodeScannerScanComplete) obj;
        return this.category == qRCodeScannerScanComplete.category && this.is_valid.equals(qRCodeScannerScanComplete.is_valid);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "QRCodeScanner Scan Complete";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        return this.is_valid.hashCode() + (this.category.hashCode() * 31);
    }

    public final String toString() {
        return "QRCodeScannerScanComplete(category=" + this.category + ", is_valid=" + this.is_valid + ")";
    }
}
