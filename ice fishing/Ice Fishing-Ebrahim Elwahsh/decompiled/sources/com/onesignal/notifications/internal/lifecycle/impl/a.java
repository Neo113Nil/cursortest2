package com.onesignal.notifications.internal.lifecycle.impl;

import D.y;
import E7.p;
import O7.AbstractC0399y;
import O7.InterfaceC0397w;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ads.CL;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.g;
import f5.InterfaceC4515a;
import h5.InterfaceC4569a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p4.C4860a;
import p5.C4863b;
import q7.v;
import r7.C4977h;
import t5.InterfaceC5081a;
import v7.InterfaceC5133d;
import w7.EnumC5179a;
import x5.InterfaceC5214b;
import x7.AbstractC5219c;
import y4.EnumC5252a;

/* loaded from: classes2.dex */
public final class a implements t5.b, com.onesignal.notifications.internal.a {
    public static final C0232a Companion = new C0232a(null);
    private static final long MILLIS_PER_SECOND = 1000;
    private static final int RETRY_BACKOFF_MS = 15000;
    private final InterfaceC4515a _analyticsTracker;
    private final t4.f _applicationService;
    private final InterfaceC4569a _backend;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final y4.c _deviceService;
    private final G5.a _influenceManager;
    private final InterfaceC5214b _receiveReceiptWorkManager;
    private final V5.b _subscriptionManager;
    private final G4.a _time;
    private final com.onesignal.common.events.b extOpenedCallback;
    private final com.onesignal.common.events.a extRemoteReceivedCallback;
    private final com.onesignal.common.events.b extWillShowInForegroundCallback;
    private final com.onesignal.common.events.a intLifecycleCallback;
    private final Set<String> postedOpenedNotifIds;
    private final C4977h unprocessedOpenedNotifs;

    /* renamed from: com.onesignal.notifications.internal.lifecycle.impl.a$a, reason: collision with other inner class name */
    public static final class C0232a {
        public /* synthetic */ C0232a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0232a() {
        }
    }

    public static final class b extends kotlin.jvm.internal.i implements E7.l {
        final /* synthetic */ com.onesignal.notifications.internal.d $openedResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.notifications.internal.d dVar) {
            super(1);
            this.$openedResult = dVar;
        }

        @Override // E7.l
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((e5.h) null);
            return v.f40183a;
        }

        public final void invoke(e5.h it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.a();
        }
    }

    public static final class c extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canOpenNotification(null, null, this);
        }
    }

    public static final class d extends x7.h implements p {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ kotlin.jvm.internal.p $canOpen;
        final /* synthetic */ JSONObject $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlin.jvm.internal.p pVar, Activity activity, JSONObject jSONObject, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$canOpen = pVar;
            this.$activity = activity;
            this.$data = jSONObject;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            d dVar = new d(this.$canOpen, this.$activity, this.$data, interfaceC5133d);
            dVar.L$0 = obj;
            return dVar;
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            kotlin.jvm.internal.p pVar;
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                InterfaceC5081a interfaceC5081a = (InterfaceC5081a) this.L$0;
                kotlin.jvm.internal.p pVar2 = this.$canOpen;
                Activity activity = this.$activity;
                JSONObject jSONObject = this.$data;
                this.L$0 = pVar2;
                this.label = 1;
                obj = interfaceC5081a.canOpenNotification(activity, jSONObject, this);
                if (obj == enumC5179a) {
                    return enumC5179a;
                }
                pVar = pVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = (kotlin.jvm.internal.p) this.L$0;
                com.bumptech.glide.f.r(obj);
            }
            pVar.f38859n = ((Boolean) obj).booleanValue();
            return v.f40183a;
        }

        @Override // E7.p
        public final Object invoke(InterfaceC5081a interfaceC5081a, InterfaceC5133d interfaceC5133d) {
            return ((d) create(interfaceC5081a, interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class e extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canReceiveNotification(null, this);
        }
    }

    public static final class f extends x7.h implements p {
        final /* synthetic */ kotlin.jvm.internal.p $canReceive;
        final /* synthetic */ JSONObject $jsonPayload;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kotlin.jvm.internal.p pVar, JSONObject jSONObject, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$canReceive = pVar;
            this.$jsonPayload = jSONObject;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            f fVar = new f(this.$canReceive, this.$jsonPayload, interfaceC5133d);
            fVar.L$0 = obj;
            return fVar;
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            kotlin.jvm.internal.p pVar;
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                InterfaceC5081a interfaceC5081a = (InterfaceC5081a) this.L$0;
                kotlin.jvm.internal.p pVar2 = this.$canReceive;
                JSONObject jSONObject = this.$jsonPayload;
                this.L$0 = pVar2;
                this.label = 1;
                obj = interfaceC5081a.canReceiveNotification(jSONObject, this);
                if (obj == enumC5179a) {
                    return enumC5179a;
                }
                pVar = pVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = (kotlin.jvm.internal.p) this.L$0;
                com.bumptech.glide.f.r(obj);
            }
            pVar.f38859n = ((Boolean) obj).booleanValue();
            return v.f40183a;
        }

        @Override // E7.p
        public final Object invoke(InterfaceC5081a interfaceC5081a, InterfaceC5133d interfaceC5133d) {
            return ((f) create(interfaceC5081a, interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class g extends AbstractC5219c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public g(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.confirmNotificationOpened(null, null, null, null, this);
        }
    }

    public static final class h extends kotlin.jvm.internal.i implements E7.l {
        final /* synthetic */ e5.m $willDisplayEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e5.m mVar) {
            super(1);
            this.$willDisplayEvent = mVar;
        }

        @Override // E7.l
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((e5.j) null);
            return v.f40183a;
        }

        public final void invoke(e5.j it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.a();
        }
    }

    public static final class i extends kotlin.jvm.internal.i implements E7.l {
        final /* synthetic */ e5.k $notificationReceivedEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e5.k kVar) {
            super(1);
            this.$notificationReceivedEvent = kVar;
        }

        @Override // E7.l
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((e5.l) null);
            return v.f40183a;
        }

        public final void invoke(e5.l it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.a();
        }
    }

    public static final class j extends AbstractC5219c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public j(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.notificationOpened(null, null, this);
        }
    }

    public static final class k extends x7.h implements E7.l {
        final /* synthetic */ String $appId;
        final /* synthetic */ EnumC5252a $deviceType;
        final /* synthetic */ String $notificationId;
        final /* synthetic */ String $subscriptionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, String str2, String str3, EnumC5252a enumC5252a, InterfaceC5133d interfaceC5133d) {
            super(1, interfaceC5133d);
            this.$appId = str;
            this.$notificationId = str2;
            this.$subscriptionId = str3;
            this.$deviceType = enumC5252a;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(InterfaceC5133d interfaceC5133d) {
            return a.this.new k(this.$appId, this.$notificationId, this.$subscriptionId, this.$deviceType, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.f.r(obj);
                a aVar = a.this;
                String str = this.$appId;
                String str2 = this.$notificationId;
                String str3 = this.$subscriptionId;
                EnumC5252a enumC5252a = this.$deviceType;
                this.label = 1;
                if (aVar.confirmNotificationOpened(str, str2, str3, enumC5252a, this) == enumC5179a) {
                    return enumC5179a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.f.r(obj);
            }
            return v.f40183a;
        }

        @Override // E7.l
        public final Object invoke(InterfaceC5133d interfaceC5133d) {
            return ((k) create(interfaceC5133d)).invokeSuspend(v.f40183a);
        }
    }

    public static final class l extends kotlin.jvm.internal.i implements E7.l {
        public static final l INSTANCE = new l();

        public l() {
            super(1);
        }

        @Override // E7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return v.f40183a;
        }

        public final void invoke(Exception ex) {
            kotlin.jvm.internal.h.e(ex, "ex");
            if (!(ex instanceof C4860a)) {
                com.onesignal.debug.internal.logging.b.info("Unexpected error in notification opened confirmation", ex);
                return;
            }
            StringBuilder sb = new StringBuilder("Notification opened confirmation failed with statusCode: ");
            C4860a c4860a = (C4860a) ex;
            sb.append(c4860a.getStatusCode());
            sb.append(" response: ");
            sb.append(c4860a.getResponse());
            com.onesignal.debug.internal.logging.b.info$default(sb.toString(), null, 2, null);
        }
    }

    public static final class m extends kotlin.jvm.internal.i implements E7.l {
        final /* synthetic */ com.onesignal.notifications.internal.d $openResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.onesignal.notifications.internal.d dVar) {
            super(1);
            this.$openResult = dVar;
        }

        @Override // E7.l
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((e5.h) null);
            return v.f40183a;
        }

        public final void invoke(e5.h it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.a();
        }
    }

    public static final class n extends AbstractC5219c {
        int label;
        /* synthetic */ Object result;

        public n(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.openDestinationActivity(null, null, this);
        }
    }

    public static final class o extends x7.h implements p {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Intent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Activity activity, Intent intent, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$activity = activity;
            this.$intent = intent;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return new o(this.$activity, this.$intent, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((o) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            this.$activity.startActivity(this.$intent);
            return v.f40183a;
        }
    }

    public a(t4.f _applicationService, G4.a _time, com.onesignal.core.internal.config.c _configModelStore, G5.a _influenceManager, V5.b _subscriptionManager, y4.c _deviceService, InterfaceC4569a _backend, InterfaceC5214b _receiveReceiptWorkManager, InterfaceC4515a _analyticsTracker) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_time, "_time");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(_influenceManager, "_influenceManager");
        kotlin.jvm.internal.h.e(_subscriptionManager, "_subscriptionManager");
        kotlin.jvm.internal.h.e(_deviceService, "_deviceService");
        kotlin.jvm.internal.h.e(_backend, "_backend");
        kotlin.jvm.internal.h.e(_receiveReceiptWorkManager, "_receiveReceiptWorkManager");
        kotlin.jvm.internal.h.e(_analyticsTracker, "_analyticsTracker");
        this._applicationService = _applicationService;
        this._time = _time;
        this._configModelStore = _configModelStore;
        this._influenceManager = _influenceManager;
        this._subscriptionManager = _subscriptionManager;
        this._deviceService = _deviceService;
        this._backend = _backend;
        this._receiveReceiptWorkManager = _receiveReceiptWorkManager;
        this._analyticsTracker = _analyticsTracker;
        this.intLifecycleCallback = new com.onesignal.common.events.a();
        this.extRemoteReceivedCallback = new com.onesignal.common.events.a();
        this.extWillShowInForegroundCallback = new com.onesignal.common.events.b();
        this.extOpenedCallback = new com.onesignal.common.events.b();
        this.unprocessedOpenedNotifs = new C4977h();
        this.postedOpenedNotifIds = new LinkedHashSet();
        setupNotificationServiceExtension(_applicationService.getAppContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0123 -> B:11:0x0133). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object confirmNotificationOpened(String str, String str2, String str3, EnumC5252a enumC5252a, InterfaceC5133d interfaceC5133d) {
        g gVar;
        a aVar;
        int i4;
        String str4;
        String str5;
        String str6;
        EnumC5252a enumC5252a2;
        g gVar2;
        a aVar2;
        int i9;
        int i10;
        a aVar3;
        String str7;
        String str8;
        String str9;
        EnumC5252a enumC5252a3;
        int i11;
        int i12;
        C4860a e6;
        com.onesignal.common.g gVar3;
        char c4;
        if (interfaceC5133d instanceof g) {
            gVar = (g) interfaceC5133d;
            int i13 = gVar.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.label = i13 - Integer.MIN_VALUE;
                aVar = this;
                Object obj = gVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = gVar.label;
                v vVar = v.f40183a;
                int i14 = 1;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    int maxNetworkRequestAttemptCount = com.onesignal.common.g.INSTANCE.getMaxNetworkRequestAttemptCount();
                    if (1 <= maxNetworkRequestAttemptCount) {
                        str4 = str;
                        str5 = str2;
                        str6 = str3;
                        enumC5252a2 = enumC5252a;
                        gVar2 = gVar;
                        aVar2 = aVar;
                        i9 = 1;
                        i10 = maxNetworkRequestAttemptCount;
                        InterfaceC4569a interfaceC4569a = aVar2._backend;
                        gVar2.L$0 = aVar2;
                        gVar2.L$1 = str4;
                        gVar2.L$2 = str5;
                        gVar2.L$3 = str6;
                        gVar2.L$4 = enumC5252a2;
                        gVar2.I$0 = i9;
                        gVar2.I$1 = i10;
                        gVar2.label = i14;
                        if (interfaceC4569a.updateNotificationAsOpened(str4, str5, str6, enumC5252a2, gVar2) != enumC5179a) {
                        }
                    }
                    return vVar;
                }
                if (i4 == 1) {
                    i12 = gVar.I$1;
                    i11 = gVar.I$0;
                    enumC5252a3 = (EnumC5252a) gVar.L$4;
                    str9 = (String) gVar.L$3;
                    str8 = (String) gVar.L$2;
                    str7 = (String) gVar.L$1;
                    aVar3 = (a) gVar.L$0;
                    try {
                        com.bumptech.glide.f.r(obj);
                    } catch (C4860a e9) {
                        e6 = e9;
                        gVar3 = com.onesignal.common.g.INSTANCE;
                        if (gVar3.getResponseStatusType(e6.getStatusCode()) == g.a.RETRYABLE || i11 >= gVar3.getMaxNetworkRequestAttemptCount()) {
                            throw e6;
                        }
                        long max = Math.max(e6.getRetryAfterSeconds() != null ? r7.intValue() * MILLIS_PER_SECOND : 0L, i11 * 15000);
                        StringBuilder l9 = CL.l(i11, "Notification opened confirmation attempt ", " failed (statusCode: ");
                        l9.append(e6.getStatusCode());
                        l9.append("), retrying in ");
                        l9.append(max);
                        l9.append("ms");
                        c4 = 2;
                        com.onesignal.debug.internal.logging.b.info$default(l9.toString(), null, 2, null);
                        gVar.L$0 = aVar3;
                        gVar.L$1 = str7;
                        gVar.L$2 = str8;
                        gVar.L$3 = str9;
                        gVar.L$4 = enumC5252a3;
                        gVar.I$0 = i11;
                        gVar.I$1 = i12;
                        gVar.label = 2;
                        if (AbstractC0399y.f(max, gVar) != enumC5179a) {
                            a aVar4 = aVar3;
                            gVar2 = gVar;
                            i10 = i12;
                            aVar2 = aVar4;
                            String str10 = str7;
                            enumC5252a2 = enumC5252a3;
                            str4 = str10;
                            String str11 = str8;
                            str6 = str9;
                            str5 = str11;
                            if (i11 != i10) {
                            }
                            return vVar;
                        }
                    }
                }
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i15 = gVar.I$1;
                i11 = gVar.I$0;
                EnumC5252a enumC5252a4 = (EnumC5252a) gVar.L$4;
                String str12 = (String) gVar.L$3;
                String str13 = (String) gVar.L$2;
                String str14 = (String) gVar.L$1;
                a aVar5 = (a) gVar.L$0;
                com.bumptech.glide.f.r(obj);
                gVar2 = gVar;
                i10 = i15;
                aVar2 = aVar5;
                enumC5252a2 = enumC5252a4;
                str4 = str14;
                str6 = str12;
                str5 = str13;
                c4 = 2;
                if (i11 != i10) {
                    i9 = i11 + 1;
                    i14 = 1;
                    try {
                    } catch (C4860a e10) {
                        e6 = e10;
                        a aVar6 = aVar2;
                        i12 = i10;
                        gVar = gVar2;
                        aVar3 = aVar6;
                        EnumC5252a enumC5252a5 = enumC5252a2;
                        str7 = str4;
                        enumC5252a3 = enumC5252a5;
                        String str15 = str6;
                        str8 = str5;
                        str9 = str15;
                        i11 = i9;
                        gVar3 = com.onesignal.common.g.INSTANCE;
                        if (gVar3.getResponseStatusType(e6.getStatusCode()) == g.a.RETRYABLE) {
                        }
                        throw e6;
                    }
                    InterfaceC4569a interfaceC4569a2 = aVar2._backend;
                    gVar2.L$0 = aVar2;
                    gVar2.L$1 = str4;
                    gVar2.L$2 = str5;
                    gVar2.L$3 = str6;
                    gVar2.L$4 = enumC5252a2;
                    gVar2.I$0 = i9;
                    gVar2.I$1 = i10;
                    gVar2.label = i14;
                    return interfaceC4569a2.updateNotificationAsOpened(str4, str5, str6, enumC5252a2, gVar2) != enumC5179a ? enumC5179a : vVar;
                }
                return vVar;
            }
        }
        aVar = this;
        gVar = aVar.new g(interfaceC5133d);
        Object obj2 = gVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = gVar.label;
        v vVar2 = v.f40183a;
        int i142 = 1;
        if (i4 != 0) {
        }
    }

    private final String getLatestNotificationId(JSONArray jSONArray) {
        JSONObject jSONObject;
        if (jSONArray.length() > 0) {
            Object obj = jSONArray.get(0);
            kotlin.jvm.internal.h.c(obj, "null cannot be cast to non-null type org.json.JSONObject");
            jSONObject = (JSONObject) obj;
        } else {
            jSONObject = null;
        }
        return p5.c.INSTANCE.getOSNotificationIdFromJson(jSONObject);
    }

    private final boolean shouldInitDirectSessionFromNotificationOpen(Activity activity) {
        if (this._applicationService.isInForeground()) {
            return false;
        }
        try {
            return p5.g.INSTANCE.getShouldOpenActivity(activity);
        } catch (JSONException e6) {
            e6.printStackTrace();
            return true;
        }
    }

    @Override // t5.b
    public void addExternalClickListener(e5.h callback) {
        kotlin.jvm.internal.h.e(callback, "callback");
        this.extOpenedCallback.subscribe(callback);
        if (this.extOpenedCallback.getHasSubscribers()) {
            C4977h c4977h = this.unprocessedOpenedNotifs;
            kotlin.jvm.internal.h.e(c4977h, "<this>");
            if (c4977h.isEmpty()) {
                return;
            }
            Iterator<E> it = this.unprocessedOpenedNotifs.iterator();
            while (it.hasNext()) {
                this.extOpenedCallback.fireOnMain(new b(p5.e.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications((JSONArray) it.next(), this._time)));
            }
            this.unprocessedOpenedNotifs.clear();
        }
    }

    @Override // t5.b
    public void addExternalForegroundLifecycleListener(e5.j listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.extWillShowInForegroundCallback.subscribe(listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // t5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, InterfaceC5133d interfaceC5133d) {
        c cVar;
        int i4;
        kotlin.jvm.internal.p pVar;
        if (interfaceC5133d instanceof c) {
            cVar = (c) interfaceC5133d;
            int i9 = cVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                cVar.label = i9 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = cVar.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    pVar2.f38859n = true;
                    com.onesignal.common.events.a aVar = this.intLifecycleCallback;
                    d dVar = new d(pVar2, activity, jSONObject, null);
                    cVar.L$0 = pVar2;
                    cVar.label = 1;
                    if (aVar.suspendingFire(dVar, cVar) == enumC5179a) {
                        return enumC5179a;
                    }
                    pVar = pVar2;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (kotlin.jvm.internal.p) cVar.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                return Boolean.valueOf(pVar.f38859n);
            }
        }
        cVar = new c(interfaceC5133d);
        Object obj2 = cVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = cVar.label;
        if (i4 != 0) {
        }
        return Boolean.valueOf(pVar.f38859n);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // t5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, InterfaceC5133d interfaceC5133d) {
        e eVar;
        int i4;
        kotlin.jvm.internal.p pVar;
        if (interfaceC5133d instanceof e) {
            eVar = (e) interfaceC5133d;
            int i9 = eVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                eVar.label = i9 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = eVar.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    pVar2.f38859n = true;
                    com.onesignal.common.events.a aVar = this.intLifecycleCallback;
                    f fVar = new f(pVar2, jSONObject, null);
                    eVar.L$0 = pVar2;
                    eVar.label = 1;
                    if (aVar.suspendingFire(fVar, eVar) == enumC5179a) {
                        return enumC5179a;
                    }
                    pVar = pVar2;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (kotlin.jvm.internal.p) eVar.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                return Boolean.valueOf(pVar.f38859n);
            }
        }
        eVar = new e(interfaceC5133d);
        Object obj2 = eVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = eVar.label;
        if (i4 != 0) {
        }
        return Boolean.valueOf(pVar.f38859n);
    }

    @Override // t5.b
    public void externalNotificationWillShowInForeground(e5.m willDisplayEvent) {
        kotlin.jvm.internal.h.e(willDisplayEvent, "willDisplayEvent");
        this.extWillShowInForegroundCallback.fire(new h(willDisplayEvent));
    }

    @Override // t5.b
    public void externalRemoteNotificationReceived(e5.k notificationReceivedEvent) {
        kotlin.jvm.internal.h.e(notificationReceivedEvent, "notificationReceivedEvent");
        this.extRemoteReceivedCallback.fire(new i(notificationReceivedEvent));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // t5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object notificationOpened(Activity activity, JSONArray jSONArray, InterfaceC5133d interfaceC5133d) {
        j jVar;
        int i4;
        a aVar;
        JSONArray jSONArray2;
        if (interfaceC5133d instanceof j) {
            jVar = (j) interfaceC5133d;
            int i9 = jVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                jVar.label = i9 - Integer.MIN_VALUE;
                j jVar2 = jVar;
                Object obj = jVar2.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = jVar2.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                    if (appId == null) {
                        appId = "";
                    }
                    String str = appId;
                    String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                    EnumC5252a deviceType = this._deviceService.getDeviceType();
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String oSNotificationIdFromJson = p5.c.INSTANCE.getOSNotificationIdFromJson((JSONObject) jSONArray.get(i10));
                        if (oSNotificationIdFromJson != null && !this.postedOpenedNotifIds.contains(oSNotificationIdFromJson)) {
                            this.postedOpenedNotifIds.add(oSNotificationIdFromJson);
                            com.onesignal.common.threading.c.suspendifyWithErrorHandling$default(true, new k(str, oSNotificationIdFromJson, id, deviceType, null), l.INSTANCE, null, 8, null);
                        }
                    }
                    p5.e eVar = p5.e.INSTANCE;
                    com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications = eVar.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray, this._time);
                    InterfaceC4515a interfaceC4515a = this._analyticsTracker;
                    String notificationId = generateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
                    kotlin.jvm.internal.h.b(notificationId);
                    interfaceC4515a.trackOpenedEvent(notificationId, eVar.getCampaignNameFromNotification(generateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
                    String latestNotificationId = getLatestNotificationId(jSONArray);
                    if (shouldInitDirectSessionFromNotificationOpen(activity)) {
                        this._applicationService.setEntryState(t4.b.NOTIFICATION_CLICK);
                        if (latestNotificationId != null) {
                            this._influenceManager.onDirectInfluenceFromNotification(latestNotificationId);
                        }
                    }
                    jVar2.L$0 = this;
                    jVar2.L$1 = jSONArray;
                    jVar2.label = 1;
                    if (openDestinationActivity(activity, jSONArray, jVar2) == enumC5179a) {
                        return enumC5179a;
                    }
                    aVar = this;
                    jSONArray2 = jSONArray;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONArray2 = (JSONArray) jVar2.L$1;
                    aVar = (a) jVar2.L$0;
                    com.bumptech.glide.f.r(obj);
                }
                if (aVar.extOpenedCallback.getHasSubscribers()) {
                    aVar.unprocessedOpenedNotifs.addLast(jSONArray2);
                } else {
                    aVar.extOpenedCallback.fireOnMain(new m(p5.e.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray2, aVar._time)));
                }
                return v.f40183a;
            }
        }
        jVar = new j(interfaceC5133d);
        j jVar22 = jVar;
        Object obj2 = jVar22.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = jVar22.label;
        if (i4 != 0) {
        }
        if (aVar.extOpenedCallback.getHasSubscribers()) {
        }
        return v.f40183a;
    }

    @Override // t5.b
    public Object notificationReceived(p5.d dVar, InterfaceC5133d interfaceC5133d) {
        this._receiveReceiptWorkManager.enqueueReceiveReceipt(dVar.getApiNotificationId());
        this._influenceManager.onNotificationReceived(dVar.getApiNotificationId());
        try {
            JSONObject jSONObject = new JSONObject(dVar.getJsonPayload().toString());
            jSONObject.put("androidNotificationId", dVar.getAndroidId());
            p5.e eVar = p5.e.INSTANCE;
            com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications = eVar.generateNotificationOpenedResult$com_onesignal_notifications(com.onesignal.common.f.INSTANCE.wrapInJsonArray(jSONObject), this._time);
            InterfaceC4515a interfaceC4515a = this._analyticsTracker;
            String notificationId = generateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
            kotlin.jvm.internal.h.b(notificationId);
            interfaceC4515a.trackReceivedEvent(notificationId, eVar.getCampaignNameFromNotification(generateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
        } catch (JSONException e6) {
            e6.printStackTrace();
        }
        return v.f40183a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(2:21|(1:23))(1:24))|11|12|13))|31|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002b, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        com.onesignal.debug.internal.logging.b.warn("No activity found to handle notification open intent.", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002d, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        com.onesignal.debug.internal.logging.b.error("Could not parse JSON to open notification activity.", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0029, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0075, code lost:
    
        com.onesignal.debug.internal.logging.b.error("Could not open notification activity.", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.onesignal.notifications.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object openDestinationActivity(Activity activity, JSONArray jSONArray, InterfaceC5133d interfaceC5133d) {
        n nVar;
        int i4;
        if (interfaceC5133d instanceof n) {
            nVar = (n) interfaceC5133d;
            int i9 = nVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                nVar.label = i9 - Integer.MIN_VALUE;
                Object obj = nVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i4 = nVar.label;
                if (i4 != 0) {
                    com.bumptech.glide.f.r(obj);
                    JSONObject jSONObject = jSONArray.getJSONObject(0);
                    C4863b c4863b = C4863b.INSTANCE;
                    kotlin.jvm.internal.h.b(jSONObject);
                    Intent intentVisible = c4863b.create(activity, jSONObject).getIntentVisible();
                    if (intentVisible != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("SDK running startActivity with Intent: " + intentVisible, null, 2, null);
                        P7.e eVar = T7.o.f3162a;
                        o oVar = new o(activity, intentVisible, null);
                        nVar.label = 1;
                        if (AbstractC0399y.y(eVar, oVar, nVar) == enumC5179a) {
                            return enumC5179a;
                        }
                    } else {
                        com.onesignal.debug.internal.logging.b.debug$default("SDK not showing an Activity automatically due to it's settings.", null, 2, null);
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.f.r(obj);
                }
                return v.f40183a;
            }
        }
        nVar = new n(interfaceC5133d);
        Object obj2 = nVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i4 = nVar.label;
        if (i4 != 0) {
        }
        return v.f40183a;
    }

    @Override // t5.b
    public void removeExternalClickListener(e5.h listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.extOpenedCallback.unsubscribe(listener);
    }

    @Override // t5.b
    public void removeExternalForegroundLifecycleListener(e5.j listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.extWillShowInForegroundCallback.unsubscribe(listener);
    }

    @Override // t5.b
    public void setInternalNotificationLifecycleCallback(InterfaceC5081a interfaceC5081a) {
        this.intLifecycleCallback.set(interfaceC5081a);
    }

    public final void setupNotificationServiceExtension(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        String manifestMeta = AndroidUtils.INSTANCE.getManifestMeta(context, "com.onesignal.NotificationServiceExtension");
        if (manifestMeta == null) {
            com.onesignal.debug.internal.logging.b.verbose$default("No class found, not setting up OSRemoteNotificationReceivedHandler", null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.verbose$default(y.k("Found class: ", manifestMeta, ", attempting to call constructor"), null, 2, null);
        try {
            Class.forName(manifestMeta).newInstance();
        } catch (ClassNotFoundException e6) {
            e6.printStackTrace();
        } catch (IllegalAccessException e9) {
            e9.printStackTrace();
        } catch (InstantiationException e10) {
            e10.printStackTrace();
        }
    }
}
