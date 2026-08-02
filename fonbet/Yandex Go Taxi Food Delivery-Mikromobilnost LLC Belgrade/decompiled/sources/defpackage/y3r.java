package defpackage;

import com.yandex.mapkit.map.MapObject;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes6.dex */
public abstract class y3r extends lvu0 {
    public int j;
    public int k;
    public boolean l;

    public y3r(Serializable serializable, Class cls) {
        super(cls, serializable);
        this.j = -39424;
        this.k = -1711315456;
    }

    @Override // defpackage.lvu0, defpackage.u15, defpackage.ap00
    public final void f() {
        super.f();
        v(this.g, this.j);
        s(this.g, this.k);
        t(this.g, this.l);
    }

    public final void r(int i) {
        this.k = i;
        s(this.g, i);
    }

    public abstract void s(MapObject mapObject, int i);

    public abstract void t(MapObject mapObject, boolean z);

    public final void u(int i) {
        this.j = i;
        v(this.g, i);
    }

    public abstract void v(MapObject mapObject, int i);
}
