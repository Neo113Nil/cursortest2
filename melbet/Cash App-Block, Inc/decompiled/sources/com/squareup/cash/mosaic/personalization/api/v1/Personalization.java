package com.squareup.cash.mosaic.personalization.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.mosaic.personalization.api.v1.Personalization;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u000f\u000e\u0010\u0011\u0012\u0013\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Builder;", "", "selected_background_id", "Ljava/lang/String;", "selected_music_id", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$PersonalizationPreview;", "preview", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$PersonalizationPreview;", "", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element;", "elements", "Ljava/util/List;", "Companion", "Builder", "Element", "Text", "Sticker", "Properties", "PersonalizationPreview", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Personalization extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Personalization> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.cash.mosaic.personalization.api.v1.Personalization$Element#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<Element> elements;

    @WireField(adapter = "com.squareup.cash.mosaic.personalization.api.v1.Personalization$PersonalizationPreview#ADAPTER", schemaIndex = 3, tag = 4)
    public final PersonalizationPreview preview;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String selected_background_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String selected_music_id;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization;", "<init>", "()V", "selected_background_id", "", "elements", "", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element;", "selected_music_id", "preview", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$PersonalizationPreview;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<Element> elements = EmptyList.INSTANCE;
        public PersonalizationPreview preview;
        public String selected_background_id;
        public String selected_music_id;

        @Override // com.squareup.wire.Message.Builder
        public Personalization build() {
            return new Personalization(this.selected_background_id, this.elements, this.selected_music_id, this.preview, buildUnknownFields());
        }

        public final Builder elements(List<Element> elements) {
            elements.getClass();
            TransactorKt.checkElementsNotNull(elements);
            this.elements = elements;
            return this;
        }

        public final Builder preview(PersonalizationPreview preview) {
            this.preview = preview;
            return this;
        }

        public final Builder selected_background_id(String selected_background_id) {
            this.selected_background_id = selected_background_id;
            return this;
        }

        public final Builder selected_music_id(String selected_music_id) {
            this.selected_music_id = selected_music_id;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Personalization.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.mosaic.personalization.api.v1.Personalization$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public Personalization decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new Personalization((String) obj, m, (String) obj2, (Personalization.PersonalizationPreview) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        m.add(Personalization.Element.ADAPTER.decode(reader));
                    } else if (nextTag == 3) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj3 = TransactorKt.decodeMessageOrMerge(Personalization.PersonalizationPreview.ADAPTER, reader, obj3);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Personalization value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.selected_background_id);
                Personalization.Element.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.elements);
                protoAdapter2.encodeWithTag(writer, 3, value.selected_music_id);
                Personalization.PersonalizationPreview.ADAPTER.encodeWithTag(writer, 4, value.preview);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Personalization value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return Personalization.PersonalizationPreview.ADAPTER.encodedSizeWithTag(4, value.preview) + protoAdapter2.encodedSizeWithTag(3, value.selected_music_id) + Personalization.Element.ADAPTER.asRepeated().encodedSizeWithTag(2, value.elements) + protoAdapter2.encodedSizeWithTag(1, value.selected_background_id) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Personalization redact(Personalization value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.elements, Personalization.Element.ADAPTER);
                Personalization.PersonalizationPreview personalizationPreview = value.preview;
                Personalization.PersonalizationPreview personalizationPreview2 = personalizationPreview != null ? (Personalization.PersonalizationPreview) Personalization.PersonalizationPreview.ADAPTER.redact(personalizationPreview) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.selected_background_id;
                String str2 = value.selected_music_id;
                byteString.getClass();
                return new Personalization(str, m1169redactElements, str2, personalizationPreview2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Personalization value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                Personalization.PersonalizationPreview.ADAPTER.encodeWithTag(writer, 4, value.preview);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 3, value.selected_music_id);
                Personalization.Element.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.elements);
                protoAdapter2.encodeWithTag(writer, 1, value.selected_background_id);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Personalization(String str, List list, String str2, PersonalizationPreview personalizationPreview, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.selected_background_id = str;
        this.selected_music_id = str2;
        this.preview = personalizationPreview;
        this.elements = TransactorKt.immutableCopyOf("elements", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Personalization)) {
            return false;
        }
        Personalization personalization = (Personalization) obj;
        return Intrinsics.areEqual(unknownFields(), personalization.unknownFields()) && Intrinsics.areEqual(this.selected_background_id, personalization.selected_background_id) && Intrinsics.areEqual(this.elements, personalization.elements) && Intrinsics.areEqual(this.selected_music_id, personalization.selected_music_id) && Intrinsics.areEqual(this.preview, personalization.preview);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.selected_background_id;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.elements);
        String str2 = this.selected_music_id;
        int hashCode2 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
        PersonalizationPreview personalizationPreview = this.preview;
        int hashCode3 = hashCode2 + (personalizationPreview != null ? personalizationPreview.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.selected_background_id = this.selected_background_id;
        builder.elements = this.elements;
        builder.selected_music_id = this.selected_music_id;
        builder.preview = this.preview;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.selected_background_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "selected_background_id=", arrayList);
        }
        if (!this.elements.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("elements=", arrayList, this.elements);
        }
        String str2 = this.selected_music_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "selected_music_id=", arrayList);
        }
        PersonalizationPreview personalizationPreview = this.preview;
        if (personalizationPreview != null) {
            arrayList.add("preview=" + personalizationPreview);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Personalization{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0015\u0016\u0017B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016J(\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element$Builder;", "properties", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Properties;", "element", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element$Element;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Properties;Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element$Element;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Element", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Element extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Element> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 1)
        public final AbstractC0063Element element;

        @WireField(adapter = "com.squareup.cash.mosaic.personalization.api.v1.Personalization$Properties#ADAPTER", schemaIndex = 0, tag = 1)
        public final Properties properties;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element;", "<init>", "()V", "properties", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Properties;", "element", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element$Element;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public AbstractC0063Element element;
            public Properties properties;

            @Override // com.squareup.wire.Message.Builder
            public Element build() {
                return new Element(this.properties, this.element, buildUnknownFields());
            }

            public final Builder element(AbstractC0063Element element) {
                this.element = element;
                return this;
            }

            public final Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Element.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.mosaic.personalization.api.v1.Personalization$Element$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public Personalization.Element decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Personalization.Element.AbstractC0063Element abstractC0063Element = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new Personalization.Element((Personalization.Properties) obj, abstractC0063Element, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Personalization.Properties.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            abstractC0063Element = new Personalization.Element.AbstractC0063Element.Text((Personalization.Text) Personalization.Text.ADAPTER.decode(reader));
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            abstractC0063Element = new Personalization.Element.AbstractC0063Element.Sticker((Personalization.Sticker) Personalization.Sticker.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Personalization.Element value) {
                    writer.getClass();
                    value.getClass();
                    Personalization.Properties.ADAPTER.encodeWithTag(writer, 1, value.properties);
                    Personalization.Element.AbstractC0063Element abstractC0063Element = value.element;
                    if (abstractC0063Element instanceof Personalization.Element.AbstractC0063Element.Text) {
                        Personalization.Text.ADAPTER.encodeWithTag(writer, 2, ((Personalization.Element.AbstractC0063Element.Text) abstractC0063Element).getValue());
                    } else if (abstractC0063Element instanceof Personalization.Element.AbstractC0063Element.Sticker) {
                        Personalization.Sticker.ADAPTER.encodeWithTag(writer, 3, ((Personalization.Element.AbstractC0063Element.Sticker) abstractC0063Element).getValue());
                    } else if (abstractC0063Element != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Personalization.Element value) {
                    value.getClass();
                    int encodedSizeWithTag = Personalization.Properties.ADAPTER.encodedSizeWithTag(1, value.properties) + value.unknownFields().getSize$okio();
                    Personalization.Element.AbstractC0063Element abstractC0063Element = value.element;
                    if (abstractC0063Element instanceof Personalization.Element.AbstractC0063Element.Text) {
                        return Personalization.Text.ADAPTER.encodedSizeWithTag(2, ((Personalization.Element.AbstractC0063Element.Text) abstractC0063Element).getValue()) + encodedSizeWithTag;
                    }
                    if (abstractC0063Element instanceof Personalization.Element.AbstractC0063Element.Sticker) {
                        return Personalization.Sticker.ADAPTER.encodedSizeWithTag(3, ((Personalization.Element.AbstractC0063Element.Sticker) abstractC0063Element).getValue()) + encodedSizeWithTag;
                    }
                    if (abstractC0063Element == null) {
                        return encodedSizeWithTag;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Personalization.Element redact(Personalization.Element value) {
                    value.getClass();
                    Personalization.Properties properties = value.properties;
                    return Personalization.Element.copy$default(value, properties != null ? (Personalization.Properties) Personalization.Properties.ADAPTER.redact(properties) : null, null, ByteString.EMPTY, 2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Personalization.Element value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    Personalization.Element.AbstractC0063Element abstractC0063Element = value.element;
                    if (abstractC0063Element instanceof Personalization.Element.AbstractC0063Element.Text) {
                        Personalization.Text.ADAPTER.encodeWithTag(writer, 2, ((Personalization.Element.AbstractC0063Element.Text) abstractC0063Element).getValue());
                    } else if (abstractC0063Element instanceof Personalization.Element.AbstractC0063Element.Sticker) {
                        Personalization.Sticker.ADAPTER.encodeWithTag(writer, 3, ((Personalization.Element.AbstractC0063Element.Sticker) abstractC0063Element).getValue());
                    } else if (abstractC0063Element != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    Personalization.Properties.ADAPTER.encodeWithTag(writer, 1, value.properties);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Element(Properties properties, AbstractC0063Element abstractC0063Element, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : properties, (i & 2) != 0 ? null : abstractC0063Element, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Element copy$default(Element element, Properties properties, AbstractC0063Element abstractC0063Element, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                properties = element.properties;
            }
            if ((i & 2) != 0) {
                abstractC0063Element = element.element;
            }
            if ((i & 4) != 0) {
                byteString = element.unknownFields();
            }
            return element.copy(properties, abstractC0063Element, byteString);
        }

        public final Element copy(Properties properties, AbstractC0063Element element, ByteString unknownFields) {
            unknownFields.getClass();
            return new Element(properties, element, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Element)) {
                return false;
            }
            Element element = (Element) other;
            return Intrinsics.areEqual(unknownFields(), element.unknownFields()) && Intrinsics.areEqual(this.properties, element.properties) && Intrinsics.areEqual(this.element, element.element);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Properties properties = this.properties;
            int hashCode2 = (hashCode + (properties != null ? properties.hashCode() : 0)) * 37;
            AbstractC0063Element abstractC0063Element = this.element;
            int hashCode3 = hashCode2 + (abstractC0063Element != null ? abstractC0063Element.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.properties = this.properties;
            builder.element = this.element;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Properties properties = this.properties;
            if (properties != null) {
                arrayList.add("properties=" + properties);
            }
            AbstractC0063Element abstractC0063Element = this.element;
            if (abstractC0063Element != null) {
                arrayList.add("element=" + abstractC0063Element);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Element{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element$Builder;", "", "body", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Element build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element$Element;", "", "<init>", "()V", "Text", "Sticker", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element$Element$Sticker;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element$Element$Text;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.squareup.cash.mosaic.personalization.api.v1.Personalization$Element$Element, reason: collision with other inner class name */
        public static abstract class AbstractC0063Element {

            @WireOneofField(adapter = "com.squareup.cash.mosaic.personalization.api.v1.Personalization$Sticker#ADAPTER", declaredName = "sticker", tag = 3)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element$Element$Sticker;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element$Element;", "value", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Sticker;", "<init>", "(Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Sticker;)V", "getValue", "()Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Sticker;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.squareup.cash.mosaic.personalization.api.v1.Personalization$Element$Element$Sticker */
            public static final /* data */ class Sticker extends AbstractC0063Element {
                private final Sticker value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Sticker(Sticker sticker) {
                    super(null);
                    sticker.getClass();
                    this.value = sticker;
                }

                public static /* synthetic */ Sticker copy$default(Sticker sticker, Sticker sticker2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        sticker2 = sticker.value;
                    }
                    return sticker.copy(sticker2);
                }

                /* renamed from: component1, reason: from getter */
                public final Sticker getValue() {
                    return this.value;
                }

                public final Sticker copy(Sticker value) {
                    value.getClass();
                    return new Sticker(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Sticker) && Intrinsics.areEqual(this.value, ((Sticker) other).value);
                }

                public final Sticker getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Sticker(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.cash.mosaic.personalization.api.v1.Personalization$Text#ADAPTER", declaredName = "text", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element$Element$Text;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Element$Element;", "value", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Text;", "<init>", "(Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Text;)V", "getValue", "()Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Text;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.squareup.cash.mosaic.personalization.api.v1.Personalization$Element$Element$Text */
            public static final /* data */ class Text extends AbstractC0063Element {
                private final Text value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Text(Text text) {
                    super(null);
                    text.getClass();
                    this.value = text;
                }

                public static /* synthetic */ Text copy$default(Text text, Text text2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        text2 = text.value;
                    }
                    return text.copy(text2);
                }

                /* renamed from: component1, reason: from getter */
                public final Text getValue() {
                    return this.value;
                }

                public final Text copy(Text value) {
                    value.getClass();
                    return new Text(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Text) && Intrinsics.areEqual(this.value, ((Text) other).value);
                }

                public final Text getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Text(value=" + this.value + ")";
                }
            }

            public /* synthetic */ AbstractC0063Element(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private AbstractC0063Element() {
            }
        }

        public Element() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Element(Properties properties, AbstractC0063Element abstractC0063Element, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.properties = properties;
            this.element = abstractC0063Element;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0015B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0082\u0004J\n\u0010\u0010\u001a\u00020\u0011H\u0096\u0080\u0004J\b\u0010\u0012\u001a\u00020\u0004H\u0016J4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$PersonalizationPreview;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$PersonalizationPreview$Builder;", "square_preview_url", "", "portrait_preview_url", "landscape_preview_url", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PersonalizationPreview extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<PersonalizationPreview> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String landscape_preview_url;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String portrait_preview_url;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String square_preview_url;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$PersonalizationPreview$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$PersonalizationPreview;", "<init>", "()V", "square_preview_url", "", "portrait_preview_url", "landscape_preview_url", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String landscape_preview_url;
            public String portrait_preview_url;
            public String square_preview_url;

            @Override // com.squareup.wire.Message.Builder
            public PersonalizationPreview build() {
                return new PersonalizationPreview(this.square_preview_url, this.portrait_preview_url, this.landscape_preview_url, buildUnknownFields());
            }

            public final Builder landscape_preview_url(String landscape_preview_url) {
                this.landscape_preview_url = landscape_preview_url;
                return this;
            }

            public final Builder portrait_preview_url(String portrait_preview_url) {
                this.portrait_preview_url = portrait_preview_url;
                return this;
            }

            public final Builder square_preview_url(String square_preview_url) {
                this.square_preview_url = square_preview_url;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PersonalizationPreview.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.mosaic.personalization.api.v1.Personalization$PersonalizationPreview$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public Personalization.PersonalizationPreview decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new Personalization.PersonalizationPreview((String) obj, (String) obj2, (String) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Personalization.PersonalizationPreview value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.square_preview_url);
                    protoAdapter2.encodeWithTag(writer, 2, value.portrait_preview_url);
                    protoAdapter2.encodeWithTag(writer, 3, value.landscape_preview_url);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Personalization.PersonalizationPreview value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(3, value.landscape_preview_url) + protoAdapter2.encodedSizeWithTag(2, value.portrait_preview_url) + protoAdapter2.encodedSizeWithTag(1, value.square_preview_url) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Personalization.PersonalizationPreview redact(Personalization.PersonalizationPreview value) {
                    value.getClass();
                    return Personalization.PersonalizationPreview.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Personalization.PersonalizationPreview value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 3, value.landscape_preview_url);
                    protoAdapter2.encodeWithTag(writer, 2, value.portrait_preview_url);
                    protoAdapter2.encodeWithTag(writer, 1, value.square_preview_url);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ PersonalizationPreview(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ PersonalizationPreview copy$default(PersonalizationPreview personalizationPreview, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = personalizationPreview.square_preview_url;
            }
            if ((i & 2) != 0) {
                str2 = personalizationPreview.portrait_preview_url;
            }
            if ((i & 4) != 0) {
                str3 = personalizationPreview.landscape_preview_url;
            }
            if ((i & 8) != 0) {
                byteString = personalizationPreview.unknownFields();
            }
            return personalizationPreview.copy(str, str2, str3, byteString);
        }

        public final PersonalizationPreview copy(String square_preview_url, String portrait_preview_url, String landscape_preview_url, ByteString unknownFields) {
            unknownFields.getClass();
            return new PersonalizationPreview(square_preview_url, portrait_preview_url, landscape_preview_url, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PersonalizationPreview)) {
                return false;
            }
            PersonalizationPreview personalizationPreview = (PersonalizationPreview) other;
            return Intrinsics.areEqual(unknownFields(), personalizationPreview.unknownFields()) && Intrinsics.areEqual(this.square_preview_url, personalizationPreview.square_preview_url) && Intrinsics.areEqual(this.portrait_preview_url, personalizationPreview.portrait_preview_url) && Intrinsics.areEqual(this.landscape_preview_url, personalizationPreview.landscape_preview_url);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.square_preview_url;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.portrait_preview_url;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.landscape_preview_url;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.square_preview_url = this.square_preview_url;
            builder.portrait_preview_url = this.portrait_preview_url;
            builder.landscape_preview_url = this.landscape_preview_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.square_preview_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "square_preview_url=", arrayList);
            }
            String str2 = this.portrait_preview_url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "portrait_preview_url=", arrayList);
            }
            String str3 = this.landscape_preview_url;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "landscape_preview_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PersonalizationPreview{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$PersonalizationPreview$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$PersonalizationPreview$Builder;", "", "body", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$PersonalizationPreview;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$PersonalizationPreview;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ PersonalizationPreview build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public PersonalizationPreview() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PersonalizationPreview(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.square_preview_url = str;
            this.portrait_preview_url = str2;
            this.landscape_preview_url = str3;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0004H\u0096\u0080\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0016JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u0019R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Properties;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Properties$Builder;", "x", "", "y", "z", "rotation", "", "scale_factor", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Lokio/ByteString;)V", "Ljava/lang/Integer;", "Ljava/lang/Float;", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;Lokio/ByteString;)Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Properties;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Properties extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Properties> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 3, tag = 4)
        public final Float rotation;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 4, tag = 5)
        public final Float scale_factor;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 0, tag = 1)
        public final Integer x;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 1, tag = 2)
        public final Integer y;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 2, tag = 3)
        public final Integer z;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fJ\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Properties$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Properties;", "<init>", "()V", "x", "", "Ljava/lang/Integer;", "y", "z", "rotation", "", "Ljava/lang/Float;", "scale_factor", "(Ljava/lang/Integer;)Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Properties$Builder;", "(Ljava/lang/Float;)Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Properties$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Float rotation;
            public Float scale_factor;
            public Integer x;
            public Integer y;
            public Integer z;

            @Override // com.squareup.wire.Message.Builder
            public Properties build() {
                return new Properties(this.x, this.y, this.z, this.rotation, this.scale_factor, buildUnknownFields());
            }

            public final Builder rotation(Float rotation) {
                this.rotation = rotation;
                return this;
            }

            public final Builder scale_factor(Float scale_factor) {
                this.scale_factor = scale_factor;
                return this;
            }

            public final Builder x(Integer x) {
                this.x = x;
                return this;
            }

            public final Builder y(Integer y) {
                this.y = y;
                return this;
            }

            public final Builder z(Integer z) {
                this.z = z;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Properties.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.mosaic.personalization.api.v1.Personalization$Properties$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public Personalization.Properties decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new Personalization.Properties((Integer) obj, (Integer) obj2, (Integer) obj3, (Float) obj4, (Float) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.INT32.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.INT32.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.INT32.decode(reader);
                        } else if (nextTag == 4) {
                            obj4 = ProtoAdapter.FLOAT.decode(reader);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj5 = ProtoAdapter.FLOAT.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Personalization.Properties value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                    protoAdapter2.encodeWithTag(writer, 1, value.x);
                    protoAdapter2.encodeWithTag(writer, 2, value.y);
                    protoAdapter2.encodeWithTag(writer, 3, value.z);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.FLOAT;
                    protoAdapter3.encodeWithTag(writer, 4, value.rotation);
                    protoAdapter3.encodeWithTag(writer, 5, value.scale_factor);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Personalization.Properties value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                    int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(3, value.z) + protoAdapter2.encodedSizeWithTag(2, value.y) + protoAdapter2.encodedSizeWithTag(1, value.x) + size$okio;
                    ProtoAdapter protoAdapter3 = ProtoAdapter.FLOAT;
                    return protoAdapter3.encodedSizeWithTag(5, value.scale_factor) + protoAdapter3.encodedSizeWithTag(4, value.rotation) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Personalization.Properties redact(Personalization.Properties value) {
                    value.getClass();
                    return Personalization.Properties.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Personalization.Properties value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.FLOAT;
                    protoAdapter2.encodeWithTag(writer, 5, value.scale_factor);
                    protoAdapter2.encodeWithTag(writer, 4, value.rotation);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
                    protoAdapter3.encodeWithTag(writer, 3, value.z);
                    protoAdapter3.encodeWithTag(writer, 2, value.y);
                    protoAdapter3.encodeWithTag(writer, 1, value.x);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Properties(Integer num, Integer num2, Integer num3, Float f, Float f2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : f, (i & 16) != 0 ? null : f2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Properties copy$default(Properties properties, Integer num, Integer num2, Integer num3, Float f, Float f2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                num = properties.x;
            }
            if ((i & 2) != 0) {
                num2 = properties.y;
            }
            if ((i & 4) != 0) {
                num3 = properties.z;
            }
            if ((i & 8) != 0) {
                f = properties.rotation;
            }
            if ((i & 16) != 0) {
                f2 = properties.scale_factor;
            }
            if ((i & 32) != 0) {
                byteString = properties.unknownFields();
            }
            Float f3 = f2;
            ByteString byteString2 = byteString;
            return properties.copy(num, num2, num3, f, f3, byteString2);
        }

        public final Properties copy(Integer x, Integer y, Integer z, Float rotation, Float scale_factor, ByteString unknownFields) {
            unknownFields.getClass();
            return new Properties(x, y, z, rotation, scale_factor, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Properties)) {
                return false;
            }
            Properties properties = (Properties) other;
            return Intrinsics.areEqual(unknownFields(), properties.unknownFields()) && Intrinsics.areEqual(this.x, properties.x) && Intrinsics.areEqual(this.y, properties.y) && Intrinsics.areEqual(this.z, properties.z) && Intrinsics.areEqual(this.rotation, properties.rotation) && Intrinsics.areEqual(this.scale_factor, properties.scale_factor);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Integer num = this.x;
            int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
            Integer num2 = this.y;
            int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
            Integer num3 = this.z;
            int hashCode4 = (hashCode3 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0)) * 37;
            Float f = this.rotation;
            int hashCode5 = (hashCode4 + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
            Float f2 = this.scale_factor;
            int hashCode6 = hashCode5 + (f2 != null ? Float.hashCode(f2.floatValue()) : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.x = this.x;
            builder.y = this.y;
            builder.z = this.z;
            builder.rotation = this.rotation;
            builder.scale_factor = this.scale_factor;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Integer num = this.x;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("x=", num, arrayList);
            }
            Integer num2 = this.y;
            if (num2 != null) {
                re$$ExternalSyntheticOutline0.m("y=", num2, arrayList);
            }
            Integer num3 = this.z;
            if (num3 != null) {
                re$$ExternalSyntheticOutline0.m("z=", num3, arrayList);
            }
            Float f = this.rotation;
            if (f != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("rotation=", f, arrayList);
            }
            Float f2 = this.scale_factor;
            if (f2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("scale_factor=", f2, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Properties{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Properties$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Properties$Builder;", "", "body", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Properties;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Properties;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Properties build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Properties() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Properties(Integer num, Integer num2, Integer num3, Float f, Float f2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.x = num;
            this.y = num2;
            this.z = num3;
            this.rotation = f;
            this.scale_factor = f2;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Sticker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Sticker$Builder;", "sticker_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Sticker extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Sticker> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String sticker_id;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Sticker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Sticker;", "<init>", "()V", "sticker_id", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String sticker_id;

            @Override // com.squareup.wire.Message.Builder
            public Sticker build() {
                return new Sticker(this.sticker_id, buildUnknownFields());
            }

            public final Builder sticker_id(String sticker_id) {
                this.sticker_id = sticker_id;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Sticker.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.mosaic.personalization.api.v1.Personalization$Sticker$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public Personalization.Sticker decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new Personalization.Sticker((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Personalization.Sticker value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.sticker_id);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Personalization.Sticker value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.sticker_id) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Personalization.Sticker redact(Personalization.Sticker value) {
                    value.getClass();
                    return Personalization.Sticker.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Personalization.Sticker value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.sticker_id);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Sticker(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Sticker copy$default(Sticker sticker, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sticker.sticker_id;
            }
            if ((i & 2) != 0) {
                byteString = sticker.unknownFields();
            }
            return sticker.copy(str, byteString);
        }

        public final Sticker copy(String sticker_id, ByteString unknownFields) {
            unknownFields.getClass();
            return new Sticker(sticker_id, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Sticker)) {
                return false;
            }
            Sticker sticker = (Sticker) other;
            return Intrinsics.areEqual(unknownFields(), sticker.unknownFields()) && Intrinsics.areEqual(this.sticker_id, sticker.sticker_id);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.sticker_id;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.sticker_id = this.sticker_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.sticker_id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sticker_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Sticker{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Sticker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Sticker$Builder;", "", "body", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Sticker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Sticker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Sticker build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Sticker() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Sticker(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.sticker_id = str;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Text;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Text$Builder;", "text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Text extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Text> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 2)
        public final String text;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Text$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Text;", "<init>", "()V", "text", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String text;

            @Override // com.squareup.wire.Message.Builder
            public Text build() {
                return new Text(this.text, buildUnknownFields());
            }

            public final Builder text(String text) {
                this.text = text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Text.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.mosaic.personalization.api.v1.Personalization$Text$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public Personalization.Text decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new Personalization.Text((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 2) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Personalization.Text value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Personalization.Text value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(2, value.text) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Personalization.Text redact(Personalization.Text value) {
                    value.getClass();
                    return value.copy(null, ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Personalization.Text value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, value.text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Text(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Text copy$default(Text text, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.text;
            }
            if ((i & 2) != 0) {
                byteString = text.unknownFields();
            }
            return text.copy(str, byteString);
        }

        public final Text copy(String text, ByteString unknownFields) {
            unknownFields.getClass();
            return new Text(text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Text)) {
                return false;
            }
            Text text = (Text) other;
            return Intrinsics.areEqual(unknownFields(), text.unknownFields()) && Intrinsics.areEqual(this.text, text.text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.text;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.text = this.text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.text != null) {
                arrayList.add("text=██");
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Text{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Text$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Text$Builder;", "", "body", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Text;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Text;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Text build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Text() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.text = str;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization$Builder;", "", "body", "Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/mosaic/personalization/api/v1/Personalization;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Personalization build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
