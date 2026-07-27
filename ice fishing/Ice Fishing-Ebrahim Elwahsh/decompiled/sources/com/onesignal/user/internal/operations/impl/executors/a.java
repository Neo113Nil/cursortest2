package com.onesignal.user.internal.operations.impl.executors;

import android.os.Build;
import com.onesignal.common.AndroidUtils;
import java.util.List;
import p4.C4860a;
import q7.InterfaceC4936e;
import r7.AbstractC4979j;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;

/* loaded from: classes2.dex */
public final class a implements D4.d {
    public static final String CUSTOM_EVENT = "custom-event";
    public static final C0251a Companion = new C0251a(null);
    private final t4.f applicationService;
    private final P5.a customEventBackendService;
    private final y4.c deviceService;
    private final InterfaceC4936e eventMetadataJson$delegate;
    private final com.onesignal.core.internal.config.impl.c identityVerificationService;
    private final com.onesignal.user.internal.jwt.c jwtTokenStore;

    /* renamed from: com.onesignal.user.internal.operations.impl.executors.a$a, reason: collision with other inner class name */
    public static final class C0251a {
        public /* synthetic */ C0251a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0251a() {
        }
    }

    public static final class b extends kotlin.jvm.internal.i implements E7.a {
        public b() {
            super(0);
        }

        @Override // E7.a
        public final com.onesignal.user.internal.customEvents.impl.c invoke() {
            return new com.onesignal.user.internal.customEvents.impl.c(a.this.deviceService.getDeviceType().name(), com.onesignal.common.h.INSTANCE.getSdkVersion(), AndroidUtils.INSTANCE.getAppVersion(a.this.applicationService.getAppContext()), "AndroidPush", Build.MODEL, Build.VERSION.RELEASE);
        }
    }

    public static final class c extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.execute(null, this);
        }
    }

    public a(P5.a customEventBackendService, t4.f applicationService, y4.c deviceService, com.onesignal.user.internal.jwt.c jwtTokenStore, com.onesignal.core.internal.config.impl.c identityVerificationService) {
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
        this.eventMetadataJson$delegate = com.bumptech.glide.e.q(new b());
    }

    private final com.onesignal.user.internal.customEvents.impl.c getEventMetadataJson() {
        return (com.onesignal.user.internal.customEvents.impl.c) this.eventMetadataJson$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    @Override // D4.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(List<? extends D4.g> list, InterfaceC5133d interfaceC5133d) {
        c cVar;
        int i;
        try {
            if (interfaceC5133d instanceof c) {
                cVar = (c) interfaceC5133d;
                int i4 = cVar.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    cVar.label = i4 - Integer.MIN_VALUE;
                    c cVar2 = cVar;
                    Object obj = cVar2.result;
                    EnumC5179a enumC5179a = EnumC5179a.f41704n;
                    i = cVar2.label;
                    if (i != 0) {
                        com.bumptech.glide.f.r(obj);
                        D4.g gVar = (D4.g) AbstractC4979j.G(list);
                        if (gVar instanceof R5.l) {
                            String resolveJwt = com.onesignal.user.internal.operations.impl.executors.c.resolveJwt(gVar, this.jwtTokenStore, this.identityVerificationService);
                            P5.a aVar = this.customEventBackendService;
                            String appId = ((R5.l) gVar).getAppId();
                            String onesignalId = ((R5.l) gVar).getOnesignalId();
                            String externalId = gVar.getExternalId();
                            long timeStamp = ((R5.l) gVar).getTimeStamp();
                            String eventName = ((R5.l) gVar).getEventName();
                            String eventProperties = ((R5.l) gVar).getEventProperties();
                            com.onesignal.user.internal.customEvents.impl.c eventMetadataJson = getEventMetadataJson();
                            cVar2.label = 1;
                            if (aVar.sendCustomEvent(appId, onesignalId, externalId, timeStamp, eventName, eventProperties, eventMetadataJson, resolveJwt, cVar2) == enumC5179a) {
                                return enumC5179a;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.f.r(obj);
                    }
                    return new D4.a(D4.b.SUCCESS, null, null, null, 14, null);
                }
            }
            if (i != 0) {
            }
            return new D4.a(D4.b.SUCCESS, null, null, null, 14, null);
        } catch (C4860a e6) {
            int i9 = com.onesignal.user.internal.operations.impl.executors.b.$EnumSwitchMapping$0[com.onesignal.common.g.INSTANCE.getResponseStatusType(e6.getStatusCode()).ordinal()];
            return i9 != 1 ? i9 != 2 ? new D4.a(D4.b.FAIL_NORETRY, null, null, null, 14, null) : new D4.a(D4.b.FAIL_UNAUTHORIZED, null, null, e6.getRetryAfterSeconds(), 6, null) : new D4.a(D4.b.FAIL_RETRY, null, null, e6.getRetryAfterSeconds(), 6, null);
        }
        cVar = new c(interfaceC5133d);
        c cVar22 = cVar;
        Object obj2 = cVar22.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = cVar22.label;
    }

    @Override // D4.d
    public List<String> getOperations() {
        return p8.g.k(CUSTOM_EVENT);
    }
}
