package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Dl {

    /* renamed from: a, reason: collision with root package name */
    public final String f4321a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4322b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f4323c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f4324d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4325e;

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f4326f;

    public Dl(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f4321a = str;
        this.f4322b = str2;
        this.f4323c = num;
        this.f4324d = num2;
        this.f4325e = str3;
        this.f4326f = bool;
    }

    public Dl(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
