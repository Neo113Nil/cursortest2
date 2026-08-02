package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.network.entities.models.https.request.HttpsMethod;

/* loaded from: classes4.dex */
public final class wwu {
    public final HttpsMethod a;
    public final e2b1 b;
    public Object f;
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();
    public final ArrayList g = new ArrayList();

    public wwu(HttpsMethod httpsMethod, e2b1 e2b1Var) {
        this.a = httpsMethod;
        this.b = e2b1Var;
    }

    public final void a(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.e.put((String) entry.getKey(), Collections.singletonList((String) entry.getValue()));
        }
    }

    public final void b(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.c.put((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public final xwu c() {
        return new xwu(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwu)) {
            return false;
        }
        wwu wwuVar = (wwu) obj;
        return this.a == wwuVar.a && this.b.equals(wwuVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Builder(method=" + this.a + ", url=" + this.b + Extension.C_BRAKE;
    }
}
