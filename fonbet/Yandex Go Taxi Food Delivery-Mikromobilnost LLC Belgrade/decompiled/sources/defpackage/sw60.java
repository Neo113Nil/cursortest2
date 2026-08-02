package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.places.common.ui.ControlButtonView;

/* loaded from: classes13.dex */
public final class sw60 implements zo31 {
    public final GoConstraintLayout a;
    public final ControlButtonView b;
    public final ControlButtonView c;

    public sw60(GoConstraintLayout goConstraintLayout, ControlButtonView controlButtonView, ControlButtonView controlButtonView2, ControlButtonView controlButtonView3, ControlButtonView controlButtonView4) {
        this.a = goConstraintLayout;
        this.b = controlButtonView;
        this.c = controlButtonView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
