package app.cash.local.viewmodels.marketingmessages;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class MarketingMessageBadge {
    public final boolean isViewed;
    public final String text;

    public MarketingMessageBadge(String str, boolean z) {
        str.getClass();
        this.text = str;
        this.isViewed = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketingMessageBadge)) {
            return false;
        }
        MarketingMessageBadge marketingMessageBadge = (MarketingMessageBadge) obj;
        return Intrinsics.areEqual(this.text, marketingMessageBadge.text) && this.isViewed == marketingMessageBadge.isViewed;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isViewed) + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("MarketingMessageBadge(text=", this.text, ", isViewed=", ")", this.isViewed);
    }
}
