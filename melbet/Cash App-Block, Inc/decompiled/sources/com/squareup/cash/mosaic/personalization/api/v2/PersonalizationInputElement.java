package com.squareup.cash.mosaic.personalization.api.v2;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInputElement;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\n\u000b\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement$Builder;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputProperties;", "properties", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputProperties;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement$Element;", "element", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement$Element;", "Companion", "Builder", "Element", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersonalizationInputElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PersonalizationInputElement> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 1)
    public final Element element;

    @WireField(adapter = "com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInputProperties#ADAPTER", schemaIndex = 0, tag = 1)
    public final PersonalizationInputProperties properties;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement;", "<init>", "()V", "properties", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputProperties;", "element", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement$Element;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Element element;
        public PersonalizationInputProperties properties;

        @Override // com.squareup.wire.Message.Builder
        public PersonalizationInputElement build() {
            return new PersonalizationInputElement(this.properties, this.element, buildUnknownFields());
        }

        public final Builder element(Element element) {
            this.element = element;
            return this;
        }

        public final Builder properties(PersonalizationInputProperties properties) {
            this.properties = properties;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PersonalizationInputElement.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInputElement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PersonalizationInputElement decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                PersonalizationInputElement.Element element = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PersonalizationInputElement((PersonalizationInputProperties) obj, element, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(PersonalizationInputProperties.ADAPTER, reader, obj);
                    } else if (nextTag == 2) {
                        element = new PersonalizationInputElement.Element.Text((PersonalizationInputText) PersonalizationInputText.ADAPTER.decode(reader));
                    } else if (nextTag != 3) {
                        reader.readUnknownField(nextTag);
                    } else {
                        element = new PersonalizationInputElement.Element.Sticker((PersonalizationInputSticker) PersonalizationInputSticker.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PersonalizationInputElement value) {
                writer.getClass();
                value.getClass();
                PersonalizationInputProperties.ADAPTER.encodeWithTag(writer, 1, value.properties);
                PersonalizationInputElement.Element element = value.element;
                if (element instanceof PersonalizationInputElement.Element.Text) {
                    PersonalizationInputText.ADAPTER.encodeWithTag(writer, 2, ((PersonalizationInputElement.Element.Text) element).getValue());
                } else if (element instanceof PersonalizationInputElement.Element.Sticker) {
                    PersonalizationInputSticker.ADAPTER.encodeWithTag(writer, 3, ((PersonalizationInputElement.Element.Sticker) element).getValue());
                } else if (element != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PersonalizationInputElement value) {
                value.getClass();
                int encodedSizeWithTag = PersonalizationInputProperties.ADAPTER.encodedSizeWithTag(1, value.properties) + value.unknownFields().getSize$okio();
                PersonalizationInputElement.Element element = value.element;
                if (element instanceof PersonalizationInputElement.Element.Text) {
                    return PersonalizationInputText.ADAPTER.encodedSizeWithTag(2, ((PersonalizationInputElement.Element.Text) element).getValue()) + encodedSizeWithTag;
                }
                if (element instanceof PersonalizationInputElement.Element.Sticker) {
                    return PersonalizationInputSticker.ADAPTER.encodedSizeWithTag(3, ((PersonalizationInputElement.Element.Sticker) element).getValue()) + encodedSizeWithTag;
                }
                if (element == null) {
                    return encodedSizeWithTag;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PersonalizationInputElement redact(PersonalizationInputElement value) {
                value.getClass();
                PersonalizationInputProperties personalizationInputProperties = value.properties;
                PersonalizationInputProperties personalizationInputProperties2 = personalizationInputProperties != null ? (PersonalizationInputProperties) PersonalizationInputProperties.ADAPTER.redact(personalizationInputProperties) : null;
                ByteString byteString = ByteString.EMPTY;
                PersonalizationInputElement.Element element = value.element;
                byteString.getClass();
                return new PersonalizationInputElement(personalizationInputProperties2, element, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PersonalizationInputElement value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                PersonalizationInputElement.Element element = value.element;
                if (element instanceof PersonalizationInputElement.Element.Text) {
                    PersonalizationInputText.ADAPTER.encodeWithTag(writer, 2, ((PersonalizationInputElement.Element.Text) element).getValue());
                } else if (element instanceof PersonalizationInputElement.Element.Sticker) {
                    PersonalizationInputSticker.ADAPTER.encodeWithTag(writer, 3, ((PersonalizationInputElement.Element.Sticker) element).getValue());
                } else if (element != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                PersonalizationInputProperties.ADAPTER.encodeWithTag(writer, 1, value.properties);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalizationInputElement(PersonalizationInputProperties personalizationInputProperties, Element element, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.properties = personalizationInputProperties;
        this.element = element;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersonalizationInputElement)) {
            return false;
        }
        PersonalizationInputElement personalizationInputElement = (PersonalizationInputElement) obj;
        return Intrinsics.areEqual(unknownFields(), personalizationInputElement.unknownFields()) && Intrinsics.areEqual(this.properties, personalizationInputElement.properties) && Intrinsics.areEqual(this.element, personalizationInputElement.element);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PersonalizationInputProperties personalizationInputProperties = this.properties;
        int hashCode2 = (hashCode + (personalizationInputProperties != null ? personalizationInputProperties.hashCode() : 0)) * 37;
        Element element = this.element;
        int hashCode3 = hashCode2 + (element != null ? element.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.properties = this.properties;
        builder.element = this.element;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PersonalizationInputProperties personalizationInputProperties = this.properties;
        if (personalizationInputProperties != null) {
            arrayList.add("properties=" + personalizationInputProperties);
        }
        Element element = this.element;
        if (element != null) {
            arrayList.add("element=" + element);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PersonalizationInputElement{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement$Builder;", "", "body", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PersonalizationInputElement build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement$Element;", "", "<init>", "()V", "Text", "Sticker", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement$Element$Sticker;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement$Element$Text;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Element {

        @WireOneofField(adapter = "com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInputSticker#ADAPTER", declaredName = "sticker", tag = 3)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement$Element$Sticker;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement$Element;", "value", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputSticker;", "<init>", "(Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputSticker;)V", "getValue", "()Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputSticker;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Sticker extends Element {
            private final PersonalizationInputSticker value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Sticker(PersonalizationInputSticker personalizationInputSticker) {
                super(null);
                personalizationInputSticker.getClass();
                this.value = personalizationInputSticker;
            }

            public static /* synthetic */ Sticker copy$default(Sticker sticker, PersonalizationInputSticker personalizationInputSticker, int i, Object obj) {
                if ((i & 1) != 0) {
                    personalizationInputSticker = sticker.value;
                }
                return sticker.copy(personalizationInputSticker);
            }

            /* renamed from: component1, reason: from getter */
            public final PersonalizationInputSticker getValue() {
                return this.value;
            }

            public final Sticker copy(PersonalizationInputSticker value) {
                value.getClass();
                return new Sticker(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Sticker) && Intrinsics.areEqual(this.value, ((Sticker) other).value);
            }

            public final PersonalizationInputSticker getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Sticker(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInputText#ADAPTER", declaredName = "text", tag = 2)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement$Element$Text;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputElement$Element;", "value", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputText;", "<init>", "(Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputText;)V", "getValue", "()Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputText;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Text extends Element {
            private final PersonalizationInputText value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Text(PersonalizationInputText personalizationInputText) {
                super(null);
                personalizationInputText.getClass();
                this.value = personalizationInputText;
            }

            public static /* synthetic */ Text copy$default(Text text, PersonalizationInputText personalizationInputText, int i, Object obj) {
                if ((i & 1) != 0) {
                    personalizationInputText = text.value;
                }
                return text.copy(personalizationInputText);
            }

            /* renamed from: component1, reason: from getter */
            public final PersonalizationInputText getValue() {
                return this.value;
            }

            public final Text copy(PersonalizationInputText value) {
                value.getClass();
                return new Text(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Text) && Intrinsics.areEqual(this.value, ((Text) other).value);
            }

            public final PersonalizationInputText getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Text(value=" + this.value + ")";
            }
        }

        public /* synthetic */ Element(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Element() {
        }
    }

    public /* synthetic */ PersonalizationInputElement(PersonalizationInputProperties personalizationInputProperties, Element element) {
        this(personalizationInputProperties, element, ByteString.EMPTY);
    }
}
