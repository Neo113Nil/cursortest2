package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class z68 {
    public static final w68[] a = {new w68(0.03f, 16.0f, 26), new w68(0.03f, 20.0f, 26), new w68(0.03f, 16.0f, 26), new w68(0.03f, 13.0f, 2)};

    public static final a78 a(int i, int i2, String str) {
        List Y = evu0.Y(str, new char[]{8201}, 0, 6);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i3 = 0;
        while (i3 < Y.size() && i3 < 4) {
            boolean z = i3 == Y.size() - 1 || i3 == 3;
            Object obj = Y.get(i3);
            Object obj2 = z ? "" : (char) 8201;
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(obj2);
            linkedHashMap.put(sb.toString(), a[i3]);
            i3++;
        }
        return new a78(i, i2, linkedHashMap);
    }
}
