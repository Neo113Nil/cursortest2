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
public final class ComposePlatform$DatePicker$Companion$ADAPTER$1 extends ProtoAdapter {
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
            return new ComposePlatform.DatePicker(expression, binding, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj2, "binding");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.DatePicker datePicker = (ComposePlatform.DatePicker) obj;
        reverseProtoWriter.getClass();
        datePicker.getClass();
        reverseProtoWriter.writeBytes(datePicker.unknownFields());
        Binding.ADAPTER.encodeWithTag(reverseProtoWriter, 2, datePicker.binding);
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 1, datePicker.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.DatePicker datePicker = (ComposePlatform.DatePicker) obj;
        datePicker.getClass();
        return Binding.ADAPTER.encodedSizeWithTag(2, datePicker.binding) + Expression.ADAPTER.encodedSizeWithTag(1, datePicker.label) + datePicker.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.DatePicker datePicker = (ComposePlatform.DatePicker) obj;
        datePicker.getClass();
        Expression expression = (Expression) Expression.ADAPTER.redact(datePicker.label);
        Binding binding = (Binding) Binding.ADAPTER.redact(datePicker.binding);
        ByteString byteString = ByteString.EMPTY;
        expression.getClass();
        binding.getClass();
        byteString.getClass();
        return new ComposePlatform.DatePicker(expression, binding, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.DatePicker datePicker = (ComposePlatform.DatePicker) obj;
        datePicker.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, 1, datePicker.label);
        Binding.ADAPTER.encodeWithTag(protoWriter, 2, datePicker.binding);
        protoWriter.writeBytes(datePicker.unknownFields());
    }
}
