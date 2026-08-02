package defpackage;

import android.net.Uri;
import androidx.media3.common.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class r4j0 extends s4j0 {
    public final l7s0 A;
    public final Uri y;
    public final w6i0 z;

    public r4j0(a aVar, List list, b8q0 b8q0Var, ArrayList arrayList) {
        super(aVar, list, b8q0Var, arrayList);
        this.y = Uri.parse(((ic5) list.get(0)).a);
        long j = b8q0Var.e;
        w6i0 w6i0Var = j <= 0 ? null : new w6i0(null, b8q0Var.d, j);
        this.z = w6i0Var;
        this.A = w6i0Var == null ? new l7s0(new w6i0(null, 0L, -1L)) : null;
    }

    @Override // defpackage.s4j0
    public final String a() {
        return null;
    }

    @Override // defpackage.s4j0
    public final pgg b() {
        return this.A;
    }

    @Override // defpackage.s4j0
    public final w6i0 c() {
        return this.z;
    }
}
