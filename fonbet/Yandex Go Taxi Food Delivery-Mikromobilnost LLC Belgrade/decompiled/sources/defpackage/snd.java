package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.util.List;

/* loaded from: classes2.dex */
public final class snd implements b70 {
    public static final snd a = new snd();
    public static final List b = scc.g("lightTheme", "darkTheme", "widgetPollingParameters");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        xmd xmdVar = (xmd) obj;
        bfxVar.A1("lightTheme");
        foe foeVar = l80.a;
        bfxVar.r0(xmdVar.a);
        bfxVar.A1("darkTheme");
        bfxVar.r0(xmdVar.b);
        bfxVar.A1("widgetPollingParameters");
        ep60 a2 = l80.a(rnd.a);
        wmd wmdVar = xmdVar.c;
        if (wmdVar == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, wmdVar);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        String str = null;
        String str2 = null;
        wmd wmdVar = null;
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
                    return new xmd(str, str2, wmdVar);
                }
                ep60 a2 = l80.a(rnd.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = a2.b(xdxVar, cVar);
                }
                wmdVar = (wmd) b2;
            }
        }
    }
}
