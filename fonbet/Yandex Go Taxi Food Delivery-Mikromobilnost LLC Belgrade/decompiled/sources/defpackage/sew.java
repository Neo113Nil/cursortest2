package defpackage;

import androidx.lifecycle.Lifecycle;
import com.yandex.go.flex.common.api.actions.GoReloadLabeledSectionsAction;
import com.yandex.go.intercity.flex.dashboard.presentation.h;
import flex.engine.a;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes12.dex */
public final class sew implements vpr {
    public y8w a;
    public Lifecycle.State b = Lifecycle.State.INITIALIZED;
    public final /* synthetic */ h c;

    public sew(h hVar) {
        this.c = hVar;
    }

    public final void a(y8w y8wVar) {
        h hVar = this.c;
        a aVar = hVar.A;
        if (this.b == Lifecycle.State.RESUMED) {
            if (y8wVar instanceof w8w) {
                w8w w8wVar = (w8w) y8wVar;
                w53 w53Var = w8wVar.b;
                List list = w8wVar.c;
                if (list.isEmpty()) {
                    ((wdw) hVar.Dg()).setProgressVisibility(true);
                    a.q(aVar, new u1m(2, w8wVar.a, w53Var), null, true, 2);
                } else {
                    aVar.k(new GoReloadLabeledSectionsAction(list, w53Var));
                }
            } else if (!(y8wVar instanceof x8w)) {
                w511.b();
                return;
            } else {
                hVar.D.i(new u131(((x8w) y8wVar).a, true));
            }
        }
        if (this.b == Lifecycle.State.STARTED) {
            this.a = y8wVar;
        }
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        a((y8w) obj);
        return zy11.a;
    }
}
