package com.google.firebase.messaging;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public abstract class CommonNotificationBuilder {
    public static final AtomicInteger requestCodeProvider = new AtomicInteger((int) SystemClock.elapsedRealtime());
}
