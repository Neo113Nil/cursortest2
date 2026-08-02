package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.widget.toggle_buttons.ToggleButtonsView;

/* loaded from: classes6.dex */
public final class qkz0 implements vpr {
    public final /* synthetic */ ToggleButtonsView a;
    public final /* synthetic */ int b;

    public qkz0(ToggleButtonsView toggleButtonsView, int i) {
        this.a = toggleButtonsView;
        this.b = i;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        this.a.getRecyclerView().smoothScrollToPosition(this.b);
        return zy11.a;
    }
}
