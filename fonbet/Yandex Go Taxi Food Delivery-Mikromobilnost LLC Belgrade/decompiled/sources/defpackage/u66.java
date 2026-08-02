package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.blur.experiments.BlurConfigurationExperiment;

/* loaded from: classes.dex */
public final class u66 {
    public final pdc a;
    public final s66 b;
    public final nbj c;
    public q66 d;

    public u66(pdc pdcVar, s66 s66Var, nbj nbjVar) {
        this.a = pdcVar;
        this.b = s66Var;
        this.c = nbjVar;
    }

    public static boolean a(String str, BlurConfigurationExperiment.DevicePerformanceClass devicePerformanceClass) {
        int i = devicePerformanceClass == null ? -1 : t66.a[devicePerformanceClass.ordinal()];
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    return jl40.l(str, Constants.HIGH);
                }
                if (i != 3) {
                    w511.b();
                    return false;
                }
            } else if (!jl40.l(str, "medium") && !jl40.l(str, Constants.HIGH)) {
                return false;
            }
        }
        return true;
    }
}
