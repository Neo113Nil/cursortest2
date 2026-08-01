package com.onesignal.core.internal.backend.impl;

import Q7.j;
import Q7.q;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;
import y4.f;
import y4.g;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class a implements y4.b {
    public static final C0182a Companion = new C0182a(null);
    private static final int LOG_BODY_SNIPPET_MAX_CHARS = 200;
    public static final String TURBINE_FEATURES_PLATFORM_ANDROID = "android";
    private final E4.c http;

    /* renamed from: com.onesignal.core.internal.backend.impl.a$a, reason: collision with other inner class name */
    public static final class C0182a {
        public /* synthetic */ C0182a(e eVar) {
            this();
        }

        public final String buildFeatureFlagsGetPath$com_onesignal_core(String appId, String platform, String sdkVersion) {
            h.e(appId, "appId");
            h.e(platform, "platform");
            h.e(sdkVersion, "sdkVersion");
            return d.INSTANCE.buildGetPath(appId, platform, sdkVersion);
        }

        public final boolean isValidFeaturesSdkVersionLabel(String label) {
            h.e(label, "label");
            return d.INSTANCE.isValidFeaturesSdkVersionLabel(label);
        }

        private C0182a() {
        }
    }

    public static final class b extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.fetchRemoteFeatureFlags(null, this);
        }
    }

    public a(E4.c http) {
        h.e(http, "http");
        this.http = http;
    }

    private final String bodySnippet(String str) {
        if (str == null || str.length() == 0) {
            return "<empty>";
        }
        String O8 = q.O(q.O(str, '\n', ' '), '\r', ' ');
        return O8.length() <= 200 ? O8 : j.o0(200, O8).concat("…");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // y4.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object fetchRemoteFeatureFlags(String str, InterfaceC5267d interfaceC5267d) {
        b bVar;
        int i;
        a aVar;
        E4.a aVar2;
        if (interfaceC5267d instanceof b) {
            bVar = (b) interfaceC5267d;
            int i6 = bVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                bVar.label = i6 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                A7.a aVar3 = A7.a.f58n;
                i = bVar.label;
                if (i != 0) {
                    com.bumptech.glide.d.k(obj);
                    com.onesignal.debug.internal.logging.b.log(M4.c.DEBUG, "FeatureFlagsBackendService.fetchRemoteFeatureFlags(appId=" + str + ')');
                    String sdkVersion = com.onesignal.common.h.INSTANCE.getSdkVersion();
                    if (!Companion.isValidFeaturesSdkVersionLabel(sdkVersion)) {
                        com.onesignal.debug.internal.logging.b.warn$default(u1.h.b('\'', "FeatureFlagsBackendService: sdk version not usable for Turbine path (expected 6-digit label optional -suffix, e.g. 050801 or 050801-beta): '", sdkVersion), null, 2, null);
                        return f.b.INSTANCE;
                    }
                    String buildGetPath = d.INSTANCE.buildGetPath(str, TURBINE_FEATURES_PLATFORM_ANDROID, sdkVersion);
                    E4.c cVar = this.http;
                    bVar.L$0 = this;
                    bVar.label = 1;
                    obj = cVar.get(buildGetPath, null, bVar);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                    aVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) bVar.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                aVar2 = (E4.a) obj;
                String payload = aVar2.getPayload();
                if (aVar2.isSuccess()) {
                    String str2 = "FeatureFlagsBackendService: non-success status=" + aVar2.getStatusCode() + " body=" + aVar.bodySnippet(payload);
                    if (aVar2.isClientError()) {
                        com.onesignal.debug.internal.logging.b.warn$default(str2, null, 2, null);
                    } else {
                        com.onesignal.debug.internal.logging.b.debug$default(str2, null, 2, null);
                    }
                    return f.b.INSTANCE;
                }
                if (payload == null || j.c0(payload)) {
                    com.onesignal.debug.internal.logging.b.warn$default("FeatureFlagsBackendService: empty body for success status=" + aVar2.getStatusCode(), null, 2, null);
                    return f.b.INSTANCE;
                }
                g parseSuccessful = com.onesignal.core.internal.backend.impl.b.INSTANCE.parseSuccessful(payload);
                if (parseSuccessful != null) {
                    return new f.a(parseSuccessful);
                }
                com.onesignal.debug.internal.logging.b.warn$default("FeatureFlagsBackendService: response body is not valid Turbine feature-flags JSON: " + aVar.bodySnippet(payload), null, 2, null);
                return f.b.INSTANCE;
            }
        }
        bVar = new b(interfaceC5267d);
        Object obj2 = bVar.result;
        A7.a aVar32 = A7.a.f58n;
        i = bVar.label;
        if (i != 0) {
        }
        aVar2 = (E4.a) obj2;
        String payload2 = aVar2.getPayload();
        if (aVar2.isSuccess()) {
        }
    }
}
