package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* loaded from: classes2.dex */
public final class txw implements b70 {
    public static final txw a = new txw();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        fxw fxwVar = (fxw) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(fxwVar.a);
        List list = zxw.a;
        yxw yxwVar = fxwVar.b;
        bfxVar.A1("id");
        foe foeVar2 = l80.a;
        bfxVar.r0(yxwVar.a);
        bfxVar.A1("respCode");
        l80.m.a(bfxVar, cVar, yxwVar.b);
        bfxVar.A1("respDesc");
        l80.i.a(bfxVar, cVar, yxwVar.c);
        bfxVar.A1(ACSPConstants.STATUS);
        foe foeVar3 = l80.a;
        uga1.f(bfxVar, yxwVar.d);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new fxw(str, zxw.c(xdxVar, cVar));
    }
}
