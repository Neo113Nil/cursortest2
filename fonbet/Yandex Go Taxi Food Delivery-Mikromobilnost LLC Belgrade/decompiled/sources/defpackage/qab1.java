package defpackage;

import androidx.compose.runtime.f;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.Map;
import ru.CryptoPro.JCP.VMInspector.OpenList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public abstract class qab1 {
    public static au2 a;

    public static final void a(StringBuilder sb, q6x q6xVar, int i) {
        if (!(q6xVar instanceof r6x)) {
            if (q6xVar instanceof p6x) {
                sb.append("\"" + ((p6x) q6xVar).a + OpenList.CHAR_QUOTE);
                return;
            }
            return;
        }
        Map map = ((r6x) q6xVar).a;
        if (map.isEmpty()) {
            sb.append("{}");
            return;
        }
        sb.append("{\n");
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            q6x q6xVar2 = (q6x) entry.getValue();
            int i3 = i + 1;
            for (int i4 = 0; i4 < i3; i4++) {
                sb.append(Extension.TAB_CHAR);
            }
            sb.append("\"" + str + "\": ");
            a(sb, q6xVar2, i3);
            i2++;
            if (i2 < map.size()) {
                sb.append(",");
            }
            sb.append("\n");
        }
        for (int i5 = 0; i5 < i; i5++) {
            sb.append(Extension.TAB_CHAR);
        }
        sb.append("}");
    }

    public static final String b(s6x s6xVar) {
        StringBuilder t = qv10.t("{\n");
        for (Map.Entry entry : s6xVar.a.entrySet()) {
            String str = (String) entry.getKey();
            q6x q6xVar = (q6x) entry.getValue();
            for (int i = 0; i < 2; i++) {
                t.append(Extension.TAB_CHAR);
            }
            t.append("\"" + str + "\": ");
            a(t, q6xVar, 2);
        }
        t.append('\n');
        t.append(Extension.TAB_CHAR);
        t.append("}");
        return t.toString();
    }

    public static final lg6 c(wg6 wg6Var, wp2 wp2Var, sls slsVar, fid fidVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            wp2Var = AppColor$Palette.Fog;
        }
        if ((i2 & 4) != 0) {
            slsVar = (sls) ((bts) fidVar).m(c3z.a);
        }
        boolean z = (((i & 14) ^ 6) > 4 && ((bts) fidVar).k(wg6Var)) || (i & 6) == 4;
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        o430 o430Var = did.a;
        if (z || Q == o430Var) {
            Q = jeb1.g(f.d(new gp5(wg6Var, 2)));
            btsVar.o0(Q);
        }
        qor qorVar = (qor) Q;
        boolean z2 = ((((i & 112) ^ 48) > 32 && btsVar.k(wp2Var)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && btsVar.k(slsVar)) || (i & 384) == 256);
        Object Q2 = btsVar.Q();
        if (z2 || Q2 == o430Var) {
            Q2 = new lg6(wp2Var, qorVar, slsVar);
            btsVar.o0(Q2);
        }
        return (lg6) Q2;
    }
}
