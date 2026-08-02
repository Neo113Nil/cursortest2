package com.squareup.cash.cryptonauts.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Member;
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
public final class StartCryptoOnboardingRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<StartCryptoOnboardingRequest> CREATOR;
    public final CryptoFeature crypto_feature;
    public final RequestContext request_context;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(StartCryptoOnboardingRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.cryptonauts.api.StartCryptoOnboardingRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new StartCryptoOnboardingRequest((RequestContext) obj, (CryptoFeature) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(RequestContext.ADAPTER, protoReader, obj);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj2 = CryptoFeature.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                StartCryptoOnboardingRequest startCryptoOnboardingRequest = (StartCryptoOnboardingRequest) obj;
                reverseProtoWriter.getClass();
                startCryptoOnboardingRequest.getClass();
                reverseProtoWriter.writeBytes(startCryptoOnboardingRequest.unknownFields());
                CryptoFeature.ADAPTER.encodeWithTag(reverseProtoWriter, 2, startCryptoOnboardingRequest.crypto_feature);
                RequestContext.ADAPTER.encodeWithTag(reverseProtoWriter, 1, startCryptoOnboardingRequest.request_context);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                StartCryptoOnboardingRequest startCryptoOnboardingRequest = (StartCryptoOnboardingRequest) obj;
                startCryptoOnboardingRequest.getClass();
                return CryptoFeature.ADAPTER.encodedSizeWithTag(2, startCryptoOnboardingRequest.crypto_feature) + RequestContext.ADAPTER.encodedSizeWithTag(1, startCryptoOnboardingRequest.request_context) + startCryptoOnboardingRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                StartCryptoOnboardingRequest startCryptoOnboardingRequest = (StartCryptoOnboardingRequest) obj;
                startCryptoOnboardingRequest.getClass();
                RequestContext requestContext = startCryptoOnboardingRequest.request_context;
                return StartCryptoOnboardingRequest.copy$default(startCryptoOnboardingRequest, requestContext != null ? (RequestContext) RequestContext.ADAPTER.redact(requestContext) : null, ByteString.EMPTY, 2);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                StartCryptoOnboardingRequest startCryptoOnboardingRequest = (StartCryptoOnboardingRequest) obj;
                startCryptoOnboardingRequest.getClass();
                RequestContext.ADAPTER.encodeWithTag(protoWriter, 1, startCryptoOnboardingRequest.request_context);
                CryptoFeature.ADAPTER.encodeWithTag(protoWriter, 2, startCryptoOnboardingRequest.crypto_feature);
                protoWriter.writeBytes(startCryptoOnboardingRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartCryptoOnboardingRequest(RequestContext requestContext, CryptoFeature cryptoFeature, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_context = requestContext;
        this.crypto_feature = cryptoFeature;
    }

    public static StartCryptoOnboardingRequest copy$default(StartCryptoOnboardingRequest startCryptoOnboardingRequest, RequestContext requestContext, ByteString byteString, int i) {
        CryptoFeature cryptoFeature = startCryptoOnboardingRequest.crypto_feature;
        if ((i & 4) != 0) {
            byteString = startCryptoOnboardingRequest.unknownFields();
        }
        startCryptoOnboardingRequest.getClass();
        byteString.getClass();
        return new StartCryptoOnboardingRequest(requestContext, cryptoFeature, byteString);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartCryptoOnboardingRequest)) {
            return false;
        }
        StartCryptoOnboardingRequest startCryptoOnboardingRequest = (StartCryptoOnboardingRequest) obj;
        return Intrinsics.areEqual(unknownFields(), startCryptoOnboardingRequest.unknownFields()) && Intrinsics.areEqual(this.request_context, startCryptoOnboardingRequest.request_context) && this.crypto_feature == startCryptoOnboardingRequest.crypto_feature;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestContext requestContext = this.request_context;
        int hashCode2 = (hashCode + (requestContext != null ? requestContext.hashCode() : 0)) * 37;
        CryptoFeature cryptoFeature = this.crypto_feature;
        int hashCode3 = hashCode2 + (cryptoFeature != null ? cryptoFeature.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Member.Builder builder = new Member.Builder(14);
        builder.customer_token = this.request_context;
        builder.sponsorship_tier = this.crypto_feature;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestContext requestContext = this.request_context;
        if (requestContext != null) {
            Matcher$$ExternalSyntheticOutline0.m("request_context=", requestContext, arrayList);
        }
        CryptoFeature cryptoFeature = this.crypto_feature;
        if (cryptoFeature != null) {
            arrayList.add("crypto_feature=" + cryptoFeature);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "StartCryptoOnboardingRequest{", "}", 0, null, null, 56);
    }
}
