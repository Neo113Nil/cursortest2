package defpackage;

import com.yandex.go.flex.main_screen.data.network.c;
import com.yandex.go.flex.main_screen.experiments.f;
import flex.core.loader.network.e;

/* loaded from: classes.dex */
public final class w800 implements o0m {
    public final tt2 a;
    public final cot b;
    public final f c;
    public volatile c w;

    public w800(tt2 tt2Var, cot cotVar, f fVar) {
        this.a = tt2Var;
        this.b = cotVar;
        this.c = fVar;
    }

    @Override // defpackage.o0m
    public final m0m g(e eVar) {
        c cVar = new c(this.a, eVar, this.b, this.c);
        this.w = cVar;
        return cVar;
    }
}
