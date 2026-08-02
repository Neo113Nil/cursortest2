package com.squareup.cash.cashoclock.api.v1_0.syncvalues;

import androidx.room.TransactorKt;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class CashOClockPreference$Companion$ADAPTER$1 extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) {
        protoReader.getClass();
        long beginMessage = protoReader.beginMessage();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                return new CashOClockPreference((ScheduledReload) obj, (LocalizedString) obj2, (LocalizedString) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                obj = TransactorKt.decodeMessageOrMerge(ScheduledReload.ADAPTER, protoReader, obj);
            } else if (nextTag == 2) {
                obj2 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj2);
            } else if (nextTag != 3) {
                protoReader.readUnknownField(nextTag);
            } else {
                obj3 = TransactorKt.decodeMessageOrMerge(LocalizedString.ADAPTER, protoReader, obj3);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
        CashOClockPreference cashOClockPreference = (CashOClockPreference) obj;
        reverseProtoWriter.getClass();
        cashOClockPreference.getClass();
        reverseProtoWriter.writeBytes(cashOClockPreference.unknownFields());
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(reverseProtoWriter, 3, cashOClockPreference.subtitle);
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, cashOClockPreference.title);
        ScheduledReload.ADAPTER.encodeWithTag(reverseProtoWriter, 1, cashOClockPreference.scheduled_reload);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        CashOClockPreference cashOClockPreference = (CashOClockPreference) obj;
        cashOClockPreference.getClass();
        int encodedSizeWithTag = ScheduledReload.ADAPTER.encodedSizeWithTag(1, cashOClockPreference.scheduled_reload) + cashOClockPreference.unknownFields().getSize$okio();
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        return protoAdapter.encodedSizeWithTag(3, cashOClockPreference.subtitle) + protoAdapter.encodedSizeWithTag(2, cashOClockPreference.title) + encodedSizeWithTag;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        CashOClockPreference cashOClockPreference = (CashOClockPreference) obj;
        cashOClockPreference.getClass();
        ScheduledReload scheduledReload = cashOClockPreference.scheduled_reload;
        ScheduledReload scheduledReload2 = scheduledReload != null ? (ScheduledReload) ScheduledReload.ADAPTER.redact(scheduledReload) : null;
        LocalizedString localizedString = cashOClockPreference.title;
        LocalizedString localizedString2 = localizedString != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString) : null;
        LocalizedString localizedString3 = cashOClockPreference.subtitle;
        LocalizedString localizedString4 = localizedString3 != null ? (LocalizedString) LocalizedString.ADAPTER.redact(localizedString3) : null;
        ByteString byteString = ByteString.EMPTY;
        byteString.getClass();
        return new CashOClockPreference(scheduledReload2, localizedString2, localizedString4, byteString);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) {
        CashOClockPreference cashOClockPreference = (CashOClockPreference) obj;
        cashOClockPreference.getClass();
        ScheduledReload.ADAPTER.encodeWithTag(protoWriter, 1, cashOClockPreference.scheduled_reload);
        ProtoAdapter protoAdapter = LocalizedString.ADAPTER;
        protoAdapter.encodeWithTag(protoWriter, 2, cashOClockPreference.title);
        protoAdapter.encodeWithTag(protoWriter, 3, cashOClockPreference.subtitle);
        protoWriter.writeBytes(cashOClockPreference.unknownFields());
    }
}
