package q;

import F.i;
import android.graphics.drawable.Drawable;

/* renamed from: q.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0331b {
    public void a(i iVar, float f2) {
        c cVar = (c) ((Drawable) iVar.f208b);
        AbstractC0330a abstractC0330a = (AbstractC0330a) iVar.f209c;
        boolean useCompatPadding = abstractC0330a.getUseCompatPadding();
        boolean preventCornerOverlap = abstractC0330a.getPreventCornerOverlap();
        if (f2 != cVar.e || cVar.f4228f != useCompatPadding || cVar.f4229g != preventCornerOverlap) {
            cVar.e = f2;
            cVar.f4228f = useCompatPadding;
            cVar.f4229g = preventCornerOverlap;
            cVar.b(null);
            cVar.invalidateSelf();
        }
        if (!abstractC0330a.getUseCompatPadding()) {
            iVar.I(0, 0, 0, 0);
            return;
        }
        c cVar2 = (c) ((Drawable) iVar.f208b);
        float f3 = cVar2.e;
        float f4 = cVar2.f4224a;
        int ceil = (int) Math.ceil(d.a(f3, f4, abstractC0330a.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(d.b(f3, f4, abstractC0330a.getPreventCornerOverlap()));
        iVar.I(ceil, ceil2, ceil, ceil2);
    }
}
