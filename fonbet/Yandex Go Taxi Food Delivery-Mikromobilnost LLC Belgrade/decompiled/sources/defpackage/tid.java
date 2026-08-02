package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.taxi.main.ShortcutsMainScreen;
import com.yandex.go.taxi.main.a;
import java.io.Serializable;
import ru.yandex.taxi.preorder.mainscreen.MainScreen;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchModalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class tid implements oxf0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;

    public /* synthetic */ tid(Object obj, Serializable serializable, int i) {
        this.a = i;
        this.b = obj;
        this.c = serializable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Serializable serializable = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((CompositeAddressSearchModalView) obj).onSourceAddressChanged((Address) serializable);
                break;
            default:
                MainScreen.MainScreenMode mainScreenMode = (MainScreen.MainScreenMode) serializable;
                krl0 krl0Var = ((a) obj).m;
                ShortcutsMainScreen shortcutsMainScreen = krl0Var != null ? (ShortcutsMainScreen) krl0Var.a : null;
                if (shortcutsMainScreen != null) {
                    shortcutsMainScreen.setMode(mainScreenMode);
                    break;
                }
                break;
        }
    }
}
