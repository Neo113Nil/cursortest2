package defpackage;

import android.content.Context;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.zone.dto.objects.SurgeBalanceAccessibilityInfo;
import java.util.Arrays;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.internal.h;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.utils.a;
import ru.yandex.taxi.surge.interactor.SummaryWidgetStateInteractor$stateFlow$$inlined$flatMapLatest$1;
import ru.yandex.taxi.surge.interactor.i;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final class trv0 {
    public final c a;
    public final wiq0 b;
    public final a c;
    public final tt2 d;
    public final e e;
    public final Context f;
    public final pwy0 g;
    public final yp2 h;
    public pzt0 i;
    public prv0 j;

    public trv0(c cVar, wiq0 wiq0Var, a aVar, tt2 tt2Var, e eVar, Context context, pwy0 pwy0Var, yp2 yp2Var) {
        this.a = cVar;
        this.b = wiq0Var;
        this.c = aVar;
        this.d = tt2Var;
        this.e = eVar;
        this.f = context;
        this.g = pwy0Var;
        this.h = yp2Var;
    }

    public static final String a(trv0 trv0Var, SurgeBalanceAccessibilityInfo surgeBalanceAccessibilityInfo) {
        trv0Var.getClass();
        String str = surgeBalanceAccessibilityInfo.a;
        String str2 = surgeBalanceAccessibilityInfo.b;
        return (str.length() <= 0 || str2.length() <= 0) ? "" : g8e.p(str, Extension.COLON_SPACE, str2);
    }

    public final h b(tse tseVar) {
        g X = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new i(this.a.c())), new SummaryWidgetStateInteractor$stateFlow$$inlined$flatMapLatest$1(this, null));
        r0 c = bvf0.c(null);
        return kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{new ru.yandex.taxi.surge.interactor.g(X, this, c, tseVar), new mth(c, 6)}, 2));
    }
}
