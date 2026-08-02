package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class kvs {
    public final ReentrantLock a = new ReentrantLock();
    public final LinkedHashMap b = new LinkedHashMap();

    public final void a(zvs zvsVar) {
        LinkedHashMap linkedHashMap = this.b;
        zvsVar.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Integer num = (Integer) linkedHashMap.get(zvsVar);
            if (num == null) {
                reentrantLock.unlock();
                return;
            }
            int intValue = num.intValue();
            if (intValue == 1) {
                linkedHashMap.remove(zvsVar);
            } else if (intValue > 1) {
                linkedHashMap.put(zvsVar, Integer.valueOf(intValue - 1));
            } else {
                ssg.a(7, "TrackDownloaderWatcher", "Illegal value counter = " + intValue + ", downloadedTracksSet=" + linkedHashMap, null);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(zvs zvsVar) {
        zvsVar.getClass();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            LinkedHashMap linkedHashMap = this.b;
            Integer num = (Integer) linkedHashMap.get(zvsVar);
            linkedHashMap.put(zvsVar, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
