package defpackage;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.s;

/* loaded from: classes.dex */
public final class zd60 implements ae60 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [wz40] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [e530] */
    /* JADX WARN: Type inference failed for: r7v1, types: [e530] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [e530] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.ae60
    public final boolean a(e530 e530Var) {
        ?? r0 = 0;
        while (true) {
            int i = 0;
            if (e530Var == 0) {
                return false;
            }
            if (e530Var instanceof gwd0) {
                ((gwd0) e530Var).o();
            } else if ((e530Var.getKindSet$ui() & 16) != 0 && (e530Var instanceof lqh)) {
                e530 e530Var2 = e530Var.b;
                r0 = r0;
                e530Var = e530Var;
                while (e530Var2 != null) {
                    if ((e530Var2.getKindSet$ui() & 16) != 0) {
                        i++;
                        r0 = r0;
                        if (i == 1) {
                            e530Var = e530Var2;
                        } else {
                            if (r0 == 0) {
                                r0 = new wz40(new e530[16]);
                            }
                            if (e530Var != 0) {
                                r0.b(e530Var);
                                e530Var = 0;
                            }
                            r0.b(e530Var2);
                        }
                    }
                    e530Var2 = e530Var2.getChild$ui();
                    r0 = r0;
                    e530Var = e530Var;
                }
                if (i == 1) {
                }
            }
            e530Var = qje.c(r0);
        }
    }

    @Override // defpackage.ae60
    public final int b() {
        return 16;
    }

    @Override // defpackage.ae60
    public final void e(LayoutNode layoutNode, long j, cnu cnuVar, int i, boolean z) {
        layoutNode.y(j, cnuVar, i, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [e530] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [e530] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [wz40] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [wz40] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.ae60
    public final boolean f(cnu cnuVar, LayoutNode layoutNode) {
        s sVar = (s) layoutNode.a0.e;
        sVar.getClass();
        e530 d1 = sVar.d1(ce60.h(16));
        if (d1 != null && d1.isAttached()) {
            if (!d1.getNode().isAttached()) {
                ixv.b("visitLocalDescendants called on an unattached node");
            }
            e530 node = d1.getNode();
            if ((node.getAggregateChildKindSet$ui() & 16) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui() & 16) != 0) {
                        lqh lqhVar = node;
                        ?? r3 = 0;
                        while (lqhVar != 0) {
                            if (lqhVar instanceof gwd0) {
                                if (((gwd0) lqhVar).A0()) {
                                    cnuVar.c = cnuVar.a.b - 1;
                                    return true;
                                }
                            } else if ((lqhVar.getKindSet$ui() & 16) != 0 && (lqhVar instanceof lqh)) {
                                e530 e530Var = lqhVar.b;
                                int i = 0;
                                lqhVar = lqhVar;
                                r3 = r3;
                                while (e530Var != null) {
                                    if ((e530Var.getKindSet$ui() & 16) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            lqhVar = e530Var;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new wz40(new e530[16]);
                                            }
                                            if (lqhVar != 0) {
                                                r3.b(lqhVar);
                                                lqhVar = 0;
                                            }
                                            r3.b(e530Var);
                                        }
                                    }
                                    e530Var = e530Var.getChild$ui();
                                    lqhVar = lqhVar;
                                    r3 = r3;
                                }
                                if (i == 1) {
                                }
                            }
                            lqhVar = qje.c(r3);
                        }
                    }
                    node = node.getChild$ui();
                }
            }
        }
        return false;
    }

    @Override // defpackage.ae60
    public final boolean i(LayoutNode layoutNode) {
        return true;
    }
}
