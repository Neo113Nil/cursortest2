package defpackage;

import ru.yandex.taxi.logistics.ndd_route_selector.view.NddRouteSelectorModalView;

/* loaded from: classes5.dex */
public final /* synthetic */ class ti50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ NddRouteSelectorModalView b;

    public /* synthetic */ ti50(NddRouteSelectorModalView nddRouteSelectorModalView, int i) {
        this.a = i;
        this.b = nddRouteSelectorModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oep0 oep0Var;
        yvf0 yvf0Var;
        int i = this.a;
        NddRouteSelectorModalView nddRouteSelectorModalView = this.b;
        switch (i) {
            case 0:
                NddRouteSelectorModalView.onAttachedToWindow$lambda$0(nddRouteSelectorModalView);
                break;
            case 1:
                NddRouteSelectorModalView.onAttachedToWindow$lambda$1(nddRouteSelectorModalView);
                break;
            case 2:
                NddRouteSelectorModalView.onAttachedToWindow$lambda$3(nddRouteSelectorModalView);
                break;
            case 3:
                nddRouteSelectorModalView.onBackPressed();
                break;
            default:
                oep0Var = nddRouteSelectorModalView.screenStackNavigator;
                yvf0Var = nddRouteSelectorModalView.filterRouter;
                ((pep0) oep0Var).f((m950) yvf0Var.get(), zy11.a, hxx.a);
                break;
        }
    }
}
