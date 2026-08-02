package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yandex.go.design.view.GoFrameLayout;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final class yg80 extends c8c0 {
    public final oe80 b;

    public yg80(oe80 oe80Var) {
        this.b = oe80Var;
    }

    @Override // defpackage.c8c0
    public final View a(ViewGroup viewGroup, z7c0 z7c0Var, z7c0 z7c0Var2) {
        ViewGroup goFrameLayout = new GoFrameLayout(viewGroup.getContext(), null, 0, 0, 14, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        goFrameLayout.setLayoutParams(layoutParams);
        c.z(new bm50(12, z7c0Var, this), goFrameLayout);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(vuh0.organizations_error_loading_container, goFrameLayout, false);
        goFrameLayout.addView(inflate);
        px6.o(inflate);
        return goFrameLayout;
    }
}
