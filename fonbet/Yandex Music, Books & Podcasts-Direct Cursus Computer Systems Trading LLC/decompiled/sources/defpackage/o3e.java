package defpackage;

import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.List;

/* loaded from: classes3.dex */
public interface o3e {
    bg5 b(List list, spd spdVar, hq5 hq5Var, int i);

    default wdj d(List list, spd spdVar, oq5 oq5Var) {
        list.getClass();
        spdVar.getClass();
        oq5Var.Z(-736352438);
        Assertions.throwOrSkip("HorizontalTrackPagerPresenter", new FailedAssertionException("NonMusicTrackPresenter is not implemented properly"));
        n3e n3eVar = new n3e(this, list, spdVar, oq5Var);
        oq5Var.p(false);
        return n3eVar;
    }
}
