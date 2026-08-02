package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class wmt {
    public static final ym0 f = new ym0(0.0f);
    public final rzt a;
    public long b = Long.MIN_VALUE;
    public ym0 c = f;
    public boolean d;
    public float e;

    public wmt(tm0 tm0Var) {
        this.a = tm0Var.a(azt.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:
    
        if (r13 != 0.0f) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
    
        if (defpackage.bzf.D(r2.getContext()).P(r0, r2) == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r14v0, types: [t03] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v2, types: [wmt] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b6 -> B:24:0x00b9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(lj0 lj0Var, t03 t03Var, cg6 cg6Var) {
        vmt vmtVar;
        int i;
        vmt vmtVar2;
        Function0 function0;
        lj0 lj0Var2;
        float f2;
        wmt wmtVar;
        Function0 function02;
        wmt wmtVar2;
        try {
            if (cg6Var instanceof vmt) {
                vmtVar = (vmt) cg6Var;
                int i2 = vmtVar.p;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    vmtVar.p = i2 - Integer.MIN_VALUE;
                    Object obj = vmtVar.n;
                    nm6 nm6Var = nm6.a;
                    i = vmtVar.p;
                    ym0 ym0Var = f;
                    if (i != 0) {
                        qgg.h0(obj);
                        if (this.d) {
                            vme.c("animateToZero called while previous animation is running");
                        }
                        hei heiVar = (hei) vmtVar.getContext().get(e88.f);
                        float I = heiVar != null ? heiVar.I() : 1.0f;
                        this.d = true;
                        vmtVar2 = vmtVar;
                        function0 = t03Var;
                        lj0Var2 = lj0Var;
                        f2 = I;
                        wmtVar = this;
                        if (Math.abs(wmtVar.e) >= 0.01f) {
                            yf0 yf0Var = new yf0(wmtVar, f2, lj0Var2);
                            vmtVar2.j = wmtVar;
                            vmtVar2.k = lj0Var2;
                            vmtVar2.l = function0;
                            vmtVar2.m = f2;
                            vmtVar2.p = 1;
                            if (bzf.D(vmtVar2.getContext()).P(yf0Var, vmtVar2) == nm6Var) {
                                return nm6Var;
                            }
                            function0.invoke();
                        }
                        wmt wmtVar3 = wmtVar;
                        lj0 lj0Var3 = lj0Var2;
                        wmt wmtVar4 = wmtVar3;
                        function02 = function0;
                        if (Math.abs(wmtVar4.e) == 0.0f) {
                            wmtVar2 = wmtVar4;
                            wmtVar2.b = Long.MIN_VALUE;
                            wmtVar2.c = ym0Var;
                            wmtVar2.d = false;
                            return Unit.a;
                        }
                        gcp gcpVar = new gcp(23, wmtVar4, lj0Var3);
                        vmtVar2.j = wmtVar4;
                        vmtVar2.k = function02;
                        vmtVar2.l = null;
                        vmtVar2.p = 2;
                        t03Var = wmtVar4;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            function02 = (Function0) vmtVar.k;
                            wmt wmtVar5 = vmtVar.j;
                            qgg.h0(obj);
                            t03Var = wmtVar5;
                            function02.invoke();
                            wmtVar2 = t03Var;
                            wmtVar2.b = Long.MIN_VALUE;
                            wmtVar2.c = ym0Var;
                            wmtVar2.d = false;
                            return Unit.a;
                        }
                        f2 = vmtVar.m;
                        Function0 function03 = vmtVar.l;
                        ?? r2 = (Function1) vmtVar.k;
                        wmt wmtVar6 = vmtVar.j;
                        try {
                            qgg.h0(obj);
                            vmt vmtVar3 = vmtVar;
                            function0 = function03;
                            lj0Var2 = r2;
                            vmtVar2 = vmtVar3;
                            wmtVar = wmtVar6;
                        } catch (Throwable th) {
                            th = th;
                            t03Var = wmtVar6;
                            t03Var.b = Long.MIN_VALUE;
                            t03Var.c = ym0Var;
                            t03Var.d = false;
                            throw th;
                        }
                        try {
                            function0.invoke();
                        } catch (Throwable th2) {
                            th = th2;
                            t03Var = wmtVar;
                            t03Var.b = Long.MIN_VALUE;
                            t03Var.c = ym0Var;
                            t03Var.d = false;
                            throw th;
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        vmtVar = new vmt(this, cg6Var);
        Object obj2 = vmtVar.n;
        nm6 nm6Var2 = nm6.a;
        i = vmtVar.p;
        ym0 ym0Var2 = f;
    }
}
