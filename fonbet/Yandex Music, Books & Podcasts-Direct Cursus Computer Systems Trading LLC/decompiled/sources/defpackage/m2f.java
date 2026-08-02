package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes5.dex */
public final class m2f implements ikp {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final String c;

    public m2f(String str) {
        this.c = str;
    }

    @Override // defpackage.ikp
    public final void serviceAdded(ckp ckpVar) {
        synchronized (this) {
            try {
                fkp fkpVar = ((dkp) ckpVar).c;
                if (fkpVar == null || !fkpVar.j()) {
                    this.a.put(((dkp) ckpVar).b, ((p2f) ((j2f) ((dkp) ckpVar).getSource())).R0(((dkp) ckpVar).a, ((dkp) ckpVar).b, fkpVar != null ? fkpVar.g() : "", true));
                } else {
                    this.a.put(((dkp) ckpVar).b, fkpVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ikp
    public final void serviceRemoved(ckp ckpVar) {
        synchronized (this) {
            this.a.remove(((dkp) ckpVar).b);
            this.b.remove(((dkp) ckpVar).b);
        }
    }

    @Override // defpackage.ikp
    public final void serviceResolved(ckp ckpVar) {
        synchronized (this) {
            this.a.put(((dkp) ckpVar).b, ((dkp) ckpVar).c);
            this.b.remove(((dkp) ckpVar).b);
        }
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("\n\tType: ");
        stringBuffer.append(this.c);
        ConcurrentHashMap concurrentHashMap = this.a;
        if (concurrentHashMap.isEmpty()) {
            stringBuffer.append("\n\tNo services collected.");
        } else {
            stringBuffer.append("\n\tServices");
            for (String str : concurrentHashMap.keySet()) {
                stringBuffer.append("\n\t\tService: ");
                stringBuffer.append(str);
                stringBuffer.append(": ");
                stringBuffer.append(concurrentHashMap.get(str));
            }
        }
        ConcurrentHashMap concurrentHashMap2 = this.b;
        if (concurrentHashMap2.isEmpty()) {
            stringBuffer.append("\n\tNo event queued.");
        } else {
            stringBuffer.append("\n\tEvents");
            for (String str2 : concurrentHashMap2.keySet()) {
                stringBuffer.append("\n\t\tEvent: ");
                stringBuffer.append(str2);
                stringBuffer.append(": ");
                stringBuffer.append(concurrentHashMap2.get(str2));
            }
        }
        return stringBuffer.toString();
    }
}
