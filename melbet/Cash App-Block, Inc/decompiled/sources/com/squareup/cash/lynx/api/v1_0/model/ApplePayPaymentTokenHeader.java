package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/ApplePayPaymentTokenHeader;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/lynx/api/v1_0/model/ApplePayPaymentTokenHeader$Builder;", "", "applicationData", "Ljava/lang/String;", "ephemeralPublicKey", "wrappedKey", "publicKeyHash", "transactionId", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ApplePayPaymentTokenHeader extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ApplePayPaymentTokenHeader> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String applicationData;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
    public final String ephemeralPublicKey;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 4)
    public final String publicKeyHash;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String transactionId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 3)
    public final String wrappedKey;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/ApplePayPaymentTokenHeader$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/cash/lynx/api/v1_0/model/ApplePayPaymentTokenHeader;", "<init>", "()V", "applicationData", "", "ephemeralPublicKey", "wrappedKey", "publicKeyHash", "transactionId", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String applicationData;
        public String ephemeralPublicKey;
        public String publicKeyHash;
        public String transactionId;
        public String wrappedKey;

        public final Builder applicationData(String applicationData) {
            this.applicationData = applicationData;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ApplePayPaymentTokenHeader build() {
            return new ApplePayPaymentTokenHeader(this.applicationData, this.ephemeralPublicKey, this.wrappedKey, this.publicKeyHash, this.transactionId, buildUnknownFields());
        }

        public final Builder ephemeralPublicKey(String ephemeralPublicKey) {
            this.ephemeralPublicKey = ephemeralPublicKey;
            return this;
        }

        public final Builder publicKeyHash(String publicKeyHash) {
            this.publicKeyHash = publicKeyHash;
            return this;
        }

        public final Builder transactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }

        public final Builder wrappedKey(String wrappedKey) {
            this.wrappedKey = wrappedKey;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ApplePayPaymentTokenHeader.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.cash.lynx.api.v1_0.model.ApplePayPaymentTokenHeader$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ApplePayPaymentTokenHeader decode(ProtoReader reader) {
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
                        return new ApplePayPaymentTokenHeader((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 4) {
                        obj4 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj5 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ApplePayPaymentTokenHeader value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.applicationData);
                protoAdapter2.encodeWithTag(writer, 2, value.ephemeralPublicKey);
                protoAdapter2.encodeWithTag(writer, 3, value.wrappedKey);
                protoAdapter2.encodeWithTag(writer, 4, value.publicKeyHash);
                protoAdapter2.encodeWithTag(writer, 5, value.transactionId);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ApplePayPaymentTokenHeader value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(5, value.transactionId) + protoAdapter2.encodedSizeWithTag(4, value.publicKeyHash) + protoAdapter2.encodedSizeWithTag(3, value.wrappedKey) + protoAdapter2.encodedSizeWithTag(2, value.ephemeralPublicKey) + protoAdapter2.encodedSizeWithTag(1, value.applicationData) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ApplePayPaymentTokenHeader redact(ApplePayPaymentTokenHeader value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.transactionId;
                value.getClass();
                byteString.getClass();
                return new ApplePayPaymentTokenHeader(null, null, null, null, str, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ApplePayPaymentTokenHeader value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.transactionId);
                protoAdapter2.encodeWithTag(writer, 4, value.publicKeyHash);
                protoAdapter2.encodeWithTag(writer, 3, value.wrappedKey);
                protoAdapter2.encodeWithTag(writer, 2, value.ephemeralPublicKey);
                protoAdapter2.encodeWithTag(writer, 1, value.applicationData);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplePayPaymentTokenHeader(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.applicationData = str;
        this.ephemeralPublicKey = str2;
        this.wrappedKey = str3;
        this.publicKeyHash = str4;
        this.transactionId = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApplePayPaymentTokenHeader)) {
            return false;
        }
        ApplePayPaymentTokenHeader applePayPaymentTokenHeader = (ApplePayPaymentTokenHeader) obj;
        return Intrinsics.areEqual(unknownFields(), applePayPaymentTokenHeader.unknownFields()) && Intrinsics.areEqual(this.applicationData, applePayPaymentTokenHeader.applicationData) && Intrinsics.areEqual(this.ephemeralPublicKey, applePayPaymentTokenHeader.ephemeralPublicKey) && Intrinsics.areEqual(this.wrappedKey, applePayPaymentTokenHeader.wrappedKey) && Intrinsics.areEqual(this.publicKeyHash, applePayPaymentTokenHeader.publicKeyHash) && Intrinsics.areEqual(this.transactionId, applePayPaymentTokenHeader.transactionId);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.applicationData;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.ephemeralPublicKey;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.wrappedKey;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.publicKeyHash;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.transactionId;
        int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.applicationData = this.applicationData;
        builder.ephemeralPublicKey = this.ephemeralPublicKey;
        builder.wrappedKey = this.wrappedKey;
        builder.publicKeyHash = this.publicKeyHash;
        builder.transactionId = this.transactionId;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.applicationData != null) {
            arrayList.add("applicationData=██");
        }
        if (this.ephemeralPublicKey != null) {
            arrayList.add("ephemeralPublicKey=██");
        }
        if (this.wrappedKey != null) {
            arrayList.add("wrappedKey=██");
        }
        if (this.publicKeyHash != null) {
            arrayList.add("publicKeyHash=██");
        }
        String str = this.transactionId;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "transactionId=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ApplePayPaymentTokenHeader{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/cash/lynx/api/v1_0/model/ApplePayPaymentTokenHeader$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/cash/lynx/api/v1_0/model/ApplePayPaymentTokenHeader$Builder;", "", "body", "Lcom/squareup/cash/lynx/api/v1_0/model/ApplePayPaymentTokenHeader;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/cash/lynx/api/v1_0/model/ApplePayPaymentTokenHeader;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ApplePayPaymentTokenHeader build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
