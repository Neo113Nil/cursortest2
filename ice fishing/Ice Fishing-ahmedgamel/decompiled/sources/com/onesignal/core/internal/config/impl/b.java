package com.onesignal.core.internal.config.impl;

import B7.h;
import I7.l;
import S7.C0407v;
import S7.Y;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import u7.v;
import v7.AbstractC5119j;
import x4.f;
import y4.f;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class b implements com.onesignal.core.internal.startup.b, x4.e, g {
    public static final a Companion = new a(null);
    private static final long DEFAULT_REFRESH_INTERVAL_MS = 480000;
    private final f applicationService;
    private final com.onesignal.core.internal.config.c configModelStore;
    private final y4.b featureFlagsBackend;
    private Y pollJob;
    private String pollingAppId;
    private long refreshIntervalMs;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: com.onesignal.core.internal.config.impl.b$b, reason: collision with other inner class name */
    public static final class C0189b extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0189b(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.fetchAndApply(null, this);
        }
    }

    public static final class c extends i implements I7.a {
        public c() {
            super(0);
        }

        @Override // I7.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m18invoke();
            return v.f41073a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m18invoke() {
            b.this.restartForegroundPolling();
        }
    }

    public static final class d extends i implements I7.a {
        public d() {
            super(0);
        }

        @Override // I7.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m19invoke();
            return v.f41073a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m19invoke() {
            b bVar = b.this;
            synchronized (bVar) {
                Y y7 = bVar.pollJob;
                if (y7 != null) {
                    y7.a(null);
                }
                bVar.pollJob = null;
                bVar.pollingAppId = null;
            }
        }
    }

    public static final class e extends h implements l {
        int label;

        public e(InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return b.this.new e(interfaceC5240d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x007c, code lost:
        
            if (S7.AbstractC0410y.f(r4, r6) != r0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
        
            if (r1.fetchAndApply(r7, r6) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
        
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x007c -> B:12:0x0020). Please report as a decompilation issue!!! */
        @Override // B7.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    try {
                        Q3.b.s(obj);
                    } catch (CancellationException e9) {
                        throw e9;
                    } catch (Exception e10) {
                        com.onesignal.debug.internal.logging.b.warn("FeatureFlagsRefreshService: fetch failed", e10);
                    }
                    long refreshIntervalMs$com_onesignal_core = b.this.getRefreshIntervalMs$com_onesignal_core();
                    this.label = 2;
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            Q3.b.s(obj);
            Y y7 = (Y) getContext().m(C0407v.f3081u);
            if (!(y7 != null ? y7.j() : true) || !b.this.applicationService.isInForeground()) {
                return v.f41073a;
            }
            String appId = ((com.onesignal.core.internal.config.b) b.this.configModelStore.getModel()).getAppId();
            if (appId.length() > 0) {
                b bVar = b.this;
                this.label = 1;
            }
            long refreshIntervalMs$com_onesignal_core2 = b.this.getRefreshIntervalMs$com_onesignal_core();
            this.label = 2;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((e) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public b(f applicationService, com.onesignal.core.internal.config.c configModelStore, y4.b featureFlagsBackend) {
        kotlin.jvm.internal.h.e(applicationService, "applicationService");
        kotlin.jvm.internal.h.e(configModelStore, "configModelStore");
        kotlin.jvm.internal.h.e(featureFlagsBackend, "featureFlagsBackend");
        this.applicationService = applicationService;
        this.configModelStore = configModelStore;
        this.featureFlagsBackend = featureFlagsBackend;
        this.refreshIntervalMs = DEFAULT_REFRESH_INTERVAL_MS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAndApply(String str, InterfaceC5240d interfaceC5240d) {
        C0189b c0189b;
        int i;
        b bVar;
        boolean a9;
        if (interfaceC5240d instanceof C0189b) {
            c0189b = (C0189b) interfaceC5240d;
            int i4 = c0189b.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0189b.label = i4 - Integer.MIN_VALUE;
                Object obj = c0189b.result;
                A7.a aVar = A7.a.f215n;
                i = c0189b.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    y4.b bVar2 = this.featureFlagsBackend;
                    c0189b.L$0 = this;
                    c0189b.label = 1;
                    obj = bVar2.fetchRemoteFeatureFlags(str, c0189b);
                    if (obj == aVar) {
                        return aVar;
                    }
                    bVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (b) c0189b.L$0;
                    Q3.b.s(obj);
                }
                y4.f fVar = (y4.f) obj;
                a9 = kotlin.jvm.internal.h.a(fVar, f.b.INSTANCE);
                v vVar = v.f41073a;
                if (!a9) {
                    if (!(fVar instanceof f.a)) {
                        throw new B0.c();
                    }
                    y4.g result = ((f.a) fVar).getResult();
                    com.onesignal.core.internal.config.b bVar3 = (com.onesignal.core.internal.config.b) bVar.configModelStore.getModel();
                    String encodeMetadata = com.onesignal.core.internal.backend.impl.b.INSTANCE.encodeMetadata(result.getMetadata());
                    if (!AbstractC5119j.N(result.getEnabledKeys()).equals(AbstractC5119j.N(bVar3.getSdkRemoteFeatureFlags())) || !kotlin.jvm.internal.h.a(encodeMetadata, bVar3.getSdkRemoteFeatureFlagMetadata())) {
                        com.onesignal.common.modeling.i.setListProperty$default(bVar3, "sdkRemoteFeatureFlags", result.getEnabledKeys(), "REMOTE_FEATURE_FLAGS", false, 8, null);
                        com.onesignal.common.modeling.i.setOptStringProperty$default(bVar3, "sdkRemoteFeatureFlagMetadata", encodeMetadata, "REMOTE_FEATURE_FLAGS", false, 8, null);
                        return vVar;
                    }
                }
                return vVar;
            }
        }
        c0189b = new C0189b(interfaceC5240d);
        Object obj2 = c0189b.result;
        A7.a aVar2 = A7.a.f215n;
        i = c0189b.label;
        if (i != 0) {
        }
        y4.f fVar2 = (y4.f) obj2;
        a9 = kotlin.jvm.internal.h.a(fVar2, f.b.INSTANCE);
        v vVar2 = v.f41073a;
        if (!a9) {
        }
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restartForegroundPolling() {
        synchronized (this) {
            String appId = ((com.onesignal.core.internal.config.b) this.configModelStore.getModel()).getAppId();
            if (appId.length() == 0) {
                Y y7 = this.pollJob;
                if (y7 != null) {
                    y7.a(null);
                }
                this.pollJob = null;
                this.pollingAppId = null;
                return;
            }
            if (kotlin.jvm.internal.h.a(this.pollingAppId, appId)) {
                return;
            }
            Y y9 = this.pollJob;
            if (y9 != null) {
                y9.a(null);
            }
            this.pollingAppId = appId;
            this.pollJob = com.onesignal.common.threading.b.INSTANCE.launchOnIO(new e(null));
        }
    }

    public final long getRefreshIntervalMs$com_onesignal_core() {
        return this.refreshIntervalMs;
    }

    @Override // x4.e
    public void onFocus(boolean z6) {
        com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new c());
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j args, String tag) {
        kotlin.jvm.internal.h.e(args, "args");
        kotlin.jvm.internal.h.e(tag, "tag");
        if (kotlin.jvm.internal.h.a(args.getProperty(), com.anythink.expressad.videocommon.e.b.f23194u) && this.applicationService.isInForeground()) {
            restartForegroundPolling();
        }
    }

    @Override // x4.e
    public void onUnfocused() {
        com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new d());
    }

    public final void setRefreshIntervalMs$com_onesignal_core(long j6) {
        this.refreshIntervalMs = j6;
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        this.applicationService.addApplicationLifecycleHandler(this);
        this.configModelStore.subscribe((g) this);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        kotlin.jvm.internal.h.e(model, "model");
        kotlin.jvm.internal.h.e(tag, "tag");
        if ((tag.equals("HYDRATE") || tag.equals("NORMAL")) && model.getAppId().length() > 0 && this.applicationService.isInForeground()) {
            restartForegroundPolling();
        }
    }
}
