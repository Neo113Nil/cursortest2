package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class kii extends z5 {
    public static final /* synthetic */ int p = 0;
    public fii i;
    public gii j;
    public final HashSet k;
    public final xdr l;
    public final xdr m;
    public final x6k n;
    public final x6k o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kii(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.k = new HashSet();
        this.l = ydr.a(c5b.a);
        Boolean bool = Boolean.FALSE;
        this.m = ydr.a(bool);
        this.n = szf.g0(bool);
        this.o = szf.g0(bool);
        setId(R.id.bottom_tabs);
        xk6 xk6Var = new xk6(-1, -2);
        xk6Var.c = 80;
        setLayoutParams(xk6Var);
    }

    public static rf3 s(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((tf3) obj).b) {
                break;
            }
        }
        tf3 tf3Var = (tf3) obj;
        if (tf3Var != null) {
            return tf3Var.a;
        }
        return null;
    }

    private final void setDarkThemeForced(boolean z) {
        this.n.setValue(Boolean.valueOf(z));
    }

    private final void setHighlightedAsSubScreen(boolean z) {
        this.o.setValue(Boolean.valueOf(z));
    }

    public rf3 getSelectedTab() {
        return s((List) this.l.getValue());
    }

    @Override // defpackage.z5
    public final void j(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1628058111);
        int i2 = (oq5Var.h(this) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            aqi O = gld.O(this.l, oq5Var);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(Boolean.TRUE);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            aqi O2 = gld.O(this.m, oq5Var);
            boolean h = oq5Var.h(this);
            Object K2 = oq5Var.K();
            if (h || K2 == kjnVar) {
                K2 = new y6g(10, this, aqiVar);
                oq5Var.k0(K2);
            }
            Function0 function0 = (Function0) K2;
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = new jc(aqiVar, 13);
                oq5Var.k0(K3);
            }
            wyf.c(null, function0, null, (Function0) K3, null, oq5Var, 24576, 43);
            r(((Boolean) this.n.getValue()).booleanValue(), ild.C(2144078148, new hii(aqiVar, O2, O, this, 0), oq5Var), oq5Var, ((i2 << 6) & 896) | 48);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ykf(this, i, 9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i = null;
        this.j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof jii)) {
            super.onRestoreInstanceState(View.BaseSavedState.EMPTY_STATE);
            return;
        }
        jii jiiVar = (jii) parcelable;
        super.onRestoreInstanceState(jiiVar.getSuperState());
        Integer num = jiiVar.a;
        rf3 rf3Var = null;
        if (num != null) {
            int intValue = num.intValue();
            rf3.g.getClass();
            Iterator it = rf3.o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((rf3) next).a == intValue) {
                    rf3Var = next;
                    break;
                }
            }
            rf3Var = rf3Var;
            if (rf3Var == null) {
                dfi.r(k5r.i(intValue, "fromMenuItem(): unknown item "), "BottomTab");
                rf3Var = rf3.h;
            }
        }
        t(rf3Var, false);
        u();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        rf3 s = s((List) this.l.getValue());
        Integer valueOf = s != null ? Integer.valueOf(s.a) : null;
        jii jiiVar = new jii(onSaveInstanceState);
        jiiVar.a = valueOf;
        return jiiVar;
    }

    public final void r(boolean z, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(10324954);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            wn5 C = a0g.C(wn5Var);
            if (z) {
                oq5Var.Z(-1646757734);
                pd.b(new qzm[0], true, C, oq5Var, 48, 0);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-1646675026);
                pd.b(new qzm[0], false, C, oq5Var, 0, 2);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yj(this, z, wn5Var, i, 3);
        }
    }

    public void setDarkTheme(boolean z) {
        setDarkThemeForced(z);
    }

    public void setNavigationListener(fii fiiVar) {
        this.i = fiiVar;
    }

    public void setTabsProvider(@NotNull gii giiVar) {
        giiVar.getClass();
        this.j = giiVar;
        u();
    }

    public final void t(rf3 rf3Var, boolean z) {
        setHighlightedAsSubScreen(z);
        xdr xdrVar = this.l;
        Iterable<tf3> iterable = (Iterable) xdrVar.getValue();
        ArrayList arrayList = new ArrayList(v75.o(iterable, 10));
        for (tf3 tf3Var : iterable) {
            rf3 rf3Var2 = tf3Var.a;
            boolean z2 = rf3Var2 == rf3Var;
            boolean z3 = tf3Var.c;
            rf3Var2.getClass();
            arrayList.add(new tf3(rf3Var2, z2, z3));
        }
        xdrVar.getClass();
        xdrVar.m(null, arrayList);
    }

    public final void u() {
        gii giiVar = this.j;
        if (giiVar != null) {
            wst wstVar = (wst) ((n) giiVar).b;
            boolean booleanValue = ((Boolean) wstVar.a(wstVar.b.c()).f(pff.e)).booleanValue();
            LinkedHashSet<rf3> linkedHashSet = new LinkedHashSet();
            jyr jyrVar = t5j.e;
            if (wyf.M()) {
                linkedHashSet.add(rf3.m);
            }
            linkedHashSet.add(rf3.h);
            l18 l18Var = l18.b;
            bdt I = hag.I(byb.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            if (((u36) ((byb) qdcVar.C(I)).c(ern.a(u36.class))).h()) {
                linkedHashSet.add(rf3.j);
            }
            jyr jyrVar2 = o5j.e;
            if (!tyf.v()) {
                linkedHashSet.add(rf3.i);
            }
            if (!tyf.v() && booleanValue) {
                linkedHashSet.add(rf3.k);
            }
            linkedHashSet.add(rf3.l);
            xdr xdrVar = this.l;
            rf3 s = s((List) xdrVar.getValue());
            ArrayList arrayList = new ArrayList(v75.o(linkedHashSet, 10));
            for (rf3 rf3Var : linkedHashSet) {
                arrayList.add(new tf3(rf3Var, rf3Var == s, this.k.contains(rf3Var)));
            }
            xdrVar.getClass();
            xdrVar.m(null, arrayList);
        }
    }

    public /* synthetic */ kii(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
