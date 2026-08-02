package defpackage;

import android.util.LruCache;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class ax {
    public final jyr a;
    public final ReentrantLock b = new ReentrantLock();
    public final LruCache c = new LruCache(10);

    public ax(jyr jyrVar) {
        this.a = jyrVar;
    }
}
