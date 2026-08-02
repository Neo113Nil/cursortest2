package com.bugsnag.android.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class TaskType {
    public static final /* synthetic */ TaskType[] $VALUES;
    public static final TaskType DEFAULT;
    public static final TaskType ERROR_REQUEST;
    public static final TaskType INTERNAL_REPORT;
    public static final TaskType IO;
    public static final TaskType SESSION_REQUEST;

    static {
        TaskType taskType = new TaskType("ERROR_REQUEST", 0);
        ERROR_REQUEST = taskType;
        TaskType taskType2 = new TaskType("SESSION_REQUEST", 1);
        SESSION_REQUEST = taskType2;
        TaskType taskType3 = new TaskType("IO", 2);
        IO = taskType3;
        TaskType taskType4 = new TaskType("INTERNAL_REPORT", 3);
        INTERNAL_REPORT = taskType4;
        TaskType taskType5 = new TaskType("DEFAULT", 4);
        DEFAULT = taskType5;
        $VALUES = new TaskType[]{taskType, taskType2, taskType3, taskType4, taskType5};
    }

    public static TaskType valueOf(String str) {
        return (TaskType) Enum.valueOf(TaskType.class, str);
    }

    public static TaskType[] values() {
        return (TaskType[]) $VALUES.clone();
    }
}
