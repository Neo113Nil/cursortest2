package com.squareup.cash.clientsync;

import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.protos.franklin.common.EncryptedSyncEntity;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.franklin.common.SyncEntityType;

/* loaded from: classes6.dex */
public abstract class UtilsKt {
    public static ViewEvent.Crash fromJsonObject(JsonObject jsonObject) {
        try {
            return new ViewEvent.Crash(jsonObject.get("count").getAsLong());
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Crash", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Crash", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Crash", e3);
            return null;
        }
    }

    public static final SyncEntityMetadata metadata(SyncEntity syncEntity) {
        String str = syncEntity.entity_id;
        str.getClass();
        return new SyncEntityMetadata(str, syncEntity.version);
    }

    public static final SyncEntityType type(SyncEntity syncEntity) {
        syncEntity.getClass();
        SyncEntityType syncEntityType = syncEntity.f1388type;
        if (syncEntityType != null) {
            return syncEntityType;
        }
        EncryptedSyncEntity encryptedSyncEntity = syncEntity.encrypted_sync_entity;
        if (encryptedSyncEntity != null) {
            return encryptedSyncEntity.f1377type;
        }
        return null;
    }
}
