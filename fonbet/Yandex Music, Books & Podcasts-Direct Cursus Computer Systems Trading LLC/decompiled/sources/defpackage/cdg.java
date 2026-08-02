package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import javax.jmdns.impl.a;

/* loaded from: classes5.dex */
public final class cdg extends edg {
    public static final Logger d = Logger.getLogger(cdg.class.getName());
    public final ConcurrentHashMap c;

    public cdg(ikp ikpVar, boolean z) {
        super(ikpVar, z);
        this.c = new ConcurrentHashMap(32);
    }

    public final void a(ckp ckpVar) {
        StringBuilder sb = new StringBuilder();
        dkp dkpVar = (dkp) ckpVar;
        sb.append(dkpVar.b);
        sb.append(".");
        sb.append(dkpVar.a);
        String sb2 = sb.toString();
        fkp fkpVar = dkpVar.c;
        if (this.c.putIfAbsent(sb2, ((a) fkpVar).clone()) != null) {
            d.finer("Service Added called for a service already added: " + ckpVar);
            return;
        }
        ikp ikpVar = (ikp) this.a;
        ikpVar.serviceAdded(ckpVar);
        if (fkpVar == null || !fkpVar.j()) {
            return;
        }
        ikpVar.serviceResolved(ckpVar);
    }

    public final void b(ckp ckpVar) {
        StringBuilder sb = new StringBuilder();
        dkp dkpVar = (dkp) ckpVar;
        sb.append(dkpVar.b);
        sb.append(".");
        sb.append(dkpVar.a);
        String sb2 = sb.toString();
        ConcurrentHashMap concurrentHashMap = this.c;
        if (concurrentHashMap.remove(sb2, concurrentHashMap.get(sb2))) {
            ((ikp) this.a).serviceRemoved(ckpVar);
            return;
        }
        d.finer("Service Removed called for a service already removed: " + ckpVar);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(2048);
        sb.append("[Status for ");
        sb.append(((ikp) this.a).toString());
        ConcurrentHashMap concurrentHashMap = this.c;
        if (concurrentHashMap.isEmpty()) {
            sb.append(" no type event ");
        } else {
            sb.append(" (");
            Iterator it = concurrentHashMap.keySet().iterator();
            while (it.hasNext()) {
                sb.append(((String) it.next()) + ", ");
            }
            sb.append(") ");
        }
        sb.append("]");
        return sb.toString();
    }
}
