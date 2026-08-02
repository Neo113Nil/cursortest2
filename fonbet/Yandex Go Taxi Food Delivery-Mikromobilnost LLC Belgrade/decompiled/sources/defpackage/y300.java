package defpackage;

import androidx.fragment.app.Fragment;
import ru.yandex.taxi.fragment.BaseFragment;

/* loaded from: classes9.dex */
public final class y300 implements i130 {
    public final hcs a;

    public y300(hcs hcsVar) {
        this.a = hcsVar;
    }

    @Override // defpackage.i130
    public final w030 a() {
        Fragment a = ((ics) this.a).a();
        return a instanceof BaseFragment ? ((BaseFragment) a).modalViewCoordinator() : w030.a;
    }
}
