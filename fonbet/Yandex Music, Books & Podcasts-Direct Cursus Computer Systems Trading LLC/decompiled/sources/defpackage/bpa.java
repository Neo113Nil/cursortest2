package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bpa extends hoa {
    public boolean A;
    public pyc B;
    public pyc C;
    public boolean D;
    public cpa y;
    public bxj z;

    @Override // defpackage.hoa
    public final Object Z0(Function2 function2, Continuation continuation) {
        Object a = this.y.a(hqi.b, new j57((goa) function2, this, (Continuation) null, 19), continuation);
        return a == nm6.a ? a : Unit.a;
    }

    @Override // defpackage.hoa
    public final void a1(long j) {
        if (!this.n || Intrinsics.d(this.B, zoa.a)) {
            return;
        }
        x97.y(G0(), null, pm6.d, new apa(this, j, null, 0), 1);
    }

    @Override // defpackage.hoa
    public final void b1(long j) {
        if (!this.n || Intrinsics.d(this.C, zoa.b)) {
            return;
        }
        x97.y(G0(), null, pm6.d, new apa(this, j, null, 1), 1);
    }

    @Override // defpackage.hoa
    public final boolean c1() {
        return this.A;
    }
}
