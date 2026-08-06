package io.appmetrica.analytics.ndkcrashesapi.internal;

import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class NativeCrash {

    /* renamed from: a, reason: collision with root package name */
    private final NativeCrashSource f7399a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7400b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7401c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7402d;

    /* renamed from: e, reason: collision with root package name */
    private final long f7403e;

    /* renamed from: f, reason: collision with root package name */
    private final String f7404f;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final NativeCrashSource f7405a;

        /* renamed from: b, reason: collision with root package name */
        private final String f7406b;

        /* renamed from: c, reason: collision with root package name */
        private final String f7407c;

        /* renamed from: d, reason: collision with root package name */
        private final String f7408d;

        /* renamed from: e, reason: collision with root package name */
        private final long f7409e;

        /* renamed from: f, reason: collision with root package name */
        private final String f7410f;

        public Builder(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j2, String str4) {
            this.f7405a = nativeCrashSource;
            this.f7406b = str;
            this.f7407c = str2;
            this.f7408d = str3;
            this.f7409e = j2;
            this.f7410f = str4;
        }

        public final NativeCrash build() {
            return new NativeCrash(this.f7405a, this.f7406b, this.f7407c, this.f7408d, this.f7409e, this.f7410f, null);
        }
    }

    public /* synthetic */ NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j2, String str4, e eVar) {
        this(nativeCrashSource, str, str2, str3, j2, str4);
    }

    public final long getCreationTime() {
        return this.f7403e;
    }

    public final String getDumpFile() {
        return this.f7402d;
    }

    public final String getHandlerVersion() {
        return this.f7400b;
    }

    public final String getMetadata() {
        return this.f7404f;
    }

    public final NativeCrashSource getSource() {
        return this.f7399a;
    }

    public final String getUuid() {
        return this.f7401c;
    }

    private NativeCrash(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j2, String str4) {
        this.f7399a = nativeCrashSource;
        this.f7400b = str;
        this.f7401c = str2;
        this.f7402d = str3;
        this.f7403e = j2;
        this.f7404f = str4;
    }
}
