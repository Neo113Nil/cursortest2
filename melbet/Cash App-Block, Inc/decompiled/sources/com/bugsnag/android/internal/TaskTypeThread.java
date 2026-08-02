package com.bugsnag.android.internal;

/* loaded from: classes.dex */
public final class TaskTypeThread extends Thread {
    public final TaskType taskType;

    public TaskTypeThread(Runnable runnable, String str, TaskType taskType) {
        super(runnable, str);
        this.taskType = taskType;
    }
}
