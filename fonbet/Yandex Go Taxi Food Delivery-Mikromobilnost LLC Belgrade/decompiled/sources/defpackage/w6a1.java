package defpackage;

import com.google.android.gms.internal.fido.zzcj;
import com.google.android.gms.internal.fido.zzhf;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public final class w6a1 extends s7a1 {
    public final int a;
    public final zzcj b;

    public w6a1(zzcj zzcjVar) {
        zzcjVar.getClass();
        this.b = zzcjVar;
        z591 g = zzcjVar.entrySet().g();
        int i = 0;
        while (g.hasNext()) {
            Map.Entry entry = (Map.Entry) g.next();
            int b = ((s7a1) entry.getKey()).b();
            i = i < b ? b : i;
            int b2 = ((s7a1) entry.getValue()).b();
            if (i < b2) {
                i = b2;
            }
        }
        int i2 = i + 1;
        this.a = i2;
        if (i2 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.s7a1
    public final int a() {
        return s7a1.d((byte) -96);
    }

    @Override // defpackage.s7a1
    public final int b() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compareTo;
        s7a1 s7a1Var = (s7a1) obj;
        int a = s7a1Var.a();
        int d = s7a1.d((byte) -96);
        if (d != a) {
            return d - s7a1Var.a();
        }
        zzcj zzcjVar = ((w6a1) s7a1Var).b;
        zzcj zzcjVar2 = this.b;
        if (zzcjVar2.w.size() != zzcjVar.w.size()) {
            return zzcjVar2.w.size() - zzcjVar.w.size();
        }
        z591 g = zzcjVar2.entrySet().g();
        z591 g2 = zzcjVar.entrySet().g();
        do {
            if (!g.hasNext() && !g2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) g.next();
            Map.Entry entry2 = (Map.Entry) g2.next();
            int compareTo2 = ((s7a1) entry.getKey()).compareTo((s7a1) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((s7a1) entry.getValue()).compareTo((s7a1) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w6a1.class == obj.getClass()) {
            return this.b.equals(((w6a1) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(s7a1.d((byte) -96)), this.b});
    }

    public final String toString() {
        zzcj zzcjVar = this.b;
        if (zzcjVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        z591 g = zzcjVar.entrySet().g();
        while (g.hasNext()) {
            Map.Entry entry = (Map.Entry) g.next();
            linkedHashMap.put(((s7a1) entry.getKey()).toString().replace("\n", "\n  "), ((s7a1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        jzz jzzVar = new jzz();
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            bqa1.d(sb, linkedHashMap.entrySet().iterator(), jzzVar);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            ny61.f(e);
            return null;
        }
    }
}
