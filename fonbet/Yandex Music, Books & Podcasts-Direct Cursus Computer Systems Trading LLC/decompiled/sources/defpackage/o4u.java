package defpackage;

import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.a;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class o4u implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ z9u b;
    public final /* synthetic */ xme c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ o4u(z9u z9uVar, xme xmeVar, boolean z, int i) {
        this.a = i;
        this.b = z9uVar;
        this.c = xmeVar;
        this.d = z;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                c cVar = (c) obj;
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var).f(cVar) ? 4 : 2;
                }
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 19) != 18)) {
                    mn0 mn0Var = new mn0(this.b.e);
                    ges j = nu0.j();
                    long j2 = ((dq0) oq5Var.j(eq0.a)).b.a;
                    xme xmeVar = this.c;
                    xv7.i(mn0Var, a.a(vci.a, "video_clip_title"), j2, 0L, 0L, 0, 0L, 2, false, 1, 0, bow.l(xmeVar), null, j, this.d ? bow.k(cVar, new xme[]{xmeVar}) : null, null, oq5Var, 48, 134220848, 612344);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                c cVar2 = (c) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                cVar2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((oq5) hq5Var2).f(cVar2) ? 4 : 2;
                }
                oq5 oq5Var2 = (oq5) hq5Var2;
                if (oq5Var2.P(intValue2 & 1, (intValue2 & 19) != 18)) {
                    mn0 mn0Var2 = new mn0(this.b.e);
                    ges j3 = nu0.j();
                    long j4 = ((dq0) oq5Var2.j(eq0.a)).b.a;
                    xme xmeVar2 = this.c;
                    xv7.i(mn0Var2, a.a(vci.a, "clip_title"), j4, 0L, 0L, 0, 0L, 2, false, 1, 0, bow.l(xmeVar2), null, j3, this.d ? bow.k(cVar2, new xme[]{xmeVar2}) : null, null, oq5Var2, 48, 134220848, 612344);
                } else {
                    oq5Var2.S();
                }
                break;
        }
        return Unit.a;
    }
}
