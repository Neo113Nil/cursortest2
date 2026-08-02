package com.squareup.cash.bankingbenefits.api.v1_0.app;

import android.os.Parcelable;
import com.squareup.cash.bankingbenefits.api.v1_0.core.BenefitLeafletVariant;
import com.squareup.cash.bankingbenefits.api.v1_0.core.PaycheckDepositStatusActiveBenefitType;
import com.squareup.protos.cash.aegis.core.Member;
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
public final class GetBenefitLeafletRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetBenefitLeafletRequest> CREATOR;
    public final PaycheckDepositStatusActiveBenefitType benefit;
    public final BenefitLeafletVariant leaflet_variant;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetBenefitLeafletRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletRequest$Companion$ADAPTER$1
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
                        return new GetBenefitLeafletRequest((PaycheckDepositStatusActiveBenefitType) obj, (BenefitLeafletVariant) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        try {
                            obj = PaycheckDepositStatusActiveBenefitType.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj2 = BenefitLeafletVariant.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetBenefitLeafletRequest getBenefitLeafletRequest = (GetBenefitLeafletRequest) obj;
                reverseProtoWriter.getClass();
                getBenefitLeafletRequest.getClass();
                reverseProtoWriter.writeBytes(getBenefitLeafletRequest.unknownFields());
                BenefitLeafletVariant.ADAPTER.encodeWithTag(reverseProtoWriter, 2, getBenefitLeafletRequest.leaflet_variant);
                PaycheckDepositStatusActiveBenefitType.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getBenefitLeafletRequest.benefit);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetBenefitLeafletRequest getBenefitLeafletRequest = (GetBenefitLeafletRequest) obj;
                getBenefitLeafletRequest.getClass();
                return BenefitLeafletVariant.ADAPTER.encodedSizeWithTag(2, getBenefitLeafletRequest.leaflet_variant) + PaycheckDepositStatusActiveBenefitType.ADAPTER.encodedSizeWithTag(1, getBenefitLeafletRequest.benefit) + getBenefitLeafletRequest.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetBenefitLeafletRequest getBenefitLeafletRequest = (GetBenefitLeafletRequest) obj;
                getBenefitLeafletRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                PaycheckDepositStatusActiveBenefitType paycheckDepositStatusActiveBenefitType = getBenefitLeafletRequest.benefit;
                BenefitLeafletVariant benefitLeafletVariant = getBenefitLeafletRequest.leaflet_variant;
                byteString.getClass();
                return new GetBenefitLeafletRequest(paycheckDepositStatusActiveBenefitType, benefitLeafletVariant, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetBenefitLeafletRequest getBenefitLeafletRequest = (GetBenefitLeafletRequest) obj;
                getBenefitLeafletRequest.getClass();
                PaycheckDepositStatusActiveBenefitType.ADAPTER.encodeWithTag(protoWriter, 1, getBenefitLeafletRequest.benefit);
                BenefitLeafletVariant.ADAPTER.encodeWithTag(protoWriter, 2, getBenefitLeafletRequest.leaflet_variant);
                protoWriter.writeBytes(getBenefitLeafletRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBenefitLeafletRequest(PaycheckDepositStatusActiveBenefitType paycheckDepositStatusActiveBenefitType, BenefitLeafletVariant benefitLeafletVariant, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.benefit = paycheckDepositStatusActiveBenefitType;
        this.leaflet_variant = benefitLeafletVariant;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetBenefitLeafletRequest)) {
            return false;
        }
        GetBenefitLeafletRequest getBenefitLeafletRequest = (GetBenefitLeafletRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getBenefitLeafletRequest.unknownFields()) && this.benefit == getBenefitLeafletRequest.benefit && this.leaflet_variant == getBenefitLeafletRequest.leaflet_variant;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PaycheckDepositStatusActiveBenefitType paycheckDepositStatusActiveBenefitType = this.benefit;
        int hashCode2 = (hashCode + (paycheckDepositStatusActiveBenefitType != null ? paycheckDepositStatusActiveBenefitType.hashCode() : 0)) * 37;
        BenefitLeafletVariant benefitLeafletVariant = this.leaflet_variant;
        int hashCode3 = hashCode2 + (benefitLeafletVariant != null ? benefitLeafletVariant.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Member.Builder builder = new Member.Builder(5);
        builder.customer_token = this.benefit;
        builder.sponsorship_tier = this.leaflet_variant;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PaycheckDepositStatusActiveBenefitType paycheckDepositStatusActiveBenefitType = this.benefit;
        if (paycheckDepositStatusActiveBenefitType != null) {
            arrayList.add("benefit=" + paycheckDepositStatusActiveBenefitType);
        }
        BenefitLeafletVariant benefitLeafletVariant = this.leaflet_variant;
        if (benefitLeafletVariant != null) {
            arrayList.add("leaflet_variant=" + benefitLeafletVariant);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBenefitLeafletRequest{", "}", 0, null, null, 56);
    }
}
