package androidx.compose.foundation;

import e2.g;
import f1.g0;
import uc.e;
import w.i0;
import w.o;
import w.o0;
import y.i;
import y0.k;
import y0.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a {
    public static final n a(n nVar, long j3, g0 g0Var) {
        return nVar.d(new BackgroundElement(j3, g0Var));
    }

    public static final n b(n nVar, i iVar, i0 i0Var, boolean z10, g gVar, oc.a aVar) {
        n k3;
        if (i0Var instanceof o0) {
            k3 = new ClickableElement(iVar, (o0) i0Var, z10, gVar, aVar);
        } else if (i0Var == null) {
            k3 = new ClickableElement(iVar, null, z10, gVar, aVar);
        } else if (iVar != null) {
            k3 = c.a(i0Var, iVar).d(new ClickableElement(iVar, null, z10, gVar, aVar));
        } else {
            k3 = e.k(k.f8442a, new b(i0Var, z10, gVar, aVar));
        }
        return nVar.d(k3);
    }

    public static /* synthetic */ n c(n nVar, i iVar, i0 i0Var, boolean z10, g gVar, oc.a aVar, int i10) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            gVar = null;
        }
        return b(nVar, iVar, i0Var, z11, gVar, aVar);
    }

    public static n d(n nVar, boolean z10, oc.a aVar, int i10) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return e.k(nVar, new o(z10, aVar));
    }
}
