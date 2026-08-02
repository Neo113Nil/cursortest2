package defpackage;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes6.dex */
public abstract class tgb1 {
    public static au2 a;

    public static Map a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j69 j69Var = (j69) it.next();
            MapBuilder mapBuilder = new MapBuilder(4);
            String str = j69Var.a;
            String str2 = j69Var.b;
            mapBuilder.put("tariffClass", str);
            mapBuilder.put("tariff_available", String.valueOf(j69Var.f));
            mapBuilder.put("visiblePart", String.valueOf(j69Var.c));
            String str3 = j69Var.e;
            if (str3 != null && str3.length() != 0) {
                mapBuilder.put("modifier_text", str3);
            }
            if (str2 != null && str2.length() != 0) {
                mapBuilder.put("verticalId", str2);
            }
            arrayList2.add(mapBuilder.j());
        }
        return gw00.e(new Pair("cells", arrayList2));
    }

    public static final void b(long j) {
        if (j < 0) {
            ny61.g("Bytes cannot be negative");
            return;
        }
        String[] strArr = {"B", "KB", "MB", "GB", "TB"};
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d = j;
        int i = 0;
        double d2 = d;
        while (d2 >= 1024.0d && i < 4) {
            d2 /= 1024.0d;
            i++;
        }
        if (i == 0) {
            decimalFormat.format(d2);
            String str = strArr[i];
            return;
        }
        StringBuilder sb = new StringBuilder();
        while (-1 < i) {
            double pow = Math.pow(1024.0d, i);
            double floor = Math.floor(d / pow);
            if (floor > 0.0d) {
                sb.append(decimalFormat.format(floor));
                sb.append(" ");
                sb.append(strArr[i]);
                sb.append(" ");
                d -= floor * pow;
            }
            i--;
        }
        evu0.k0(sb).toString();
    }
}
