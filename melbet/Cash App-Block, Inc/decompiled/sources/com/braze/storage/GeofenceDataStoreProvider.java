package com.braze.storage;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.Preferences;
import bo.app.o8;
import bo.app.p8;
import bo.app.q8;
import bo.app.r8;
import com.braze.enums.DataStoreKey;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/braze/storage/GeofenceDataStoreProvider;", "Lcom/braze/storage/DataStoreProvider;", "Landroid/content/Context;", "context", "", "apiKey", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "getDataStoreFileName", "()Ljava/lang/String;", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "getDataStore", "()Landroidx/datastore/core/DataStore;", "Ljava/lang/String;", "getApiKey", "Companion", "bo/app/o8", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GeofenceDataStoreProvider extends DataStoreProvider {
    public static final o8 Companion = new o8();
    private final String apiKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeofenceDataStoreProvider(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.apiKey = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getDataStore$migrateGeofencesListToJson(o8 o8Var, SharedPreferencesView sharedPreferencesView, Preferences preferences, Continuation continuation) {
        o8Var.getClass();
        sharedPreferencesView.getClass();
        preferences.getClass();
        return o8Var.a(sharedPreferencesView, preferences, DataStoreKey.GEOFENCES.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getDataStore$migrateIndividualReeligibilityMapToJson(o8 o8Var, SharedPreferencesView sharedPreferencesView, Preferences preferences, Continuation continuation) {
        return o8Var.a(sharedPreferencesView, preferences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getDataStore$migrateRegisteredGeofencesListToJson(o8 o8Var, SharedPreferencesView sharedPreferencesView, Preferences preferences, Continuation continuation) {
        o8Var.getClass();
        sharedPreferencesView.getClass();
        preferences.getClass();
        return o8Var.a(sharedPreferencesView, preferences, DataStoreKey.REGISTERED_GEOFENCES.getKey());
    }

    @Override // com.braze.storage.DataStoreProvider
    public DataStore getDataStore() {
        SharedPreferencesMigration SharedPreferencesMigration = SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.appboy.managers.geofences.eligibility.global.", this.apiKey), ArraysKt___ArraysKt.toSet(new String[]{DataStoreKey.GLOBAL_LAST_REPORT.getKey(), DataStoreKey.GLOBAL_LAST_REQUEST.getKey()}));
        Context context = getContext();
        String m = Recorder$$ExternalSyntheticOutline2.m("com.appboy.managers.geofences.eligibility.individual.", this.apiKey);
        o8 o8Var = Companion;
        return createOrGetDataStore(CollectionsKt__CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{SharedPreferencesMigration, new SharedPreferencesMigration(context, m, (RealGcmRegistrar$unregister$2) null, new p8(o8Var), 12), new SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.appboy.managers.geofences.storage.", this.apiKey), (RealGcmRegistrar$unregister$2) null, new q8(o8Var), 12), new SharedPreferencesMigration(getContext(), "com.appboy.support.geofences", (RealGcmRegistrar$unregister$2) null, new r8(o8Var), 12)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public String getDataStoreFileName() {
        return Recorder$$ExternalSyntheticOutline2.m("com.braze.geofences.", this.apiKey);
    }
}
