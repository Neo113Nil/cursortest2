package defpackage;

import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class u80 {
    public static final ReentrantReadWriteLock a = new ReentrantReadWriteLock();
    public static String b;
    public static volatile boolean c;

    public static void a() {
        if (c) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = a;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!c) {
                b = PreferenceManager.getDefaultSharedPreferences(j3c.b()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
                c = true;
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            a.writeLock().unlock();
            throw th;
        }
    }
}
