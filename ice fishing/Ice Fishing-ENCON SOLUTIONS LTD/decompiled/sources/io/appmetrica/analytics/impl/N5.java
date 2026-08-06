package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes.dex */
public class N5 extends BaseRequestConfig {

    /* renamed from: a, reason: collision with root package name */
    public String f4798a;

    /* renamed from: b, reason: collision with root package name */
    public String f4799b;

    /* renamed from: c, reason: collision with root package name */
    public C0415fm f4800c;

    public final String b() {
        return this.f4799b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public String toString() {
        return "CoreRequestConfig{mAppDebuggable='" + this.f4798a + "', mAppSystem='" + this.f4799b + "', startupState=" + this.f4800c + '}';
    }

    public final String a() {
        return this.f4798a;
    }
}
