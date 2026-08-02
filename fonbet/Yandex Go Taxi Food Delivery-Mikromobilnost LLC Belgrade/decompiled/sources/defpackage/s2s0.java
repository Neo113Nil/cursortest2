package defpackage;

import com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutsModalView;

/* loaded from: classes14.dex */
public final /* synthetic */ class s2s0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ShortcutsModalView b;

    public /* synthetic */ s2s0(ShortcutsModalView shortcutsModalView, int i) {
        this.a = i;
        this.b = shortcutsModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ShortcutsModalView shortcutsModalView = this.b;
        switch (i) {
            case 0:
                ShortcutsModalView.addLocateButton$lambda$0(shortcutsModalView);
                break;
            default:
                ShortcutsModalView._init_$lambda$1(shortcutsModalView);
                break;
        }
    }
}
