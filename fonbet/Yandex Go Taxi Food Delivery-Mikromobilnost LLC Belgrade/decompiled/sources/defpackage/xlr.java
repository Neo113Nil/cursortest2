package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.yandex.go.flex.main_screen.presentation.MainScreenFlexSdkView;

/* loaded from: classes.dex */
public final class xlr implements zo31 {
    public final MainScreenFlexSdkView a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final FrameLayout d;

    public xlr(MainScreenFlexSdkView mainScreenFlexSdkView, FrameLayout frameLayout, FrameLayout frameLayout2, FrameLayout frameLayout3) {
        this.a = mainScreenFlexSdkView;
        this.b = frameLayout;
        this.c = frameLayout2;
        this.d = frameLayout3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
