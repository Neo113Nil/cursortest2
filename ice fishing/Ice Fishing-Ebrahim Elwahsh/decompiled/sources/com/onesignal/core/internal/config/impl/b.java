package com.onesignal.core.internal.config.impl;

import E7.l;
import O7.C0396v;
import O7.Y;
import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.i;
import q7.v;
import r7.AbstractC4979j;
import t4.f;
import u4.f;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x7.AbstractC5219c;
import x7.h;

/* loaded from: classes2.dex */
public final class b implements com.onesignal.core.internal.startup.b, t4.e, g {
    public static final a Companion = new a(null);
    private static final long DEFAULT_REFRESH_INTERVAL_MS = 480000;
    private final f applicationService;
    private final com.onesignal.core.internal.config.c configModelStore;
    private final u4.b featureFlagsBackend;
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
    public static final class C0188b extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C0188b(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.fetchAndApply(null, this);
        }
    }

    public static final class c extends i implements E7.a {
        public c() {
            super(0);
        }

        @Override // E7.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m14invoke();
            return v.f40183a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m14invoke() {
            b.this.restartForegroundPolling();
        }
    }

    public static final class d extends i implements E7.a {
        public d() {
            super(0);
        }

        @Override // E7.a
        public /* bridge */ /* synthetic */ Object invoke() {
            m15invoke();
            return v.f40183a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m15invoke() {
            b bVar = b.this;
            synchronized (bVar) {
                Y y6 = bVar.pollJob;
                if (y6 != null) {
                    y6.a(null);
                }
                bVar.pollJob = null;
                bVar.pollingAppId = null;
            }
        }
    }

    public static final class e extends h implements l {
        int label;

        public e(InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return b.this.new e(interfaceC5133d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x007c, code lost:
        
            if (O7.AbstractC0399y.f(r4, r6) != r0) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
        
            if (r1.fetchAndApply(r7, r6) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
        
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x007c -> B:12:0x0020). Please report as a decompilation issue!!! */
        @Override // x7.AbstractC5217a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    try {
                        com.bumptech.glide.f.r(obj);
                    } catch (CancellationException e6) {
                        throw e6;
                    } catch (Exception e9) {
                        com.onesignal.debug.internal.logging.b.warn("FeatureFlagsRefreshService: fetch failed", e9);
                    }
                    long refreshIntervalMs$com_onesignal_core = b.this.getRefreshIntervalMs$com_onesignal_core();
                    this.label = 2;
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            com.bumptech.glide.f.r(obj);
            Y y6 = (Y) getContext().i(C0396v.f2634u);
            if (!(y6 != null ? y6.j() : true) || !b.this.applicationService.isInForeground()) {
                return v.f40183a;
            }
            String appId = ((com.onesignal.core.internal.config.b) b.this.configModelStore.getModel()).getAppId();
            if (appId.length() > 0) {
                b bVar = b.this;
                this.label = 1;
            }
            long refreshIntervalMs$com_onesignal_core2 = b.this.getRefreshIntervalMs$com_onesignal_core();
            this.label = 2;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((e) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public b(f applicationService, com.onesignal.core.internal.config.c configModelStore, u4.b featureFlagsBackend) {
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
    public final Object fetchAndApply(String str, InterfaceC5133d interfaceC5133d) {
        C0188b c0188b;
        int i;
        b bVar;
        boolean a9;
        if (interfaceC5133d instanceof C0188b) {
            c0188b = (C0188b) interfaceC5133d;
            int i4 = c0188b.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0188b.label = i4 - Integer.MIN_VALUE;
                Object obj = c0188b.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = c0188b.label;
                if (i != 0) {
                    com.bumptech.glide.f.r(obj);
                    u4.b bVar2 = this.featureFlagsBackend;
                    c0188b.L$0 = this;
                    c0188b.label = 1;
                    obj = bVar2.fetchRemoteFeatureFlags(str, c0188b);
                    if (obj == enumC5179a) {
                        return enumC5179a;
                    }
                    bVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (b) c0188b.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                u4.f fVar = (u4.f) obj;
                a9 = kotlin.jvm.internal.h.a(fVar, f.b.INSTANCE);
                v vVar = v.f40183a;
                if (!a9) {
                    if (!(fVar instanceof f.a)) {
                        throw new B0.c();
                    }
                    u4.g result = ((f.a) fVar).getResult();
                    com.onesignal.core.internal.config.b bVar3 = (com.onesignal.core.internal.config.b) bVar.configModelStore.getModel();
                    String encodeMetadata = com.onesignal.core.internal.backend.impl.b.INSTANCE.encodeMetadata(result.getMetadata());
                    if (!AbstractC4979j.V(result.getEnabledKeys()).equals(AbstractC4979j.V(bVar3.getSdkRemoteFeatureFlags())) || !kotlin.jvm.internal.h.a(encodeMetadata, bVar3.getSdkRemoteFeatureFlagMetadata())) {
                        com.onesignal.common.modeling.i.setListProperty$default(bVar3, "sdkRemoteFeatureFlags", result.getEnabledKeys(), "REMOTE_FEATURE_FLAGS", false, 8, null);
                        com.onesignal.common.modeling.i.setOptStringProperty$default(bVar3, "sdkRemoteFeatureFlagMetadata", encodeMetadata, "REMOTE_FEATURE_FLAGS", false, 8, null);
                        return vVar;
                    }
                }
                return vVar;
            }
        }
        c0188b = new C0188b(interfaceC5133d);
        Object obj2 = c0188b.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = c0188b.label;
        if (i != 0) {
        }
        u4.f fVar2 = (u4.f) obj2;
        a9 = kotlin.jvm.internal.h.a(fVar2, f.b.INSTANCE);
        v vVar2 = v.f40183a;
        if (!a9) {
        }
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void restartForegroundPolling() {
        synchronized (this) {
            String appId = ((com.onesignal.core.internal.config.b) this.configModelStore.getModel()).getAppId();
            if (appId.length() == 0) {
                Y y6 = this.pollJob;
                if (y6 != null) {
                    y6.a(null);
                }
                this.pollJob = null;
                this.pollingAppId = null;
                return;
            }
            if (kotlin.jvm.internal.h.a(this.pollingAppId, appId)) {
                return;
            }
            Y y8 = this.pollJob;
            if (y8 != null) {
                y8.a(null);
            }
            this.pollingAppId = appId;
            this.pollJob = com.onesignal.common.threading.b.INSTANCE.launchOnIO(new e(null));
        }
    }

    public final long getRefreshIntervalMs$com_onesignal_core() {
        return this.refreshIntervalMs;
    }

    @Override // t4.e
    public void onFocus(boolean z8) {
        com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new c());
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j args, String tag) {
        kotlin.jvm.internal.h.e(args, "args");
        kotlin.jvm.internal.h.e(tag, "tag");
        if (kotlin.jvm.internal.h.a(args.getProperty(), com.anythink.expressad.videocommon.e.b.f22565u) && this.applicationService.isInForeground()) {
            restartForegroundPolling();
        }
    }

    @Override // t4.e
    public void onUnfocused() {
        com.onesignal.common.threading.c.runOnSerialIOIfBackgroundThreading(new d());
    }

    public final void setRefreshIntervalMs$com_onesignal_core(long j9) {
        this.refreshIntervalMs = j9;
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
