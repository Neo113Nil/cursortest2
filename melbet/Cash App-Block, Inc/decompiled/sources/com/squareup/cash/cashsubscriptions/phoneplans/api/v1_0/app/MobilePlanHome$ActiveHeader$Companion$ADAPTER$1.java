package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import androidx.room.TransactorKt;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class MobilePlanHome$ActiveHeader$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MobilePlanHome.ActiveHeader((String) obj, (String) obj2, (MobilePlanHome.CtaStyle) obj3, (String) obj4, (MobilePlanHome.Action) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                try {
                    obj3 = MobilePlanHome.CtaStyle.ADAPTER.decode(protoReader);
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                }
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = TransactorKt.decodeMessageOrMerge(MobilePlanHome.Action.ADAPTER, protoReader, obj5);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MobilePlanHome.ActiveHeader activeHeader = (MobilePlanHome.ActiveHeader) obj;
        reverseProtoWriter.getClass();
        activeHeader.getClass();
        reverseProtoWriter.writeBytes(activeHeader.unknownFields());
        MobilePlanHome.Action.ADAPTER.encodeWithTag(reverseProtoWriter, 5, activeHeader.secondary_action);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, activeHeader.cta_destination);
        MobilePlanHome.CtaStyle.ADAPTER.encodeWithTag(reverseProtoWriter, 3, activeHeader.cta_style);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, activeHeader.cta_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, activeHeader.title);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MobilePlanHome.ActiveHeader activeHeader = (MobilePlanHome.ActiveHeader) obj;
        activeHeader.getClass();
        int size$okio = activeHeader.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return MobilePlanHome.Action.ADAPTER.encodedSizeWithTag(5, activeHeader.secondary_action) + protoAdapter.encodedSizeWithTag(4, activeHeader.cta_destination) + MobilePlanHome.CtaStyle.ADAPTER.encodedSizeWithTag(3, activeHeader.cta_style) + protoAdapter.encodedSizeWithTag(2, activeHeader.cta_text) + protoAdapter.encodedSizeWithTag(1, activeHeader.title) + size$okio;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MobilePlanHome.ActiveHeader activeHeader = (MobilePlanHome.ActiveHeader) obj;
        activeHeader.getClass();
        MobilePlanHome.Action action = activeHeader.secondary_action;
        MobilePlanHome.Action action2 = action != null ? (MobilePlanHome.Action) MobilePlanHome.Action.ADAPTER.redact(action) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = activeHeader.title;
        String str2 = activeHeader.cta_text;
        MobilePlanHome.CtaStyle ctaStyle = activeHeader.cta_style;
        String str3 = activeHeader.cta_destination;
        byteString.getClass();
        return new MobilePlanHome.ActiveHeader(str, str2, ctaStyle, str3, action2, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MobilePlanHome.ActiveHeader activeHeader = (MobilePlanHome.ActiveHeader) obj;
        activeHeader.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, activeHeader.title);
        protoAdapter.encodeWithTag(protoWriter, 2, activeHeader.cta_text);
        MobilePlanHome.CtaStyle.ADAPTER.encodeWithTag(protoWriter, 3, activeHeader.cta_style);
        protoAdapter.encodeWithTag(protoWriter, 4, activeHeader.cta_destination);
        MobilePlanHome.Action.ADAPTER.encodeWithTag(protoWriter, 5, activeHeader.secondary_action);
        protoWriter.writeBytes(activeHeader.unknownFields());
    }
}
