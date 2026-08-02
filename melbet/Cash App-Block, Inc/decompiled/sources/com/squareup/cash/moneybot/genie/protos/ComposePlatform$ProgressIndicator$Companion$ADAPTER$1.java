package com.squareup.cash.moneybot.genie.protos;

import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class ComposePlatform$ProgressIndicator$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new ComposePlatform.ProgressIndicator((Expression) obj, (Expression) obj2, (Expression) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = Expression.ADAPTER.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.ProgressIndicator progressIndicator = (ComposePlatform.ProgressIndicator) obj;
        reverseProtoWriter.getClass();
        progressIndicator.getClass();
        reverseProtoWriter.writeBytes(progressIndicator.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, progressIndicator.style);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, progressIndicator.label);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, progressIndicator.value_);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.ProgressIndicator progressIndicator = (ComposePlatform.ProgressIndicator) obj;
        progressIndicator.getClass();
        int size$okio = progressIndicator.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, progressIndicator.style) + protoAdapter.encodedSizeWithTag(2, progressIndicator.label) + protoAdapter.encodedSizeWithTag(1, progressIndicator.value_) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.ProgressIndicator progressIndicator = (ComposePlatform.ProgressIndicator) obj;
        progressIndicator.getClass();
        Expression expression = progressIndicator.value_;
        Expression expression2 = expression != null ? (Expression) Expression.ADAPTER.redact(expression) : null;
        Expression expression3 = progressIndicator.label;
        Expression expression4 = expression3 != null ? (Expression) Expression.ADAPTER.redact(expression3) : null;
        Expression expression5 = progressIndicator.style;
        Expression expression6 = expression5 != null ? (Expression) Expression.ADAPTER.redact(expression5) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ComposePlatform.ProgressIndicator(expression2, expression4, expression6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.ProgressIndicator progressIndicator = (ComposePlatform.ProgressIndicator) obj;
        progressIndicator.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, progressIndicator.value_);
        protoAdapter.encodeWithTag(protoWriter, 2, progressIndicator.label);
        protoAdapter.encodeWithTag(protoWriter, 3, progressIndicator.style);
        protoWriter.writeBytes(progressIndicator.unknownFields());
    }
}
