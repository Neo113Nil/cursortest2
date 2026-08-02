package app.cash.cdp.backend.jvm;

import app.cash.cdp.api.FlushStrategy;
import app.cash.cdp.api.FlushTrigger;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class OneTimeFlushStrategy implements FlushStrategy {
    public final AppLockMonitor$special$$inlined$map$2 triggers = new AppLockMonitor$special$$inlined$map$2(new FlushTrigger(500), 19);

    @Override // app.cash.cdp.api.FlushStrategy
    public final Flow getTriggers() {
        return this.triggers;
    }

    @Override // app.cash.cdp.api.FlushStrategy
    public final void reset() {
    }
}
