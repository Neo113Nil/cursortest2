package ob;

import com.onesignal.common.modeling.l;
import java.util.Iterator;
import java.util.List;
import pc.j;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class e extends l {

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends k implements oc.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // oc.a
        public final d invoke() {
            return new d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c9.b bVar) {
        super(a.INSTANCE, "subscriptions", bVar);
        j.e(bVar, "prefs");
    }

    @Override // com.onesignal.common.modeling.k, com.onesignal.common.modeling.c
    public void replaceAll(List<d> list, String str) {
        j.e(list, "models");
        j.e(str, "tag");
        if (!str.equals("HYDRATE")) {
            super.replaceAll(list, str);
            return;
        }
        synchronized (list) {
            try {
                Iterator<d> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    d next = it.next();
                    if (next.getType() == g.PUSH) {
                        d dVar = (d) get(next.getId());
                        if (dVar != null) {
                            next.setSdk(dVar.getSdk());
                            next.setDeviceOS(dVar.getDeviceOS());
                            next.setCarrier(dVar.getCarrier());
                            next.setAppVersion(dVar.getAppVersion());
                            next.setStatus(dVar.getStatus());
                        }
                    }
                }
                super.replaceAll(list, str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
