package com.squareup.cash.bankingbenefits.api.v1_0.app;

import androidx.room.TransactorKt;
import com.squareup.cash.bankingbenefits.api.v1_0.app.BenefitsHub;
import com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TintedIcon;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class BenefitsHub$Disclosures$Disclosure$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new BenefitsHub.Disclosures.Disclosure((TintedIcon) obj, (String) obj2, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(TintedIcon.ADAPTER, protoReader, obj);
            } else if (nextTag != 2) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj2 = ProtoAdapter.STRING.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        BenefitsHub.Disclosures.Disclosure disclosure = (BenefitsHub.Disclosures.Disclosure) obj;
        reverseProtoWriter.getClass();
        disclosure.getClass();
        reverseProtoWriter.writeBytes(disclosure.unknownFields());
        ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 2, disclosure.text);
        TintedIcon.ADAPTER.encodeWithTag(reverseProtoWriter, 1, disclosure.icon);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        BenefitsHub.Disclosures.Disclosure disclosure = (BenefitsHub.Disclosures.Disclosure) obj;
        disclosure.getClass();
        return ProtoAdapter.STRING.encodedSizeWithTag(2, disclosure.text) + TintedIcon.ADAPTER.encodedSizeWithTag(1, disclosure.icon) + disclosure.unknownFields().getSize$okio();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        BenefitsHub.Disclosures.Disclosure disclosure = (BenefitsHub.Disclosures.Disclosure) obj;
        disclosure.getClass();
        TintedIcon tintedIcon = disclosure.icon;
        TintedIcon tintedIcon2 = tintedIcon != null ? (TintedIcon) TintedIcon.ADAPTER.redact(tintedIcon) : null;
        ByteString byteString = ByteString.EMPTY;
        String str = disclosure.text;
        byteString.getClass();
        return new BenefitsHub.Disclosures.Disclosure(tintedIcon2, str, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        BenefitsHub.Disclosures.Disclosure disclosure = (BenefitsHub.Disclosures.Disclosure) obj;
        disclosure.getClass();
        TintedIcon.ADAPTER.encodeWithTag(protoWriter, 1, disclosure.icon);
        ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, disclosure.text);
        protoWriter.writeBytes(disclosure.unknownFields());
    }
}
