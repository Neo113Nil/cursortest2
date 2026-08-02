package com.bugsnag.android.internal;

import app.cash.redwood.treehouse.AndroidTreehouseDispatchers;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class BackgroundTaskServiceKt$$ExternalSyntheticLambda0 implements ThreadFactory {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ BackgroundTaskServiceKt$$ExternalSyntheticLambda0(String str, int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = obj;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int i = this.$r8$classId;
        Object obj = this.f$1;
        String str = this.f$0;
        switch (i) {
            case 0:
                return new TaskTypeThread(runnable, str, (TaskType) obj);
            default:
                Thread thread = new Thread(null, runnable, "Treehouse ".concat(str), 8388608L);
                ((AndroidTreehouseDispatchers) obj).ziplineThread = thread;
                return thread;
        }
    }
}
