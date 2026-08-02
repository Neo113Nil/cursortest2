package defpackage;

import android.view.View;
import ru.yandex.taxi.widget.InsetsAwareFrameLayout;

/* loaded from: classes6.dex */
public final class zv31 extends fc5 {
    public final InsetsAwareFrameLayout c;
    public View d;
    public Runnable e = pwf0.c;

    public zv31(InsetsAwareFrameLayout insetsAwareFrameLayout) {
        this.c = insetsAwareFrameLayout;
    }

    @Override // defpackage.fc5
    public final void d() {
        this.e.run();
        super.d();
    }

    @Override // defpackage.fc5
    public final void e() {
        super.e();
        View view = this.d;
        if (view == null) {
            return;
        }
        this.c.removeView(view);
        this.d = null;
    }
}
