package defpackage;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes11.dex */
public abstract class uh91 {
    public static final omy0 a = new omy0();
    public static final wbz0 b = new wbz0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static final void a(uoj uojVar, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar;
        c530 c530Var;
        boolean z;
        bts btsVar2;
        int i2;
        ?? r0;
        bts btsVar3;
        bts btsVar4;
        f530 f530Var3;
        bts btsVar5 = (bts) fidVar;
        btsVar5.g0(230222240);
        dmw0 dmw0Var = btsVar5.a;
        int i3 = i | (btsVar5.k(uojVar) ? 4 : 2) | 48 | (btsVar5.e(tlsVar) ? 256 : 128);
        if (btsVar5.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var2 = c530.a;
            f530 d = ooc.d(ljs0.c(c530Var2, 1.0f), null, 3);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar5.T);
            r1b0 o = btsVar5.o();
            f530 d3 = b.d(btsVar5, d);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar5.i0();
            if (btsVar5.S) {
                btsVar5.n(slsVar);
            } else {
                btsVar5.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar5, wlsVar, d2);
            wls wlsVar2 = d.e;
            qje.W(btsVar5, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar5, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar5, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar5, wlsVar4, d3);
            if (uojVar != null) {
                btsVar5.e0(-357643347);
                f530 l = an91.l(ljs0.c(c530Var2, 1.0f), 16.0f, 8.0f);
                lhl0 a2 = khl0.a(new i43(2.0f, true, new m6(9, x4c.H)), x4c.E, btsVar5, 54);
                int hashCode2 = Long.hashCode(btsVar5.T);
                r1b0 o2 = btsVar5.o();
                f530 d4 = b.d(btsVar5, l);
                btsVar5.i0();
                if (btsVar5.S) {
                    btsVar5.n(slsVar);
                } else {
                    btsVar5.r0();
                }
                qje.W(btsVar5, wlsVar, a2);
                qje.W(btsVar5, wlsVar2, o2);
                vfc.v(hashCode2, btsVar5, wlsVar3, btsVar5, tlsVar2);
                qje.W(btsVar5, wlsVar4, d4);
                if (uojVar.a != null) {
                    btsVar5.e0(1078215230);
                    i2 = i3;
                    String str = uojVar.a;
                    AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
                    ety0 ety0Var = xya1.e(btsVar5).h.a;
                    r0 = 0;
                    c530Var = c530Var2;
                    jeb1.f(str, null, appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar5, 384, 0, 16378);
                    bts btsVar6 = btsVar5;
                    btsVar6.t(false);
                    btsVar3 = btsVar6;
                } else {
                    i2 = i3;
                    c530Var = c530Var2;
                    bts btsVar7 = btsVar5;
                    r0 = 0;
                    btsVar7.e0(1078398781);
                    btsVar7.t(false);
                    btsVar3 = btsVar7;
                }
                if (uojVar.b != null) {
                    btsVar3.e0(1078461897);
                    if (uojVar.c != null) {
                        btsVar3.e0(1078523277);
                        awk0 awk0Var = new awk0(r0);
                        boolean z2 = ((i2 & 14) == 4 ? true : r0) | ((i2 & 896) == 256 ? true : r0);
                        Object Q = btsVar3.Q();
                        if (z2 || Q == did.a) {
                            Q = new ymj(2, tlsVar, uojVar);
                            btsVar3.o0(Q);
                        }
                        f530 d5 = q791.d(c530Var, false, null, awk0Var, (sls) Q, 11);
                        btsVar3.t(r0);
                        f530Var3 = d5;
                    } else {
                        btsVar3.e0(1078668667);
                        btsVar3.t(r0);
                        f530Var3 = c530Var;
                    }
                    fid fidVar2 = btsVar3;
                    jeb1.f(uojVar.b, f530Var3, AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0.a(xya1.e(fidVar2).h.a, 0L, 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16773119), fidVar2, 384, 0, 16376);
                    bts btsVar8 = fidVar2;
                    btsVar8.t(r0);
                    btsVar4 = btsVar8;
                } else {
                    btsVar3.e0(1078973149);
                    btsVar3.t(r0);
                    btsVar4 = btsVar3;
                }
                z = true;
                btsVar4.t(true);
                btsVar4.t(r0);
                btsVar2 = btsVar4;
            } else {
                bts btsVar9 = btsVar5;
                c530Var = c530Var2;
                z = true;
                btsVar9.e0(-356552612);
                btsVar9.t(false);
                btsVar2 = btsVar9;
            }
            btsVar2.t(z);
            f530Var2 = c530Var;
            btsVar = btsVar2;
        } else {
            bts btsVar10 = btsVar5;
            btsVar10.Y();
            f530Var2 = f530Var;
            btsVar = btsVar10;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(uojVar, f530Var2, tlsVar, i, 26);
        }
    }

    public static final ArrayList b(Context context, List list) {
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            arrayList.add(new Pair(str, Boolean.valueOf(qke.h(context, str) == 0)));
        }
        return arrayList;
    }

    public static final boolean c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((Boolean) ((Pair) it.next()).f()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final void d(TextView textView, int i) {
        int color = textView.getContext().getColor(i);
        textView.setTextColor(uqb1.b(textView.getContext(), new Pair[]{new Pair(new int[]{R.attr.state_pressed}, Integer.valueOf(lhc.f(color, 128))), new Pair(new int[]{R.attr.state_enabled}, Integer.valueOf(color))}, false));
    }

    public static final String e(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((Boolean) ((Pair) next).f()).booleanValue()) {
                arrayList2.add(next);
            }
        }
        return a.X(arrayList2, null, null, null, new dia0(9), 31);
    }

    public static final void f(View view, boolean z) {
        view.setVisibility(z ? 0 : 4);
    }
}
