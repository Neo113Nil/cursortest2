package com.squareup.cash.overdraftly.api.v1_0.app;

import com.squareup.cash.overdraftly.api.v1_0.app.ToggleOverdraftRequest;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class ToggleOverdraftRequest$Disable$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new ToggleOverdraftRequest.Disable(protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            protoReader.readUnknownField(nextTag);
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        ToggleOverdraftRequest.Disable disable = (ToggleOverdraftRequest.Disable) obj;
        reverseProtoWriter.getClass();
        disable.getClass();
        reverseProtoWriter.writeBytes(disable.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        ToggleOverdraftRequest.Disable disable = (ToggleOverdraftRequest.Disable) obj;
        disable.getClass();
        return disable.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        ((ToggleOverdraftRequest.Disable) obj).getClass();
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new ToggleOverdraftRequest.Disable(byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        ToggleOverdraftRequest.Disable disable = (ToggleOverdraftRequest.Disable) obj;
        disable.getClass();
        protoWriter.writeBytes(disable.unknownFields());
    }
}
