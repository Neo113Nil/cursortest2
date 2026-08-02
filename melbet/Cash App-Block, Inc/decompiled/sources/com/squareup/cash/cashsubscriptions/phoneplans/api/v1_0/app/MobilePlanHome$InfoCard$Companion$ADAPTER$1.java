package com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app;

import androidx.compose.ui.text.input.TextFieldValueKt;
import com.squareup.cash.cashsubscriptions.phoneplans.api.v1_0.app.MobilePlanHome;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class MobilePlanHome$InfoCard$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        TextFieldValueKt mobilePlanHome$InfoCard$Detail$Caption;
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        TextFieldValueKt textFieldValueKt = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new MobilePlanHome.InfoCard((String) obj, (String) obj2, textFieldValueKt, (MobilePlanHome.InfoCard.ProgressBarColor) obj3, (String) obj4, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    obj = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 2:
                    obj2 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                case 3:
                    mobilePlanHome$InfoCard$Detail$Caption = new MobilePlanHome$InfoCard$Detail$Caption((String) ProtoAdapter.STRING.decode(protoReader));
                    break;
                case 4:
                    mobilePlanHome$InfoCard$Detail$Caption = new MobilePlanHome$InfoCard$Detail$Progress(((Number) ProtoAdapter.FLOAT.decode(protoReader)).floatValue());
                    break;
                case 5:
                    try {
                        obj3 = MobilePlanHome.InfoCard.ProgressBarColor.ADAPTER.decode(protoReader);
                        continue;
                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                        protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        break;
                    }
                case 6:
                    obj4 = ProtoAdapter.STRING.decode(protoReader);
                    continue;
                default:
                    protoReader.readUnknownField(nextTag);
                    continue;
            }
            textFieldValueKt = mobilePlanHome$InfoCard$Detail$Caption;
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        MobilePlanHome.InfoCard infoCard = (MobilePlanHome.InfoCard) obj;
        reverseProtoWriter.getClass();
        infoCard.getClass();
        reverseProtoWriter.writeBytes(infoCard.unknownFields());
        TextFieldValueKt textFieldValueKt = infoCard.detail;
        if (textFieldValueKt instanceof MobilePlanHome$InfoCard$Detail$Caption) {
            ProtoAdapter.STRING.encodeWithTag(reverseProtoWriter, 3, ((MobilePlanHome$InfoCard$Detail$Caption) textFieldValueKt).value);
        } else if (textFieldValueKt instanceof MobilePlanHome$InfoCard$Detail$Progress) {
            ProtoAdapter.FLOAT.encodeWithTag(reverseProtoWriter, 4, Float.valueOf(((MobilePlanHome$InfoCard$Detail$Progress) textFieldValueKt).value));
        } else if (textFieldValueKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 6, infoCard.destination);
        MobilePlanHome.InfoCard.ProgressBarColor.ADAPTER.encodeWithTag(reverseProtoWriter, 5, infoCard.progress_bar_color);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, infoCard.value);
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, infoCard.label);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        int encodedSizeWithTag;
        MobilePlanHome.InfoCard infoCard = (MobilePlanHome.InfoCard) obj;
        infoCard.getClass();
        int size$okio = infoCard.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(2, infoCard.value) + protoAdapter.encodedSizeWithTag(1, infoCard.label) + size$okio;
        TextFieldValueKt textFieldValueKt = infoCard.detail;
        if (textFieldValueKt instanceof MobilePlanHome$InfoCard$Detail$Caption) {
            encodedSizeWithTag = protoAdapter.encodedSizeWithTag(3, ((MobilePlanHome$InfoCard$Detail$Caption) textFieldValueKt).value);
        } else {
            if (!(textFieldValueKt instanceof MobilePlanHome$InfoCard$Detail$Progress)) {
                if (textFieldValueKt != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return protoAdapter.encodedSizeWithTag(6, infoCard.destination) + MobilePlanHome.InfoCard.ProgressBarColor.ADAPTER.encodedSizeWithTag(5, infoCard.progress_bar_color) + encodedSizeWithTag2;
            }
            encodedSizeWithTag = ProtoAdapter.FLOAT.encodedSizeWithTag(4, Float.valueOf(((MobilePlanHome$InfoCard$Detail$Progress) textFieldValueKt).value));
        }
        encodedSizeWithTag2 += encodedSizeWithTag;
        return protoAdapter.encodedSizeWithTag(6, infoCard.destination) + MobilePlanHome.InfoCard.ProgressBarColor.ADAPTER.encodedSizeWithTag(5, infoCard.progress_bar_color) + encodedSizeWithTag2;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        MobilePlanHome.InfoCard infoCard = (MobilePlanHome.InfoCard) obj;
        infoCard.getClass();
        ByteString byteString = ByteString.EMPTY;
        String str = infoCard.label;
        String str2 = infoCard.value;
        TextFieldValueKt textFieldValueKt = infoCard.detail;
        MobilePlanHome.InfoCard.ProgressBarColor progressBarColor = infoCard.progress_bar_color;
        String str3 = infoCard.destination;
        byteString.getClass();
        return new MobilePlanHome.InfoCard(str, str2, textFieldValueKt, progressBarColor, str3, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        MobilePlanHome.InfoCard infoCard = (MobilePlanHome.InfoCard) obj;
        infoCard.getClass();
        ProtoAdapter protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, infoCard.label);
        protoAdapter.encodeWithTag(protoWriter, 2, infoCard.value);
        MobilePlanHome.InfoCard.ProgressBarColor.ADAPTER.encodeWithTag(protoWriter, 5, infoCard.progress_bar_color);
        protoAdapter.encodeWithTag(protoWriter, 6, infoCard.destination);
        TextFieldValueKt textFieldValueKt = infoCard.detail;
        if (textFieldValueKt instanceof MobilePlanHome$InfoCard$Detail$Caption) {
            protoAdapter.encodeWithTag(protoWriter, 3, ((MobilePlanHome$InfoCard$Detail$Caption) textFieldValueKt).value);
        } else if (textFieldValueKt instanceof MobilePlanHome$InfoCard$Detail$Progress) {
            ProtoAdapter.FLOAT.encodeWithTag(protoWriter, 4, Float.valueOf(((MobilePlanHome$InfoCard$Detail$Progress) textFieldValueKt).value));
        } else if (textFieldValueKt != null) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        protoWriter.writeBytes(infoCard.unknownFields());
    }
}
