package com.squareup.cash.moneybot.genie.protos;

import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import java.util.ArrayList;
import java.util.List;
import okio.ByteString;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import xyz.block.protos.genie.Binding;
import xyz.block.protos.genie.Expression;

/* loaded from: classes6.dex */
public final class ComposePlatform$DropdownMenu$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
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
            } else if (nextTag == 2) {
                m.add(ProtoAdapter.STRING.decode(protoReader));
            } else if (nextTag != 3) {
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
            return new ComposePlatform.DropdownMenu(expression, m, binding, endMessageAndGetUnknownFields);
        }
        TransactorKt.missingRequiredFields(obj2, "binding");
        throw null;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ComposePlatform.DropdownMenu dropdownMenu = (ComposePlatform.DropdownMenu) obj;
        reverseProtoWriter.getClass();
        dropdownMenu.getClass();
        reverseProtoWriter.writeBytes(dropdownMenu.unknownFields());
        Binding.ADAPTER.encodeWithTag(reverseProtoWriter, 3, dropdownMenu.binding);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(reverseProtoWriter, 2, dropdownMenu.options);
        Expression.ADAPTER.encodeWithTag(reverseProtoWriter, 1, dropdownMenu.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ComposePlatform.DropdownMenu dropdownMenu = (ComposePlatform.DropdownMenu) obj;
        dropdownMenu.getClass();
        return Binding.ADAPTER.encodedSizeWithTag(3, dropdownMenu.binding) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, dropdownMenu.options) + Expression.ADAPTER.encodedSizeWithTag(1, dropdownMenu.label) + dropdownMenu.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ComposePlatform.DropdownMenu dropdownMenu = (ComposePlatform.DropdownMenu) obj;
        dropdownMenu.getClass();
        Expression expression = (Expression) Expression.ADAPTER.redact(dropdownMenu.label);
        Binding binding = (Binding) Binding.ADAPTER.redact(dropdownMenu.binding);
        ByteString byteString = ByteString.EMPTY;
        List list = dropdownMenu.options;
        expression.getClass();
        list.getClass();
        binding.getClass();
        byteString.getClass();
        return new ComposePlatform.DropdownMenu(expression, list, binding, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ComposePlatform.DropdownMenu dropdownMenu = (ComposePlatform.DropdownMenu) obj;
        dropdownMenu.getClass();
        Expression.ADAPTER.encodeWithTag(protoWriter, 1, dropdownMenu.label);
        ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, dropdownMenu.options);
        Binding.ADAPTER.encodeWithTag(protoWriter, 3, dropdownMenu.binding);
        protoWriter.writeBytes(dropdownMenu.unknownFields());
    }
}
