package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes.dex */
public final class yfi extends zfi {
    public final fx60 b;
    public final h3y c;

    public yfi(fx60 fx60Var, h3y h3yVar) {
        this.b = fx60Var;
        this.c = h3yVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        Uri a = ((xfi) obj).a();
        this.b.a(Events$Zalogin$LoginContext.DEEPLINK, new sb0(29, this, oep0Var, a));
        return zy11.a;
    }
}
