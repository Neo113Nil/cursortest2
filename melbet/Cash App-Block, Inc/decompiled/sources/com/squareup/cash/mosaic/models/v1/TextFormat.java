package com.squareup.cash.mosaic.models.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Color;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/squareup/cash/mosaic/models/v1/TextFormat;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/mosaic/models/v1/TextFormat$Builder;", "Lcom/squareup/protos/cash/ui/Color;", "text_color", "Lcom/squareup/protos/cash/ui/Color;", "text_border_color", "", "font_name", "Ljava/lang/String;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFormat extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TextFormat> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String font_name;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 1, tag = 2)
    public final Color text_border_color;

    @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 0, tag = 1)
    public final Color text_color;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/cash/mosaic/models/v1/TextFormat$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/mosaic/models/v1/TextFormat;", "<init>", "()V", "text_color", "Lcom/squareup/protos/cash/ui/Color;", "text_border_color", "font_name", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder {
        public String font_name;
        public Color text_border_color;
        public Color text_color;

        @Override // com.squareup.wire.Message.Builder
        public TextFormat build() {
            return new TextFormat(this.font_name, this.text_color, this.text_border_color, buildUnknownFields());
        }

        public final Builder font_name(String font_name) {
            this.font_name = font_name;
            return this;
        }

        public final Builder text_border_color(Color text_border_color) {
            this.text_border_color = text_border_color;
            return this;
        }

        public final Builder text_color(Color text_color) {
            this.text_color = text_color;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TextFormat.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.mosaic.models.v1.TextFormat$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TextFormat decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TextFormat((String) obj3, (Color) obj, (Color) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj2);
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TextFormat value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = Color.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 1, value.text_color);
                protoAdapter2.encodeWithTag(writer, 2, value.text_border_color);
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.font_name);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TextFormat value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = Color.ADAPTER;
                return ProtoAdapter.STRING.encodedSizeWithTag(3, value.font_name) + protoAdapter2.encodedSizeWithTag(2, value.text_border_color) + protoAdapter2.encodedSizeWithTag(1, value.text_color) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TextFormat redact(TextFormat value) {
                value.getClass();
                Color color = value.text_color;
                Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
                Color color3 = value.text_border_color;
                Color color4 = color3 != null ? (Color) Color.ADAPTER.redact(color3) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.font_name;
                byteString.getClass();
                return new TextFormat(str, color2, color4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TextFormat value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.encodeWithTag(writer, 3, value.font_name);
                ProtoAdapter protoAdapter2 = Color.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 2, value.text_border_color);
                protoAdapter2.encodeWithTag(writer, 1, value.text_color);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFormat(String str, Color color, Color color2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text_color = color;
        this.text_border_color = color2;
        this.font_name = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextFormat)) {
            return false;
        }
        TextFormat textFormat = (TextFormat) obj;
        return Intrinsics.areEqual(unknownFields(), textFormat.unknownFields()) && Intrinsics.areEqual(this.text_color, textFormat.text_color) && Intrinsics.areEqual(this.text_border_color, textFormat.text_border_color) && Intrinsics.areEqual(this.font_name, textFormat.font_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Color color = this.text_color;
        int hashCode2 = (hashCode + (color != null ? color.hashCode() : 0)) * 37;
        Color color2 = this.text_border_color;
        int hashCode3 = (hashCode2 + (color2 != null ? color2.hashCode() : 0)) * 37;
        String str = this.font_name;
        int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.text_color = this.text_color;
        builder.text_border_color = this.text_border_color;
        builder.font_name = this.font_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Color color = this.text_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("text_color=", color, arrayList);
        }
        Color color2 = this.text_border_color;
        if (color2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("text_border_color=", color2, arrayList);
        }
        String str = this.font_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "font_name=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TextFormat{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/models/v1/TextFormat$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/mosaic/models/v1/TextFormat$Builder;", "", "body", "Lcom/squareup/cash/mosaic/models/v1/TextFormat;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/mosaic/models/v1/TextFormat;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ TextFormat build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
