package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class bw {
    public final java.util.concurrent.locks.ReentrantLock ZpBGe2uQfcn8;
    public final defpackage.n80 giKS3J6vZuNy;
    public static final defpackage.hu fWTAfUmVKrZq = new defpackage.hu(2);
    public static final java.util.LinkedHashMap JhCgjQRTAOCT = new java.util.LinkedHashMap();

    public bw(java.lang.String str, boolean z) {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        synchronized (fWTAfUmVKrZq) {
            try {
                java.util.LinkedHashMap linkedHashMap = JhCgjQRTAOCT;
                java.lang.Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new java.util.concurrent.locks.ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (java.util.concurrent.locks.ReentrantLock) obj;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        this.ZpBGe2uQfcn8 = reentrantLock;
        this.giKS3J6vZuNy = z ? new defpackage.n80(str) : null;
    }
}
