package defpackage;

import android.view.View;
import com.yandex.go.safety.center.base.BaseSafetyCenterView;
import ru.yandex.taxi.animation.NavigationDirection;

/* loaded from: classes13.dex */
public final class rpl0 {
    public final w030 a;
    public BaseSafetyCenterView b;

    public rpl0(w030 w030Var) {
        this.a = w030Var;
    }

    public final void a() {
        View content;
        BaseSafetyCenterView baseSafetyCenterView = this.b;
        if (baseSafetyCenterView != null && (content = baseSafetyCenterView.content()) != null) {
            mwa1.b(content, true, NavigationDirection.BACKWARD);
        }
        this.b = null;
    }

    public final void b() {
        View content;
        u45 e = this.a.e();
        BaseSafetyCenterView baseSafetyCenterView = e instanceof BaseSafetyCenterView ? (BaseSafetyCenterView) e : null;
        this.b = baseSafetyCenterView;
        if (baseSafetyCenterView == null || (content = baseSafetyCenterView.content()) == null) {
            return;
        }
        mwa1.b(content, false, NavigationDirection.FORWARD);
    }
}
