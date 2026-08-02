package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v8b extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ x8b s;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v8b(x8b x8bVar, long j, int i) {
        super(1);
        this.r = i;
        this.s = x8bVar;
        this.t = j;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [kotlin.jvm.functions.Function1, uif] */
    /* JADX WARN: Type inference failed for: r1v15, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        int ordinal;
        switch (this.r) {
            case 0:
                int ordinal2 = ((r8b) obj).ordinal();
                x8b x8bVar = this.s;
                long j2 = this.t;
                if (ordinal2 == 0) {
                    bc4 bc4Var = x8bVar.t.a.c;
                    if (bc4Var != null) {
                        j2 = ((hqe) bc4Var.b.invoke(new hqe(j2))).a;
                    }
                } else if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        b6e.s();
                        return null;
                    }
                    bc4 bc4Var2 = x8bVar.u.a.c;
                    if (bc4Var2 != null) {
                        j2 = ((hqe) bc4Var2.b.invoke(new hqe(j2))).a;
                    }
                }
                return new hqe(j2);
            case 1:
                r8b r8bVar = (r8b) obj;
                x8b x8bVar2 = this.s;
                if (x8bVar2.x != null && x8bVar2.U0() != null && !Intrinsics.d(x8bVar2.x, x8bVar2.U0()) && (ordinal = r8bVar.ordinal()) != 0 && ordinal != 1) {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    bc4 bc4Var3 = x8bVar2.u.a.c;
                    if (bc4Var3 != null) {
                        Function1 function1 = bc4Var3.b;
                        long j3 = this.t;
                        long j4 = ((hqe) function1.invoke(new hqe(j3))).a;
                        g40 U0 = x8bVar2.U0();
                        U0.getClass();
                        xof xofVar = xof.a;
                        long a = ((iz2) U0).a(j3, j4, xofVar);
                        g40 g40Var = x8bVar2.x;
                        g40Var.getClass();
                        j = wpe.c(a, g40Var.a(j3, j4, xofVar));
                        return new wpe(j);
                    }
                }
                j = 0;
                return new wpe(j);
            default:
                r8b r8bVar2 = (r8b) obj;
                x8b x8bVar3 = this.s;
                ysq ysqVar = x8bVar3.t.a.b;
                long j5 = this.t;
                long j6 = 0;
                long j7 = ysqVar != null ? ((wpe) ysqVar.a.invoke(new hqe(j5))).a : 0L;
                ysq ysqVar2 = x8bVar3.u.a.b;
                long j8 = ysqVar2 != null ? ((wpe) ysqVar2.a.invoke(new hqe(j5))).a : 0L;
                int ordinal3 = r8bVar2.ordinal();
                if (ordinal3 == 0) {
                    j6 = j7;
                } else if (ordinal3 != 1) {
                    if (ordinal3 != 2) {
                        b6e.s();
                        return null;
                    }
                    j6 = j8;
                }
                return new wpe(j6);
        }
    }
}
