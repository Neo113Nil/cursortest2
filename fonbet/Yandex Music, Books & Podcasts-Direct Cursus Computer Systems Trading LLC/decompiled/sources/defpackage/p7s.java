package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.t;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes3.dex */
public final class p7s implements d3n {
    public final e8s a;
    public final fy3 b;
    public final n7s c;
    public final q7s d;
    public final a7s e;
    public final vik f;
    public final fkn g;
    public final fkn h;

    public p7s(e8s e8sVar, fy3 fy3Var, n7s n7sVar, q7s q7sVar, a7s a7sVar, u7s u7sVar, vik vikVar, qyf qyfVar) {
        e8sVar.getClass();
        vikVar.getClass();
        this.a = e8sVar;
        this.b = fy3Var;
        this.c = n7sVar;
        this.d = q7sVar;
        this.e = a7sVar;
        this.f = vikVar;
        this.g = e8sVar.D;
        xdr xdrVar = e8sVar.u;
        this.h = zsd.F0(new mpq(10, xdrVar, this), qyfVar, lbq.a, a(this, (ajk) xdrVar.getValue()));
        ox6.B(e8sVar.w, qyfVar, new ryp(24, this));
        ox6.B((vdr) e8sVar.E.getValue(), qyfVar, new ds1(5, u7sVar));
    }

    public static final k3n a(p7s p7sVar, ajk ajkVar) {
        m mVar;
        String str;
        a7s a7sVar = p7sVar.e;
        e8s e8sVar = p7sVar.a;
        n7s n7sVar = p7sVar.c;
        q7s q7sVar = p7sVar.d;
        if (!(ajkVar instanceof xik)) {
            if (!Intrinsics.d(ajkVar, yik.a)) {
                b6e.s();
                return null;
            }
            q7sVar.h(false);
            a7sVar.a(false);
            e8sVar.x = false;
            return j3n.a;
        }
        xik xikVar = (xik) ajkVar;
        i3n i3nVar = xikVar.a;
        q7sVar.h(xikVar.b);
        String str2 = null;
        if (i3nVar instanceof h3n) {
            mVar = ((h3n) i3nVar).c();
        } else {
            if (!(i3nVar instanceof e3n)) {
                b6e.s();
                return null;
            }
            mVar = null;
        }
        String str3 = i3nVar.a().a.a;
        m mVar2 = i3nVar.a().a;
        String str4 = mVar2.b;
        if (str4 == null) {
            str4 = mVar2.a;
        }
        m mVar3 = i3nVar.a().b;
        String str5 = mVar3 != null ? mVar3.a : null;
        m mVar4 = i3nVar.a().b;
        if (mVar4 != null) {
            str = mVar4.b;
            if (str == null) {
                str = mVar4.a;
            }
        } else {
            str = null;
        }
        String str6 = mVar != null ? mVar.a : null;
        if (mVar != null && (str2 = mVar.b) == null) {
            str2 = mVar.a;
        }
        str3.getClass();
        str4.getClass();
        n7sVar.d = str3;
        n7sVar.e = str4;
        n7sVar.f = str5;
        n7sVar.g = str;
        n7sVar.h = str6;
        n7sVar.i = str2;
        Iterator it = n7sVar.a.entrySet().iterator();
        while (it.hasNext()) {
            m7s m7sVar = (m7s) ((Map.Entry) it.next()).getValue();
            View view = m7sVar.a;
            if (view instanceof TextView) {
                if (m7sVar.b) {
                    TextView textView = (TextView) view;
                    textView.setText(n7sVar.d);
                    textView.setContentDescription(str4);
                }
                if (m7sVar.c) {
                    view.setVisibility(0);
                }
            }
        }
        Iterator it2 = n7sVar.b.entrySet().iterator();
        while (it2.hasNext()) {
            m7s m7sVar2 = (m7s) ((Map.Entry) it2.next()).getValue();
            View view2 = m7sVar2.a;
            if (view2 instanceof TextView) {
                if (m7sVar2.b) {
                    TextView textView2 = (TextView) view2;
                    textView2.setText(n7sVar.f);
                    textView2.setContentDescription(str);
                }
                if (m7sVar2.c) {
                    view2.setVisibility(0);
                }
            }
        }
        Iterator it3 = n7sVar.c.entrySet().iterator();
        while (it3.hasNext()) {
            m7s m7sVar3 = (m7s) ((Map.Entry) it3.next()).getValue();
            View view3 = m7sVar3.a;
            if (view3 instanceof TextView) {
                if (m7sVar3.b) {
                    TextView textView3 = (TextView) view3;
                    textView3.setText(n7sVar.h);
                    textView3.setContentDescription(str2);
                }
                if (m7sVar3.c) {
                    view3.setVisibility(n7sVar.h != null ? 0 : 8);
                }
            }
        }
        e8sVar.x = n7sVar.a();
        if (i3nVar instanceof h3n) {
            a7sVar.a(true);
        }
        return i3nVar;
    }

    public final void b() {
        t tVar = this.b.a;
        Object value = this.a.D.a.getValue();
        nd6 nd6Var = value instanceof nd6 ? (nd6) value : null;
        if (nd6Var == null || !nd6Var.b || this.f != vik.d) {
            tVar.finish();
        } else {
            if (tVar.isFinishing()) {
                return;
            }
            tVar.finish();
            lhs lhsVar = MainScreenActivity.Q0;
            tVar.startActivity(imp.J(tVar, null, null, null, 14));
        }
    }

    public final void c(q2n q2nVar) {
        q2nVar.getClass();
        q2nVar.d.invoke(Boolean.valueOf(this.c.a()));
    }
}
