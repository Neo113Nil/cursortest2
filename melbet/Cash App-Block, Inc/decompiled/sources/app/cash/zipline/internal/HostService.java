package app.cash.zipline.internal;

import app.cash.zipline.ZiplineService;

/* loaded from: classes3.dex */
public interface HostService extends EndpointService, ZiplineService {
    void clearTimeout(int i);

    void log(String str, String str2, Throwable th);

    void serviceLeaked(String str);

    void setTimeout(int i, int i2);
}
