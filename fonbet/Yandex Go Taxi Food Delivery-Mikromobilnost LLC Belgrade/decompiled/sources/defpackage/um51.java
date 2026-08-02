package defpackage;

import android.content.Context;
import com.yandex.go.taxi.summary.experiments.NewSummaryExperiment;
import java.util.Set;
import ru.yandex.taxi.appdelegates.SummaryUiDelegate$TariffCardStyle;
import ru.yandex.taxi.experiments.i;

/* loaded from: classes9.dex */
public final class um51 implements mqv0 {
    public final qc20 a;
    public final j5z b;
    public final Set c = j73.f0(new String[]{"am", "ar", "az", "he", "hy", "ka", "km", "ur", "zh"});
    public final SummaryUiDelegate$TariffCardStyle d = SummaryUiDelegate$TariffCardStyle.HIGH;

    public um51(qc20 qc20Var, j5z j5zVar) {
        this.a = qc20Var;
        this.b = j5zVar;
    }

    @Override // defpackage.mqv0
    public final int a() {
        return ((NewSummaryExperiment) ((i) this.a.a).c(NewSummaryExperiment.c)).b;
    }

    @Override // defpackage.mqv0
    public final g2a b(Context context) {
        i5z a = this.b.a.a();
        return new g2a(jl40.l(a, i5z.f) ? context.getResources().getFont(a5h0.noto_sans_armenian_regular) : jl40.l(a, i5z.h) ? context.getResources().getFont(b5h0.noto_sans_georgian_regular) : !this.c.contains(a.a()) ? context.getResources().getFont(q5h0.ys_text_cond_heavy) : null, tje.b0(context, 16.0f));
    }

    @Override // defpackage.mqv0
    public final SummaryUiDelegate$TariffCardStyle c() {
        return this.d;
    }
}
