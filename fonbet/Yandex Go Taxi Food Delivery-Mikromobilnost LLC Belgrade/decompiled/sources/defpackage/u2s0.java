package defpackage;

import com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutsModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class u2s0 implements bx4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ShortcutsModalView b;

    public /* synthetic */ u2s0(ShortcutsModalView shortcutsModalView, int i) {
        this.a = i;
        this.b = shortcutsModalView;
    }

    @Override // defpackage.bx4
    public final void a() {
        int i = this.a;
        ShortcutsModalView shortcutsModalView = this.b;
        switch (i) {
            case 0:
                shortcutsModalView.onKeyboardClosed();
                break;
            default:
                shortcutsModalView.onKeyboardClosed();
                break;
        }
    }
}
