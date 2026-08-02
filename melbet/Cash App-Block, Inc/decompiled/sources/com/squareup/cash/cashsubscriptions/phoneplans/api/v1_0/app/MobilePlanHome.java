package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import android.os.Parcelable;
import androidx.compose.ui.text.input.InputState_androidKt;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.vision.text.zza;
import com.google.mlkit.vision.text.zzb;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.protos.cash.aegis.core.Member;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
import com.squareup.protos.franklin.api.SupportConfig;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class MobilePlanHome extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MobilePlanHome> CREATOR;
    public final Header header;
    public final InfoCards info_cards;
    public final List links;

    public final class Action extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Action> CREATOR;
        public final String destination;
        public final CtaStyle style;
        public final String text;

        static {
            MobilePlanHome$Action$Companion$ADAPTER$1 mobilePlanHome$Action$Companion$ADAPTER$1 = new MobilePlanHome$Action$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Action.class), "type.googleapis.com/squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome.Action", Syntax.PROTO_2, null, "squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetMobilePlanHome.proto");
            ADAPTER = mobilePlanHome$Action$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(mobilePlanHome$Action$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Action(String str, String str2, CtaStyle ctaStyle, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
            this.destination = str2;
            this.style = ctaStyle;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return Intrinsics.areEqual(unknownFields(), action.unknownFields()) && Intrinsics.areEqual(this.text, action.text) && Intrinsics.areEqual(this.destination, action.destination) && this.style == action.style;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.destination;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            CtaStyle ctaStyle = this.style;
            int hashCode4 = hashCode3 + (ctaStyle != null ? ctaStyle.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(10);
            builder.customer_token = this.text;
            builder.withdrawalType = this.destination;
            builder.customer_supplied_amount = this.style;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
            }
            String str2 = this.destination;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "destination=", arrayList);
            }
            CtaStyle ctaStyle = this.style;
            if (ctaStyle != null) {
                arrayList.add("style=" + ctaStyle);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56);
        }
    }

    public final class ActiveHeader extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ActiveHeader> CREATOR;
        public final String cta_destination;
        public final CtaStyle cta_style;
        public final String cta_text;
        public final Action secondary_action;
        public final String title;

        static {
            MobilePlanHome$ActiveHeader$Companion$ADAPTER$1 mobilePlanHome$ActiveHeader$Companion$ADAPTER$1 = new MobilePlanHome$ActiveHeader$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActiveHeader.class), "type.googleapis.com/squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome.ActiveHeader", Syntax.PROTO_2, null, "squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetMobilePlanHome.proto");
            ADAPTER = mobilePlanHome$ActiveHeader$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(mobilePlanHome$ActiveHeader$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActiveHeader(String str, String str2, CtaStyle ctaStyle, String str3, Action action, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.cta_text = str2;
            this.cta_style = ctaStyle;
            this.cta_destination = str3;
            this.secondary_action = action;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActiveHeader)) {
                return false;
            }
            ActiveHeader activeHeader = (ActiveHeader) obj;
            return Intrinsics.areEqual(unknownFields(), activeHeader.unknownFields()) && Intrinsics.areEqual(this.title, activeHeader.title) && Intrinsics.areEqual(this.cta_text, activeHeader.cta_text) && this.cta_style == activeHeader.cta_style && Intrinsics.areEqual(this.cta_destination, activeHeader.cta_destination) && Intrinsics.areEqual(this.secondary_action, activeHeader.secondary_action);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.cta_text;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            CtaStyle ctaStyle = this.cta_style;
            int hashCode4 = (hashCode3 + (ctaStyle != null ? ctaStyle.hashCode() : 0)) * 37;
            String str3 = this.cta_destination;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            Action action = this.secondary_action;
            int hashCode6 = hashCode5 + (action != null ? action.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Node.Builder builder = new Node.Builder(2);
            builder.for_each = this.title;
            builder.moneybot_scaffold = this.cta_text;
            builder.compose_platform = this.cta_style;
            builder.is_included = this.cta_destination;
            builder.motion = this.secondary_action;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.cta_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "cta_text=", arrayList);
            }
            CtaStyle ctaStyle = this.cta_style;
            if (ctaStyle != null) {
                arrayList.add("cta_style=" + ctaStyle);
            }
            String str3 = this.cta_destination;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "cta_destination=", arrayList);
            }
            Action action = this.secondary_action;
            if (action != null) {
                arrayList.add("secondary_action=" + action);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ActiveHeader{", "}", 0, null, null, 56);
        }
    }

    public enum CtaStyle implements WireEnum {
        UNKNOWN(0),
        LINK(1),
        BUTTON(2);

        public static final MobilePlanHome$CtaStyle$Companion$ADAPTER$1 ADAPTER;
        public static final zza Companion;
        public final int value;

        static {
            CtaStyle ctaStyle = UNKNOWN;
            Companion = new zza(20);
            ADAPTER = new MobilePlanHome$CtaStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CtaStyle.class), Syntax.PROTO_2, ctaStyle);
        }

        CtaStyle(int i) {
            this.value = i;
        }

        public static final CtaStyle fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return LINK;
            }
            if (i != 2) {
                return null;
            }
            return BUTTON;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class Header extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Header> CREATOR;
        public final InputState_androidKt style;

        static {
            MobilePlanHome$Header$Companion$ADAPTER$1 mobilePlanHome$Header$Companion$ADAPTER$1 = new MobilePlanHome$Header$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Header.class), "type.googleapis.com/squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome.Header", Syntax.PROTO_2, null, "squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetMobilePlanHome.proto");
            ADAPTER = mobilePlanHome$Header$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(mobilePlanHome$Header$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Header(InputState_androidKt inputState_androidKt, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.style = inputState_androidKt;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.areEqual(unknownFields(), header.unknownFields()) && Intrinsics.areEqual(this.style, header.style);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            InputState_androidKt inputState_androidKt = this.style;
            int hashCode2 = hashCode + (inputState_androidKt != null ? inputState_androidKt.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SubsectionBlock.Builder builder = new SubsectionBlock.Builder(5);
            builder.f1245type = this.style;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            InputState_androidKt inputState_androidKt = this.style;
            if (inputState_androidKt != null) {
                arrayList.add("style=" + inputState_androidKt);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Header{", "}", 0, null, null, 56);
        }
    }

    public final class InactiveHeader extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InactiveHeader> CREATOR;
        public final UiAvatar avatar;
        public final String body;
        public final String cta_destination;
        public final String cta_text;
        public final String title;

        static {
            MobilePlanHome$InactiveHeader$Companion$ADAPTER$1 mobilePlanHome$InactiveHeader$Companion$ADAPTER$1 = new MobilePlanHome$InactiveHeader$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InactiveHeader.class), "type.googleapis.com/squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome.InactiveHeader", Syntax.PROTO_2, null, "squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetMobilePlanHome.proto");
            ADAPTER = mobilePlanHome$InactiveHeader$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(mobilePlanHome$InactiveHeader$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InactiveHeader(UiAvatar uiAvatar, String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.avatar = uiAvatar;
            this.title = str;
            this.body = str2;
            this.cta_text = str3;
            this.cta_destination = str4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InactiveHeader)) {
                return false;
            }
            InactiveHeader inactiveHeader = (InactiveHeader) obj;
            return Intrinsics.areEqual(unknownFields(), inactiveHeader.unknownFields()) && Intrinsics.areEqual(this.avatar, inactiveHeader.avatar) && Intrinsics.areEqual(this.title, inactiveHeader.title) && Intrinsics.areEqual(this.body, inactiveHeader.body) && Intrinsics.areEqual(this.cta_text, inactiveHeader.cta_text) && Intrinsics.areEqual(this.cta_destination, inactiveHeader.cta_destination);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            UiAvatar uiAvatar = this.avatar;
            int hashCode2 = (hashCode + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
            String str = this.title;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.body;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.cta_text;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.cta_destination;
            int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Node.Builder builder = new Node.Builder(3);
            builder.for_each = this.avatar;
            builder.moneybot_scaffold = this.title;
            builder.compose_platform = this.body;
            builder.is_included = this.cta_text;
            builder.motion = this.cta_destination;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            UiAvatar uiAvatar = this.avatar;
            if (uiAvatar != null) {
                Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
            }
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.body;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
            }
            String str3 = this.cta_text;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "cta_text=", arrayList);
            }
            String str4 = this.cta_destination;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "cta_destination=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InactiveHeader{", "}", 0, null, null, 56);
        }
    }

    public final class InfoCard extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InfoCard> CREATOR;
        public final String destination;
        public final TextFieldValueKt detail;
        public final String label;
        public final ProgressBarColor progress_bar_color;
        public final String value;

        public enum ProgressBarColor implements WireEnum {
            PROGRESS_BAR_COLOR_UNSPECIFIED(0),
            PROGRESS_BAR_COLOR_GREEN(1),
            PROGRESS_BAR_COLOR_ORANGE(2);

            public static final MobilePlanHome$InfoCard$ProgressBarColor$Companion$ADAPTER$1 ADAPTER;
            public static final zzb Companion;
            public final int value;

            static {
                ProgressBarColor progressBarColor = PROGRESS_BAR_COLOR_UNSPECIFIED;
                Companion = new zzb(20);
                ADAPTER = new MobilePlanHome$InfoCard$ProgressBarColor$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ProgressBarColor.class), Syntax.PROTO_2, progressBarColor);
            }

            ProgressBarColor(int i) {
                this.value = i;
            }

            public static final ProgressBarColor fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return PROGRESS_BAR_COLOR_UNSPECIFIED;
                }
                if (i == 1) {
                    return PROGRESS_BAR_COLOR_GREEN;
                }
                if (i != 2) {
                    return null;
                }
                return PROGRESS_BAR_COLOR_ORANGE;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            MobilePlanHome$InfoCard$Companion$ADAPTER$1 mobilePlanHome$InfoCard$Companion$ADAPTER$1 = new MobilePlanHome$InfoCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InfoCard.class), "type.googleapis.com/squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome.InfoCard", Syntax.PROTO_2, null, "squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetMobilePlanHome.proto");
            ADAPTER = mobilePlanHome$InfoCard$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(mobilePlanHome$InfoCard$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InfoCard(String str, String str2, TextFieldValueKt textFieldValueKt, ProgressBarColor progressBarColor, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.value = str2;
            this.detail = textFieldValueKt;
            this.progress_bar_color = progressBarColor;
            this.destination = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InfoCard)) {
                return false;
            }
            InfoCard infoCard = (InfoCard) obj;
            return Intrinsics.areEqual(unknownFields(), infoCard.unknownFields()) && Intrinsics.areEqual(this.label, infoCard.label) && Intrinsics.areEqual(this.value, infoCard.value) && Intrinsics.areEqual(this.detail, infoCard.detail) && this.progress_bar_color == infoCard.progress_bar_color && Intrinsics.areEqual(this.destination, infoCard.destination);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.value;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            TextFieldValueKt textFieldValueKt = this.detail;
            int hashCode4 = (hashCode3 + (textFieldValueKt != null ? textFieldValueKt.hashCode() : 0)) * 37;
            ProgressBarColor progressBarColor = this.progress_bar_color;
            int hashCode5 = (hashCode4 + (progressBarColor != null ? progressBarColor.hashCode() : 0)) * 37;
            String str3 = this.destination;
            int hashCode6 = hashCode5 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Node.Builder builder = new Node.Builder(4);
            builder.for_each = this.label;
            builder.moneybot_scaffold = this.value;
            builder.compose_platform = this.detail;
            builder.is_included = this.progress_bar_color;
            builder.motion = this.destination;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            String str2 = this.value;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "value=", arrayList);
            }
            TextFieldValueKt textFieldValueKt = this.detail;
            if (textFieldValueKt != null) {
                arrayList.add("detail=" + textFieldValueKt);
            }
            ProgressBarColor progressBarColor = this.progress_bar_color;
            if (progressBarColor != null) {
                arrayList.add("progress_bar_color=" + progressBarColor);
            }
            String str3 = this.destination;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "destination=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InfoCard{", "}", 0, null, null, 56);
        }
    }

    public final class InfoCards extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<InfoCards> CREATOR;
        public final InfoCard first;
        public final InfoCard second;

        static {
            MobilePlanHome$InfoCards$Companion$ADAPTER$1 mobilePlanHome$InfoCards$Companion$ADAPTER$1 = new MobilePlanHome$InfoCards$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InfoCards.class), "type.googleapis.com/squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome.InfoCards", Syntax.PROTO_2, null, "squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetMobilePlanHome.proto");
            ADAPTER = mobilePlanHome$InfoCards$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(mobilePlanHome$InfoCards$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InfoCards(InfoCard infoCard, InfoCard infoCard2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.first = infoCard;
            this.second = infoCard2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InfoCards)) {
                return false;
            }
            InfoCards infoCards = (InfoCards) obj;
            return Intrinsics.areEqual(unknownFields(), infoCards.unknownFields()) && Intrinsics.areEqual(this.first, infoCards.first) && Intrinsics.areEqual(this.second, infoCards.second);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            InfoCard infoCard = this.first;
            int hashCode2 = (hashCode + (infoCard != null ? infoCard.hashCode() : 0)) * 37;
            InfoCard infoCard2 = this.second;
            int hashCode3 = hashCode2 + (infoCard2 != null ? infoCard2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Member.Builder builder = new Member.Builder(9);
            builder.customer_token = this.first;
            builder.sponsorship_tier = this.second;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            InfoCard infoCard = this.first;
            if (infoCard != null) {
                arrayList.add("first=" + infoCard);
            }
            InfoCard infoCard2 = this.second;
            if (infoCard2 != null) {
                arrayList.add("second=" + infoCard2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InfoCards{", "}", 0, null, null, 56);
        }
    }

    public final class Link extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Link> CREATOR;
        public final String destination;
        public final String icon_id;
        public final String label;

        static {
            MobilePlanHome$Link$Companion$ADAPTER$1 mobilePlanHome$Link$Companion$ADAPTER$1 = new MobilePlanHome$Link$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Link.class), "type.googleapis.com/squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome.Link", Syntax.PROTO_2, null, "squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetMobilePlanHome.proto");
            ADAPTER = mobilePlanHome$Link$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(mobilePlanHome$Link$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Link(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.icon_id = str;
            this.label = str2;
            this.destination = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Link)) {
                return false;
            }
            Link link = (Link) obj;
            return Intrinsics.areEqual(unknownFields(), link.unknownFields()) && Intrinsics.areEqual(this.icon_id, link.icon_id) && Intrinsics.areEqual(this.label, link.label) && Intrinsics.areEqual(this.destination, link.destination);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.icon_id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.label;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.destination;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SupportConfig.Builder builder = new SupportConfig.Builder(3);
            builder.contact_support_url = this.icon_id;
            builder.privacy_policy_url = this.label;
            builder.terms_of_service_url = this.destination;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.icon_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "icon_id=", arrayList);
            }
            String str2 = this.label;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "label=", arrayList);
            }
            String str3 = this.destination;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "destination=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Link{", "}", 0, null, null, 56);
        }
    }

    static {
        MobilePlanHome$Companion$ADAPTER$1 mobilePlanHome$Companion$ADAPTER$1 = new MobilePlanHome$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MobilePlanHome.class), "type.googleapis.com/squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome", Syntax.PROTO_2, null, "squareup/cash/cashsubscriptions/phoneplans/api/v1_0/app/GetMobilePlanHome.proto");
        ADAPTER = mobilePlanHome$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(mobilePlanHome$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilePlanHome(Header header, InfoCards infoCards, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.header = header;
        this.info_cards = infoCards;
        this.links = TransactorKt.immutableCopyOf("links", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MobilePlanHome)) {
            return false;
        }
        MobilePlanHome mobilePlanHome = (MobilePlanHome) obj;
        return Intrinsics.areEqual(unknownFields(), mobilePlanHome.unknownFields()) && Intrinsics.areEqual(this.header, mobilePlanHome.header) && Intrinsics.areEqual(this.info_cards, mobilePlanHome.info_cards) && Intrinsics.areEqual(this.links, mobilePlanHome.links);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Header header = this.header;
        int hashCode2 = (hashCode + (header != null ? header.hashCode() : 0)) * 37;
        InfoCards infoCards = this.info_cards;
        int hashCode3 = this.links.hashCode() + ((hashCode2 + (infoCards != null ? infoCards.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(11);
        builder.withdrawalType = this.header;
        builder.customer_supplied_amount = this.info_cards;
        builder.customer_token = this.links;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Header header = this.header;
        if (header != null) {
            arrayList.add("header=" + header);
        }
        InfoCards infoCards = this.info_cards;
        if (infoCards != null) {
            arrayList.add("info_cards=" + infoCards);
        }
        List list = this.links;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("links=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MobilePlanHome{", "}", 0, null, null, 56);
    }
}
