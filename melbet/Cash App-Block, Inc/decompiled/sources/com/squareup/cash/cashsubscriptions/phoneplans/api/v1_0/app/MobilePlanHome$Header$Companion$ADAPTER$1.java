package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import androidx.compose.ui.text.input.InputState_androidKt;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class MobilePlanHome$Header$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        InputState_androidKt inputState_androidKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MobilePlanHome.Header(inputState_androidKt, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                inputState_androidKt = new MobilePlanHome$Header$Style$Active((MobilePlanHome.ActiveHeader) MobilePlanHome.ActiveHeader.ADAPTER.decode(protoReader));
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                inputState_androidKt = new MobilePlanHome$Header$Style$Inactive((MobilePlanHome.InactiveHeader) MobilePlanHome.InactiveHeader.ADAPTER.decode(protoReader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MobilePlanHome.Header header = (MobilePlanHome.Header) obj;
        reverseProtoWriter.getClass();
        header.getClass();
        reverseProtoWriter.writeBytes(header.unknownFields());
        InputState_androidKt inputState_androidKt = header.style;
        if (inputState_androidKt instanceof MobilePlanHome$Header$Style$Active) {
            MobilePlanHome.ActiveHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 1, ((MobilePlanHome$Header$Style$Active) inputState_androidKt).value);
        } else if (inputState_androidKt instanceof MobilePlanHome$Header$Style$Inactive) {
            MobilePlanHome.InactiveHeader.ADAPTER.encodeWithTag(reverseProtoWriter, 2, ((MobilePlanHome$Header$Style$Inactive) inputState_androidKt).value);
        } else {
            if (inputState_androidKt == null) {
                return;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        MobilePlanHome.Header header = (MobilePlanHome.Header) obj;
        header.getClass();
        int size$okio = header.unknownFields().getSize$okio();
        InputState_androidKt inputState_androidKt = header.style;
        if (inputState_androidKt instanceof MobilePlanHome$Header$Style$Active) {
            encodedSizeWithTag = MobilePlanHome.ActiveHeader.ADAPTER.encodedSizeWithTag(1, ((MobilePlanHome$Header$Style$Active) inputState_androidKt).value);
        } else {
            if (!(inputState_androidKt instanceof MobilePlanHome$Header$Style$Inactive)) {
                if (inputState_androidKt == null) {
                    return size$okio;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }
            encodedSizeWithTag = MobilePlanHome.InactiveHeader.ADAPTER.encodedSizeWithTag(2, ((MobilePlanHome$Header$Style$Inactive) inputState_androidKt).value);
        }
        return encodedSizeWithTag + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MobilePlanHome.Header header = (MobilePlanHome.Header) obj;
        header.getClass();
        ByteString byteString = ByteString.EMPTY;
        InputState_androidKt inputState_androidKt = header.style;
        byteString.getClass();
        return new MobilePlanHome.Header(inputState_androidKt, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MobilePlanHome.Header header = (MobilePlanHome.Header) obj;
        header.getClass();
        InputState_androidKt inputState_androidKt = header.style;
        if (inputState_androidKt instanceof MobilePlanHome$Header$Style$Active) {
            MobilePlanHome.ActiveHeader.ADAPTER.encodeWithTag(protoWriter, 1, ((MobilePlanHome$Header$Style$Active) inputState_androidKt).value);
        } else if (inputState_androidKt instanceof MobilePlanHome$Header$Style$Inactive) {
            MobilePlanHome.InactiveHeader.ADAPTER.encodeWithTag(protoWriter, 2, ((MobilePlanHome$Header$Style$Inactive) inputState_androidKt).value);
        } else if (inputState_androidKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(header.unknownFields());
    }
}
