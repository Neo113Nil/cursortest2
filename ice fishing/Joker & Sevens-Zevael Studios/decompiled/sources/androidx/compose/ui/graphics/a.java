package androidx.compose.ui.graphics;

import f1.d0;
import f1.g0;
import f1.j0;
import f1.v;
import oc.c;
import y0.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a {
    public static final n a(n nVar, c cVar) {
        return nVar.d(new BlockGraphicsLayerElement(cVar));
    }

    public static n b(n nVar, float f10, g0 g0Var, int i10) {
        if ((i10 & 32) != 0) {
            f10 = 0.0f;
        }
        float f11 = f10;
        long j3 = j0.f2266b;
        if ((i10 & 2048) != 0) {
            g0Var = d0.f2219a;
        }
        long j6 = v.f2289a;
        return nVar.d(new GraphicsLayerElement(1.0f, 1.0f, f11, j3, g0Var, false, j6, j6));
    }

    public static n c(n nVar, float f10, float f11, g0 g0Var, int i10) {
        float f12 = (i10 & 1) != 0 ? 1.0f : f10;
        float f13 = (i10 & 2) != 0 ? 1.0f : f11;
        long j3 = j0.f2266b;
        g0 g0Var2 = (i10 & 2048) != 0 ? d0.f2219a : g0Var;
        boolean z10 = (i10 & 4096) == 0;
        long j6 = v.f2289a;
        return nVar.d(new GraphicsLayerElement(f12, f13, 0.0f, j3, g0Var2, z10, j6, j6));
    }
}
