package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class kqn {
    public static final String c;
    public final qqn a;
    public final vtm b;

    static {
        String str = xhw.w;
        c = "YnisonCore:".concat("Redirector");
    }

    public kqn(qqn qqnVar, vtm vtmVar) {
        vtmVar.getClass();
        this.a = qqnVar;
        this.b = vtmVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dc, code lost:
    
        if (r12 == r1) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00dc -> B:13:0x00df). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(kqn kqnVar, cg6 cg6Var) {
        iqn iqnVar;
        int i;
        vqn vqnVar;
        vqn vqnVar2;
        dow dowVar;
        r76 i2;
        int i3;
        Object L;
        e7v e7vVar;
        z0i z0iVar;
        if (cg6Var instanceof iqn) {
            iqnVar = (iqn) cg6Var;
            int i4 = iqnVar.m;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                iqnVar.m = i4 - Integer.MIN_VALUE;
                Object obj = iqnVar.k;
                nm6 nm6Var = nm6.a;
                i = iqnVar.m;
                String str = c;
                int i5 = 2;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    vqnVar = new vqn();
                    e7vVar = new e7v(((bew) kqnVar.b.a).a.c(), 21);
                    z0iVar = new z0i(i5, 16, continuation);
                    iqnVar.j = vqnVar;
                    iqnVar.m = 1;
                    if (zsd.h0(e7vVar, z0iVar, iqnVar) != nm6Var) {
                    }
                    return nm6Var;
                }
                if (i == 1) {
                    vqnVar2 = iqnVar.j;
                    qgg.h0(obj);
                    dowVar = (dow) kqnVar.a.b.get();
                    if (dowVar != null) {
                    }
                    if (i2 != null) {
                    }
                    if (i3 != -1) {
                    }
                    jqn jqnVar = new jqn(kqnVar, continuation, 0);
                    iqnVar.j = vqnVar2;
                    iqnVar.m = 2;
                    L = tyf.L(1000L, jqnVar, iqnVar);
                    if (L != nm6Var) {
                    }
                    return nm6Var;
                }
                if (i == 2) {
                    vqnVar2 = iqnVar.j;
                    qgg.h0(obj);
                } else if (i == 3) {
                    vqnVar2 = iqnVar.j;
                    qgg.h0(obj);
                } else {
                    if (i != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vqnVar2 = iqnVar.j;
                    qgg.h0(obj);
                }
                vqnVar = vqnVar2;
                if (vqnVar.a >= 3) {
                    ssg.a(6, str, "too many transient errors", null);
                    return new ypn(r76.c);
                }
                e7vVar = new e7v(((bew) kqnVar.b.a).a.c(), 21);
                z0iVar = new z0i(i5, 16, continuation);
                iqnVar.j = vqnVar;
                iqnVar.m = 1;
                if (zsd.h0(e7vVar, z0iVar, iqnVar) != nm6Var) {
                    vqnVar2 = vqnVar;
                    dowVar = (dow) kqnVar.a.b.get();
                    if (dowVar != null) {
                        i2 = null;
                    } else {
                        mc4 mc4Var = (mc4) dowVar.b;
                        mc4Var.getClass();
                        i2 = ((t7h) mc4Var).i(false);
                    }
                    i3 = i2 != null ? -1 : hqn.a[i2.ordinal()];
                    if (i3 != -1) {
                        if (i3 == 1) {
                            return zpn.a;
                        }
                        if (i3 == 2) {
                            return new ypn(r76.e);
                        }
                        if (i3 != 3) {
                            if (i3 == 4) {
                                jqn jqnVar2 = new jqn(kqnVar, continuation, 1);
                                iqnVar.j = vqnVar2;
                                iqnVar.m = 3;
                                Object L2 = tyf.L(25000L, jqnVar2, iqnVar);
                                if (L2 != nm6Var) {
                                    vqnVar = vqnVar2;
                                    if (vqnVar.a >= 3) {
                                    }
                                    e7vVar = new e7v(((bew) kqnVar.b.a).a.c(), 21);
                                    z0iVar = new z0i(i5, 16, continuation);
                                    iqnVar.j = vqnVar;
                                    iqnVar.m = 1;
                                    if (zsd.h0(e7vVar, z0iVar, iqnVar) != nm6Var) {
                                    }
                                }
                            } else {
                                if (i3 != 5) {
                                    b6e.s();
                                    return null;
                                }
                                int i6 = vqnVar2.a + 1;
                                vqnVar2.a = i6;
                                ssg.a(2, str, "transient failure: " + i6, null);
                                jqn jqnVar3 = new jqn(kqnVar, continuation, 2);
                                iqnVar.j = vqnVar2;
                                iqnVar.m = 4;
                                obj = tyf.L(5000L, jqnVar3, iqnVar);
                            }
                        }
                    }
                    jqn jqnVar4 = new jqn(kqnVar, continuation, 0);
                    iqnVar.j = vqnVar2;
                    iqnVar.m = 2;
                    L = tyf.L(1000L, jqnVar4, iqnVar);
                    if (L != nm6Var) {
                        vqnVar = vqnVar2;
                        if (vqnVar.a >= 3) {
                        }
                        e7vVar = new e7v(((bew) kqnVar.b.a).a.c(), 21);
                        z0iVar = new z0i(i5, 16, continuation);
                        iqnVar.j = vqnVar;
                        iqnVar.m = 1;
                        if (zsd.h0(e7vVar, z0iVar, iqnVar) != nm6Var) {
                        }
                    }
                }
                return nm6Var;
            }
        }
        iqnVar = new iqn(kqnVar, cg6Var);
        Object obj2 = iqnVar.k;
        nm6 nm6Var2 = nm6.a;
        i = iqnVar.m;
        String str2 = c;
        int i52 = 2;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }
}
