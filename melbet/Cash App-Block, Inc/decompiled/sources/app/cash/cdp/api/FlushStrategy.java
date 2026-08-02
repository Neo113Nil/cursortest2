package app.cash.cdp.api;

import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public interface FlushStrategy {
    Flow getTriggers();

    void reset();
}
