package com.squareup.cash.lifecycle;

/* loaded from: classes.dex */
public enum ActivityEvent {
    CREATE("CREATE", 0),
    START("START", 1),
    RESUME("RESUME", 2),
    PAUSE("PAUSE", 3),
    STOP("STOP", 4),
    DESTROY("DESTROY", 5);

    public final boolean resumed;
    public final boolean started;

    ActivityEvent(String str, int i) {
        this.started = r1;
        this.resumed = r2;
    }
}
