package com.squareup.cash.featureflags;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.featureflags.FeatureFlag$JsonFeatureFlag;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class JsonFeatureFlags$PersonalizedPaymentPersonalizationOptions extends FeatureFlag$JsonFeatureFlag {
    public static final JsonFeatureFlags$PersonalizedPaymentPersonalizationOptions INSTANCE;

    static {
        boolean z = false;
        INSTANCE = new JsonFeatureFlags$PersonalizedPaymentPersonalizationOptions(MenuOptions.class, new FeatureFlag$JsonFeatureFlag.Options("default", new MenuOptions(z, z, 3, null)), "cashclient/payment_personalization_menu_options");
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/featureflags/JsonFeatureFlags$PersonalizedPaymentPersonalizationOptions$MenuOptions", "", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class MenuOptions {
        public final boolean stickers;
        public final boolean text;

        public /* synthetic */ MenuOptions(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MenuOptions)) {
                return false;
            }
            MenuOptions menuOptions = (MenuOptions) obj;
            return this.stickers == menuOptions.stickers && this.text == menuOptions.text;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.text) + (Boolean.hashCode(this.stickers) * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("MenuOptions(stickers=", ", text=", ")", this.stickers, this.text);
        }

        public MenuOptions(boolean z, boolean z2) {
            this.stickers = z;
            this.text = z2;
        }
    }
}
