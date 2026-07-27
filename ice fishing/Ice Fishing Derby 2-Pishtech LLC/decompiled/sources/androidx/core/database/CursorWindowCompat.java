package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import androidx.core.app.Person$$ExternalSyntheticApiModelOutline1;

/* loaded from: classes.dex */
public final class CursorWindowCompat {
    private CursorWindowCompat() {
    }

    public static CursorWindow create(String str, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Person$$ExternalSyntheticApiModelOutline1.m(str, j);
        }
        return new CursorWindow(str);
    }
}
