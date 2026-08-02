package io.appmetrica.analytics.coreutils.internal.io;

import android.database.Cursor;
import java.io.Closeable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0004\u001a\u00020\u0003*\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/io/CloseableUtils;", "", "Ljava/io/Closeable;", "Lzy11;", "closeSafely", "(Ljava/io/Closeable;)V", "Landroid/database/Cursor;", "(Landroid/database/Cursor;)V", "core-utils_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class CloseableUtils {
    public static final CloseableUtils INSTANCE = new CloseableUtils();

    private CloseableUtils() {
    }

    public static final void closeSafely(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static final void closeSafely(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Throwable unused) {
            }
        }
    }
}
