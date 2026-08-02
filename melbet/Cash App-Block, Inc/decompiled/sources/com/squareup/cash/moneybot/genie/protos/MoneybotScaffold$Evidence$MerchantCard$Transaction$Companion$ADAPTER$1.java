package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import com.squareup.cash.moneybot.genie.protos.MoneybotScaffold;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class MoneybotScaffold$Evidence$MerchantCard$Transaction$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                break;
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag != 4) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj4 = Expression.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Expression expression = (Expression) obj;
        Expression expression2 = (Expression) obj2;
        if (expression2 == null) {
            TransactorKt.missingRequiredFields(obj2, "title");
            throw null;
        }
        Expression expression3 = (Expression) obj3;
        Expression expression4 = (Expression) obj4;
        if (expression4 != null) {
            return new MoneybotScaffold.Evidence.MerchantCard.Transaction(expression, expression2, expression3, expression4, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj4, "amount");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MoneybotScaffold.Evidence.MerchantCard.Transaction transaction = (MoneybotScaffold.Evidence.MerchantCard.Transaction) obj;
        reverseProtoWriter.getClass();
        transaction.getClass();
        reverseProtoWriter.writeBytes(transaction.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, transaction.amount);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, transaction.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, transaction.title);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, transaction.avatar_url);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MoneybotScaffold.Evidence.MerchantCard.Transaction transaction = (MoneybotScaffold.Evidence.MerchantCard.Transaction) obj;
        transaction.getClass();
        int size$okio = transaction.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(4, transaction.amount) + protoAdapter.encodedSizeWithTag(3, transaction.subtitle) + protoAdapter.encodedSizeWithTag(2, transaction.title) + protoAdapter.encodedSizeWithTag(1, transaction.avatar_url) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MoneybotScaffold.Evidence.MerchantCard.Transaction transaction = (MoneybotScaffold.Evidence.MerchantCard.Transaction) obj;
        transaction.getClass();
        Expression expression = transaction.avatar_url;
        Expression expression2 = expression != null ? (Expression) Expression.ADAPTER.redact(expression) : null;
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        Expression expression3 = (Expression) protoAdapter.redact(transaction.title);
        Expression expression4 = transaction.subtitle;
        Expression expression5 = expression4 != null ? (Expression) protoAdapter.redact(expression4) : null;
        Expression expression6 = (Expression) protoAdapter.redact(transaction.amount);
        ByteString byteString = ByteString.EMPTY;
        expression3.getClass();
        expression6.getClass();
        byteString.getClass();
        return new MoneybotScaffold.Evidence.MerchantCard.Transaction(expression2, expression3, expression5, expression6, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MoneybotScaffold.Evidence.MerchantCard.Transaction transaction = (MoneybotScaffold.Evidence.MerchantCard.Transaction) obj;
        transaction.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, transaction.avatar_url);
        protoAdapter.encodeWithTag(protoWriter, 2, transaction.title);
        protoAdapter.encodeWithTag(protoWriter, 3, transaction.subtitle);
        protoAdapter.encodeWithTag(protoWriter, 4, transaction.amount);
        protoWriter.writeBytes(transaction.unknownFields());
    }
}
