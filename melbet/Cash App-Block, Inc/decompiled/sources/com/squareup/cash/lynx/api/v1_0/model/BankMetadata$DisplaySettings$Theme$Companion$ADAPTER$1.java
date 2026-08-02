package com.squareup.cash.lynx.api.v1_0.model;

import com.squareup.cash.lynx.api.v1_0.model.BankMetadata;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class BankMetadata$DisplaySettings$Theme$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BankMetadata.DisplaySettings.Theme((String) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BankMetadata.DisplaySettings.Theme theme = (BankMetadata.DisplaySettings.Theme) obj;
        reverseProtoWriter.getClass();
        theme.getClass();
        reverseProtoWriter.writeBytes(theme.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, theme.accent_colour);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, theme.base_colour);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BankMetadata.DisplaySettings.Theme theme = (BankMetadata.DisplaySettings.Theme) obj;
        theme.getClass();
        int size$okio = theme.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(2, theme.accent_colour) + protoAdapter.encodedSizeWithTag(1, theme.base_colour) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BankMetadata.DisplaySettings.Theme theme = (BankMetadata.DisplaySettings.Theme) obj;
        theme.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = theme.base_colour;
        String str2 = theme.accent_colour;
        byteString.getClass();
        return new BankMetadata.DisplaySettings.Theme(str, str2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BankMetadata.DisplaySettings.Theme theme = (BankMetadata.DisplaySettings.Theme) obj;
        theme.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, theme.base_colour);
        protoAdapter.encodeWithTag(protoWriter, 2, theme.accent_colour);
        protoWriter.writeBytes(theme.unknownFields());
    }
}
