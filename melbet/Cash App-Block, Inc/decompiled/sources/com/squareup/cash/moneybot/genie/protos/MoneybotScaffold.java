package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.protos.cash.aegis.core.Member;
import com.squareup.protos.cash.appthemes.Gradient;
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
import xyz.block.protos.genie.ConditionalOp;
import xyz.block.protos.genie.Expression;
import xyz.block.protos.genie.FormatStringOp;
import xyz.block.protos.genie.Navigate;

/* loaded from: classes6.dex */
public final class MoneybotScaffold extends Message {
    public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MoneybotScaffold.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
    public final Answer answer;
    public final Evidence evidence;
    public final Meaning meaning;

    public final class Answer extends Message {
        public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Answer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Answer.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Answer", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final Decision decision;
        public final DirectAnswer direct_answer;
        public final FallbackTitle fallback_title;
        public final Scenario scenario;
        public final StatusExplanation status_explanation;

        public final class Decision extends Message {
            public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Answer$Decision$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Decision.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Answer.Decision", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Expression elaboration;
            public final Expression verdict;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Decision(Expression expression, Expression expression2, ByteString byteString) {
                super(ADAPTER, byteString);
                expression.getClass();
                expression2.getClass();
                byteString.getClass();
                this.verdict = expression;
                this.elaboration = expression2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Decision)) {
                    return false;
                }
                Decision decision = (Decision) obj;
                return Intrinsics.areEqual(unknownFields(), decision.unknownFields()) && Intrinsics.areEqual(this.verdict, decision.verdict) && Intrinsics.areEqual(this.elaboration, decision.elaboration);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.elaboration.hashCode() + Matcher$$ExternalSyntheticOutline0.m(this.verdict, unknownFields().hashCode() * 37, 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ComposePlatform.Image.ImageURL.Builder builder = new ComposePlatform.Image.ImageURL.Builder(3);
                builder.light = this.verdict;
                builder.dark = this.elaboration;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Matcher$$ExternalSyntheticOutline0.m("verdict=", this.verdict, arrayList);
                Matcher$$ExternalSyntheticOutline0.m("elaboration=", this.elaboration, arrayList);
                return CollectionsKt.joinToString$default(arrayList, ", ", "Decision{", "}", 0, null, null, 56);
            }
        }

        public final class DirectAnswer extends Message {
            public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Answer$DirectAnswer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DirectAnswer.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Answer.DirectAnswer", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Expression label;
            public final Expression value_;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DirectAnswer(Expression expression, Expression expression2, ByteString byteString) {
                super(ADAPTER, byteString);
                expression.getClass();
                expression2.getClass();
                byteString.getClass();
                this.label = expression;
                this.value_ = expression2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof DirectAnswer)) {
                    return false;
                }
                DirectAnswer directAnswer = (DirectAnswer) obj;
                return Intrinsics.areEqual(unknownFields(), directAnswer.unknownFields()) && Intrinsics.areEqual(this.label, directAnswer.label) && Intrinsics.areEqual(this.value_, directAnswer.value_);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.value_.hashCode() + Matcher$$ExternalSyntheticOutline0.m(this.label, unknownFields().hashCode() * 37, 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ComposePlatform.Image.ImageURL.Builder builder = new ComposePlatform.Image.ImageURL.Builder(4);
                builder.light = this.label;
                builder.dark = this.value_;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Matcher$$ExternalSyntheticOutline0.m("label=", this.label, arrayList);
                Matcher$$ExternalSyntheticOutline0.m("value_=", this.value_, arrayList);
                return CollectionsKt.joinToString$default(arrayList, ", ", "DirectAnswer{", "}", 0, null, null, 56);
            }
        }

        public final class FallbackTitle extends Message {
            public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Answer$FallbackTitle$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FallbackTitle.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Answer.FallbackTitle", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Expression title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FallbackTitle(Expression expression, ByteString byteString) {
                super(ADAPTER, byteString);
                expression.getClass();
                byteString.getClass();
                this.title = expression;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof FallbackTitle)) {
                    return false;
                }
                FallbackTitle fallbackTitle = (FallbackTitle) obj;
                return Intrinsics.areEqual(unknownFields(), fallbackTitle.unknownFields()) && Intrinsics.areEqual(this.title, fallbackTitle.title);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.title.hashCode() + (unknownFields().hashCode() * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Navigate.Dismiss.RetreatToView.Builder builder = new Navigate.Dismiss.RetreatToView.Builder(4);
                builder.view_slug = this.title;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Matcher$$ExternalSyntheticOutline0.m("title=", this.title, arrayList);
                return CollectionsKt.joinToString$default(arrayList, ", ", "FallbackTitle{", "}", 0, null, null, 56);
            }
        }

        public final class Scenario extends Message {
            public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Answer$Scenario$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Scenario.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Answer.Scenario", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Expression heading;
            public final List parameters;

            public final class Parameter extends Message {
                public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Answer$Scenario$Parameter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Parameter.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Answer.Scenario.Parameter", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
                public final Expression label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Parameter(Expression expression, ByteString byteString) {
                    super(ADAPTER, byteString);
                    expression.getClass();
                    byteString.getClass();
                    this.label = expression;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Parameter)) {
                        return false;
                    }
                    Parameter parameter = (Parameter) obj;
                    return Intrinsics.areEqual(unknownFields(), parameter.unknownFields()) && Intrinsics.areEqual(this.label, parameter.label);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = this.label.hashCode() + (unknownFields().hashCode() * 37);
                    this.hashCode = hashCode;
                    return hashCode;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    Navigate.Dismiss.RetreatToView.Builder builder = new Navigate.Dismiss.RetreatToView.Builder(5);
                    builder.view_slug = this.label;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    Matcher$$ExternalSyntheticOutline0.m("label=", this.label, arrayList);
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Parameter{", "}", 0, null, null, 56);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Scenario(List list, ByteString byteString, Expression expression) {
                super(ADAPTER, byteString);
                expression.getClass();
                list.getClass();
                byteString.getClass();
                this.heading = expression;
                this.parameters = TransactorKt.immutableCopyOf("parameters", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Scenario)) {
                    return false;
                }
                Scenario scenario = (Scenario) obj;
                return Intrinsics.areEqual(unknownFields(), scenario.unknownFields()) && Intrinsics.areEqual(this.heading, scenario.heading) && Intrinsics.areEqual(this.parameters, scenario.parameters);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.parameters.hashCode() + Matcher$$ExternalSyntheticOutline0.m(this.heading, unknownFields().hashCode() * 37, 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                FormatStringOp.Builder builder = new FormatStringOp.Builder(2);
                builder.template = this.heading;
                builder.token_replacements = this.parameters;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Matcher$$ExternalSyntheticOutline0.m("heading=", this.heading, arrayList);
                List list = this.parameters;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("parameters=", arrayList, list);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Scenario{", "}", 0, null, null, 56);
            }
        }

        public final class StatusExplanation extends Message {
            public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Answer$StatusExplanation$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(StatusExplanation.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Answer.StatusExplanation", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Expression explanation;
            public final Expression heading;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StatusExplanation(Expression expression, Expression expression2, ByteString byteString) {
                super(ADAPTER, byteString);
                expression.getClass();
                byteString.getClass();
                this.heading = expression;
                this.explanation = expression2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof StatusExplanation)) {
                    return false;
                }
                StatusExplanation statusExplanation = (StatusExplanation) obj;
                return Intrinsics.areEqual(unknownFields(), statusExplanation.unknownFields()) && Intrinsics.areEqual(this.heading, statusExplanation.heading) && Intrinsics.areEqual(this.explanation, statusExplanation.explanation);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int m = Matcher$$ExternalSyntheticOutline0.m(this.heading, unknownFields().hashCode() * 37, 37);
                Expression expression = this.explanation;
                int hashCode = m + (expression != null ? expression.hashCode() : 0);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ComposePlatform.Image.ImageURL.Builder builder = new ComposePlatform.Image.ImageURL.Builder(5);
                builder.light = this.heading;
                builder.dark = this.explanation;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Matcher$$ExternalSyntheticOutline0.m("heading=", this.heading, arrayList);
                Expression expression = this.explanation;
                if (expression != null) {
                    Matcher$$ExternalSyntheticOutline0.m("explanation=", expression, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "StatusExplanation{", "}", 0, null, null, 56);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Answer(DirectAnswer directAnswer, FallbackTitle fallbackTitle, StatusExplanation statusExplanation, Decision decision, Scenario scenario, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.direct_answer = directAnswer;
            this.fallback_title = fallbackTitle;
            this.status_explanation = statusExplanation;
            this.decision = decision;
            this.scenario = scenario;
            if (TransactorKt.countNonNull(directAnswer, fallbackTitle, statusExplanation, decision, scenario) <= 1) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("At most one of direct_answer, fallback_title, status_explanation, decision, scenario may be non-null");
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Answer)) {
                return false;
            }
            Answer answer = (Answer) obj;
            return Intrinsics.areEqual(unknownFields(), answer.unknownFields()) && Intrinsics.areEqual(this.direct_answer, answer.direct_answer) && Intrinsics.areEqual(this.fallback_title, answer.fallback_title) && Intrinsics.areEqual(this.status_explanation, answer.status_explanation) && Intrinsics.areEqual(this.decision, answer.decision) && Intrinsics.areEqual(this.scenario, answer.scenario);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            DirectAnswer directAnswer = this.direct_answer;
            int hashCode2 = (hashCode + (directAnswer != null ? directAnswer.hashCode() : 0)) * 37;
            FallbackTitle fallbackTitle = this.fallback_title;
            int hashCode3 = (hashCode2 + (fallbackTitle != null ? fallbackTitle.hashCode() : 0)) * 37;
            StatusExplanation statusExplanation = this.status_explanation;
            int hashCode4 = (hashCode3 + (statusExplanation != null ? statusExplanation.hashCode() : 0)) * 37;
            Decision decision = this.decision;
            int hashCode5 = (hashCode4 + (decision != null ? decision.hashCode() : 0)) * 37;
            Scenario scenario = this.scenario;
            int hashCode6 = hashCode5 + (scenario != null ? scenario.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Node.Builder builder = new Node.Builder(6);
            builder.for_each = this.direct_answer;
            builder.moneybot_scaffold = this.fallback_title;
            builder.compose_platform = this.status_explanation;
            builder.is_included = this.decision;
            builder.motion = this.scenario;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            DirectAnswer directAnswer = this.direct_answer;
            if (directAnswer != null) {
                arrayList.add("direct_answer=" + directAnswer);
            }
            FallbackTitle fallbackTitle = this.fallback_title;
            if (fallbackTitle != null) {
                arrayList.add("fallback_title=" + fallbackTitle);
            }
            StatusExplanation statusExplanation = this.status_explanation;
            if (statusExplanation != null) {
                arrayList.add("status_explanation=" + statusExplanation);
            }
            Decision decision = this.decision;
            if (decision != null) {
                arrayList.add("decision=" + decision);
            }
            Scenario scenario = this.scenario;
            if (scenario != null) {
                arrayList.add("scenario=" + scenario);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Answer{", "}", 0, null, null, 56);
        }
    }

    public final class Evidence extends Message {
        public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Evidence$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Evidence.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Evidence", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final Breakdown breakdown;
        public final MerchantCard merchant_card;

        public final class Breakdown extends Message {
            public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Evidence$Breakdown$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Breakdown.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Evidence.Breakdown", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final BarChart chart;
            public final List rows;

            public final class BarChart extends Message {
                public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Evidence$Breakdown$BarChart$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BarChart.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Evidence.Breakdown.BarChart", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
                public final List bars;

                public final class Bar extends Message {
                    public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Evidence$Breakdown$BarChart$Bar$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Bar.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Evidence.Breakdown.BarChart.Bar", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
                    public final Expression emphasized;
                    public final Expression label;
                    public final Expression value_;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Bar(Expression expression, Expression expression2, Expression expression3, ByteString byteString) {
                        super(ADAPTER, byteString);
                        expression.getClass();
                        byteString.getClass();
                        this.value_ = expression;
                        this.label = expression2;
                        this.emphasized = expression3;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof Bar)) {
                            return false;
                        }
                        Bar bar = (Bar) obj;
                        return Intrinsics.areEqual(unknownFields(), bar.unknownFields()) && Intrinsics.areEqual(this.value_, bar.value_) && Intrinsics.areEqual(this.label, bar.label) && Intrinsics.areEqual(this.emphasized, bar.emphasized);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int m = Matcher$$ExternalSyntheticOutline0.m(this.value_, unknownFields().hashCode() * 37, 37);
                        Expression expression = this.label;
                        int hashCode = (m + (expression != null ? expression.hashCode() : 0)) * 37;
                        Expression expression2 = this.emphasized;
                        int hashCode2 = hashCode + (expression2 != null ? expression2.hashCode() : 0);
                        this.hashCode = hashCode2;
                        return hashCode2;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        ConditionalOp.Builder builder = new ConditionalOp.Builder(2);
                        builder.condition = this.value_;
                        builder.then_expr = this.label;
                        builder.else_expr = this.emphasized;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        Matcher$$ExternalSyntheticOutline0.m("value_=", this.value_, arrayList);
                        Expression expression = this.label;
                        if (expression != null) {
                            Matcher$$ExternalSyntheticOutline0.m("label=", expression, arrayList);
                        }
                        Expression expression2 = this.emphasized;
                        if (expression2 != null) {
                            Matcher$$ExternalSyntheticOutline0.m("emphasized=", expression2, arrayList);
                        }
                        return CollectionsKt.joinToString$default(arrayList, ", ", "Bar{", "}", 0, null, null, 56);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public BarChart(List list, ByteString byteString) {
                    super(ADAPTER, byteString);
                    list.getClass();
                    byteString.getClass();
                    this.bars = TransactorKt.immutableCopyOf("bars", list);
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof BarChart)) {
                        return false;
                    }
                    BarChart barChart = (BarChart) obj;
                    return Intrinsics.areEqual(unknownFields(), barChart.unknownFields()) && Intrinsics.areEqual(this.bars, barChart.bars);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = this.bars.hashCode() + (unknownFields().hashCode() * 37);
                    this.hashCode = hashCode;
                    return hashCode;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    Gradient.Builder builder = new Gradient.Builder(10, false);
                    builder.colors = this.bars;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    List list = this.bars;
                    if (!list.isEmpty()) {
                        re$$ExternalSyntheticOutline0.m("bars=", arrayList, list);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "BarChart{", "}", 0, null, null, 56);
                }
            }

            public final class CategoryRow extends Message {
                public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Evidence$Breakdown$CategoryRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CategoryRow.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Evidence.Breakdown.CategoryRow", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
                public final Expression amount;
                public final Expression category;
                public final Expression emphasized;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public CategoryRow(Expression expression, Expression expression2, Expression expression3, ByteString byteString) {
                    super(ADAPTER, byteString);
                    expression.getClass();
                    expression2.getClass();
                    byteString.getClass();
                    this.category = expression;
                    this.amount = expression2;
                    this.emphasized = expression3;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof CategoryRow)) {
                        return false;
                    }
                    CategoryRow categoryRow = (CategoryRow) obj;
                    return Intrinsics.areEqual(unknownFields(), categoryRow.unknownFields()) && Intrinsics.areEqual(this.category, categoryRow.category) && Intrinsics.areEqual(this.amount, categoryRow.amount) && Intrinsics.areEqual(this.emphasized, categoryRow.emphasized);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int m = Matcher$$ExternalSyntheticOutline0.m(this.amount, Matcher$$ExternalSyntheticOutline0.m(this.category, unknownFields().hashCode() * 37, 37), 37);
                    Expression expression = this.emphasized;
                    int hashCode = m + (expression != null ? expression.hashCode() : 0);
                    this.hashCode = hashCode;
                    return hashCode;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    ConditionalOp.Builder builder = new ConditionalOp.Builder(3);
                    builder.condition = this.category;
                    builder.then_expr = this.amount;
                    builder.else_expr = this.emphasized;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    Matcher$$ExternalSyntheticOutline0.m("category=", this.category, arrayList);
                    Matcher$$ExternalSyntheticOutline0.m("amount=", this.amount, arrayList);
                    Expression expression = this.emphasized;
                    if (expression != null) {
                        Matcher$$ExternalSyntheticOutline0.m("emphasized=", expression, arrayList);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "CategoryRow{", "}", 0, null, null, 56);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Breakdown(BarChart barChart, List list, ByteString byteString) {
                super(ADAPTER, byteString);
                barChart.getClass();
                list.getClass();
                byteString.getClass();
                this.chart = barChart;
                this.rows = TransactorKt.immutableCopyOf("rows", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Breakdown)) {
                    return false;
                }
                Breakdown breakdown = (Breakdown) obj;
                return Intrinsics.areEqual(unknownFields(), breakdown.unknownFields()) && Intrinsics.areEqual(this.chart, breakdown.chart) && Intrinsics.areEqual(this.rows, breakdown.rows);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.rows.hashCode() + ((this.chart.hashCode() + (unknownFields().hashCode() * 37)) * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Member.Builder builder = new Member.Builder(18);
                builder.customer_token = this.chart;
                builder.sponsorship_tier = this.rows;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("chart=" + this.chart);
                List list = this.rows;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("rows=", arrayList, list);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Breakdown{", "}", 0, null, null, 56);
            }
        }

        public final class MerchantCard extends Message {
            public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Evidence$MerchantCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MerchantCard.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Evidence.MerchantCard", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Summary summary;
            public final List transactions;

            public final class Summary extends Message {
                public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Evidence$MerchantCard$Summary$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Summary.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Evidence.MerchantCard.Summary", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
                public final Flow received;
                public final Flow sent;
                public final Expression total;
                public final Expression total_label;

                public final class Flow extends Message {
                    public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Evidence$MerchantCard$Summary$Flow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Flow.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Evidence.MerchantCard.Summary.Flow", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
                    public final Expression label;
                    public final Expression value_;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Flow(Expression expression, Expression expression2, ByteString byteString) {
                        super(ADAPTER, byteString);
                        expression.getClass();
                        expression2.getClass();
                        byteString.getClass();
                        this.label = expression;
                        this.value_ = expression2;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof Flow)) {
                            return false;
                        }
                        Flow flow = (Flow) obj;
                        return Intrinsics.areEqual(unknownFields(), flow.unknownFields()) && Intrinsics.areEqual(this.label, flow.label) && Intrinsics.areEqual(this.value_, flow.value_);
                    }

                    public final int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int hashCode = this.value_.hashCode() + Matcher$$ExternalSyntheticOutline0.m(this.label, unknownFields().hashCode() * 37, 37);
                        this.hashCode = hashCode;
                        return hashCode;
                    }

                    @Override // com.squareup.wire.Message
                    public final Message.Builder newBuilder() {
                        ComposePlatform.Image.ImageURL.Builder builder = new ComposePlatform.Image.ImageURL.Builder(6);
                        builder.light = this.label;
                        builder.dark = this.value_;
                        builder.addUnknownFields(unknownFields());
                        return builder;
                    }

                    public final String toString() {
                        ArrayList arrayList = new ArrayList();
                        Matcher$$ExternalSyntheticOutline0.m("label=", this.label, arrayList);
                        Matcher$$ExternalSyntheticOutline0.m("value_=", this.value_, arrayList);
                        return CollectionsKt.joinToString$default(arrayList, ", ", "Flow{", "}", 0, null, null, 56);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Summary(Expression expression, Expression expression2, Flow flow, Flow flow2, ByteString byteString) {
                    super(ADAPTER, byteString);
                    expression.getClass();
                    expression2.getClass();
                    flow.getClass();
                    flow2.getClass();
                    byteString.getClass();
                    this.total_label = expression;
                    this.total = expression2;
                    this.received = flow;
                    this.sent = flow2;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Summary)) {
                        return false;
                    }
                    Summary summary = (Summary) obj;
                    return Intrinsics.areEqual(unknownFields(), summary.unknownFields()) && Intrinsics.areEqual(this.total_label, summary.total_label) && Intrinsics.areEqual(this.total, summary.total) && Intrinsics.areEqual(this.received, summary.received) && Intrinsics.areEqual(this.sent, summary.sent);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = this.sent.hashCode() + ((this.received.hashCode() + Matcher$$ExternalSyntheticOutline0.m(this.total, Matcher$$ExternalSyntheticOutline0.m(this.total_label, unknownFields().hashCode() * 37, 37), 37)) * 37);
                    this.hashCode = hashCode;
                    return hashCode;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    ForEach.Builder builder = new ForEach.Builder(8);
                    builder.collection = this.total_label;
                    builder.template = this.total;
                    builder.item_variable = this.received;
                    builder.source = this.sent;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    Matcher$$ExternalSyntheticOutline0.m("total_label=", this.total_label, arrayList);
                    Matcher$$ExternalSyntheticOutline0.m("total=", this.total, arrayList);
                    arrayList.add("received=" + this.received);
                    arrayList.add("sent=" + this.sent);
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Summary{", "}", 0, null, null, 56);
                }
            }

            public final class Transaction extends Message {
                public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Evidence$MerchantCard$Transaction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Transaction.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Evidence.MerchantCard.Transaction", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
                public final Expression amount;
                public final Expression avatar_url;
                public final Expression subtitle;
                public final Expression title;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Transaction(Expression expression, Expression expression2, Expression expression3, Expression expression4, ByteString byteString) {
                    super(ADAPTER, byteString);
                    expression2.getClass();
                    expression4.getClass();
                    byteString.getClass();
                    this.avatar_url = expression;
                    this.title = expression2;
                    this.subtitle = expression3;
                    this.amount = expression4;
                }

                public final boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Transaction)) {
                        return false;
                    }
                    Transaction transaction = (Transaction) obj;
                    return Intrinsics.areEqual(unknownFields(), transaction.unknownFields()) && Intrinsics.areEqual(this.avatar_url, transaction.avatar_url) && Intrinsics.areEqual(this.title, transaction.title) && Intrinsics.areEqual(this.subtitle, transaction.subtitle) && Intrinsics.areEqual(this.amount, transaction.amount);
                }

                public final int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int hashCode = unknownFields().hashCode() * 37;
                    Expression expression = this.avatar_url;
                    int m = Matcher$$ExternalSyntheticOutline0.m(this.title, (hashCode + (expression != null ? expression.hashCode() : 0)) * 37, 37);
                    Expression expression2 = this.subtitle;
                    int hashCode2 = this.amount.hashCode() + ((m + (expression2 != null ? expression2.hashCode() : 0)) * 37);
                    this.hashCode = hashCode2;
                    return hashCode2;
                }

                @Override // com.squareup.wire.Message
                public final Message.Builder newBuilder() {
                    ComposePlatform.Modifier.TextStyle.Builder builder = new ComposePlatform.Modifier.TextStyle.Builder(1);
                    builder.typography = this.avatar_url;
                    builder.size = this.title;
                    builder.weight = this.subtitle;
                    builder.text_align = this.amount;
                    builder.addUnknownFields(unknownFields());
                    return builder;
                }

                public final String toString() {
                    ArrayList arrayList = new ArrayList();
                    Expression expression = this.avatar_url;
                    if (expression != null) {
                        Matcher$$ExternalSyntheticOutline0.m("avatar_url=", expression, arrayList);
                    }
                    Matcher$$ExternalSyntheticOutline0.m("title=", this.title, arrayList);
                    Expression expression2 = this.subtitle;
                    if (expression2 != null) {
                        Matcher$$ExternalSyntheticOutline0.m("subtitle=", expression2, arrayList);
                    }
                    Matcher$$ExternalSyntheticOutline0.m("amount=", this.amount, arrayList);
                    return CollectionsKt.joinToString$default(arrayList, ", ", "Transaction{", "}", 0, null, null, 56);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MerchantCard(Summary summary, List list, ByteString byteString) {
                super(ADAPTER, byteString);
                summary.getClass();
                list.getClass();
                byteString.getClass();
                this.summary = summary;
                this.transactions = TransactorKt.immutableCopyOf("transactions", list);
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MerchantCard)) {
                    return false;
                }
                MerchantCard merchantCard = (MerchantCard) obj;
                return Intrinsics.areEqual(unknownFields(), merchantCard.unknownFields()) && Intrinsics.areEqual(this.summary, merchantCard.summary) && Intrinsics.areEqual(this.transactions, merchantCard.transactions);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.transactions.hashCode() + ((this.summary.hashCode() + (unknownFields().hashCode() * 37)) * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Member.Builder builder = new Member.Builder(20);
                builder.customer_token = this.summary;
                builder.sponsorship_tier = this.transactions;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("summary=" + this.summary);
                List list = this.transactions;
                if (!list.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("transactions=", arrayList, list);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "MerchantCard{", "}", 0, null, null, 56);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Evidence(Breakdown breakdown, MerchantCard merchantCard, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.breakdown = breakdown;
            this.merchant_card = merchantCard;
            if (TransactorKt.countNonNull(breakdown, merchantCard) <= 1) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("At most one of breakdown, merchant_card may be non-null");
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Evidence)) {
                return false;
            }
            Evidence evidence = (Evidence) obj;
            return Intrinsics.areEqual(unknownFields(), evidence.unknownFields()) && Intrinsics.areEqual(this.breakdown, evidence.breakdown) && Intrinsics.areEqual(this.merchant_card, evidence.merchant_card);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Breakdown breakdown = this.breakdown;
            int hashCode2 = (hashCode + (breakdown != null ? breakdown.hashCode() : 0)) * 37;
            MerchantCard merchantCard = this.merchant_card;
            int hashCode3 = hashCode2 + (merchantCard != null ? merchantCard.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Member.Builder builder = new Member.Builder(19);
            builder.customer_token = this.breakdown;
            builder.sponsorship_tier = this.merchant_card;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Breakdown breakdown = this.breakdown;
            if (breakdown != null) {
                arrayList.add("breakdown=" + breakdown);
            }
            MerchantCard merchantCard = this.merchant_card;
            if (merchantCard != null) {
                arrayList.add("merchant_card=" + merchantCard);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Evidence{", "}", 0, null, null, 56);
        }
    }

    public final class Meaning extends Message {
        public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Meaning$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Meaning.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Meaning", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final Opportunity opportunity;
        public final RiskPattern risk_pattern;

        public final class Opportunity extends Message {
            public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Meaning$Opportunity$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Opportunity.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Meaning.Opportunity", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Expression body;
            public final Expression eyebrow;
            public final Expression heading;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Opportunity(Expression expression, Expression expression2, Expression expression3, ByteString byteString) {
                super(ADAPTER, byteString);
                expression.getClass();
                expression2.getClass();
                byteString.getClass();
                this.eyebrow = expression;
                this.heading = expression2;
                this.body = expression3;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Opportunity)) {
                    return false;
                }
                Opportunity opportunity = (Opportunity) obj;
                return Intrinsics.areEqual(unknownFields(), opportunity.unknownFields()) && Intrinsics.areEqual(this.eyebrow, opportunity.eyebrow) && Intrinsics.areEqual(this.heading, opportunity.heading) && Intrinsics.areEqual(this.body, opportunity.body);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int m = Matcher$$ExternalSyntheticOutline0.m(this.heading, Matcher$$ExternalSyntheticOutline0.m(this.eyebrow, unknownFields().hashCode() * 37, 37), 37);
                Expression expression = this.body;
                int hashCode = m + (expression != null ? expression.hashCode() : 0);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ConditionalOp.Builder builder = new ConditionalOp.Builder(4);
                builder.condition = this.eyebrow;
                builder.then_expr = this.heading;
                builder.else_expr = this.body;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Matcher$$ExternalSyntheticOutline0.m("eyebrow=", this.eyebrow, arrayList);
                Matcher$$ExternalSyntheticOutline0.m("heading=", this.heading, arrayList);
                Expression expression = this.body;
                if (expression != null) {
                    Matcher$$ExternalSyntheticOutline0.m("body=", expression, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Opportunity{", "}", 0, null, null, 56);
            }
        }

        public final class RiskPattern extends Message {
            public static final ProtoAdapter ADAPTER = new MoneybotScaffold$Meaning$RiskPattern$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RiskPattern.class), "type.googleapis.com/xyz.block.genie.v1.MoneybotScaffold.Meaning.RiskPattern", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Expression body;
            public final Expression eyebrow;
            public final Expression heading;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RiskPattern(Expression expression, Expression expression2, Expression expression3, ByteString byteString) {
                super(ADAPTER, byteString);
                expression.getClass();
                expression2.getClass();
                byteString.getClass();
                this.eyebrow = expression;
                this.heading = expression2;
                this.body = expression3;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RiskPattern)) {
                    return false;
                }
                RiskPattern riskPattern = (RiskPattern) obj;
                return Intrinsics.areEqual(unknownFields(), riskPattern.unknownFields()) && Intrinsics.areEqual(this.eyebrow, riskPattern.eyebrow) && Intrinsics.areEqual(this.heading, riskPattern.heading) && Intrinsics.areEqual(this.body, riskPattern.body);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int m = Matcher$$ExternalSyntheticOutline0.m(this.heading, Matcher$$ExternalSyntheticOutline0.m(this.eyebrow, unknownFields().hashCode() * 37, 37), 37);
                Expression expression = this.body;
                int hashCode = m + (expression != null ? expression.hashCode() : 0);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                ConditionalOp.Builder builder = new ConditionalOp.Builder(5);
                builder.condition = this.eyebrow;
                builder.then_expr = this.heading;
                builder.else_expr = this.body;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Matcher$$ExternalSyntheticOutline0.m("eyebrow=", this.eyebrow, arrayList);
                Matcher$$ExternalSyntheticOutline0.m("heading=", this.heading, arrayList);
                Expression expression = this.body;
                if (expression != null) {
                    Matcher$$ExternalSyntheticOutline0.m("body=", expression, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "RiskPattern{", "}", 0, null, null, 56);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Meaning(RiskPattern riskPattern, Opportunity opportunity, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.risk_pattern = riskPattern;
            this.opportunity = opportunity;
            if (TransactorKt.countNonNull(riskPattern, opportunity) <= 1) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("At most one of risk_pattern, opportunity may be non-null");
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Meaning)) {
                return false;
            }
            Meaning meaning = (Meaning) obj;
            return Intrinsics.areEqual(unknownFields(), meaning.unknownFields()) && Intrinsics.areEqual(this.risk_pattern, meaning.risk_pattern) && Intrinsics.areEqual(this.opportunity, meaning.opportunity);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            RiskPattern riskPattern = this.risk_pattern;
            int hashCode2 = (hashCode + (riskPattern != null ? riskPattern.hashCode() : 0)) * 37;
            Opportunity opportunity = this.opportunity;
            int hashCode3 = hashCode2 + (opportunity != null ? opportunity.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Member.Builder builder = new Member.Builder(21);
            builder.customer_token = this.risk_pattern;
            builder.sponsorship_tier = this.opportunity;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            RiskPattern riskPattern = this.risk_pattern;
            if (riskPattern != null) {
                arrayList.add("risk_pattern=" + riskPattern);
            }
            Opportunity opportunity = this.opportunity;
            if (opportunity != null) {
                arrayList.add("opportunity=" + opportunity);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Meaning{", "}", 0, null, null, 56);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoneybotScaffold(Answer answer, Evidence evidence, Meaning meaning, ByteString byteString) {
        super(ADAPTER, byteString);
        answer.getClass();
        evidence.getClass();
        meaning.getClass();
        byteString.getClass();
        this.answer = answer;
        this.evidence = evidence;
        this.meaning = meaning;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MoneybotScaffold)) {
            return false;
        }
        MoneybotScaffold moneybotScaffold = (MoneybotScaffold) obj;
        return Intrinsics.areEqual(unknownFields(), moneybotScaffold.unknownFields()) && Intrinsics.areEqual(this.answer, moneybotScaffold.answer) && Intrinsics.areEqual(this.evidence, moneybotScaffold.evidence) && Intrinsics.areEqual(this.meaning, moneybotScaffold.meaning);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.meaning.hashCode() + ((this.evidence.hashCode() + ((this.answer.hashCode() + (unknownFields().hashCode() * 37)) * 37)) * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(20);
        builder.withdrawalType = this.answer;
        builder.customer_supplied_amount = this.evidence;
        builder.customer_token = this.meaning;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("answer=" + this.answer);
        arrayList.add("evidence=" + this.evidence);
        arrayList.add("meaning=" + this.meaning);
        return CollectionsKt.joinToString$default(arrayList, ", ", "MoneybotScaffold{", "}", 0, null, null, 56);
    }
}
