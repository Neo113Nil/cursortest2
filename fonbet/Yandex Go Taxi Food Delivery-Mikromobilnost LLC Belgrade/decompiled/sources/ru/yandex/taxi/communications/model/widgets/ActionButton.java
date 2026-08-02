package ru.yandex.taxi.communications.model.widgets;

import com.adjust.sdk.Constants;
import defpackage.as;
import defpackage.b64;
import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.lq;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.xvz;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u001a\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionButton;", "", "Companion", "ru/yandex/taxi/communications/model/widgets/b", "ButtonActionType", "ru/yandex/taxi/communications/model/widgets/c", "l", "d", "a", "h", "e", "k", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "ru/yandex/taxi/communications/model/widgets/g", "g", "ButtonTextStyle", "c", "f", "ru/yandex/taxi/communications/model/widgets/x", "ru/yandex/taxi/communications/model/widgets/d", "ru/yandex/taxi/communications/model/widgets/e0", "ru/yandex/taxi/communications/model/widgets/n0", "ru/yandex/taxi/communications/model/widgets/l0", "ru/yandex/taxi/communications/model/widgets/q", CoreConstants.PushMessage.SERVICE_TYPE, "b", "ru/yandex/taxi/communications/model/widgets/m0", "ru/yandex/taxi/communications/model/widgets/a", "as", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ActionButton {
    public static final as Companion = new as();
    public static final i3y[] g = {null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lq(12))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final ru.yandex.taxi.communications.model.widgets.b e;
    public final ButtonTextStyle f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionButton$ButtonActionType;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "WEB_VIEW", "DEEPLINK", "APPLY_PROMOCODE", "ADD_PROMOCODE", "REQUEST_TOTW", "PICK_CONTACT_FOR_TOTW", "MODAL_VIEW", "LOOT_BOX", "DIRECT_OFFER", "DO_NOTHING", "ORDER", "SHARE_ROUTE", "SELECT_PAYMENT_METHOD", "CLOSE_MODAL_VIEW_AND_DECLINE_ROBO_ORDER", "CLOSE_MODAL_VIEW_AND_ACCEPT_ROBO_ORDER", "OFFER_SUBSTITUTION", "CANCEL_ORDERS", "UNKNOWN", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ButtonActionType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonActionType[] $VALUES;
        public static final ButtonActionType ADD_PROMOCODE;
        public static final ButtonActionType APPLY_PROMOCODE;
        public static final ButtonActionType CANCEL_ORDERS;
        public static final ButtonActionType CLOSE_MODAL_VIEW_AND_ACCEPT_ROBO_ORDER;
        public static final ButtonActionType CLOSE_MODAL_VIEW_AND_DECLINE_ROBO_ORDER;
        public static final ButtonActionType DEEPLINK;
        public static final ButtonActionType DIRECT_OFFER;
        public static final ButtonActionType DO_NOTHING;
        public static final ButtonActionType LOOT_BOX;
        public static final ButtonActionType MODAL_VIEW;
        public static final ButtonActionType OFFER_SUBSTITUTION;
        public static final ButtonActionType ORDER;
        public static final ButtonActionType PICK_CONTACT_FOR_TOTW;
        public static final ButtonActionType REQUEST_TOTW;
        public static final ButtonActionType SELECT_PAYMENT_METHOD;
        public static final ButtonActionType SHARE_ROUTE;
        public static final ButtonActionType UNKNOWN;
        public static final ButtonActionType WEB_VIEW;
        private final String analyticsName;

        static {
            ButtonActionType buttonActionType = new ButtonActionType("WEB_VIEW", 0, "web_view");
            WEB_VIEW = buttonActionType;
            ButtonActionType buttonActionType2 = new ButtonActionType("DEEPLINK", 1, Constants.DEEPLINK);
            DEEPLINK = buttonActionType2;
            ButtonActionType buttonActionType3 = new ButtonActionType("APPLY_PROMOCODE", 2, "apply_promocode");
            APPLY_PROMOCODE = buttonActionType3;
            ButtonActionType buttonActionType4 = new ButtonActionType("ADD_PROMOCODE", 3, "add_promocode");
            ADD_PROMOCODE = buttonActionType4;
            ButtonActionType buttonActionType5 = new ButtonActionType("REQUEST_TOTW", 4, "request_totw_with_key_and_value");
            REQUEST_TOTW = buttonActionType5;
            ButtonActionType buttonActionType6 = new ButtonActionType("PICK_CONTACT_FOR_TOTW", 5, "pick_contact_for_totw");
            PICK_CONTACT_FOR_TOTW = buttonActionType6;
            ButtonActionType buttonActionType7 = new ButtonActionType("MODAL_VIEW", 6, "modal_view");
            MODAL_VIEW = buttonActionType7;
            ButtonActionType buttonActionType8 = new ButtonActionType("LOOT_BOX", 7, "lootbox");
            LOOT_BOX = buttonActionType8;
            ButtonActionType buttonActionType9 = new ButtonActionType("DIRECT_OFFER", 8, "direct_offer");
            DIRECT_OFFER = buttonActionType9;
            ButtonActionType buttonActionType10 = new ButtonActionType("DO_NOTHING", 9, "do_nothing");
            DO_NOTHING = buttonActionType10;
            ButtonActionType buttonActionType11 = new ButtonActionType("ORDER", 10, "order");
            ORDER = buttonActionType11;
            ButtonActionType buttonActionType12 = new ButtonActionType("SHARE_ROUTE", 11, "share_route_button");
            SHARE_ROUTE = buttonActionType12;
            ButtonActionType buttonActionType13 = new ButtonActionType("SELECT_PAYMENT_METHOD", 12, "select_payment_method");
            SELECT_PAYMENT_METHOD = buttonActionType13;
            ButtonActionType buttonActionType14 = new ButtonActionType("CLOSE_MODAL_VIEW_AND_DECLINE_ROBO_ORDER", 13, "robotaxi_reject");
            CLOSE_MODAL_VIEW_AND_DECLINE_ROBO_ORDER = buttonActionType14;
            ButtonActionType buttonActionType15 = new ButtonActionType("CLOSE_MODAL_VIEW_AND_ACCEPT_ROBO_ORDER", 14, "robotaxi_approve");
            CLOSE_MODAL_VIEW_AND_ACCEPT_ROBO_ORDER = buttonActionType15;
            ButtonActionType buttonActionType16 = new ButtonActionType("OFFER_SUBSTITUTION", 15, "offer_substitution");
            OFFER_SUBSTITUTION = buttonActionType16;
            ButtonActionType buttonActionType17 = new ButtonActionType("CANCEL_ORDERS", 16, "cancel_orders");
            CANCEL_ORDERS = buttonActionType17;
            ButtonActionType buttonActionType18 = new ButtonActionType("UNKNOWN", 17, "");
            UNKNOWN = buttonActionType18;
            ButtonActionType[] buttonActionTypeArr = {buttonActionType, buttonActionType2, buttonActionType3, buttonActionType4, buttonActionType5, buttonActionType6, buttonActionType7, buttonActionType8, buttonActionType9, buttonActionType10, buttonActionType11, buttonActionType12, buttonActionType13, buttonActionType14, buttonActionType15, buttonActionType16, buttonActionType17, buttonActionType18};
            $VALUES = buttonActionTypeArr;
            $ENTRIES = kotlin.enums.a.a(buttonActionTypeArr);
        }

        public ButtonActionType(String str, int i, String str2) {
            this.analyticsName = str2;
        }

        public static ButtonActionType valueOf(String str) {
            return (ButtonActionType) Enum.valueOf(ButtonActionType.class, str);
        }

        public static ButtonActionType[] values() {
            return (ButtonActionType[]) $VALUES.clone();
        }

        /* renamed from: a, reason: from getter */
        public final String getAnalyticsName() {
            return this.analyticsName;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionButton$ButtonTextStyle;", "", "Companion", "ru/yandex/taxi/communications/model/widgets/h", "DEFAULT", "ACCENT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes12.dex */
    public static final class ButtonTextStyle {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonTextStyle[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ButtonTextStyle ACCENT;
        public static final ru.yandex.taxi.communications.model.widgets.h Companion;
        public static final ButtonTextStyle DEFAULT;

        static {
            ButtonTextStyle buttonTextStyle = new ButtonTextStyle("DEFAULT", 0);
            DEFAULT = buttonTextStyle;
            ButtonTextStyle buttonTextStyle2 = new ButtonTextStyle("ACCENT", 1);
            ACCENT = buttonTextStyle2;
            ButtonTextStyle[] buttonTextStyleArr = {buttonTextStyle, buttonTextStyle2};
            $VALUES = buttonTextStyleArr;
            $ENTRIES = kotlin.enums.a.a(buttonTextStyleArr);
            Companion = new ru.yandex.taxi.communications.model.widgets.h();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lq(16));
        }

        public static ButtonTextStyle valueOf(String str) {
            return (ButtonTextStyle) Enum.valueOf(ButtonTextStyle.class, str);
        }

        public static ButtonTextStyle[] values() {
            return (ButtonTextStyle[]) $VALUES.clone();
        }
    }

    public /* synthetic */ ActionButton(int i2, String str, String str2, String str3, String str4, ru.yandex.taxi.communications.model.widgets.b bVar, ButtonTextStyle buttonTextStyle) {
        if ((i2 & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = bVar;
        }
        if ((i2 & 32) == 0) {
            this.f = ButtonTextStyle.DEFAULT;
        } else {
            this.f = buttonTextStyle;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionButton)) {
            return false;
        }
        ActionButton actionButton = (ActionButton) obj;
        return jl40.l(this.a, actionButton.a) && jl40.l(this.b, actionButton.b) && jl40.l(this.c, actionButton.c) && jl40.l(this.d, actionButton.d) && jl40.l(this.e, actionButton.e) && this.f == actionButton.f;
    }

    public final int hashCode() {
        int b2 = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ru.yandex.taxi.communications.model.widgets.b bVar = this.e;
        return this.f.hashCode() + ((hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ActionButton(deeplink=", this.a, ", text=", this.b, ", color=");
        g8e.D(v, this.c, ", textColor=", this.d, ", action=");
        v.append(this.e);
        v.append(", style=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionButton$c;", "Lru/yandex/taxi/communications/model/widgets/b;", "Companion", "a", "ru/yandex/taxi/communications/model/widgets/m", "ru/yandex/taxi/communications/model/widgets/n", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes5.dex */
    public static final /* data */ class c extends ru.yandex.taxi.communications.model.widgets.b {
        public static final n Companion = new n();
        public final a a;

        public c(int i, a aVar) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = aVar;
            }
        }

        @Override // ru.yandex.taxi.communications.model.widgets.b
        public final ButtonActionType b() {
            return ButtonActionType.CLOSE_MODAL_VIEW_AND_ACCEPT_ROBO_ORDER;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && jl40.l(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            a aVar = this.a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public final String toString() {
            return "CloseModalViewAndAcceptRoboOrder(payload=" + this.a + Extension.C_BRAKE;
        }

        public c() {
            this.a = null;
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionButton$c$a;", "", "Companion", "ru/yandex/taxi/communications/model/widgets/o", "ru/yandex/taxi/communications/model/widgets/p", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class a {
            public static final p Companion = new p();
            public final String a;
            public final String b;

            public /* synthetic */ a(int i, String str, String str2) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = "";
                } else {
                    this.b = str2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return unr0.p("Payload(eulaId=", this.a, ", zoneName=", this.b, Extension.C_BRAKE);
            }

            public a() {
                this.a = "";
                this.b = "";
            }
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionButton$a;", "Lru/yandex/taxi/communications/model/widgets/b;", "Companion", "ru/yandex/taxi/communications/model/widgets/e", "ru/yandex/taxi/communications/model/widgets/f", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class a extends ru.yandex.taxi.communications.model.widgets.b {
        public static final ru.yandex.taxi.communications.model.widgets.f Companion = new ru.yandex.taxi.communications.model.widgets.f();
        public final String a;

        public a(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        @Override // ru.yandex.taxi.communications.model.widgets.b
        public final ButtonActionType b() {
            return ButtonActionType.APPLY_PROMOCODE;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && jl40.l(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("ApplyPromocodeAction(promocode=", this.a, Extension.C_BRAKE);
        }

        public a() {
            this.a = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionButton$d;", "Lru/yandex/taxi/communications/model/widgets/b;", "Companion", "ru/yandex/taxi/communications/model/widgets/r", "ru/yandex/taxi/communications/model/widgets/s", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class d extends ru.yandex.taxi.communications.model.widgets.b {
        public static final s Companion = new s();
        public final String a;

        public d(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        @Override // ru.yandex.taxi.communications.model.widgets.b
        public final ButtonActionType b() {
            return ButtonActionType.DEEPLINK;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && jl40.l(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("DeeplinkAction(deeplink=", this.a, Extension.C_BRAKE);
        }

        public d() {
            this.a = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionButton$i;", "Lru/yandex/taxi/communications/model/widgets/b;", "Companion", "ru/yandex/taxi/communications/model/widgets/c0", "ru/yandex/taxi/communications/model/widgets/d0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class i extends ru.yandex.taxi.communications.model.widgets.b {
        public static final d0 Companion = new d0();
        public final String a;

        public i(int i, String str) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
        }

        @Override // ru.yandex.taxi.communications.model.widgets.b
        public final ButtonActionType b() {
            return ButtonActionType.OFFER_SUBSTITUTION;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && jl40.l(this.a, ((i) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oyr.p("OfferSubstitution(offerId=", this.a, Extension.C_BRAKE);
        }

        public i() {
            this.a = "";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionButton$b;", "Lru/yandex/taxi/communications/model/widgets/b;", "Companion", "a", "ru/yandex/taxi/communications/model/widgets/i", "ru/yandex/taxi/communications/model/widgets/j", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    /* loaded from: classes5.dex */
    public static final /* data */ class b extends ru.yandex.taxi.communications.model.widgets.b {
        public static final ru.yandex.taxi.communications.model.widgets.j Companion = new ru.yandex.taxi.communications.model.widgets.j();
        public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lq(17)), null};
        public final List a;
        public final a b;

        public b(int i, List list, a aVar) {
            this.a = (i & 1) == 0 ? EmptyList.a : list;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = aVar;
            }
        }

        @Override // ru.yandex.taxi.communications.model.widgets.b
        public final ButtonActionType b() {
            return ButtonActionType.CANCEL_ORDERS;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            a aVar = this.b;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public final String toString() {
            return "CancelOrders(orderIdsForCancel=" + this.a + ", doneNotification=" + this.b + Extension.C_BRAKE;
        }

        public b() {
            this.a = EmptyList.a;
            this.b = null;
        }

        @gsq0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionButton$b$a;", "", "Companion", "ru/yandex/taxi/communications/model/widgets/k", "ru/yandex/taxi/communications/model/widgets/l", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class a {
            public static final ru.yandex.taxi.communications.model.widgets.l Companion = new ru.yandex.taxi.communications.model.widgets.l();
            public final String a;
            public final String b;

            public /* synthetic */ a(int i, String str, String str2) {
                if ((i & 1) == 0) {
                    this.a = "";
                } else {
                    this.a = str;
                }
                if ((i & 2) == 0) {
                    this.b = "";
                } else {
                    this.b = str2;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return jl40.l(this.a, aVar.a) && jl40.l(this.b, aVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return unr0.p("DoneNotification(title=", this.a, ", iconTag=", this.b, Extension.C_BRAKE);
            }

            public a() {
                this.a = "";
                this.b = "";
            }
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionButton$k;", "Lru/yandex/taxi/communications/model/widgets/b;", "Companion", "ru/yandex/taxi/communications/model/widgets/h0", "ru/yandex/taxi/communications/model/widgets/i0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class k extends ru.yandex.taxi.communications.model.widgets.b {
        public static final i0 Companion = new i0();
        public final String a;
        public final Object b;

        public k(String str, int i, Object obj) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = obj;
            }
        }

        @Override // ru.yandex.taxi.communications.model.widgets.b
        public final ButtonActionType b() {
            return ButtonActionType.REQUEST_TOTW;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return jl40.l(this.a, kVar.a) && jl40.l(this.b, kVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Object obj = this.b;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            return "RequestTotw(key=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
        }

        public k() {
            this.a = "";
            this.b = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionButton$l;", "Lru/yandex/taxi/communications/model/widgets/b;", "Companion", "ru/yandex/taxi/communications/model/widgets/j0", "ru/yandex/taxi/communications/model/widgets/k0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class l extends ru.yandex.taxi.communications.model.widgets.b {
        public static final k0 Companion = new k0();
        public final String a;
        public final String b;

        public l(int i, String str, String str2) {
            this.a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str2;
            }
        }

        @Override // ru.yandex.taxi.communications.model.widgets.b
        public final ButtonActionType b() {
            return ButtonActionType.SELECT_PAYMENT_METHOD;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return jl40.l(this.a, lVar.a) && jl40.l(this.b, lVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return unr0.p("SelectPaymentMethodAction(paymentMethodCode=", this.a, ", id=", this.b, Extension.C_BRAKE);
        }

        public l() {
            this.a = "";
            this.b = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionButton$f;", "Lru/yandex/taxi/communications/model/widgets/b;", "Lru/yandex/taxi/communications/model/widgets/g;", "Companion", "ru/yandex/taxi/communications/model/widgets/v", "ru/yandex/taxi/communications/model/widgets/w", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class f extends ru.yandex.taxi.communications.model.widgets.b implements ru.yandex.taxi.communications.model.widgets.g {
        public static final w Companion = new w();
        public final String a;
        public final String b;

        public f(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        @Override // ru.yandex.taxi.communications.model.widgets.g
        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // ru.yandex.taxi.communications.model.widgets.b
        public final ButtonActionType b() {
            return ButtonActionType.DIRECT_OFFER;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!f.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            f fVar = (f) obj;
            return jl40.l(this.a, fVar.a) && jl40.l(this.b, fVar.b);
        }

        @Override // ru.yandex.taxi.communications.model.widgets.g
        /* renamed from: getId, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public f() {
            this.a = "";
            this.b = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionButton$j;", "Lru/yandex/taxi/communications/model/widgets/b;", "Companion", "ru/yandex/taxi/communications/model/widgets/f0", "ru/yandex/taxi/communications/model/widgets/g0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class j extends ru.yandex.taxi.communications.model.widgets.b {
        public static final g0 Companion = new g0();
        public final String a;
        public final String b;

        public j(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
        }

        @Override // ru.yandex.taxi.communications.model.widgets.b
        public final ButtonActionType b() {
            return ButtonActionType.PICK_CONTACT_FOR_TOTW;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return jl40.l(this.a, jVar.a) && jl40.l(this.b, jVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return unr0.p("PickContactForTotw(title=", this.a, ", buttonTitle=", this.b, Extension.C_BRAKE);
        }

        public j() {
            this.a = "";
            this.b = "";
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionButton$e;", "", "Companion", "ru/yandex/taxi/communications/model/widgets/u", "ru/yandex/taxi/communications/model/widgets/t", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class e {
        public static final u Companion = new u();
        public static final e d = new e(null, 7);
        public final String a;
        public final String b;
        public final String c;

        public /* synthetic */ e(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str3;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return jl40.l(this.a, eVar.a) && jl40.l(this.b, eVar.b) && jl40.l(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return oyr.t(b64.v("DialogButton(text=", this.a, ", backgroundColor=", this.b, ", textColor="), this.c, Extension.C_BRAKE);
        }

        public e() {
            this(null, 7);
        }

        public e(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public /* synthetic */ e(String str, int i) {
            this((i & 1) != 0 ? "" : str, "", "");
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionButton$g;", "Lru/yandex/taxi/communications/model/widgets/b;", "Lru/yandex/taxi/communications/model/widgets/g;", "Companion", "ru/yandex/taxi/communications/model/widgets/y", "ru/yandex/taxi/communications/model/widgets/z", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class g extends ru.yandex.taxi.communications.model.widgets.b implements ru.yandex.taxi.communications.model.widgets.g {
        public static final z Companion = new z();
        public final String a;
        public final String b;
        public final String c;

        public g(int i, String str, String str2, String str3) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = "";
            } else {
                this.b = str2;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
        }

        @Override // ru.yandex.taxi.communications.model.widgets.g
        /* renamed from: a, reason: from getter */
        public final String getB() {
            return this.b;
        }

        @Override // ru.yandex.taxi.communications.model.widgets.b
        public final ButtonActionType b() {
            return ButtonActionType.LOOT_BOX;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!g.class.equals(obj != null ? obj.getClass() : null)) {
                return false;
            }
            g gVar = (g) obj;
            return jl40.l(this.a, gVar.a) && jl40.l(this.b, gVar.b) && jl40.l(this.c, gVar.c);
        }

        @Override // ru.yandex.taxi.communications.model.widgets.g
        /* renamed from: getId, reason: from getter */
        public final String getA() {
            return this.a;
        }

        public final int hashCode() {
            int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return b + (str != null ? str.hashCode() : 0);
        }

        public g() {
            this.a = "";
            this.b = "";
            this.c = null;
        }
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/communications/model/widgets/ActionButton$h;", "Lru/yandex/taxi/communications/model/widgets/b;", "Companion", "ru/yandex/taxi/communications/model/widgets/a0", "ru/yandex/taxi/communications/model/widgets/b0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class h extends ru.yandex.taxi.communications.model.widgets.b {
        public static final b0 Companion = new b0();
        public final String a;
        public final FormattedText b;
        public final String c;
        public final e d;

        public h(int i, String str, FormattedText formattedText, String str2, e eVar) {
            if ((i & 1) == 0) {
                this.a = "";
            } else {
                this.a = str;
            }
            if ((i & 2) == 0) {
                this.b = FormattedText.c;
            } else {
                this.b = formattedText;
            }
            if ((i & 4) == 0) {
                this.c = "";
            } else {
                this.c = str2;
            }
            if ((i & 8) != 0) {
                this.d = eVar;
            } else {
                e.Companion.getClass();
                this.d = e.d;
            }
        }

        @Override // ru.yandex.taxi.communications.model.widgets.b
        public final ButtonActionType b() {
            return ButtonActionType.MODAL_VIEW;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return jl40.l(this.a, hVar.a) && jl40.l(this.b, hVar.b) && jl40.l(this.c, hVar.c) && jl40.l(this.d, hVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + unr0.b(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c);
        }

        public final String toString() {
            StringBuilder q = xvz.q("ModalViewAction(title=", this.a, ", text=", ", iconTag=", this.b);
            q.append(this.c);
            q.append(", button=");
            q.append(this.d);
            q.append(Extension.C_BRAKE);
            return q.toString();
        }

        public h() {
            this(null, null, null, 15);
        }

        public h(String str, FormattedText formattedText, e eVar, int i) {
            str = (i & 1) != 0 ? "" : str;
            formattedText = (i & 2) != 0 ? FormattedText.c : formattedText;
            if ((i & 8) != 0) {
                e.Companion.getClass();
                eVar = e.d;
            }
            this.a = str;
            this.b = formattedText;
            this.c = "";
            this.d = eVar;
        }
    }

    public ActionButton() {
        ButtonTextStyle buttonTextStyle = ButtonTextStyle.DEFAULT;
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = buttonTextStyle;
    }
}
