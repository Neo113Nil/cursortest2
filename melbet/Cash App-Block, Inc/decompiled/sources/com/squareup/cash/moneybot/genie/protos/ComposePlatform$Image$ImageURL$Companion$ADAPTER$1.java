package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class ComposePlatform$Image$ImageURL$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = Expression.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Expression expression = (Expression) obj;
        if (expression != null) {
            return new ComposePlatform.Image.ImageURL(expression, (Expression) obj2, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj, "light");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Image.ImageURL imageURL = (ComposePlatform.Image.ImageURL) obj;
        reverseProtoWriter.getClass();
        imageURL.getClass();
        reverseProtoWriter.writeBytes(imageURL.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, imageURL.dark);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, imageURL.light);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Image.ImageURL imageURL = (ComposePlatform.Image.ImageURL) obj;
        imageURL.getClass();
        int size$okio = imageURL.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, imageURL.dark) + protoAdapter.encodedSizeWithTag(1, imageURL.light) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Image.ImageURL imageURL = (ComposePlatform.Image.ImageURL) obj;
        imageURL.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        Expression expression = (Expression) protoAdapter.redact(imageURL.light);
        Expression expression2 = imageURL.dark;
        Expression expression3 = expression2 != null ? (Expression) protoAdapter.redact(expression2) : null;
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        byteString.getClass();
        return new ComposePlatform.Image.ImageURL(expression, expression3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Image.ImageURL imageURL = (ComposePlatform.Image.ImageURL) obj;
        imageURL.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, imageURL.light);
        protoAdapter.encodeWithTag(protoWriter, 2, imageURL.dark);
        protoWriter.writeBytes(imageURL.unknownFields());
    }
}
