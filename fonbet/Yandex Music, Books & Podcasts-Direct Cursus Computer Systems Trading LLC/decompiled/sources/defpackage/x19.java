package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class x19 extends p9 {
    public final /* synthetic */ int b;
    public final Object c;
    public final Object d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x19(gp8 gp8Var, Object obj, Object obj2, Object obj3, int i) {
        super(gp8Var);
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    public static void G(dp8 dp8Var, xzb xzbVar, View view) {
        int i;
        Integer num;
        int i2 = 1;
        szb h = dp8Var.h();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        u79 u79Var = layoutParams instanceof u79 ? (u79) layoutParams : null;
        int i3 = Integer.MIN_VALUE;
        if (u79Var == null) {
            i = 1;
            num = 1;
        } else {
            if (h != null) {
                i = 1;
                num = 1;
                long longValue = ((Number) h.a(xzbVar)).longValue();
                long j = longValue >> 31;
                i2 = (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } else {
                i = 1;
                num = 1;
            }
            if (u79Var.a() != i2) {
                n7b n7bVar = u79Var.e;
                s9f s9fVar = u79.i[0];
                Integer valueOf = Integer.valueOf(i2);
                n7bVar.getClass();
                if (valueOf.doubleValue() <= 0.0d) {
                    valueOf = num;
                }
                n7bVar.a = valueOf;
                view.requestLayout();
            }
        }
        szb k = dp8Var.k();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        u79 u79Var2 = layoutParams2 instanceof u79 ? (u79) layoutParams2 : null;
        if (u79Var2 == null) {
            return;
        }
        if (k != null) {
            long longValue2 = ((Number) k.a(xzbVar)).longValue();
            long j2 = longValue2 >> 31;
            if (j2 == 0 || j2 == -1) {
                i3 = (int) longValue2;
            } else if (longValue2 > 0) {
                i3 = Integer.MAX_VALUE;
            }
        } else {
            i3 = i;
        }
        if (u79Var2.c() != i3) {
            n7b n7bVar2 = u79Var2.f;
            s9f s9fVar2 = u79.i[i];
            Integer valueOf2 = Integer.valueOf(i3);
            n7bVar2.getClass();
            n7bVar2.a = valueOf2.doubleValue() <= 0.0d ? num : valueOf2;
            view.requestLayout();
        }
    }

    @Override // defpackage.p9
    public void j(View view, e23 e23Var, dp8 dp8Var, dp8 dp8Var2) {
        switch (this.b) {
            case 0:
                d29 d29Var = (d29) view;
                w19 w19Var = (w19) dp8Var;
                d29Var.setReleaseViewVisitor$div_release(e23Var.a.getReleaseViewVisitor$div_release());
                bg3.k(d29Var, e23Var, w19Var.b, w19Var.d, w19Var.A, w19Var.q, w19Var.w, w19Var.v, w19Var.E, w19Var.D, w19Var.c, w19Var.k);
                szb szbVar = w19Var.l;
                xzb xzbVar = e23Var.b;
                d29Var.i(szbVar.d(xzbVar, new az6(18, d29Var)));
                szb szbVar2 = w19Var.n;
                szb szbVar3 = w19Var.o;
                d29Var.setGravity(vq1.N((om8) szbVar2.a(xzbVar), (pm8) szbVar3.a(xzbVar)));
                ak0 ak0Var = new ak0(d29Var, szbVar2, xzbVar, szbVar3, 8);
                d29Var.i(szbVar2.c(xzbVar, ak0Var));
                d29Var.i(szbVar3.c(xzbVar, ak0Var));
                break;
        }
    }

    @Override // defpackage.p9
    public void k(View view, e23 e23Var, dp8 dp8Var, dp8 dp8Var2, pm9 pm9Var) {
        switch (this.b) {
            case 1:
                oi9 oi9Var = (oi9) view;
                ei9 ei9Var = (ei9) dp8Var;
                ei9 ei9Var2 = (ei9) dp8Var2;
                gc8 gc8Var = e23Var.a;
                xzb xzbVar = e23Var.b;
                oi9Var.setTextAlignment(5);
                oi9Var.setFocusTracker(gc8Var.getInputFocusTracker$div_release());
                s30 u = bg3.u(oi9Var, e23Var, cwt.a, null);
                oi9Var.setOnTouchListener(u != null ? new de8(1, u) : null);
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (Object obj : ei9Var.A) {
                    int i2 = i + 1;
                    if (i < 0) {
                        u75.n();
                        throw null;
                    }
                    di9 di9Var = (di9) obj;
                    szb szbVar = di9Var.a;
                    if (szbVar == null) {
                        szbVar = di9Var.b;
                    }
                    arrayList.add(szbVar.a(xzbVar));
                    szbVar.c(xzbVar, new vk8(arrayList, i, oi9Var, 1));
                    i = i2;
                }
                oi9Var.setItems(arrayList);
                oi9Var.setOnItemSelectedListener(new ak0(oi9Var, arrayList, ei9Var, e23Var, 11));
                efb efbVar = (efb) this.e;
                gc8 gc8Var2 = e23Var.a;
                oi9Var.i(((qct) this.d).l(e23Var, ei9Var.N, new g06(ei9Var, oi9Var, efbVar.a(gc8Var2.getDivData(), gc8Var2.getDataTag()), xzbVar)));
                szb szbVar2 = ei9Var.m;
                szb szbVar3 = ei9Var.n;
                szb szbVar4 = ei9Var.x;
                szb szbVar5 = ei9Var.F;
                szb szbVar6 = ei9Var.y;
                szb szbVar7 = ei9Var.l;
                szb szbVar8 = ei9Var.p;
                szb szbVar9 = ei9Var.q;
                szb szbVar10 = ei9Var.o;
                szb szbVar11 = ei9Var2 != null ? ei9Var2.m : null;
                szb szbVar12 = ei9Var2 != null ? ei9Var2.n : null;
                woe.q(oi9Var, szbVar2, szbVar3, szbVar4, szbVar5, szbVar6, szbVar7, szbVar8, szbVar9, szbVar10, szbVar11, szbVar12, ei9Var2 != null ? ei9Var2.x : null, ei9Var2 != null ? ei9Var2.F : null, ei9Var2 != null ? ei9Var2.y : null, ei9Var2 != null ? ei9Var2.l : null, ei9Var2 != null ? ei9Var2.p : null, ei9Var2 != null ? ei9Var2.q : null, ei9Var2 != null ? ei9Var2.o : null, ei9Var2, (ly9) this.c, xzbVar);
                szb szbVar13 = ei9Var.u;
                if (szbVar13 != null) {
                    oi9Var.i(szbVar13.d(xzbVar, new fi9(oi9Var, 1)));
                }
                oi9Var.i(ei9Var.t.d(xzbVar, new fi9(oi9Var, 0)));
                return;
            default:
                super.k(view, e23Var, dp8Var, dp8Var2, pm9Var);
                return;
        }
    }
}
