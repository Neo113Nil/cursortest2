package defpackage;

import com.yandex.feedsdk.di.a;
import java.util.List;

/* loaded from: classes9.dex */
public final class wtl implements szl {
    public final a a;

    public wtl(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.szl
    public final void a(neo neoVar, l1o l1oVar) {
        for (com.yandex.div.core.expression.variables.a aVar : (List) this.a.invoke()) {
            z131 z131Var = neoVar instanceof k3m ? new z131("flex.first_visible_item", ((k3m) neoVar).a) : neoVar instanceof l3m ? new z131("flex.last_visible_item", ((l3m) neoVar).a) : null;
            if (z131Var == null) {
                return;
            } else {
                aVar.i(z131Var);
            }
        }
    }

    @Override // defpackage.szl
    public final void b(t9 t9Var) {
    }

    @Override // defpackage.szl
    public final void dispose() {
    }
}
