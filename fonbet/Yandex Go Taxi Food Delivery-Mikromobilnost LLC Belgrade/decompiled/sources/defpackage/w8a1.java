package defpackage;

import android.util.Base64;
import androidx.compose.ui.platform.j;
import java.util.ArrayList;
import java.util.List;
import yads.cs1;
import yads.ib2;
import yads.yk3;

/* loaded from: classes11.dex */
public abstract class w8a1 {
    public static final jer a = new jer(0, 0);
    public static au2 b;

    public static final void a(qor qorVar, up2 up2Var, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1145133213);
        int i2 = (btsVar.k(qorVar) ? 4 : 2) | i | (btsVar.k(up2Var) ? 32 : 16) | (btsVar.k(f530Var) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            long n = tje.n(up2Var, btsVar);
            boolean d = btsVar.d(n) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (d || Q == did.a) {
                Q = new j5y(n, qorVar, 5);
                btsVar.o0(Q);
            }
            qeb1.a((i2 >> 6) & 14, btsVar, (tls) Q, f530Var);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240(qorVar, up2Var, f530Var, i, 28);
        }
    }

    public static jer b(int i, int i2, int i3) {
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return new jer(i, i2);
    }

    public static aj31 c(dl81 dl81Var, boolean z, boolean z2) {
        if (z) {
            e(3, dl81Var, false);
        }
        dl81Var.b((int) dl81Var.l(), md81.c);
        long l = dl81Var.l();
        String[] strArr = new String[(int) l];
        for (int i = 0; i < l; i++) {
            strArr[i] = dl81Var.b((int) dl81Var.l(), md81.c);
        }
        if (!z2 || (dl81Var.s() & 1) != 0) {
            return new aj31(22, strArr);
        }
        dy31.g(null, "framing bit expected to be set");
        return null;
    }

    public static cs1 d(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            int i2 = rf71.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                nba1.e();
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    dl81 dl81Var = new dl81(Base64.decode(split[1], 0));
                    int a2 = dl81Var.a();
                    String b2 = dl81Var.b(dl81Var.a(), md81.a);
                    String b3 = dl81Var.b(dl81Var.a(), md81.c);
                    int a3 = dl81Var.a();
                    int a4 = dl81Var.a();
                    int a5 = dl81Var.a();
                    int a6 = dl81Var.a();
                    int a7 = dl81Var.a();
                    byte[] bArr = new byte[a7];
                    dl81Var.d(0, a7, bArr);
                    arrayList.add(new ib2(a2, b2, b3, a3, a4, a5, a6, bArr));
                } catch (RuntimeException e) {
                    nba1.b("Failed to parse vorbis picture", e);
                    nba1.e();
                }
            } else {
                arrayList.add(new yk3(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new cs1(arrayList);
    }

    public static boolean e(int i, dl81 dl81Var, boolean z) {
        if (dl81Var.c - dl81Var.b < 7) {
            if (!z) {
                su71.b(dl81Var.c - dl81Var.b, "too short header: ");
                return false;
            }
        } else if (dl81Var.s() != i) {
            if (!z) {
                dy31.g(null, oyr.r(new StringBuilder("expected header type "), i));
                return false;
            }
        } else {
            if (dl81Var.s() == 118 && dl81Var.s() == 111 && dl81Var.s() == 114 && dl81Var.s() == 98 && dl81Var.s() == 105 && dl81Var.s() == 115) {
                return true;
            }
            if (!z) {
                dy31.g(null, "expected characters 'vorbis'");
                return false;
            }
        }
        return false;
    }

    public static final j2w f(p651 p651Var, fid fidVar) {
        return new j2w(p651Var, (fwi) ((bts) fidVar).m(j.h));
    }
}
