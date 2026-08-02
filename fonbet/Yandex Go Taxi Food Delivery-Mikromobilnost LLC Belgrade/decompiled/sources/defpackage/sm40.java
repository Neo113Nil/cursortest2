package defpackage;

import com.yandex.go.shortcuts.experiments.OrderShortcutsParamsExperiment;
import ru.yandex.taxi.experiments.i;

/* loaded from: classes9.dex */
public final class sm40 {
    public final i a;
    public final qmp b;

    public sm40(i iVar, qmp qmpVar) {
        this.a = iVar;
        this.b = qmpVar;
    }

    public final OrderShortcutsParamsExperiment a() {
        OrderShortcutsParamsExperiment.Companion.getClass();
        return (OrderShortcutsParamsExperiment) this.a.c(OrderShortcutsParamsExperiment.f);
    }

    public final boolean b() {
        ((ul51) this.b).getClass();
        Boolean bool = a().c;
        return bool == null || !bool.booleanValue();
    }
}
