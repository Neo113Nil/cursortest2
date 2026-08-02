package defpackage;

import com.yandex.div2.DivSizeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class xcl implements c4x, hex {
    public final exq a;
    public final exq b;
    public final exq c;
    public final exq d;

    static {
        new pcl();
        ngd0.m(DivSizeUnit.DP);
        ngd0.m(Double.valueOf(1.0d));
    }

    public xcl(exq exqVar, exq exqVar2, exq exqVar3, exq exqVar4) {
        this.a = exqVar;
        this.b = exqVar2;
        this.c = exqVar3;
        this.d = exqVar4;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((dcl) ft6.b.Z7.getValue()).b(ft6.a, this);
    }
}
