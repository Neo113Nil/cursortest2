package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class z590 extends e530 implements v0y {
    public float a;
    public float b;
    public float c;
    public float w;
    public boolean x;

    @Override // defpackage.v0y
    public final aa10 e(k kVar, x910 x910Var, long j) {
        int f0 = kVar.f0(this.c) + kVar.f0(this.a);
        int f02 = kVar.f0(this.w) + kVar.f0(this.b);
        o l0 = x910Var.l0(p8e.i(-f0, -f02, j));
        return kVar.w(p8e.g(l0.a + f0, j), p8e.f(l0.b + f02, j), b.f(), new zl50(23, this, l0));
    }
}
