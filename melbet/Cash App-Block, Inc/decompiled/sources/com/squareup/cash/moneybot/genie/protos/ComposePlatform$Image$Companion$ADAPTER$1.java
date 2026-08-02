package com.squareup.cash.moneybot.genie.protos;

import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class ComposePlatform$Image$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ComposePlatform.Image((Expression) obj, (ComposePlatform.Image.ImageURL) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ComposePlatform.Image.ImageURL.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Image image = (ComposePlatform.Image) obj;
        reverseProtoWriter.getClass();
        image.getClass();
        reverseProtoWriter.writeBytes(image.unknownFields());
        ComposePlatform.Image.ImageURL.ADAPTER.encodeWithTag(reverseProtoWriter, 2, image.url);
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 1, image.resource_name);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Image image = (ComposePlatform.Image) obj;
        image.getClass();
        return ComposePlatform.Image.ImageURL.ADAPTER.encodedSizeWithTag(2, image.url) + Expression.ADAPTER.encodedSizeWithTag(1, image.resource_name) + image.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Image image = (ComposePlatform.Image) obj;
        image.getClass();
        Expression expression = image.resource_name;
        Expression expression2 = expression != null ? (Expression) Expression.ADAPTER.redact(expression) : null;
        ComposePlatform.Image.ImageURL imageURL = image.url;
        ComposePlatform.Image.ImageURL imageURL2 = imageURL != null ? (ComposePlatform.Image.ImageURL) ComposePlatform.Image.ImageURL.ADAPTER.redact(imageURL) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ComposePlatform.Image(expression2, imageURL2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Image image = (ComposePlatform.Image) obj;
        image.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, 1, image.resource_name);
        ComposePlatform.Image.ImageURL.ADAPTER.encodeWithTag(protoWriter, 2, image.url);
        protoWriter.writeBytes(image.unknownFields());
    }
}
