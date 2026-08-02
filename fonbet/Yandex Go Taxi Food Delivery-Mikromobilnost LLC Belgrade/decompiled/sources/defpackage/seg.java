package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class seg implements b70 {
    public static final seg a = new seg();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        keg kegVar = (keg) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(kegVar.a);
        List list = yeg.a;
        peg pegVar = kegVar.b;
        bfxVar.A1("backgroundColors");
        ueg uegVar = ueg.a;
        foe foeVar2 = l80.a;
        ep60 ep60Var = new ep60(uegVar, true);
        meg megVar = pegVar.a;
        if (megVar == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, megVar);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new keg(str, yeg.c(xdxVar, cVar));
    }
}
