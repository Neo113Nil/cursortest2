package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material3.h;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.div.core.view2.Div2View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import org.json.JSONObject;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class vi91 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(sls slsVar, f530 f530Var, boolean z, g4v g4vVar, zx40 zx40Var, ehr0 ehr0Var, wls wlsVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        g4v g4vVar2;
        int i5;
        zx40 zx40Var2;
        wls wlsVar2;
        bts btsVar;
        f530 f530Var3;
        zx40 zx40Var3;
        boolean z2;
        ehr0 ehr0Var2;
        aii0 v;
        int i6;
        g4v g4vVar3;
        int i7;
        f530 f530Var4;
        g4v g4vVar4;
        ehr0 b;
        boolean z3;
        int i8;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1413012038);
        if ((i & 6) == 0) {
            i3 = (btsVar2.e(slsVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 32 : 16;
            i4 = i3 | 384;
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
                if ((i2 & 8) == 0) {
                    g4vVar2 = g4vVar;
                    if (btsVar2.k(g4vVar2)) {
                        i8 = 2048;
                        i4 |= i8;
                    }
                } else {
                    g4vVar2 = g4vVar;
                }
                i8 = 1024;
                i4 |= i8;
            } else {
                g4vVar2 = g4vVar;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i4 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                zx40Var2 = zx40Var;
                i4 |= btsVar2.k(zx40Var2) ? 16384 : 8192;
                if ((196608 & i) == 0) {
                    i4 |= 65536;
                }
                if ((1572864 & i) == 0) {
                    wlsVar2 = wlsVar;
                    i4 |= btsVar2.e(wlsVar2) ? 1048576 : 524288;
                } else {
                    wlsVar2 = wlsVar;
                }
                if (btsVar2.V(i4 & 1, (599187 & i4) != 599186)) {
                    btsVar2.a0();
                    if ((i & 1) == 0 || btsVar2.C()) {
                        f530 f530Var5 = i9 != 0 ? c530.a : f530Var2;
                        if ((i2 & 8) != 0) {
                            int i10 = h4v.a;
                            long j = ((ldc) btsVar2.m(bfe.a)).a;
                            g4vVar3 = h4v.a((agc) btsVar2.m(dgc.a), j);
                            if (ldc.c(g4vVar3.b, j)) {
                                i6 = -458753;
                            } else {
                                i6 = -458753;
                                g4vVar3 = g4vVar3.a(g4vVar3.a, j, g4vVar3.c, ldc.b(j, uzt0.a, 0.0f, 0.0f, 0.0f, 14));
                            }
                            i4 &= -7169;
                        } else {
                            i6 = -458753;
                            g4vVar3 = g4vVar2;
                        }
                        if (i5 != 0) {
                            zx40Var2 = null;
                        }
                        int i11 = h4v.a;
                        i7 = i4 & i6;
                        f530Var4 = f530Var5;
                        g4vVar4 = g4vVar3;
                        b = zir0.b(yws0.a, btsVar2);
                        z3 = true;
                    } else {
                        btsVar2.Y();
                        if ((i2 & 8) != 0) {
                            i4 &= -7169;
                        }
                        i7 = i4 & (-458753);
                        z3 = z;
                        b = ehr0Var;
                        f530Var4 = f530Var2;
                        g4vVar4 = g4vVar2;
                    }
                    zx40 zx40Var4 = zx40Var2;
                    btsVar2.u();
                    int i12 = i7 << 3;
                    btsVar = btsVar2;
                    b(f530Var4, slsVar, z3, b, g4vVar4, zx40Var4, wlsVar2, btsVar, ((i7 >> 3) & 14) | (i12 & 112) | (i7 & 896) | (57344 & i12) | (i12 & ImageMetadata.JPEG_GPS_COORDINATES) | (i7 & 3670016));
                    f530Var3 = f530Var4;
                    z2 = z3;
                    ehr0Var2 = b;
                    g4vVar2 = g4vVar4;
                    zx40Var3 = zx40Var4;
                } else {
                    btsVar = btsVar2;
                    btsVar.Y();
                    f530Var3 = f530Var2;
                    zx40Var3 = zx40Var2;
                    z2 = z;
                    ehr0Var2 = ehr0Var;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new u07(slsVar, f530Var3, z2, g4vVar2, zx40Var3, ehr0Var2, wlsVar, i, i2);
                    return;
                }
                return;
            }
            zx40Var2 = zx40Var;
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if (btsVar2.V(i4 & 1, (599187 & i4) != 599186)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i3 | 384;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) != 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        zx40Var2 = zx40Var;
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (btsVar2.V(i4 & 1, (599187 & i4) != 599186)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void b(f530 f530Var, sls slsVar, boolean z, ehr0 ehr0Var, g4v g4vVar, zx40 zx40Var, wls wlsVar, fid fidVar, int i) {
        int i2;
        zx40 zx40Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1134296466);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(ehr0Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(g4vVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.k(zx40Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar.e(wlsVar) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (btsVar.V(i3 & 1, (599187 & i3) != 599186)) {
            if (zx40Var == null) {
                btsVar.e0(976976045);
                Object Q = btsVar.Q();
                if (Q == did.a) {
                    Q = ly3.i(btsVar);
                }
                zx40Var2 = (zx40) Q;
                btsVar.t(false);
            } else {
                btsVar.e0(862798698);
                btsVar.t(false);
                zx40Var2 = zx40Var;
            }
            bqu bquVar = h.a;
            f530 k = f530Var.k(mi20.a);
            int i4 = h4v.a;
            float f = yws0.b;
            long o = cl91.o(yws0.c + f + f, 40.0f);
            k3r k3rVar = ljs0.a;
            f530 k2 = q791.b(m4m0.b(ymb1.l(ljs0.n(k, c8m.b(o), c8m.a(o)), ehr0Var), z ? g4vVar.a : g4vVar.c, ehr0Var), zx40Var2, esk0.a(7, 0.0f, false), z, null, new awk0(0), slsVar, 8).k(new upb(new teb(20)));
            z910 d = pi6.d(x4c.y, false);
            int S = cma1.S(btsVar);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, k2);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o2);
            wls wlsVar2 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(S))) {
                b64.z(S, btsVar, S, wlsVar2);
            }
            qje.W(btsVar, d.d, d2);
            sb2.b(bfe.a.a(new ldc(z ? g4vVar.b : g4vVar.d)), wlsVar, btsVar, ((i3 >> 15) & 112) | 8);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nub(f530Var, slsVar, z, ehr0Var, g4vVar, zx40Var, wlsVar, i);
        }
    }

    public static final String c(rh0 rh0Var) {
        String str = rh0Var.c;
        String str2 = rh0Var.f;
        if (str2 == null) {
            str2 = "";
        }
        List list = rh0Var.i;
        if (str.length() != 0) {
            String d = d(l(str), str2);
            if (str2.length() <= 0 || cvu0.x(d, str2, false)) {
                return j(k(list), d, str2);
            }
        }
        return str2;
    }

    public static final String d(String str, String str2) {
        if (str2.length() != 0) {
            if (!cvu0.x(str, str2, false)) {
                int i = 0;
                for (int i2 = 0; i2 < str2.length(); i2++) {
                    if (Character.isDigit(str2.charAt(i2))) {
                        i++;
                    }
                }
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = str.charAt(i3);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                return str2.concat(gvu0.r0(i, sb.toString()));
            }
        }
        return str;
    }

    public static final View e(Div2View div2View, String str) {
        List f = f(div2View, str);
        if (f.isEmpty()) {
            return null;
        }
        if (f.size() <= 1) {
            return (View) a.P(f);
        }
        div2View.logError(new RuntimeException("Ambiguous scope id. There are " + f.size() + " divs with id '" + str + '\''));
        return null;
    }

    public static final List f(Div2View div2View, String str) {
        Div2View view = div2View.getView();
        if (str == null) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        g(view, str, arrayList);
        return arrayList;
    }

    public static void g(View view, Object obj, ArrayList arrayList) {
        if (jl40.l(obj, view.getTag())) {
            arrayList.add(view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                g(viewGroup.getChildAt(i), obj, arrayList);
            }
        }
    }

    public static final String h(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str2.charAt(i2);
            if (i < str.length()) {
                if (charAt == '#' || charAt == '0') {
                    while (i < str.length() && !Character.isDigit(str.charAt(i))) {
                        i++;
                    }
                    if (i >= str.length()) {
                        break;
                    }
                    sb.append(str.charAt(i));
                } else if (str.charAt(i) == charAt) {
                    sb.append(str.charAt(i));
                } else {
                    sb.append(charAt);
                }
                i++;
            } else {
                if (charAt != ' ' || sb.length() <= 0) {
                    break;
                }
                sb.append(charAt);
            }
        }
        if (i < str.length()) {
            sb.append(gvu0.r0(i, str));
        }
        return sb.toString();
    }

    public static y2l i(ag90 ag90Var, JSONObject jSONObject) {
        return ((c3l) ft6.b.N5.getValue()).a(ag90Var, jSONObject);
    }

    public static final String j(int i, String str, String str2) {
        int i2 = 0;
        for (int i3 = 0; i3 < str2.length(); i3++) {
            if (Character.isDigit(str2.charAt(i3))) {
                i2++;
            }
        }
        if (i < i2) {
            i = i2;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            char charAt = str.charAt(i5);
            if (charAt == '+' && !z && sb.length() == 0) {
                sb.append(charAt);
                z = true;
            } else if (Character.isDigit(charAt) && i4 < i) {
                sb.append(charAt);
                i4++;
            }
        }
        return d(sb.toString(), str2);
    }

    public static final int k(List list) {
        Integer valueOf;
        int i = 0;
        if (list.isEmpty()) {
            int i2 = 0;
            while (i < 16) {
                char charAt = "+###############".charAt(i);
                if (charAt == '#' || charAt == '0') {
                    i2++;
                }
                i++;
            }
            return i2;
        }
        Iterator it = list.iterator();
        if (it.hasNext()) {
            valueOf = Integer.valueOf(m(((th0) it.next()).b));
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(m(((th0) it.next()).b));
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
        } else {
            valueOf = null;
        }
        if (valueOf != null) {
            Integer num = valueOf.intValue() > 0 ? valueOf : null;
            if (num != null) {
                return num.intValue();
            }
        }
        int i3 = 0;
        while (i < 16) {
            char charAt2 = "+###############".charAt(i);
            if (charAt2 == '#' || charAt2 == '0') {
                i3++;
            }
            i++;
        }
        return i3;
    }

    public static final String l(String str) {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            } else if (charAt == '+' && !z && sb.length() == 0) {
                sb.append(charAt);
                z = true;
            }
        }
        return sb.toString();
    }

    public static final int m(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.isDigit(charAt) || charAt == '#') {
                i++;
            }
        }
        return i;
    }
}
