package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class MoneybotScaffold$Evidence$MerchantCard$Summary$Flow$Companion$ADAPTER$1 extends ProtoAdapter {
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
        if (expression == null) {
            TransactorKt.missingRequiredFields(obj, AnnotatedPrivateKey.LABEL);
            throw null;
        }
        Expression expression2 = (Expression) obj2;
        if (expression2 != null) {
            return new MoneybotScaffold.Evidence.MerchantCard.Summary.Flow(expression, expression2, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj2, "value");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotScaffold.Evidence.MerchantCard.Summary.Flow flow = (MoneybotScaffold.Evidence.MerchantCard.Summary.Flow) obj;
        reverseProtoWriter.getClass();
        flow.getClass();
        reverseProtoWriter.writeBytes(flow.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, flow.value_);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, flow.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotScaffold.Evidence.MerchantCard.Summary.Flow flow = (MoneybotScaffold.Evidence.MerchantCard.Summary.Flow) obj;
        flow.getClass();
        int size$okio = flow.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(2, flow.value_) + protoAdapter.encodedSizeWithTag(1, flow.label) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotScaffold.Evidence.MerchantCard.Summary.Flow flow = (MoneybotScaffold.Evidence.MerchantCard.Summary.Flow) obj;
        flow.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        Expression expression = (Expression) protoAdapter.redact(flow.label);
        Expression expression2 = (Expression) protoAdapter.redact(flow.value_);
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        expression2.getClass();
        byteString.getClass();
        return new MoneybotScaffold.Evidence.MerchantCard.Summary.Flow(expression, expression2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotScaffold.Evidence.MerchantCard.Summary.Flow flow = (MoneybotScaffold.Evidence.MerchantCard.Summary.Flow) obj;
        flow.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, flow.label);
        protoAdapter.encodeWithTag(protoWriter, 2, flow.value_);
        protoWriter.writeBytes(flow.unknownFields());
    }
}
