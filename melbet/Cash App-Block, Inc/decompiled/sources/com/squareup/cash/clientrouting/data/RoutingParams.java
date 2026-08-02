package com.squareup.cash.clientrouting.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.BlockerFlowReferrerType;
import com.squareup.cash.cdf.browser.EntityType;
import com.squareup.cash.checks.screens.ConfirmFrontOfCheckScreen;
import com.squareup.cash.checks.screens.VerifyCheckDepositScreen;
import com.squareup.cash.checks.screens.VerifyCheckDialogScreen;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.FeatureContext;
import com.squareup.cash.clientrouting.data.TargetDestination;
import com.squareup.cash.common.messaging.api.ErrorMessaging;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerFullScreen;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.api.CheckDepositBlocker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RoutingParams implements Parcelable {
    public static final Parcelable.Creator<RoutingParams> CREATOR = new Creator(0);
    public final boolean allowRouteForwarding;
    public final AnalyticsParams analyticsParams;
    public final DeepLinkMetadata deepLinkMetadata;
    public final Screen exitScreen;
    public final FeatureContext featureContext;
    public final Set flags;
    public final Screen origin;
    public final String source;
    public final String switchSource;

    public final class Creator implements Parcelable.Creator {
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ Creator(int i) {
            this.$r8$classId = i;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            switch (this.$r8$classId) {
                case 0:
                    Screen screen = (Screen) NavAction$$ExternalSyntheticOutline0.m(parcel, RoutingParams.class);
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    Screen screen2 = (Screen) parcel.readParcelable(RoutingParams.class.getClassLoader());
                    DeepLinkMetadata createFromParcel = parcel.readInt() != 0 ? DeepLinkMetadata.CREATOR.createFromParcel(parcel) : null;
                    AnalyticsParams analyticsParams = (AnalyticsParams) parcel.readParcelable(RoutingParams.class.getClassLoader());
                    boolean z = parcel.readInt() != 0;
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i = 0; i != readInt; i++) {
                        linkedHashSet.add(Flag.valueOf(parcel.readString()));
                    }
                    return new RoutingParams(screen, readString, readString2, screen2, createFromParcel, analyticsParams, z, linkedHashSet, (FeatureContext) parcel.readParcelable(RoutingParams.class.getClassLoader()));
                case 1:
                    parcel.getClass();
                    return new ConfirmFrontOfCheckScreen((BlockersData) parcel.readParcelable(ConfirmFrontOfCheckScreen.class.getClassLoader()), (CheckDepositBlocker) parcel.readParcelable(ConfirmFrontOfCheckScreen.class.getClassLoader()));
                case 2:
                    parcel.getClass();
                    return new VerifyCheckDepositScreen((BlockersData) parcel.readParcelable(VerifyCheckDepositScreen.class.getClassLoader()), (CheckDepositBlocker) parcel.readParcelable(VerifyCheckDepositScreen.class.getClassLoader()));
                case 3:
                    parcel.getClass();
                    return new VerifyCheckDialogScreen((BlockersData) parcel.readParcelable(VerifyCheckDialogScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 4:
                    parcel.getClass();
                    return new AnalyticsParams.GenericAnalyticsParams(parcel.readString(), parcel.readInt() != 0 ? BlockerFlowReferrerType.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readString());
                case 5:
                    parcel.getClass();
                    return new AnalyticsParams.GenericTreeElementsParams(parcel.readString(), parcel.readString(), parcel.readString());
                case 6:
                    parcel.getClass();
                    return new AnalyticsParams.GlobalSearchAnalyticsParams((UUID) parcel.readSerializable(), GetProfileDetailsContext.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readString());
                case 7:
                    parcel.getClass();
                    return new AnalyticsParams.InAppNotificationParams(parcel.readString());
                case 8:
                    parcel.getClass();
                    parcel.readInt();
                    return AnalyticsParams.OffersSearchMode.INSTANCE;
                case 9:
                    parcel.getClass();
                    return new AnalyticsParams.OffersTabAnalyticsParams(parcel.readString(), parcel.readInt() != 0);
                case 10:
                    parcel.getClass();
                    return new AnalyticsParams.PaymentAnalyticsParams(parcel.readString());
                case 11:
                    parcel.getClass();
                    return new AnalyticsParams.ShopHubAnalyticsParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? EntityType.valueOf(parcel.readString()) : null, parcel.readString(), parcel.readString());
                case 12:
                    parcel.getClass();
                    return new AnalyticsParams.SupportAnalyticsParams(parcel.readString());
                case 13:
                    parcel.getClass();
                    return new FeatureContext.MoneybotChatContext(parcel.readString(), parcel.readString());
                case 14:
                    parcel.getClass();
                    return new FeatureContext.MoneybotHomeContext(parcel.readString(), parcel.readString(), parcel.readString());
                case 15:
                    parcel.getClass();
                    return new DeepLinkMetadata(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                case 16:
                    parcel.getClass();
                    return new TargetDestination.RouteDestination(RoutingParams.CREATOR.createFromParcel(parcel), parcel.readString());
                case 17:
                    parcel.getClass();
                    return new TargetDestination.ScreenDestination((Screen) parcel.readParcelable(TargetDestination.ScreenDestination.class.getClassLoader()));
                case 18:
                    parcel.getClass();
                    return new ErrorMessaging(parcel.readString(), parcel.readString());
                case 19:
                    parcel.getClass();
                    return new FailureMessageBlockerFullScreen((BlockersData) parcel.readParcelable(FailureMessageBlockerFullScreen.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                case 20:
                    parcel.getClass();
                    return new FailureMessageBlockerScreen((BlockersData) parcel.readParcelable(FailureMessageBlockerScreen.class.getClassLoader()), parcel.readString(), parcel.readString());
                case 21:
                    parcel.getClass();
                    return new FailureMessageScreen(parcel.readString(), parcel.readString(), parcel.readString(), (Screen) parcel.readParcelable(FailureMessageScreen.class.getClassLoader()), (ColorModel) parcel.readParcelable(FailureMessageScreen.class.getClassLoader()));
                case 22:
                    parcel.getClass();
                    return new ColorModel.Accented((Color) parcel.readParcelable(ColorModel.Accented.class.getClassLoader()));
                case 23:
                    parcel.getClass();
                    return new ColorModel.Arcade(parcel.readString());
                case 24:
                    parcel.getClass();
                    parcel.readInt();
                    return ColorModel.Background.INSTANCE;
                case 25:
                    parcel.getClass();
                    parcel.readInt();
                    return ColorModel.BaseWhite.INSTANCE;
                case 26:
                    parcel.getClass();
                    parcel.readInt();
                    return ColorModel.Bitcoin.INSTANCE;
                case 27:
                    parcel.getClass();
                    parcel.readInt();
                    return ColorModel.CashGreen.INSTANCE;
                case 28:
                    parcel.getClass();
                    parcel.readInt();
                    return ColorModel.Error.INSTANCE;
                default:
                    parcel.getClass();
                    parcel.readInt();
                    return ColorModel.GiftCard.INSTANCE;
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            switch (this.$r8$classId) {
                case 0:
                    return new RoutingParams[i];
                case 1:
                    return new ConfirmFrontOfCheckScreen[i];
                case 2:
                    return new VerifyCheckDepositScreen[i];
                case 3:
                    return new VerifyCheckDialogScreen[i];
                case 4:
                    return new AnalyticsParams.GenericAnalyticsParams[i];
                case 5:
                    return new AnalyticsParams.GenericTreeElementsParams[i];
                case 6:
                    return new AnalyticsParams.GlobalSearchAnalyticsParams[i];
                case 7:
                    return new AnalyticsParams.InAppNotificationParams[i];
                case 8:
                    return new AnalyticsParams.OffersSearchMode[i];
                case 9:
                    return new AnalyticsParams.OffersTabAnalyticsParams[i];
                case 10:
                    return new AnalyticsParams.PaymentAnalyticsParams[i];
                case 11:
                    return new AnalyticsParams.ShopHubAnalyticsParams[i];
                case 12:
                    return new AnalyticsParams.SupportAnalyticsParams[i];
                case 13:
                    return new FeatureContext.MoneybotChatContext[i];
                case 14:
                    return new FeatureContext.MoneybotHomeContext[i];
                case 15:
                    return new DeepLinkMetadata[i];
                case 16:
                    return new TargetDestination.RouteDestination[i];
                case 17:
                    return new TargetDestination.ScreenDestination[i];
                case 18:
                    return new ErrorMessaging[i];
                case 19:
                    return new FailureMessageBlockerFullScreen[i];
                case 20:
                    return new FailureMessageBlockerScreen[i];
                case 21:
                    return new FailureMessageScreen[i];
                case 22:
                    return new ColorModel.Accented[i];
                case 23:
                    return new ColorModel.Arcade[i];
                case 24:
                    return new ColorModel.Background[i];
                case 25:
                    return new ColorModel.BaseWhite[i];
                case 26:
                    return new ColorModel.Bitcoin[i];
                case 27:
                    return new ColorModel.CashGreen[i];
                case 28:
                    return new ColorModel.Error[i];
                default:
                    return new ColorModel.GiftCard[i];
            }
        }
    }

    public final class DeepLinkMetadata implements Parcelable {
        public static final Parcelable.Creator<DeepLinkMetadata> CREATOR = new Creator(15);
        public final String appsFlyerId;
        public final String deepLinkSource;
        public final String originalUrl;
        public final String referrer;

        public DeepLinkMetadata(String str, String str2, String str3, String str4) {
            this.deepLinkSource = str;
            this.originalUrl = str2;
            this.referrer = str3;
            this.appsFlyerId = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeepLinkMetadata)) {
                return false;
            }
            DeepLinkMetadata deepLinkMetadata = (DeepLinkMetadata) obj;
            return Intrinsics.areEqual(this.deepLinkSource, deepLinkMetadata.deepLinkSource) && Intrinsics.areEqual(this.originalUrl, deepLinkMetadata.originalUrl) && Intrinsics.areEqual(this.referrer, deepLinkMetadata.referrer) && Intrinsics.areEqual(this.appsFlyerId, deepLinkMetadata.appsFlyerId);
        }

        public final String getAppsFlyerId() {
            return this.appsFlyerId;
        }

        public final String getDeepLinkSource() {
            return this.deepLinkSource;
        }

        public final String getReferrer() {
            return this.referrer;
        }

        public final int hashCode() {
            String str = this.deepLinkSource;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.originalUrl;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.referrer;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.appsFlyerId;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("DeepLinkMetadata(deepLinkSource=", this.deepLinkSource, ", originalUrl=", this.originalUrl, ", referrer="), this.referrer, ", appsFlyerId=", this.appsFlyerId, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.deepLinkSource);
            parcel.writeString(this.originalUrl);
            parcel.writeString(this.referrer);
            parcel.writeString(this.appsFlyerId);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Flag {
        public static final /* synthetic */ Flag[] $VALUES;
        public static final Flag ForwardedForAccountSwitch;

        static {
            Flag flag = new Flag("ForwardedForAccountSwitch", 0);
            ForwardedForAccountSwitch = flag;
            $VALUES = new Flag[]{flag};
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ RoutingParams(Screen screen, String str, Screen screen2, DeepLinkMetadata deepLinkMetadata, AnalyticsParams analyticsParams, FeatureContext featureContext, int i) {
        this(r4, r5, null, r7, r8, r9, true, r11, (i & 256) != 0 ? null : featureContext);
        Screen screen3 = (i & 1) != 0 ? null : screen;
        String str2 = (i & 2) != 0 ? null : str;
        Screen screen4 = (i & 8) != 0 ? null : screen2;
        DeepLinkMetadata deepLinkMetadata2 = (i & 16) != 0 ? null : deepLinkMetadata;
        AnalyticsParams analyticsParams2 = (i & 32) != 0 ? null : analyticsParams;
        EnumSet noneOf = EnumSet.noneOf(Flag.class);
        noneOf.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.Set] */
    public static RoutingParams copy$default(RoutingParams routingParams, String str, String str2, LinkedHashSet linkedHashSet, int i) {
        Screen screen = routingParams.origin;
        if ((i & 2) != 0) {
            str = routingParams.source;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = routingParams.switchSource;
        }
        String str4 = str2;
        Screen screen2 = routingParams.exitScreen;
        DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        AnalyticsParams analyticsParams = routingParams.analyticsParams;
        boolean z = routingParams.allowRouteForwarding;
        LinkedHashSet linkedHashSet2 = linkedHashSet;
        if ((i & 128) != 0) {
            linkedHashSet2 = routingParams.flags;
        }
        LinkedHashSet linkedHashSet3 = linkedHashSet2;
        FeatureContext featureContext = routingParams.featureContext;
        routingParams.getClass();
        linkedHashSet3.getClass();
        return new RoutingParams(screen, str3, str4, screen2, deepLinkMetadata, analyticsParams, z, linkedHashSet3, featureContext);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoutingParams)) {
            return false;
        }
        RoutingParams routingParams = (RoutingParams) obj;
        return Intrinsics.areEqual(this.origin, routingParams.origin) && Intrinsics.areEqual(this.source, routingParams.source) && Intrinsics.areEqual(this.switchSource, routingParams.switchSource) && Intrinsics.areEqual(this.exitScreen, routingParams.exitScreen) && Intrinsics.areEqual(this.deepLinkMetadata, routingParams.deepLinkMetadata) && Intrinsics.areEqual(this.analyticsParams, routingParams.analyticsParams) && this.allowRouteForwarding == routingParams.allowRouteForwarding && Intrinsics.areEqual(this.flags, routingParams.flags) && Intrinsics.areEqual(this.featureContext, routingParams.featureContext);
    }

    public final DeepLinkMetadata getDeepLinkMetadata() {
        return this.deepLinkMetadata;
    }

    public final Screen getExitScreen() {
        return this.exitScreen;
    }

    public final Set getFlags() {
        return this.flags;
    }

    public final Screen getOrigin() {
        return this.origin;
    }

    public final int hashCode() {
        Screen screen = this.origin;
        int hashCode = (screen == null ? 0 : screen.hashCode()) * 31;
        String str = this.source;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.switchSource;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Screen screen2 = this.exitScreen;
        int hashCode4 = (hashCode3 + (screen2 == null ? 0 : screen2.hashCode())) * 31;
        DeepLinkMetadata deepLinkMetadata = this.deepLinkMetadata;
        int hashCode5 = (hashCode4 + (deepLinkMetadata == null ? 0 : deepLinkMetadata.hashCode())) * 31;
        AnalyticsParams analyticsParams = this.analyticsParams;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (analyticsParams == null ? 0 : analyticsParams.hashCode())) * 31, 31, this.allowRouteForwarding), 31, this.flags);
        FeatureContext featureContext = this.featureContext;
        return m + (featureContext != null ? featureContext.hashCode() : 0);
    }

    public final String toString() {
        return "RoutingParams(origin=" + this.origin + ", source=" + this.source + ", switchSource=" + this.switchSource + ", exitScreen=" + this.exitScreen + ", deepLinkMetadata=" + this.deepLinkMetadata + ", analyticsParams=" + this.analyticsParams + ", allowRouteForwarding=" + this.allowRouteForwarding + ", flags=" + this.flags + ", featureContext=" + this.featureContext + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.origin, i);
        parcel.writeString(this.source);
        parcel.writeString(this.switchSource);
        parcel.writeParcelable(this.exitScreen, i);
        DeepLinkMetadata deepLinkMetadata = this.deepLinkMetadata;
        if (deepLinkMetadata == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            deepLinkMetadata.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.analyticsParams, i);
        parcel.writeInt(this.allowRouteForwarding ? 1 : 0);
        Set set = this.flags;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(((Flag) it.next()).name());
        }
        parcel.writeParcelable(this.featureContext, i);
    }

    public RoutingParams(Screen screen, String str, String str2, Screen screen2, DeepLinkMetadata deepLinkMetadata, AnalyticsParams analyticsParams, boolean z, Set set, FeatureContext featureContext) {
        set.getClass();
        this.origin = screen;
        this.source = str;
        this.switchSource = str2;
        this.exitScreen = screen2;
        this.deepLinkMetadata = deepLinkMetadata;
        this.analyticsParams = analyticsParams;
        this.allowRouteForwarding = z;
        this.flags = set;
        this.featureContext = featureContext;
    }
}
