package defpackage;

import com.yandex.go.due.data.api.dto.TariffOverride;
import com.yandex.go.due.data.api.dto.TimetableInfo;
import com.yandex.go.due_timetable.experiment.PreorderViewTypeExperiment;
import com.yandex.go.due_timetable.experiment.model.SettingsForTariffClass;
import com.yandex.go.due_timetable.experiment.model.TimetableMainAction;
import com.yandex.go.due_timetable.experiment.model.TimetableViewTypeSettings;
import com.yandex.go.taxi.tariffs.internal.repository.k;

/* loaded from: classes12.dex */
public final class yym {
    public final l0n a;
    public final ote0 b;
    public final wiq0 c;

    public yym(l0n l0nVar, ote0 ote0Var, wiq0 wiq0Var) {
        this.a = l0nVar;
        this.b = ote0Var;
        this.c = wiq0Var;
    }

    public final wym a(g1n g1nVar) {
        TariffOverride tariffOverride;
        g0n a = this.a.a();
        e8z0 c = a.c();
        TimetableInfo timetableInfo = a.k;
        if (c instanceof c8z0) {
            if (timetableInfo != null) {
                tariffOverride = timetableInfo.d;
            }
            tariffOverride = null;
        } else {
            if (c instanceof b8z0) {
                if (timetableInfo != null) {
                    tariffOverride = timetableInfo.e;
                }
            } else if (!(c instanceof d8z0) && c != null) {
                w511.b();
                return null;
            }
            tariffOverride = null;
        }
        if (tariffOverride == null) {
            k kVar = (k) this.c;
            pex0 m = kVar.m();
            return b(g1nVar, m != null ? m.b : null, kVar.h());
        }
        String str = tariffOverride.a;
        String str2 = tariffOverride.b;
        if (str2 == null) {
            str2 = "";
        }
        return b(g1nVar, str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wym b(g1n g1nVar, String str, String str2) {
        TimetableViewTypeSettings timetableViewTypeSettings;
        TimetableMainAction timetableMainAction;
        int i;
        TimetableViewTypeSettings timetableViewTypeSettings2;
        if (str != null) {
            SettingsForTariffClass settingsForTariffClass = (SettingsForTariffClass) ((PreorderViewTypeExperiment) this.b.a.b()).b.a.get(str);
            if (g1nVar instanceof e1n) {
                if (settingsForTariffClass != null && (timetableViewTypeSettings2 = settingsForTariffClass.b) != null) {
                    timetableMainAction = timetableViewTypeSettings2.a;
                    i = timetableMainAction != null ? -1 : xym.a[timetableMainAction.ordinal()];
                    if (i != -1) {
                        if (i == 1) {
                            return new vym(str, str2);
                        }
                        if (i == 2) {
                            return uym.a;
                        }
                        w511.b();
                        return null;
                    }
                }
                timetableMainAction = null;
                if (timetableMainAction != null) {
                }
                if (i != -1) {
                }
            } else {
                if (!(g1nVar instanceof f1n)) {
                    w511.b();
                    return null;
                }
                if (settingsForTariffClass != null && (timetableViewTypeSettings = settingsForTariffClass.a) != null) {
                    timetableMainAction = timetableViewTypeSettings.a;
                    if (timetableMainAction != null) {
                    }
                    if (i != -1) {
                    }
                }
                timetableMainAction = null;
                if (timetableMainAction != null) {
                }
                if (i != -1) {
                }
            }
        }
        return tym.a;
    }
}
