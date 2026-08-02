package androidx.room.concurrent;

import coil3.svg.internal.AndroidSvg;
import com.android.volley.toolbox.HurlStack;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public final class ExclusiveLock {
    public static final HurlStack Companion = new HurlStack(16);
    public static final LinkedHashMap threadLocksMap = new LinkedHashMap();
    public final AndroidSvg fileLock;
    public final ReentrantLock threadLock;

    public ExclusiveLock(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (Companion) {
            try {
                LinkedHashMap linkedHashMap = threadLocksMap;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.threadLock = reentrantLock;
        this.fileLock = z ? new AndroidSvg(str, 12) : null;
    }
}
