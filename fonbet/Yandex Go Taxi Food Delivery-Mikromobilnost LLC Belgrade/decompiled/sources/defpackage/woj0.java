package defpackage;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.summary.requirements.list.repository.RequirementsListInfoRepository$special$$inlined$flatMapLatest$1;
import ru.yandex.taxi.summary.requirements.list.repository.b;
import ru.yandex.taxi.summary.requirements.list.repository.d;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class woj0 implements roj0 {
    public final b8r a;
    public final kb5 b;
    public final r0 c;
    public final g d;
    public final d e;

    public woj0(b8r b8rVar) {
        this.a = b8rVar;
        kb5 kb5Var = new kb5((String) null, (String) null, (wu1) null, (TariffOrderFlow) null, false, 63);
        this.b = kb5Var;
        r0 c = bvf0.c(kb5Var);
        this.c = c;
        g X = e.X(new b(c, this), new RequirementsListInfoRepository$special$$inlined$flatMapLatest$1(null, this));
        this.d = X;
        this.e = new d(X);
    }

    @Override // defpackage.roj0
    public final pex0 a() {
        mi31 d = b8r.d(this.a, b(), c(), 4);
        if (d != null) {
            return d.a;
        }
        return null;
    }

    @Override // defpackage.roj0
    public final String b() {
        return ((kb5) this.c.getValue()).b;
    }

    @Override // defpackage.roj0
    public final String c() {
        return ((kb5) this.c.getValue()).a;
    }

    @Override // defpackage.roj0
    public final tpr d() {
        return this.e;
    }

    @Override // defpackage.roj0
    public final tpr e() {
        return this.d;
    }
}
