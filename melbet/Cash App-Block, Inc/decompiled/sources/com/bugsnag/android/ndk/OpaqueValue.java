package com.bugsnag.android.ndk;

import androidx.tracing.Trace;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/bugsnag/android/ndk/OpaqueValue;", "", "", "json", "Ljava/lang/String;", "getJson", "()Ljava/lang/String;", "androidx/tracing/Trace", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OpaqueValue {
    public final String json;

    public OpaqueValue(String str) {
        this.json = str;
    }

    public static final Object makeSafe(Object obj) {
        return Trace.makeSafe(obj);
    }

    public final String getJson() {
        return this.json;
    }
}
