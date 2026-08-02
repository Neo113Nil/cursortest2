package defpackage;

import ru.yandex.taxi.costcenters.api.CostCenterField;

/* loaded from: classes5.dex */
public final class uwe {
    public final j5z a;
    public final zwe b;
    public final CostCenterField c;

    public uwe(j5z j5zVar, zwe zweVar, CostCenterField costCenterField) {
        this.a = j5zVar;
        this.b = zweVar;
        this.c = costCenterField;
    }

    public final boolean a(String str) {
        if (this.c.d) {
            return (str == null || evu0.J(str)) ? false : true;
        }
        return true;
    }
}
