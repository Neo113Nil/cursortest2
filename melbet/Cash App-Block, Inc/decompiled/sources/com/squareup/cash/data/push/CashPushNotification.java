package com.squareup.cash.data.push;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.common.appmessaging.AppMessageAction;
import com.squareup.protos.franklin.common.appmessaging.AppMessagePayload;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b<\b\u0087\b\u0018\u00002\u00020\u0001:\u0004TUVWB\u008f\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010\"J\u0098\u0002\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b#\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010%\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010%\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010'R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010%\u0012\u0004\b/\u0010)\u001a\u0004\b.\u0010'R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00100\u0012\u0004\b3\u0010)\u001a\u0004\b1\u00102R\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010%\u0012\u0004\b5\u0010)\u001a\u0004\b4\u0010'R\"\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u00106\u0012\u0004\b9\u0010)\u001a\u0004\b7\u00108R\"\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010%\u0012\u0004\b;\u0010)\u001a\u0004\b:\u0010'R\"\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010%\u0012\u0004\b=\u0010)\u001a\u0004\b<\u0010'R\"\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010>\u0012\u0004\bA\u0010)\u001a\u0004\b?\u0010@R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010B\u0012\u0004\bE\u0010)\u001a\u0004\bC\u0010DR\"\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010F\u0012\u0004\bI\u0010)\u001a\u0004\bG\u0010HR\"\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010J\u0012\u0004\bM\u0010)\u001a\u0004\bK\u0010LR\"\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010%\u0012\u0004\bO\u0010)\u001a\u0004\bN\u0010'R\"\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010%\u0012\u0004\bQ\u0010)\u001a\u0004\bP\u0010'R\"\u0010 \u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010%\u0012\u0004\bS\u0010)\u001a\u0004\bR\u0010'¨\u0006X"}, d2 = {"Lcom/squareup/cash/data/push/CashPushNotification;", "Landroid/os/Parcelable;", "Lcom/squareup/cash/data/push/CashPushNotification$APS;", "aps", "", "paymentToken", "op", "url", "appToken", "customerToken", "analyticsKey", "Lcom/squareup/cash/data/push/CashPushNotification$Customer;", "otherCustomer", "messageToken", "title", "body", "Lcom/squareup/protos/franklin/api/Instrument;", "instrument", "Lcom/squareup/protos/common/Money;", "paymentAmount", "verificationInstrumentToken", "playIntegrityChallengeToken", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction;", "appMessageAction", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessagePayload;", "appMessagePayload", "Lcom/squareup/cash/data/push/CashPushNotification$ClearAppDataConfig;", "clearAppDataConfig", "Lcom/squareup/cash/data/push/CashPushNotification$TriggerEntitySync;", "triggerEntitySync", "engagementReportingId", "notificationCategory", "imageUrl", "<init>", "(Lcom/squareup/cash/data/push/CashPushNotification$APS;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/cash/data/push/CashPushNotification$Customer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/Instrument;Lcom/squareup/protos/common/Money;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction;Lcom/squareup/protos/franklin/common/appmessaging/AppMessagePayload;Lcom/squareup/cash/data/push/CashPushNotification$ClearAppDataConfig;Lcom/squareup/cash/data/push/CashPushNotification$TriggerEntitySync;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Lcom/squareup/cash/data/push/CashPushNotification$APS;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/cash/data/push/CashPushNotification$Customer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/api/Instrument;Lcom/squareup/protos/common/Money;Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction;Lcom/squareup/protos/franklin/common/appmessaging/AppMessagePayload;Lcom/squareup/cash/data/push/CashPushNotification$ClearAppDataConfig;Lcom/squareup/cash/data/push/CashPushNotification$TriggerEntitySync;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/cash/data/push/CashPushNotification;", "Ljava/lang/String;", "getPaymentToken", "()Ljava/lang/String;", "getPaymentToken$annotations", "()V", "getAppToken", "getAppToken$annotations", "getCustomerToken", "getCustomerToken$annotations", "getAnalyticsKey", "getAnalyticsKey$annotations", "Lcom/squareup/cash/data/push/CashPushNotification$Customer;", "getOtherCustomer", "()Lcom/squareup/cash/data/push/CashPushNotification$Customer;", "getOtherCustomer$annotations", "getMessageToken", "getMessageToken$annotations", "Lcom/squareup/protos/common/Money;", "getPaymentAmount", "()Lcom/squareup/protos/common/Money;", "getPaymentAmount$annotations", "getVerificationInstrumentToken", "getVerificationInstrumentToken$annotations", "getPlayIntegrityChallengeToken", "getPlayIntegrityChallengeToken$annotations", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction;", "getAppMessageAction", "()Lcom/squareup/protos/franklin/common/appmessaging/AppMessageAction;", "getAppMessageAction$annotations", "Lcom/squareup/protos/franklin/common/appmessaging/AppMessagePayload;", "getAppMessagePayload", "()Lcom/squareup/protos/franklin/common/appmessaging/AppMessagePayload;", "getAppMessagePayload$annotations", "Lcom/squareup/cash/data/push/CashPushNotification$ClearAppDataConfig;", "getClearAppDataConfig", "()Lcom/squareup/cash/data/push/CashPushNotification$ClearAppDataConfig;", "getClearAppDataConfig$annotations", "Lcom/squareup/cash/data/push/CashPushNotification$TriggerEntitySync;", "getTriggerEntitySync", "()Lcom/squareup/cash/data/push/CashPushNotification$TriggerEntitySync;", "getTriggerEntitySync$annotations", "getEngagementReportingId", "getEngagementReportingId$annotations", "getNotificationCategory", "getNotificationCategory$annotations", "getImageUrl", "getImageUrl$annotations", "APS", "Customer", "ClearAppDataConfig", "TriggerEntitySync", "notifications"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CashPushNotification implements Parcelable {
    public static final Parcelable.Creator<CashPushNotification> CREATOR = new Creator();
    public final String analyticsKey;
    public final AppMessageAction appMessageAction;
    public final AppMessagePayload appMessagePayload;
    public final String appToken;
    public final APS aps;
    public final String body;
    public final ClearAppDataConfig clearAppDataConfig;
    public final String customerToken;
    public final String engagementReportingId;
    public final String imageUrl;
    public final Instrument instrument;
    public final String messageToken;
    public final String notificationCategory;
    public final String op;
    public final Customer otherCustomer;
    public final Money paymentAmount;
    public final String paymentToken;
    public final String playIntegrityChallengeToken;
    public final String title;
    public final TriggerEntitySync triggerEntitySync;
    public final String url;
    public final String verificationInstrumentToken;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/data/push/CashPushNotification$APS;", "Landroid/os/Parcelable;", "notifications"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class APS implements Parcelable {
        public static final Parcelable.Creator<APS> CREATOR = new Creator();
        public final String category;
        public final String sound;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new APS(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new APS[i];
            }
        }

        public APS(String str, String str2) {
            this.sound = str;
            this.category = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof APS)) {
                return false;
            }
            APS aps = (APS) obj;
            return Intrinsics.areEqual(this.sound, aps.sound) && Intrinsics.areEqual(this.category, aps.category);
        }

        public final int hashCode() {
            String str = this.sound;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.category;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("APS(sound=", this.sound, ", category=", this.category, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.sound);
            parcel.writeString(this.category);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rB\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/squareup/cash/data/push/CashPushNotification$ClearAppDataConfig;", "Landroid/os/Parcelable;", "Lcom/squareup/cash/data/push/CashPushNotification$ClearAppDataConfig$ClearAll;", "clearAll", "<init>", "(Lcom/squareup/cash/data/push/CashPushNotification$ClearAppDataConfig$ClearAll;)V", "copy", "(Lcom/squareup/cash/data/push/CashPushNotification$ClearAppDataConfig$ClearAll;)Lcom/squareup/cash/data/push/CashPushNotification$ClearAppDataConfig;", "Lcom/squareup/cash/data/push/CashPushNotification$ClearAppDataConfig$ClearAll;", "getClearAll", "()Lcom/squareup/cash/data/push/CashPushNotification$ClearAppDataConfig$ClearAll;", "getClearAll$annotations", "()V", "ClearAll", "notifications"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ClearAppDataConfig implements Parcelable {
        public static final Parcelable.Creator<ClearAppDataConfig> CREATOR = new Creator();
        public final ClearAll clearAll;

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/squareup/cash/data/push/CashPushNotification$ClearAppDataConfig$ClearAll;", "Landroid/os/Parcelable;", "", "clearOnNextLaunch", "<init>", "(Ljava/lang/Boolean;)V", "copy", "(Ljava/lang/Boolean;)Lcom/squareup/cash/data/push/CashPushNotification$ClearAppDataConfig$ClearAll;", "Ljava/lang/Boolean;", "getClearOnNextLaunch", "()Ljava/lang/Boolean;", "getClearOnNextLaunch$annotations", "()V", "notifications"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ClearAll implements Parcelable {
            public static final Parcelable.Creator<ClearAll> CREATOR = new Creator();
            public final Boolean clearOnNextLaunch;

            public final class Creator implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Boolean valueOf;
                    parcel.getClass();
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new ClearAll(valueOf);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ClearAll[i];
                }
            }

            public ClearAll(@Json(name = "clear_on_next_launch") Boolean bool) {
                this.clearOnNextLaunch = bool;
            }

            @Json(name = "clear_on_next_launch")
            public static /* synthetic */ void getClearOnNextLaunch$annotations() {
            }

            public final ClearAll copy(@Json(name = "clear_on_next_launch") Boolean clearOnNextLaunch) {
                return new ClearAll(clearOnNextLaunch);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClearAll) && Intrinsics.areEqual(this.clearOnNextLaunch, ((ClearAll) obj).clearOnNextLaunch);
            }

            public final Boolean getClearOnNextLaunch() {
                return this.clearOnNextLaunch;
            }

            public final int hashCode() {
                Boolean bool = this.clearOnNextLaunch;
                if (bool == null) {
                    return 0;
                }
                return bool.hashCode();
            }

            public final String toString() {
                return Matcher$$ExternalSyntheticOutline0.m(this.clearOnNextLaunch, "ClearAll(clearOnNextLaunch=", ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                Boolean bool = this.clearOnNextLaunch;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
                }
            }
        }

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ClearAppDataConfig(parcel.readInt() == 0 ? null : ClearAll.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClearAppDataConfig[i];
            }
        }

        public ClearAppDataConfig(@Json(name = "clear_all") ClearAll clearAll) {
            this.clearAll = clearAll;
        }

        @Json(name = "clear_all")
        public static /* synthetic */ void getClearAll$annotations() {
        }

        public final ClearAppDataConfig copy(@Json(name = "clear_all") ClearAll clearAll) {
            return new ClearAppDataConfig(clearAll);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClearAppDataConfig) && Intrinsics.areEqual(this.clearAll, ((ClearAppDataConfig) obj).clearAll);
        }

        public final ClearAll getClearAll() {
            return this.clearAll;
        }

        public final int hashCode() {
            ClearAll clearAll = this.clearAll;
            if (clearAll == null) {
                return 0;
            }
            return clearAll.hashCode();
        }

        public final String toString() {
            return "ClearAppDataConfig(clearAll=" + this.clearAll + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            ClearAll clearAll = this.clearAll;
            if (clearAll == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                clearAll.writeToParcel(parcel, i);
            }
        }
    }

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            AppMessagePayload appMessagePayload;
            ClearAppDataConfig createFromParcel;
            parcel.getClass();
            APS createFromParcel2 = parcel.readInt() == 0 ? null : APS.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            Customer createFromParcel3 = parcel.readInt() == 0 ? null : Customer.CREATOR.createFromParcel(parcel);
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            Instrument instrument = (Instrument) parcel.readParcelable(CashPushNotification.class.getClassLoader());
            Money money = (Money) parcel.readParcelable(CashPushNotification.class.getClassLoader());
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            AppMessageAction appMessageAction = (AppMessageAction) parcel.readParcelable(CashPushNotification.class.getClassLoader());
            AppMessagePayload appMessagePayload2 = (AppMessagePayload) parcel.readParcelable(CashPushNotification.class.getClassLoader());
            if (parcel.readInt() == 0) {
                appMessagePayload = appMessagePayload2;
                createFromParcel = null;
            } else {
                appMessagePayload = appMessagePayload2;
                createFromParcel = ClearAppDataConfig.CREATOR.createFromParcel(parcel);
            }
            return new CashPushNotification(createFromParcel2, readString, readString2, readString3, readString4, readString5, readString6, createFromParcel3, readString7, readString8, readString9, instrument, money, readString10, readString11, appMessageAction, appMessagePayload, createFromParcel, parcel.readInt() == 0 ? null : TriggerEntitySync.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CashPushNotification[i];
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/squareup/cash/data/push/CashPushNotification$Customer;", "Landroid/os/Parcelable;", "", "id", "photoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/cash/data/push/CashPushNotification$Customer;", "Ljava/lang/String;", "getPhotoUrl", "()Ljava/lang/String;", "getPhotoUrl$annotations", "()V", "notifications"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Customer implements Parcelable {
        public static final Parcelable.Creator<Customer> CREATOR = new Creator();
        public final String id;
        public final String photoUrl;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Customer(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Customer[i];
            }
        }

        public Customer(String str, @Json(name = "photo-url") String str2) {
            this.id = str;
            this.photoUrl = str2;
        }

        @Json(name = "photo-url")
        public static /* synthetic */ void getPhotoUrl$annotations() {
        }

        public final Customer copy(String id, @Json(name = "photo-url") String photoUrl) {
            return new Customer(id, photoUrl);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Customer)) {
                return false;
            }
            Customer customer = (Customer) obj;
            return Intrinsics.areEqual(this.id, customer.id) && Intrinsics.areEqual(this.photoUrl, customer.photoUrl);
        }

        public final int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.photoUrl;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Customer(id=", this.id, ", photoUrl=", this.photoUrl, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.id);
            parcel.writeString(this.photoUrl);
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rB\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/squareup/cash/data/push/CashPushNotification$TriggerEntitySync;", "Landroid/os/Parcelable;", "", "syncType", "<init>", "(Ljava/lang/String;)V", "copy", "(Ljava/lang/String;)Lcom/squareup/cash/data/push/CashPushNotification$TriggerEntitySync;", "Ljava/lang/String;", "getSyncType", "()Ljava/lang/String;", "getSyncType$annotations", "()V", "SyncType", "notifications"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TriggerEntitySync implements Parcelable {
        public static final Parcelable.Creator<TriggerEntitySync> CREATOR = new Creator();
        public final String syncType;

        public final class Creator implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new TriggerEntitySync(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TriggerEntitySync[i];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes8.dex */
        public final class SyncType {
            public static final /* synthetic */ SyncType[] $VALUES = {new SyncType("REGULAR", 0), new SyncType("GRADUAL", 1), new SyncType("IMMEDIATE", 2)};

            /* JADX INFO: Fake field, exist only in values array */
            SyncType EF5;

            public static SyncType valueOf(String str) {
                return (SyncType) Enum.valueOf(SyncType.class, str);
            }

            public static SyncType[] values() {
                return (SyncType[]) $VALUES.clone();
            }
        }

        public TriggerEntitySync(@Json(name = "sync_type") String str) {
            str.getClass();
            this.syncType = str;
        }

        @Json(name = "sync_type")
        public static /* synthetic */ void getSyncType$annotations() {
        }

        public final TriggerEntitySync copy(@Json(name = "sync_type") String syncType) {
            syncType.getClass();
            return new TriggerEntitySync(syncType);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TriggerEntitySync) && Intrinsics.areEqual(this.syncType, ((TriggerEntitySync) obj).syncType);
        }

        public final int hashCode() {
            return this.syncType.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TriggerEntitySync(syncType=", this.syncType, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.syncType);
        }
    }

    public /* synthetic */ CashPushNotification(APS aps, String str, String str2, String str3, String str4, String str5, String str6, Customer customer, String str7, String str8, String str9, Instrument instrument, Money money, String str10, String str11, AppMessageAction appMessageAction, AppMessagePayload appMessagePayload, ClearAppDataConfig clearAppDataConfig, TriggerEntitySync triggerEntitySync, String str12, String str13, String str14, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : aps, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : customer, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, (i & 1024) != 0 ? null : str9, (i & 2048) != 0 ? null : instrument, (i & 4096) != 0 ? null : money, (i & PKIFailureInfo.certRevoked) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : appMessageAction, (i & 65536) != 0 ? null : appMessagePayload, (i & PKIFailureInfo.unsupportedVersion) != 0 ? null : clearAppDataConfig, (i & PKIFailureInfo.transactionIdInUse) != 0 ? null : triggerEntitySync, (i & PKIFailureInfo.signerNotTrusted) != 0 ? null : str12, (i & PKIFailureInfo.badCertTemplate) != 0 ? null : str13, (i & PKIFailureInfo.badSenderNonce) != 0 ? null : str14);
    }

    @Json(name = "ak")
    public static /* synthetic */ void getAnalyticsKey$annotations() {
    }

    @Json(name = "app-message-action")
    public static /* synthetic */ void getAppMessageAction$annotations() {
    }

    @Json(name = "app-message-payload")
    public static /* synthetic */ void getAppMessagePayload$annotations() {
    }

    @Json(name = "at")
    public static /* synthetic */ void getAppToken$annotations() {
    }

    @Json(name = "clear-app-data-config")
    public static /* synthetic */ void getClearAppDataConfig$annotations() {
    }

    @Json(name = "c")
    public static /* synthetic */ void getCustomerToken$annotations() {
    }

    @Json(name = "eri")
    public static /* synthetic */ void getEngagementReportingId$annotations() {
    }

    @Json(name = "image-url")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @Json(name = "mt")
    public static /* synthetic */ void getMessageToken$annotations() {
    }

    @Json(name = "notification-category")
    public static /* synthetic */ void getNotificationCategory$annotations() {
    }

    @Json(name = "other-customer")
    public static /* synthetic */ void getOtherCustomer$annotations() {
    }

    @Json(name = "payment-amount")
    public static /* synthetic */ void getPaymentAmount$annotations() {
    }

    @Json(name = "pt")
    public static /* synthetic */ void getPaymentToken$annotations() {
    }

    @Json(name = "play-integrity-challenge-token")
    public static /* synthetic */ void getPlayIntegrityChallengeToken$annotations() {
    }

    @Json(name = "tes")
    public static /* synthetic */ void getTriggerEntitySync$annotations() {
    }

    @Json(name = "verification-instrument-token")
    public static /* synthetic */ void getVerificationInstrumentToken$annotations() {
    }

    public final CashPushNotification copy(APS aps, @Json(name = "pt") String paymentToken, String op, String url, @Json(name = "at") String appToken, @Json(name = "c") String customerToken, @Json(name = "ak") String analyticsKey, @Json(name = "other-customer") Customer otherCustomer, @Json(name = "mt") String messageToken, String title, String body, Instrument instrument, @Json(name = "payment-amount") Money paymentAmount, @Json(name = "verification-instrument-token") String verificationInstrumentToken, @Json(name = "play-integrity-challenge-token") String playIntegrityChallengeToken, @Json(name = "app-message-action") AppMessageAction appMessageAction, @Json(name = "app-message-payload") AppMessagePayload appMessagePayload, @Json(name = "clear-app-data-config") ClearAppDataConfig clearAppDataConfig, @Json(name = "tes") TriggerEntitySync triggerEntitySync, @Json(name = "eri") String engagementReportingId, @Json(name = "notification-category") String notificationCategory, @Json(name = "image-url") String imageUrl) {
        return new CashPushNotification(aps, paymentToken, op, url, appToken, customerToken, analyticsKey, otherCustomer, messageToken, title, body, instrument, paymentAmount, verificationInstrumentToken, playIntegrityChallengeToken, appMessageAction, appMessagePayload, clearAppDataConfig, triggerEntitySync, engagementReportingId, notificationCategory, imageUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CashPushNotification)) {
            return false;
        }
        CashPushNotification cashPushNotification = (CashPushNotification) obj;
        return Intrinsics.areEqual(this.aps, cashPushNotification.aps) && Intrinsics.areEqual(this.paymentToken, cashPushNotification.paymentToken) && Intrinsics.areEqual(this.op, cashPushNotification.op) && Intrinsics.areEqual(this.url, cashPushNotification.url) && Intrinsics.areEqual(this.appToken, cashPushNotification.appToken) && Intrinsics.areEqual(this.customerToken, cashPushNotification.customerToken) && Intrinsics.areEqual(this.analyticsKey, cashPushNotification.analyticsKey) && Intrinsics.areEqual(this.otherCustomer, cashPushNotification.otherCustomer) && Intrinsics.areEqual(this.messageToken, cashPushNotification.messageToken) && Intrinsics.areEqual(this.title, cashPushNotification.title) && Intrinsics.areEqual(this.body, cashPushNotification.body) && Intrinsics.areEqual(this.instrument, cashPushNotification.instrument) && Intrinsics.areEqual(this.paymentAmount, cashPushNotification.paymentAmount) && Intrinsics.areEqual(this.verificationInstrumentToken, cashPushNotification.verificationInstrumentToken) && Intrinsics.areEqual(this.playIntegrityChallengeToken, cashPushNotification.playIntegrityChallengeToken) && Intrinsics.areEqual(this.appMessageAction, cashPushNotification.appMessageAction) && Intrinsics.areEqual(this.appMessagePayload, cashPushNotification.appMessagePayload) && Intrinsics.areEqual(this.clearAppDataConfig, cashPushNotification.clearAppDataConfig) && Intrinsics.areEqual(this.triggerEntitySync, cashPushNotification.triggerEntitySync) && Intrinsics.areEqual(this.engagementReportingId, cashPushNotification.engagementReportingId) && Intrinsics.areEqual(this.notificationCategory, cashPushNotification.notificationCategory) && Intrinsics.areEqual(this.imageUrl, cashPushNotification.imageUrl);
    }

    public final AppMessageAction getAppMessageAction() {
        return this.appMessageAction;
    }

    public final ClearAppDataConfig getClearAppDataConfig() {
        return this.clearAppDataConfig;
    }

    public final Instrument getInstrument() {
        return this.instrument;
    }

    public final String getOp() {
        return this.op;
    }

    public final Money getPaymentAmount() {
        return this.paymentAmount;
    }

    public final String getPaymentToken() {
        return this.paymentToken;
    }

    public final String getPlayIntegrityChallengeToken() {
        return this.playIntegrityChallengeToken;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getVerificationInstrumentToken() {
        return this.verificationInstrumentToken;
    }

    public final int hashCode() {
        APS aps = this.aps;
        int hashCode = (aps == null ? 0 : aps.hashCode()) * 31;
        String str = this.paymentToken;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.op;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appToken;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.customerToken;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.analyticsKey;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Customer customer = this.otherCustomer;
        int hashCode8 = (hashCode7 + (customer == null ? 0 : customer.hashCode())) * 31;
        String str7 = this.messageToken;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.title;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.body;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Instrument instrument = this.instrument;
        int hashCode12 = (hashCode11 + (instrument == null ? 0 : instrument.hashCode())) * 31;
        Money money = this.paymentAmount;
        int hashCode13 = (hashCode12 + (money == null ? 0 : money.hashCode())) * 31;
        String str10 = this.verificationInstrumentToken;
        int hashCode14 = (hashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.playIntegrityChallengeToken;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        AppMessageAction appMessageAction = this.appMessageAction;
        int hashCode16 = (hashCode15 + (appMessageAction == null ? 0 : appMessageAction.hashCode())) * 31;
        AppMessagePayload appMessagePayload = this.appMessagePayload;
        int hashCode17 = (hashCode16 + (appMessagePayload == null ? 0 : appMessagePayload.hashCode())) * 31;
        ClearAppDataConfig clearAppDataConfig = this.clearAppDataConfig;
        int hashCode18 = (hashCode17 + (clearAppDataConfig == null ? 0 : clearAppDataConfig.hashCode())) * 31;
        TriggerEntitySync triggerEntitySync = this.triggerEntitySync;
        int hashCode19 = (hashCode18 + (triggerEntitySync == null ? 0 : triggerEntitySync.syncType.hashCode())) * 31;
        String str12 = this.engagementReportingId;
        int hashCode20 = (hashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.notificationCategory;
        int hashCode21 = (hashCode20 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.imageUrl;
        return hashCode21 + (str14 != null ? str14.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CashPushNotification(aps=");
        sb.append(this.aps);
        sb.append(", paymentToken=");
        sb.append(this.paymentToken);
        sb.append(", op=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.op, ", url=", this.url, ", appToken=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.appToken, ", customerToken=", this.customerToken, ", analyticsKey=");
        sb.append(this.analyticsKey);
        sb.append(", otherCustomer=");
        sb.append(this.otherCustomer);
        sb.append(", messageToken=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.messageToken, ", title=", this.title, ", body=");
        sb.append(this.body);
        sb.append(", instrument=");
        sb.append(this.instrument);
        sb.append(", paymentAmount=");
        sb.append(this.paymentAmount);
        sb.append(", verificationInstrumentToken=");
        sb.append(this.verificationInstrumentToken);
        sb.append(", playIntegrityChallengeToken=");
        sb.append(this.playIntegrityChallengeToken);
        sb.append(", appMessageAction=");
        sb.append(this.appMessageAction);
        sb.append(", appMessagePayload=");
        sb.append(this.appMessagePayload);
        sb.append(", clearAppDataConfig=");
        sb.append(this.clearAppDataConfig);
        sb.append(", triggerEntitySync=");
        sb.append(this.triggerEntitySync);
        sb.append(", engagementReportingId=");
        sb.append(this.engagementReportingId);
        sb.append(", notificationCategory=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.notificationCategory, ", imageUrl=", this.imageUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        APS aps = this.aps;
        if (aps == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aps.writeToParcel(parcel, i);
        }
        parcel.writeString(this.paymentToken);
        parcel.writeString(this.op);
        parcel.writeString(this.url);
        parcel.writeString(this.appToken);
        parcel.writeString(this.customerToken);
        parcel.writeString(this.analyticsKey);
        Customer customer = this.otherCustomer;
        if (customer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customer.writeToParcel(parcel, i);
        }
        parcel.writeString(this.messageToken);
        parcel.writeString(this.title);
        parcel.writeString(this.body);
        parcel.writeParcelable(this.instrument, i);
        parcel.writeParcelable(this.paymentAmount, i);
        parcel.writeString(this.verificationInstrumentToken);
        parcel.writeString(this.playIntegrityChallengeToken);
        parcel.writeParcelable(this.appMessageAction, i);
        parcel.writeParcelable(this.appMessagePayload, i);
        ClearAppDataConfig clearAppDataConfig = this.clearAppDataConfig;
        if (clearAppDataConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clearAppDataConfig.writeToParcel(parcel, i);
        }
        TriggerEntitySync triggerEntitySync = this.triggerEntitySync;
        if (triggerEntitySync == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(triggerEntitySync.syncType);
        }
        parcel.writeString(this.engagementReportingId);
        parcel.writeString(this.notificationCategory);
        parcel.writeString(this.imageUrl);
    }

    public CashPushNotification(APS aps, @Json(name = "pt") String str, String str2, String str3, @Json(name = "at") String str4, @Json(name = "c") String str5, @Json(name = "ak") String str6, @Json(name = "other-customer") Customer customer, @Json(name = "mt") String str7, String str8, String str9, Instrument instrument, @Json(name = "payment-amount") Money money, @Json(name = "verification-instrument-token") String str10, @Json(name = "play-integrity-challenge-token") String str11, @Json(name = "app-message-action") AppMessageAction appMessageAction, @Json(name = "app-message-payload") AppMessagePayload appMessagePayload, @Json(name = "clear-app-data-config") ClearAppDataConfig clearAppDataConfig, @Json(name = "tes") TriggerEntitySync triggerEntitySync, @Json(name = "eri") String str12, @Json(name = "notification-category") String str13, @Json(name = "image-url") String str14) {
        this.aps = aps;
        this.paymentToken = str;
        this.op = str2;
        this.url = str3;
        this.appToken = str4;
        this.customerToken = str5;
        this.analyticsKey = str6;
        this.otherCustomer = customer;
        this.messageToken = str7;
        this.title = str8;
        this.body = str9;
        this.instrument = instrument;
        this.paymentAmount = money;
        this.verificationInstrumentToken = str10;
        this.playIntegrityChallengeToken = str11;
        this.appMessageAction = appMessageAction;
        this.appMessagePayload = appMessagePayload;
        this.clearAppDataConfig = clearAppDataConfig;
        this.triggerEntitySync = triggerEntitySync;
        this.engagementReportingId = str12;
        this.notificationCategory = str13;
        this.imageUrl = str14;
    }
}
