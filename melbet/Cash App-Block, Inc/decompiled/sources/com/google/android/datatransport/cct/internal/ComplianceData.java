package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;

/* loaded from: classes4.dex */
public abstract class ComplianceData {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ProductIdOrigin {
        public static final /* synthetic */ ProductIdOrigin[] $VALUES;
        public static final ProductIdOrigin EVENT_OVERRIDE;

        /* JADX INFO: Fake field, exist only in values array */
        ProductIdOrigin EF0;

        static {
            ProductIdOrigin productIdOrigin = new ProductIdOrigin("NOT_SET", 0);
            ProductIdOrigin productIdOrigin2 = new ProductIdOrigin("EVENT_OVERRIDE", 1);
            EVENT_OVERRIDE = productIdOrigin2;
            $VALUES = new ProductIdOrigin[]{productIdOrigin, productIdOrigin2};
            SparseArray sparseArray = new SparseArray();
            sparseArray.put(0, productIdOrigin);
            sparseArray.put(5, productIdOrigin2);
        }

        public static ProductIdOrigin valueOf(String str) {
            return (ProductIdOrigin) Enum.valueOf(ProductIdOrigin.class, str);
        }

        public static ProductIdOrigin[] values() {
            return (ProductIdOrigin[]) $VALUES.clone();
        }
    }
}
