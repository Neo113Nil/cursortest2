package defpackage;

import com.yandex.go.user_profile.main_menu.profile.domain.d;
import com.yandex.go.user_profile.ui.ProfileContext;
import com.yandex.go.user_profile.ui.ProfileUiStateInteractor$state$$inlined$flatMapLatest$1;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.domain.s0;
import ru.yandex.taxi.profile.a;
import ru.yandex.taxi.yaplus.b;

/* loaded from: classes14.dex */
public final class tgf0 {
    public final vp21 a;
    public final b b;
    public final a c;
    public final g d;
    public final s0 e;
    public final j20 f;
    public final wq21 g;
    public final d h;
    public final xv11 i;
    public final pwy0 j;
    public final tt2 k;
    public final hs50 l;

    public tgf0(vp21 vp21Var, b bVar, a aVar, g gVar, s0 s0Var, j20 j20Var, wq21 wq21Var, d dVar, xv11 xv11Var, pwy0 pwy0Var, tt2 tt2Var, hs50 hs50Var) {
        this.a = vp21Var;
        this.b = bVar;
        this.c = aVar;
        this.d = gVar;
        this.e = s0Var;
        this.f = j20Var;
        this.g = wq21Var;
        this.h = dVar;
        this.i = xv11Var;
        this.j = pwy0Var;
        this.k = tt2Var;
        this.l = hs50Var;
    }

    public final tpr a(boolean z) {
        ProfileContext profileContext;
        if (z) {
            profileContext = ProfileContext.DEEPLINK;
        } else {
            if (z) {
                w511.b();
                return null;
            }
            profileContext = ProfileContext.MENU;
        }
        kotlinx.coroutines.flow.internal.g X = e.X(this.d.a(), new ProfileUiStateInteractor$state$$inlined$flatMapLatest$1(null, this, new g92(2, profileContext)));
        this.k.getClass();
        sjh sjhVar = uyj.a;
        return e.F(X, mdh.b);
    }
}
