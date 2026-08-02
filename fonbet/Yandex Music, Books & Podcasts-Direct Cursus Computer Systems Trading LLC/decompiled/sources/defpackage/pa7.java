package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class pa7 {
    public static final qm3 b = new qm3(1);
    public final HashMap a;

    public pa7(int i) {
        switch (i) {
            case 1:
                this.a = new HashMap();
                break;
            case 2:
                this.a = new HashMap();
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:7:0x0005, B:11:0x001f, B:12:0x0023, B:14:0x0029, B:17:0x0035, B:21:0x0052, B:22:0x0056, B:24:0x005c, B:28:0x0068, B:29:0x006f, B:35:0x004c, B:44:0x001b, B:41:0x0010, B:32:0x003f), top: B:6:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:7:0x0005, B:11:0x001f, B:12:0x0023, B:14:0x0029, B:17:0x0035, B:21:0x0052, B:22:0x0056, B:24:0x005c, B:28:0x0068, B:29:0x006f, B:35:0x004c, B:44:0x001b, B:41:0x0010, B:32:0x003f), top: B:6:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(mlk mlkVar) {
        Set<la> keySet;
        List list;
        if (mlkVar == null) {
            return;
        }
        try {
            if (!bp6.a.contains(mlkVar)) {
                try {
                    keySet = mlkVar.a.keySet();
                    keySet.getClass();
                } catch (Throwable th) {
                    bp6.a(mlkVar, th);
                }
                for (la laVar : keySet) {
                    tlp c = c(laVar);
                    if (c != null) {
                        if (!bp6.a.contains(mlkVar)) {
                            try {
                                laVar.getClass();
                                list = (List) mlkVar.a.get(laVar);
                            } catch (Throwable th2) {
                                bp6.a(mlkVar, th2);
                            }
                            if (list != null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                c.a((ht0) it.next());
                            }
                        }
                        list = null;
                        if (list != null) {
                        }
                    }
                }
            }
            keySet = null;
            while (r0.hasNext()) {
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized int b() {
        int i;
        int size;
        i = 0;
        for (tlp tlpVar : this.a.values()) {
            synchronized (tlpVar) {
                if (!bp6.a.contains(tlpVar)) {
                    try {
                        size = tlpVar.a.size();
                    } catch (Throwable th) {
                        bp6.a(tlpVar, th);
                    }
                }
                size = 0;
            }
            i += size;
        }
        return i;
    }

    public synchronized tlp c(la laVar) {
        tlp tlpVar = (tlp) this.a.get(laVar);
        if (tlpVar == null) {
            Context b2 = j3c.b();
            av1 C = etn.C(b2);
            tlpVar = C != null ? new tlp(C, c3x.F(b2)) : null;
        }
        if (tlpVar == null) {
            return null;
        }
        this.a.put(laVar, tlpVar);
        return tlpVar;
    }

    public synchronized Set d() {
        Set keySet;
        keySet = this.a.keySet();
        keySet.getClass();
        return keySet;
    }
}
