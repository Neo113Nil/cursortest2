package com.squareup.cash.bankingbenefits.api.v1_0.app;

import androidx.room.TransactorKt;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ButtonRow;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class BenefitsHub$CallToActions$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsHub.CallToActions((ButtonRow) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ButtonRow.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsHub.CallToActions callToActions = (BenefitsHub.CallToActions) obj;
        reverseProtoWriter.getClass();
        callToActions.getClass();
        reverseProtoWriter.writeBytes(callToActions.unknownFields());
        ButtonRow.ADAPTER.encodeWithTag(reverseProtoWriter, 1, callToActions.details);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsHub.CallToActions callToActions = (BenefitsHub.CallToActions) obj;
        callToActions.getClass();
        return ButtonRow.ADAPTER.encodedSizeWithTag(1, callToActions.details) + callToActions.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsHub.CallToActions callToActions = (BenefitsHub.CallToActions) obj;
        callToActions.getClass();
        ButtonRow buttonRow = callToActions.details;
        ButtonRow buttonRow2 = buttonRow != null ? (ButtonRow) ButtonRow.ADAPTER.redact(buttonRow) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BenefitsHub.CallToActions(buttonRow2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsHub.CallToActions callToActions = (BenefitsHub.CallToActions) obj;
        callToActions.getClass();
        ButtonRow.ADAPTER.encodeWithTag(protoWriter, 1, callToActions.details);
        protoWriter.writeBytes(callToActions.unknownFields());
    }
}
