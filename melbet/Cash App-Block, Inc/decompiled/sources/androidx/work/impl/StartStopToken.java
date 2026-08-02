package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;

/* loaded from: classes.dex */
public final class StartStopToken {
    public final WorkGenerationalId id;

    public StartStopToken(WorkGenerationalId workGenerationalId) {
        workGenerationalId.getClass();
        this.id = workGenerationalId;
    }
}
