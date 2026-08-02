package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class yot implements z5e {
    public final Map a;
    public final pn3 b;
    public final String c;
    public final String d;
    public final jyr e;

    public yot(Map map, pn3 pn3Var) {
        map.getClass();
        pn3Var.getClass();
        this.a = map;
        this.b = pn3Var;
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        String uuid = randomUUID.toString();
        uuid.getClass();
        this.c = uuid;
        this.d = "multipart/form-data; boundary=".concat(uuid);
        this.e = btf.b(new ncs(8, this));
    }

    public final void a(gj3 gj3Var) {
        StringBuilder sb = new StringBuilder("--");
        String str = this.c;
        sb.append(str);
        sb.append("\r\n");
        gj3Var.M(sb.toString());
        gj3Var.M("Content-Disposition: form-data; name=\"operations\"\r\n");
        gj3Var.M("Content-Type: application/json\r\n");
        StringBuilder sb2 = new StringBuilder("Content-Length: ");
        pn3 pn3Var = this.b;
        sb2.append(pn3Var.d());
        sb2.append("\r\n");
        gj3Var.M(sb2.toString());
        gj3Var.M("\r\n");
        gj3Var.W(pn3Var);
        hi3 hi3Var = new hi3();
        hj3 hj3Var = new hj3(hi3Var);
        Map map = this.a;
        Set entrySet = map.entrySet();
        ArrayList arrayList = new ArrayList(v75.o(entrySet, 10));
        int i = 0;
        for (Object obj : entrySet) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            arrayList.add(new Pair(String.valueOf(i), t75.c(((Map.Entry) obj).getKey())));
            i = i2;
        }
        irf.V(hj3Var, uah.n(arrayList));
        pn3 g0 = hi3Var.g0(hi3Var.b);
        gj3Var.M("\r\n--" + str + "\r\n");
        gj3Var.M("Content-Disposition: form-data; name=\"map\"\r\n");
        gj3Var.M("Content-Type: application/json\r\n");
        gj3Var.M("Content-Length: " + g0.d() + "\r\n");
        gj3Var.M("\r\n");
        gj3Var.W(g0);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            gj3Var.M("\r\n--" + str + "--\r\n");
            return;
        }
        if (it.next() != null) {
            l1j.f();
            return;
        }
        gj3Var.M("\r\n--" + str + "\r\n");
        gj3Var.M("Content-Disposition: form-data; name=\"0\"");
        throw null;
    }

    @Override // defpackage.z5e
    public final void g(gj3 gj3Var) {
        a(gj3Var);
    }

    @Override // defpackage.z5e
    public final long getContentLength() {
        return ((Number) this.e.getValue()).longValue();
    }

    @Override // defpackage.z5e
    public final String getContentType() {
        return this.d;
    }
}
