package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.deeplinks.DeeplinkSource;

/* loaded from: classes9.dex */
public final class vxh extends rxh {
    public final xw91 b;
    public final z0j c;
    public final h3y d;

    public vxh(xw91 xw91Var, z0j z0jVar, h3y h3yVar) {
        this.b = xw91Var;
        this.c = z0jVar;
        this.d = h3yVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        String a = ((qxh) obj).a();
        zy11 zy11Var = zy11.a;
        if (a == null) {
            return zy11Var;
        }
        this.b.getClass();
        ((pep0) oep0Var).f((m950) this.d.get(), new txh("https://".concat(cvu0.v("care.yandex.ru/".concat(a), "//", "/", false)), new kwh(0)), hxx.a);
        this.c.b();
        return zy11Var;
    }
}
