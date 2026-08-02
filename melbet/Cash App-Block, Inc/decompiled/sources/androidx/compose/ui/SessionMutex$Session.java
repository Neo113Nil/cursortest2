package androidx.compose.ui;

import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class SessionMutex$Session {
    public final Job job;
    public final Object value;

    public SessionMutex$Session(Job job, Object obj) {
        this.job = job;
        this.value = obj;
    }
}
