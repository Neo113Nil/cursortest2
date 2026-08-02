package androidx.datastore.preferences;

import android.content.Context;
import androidx.datastore.core.CorruptionHandler;
import androidx.datastore.core.DataStoreImpl;
import androidx.datastore.core.FileStorage;
import androidx.datastore.preferences.core.PreferenceDataStore;
import androidx.datastore.preferences.core.PreferencesFileSerializer;
import app.cash.molecule.GatedFrameClock;
import coil3.memory.MemoryCacheService;
import com.android.volley.toolbox.HurlStack;
import com.datadog.android.Datadog$getInstance$1$1;
import com.squareup.contour.ContourLayout$geometry$1;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class PreferenceDataStoreSingletonDelegate implements ReadOnlyProperty {
    public volatile PreferenceDataStore INSTANCE;
    public final MemoryCacheService corruptionHandler;
    public final Object lock = new Object();
    public final String name;
    public final Function1 produceMigrations;
    public final CoroutineScope scope;

    public PreferenceDataStoreSingletonDelegate(String str, MemoryCacheService memoryCacheService, Function1 function1, CoroutineScope coroutineScope) {
        this.name = str;
        this.corruptionHandler = memoryCacheService;
        this.produceMigrations = function1;
        this.scope = coroutineScope;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public final Object getValue(Object obj, KProperty kProperty) {
        PreferenceDataStore preferenceDataStore;
        Context context = (Context) obj;
        context.getClass();
        kProperty.getClass();
        PreferenceDataStore preferenceDataStore2 = this.INSTANCE;
        if (preferenceDataStore2 != null) {
            return preferenceDataStore2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = context.getApplicationContext();
                    CorruptionHandler corruptionHandler = this.corruptionHandler;
                    Function1 function1 = this.produceMigrations;
                    applicationContext.getClass();
                    List list = (List) function1.invoke(applicationContext);
                    CoroutineScope coroutineScope = this.scope;
                    Datadog$getInstance$1$1 datadog$getInstance$1$1 = new Datadog$getInstance$1$1(8, applicationContext, this);
                    list.getClass();
                    FileStorage fileStorage = new FileStorage(PreferencesFileSerializer.INSTANCE, new ContourLayout$geometry$1(datadog$getInstance$1$1, 14));
                    if (corruptionHandler == null) {
                        corruptionHandler = new HurlStack(10);
                    }
                    this.INSTANCE = new PreferenceDataStore(new PreferenceDataStore(new DataStoreImpl(fileStorage, CollectionsKt__CollectionsJVMKt.listOf(new GatedFrameClock.AnonymousClass1(list, (Continuation) null, 12)), corruptionHandler, coroutineScope)));
                }
                preferenceDataStore = this.INSTANCE;
                preferenceDataStore.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return preferenceDataStore;
    }
}
