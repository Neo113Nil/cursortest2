package defpackage;

import com.yandex.plus.home.c;
import com.yandex.plus.ui.core.theme.PlusTheme;

/* loaded from: classes8.dex */
public final /* synthetic */ class rog implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ p4d0 b;

    public /* synthetic */ rog(p4d0 p4d0Var, int i) {
        this.a = i;
        this.b = p4d0Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        p4d0 p4d0Var = this.b;
        switch (i) {
            case 0:
                cop0 cop0Var = ((c) p4d0Var).b;
                return Boolean.valueOf(!tpd0.a(cop0Var.a, (PlusTheme) cop0Var.e.getValue()));
            case 1:
                return (lj) ((c) p4d0Var).h.h.getValue();
            case 2:
                return ((c) p4d0Var).c.a.e("Plaque.Definitions.DataLoading", "Plaque.Definitions.DataParsing");
            case 3:
                return ((c) p4d0Var).c.a.d("Plaque.SeenRequest.Loading");
            case 4:
                return ((c) p4d0Var).c.a.d("Plaque.ClickedRequest.Loading");
            default:
                return ((c) p4d0Var).c.a.d("Plaque.RemotePerformActionRequest.Loading");
        }
    }
}
