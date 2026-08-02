package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class q7e0 implements b70 {
    public static final q7e0 a = new q7e0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        m7e0 m7e0Var = (m7e0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(m7e0Var.a);
        List list = kfg.a;
        ffg ffgVar = m7e0Var.b;
        bfxVar.A1("popups");
        ep60 a2 = l80.a(lfg.a);
        ArrayList arrayList = ffgVar.a;
        bfxVar.l();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a2.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new m7e0(str, kfg.c(xdxVar, cVar));
    }
}
