package defpackage;

import com.yandex.go.flex.common.api.FeedSdkTheme;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.wiq0;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.zqq;
import kotlin.a;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.zonemodes.j;

/* loaded from: classes.dex */
public final class zqq implements yqq {
    public final h3y a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final pwy0 e;
    public final i3y f;

    public zqq(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, pwy0 pwy0Var, final tse tseVar, final tt2 tt2Var) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = h3yVar4;
        this.e = pwy0Var;
        this.f = a.a(new sls() { // from class: com.yandex.go.flex.common.ui.theme.a
            @Override // defpackage.sls
            public final Object invoke() {
                zqq zqqVar = zqq.this;
                tpr d = com.yandex.go.coroutines.b.d(new m0(zqqVar.e.a(), new c(kotlinx.coroutines.flow.e.t(new e(((k) ((wiq0) zqqVar.a.get())).g(), zqqVar)), zqqVar), new FeedSdkThemeInteractorImpl$feedSdkThemeFlow$2$1(3, null)), new FeedSdkThemeInteractorImpl$feedSdkThemeFlow_delegate$lambda$0$$inlined$start$1(null, zqqVar));
                tt2Var.getClass();
                sjh sjhVar = uyj.a;
                return kotlinx.coroutines.flow.e.O(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.F(d, mdh.b)), tseVar, wsr0.a(xsr0.a, 1), 1);
            }
        });
    }

    public final String a(String str) {
        j jVar = (j) this.b.get();
        String str2 = jVar.e(jVar.b.g(), str, ((k) jVar.c).h()).a;
        h3y h3yVar = this.c;
        if (str2 == null || evu0.J(str2)) {
            return ((com.yandex.go.shortcuts.impl.preferences.a) h3yVar.get()).b.l("ru.yandex.taxi.shortcuts.preferences.ProductsPreferences.appearance_mode_" + str, null);
        }
        ((com.yandex.go.shortcuts.impl.preferences.a) h3yVar.get()).b.r("ru.yandex.taxi.shortcuts.preferences.ProductsPreferences.appearance_mode_" + str, str2);
        return str2;
    }

    public final FeedSdkTheme b() {
        pex0 pex0Var;
        fnx0 n = ((k) ((wiq0) this.a.get())).n();
        String str = (n == null || (pex0Var = n.c) == null) ? null : pex0Var.b;
        if (str == null) {
            str = "";
        }
        return d6z.O(this.e.getThemeType(), a(str));
    }
}
