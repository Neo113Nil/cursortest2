package com.google.firebase.heartbeatinfo;

import android.content.Context;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.lifecycle.BlockRunner$cancel$1;
import app.cash.molecule.PlatformKt;
import bo.app.c7$$ExternalSyntheticLambda6;
import coil3.network.NetworkFetcher$doFetch$2;
import com.google.firebase.datastorage.JavaDataStorage;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.JobKt;

/* loaded from: classes.dex */
public final class HeartBeatInfoStorage {
    public static final Preferences.Key GLOBAL = new Preferences.Key("fire-global");
    public static final Preferences.Key HEART_BEAT_COUNT_TAG = new Preferences.Key("fire-count");
    public static final Preferences.Key LAST_STORED_DATE = new Preferences.Key("last-used-date");
    public final JavaDataStorage firebaseDataStore;

    public HeartBeatInfoStorage(Context context, String str) {
        this.firebaseDataStore = new JavaDataStorage(context, "FirebaseHeartBeat".concat(str));
    }

    public final synchronized ArrayList getAllHeartBeats() {
        try {
            ArrayList arrayList = new ArrayList();
            String formattedDate = getFormattedDate(System.currentTimeMillis());
            JavaDataStorage javaDataStorage = this.firebaseDataStore;
            javaDataStorage.getClass();
            for (Map.Entry entry : ((Map) JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new BlockRunner$cancel$1(javaDataStorage, (Continuation) null, 20))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(formattedDate);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(AutoValue_HeartBeatResult.create(((Preferences.Key) entry.getKey()).name, new ArrayList(hashSet)));
                    }
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.firebaseDataStore.editSync(new c7$$ExternalSyntheticLambda6(currentTimeMillis, 9));
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String getFormattedDate(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized Preferences.Key getStoredUserAgentString(MutablePreferences mutablePreferences, String str) {
        for (Map.Entry entry : mutablePreferences.asMap().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        String str2 = ((Preferences.Key) entry.getKey()).name;
                        str2.getClass();
                        return new Preferences.Key(str2);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void removeStoredDate(MutablePreferences mutablePreferences, String str) {
        try {
            Preferences.Key storedUserAgentString = getStoredUserAgentString(mutablePreferences, str);
            if (storedUserAgentString == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) PlatformKt.getOrDefault(mutablePreferences, storedUserAgentString, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                mutablePreferences.remove(storedUserAgentString);
            } else {
                mutablePreferences.setUnchecked$datastore_preferences_core_release(storedUserAgentString, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean shouldSendSdkHeartBeat(Preferences.Key key, long j) {
        Continuation continuation;
        EmptyCoroutineContext emptyCoroutineContext;
        long longValue;
        JavaDataStorage javaDataStorage = this.firebaseDataStore;
        javaDataStorage.getClass();
        key.getClass();
        continuation = null;
        NetworkFetcher$doFetch$2 networkFetcher$doFetch$2 = new NetworkFetcher$doFetch$2(javaDataStorage, key, continuation, 3);
        emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        longValue = ((Long) JobKt.runBlockingK(emptyCoroutineContext, networkFetcher$doFetch$2)).longValue();
        synchronized (this) {
        }
        if (getFormattedDate(longValue).equals(getFormattedDate(j))) {
            return false;
        }
        JavaDataStorage javaDataStorage2 = this.firebaseDataStore;
        Long valueOf = Long.valueOf(j);
        javaDataStorage2.getClass();
        return true;
    }
}
