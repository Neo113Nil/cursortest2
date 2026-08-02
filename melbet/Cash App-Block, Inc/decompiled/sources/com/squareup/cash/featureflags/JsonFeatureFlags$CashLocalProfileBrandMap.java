package com.squareup.cash.featureflags;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.moshi.JsonClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class JsonFeatureFlags$CashLocalProfileBrandMap extends FeatureFlag$JsonFeatureFlag {
    public static final JsonFeatureFlags$CashLocalProfileBrandMap INSTANCE = new JsonFeatureFlags$CashLocalProfileBrandMap(Brands.class, new FeatureFlag$JsonFeatureFlag.Options("default", new Brands(null, 1, null)), "cashclient/cash_local_profile_brand_map");

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/featureflags/JsonFeatureFlags$CashLocalProfileBrandMap$Brands", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class Brands {
        public final Map brands;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Brands(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(map);
            if ((i & 1) != 0) {
                map = EmptyMap.INSTANCE;
                map.getClass();
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Brands) && Intrinsics.areEqual(this.brands, ((Brands) obj).brands);
        }

        public final int hashCode() {
            return this.brands.hashCode();
        }

        public final String toString() {
            return NavAction$$ExternalSyntheticOutline0.m("Brands(brands=", ")", this.brands);
        }

        public Brands(Map map) {
            map.getClass();
            this.brands = map;
        }
    }
}
