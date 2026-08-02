package app.cash.zipline.internal.bridge;

import app.cash.zipline.ZiplineService;

/* loaded from: classes3.dex */
public interface SuspendCallback extends ZiplineService {
    void failure(Throwable th);

    void success(Object obj);
}
