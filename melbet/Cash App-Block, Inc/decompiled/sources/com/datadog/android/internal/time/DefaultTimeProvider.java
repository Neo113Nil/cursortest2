package com.datadog.android.internal.time;

import com.squareup.util.Strings;

/* loaded from: classes.dex */
public final class DefaultTimeProvider extends Strings {
    @Override // com.squareup.util.Strings
    public final long getServerTimestampMillis() {
        return System.currentTimeMillis();
    }
}
