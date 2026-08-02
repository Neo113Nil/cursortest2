package com.datadog.android.rum.internal.anr;

import com.datadog.android.api.InternalLogger;
import kotlin.text.Regex;

/* loaded from: classes4.dex */
public final class AndroidTraceParser {
    public static final Regex THREAD_NAME_REGEX = new Regex("^\"(.+)\".+$");
    public final InternalLogger internalLogger;

    public AndroidTraceParser(InternalLogger internalLogger) {
        internalLogger.getClass();
        this.internalLogger = internalLogger;
    }
}
