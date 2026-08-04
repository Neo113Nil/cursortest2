package com.gamericefishpro.space.eh;

import android.os.Build;
import com.gamericefishpro.space.ph.w;
import com.onesignal.common.AndroidUtils;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.bd.d {
    public static final String CUSTOM_EVENT = "custom-event";
    public static final C0012a Companion = new C0012a(null);
    private final com.gamericefishpro.space.lc.f applicationService;
    private final com.gamericefishpro.space.zg.a customEventBackendService;
    private final com.gamericefishpro.space.vc.c deviceService;
    private final com.gamericefishpro.space.oh.h eventMetadataJson$delegate;

    /* JADX INFO: renamed from: com.gamericefishpro.space.eh.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0012a {
        public /* synthetic */ C0012a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0012a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.ei.l implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.gamericefishpro.space.ah.c invoke() {
            return new com.gamericefishpro.space.ah.c(a.this.deviceService.getDeviceType().name(), com.gamericefishpro.space.yb.g.INSTANCE.getSdkVersion(), AndroidUtils.INSTANCE.getAppVersion(a.this.applicationService.getAppContext()), "AndroidPush", Build.MODEL, Build.VERSION.RELEASE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public c(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.execute(null, this);
        }
    }

    public a(com.gamericefishpro.space.zg.a customEventBackendService, com.gamericefishpro.space.lc.f applicationService, com.gamericefishpro.space.vc.c deviceService) {
        Intrinsics.checkNotNullParameter(customEventBackendService, "customEventBackendService");
        Intrinsics.checkNotNullParameter(applicationService, "applicationService");
        Intrinsics.checkNotNullParameter(deviceService, "deviceService");
        this.customEventBackendService = customEventBackendService;
        this.applicationService = applicationService;
        this.deviceService = deviceService;
        this.eventMetadataJson$delegate = com.gamericefishpro.space.oh.i.b(new b());
    }

    private final com.gamericefishpro.space.ah.c getEventMetadataJson() {
        return (com.gamericefishpro.space.ah.c) this.eventMetadataJson$delegate.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // com.gamericefishpro.space.bd.d
    public Object execute(List<? extends com.gamericefishpro.space.bd.g> list, com.gamericefishpro.space.th.a aVar) {
        c cVar;
        if (aVar instanceof c) {
            cVar = (c) aVar;
            int i = cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.label = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(aVar);
            }
        } else {
            cVar = new c(aVar);
        }
        c cVar2 = cVar;
        Object obj = cVar2.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = cVar2.label;
        try {
            if (i2 == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.bd.g gVar = (com.gamericefishpro.space.bd.g) CollectionsKt.w(list);
                if (gVar instanceof com.gamericefishpro.space.dh.l) {
                    com.gamericefishpro.space.zg.a aVar3 = this.customEventBackendService;
                    String appId = ((com.gamericefishpro.space.dh.l) gVar).getAppId();
                    String onesignalId = ((com.gamericefishpro.space.dh.l) gVar).getOnesignalId();
                    String externalId = ((com.gamericefishpro.space.dh.l) gVar).getExternalId();
                    long timeStamp = ((com.gamericefishpro.space.dh.l) gVar).getTimeStamp();
                    String eventName = ((com.gamericefishpro.space.dh.l) gVar).getEventName();
                    String eventProperties = ((com.gamericefishpro.space.dh.l) gVar).getEventProperties();
                    com.gamericefishpro.space.ah.c eventMetadataJson = getEventMetadataJson();
                    cVar2.label = 1;
                    if (aVar3.sendCustomEvent(appId, onesignalId, externalId, timeStamp, eventName, eventProperties, eventMetadataJson, cVar2) == aVar2) {
                        return aVar2;
                    }
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.SUCCESS, null, null, null, 14, null);
        } catch (com.gamericefishpro.space.ec.a e) {
            return com.gamericefishpro.space.eh.b.$EnumSwitchMapping$0[com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()] == 1 ? new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null) : new com.gamericefishpro.space.bd.a(com.gamericefishpro.space.bd.b.FAIL_NORETRY, null, null, null, 14, null);
        }
    }

    @Override // com.gamericefishpro.space.bd.d
    public List<String> getOperations() {
        return w.c(CUSTOM_EVENT);
    }
}
