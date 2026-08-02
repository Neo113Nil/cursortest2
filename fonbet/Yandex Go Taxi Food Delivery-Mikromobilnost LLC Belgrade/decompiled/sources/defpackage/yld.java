package defpackage;

import com.apollographql.apollo3.api.c;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;

/* loaded from: classes2.dex */
public final class yld implements b70 {
    public static final yld a = new yld();
    public static final List b = scc.g("title", Constants.KEY_MESSAGE);

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        jld jldVar = (jld) obj;
        bfxVar.A1("title");
        foe foeVar = l80.a;
        bfxVar.r0(jldVar.a);
        bfxVar.A1(Constants.KEY_MESSAGE);
        l80.i.a(bfxVar, cVar, jldVar.b);
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
                    return new jld(str, str2);
                }
                str2 = (String) l80.i.b(xdxVar, cVar);
            }
        }
    }
}
