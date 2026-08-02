package defpackage;

import com.yandex.music.screen.landing.api.header.ui.view.BottomsheetCollapsingTopBar;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class p1e implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomsheetCollapsingTopBar b;

    public /* synthetic */ p1e(BottomsheetCollapsingTopBar bottomsheetCollapsingTopBar, int i) {
        this.a = i;
        this.b = bottomsheetCollapsingTopBar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                this.b.setVisibilityState(((Boolean) obj).booleanValue());
                break;
            default:
                this.b.setTitle((String) obj);
                break;
        }
        return Unit.a;
    }
}
