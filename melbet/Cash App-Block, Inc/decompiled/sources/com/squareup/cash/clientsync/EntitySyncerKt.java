package com.squareup.cash.clientsync;

import androidx.collection.SieveCacheKt;
import androidx.collection.SparseArrayCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.franklin.common.SyncEntityType;
import com.squareup.scannerview.AspectRatio;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SafeFlow;
import okio.Buffer;

/* loaded from: classes8.dex */
public abstract class EntitySyncerKt {
    public static ViewEvent.Context fromJsonObject(JsonObject jsonObject) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
                String key = entry.getKey();
                key.getClass();
                linkedHashMap.put(key, entry.getValue());
            }
            return new ViewEvent.Context(linkedHashMap);
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Context", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Context", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Context", e3);
            return null;
        }
    }

    public static final Flow hasSyncedFlow(MultiplatformEntitySyncer multiplatformEntitySyncer) {
        return FlowKt.distinctUntilChanged(new SafeFlow(new EntitySyncerKt$hasSyncedFlow$1(multiplatformEntitySyncer, null, 0)));
    }

    public static AspectRatio of(int i, int i2) {
        int i3 = i;
        int i4 = i2;
        while (i4 != 0) {
            int i5 = i3 % i4;
            i3 = i4;
            i4 = i5;
        }
        int i6 = i / i3;
        int i7 = i2 / i3;
        SparseArrayCompat sparseArrayCompat = AspectRatio.sCache;
        sparseArrayCompat.getClass();
        SparseArrayCompat sparseArrayCompat2 = (SparseArrayCompat) SieveCacheKt.commonGet(sparseArrayCompat, i6);
        if (sparseArrayCompat2 == null) {
            AspectRatio aspectRatio = new AspectRatio(i6, i7);
            SparseArrayCompat sparseArrayCompat3 = new SparseArrayCompat((Object) null);
            sparseArrayCompat3.put(i7, aspectRatio);
            sparseArrayCompat.put(i6, sparseArrayCompat3);
            return aspectRatio;
        }
        AspectRatio aspectRatio2 = (AspectRatio) SieveCacheKt.commonGet(sparseArrayCompat2, i7);
        if (aspectRatio2 != null) {
            return aspectRatio2;
        }
        AspectRatio aspectRatio3 = new AspectRatio(i6, i7);
        sparseArrayCompat2.put(i7, aspectRatio3);
        return aspectRatio3;
    }

    public static final long rawEntityType(SyncEntity syncEntity) {
        syncEntity.getClass();
        if (syncEntity.f1388type != null) {
            return r0.value;
        }
        Buffer buffer = new Buffer();
        buffer.m4333write(syncEntity.unknownFields());
        ProtoReader protoReader = new ProtoReader(buffer);
        long beginMessage = protoReader.beginMessage();
        while (true) {
            int nextTag = protoReader.nextTag();
            if (nextTag == -1) {
                protoReader.endMessageAndGetUnknownFields(beginMessage);
                a$$ExternalSyntheticBUOutline0.m$1("SyncEntity#type tag not found!");
                return 0L;
            }
            if (nextTag == 1) {
                try {
                    return ((SyncEntityType) SyncEntityType.ADAPTER.decode(protoReader)).value;
                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                    return e.value;
                }
            }
            protoReader.readUnknownField(nextTag);
        }
    }
}
