package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import java.io.File;
import java.util.UUID;

/* loaded from: classes.dex */
public final class SessionStore extends FileStore {
    public final String apiKey;

    public SessionStore(File file, int i, String str, Logger logger) {
        super(new File(file, "sessions"), i, logger, null);
        this.apiKey = str;
    }

    @Override // com.bugsnag.android.FileStore
    public final String getFilename(JsonStream.Streamable streamable) {
        String str = streamable instanceof Session ? ((Session) streamable).apiKey : this.apiKey;
        long currentTimeMillis = System.currentTimeMillis();
        return str + '_' + UUID.randomUUID().toString() + currentTimeMillis + "_v3.json";
    }
}
