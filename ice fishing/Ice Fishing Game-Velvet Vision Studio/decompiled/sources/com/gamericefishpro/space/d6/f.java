package com.gamericefishpro.space.d6;

import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public interface f extends Closeable {
    b L();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
