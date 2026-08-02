package defpackage;

import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivImageScale;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class wsk implements c4x, hex {
    public final exq a;
    public final exq b;
    public final exq c;
    public final exq d;
    public final exq e;
    public final exq f;
    public final exq g;

    static {
        ngd0.m(Double.valueOf(1.0d));
        ngd0.m(DivAlignmentHorizontal.CENTER);
        ngd0.m(DivAlignmentVertical.CENTER);
        ngd0.m(Boolean.FALSE);
        ngd0.m(DivImageScale.FILL);
    }

    public wsk(exq exqVar, exq exqVar2, exq exqVar3, exq exqVar4, exq exqVar5, exq exqVar6, exq exqVar7) {
        this.a = exqVar;
        this.b = exqVar2;
        this.c = exqVar3;
        this.d = exqVar4;
        this.e = exqVar5;
        this.f = exqVar6;
        this.g = exqVar7;
    }

    @Override // defpackage.c4x
    public final JSONObject r() {
        return ((usk) ft6.b.g4.getValue()).b(ft6.a, this);
    }
}
