package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final class usl0 implements zo31 {
    public final FrameLayout a;
    public final ImageView b;
    public final AutoDividerComponentList c;
    public final RobotoTextView d;

    public usl0(FrameLayout frameLayout, ImageView imageView, AutoDividerComponentList autoDividerComponentList, RobotoTextView robotoTextView) {
        this.a = frameLayout;
        this.b = imageView;
        this.c = autoDividerComponentList;
        this.d = robotoTextView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
