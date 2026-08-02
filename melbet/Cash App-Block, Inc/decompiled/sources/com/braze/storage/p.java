package com.braze.storage;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import bo.app.se;
import com.braze.enums.DataStoreKey;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes4.dex */
public final class p extends DataStoreProvider {
    public static final ServerConfigDataStoreProvider$Companion b = new ServerConfigDataStoreProvider$Companion(null);
    public final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.a = str;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt__CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.braze.storage.server_config.", this.a), ArraysKt___ArraysKt.toSet(new String[]{DataStoreKey.LAST_ACCESSED_SDK_VERSION.getKey(), DataStoreKey.CONFIG_TIME.getKey(), DataStoreKey.EPHEMERAL_EVENTS_ENABLED.getKey(), DataStoreKey.GEOFENCES_ENABLED_SET.getKey(), DataStoreKey.GEOFENCES_ENABLED.getKey(), DataStoreKey.GEOFENCES_MIN_TIME_REQUEST.getKey(), DataStoreKey.GEOFENCES_MIN_TIME_REPORT.getKey(), DataStoreKey.GEOFENCES_MAX_NUM_TO_REGISTER.getKey(), DataStoreKey.MESSAGING_SESSION_TIMEOUT.getKey(), DataStoreKey.DUST_ENABLED.getKey(), DataStoreKey.CONTENT_CARDS_ENABLED.getKey(), DataStoreKey.FEATURE_FLAGS_ENABLED.getKey(), DataStoreKey.FEATURE_FLAGS_RATE_REFRESH_RATE_LIMIT.getKey(), DataStoreKey.PUSH_MAX_ENABLED.getKey(), DataStoreKey.PUSH_MAX_REDELIVER_BUFFER.getKey(), DataStoreKey.PUSH_MAX_REDELIVER_DEDUPE_BUFFER.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_ENABLED.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_CAPACITY.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMITING_REFILL_RATE.getKey(), DataStoreKey.GLOBAL_REQUEST_RATE_LIMIT_ENDPOINT_OVERRIDES.getKey(), DataStoreKey.DEFAULT_REQUEST_BACKOFF_MIN_SLEEP_DURATION_MS.getKey(), DataStoreKey.DEFAULT_REQUEST_BACKOFF_MAX_SLEEP_DURATION_MS.getKey(), DataStoreKey.DEFAULT_REQUEST_BACKOFF_SCALE_FACTOR.getKey(), DataStoreKey.SDK_DEBUGGER_ENABLED.getKey(), DataStoreKey.SDK_DEBUGGER_EXPIRATION_TIME.getKey(), DataStoreKey.SDK_DEBUGGER_AUTHORIZATION_CODE.getKey(), DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_BYTES.getKey(), DataStoreKey.SDK_DEBUGGER_FLUSH_INTERVAL_SECONDS.getKey(), DataStoreKey.SDK_DEBUGGER_MAX_PAYLOAD_BYTES.getKey(), DataStoreKey.BANNERS_ENABLED.getKey(), DataStoreKey.MAX_BANNER_PLACEMENTS.getKey()})), new SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.braze.storage.server_config.", this.a), (RealGcmRegistrar$unregister$2) null, new se(b), 12)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return Recorder$$ExternalSyntheticOutline2.m("com.braze.serverconfig.", this.a);
    }
}
