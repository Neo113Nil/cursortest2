package com.squareup.cash.cryptonauts.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Member;
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
public final class SetCryptoControlsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetCryptoControlsRequest> CREATOR;
    public final SetCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl customer_control;
    public final String customer_token;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetCryptoControlsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.cryptonauts.api.SetCryptoControlsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                SetCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SetCryptoControlsRequest((String) obj, setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 100) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl = new SetCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl((CryptoExchangeCustomerControl) CryptoExchangeCustomerControl.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetCryptoControlsRequest setCryptoControlsRequest = (SetCryptoControlsRequest) obj;
                reverseProtoWriter.getClass();
                setCryptoControlsRequest.getClass();
                reverseProtoWriter.writeBytes(setCryptoControlsRequest.unknownFields());
                SetCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl = setCryptoControlsRequest.customer_control;
                if (setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl != null) {
                    CryptoExchangeCustomerControl.ADAPTER.encodeWithTag(reverseProtoWriter, 100, setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl.value);
                } else if (setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, setCryptoControlsRequest.customer_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetCryptoControlsRequest setCryptoControlsRequest = (SetCryptoControlsRequest) obj;
                setCryptoControlsRequest.getClass();
                int encodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, setCryptoControlsRequest.customer_token) + setCryptoControlsRequest.unknownFields().getSize$okio();
                SetCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl = setCryptoControlsRequest.customer_control;
                if (setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl != null) {
                    return CryptoExchangeCustomerControl.ADAPTER.encodedSizeWithTag(100, setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl.value) + encodedSizeWithTag;
                }
                if (setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl == null) {
                    return encodedSizeWithTag;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetCryptoControlsRequest setCryptoControlsRequest = (SetCryptoControlsRequest) obj;
                setCryptoControlsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = setCryptoControlsRequest.customer_token;
                SetCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl = setCryptoControlsRequest.customer_control;
                byteString.getClass();
                return new SetCryptoControlsRequest(str, setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetCryptoControlsRequest setCryptoControlsRequest = (SetCryptoControlsRequest) obj;
                setCryptoControlsRequest.getClass();
                ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, setCryptoControlsRequest.customer_token);
                SetCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl = setCryptoControlsRequest.customer_control;
                if (setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl != null) {
                    CryptoExchangeCustomerControl.ADAPTER.encodeWithTag(protoWriter, 100, setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl.value);
                } else if (setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(setCryptoControlsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCryptoControlsRequest(String str, SetCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.customer_token = str;
        this.customer_control = setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetCryptoControlsRequest)) {
            return false;
        }
        SetCryptoControlsRequest setCryptoControlsRequest = (SetCryptoControlsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setCryptoControlsRequest.unknownFields()) && Intrinsics.areEqual(this.customer_token, setCryptoControlsRequest.customer_token) && Intrinsics.areEqual(this.customer_control, setCryptoControlsRequest.customer_control);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        SetCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl = this.customer_control;
        int hashCode3 = hashCode2 + (setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl != null ? setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Member.Builder builder = new Member.Builder(13);
        builder.customer_token = this.customer_token;
        builder.sponsorship_tier = this.customer_control;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        SetCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl = this.customer_control;
        if (setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl != null) {
            arrayList.add("customer_control=" + setCryptoControlsRequest$CustomerControl$CryptoExchangeCustomerControl);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetCryptoControlsRequest{", "}", 0, null, null, 56);
    }
}
