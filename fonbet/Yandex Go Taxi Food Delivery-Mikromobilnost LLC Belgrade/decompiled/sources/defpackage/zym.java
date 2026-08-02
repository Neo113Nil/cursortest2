package defpackage;

import com.yandex.go.due.data.api.dto.TariffOverride;
import com.yandex.go.due.data.api.dto.TimetableInfo;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes12.dex */
public final class zym {
    public final axm a;
    public final y1s b;
    public final l0n c;
    public final c4r0 d;
    public final b8r e;
    public final dqe0 f;
    public final w3r0 g;
    public final ibn h;

    public zym(axm axmVar, y1s y1sVar, l0n l0nVar, c4r0 c4r0Var, b8r b8rVar, dqe0 dqe0Var, w3r0 w3r0Var, ibn ibnVar) {
        this.a = axmVar;
        this.b = y1sVar;
        this.c = l0nVar;
        this.d = c4r0Var;
        this.e = b8rVar;
        this.f = dqe0Var;
        this.g = w3r0Var;
        this.h = ibnVar;
    }

    public final void a(boolean z) {
        mi31 d;
        TimetableInfo timetableInfo = this.c.a().k;
        if (timetableInfo != null) {
            TariffOverride tariffOverride = z ? timetableInfo.d : timetableInfo.e;
            if (tariffOverride != null) {
                String str = tariffOverride.a;
                String str2 = tariffOverride.b;
                if (str2 == null) {
                    str2 = "";
                }
                if (str == null || str.length() == 0 || (d = b8r.d(this.e, str, str2, 4)) == null) {
                    return;
                }
                this.d.a(new gnx0(new fnx0(d, SelectionOrigin.DUE_TIMETABLE), true));
            }
        }
    }
}
