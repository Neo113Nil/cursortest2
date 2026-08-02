package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import xyz.block.protos.genie.Binding;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class ComposePlatform$Slider$Companion$ADAPTER$1 extends ProtoAdapter {
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
                obj4 = Binding.ADAPTER.decode(protoReader);
            }
        }
        ByteString endMessageAndGetUnknownFields = protoReader.endMessageAndGetUnknownFields(beginMessage);
        Expression expression = (Expression) obj;
        Expression expression2 = (Expression) obj2;
        Expression expression3 = (Expression) obj3;
        Binding binding = (Binding) obj4;
        if (binding != null) {
            return new ComposePlatform.Slider(expression, expression2, expression3, binding, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj4, "binding");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.Slider slider = (ComposePlatform.Slider) obj;
        reverseProtoWriter.getClass();
        slider.getClass();
        reverseProtoWriter.writeBytes(slider.unknownFields());
        Binding.ADAPTER.encodeWithTag(reverseProtoWriter, 4, slider.binding);
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, slider.steps);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, slider.maximum);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, slider.minimum);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.Slider slider = (ComposePlatform.Slider) obj;
        slider.getClass();
        int size$okio = slider.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        return Binding.ADAPTER.encodedSizeWithTag(4, slider.binding) + protoAdapter.encodedSizeWithTag(3, slider.steps) + protoAdapter.encodedSizeWithTag(2, slider.maximum) + protoAdapter.encodedSizeWithTag(1, slider.minimum) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.Slider slider = (ComposePlatform.Slider) obj;
        slider.getClass();
        Expression expression = slider.minimum;
        Expression expression2 = expression != null ? (Expression) Expression.ADAPTER.redact(expression) : null;
        Expression expression3 = slider.maximum;
        Expression expression4 = expression3 != null ? (Expression) Expression.ADAPTER.redact(expression3) : null;
        Expression expression5 = slider.steps;
        Expression expression6 = expression5 != null ? (Expression) Expression.ADAPTER.redact(expression5) : null;
        Binding binding = (Binding) Binding.ADAPTER.redact(slider.binding);
        ByteString byteString = ByteString.EMPTY;
        binding.getClass();
        byteString.getClass();
        return new ComposePlatform.Slider(expression2, expression4, expression6, binding, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.Slider slider = (ComposePlatform.Slider) obj;
        slider.getClass();
        ProtoAdapter protoAdapter = Expression.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, slider.minimum);
        protoAdapter.encodeWithTag(protoWriter, 2, slider.maximum);
        protoAdapter.encodeWithTag(protoWriter, 3, slider.steps);
        Binding.ADAPTER.encodeWithTag(protoWriter, 4, slider.binding);
        protoWriter.writeBytes(slider.unknownFields());
    }
}
