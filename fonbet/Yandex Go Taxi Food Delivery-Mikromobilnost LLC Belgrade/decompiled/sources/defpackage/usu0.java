package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.List;

/* loaded from: classes2.dex */
public final class usu0 implements b70 {
    public static final usu0 a = new usu0();
    public static final List b = scc.g("key", "value");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        osu0 osu0Var = (osu0) obj;
        bfxVar.A1("key");
        foe foeVar = l80.a;
        bfxVar.r0(osu0Var.a);
        bfxVar.A1("value");
        bfxVar.r0(osu0Var.b);
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
                    return new osu0(str, str2);
                }
                foe foeVar2 = l80.a;
                str2 = xdxVar.nextString();
            }
        }
    }
}
