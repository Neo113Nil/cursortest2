package defpackage;

import com.yandex.go.intentprocessor.k;
import com.yandex.go.messenger_native.d;
import ru.yandex.taxi.deeplinks.g;
import ru.yandex.taxi.map_common.map.p;

/* loaded from: classes.dex */
public final class w300 {
    public final tse a;
    public final k b;
    public final d c;
    public final p d;
    public final g e;
    public final h3y f;

    public w300(tse tseVar, k kVar, d dVar, p pVar, g gVar, h3y h3yVar) {
        this.a = tseVar;
        this.b = kVar;
        this.c = dVar;
        this.d = pVar;
        this.e = gVar;
        this.f = h3yVar;
    }

    public static final void a(w300 w300Var) {
        if (w300Var.d.isInitialized()) {
            gh00 gh00Var = (gh00) ((ah00) w300Var.f.get());
            float j = gh00Var.j();
            r5c k = gh00Var.k();
            if (k.b(Float.valueOf(j))) {
                float f = j - 1.0f;
                if (k.b(Float.valueOf(f))) {
                    gh00Var.J(f);
                    gh00Var.g.e(j, 500.0f);
                }
            }
        }
    }
}
