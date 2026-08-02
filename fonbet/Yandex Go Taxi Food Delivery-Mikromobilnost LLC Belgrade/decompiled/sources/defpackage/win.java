package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ru.yandex.taxi.widget.AnyTouchCatcherFrameLayout;

/* loaded from: classes14.dex */
public final class win implements zo31 {
    public final /* synthetic */ int a;
    public final FrameLayout b;

    public win(FrameLayout frameLayout, AnyTouchCatcherFrameLayout anyTouchCatcherFrameLayout) {
        this.a = 1;
        this.b = frameLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        return this.b;
    }

    public /* synthetic */ win(int i, FrameLayout frameLayout) {
        this.a = i;
        this.b = frameLayout;
    }
}
