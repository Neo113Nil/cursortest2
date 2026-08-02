package defpackage;

import com.apollographql.apollo3.api.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zdg implements b70 {
    public static final zdg a = new zdg();
    public static final List b = Collections.singletonList("sections");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        bfxVar.A1("sections");
        ydg ydgVar = ydg.a;
        foe foeVar = l80.a;
        ArrayList arrayList = ((vdg) obj).a;
        bfxVar.l();
        for (Object obj2 : arrayList) {
            if (bfxVar instanceof ek00) {
                bfxVar.u();
                ydgVar.a(bfxVar, cVar, obj2);
                bfxVar.y();
            } else {
                ek00 ek00Var = new ek00();
                ek00Var.u();
                ydgVar.a(ek00Var, cVar, obj2);
                ek00Var.y();
                uga1.f(bfxVar, ek00Var.c());
            }
        }
        bfxVar.j();
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        ArrayList arrayList = null;
        while (xdxVar.h2(b) == 0) {
            ydg ydgVar = ydg.a;
            foe foeVar = l80.a;
            ep60 ep60Var = new ep60(ydgVar, true);
            xdxVar.l();
            arrayList = new ArrayList();
            while (xdxVar.hasNext()) {
                arrayList.add(ep60Var.b(xdxVar, cVar));
            }
            xdxVar.j();
        }
        return new vdg(arrayList);
    }
}
