package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class ig {
    public static final re MdtA4re8 = new re(17);
    public static final LinkedHashMap wxUZMvaN = new LinkedHashMap();
    public final mcXgUFR8 NCTxEWno;
    public final ReentrantLock qoPGr6Ce;

    public ig(String str, boolean z) {
        ReentrantLock reentrantLock;
        synchronized (MdtA4re8) {
            try {
                LinkedHashMap linkedHashMap = wxUZMvaN;
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
        this.qoPGr6Ce = reentrantLock;
        this.NCTxEWno = z ? new mcXgUFR8(str) : null;
    }
}
