package defpackage;

import com.yandex.plus.home.plaque.feature.internal.presentation.d;
import com.yandex.plus.log.api.LogPriority;

/* loaded from: classes8.dex */
public final /* synthetic */ class yjc0 implements isc0 {
    public final /* synthetic */ bkc0 a;

    public final void a(boolean z) {
        d dVar = (d) this.a.n.getValue();
        pgz pgzVar = dVar.h;
        LogPriority logPriority = LogPriority.INFO;
        if (pgzVar.e(logPriority)) {
            pgzVar.a(logPriority, "PlaqueViewModel", "onVisibilityChanged(" + z + ')');
        }
        qv10.B(z, dVar.m, null);
    }
}
