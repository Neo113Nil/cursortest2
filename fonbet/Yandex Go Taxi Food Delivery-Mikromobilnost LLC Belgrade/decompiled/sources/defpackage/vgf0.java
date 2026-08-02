package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.ultima_mode.profile.mvp.ProfileUltimaModeView;
import com.yandex.go.ultima_mode.ui.header.UltimaModeHeaderView;
import com.yandex.go.ultima_mode.ui.progress_bar.UltimaModeProgressBarView;
import ru.yandex.taxi.design.AutoDividerComponentList;

/* loaded from: classes14.dex */
public final class vgf0 implements zo31 {
    public final ProfileUltimaModeView a;
    public final UltimaModeHeaderView b;
    public final UltimaModeProgressBarView c;

    public vgf0(ProfileUltimaModeView profileUltimaModeView, UltimaModeHeaderView ultimaModeHeaderView, UltimaModeProgressBarView ultimaModeProgressBarView, GoLinearLayout goLinearLayout, AutoDividerComponentList autoDividerComponentList) {
        this.a = profileUltimaModeView;
        this.b = ultimaModeHeaderView;
        this.c = ultimaModeProgressBarView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
