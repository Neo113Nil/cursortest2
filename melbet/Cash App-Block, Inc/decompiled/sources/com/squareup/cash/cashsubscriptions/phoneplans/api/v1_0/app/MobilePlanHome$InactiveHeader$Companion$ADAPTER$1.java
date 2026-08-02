package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import androidx.room.TransactorKt;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class MobilePlanHome$InactiveHeader$Companion$ADAPTER$1 extends ProtoAdapter {
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
                return new MobilePlanHome.InactiveHeader((UiAvatar) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 3) {
                obj3 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag == 4) {
                obj4 = ProtoAdapter.STRING.decode(protoReader);
            } else if (nextTag != 5) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj5 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MobilePlanHome.InactiveHeader inactiveHeader = (MobilePlanHome.InactiveHeader) obj;
        reverseProtoWriter.getClass();
        inactiveHeader.getClass();
        reverseProtoWriter.writeBytes(inactiveHeader.unknownFields());
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 5, inactiveHeader.cta_destination);
        protoAdapter.encodeWithTag(reverseProtoWriter, 4, inactiveHeader.cta_text);
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, inactiveHeader.body);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, inactiveHeader.title);
        UiAvatar.ADAPTER.encodeWithTag(reverseProtoWriter, 1, inactiveHeader.avatar);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        MobilePlanHome.InactiveHeader inactiveHeader = (MobilePlanHome.InactiveHeader) obj;
        inactiveHeader.getClass();
        int encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(1, inactiveHeader.avatar) + inactiveHeader.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        return protoAdapter.encodedSizeWithTag(5, inactiveHeader.cta_destination) + protoAdapter.encodedSizeWithTag(4, inactiveHeader.cta_text) + protoAdapter.encodedSizeWithTag(3, inactiveHeader.body) + protoAdapter.encodedSizeWithTag(2, inactiveHeader.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MobilePlanHome.InactiveHeader inactiveHeader = (MobilePlanHome.InactiveHeader) obj;
        inactiveHeader.getClass();
        UiAvatar uiAvatar = inactiveHeader.avatar;
        UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = inactiveHeader.title;
        String str2 = inactiveHeader.body;
        String str3 = inactiveHeader.cta_text;
        String str4 = inactiveHeader.cta_destination;
        byteString.getClass();
        return new MobilePlanHome.InactiveHeader(uiAvatar2, str, str2, str3, str4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MobilePlanHome.InactiveHeader inactiveHeader = (MobilePlanHome.InactiveHeader) obj;
        inactiveHeader.getClass();
        UiAvatar.ADAPTER.encodeWithTag(protoWriter, 1, inactiveHeader.avatar);
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 2, inactiveHeader.title);
        protoAdapter.encodeWithTag(protoWriter, 3, inactiveHeader.body);
        protoAdapter.encodeWithTag(protoWriter, 4, inactiveHeader.cta_text);
        protoAdapter.encodeWithTag(protoWriter, 5, inactiveHeader.cta_destination);
        protoWriter.writeBytes(inactiveHeader.unknownFields());
    }
}
