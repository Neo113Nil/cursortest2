package o5;

import android.database.Cursor;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: o5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C4805b {
    public static void close(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
