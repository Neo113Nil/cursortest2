package defpackage;

import com.yandex.go.summary.analytics.SummaryAnalytics$RequirementTappedSource;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.requirements.interactor.x;

/* loaded from: classes6.dex */
public final class qv21 extends ad5 {
    public final pwy0 A;
    public final iev0 B;
    public final wiq0 C;
    public final r0 D;
    public List E;
    public af70 F;
    public final tt2 x;
    public final ijj0 y;
    public final x z;

    public qv21(tt2 tt2Var, ijj0 ijj0Var, x xVar, pwy0 pwy0Var, iev0 iev0Var, wiq0 wiq0Var) {
        super(ov21.class);
        this.x = tt2Var;
        this.y = ijj0Var;
        this.z = xVar;
        this.A = pwy0Var;
        this.B = iev0Var;
        this.C = wiq0Var;
        this.D = bvf0.c(null);
        this.E = EmptyList.a;
    }

    public final void Kg(int i, boolean z) {
        mi31 mi31Var;
        jmw0 jmw0Var;
        fnx0 n = ((k) this.C).n();
        if (n == null || (mi31Var = n.a) == null || (jmw0Var = (jmw0) this.D.getValue()) == null) {
            return;
        }
        tf70 tf70Var = (tf70) a.S(i, this.E);
        String str = tf70Var != null ? tf70Var.a : null;
        String name = jmw0Var.getName();
        String str2 = mi31Var.f;
        String str3 = mi31Var.b;
        String str4 = mi31Var.g;
        iev0 iev0Var = this.B;
        iev0Var.getClass();
        iev0Var.b(name, SummaryAnalytics$RequirementTappedSource.Glued, z, str, new t450(i), str2, str3, str4);
    }
}
