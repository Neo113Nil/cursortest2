package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.tips.ui.TipsView;
import ru.yandex.taxi.design.ToolbarComponent;

/* loaded from: classes14.dex */
public final class vgz0 implements zo31 {
    public final View a;
    public final TipsView b;
    public final ToolbarComponent c;

    public vgz0(ViewGroup viewGroup, TipsView tipsView, ToolbarComponent toolbarComponent) {
        this.a = viewGroup;
        this.b = tipsView;
        this.c = toolbarComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
