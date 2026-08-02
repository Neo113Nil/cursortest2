package app.cash.local.viewmodels.wallet;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.primitives.OrderStatus;
import app.cash.local.primitives.OrderToken;
import app.cash.local.viewmodels.home.LocalHomeGeoViewModel;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageBadge;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalText;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface LocalHomeViewModel {

    public final class Geo implements LocalHomeViewModel {
        public final LocalHomeGeoViewModel model;

        public Geo(LocalHomeGeoViewModel localHomeGeoViewModel) {
            this.model = localHomeGeoViewModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Geo) && this.model.equals(((Geo) obj).model);
        }

        public final int hashCode() {
            return this.model.hashCode();
        }

        public final String toString() {
            return "Geo(model=" + this.model + ")";
        }
    }

    public final class Loading implements LocalHomeViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1463356591;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class TabContent implements LocalHomeViewModel {
        public final boolean addBrandsVisible;
        public final boolean isRefreshing;
        public final boolean segmentedTabsEnabled;
        public final TabToolbarInternalViewModel toolbarInternalModel;
        public final List widgets;

        public interface Widget {

            public final class ActiveOrders implements Widget {
                public final List orders;

                public final class ActiveOrder {
                    public final LocalImage brandImage;
                    public final String brandName;
                    public final DisplayMode displayMode;
                    public final LocalText estimatedCompletionText;
                    public final int itemCount;
                    public final LocalImage itemImage;
                    public final String metadataText;
                    public final OrderStatus orderStatus;
                    public final String orderingStationLabel;
                    public final String token;

                    public ActiveOrder(String str, LocalImage localImage, String str2, LocalText localText, String str3, int i, String str4, LocalImage localImage2, OrderStatus orderStatus, DisplayMode displayMode) {
                        str.getClass();
                        this.token = str;
                        this.brandImage = localImage;
                        this.brandName = str2;
                        this.estimatedCompletionText = localText;
                        this.metadataText = str3;
                        this.itemCount = i;
                        this.orderingStationLabel = str4;
                        this.itemImage = localImage2;
                        this.orderStatus = orderStatus;
                        this.displayMode = displayMode;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof ActiveOrder)) {
                            return false;
                        }
                        ActiveOrder activeOrder = (ActiveOrder) obj;
                        return Intrinsics.areEqual(this.token, activeOrder.token) && Intrinsics.areEqual(this.brandImage, activeOrder.brandImage) && Intrinsics.areEqual(this.brandName, activeOrder.brandName) && Intrinsics.areEqual(this.estimatedCompletionText, activeOrder.estimatedCompletionText) && Intrinsics.areEqual(this.metadataText, activeOrder.metadataText) && this.itemCount == activeOrder.itemCount && Intrinsics.areEqual(this.orderingStationLabel, activeOrder.orderingStationLabel) && Intrinsics.areEqual(this.itemImage, activeOrder.itemImage) && Intrinsics.areEqual(this.orderStatus, activeOrder.orderStatus) && this.displayMode == activeOrder.displayMode;
                    }

                    public final int hashCode() {
                        int hashCode = this.token.hashCode() * 31;
                        LocalImage localImage = this.brandImage;
                        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (localImage == null ? 0 : localImage.hashCode())) * 31, 31, this.brandName);
                        LocalText localText = this.estimatedCompletionText;
                        int hashCode2 = (m + (localText == null ? 0 : localText.hashCode())) * 31;
                        String str = this.metadataText;
                        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.itemCount, (hashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31);
                        String str2 = this.orderingStationLabel;
                        int hashCode3 = (m2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                        LocalImage localImage2 = this.itemImage;
                        int hashCode4 = (hashCode3 + (localImage2 == null ? 0 : localImage2.hashCode())) * 31;
                        OrderStatus orderStatus = this.orderStatus;
                        return this.displayMode.hashCode() + ((hashCode4 + (orderStatus != null ? orderStatus.hashCode() : 0)) * 31);
                    }

                    public final String toString() {
                        String m1280toStringimpl = OrderToken.m1280toStringimpl(this.token);
                        StringBuilder sb = new StringBuilder("ActiveOrder(token=");
                        sb.append(m1280toStringimpl);
                        sb.append(", brandImage=");
                        sb.append(this.brandImage);
                        sb.append(", brandName=");
                        sb.append(this.brandName);
                        sb.append(", estimatedCompletionText=");
                        sb.append(this.estimatedCompletionText);
                        sb.append(", metadataText=");
                        Boxes$$ExternalSyntheticOutline1.m(sb, this.metadataText, ", itemCount=", this.itemCount, ", orderingStationLabel=");
                        sb.append(this.orderingStationLabel);
                        sb.append(", itemImage=");
                        sb.append(this.itemImage);
                        sb.append(", orderStatus=");
                        sb.append(this.orderStatus);
                        sb.append(", displayMode=");
                        sb.append(this.displayMode);
                        sb.append(")");
                        return sb.toString();
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public final class DisplayMode {
                    public static final /* synthetic */ DisplayMode[] $VALUES;
                    public static final DisplayMode InStoreOpenTabClosed;
                    public static final DisplayMode Standard;

                    static {
                        DisplayMode displayMode = new DisplayMode("Standard", 0);
                        Standard = displayMode;
                        DisplayMode displayMode2 = new DisplayMode("InStoreOpenTabClosed", 1);
                        InStoreOpenTabClosed = displayMode2;
                        $VALUES = new DisplayMode[]{displayMode, displayMode2};
                    }

                    public static DisplayMode valueOf(String str) {
                        return (DisplayMode) Enum.valueOf(DisplayMode.class, str);
                    }

                    public static DisplayMode[] values() {
                        return (DisplayMode[]) $VALUES.clone();
                    }
                }

                public ActiveOrders(List list) {
                    list.getClass();
                    this.orders = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ActiveOrders) && Intrinsics.areEqual(this.orders, ((ActiveOrders) obj).orders);
                }

                public final int hashCode() {
                    return this.orders.hashCode();
                }

                public final String toString() {
                    return CameraState$Type$EnumUnboxingLocalUtility.m("ActiveOrders(orders=", ")", this.orders);
                }
            }

            public final class LocalCash implements Widget {
                public final String amountAsString;
                public final CheckIn checkIn;
                public final GetNeighborhoodsTabContentResponse.LocalCashExplainer localCashExplainer;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public final class CheckIn {
                    public static final /* synthetic */ CheckIn[] $VALUES;
                    public static final CheckIn AVAILABLE;
                    public static final CheckIn LINKED;

                    static {
                        CheckIn checkIn = new CheckIn("LINKED", 0);
                        LINKED = checkIn;
                        CheckIn checkIn2 = new CheckIn("AVAILABLE", 1);
                        AVAILABLE = checkIn2;
                        $VALUES = new CheckIn[]{checkIn, checkIn2};
                    }

                    public static CheckIn valueOf(String str) {
                        return (CheckIn) Enum.valueOf(CheckIn.class, str);
                    }

                    public static CheckIn[] values() {
                        return (CheckIn[]) $VALUES.clone();
                    }
                }

                public LocalCash(String str, GetNeighborhoodsTabContentResponse.LocalCashExplainer localCashExplainer, CheckIn checkIn) {
                    this.amountAsString = str;
                    this.localCashExplainer = localCashExplainer;
                    this.checkIn = checkIn;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof LocalCash)) {
                        return false;
                    }
                    LocalCash localCash = (LocalCash) obj;
                    return Intrinsics.areEqual(this.amountAsString, localCash.amountAsString) && Intrinsics.areEqual(this.localCashExplainer, localCash.localCashExplainer) && this.checkIn == localCash.checkIn;
                }

                public final int hashCode() {
                    int hashCode = this.amountAsString.hashCode() * 31;
                    GetNeighborhoodsTabContentResponse.LocalCashExplainer localCashExplainer = this.localCashExplainer;
                    return this.checkIn.hashCode() + ((hashCode + (localCashExplainer == null ? 0 : localCashExplainer.hashCode())) * 31);
                }

                public final String toString() {
                    return "LocalCash(amountAsString=" + this.amountAsString + ", localCashExplainer=" + this.localCashExplainer + ", checkIn=" + this.checkIn + ")";
                }
            }

            public final class LocalCashIncentive implements Widget {
                public final String body;
                public final String ctaLabel;
                public final String headline;
                public final LocalImage heroImage;

                public LocalCashIncentive(LocalImage localImage, String str, String str2, String str3) {
                    str3.getClass();
                    this.heroImage = localImage;
                    this.headline = str;
                    this.body = str2;
                    this.ctaLabel = str3;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof LocalCashIncentive)) {
                        return false;
                    }
                    LocalCashIncentive localCashIncentive = (LocalCashIncentive) obj;
                    return Intrinsics.areEqual(this.heroImage, localCashIncentive.heroImage) && Intrinsics.areEqual(this.headline, localCashIncentive.headline) && Intrinsics.areEqual(this.body, localCashIncentive.body) && Intrinsics.areEqual(this.ctaLabel, localCashIncentive.ctaLabel);
                }

                public final int hashCode() {
                    LocalImage localImage = this.heroImage;
                    int hashCode = (localImage == null ? 0 : localImage.hashCode()) * 31;
                    String str = this.headline;
                    int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.body;
                    return this.ctaLabel.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("LocalCashIncentive(heroImage=");
                    sb.append(this.heroImage);
                    sb.append(", headline=");
                    sb.append(this.headline);
                    sb.append(", body=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.body, ", ctaLabel=", this.ctaLabel, ")");
                }
            }

            public final class MarketingMessage implements Widget {
                public final MarketingMessageBadge badge;
                public final LocalColor brandColor;
                public final LocalImage image;
                public final MarketingMessageData marketingMessage;
                public final String messageText;
                public final boolean showAll;
                public final boolean showUnreadBadge;
                public final String timestamp;
                public final String username;

                public MarketingMessage(LocalColor localColor, LocalImage localImage, String str, String str2, String str3, MarketingMessageData marketingMessageData, boolean z, MarketingMessageBadge marketingMessageBadge, boolean z2) {
                    localColor.getClass();
                    str.getClass();
                    this.brandColor = localColor;
                    this.image = localImage;
                    this.username = str;
                    this.timestamp = str2;
                    this.messageText = str3;
                    this.marketingMessage = marketingMessageData;
                    this.showAll = z;
                    this.badge = marketingMessageBadge;
                    this.showUnreadBadge = z2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof MarketingMessage)) {
                        return false;
                    }
                    MarketingMessage marketingMessage = (MarketingMessage) obj;
                    return Intrinsics.areEqual(this.brandColor, marketingMessage.brandColor) && Intrinsics.areEqual(this.image, marketingMessage.image) && Intrinsics.areEqual(this.username, marketingMessage.username) && Intrinsics.areEqual(this.timestamp, marketingMessage.timestamp) && Intrinsics.areEqual(this.messageText, marketingMessage.messageText) && this.marketingMessage.equals(marketingMessage.marketingMessage) && this.showAll == marketingMessage.showAll && Intrinsics.areEqual(this.badge, marketingMessage.badge) && this.showUnreadBadge == marketingMessage.showUnreadBadge;
                }

                public final int hashCode() {
                    int hashCode = this.brandColor.hashCode() * 31;
                    LocalImage localImage = this.image;
                    int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (localImage == null ? 0 : localImage.hashCode())) * 31, 31, this.username);
                    String str = this.timestamp;
                    int hashCode2 = (m + (str == null ? 0 : str.hashCode())) * 31;
                    String str2 = this.messageText;
                    int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.marketingMessage.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.showAll);
                    MarketingMessageBadge marketingMessageBadge = this.badge;
                    return Boolean.hashCode(this.showUnreadBadge) + ((m2 + (marketingMessageBadge != null ? marketingMessageBadge.hashCode() : 0)) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("MarketingMessage(brandColor=");
                    sb.append(this.brandColor);
                    sb.append(", image=");
                    sb.append(this.image);
                    sb.append(", username=");
                    Boxes$$ExternalSyntheticOutline1.m(sb, this.username, ", timestamp=", this.timestamp, ", messageText=");
                    sb.append(this.messageText);
                    sb.append(", marketingMessage=");
                    sb.append(this.marketingMessage);
                    sb.append(", showAll=");
                    sb.append(this.showAll);
                    sb.append(", badge=");
                    sb.append(this.badge);
                    sb.append(", showUnreadBadge=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showUnreadBadge, ")");
                }
            }

            public final class PastOrders implements Widget {
                public final List orders;

                public final class PastOrder {
                    public final String brandName;
                    public final String completedAt;
                    public final String ctaLabel;
                    public final LocalText estimatedPickupCompletionTime;
                    public final int itemCount;
                    public final LocalImage itemImage;
                    public final String itemsTitle;
                    public final String token;

                    public PastOrder(String str, String str2, String str3, String str4, int i, LocalImage localImage, LocalText localText, String str5) {
                        str2.getClass();
                        str5.getClass();
                        this.token = str;
                        this.brandName = str2;
                        this.completedAt = str3;
                        this.itemsTitle = str4;
                        this.itemCount = i;
                        this.itemImage = localImage;
                        this.estimatedPickupCompletionTime = localText;
                        this.ctaLabel = str5;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof PastOrder)) {
                            return false;
                        }
                        PastOrder pastOrder = (PastOrder) obj;
                        return this.token.equals(pastOrder.token) && Intrinsics.areEqual(this.brandName, pastOrder.brandName) && this.completedAt.equals(pastOrder.completedAt) && this.itemsTitle.equals(pastOrder.itemsTitle) && this.itemCount == pastOrder.itemCount && Intrinsics.areEqual(this.itemImage, pastOrder.itemImage) && Intrinsics.areEqual(this.estimatedPickupCompletionTime, pastOrder.estimatedPickupCompletionTime) && Intrinsics.areEqual(this.ctaLabel, pastOrder.ctaLabel);
                    }

                    public final int hashCode() {
                        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.itemCount, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.brandName), 31, this.completedAt), 31, this.itemsTitle), 31);
                        LocalImage localImage = this.itemImage;
                        int hashCode = (m + (localImage == null ? 0 : localImage.hashCode())) * 31;
                        LocalText localText = this.estimatedPickupCompletionTime;
                        return this.ctaLabel.hashCode() + ((hashCode + (localText != null ? localText.hashCode() : 0)) * 31);
                    }

                    public final String toString() {
                        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PastOrder(token=", OrderToken.m1280toStringimpl(this.token), ", brandName=", this.brandName, ", completedAt=");
                        Boxes$$ExternalSyntheticOutline1.m(m, this.completedAt, ", itemsTitle=", this.itemsTitle, ", itemCount=");
                        m.append(this.itemCount);
                        m.append(", itemImage=");
                        m.append(this.itemImage);
                        m.append(", estimatedPickupCompletionTime=");
                        m.append(this.estimatedPickupCompletionTime);
                        m.append(", ctaLabel=");
                        m.append(this.ctaLabel);
                        m.append(")");
                        return m.toString();
                    }
                }

                public PastOrders(List list) {
                    list.getClass();
                    this.orders = list;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof PastOrders) && Intrinsics.areEqual(this.orders, ((PastOrders) obj).orders);
                }

                public final int hashCode() {
                    return this.orders.hashCode();
                }

                public final String toString() {
                    return CameraState$Type$EnumUnboxingLocalUtility.m("PastOrders(orders=", ")", this.orders);
                }
            }
        }

        public TabContent(TabToolbarInternalViewModel tabToolbarInternalViewModel, List list, boolean z, boolean z2, boolean z3) {
            tabToolbarInternalViewModel.getClass();
            list.getClass();
            this.toolbarInternalModel = tabToolbarInternalViewModel;
            this.widgets = list;
            this.addBrandsVisible = z;
            this.isRefreshing = z2;
            this.segmentedTabsEnabled = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabContent)) {
                return false;
            }
            TabContent tabContent = (TabContent) obj;
            return Intrinsics.areEqual(this.toolbarInternalModel, tabContent.toolbarInternalModel) && Intrinsics.areEqual(this.widgets, tabContent.widgets) && this.addBrandsVisible == tabContent.addBrandsVisible && this.isRefreshing == tabContent.isRefreshing && this.segmentedTabsEnabled == tabContent.segmentedTabsEnabled;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.segmentedTabsEnabled) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(this.toolbarInternalModel.hashCode() * 31, 31, this.widgets), 31, this.addBrandsVisible), 31, this.isRefreshing);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TabContent(toolbarInternalModel=");
            sb.append(this.toolbarInternalModel);
            sb.append(", widgets=");
            sb.append(this.widgets);
            sb.append(", addBrandsVisible=");
            re$$ExternalSyntheticOutline0.m(sb, this.addBrandsVisible, ", isRefreshing=", this.isRefreshing, ", segmentedTabsEnabled=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.segmentedTabsEnabled, ")");
        }
    }
}
