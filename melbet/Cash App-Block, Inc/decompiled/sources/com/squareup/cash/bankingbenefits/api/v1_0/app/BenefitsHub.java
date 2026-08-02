package com.squareup.cash.bankingbenefits.api.v1_0.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ButtonRow;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TextRow;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TintedIcon;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TintedLink;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import com.squareup.protos.cash.aegis.core.Member;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.protos.cash.appthemes.Gradient;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.protos.cash.investcustomer.api.v1.CustomerControls;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.franklin.app.SyncContactsRequest;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

/* loaded from: classes5.dex */
public final class BenefitsHub extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BenefitsHub> CREATOR;
    public final List sections;
    public final TextRow status;
    public final String title;

    public final class Benefits extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Benefits> CREATOR;
        public final List details;
        public final Boolean unavailable_benefits_rollup_disabled;
        public final String unavailable_benefits_rollup_title;

        static {
            BenefitsHub$Benefits$Companion$ADAPTER$1 benefitsHub$Benefits$Companion$ADAPTER$1 = new BenefitsHub$Benefits$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Benefits.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub.Benefits", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHub.proto");
            ADAPTER = benefitsHub$Benefits$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsHub$Benefits$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Benefits(Boolean bool, String str, List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.unavailable_benefits_rollup_title = str;
            this.unavailable_benefits_rollup_disabled = bool;
            this.details = TransactorKt.immutableCopyOf("details", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Benefits)) {
                return false;
            }
            Benefits benefits = (Benefits) obj;
            return Intrinsics.areEqual(unknownFields(), benefits.unknownFields()) && Intrinsics.areEqual(this.details, benefits.details) && Intrinsics.areEqual(this.unavailable_benefits_rollup_title, benefits.unavailable_benefits_rollup_title) && Intrinsics.areEqual(this.unavailable_benefits_rollup_disabled, benefits.unavailable_benefits_rollup_disabled);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.details);
            String str = this.unavailable_benefits_rollup_title;
            int hashCode = (m + (str != null ? str.hashCode() : 0)) * 37;
            Boolean bool = this.unavailable_benefits_rollup_disabled;
            int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            CustomerControls.Builder builder = new CustomerControls.Builder(1);
            builder.trading_limits = this.details;
            builder.customer_token = this.unavailable_benefits_rollup_title;
            builder.trading_enabled = this.unavailable_benefits_rollup_disabled;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.details;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("details=", arrayList, list);
            }
            String str = this.unavailable_benefits_rollup_title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "unavailable_benefits_rollup_title=", arrayList);
            }
            Boolean bool = this.unavailable_benefits_rollup_disabled;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("unavailable_benefits_rollup_disabled=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Benefits{", "}", 0, null, null, 56);
        }
    }

    public final class BenefitsBreakdown extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BenefitsBreakdown> CREATOR;
        public final List benefits;
        public final LearnMore learn_more;

        public final class LearnMore extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<LearnMore> CREATOR;
            public final BenefitsExplanationScreen benefits_explanation_screen;
            public final TintedLink link;

            /* loaded from: classes7.dex */
            public final class BenefitsExplanationScreen extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<BenefitsExplanationScreen> CREATOR;
                public final List footers;
                public final List sections;
                public final String title;

                /* loaded from: classes5.dex */
                public final class Section extends AndroidMessage {
                    public static final ProtoAdapter ADAPTER;
                    public static final Parcelable.Creator<Section> CREATOR;
                    public final List list_items;
                    public final String paragraph;

                    static {
                        BenefitsHub$BenefitsBreakdown$LearnMore$BenefitsExplanationScreen$Section$Companion$ADAPTER$1 benefitsHub$BenefitsBreakdown$LearnMore$BenefitsExplanationScreen$Section$Companion$ADAPTER$1 = new BenefitsHub$BenefitsBreakdown$LearnMore$BenefitsExplanationScreen$Section$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Section.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen.Section", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHub.proto");
                        ADAPTER = benefitsHub$BenefitsBreakdown$LearnMore$BenefitsExplanationScreen$Section$Companion$ADAPTER$1;
                        AndroidMessage.Companion.getClass();
                        CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsHub$BenefitsBreakdown$LearnMore$BenefitsExplanationScreen$Section$Companion$ADAPTER$1);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Section(String str, List list, ByteString byteString) {
                        super(ADAPTER, byteString);
                        list.getClass();
                        byteString.getClass();
                        this.paragraph = str;
                        this.list_items = TransactorKt.immutableCopyOf("list_items", list);
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof Section)) {
                            return false;
                        }
                        Section section = (Section) obj;
                        return Intrinsics.areEqual(unknownFields(), section.unknownFields()) && Intrinsics.areEqual(this.paragraph, section.paragraph) && Intrinsics.areEqual(this.list_items, section.list_items);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = unknownFields().hashCode() * 37;
                        String str = this.paragraph;
                        int hashCode2 = this.list_items.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
                        this.hashCode = hashCode2;
                        return hashCode2;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        ToggleScreen.Builder builder = new ToggleScreen.Builder(1, false);
                        builder.toggle_title = this.paragraph;
                        builder.sections = this.list_items;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        String str = this.paragraph;
                        if (str != null) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "paragraph=", arrayList);
                        }
                        List list = this.list_items;
                        if (!list.isEmpty()) {
                            BalanceFeedKt$$ExternalSyntheticOutline0.m("list_items=", arrayList, list);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "Section{", "}", 0, null, null, 56);
                    }
                }

                static {
                    BenefitsHub$BenefitsBreakdown$LearnMore$BenefitsExplanationScreen$Companion$ADAPTER$1 benefitsHub$BenefitsBreakdown$LearnMore$BenefitsExplanationScreen$Companion$ADAPTER$1 = new BenefitsHub$BenefitsBreakdown$LearnMore$BenefitsExplanationScreen$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BenefitsExplanationScreen.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub.BenefitsBreakdown.LearnMore.BenefitsExplanationScreen", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHub.proto");
                    ADAPTER = benefitsHub$BenefitsBreakdown$LearnMore$BenefitsExplanationScreen$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsHub$BenefitsBreakdown$LearnMore$BenefitsExplanationScreen$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BenefitsExplanationScreen(String str, List list, List list2, ByteString byteString) {
                    super(ADAPTER, byteString);
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
                    this.title = str;
                    this.sections = TransactorKt.immutableCopyOf("sections", list);
                    this.footers = TransactorKt.immutableCopyOf("footers", list2);
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof BenefitsExplanationScreen)) {
                        return false;
                    }
                    BenefitsExplanationScreen benefitsExplanationScreen = (BenefitsExplanationScreen) obj;
                    return Intrinsics.areEqual(unknownFields(), benefitsExplanationScreen.unknownFields()) && Intrinsics.areEqual(this.title, benefitsExplanationScreen.title) && Intrinsics.areEqual(this.sections, benefitsExplanationScreen.sections) && Intrinsics.areEqual(this.footers, benefitsExplanationScreen.footers);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    String str = this.title;
                    int hashCode2 = this.footers.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.sections);
                    this.hashCode = hashCode2;
                    return hashCode2;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    SyncContactsRequest.Builder builder = new SyncContactsRequest.Builder(1, false);
                    builder.sync_token = this.title;
                    builder.add_hashed_aliases = this.sections;
                    builder.remove_hashed_aliases = this.footers;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    String str = this.title;
                    if (str != null) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
                    }
                    List list = this.sections;
                    if (!list.isEmpty()) {
                        re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
                    }
                    List list2 = this.footers;
                    if (!list2.isEmpty()) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("footers=", arrayList, list2);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "BenefitsExplanationScreen{", "}", 0, null, null, 56);
                }
            }

            static {
                BenefitsHub$BenefitsBreakdown$LearnMore$Companion$ADAPTER$1 benefitsHub$BenefitsBreakdown$LearnMore$Companion$ADAPTER$1 = new BenefitsHub$BenefitsBreakdown$LearnMore$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LearnMore.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub.BenefitsBreakdown.LearnMore", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHub.proto");
                ADAPTER = benefitsHub$BenefitsBreakdown$LearnMore$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsHub$BenefitsBreakdown$LearnMore$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LearnMore(TintedLink tintedLink, BenefitsExplanationScreen benefitsExplanationScreen, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.link = tintedLink;
                this.benefits_explanation_screen = benefitsExplanationScreen;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof LearnMore)) {
                    return false;
                }
                LearnMore learnMore = (LearnMore) obj;
                return Intrinsics.areEqual(unknownFields(), learnMore.unknownFields()) && Intrinsics.areEqual(this.link, learnMore.link) && Intrinsics.areEqual(this.benefits_explanation_screen, learnMore.benefits_explanation_screen);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                TintedLink tintedLink = this.link;
                int hashCode2 = (hashCode + (tintedLink != null ? tintedLink.hashCode() : 0)) * 37;
                BenefitsExplanationScreen benefitsExplanationScreen = this.benefits_explanation_screen;
                int hashCode3 = hashCode2 + (benefitsExplanationScreen != null ? benefitsExplanationScreen.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Member.Builder builder = new Member.Builder(2);
                builder.customer_token = this.link;
                builder.sponsorship_tier = this.benefits_explanation_screen;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                TintedLink tintedLink = this.link;
                if (tintedLink != null) {
                    arrayList.add("link=" + tintedLink);
                }
                BenefitsExplanationScreen benefitsExplanationScreen = this.benefits_explanation_screen;
                if (benefitsExplanationScreen != null) {
                    arrayList.add("benefits_explanation_screen=" + benefitsExplanationScreen);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "LearnMore{", "}", 0, null, null, 56);
            }
        }

        static {
            BenefitsHub$BenefitsBreakdown$Companion$ADAPTER$1 benefitsHub$BenefitsBreakdown$Companion$ADAPTER$1 = new BenefitsHub$BenefitsBreakdown$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BenefitsBreakdown.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub.BenefitsBreakdown", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHub.proto");
            ADAPTER = benefitsHub$BenefitsBreakdown$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsHub$BenefitsBreakdown$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BenefitsBreakdown(List list, LearnMore learnMore, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.learn_more = learnMore;
            this.benefits = TransactorKt.immutableCopyOf("benefits", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BenefitsBreakdown)) {
                return false;
            }
            BenefitsBreakdown benefitsBreakdown = (BenefitsBreakdown) obj;
            return Intrinsics.areEqual(unknownFields(), benefitsBreakdown.unknownFields()) && Intrinsics.areEqual(this.benefits, benefitsBreakdown.benefits) && Intrinsics.areEqual(this.learn_more, benefitsBreakdown.learn_more);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.benefits);
            LearnMore learnMore = this.learn_more;
            int hashCode = m + (learnMore != null ? learnMore.hashCode() : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Member.Builder builder = new Member.Builder(1);
            builder.customer_token = this.benefits;
            builder.sponsorship_tier = this.learn_more;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.benefits;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("benefits=", arrayList, list);
            }
            LearnMore learnMore = this.learn_more;
            if (learnMore != null) {
                arrayList.add("learn_more=" + learnMore);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BenefitsBreakdown{", "}", 0, null, null, 56);
        }
    }

    public final class CallToActions extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CallToActions> CREATOR;
        public final ButtonRow details;

        static {
            BenefitsHub$CallToActions$Companion$ADAPTER$1 benefitsHub$CallToActions$Companion$ADAPTER$1 = new BenefitsHub$CallToActions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CallToActions.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub.CallToActions", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHub.proto");
            ADAPTER = benefitsHub$CallToActions$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsHub$CallToActions$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CallToActions(ButtonRow buttonRow, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.details = buttonRow;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CallToActions)) {
                return false;
            }
            CallToActions callToActions = (CallToActions) obj;
            return Intrinsics.areEqual(unknownFields(), callToActions.unknownFields()) && Intrinsics.areEqual(this.details, callToActions.details);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            ButtonRow buttonRow = this.details;
            int hashCode2 = hashCode + (buttonRow != null ? buttonRow.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SubsectionBlock.Builder builder = new SubsectionBlock.Builder(1);
            builder.f1245type = this.details;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            ButtonRow buttonRow = this.details;
            if (buttonRow != null) {
                arrayList.add("details=" + buttonRow);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CallToActions{", "}", 0, null, null, 56);
        }
    }

    public final class CommonQuestions extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<CommonQuestions> CREATOR;
        public final List details;

        public final class QuestionAndAnswer extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<QuestionAndAnswer> CREATOR;
            public final String answer;
            public final String question;

            static {
                BenefitsHub$CommonQuestions$QuestionAndAnswer$Companion$ADAPTER$1 benefitsHub$CommonQuestions$QuestionAndAnswer$Companion$ADAPTER$1 = new BenefitsHub$CommonQuestions$QuestionAndAnswer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(QuestionAndAnswer.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub.CommonQuestions.QuestionAndAnswer", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHub.proto");
                ADAPTER = benefitsHub$CommonQuestions$QuestionAndAnswer$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsHub$CommonQuestions$QuestionAndAnswer$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QuestionAndAnswer(String str, String str2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.question = str;
                this.answer = str2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof QuestionAndAnswer)) {
                    return false;
                }
                QuestionAndAnswer questionAndAnswer = (QuestionAndAnswer) obj;
                return Intrinsics.areEqual(unknownFields(), questionAndAnswer.unknownFields()) && Intrinsics.areEqual(this.question, questionAndAnswer.question) && Intrinsics.areEqual(this.answer, questionAndAnswer.answer);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.question;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.answer;
                int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Cashtag.Builder builder = new Cashtag.Builder(1);
                builder.prefix = this.question;
                builder.name = this.answer;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.question;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "question=", arrayList);
                }
                String str2 = this.answer;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "answer=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "QuestionAndAnswer{", "}", 0, null, null, 56);
            }
        }

        static {
            BenefitsHub$CommonQuestions$Companion$ADAPTER$1 benefitsHub$CommonQuestions$Companion$ADAPTER$1 = new BenefitsHub$CommonQuestions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CommonQuestions.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub.CommonQuestions", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHub.proto");
            ADAPTER = benefitsHub$CommonQuestions$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsHub$CommonQuestions$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CommonQuestions(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.details = TransactorKt.immutableCopyOf("details", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CommonQuestions)) {
                return false;
            }
            CommonQuestions commonQuestions = (CommonQuestions) obj;
            return Intrinsics.areEqual(unknownFields(), commonQuestions.unknownFields()) && Intrinsics.areEqual(this.details, commonQuestions.details);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.details.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Gradient.Builder builder = new Gradient.Builder(1, false);
            builder.colors = this.details;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.details;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("details=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CommonQuestions{", "}", 0, null, null, 56);
        }
    }

    public final class DefaultPerks extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DefaultPerks> CREATOR;
        public final List details;

        static {
            BenefitsHub$DefaultPerks$Companion$ADAPTER$1 benefitsHub$DefaultPerks$Companion$ADAPTER$1 = new BenefitsHub$DefaultPerks$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DefaultPerks.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub.DefaultPerks", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHub.proto");
            ADAPTER = benefitsHub$DefaultPerks$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsHub$DefaultPerks$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DefaultPerks(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.details = TransactorKt.immutableCopyOf("details", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DefaultPerks)) {
                return false;
            }
            DefaultPerks defaultPerks = (DefaultPerks) obj;
            return Intrinsics.areEqual(unknownFields(), defaultPerks.unknownFields()) && Intrinsics.areEqual(this.details, defaultPerks.details);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.details.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Gradient.Builder builder = new Gradient.Builder(2, false);
            builder.colors = this.details;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.details;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("details=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DefaultPerks{", "}", 0, null, null, 56);
        }
    }

    public final class Disclosures extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Disclosures> CREATOR;
        public final List details;

        public final class Disclosure extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Disclosure> CREATOR;
            public final TintedIcon icon;
            public final String text;

            static {
                BenefitsHub$Disclosures$Disclosure$Companion$ADAPTER$1 benefitsHub$Disclosures$Disclosure$Companion$ADAPTER$1 = new BenefitsHub$Disclosures$Disclosure$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Disclosure.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub.Disclosures.Disclosure", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHub.proto");
                ADAPTER = benefitsHub$Disclosures$Disclosure$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsHub$Disclosures$Disclosure$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Disclosure(TintedIcon tintedIcon, String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.icon = tintedIcon;
                this.text = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Disclosure)) {
                    return false;
                }
                Disclosure disclosure = (Disclosure) obj;
                return Intrinsics.areEqual(unknownFields(), disclosure.unknownFields()) && Intrinsics.areEqual(this.icon, disclosure.icon) && Intrinsics.areEqual(this.text, disclosure.text);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                TintedIcon tintedIcon = this.icon;
                int hashCode2 = (hashCode + (tintedIcon != null ? tintedIcon.hashCode() : 0)) * 37;
                String str = this.text;
                int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Member.Builder builder = new Member.Builder(3);
                builder.sponsorship_tier = this.icon;
                builder.customer_token = this.text;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                TintedIcon tintedIcon = this.icon;
                if (tintedIcon != null) {
                    arrayList.add("icon=" + tintedIcon);
                }
                String str = this.text;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Disclosure{", "}", 0, null, null, 56);
            }
        }

        static {
            BenefitsHub$Disclosures$Companion$ADAPTER$1 benefitsHub$Disclosures$Companion$ADAPTER$1 = new BenefitsHub$Disclosures$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Disclosures.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub.Disclosures", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHub.proto");
            ADAPTER = benefitsHub$Disclosures$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsHub$Disclosures$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Disclosures(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.details = TransactorKt.immutableCopyOf("details", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Disclosures)) {
                return false;
            }
            Disclosures disclosures = (Disclosures) obj;
            return Intrinsics.areEqual(unknownFields(), disclosures.unknownFields()) && Intrinsics.areEqual(this.details, disclosures.details);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.details.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Gradient.Builder builder = new Gradient.Builder(3, false);
            builder.colors = this.details;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.details;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("details=", arrayList, list);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Disclosures{", "}", 0, null, null, 56);
        }
    }

    public final class Insights extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Insights> CREATOR;
        public final List details;
        public final List insights;

        /* loaded from: classes7.dex */
        public final class Insight extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Insight> CREATOR;
            public final String heading;
            public final Prominence prominence;
            public final String subheading;
            public final Color tint_color;
            public final Tooltip tooltip;

            public final class Tooltip extends AndroidMessage {
                public static final ProtoAdapter ADAPTER;
                public static final Parcelable.Creator<Tooltip> CREATOR;
                public final UiAvatar avatar;
                public final List footnote;
                public final List paragraphs;
                public final String title;

                static {
                    BenefitsHub$Insights$Insight$Tooltip$Companion$ADAPTER$1 benefitsHub$Insights$Insight$Tooltip$Companion$ADAPTER$1 = new BenefitsHub$Insights$Insight$Tooltip$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Tooltip.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub.Insights.Insight.Tooltip", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHub.proto");
                    ADAPTER = benefitsHub$Insights$Insight$Tooltip$Companion$ADAPTER$1;
                    AndroidMessage.Companion.getClass();
                    CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsHub$Insights$Insight$Tooltip$Companion$ADAPTER$1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Tooltip(UiAvatar uiAvatar, String str, List list, List list2, ByteString byteString) {
                    super(ADAPTER, byteString);
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
                    this.avatar = uiAvatar;
                    this.title = str;
                    this.paragraphs = TransactorKt.immutableCopyOf("paragraphs", list);
                    this.footnote = TransactorKt.immutableCopyOf("footnote", list2);
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Tooltip)) {
                        return false;
                    }
                    Tooltip tooltip = (Tooltip) obj;
                    return Intrinsics.areEqual(unknownFields(), tooltip.unknownFields()) && Intrinsics.areEqual(this.avatar, tooltip.avatar) && Intrinsics.areEqual(this.title, tooltip.title) && Intrinsics.areEqual(this.paragraphs, tooltip.paragraphs) && Intrinsics.areEqual(this.footnote, tooltip.footnote);
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
                    int hashCode3 = this.footnote.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.paragraphs);
                    this.hashCode = hashCode3;
                    return hashCode3;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    ForEach.Builder builder = new ForEach.Builder(1);
                    builder.collection = this.avatar;
                    builder.item_variable = this.title;
                    builder.template = this.paragraphs;
                    builder.source = this.footnote;
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
                    List list = this.paragraphs;
                    if (!list.isEmpty()) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("paragraphs=", arrayList, list);
                    }
                    List list2 = this.footnote;
                    if (!list2.isEmpty()) {
                        BalanceFeedKt$$ExternalSyntheticOutline0.m("footnote=", arrayList, list2);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Tooltip{", "}", 0, null, null, 56);
                }
            }

            static {
                BenefitsHub$Insights$Insight$Companion$ADAPTER$1 benefitsHub$Insights$Insight$Companion$ADAPTER$1 = new BenefitsHub$Insights$Insight$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Insight.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub.Insights.Insight", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHub.proto");
                ADAPTER = benefitsHub$Insights$Insight$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsHub$Insights$Insight$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Insight(String str, String str2, Color color, Prominence prominence, Tooltip tooltip, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.heading = str;
                this.subheading = str2;
                this.tint_color = color;
                this.prominence = prominence;
                this.tooltip = tooltip;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Insight)) {
                    return false;
                }
                Insight insight = (Insight) obj;
                return Intrinsics.areEqual(unknownFields(), insight.unknownFields()) && Intrinsics.areEqual(this.heading, insight.heading) && Intrinsics.areEqual(this.subheading, insight.subheading) && Intrinsics.areEqual(this.tint_color, insight.tint_color) && this.prominence == insight.prominence && Intrinsics.areEqual(this.tooltip, insight.tooltip);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.heading;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.subheading;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                Color color = this.tint_color;
                int hashCode4 = (hashCode3 + (color != null ? color.hashCode() : 0)) * 37;
                Prominence prominence = this.prominence;
                int hashCode5 = (hashCode4 + (prominence != null ? prominence.hashCode() : 0)) * 37;
                Tooltip tooltip = this.tooltip;
                int hashCode6 = hashCode5 + (tooltip != null ? tooltip.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Node.Builder builder = new Node.Builder(1);
                builder.for_each = this.heading;
                builder.moneybot_scaffold = this.subheading;
                builder.compose_platform = this.tint_color;
                builder.is_included = this.prominence;
                builder.motion = this.tooltip;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.heading;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "heading=", arrayList);
                }
                String str2 = this.subheading;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subheading=", arrayList);
                }
                Color color = this.tint_color;
                if (color != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("tint_color=", color, arrayList);
                }
                Prominence prominence = this.prominence;
                if (prominence != null) {
                    arrayList.add("prominence=" + prominence);
                }
                Tooltip tooltip = this.tooltip;
                if (tooltip != null) {
                    arrayList.add("tooltip=" + tooltip);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Insight{", "}", 0, null, null, 56);
            }
        }

        static {
            BenefitsHub$Insights$Companion$ADAPTER$1 benefitsHub$Insights$Companion$ADAPTER$1 = new BenefitsHub$Insights$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Insights.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub.Insights", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHub.proto");
            ADAPTER = benefitsHub$Insights$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsHub$Insights$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Insights(List list, List list2, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
            this.details = TransactorKt.immutableCopyOf("details", list);
            this.insights = TransactorKt.immutableCopyOf("insights", list2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Insights)) {
                return false;
            }
            Insights insights = (Insights) obj;
            return Intrinsics.areEqual(unknownFields(), insights.unknownFields()) && Intrinsics.areEqual(this.details, insights.details) && Intrinsics.areEqual(this.insights, insights.insights);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.insights.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.details);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            GreenBenefitsV1.Builder builder = new GreenBenefitsV1.Builder(1, false);
            builder.card_holder_benefits = this.details;
            builder.green_status_benefits = this.insights;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.details;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("details=", arrayList, list);
            }
            List list2 = this.insights;
            if (!list2.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("insights=", arrayList, list2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Insights{", "}", 0, null, null, 56);
        }
    }

    public final class Section extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Section> CREATOR;
        public final ImageResourcesKt Body;
        public final String heading;

        static {
            BenefitsHub$Section$Companion$ADAPTER$1 benefitsHub$Section$Companion$ADAPTER$1 = new BenefitsHub$Section$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Section.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub.Section", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHub.proto");
            ADAPTER = benefitsHub$Section$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsHub$Section$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Section(String str, ImageResourcesKt imageResourcesKt, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.heading = str;
            this.Body = imageResourcesKt;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.areEqual(unknownFields(), section.unknownFields()) && Intrinsics.areEqual(this.heading, section.heading) && Intrinsics.areEqual(this.Body, section.Body);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.heading;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            ImageResourcesKt imageResourcesKt = this.Body;
            int hashCode3 = hashCode2 + (imageResourcesKt != null ? imageResourcesKt.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Member.Builder builder = new Member.Builder(4);
            builder.customer_token = this.heading;
            builder.sponsorship_tier = this.Body;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.heading;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "heading=", arrayList);
            }
            ImageResourcesKt imageResourcesKt = this.Body;
            if (imageResourcesKt != null) {
                arrayList.add("Body=" + imageResourcesKt);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Section{", "}", 0, null, null, 56);
        }
    }

    static {
        BenefitsHub$Companion$ADAPTER$1 benefitsHub$Companion$ADAPTER$1 = new BenefitsHub$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BenefitsHub.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsHub.proto");
        ADAPTER = benefitsHub$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(benefitsHub$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsHub(String str, TextRow textRow, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.status = textRow;
        this.sections = TransactorKt.immutableCopyOf("sections", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BenefitsHub)) {
            return false;
        }
        BenefitsHub benefitsHub = (BenefitsHub) obj;
        return Intrinsics.areEqual(unknownFields(), benefitsHub.unknownFields()) && Intrinsics.areEqual(this.title, benefitsHub.title) && Intrinsics.areEqual(this.status, benefitsHub.status) && Intrinsics.areEqual(this.sections, benefitsHub.sections);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        TextRow textRow = this.status;
        int hashCode3 = this.sections.hashCode() + ((hashCode2 + (textRow != null ? textRow.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(2);
        builder.customer_token = this.title;
        builder.withdrawalType = this.status;
        builder.customer_supplied_amount = this.sections;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        TextRow textRow = this.status;
        if (textRow != null) {
            arrayList.add("status=" + textRow);
        }
        List list = this.sections;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("sections=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BenefitsHub{", "}", 0, null, null, 56);
    }
}
