package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.banklin.data.StoredValueBalance;
import com.squareup.protos.common.CurrencyCode;
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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/StoredValueBalance;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/lynx/api/v1_0/model/StoredValueBalance$Builder;", "Lcom/squareup/protos/common/CurrencyCode;", "currency", "Lcom/squareup/protos/common/CurrencyCode;", "", "business_usage_tag", "Ljava/lang/String;", "", "visible_to_customer", "Ljava/lang/Boolean;", "Lcom/squareup/protos/banklin/data/StoredValueBalance$Type;", "stored_value_balance_type", "Lcom/squareup/protos/banklin/data/StoredValueBalance$Type;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StoredValueBalance extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StoredValueBalance> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String business_usage_tag;

    @WireField(adapter = "com.squareup.protos.common.CurrencyCode#ADAPTER", schemaIndex = 0, tag = 1)
    public final CurrencyCode currency;

    @WireField(adapter = "com.squareup.protos.banklin.data.StoredValueBalance$Type#ADAPTER", schemaIndex = 3, tag = 4)
    public final StoredValueBalance.Type stored_value_balance_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean visible_to_customer;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/StoredValueBalance$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/lynx/api/v1_0/model/StoredValueBalance;", "<init>", "()V", "currency", "Lcom/squareup/protos/common/CurrencyCode;", "business_usage_tag", "", "visible_to_customer", "", "Ljava/lang/Boolean;", "stored_value_balance_type", "Lcom/squareup/protos/banklin/data/StoredValueBalance$Type;", "(Ljava/lang/Boolean;)Lcom/squareup/cash/lynx/api/v1_0/model/StoredValueBalance$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String business_usage_tag;
        public CurrencyCode currency;
        public StoredValueBalance.Type stored_value_balance_type;
        public Boolean visible_to_customer;

        @Override // com.squareup.wire.Message.Builder
        public StoredValueBalance build() {
            return new StoredValueBalance(this.currency, this.business_usage_tag, this.visible_to_customer, this.stored_value_balance_type, buildUnknownFields());
        }

        public final Builder business_usage_tag(String business_usage_tag) {
            this.business_usage_tag = business_usage_tag;
            return this;
        }

        public final Builder currency(CurrencyCode currency) {
            this.currency = currency;
            return this;
        }

        public final Builder stored_value_balance_type(StoredValueBalance.Type stored_value_balance_type) {
            this.stored_value_balance_type = stored_value_balance_type;
            return this;
        }

        public final Builder visible_to_customer(Boolean visible_to_customer) {
            this.visible_to_customer = visible_to_customer;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(StoredValueBalance.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.lynx.api.v1_0.model.StoredValueBalance$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public StoredValueBalance decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new StoredValueBalance((CurrencyCode) obj, (String) obj2, (Boolean) obj3, (StoredValueBalance.Type) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = CurrencyCode.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.BOOL.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj4 = StoredValueBalance.Type.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, StoredValueBalance value) {
                writer.getClass();
                value.getClass();
                CurrencyCode.ADAPTER.encodeWithTag(writer, 1, value.currency);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.business_usage_tag);
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.visible_to_customer);
                StoredValueBalance.Type.ADAPTER.encodeWithTag(writer, 4, value.stored_value_balance_type);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(StoredValueBalance value) {
                value.getClass();
                return StoredValueBalance.Type.ADAPTER.encodedSizeWithTag(4, value.stored_value_balance_type) + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.visible_to_customer) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.business_usage_tag) + CurrencyCode.ADAPTER.encodedSizeWithTag(1, value.currency) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public StoredValueBalance redact(StoredValueBalance value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                CurrencyCode currencyCode = value.currency;
                String str = value.business_usage_tag;
                Boolean bool = value.visible_to_customer;
                StoredValueBalance.Type type2 = value.stored_value_balance_type;
                value.getClass();
                byteString.getClass();
                return new StoredValueBalance(currencyCode, str, bool, type2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, StoredValueBalance value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                StoredValueBalance.Type.ADAPTER.encodeWithTag(writer, 4, value.stored_value_balance_type);
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.visible_to_customer);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.business_usage_tag);
                CurrencyCode.ADAPTER.encodeWithTag(writer, 1, value.currency);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoredValueBalance(CurrencyCode currencyCode, String str, Boolean bool, StoredValueBalance.Type type2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.currency = currencyCode;
        this.business_usage_tag = str;
        this.visible_to_customer = bool;
        this.stored_value_balance_type = type2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StoredValueBalance)) {
            return false;
        }
        StoredValueBalance storedValueBalance = (StoredValueBalance) obj;
        return Intrinsics.areEqual(unknownFields(), storedValueBalance.unknownFields()) && this.currency == storedValueBalance.currency && Intrinsics.areEqual(this.business_usage_tag, storedValueBalance.business_usage_tag) && Intrinsics.areEqual(this.visible_to_customer, storedValueBalance.visible_to_customer) && this.stored_value_balance_type == storedValueBalance.stored_value_balance_type;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CurrencyCode currencyCode = this.currency;
        int hashCode2 = (hashCode + (currencyCode != null ? currencyCode.hashCode() : 0)) * 37;
        String str = this.business_usage_tag;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.visible_to_customer;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        StoredValueBalance.Type type2 = this.stored_value_balance_type;
        int hashCode5 = hashCode4 + (type2 != null ? type2.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.currency = this.currency;
        builder.business_usage_tag = this.business_usage_tag;
        builder.visible_to_customer = this.visible_to_customer;
        builder.stored_value_balance_type = this.stored_value_balance_type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CurrencyCode currencyCode = this.currency;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("currency=", currencyCode, arrayList);
        }
        String str = this.business_usage_tag;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "business_usage_tag=", arrayList);
        }
        Boolean bool = this.visible_to_customer;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("visible_to_customer=", bool, arrayList);
        }
        StoredValueBalance.Type type2 = this.stored_value_balance_type;
        if (type2 != null) {
            arrayList.add("stored_value_balance_type=" + type2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StoredValueBalance{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/StoredValueBalance$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/lynx/api/v1_0/model/StoredValueBalance$Builder;", "", "body", "Lcom/squareup/cash/lynx/api/v1_0/model/StoredValueBalance;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/lynx/api/v1_0/model/StoredValueBalance;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ StoredValueBalance build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
