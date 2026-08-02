package defpackage;

import ru.yandex.taxi.web.modal.WebContainerModalView;

/* loaded from: classes6.dex */
public final class sf41 implements wf41 {
    public final /* synthetic */ WebContainerModalView a;

    public sf41(WebContainerModalView webContainerModalView) {
        this.a = webContainerModalView;
    }

    @Override // defpackage.wf41
    public final void tb(pf41 pf41Var) {
        boolean l = jl40.l(pf41Var, jf41.d);
        WebContainerModalView webContainerModalView = this.a;
        if (l) {
            webContainerModalView.reload();
            return;
        }
        if (pf41Var instanceof of41) {
            webContainerModalView.updateUriAndReload(((of41) pf41Var).a);
            return;
        }
        if (jl40.l(pf41Var, jf41.b)) {
            webContainerModalView.disableSwipe();
            return;
        }
        if (jl40.l(pf41Var, jf41.c)) {
            webContainerModalView.enableSwipe();
            return;
        }
        if (pf41Var instanceof kf41) {
            webContainerModalView.setEnableBackNavigation(((kf41) pf41Var).a);
            return;
        }
        if (pf41Var instanceof lf41) {
            webContainerModalView.reloadConfig(((lf41) pf41Var).a);
            return;
        }
        if (pf41Var instanceof nf41) {
            webContainerModalView.updateCurrentState(((nf41) pf41Var).a);
            return;
        }
        if (pf41Var instanceof mf41) {
            webContainerModalView.setContentTheme(((mf41) pf41Var).a);
        } else if (jl40.l(pf41Var, jf41.a)) {
            webContainerModalView.dismiss();
        } else {
            w511.b();
        }
    }
}
