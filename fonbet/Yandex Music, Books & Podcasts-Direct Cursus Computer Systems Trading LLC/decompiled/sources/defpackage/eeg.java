package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class eeg {
    public static final Logger c;
    public static eeg d;
    public static final List e;
    public final LinkedHashSet a = new LinkedHashSet();
    public final LinkedHashMap b = new LinkedHashMap();

    static {
        Logger logger = Logger.getLogger(eeg.class.getName());
        c = logger;
        ArrayList arrayList = new ArrayList();
        try {
            boolean z = csk.a;
            arrayList.add(csk.class);
        } catch (ClassNotFoundException e2) {
            logger.log(Level.WARNING, "Unable to find pick-first LoadBalancer", (Throwable) e2);
        }
        try {
            arrayList.add(v8p.class);
        } catch (ClassNotFoundException e3) {
            logger.log(Level.FINE, "Unable to find round-robin LoadBalancer", (Throwable) e3);
        }
        e = Collections.unmodifiableList(arrayList);
    }

    public static synchronized eeg a() {
        eeg eegVar;
        synchronized (eeg.class) {
            try {
                if (d == null) {
                    List<deg> D = wxf.D(deg.class, e, deg.class.getClassLoader(), new e3s(26));
                    d = new eeg();
                    for (deg degVar : D) {
                        c.fine("Service loader found " + degVar);
                        eeg eegVar2 = d;
                        synchronized (eegVar2) {
                            degVar.getClass();
                            eegVar2.a.add(degVar);
                        }
                    }
                    d.c();
                }
                eegVar = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eegVar;
    }

    public final synchronized deg b(String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = this.b;
        o2g.O(str, "policy");
        return (deg) linkedHashMap.get(str);
    }

    public final synchronized void c() {
        this.b.clear();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            deg degVar = (deg) it.next();
            String a = degVar.a();
            if (((deg) this.b.get(a)) == null) {
                this.b.put(a, degVar);
            }
        }
    }
}
