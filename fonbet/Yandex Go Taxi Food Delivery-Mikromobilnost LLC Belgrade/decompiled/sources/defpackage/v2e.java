package defpackage;

import java.util.LinkedHashMap;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.altpins.models.OptionType;
import ru.yandex.taxi.altpins.models.a;
import ru.yandex.taxi.map_common.map.o;
import ru.yandex.taxi.map_common.style.source.e;

/* loaded from: classes5.dex */
public final class v2e extends ad5 {
    public final bt00 A;
    public final o B;
    public final pwy0 C;
    public final r0 D;
    public final LinkedHashMap E;
    public final f4e x;
    public final a y;
    public final io9 z;

    public v2e(f4e f4eVar, a aVar, io9 io9Var, bt00 bt00Var, o oVar, pwy0 pwy0Var) {
        super(x2e.class);
        this.x = f4eVar;
        this.y = aVar;
        this.z = io9Var;
        this.A = bt00Var;
        this.B = oVar;
        this.C = pwy0Var;
        this.D = bvf0.c(OptionType.ALTPIN);
        this.E = new LinkedHashMap();
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        ((e) this.A).b();
    }
}
