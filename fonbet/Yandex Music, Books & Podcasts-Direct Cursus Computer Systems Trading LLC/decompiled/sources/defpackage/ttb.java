package defpackage;

import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.a;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class ttb implements pyc {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ttb(kbj kbjVar, boolean z, xme xmeVar, boolean z2, ges gesVar) {
        this.d = kbjVar;
        this.b = z;
        this.e = xmeVar;
        this.c = z2;
        this.f = gesVar;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        yci a;
        switch (this.a) {
            case 0:
                pbu pbuVar = (pbu) this.d;
                Function0 function0 = (Function0) this.e;
                Function1 function1 = (Function1) this.f;
                hq5 hq5Var = (hq5) obj2;
                ((Integer) obj3).getClass();
                ((am0) obj).getClass();
                yci yciVar = vci.a;
                t7g.j(pbuVar, a.a(yciVar, "video_shot"), null, null, hq5Var, 48, 12);
                oq5 oq5Var = (oq5) hq5Var;
                if (pbuVar instanceof obu) {
                    oq5Var.Z(1092885199);
                    boolean f = oq5Var.f(function0);
                    Object K = oq5Var.K();
                    if (f || K == gq5.a) {
                        K = new om0(function0, null, 2);
                        oq5Var.k0(K);
                    }
                    gld.w(oq5Var, pbuVar, (Function2) K);
                    if (this.b) {
                        oq5Var.Z(1092996241);
                        a = androidx.compose.foundation.a.b(yciVar, ((dq0) oq5Var.j(eq0.a)).c.d, vnj.i);
                        oq5Var.p(false);
                    } else {
                        oq5Var.Z(1093096588);
                        oq5Var.p(false);
                        Pair pair = new Pair(Float.valueOf(0.0f), new d85(c3x.h(2147483648L)));
                        Float valueOf = Float.valueOf(0.2f);
                        long j = d85.m;
                        a = androidx.compose.foundation.a.a(yciVar, y9w.U(new Pair[]{pair, new Pair(valueOf, new d85(j)), new Pair(Float.valueOf(0.5f), new d85(j)), new Pair(Float.valueOf(1.0f), new d85(c3x.h(2147483648L)))}, 14));
                    }
                    yci f2 = d.c(yciVar, 1.0f).f(a);
                    if (this.c) {
                        oq5Var.Z(1974944988);
                        yciVar = gut.q1(6, oq5Var, yciVar, function1);
                    } else {
                        oq5Var.Z(1974946118);
                    }
                    oq5Var.p(false);
                    u1g.l(oq5Var, f2.f(yciVar));
                } else {
                    oq5Var.Z(1072824324);
                }
                oq5Var.p(false);
                break;
            default:
                kbj kbjVar = (kbj) this.d;
                xme xmeVar = (xme) this.e;
                ges gesVar = (ges) this.f;
                c cVar = (c) obj;
                hq5 hq5Var2 = (hq5) obj2;
                int intValue = ((Integer) obj3).intValue();
                cVar.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    oq5 oq5Var2 = (oq5) hq5Var2;
                    if (oq5Var2.z()) {
                        oq5Var2.S();
                        break;
                    }
                }
                xv7.i(new mn0(6, kbjVar.b, (ArrayList) null), a.a(d.d(vci.a, 1.0f), "non_music_list_item_title"), ((dq0) ((oq5) hq5Var2).j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, this.b ? 2 : 1, 0, bow.l(xmeVar), null, gesVar, this.c ? bow.k(cVar, new xme[]{xmeVar}) : null, null, hq5Var2, 48, 134217776, 612344);
        }
        return Unit.a;
    }

    public /* synthetic */ ttb(pbu pbuVar, Function0 function0, boolean z, boolean z2, Function1 function1) {
        this.d = pbuVar;
        this.e = function0;
        this.b = z;
        this.c = z2;
        this.f = function1;
    }
}
