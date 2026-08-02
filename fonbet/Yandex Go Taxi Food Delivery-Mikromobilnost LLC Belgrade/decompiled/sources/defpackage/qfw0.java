package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;
import ru.yandex.taxi.widget.modalview.ModalViewCoordinator$StackChangeType;

/* loaded from: classes8.dex */
public final /* synthetic */ class qfw0 implements v030 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.v030
    public final void a(u45 u45Var, u45 u45Var2, ModalViewCoordinator$StackChangeType modalViewCoordinator$StackChangeType) {
        if (u45Var instanceof FullscreenSuperappSuggestModalView) {
            View view = (View) u45Var;
            Object systemService = view.getContext().getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }
}
