package ru.yandex.taxi.layers.experiments;

import defpackage.jbh;
import defpackage.jl40;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tje;
import java.util.Iterator;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.yandex.taxi.layers.experiments.ScreenModeMapProvidersExperiment;

/* loaded from: classes9.dex */
public final class p {
    public final t1b0 a;

    public p(rqo rqoVar) {
        ScreenModeMapProvidersExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(ScreenModeMapProvidersExperiment.d);
    }

    public final ScreenModeMapProvidersExperiment.b a(String str) {
        Object obj = null;
        Iterator it = ((ScreenModeMapProvidersExperiment) tje.Y(EmptyCoroutineContext.a, new ScreenModeMapProvidersExperimentProvider$experiment$1(this, null))).b.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (jl40.l(((ScreenModeMapProvidersExperiment.b) next).a, str)) {
                obj = next;
                break;
            }
        }
        return (ScreenModeMapProvidersExperiment.b) obj;
    }
}
