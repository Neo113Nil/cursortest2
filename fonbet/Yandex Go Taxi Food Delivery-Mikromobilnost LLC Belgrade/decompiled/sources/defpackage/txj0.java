package defpackage;

import android.database.Cursor;
import java.io.Closeable;

/* loaded from: classes15.dex */
public final class txj0 implements Closeable {
    public final Cursor a;

    public txj0(Cursor cursor) {
        this.a = cursor;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Cursor cursor = this.a;
        if (cursor.isClosed()) {
            return;
        }
        cursor.close();
    }
}
