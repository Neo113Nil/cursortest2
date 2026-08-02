package com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.ButtonCtaGroup;

/* loaded from: classes7.dex */
public final class ActionableButtonCtaGroup$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActionableButtonCtaGroup((ActionableButtonDefault) obj, (ActionableButtonDefault) obj2, (ActionableButtonDefault) obj3, (ButtonCtaGroup.Direction) obj4, (LocalizedString) obj5, (Boolean) obj6, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = TransactorKt.decodeMessageOrMerge(ActionableButtonDefault.ADAPTER, protoReader, obj);
                    break;
                case 2:
                    obj2 = TransactorKt.decodeMessageOrMerge(ActionableButtonDefault.ADAPTER, protoReader, obj2);
                    break;
                case 3:
                    obj3 = TransactorKt.decodeMessageOrMerge(ActionableButtonDefault.ADAPTER, protoReader, obj3);
                    break;
                case 4:
                    try {
                        obj4 = ButtonCtaGroup.Direction.ADAPTER.decode(protoReader);
                        break;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 5:
                    obj5 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj5);
                    break;
                case 6:
                    obj6 = ProtoAdapter.BOOL.decode(protoReader);
                    break;
                default:
                    protoReader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActionableButtonCtaGroup actionableButtonCtaGroup = (ActionableButtonCtaGroup) obj;
        reverseProtoWriter.getClass();
        actionableButtonCtaGroup.getClass();
        reverseProtoWriter.writeBytes(actionableButtonCtaGroup.unknownFields());
        ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, actionableButtonCtaGroup.show_hairline);
        LocalizedString.ADAPTER.encodeWithTag(reverseProtoWriter, 5, actionableButtonCtaGroup.disclaimer_text);
        ButtonCtaGroup.Direction.ADAPTER.encodeWithTag(reverseProtoWriter, 4, actionableButtonCtaGroup.direction);
        ProtoAdapter protoAdapter = ActionableButtonDefault.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, actionableButtonCtaGroup.tertiary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, actionableButtonCtaGroup.secondary_button);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, actionableButtonCtaGroup.primary_button);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActionableButtonCtaGroup actionableButtonCtaGroup = (ActionableButtonCtaGroup) obj;
        actionableButtonCtaGroup.getClass();
        int size$okio = actionableButtonCtaGroup.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ActionableButtonDefault.ADAPTER;
        return ProtoAdapter.BOOL.encodedSizeWithTag(6, actionableButtonCtaGroup.show_hairline) + LocalizedString.ADAPTER.encodedSizeWithTag(5, actionableButtonCtaGroup.disclaimer_text) + ButtonCtaGroup.Direction.ADAPTER.encodedSizeWithTag(4, actionableButtonCtaGroup.direction) + protoAdapter.encodedSizeWithTag(3, actionableButtonCtaGroup.tertiary_button) + protoAdapter.encodedSizeWithTag(2, actionableButtonCtaGroup.secondary_button) + protoAdapter.encodedSizeWithTag(1, actionableButtonCtaGroup.primary_button) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActionableButtonCtaGroup actionableButtonCtaGroup = (ActionableButtonCtaGroup) obj;
        actionableButtonCtaGroup.getClass();
        ActionableButtonDefault actionableButtonDefault = actionableButtonCtaGroup.primary_button;
        ActionableButtonDefault actionableButtonDefault2 = actionableButtonDefault != null ? (ActionableButtonDefault) ActionableButtonDefault.ADAPTER.redact(actionableButtonDefault) : null;
        ActionableButtonDefault actionableButtonDefault3 = actionableButtonCtaGroup.secondary_button;
        ActionableButtonDefault actionableButtonDefault4 = actionableButtonDefault3 != null ? (ActionableButtonDefault) ActionableButtonDefault.ADAPTER.redact(actionableButtonDefault3) : null;
        ActionableButtonDefault actionableButtonDefault5 = actionableButtonCtaGroup.tertiary_button;
        ActionableButtonDefault actionableButtonDefault6 = actionableButtonDefault5 != null ? (ActionableButtonDefault) ActionableButtonDefault.ADAPTER.redact(actionableButtonDefault5) : null;
        LocalizedString localizedString = actionableButtonCtaGroup.disclaimer_text;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        ByteString byteString = ByteString.EMPTY;
        ButtonCtaGroup.Direction direction = actionableButtonCtaGroup.direction;
        Boolean bool = actionableButtonCtaGroup.show_hairline;
        byteString.getClass();
        return new ActionableButtonCtaGroup(actionableButtonDefault2, actionableButtonDefault4, actionableButtonDefault6, direction, localizedString2, bool, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActionableButtonCtaGroup actionableButtonCtaGroup = (ActionableButtonCtaGroup) obj;
        actionableButtonCtaGroup.getClass();
        ProtoAdapter protoAdapter = ActionableButtonDefault.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 1, actionableButtonCtaGroup.primary_button);
        protoAdapter.encodeWithTag(protoWriter, 2, actionableButtonCtaGroup.secondary_button);
        protoAdapter.encodeWithTag(protoWriter, 3, actionableButtonCtaGroup.tertiary_button);
        ButtonCtaGroup.Direction.ADAPTER.encodeWithTag(protoWriter, 4, actionableButtonCtaGroup.direction);
        LocalizedString.ADAPTER.encodeWithTag(protoWriter, 5, actionableButtonCtaGroup.disclaimer_text);
        ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, actionableButtonCtaGroup.show_hairline);
        protoWriter.writeBytes(actionableButtonCtaGroup.unknownFields());
    }
}
