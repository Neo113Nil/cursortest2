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
public final class ComposePlatform$Switch$Companion$ADAPTER$1 extends ProtoAdapter {
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
                obj2 = Binding.ADAPTER.decode(protoReader);
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
            return new ComposePlatform.Switch(expression, binding, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj2, "binding");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Switch r4 = (ComposePlatform.Switch) obj;
        reverseProtoWriter.getClass();
        r4.getClass();
        reverseProtoWriter.writeBytes(r4.unknownFields());
        Binding.ADAPTER.encodeWithTag(reverseProtoWriter, 2, r4.binding);
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 1, r4.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Switch r4 = (ComposePlatform.Switch) obj;
        r4.getClass();
        return Binding.ADAPTER.encodedSizeWithTag(2, r4.binding) + Expression.ADAPTER.encodedSizeWithTag(1, r4.label) + r4.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Switch r3 = (ComposePlatform.Switch) obj;
        r3.getClass();
        Expression expression = (Expression) Expression.ADAPTER.redact(r3.label);
        Binding binding = (Binding) Binding.ADAPTER.redact(r3.binding);
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        binding.getClass();
        byteString.getClass();
        return new ComposePlatform.Switch(expression, binding, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Switch r4 = (ComposePlatform.Switch) obj;
        r4.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, 1, r4.label);
        Binding.ADAPTER.encodeWithTag(protoWriter, 2, r4.binding);
        protoWriter.writeBytes(r4.unknownFields());
    }
}
