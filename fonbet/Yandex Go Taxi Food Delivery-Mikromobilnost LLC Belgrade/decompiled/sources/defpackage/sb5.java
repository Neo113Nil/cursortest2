package defpackage;

import android.view.View;
import com.yandex.go.taxi.summary.shared.lifecycle.SummaryElement;
import com.yandex.go.taxi.summary.shared.lifecycle.a;
import ru.yandex.taxi.perf.screen.ElementPerformanceState;
import ru.yandex.taxi.perf.screen.c;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public abstract class sb5 extends xwy0 {
    public final c O;
    public final a P;
    public elx0 Q;

    public sb5(View view, c cVar, a aVar) {
        super(view);
        this.O = cVar;
        this.P = aVar;
    }

    public final void W(elx0 elx0Var, elx0 elx0Var2) {
        this.Q = elx0Var2;
        a0(elx0Var, elx0Var2);
        boolean z = elx0Var2.u;
        View view = this.a;
        c cVar = this.O;
        if (z) {
            ph91.d(cVar, new xjv0(ElementPerformanceState.FIRST_CONTENTFUL_PAINT), view);
        }
        if (z) {
            t0f0 t0f0Var = elx0Var2.n;
            if (t0f0Var != null ? t0f0Var.b() : false) {
                ph91.d(cVar, new xjv0(ElementPerformanceState.LARGEST_CONTENTFUL_PAINT), view);
                a aVar = this.P;
                if (aVar != null) {
                    aVar.a(SummaryElement.TARIFF_VIEW_HOLDER);
                }
            }
        }
    }

    public abstract void X();

    public View Y() {
        return null;
    }

    public View Z() {
        return null;
    }

    public abstract void a0(elx0 elx0Var, elx0 elx0Var2);

    @Override // defpackage.xwy0, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        elx0 elx0Var = this.Q;
        if (elx0Var != null) {
            a0(null, elx0Var);
        }
    }

    public abstract void b0(rb5 rb5Var);
}
