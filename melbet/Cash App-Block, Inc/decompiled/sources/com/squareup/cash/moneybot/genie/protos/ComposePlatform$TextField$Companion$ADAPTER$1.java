package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import xyz.block.protos.genie.Binding;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class ComposePlatform$TextField$Companion$ADAPTER$1 extends ProtoAdapter {
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
                break;
            }
            if (nextTag == 1) {
                obj = Expression.ADAPTER.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = Binding.ADAPTER.decode(protoReader);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = Expression.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Expression expression = (Expression) obj;
        if (expression == null) {
            TransactorKt.missingRequiredFields(obj, AnnotatedPrivateKey.LABEL);
            throw null;
        }
        Binding binding = (Binding) obj2;
        if (binding != null) {
            return new ComposePlatform.TextField(expression, binding, (Expression) obj3, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj2, "binding");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.TextField textField = (ComposePlatform.TextField) obj;
        reverseProtoWriter.getClass();
        textField.getClass();
        reverseProtoWriter.writeBytes(textField.unknownFields());
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, textField.placeholder);
        Binding.ADAPTER.encodeWithTag(reverseProtoWriter, 2, textField.binding);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, textField.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.TextField textField = (ComposePlatform.TextField) obj;
        textField.getClass();
        int size$okio = textField.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, textField.placeholder) + Binding.ADAPTER.encodedSizeWithTag(2, textField.binding) + protoAdapter.encodedSizeWithTag(1, textField.label) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.TextField textField = (ComposePlatform.TextField) obj;
        textField.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        Expression expression = (Expression) protoAdapter.redact(textField.label);
        Binding binding = (Binding) Binding.ADAPTER.redact(textField.binding);
        Expression expression2 = textField.placeholder;
        Expression expression3 = expression2 != null ? (Expression) protoAdapter.redact(expression2) : null;
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        binding.getClass();
        byteString.getClass();
        return new ComposePlatform.TextField(expression, binding, expression3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.TextField textField = (ComposePlatform.TextField) obj;
        textField.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, textField.label);
        Binding.ADAPTER.encodeWithTag(protoWriter, 2, textField.binding);
        protoAdapter.encodeWithTag(protoWriter, 3, textField.placeholder);
        protoWriter.writeBytes(textField.unknownFields());
    }
}
