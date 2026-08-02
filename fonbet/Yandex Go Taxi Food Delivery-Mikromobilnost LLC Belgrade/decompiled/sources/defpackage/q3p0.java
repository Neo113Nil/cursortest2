package defpackage;

import com.yandex.go.scooters.data.model.ScootersSurgeExperiment;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class q3p0 {
    public static ScootersSurgeExperiment.SurgeSettings a(double d, ScootersSurgeExperiment scootersSurgeExperiment) {
        Object obj;
        ScootersSurgeExperiment.SurgeSettings surgeSettings;
        Iterator it = scootersSurgeExperiment.d.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ScootersSurgeExperiment.SurgeSettingsByBalance surgeSettingsByBalance = (ScootersSurgeExperiment.SurgeSettingsByBalance) obj;
            double d2 = surgeSettingsByBalance.a;
            if (d <= surgeSettingsByBalance.b && d2 <= d) {
                break;
            }
        }
        ScootersSurgeExperiment.SurgeSettingsByBalance surgeSettingsByBalance2 = (ScootersSurgeExperiment.SurgeSettingsByBalance) obj;
        return (surgeSettingsByBalance2 == null || (surgeSettings = surgeSettingsByBalance2.c) == null) ? scootersSurgeExperiment.d.b : surgeSettings;
    }

    public static m b(ScootersSurgeExperiment.SurgeSettings surgeSettings, ScootersSurgeExperiment scootersSurgeExperiment, ListBuilder listBuilder) {
        String str = surgeSettings.a;
        String str2 = surgeSettings.b;
        ScootersSurgeExperiment.SurgeSettings.Content content = surgeSettings.h;
        FormattedText e = f9s.e(content.a, scootersSurgeExperiment);
        FormattedText e2 = f9s.e(content.b, scootersSurgeExperiment);
        ScootersSurgeExperiment.SurgeSettings.IndicatorSettings indicatorSettings = surgeSettings.c;
        String str3 = indicatorSettings.a;
        String str4 = indicatorSettings.b;
        ScootersSurgeExperiment.SurgeSettings.Details details = surgeSettings.g;
        String str5 = details != null ? details.a : null;
        if (str5 == null) {
            str5 = "";
        }
        String Y = d6z.Y(scootersSurgeExperiment, str5);
        if (Y.length() == 0) {
            Y = null;
        }
        return new m(str, str2, e, e2, str3, str4, Y, details != null ? details.b : null, d6z.Y(scootersSurgeExperiment, content.c), listBuilder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r1.length() == 0) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x000b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v5, types: [w2p0] */
    /* JADX WARN: Type inference failed for: r2v7, types: [u2p0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList c(List list, ScootersSurgeExperiment scootersSurgeExperiment) {
        v2p0 v2p0Var;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jsw0 jsw0Var = (jsw0) it.next();
            v2p0 v2p0Var2 = null;
            String str = null;
            if (jsw0Var instanceof frw0) {
                String str2 = ((frw0) jsw0Var).a;
                if (scootersSurgeExperiment != null) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    str2 = d6z.Y(scootersSurgeExperiment, str2);
                }
                str = str2;
                v2p0Var = new u2p0(str);
            } else if (jsw0Var instanceof hsw0) {
                hsw0 hsw0Var = (hsw0) jsw0Var;
                String str3 = hsw0Var.a;
                FormattedText e = f9s.e(hsw0Var.b, scootersSurgeExperiment);
                FormattedText formattedText = hsw0Var.c;
                v2p0Var = new w2p0(str3, e, formattedText != null ? f9s.e(formattedText, scootersSurgeExperiment) : null);
            } else if (jsw0Var instanceof csw0) {
                FormattedText formattedText2 = ((csw0) jsw0Var).a;
                v2p0Var = new v2p0(formattedText2 != null ? f9s.e(formattedText2, scootersSurgeExperiment) : null);
            } else {
                if (!jl40.l(jsw0Var, isw0.INSTANCE)) {
                    w511.b();
                    return null;
                }
                if (v2p0Var2 == null) {
                    arrayList.add(v2p0Var2);
                }
            }
            v2p0Var2 = v2p0Var;
            if (v2p0Var2 == null) {
            }
        }
        return arrayList;
    }
}
