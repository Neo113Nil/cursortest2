package defpackage;

import androidx.compose.ui.node.u;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public final class th4 extends e530 implements pam, dr60, fud {
    public boolean A;
    public wp2 a;
    public ehr0 b;
    public long c;
    public LayoutDirection w;
    public ix80 x;
    public ehr0 y;
    public long z;

    public final void E0() {
        this.z = tje.o(this.a, (ry2) npb1.c(this, uy2.a), ((ldc) npb1.c(this, k2z.a)).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, ix80] */
    @Override // defpackage.pam
    public final void d(c1y c1yVar) {
        c1y c1yVar2;
        k28 k28Var = c1yVar.a;
        if (this.A) {
            E0();
            this.A = false;
        }
        if (this.b == qke.q) {
            c1yVar2 = c1yVar;
            qam.t0(c1yVar2, this.z, 0L, 0L, 0.0f, null, HProv.PP_DELETE_SAVED_PASSWD);
        } else {
            c1yVar2 = c1yVar;
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            if (cjs0.a(k28Var.c(), this.c) && c1yVar2.getLayoutDirection() == this.w && jl40.l(this.y, this.b)) {
                ref$ObjectRef.element = this.x;
            } else {
                u.e(this, new sb0(5, ref$ObjectRef, this, c1yVar2));
            }
            this.x = (ix80) ref$ObjectRef.element;
            this.c = k28Var.c();
            this.w = c1yVar2.getLayoutDirection();
            this.y = this.b;
            jd00.e(c1yVar2, (ix80) ref$ObjectRef.element, this.z);
        }
        c1yVar2.a();
    }

    @Override // defpackage.dr60
    public final void e0() {
        u.e(this, new f02(12, this));
        this.c = 9205357640488583168L;
        this.w = null;
        this.x = null;
        this.y = null;
        rzo.D(this);
    }

    @Override // defpackage.e530
    public final void onAttach() {
        u.e(this, new f02(12, this));
    }
}
