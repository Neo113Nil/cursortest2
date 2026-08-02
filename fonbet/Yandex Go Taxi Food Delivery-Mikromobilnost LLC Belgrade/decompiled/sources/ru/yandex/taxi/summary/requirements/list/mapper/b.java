package ru.yandex.taxi.summary.requirements.list.mapper;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.bvf0;
import defpackage.k7x0;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.widget.c;

/* loaded from: classes6.dex */
public final class b {
    public final k7x0 a;
    public final c b;

    public b(k7x0 k7x0Var, c cVar) {
        this.a = k7x0Var;
        this.b = cVar;
    }

    public final Object a(ServiceLevel.TariffCard tariffCard, Continuation continuation) {
        return bvf0.n(new TariffRulesMapper$map$2(tariffCard, this, null), continuation);
    }
}
