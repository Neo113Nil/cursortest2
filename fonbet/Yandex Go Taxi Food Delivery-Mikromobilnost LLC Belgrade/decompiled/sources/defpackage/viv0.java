package defpackage;

import com.yandex.go.tariffcard.api.experiment.HeaderBackground;
import com.yandex.go.tariffcard.experiment.DisableOldVerticalModeExperiment;
import com.yandex.go.tariffcard.experiment.SummaryOptionsTariffCardExperiment;
import com.yandex.go.tariffcard.experiment.y;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import com.yandex.go.zone.dto.objects.VerticalMode;
import java.util.Map;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.experiments.d;

/* loaded from: classes8.dex */
public final class viv0 implements qqo {
    public final /* synthetic */ qqo a;
    public final dmq0 b;
    public final arv0 c;
    public final dy6 d;

    public viv0(dmq0 dmq0Var, arv0 arv0Var, dy6 dy6Var, rqo rqoVar) {
        this.a = ((jbh) rqoVar).c(SummaryOptionsTariffCardExperiment.t);
        this.b = dmq0Var;
        this.c = arv0Var;
        this.d = dy6Var;
    }

    @Override // defpackage.qqo
    public final tpr a() {
        return this.a.a();
    }

    public final String d(String str, String str2, boolean z) {
        String str3;
        if (!b().b) {
            return null;
        }
        if (!z) {
            return (String) b().g.get(str2);
        }
        Map map = (Map) b().j.get(str);
        return (map == null || (str3 = (String) map.get(str2)) == null) ? (String) b().i.get(str) : str3;
    }

    @Override // defpackage.qqo
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final SummaryOptionsTariffCardExperiment b() {
        return (SummaryOptionsTariffCardExperiment) this.a.b();
    }

    public final HeaderBackground f(String str, String str2, boolean z) {
        HeaderBackground headerBackground;
        if (!b().b) {
            return null;
        }
        if (!z) {
            Map map = b().l;
            if (map != null) {
                return (HeaderBackground) map.get(str2);
            }
            return null;
        }
        Map map2 = (Map) b().n.get(str);
        if (map2 != null && (headerBackground = (HeaderBackground) map2.get(str2)) != null) {
            return headerBackground;
        }
        Map map3 = b().m;
        if (map3 != null) {
            return (HeaderBackground) map3.get(str);
        }
        return null;
    }

    public final boolean g(String str) {
        if (b().b) {
            boolean z = ((a7t0) this.c).a().a == SummaryUiState$Type.TRAP;
            boolean z2 = (((DisableOldVerticalModeExperiment) this.d.b.b()).b || this.b.a() != VerticalMode.WITHOUT_SELECTOR || jl40.l(str, "")) ? false : true;
            if (b().b && b().c.contains(str) && (z || !z2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        if (b().b) {
            return b().o;
        }
        return false;
    }

    public final boolean i() {
        if (b().b) {
            return b().p;
        }
        return false;
    }

    public final tpr j() {
        return e.t(new y(d.a(this)));
    }

    public final boolean k(String str) {
        if (b().b) {
            return !b().f.contains(str);
        }
        return false;
    }
}
