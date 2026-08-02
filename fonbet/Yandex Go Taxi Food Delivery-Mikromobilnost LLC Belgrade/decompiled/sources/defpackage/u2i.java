package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import ru.yandex.taxi.design.ToolbarComponent;

/* loaded from: classes12.dex */
public final class u2i implements zo31 {
    public final LinearLayout a;
    public final FragmentContainerView b;
    public final LinearLayout c;
    public final ToolbarComponent d;

    public u2i(LinearLayout linearLayout, FragmentContainerView fragmentContainerView, LinearLayout linearLayout2, ToolbarComponent toolbarComponent) {
        this.a = linearLayout;
        this.b = fragmentContainerView;
        this.c = linearLayout2;
        this.d = toolbarComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
