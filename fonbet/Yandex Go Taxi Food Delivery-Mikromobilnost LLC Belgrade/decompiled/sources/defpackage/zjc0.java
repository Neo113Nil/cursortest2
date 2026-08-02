package defpackage;

import com.yandex.plus.home.plaque.feature.internal.presentation.d;
import com.yandex.plus.log.api.LogPriority;

/* loaded from: classes8.dex */
public final /* synthetic */ class zjc0 implements hsc0 {
    public final /* synthetic */ bkc0 a;

    public final void a(boolean z) {
        d dVar = (d) this.a.n.getValue();
        pgz pgzVar = dVar.h;
        LogPriority logPriority = LogPriority.INFO;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "PlaqueViewModel", "onAttachStateChanged(" + z + ')');
        }
        qv10.B(z, dVar.n, null);
    }
}
