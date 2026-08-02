package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* loaded from: classes5.dex */
public final class tzb {
    public String a;
    public int b;

    public uz2 a() {
        uz2 uz2Var = new uz2();
        uz2Var.a = this.b;
        uz2Var.b = this.a;
        return uz2Var;
    }

    public rzb b(int i, int i2) {
        n03 d51Var;
        String str = this.a;
        if (i <= msm.c.a) {
            boolean z = i == 2 && gos.x(this.b, str, "!");
            if (z) {
                e("!");
            }
            int i3 = i + 1;
            int i4 = i2 + 1;
            rzb b = b(i3, i4);
            if (z) {
                b = new mka(b);
            }
            db0 c = c(i);
            while (c != null) {
                rzb b2 = b(i3, i4);
                switch (c.b) {
                    case 0:
                        d51Var = new d51(13);
                        break;
                    case 1:
                        d51Var = new rre(22);
                        break;
                    case 2:
                        d51Var = new rwd(24);
                        break;
                    case 3:
                        d51Var = new kjn(24);
                        break;
                    case 4:
                        d51Var = new y9w(24);
                        break;
                    case 5:
                        d51Var = new mvt(25);
                        break;
                    case 6:
                        d51Var = new mvt(26);
                        break;
                    case 7:
                        d51Var = new d51(26);
                        break;
                    case 8:
                        d51Var = new gos(28);
                        break;
                    case 9:
                        d51Var = new ehv(28);
                        break;
                    case 10:
                        d51Var = new hs4(29);
                        break;
                    default:
                        d51Var = new mvt(29);
                        break;
                }
                t1f t1fVar = new t1f(b, b2, d51Var);
                c = c(i);
                b = t1fVar;
            }
            return (i2 != 0 || this.b >= str.length()) ? b : new ipc(up6.R(this.b, 1, str), 4);
        }
        if (gos.x(this.b, str, "(")) {
            e("(");
            rzb b3 = b(0, i2 + 1);
            e(")");
            return b3;
        }
        if (!gos.x(this.b, str, "[")) {
            String d = d("'");
            uiq uiqVar = null;
            yee yeeVar = d != null ? new yee(d, 2) : null;
            if (yeeVar != null) {
                return yeeVar;
            }
            String d2 = d("\"");
            yee yeeVar2 = d2 != null ? new yee(d2, 2) : null;
            if (yeeVar2 != null) {
                return yeeVar2;
            }
            int i5 = this.b;
            while (this.b < str.length()) {
                String R = up6.R(this.b, 1, str);
                if ((R.compareTo(CommonUrlParts.Values.FALSE_INTEGER) < 0 || R.compareTo("9") > 0) && ((R.compareTo("a") < 0 || R.compareTo("z") > 0) && !((R.compareTo("A") >= 0 && R.compareTo("Z") <= 0) || R.equals("_") || R.equals("-") || R.equals(".")))) {
                    break;
                }
                this.b++;
            }
            String S = up6.S(i5, Integer.valueOf(this.b), str);
            e(StringUtil.SPACE);
            Double h = b.h(S);
            if (StringsKt.M(S, ".", false) && h != null) {
                return new s9a(h.doubleValue());
            }
            Integer q0 = StringsKt.q0(S);
            if (q0 != null) {
                return new jsg(q0.intValue(), 7);
            }
            if (S.equals("v")) {
                int i6 = this.b;
                if (gos.x(i6, str, "(")) {
                    int m = gos.m(this.b + 1, str, ")");
                    this.b = m;
                    uiq uiqVar2 = new uiq(8, new yx3(up6.S(i6 + 2, Integer.valueOf(m - 1), str), false));
                    e(")");
                    uiqVar = uiqVar2;
                }
                if (uiqVar != null) {
                    return uiqVar;
                }
            }
            return new jya(S, 6);
        }
        e("[");
        ArrayList arrayList = new ArrayList();
        while (true) {
            String d3 = d("'");
            if (d3 != null) {
                arrayList.add(d3);
            }
            String d4 = d("\"");
            if (d4 != null) {
                arrayList.add(d4);
            }
            e(StringUtils.COMMA);
            if (d3 == null && d4 == null) {
                pz0 pz0Var = new pz0(arrayList);
                e("]");
                return pz0Var;
            }
        }
    }

    public db0 c(int i) {
        List<db0> arrayList;
        LinkedHashMap linkedHashMap = msm.c.b;
        Integer valueOf = Integer.valueOf(i);
        linkedHashMap.getClass();
        if (linkedHashMap.containsKey(valueOf)) {
            Object obj = linkedHashMap.get(Integer.valueOf(i));
            obj.getClass();
            y75.s((List) obj, new ze0(xce.B0));
            Object obj2 = linkedHashMap.get(Integer.valueOf(i));
            obj2.getClass();
            arrayList = (List) obj2;
        } else {
            arrayList = new ArrayList();
        }
        for (db0 db0Var : arrayList) {
            if (gos.x(this.b, this.a, db0Var.a)) {
                e(db0Var.a);
                return db0Var;
            }
        }
        return null;
    }

    public String d(String str) {
        int i = this.b;
        String str2 = this.a;
        if (!gos.x(i, str2, str)) {
            return null;
        }
        int m = gos.m(this.b + 1, str2, str);
        this.b = m;
        String S = up6.S(i + 1, Integer.valueOf(m), str2);
        e(str);
        return S;
    }

    public void e(String str) {
        String str2 = this.a;
        if (gos.x(this.b, str2, str)) {
            this.b = str.length() + this.b;
        }
        while (this.b < str2.length()) {
            if (!up6.R(this.b, 1, str2).equals(StringUtil.SPACE) && !up6.R(this.b, 1, str2).equals(StringUtil.LF)) {
                return;
            } else {
                this.b++;
            }
        }
    }
}
