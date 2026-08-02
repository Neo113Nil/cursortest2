package com.squareup.cash.overdraftly.api.v1_0.app;

import com.squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class ToggleOverdraftRequest$Enable$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ToggleOverdraftRequest.Enable(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ToggleOverdraftRequest.Enable enable = (ToggleOverdraftRequest.Enable) obj;
        reverseProtoWriter.getClass();
        enable.getClass();
        reverseProtoWriter.writeBytes(enable.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ToggleOverdraftRequest.Enable enable = (ToggleOverdraftRequest.Enable) obj;
        enable.getClass();
        return enable.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ToggleOverdraftRequest.Enable) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ToggleOverdraftRequest.Enable(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ToggleOverdraftRequest.Enable enable = (ToggleOverdraftRequest.Enable) obj;
        enable.getClass();
        protoWriter.writeBytes(enable.unknownFields());
    }
}
