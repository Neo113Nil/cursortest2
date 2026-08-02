package defpackage;

import com.yandex.go.experiments.api.ExperimentSource;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes4.dex */
public abstract class qku0 {
    public static final LinkedHashMap a;

    static {
        Pair[] pairArr = {new Pair("ru.yandex.taxi.startup.launch.response.PERSISTENT_ENABLED_BOOLEAN_EXPERIMENTS", ExperimentSource.LAUNCH), new Pair("ru.yandex.taxi.PinDropExperiments.EXPERIMENTS_KEY", ExperimentSource.FINAL_SUGGEST), new Pair("ru.yandex.taxi.PRODUCT_EXPERIMENTS", ExperimentSource.PRODUCTS), new Pair("com.yandex.go.zoneInfoExperiments.EXPERIMENTS_KEY", ExperimentSource.ZONE_INFO), new Pair("ru.yandex.taxi.SCOOTERS_CONFIG_EXPERIMENTS", ExperimentSource.SCOOTERS_CONFIG), new Pair("ru.yandex.taxi.RoutestatsExperiments.EXPERIMENTS_KEY", ExperimentSource.ROUTESTATS)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(6));
        b.q(linkedHashMap, pairArr);
        a = linkedHashMap;
    }

    public static LinkedHashMap a() {
        return a;
    }
}
