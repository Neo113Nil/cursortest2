package defpackage;

import com.yandex.go.chargers.data.e;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class zba extends ad5 {
    public final String A;
    public final c29 B;
    public final em9 x;
    public final e y;
    public final eca z;

    public zba(em9 em9Var, e eVar, eca ecaVar, String str, c29 c29Var) {
        super(xba.class);
        this.x = em9Var;
        this.y = eVar;
        this.z = ecaVar;
        this.A = str;
        this.B = c29Var;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        em9 em9Var = this.x;
        em9Var.a.a("Chargers.OrderDetails.Closed", b64.w(em9Var), 1, new HashMap());
        super.Cg();
    }
}
