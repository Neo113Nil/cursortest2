package com.yandex.music.shared.bdu.trigger.cache.dto;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.ej5;
import defpackage.f1d;
import defpackage.hrg;
import defpackage.ouj;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"com/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner", "Lej5;", "", "screenId", "feedbackToken", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Meta;", "meta", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Meta;Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Meta;", "c", "()Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Meta;", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data;", "a", "()Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data;", "Data", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class CommunicationTriggerDto$Banner implements ej5 {

    @SerializedName("data")
    private final Data data;

    @SerializedName("feedbackToken")
    private final String feedbackToken;

    @SerializedName("meta")
    private final CommunicationTriggerDto$Meta meta;

    @SerializedName("screenId")
    private final String screenId;

    public CommunicationTriggerDto$Banner(String str, String str2, CommunicationTriggerDto$Meta communicationTriggerDto$Meta, Data data) {
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
        if (!(obj instanceof CommunicationTriggerDto$Banner)) {
            return false;
        }
        CommunicationTriggerDto$Banner communicationTriggerDto$Banner = (CommunicationTriggerDto$Banner) obj;
        return Intrinsics.d(this.screenId, communicationTriggerDto$Banner.screenId) && Intrinsics.d(this.feedbackToken, communicationTriggerDto$Banner.feedbackToken) && Intrinsics.d(this.meta, communicationTriggerDto$Banner.meta) && Intrinsics.d(this.data, communicationTriggerDto$Banner.data);
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
        StringBuilder m = f1d.m("Banner(screenId=", str, ", feedbackToken=", str2, ", meta=");
        m.append(communicationTriggerDto$Meta);
        m.append(", data=");
        m.append(data);
        m.append(")");
        return m.toString();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u001e\u001f BU\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data;", "", "", "title", "subtitle", "imageUrl", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data$Theme;", "lightTheme", "darkTheme", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data$Action;", Constants.KEY_ACTION, "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data$Adv;", "adv", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data$Theme;Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data$Theme;Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data$Action;Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data$Adv;)V", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "f", "d", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data$Theme;", "e", "()Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data$Theme;", "c", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data$Action;", "a", "()Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data$Action;", "Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data$Adv;", "b", "()Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data$Adv;", "Theme", "Action", "Adv", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class Data {

        @SerializedName(Constants.KEY_ACTION)
        private final Action action;

        @SerializedName("adv")
        private final Adv adv;

        @SerializedName("darkTheme")
        private final Theme darkTheme;

        @SerializedName("imageUrl")
        private final String imageUrl;

        @SerializedName("lightTheme")
        private final Theme lightTheme;

        @SerializedName("subtitle")
        private final String subtitle;

        @SerializedName("title")
        private final String title;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data$Action;", "", "", "uri", ConnectableDevice.KEY_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        public static final /* data */ class Action {

            @SerializedName(ConnectableDevice.KEY_ID)
            private final String id;

            @SerializedName("uri")
            private final String uri;

            public Action(String str, String str2) {
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
                if (!(obj instanceof Action)) {
                    return false;
                }
                Action action = (Action) obj;
                return Intrinsics.d(this.uri, action.uri) && Intrinsics.d(this.id, action.id);
            }

            public final int hashCode() {
                String str = this.uri;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.id;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return hrg.s("Action(uri=", this.uri, ", id=", this.id, ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data$Adv;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        public static final /* data */ class Adv {

            @SerializedName("text")
            private final String text;

            public Adv(String str) {
                this.text = str;
            }

            /* renamed from: a, reason: from getter */
            public final String getText() {
                return this.text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Adv) && Intrinsics.d(this.text, ((Adv) obj).text);
            }

            public final int hashCode() {
                String str = this.text;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return hrg.q("Adv(text=", this.text, ")");
            }
        }

        public /* synthetic */ Data(String str, String str2, String str3, Theme theme, Theme theme2, Action action, Adv adv, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : theme, (i & 16) != 0 ? null : theme2, (i & 32) != 0 ? null : action, (i & 64) != 0 ? null : adv);
        }

        /* renamed from: a, reason: from getter */
        public final Action getAction() {
            return this.action;
        }

        /* renamed from: b, reason: from getter */
        public final Adv getAdv() {
            return this.adv;
        }

        /* renamed from: c, reason: from getter */
        public final Theme getDarkTheme() {
            return this.darkTheme;
        }

        /* renamed from: d, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* renamed from: e, reason: from getter */
        public final Theme getLightTheme() {
            return this.lightTheme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return Intrinsics.d(this.title, data.title) && Intrinsics.d(this.subtitle, data.subtitle) && Intrinsics.d(this.imageUrl, data.imageUrl) && Intrinsics.d(this.lightTheme, data.lightTheme) && Intrinsics.d(this.darkTheme, data.darkTheme) && Intrinsics.d(this.action, data.action) && Intrinsics.d(this.adv, data.adv);
        }

        /* renamed from: f, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: g, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.imageUrl;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Theme theme = this.lightTheme;
            int hashCode4 = (hashCode3 + (theme == null ? 0 : theme.hashCode())) * 31;
            Theme theme2 = this.darkTheme;
            int hashCode5 = (hashCode4 + (theme2 == null ? 0 : theme2.hashCode())) * 31;
            Action action = this.action;
            int hashCode6 = (hashCode5 + (action == null ? 0 : action.hashCode())) * 31;
            Adv adv = this.adv;
            return hashCode6 + (adv != null ? adv.hashCode() : 0);
        }

        public final String toString() {
            String str = this.title;
            String str2 = this.subtitle;
            String str3 = this.imageUrl;
            Theme theme = this.lightTheme;
            Theme theme2 = this.darkTheme;
            Action action = this.action;
            Adv adv = this.adv;
            StringBuilder m = f1d.m("Data(title=", str, ", subtitle=", str2, ", imageUrl=");
            m.append(str3);
            m.append(", lightTheme=");
            m.append(theme);
            m.append(", darkTheme=");
            m.append(theme2);
            m.append(", action=");
            m.append(action);
            m.append(", adv=");
            m.append(adv);
            m.append(")");
            return m.toString();
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/yandex/music/shared/bdu/trigger/cache/dto/CommunicationTriggerDto$Banner$Data$Theme;", "", "", "titleColor", "subtitleColor", "bgColor", "bgUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "a", "b", "shared-bdu-trigger"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        public static final /* data */ class Theme {

            @SerializedName("bgColor")
            private final String bgColor;

            @SerializedName("bgUrl")
            private final String bgUrl;

            @SerializedName("subtitleColor")
            private final String subtitleColor;

            @SerializedName("titleColor")
            private final String titleColor;

            public /* synthetic */ Theme(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
            }

            /* renamed from: a, reason: from getter */
            public final String getBgColor() {
                return this.bgColor;
            }

            /* renamed from: b, reason: from getter */
            public final String getBgUrl() {
                return this.bgUrl;
            }

            /* renamed from: c, reason: from getter */
            public final String getSubtitleColor() {
                return this.subtitleColor;
            }

            /* renamed from: d, reason: from getter */
            public final String getTitleColor() {
                return this.titleColor;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Theme)) {
                    return false;
                }
                Theme theme = (Theme) obj;
                return Intrinsics.d(this.titleColor, theme.titleColor) && Intrinsics.d(this.subtitleColor, theme.subtitleColor) && Intrinsics.d(this.bgColor, theme.bgColor) && Intrinsics.d(this.bgUrl, theme.bgUrl);
            }

            public final int hashCode() {
                String str = this.titleColor;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.subtitleColor;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.bgColor;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.bgUrl;
                return hashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            public final String toString() {
                String str = this.titleColor;
                String str2 = this.subtitleColor;
                return ouj.q(f1d.m("Theme(titleColor=", str, ", subtitleColor=", str2, ", bgColor="), this.bgColor, ", bgUrl=", this.bgUrl, ")");
            }

            public Theme(String str, String str2, String str3, String str4) {
                this.titleColor = str;
                this.subtitleColor = str2;
                this.bgColor = str3;
                this.bgUrl = str4;
            }

            public Theme() {
                this(null, null, null, null, 15, null);
            }
        }

        public Data(String str, String str2, String str3, Theme theme, Theme theme2, Action action, Adv adv) {
            this.title = str;
            this.subtitle = str2;
            this.imageUrl = str3;
            this.lightTheme = theme;
            this.darkTheme = theme2;
            this.action = action;
            this.adv = adv;
        }
    }
}
