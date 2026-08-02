package defpackage;

import com.yandex.go.places.map.data.mappers.a;
import com.yandex.go.places.map.data.repositories.h;
import com.yandex.go.places.map.domain.entities.PinLayer;
import com.yandex.go.places.map.domain.layer.c;
import kotlin.coroutines.Continuation;

/* loaded from: classes13.dex */
public abstract class u55 {
    public final a a;
    public final h b;
    public final c c;
    public final tt2 d;
    public final iaq0 e;
    public final boolean f;
    public final pwy0 g;

    public u55(a aVar, h hVar, c cVar, tt2 tt2Var, iaq0 iaq0Var, boolean z, pwy0 pwy0Var) {
        this.a = aVar;
        this.b = hVar;
        this.c = cVar;
        this.d = tt2Var;
        this.e = iaq0Var;
        this.f = z;
        this.g = pwy0Var;
    }

    public static final PinLayer a(u55 u55Var, PinLayer pinLayer) {
        int i = t55.a[pinLayer.ordinal()];
        if (i == 1) {
            return PinLayer.SOCIAL;
        }
        if (i == 2) {
            return PinLayer.MAIN;
        }
        w511.b();
        return null;
    }

    public abstract tpr b(ti80 ti80Var);

    public abstract tpr c(ti80 ti80Var);

    public Object d(uc4 uc4Var, Continuation continuation) {
        return zy11.a;
    }
}
