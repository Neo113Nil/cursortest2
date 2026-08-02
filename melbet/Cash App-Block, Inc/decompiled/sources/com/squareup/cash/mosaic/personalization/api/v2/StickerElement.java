package com.squareup.cash.mosaic.personalization.api.v2;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.resources.api.v2.Sticker;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\n\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/StickerElement;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/mosaic/personalization/api/v2/StickerElement$Builder;", "", "sticker_id", "Ljava/lang/String;", "Lcom/squareup/cash/mosaic/resources/api/v2/Sticker;", "hydrated_sticker", "Lcom/squareup/cash/mosaic/resources/api/v2/Sticker;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StickerElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StickerElement> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.cash.mosaic.resources.api.v2.Sticker#ADAPTER", schemaIndex = 1, tag = 2)
    public final Sticker hydrated_sticker;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String sticker_id;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/StickerElement$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/mosaic/personalization/api/v2/StickerElement;", "<init>", "()V", "sticker_id", "", "hydrated_sticker", "Lcom/squareup/cash/mosaic/resources/api/v2/Sticker;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Sticker hydrated_sticker;
        public String sticker_id;

        @Override // com.squareup.wire.Message.Builder
        public StickerElement build() {
            return new StickerElement(this.sticker_id, this.hydrated_sticker, buildUnknownFields());
        }

        public final Builder hydrated_sticker(Sticker hydrated_sticker) {
            this.hydrated_sticker = hydrated_sticker;
            return this;
        }

        public final Builder sticker_id(String sticker_id) {
            this.sticker_id = sticker_id;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(StickerElement.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.mosaic.personalization.api.v2.StickerElement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public StickerElement decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new StickerElement((String) obj, (Sticker) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(Sticker.ADAPTER, reader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StickerElement value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.sticker_id);
                Sticker.ADAPTER.encodeWithTag(writer, 2, value.hydrated_sticker);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StickerElement value) {
                value.getClass();
                return Sticker.ADAPTER.encodedSizeWithTag(2, value.hydrated_sticker) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.sticker_id) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StickerElement redact(StickerElement value) {
                value.getClass();
                Sticker sticker = value.hydrated_sticker;
                Sticker sticker2 = sticker != null ? (Sticker) Sticker.ADAPTER.redact(sticker) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.sticker_id;
                byteString.getClass();
                return new StickerElement(str, sticker2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StickerElement value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                Sticker.ADAPTER.encodeWithTag(writer, 2, value.hydrated_sticker);
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.sticker_id);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerElement(String str, Sticker sticker, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.sticker_id = str;
        this.hydrated_sticker = sticker;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StickerElement)) {
            return false;
        }
        StickerElement stickerElement = (StickerElement) obj;
        return Intrinsics.areEqual(unknownFields(), stickerElement.unknownFields()) && Intrinsics.areEqual(this.sticker_id, stickerElement.sticker_id) && Intrinsics.areEqual(this.hydrated_sticker, stickerElement.hydrated_sticker);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.sticker_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Sticker sticker = this.hydrated_sticker;
        int hashCode3 = hashCode2 + (sticker != null ? sticker.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.sticker_id = this.sticker_id;
        builder.hydrated_sticker = this.hydrated_sticker;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.sticker_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sticker_id=", arrayList);
        }
        Sticker sticker = this.hydrated_sticker;
        if (sticker != null) {
            arrayList.add("hydrated_sticker=" + sticker);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StickerElement{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/StickerElement$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/mosaic/personalization/api/v2/StickerElement$Builder;", "", "body", "Lcom/squareup/cash/mosaic/personalization/api/v2/StickerElement;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/mosaic/personalization/api/v2/StickerElement;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ StickerElement build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
