package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zsc0 implements b70 {
    public static final zsc0 a = new zsc0();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        usc0 usc0Var = (usc0) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(usc0Var.a);
        List list = l2u.a;
        i2u i2uVar = usc0Var.b;
        bfxVar.A1("indentRules");
        m2u m2uVar = m2u.a;
        foe foeVar2 = l80.a;
        g2u g2uVar = i2uVar.a;
        boolean z = bfxVar instanceof ek00;
        if (z) {
            ek00 ek00Var = (ek00) bfxVar;
            ek00Var.u();
            m2uVar.a(bfxVar, cVar, g2uVar);
            ek00Var.y();
        } else {
            ek00 ek00Var2 = new ek00();
            ek00Var2.u();
            m2uVar.a(ek00Var2, cVar, g2uVar);
            ek00Var2.y();
            uga1.f(bfxVar, ek00Var2.c());
        }
        bfxVar.A1("backgroundColorSettings");
        j2u j2uVar = j2u.a;
        ArrayList arrayList = i2uVar.b;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (z) {
                ek00 ek00Var3 = (ek00) bfxVar;
                ek00Var3.u();
                j2uVar.a(bfxVar, cVar, obj2);
                ek00Var3.y();
            } else {
                ek00 ek00Var4 = new ek00();
                ek00Var4.u();
                j2uVar.a(ek00Var4, cVar, obj2);
                ek00Var4.y();
                uga1.f(bfxVar, ek00Var4.c());
            }
        }
        bfxVar.j();
        bfxVar.A1("backgroundShapeSettings");
        k2u k2uVar = k2u.a;
        f2u f2uVar = i2uVar.c;
        if (z) {
            ek00 ek00Var5 = (ek00) bfxVar;
            ek00Var5.u();
            k2uVar.a(bfxVar, cVar, f2uVar);
            ek00Var5.y();
        } else {
            ek00 ek00Var6 = new ek00();
            ek00Var6.u();
            k2uVar.a(ek00Var6, cVar, f2uVar);
            ek00Var6.y();
            uga1.f(bfxVar, ek00Var6.c());
        }
        bfxVar.A1("width");
        n2u n2uVar = n2u.a;
        h2u h2uVar = i2uVar.d;
        if (z) {
            ek00 ek00Var7 = (ek00) bfxVar;
            ek00Var7.u();
            n2uVar.a(bfxVar, cVar, h2uVar);
            ek00Var7.y();
            return;
        }
        ek00 ek00Var8 = new ek00();
        ek00Var8.u();
        n2uVar.a(ek00Var8, cVar, h2uVar);
        ek00Var8.y();
        uga1.f(bfxVar, ek00Var8.c());
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new usc0(str, l2u.c(xdxVar, cVar));
    }
}
