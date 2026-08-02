package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class xpd implements b70 {
    public static final xpd a = new xpd();
    public static final List b = scc.g("buttonText", "buttonTextWithDetails", "subscriptionName");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        jkd jkdVar = (jkd) obj;
        bfxVar.A1("buttonText");
        foe foeVar = l80.a;
        bfxVar.r0(jkdVar.a);
        bfxVar.A1("buttonTextWithDetails");
        bfxVar.r0(jkdVar.b);
        bfxVar.A1("subscriptionName");
        bfxVar.r0(jkdVar.c);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                foe foeVar2 = l80.a;
                str2 = xdxVar.nextString();
            } else {
                if (h2 != 2) {
                    return new jkd(str, str2, str3);
                }
                foe foeVar3 = l80.a;
                str3 = xdxVar.nextString();
            }
        }
    }
}
