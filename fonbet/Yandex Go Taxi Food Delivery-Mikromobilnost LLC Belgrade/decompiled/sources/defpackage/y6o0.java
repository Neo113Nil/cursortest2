package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.design.view.GoView;
import com.yandex.go.scooters.passes.v2.list.ScootersPackageView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class y6o0 implements zo31 {
    public final ScootersPackageView a;
    public final GoImageView b;
    public final GoView c;

    public y6o0(ScootersPackageView scootersPackageView, GoLinearLayout goLinearLayout, GoImageView goImageView, GoView goView, RobotoTextView robotoTextView, RobotoTextView robotoTextView2, RobotoTextView robotoTextView3) {
        this.a = scootersPackageView;
        this.b = goImageView;
        this.c = goView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
