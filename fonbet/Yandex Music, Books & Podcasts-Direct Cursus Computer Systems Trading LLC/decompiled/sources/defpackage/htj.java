package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.List;

/* loaded from: classes.dex */
public final class htj extends s17 {
    public static final htj d = new htj(0, 2, 1);

    @Override // defpackage.s17
    public final void a(n8n n8nVar, nw0 nw0Var, oxq oxqVar, m mVar) {
        int i = ((bqe) n8nVar.j(0)).a;
        List list = (List) n8nVar.j(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            nw0Var.h(i3, obj);
            nw0Var.e(i3, obj);
        }
    }
}
