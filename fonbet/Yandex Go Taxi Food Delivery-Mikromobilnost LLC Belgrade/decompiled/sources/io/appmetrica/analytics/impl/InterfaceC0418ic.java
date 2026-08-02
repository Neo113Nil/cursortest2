package io.appmetrica.analytics.impl;

import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.ic, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC0418ic {
    InterfaceC0418ic a(String str, float f);

    InterfaceC0418ic a(String str, int i);

    InterfaceC0418ic a(String str, long j);

    InterfaceC0418ic a(String str, String str2);

    InterfaceC0418ic a(String str, boolean z);

    void a();

    boolean a(String str);

    Set b();

    void flushAsync();

    boolean getBoolean(String str, boolean z);

    int getInt(String str, int i);

    long getLong(String str, long j);

    String getString(String str, String str2);

    InterfaceC0418ic remove(String str);
}
