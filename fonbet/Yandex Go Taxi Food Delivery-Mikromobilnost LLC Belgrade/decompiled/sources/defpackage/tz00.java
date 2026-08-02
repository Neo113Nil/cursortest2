package defpackage;

import com.yandex.go.layers.api.model.params.Mode;
import ru.yandex.taxi.masstransit.d;

/* loaded from: classes6.dex */
public final class tz00 implements cp30 {
    public final /* synthetic */ Mode a;
    public final /* synthetic */ d b;
    public final /* synthetic */ e310 c;

    public tz00(Mode mode, d dVar, e310 e310Var) {
        this.a = mode;
        this.b = dVar;
        this.c = e310Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        Mode mode = Mode.MASSTRANSIT;
        Mode mode2 = this.a;
        d dVar = this.b;
        if (mode2 == mode) {
            dVar.c0(this.c);
        } else {
            dVar.r(new qu(9));
        }
    }

    @Override // defpackage.cp30
    public final void m() {
    }
}
