package com.datadog.android.rum.internal.domain;

import androidx.room.CoroutinesRoom;
import com.datadog.android.api.storage.DataWriter;
import com.datadog.android.api.storage.EventBatchWriter;
import com.datadog.android.api.storage.RawBatchEvent;
import com.datadog.android.core.InternalSdkCore;
import com.datadog.android.core.persistence.SerializerKt;
import com.datadog.android.rum.internal.domain.event.RumEventMeta$View;
import com.datadog.android.rum.model.ViewEvent;
import com.google.android.filament.Box;

/* loaded from: classes4.dex */
public final class RumDataWriter implements DataWriter {
    public static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    public final CoroutinesRoom.Companion eventMetaSerializer;
    public final Box eventSerializer;
    public final InternalSdkCore sdkCore;

    public RumDataWriter(Box box, CoroutinesRoom.Companion companion, InternalSdkCore internalSdkCore) {
        internalSdkCore.getClass();
        this.eventSerializer = box;
        this.eventMetaSerializer = companion;
        this.sdkCore = internalSdkCore;
    }

    @Override // com.datadog.android.api.storage.DataWriter
    public final boolean write(EventBatchWriter eventBatchWriter, Object obj, int i) {
        RawBatchEvent rawBatchEvent;
        boolean write;
        eventBatchWriter.getClass();
        obj.getClass();
        if (i == 0) {
            throw null;
        }
        byte[] serializeToByteArray = SerializerKt.serializeToByteArray(this.eventSerializer, obj, this.sdkCore.getInternalLogger());
        if (serializeToByteArray == null) {
            return false;
        }
        if (obj instanceof ViewEvent) {
            ViewEvent viewEvent = (ViewEvent) obj;
            ViewEvent.ViewEventView viewEventView = viewEvent.view;
            byte[] serializeToByteArray2 = SerializerKt.serializeToByteArray(this.eventMetaSerializer, new RumEventMeta$View(viewEventView.id, viewEvent.dd.documentVersion, Boolean.valueOf(viewEventView.accessibility != null)), this.sdkCore.getInternalLogger());
            if (serializeToByteArray2 == null) {
                serializeToByteArray2 = EMPTY_BYTE_ARRAY;
            }
            rawBatchEvent = new RawBatchEvent(serializeToByteArray, serializeToByteArray2);
        } else {
            rawBatchEvent = new RawBatchEvent(serializeToByteArray, RawBatchEvent.EMPTY_BYTE_ARRAY);
        }
        synchronized (this) {
            write = eventBatchWriter.write(rawBatchEvent, i);
            if (write && (obj instanceof ViewEvent)) {
                this.sdkCore.writeLastViewEvent(serializeToByteArray);
            }
        }
        return write;
    }
}
