package com.onesignal.user.internal.operations.impl.executors;

import N3.C;
import android.os.Build;
import com.onesignal.common.AndroidUtils;
import java.util.List;
import t4.C5041a;
import u7.InterfaceC5079e;
import v7.AbstractC5119j;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class a implements H4.d {
    public static final String CUSTOM_EVENT = "custom-event";
    public static final C0252a Companion = new C0252a(null);
    private final x4.f applicationService;
    private final T5.a customEventBackendService;
    private final C4.c deviceService;
    private final InterfaceC5079e eventMetadataJson$delegate;
    private final com.onesignal.core.internal.config.impl.c identityVerificationService;
    private final com.onesignal.user.internal.jwt.c jwtTokenStore;

    /* renamed from: com.onesignal.user.internal.operations.impl.executors.a$a, reason: collision with other inner class name */
    public static final class C0252a {
        public /* synthetic */ C0252a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0252a() {
        }
    }

    public static final class b extends kotlin.jvm.internal.i implements I7.a {
        public b() {
            super(0);
        }

        @Override // I7.a
        public final com.onesignal.user.internal.customEvents.impl.c invoke() {
            return new com.onesignal.user.internal.customEvents.impl.c(a.this.deviceService.getDeviceType().name(), com.onesignal.common.h.INSTANCE.getSdkVersion(), AndroidUtils.INSTANCE.getAppVersion(a.this.applicationService.getAppContext()), "AndroidPush", Build.MODEL, Build.VERSION.RELEASE);
        }
    }

    public static final class c extends B7.c {
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.execute(null, this);
        }
    }

    public a(T5.a customEventBackendService, x4.f applicationService, C4.c deviceService, com.onesignal.user.internal.jwt.c jwtTokenStore, com.onesignal.core.internal.config.impl.c identityVerificationService) {
        kotlin.jvm.internal.h.e(customEventBackendService, "customEventBackendService");
        kotlin.jvm.internal.h.e(applicationService, "applicationService");
        kotlin.jvm.internal.h.e(deviceService, "deviceService");
        kotlin.jvm.internal.h.e(jwtTokenStore, "jwtTokenStore");
        kotlin.jvm.internal.h.e(identityVerificationService, "identityVerificationService");
        this.customEventBackendService = customEventBackendService;
        this.applicationService = applicationService;
        this.deviceService = deviceService;
        this.jwtTokenStore = jwtTokenStore;
        this.identityVerificationService = identityVerificationService;
        this.eventMetadataJson$delegate = C.O(new b());
    }

    private final com.onesignal.user.internal.customEvents.impl.c getEventMetadataJson() {
        return (com.onesignal.user.internal.customEvents.impl.c) this.eventMetadataJson$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    @Override // H4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends H4.g> list, InterfaceC5240d interfaceC5240d) {
        c cVar;
        int i;
        try {
            if (interfaceC5240d instanceof c) {
                cVar = (c) interfaceC5240d;
                int i4 = cVar.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    cVar.label = i4 - Integer.MIN_VALUE;
                    c cVar2 = cVar;
                    Object obj = cVar2.result;
                    A7.a aVar = A7.a.f215n;
                    i = cVar2.label;
                    if (i != 0) {
                        Q3.b.s(obj);
                        H4.g gVar = (H4.g) AbstractC5119j.y(list);
                        if (gVar instanceof V5.l) {
                            String resolveJwt = com.onesignal.user.internal.operations.impl.executors.c.resolveJwt(gVar, this.jwtTokenStore, this.identityVerificationService);
                            T5.a aVar2 = this.customEventBackendService;
                            String appId = ((V5.l) gVar).getAppId();
                            String onesignalId = ((V5.l) gVar).getOnesignalId();
                            String externalId = gVar.getExternalId();
                            long timeStamp = ((V5.l) gVar).getTimeStamp();
                            String eventName = ((V5.l) gVar).getEventName();
                            String eventProperties = ((V5.l) gVar).getEventProperties();
                            com.onesignal.user.internal.customEvents.impl.c eventMetadataJson = getEventMetadataJson();
                            cVar2.label = 1;
                            if (aVar2.sendCustomEvent(appId, onesignalId, externalId, timeStamp, eventName, eventProperties, eventMetadataJson, resolveJwt, cVar2) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Q3.b.s(obj);
                    }
                    return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
                }
            }
            if (i != 0) {
            }
            return new H4.a(H4.b.SUCCESS, null, null, null, 14, null);
        } catch (C5041a e9) {
            int i6 = com.onesignal.user.internal.operations.impl.executors.b.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e9.getStatusCode()).ordinal()];
            return i6 != 1 ? i6 != 2 ? new H4.a(H4.b.FAIL_NORETRY, null, null, null, 14, null) : new H4.a(H4.b.FAIL_UNAUTHORIZED, null, null, e9.getRetryAfterSeconds(), 6, null) : new H4.a(H4.b.FAIL_RETRY, null, null, e9.getRetryAfterSeconds(), 6, null);
        }
        cVar = new c(interfaceC5240d);
        c cVar22 = cVar;
        Object obj2 = cVar22.result;
        A7.a aVar3 = A7.a.f215n;
        i = cVar22.label;
    }

    @Override // H4.d
    public List<String> getOperations() {
        return Z2.d.n(CUSTOM_EVENT);
    }
}
