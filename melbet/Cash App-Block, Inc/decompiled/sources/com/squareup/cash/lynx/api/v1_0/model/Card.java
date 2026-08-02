package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.data.Expiration;
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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005¨\u0006\u0015"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/Card;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/lynx/api/v1_0/model/Card$Builder;", "", "bin", "Ljava/lang/String;", "suffix", "Lcom/squareup/protos/cash/data/Expiration;", "expiration", "Lcom/squareup/protos/cash/data/Expiration;", "postal_code", "Lcom/squareup/protos/common/instrument/InstrumentType;", "card_brand", "Lcom/squareup/protos/common/instrument/InstrumentType;", "external_id", "Lcom/squareup/cash/lynx/api/v1_0/model/CardFundingType;", "card_funding_type", "Lcom/squareup/cash/lynx/api/v1_0/model/CardFundingType;", "fpan_suffix", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Card extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Card> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String bin;

    @WireField(adapter = "com.squareup.protos.common.instrument.InstrumentType#ADAPTER", redacted = true, schemaIndex = 4, tag = 5)
    public final com.squareup.protos.common.instrument.InstrumentType card_brand;

    @WireField(adapter = "com.squareup.cash.lynx.api.v1_0.model.CardFundingType#ADAPTER", schemaIndex = 6, tag = 7)
    public final CardFundingType card_funding_type;

    @WireField(adapter = "com.squareup.protos.cash.data.Expiration#ADAPTER", redacted = true, schemaIndex = 2, tag = 3)
    public final Expiration expiration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 5, tag = 6)
    public final String external_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 7, tag = 8)
    public final String fpan_suffix;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 4)
    public final String postal_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
    public final String suffix;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/Card$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/lynx/api/v1_0/model/Card;", "<init>", "()V", "bin", "", "suffix", "expiration", "Lcom/squareup/protos/cash/data/Expiration;", "postal_code", "card_brand", "Lcom/squareup/protos/common/instrument/InstrumentType;", "external_id", "card_funding_type", "Lcom/squareup/cash/lynx/api/v1_0/model/CardFundingType;", "fpan_suffix", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String bin;
        public com.squareup.protos.common.instrument.InstrumentType card_brand;
        public CardFundingType card_funding_type;
        public Expiration expiration;
        public String external_id;
        public String fpan_suffix;
        public String postal_code;
        public String suffix;

        public final Builder bin(String bin) {
            this.bin = bin;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public Card build() {
            return new Card(this.bin, this.suffix, this.expiration, this.postal_code, this.card_brand, this.external_id, this.card_funding_type, this.fpan_suffix, buildUnknownFields());
        }

        public final Builder card_brand(com.squareup.protos.common.instrument.InstrumentType card_brand) {
            this.card_brand = card_brand;
            return this;
        }

        public final Builder card_funding_type(CardFundingType card_funding_type) {
            this.card_funding_type = card_funding_type;
            return this;
        }

        public final Builder expiration(Expiration expiration) {
            this.expiration = expiration;
            return this;
        }

        public final Builder external_id(String external_id) {
            this.external_id = external_id;
            return this;
        }

        public final Builder fpan_suffix(String fpan_suffix) {
            this.fpan_suffix = fpan_suffix;
            return this;
        }

        public final Builder postal_code(String postal_code) {
            this.postal_code = postal_code;
            return this;
        }

        public final Builder suffix(String suffix) {
            this.suffix = suffix;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Card.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.lynx.api.v1_0.model.Card$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public Card decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new Card((String) obj, (String) obj2, (Expiration) obj3, (String) obj4, (com.squareup.protos.common.instrument.InstrumentType) obj5, (String) obj6, (CardFundingType) obj7, (String) obj8, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            obj3 = TransactorKt.decodeMessageOrMerge(Expiration.ADAPTER, reader, obj3);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            try {
                                obj5 = com.squareup.protos.common.instrument.InstrumentType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            try {
                                obj7 = CardFundingType.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 8:
                            obj8 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Card value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.bin);
                protoAdapter2.encodeWithTag(writer, 2, value.suffix);
                Expiration.ADAPTER.encodeWithTag(writer, 3, value.expiration);
                protoAdapter2.encodeWithTag(writer, 4, value.postal_code);
                com.squareup.protos.common.instrument.InstrumentType.ADAPTER.encodeWithTag(writer, 5, value.card_brand);
                protoAdapter2.encodeWithTag(writer, 6, value.external_id);
                CardFundingType.ADAPTER.encodeWithTag(writer, 7, value.card_funding_type);
                protoAdapter2.encodeWithTag(writer, 8, value.fpan_suffix);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Card value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(8, value.fpan_suffix) + CardFundingType.ADAPTER.encodedSizeWithTag(7, value.card_funding_type) + protoAdapter2.encodedSizeWithTag(6, value.external_id) + com.squareup.protos.common.instrument.InstrumentType.ADAPTER.encodedSizeWithTag(5, value.card_brand) + protoAdapter2.encodedSizeWithTag(4, value.postal_code) + Expiration.ADAPTER.encodedSizeWithTag(3, value.expiration) + protoAdapter2.encodedSizeWithTag(2, value.suffix) + protoAdapter2.encodedSizeWithTag(1, value.bin) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Card redact(Card value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.bin;
                CardFundingType cardFundingType = value.card_funding_type;
                value.getClass();
                byteString.getClass();
                return new Card(str, null, null, null, null, null, cardFundingType, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Card value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 8, value.fpan_suffix);
                CardFundingType.ADAPTER.encodeWithTag(writer, 7, value.card_funding_type);
                protoAdapter2.encodeWithTag(writer, 6, value.external_id);
                com.squareup.protos.common.instrument.InstrumentType.ADAPTER.encodeWithTag(writer, 5, value.card_brand);
                protoAdapter2.encodeWithTag(writer, 4, value.postal_code);
                Expiration.ADAPTER.encodeWithTag(writer, 3, value.expiration);
                protoAdapter2.encodeWithTag(writer, 2, value.suffix);
                protoAdapter2.encodeWithTag(writer, 1, value.bin);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Card(String str, String str2, Expiration expiration, String str3, com.squareup.protos.common.instrument.InstrumentType instrumentType, String str4, CardFundingType cardFundingType, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.bin = str;
        this.suffix = str2;
        this.expiration = expiration;
        this.postal_code = str3;
        this.card_brand = instrumentType;
        this.external_id = str4;
        this.card_funding_type = cardFundingType;
        this.fpan_suffix = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return Intrinsics.areEqual(unknownFields(), card.unknownFields()) && Intrinsics.areEqual(this.bin, card.bin) && Intrinsics.areEqual(this.suffix, card.suffix) && Intrinsics.areEqual(this.expiration, card.expiration) && Intrinsics.areEqual(this.postal_code, card.postal_code) && this.card_brand == card.card_brand && Intrinsics.areEqual(this.external_id, card.external_id) && this.card_funding_type == card.card_funding_type && Intrinsics.areEqual(this.fpan_suffix, card.fpan_suffix);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.bin;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.suffix;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Expiration expiration = this.expiration;
        int hashCode4 = (hashCode3 + (expiration != null ? expiration.hashCode() : 0)) * 37;
        String str3 = this.postal_code;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        com.squareup.protos.common.instrument.InstrumentType instrumentType = this.card_brand;
        int hashCode6 = (hashCode5 + (instrumentType != null ? instrumentType.hashCode() : 0)) * 37;
        String str4 = this.external_id;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        CardFundingType cardFundingType = this.card_funding_type;
        int hashCode8 = (hashCode7 + (cardFundingType != null ? cardFundingType.hashCode() : 0)) * 37;
        String str5 = this.fpan_suffix;
        int hashCode9 = hashCode8 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.bin = this.bin;
        builder.suffix = this.suffix;
        builder.expiration = this.expiration;
        builder.postal_code = this.postal_code;
        builder.card_brand = this.card_brand;
        builder.external_id = this.external_id;
        builder.card_funding_type = this.card_funding_type;
        builder.fpan_suffix = this.fpan_suffix;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.bin;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "bin=", arrayList);
        }
        if (this.suffix != null) {
            arrayList.add("suffix=██");
        }
        if (this.expiration != null) {
            arrayList.add("expiration=██");
        }
        if (this.postal_code != null) {
            arrayList.add("postal_code=██");
        }
        if (this.card_brand != null) {
            arrayList.add("card_brand=██");
        }
        if (this.external_id != null) {
            arrayList.add("external_id=██");
        }
        CardFundingType cardFundingType = this.card_funding_type;
        if (cardFundingType != null) {
            arrayList.add("card_funding_type=" + cardFundingType);
        }
        if (this.fpan_suffix != null) {
            arrayList.add("fpan_suffix=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Card{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/Card$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/lynx/api/v1_0/model/Card$Builder;", "", "body", "Lcom/squareup/cash/lynx/api/v1_0/model/Card;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/lynx/api/v1_0/model/Card;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ Card build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
