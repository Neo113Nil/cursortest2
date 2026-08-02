package ru.cprocsp.ACSP.tools.config;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import ru.cprocsp.ACSP.tools.log.LogConstants;

/* loaded from: classes4.dex */
public class DeviceCache {
    private final File cacheDirectory;
    String DEVICE_CACHE = "devices.prop";
    private final Map<String, String> cachedKeyDeviceMap = new ConcurrentHashMap();

    public DeviceCache(Context context) {
        this.cacheDirectory = context.getFilesDir();
    }

    public void cache(Map<String, String> map) {
        synchronized (DeviceCache.class) {
            try {
                if (!this.cacheDirectory.exists() && !this.cacheDirectory.mkdirs()) {
                    this.cacheDirectory.getAbsolutePath();
                    return;
                }
                File file = new File(this.cacheDirectory, this.DEVICE_CACHE);
                if (!file.exists()) {
                    try {
                        Properties properties = new Properties();
                        properties.putAll(map);
                        properties.store(new FileOutputStream(file), (String) null);
                    } catch (Exception e) {
                        Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean clearCache() {
        boolean delete;
        synchronized (DeviceCache.class) {
            this.cachedKeyDeviceMap.clear();
            delete = new File(this.cacheDirectory, this.DEVICE_CACHE).delete();
        }
        return delete;
    }

    public Map<String, String> getCache() {
        synchronized (DeviceCache.class) {
            if (this.cachedKeyDeviceMap.isEmpty()) {
                File file = new File(this.cacheDirectory, this.DEVICE_CACHE);
                if (file.exists()) {
                    try {
                        Properties properties = new Properties();
                        properties.load(new FileInputStream(file));
                        for (Map.Entry entry : properties.entrySet()) {
                            this.cachedKeyDeviceMap.put((String) entry.getKey(), (String) entry.getValue());
                        }
                    } catch (Exception e) {
                        Log.e(LogConstants.APP_LOGGER_TAG, e.getMessage(), e);
                    }
                }
            }
        }
        return Collections.unmodifiableMap(this.cachedKeyDeviceMap);
    }

    public String getValue(String str) {
        return this.cachedKeyDeviceMap.get(str);
    }
}
