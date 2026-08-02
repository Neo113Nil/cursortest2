package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.go.design.compose.slot.SlotSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.plus.badge.CashbackBadgeStyle;
import ru.yandex.taxi.plus.badge.CashbackHorizontalView;

/* loaded from: classes6.dex */
public abstract class rgb1 {
    public static final void a(s611 s611Var, f530 f530Var, boolean z, boolean z2, sls slsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        sls slsVar2;
        s611 s611Var2;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1520976900);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(s611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.a(z2) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(slsVar) ? 16384 : 8192;
        }
        if (!btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            f530Var2 = f530Var;
            slsVar2 = slsVar;
            s611Var2 = s611Var;
            z3 = z2;
            btsVar.Y();
        } else if (z) {
            btsVar.e0(482359236);
            int i3 = i2 & HProv.PP_DELETE_SAVED_PASSWD;
            int i4 = i2 >> 3;
            f530Var2 = f530Var;
            slsVar2 = slsVar;
            c(s611Var, f530Var2, z2, slsVar2, null, btsVar, i3 | (i4 & 896) | (i4 & 7168));
            s611Var2 = s611Var;
            z3 = z2;
            btsVar.t(false);
        } else {
            f530Var2 = f530Var;
            slsVar2 = slsVar;
            s611Var2 = s611Var;
            z3 = z2;
            btsVar.e0(482430381);
            b(s611Var2, f530Var2, slsVar2, btsVar, (i2 & HProv.PP_DELETE_SAVED_PASSWD) | ((i2 >> 6) & 896));
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new osm(s611Var2, f530Var2, z, z3, slsVar2, i);
        }
    }

    public static final void b(s611 s611Var, f530 f530Var, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(441419577);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(s611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 c = ljs0.c(ljs0.b(an91.m(f530Var, 0.0f, 8.0f, 1), 0.0f, SlotSize.XS.getSize(), 1), 1.0f);
            int i4 = i2 & 896;
            boolean e = btsVar.e(s611Var) | (i4 == 256);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new niu0(s611Var, slsVar, i3);
                btsVar.o0(Q);
            }
            f530 a = fnq0.a(c, (tls) Q);
            boolean e2 = btsVar.e(s611Var) | (i4 == 256);
            Object Q2 = btsVar.Q();
            if (e2 || Q2 == o430Var) {
                Q2 = new oiu0(s611Var, slsVar, i3);
                btsVar.o0(Q2);
            }
            f530 d = q791.d(a, false, null, null, (sls) Q2, 15);
            xdd.a.getClass();
            ydb1.a(d, xdd.b, wwg.S(-1844903350, true, new w7o0(25, s611Var), btsVar), null, xdd.c, null, null, false, btsVar, 25008, 232);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0((Object) s611Var, f530Var, (Object) slsVar, i, 20);
        }
    }

    public static final void c(s611 s611Var, f530 f530Var, boolean z, sls slsVar, ety0 ety0Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        ety0 ety0Var2;
        int i3;
        ety0 ety0Var3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1583749508);
        if ((i & 6) == 0) {
            i2 = (btsVar2.e(s611Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.e(slsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= 8192;
        }
        int i4 = 0;
        if (btsVar2.V(i2 & 1, (i2 & 9363) != 9362)) {
            btsVar2.a0();
            if ((i & 1) == 0 || btsVar2.C()) {
                i3 = i2 & (-57345);
                ety0Var3 = xya1.e(btsVar2).h.b;
            } else {
                btsVar2.Y();
                i3 = i2 & (-57345);
                ety0Var3 = ety0Var;
            }
            btsVar2.u();
            String str = s611Var.c;
            f530 o = an91.o(f530Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            int i5 = i3 & 7168;
            boolean e = btsVar2.e(s611Var) | (i5 == 2048);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new niu0(s611Var, slsVar, i4);
                btsVar2.o0(Q);
            }
            f530 a = fnq0.a(o, (tls) Q);
            boolean e2 = btsVar2.e(s611Var) | (i5 == 2048);
            Object Q2 = btsVar2.Q();
            if (e2 || Q2 == o430Var) {
                Q2 = new oiu0(s611Var, slsVar, i4);
                btsVar2.o0(Q2);
            }
            btsVar = btsVar2;
            a5l0.d(str, q791.d(a, false, null, null, (sls) Q2, 15), 0.0f, 0.0f, x4c.x, 0.0f, null, null, wwg.S(-196481846, true, new my8(z, s611Var, 10), btsVar2), wwg.S(39869812, true, new nvs0(2, slsVar, s611Var, ety0Var3), btsVar2), btsVar, 906190848, 204);
            ety0Var2 = ety0Var3;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            ety0Var2 = ety0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ym1(s611Var, f530Var, z, slsVar, ety0Var2, i);
        }
    }

    public static void d(ListItemComponent listItemComponent, String str, CashbackBadgeStyle cashbackBadgeStyle) {
        if (str.length() == 0 || str.equals("")) {
            return;
        }
        View trailViewAs = listItemComponent.getTrailViewAs(View.class);
        CashbackHorizontalView cashbackHorizontalView = new CashbackHorizontalView(listItemComponent.getContext(), null, 0, 6, null);
        cashbackHorizontalView.setValueText(str);
        cashbackHorizontalView.setBadgeStyle(cashbackBadgeStyle);
        if (trailViewAs == null) {
            listItemComponent.setTrailView(cashbackHorizontalView);
            return;
        }
        listItemComponent.clearTrailView();
        LinearLayout linearLayout = new LinearLayout(listItemComponent.getContext());
        boolean z = false;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        linearLayout.addView(cashbackHorizontalView, -1, layoutParams);
        linearLayout.addView(trailViewAs, -1, layoutParams);
        listItemComponent.setTrailView(linearLayout);
        if (cashbackBadgeStyle != CashbackBadgeStyle.LIGHT_GRADIENT && cashbackBadgeStyle != CashbackBadgeStyle.DARK_GRADIENT) {
            z = true;
        }
        ViewGroup viewGroup = (ViewGroup) linearLayout.getParent();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
        linearLayout.setClipChildren(z);
        viewGroup2.setClipChildren(z);
        viewGroup.setClipChildren(z);
        listItemComponent.setClipChildren(z);
    }
}
