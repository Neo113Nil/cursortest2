package defpackage;

import android.view.ViewStub;
import com.yandex.go.taxi.order.map.curtain.view.BannerContainerView;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes14.dex */
public final class tz70 implements sz70 {
    public final ViewStub a;
    public final i3y b = a.b(LazyThreadSafetyMode.NONE, new uh60(22, this));

    public tz70(ViewStub viewStub) {
        this.a = viewStub;
    }

    @Override // defpackage.sz70
    public final void ab(jmz jmzVar) {
        h().render(jmzVar);
    }

    public final BannerContainerView h() {
        return (BannerContainerView) this.b.getValue();
    }

    @Override // defpackage.sz70
    public final void hide() {
        h().hide();
    }

    @Override // defpackage.sz70
    public final void show() {
        h().show();
    }
}
