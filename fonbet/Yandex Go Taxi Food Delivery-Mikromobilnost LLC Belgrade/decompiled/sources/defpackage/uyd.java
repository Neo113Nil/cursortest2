package defpackage;

import com.yandex.go.navigator.domain.conditions_listener.ConditionsChangeType;
import com.yandex.mapkit.directions.driving.ConditionsListener;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes12.dex */
public final class uyd implements ConditionsListener {
    public final n0 a;
    public final n0 b;

    public uyd() {
        n0 b = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.a = b;
        this.b = b;
    }

    @Override // com.yandex.mapkit.directions.driving.ConditionsListener
    public final void onConditionsOutdated() {
        this.a.g(ConditionsChangeType.OUTDATED);
    }

    @Override // com.yandex.mapkit.directions.driving.ConditionsListener
    public final void onConditionsUpdated() {
        this.a.g(ConditionsChangeType.UPDATED);
    }
}
