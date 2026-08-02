package defpackage;

import java.util.ArrayList;
import kotlin.collections.a;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes9.dex */
public final class tds0 implements v7p {
    @Override // defpackage.yvf0
    public final Object get() {
        k4o<SimplePersistentBooleanExperiment> a = SimplePersistentBooleanExperiment.a();
        ArrayList arrayList = new ArrayList(tcc.n(a, 10));
        for (SimplePersistentBooleanExperiment simplePersistentBooleanExperiment : a) {
            arrayList.add(new clw0(simplePersistentBooleanExperiment.getId(), khh.class, clw0.g, simplePersistentBooleanExperiment.getSource(), true));
        }
        k4o<SimpleBooleanExperiment> a2 = SimpleBooleanExperiment.a();
        ArrayList arrayList2 = new ArrayList(tcc.n(a2, 10));
        for (SimpleBooleanExperiment simpleBooleanExperiment : a2) {
            arrayList2.add(new clw0(simpleBooleanExperiment.getId(), c7h.class, clw0.f, simpleBooleanExperiment.getSource(), false));
        }
        return a.N0(a.m0(arrayList2, arrayList));
    }
}
