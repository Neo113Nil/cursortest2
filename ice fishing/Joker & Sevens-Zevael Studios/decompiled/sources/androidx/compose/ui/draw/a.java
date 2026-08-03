package androidx.compose.ui.draw;

import f1.l;
import k1.b;
import oc.c;
import v1.i;
import y0.f;
import y0.n;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class a {
    public static final n a(n nVar, c cVar) {
        return nVar.d(new DrawBehindElement(cVar));
    }

    public static n b(n nVar, b bVar, i iVar, float f10, l lVar, int i10) {
        f fVar = y0.c.f8423k;
        if ((i10 & 16) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i10 & 32) != 0) {
            lVar = null;
        }
        return nVar.d(new PainterElement(bVar, fVar, iVar, f11, lVar));
    }
}
