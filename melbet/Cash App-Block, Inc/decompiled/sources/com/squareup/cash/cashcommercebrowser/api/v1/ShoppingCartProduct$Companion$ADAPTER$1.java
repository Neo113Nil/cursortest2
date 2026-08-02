package com.squareup.cash.cashcommercebrowser.api.v1;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class ShoppingCartProduct$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ShoppingCartProduct((String) obj, (String) obj2, (String) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ShoppingCartProduct shoppingCartProduct = (ShoppingCartProduct) obj;
        reverseProtoWriter.getClass();
        shoppingCartProduct.getClass();
        reverseProtoWriter.writeBytes(shoppingCartProduct.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, shoppingCartProduct.image_url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, shoppingCartProduct.url);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, shoppingCartProduct.name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ShoppingCartProduct shoppingCartProduct = (ShoppingCartProduct) obj;
        shoppingCartProduct.getClass();
        int size$okio = shoppingCartProduct.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(3, shoppingCartProduct.image_url) + protoAdapter.encodedSizeWithTag(2, shoppingCartProduct.url) + protoAdapter.encodedSizeWithTag(1, shoppingCartProduct.name) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ShoppingCartProduct shoppingCartProduct = (ShoppingCartProduct) obj;
        shoppingCartProduct.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = shoppingCartProduct.name;
        String str2 = shoppingCartProduct.url;
        String str3 = shoppingCartProduct.image_url;
        byteString.getClass();
        return new ShoppingCartProduct(str, str2, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ShoppingCartProduct shoppingCartProduct = (ShoppingCartProduct) obj;
        shoppingCartProduct.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, shoppingCartProduct.name);
        protoAdapter.encodeWithTag(protoWriter, 2, shoppingCartProduct.url);
        protoAdapter.encodeWithTag(protoWriter, 3, shoppingCartProduct.image_url);
        protoWriter.writeBytes(shoppingCartProduct.unknownFields());
    }
}
