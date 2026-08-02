package androidx.work.impl.model;

import androidx.work.Data;

/* loaded from: classes3.dex */
public final class WorkProgress {
    public final Data progress;
    public final String workSpecId;

    public WorkProgress(String str, Data data) {
        data.getClass();
        this.workSpecId = str;
        this.progress = data;
    }

    public final Data getProgress() {
        return this.progress;
    }

    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
