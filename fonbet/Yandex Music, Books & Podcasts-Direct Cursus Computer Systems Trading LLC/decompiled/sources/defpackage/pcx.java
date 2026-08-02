package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class pcx extends wcx {
    public final int a;
    public final z5x b;

    public pcx(z5x z5xVar) {
        z5xVar.getClass();
        this.b = z5xVar;
        xkt o = z5xVar.entrySet().o();
        int i = 0;
        while (o.hasNext()) {
            Map.Entry entry = (Map.Entry) o.next();
            int b = ((wcx) entry.getKey()).b();
            i = i < b ? b : i;
            int b2 = ((wcx) entry.getValue()).b();
            if (i < b2) {
                i = b2;
            }
        }
        int i2 = i + 1;
        this.a = i2;
        if (i2 > 8) {
            throw new pg5("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.wcx
    public final int a() {
        return wcx.d((byte) -96);
    }

    @Override // defpackage.wcx
    public final int b() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compareTo;
        wcx wcxVar = (wcx) obj;
        int a = wcxVar.a();
        int d = wcx.d((byte) -96);
        if (d != a) {
            return d - wcxVar.a();
        }
        z5x z5xVar = ((pcx) wcxVar).b;
        z5x z5xVar2 = this.b;
        if (z5xVar2.d.size() != z5xVar.d.size()) {
            return z5xVar2.d.size() - z5xVar.d.size();
        }
        xkt o = z5xVar2.entrySet().o();
        xkt o2 = z5xVar.entrySet().o();
        do {
            if (!o.hasNext() && !o2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) o.next();
            Map.Entry entry2 = (Map.Entry) o2.next();
            int compareTo2 = ((wcx) entry.getKey()).compareTo((wcx) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((wcx) entry.getValue()).compareTo((wcx) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pcx.class == obj.getClass()) {
            return this.b.equals(((pcx) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(wcx.d((byte) -96)), this.b});
    }

    public final String toString() {
        z5x z5xVar = this.b;
        if (z5xVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        xkt o = z5xVar.entrySet().o();
        while (o.hasNext()) {
            Map.Entry entry = (Map.Entry) o.next();
            linkedHashMap.put(((wcx) entry.getKey()).toString().replace(StringUtil.LF, "\n  "), ((wcx) entry.getValue()).toString().replace(StringUtil.LF, "\n  "));
        }
        wfl wflVar = new wfl();
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            dag.J(sb, linkedHashMap.entrySet().iterator(), wflVar);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            xq0.w(e);
            return null;
        }
    }
}
