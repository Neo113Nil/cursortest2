package com.yandex.music.shared.bdu.trigger.cache.dto;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.metrica.push.common.CoreConstants;
import defpackage.ej5;
import defpackage.f1d;
import defpackage.hrg;
import defpackage.su4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"com/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$DynamicOverlaySheet", "Lej5;", "", "screenId", "feedbackToken", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Meta;", "meta", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$DynamicOverlaySheet$Data;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Meta;Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$DynamicOverlaySheet$Data;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Meta;", "c", "()Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Meta;", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$DynamicOverlaySheet$Data;", "a", "()Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$DynamicOverlaySheet$Data;", "Data", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class CommunicationTriggerDto$DynamicOverlaySheet implements ej5 {

    @SerializedName("div")
    private final Data data;

    @SerializedName("feedbackToken")
    private final String feedbackToken;

    @SerializedName("meta")
    private final CommunicationTriggerDto$Meta meta;

    @SerializedName("screenId")
    private final String screenId;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001:\u0001;Bí\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b!\u0010 R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b%\u0010$R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b&\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b'\u0010$R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b(\u0010$R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b)\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b-\u0010$R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b.\u0010$R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b/\u0010$R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010*\u001a\u0004\b0\u0010,R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b1\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b2\u0010$R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\"\u001a\u0004\b3\u0010$R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b4\u0010$R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b5\u0010$R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\"\u001a\u0004\b6\u0010$R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b7\u0010$R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\"\u001a\u0004\b8\u0010$R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b9\u0010$R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b:\u0010$¨\u0006<"}, d2 = {"Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$DynamicOverlaySheet$Data;", "", "", "canBeOpened", "isCenterAlign", "", "headerText", "headerColor", "bigHeader", "subtitleText", "subtitleColor", "firstButtonText", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$DynamicOverlaySheet$Data$ButtonAction;", "firstButtonAction", "firstButtonColor", "firstButtonTextColor", "secondButtonText", "secondButtonAction", "secondButtonColor", "secondButtonTextColor", "closeButtonColor", "eridButtonColor", "advDisclaimer", "disclaimerText", "disclaimerColor", "imageUrl", "backgroundColor", "backgroundImageUrl", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$DynamicOverlaySheet$Data$ButtonAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$DynamicOverlaySheet$Data$ButtonAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "w", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "n", "d", "v", "u", "l", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$DynamicOverlaySheet$Data$ButtonAction;", "j", "()Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$DynamicOverlaySheet$Data$ButtonAction;", "k", "m", "s", "q", "r", "t", "f", CoreConstants.PushMessage.SERVICE_TYPE, "a", "h", "g", "p", "b", "c", "ButtonAction", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class Data {

        @SerializedName("adv_disclaimer")
        private final String advDisclaimer;

        @SerializedName("background_color")
        private final String backgroundColor;

        @SerializedName("background_image_url")
        private final String backgroundImageUrl;

        @SerializedName("big_header")
        private final Boolean bigHeader;

        @SerializedName("can_be_opened")
        private final Boolean canBeOpened;

        @SerializedName("close_button_color")
        private final String closeButtonColor;

        @SerializedName("disclaimer_color")
        private final String disclaimerColor;

        @SerializedName("disclaimer_text")
        private final String disclaimerText;

        @SerializedName("erid_button_color")
        private final String eridButtonColor;

        @SerializedName("first_button_action")
        private final ButtonAction firstButtonAction;

        @SerializedName("first_button_color")
        private final String firstButtonColor;

        @SerializedName("first_button_text")
        private final String firstButtonText;

        @SerializedName("first_button_text_color")
        private final String firstButtonTextColor;

        @SerializedName("header_color")
        private final String headerColor;

        @SerializedName("header_text")
        private final String headerText;

        @SerializedName("image_url")
        private final String imageUrl;

        @SerializedName("is_center_align")
        private final Boolean isCenterAlign;

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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$DynamicOverlaySheet$Data$ButtonAction;", "", "", "uri", ConnectableDevice.KEY_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        public static final /* data */ class ButtonAction {

            @SerializedName(ConnectableDevice.KEY_ID)
            private final String id;

            @SerializedName("uri")
            private final String uri;

            public ButtonAction(String str, String str2) {
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
                String str = this.uri;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.id;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return hrg.s("ButtonAction(uri=", this.uri, ", id=", this.id, ")");
            }
        }

        public Data(Boolean bool, Boolean bool2, String str, String str2, Boolean bool3, String str3, String str4, String str5, ButtonAction buttonAction, String str6, String str7, String str8, ButtonAction buttonAction2, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
            this.canBeOpened = bool;
            this.isCenterAlign = bool2;
            this.headerText = str;
            this.headerColor = str2;
            this.bigHeader = bool3;
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
        public final Boolean getBigHeader() {
            return this.bigHeader;
        }

        /* renamed from: e, reason: from getter */
        public final Boolean getCanBeOpened() {
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
            return Intrinsics.d(this.canBeOpened, data.canBeOpened) && Intrinsics.d(this.isCenterAlign, data.isCenterAlign) && Intrinsics.d(this.headerText, data.headerText) && Intrinsics.d(this.headerColor, data.headerColor) && Intrinsics.d(this.bigHeader, data.bigHeader) && Intrinsics.d(this.subtitleText, data.subtitleText) && Intrinsics.d(this.subtitleColor, data.subtitleColor) && Intrinsics.d(this.firstButtonText, data.firstButtonText) && Intrinsics.d(this.firstButtonAction, data.firstButtonAction) && Intrinsics.d(this.firstButtonColor, data.firstButtonColor) && Intrinsics.d(this.firstButtonTextColor, data.firstButtonTextColor) && Intrinsics.d(this.secondButtonText, data.secondButtonText) && Intrinsics.d(this.secondButtonAction, data.secondButtonAction) && Intrinsics.d(this.secondButtonColor, data.secondButtonColor) && Intrinsics.d(this.secondButtonTextColor, data.secondButtonTextColor) && Intrinsics.d(this.closeButtonColor, data.closeButtonColor) && Intrinsics.d(this.eridButtonColor, data.eridButtonColor) && Intrinsics.d(this.advDisclaimer, data.advDisclaimer) && Intrinsics.d(this.disclaimerText, data.disclaimerText) && Intrinsics.d(this.disclaimerColor, data.disclaimerColor) && Intrinsics.d(this.imageUrl, data.imageUrl) && Intrinsics.d(this.backgroundColor, data.backgroundColor) && Intrinsics.d(this.backgroundImageUrl, data.backgroundImageUrl);
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
            Boolean bool = this.canBeOpened;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.isCenterAlign;
            int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str = this.headerText;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.headerColor;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool3 = this.bigHeader;
            int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
            String str3 = this.subtitleText;
            int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.subtitleColor;
            int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.firstButtonText;
            int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
            ButtonAction buttonAction = this.firstButtonAction;
            int hashCode9 = (hashCode8 + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
            String str6 = this.firstButtonColor;
            int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.firstButtonTextColor;
            int hashCode11 = (hashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.secondButtonText;
            int hashCode12 = (hashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
            ButtonAction buttonAction2 = this.secondButtonAction;
            int hashCode13 = (hashCode12 + (buttonAction2 == null ? 0 : buttonAction2.hashCode())) * 31;
            String str9 = this.secondButtonColor;
            int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.secondButtonTextColor;
            int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.closeButtonColor;
            int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.eridButtonColor;
            int hashCode17 = (hashCode16 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.advDisclaimer;
            int hashCode18 = (hashCode17 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.disclaimerText;
            int hashCode19 = (hashCode18 + (str14 == null ? 0 : str14.hashCode())) * 31;
            String str15 = this.disclaimerColor;
            int hashCode20 = (hashCode19 + (str15 == null ? 0 : str15.hashCode())) * 31;
            String str16 = this.imageUrl;
            int hashCode21 = (hashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
            String str17 = this.backgroundColor;
            int hashCode22 = (hashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
            String str18 = this.backgroundImageUrl;
            return hashCode22 + (str18 != null ? str18.hashCode() : 0);
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
            Boolean bool = this.canBeOpened;
            Boolean bool2 = this.isCenterAlign;
            String str = this.headerText;
            String str2 = this.headerColor;
            Boolean bool3 = this.bigHeader;
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
            StringBuilder sb = new StringBuilder("Data(canBeOpened=");
            sb.append(bool);
            sb.append(", isCenterAlign=");
            sb.append(bool2);
            sb.append(", headerText=");
            su4.v(sb, str, ", headerColor=", str2, ", bigHeader=");
            sb.append(bool3);
            sb.append(", subtitleText=");
            sb.append(str3);
            sb.append(", subtitleColor=");
            su4.v(sb, str4, ", firstButtonText=", str5, ", firstButtonAction=");
            sb.append(buttonAction);
            sb.append(", firstButtonColor=");
            sb.append(str6);
            sb.append(", firstButtonTextColor=");
            su4.v(sb, str7, ", secondButtonText=", str8, ", secondButtonAction=");
            sb.append(buttonAction2);
            sb.append(", secondButtonColor=");
            sb.append(str9);
            sb.append(", secondButtonTextColor=");
            su4.v(sb, str10, ", closeButtonColor=", str11, ", eridButtonColor=");
            su4.v(sb, str12, ", advDisclaimer=", str13, ", disclaimerText=");
            su4.v(sb, str14, ", disclaimerColor=", str15, ", imageUrl=");
            su4.v(sb, str16, ", backgroundColor=", str17, ", backgroundImageUrl=");
            return su4.o(sb, str18, ")");
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
        public final Boolean getIsCenterAlign() {
            return this.isCenterAlign;
        }
    }

    public CommunicationTriggerDto$DynamicOverlaySheet(String str, String str2, CommunicationTriggerDto$Meta communicationTriggerDto$Meta, Data data) {
        this.screenId = str;
        this.feedbackToken = str2;
        this.meta = communicationTriggerDto$Meta;
        this.data = data;
    }

    /* renamed from: a, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    /* renamed from: b, reason: from getter */
    public final String getFeedbackToken() {
        return this.feedbackToken;
    }

    /* renamed from: c, reason: from getter */
    public final CommunicationTriggerDto$Meta getMeta() {
        return this.meta;
    }

    /* renamed from: d, reason: from getter */
    public final String getScreenId() {
        return this.screenId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunicationTriggerDto$DynamicOverlaySheet)) {
            return false;
        }
        CommunicationTriggerDto$DynamicOverlaySheet communicationTriggerDto$DynamicOverlaySheet = (CommunicationTriggerDto$DynamicOverlaySheet) obj;
        return Intrinsics.d(this.screenId, communicationTriggerDto$DynamicOverlaySheet.screenId) && Intrinsics.d(this.feedbackToken, communicationTriggerDto$DynamicOverlaySheet.feedbackToken) && Intrinsics.d(this.meta, communicationTriggerDto$DynamicOverlaySheet.meta) && Intrinsics.d(this.data, communicationTriggerDto$DynamicOverlaySheet.data);
    }

    public final int hashCode() {
        String str = this.screenId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.feedbackToken;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CommunicationTriggerDto$Meta communicationTriggerDto$Meta = this.meta;
        int hashCode3 = (hashCode2 + (communicationTriggerDto$Meta == null ? 0 : communicationTriggerDto$Meta.hashCode())) * 31;
        Data data = this.data;
        return hashCode3 + (data != null ? data.hashCode() : 0);
    }

    public final String toString() {
        String str = this.screenId;
        String str2 = this.feedbackToken;
        CommunicationTriggerDto$Meta communicationTriggerDto$Meta = this.meta;
        Data data = this.data;
        StringBuilder m = f1d.m("DynamicOverlaySheet(screenId=", str, ", feedbackToken=", str2, ", meta=");
        m.append(communicationTriggerDto$Meta);
        m.append(", data=");
        m.append(data);
        m.append(")");
        return m.toString();
    }
}
