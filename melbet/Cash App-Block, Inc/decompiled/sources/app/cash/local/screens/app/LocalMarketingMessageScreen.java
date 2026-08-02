package app.cash.local.screens.app;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.SingleInstanceScreen;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.screens.app.LocalLoyaltySheet;
import com.squareup.cash.cdf.localmarketing.EventLocation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalMarketingMessageScreen implements LocalScreen, SingleInstanceScreen {
    public static final Parcelable.Creator<LocalMarketingMessageScreen> CREATOR = new LocalLoyaltySheet.Creator(18);
    public final EventLocation eventLocation;
    public final MarketingMessageData marketingMessage;

    public LocalMarketingMessageScreen(MarketingMessageData marketingMessageData, EventLocation eventLocation) {
        marketingMessageData.getClass();
        eventLocation.getClass();
        this.marketingMessage = marketingMessageData;
        this.eventLocation = eventLocation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalMarketingMessageScreen)) {
            return false;
        }
        LocalMarketingMessageScreen localMarketingMessageScreen = (LocalMarketingMessageScreen) obj;
        return Intrinsics.areEqual(this.marketingMessage, localMarketingMessageScreen.marketingMessage) && this.eventLocation == localMarketingMessageScreen.eventLocation;
    }

    public final int hashCode() {
        return this.eventLocation.hashCode() + (this.marketingMessage.hashCode() * 31);
    }

    public final String toString() {
        return "LocalMarketingMessageScreen(marketingMessage=" + this.marketingMessage + ", eventLocation=" + this.eventLocation + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.marketingMessage, i);
        parcel.writeString(this.eventLocation.name());
    }

    public /* synthetic */ LocalMarketingMessageScreen(MarketingMessageData marketingMessageData) {
        this(marketingMessageData, EventLocation.MESSAGES);
    }
}
