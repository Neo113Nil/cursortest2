package com.squareup.cash.lynx.api.v1_0.model;

import com.squareup.protos.binfo.api.CardProduct;
import com.squareup.protos.binfo.api.PrepaidStatus;
import com.squareup.protos.common.countries.Country;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class BinfoDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BinfoDetails((String) obj, (Country) obj2, (String) obj3, (PrepaidStatus) obj4, (String) obj5, (CardProduct) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 2:
                    try {
                        obj2 = Country.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 3:
                    obj3 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 4:
                    try {
                        obj4 = PrepaidStatus.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        break;
                    }
                case 5:
                    obj5 = ProtoAdapter.STRING.decode(protoReader);
                    break;
                case 6:
                    try {
                        obj6 = CardProduct.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        break;
                    }
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BinfoDetails binfoDetails = (BinfoDetails) obj;
        reverseProtoWriter.getClass();
        binfoDetails.getClass();
        reverseProtoWriter.writeBytes(binfoDetails.unknownFields());
        CardProduct.ADAPTER.encodeWithTag(reverseProtoWriter, 6, binfoDetails.card_product);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, binfoDetails.normalized_issuer_name);
        PrepaidStatus.ADAPTER.encodeWithTag(reverseProtoWriter, 4, binfoDetails.prepaid_status);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, binfoDetails.card_subcategory);
        Country.ADAPTER.encodeWithTag(reverseProtoWriter, 2, binfoDetails.country);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, binfoDetails.issuer_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BinfoDetails binfoDetails = (BinfoDetails) obj;
        binfoDetails.getClass();
        int size$okio = binfoDetails.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return CardProduct.ADAPTER.encodedSizeWithTag(6, binfoDetails.card_product) + protoAdapter.encodedSizeWithTag(5, binfoDetails.normalized_issuer_name) + PrepaidStatus.ADAPTER.encodedSizeWithTag(4, binfoDetails.prepaid_status) + protoAdapter.encodedSizeWithTag(3, binfoDetails.card_subcategory) + Country.ADAPTER.encodedSizeWithTag(2, binfoDetails.country) + protoAdapter.encodedSizeWithTag(1, binfoDetails.issuer_name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BinfoDetails binfoDetails = (BinfoDetails) obj;
        binfoDetails.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = binfoDetails.issuer_name;
        Country country = binfoDetails.country;
        String str2 = binfoDetails.card_subcategory;
        PrepaidStatus prepaidStatus = binfoDetails.prepaid_status;
        String str3 = binfoDetails.normalized_issuer_name;
        CardProduct cardProduct = binfoDetails.card_product;
        byteString.getClass();
        return new BinfoDetails(str, country, str2, prepaidStatus, str3, cardProduct, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BinfoDetails binfoDetails = (BinfoDetails) obj;
        binfoDetails.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, binfoDetails.issuer_name);
        Country.ADAPTER.encodeWithTag(protoWriter, 2, binfoDetails.country);
        protoAdapter.encodeWithTag(protoWriter, 3, binfoDetails.card_subcategory);
        PrepaidStatus.ADAPTER.encodeWithTag(protoWriter, 4, binfoDetails.prepaid_status);
        protoAdapter.encodeWithTag(protoWriter, 5, binfoDetails.normalized_issuer_name);
        CardProduct.ADAPTER.encodeWithTag(protoWriter, 6, binfoDetails.card_product);
        protoWriter.writeBytes(binfoDetails.unknownFields());
    }
}
