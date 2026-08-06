package io.appmetrica.analytics.impl;

import java.util.Set;

/* loaded from: classes.dex */
public interface Ha {
    Ha a(int i2, String str);

    Ha a(String str, float f2);

    Ha a(String str, long j2);

    Ha a(String str, String str2);

    Ha a(String str, boolean z2);

    Set a();

    boolean a(String str);

    void b();

    boolean getBoolean(String str, boolean z2);

    int getInt(String str, int i2);

    long getLong(String str, long j2);

    String getString(String str, String str2);

    Ha remove(String str);
}
