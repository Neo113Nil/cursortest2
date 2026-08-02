package defpackage;

import com.yandex.go.ultima_mode.menu.mvp.MenuUltimaModeView;

/* loaded from: classes14.dex */
public final class tn10 implements on10 {
    public final /* synthetic */ MenuUltimaModeView a;

    public tn10(MenuUltimaModeView menuUltimaModeView) {
        this.a = menuUltimaModeView;
    }

    @Override // defpackage.on10
    public final void sf(rn10 rn10Var) {
        boolean z = rn10Var instanceof pn10;
        MenuUltimaModeView menuUltimaModeView = this.a;
        if (z) {
            menuUltimaModeView.renderContent((pn10) rn10Var);
        } else if (rn10Var instanceof qn10) {
            menuUltimaModeView.renderEmpty();
        } else {
            w511.b();
        }
    }
}
