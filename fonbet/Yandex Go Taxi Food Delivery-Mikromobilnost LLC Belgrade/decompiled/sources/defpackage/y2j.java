package defpackage;

import android.view.View;
import com.google.android.material.divider.MaterialDivider;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.design.view.GoLinearLayout;
import ru.yandex.taxi.plus.design.view.ShimmeringView;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes3.dex */
public final class y2j implements zo31 {
    public final /* synthetic */ int a;
    public final View b;

    public /* synthetic */ y2j(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        int i = this.a;
        View view = this.b;
        switch (i) {
            case 0:
                return (GoLinearLayout) view;
            case 1:
                return (GoConstraintLayout) view;
            case 2:
                return (ShimmeringView) view;
            case 3:
                return (RobotoTextView) view;
            case 4:
                return (PlaceholderView) view;
            default:
                return (MaterialDivider) view;
        }
    }
}
