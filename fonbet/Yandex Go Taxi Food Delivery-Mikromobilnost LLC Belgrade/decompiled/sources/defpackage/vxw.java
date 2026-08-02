package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class vxw implements b70 {
    public static final vxw a = new vxw();
    public static final List b = scc.g("widgetUrl", "underlineText");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        jxw jxwVar = (jxw) obj;
        bfxVar.A1("widgetUrl");
        foe foeVar = l80.a;
        bfxVar.r0(jxwVar.a);
        bfxVar.A1("underlineText");
        bfxVar.r0(jxwVar.b);
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
                    return new jxw(str, str2);
                }
                foe foeVar2 = l80.a;
                str2 = xdxVar.nextString();
            }
        }
    }
}
