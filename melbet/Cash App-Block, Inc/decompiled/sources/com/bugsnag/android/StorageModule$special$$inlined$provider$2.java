package com.bugsnag.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import androidx.datastore.core.SimpleActor;
import com.bugsnag.android.DeviceIdStore;
import com.bugsnag.android.internal.dag.RunnableProvider;
import com.squareup.util.cash.Countries;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

/* loaded from: classes.dex */
public final class StorageModule$special$$inlined$provider$2 extends RunnableProvider {
    public final /* synthetic */ Object $appContext$inlined;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ StorageModule$special$$inlined$provider$2(Object obj, int i) {
        this.$r8$classId = i;
        this.$appContext$inlined = obj;
    }

    @Override // com.bugsnag.android.internal.dag.RunnableProvider
    public final Object invoke() {
        DeviceIdStore.DeviceIds deviceIds;
        String loadDeviceId;
        String str = null;
        LastRunInfo lastRunInfo = null;
        switch (this.$r8$classId) {
            case 0:
                return new SharedPrefMigrator((Context) this.$appContext$inlined);
            case 1:
                DeviceIdStore deviceIdStore = (DeviceIdStore) ((StorageModule$special$$inlined$provider$3) this.$appContext$inlined).get();
                synchronized (deviceIdStore) {
                    deviceIds = deviceIdStore.deviceIds;
                    if (deviceIds == null) {
                        deviceIdStore.persistence = new SimpleActor(deviceIdStore.deviceIdFile, deviceIdStore.deviceIdGenerator, deviceIdStore.logger);
                        deviceIdStore.internalPersistence = new SimpleActor(deviceIdStore.internalDeviceIdFile, deviceIdStore.internalDeviceIdGenerator, deviceIdStore.logger);
                        if (deviceIdStore.generateId) {
                            SimpleActor simpleActor = deviceIdStore.persistence;
                            if (simpleActor == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("persistence");
                                throw null;
                            }
                            loadDeviceId = simpleActor.loadDeviceId(false);
                            if (loadDeviceId == null) {
                                SharedPreferences sharedPreferences = ((SharedPrefMigrator) deviceIdStore.sharedPrefMigrator.get()).prefs;
                                loadDeviceId = sharedPreferences != null ? sharedPreferences.getString("install.iud", null) : null;
                                if (loadDeviceId == null) {
                                    SimpleActor simpleActor2 = deviceIdStore.persistence;
                                    if (simpleActor2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("persistence");
                                        throw null;
                                    }
                                    loadDeviceId = simpleActor2.loadDeviceId(true);
                                }
                            }
                        } else {
                            loadDeviceId = null;
                        }
                        if (deviceIdStore.generateId) {
                            SimpleActor simpleActor3 = deviceIdStore.internalPersistence;
                            if (simpleActor3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("internalPersistence");
                                throw null;
                            }
                            str = simpleActor3.loadDeviceId(true);
                        }
                        if (loadDeviceId != null || str != null) {
                            deviceIdStore.deviceIds = new DeviceIdStore.DeviceIds(loadDeviceId, str);
                        }
                        deviceIds = deviceIdStore.deviceIds;
                    }
                }
                return deviceIds;
            case 2:
                LastRunInfoStore lastRunInfoStore = (LastRunInfoStore) ((StorageModule$special$$inlined$provider$1) this.$appContext$inlined).get();
                ReentrantReadWriteLock.ReadLock readLock = lastRunInfoStore.lock.readLock();
                readLock.lock();
                try {
                    lastRunInfo = lastRunInfoStore.loadImpl();
                } finally {
                    try {
                        readLock.unlock();
                        lastRunInfoStore.persist(new LastRunInfo(0, false, false));
                        return lastRunInfo;
                    } catch (Throwable th) {
                    }
                }
                readLock.unlock();
                lastRunInfoStore.persist(new LastRunInfo(0, false, false));
                return lastRunInfo;
            default:
                try {
                    byte[] unsafeGenerateBuildId = Countries.unsafeGenerateBuildId((ApplicationInfo) this.$appContext$inlined);
                    if (unsafeGenerateBuildId == null) {
                        return null;
                    }
                    StringBuilder sb = new StringBuilder(unsafeGenerateBuildId.length * 2);
                    for (byte b : unsafeGenerateBuildId) {
                        int i = b & 255;
                        if (i < 16) {
                            sb.append('0');
                        }
                        String num = Integer.toString(i, CharsKt.checkRadix(16));
                        num.getClass();
                        sb.append(num);
                    }
                    return sb.toString();
                } catch (Throwable unused) {
                    return null;
                }
        }
    }
}
