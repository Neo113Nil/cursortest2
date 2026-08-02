package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes11.dex */
public abstract class rza1 {
    public static final Rect a(Rect rect) {
        return new Rect(rect);
    }

    public static byte[] b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            if (bArr == bArr2) {
                return true;
            }
            int length = bArr.length < bArr2.length ? bArr.length : bArr2.length;
            int length2 = bArr.length ^ bArr2.length;
            for (int i = 0; i != length; i++) {
                length2 |= bArr[i] ^ bArr2[i];
            }
            while (length < bArr2.length) {
                byte b = bArr2[length];
                length2 |= b ^ (~b);
                length++;
            }
            if (length2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] d(int i, byte[] bArr) {
        int i2 = i - 1;
        if (i2 < 0) {
            ny61.g(oyr.i(i, "1 > "));
            return null;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 1, bArr2, 0, Math.min(bArr.length - 1, i2));
        return bArr2;
    }

    public static int e(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public static final List f(ull0 ull0Var) {
        int k = eja1.k(ull0Var, "id");
        int k2 = eja1.k(ull0Var, "seq");
        int k3 = eja1.k(ull0Var, "from");
        int k4 = eja1.k(ull0Var, "to");
        ListBuilder a = rcc.a();
        while (ull0Var.q()) {
            a.add(new v2s((int) ull0Var.getLong(k), (int) ull0Var.getLong(k2), ull0Var.Y1(k3), ull0Var.Y1(k4)));
        }
        return a.w0(a.j());
    }

    public static final r5x0 g(oll0 oll0Var, String str, boolean z) {
        ull0 T0 = oll0Var.T0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int k = eja1.k(T0, "seqno");
            int k2 = eja1.k(T0, "cid");
            int k3 = eja1.k(T0, "name");
            int k4 = eja1.k(T0, "desc");
            if (k != -1 && k2 != -1 && k3 != -1 && k4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (T0.q()) {
                    if (((int) T0.getLong(k2)) >= 0) {
                        int i = (int) T0.getLong(k);
                        String Y1 = T0.Y1(k3);
                        String str2 = T0.getLong(k4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), Y1);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List x0 = a.x0(linkedHashMap.entrySet(), new uom0());
                ArrayList arrayList = new ArrayList(tcc.n(x0, 10));
                Iterator it = x0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List J0 = a.J0(arrayList);
                List x02 = a.x0(linkedHashMap2.entrySet(), new vom0());
                ArrayList arrayList2 = new ArrayList(tcc.n(x02, 10));
                Iterator it2 = x02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                r5x0 r5x0Var = new r5x0(str, z, J0, a.J0(arrayList2));
                gwk0.m(T0, null);
                return r5x0Var;
            }
            gwk0.m(T0, null);
            return null;
        } finally {
        }
    }
}
