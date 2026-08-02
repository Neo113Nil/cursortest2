package com.squareup.cash.cashlynxflow.api.v2;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.lynx.api.v1_0.model.ApplePayPaymentToken;
import com.squareup.cash.lynx.api.v1_0.model.GooglePayPaymentToken;
import com.squareup.cash.payments.presenters.UtilsKt;
import com.squareup.protos.cash.badging.api.Badge;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class AuthorizeDigitalWalletPaymentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AuthorizeDigitalWalletPaymentRequest> CREATOR;
    public final GlobalAddress address;
    public final UtilsKt digital_wallet_payment_token;
    public final String email;
    public final String first_name;
    public final String last_name;
    public final String phone_number;
    public final String postal_code;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AuthorizeDigitalWalletPaymentRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.cashlynxflow.api.v2.AuthorizeDigitalWalletPaymentRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                UtilsKt utilsKt = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new AuthorizeDigitalWalletPaymentRequest(utilsKt, (RequestContext) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (GlobalAddress) obj7, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            utilsKt = new AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$ApplePayPaymentToken((ApplePayPaymentToken) ApplePayPaymentToken.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            utilsKt = new AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$GooglePayPaymentToken((GooglePayPaymentToken) GooglePayPaymentToken.ADAPTER.decode(protoReader));
                            break;
                        case 3:
                            obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                            break;
                        case 4:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            obj4 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            obj6 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 9:
                            obj7 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj7);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                AuthorizeDigitalWalletPaymentRequest authorizeDigitalWalletPaymentRequest = (AuthorizeDigitalWalletPaymentRequest) obj;
                reverseProtoWriter.getClass();
                authorizeDigitalWalletPaymentRequest.getClass();
                reverseProtoWriter.writeBytes(authorizeDigitalWalletPaymentRequest.unknownFields());
                UtilsKt utilsKt = authorizeDigitalWalletPaymentRequest.digital_wallet_payment_token;
                if (utilsKt instanceof AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$ApplePayPaymentToken) {
                    ApplePayPaymentToken.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$ApplePayPaymentToken) utilsKt).value);
                } else if (utilsKt instanceof AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$GooglePayPaymentToken) {
                    GooglePayPaymentToken.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$GooglePayPaymentToken) utilsKt).value);
                } else if (utilsKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 9, authorizeDigitalWalletPaymentRequest.address);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 8, authorizeDigitalWalletPaymentRequest.postal_code);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 7, authorizeDigitalWalletPaymentRequest.last_name);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, authorizeDigitalWalletPaymentRequest.first_name);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, authorizeDigitalWalletPaymentRequest.phone_number);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, authorizeDigitalWalletPaymentRequest.email);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 3, authorizeDigitalWalletPaymentRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                int encodedSizeWithTag;
                AuthorizeDigitalWalletPaymentRequest authorizeDigitalWalletPaymentRequest = (AuthorizeDigitalWalletPaymentRequest) obj;
                authorizeDigitalWalletPaymentRequest.getClass();
                int size$okio = authorizeDigitalWalletPaymentRequest.unknownFields().getSize$okio();
                UtilsKt utilsKt = authorizeDigitalWalletPaymentRequest.digital_wallet_payment_token;
                if (utilsKt instanceof AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$ApplePayPaymentToken) {
                    encodedSizeWithTag = ApplePayPaymentToken.ADAPTER.encodedSizeWithTag(1, ((AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$ApplePayPaymentToken) utilsKt).value);
                } else {
                    if (!(utilsKt instanceof AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$GooglePayPaymentToken)) {
                        if (utilsKt != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        int encodedSizeWithTag2 = RequestContext.ADAPTER.encodedSizeWithTag(3, authorizeDigitalWalletPaymentRequest.request_context) + size$okio;
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return GlobalAddress.ADAPTER.encodedSizeWithTag(9, authorizeDigitalWalletPaymentRequest.address) + protoAdapter2.encodedSizeWithTag(8, authorizeDigitalWalletPaymentRequest.postal_code) + protoAdapter2.encodedSizeWithTag(7, authorizeDigitalWalletPaymentRequest.last_name) + protoAdapter2.encodedSizeWithTag(6, authorizeDigitalWalletPaymentRequest.first_name) + protoAdapter2.encodedSizeWithTag(5, authorizeDigitalWalletPaymentRequest.phone_number) + protoAdapter2.encodedSizeWithTag(4, authorizeDigitalWalletPaymentRequest.email) + encodedSizeWithTag2;
                    }
                    encodedSizeWithTag = GooglePayPaymentToken.ADAPTER.encodedSizeWithTag(2, ((AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$GooglePayPaymentToken) utilsKt).value);
                }
                size$okio += encodedSizeWithTag;
                int encodedSizeWithTag22 = RequestContext.ADAPTER.encodedSizeWithTag(3, authorizeDigitalWalletPaymentRequest.request_context) + size$okio;
                ProtoAdapter protoAdapter22 = ProtoAdapter.STRING;
                return GlobalAddress.ADAPTER.encodedSizeWithTag(9, authorizeDigitalWalletPaymentRequest.address) + protoAdapter22.encodedSizeWithTag(8, authorizeDigitalWalletPaymentRequest.postal_code) + protoAdapter22.encodedSizeWithTag(7, authorizeDigitalWalletPaymentRequest.last_name) + protoAdapter22.encodedSizeWithTag(6, authorizeDigitalWalletPaymentRequest.first_name) + protoAdapter22.encodedSizeWithTag(5, authorizeDigitalWalletPaymentRequest.phone_number) + protoAdapter22.encodedSizeWithTag(4, authorizeDigitalWalletPaymentRequest.email) + encodedSizeWithTag22;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                AuthorizeDigitalWalletPaymentRequest authorizeDigitalWalletPaymentRequest = (AuthorizeDigitalWalletPaymentRequest) obj;
                authorizeDigitalWalletPaymentRequest.getClass();
                RequestContext requestContext = authorizeDigitalWalletPaymentRequest.request_context;
                return AuthorizeDigitalWalletPaymentRequest.copy$default(authorizeDigitalWalletPaymentRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 1);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                AuthorizeDigitalWalletPaymentRequest authorizeDigitalWalletPaymentRequest = (AuthorizeDigitalWalletPaymentRequest) obj;
                authorizeDigitalWalletPaymentRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 3, authorizeDigitalWalletPaymentRequest.request_context);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 4, authorizeDigitalWalletPaymentRequest.email);
                protoAdapter2.encodeWithTag(protoWriter, 5, authorizeDigitalWalletPaymentRequest.phone_number);
                protoAdapter2.encodeWithTag(protoWriter, 6, authorizeDigitalWalletPaymentRequest.first_name);
                protoAdapter2.encodeWithTag(protoWriter, 7, authorizeDigitalWalletPaymentRequest.last_name);
                protoAdapter2.encodeWithTag(protoWriter, 8, authorizeDigitalWalletPaymentRequest.postal_code);
                GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 9, authorizeDigitalWalletPaymentRequest.address);
                UtilsKt utilsKt = authorizeDigitalWalletPaymentRequest.digital_wallet_payment_token;
                if (utilsKt instanceof AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$ApplePayPaymentToken) {
                    ApplePayPaymentToken.ADAPTER.encodeWithTag(protoWriter, 1, ((AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$ApplePayPaymentToken) utilsKt).value);
                } else if (utilsKt instanceof AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$GooglePayPaymentToken) {
                    GooglePayPaymentToken.ADAPTER.encodeWithTag(protoWriter, 2, ((AuthorizeDigitalWalletPaymentRequest$DigitalWalletPaymentToken$GooglePayPaymentToken) utilsKt).value);
                } else if (utilsKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(authorizeDigitalWalletPaymentRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizeDigitalWalletPaymentRequest(UtilsKt utilsKt, RequestContext requestContext, String str, String str2, String str3, String str4, String str5, GlobalAddress globalAddress, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.digital_wallet_payment_token = utilsKt;
        this.request_context = requestContext;
        this.email = str;
        this.phone_number = str2;
        this.first_name = str3;
        this.last_name = str4;
        this.postal_code = str5;
        this.address = globalAddress;
    }

    public static AuthorizeDigitalWalletPaymentRequest copy$default(AuthorizeDigitalWalletPaymentRequest authorizeDigitalWalletPaymentRequest, RequestContext requestContext, ByteString byteString, int i) {
        UtilsKt utilsKt = authorizeDigitalWalletPaymentRequest.digital_wallet_payment_token;
        String str = (i & 4) != 0 ? authorizeDigitalWalletPaymentRequest.email : null;
        String str2 = (i & 8) != 0 ? authorizeDigitalWalletPaymentRequest.phone_number : null;
        String str3 = (i & 16) != 0 ? authorizeDigitalWalletPaymentRequest.first_name : null;
        String str4 = (i & 32) != 0 ? authorizeDigitalWalletPaymentRequest.last_name : null;
        String str5 = (i & 64) != 0 ? authorizeDigitalWalletPaymentRequest.postal_code : null;
        GlobalAddress globalAddress = (i & 128) != 0 ? authorizeDigitalWalletPaymentRequest.address : null;
        if ((i & 256) != 0) {
            byteString = authorizeDigitalWalletPaymentRequest.unknownFields();
        }
        ByteString byteString2 = byteString;
        authorizeDigitalWalletPaymentRequest.getClass();
        byteString2.getClass();
        return new AuthorizeDigitalWalletPaymentRequest(utilsKt, requestContext, str, str2, str3, str4, str5, globalAddress, byteString2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthorizeDigitalWalletPaymentRequest)) {
            return false;
        }
        AuthorizeDigitalWalletPaymentRequest authorizeDigitalWalletPaymentRequest = (AuthorizeDigitalWalletPaymentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), authorizeDigitalWalletPaymentRequest.unknownFields()) && Intrinsics.areEqual(this.digital_wallet_payment_token, authorizeDigitalWalletPaymentRequest.digital_wallet_payment_token) && Intrinsics.areEqual(this.request_context, authorizeDigitalWalletPaymentRequest.request_context) && Intrinsics.areEqual(this.email, authorizeDigitalWalletPaymentRequest.email) && Intrinsics.areEqual(this.phone_number, authorizeDigitalWalletPaymentRequest.phone_number) && Intrinsics.areEqual(this.first_name, authorizeDigitalWalletPaymentRequest.first_name) && Intrinsics.areEqual(this.last_name, authorizeDigitalWalletPaymentRequest.last_name) && Intrinsics.areEqual(this.postal_code, authorizeDigitalWalletPaymentRequest.postal_code) && Intrinsics.areEqual(this.address, authorizeDigitalWalletPaymentRequest.address);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UtilsKt utilsKt = this.digital_wallet_payment_token;
        int hashCode2 = (hashCode + (utilsKt != null ? utilsKt.hashCode() : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode3 = (hashCode2 + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        String str = this.email;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.phone_number;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.first_name;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.last_name;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.postal_code;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        GlobalAddress globalAddress = this.address;
        int hashCode9 = hashCode8 + (globalAddress != null ? globalAddress.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Badge.Builder builder = new Badge.Builder(1, false);
        builder.external_version = this.digital_wallet_payment_token;
        builder.updated_at = this.request_context;
        builder.external_token = this.email;
        builder.customer_token = this.phone_number;
        builder.created_at = this.first_name;
        builder.is_badged = this.last_name;
        builder.item_type = this.postal_code;
        builder.count_groups = this.address;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UtilsKt utilsKt = this.digital_wallet_payment_token;
        if (utilsKt != null) {
            arrayList.add("digital_wallet_payment_token=" + utilsKt);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        if (this.email != null) {
            arrayList.add("email=██");
        }
        if (this.phone_number != null) {
            arrayList.add("phone_number=██");
        }
        if (this.first_name != null) {
            arrayList.add("first_name=██");
        }
        if (this.last_name != null) {
            arrayList.add("last_name=██");
        }
        if (this.postal_code != null) {
            arrayList.add("postal_code=██");
        }
        if (this.address != null) {
            arrayList.add("address=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AuthorizeDigitalWalletPaymentRequest{", "}", 0, null, null, 56);
    }
}
