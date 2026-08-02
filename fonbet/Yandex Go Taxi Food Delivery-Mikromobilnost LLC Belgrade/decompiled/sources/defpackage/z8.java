package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class z8 {
    public abstract apu a();

    public final ArrayList b(String str) {
        ArrayList arrayList = new ArrayList();
        if (!evu0.J(str) && str.length() != 0) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '#') {
                    arrayList.add(a());
                } else {
                    arrayList.add(bpu.b(charAt));
                }
            }
        }
        return arrayList;
    }
}
