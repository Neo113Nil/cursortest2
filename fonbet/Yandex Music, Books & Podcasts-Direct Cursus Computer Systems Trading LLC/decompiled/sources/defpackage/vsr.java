package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public interface vsr extends Closeable {
    String getDatabaseName();

    rsr getReadableDatabase();

    rsr getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z);
}
