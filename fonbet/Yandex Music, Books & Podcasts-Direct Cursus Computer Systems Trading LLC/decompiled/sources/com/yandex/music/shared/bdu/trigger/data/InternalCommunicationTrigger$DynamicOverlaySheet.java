package com.yandex.music.shared.bdu.trigger.data;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.metrica.push.common.CoreConstants;
import defpackage.eta;
import defpackage.f1d;
import defpackage.hrg;
import defpackage.k5r;
import defpackage.mte;
import defpackage.su4;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"com/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$DynamicOverlaySheet", "Lmte;", "", "screenId", "feedbackToken", "Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$Meta;", "meta", "Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$DynamicOverlaySheet$Data;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$Meta;Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$DynamicOverlaySheet$Data;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$Meta;", "a", "()Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$Meta;", "Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$DynamicOverlaySheet$Data;", "c", "()Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$DynamicOverlaySheet$Data;", "Data", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class InternalCommunicationTrigger$DynamicOverlaySheet implements mte {

    @SerializedName("div")
    @NotNull
    private final Data data;

    @SerializedName("feedbackToken")
    @NotNull
    private final String feedbackToken;

    @SerializedName("meta")
    @NotNull
    private final InternalCommunicationTrigger$Meta meta;

    @SerializedName("screenId")
    @NotNull
    private final String screenId;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001:\u0001;Bë\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b!\u0010 R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010$R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b&\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b'\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b(\u0010$R\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b)\u0010$R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b-\u0010$R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b.\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b/\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b0\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b1\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b2\u0010$R\u001a\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b3\u0010$R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b4\u0010$R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b5\u0010$R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b6\u0010$R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b7\u0010$R\u001a\u0010\u0019\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b8\u0010$R\u001a\u0010\u001a\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b9\u0010$R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b:\u0010$¨\u0006<"}, d2 = {"Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$DynamicOverlaySheet$Data;", "", "", "canBeOpened", "isCenterAlign", "", "headerText", "headerColor", "bigHeader", "subtitleText", "subtitleColor", "firstButtonText", "Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$DynamicOverlaySheet$Data$ButtonAction;", "firstButtonAction", "firstButtonColor", "firstButtonTextColor", "secondButtonText", "secondButtonAction", "secondButtonColor", "secondButtonTextColor", "closeButtonColor", "eridButtonColor", "advDisclaimer", "disclaimerText", "disclaimerColor", "imageUrl", "backgroundColor", "backgroundImageUrl", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$DynamicOverlaySheet$Data$ButtonAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$DynamicOverlaySheet$Data$ButtonAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Z", "e", "()Z", "w", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "n", "d", "v", "u", "l", "Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$DynamicOverlaySheet$Data$ButtonAction;", "j", "()Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$DynamicOverlaySheet$Data$ButtonAction;", "k", "m", "s", "q", "r", "t", "f", CoreConstants.PushMessage.SERVICE_TYPE, "a", "h", "g", "p", "b", "c", "ButtonAction", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class Data {

        @SerializedName("adv_disclaimer")
        private final String advDisclaimer;

        @SerializedName("background_color")
        @NotNull
        private final String backgroundColor;

        @SerializedName("background_image_url")
        private final String backgroundImageUrl;

        @SerializedName("big_header")
        private final boolean bigHeader;

        @SerializedName("can_be_opened")
        private final boolean canBeOpened;

        @SerializedName("close_button_color")
        @NotNull
        private final String closeButtonColor;

        @SerializedName("disclaimer_color")
        private final String disclaimerColor;

        @SerializedName("disclaimer_text")
        private final String disclaimerText;

        @SerializedName("erid_button_color")
        private final String eridButtonColor;

        @SerializedName("first_button_action")
        @NotNull
        private final ButtonAction firstButtonAction;

        @SerializedName("first_button_color")
        @NotNull
        private final String firstButtonColor;

        @SerializedName("first_button_text")
        @NotNull
        private final String firstButtonText;

        @SerializedName("first_button_text_color")
        @NotNull
        private final String firstButtonTextColor;

        @SerializedName("header_color")
        @NotNull
        private final String headerColor;

        @SerializedName("header_text")
        @NotNull
        private final String headerText;

        @SerializedName("image_url")
        @NotNull
        private final String imageUrl;

        @SerializedName("is_center_align")
        private final boolean isCenterAlign;

        @SerializedName("second_button_action")
        private final ButtonAction secondButtonAction;

        @SerializedName("second_button_color")
        private final String secondButtonColor;

        @SerializedName("second_button_text")
        private final String secondButtonText;

        @SerializedName("second_button_text_color")
        private final String secondButtonTextColor;

        @SerializedName("subtitle_color")
        private final String subtitleColor;

        @SerializedName("subtitle_text")
        private final String subtitleText;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/music/shared/bdu/trigger/data/InternalCommunicationTrigger$DynamicOverlaySheet$Data$ButtonAction;", "", "", "uri", ConnectableDevice.KEY_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        public static final /* data */ class ButtonAction {

            @SerializedName(ConnectableDevice.KEY_ID)
            @NotNull
            private final String id;

            @SerializedName("uri")
            @NotNull
            private final String uri;

            public ButtonAction(@NotNull String str, @NotNull String str2) {
                str.getClass();
                str2.getClass();
                this.uri = str;
                this.id = str2;
            }

            /* renamed from: a, reason: from getter */
            public final String getId() {
                return this.id;
            }

            /* renamed from: b, reason: from getter */
            public final String getUri() {
                return this.uri;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ButtonAction)) {
                    return false;
                }
                ButtonAction buttonAction = (ButtonAction) obj;
                return Intrinsics.d(this.uri, buttonAction.uri) && Intrinsics.d(this.id, buttonAction.id);
            }

            public final int hashCode() {
                return this.id.hashCode() + (this.uri.hashCode() * 31);
            }

            public final String toString() {
                return hrg.s("ButtonAction(uri=", this.uri, ", id=", this.id, ")");
            }
        }

        public /* synthetic */ Data(boolean z, boolean z2, String str, String str2, boolean z3, String str3, String str4, String str5, ButtonAction buttonAction, String str6, String str7, String str8, ButtonAction buttonAction2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, z2, str, str2, z3, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, str5, buttonAction, str6, str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : buttonAction2, (i & RemoteCameraConfig.Notification.ID) != 0 ? null : str9, (i & 16384) != 0 ? null : str10, str11, (65536 & i) != 0 ? null : str12, (131072 & i) != 0 ? null : str13, (262144 & i) != 0 ? null : str14, (524288 & i) != 0 ? null : str15, str16, str17, (i & RemoteCameraConfig.Camera.BITRATE) != 0 ? null : str18);
        }

        /* renamed from: a, reason: from getter */
        public final String getAdvDisclaimer() {
            return this.advDisclaimer;
        }

        /* renamed from: b, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: c, reason: from getter */
        public final String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getBigHeader() {
            return this.bigHeader;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getCanBeOpened() {
            return this.canBeOpened;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return this.canBeOpened == data.canBeOpened && this.isCenterAlign == data.isCenterAlign && Intrinsics.d(this.headerText, data.headerText) && Intrinsics.d(this.headerColor, data.headerColor) && this.bigHeader == data.bigHeader && Intrinsics.d(this.subtitleText, data.subtitleText) && Intrinsics.d(this.subtitleColor, data.subtitleColor) && Intrinsics.d(this.firstButtonText, data.firstButtonText) && Intrinsics.d(this.firstButtonAction, data.firstButtonAction) && Intrinsics.d(this.firstButtonColor, data.firstButtonColor) && Intrinsics.d(this.firstButtonTextColor, data.firstButtonTextColor) && Intrinsics.d(this.secondButtonText, data.secondButtonText) && Intrinsics.d(this.secondButtonAction, data.secondButtonAction) && Intrinsics.d(this.secondButtonColor, data.secondButtonColor) && Intrinsics.d(this.secondButtonTextColor, data.secondButtonTextColor) && Intrinsics.d(this.closeButtonColor, data.closeButtonColor) && Intrinsics.d(this.eridButtonColor, data.eridButtonColor) && Intrinsics.d(this.advDisclaimer, data.advDisclaimer) && Intrinsics.d(this.disclaimerText, data.disclaimerText) && Intrinsics.d(this.disclaimerColor, data.disclaimerColor) && Intrinsics.d(this.imageUrl, data.imageUrl) && Intrinsics.d(this.backgroundColor, data.backgroundColor) && Intrinsics.d(this.backgroundImageUrl, data.backgroundImageUrl);
        }

        /* renamed from: f, reason: from getter */
        public final String getCloseButtonColor() {
            return this.closeButtonColor;
        }

        /* renamed from: g, reason: from getter */
        public final String getDisclaimerColor() {
            return this.disclaimerColor;
        }

        /* renamed from: h, reason: from getter */
        public final String getDisclaimerText() {
            return this.disclaimerText;
        }

        public final int hashCode() {
            int e = k5r.e(k5r.c(k5r.c(k5r.e(Boolean.hashCode(this.canBeOpened) * 31, 31, this.isCenterAlign), 31, this.headerText), 31, this.headerColor), 31, this.bigHeader);
            String str = this.subtitleText;
            int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.subtitleColor;
            int c = k5r.c(k5r.c((this.firstButtonAction.hashCode() + k5r.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.firstButtonText)) * 31, 31, this.firstButtonColor), 31, this.firstButtonTextColor);
            String str3 = this.secondButtonText;
            int hashCode2 = (c + (str3 == null ? 0 : str3.hashCode())) * 31;
            ButtonAction buttonAction = this.secondButtonAction;
            int hashCode3 = (hashCode2 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
            String str4 = this.secondButtonColor;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.secondButtonTextColor;
            int c2 = k5r.c((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.closeButtonColor);
            String str6 = this.eridButtonColor;
            int hashCode5 = (c2 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.advDisclaimer;
            int hashCode6 = (hashCode5 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.disclaimerText;
            int hashCode7 = (hashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.disclaimerColor;
            int c3 = k5r.c(k5r.c((hashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31, 31, this.imageUrl), 31, this.backgroundColor);
            String str10 = this.backgroundImageUrl;
            return c3 + (str10 != null ? str10.hashCode() : 0);
        }

        /* renamed from: i, reason: from getter */
        public final String getEridButtonColor() {
            return this.eridButtonColor;
        }

        /* renamed from: j, reason: from getter */
        public final ButtonAction getFirstButtonAction() {
            return this.firstButtonAction;
        }

        /* renamed from: k, reason: from getter */
        public final String getFirstButtonColor() {
            return this.firstButtonColor;
        }

        /* renamed from: l, reason: from getter */
        public final String getFirstButtonText() {
            return this.firstButtonText;
        }

        /* renamed from: m, reason: from getter */
        public final String getFirstButtonTextColor() {
            return this.firstButtonTextColor;
        }

        /* renamed from: n, reason: from getter */
        public final String getHeaderColor() {
            return this.headerColor;
        }

        /* renamed from: o, reason: from getter */
        public final String getHeaderText() {
            return this.headerText;
        }

        /* renamed from: p, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: q, reason: from getter */
        public final ButtonAction getSecondButtonAction() {
            return this.secondButtonAction;
        }

        /* renamed from: r, reason: from getter */
        public final String getSecondButtonColor() {
            return this.secondButtonColor;
        }

        /* renamed from: s, reason: from getter */
        public final String getSecondButtonText() {
            return this.secondButtonText;
        }

        /* renamed from: t, reason: from getter */
        public final String getSecondButtonTextColor() {
            return this.secondButtonTextColor;
        }

        public final String toString() {
            boolean z = this.canBeOpened;
            boolean z2 = this.isCenterAlign;
            String str = this.headerText;
            String str2 = this.headerColor;
            boolean z3 = this.bigHeader;
            String str3 = this.subtitleText;
            String str4 = this.subtitleColor;
            String str5 = this.firstButtonText;
            ButtonAction buttonAction = this.firstButtonAction;
            String str6 = this.firstButtonColor;
            String str7 = this.firstButtonTextColor;
            String str8 = this.secondButtonText;
            ButtonAction buttonAction2 = this.secondButtonAction;
            String str9 = this.secondButtonColor;
            String str10 = this.secondButtonTextColor;
            String str11 = this.closeButtonColor;
            String str12 = this.eridButtonColor;
            String str13 = this.advDisclaimer;
            String str14 = this.disclaimerText;
            String str15 = this.disclaimerColor;
            String str16 = this.imageUrl;
            String str17 = this.backgroundColor;
            String str18 = this.backgroundImageUrl;
            StringBuilder j = eta.j("Data(canBeOpened=", z, ", isCenterAlign=", z2, ", headerText=");
            su4.v(j, str, ", headerColor=", str2, ", bigHeader=");
            j.append(z3);
            j.append(", subtitleText=");
            j.append(str3);
            j.append(", subtitleColor=");
            su4.v(j, str4, ", firstButtonText=", str5, ", firstButtonAction=");
            j.append(buttonAction);
            j.append(", firstButtonColor=");
            j.append(str6);
            j.append(", firstButtonTextColor=");
            su4.v(j, str7, ", secondButtonText=", str8, ", secondButtonAction=");
            j.append(buttonAction2);
            j.append(", secondButtonColor=");
            j.append(str9);
            j.append(", secondButtonTextColor=");
            su4.v(j, str10, ", closeButtonColor=", str11, ", eridButtonColor=");
            su4.v(j, str12, ", advDisclaimer=", str13, ", disclaimerText=");
            su4.v(j, str14, ", disclaimerColor=", str15, ", imageUrl=");
            su4.v(j, str16, ", backgroundColor=", str17, ", backgroundImageUrl=");
            return su4.o(j, str18, ")");
        }

        /* renamed from: u, reason: from getter */
        public final String getSubtitleColor() {
            return this.subtitleColor;
        }

        /* renamed from: v, reason: from getter */
        public final String getSubtitleText() {
            return this.subtitleText;
        }

        /* renamed from: w, reason: from getter */
        public final boolean getIsCenterAlign() {
            return this.isCenterAlign;
        }

        public Data(boolean z, boolean z2, @NotNull String str, @NotNull String str2, boolean z3, String str3, String str4, @NotNull String str5, @NotNull ButtonAction buttonAction, @NotNull String str6, @NotNull String str7, String str8, ButtonAction buttonAction2, String str9, String str10, @NotNull String str11, String str12, String str13, String str14, String str15, @NotNull String str16, @NotNull String str17, String str18) {
            str.getClass();
            str2.getClass();
            str5.getClass();
            buttonAction.getClass();
            str6.getClass();
            eta.r(str7, str11, str16, str17);
            this.canBeOpened = z;
            this.isCenterAlign = z2;
            this.headerText = str;
            this.headerColor = str2;
            this.bigHeader = z3;
            this.subtitleText = str3;
            this.subtitleColor = str4;
            this.firstButtonText = str5;
            this.firstButtonAction = buttonAction;
            this.firstButtonColor = str6;
            this.firstButtonTextColor = str7;
            this.secondButtonText = str8;
            this.secondButtonAction = buttonAction2;
            this.secondButtonColor = str9;
            this.secondButtonTextColor = str10;
            this.closeButtonColor = str11;
            this.eridButtonColor = str12;
            this.advDisclaimer = str13;
            this.disclaimerText = str14;
            this.disclaimerColor = str15;
            this.imageUrl = str16;
            this.backgroundColor = str17;
            this.backgroundImageUrl = str18;
        }
    }

    public InternalCommunicationTrigger$DynamicOverlaySheet(@NotNull String str, @NotNull String str2, @NotNull InternalCommunicationTrigger$Meta internalCommunicationTrigger$Meta, @NotNull Data data) {
        str.getClass();
        str2.getClass();
        internalCommunicationTrigger$Meta.getClass();
        data.getClass();
        this.screenId = str;
        this.feedbackToken = str2;
        this.meta = internalCommunicationTrigger$Meta;
        this.data = data;
    }

    @Override // defpackage.mte
    /* renamed from: a, reason: from getter */
    public final InternalCommunicationTrigger$Meta getMeta() {
        return this.meta;
    }

    @Override // defpackage.mte
    /* renamed from: b, reason: from getter */
    public final String getScreenId() {
        return this.screenId;
    }

    /* renamed from: c, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    /* renamed from: d, reason: from getter */
    public final String getFeedbackToken() {
        return this.feedbackToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InternalCommunicationTrigger$DynamicOverlaySheet)) {
            return false;
        }
        InternalCommunicationTrigger$DynamicOverlaySheet internalCommunicationTrigger$DynamicOverlaySheet = (InternalCommunicationTrigger$DynamicOverlaySheet) obj;
        return Intrinsics.d(this.screenId, internalCommunicationTrigger$DynamicOverlaySheet.screenId) && Intrinsics.d(this.feedbackToken, internalCommunicationTrigger$DynamicOverlaySheet.feedbackToken) && Intrinsics.d(this.meta, internalCommunicationTrigger$DynamicOverlaySheet.meta) && Intrinsics.d(this.data, internalCommunicationTrigger$DynamicOverlaySheet.data);
    }

    public final int hashCode() {
        return this.data.hashCode() + ((this.meta.hashCode() + k5r.c(this.screenId.hashCode() * 31, 31, this.feedbackToken)) * 31);
    }

    public final String toString() {
        String str = this.screenId;
        String str2 = this.feedbackToken;
        InternalCommunicationTrigger$Meta internalCommunicationTrigger$Meta = this.meta;
        Data data = this.data;
        StringBuilder m = f1d.m("DynamicOverlaySheet(screenId=", str, ", feedbackToken=", str2, ", meta=");
        m.append(internalCommunicationTrigger$Meta);
        m.append(", data=");
        m.append(data);
        m.append(")");
        return m.toString();
    }
}
