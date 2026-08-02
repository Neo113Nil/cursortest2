package com.squareup.cash.crow.sync_values;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class RestrictionsData$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new RestrictionsData((String) obj, (Long) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.INT64.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        RestrictionsData restrictionsData = (RestrictionsData) obj;
        reverseProtoWriter.getClass();
        restrictionsData.getClass();
        reverseProtoWriter.writeBytes(restrictionsData.unknownFields());
        ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 2, restrictionsData.sum_of_usd_restrictions_amount_cents);
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 1, restrictionsData.restricted_usd_svb_token);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        RestrictionsData restrictionsData = (RestrictionsData) obj;
        restrictionsData.getClass();
        return ProtoAdapter.INT64.encodedSizeWithTag(2, restrictionsData.sum_of_usd_restrictions_amount_cents) + ProtoAdapter.STRING.encodedSizeWithTag(1, restrictionsData.restricted_usd_svb_token) + restrictionsData.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        RestrictionsData restrictionsData = (RestrictionsData) obj;
        restrictionsData.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = restrictionsData.restricted_usd_svb_token;
        Long l = restrictionsData.sum_of_usd_restrictions_amount_cents;
        byteString.getClass();
        return new RestrictionsData(str, l, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        RestrictionsData restrictionsData = (RestrictionsData) obj;
        restrictionsData.getClass();
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, restrictionsData.restricted_usd_svb_token);
        ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, restrictionsData.sum_of_usd_restrictions_amount_cents);
        protoWriter.writeBytes(restrictionsData.unknownFields());
    }
}
