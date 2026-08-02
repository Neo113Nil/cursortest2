package defpackage;

import java.util.HashMap;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.surge.interactor.q;
import ru.yandex.taxi.surge.repository.a;
import ru.yandex.taxi.surge.router.b;

/* loaded from: classes6.dex */
public final class xsw0 extends ad5 {
    public final String A;
    public final a B;
    public final wiq0 C;
    public final rge D;
    public final hhs0 E;
    public final r0 F;
    public final q x;
    public final lg21 y;
    public final b z;

    public xsw0(q qVar, lg21 lg21Var, zow0 zow0Var, b bVar, String str, a aVar, wiq0 wiq0Var, rge rgeVar) {
        super(tsw0.class);
        this.x = qVar;
        this.y = lg21Var;
        this.z = bVar;
        this.A = str;
        this.B = aVar;
        this.C = wiq0Var;
        this.D = rgeVar;
        this.E = new hhs0(19, zow0Var, str);
        this.F = bvf0.c(kotlin.collections.b.f());
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        hhs0 hhs0Var = this.E;
        zow0 zow0Var = (zow0) hhs0Var.b;
        String str = (String) hhs0Var.c;
        zow0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("open_reason", str);
        zow0Var.a.a("SurgeCard.Closed", hashMap, 1, new HashMap());
    }
}
