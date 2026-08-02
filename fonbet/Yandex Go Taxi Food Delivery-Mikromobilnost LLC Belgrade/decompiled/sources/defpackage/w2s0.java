package defpackage;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutModalViewMvp;
import com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutsModalView;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes14.dex */
public final class w2s0 implements ShortcutModalViewMvp {
    public final /* synthetic */ ShortcutsModalView a;

    public w2s0(ShortcutsModalView shortcutsModalView) {
        this.a = shortcutsModalView;
    }

    @Override // com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutModalViewMvp
    public final void F2() {
        changeShortcutsVisibility(false);
    }

    @Override // com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutModalViewMvp
    public final void changeShortcutsVisibility(boolean z) {
        this.a.changeShortcutsVisibility(z);
    }

    @Override // com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutModalViewMvp
    public final void fc() {
        arb1.d(this.a.getContext()).onBackPressed();
    }

    @Override // com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutModalViewMvp
    public final void jb() {
        i3y i3yVar;
        ViewGroup cardContentContainer;
        ShortcutsModalView shortcutsModalView = this.a;
        i3yVar = shortcutsModalView.addressSearchViewLazy;
        if (i3yVar.isInitialized()) {
            CompositeAddressSearchView compositeAddressSearchView = (CompositeAddressSearchView) i3yVar.getValue();
            cardContentContainer = shortcutsModalView.getCardContentContainer();
            cardContentContainer.removeView(compositeAddressSearchView);
        }
    }

    @Override // com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutModalViewMvp
    public final void pauseShortcuts() {
        r4s0 r4s0Var;
        r4s0Var = this.a.shortcutsView;
        r4s0Var.pause();
    }

    @Override // com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutModalViewMvp
    public final void requestFocus() {
        this.a.requestFocus();
    }

    @Override // com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutModalViewMvp
    public final void resumeShortcuts() {
        r4s0 r4s0Var;
        r4s0Var = this.a.shortcutsView;
        r4s0Var.resume();
    }

    @Override // com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutModalViewMvp
    public final void showEditAddress(PointType pointType) {
        i3y i3yVar;
        i3y i3yVar2;
        ShortcutsModalView shortcutsModalView = this.a;
        i3yVar = shortcutsModalView.addressSearchViewLazy;
        ((CompositeAddressSearchView) i3yVar.getValue()).setActivePoint(pointType, true);
        changeShortcutsVisibility(false);
        shortcutsModalView.fillShortcutsRemainSpace();
        i3yVar2 = shortcutsModalView.addressSearchViewLazy;
        shortcutsModalView.refreshNestedScrollView((View) i3yVar2.getValue());
        shortcutsModalView.expand();
    }

    @Override // com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutModalViewMvp
    public final void updateBadgeCount(int i) {
        FloatButtonIconComponent floatButtonIconComponent;
        floatButtonIconComponent = this.a.backButton;
        if (floatButtonIconComponent != null) {
            if (i > 0) {
                floatButtonIconComponent.setBadgeText(String.valueOf(i));
            } else {
                floatButtonIconComponent.setBadgeText(null);
            }
        }
    }

    @Override // com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutModalViewMvp
    public final void wb() {
        ViewGroup cardContentContainer;
        i3y i3yVar;
        ShortcutsModalView shortcutsModalView = this.a;
        shortcutsModalView.initAddressSearchView();
        cardContentContainer = shortcutsModalView.getCardContentContainer();
        i3yVar = shortcutsModalView.addressSearchViewLazy;
        cardContentContainer.addView((View) i3yVar.getValue());
    }

    @Override // com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutModalViewMvp
    public final void showEditAddress(Uri uri) {
        i3y i3yVar;
        i3y i3yVar2;
        ShortcutsModalView shortcutsModalView = this.a;
        i3yVar = shortcutsModalView.addressSearchViewLazy;
        ((CompositeAddressSearchView) i3yVar.getValue()).processDeeplink(uri);
        changeShortcutsVisibility(false);
        shortcutsModalView.fillShortcutsRemainSpace();
        i3yVar2 = shortcutsModalView.addressSearchViewLazy;
        shortcutsModalView.refreshNestedScrollView((View) i3yVar2.getValue());
        shortcutsModalView.expand();
    }
}
