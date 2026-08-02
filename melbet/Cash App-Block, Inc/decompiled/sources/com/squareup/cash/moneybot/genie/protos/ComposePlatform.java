package com.squareup.cash.moneybot.genie.protos;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.cash.notifications.Op;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.cropview.Edge;
import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.cash.aegis.core.Member;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.employeejobs.Job;
import com.squareup.protos.franklin.common.RewardStatus;
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
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import xyz.block.protos.genie.Action;
import xyz.block.protos.genie.Binding;
import xyz.block.protos.genie.ConditionalOp;
import xyz.block.protos.genie.Expression;
import xyz.block.protos.genie.FormatStringOp;
import xyz.block.protos.genie.Navigate;

/* loaded from: classes6.dex */
public final class ComposePlatform extends Message {
    public static final ProtoAdapter ADAPTER = new ComposePlatform$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ComposePlatform.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
    public final Box box;
    public final Button button;
    public final Column column;
    public final DatePicker date_picker;
    public final DropdownMenu dropdown_menu;
    public final Image image;
    public final List modifiers;
    public final ProgressIndicator progress_indicator;
    public final Row row;
    public final Slider slider;
    public final Switch switch_control;
    public final Text text;
    public final TextField text_field;

    public enum Alignment implements WireEnum {
        ALIGNMENT_UNSPECIFIED(0),
        ALIGNMENT_CENTER(1),
        ALIGNMENT_START(2),
        ALIGNMENT_END(3),
        ALIGNMENT_TOP(4),
        ALIGNMENT_BOTTOM(5),
        ALIGNMENT_TOP_START(6),
        ALIGNMENT_TOP_END(7),
        ALIGNMENT_BOTTOM_START(8),
        ALIGNMENT_BOTTOM_END(9),
        ALIGNMENT_CENTER_START(10),
        ALIGNMENT_CENTER_END(11),
        ALIGNMENT_TOP_CENTER(12),
        ALIGNMENT_BOTTOM_CENTER(13);

        public static final Companion Companion;
        public final int value;

        public final class Companion {
            public static Alignment fromValue(int i) {
                switch (i) {
                    case 0:
                        return Alignment.ALIGNMENT_UNSPECIFIED;
                    case 1:
                        return Alignment.ALIGNMENT_CENTER;
                    case 2:
                        return Alignment.ALIGNMENT_START;
                    case 3:
                        return Alignment.ALIGNMENT_END;
                    case 4:
                        return Alignment.ALIGNMENT_TOP;
                    case 5:
                        return Alignment.ALIGNMENT_BOTTOM;
                    case 6:
                        return Alignment.ALIGNMENT_TOP_START;
                    case 7:
                        return Alignment.ALIGNMENT_TOP_END;
                    case 8:
                        return Alignment.ALIGNMENT_BOTTOM_START;
                    case 9:
                        return Alignment.ALIGNMENT_BOTTOM_END;
                    case 10:
                        return Alignment.ALIGNMENT_CENTER_START;
                    case 11:
                        return Alignment.ALIGNMENT_CENTER_END;
                    case 12:
                        return Alignment.ALIGNMENT_TOP_CENTER;
                    case 13:
                        return Alignment.ALIGNMENT_BOTTOM_CENTER;
                    default:
                        return null;
                }
            }
        }

        static {
            Alignment alignment = ALIGNMENT_UNSPECIFIED;
            Companion = new Companion();
            new ComposePlatform$Alignment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Alignment.class), Syntax.PROTO_2, alignment);
        }

        Alignment(int i) {
            this.value = i;
        }

        public static final Alignment fromValue(int i) {
            Companion.getClass();
            return Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class Box extends Message {
        public static final ProtoAdapter ADAPTER = new ComposePlatform$Box$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Box.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Box", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final List children;
        public final Expression content_alignment;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Box(List list, ByteString byteString, Expression expression) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.content_alignment = expression;
            this.children = TransactorKt.immutableCopyOf("children", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Box)) {
                return false;
            }
            Box box = (Box) obj;
            return Intrinsics.areEqual(unknownFields(), box.unknownFields()) && Intrinsics.areEqual(this.children, box.children) && Intrinsics.areEqual(this.content_alignment, box.content_alignment);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.children);
            Expression expression = this.content_alignment;
            int hashCode = m + (expression != null ? expression.hashCode() : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            FormatStringOp.Builder builder = new FormatStringOp.Builder(1);
            builder.token_replacements = this.children;
            builder.template = this.content_alignment;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.children;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("children=", arrayList, list);
            }
            Expression expression = this.content_alignment;
            if (expression != null) {
                Matcher$$ExternalSyntheticOutline0.m("content_alignment=", expression, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Box{", "}", 0, null, null, 56);
        }
    }

    public final class Button extends Message {
        public static final ProtoAdapter ADAPTER = new ComposePlatform$Button$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Button.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Button", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final Action action;
        public final Node label;
        public final Expression style;
        public final Expression title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Button(Expression expression, Node node, Action action, Expression expression2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = expression;
            this.label = node;
            this.action = action;
            this.style = expression2;
            if (TransactorKt.countNonNull(expression, node) <= 1) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("At most one of title, label may be non-null");
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.title, button.title) && Intrinsics.areEqual(this.label, button.label) && Intrinsics.areEqual(this.action, button.action) && Intrinsics.areEqual(this.style, button.style);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Expression expression = this.title;
            int hashCode2 = (hashCode + (expression != null ? expression.hashCode() : 0)) * 37;
            Node node = this.label;
            int hashCode3 = (hashCode2 + (node != null ? node.hashCode() : 0)) * 37;
            Action action = this.action;
            int hashCode4 = (hashCode3 + (action != null ? action.hashCode() : 0)) * 37;
            Expression expression2 = this.style;
            int hashCode5 = hashCode4 + (expression2 != null ? expression2.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ForEach.Builder builder = new ForEach.Builder(6);
            builder.collection = this.title;
            builder.template = this.label;
            builder.item_variable = this.action;
            builder.source = this.style;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Expression expression = this.title;
            if (expression != null) {
                Matcher$$ExternalSyntheticOutline0.m("title=", expression, arrayList);
            }
            Node node = this.label;
            if (node != null) {
                arrayList.add("label=" + node);
            }
            Action action = this.action;
            if (action != null) {
                arrayList.add("action=" + action);
            }
            Expression expression2 = this.style;
            if (expression2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("style=", expression2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56);
        }
    }

    public enum ButtonStyle implements WireEnum {
        BUTTON_STYLE_UNSPECIFIED(0),
        BUTTON_STYLE_FILLED(1),
        BUTTON_STYLE_FILLED_TONAL(2),
        BUTTON_STYLE_ELEVATED(3),
        BUTTON_STYLE_OUTLINED(4),
        BUTTON_STYLE_TEXT(5);

        public static final Op.Companion Companion;
        public final int value;

        static {
            ButtonStyle buttonStyle = BUTTON_STYLE_UNSPECIFIED;
            Companion = new Op.Companion();
            new ComposePlatform$ButtonStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ButtonStyle.class), Syntax.PROTO_2, buttonStyle);
        }

        ButtonStyle(int i) {
            this.value = i;
        }

        public static final ButtonStyle fromValue(int i) {
            Companion.getClass();
            return Op.Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class Color extends Message {
        public static final ProtoAdapter ADAPTER = new ComposePlatform$Color$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Color.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Color", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final ColorValue dark;
        public final ColorValue light;

        public final class ColorValue extends Message {
            public static final ProtoAdapter ADAPTER = new ComposePlatform$Color$ColorValue$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ColorValue.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Color.ColorValue", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Expression hex;
            public final Expression named;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ColorValue(Expression expression, Expression expression2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.hex = expression;
                this.named = expression2;
                if (TransactorKt.countNonNull(expression, expression2) <= 1) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$3("At most one of hex, named may be non-null");
                throw null;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ColorValue)) {
                    return false;
                }
                ColorValue colorValue = (ColorValue) obj;
                return Intrinsics.areEqual(unknownFields(), colorValue.unknownFields()) && Intrinsics.areEqual(this.hex, colorValue.hex) && Intrinsics.areEqual(this.named, colorValue.named);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Expression expression = this.hex;
                int hashCode2 = (hashCode + (expression != null ? expression.hashCode() : 0)) * 37;
                Expression expression2 = this.named;
                int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Image.ImageURL.Builder builder = new Image.ImageURL.Builder(1);
                builder.light = this.hex;
                builder.dark = this.named;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Expression expression = this.hex;
                if (expression != null) {
                    Matcher$$ExternalSyntheticOutline0.m("hex=", expression, arrayList);
                }
                Expression expression2 = this.named;
                if (expression2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("named=", expression2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ColorValue{", "}", 0, null, null, 56);
            }
        }

        /* loaded from: classes7.dex */
        public enum NamedColor implements WireEnum {
            NAMED_COLOR_UNSPECIFIED(0),
            NAMED_COLOR_PRIMARY(1),
            NAMED_COLOR_ON_PRIMARY(2),
            NAMED_COLOR_PRIMARY_CONTAINER(3),
            NAMED_COLOR_ON_PRIMARY_CONTAINER(4),
            NAMED_COLOR_SECONDARY(5),
            NAMED_COLOR_ON_SECONDARY(6),
            NAMED_COLOR_SECONDARY_CONTAINER(7),
            NAMED_COLOR_ON_SECONDARY_CONTAINER(8),
            NAMED_COLOR_TERTIARY(9),
            NAMED_COLOR_ON_TERTIARY(10),
            NAMED_COLOR_BACKGROUND(11),
            NAMED_COLOR_ON_BACKGROUND(12),
            NAMED_COLOR_SURFACE(13),
            NAMED_COLOR_ON_SURFACE(14),
            NAMED_COLOR_SURFACE_VARIANT(15),
            NAMED_COLOR_ON_SURFACE_VARIANT(16),
            NAMED_COLOR_ERROR(17),
            NAMED_COLOR_ON_ERROR(18),
            NAMED_COLOR_OUTLINE(19),
            NAMED_COLOR_RED(20),
            NAMED_COLOR_GREEN(21),
            NAMED_COLOR_BLUE(22),
            NAMED_COLOR_BLACK(23),
            NAMED_COLOR_WHITE(24),
            NAMED_COLOR_GRAY(25),
            NAMED_COLOR_TRANSPARENT(26);

            public static final CardProduct.Companion Companion;
            public final int value;

            static {
                NamedColor namedColor = NAMED_COLOR_UNSPECIFIED;
                Companion = new CardProduct.Companion(3);
                new ComposePlatform$Color$NamedColor$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(NamedColor.class), Syntax.PROTO_2, namedColor);
            }

            NamedColor(int i) {
                this.value = i;
            }

            public static final NamedColor fromValue(int i) {
                Companion.getClass();
                return CardProduct.Companion.fromValue(i);
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Color(ColorValue colorValue, ColorValue colorValue2, ByteString byteString) {
            super(ADAPTER, byteString);
            colorValue.getClass();
            byteString.getClass();
            this.light = colorValue;
            this.dark = colorValue2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Color)) {
                return false;
            }
            Color color = (Color) obj;
            return Intrinsics.areEqual(unknownFields(), color.unknownFields()) && Intrinsics.areEqual(this.light, color.light) && Intrinsics.areEqual(this.dark, color.dark);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = (this.light.hashCode() + (unknownFields().hashCode() * 37)) * 37;
            ColorValue colorValue = this.dark;
            int hashCode2 = hashCode + (colorValue != null ? colorValue.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Member.Builder builder = new Member.Builder(16);
            builder.customer_token = this.light;
            builder.sponsorship_tier = this.dark;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("light=" + this.light);
            ColorValue colorValue = this.dark;
            if (colorValue != null) {
                arrayList.add("dark=" + colorValue);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Color{", "}", 0, null, null, 56);
        }
    }

    public final class Column extends Message {
        public static final ProtoAdapter ADAPTER = new ComposePlatform$Column$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Column.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Column", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final List children;
        public final Expression horizontal_alignment;
        public final Expression spacing;
        public final Expression vertical_arrangement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Column(List list, Expression expression, Expression expression2, Expression expression3, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.vertical_arrangement = expression;
            this.spacing = expression2;
            this.horizontal_alignment = expression3;
            this.children = TransactorKt.immutableCopyOf("children", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Column)) {
                return false;
            }
            Column column = (Column) obj;
            return Intrinsics.areEqual(unknownFields(), column.unknownFields()) && Intrinsics.areEqual(this.children, column.children) && Intrinsics.areEqual(this.vertical_arrangement, column.vertical_arrangement) && Intrinsics.areEqual(this.spacing, column.spacing) && Intrinsics.areEqual(this.horizontal_alignment, column.horizontal_alignment);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.children);
            Expression expression = this.vertical_arrangement;
            int hashCode = (m + (expression != null ? expression.hashCode() : 0)) * 37;
            Expression expression2 = this.spacing;
            int hashCode2 = (hashCode + (expression2 != null ? expression2.hashCode() : 0)) * 37;
            Expression expression3 = this.horizontal_alignment;
            int hashCode3 = hashCode2 + (expression3 != null ? expression3.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Row.Builder builder = new Row.Builder(1);
            builder.children = this.children;
            builder.horizontal_arrangement = this.vertical_arrangement;
            builder.spacing = this.spacing;
            builder.vertical_alignment = this.horizontal_alignment;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.children;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("children=", arrayList, list);
            }
            Expression expression = this.vertical_arrangement;
            if (expression != null) {
                Matcher$$ExternalSyntheticOutline0.m("vertical_arrangement=", expression, arrayList);
            }
            Expression expression2 = this.spacing;
            if (expression2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("spacing=", expression2, arrayList);
            }
            Expression expression3 = this.horizontal_alignment;
            if (expression3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("horizontal_alignment=", expression3, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Column{", "}", 0, null, null, 56);
        }
    }

    public final class DatePicker extends Message {
        public static final ProtoAdapter ADAPTER = new ComposePlatform$DatePicker$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DatePicker.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.DatePicker", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final Binding binding;
        public final Expression label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DatePicker(Expression expression, Binding binding, ByteString byteString) {
            super(ADAPTER, byteString);
            expression.getClass();
            binding.getClass();
            byteString.getClass();
            this.label = expression;
            this.binding = binding;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DatePicker)) {
                return false;
            }
            DatePicker datePicker = (DatePicker) obj;
            return Intrinsics.areEqual(unknownFields(), datePicker.unknownFields()) && Intrinsics.areEqual(this.label, datePicker.label) && Intrinsics.areEqual(this.binding, datePicker.binding);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.binding.hashCode() + Matcher$$ExternalSyntheticOutline0.m(this.label, unknownFields().hashCode() * 37, 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Switch.Builder builder = new Switch.Builder(1);
            builder.label = this.label;
            builder.binding = this.binding;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Matcher$$ExternalSyntheticOutline0.m("label=", this.label, arrayList);
            arrayList.add("binding=" + this.binding);
            return CollectionsKt.joinToString$default(arrayList, ", ", "DatePicker{", "}", 0, null, null, 56);
        }
    }

    public final class DropdownMenu extends Message {
        public static final ProtoAdapter ADAPTER = new ComposePlatform$DropdownMenu$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(DropdownMenu.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.DropdownMenu", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final Binding binding;
        public final Expression label;
        public final List options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DropdownMenu(Expression expression, List list, Binding binding, ByteString byteString) {
            super(ADAPTER, byteString);
            expression.getClass();
            list.getClass();
            binding.getClass();
            byteString.getClass();
            this.label = expression;
            this.binding = binding;
            this.options = TransactorKt.immutableCopyOf("options", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DropdownMenu)) {
                return false;
            }
            DropdownMenu dropdownMenu = (DropdownMenu) obj;
            return Intrinsics.areEqual(unknownFields(), dropdownMenu.unknownFields()) && Intrinsics.areEqual(this.label, dropdownMenu.label) && Intrinsics.areEqual(this.options, dropdownMenu.options) && Intrinsics.areEqual(this.binding, dropdownMenu.binding);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.binding.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Matcher$$ExternalSyntheticOutline0.m(this.label, unknownFields().hashCode() * 37, 37), 37, this.options);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(17);
            builder.withdrawalType = this.label;
            builder.customer_supplied_amount = this.options;
            builder.customer_token = this.binding;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Matcher$$ExternalSyntheticOutline0.m("label=", this.label, arrayList);
            List list = this.options;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("options=", arrayList, list);
            }
            arrayList.add("binding=" + this.binding);
            return CollectionsKt.joinToString$default(arrayList, ", ", "DropdownMenu{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes7.dex */
    public enum FontWeight implements WireEnum {
        FONT_WEIGHT_UNSPECIFIED(0),
        FONT_WEIGHT_THIN(1),
        FONT_WEIGHT_EXTRA_LIGHT(2),
        FONT_WEIGHT_LIGHT(3),
        FONT_WEIGHT_NORMAL(4),
        FONT_WEIGHT_MEDIUM(5),
        FONT_WEIGHT_SEMI_BOLD(6),
        FONT_WEIGHT_BOLD(7),
        FONT_WEIGHT_EXTRA_BOLD(8),
        FONT_WEIGHT_BLACK(9);

        public static final Error.Code.Companion Companion;
        public final int value;

        static {
            FontWeight fontWeight = FONT_WEIGHT_UNSPECIFIED;
            Companion = new Error.Code.Companion(3);
            new ComposePlatform$FontWeight$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(FontWeight.class), Syntax.PROTO_2, fontWeight);
        }

        FontWeight(int i) {
            this.value = i;
        }

        public static final FontWeight fromValue(int i) {
            Companion.getClass();
            return Error.Code.Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum HorizontalAlignment implements WireEnum {
        HORIZONTAL_ALIGNMENT_UNSPECIFIED(0),
        HORIZONTAL_ALIGNMENT_START(1),
        HORIZONTAL_ALIGNMENT_CENTER_HORIZONTALLY(2),
        HORIZONTAL_ALIGNMENT_END(3);

        public static final Companion Companion;
        public final int value;

        public final class Companion {
            public static HorizontalAlignment fromValue(int i) {
                if (i == 0) {
                    return HorizontalAlignment.HORIZONTAL_ALIGNMENT_UNSPECIFIED;
                }
                if (i == 1) {
                    return HorizontalAlignment.HORIZONTAL_ALIGNMENT_START;
                }
                if (i == 2) {
                    return HorizontalAlignment.HORIZONTAL_ALIGNMENT_CENTER_HORIZONTALLY;
                }
                if (i != 3) {
                    return null;
                }
                return HorizontalAlignment.HORIZONTAL_ALIGNMENT_END;
            }
        }

        static {
            HorizontalAlignment horizontalAlignment = HORIZONTAL_ALIGNMENT_UNSPECIFIED;
            Companion = new Companion();
            new ComposePlatform$HorizontalAlignment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(HorizontalAlignment.class), Syntax.PROTO_2, horizontalAlignment);
        }

        HorizontalAlignment(int i) {
            this.value = i;
        }

        public static final HorizontalAlignment fromValue(int i) {
            Companion.getClass();
            return Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum HorizontalArrangement implements WireEnum {
        HORIZONTAL_ARRANGEMENT_UNSPECIFIED(0),
        HORIZONTAL_ARRANGEMENT_START(1),
        HORIZONTAL_ARRANGEMENT_CENTER(2),
        HORIZONTAL_ARRANGEMENT_END(3),
        HORIZONTAL_ARRANGEMENT_SPACE_BETWEEN(4),
        HORIZONTAL_ARRANGEMENT_SPACE_AROUND(5),
        HORIZONTAL_ARRANGEMENT_SPACE_EVENLY(6),
        HORIZONTAL_ARRANGEMENT_SPACED_BY(7);

        public static final Companion Companion;
        public final int value;

        public final class Companion {
            public static HorizontalArrangement fromValue(int i) {
                switch (i) {
                    case 0:
                        return HorizontalArrangement.HORIZONTAL_ARRANGEMENT_UNSPECIFIED;
                    case 1:
                        return HorizontalArrangement.HORIZONTAL_ARRANGEMENT_START;
                    case 2:
                        return HorizontalArrangement.HORIZONTAL_ARRANGEMENT_CENTER;
                    case 3:
                        return HorizontalArrangement.HORIZONTAL_ARRANGEMENT_END;
                    case 4:
                        return HorizontalArrangement.HORIZONTAL_ARRANGEMENT_SPACE_BETWEEN;
                    case 5:
                        return HorizontalArrangement.HORIZONTAL_ARRANGEMENT_SPACE_AROUND;
                    case 6:
                        return HorizontalArrangement.HORIZONTAL_ARRANGEMENT_SPACE_EVENLY;
                    case 7:
                        return HorizontalArrangement.HORIZONTAL_ARRANGEMENT_SPACED_BY;
                    default:
                        return null;
                }
            }
        }

        static {
            HorizontalArrangement horizontalArrangement = HORIZONTAL_ARRANGEMENT_UNSPECIFIED;
            Companion = new Companion();
            new ComposePlatform$HorizontalArrangement$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(HorizontalArrangement.class), Syntax.PROTO_2, horizontalArrangement);
        }

        HorizontalArrangement(int i) {
            this.value = i;
        }

        public static final HorizontalArrangement fromValue(int i) {
            Companion.getClass();
            return Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class Image extends Message {
        public static final ProtoAdapter ADAPTER = new ComposePlatform$Image$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Image.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Image", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final Expression resource_name;
        public final ImageURL url;

        public final class ImageURL extends Message {
            public static final ProtoAdapter ADAPTER = new ComposePlatform$Image$ImageURL$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ImageURL.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Image.ImageURL", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Expression dark;
            public final Expression light;

            public final class Builder extends Message.Builder {
                public final /* synthetic */ int $r8$classId;
                public Expression dark;
                public Expression light;

                public /* synthetic */ Builder(int i) {
                    this.$r8$classId = i;
                }

                @Override // com.squareup.wire.Message.Builder
                public final Message build() {
                    switch (this.$r8$classId) {
                        case 0:
                            Expression expression = this.light;
                            if (expression != null) {
                                return new ImageURL(expression, this.dark, buildUnknownFields());
                            }
                            TransactorKt.missingRequiredFields(expression, "light");
                            throw null;
                        case 1:
                            return new Color.ColorValue(this.light, this.dark, buildUnknownFields());
                        case 2:
                            return new Modifier.WrapContentSize(this.light, this.dark, buildUnknownFields());
                        case 3:
                            Expression expression2 = this.light;
                            if (expression2 == null) {
                                TransactorKt.missingRequiredFields(expression2, "verdict");
                                throw null;
                            }
                            Expression expression3 = this.dark;
                            if (expression3 != null) {
                                return new MoneybotScaffold.Answer.Decision(expression2, expression3, buildUnknownFields());
                            }
                            TransactorKt.missingRequiredFields(expression3, "elaboration");
                            throw null;
                        case 4:
                            Expression expression4 = this.light;
                            if (expression4 == null) {
                                TransactorKt.missingRequiredFields(expression4, AnnotatedPrivateKey.LABEL);
                                throw null;
                            }
                            Expression expression5 = this.dark;
                            if (expression5 != null) {
                                return new MoneybotScaffold.Answer.DirectAnswer(expression4, expression5, buildUnknownFields());
                            }
                            TransactorKt.missingRequiredFields(expression5, "value_");
                            throw null;
                        case 5:
                            Expression expression6 = this.light;
                            if (expression6 != null) {
                                return new MoneybotScaffold.Answer.StatusExplanation(expression6, this.dark, buildUnknownFields());
                            }
                            TransactorKt.missingRequiredFields(expression6, "heading");
                            throw null;
                        default:
                            Expression expression7 = this.light;
                            if (expression7 == null) {
                                TransactorKt.missingRequiredFields(expression7, AnnotatedPrivateKey.LABEL);
                                throw null;
                            }
                            Expression expression8 = this.dark;
                            if (expression8 != null) {
                                return new MoneybotScaffold.Evidence.MerchantCard.Summary.Flow(expression7, expression8, buildUnknownFields());
                            }
                            TransactorKt.missingRequiredFields(expression8, "value_");
                            throw null;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ImageURL(Expression expression, Expression expression2, ByteString byteString) {
                super(ADAPTER, byteString);
                expression.getClass();
                byteString.getClass();
                this.light = expression;
                this.dark = expression2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ImageURL)) {
                    return false;
                }
                ImageURL imageURL = (ImageURL) obj;
                return Intrinsics.areEqual(unknownFields(), imageURL.unknownFields()) && Intrinsics.areEqual(this.light, imageURL.light) && Intrinsics.areEqual(this.dark, imageURL.dark);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int m = Matcher$$ExternalSyntheticOutline0.m(this.light, unknownFields().hashCode() * 37, 37);
                Expression expression = this.dark;
                int hashCode = m + (expression != null ? expression.hashCode() : 0);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Builder builder = new Builder(0);
                builder.light = this.light;
                builder.dark = this.dark;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Matcher$$ExternalSyntheticOutline0.m("light=", this.light, arrayList);
                Expression expression = this.dark;
                if (expression != null) {
                    Matcher$$ExternalSyntheticOutline0.m("dark=", expression, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "ImageURL{", "}", 0, null, null, 56);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Image(Expression expression, ImageURL imageURL, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.resource_name = expression;
            this.url = imageURL;
            if (TransactorKt.countNonNull(expression, imageURL) <= 1) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("At most one of resource_name, url may be non-null");
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            return Intrinsics.areEqual(unknownFields(), image.unknownFields()) && Intrinsics.areEqual(this.resource_name, image.resource_name) && Intrinsics.areEqual(this.url, image.url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Expression expression = this.resource_name;
            int hashCode2 = (hashCode + (expression != null ? expression.hashCode() : 0)) * 37;
            ImageURL imageURL = this.url;
            int hashCode3 = hashCode2 + (imageURL != null ? imageURL.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Member.Builder builder = new Member.Builder(17);
            builder.customer_token = this.resource_name;
            builder.sponsorship_tier = this.url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Expression expression = this.resource_name;
            if (expression != null) {
                Matcher$$ExternalSyntheticOutline0.m("resource_name=", expression, arrayList);
            }
            ImageURL imageURL = this.url;
            if (imageURL != null) {
                arrayList.add("url=" + imageURL);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Image{", "}", 0, null, null, 56);
        }
    }

    public final class Modifier extends Message {
        public static final ProtoAdapter ADAPTER = new ComposePlatform$Modifier$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Modifier.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Modifier", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final Alpha alpha;
        public final Background background;
        public final Border border;
        public final Clip clip;
        public final ContentColor content_color;
        public final Overlay overlay;
        public final Padding padding;
        public final Size size;
        public final TextStyle text_style;
        public final Tint tint;
        public final WrapContentSize wrap_content_size;

        public final class Alpha extends Message {
            public static final ProtoAdapter ADAPTER = new ComposePlatform$Modifier$Alpha$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Alpha.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Modifier.Alpha", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Expression alpha;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Alpha(Expression expression, ByteString byteString) {
                super(ADAPTER, byteString);
                expression.getClass();
                byteString.getClass();
                this.alpha = expression;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Alpha)) {
                    return false;
                }
                Alpha alpha = (Alpha) obj;
                return Intrinsics.areEqual(unknownFields(), alpha.unknownFields()) && Intrinsics.areEqual(this.alpha, alpha.alpha);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.alpha.hashCode() + (unknownFields().hashCode() * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Navigate.Dismiss.RetreatToView.Builder builder = new Navigate.Dismiss.RetreatToView.Builder(1);
                builder.view_slug = this.alpha;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Matcher$$ExternalSyntheticOutline0.m("alpha=", this.alpha, arrayList);
                return CollectionsKt.joinToString$default(arrayList, ", ", "Alpha{", "}", 0, null, null, 56);
            }
        }

        public final class Background extends Message {
            public static final ProtoAdapter ADAPTER = new ComposePlatform$Modifier$Background$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Background.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Modifier.Background", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Color color;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Background(Color color, ByteString byteString) {
                super(ADAPTER, byteString);
                color.getClass();
                byteString.getClass();
                this.color = color;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Background)) {
                    return false;
                }
                Background background = (Background) obj;
                return Intrinsics.areEqual(unknownFields(), background.unknownFields()) && Intrinsics.areEqual(this.color, background.color);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.color.hashCode() + (unknownFields().hashCode() * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Tint.Builder builder = new Tint.Builder(1);
                builder.color = this.color;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("color=" + this.color);
                return CollectionsKt.joinToString$default(arrayList, ", ", "Background{", "}", 0, null, null, 56);
            }
        }

        public final class Border extends Message {
            public static final ProtoAdapter ADAPTER = new ComposePlatform$Modifier$Border$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Border.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Modifier.Border", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Color color;
            public final Expression corner_radius;
            public final Expression width;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Border(Color color, Expression expression, Expression expression2, ByteString byteString) {
                super(ADAPTER, byteString);
                color.getClass();
                byteString.getClass();
                this.color = color;
                this.width = expression;
                this.corner_radius = expression2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Border)) {
                    return false;
                }
                Border border = (Border) obj;
                return Intrinsics.areEqual(unknownFields(), border.unknownFields()) && Intrinsics.areEqual(this.color, border.color) && Intrinsics.areEqual(this.width, border.width) && Intrinsics.areEqual(this.corner_radius, border.corner_radius);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = (this.color.hashCode() + (unknownFields().hashCode() * 37)) * 37;
                Expression expression = this.width;
                int hashCode2 = (hashCode + (expression != null ? expression.hashCode() : 0)) * 37;
                Expression expression2 = this.corner_radius;
                int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(18);
                builder.withdrawalType = this.color;
                builder.customer_supplied_amount = this.width;
                builder.customer_token = this.corner_radius;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("color=" + this.color);
                Expression expression = this.width;
                if (expression != null) {
                    Matcher$$ExternalSyntheticOutline0.m("width=", expression, arrayList);
                }
                Expression expression2 = this.corner_radius;
                if (expression2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("corner_radius=", expression2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Border{", "}", 0, null, null, 56);
            }
        }

        public final class Clip extends Message {
            public static final ProtoAdapter ADAPTER = new ComposePlatform$Modifier$Clip$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Clip.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Modifier.Clip", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Expression corner_radius;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Clip(Expression expression, ByteString byteString) {
                super(ADAPTER, byteString);
                expression.getClass();
                byteString.getClass();
                this.corner_radius = expression;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Clip)) {
                    return false;
                }
                Clip clip = (Clip) obj;
                return Intrinsics.areEqual(unknownFields(), clip.unknownFields()) && Intrinsics.areEqual(this.corner_radius, clip.corner_radius);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.corner_radius.hashCode() + (unknownFields().hashCode() * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Navigate.Dismiss.RetreatToView.Builder builder = new Navigate.Dismiss.RetreatToView.Builder(2);
                builder.view_slug = this.corner_radius;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Matcher$$ExternalSyntheticOutline0.m("corner_radius=", this.corner_radius, arrayList);
                return CollectionsKt.joinToString$default(arrayList, ", ", "Clip{", "}", 0, null, null, 56);
            }
        }

        public final class ContentColor extends Message {
            public static final ProtoAdapter ADAPTER = new ComposePlatform$Modifier$ContentColor$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ContentColor.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Modifier.ContentColor", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Color color;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ContentColor(Color color, ByteString byteString) {
                super(ADAPTER, byteString);
                color.getClass();
                byteString.getClass();
                this.color = color;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ContentColor)) {
                    return false;
                }
                ContentColor contentColor = (ContentColor) obj;
                return Intrinsics.areEqual(unknownFields(), contentColor.unknownFields()) && Intrinsics.areEqual(this.color, contentColor.color);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.color.hashCode() + (unknownFields().hashCode() * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Tint.Builder builder = new Tint.Builder(2);
                builder.color = this.color;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("color=" + this.color);
                return CollectionsKt.joinToString$default(arrayList, ", ", "ContentColor{", "}", 0, null, null, 56);
            }
        }

        public final class Overlay extends Message {
            public static final ProtoAdapter ADAPTER = new ComposePlatform$Modifier$Overlay$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Overlay.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Modifier.Overlay", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Node content;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Overlay(Node node, ByteString byteString) {
                super(ADAPTER, byteString);
                node.getClass();
                byteString.getClass();
                this.content = node;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Overlay)) {
                    return false;
                }
                Overlay overlay = (Overlay) obj;
                return Intrinsics.areEqual(unknownFields(), overlay.unknownFields()) && Intrinsics.areEqual(this.content, overlay.content);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.content.hashCode() + (unknownFields().hashCode() * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                SubsectionBlock.Builder builder = new SubsectionBlock.Builder(11);
                builder.f1245type = this.content;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("content=" + this.content);
                return CollectionsKt.joinToString$default(arrayList, ", ", "Overlay{", "}", 0, null, null, 56);
            }
        }

        public final class Padding extends Message {
            public static final ProtoAdapter ADAPTER = new ComposePlatform$Modifier$Padding$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Padding.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Modifier.Padding", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Expression all;
            public final Expression bottom;
            public final Expression end;
            public final Expression start;
            public final Expression top;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Padding(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.top = expression;
                this.start = expression2;
                this.bottom = expression3;
                this.end = expression4;
                this.all = expression5;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Padding)) {
                    return false;
                }
                Padding padding = (Padding) obj;
                return Intrinsics.areEqual(unknownFields(), padding.unknownFields()) && Intrinsics.areEqual(this.top, padding.top) && Intrinsics.areEqual(this.start, padding.start) && Intrinsics.areEqual(this.bottom, padding.bottom) && Intrinsics.areEqual(this.end, padding.end) && Intrinsics.areEqual(this.all, padding.all);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Expression expression = this.top;
                int hashCode2 = (hashCode + (expression != null ? expression.hashCode() : 0)) * 37;
                Expression expression2 = this.start;
                int hashCode3 = (hashCode2 + (expression2 != null ? expression2.hashCode() : 0)) * 37;
                Expression expression3 = this.bottom;
                int hashCode4 = (hashCode3 + (expression3 != null ? expression3.hashCode() : 0)) * 37;
                Expression expression4 = this.end;
                int hashCode5 = (hashCode4 + (expression4 != null ? expression4.hashCode() : 0)) * 37;
                Expression expression5 = this.all;
                int hashCode6 = hashCode5 + (expression5 != null ? expression5.hashCode() : 0);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Node.Builder builder = new Node.Builder(5);
                builder.is_included = this.top;
                builder.for_each = this.start;
                builder.moneybot_scaffold = this.bottom;
                builder.compose_platform = this.end;
                builder.motion = this.all;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Expression expression = this.top;
                if (expression != null) {
                    Matcher$$ExternalSyntheticOutline0.m("top=", expression, arrayList);
                }
                Expression expression2 = this.start;
                if (expression2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("start=", expression2, arrayList);
                }
                Expression expression3 = this.bottom;
                if (expression3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("bottom=", expression3, arrayList);
                }
                Expression expression4 = this.end;
                if (expression4 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("end=", expression4, arrayList);
                }
                Expression expression5 = this.all;
                if (expression5 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("all=", expression5, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Padding{", "}", 0, null, null, 56);
            }
        }

        public final class Size extends Message {
            public static final ProtoAdapter ADAPTER = new ComposePlatform$Modifier$Size$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Size.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Modifier.Size", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Expression fill_max_height;
            public final Expression fill_max_width;
            public final Expression height;
            public final Expression max_height;
            public final Expression max_width;
            public final Expression min_height;
            public final Expression min_width;
            public final Expression width;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Size(Expression expression, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.width = expression;
                this.height = expression2;
                this.min_width = expression3;
                this.max_width = expression4;
                this.min_height = expression5;
                this.max_height = expression6;
                this.fill_max_width = expression7;
                this.fill_max_height = expression8;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Size)) {
                    return false;
                }
                Size size = (Size) obj;
                return Intrinsics.areEqual(unknownFields(), size.unknownFields()) && Intrinsics.areEqual(this.width, size.width) && Intrinsics.areEqual(this.height, size.height) && Intrinsics.areEqual(this.min_width, size.min_width) && Intrinsics.areEqual(this.max_width, size.max_width) && Intrinsics.areEqual(this.min_height, size.min_height) && Intrinsics.areEqual(this.max_height, size.max_height) && Intrinsics.areEqual(this.fill_max_width, size.fill_max_width) && Intrinsics.areEqual(this.fill_max_height, size.fill_max_height);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Expression expression = this.width;
                int hashCode2 = (hashCode + (expression != null ? expression.hashCode() : 0)) * 37;
                Expression expression2 = this.height;
                int hashCode3 = (hashCode2 + (expression2 != null ? expression2.hashCode() : 0)) * 37;
                Expression expression3 = this.min_width;
                int hashCode4 = (hashCode3 + (expression3 != null ? expression3.hashCode() : 0)) * 37;
                Expression expression4 = this.max_width;
                int hashCode5 = (hashCode4 + (expression4 != null ? expression4.hashCode() : 0)) * 37;
                Expression expression5 = this.min_height;
                int hashCode6 = (hashCode5 + (expression5 != null ? expression5.hashCode() : 0)) * 37;
                Expression expression6 = this.max_height;
                int hashCode7 = (hashCode6 + (expression6 != null ? expression6.hashCode() : 0)) * 37;
                Expression expression7 = this.fill_max_width;
                int hashCode8 = (hashCode7 + (expression7 != null ? expression7.hashCode() : 0)) * 37;
                Expression expression8 = this.fill_max_height;
                int hashCode9 = hashCode8 + (expression8 != null ? expression8.hashCode() : 0);
                this.hashCode = hashCode9;
                return hashCode9;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Badge.Builder builder = new Badge.Builder(3, false);
                builder.external_token = this.width;
                builder.customer_token = this.height;
                builder.external_version = this.min_width;
                builder.updated_at = this.max_width;
                builder.created_at = this.min_height;
                builder.is_badged = this.max_height;
                builder.item_type = this.fill_max_width;
                builder.count_groups = this.fill_max_height;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Expression expression = this.width;
                if (expression != null) {
                    Matcher$$ExternalSyntheticOutline0.m("width=", expression, arrayList);
                }
                Expression expression2 = this.height;
                if (expression2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("height=", expression2, arrayList);
                }
                Expression expression3 = this.min_width;
                if (expression3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("min_width=", expression3, arrayList);
                }
                Expression expression4 = this.max_width;
                if (expression4 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("max_width=", expression4, arrayList);
                }
                Expression expression5 = this.min_height;
                if (expression5 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("min_height=", expression5, arrayList);
                }
                Expression expression6 = this.max_height;
                if (expression6 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("max_height=", expression6, arrayList);
                }
                Expression expression7 = this.fill_max_width;
                if (expression7 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("fill_max_width=", expression7, arrayList);
                }
                Expression expression8 = this.fill_max_height;
                if (expression8 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("fill_max_height=", expression8, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Size{", "}", 0, null, null, 56);
            }
        }

        public final class TextStyle extends Message {
            public static final ProtoAdapter ADAPTER = new ComposePlatform$Modifier$TextStyle$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextStyle.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Modifier.TextStyle", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Expression size;
            public final Expression text_align;
            public final Expression typography;
            public final Expression weight;

            public final class Builder extends Message.Builder {
                public final /* synthetic */ int $r8$classId;
                public Expression size;
                public Expression text_align;
                public Expression typography;
                public Expression weight;

                public /* synthetic */ Builder(int i) {
                    this.$r8$classId = i;
                }

                @Override // com.squareup.wire.Message.Builder
                public final Message build() {
                    switch (this.$r8$classId) {
                        case 0:
                            return new TextStyle(this.typography, this.size, this.weight, this.text_align, buildUnknownFields());
                        default:
                            Expression expression = this.typography;
                            Expression expression2 = this.size;
                            if (expression2 == null) {
                                TransactorKt.missingRequiredFields(expression2, "title");
                                throw null;
                            }
                            Expression expression3 = this.weight;
                            Expression expression4 = this.text_align;
                            if (expression4 != null) {
                                return new MoneybotScaffold.Evidence.MerchantCard.Transaction(expression, expression2, expression3, expression4, buildUnknownFields());
                            }
                            TransactorKt.missingRequiredFields(expression4, "amount");
                            throw null;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextStyle(Expression expression, Expression expression2, Expression expression3, Expression expression4, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.typography = expression;
                this.size = expression2;
                this.weight = expression3;
                this.text_align = expression4;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TextStyle)) {
                    return false;
                }
                TextStyle textStyle = (TextStyle) obj;
                return Intrinsics.areEqual(unknownFields(), textStyle.unknownFields()) && Intrinsics.areEqual(this.typography, textStyle.typography) && Intrinsics.areEqual(this.size, textStyle.size) && Intrinsics.areEqual(this.weight, textStyle.weight) && Intrinsics.areEqual(this.text_align, textStyle.text_align);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Expression expression = this.typography;
                int hashCode2 = (hashCode + (expression != null ? expression.hashCode() : 0)) * 37;
                Expression expression2 = this.size;
                int hashCode3 = (hashCode2 + (expression2 != null ? expression2.hashCode() : 0)) * 37;
                Expression expression3 = this.weight;
                int hashCode4 = (hashCode3 + (expression3 != null ? expression3.hashCode() : 0)) * 37;
                Expression expression4 = this.text_align;
                int hashCode5 = hashCode4 + (expression4 != null ? expression4.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Builder builder = new Builder(0);
                builder.typography = this.typography;
                builder.size = this.size;
                builder.weight = this.weight;
                builder.text_align = this.text_align;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Expression expression = this.typography;
                if (expression != null) {
                    Matcher$$ExternalSyntheticOutline0.m("typography=", expression, arrayList);
                }
                Expression expression2 = this.size;
                if (expression2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("size=", expression2, arrayList);
                }
                Expression expression3 = this.weight;
                if (expression3 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("weight=", expression3, arrayList);
                }
                Expression expression4 = this.text_align;
                if (expression4 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("text_align=", expression4, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "TextStyle{", "}", 0, null, null, 56);
            }
        }

        public final class Tint extends Message {
            public static final ProtoAdapter ADAPTER = new ComposePlatform$Modifier$Tint$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Tint.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Modifier.Tint", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Color color;

            public final class Builder extends Message.Builder {
                public final /* synthetic */ int $r8$classId;
                public Color color;

                public /* synthetic */ Builder(int i) {
                    this.$r8$classId = i;
                }

                @Override // com.squareup.wire.Message.Builder
                public final Message build() {
                    switch (this.$r8$classId) {
                        case 0:
                            Color color = this.color;
                            if (color != null) {
                                return new Tint(color, buildUnknownFields());
                            }
                            TransactorKt.missingRequiredFields(color, "color");
                            throw null;
                        case 1:
                            Color color2 = this.color;
                            if (color2 != null) {
                                return new Background(color2, buildUnknownFields());
                            }
                            TransactorKt.missingRequiredFields(color2, "color");
                            throw null;
                        default:
                            Color color3 = this.color;
                            if (color3 != null) {
                                return new ContentColor(color3, buildUnknownFields());
                            }
                            TransactorKt.missingRequiredFields(color3, "color");
                            throw null;
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Tint(Color color, ByteString byteString) {
                super(ADAPTER, byteString);
                color.getClass();
                byteString.getClass();
                this.color = color;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Tint)) {
                    return false;
                }
                Tint tint = (Tint) obj;
                return Intrinsics.areEqual(unknownFields(), tint.unknownFields()) && Intrinsics.areEqual(this.color, tint.color);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = this.color.hashCode() + (unknownFields().hashCode() * 37);
                this.hashCode = hashCode;
                return hashCode;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Builder builder = new Builder(0);
                builder.color = this.color;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("color=" + this.color);
                return CollectionsKt.joinToString$default(arrayList, ", ", "Tint{", "}", 0, null, null, 56);
            }
        }

        public final class WrapContentSize extends Message {
            public static final ProtoAdapter ADAPTER = new ComposePlatform$Modifier$WrapContentSize$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WrapContentSize.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Modifier.WrapContentSize", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
            public final Expression horizontal;
            public final Expression vertical;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WrapContentSize(Expression expression, Expression expression2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.horizontal = expression;
                this.vertical = expression2;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof WrapContentSize)) {
                    return false;
                }
                WrapContentSize wrapContentSize = (WrapContentSize) obj;
                return Intrinsics.areEqual(unknownFields(), wrapContentSize.unknownFields()) && Intrinsics.areEqual(this.horizontal, wrapContentSize.horizontal) && Intrinsics.areEqual(this.vertical, wrapContentSize.vertical);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                Expression expression = this.horizontal;
                int hashCode2 = (hashCode + (expression != null ? expression.hashCode() : 0)) * 37;
                Expression expression2 = this.vertical;
                int hashCode3 = hashCode2 + (expression2 != null ? expression2.hashCode() : 0);
                this.hashCode = hashCode3;
                return hashCode3;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Image.ImageURL.Builder builder = new Image.ImageURL.Builder(2);
                builder.light = this.horizontal;
                builder.dark = this.vertical;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                Expression expression = this.horizontal;
                if (expression != null) {
                    Matcher$$ExternalSyntheticOutline0.m("horizontal=", expression, arrayList);
                }
                Expression expression2 = this.vertical;
                if (expression2 != null) {
                    Matcher$$ExternalSyntheticOutline0.m("vertical=", expression2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "WrapContentSize{", "}", 0, null, null, 56);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Modifier(Size size, Padding padding, ContentColor contentColor, Background background, TextStyle textStyle, Alpha alpha, Clip clip, Overlay overlay, Border border, WrapContentSize wrapContentSize, Tint tint, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.size = size;
            this.padding = padding;
            this.content_color = contentColor;
            this.background = background;
            this.text_style = textStyle;
            this.alpha = alpha;
            this.clip = clip;
            this.overlay = overlay;
            this.border = border;
            this.wrap_content_size = wrapContentSize;
            this.tint = tint;
            if (TransactorKt.countNonNull(size, padding, contentColor, background, textStyle, alpha, clip, overlay, border, wrapContentSize, tint) <= 1) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("At most one of size, padding, content_color, background, text_style, alpha, clip, overlay, border, wrap_content_size, tint may be non-null");
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Modifier)) {
                return false;
            }
            Modifier modifier = (Modifier) obj;
            return Intrinsics.areEqual(unknownFields(), modifier.unknownFields()) && Intrinsics.areEqual(this.size, modifier.size) && Intrinsics.areEqual(this.padding, modifier.padding) && Intrinsics.areEqual(this.content_color, modifier.content_color) && Intrinsics.areEqual(this.background, modifier.background) && Intrinsics.areEqual(this.text_style, modifier.text_style) && Intrinsics.areEqual(this.alpha, modifier.alpha) && Intrinsics.areEqual(this.clip, modifier.clip) && Intrinsics.areEqual(this.overlay, modifier.overlay) && Intrinsics.areEqual(this.border, modifier.border) && Intrinsics.areEqual(this.wrap_content_size, modifier.wrap_content_size) && Intrinsics.areEqual(this.tint, modifier.tint);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Size size = this.size;
            int hashCode2 = (hashCode + (size != null ? size.hashCode() : 0)) * 37;
            Padding padding = this.padding;
            int hashCode3 = (hashCode2 + (padding != null ? padding.hashCode() : 0)) * 37;
            ContentColor contentColor = this.content_color;
            int hashCode4 = (hashCode3 + (contentColor != null ? contentColor.hashCode() : 0)) * 37;
            Background background = this.background;
            int hashCode5 = (hashCode4 + (background != null ? background.hashCode() : 0)) * 37;
            TextStyle textStyle = this.text_style;
            int hashCode6 = (hashCode5 + (textStyle != null ? textStyle.hashCode() : 0)) * 37;
            Alpha alpha = this.alpha;
            int hashCode7 = (hashCode6 + (alpha != null ? alpha.hashCode() : 0)) * 37;
            Clip clip = this.clip;
            int hashCode8 = (hashCode7 + (clip != null ? clip.hashCode() : 0)) * 37;
            Overlay overlay = this.overlay;
            int hashCode9 = (hashCode8 + (overlay != null ? overlay.hashCode() : 0)) * 37;
            Border border = this.border;
            int hashCode10 = (hashCode9 + (border != null ? border.hashCode() : 0)) * 37;
            WrapContentSize wrapContentSize = this.wrap_content_size;
            int hashCode11 = (hashCode10 + (wrapContentSize != null ? wrapContentSize.hashCode() : 0)) * 37;
            Tint tint = this.tint;
            int hashCode12 = hashCode11 + (tint != null ? tint.hashCode() : 0);
            this.hashCode = hashCode12;
            return hashCode12;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Job.Builder builder = new Job.Builder(2);
            builder.token = this.size;
            builder.merchant_token = this.padding;
            builder.title = this.content_color;
            builder.default_wage = this.background;
            builder.created_at_timestamp_ms = this.text_style;
            builder.updated_at_timestamp_ms = this.alpha;
            builder.deleted_at_timestamp_ms = this.clip;
            builder.team_member_count = this.overlay;
            builder.version = this.border;
            builder.tip_eligible = this.wrap_content_size;
            builder.default_color_scheme = this.tint;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Size size = this.size;
            if (size != null) {
                arrayList.add("size=" + size);
            }
            Padding padding = this.padding;
            if (padding != null) {
                arrayList.add("padding=" + padding);
            }
            ContentColor contentColor = this.content_color;
            if (contentColor != null) {
                arrayList.add("content_color=" + contentColor);
            }
            Background background = this.background;
            if (background != null) {
                arrayList.add("background=" + background);
            }
            TextStyle textStyle = this.text_style;
            if (textStyle != null) {
                arrayList.add("text_style=" + textStyle);
            }
            Alpha alpha = this.alpha;
            if (alpha != null) {
                arrayList.add("alpha=" + alpha);
            }
            Clip clip = this.clip;
            if (clip != null) {
                arrayList.add("clip=" + clip);
            }
            Overlay overlay = this.overlay;
            if (overlay != null) {
                arrayList.add("overlay=" + overlay);
            }
            Border border = this.border;
            if (border != null) {
                arrayList.add("border=" + border);
            }
            WrapContentSize wrapContentSize = this.wrap_content_size;
            if (wrapContentSize != null) {
                arrayList.add("wrap_content_size=" + wrapContentSize);
            }
            Tint tint = this.tint;
            if (tint != null) {
                arrayList.add("tint=" + tint);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Modifier{", "}", 0, null, null, 56);
        }
    }

    public final class ProgressIndicator extends Message {
        public static final ProtoAdapter ADAPTER = new ComposePlatform$ProgressIndicator$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProgressIndicator.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.ProgressIndicator", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final Expression label;
        public final Expression style;
        public final Expression value_;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProgressIndicator(Expression expression, Expression expression2, Expression expression3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.value_ = expression;
            this.label = expression2;
            this.style = expression3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ProgressIndicator)) {
                return false;
            }
            ProgressIndicator progressIndicator = (ProgressIndicator) obj;
            return Intrinsics.areEqual(unknownFields(), progressIndicator.unknownFields()) && Intrinsics.areEqual(this.value_, progressIndicator.value_) && Intrinsics.areEqual(this.label, progressIndicator.label) && Intrinsics.areEqual(this.style, progressIndicator.style);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Expression expression = this.value_;
            int hashCode2 = (hashCode + (expression != null ? expression.hashCode() : 0)) * 37;
            Expression expression2 = this.label;
            int hashCode3 = (hashCode2 + (expression2 != null ? expression2.hashCode() : 0)) * 37;
            Expression expression3 = this.style;
            int hashCode4 = hashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ConditionalOp.Builder builder = new ConditionalOp.Builder(1);
            builder.condition = this.value_;
            builder.then_expr = this.label;
            builder.else_expr = this.style;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Expression expression = this.value_;
            if (expression != null) {
                Matcher$$ExternalSyntheticOutline0.m("value_=", expression, arrayList);
            }
            Expression expression2 = this.label;
            if (expression2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("label=", expression2, arrayList);
            }
            Expression expression3 = this.style;
            if (expression3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("style=", expression3, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ProgressIndicator{", "}", 0, null, null, 56);
        }
    }

    public enum ProgressStyle implements WireEnum {
        PROGRESS_STYLE_UNSPECIFIED(0),
        PROGRESS_STYLE_LINEAR(1),
        PROGRESS_STYLE_CIRCULAR(2);

        public static final WorkCookieJar Companion;
        public final int value;

        static {
            ProgressStyle progressStyle = PROGRESS_STYLE_UNSPECIFIED;
            Companion = new WorkCookieJar(3);
            new ComposePlatform$ProgressStyle$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ProgressStyle.class), Syntax.PROTO_2, progressStyle);
        }

        ProgressStyle(int i) {
            this.value = i;
        }

        public static final ProgressStyle fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return PROGRESS_STYLE_UNSPECIFIED;
            }
            if (i == 1) {
                return PROGRESS_STYLE_LINEAR;
            }
            if (i != 2) {
                return null;
            }
            return PROGRESS_STYLE_CIRCULAR;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class Row extends Message {
        public static final ProtoAdapter ADAPTER = new ComposePlatform$Row$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Row.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Row", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final List children;
        public final Expression horizontal_arrangement;
        public final Expression spacing;
        public final Expression vertical_alignment;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public List children;
            public Expression horizontal_arrangement;
            public Expression spacing;
            public Expression vertical_alignment;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        return new Row(this.children, this.horizontal_arrangement, this.spacing, this.vertical_alignment, buildUnknownFields());
                    default:
                        return new Column(this.children, this.horizontal_arrangement, this.spacing, this.vertical_alignment, buildUnknownFields());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Row(List list, Expression expression, Expression expression2, Expression expression3, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.horizontal_arrangement = expression;
            this.spacing = expression2;
            this.vertical_alignment = expression3;
            this.children = TransactorKt.immutableCopyOf("children", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Row)) {
                return false;
            }
            Row row = (Row) obj;
            return Intrinsics.areEqual(unknownFields(), row.unknownFields()) && Intrinsics.areEqual(this.children, row.children) && Intrinsics.areEqual(this.horizontal_arrangement, row.horizontal_arrangement) && Intrinsics.areEqual(this.spacing, row.spacing) && Intrinsics.areEqual(this.vertical_alignment, row.vertical_alignment);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.children);
            Expression expression = this.horizontal_arrangement;
            int hashCode = (m + (expression != null ? expression.hashCode() : 0)) * 37;
            Expression expression2 = this.spacing;
            int hashCode2 = (hashCode + (expression2 != null ? expression2.hashCode() : 0)) * 37;
            Expression expression3 = this.vertical_alignment;
            int hashCode3 = hashCode2 + (expression3 != null ? expression3.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.children = this.children;
            builder.horizontal_arrangement = this.horizontal_arrangement;
            builder.spacing = this.spacing;
            builder.vertical_alignment = this.vertical_alignment;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.children;
            if (!list.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("children=", arrayList, list);
            }
            Expression expression = this.horizontal_arrangement;
            if (expression != null) {
                Matcher$$ExternalSyntheticOutline0.m("horizontal_arrangement=", expression, arrayList);
            }
            Expression expression2 = this.spacing;
            if (expression2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("spacing=", expression2, arrayList);
            }
            Expression expression3 = this.vertical_alignment;
            if (expression3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("vertical_alignment=", expression3, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Row{", "}", 0, null, null, 56);
        }
    }

    public final class Slider extends Message {
        public static final ProtoAdapter ADAPTER = new ComposePlatform$Slider$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Slider.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Slider", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final Binding binding;
        public final Expression maximum;
        public final Expression minimum;
        public final Expression steps;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Slider(Expression expression, Expression expression2, Expression expression3, Binding binding, ByteString byteString) {
            super(ADAPTER, byteString);
            binding.getClass();
            byteString.getClass();
            this.minimum = expression;
            this.maximum = expression2;
            this.steps = expression3;
            this.binding = binding;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Slider)) {
                return false;
            }
            Slider slider = (Slider) obj;
            return Intrinsics.areEqual(unknownFields(), slider.unknownFields()) && Intrinsics.areEqual(this.minimum, slider.minimum) && Intrinsics.areEqual(this.maximum, slider.maximum) && Intrinsics.areEqual(this.steps, slider.steps) && Intrinsics.areEqual(this.binding, slider.binding);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Expression expression = this.minimum;
            int hashCode2 = (hashCode + (expression != null ? expression.hashCode() : 0)) * 37;
            Expression expression2 = this.maximum;
            int hashCode3 = (hashCode2 + (expression2 != null ? expression2.hashCode() : 0)) * 37;
            Expression expression3 = this.steps;
            int hashCode4 = this.binding.hashCode() + ((hashCode3 + (expression3 != null ? expression3.hashCode() : 0)) * 37);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            ForEach.Builder builder = new ForEach.Builder(7);
            builder.collection = this.minimum;
            builder.template = this.maximum;
            builder.item_variable = this.steps;
            builder.source = this.binding;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Expression expression = this.minimum;
            if (expression != null) {
                Matcher$$ExternalSyntheticOutline0.m("minimum=", expression, arrayList);
            }
            Expression expression2 = this.maximum;
            if (expression2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("maximum=", expression2, arrayList);
            }
            Expression expression3 = this.steps;
            if (expression3 != null) {
                Matcher$$ExternalSyntheticOutline0.m("steps=", expression3, arrayList);
            }
            arrayList.add("binding=" + this.binding);
            return CollectionsKt.joinToString$default(arrayList, ", ", "Slider{", "}", 0, null, null, 56);
        }
    }

    public final class Switch extends Message {
        public static final ProtoAdapter ADAPTER = new ComposePlatform$Switch$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Switch.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Switch", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final Binding binding;
        public final Expression label;

        public final class Builder extends Message.Builder {
            public final /* synthetic */ int $r8$classId;
            public Binding binding;
            public Expression label;

            public /* synthetic */ Builder(int i) {
                this.$r8$classId = i;
            }

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                switch (this.$r8$classId) {
                    case 0:
                        Expression expression = this.label;
                        if (expression == null) {
                            TransactorKt.missingRequiredFields(expression, AnnotatedPrivateKey.LABEL);
                            throw null;
                        }
                        Binding binding = this.binding;
                        if (binding != null) {
                            return new Switch(expression, binding, buildUnknownFields());
                        }
                        TransactorKt.missingRequiredFields(binding, "binding");
                        throw null;
                    default:
                        Expression expression2 = this.label;
                        if (expression2 == null) {
                            TransactorKt.missingRequiredFields(expression2, AnnotatedPrivateKey.LABEL);
                            throw null;
                        }
                        Binding binding2 = this.binding;
                        if (binding2 != null) {
                            return new DatePicker(expression2, binding2, buildUnknownFields());
                        }
                        TransactorKt.missingRequiredFields(binding2, "binding");
                        throw null;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Switch(Expression expression, Binding binding, ByteString byteString) {
            super(ADAPTER, byteString);
            expression.getClass();
            binding.getClass();
            byteString.getClass();
            this.label = expression;
            this.binding = binding;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Switch)) {
                return false;
            }
            Switch r5 = (Switch) obj;
            return Intrinsics.areEqual(unknownFields(), r5.unknownFields()) && Intrinsics.areEqual(this.label, r5.label) && Intrinsics.areEqual(this.binding, r5.binding);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.binding.hashCode() + Matcher$$ExternalSyntheticOutline0.m(this.label, unknownFields().hashCode() * 37, 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder(0);
            builder.label = this.label;
            builder.binding = this.binding;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Matcher$$ExternalSyntheticOutline0.m("label=", this.label, arrayList);
            arrayList.add("binding=" + this.binding);
            return CollectionsKt.joinToString$default(arrayList, ", ", "Switch{", "}", 0, null, null, 56);
        }
    }

    public final class Text extends Message {
        public static final ProtoAdapter ADAPTER = new ComposePlatform$Text$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Text.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.Text", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final Expression text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(Expression expression, ByteString byteString) {
            super(ADAPTER, byteString);
            expression.getClass();
            byteString.getClass();
            this.text = expression;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            return Intrinsics.areEqual(unknownFields(), text.unknownFields()) && Intrinsics.areEqual(this.text, text.text);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.text.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Navigate.Dismiss.RetreatToView.Builder builder = new Navigate.Dismiss.RetreatToView.Builder(3);
            builder.view_slug = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Matcher$$ExternalSyntheticOutline0.m("text=", this.text, arrayList);
            return CollectionsKt.joinToString$default(arrayList, ", ", "Text{", "}", 0, null, null, 56);
        }
    }

    /* loaded from: classes7.dex */
    public enum TextAlign implements WireEnum {
        TEXT_ALIGN_UNSPECIFIED(0),
        TEXT_ALIGN_START(1),
        TEXT_ALIGN_END(2),
        TEXT_ALIGN_CENTER(3),
        TEXT_ALIGN_JUSTIFY(4);

        public static final Edge.Companion Companion;
        public final int value;

        static {
            TextAlign textAlign = TEXT_ALIGN_UNSPECIFIED;
            Companion = new Edge.Companion(3);
            new ComposePlatform$TextAlign$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TextAlign.class), Syntax.PROTO_2, textAlign);
        }

        TextAlign(int i) {
            this.value = i;
        }

        public static final TextAlign fromValue(int i) {
            Companion.getClass();
            return Edge.Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public final class TextField extends Message {
        public static final ProtoAdapter ADAPTER = new ComposePlatform$TextField$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextField.class), "type.googleapis.com/xyz.block.genie.v1.ComposePlatform.TextField", Syntax.PROTO_2, null, "xyz/block/genie/v1/node.proto");
        public final Binding binding;
        public final Expression label;
        public final Expression placeholder;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextField(Expression expression, Binding binding, Expression expression2, ByteString byteString) {
            super(ADAPTER, byteString);
            expression.getClass();
            binding.getClass();
            byteString.getClass();
            this.label = expression;
            this.binding = binding;
            this.placeholder = expression2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TextField)) {
                return false;
            }
            TextField textField = (TextField) obj;
            return Intrinsics.areEqual(unknownFields(), textField.unknownFields()) && Intrinsics.areEqual(this.label, textField.label) && Intrinsics.areEqual(this.binding, textField.binding) && Intrinsics.areEqual(this.placeholder, textField.placeholder);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = (this.binding.hashCode() + Matcher$$ExternalSyntheticOutline0.m(this.label, unknownFields().hashCode() * 37, 37)) * 37;
            Expression expression = this.placeholder;
            int hashCode2 = hashCode + (expression != null ? expression.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(19);
            builder.withdrawalType = this.label;
            builder.customer_supplied_amount = this.binding;
            builder.customer_token = this.placeholder;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Matcher$$ExternalSyntheticOutline0.m("label=", this.label, arrayList);
            arrayList.add("binding=" + this.binding);
            Expression expression = this.placeholder;
            if (expression != null) {
                Matcher$$ExternalSyntheticOutline0.m("placeholder=", expression, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TextField{", "}", 0, null, null, 56);
        }
    }

    public enum Typography implements WireEnum {
        TYPOGRAPHY_UNSPECIFIED(0),
        TYPOGRAPHY_DISPLAY_LARGE(1),
        TYPOGRAPHY_DISPLAY_MEDIUM(2),
        TYPOGRAPHY_DISPLAY_SMALL(3),
        TYPOGRAPHY_HEADLINE_LARGE(4),
        TYPOGRAPHY_HEADLINE_MEDIUM(5),
        TYPOGRAPHY_HEADLINE_SMALL(6),
        TYPOGRAPHY_TITLE_LARGE(7),
        TYPOGRAPHY_TITLE_MEDIUM(8),
        TYPOGRAPHY_TITLE_SMALL(9),
        TYPOGRAPHY_BODY_LARGE(10),
        TYPOGRAPHY_BODY_MEDIUM(11),
        TYPOGRAPHY_BODY_SMALL(12),
        TYPOGRAPHY_LABEL_LARGE(13),
        TYPOGRAPHY_LABEL_MEDIUM(14),
        TYPOGRAPHY_LABEL_SMALL(15);

        public static final Op.Companion Companion;
        public final int value;

        static {
            Typography typography = TYPOGRAPHY_UNSPECIFIED;
            Companion = new Op.Companion();
            new ComposePlatform$Typography$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Typography.class), Syntax.PROTO_2, typography);
        }

        Typography(int i) {
            this.value = i;
        }

        public static final Typography fromValue(int i) {
            Companion.getClass();
            return Op.Companion.m3670fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum VerticalAlignment implements WireEnum {
        VERTICAL_ALIGNMENT_UNSPECIFIED(0),
        VERTICAL_ALIGNMENT_TOP(1),
        VERTICAL_ALIGNMENT_CENTER_VERTICALLY(2),
        VERTICAL_ALIGNMENT_BOTTOM(3);

        public static final Companion Companion;
        public final int value;

        public final class Companion {
            public static VerticalAlignment fromValue(int i) {
                if (i == 0) {
                    return VerticalAlignment.VERTICAL_ALIGNMENT_UNSPECIFIED;
                }
                if (i == 1) {
                    return VerticalAlignment.VERTICAL_ALIGNMENT_TOP;
                }
                if (i == 2) {
                    return VerticalAlignment.VERTICAL_ALIGNMENT_CENTER_VERTICALLY;
                }
                if (i != 3) {
                    return null;
                }
                return VerticalAlignment.VERTICAL_ALIGNMENT_BOTTOM;
            }
        }

        static {
            VerticalAlignment verticalAlignment = VERTICAL_ALIGNMENT_UNSPECIFIED;
            Companion = new Companion();
            new ComposePlatform$VerticalAlignment$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(VerticalAlignment.class), Syntax.PROTO_2, verticalAlignment);
        }

        VerticalAlignment(int i) {
            this.value = i;
        }

        public static final VerticalAlignment fromValue(int i) {
            Companion.getClass();
            return Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum VerticalArrangement implements WireEnum {
        VERTICAL_ARRANGEMENT_UNSPECIFIED(0),
        VERTICAL_ARRANGEMENT_TOP(1),
        VERTICAL_ARRANGEMENT_CENTER(2),
        VERTICAL_ARRANGEMENT_BOTTOM(3),
        VERTICAL_ARRANGEMENT_SPACE_BETWEEN(4),
        VERTICAL_ARRANGEMENT_SPACE_AROUND(5),
        VERTICAL_ARRANGEMENT_SPACE_EVENLY(6),
        VERTICAL_ARRANGEMENT_SPACED_BY(7);

        public static final Companion Companion;
        public final int value;

        public final class Companion {
            public static VerticalArrangement fromValue(int i) {
                switch (i) {
                    case 0:
                        return VerticalArrangement.VERTICAL_ARRANGEMENT_UNSPECIFIED;
                    case 1:
                        return VerticalArrangement.VERTICAL_ARRANGEMENT_TOP;
                    case 2:
                        return VerticalArrangement.VERTICAL_ARRANGEMENT_CENTER;
                    case 3:
                        return VerticalArrangement.VERTICAL_ARRANGEMENT_BOTTOM;
                    case 4:
                        return VerticalArrangement.VERTICAL_ARRANGEMENT_SPACE_BETWEEN;
                    case 5:
                        return VerticalArrangement.VERTICAL_ARRANGEMENT_SPACE_AROUND;
                    case 6:
                        return VerticalArrangement.VERTICAL_ARRANGEMENT_SPACE_EVENLY;
                    case 7:
                        return VerticalArrangement.VERTICAL_ARRANGEMENT_SPACED_BY;
                    default:
                        return null;
                }
            }
        }

        static {
            VerticalArrangement verticalArrangement = VERTICAL_ARRANGEMENT_UNSPECIFIED;
            Companion = new Companion();
            new ComposePlatform$VerticalArrangement$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(VerticalArrangement.class), Syntax.PROTO_2, verticalArrangement);
        }

        VerticalArrangement(int i) {
            this.value = i;
        }

        public static final VerticalArrangement fromValue(int i) {
            Companion.getClass();
            return Companion.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposePlatform(Column column, Row row, Box box, Text text, Image image, Button button, TextField textField, Switch r9, Slider slider, DropdownMenu dropdownMenu, DatePicker datePicker, ProgressIndicator progressIndicator, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.column = column;
        this.row = row;
        this.box = box;
        this.text = text;
        this.image = image;
        this.button = button;
        this.text_field = textField;
        this.switch_control = r9;
        this.slider = slider;
        this.dropdown_menu = dropdownMenu;
        this.date_picker = datePicker;
        this.progress_indicator = progressIndicator;
        this.modifiers = TransactorKt.immutableCopyOf("modifiers", list);
        if (TransactorKt.countNonNull(column, row, box, text, image, button, textField, r9, slider, dropdownMenu, datePicker, progressIndicator) <= 1) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("At most one of column, row, box, text, image, button, text_field, switch_control, slider, dropdown_menu, date_picker, progress_indicator may be non-null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ComposePlatform)) {
            return false;
        }
        ComposePlatform composePlatform = (ComposePlatform) obj;
        return Intrinsics.areEqual(unknownFields(), composePlatform.unknownFields()) && Intrinsics.areEqual(this.column, composePlatform.column) && Intrinsics.areEqual(this.row, composePlatform.row) && Intrinsics.areEqual(this.box, composePlatform.box) && Intrinsics.areEqual(this.text, composePlatform.text) && Intrinsics.areEqual(this.image, composePlatform.image) && Intrinsics.areEqual(this.button, composePlatform.button) && Intrinsics.areEqual(this.text_field, composePlatform.text_field) && Intrinsics.areEqual(this.switch_control, composePlatform.switch_control) && Intrinsics.areEqual(this.slider, composePlatform.slider) && Intrinsics.areEqual(this.dropdown_menu, composePlatform.dropdown_menu) && Intrinsics.areEqual(this.date_picker, composePlatform.date_picker) && Intrinsics.areEqual(this.progress_indicator, composePlatform.progress_indicator) && Intrinsics.areEqual(this.modifiers, composePlatform.modifiers);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Column column = this.column;
        int hashCode2 = (hashCode + (column != null ? column.hashCode() : 0)) * 37;
        Row row = this.row;
        int hashCode3 = (hashCode2 + (row != null ? row.hashCode() : 0)) * 37;
        Box box = this.box;
        int hashCode4 = (hashCode3 + (box != null ? box.hashCode() : 0)) * 37;
        Text text = this.text;
        int hashCode5 = (hashCode4 + (text != null ? text.hashCode() : 0)) * 37;
        Image image = this.image;
        int hashCode6 = (hashCode5 + (image != null ? image.hashCode() : 0)) * 37;
        Button button = this.button;
        int hashCode7 = (hashCode6 + (button != null ? button.hashCode() : 0)) * 37;
        TextField textField = this.text_field;
        int hashCode8 = (hashCode7 + (textField != null ? textField.hashCode() : 0)) * 37;
        Switch r2 = this.switch_control;
        int hashCode9 = (hashCode8 + (r2 != null ? r2.hashCode() : 0)) * 37;
        Slider slider = this.slider;
        int hashCode10 = (hashCode9 + (slider != null ? slider.hashCode() : 0)) * 37;
        DropdownMenu dropdownMenu = this.dropdown_menu;
        int hashCode11 = (hashCode10 + (dropdownMenu != null ? dropdownMenu.hashCode() : 0)) * 37;
        DatePicker datePicker = this.date_picker;
        int hashCode12 = (hashCode11 + (datePicker != null ? datePicker.hashCode() : 0)) * 37;
        ProgressIndicator progressIndicator = this.progress_indicator;
        int hashCode13 = this.modifiers.hashCode() + ((hashCode12 + (progressIndicator != null ? progressIndicator.hashCode() : 0)) * 37);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        RewardStatus.Builder builder = new RewardStatus.Builder(1);
        builder.code_entry_enabled = this.column;
        builder.reward_screen_enabled = this.row;
        builder.minimum_code_length = this.box;
        builder.reward_button_priority = this.text;
        builder.completed_reward_payments = this.image;
        builder.available_reward_payments = this.button;
        builder.code_entry_client_route = this.text_field;
        builder.reward_button_text = this.switch_control;
        builder.reward_header_text = this.slider;
        builder.reward_main_text = this.dropdown_menu;
        builder.reward_payment_amount = this.date_picker;
        builder.expiration = this.progress_indicator;
        builder.referral_status_screen = this.modifiers;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Column column = this.column;
        if (column != null) {
            arrayList.add("column=" + column);
        }
        Row row = this.row;
        if (row != null) {
            arrayList.add("row=" + row);
        }
        Box box = this.box;
        if (box != null) {
            arrayList.add("box=" + box);
        }
        Text text = this.text;
        if (text != null) {
            arrayList.add("text=" + text);
        }
        Image image = this.image;
        if (image != null) {
            arrayList.add("image=" + image);
        }
        Button button = this.button;
        if (button != null) {
            arrayList.add("button=" + button);
        }
        TextField textField = this.text_field;
        if (textField != null) {
            arrayList.add("text_field=" + textField);
        }
        Switch r1 = this.switch_control;
        if (r1 != null) {
            arrayList.add("switch_control=" + r1);
        }
        Slider slider = this.slider;
        if (slider != null) {
            arrayList.add("slider=" + slider);
        }
        DropdownMenu dropdownMenu = this.dropdown_menu;
        if (dropdownMenu != null) {
            arrayList.add("dropdown_menu=" + dropdownMenu);
        }
        DatePicker datePicker = this.date_picker;
        if (datePicker != null) {
            arrayList.add("date_picker=" + datePicker);
        }
        ProgressIndicator progressIndicator = this.progress_indicator;
        if (progressIndicator != null) {
            arrayList.add("progress_indicator=" + progressIndicator);
        }
        List list = this.modifiers;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("modifiers=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ComposePlatform{", "}", 0, null, null, 56);
    }
}
