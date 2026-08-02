package defpackage;

import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.n;
import androidx.lifecycle.q;
import androidx.view.fragment.b;
import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class wu5 implements q {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wu5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                xu5 xu5Var = (xu5) obj2;
                Lifecycle lifecycle = (Lifecycle) obj;
                if (event == Lifecycle.Event.ON_DESTROY) {
                    wu5 wu5Var = xu5Var.d;
                    if (wu5Var != null) {
                        lifecycle.d(wu5Var);
                    }
                    xu5Var.d = null;
                    xu5Var.c = zoy0.c;
                    break;
                }
                break;
            case 1:
                b bVar = (b) obj2;
                androidx.view.b bVar2 = (androidx.view.b) obj;
                if (event == Lifecycle.Event.ON_RESUME && ((List) bVar.b().e.a.getValue()).contains(bVar2)) {
                    if (b.n()) {
                        bVar2.toString();
                        peyVar.toString();
                    }
                    bVar.b().b(bVar2);
                }
                if (event == Lifecycle.Event.ON_DESTROY) {
                    if (b.n()) {
                        bVar2.toString();
                        peyVar.toString();
                    }
                    bVar.b().b(bVar2);
                    break;
                }
                break;
            case 2:
                n nVar = (n) obj2;
                l8x l8xVar = (l8x) obj;
                if (peyVar.getLifecycle().b() != Lifecycle.State.DESTROYED) {
                    int compareTo = peyVar.getLifecycle().b().compareTo(nVar.b);
                    oyj oyjVar = nVar.c;
                    if (compareTo >= 0) {
                        if (oyjVar.a) {
                            if (!oyjVar.b) {
                                oyjVar.a = false;
                                oyjVar.a();
                                break;
                            } else {
                                ny61.r("Cannot resume a finished dispatcher");
                                break;
                            }
                        }
                    } else {
                        oyjVar.a = true;
                        break;
                    }
                } else {
                    l8xVar.a(null);
                    nVar.a();
                    break;
                }
                break;
            case 3:
                tk10 tk10Var = (tk10) obj2;
                an10 an10Var = (an10) obj;
                tk10Var.getClass();
                if (event == Lifecycle.Event.ON_DESTROY) {
                    tk10Var.d(an10Var);
                    break;
                }
                break;
            default:
                ComposeView composeView = (ComposeView) obj2;
                oz40 oz40Var = (oz40) obj;
                if (event == Lifecycle.Event.ON_RESUME) {
                    oz40Var.setValue(Boolean.valueOf(qke.h(composeView.getContext(), "android.permission.CAMERA") == 0));
                    break;
                }
                break;
        }
    }
}
