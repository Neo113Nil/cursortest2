package com.squareup.cash.lynx.api.v1_0.model;

import androidx.room.TransactorKt;
import com.squareup.protos.franklin.data.BrowserInteraction;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class BrowserInteractionDetails$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BrowserInteractionDetails((BrowserInteraction) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(BrowserInteraction.ADAPTER, protoReader, obj);
            } else {
                protoReader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BrowserInteractionDetails browserInteractionDetails = (BrowserInteractionDetails) obj;
        reverseProtoWriter.getClass();
        browserInteractionDetails.getClass();
        reverseProtoWriter.writeBytes(browserInteractionDetails.unknownFields());
        BrowserInteraction.ADAPTER.encodeWithTag(reverseProtoWriter, 1, browserInteractionDetails.browser_interaction);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BrowserInteractionDetails browserInteractionDetails = (BrowserInteractionDetails) obj;
        browserInteractionDetails.getClass();
        return BrowserInteraction.ADAPTER.encodedSizeWithTag(1, browserInteractionDetails.browser_interaction) + browserInteractionDetails.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BrowserInteractionDetails browserInteractionDetails = (BrowserInteractionDetails) obj;
        browserInteractionDetails.getClass();
        BrowserInteraction browserInteraction = browserInteractionDetails.browser_interaction;
        BrowserInteraction browserInteraction2 = browserInteraction != null ? (BrowserInteraction) BrowserInteraction.ADAPTER.redact(browserInteraction) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new BrowserInteractionDetails(browserInteraction2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BrowserInteractionDetails browserInteractionDetails = (BrowserInteractionDetails) obj;
        browserInteractionDetails.getClass();
        BrowserInteraction.ADAPTER.encodeWithTag(protoWriter, 1, browserInteractionDetails.browser_interaction);
        protoWriter.writeBytes(browserInteractionDetails.unknownFields());
    }
}
