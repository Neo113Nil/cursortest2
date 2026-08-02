package com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements;

import androidx.room.TransactorKt;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonDefault;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.ButtonDefault;

/* loaded from: classes5.dex */
public final class ActionableButtonDefault$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        ActionableButtonDefault$Action$ClientRouteAction actionableButtonDefault$Action$ClientRouteAction = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ActionableButtonDefault((ButtonDefault) obj, actionableButtonDefault$Action$ClientRouteAction, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ButtonDefault.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                actionableButtonDefault$Action$ClientRouteAction = new ActionableButtonDefault$Action$ClientRouteAction((ActionableButtonDefault.ClientRouteAction) ActionableButtonDefault.ClientRouteAction.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ActionableButtonDefault actionableButtonDefault = (ActionableButtonDefault) obj;
        reverseProtoWriter.getClass();
        actionableButtonDefault.getClass();
        reverseProtoWriter.writeBytes(actionableButtonDefault.unknownFields());
        ActionableButtonDefault$Action$ClientRouteAction actionableButtonDefault$Action$ClientRouteAction = actionableButtonDefault.action;
        if (actionableButtonDefault$Action$ClientRouteAction != null) {
            ActionableButtonDefault.ClientRouteAction.ADAPTER.encodeWithTag(reverseProtoWriter, 2, actionableButtonDefault$Action$ClientRouteAction.value);
        } else if (actionableButtonDefault$Action$ClientRouteAction != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ButtonDefault.ADAPTER.encodeWithTag(reverseProtoWriter, 1, actionableButtonDefault.button);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ActionableButtonDefault actionableButtonDefault = (ActionableButtonDefault) obj;
        actionableButtonDefault.getClass();
        int encodedSizeWithTag = ButtonDefault.ADAPTER.encodedSizeWithTag(1, actionableButtonDefault.button) + actionableButtonDefault.unknownFields().getSize$okio();
        ActionableButtonDefault$Action$ClientRouteAction actionableButtonDefault$Action$ClientRouteAction = actionableButtonDefault.action;
        if (actionableButtonDefault$Action$ClientRouteAction != null) {
            return ActionableButtonDefault.ClientRouteAction.ADAPTER.encodedSizeWithTag(2, actionableButtonDefault$Action$ClientRouteAction.value) + encodedSizeWithTag;
        }
        if (actionableButtonDefault$Action$ClientRouteAction == null) {
            return encodedSizeWithTag;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return 0;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ActionableButtonDefault actionableButtonDefault = (ActionableButtonDefault) obj;
        actionableButtonDefault.getClass();
        ButtonDefault buttonDefault = actionableButtonDefault.button;
        ButtonDefault buttonDefault2 = buttonDefault != null ? (ButtonDefault) ButtonDefault.ADAPTER.redact(buttonDefault) : null;
        ByteString byteString = ByteString.EMPTY;
        ActionableButtonDefault$Action$ClientRouteAction actionableButtonDefault$Action$ClientRouteAction = actionableButtonDefault.action;
        byteString.getClass();
        return new ActionableButtonDefault(buttonDefault2, actionableButtonDefault$Action$ClientRouteAction, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ActionableButtonDefault actionableButtonDefault = (ActionableButtonDefault) obj;
        actionableButtonDefault.getClass();
        ButtonDefault.ADAPTER.encodeWithTag(protoWriter, 1, actionableButtonDefault.button);
        ActionableButtonDefault$Action$ClientRouteAction actionableButtonDefault$Action$ClientRouteAction = actionableButtonDefault.action;
        if (actionableButtonDefault$Action$ClientRouteAction != null) {
            ActionableButtonDefault.ClientRouteAction.ADAPTER.encodeWithTag(protoWriter, 2, actionableButtonDefault$Action$ClientRouteAction.value);
        } else if (actionableButtonDefault$Action$ClientRouteAction != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(actionableButtonDefault.unknownFields());
    }
}
