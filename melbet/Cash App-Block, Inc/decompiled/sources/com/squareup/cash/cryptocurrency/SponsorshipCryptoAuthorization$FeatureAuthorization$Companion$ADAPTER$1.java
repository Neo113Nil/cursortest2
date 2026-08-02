package com.squareup.cash.cryptocurrency;

import com.squareup.cash.cryptocurrency.SponsorshipCryptoAuthorization;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class SponsorshipCryptoAuthorization$FeatureAuthorization$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SponsorshipCryptoAuthorization.FeatureAuthorization((SponsorshipCryptoAuthorization.Feature) obj, (Boolean) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                try {
                    obj = SponsorshipCryptoAuthorization.Feature.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.BOOL.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SponsorshipCryptoAuthorization.FeatureAuthorization featureAuthorization = (SponsorshipCryptoAuthorization.FeatureAuthorization) obj;
        reverseProtoWriter.getClass();
        featureAuthorization.getClass();
        reverseProtoWriter.writeBytes(featureAuthorization.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, featureAuthorization.is_authorized);
        SponsorshipCryptoAuthorization.Feature.ADAPTER.encodeWithTag(reverseProtoWriter, 1, featureAuthorization.feature);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SponsorshipCryptoAuthorization.FeatureAuthorization featureAuthorization = (SponsorshipCryptoAuthorization.FeatureAuthorization) obj;
        featureAuthorization.getClass();
        return ProtoAdapter.BOOL.encodedSizeWithTag(2, featureAuthorization.is_authorized) + SponsorshipCryptoAuthorization.Feature.ADAPTER.encodedSizeWithTag(1, featureAuthorization.feature) + featureAuthorization.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SponsorshipCryptoAuthorization.FeatureAuthorization featureAuthorization = (SponsorshipCryptoAuthorization.FeatureAuthorization) obj;
        featureAuthorization.getClass();
        ByteString byteString = ByteString.EMPTY;
        SponsorshipCryptoAuthorization.Feature feature = featureAuthorization.feature;
        Boolean bool = featureAuthorization.is_authorized;
        byteString.getClass();
        return new SponsorshipCryptoAuthorization.FeatureAuthorization(feature, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SponsorshipCryptoAuthorization.FeatureAuthorization featureAuthorization = (SponsorshipCryptoAuthorization.FeatureAuthorization) obj;
        featureAuthorization.getClass();
        SponsorshipCryptoAuthorization.Feature.ADAPTER.encodeWithTag(protoWriter, 1, featureAuthorization.feature);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, featureAuthorization.is_authorized);
        protoWriter.writeBytes(featureAuthorization.unknownFields());
    }
}
