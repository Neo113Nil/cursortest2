package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class uww implements b70 {
    public static final uww a = new uww();
    public static final List b = scc.g("webViewUrl", "skipText");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        qww qwwVar = (qww) obj;
        bfxVar.A1("webViewUrl");
        foe foeVar = l80.a;
        bfxVar.r0(qwwVar.a);
        bfxVar.A1("skipText");
        bfxVar.r0(qwwVar.b);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        String str2 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else {
                if (h2 != 1) {
                    return new qww(str, str2);
                }
                foe foeVar2 = l80.a;
                str2 = xdxVar.nextString();
            }
        }
    }
}
