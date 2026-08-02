package defpackage;

import com.yandex.go.layers.api.model.params.Mode;
import ru.yandex.taxi.masstransit.d;

/* loaded from: classes6.dex */
public final class uz00 implements cp30 {
    public final /* synthetic */ d a;
    public final /* synthetic */ igu0 b;
    public final /* synthetic */ sls c;
    public final /* synthetic */ Mode w;
    public final /* synthetic */ e310 x;

    public uz00(d dVar, igu0 igu0Var, sls slsVar, Mode mode, e310 e310Var) {
        this.a = dVar;
        this.b = igu0Var;
        this.c = slsVar;
        this.w = mode;
        this.x = e310Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        Mode mode = Mode.MASSTRANSIT;
        Mode mode2 = this.w;
        d dVar = this.a;
        if (mode2 == mode) {
            dVar.c0(this.x);
        } else {
            dVar.r(new qu(9));
        }
        this.c.invoke();
    }

    @Override // defpackage.cp30
    public final void m() {
        d.Q(this.a, new pq30(this.b));
        this.c.invoke();
    }
}
