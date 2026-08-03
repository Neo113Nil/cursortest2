package ob;

import bc.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c {
    private final qb.b _fallbackPushSub;
    private final List<qb.e> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends qb.e> list, qb.b bVar) {
        j.e(list, "collection");
        j.e(bVar, "_fallbackPushSub");
        this.collection = list;
        this._fallbackPushSub = bVar;
    }

    public final qb.a getByEmail(String str) {
        Object obj;
        j.e(str, "email");
        Iterator<T> it = getEmails().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (j.a(((qb.a) obj).getEmail(), str)) {
                break;
            }
        }
        return (qb.a) obj;
    }

    public final qb.d getBySMS(String str) {
        Object obj;
        j.e(str, "sms");
        Iterator<T> it = getSmss().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (j.a(((qb.d) obj).getNumber(), str)) {
                break;
            }
        }
        return (qb.d) obj;
    }

    public final List<qb.e> getCollection() {
        return this.collection;
    }

    public final List<qb.a> getEmails() {
        List<qb.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof qb.a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final qb.b getPush() {
        List<qb.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof qb.b) {
                arrayList.add(obj);
            }
        }
        qb.b bVar = (qb.b) m.U(arrayList);
        return bVar == null ? this._fallbackPushSub : bVar;
    }

    public final List<qb.d> getSmss() {
        List<qb.e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof qb.d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
