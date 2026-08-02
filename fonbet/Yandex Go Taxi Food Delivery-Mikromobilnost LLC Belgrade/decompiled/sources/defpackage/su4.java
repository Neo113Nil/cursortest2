package defpackage;

import com.adjust.sdk.Constants;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class su4 extends ns4 {
    public final c b;

    public su4(c cVar) {
        this.b = cVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        String a = ((ms4) obj).a();
        if (a == null || evu0.J(a)) {
            jst.e.j(new IllegalArgumentException("id parameter is empty"));
        } else {
            c.l(this.b, a, deeplinkSource == DeeplinkSource.PUSH ? Constants.PUSH : Constants.DEEPLINK, new esc(true), null, null, 24);
        }
        return zy11.a;
    }
}
