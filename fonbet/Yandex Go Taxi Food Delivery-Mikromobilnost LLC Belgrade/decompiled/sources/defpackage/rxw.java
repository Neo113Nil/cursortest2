package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class rxw implements b70 {
    public static final rxw a = new rxw();
    public static final List b = scc.g("retryDelayMillis", "timeoutMillis");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        cxw cxwVar = (cxw) obj;
        bfxVar.A1("retryDelayMillis");
        foe foeVar = l80.b;
        foeVar.a(bfxVar, cVar, Integer.valueOf(cxwVar.a));
        bfxVar.A1("timeoutMillis");
        foeVar.a(bfxVar, cVar, Integer.valueOf(cxwVar.b));
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Integer num = null;
        Integer num2 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                num = (Integer) l80.b.b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new cxw(num.intValue(), num2.intValue());
                }
                num2 = (Integer) l80.b.b(xdxVar, cVar);
            }
        }
    }
}
