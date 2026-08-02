package com.squareup.cash.cryptocurrency;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.cryptocurrency.SponsorshipCryptoAuthorization;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class SponsorshipCryptoAuthorization$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new SponsorshipCryptoAuthorization(m, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                m.add(SponsorshipCryptoAuthorization.FeatureAuthorization.ADAPTER.decode(protoReader));
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        SponsorshipCryptoAuthorization sponsorshipCryptoAuthorization = (SponsorshipCryptoAuthorization) obj;
        reverseProtoWriter.getClass();
        sponsorshipCryptoAuthorization.getClass();
        reverseProtoWriter.writeBytes(sponsorshipCryptoAuthorization.unknownFields());
        SponsorshipCryptoAuthorization.FeatureAuthorization.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 1, sponsorshipCryptoAuthorization.feature_authorizations);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        SponsorshipCryptoAuthorization sponsorshipCryptoAuthorization = (SponsorshipCryptoAuthorization) obj;
        sponsorshipCryptoAuthorization.getClass();
        return SponsorshipCryptoAuthorization.FeatureAuthorization.ADAPTER.asRepeated().encodedSizeWithTag(1, sponsorshipCryptoAuthorization.feature_authorizations) + sponsorshipCryptoAuthorization.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        SponsorshipCryptoAuthorization sponsorshipCryptoAuthorization = (SponsorshipCryptoAuthorization) obj;
        sponsorshipCryptoAuthorization.getClass();
        ArrayList m1169redactElements = TransactorKt.m1169redactElements(sponsorshipCryptoAuthorization.feature_authorizations, SponsorshipCryptoAuthorization.FeatureAuthorization.ADAPTER);
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new SponsorshipCryptoAuthorization(m1169redactElements, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        SponsorshipCryptoAuthorization sponsorshipCryptoAuthorization = (SponsorshipCryptoAuthorization) obj;
        sponsorshipCryptoAuthorization.getClass();
        SponsorshipCryptoAuthorization.FeatureAuthorization.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, sponsorshipCryptoAuthorization.feature_authorizations);
        protoWriter.writeBytes(sponsorshipCryptoAuthorization.unknownFields());
    }
}
