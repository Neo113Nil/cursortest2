package com.squareup.cash.mosaic.personalization.api.v2;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u0000 \f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\r\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputProperties;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputProperties$Builder;", "", "x", "Ljava/lang/Integer;", "y", "z", "", "rotation", "Ljava/lang/Float;", "scale_factor", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersonalizationInputProperties extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PersonalizationInputProperties> CREATOR;

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

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fJ\u0015\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputProperties$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputProperties;", "<init>", "()V", "x", "", "Ljava/lang/Integer;", "y", "z", "rotation", "", "Ljava/lang/Float;", "scale_factor", "(Ljava/lang/Integer;)Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputProperties$Builder;", "(Ljava/lang/Float;)Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputProperties$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Float rotation;
        public Float scale_factor;
        public Integer x;
        public Integer y;
        public Integer z;

        @Override // com.squareup.wire.Message.Builder
        public PersonalizationInputProperties build() {
            return new PersonalizationInputProperties(this.x, this.y, this.z, this.rotation, this.scale_factor, buildUnknownFields());
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
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PersonalizationInputProperties.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInputProperties$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PersonalizationInputProperties decode(ProtoReader reader) {
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
                        return new PersonalizationInputProperties((Integer) obj, (Integer) obj2, (Integer) obj3, (Float) obj4, (Float) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
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
            public void encode(ProtoWriter writer, PersonalizationInputProperties value) {
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
            public int encodedSize(PersonalizationInputProperties value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT32;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(3, value.z) + protoAdapter2.encodedSizeWithTag(2, value.y) + protoAdapter2.encodedSizeWithTag(1, value.x) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.FLOAT;
                return protoAdapter3.encodedSizeWithTag(5, value.scale_factor) + protoAdapter3.encodedSizeWithTag(4, value.rotation) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PersonalizationInputProperties redact(PersonalizationInputProperties value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                Integer num = value.x;
                Integer num2 = value.y;
                Integer num3 = value.z;
                Float f = value.rotation;
                Float f2 = value.scale_factor;
                value.getClass();
                byteString.getClass();
                return new PersonalizationInputProperties(num, num2, num3, f, f2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PersonalizationInputProperties value) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalizationInputProperties(Integer num, Integer num2, Integer num3, Float f, Float f2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.x = num;
        this.y = num2;
        this.z = num3;
        this.rotation = f;
        this.scale_factor = f2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersonalizationInputProperties)) {
            return false;
        }
        PersonalizationInputProperties personalizationInputProperties = (PersonalizationInputProperties) obj;
        return Intrinsics.areEqual(unknownFields(), personalizationInputProperties.unknownFields()) && Intrinsics.areEqual(this.x, personalizationInputProperties.x) && Intrinsics.areEqual(this.y, personalizationInputProperties.y) && Intrinsics.areEqual(this.z, personalizationInputProperties.z) && Intrinsics.areEqual(this.rotation, personalizationInputProperties.rotation) && Intrinsics.areEqual(this.scale_factor, personalizationInputProperties.scale_factor);
    }

    public final int hashCode() {
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
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.x = this.x;
        builder.y = this.y;
        builder.z = this.z;
        builder.rotation = this.rotation;
        builder.scale_factor = this.scale_factor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "PersonalizationInputProperties{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputProperties$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputProperties$Builder;", "", "body", "Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputProperties;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/mosaic/personalization/api/v2/PersonalizationInputProperties;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PersonalizationInputProperties build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    public /* synthetic */ PersonalizationInputProperties(Integer num, Integer num2, Integer num3, Float f, Float f2) {
        this(num, num2, num3, f, f2, ByteString.EMPTY);
    }
}
