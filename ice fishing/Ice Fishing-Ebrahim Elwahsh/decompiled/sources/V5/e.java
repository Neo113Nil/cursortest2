package V5;

import com.onesignal.common.j;
import com.onesignal.common.modeling.l;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e extends l {

    public static final class a extends i implements E7.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // E7.a
        public final d invoke() {
            return new d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(F4.b prefs) {
        super(a.INSTANCE, "subscriptions", prefs);
        h.e(prefs, "prefs");
    }

    @Override // com.onesignal.common.modeling.k, com.onesignal.common.modeling.c
    public void replaceAll(List<d> models, String tag) {
        h.e(models, "models");
        h.e(tag, "tag");
        if (!tag.equals("HYDRATE")) {
            super.replaceAll(models, tag);
            return;
        }
        synchronized (models) {
            try {
                Iterator<d> it = models.iterator();
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
                super.replaceAll(models, tag);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.onesignal.common.modeling.k
    public JSONObject transformJsonForPersistence(d model, JSONObject json) {
        h.e(model, "model");
        h.e(json, "json");
        String optString = json.optString("type", "");
        h.b(optString);
        if (optString.length() != 0 && !optString.equals(g.PUSH.toString())) {
            String optString2 = json.optString("address", "");
            h.b(optString2);
            if (optString2.length() > 0) {
                j jVar = j.INSTANCE;
                if (!jVar.isHashed(optString2)) {
                    json.put("address", jVar.hash(optString2));
                }
            }
        }
        return json;
    }
}
