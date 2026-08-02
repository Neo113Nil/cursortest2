package com.google.firebase.datastorage;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.tracing.Trace;
import coil3.memory.MemoryCacheService;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

/* loaded from: classes.dex */
public final class JavaDataStorage {
    public static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.factory.property2(new PropertyReference2Impl(JavaDataStorage.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;"))};
    public final DataStore dataStore;
    public final ThreadLocal editLock;
    public final String name;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.firebase.datastorage.JavaDataStorage$$ExternalSyntheticLambda0] */
    public JavaDataStorage(Context context, String str) {
        context.getClass();
        this.name = str;
        this.editLock = new ThreadLocal();
        final int i = 0;
        final int i2 = 1;
        this.dataStore = (DataStore) Trace.preferencesDataStore$default(str, new MemoryCacheService(new Function1(this) { // from class: com.google.firebase.datastorage.JavaDataStorage$$ExternalSyntheticLambda0
            public final /* synthetic */ JavaDataStorage f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i;
                JavaDataStorage javaDataStorage = this.f$0;
                switch (i3) {
                    case 0:
                        CorruptionException corruptionException = (CorruptionException) obj;
                        corruptionException.getClass();
                        Log.w(Reflection.factory.getOrCreateKotlinClass(JavaDataStorage.class).getSimpleName(), "CorruptionException in " + javaDataStorage.name + " DataStore running in process " + Process.myPid(), corruptionException);
                        return new MutablePreferences(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        return CollectionsKt__CollectionsJVMKt.listOf(SharedPreferencesMigrationKt.SharedPreferencesMigration(context2, javaDataStorage.name, SharedPreferencesMigrationKt.MIGRATE_ALL_KEYS));
                }
            }
        }, 17), new Function1(this) { // from class: com.google.firebase.datastorage.JavaDataStorage$$ExternalSyntheticLambda0
            public final /* synthetic */ JavaDataStorage f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                JavaDataStorage javaDataStorage = this.f$0;
                switch (i3) {
                    case 0:
                        CorruptionException corruptionException = (CorruptionException) obj;
                        corruptionException.getClass();
                        Log.w(Reflection.factory.getOrCreateKotlinClass(JavaDataStorage.class).getSimpleName(), "CorruptionException in " + javaDataStorage.name + " DataStore running in process " + Process.myPid(), corruptionException);
                        return new MutablePreferences(true);
                    default:
                        Context context2 = (Context) obj;
                        context2.getClass();
                        return CollectionsKt__CollectionsJVMKt.listOf(SharedPreferencesMigrationKt.SharedPreferencesMigration(context2, javaDataStorage.name, SharedPreferencesMigrationKt.MIGRATE_ALL_KEYS));
                }
            }
        }, 8).getValue(context, $$delegatedProperties[0]);
    }

    public final void editSync(Function1 function1) {
    }
}
