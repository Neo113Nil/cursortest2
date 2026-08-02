package com.squareup.cash.cashcommercebrowser.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.vision.text.zzc;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cashcommercebrowser.api.v1.RestrictedItemCheckRequest;
import com.squareup.protos.cash.api.Error;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class RestrictedItemCheckRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RestrictedItemCheckRequest> CREATOR;
    public final String customer_token;
    public final String flow_token;
    public final List item_list;
    public final String merchant_token;
    public final PaymentMethod payment_method;
    public final String sup_token;

    /* loaded from: classes4.dex */
    public enum PaymentMethod implements WireEnum {
        PAYMENT_METHOD_UNSPECIFIED(0),
        PAYMENT_METHOD_AFTER_PAY(1),
        PAYMENT_METHOD_CASH_APP_PAY(2),
        PAYMENT_METHOD_CASH_CARD(3),
        PAYMENT_METHOD_SINGLE_USE_PAYMENT(4);

        public static final RestrictedItemCheckRequest$PaymentMethod$Companion$ADAPTER$1 ADAPTER;
        public static final zzc Companion;
        public final int value;

        static {
            PaymentMethod paymentMethod = PAYMENT_METHOD_UNSPECIFIED;
            Companion = new zzc(18);
            ADAPTER = new RestrictedItemCheckRequest$PaymentMethod$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaymentMethod.class), Syntax.PROTO_2, paymentMethod);
        }

        PaymentMethod(int i) {
            this.value = i;
        }

        public static final PaymentMethod fromValue(int i) {
            Companion.getClass();
            return zzc.fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RestrictedItemCheckRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.cashcommercebrowser.api.v1.RestrictedItemCheckRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new RestrictedItemCheckRequest(m, (RestrictedItemCheckRequest.PaymentMethod) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            m.add(ShoppingCartProduct.ADAPTER.decode(protoReader));
                            break;
                        case 2:
                            try {
                                obj = RestrictedItemCheckRequest.PaymentMethod.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 3:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            obj4 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                RestrictedItemCheckRequest restrictedItemCheckRequest = (RestrictedItemCheckRequest) obj;
                reverseProtoWriter.getClass();
                restrictedItemCheckRequest.getClass();
                reverseProtoWriter.writeBytes(restrictedItemCheckRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, restrictedItemCheckRequest.sup_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, restrictedItemCheckRequest.flow_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, restrictedItemCheckRequest.customer_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, restrictedItemCheckRequest.merchant_token);
                RestrictedItemCheckRequest.PaymentMethod.ADAPTER.encodeWithTag(reverseProtoWriter, 2, restrictedItemCheckRequest.payment_method);
                ShoppingCartProduct.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, restrictedItemCheckRequest.item_list);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RestrictedItemCheckRequest restrictedItemCheckRequest = (RestrictedItemCheckRequest) obj;
                restrictedItemCheckRequest.getClass();
                int encodedSizeWithTag = RestrictedItemCheckRequest.PaymentMethod.ADAPTER.encodedSizeWithTag(2, restrictedItemCheckRequest.payment_method) + ShoppingCartProduct.ADAPTER.asRepeated().encodedSizeWithTag(1, restrictedItemCheckRequest.item_list) + restrictedItemCheckRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(6, restrictedItemCheckRequest.sup_token) + protoAdapter2.encodedSizeWithTag(5, restrictedItemCheckRequest.flow_token) + protoAdapter2.encodedSizeWithTag(4, restrictedItemCheckRequest.customer_token) + protoAdapter2.encodedSizeWithTag(3, restrictedItemCheckRequest.merchant_token) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RestrictedItemCheckRequest restrictedItemCheckRequest = (RestrictedItemCheckRequest) obj;
                restrictedItemCheckRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(restrictedItemCheckRequest.item_list, ShoppingCartProduct.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                RestrictedItemCheckRequest.PaymentMethod paymentMethod = restrictedItemCheckRequest.payment_method;
                String str = restrictedItemCheckRequest.merchant_token;
                String str2 = restrictedItemCheckRequest.customer_token;
                String str3 = restrictedItemCheckRequest.flow_token;
                String str4 = restrictedItemCheckRequest.sup_token;
                byteString.getClass();
                return new RestrictedItemCheckRequest(m1169redactElements, paymentMethod, str, str2, str3, str4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RestrictedItemCheckRequest restrictedItemCheckRequest = (RestrictedItemCheckRequest) obj;
                restrictedItemCheckRequest.getClass();
                ShoppingCartProduct.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, restrictedItemCheckRequest.item_list);
                RestrictedItemCheckRequest.PaymentMethod.ADAPTER.encodeWithTag(protoWriter, 2, restrictedItemCheckRequest.payment_method);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 3, restrictedItemCheckRequest.merchant_token);
                protoAdapter2.encodeWithTag(protoWriter, 4, restrictedItemCheckRequest.customer_token);
                protoAdapter2.encodeWithTag(protoWriter, 5, restrictedItemCheckRequest.flow_token);
                protoAdapter2.encodeWithTag(protoWriter, 6, restrictedItemCheckRequest.sup_token);
                protoWriter.writeBytes(restrictedItemCheckRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RestrictedItemCheckRequest(List list, PaymentMethod paymentMethod, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.payment_method = paymentMethod;
        this.merchant_token = str;
        this.customer_token = str2;
        this.flow_token = str3;
        this.sup_token = str4;
        this.item_list = TransactorKt.immutableCopyOf("item_list", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RestrictedItemCheckRequest)) {
            return false;
        }
        RestrictedItemCheckRequest restrictedItemCheckRequest = (RestrictedItemCheckRequest) obj;
        return Intrinsics.areEqual(unknownFields(), restrictedItemCheckRequest.unknownFields()) && Intrinsics.areEqual(this.item_list, restrictedItemCheckRequest.item_list) && this.payment_method == restrictedItemCheckRequest.payment_method && Intrinsics.areEqual(this.merchant_token, restrictedItemCheckRequest.merchant_token) && Intrinsics.areEqual(this.customer_token, restrictedItemCheckRequest.customer_token) && Intrinsics.areEqual(this.flow_token, restrictedItemCheckRequest.flow_token) && Intrinsics.areEqual(this.sup_token, restrictedItemCheckRequest.sup_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.item_list);
        PaymentMethod paymentMethod = this.payment_method;
        int hashCode = (m + (paymentMethod != null ? paymentMethod.hashCode() : 0)) * 37;
        String str = this.merchant_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.customer_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.flow_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.sup_token;
        int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(2);
        builder.category = this.item_list;
        builder.code = this.payment_method;
        builder.description = this.merchant_token;
        builder.field = this.customer_token;
        builder.retryable = this.flow_token;
        builder.metadata = this.sup_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.item_list;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("item_list=", arrayList, list);
        }
        PaymentMethod paymentMethod = this.payment_method;
        if (paymentMethod != null) {
            arrayList.add("payment_method=" + paymentMethod);
        }
        String str = this.merchant_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "merchant_token=", arrayList);
        }
        String str2 = this.customer_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "customer_token=", arrayList);
        }
        String str3 = this.flow_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "flow_token=", arrayList);
        }
        String str4 = this.sup_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "sup_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RestrictedItemCheckRequest{", "}", 0, null, null, 56);
    }
}
