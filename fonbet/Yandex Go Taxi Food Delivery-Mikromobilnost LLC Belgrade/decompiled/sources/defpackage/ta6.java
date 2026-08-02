package defpackage;

import androidx.compose.ui.draw.a;
import androidx.compose.ui.draw.b;
import androidx.compose.ui.semantics.f;

/* loaded from: classes10.dex */
public final class ta6 extends lqh implements gnq0 {
    public na6 c;
    public float w;
    public ml6 x;
    public ehr0 y;
    public final a z;

    public ta6(float f, ml6 ml6Var, ehr0 ehr0Var) {
        this.w = f;
        this.x = ml6Var;
        this.y = ehr0Var;
        a aVar = new a(new b(), new kv5(15, this));
        E0(aVar);
        this.z = aVar;
    }

    @Override // defpackage.gnq0
    public final boolean U() {
        return false;
    }

    @Override // defpackage.e530
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // defpackage.gnq0
    public final void u(mnq0 mnq0Var) {
        f.r(mnq0Var, this.y);
    }
}
