package app.cash.sqldelight.driver.android;

import android.util.LruCache;

/* loaded from: classes.dex */
public final class AndroidSqliteDriver$statements$1 extends LruCache {
    @Override // android.util.LruCache
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        AndroidStatement androidStatement = (AndroidStatement) obj2;
        androidStatement.getClass();
        if (z) {
            androidStatement.close();
        }
    }
}
