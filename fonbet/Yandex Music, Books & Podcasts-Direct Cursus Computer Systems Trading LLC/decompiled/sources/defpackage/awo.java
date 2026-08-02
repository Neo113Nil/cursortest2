package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class awo extends p9 {
    public long b;
    public long[] c;
    public long[] d;

    public static Serializable G(int i, d7k d7kVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(d7kVar.p()));
        }
        if (i == 1) {
            return Boolean.valueOf(d7kVar.v() == 1);
        }
        if (i == 2) {
            return I(d7kVar);
        }
        if (i != 3) {
            if (i == 8) {
                return H(d7kVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(d7kVar.p()));
                d7kVar.I(2);
                return date;
            }
            int z = d7kVar.z();
            ArrayList arrayList = new ArrayList(z);
            for (int i2 = 0; i2 < z; i2++) {
                Serializable G = G(d7kVar.v(), d7kVar);
                if (G != null) {
                    arrayList.add(G);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String I = I(d7kVar);
            int v = d7kVar.v();
            if (v == 9) {
                return hashMap;
            }
            Serializable G2 = G(v, d7kVar);
            if (G2 != null) {
                hashMap.put(I, G2);
            }
        }
    }

    public static HashMap H(d7k d7kVar) {
        int z = d7kVar.z();
        HashMap hashMap = new HashMap(z);
        for (int i = 0; i < z; i++) {
            String I = I(d7kVar);
            Serializable G = G(d7kVar.v(), d7kVar);
            if (G != null) {
                hashMap.put(I, G);
            }
        }
        return hashMap;
    }

    public static String I(d7k d7kVar) {
        int B = d7kVar.B();
        int i = d7kVar.b;
        d7kVar.I(B);
        return new String(d7kVar.a, i, B);
    }
}
