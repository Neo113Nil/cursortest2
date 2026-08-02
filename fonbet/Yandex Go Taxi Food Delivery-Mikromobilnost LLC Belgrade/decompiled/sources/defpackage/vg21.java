package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.web.deeplink.m;

/* loaded from: classes10.dex */
public final class vg21 extends c970 {
    public final wg21 b;

    public vg21(wg21 wg21Var) {
        this.b = wg21Var;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        Uri a = ((b970) obj).a();
        i3y i3yVar = this.b.b;
        ((m) i3yVar.getValue()).i();
        ((pep0) oep0Var).f((m) i3yVar.getValue(), new kq41(a, null), hxx.a);
        return zy11.a;
    }
}
