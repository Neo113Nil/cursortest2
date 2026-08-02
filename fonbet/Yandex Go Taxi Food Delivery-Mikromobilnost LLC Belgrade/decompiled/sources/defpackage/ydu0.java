package defpackage;

import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class ydu0 {
    public final tls a;
    public final ArrayList b = new ArrayList(0);

    public ydu0(tls tlsVar) {
        this.a = tlsVar;
    }

    public final int a(int i) {
        if (i != -1) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                return ((Number) arrayList.get(i)).intValue();
            }
        }
        return -1;
    }
}
