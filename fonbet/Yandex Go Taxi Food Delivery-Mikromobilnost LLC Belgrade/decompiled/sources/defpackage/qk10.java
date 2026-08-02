package defpackage;

import com.ybsdk.screens.menu.presentation.MenuFragment;

/* loaded from: classes3.dex */
public final /* synthetic */ class qk10 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ MenuFragment b;

    public /* synthetic */ qk10(MenuFragment menuFragment, int i) {
        this.a = i;
        this.b = menuFragment;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        ck10 ck10Var;
        zy11 onViewCreated$lambda$3;
        int i = this.a;
        MenuFragment menuFragment = this.b;
        switch (i) {
            case 0:
                ck10Var = MenuFragment.settingsComponent_delegate$lambda$0(menuFragment);
                return ck10Var;
            default:
                onViewCreated$lambda$3 = MenuFragment.onViewCreated$lambda$3(menuFragment);
                return onViewCreated$lambda$3;
        }
    }
}
