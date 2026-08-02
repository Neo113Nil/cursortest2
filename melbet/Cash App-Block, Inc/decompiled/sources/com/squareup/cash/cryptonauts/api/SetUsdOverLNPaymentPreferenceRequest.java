package com.squareup.cash.cryptonauts.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.app.ResolveMergeRequest;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SetUsdOverLNPaymentPreferenceRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetUsdOverLNPaymentPreferenceRequest> CREATOR;
    public final Boolean has_usd_over_ln_payment;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetUsdOverLNPaymentPreferenceRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.cryptonauts.api.SetUsdOverLNPaymentPreferenceRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SetUsdOverLNPaymentPreferenceRequest((RequestContext) obj2, (Boolean) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj2);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetUsdOverLNPaymentPreferenceRequest setUsdOverLNPaymentPreferenceRequest = (SetUsdOverLNPaymentPreferenceRequest) obj;
                reverseProtoWriter.getClass();
                setUsdOverLNPaymentPreferenceRequest.getClass();
                reverseProtoWriter.writeBytes(setUsdOverLNPaymentPreferenceRequest.unknownFields());
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 2, setUsdOverLNPaymentPreferenceRequest.request_context);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 1, setUsdOverLNPaymentPreferenceRequest.has_usd_over_ln_payment);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetUsdOverLNPaymentPreferenceRequest setUsdOverLNPaymentPreferenceRequest = (SetUsdOverLNPaymentPreferenceRequest) obj;
                setUsdOverLNPaymentPreferenceRequest.getClass();
                return RequestContext.ADAPTER.encodedSizeWithTag(2, setUsdOverLNPaymentPreferenceRequest.request_context) + ProtoAdapter.BOOL.encodedSizeWithTag(1, setUsdOverLNPaymentPreferenceRequest.has_usd_over_ln_payment) + setUsdOverLNPaymentPreferenceRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetUsdOverLNPaymentPreferenceRequest setUsdOverLNPaymentPreferenceRequest = (SetUsdOverLNPaymentPreferenceRequest) obj;
                setUsdOverLNPaymentPreferenceRequest.getClass();
                RequestContext requestContext = setUsdOverLNPaymentPreferenceRequest.request_context;
                return SetUsdOverLNPaymentPreferenceRequest.copy$default(setUsdOverLNPaymentPreferenceRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 1);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetUsdOverLNPaymentPreferenceRequest setUsdOverLNPaymentPreferenceRequest = (SetUsdOverLNPaymentPreferenceRequest) obj;
                setUsdOverLNPaymentPreferenceRequest.getClass();
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, setUsdOverLNPaymentPreferenceRequest.has_usd_over_ln_payment);
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 2, setUsdOverLNPaymentPreferenceRequest.request_context);
                protoWriter.writeBytes(setUsdOverLNPaymentPreferenceRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetUsdOverLNPaymentPreferenceRequest(RequestContext requestContext, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.has_usd_over_ln_payment = bool;
        this.request_context = requestContext;
    }

    public static SetUsdOverLNPaymentPreferenceRequest copy$default(SetUsdOverLNPaymentPreferenceRequest setUsdOverLNPaymentPreferenceRequest, RequestContext requestContext, ByteString byteString, int i) {
        Boolean bool = setUsdOverLNPaymentPreferenceRequest.has_usd_over_ln_payment;
        if ((i & 4) != 0) {
            byteString = setUsdOverLNPaymentPreferenceRequest.unknownFields();
        }
        setUsdOverLNPaymentPreferenceRequest.getClass();
        byteString.getClass();
        return new SetUsdOverLNPaymentPreferenceRequest(requestContext, bool, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetUsdOverLNPaymentPreferenceRequest)) {
            return false;
        }
        SetUsdOverLNPaymentPreferenceRequest setUsdOverLNPaymentPreferenceRequest = (SetUsdOverLNPaymentPreferenceRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setUsdOverLNPaymentPreferenceRequest.unknownFields()) && Intrinsics.areEqual(this.has_usd_over_ln_payment, setUsdOverLNPaymentPreferenceRequest.has_usd_over_ln_payment) && Intrinsics.areEqual(this.request_context, setUsdOverLNPaymentPreferenceRequest.request_context);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.has_usd_over_ln_payment;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        RequestContext requestContext = this.request_context;
        int hashCode3 = hashCode2 + (requestContext != null ? requestContext.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ResolveMergeRequest.Builder builder = new ResolveMergeRequest.Builder(1);
        builder.confirm_merge = this.has_usd_over_ln_payment;
        builder.request_context = this.request_context;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.has_usd_over_ln_payment;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_usd_over_ln_payment=", bool, arrayList);
        }
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetUsdOverLNPaymentPreferenceRequest{", "}", 0, null, null, 56);
    }
}
