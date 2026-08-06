package defpackage;

/* loaded from: classes.dex */
public final class pu {
    public final java.util.concurrent.locks.ReentrantLock IHQe1A4L2xu;
    public final defpackage.F7NU4MC0GW oh6vYeIP;
    public static final defpackage.ad1 r1MBDhnF = new defpackage.ad1(28);
    public static final java.util.LinkedHashMap F7NU4MC0GW = new java.util.LinkedHashMap();

    public pu(java.lang.String str, boolean z) {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        synchronized (r1MBDhnF) {
            try {
                java.util.LinkedHashMap linkedHashMap = F7NU4MC0GW;
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
        this.IHQe1A4L2xu = reentrantLock;
        this.oh6vYeIP = z ? new defpackage.F7NU4MC0GW(str) : null;
    }
}
