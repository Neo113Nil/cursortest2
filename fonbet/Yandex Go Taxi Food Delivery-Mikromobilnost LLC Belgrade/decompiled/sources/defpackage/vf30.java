package defpackage;

import android.view.ViewParent;
import ru.yandex.taxi.masstransit.detailedroute.ui.MtDetailedRouteModalView;
import ru.yandex.taxi.masstransit.ui.routeinfo.MtFloatingButtonState;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;

/* loaded from: classes6.dex */
public final class vf30 implements zf30 {
    public final /* synthetic */ MtDetailedRouteModalView a;

    public vf30(MtDetailedRouteModalView mtDetailedRouteModalView) {
        this.a = mtDetailedRouteModalView;
    }

    @Override // defpackage.zf30
    public final void Y4(MtFloatingButtonState mtFloatingButtonState) {
        RotatableFloatButton rotatableFloatButton;
        pwy0 pwy0Var;
        FloatButtonHolderLayout floatButtonHolderLayout;
        FloatButtonHolderLayout floatButtonHolderLayout2;
        FloatButtonHolderLayout floatButtonHolderLayout3;
        MtDetailedRouteModalView mtDetailedRouteModalView = this.a;
        rotatableFloatButton = mtDetailedRouteModalView.currentFocusButton;
        if (rotatableFloatButton != null) {
            ViewParent parent = rotatableFloatButton.getParent();
            floatButtonHolderLayout2 = mtDetailedRouteModalView.floatButtonLayoutHolder;
            if (!jl40.l(parent, floatButtonHolderLayout2)) {
                rotatableFloatButton = null;
            }
            if (rotatableFloatButton != null) {
                floatButtonHolderLayout3 = mtDetailedRouteModalView.floatButtonLayoutHolder;
                floatButtonHolderLayout3.removeFloatButton(rotatableFloatButton);
            }
        }
        RotatableFloatButton rotatableFloatButton2 = mtFloatingButtonState == MtFloatingButtonState.FOCUS_ROUTE ? mtDetailedRouteModalView.routeFocusButton : mtDetailedRouteModalView.userLocationFocusButton;
        pwy0Var = mtDetailedRouteModalView.themeSwitcherProvider;
        rotatableFloatButton2.applyTheme(pwy0Var.getThemeType());
        floatButtonHolderLayout = mtDetailedRouteModalView.floatButtonLayoutHolder;
        floatButtonHolderLayout.addFloatButton(rotatableFloatButton2, (Integer) 1);
        mtDetailedRouteModalView.currentFocusButton = rotatableFloatButton2;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        wf30 binding;
        cf30 cf30Var;
        yh30 yh30Var = (yh30) obj;
        MtDetailedRouteModalView mtDetailedRouteModalView = this.a;
        binding = mtDetailedRouteModalView.getBinding();
        binding.c.setText(yh30Var.a);
        cf30Var = mtDetailedRouteModalView.routeAdapter;
        cf30Var.submitList(yh30Var.b, null);
    }
}
