package com.onesignal.notifications.internal.lifecycle.impl;

import D.y;
import I7.p;
import S7.AbstractC0406y;
import S7.InterfaceC0404w;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.icefishingapp.icefishing.AbstractC4404f;
import com.onesignal.common.AndroidUtils;
import com.onesignal.common.g;
import j5.InterfaceC4611a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import l5.InterfaceC4665a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t4.C5040a;
import t5.C5043b;
import u7.v;
import v7.C5127h;
import x5.InterfaceC5198a;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class a implements x5.b, com.onesignal.notifications.internal.a {
    public static final C0233a Companion = new C0233a(null);
    private static final long MILLIS_PER_SECOND = 1000;
    private static final int RETRY_BACKOFF_MS = 15000;
    private final InterfaceC4611a _analyticsTracker;
    private final x4.f _applicationService;
    private final InterfaceC4665a _backend;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final C4.c _deviceService;
    private final K5.a _influenceManager;
    private final B5.b _receiveReceiptWorkManager;
    private final Z5.b _subscriptionManager;
    private final K4.a _time;
    private final com.onesignal.common.events.b extOpenedCallback;
    private final com.onesignal.common.events.a extRemoteReceivedCallback;
    private final com.onesignal.common.events.b extWillShowInForegroundCallback;
    private final com.onesignal.common.events.a intLifecycleCallback;
    private final Set<String> postedOpenedNotifIds;
    private final C5127h unprocessedOpenedNotifs;

    /* renamed from: com.onesignal.notifications.internal.lifecycle.impl.a$a, reason: collision with other inner class name */
    public static final class C0233a {
        public /* synthetic */ C0233a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0233a() {
        }
    }

    public static final class b extends kotlin.jvm.internal.i implements I7.l {
        final /* synthetic */ com.onesignal.notifications.internal.d $openedResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.notifications.internal.d dVar) {
            super(1);
            this.$openedResult = dVar;
        }

        @Override // I7.l
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((i5.h) null);
            return v.f41353a;
        }

        public final void invoke(i5.h it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.a();
        }
    }

    public static final class c extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canOpenNotification(null, null, this);
        }
    }

    public static final class d extends B7.h implements p {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ kotlin.jvm.internal.p $canOpen;
        final /* synthetic */ JSONObject $data;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlin.jvm.internal.p pVar, Activity activity, JSONObject jSONObject, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$canOpen = pVar;
            this.$activity = activity;
            this.$data = jSONObject;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            d dVar = new d(this.$canOpen, this.$activity, this.$data, interfaceC5267d);
            dVar.L$0 = obj;
            return dVar;
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            kotlin.jvm.internal.p pVar;
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                InterfaceC5198a interfaceC5198a = (InterfaceC5198a) this.L$0;
                kotlin.jvm.internal.p pVar2 = this.$canOpen;
                Activity activity = this.$activity;
                JSONObject jSONObject = this.$data;
                this.L$0 = pVar2;
                this.label = 1;
                obj = interfaceC5198a.canOpenNotification(activity, jSONObject, this);
                if (obj == aVar) {
                    return aVar;
                }
                pVar = pVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = (kotlin.jvm.internal.p) this.L$0;
                com.bumptech.glide.d.k(obj);
            }
            pVar.f38715n = ((Boolean) obj).booleanValue();
            return v.f41353a;
        }

        @Override // I7.p
        public final Object invoke(InterfaceC5198a interfaceC5198a, InterfaceC5267d interfaceC5267d) {
            return ((d) create(interfaceC5198a, interfaceC5267d)).invokeSuspend(v.f41353a);
        }
    }

    public static final class e extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.canReceiveNotification(null, this);
        }
    }

    public static final class f extends B7.h implements p {
        final /* synthetic */ kotlin.jvm.internal.p $canReceive;
        final /* synthetic */ JSONObject $jsonPayload;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(kotlin.jvm.internal.p pVar, JSONObject jSONObject, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$canReceive = pVar;
            this.$jsonPayload = jSONObject;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            f fVar = new f(this.$canReceive, this.$jsonPayload, interfaceC5267d);
            fVar.L$0 = obj;
            return fVar;
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            kotlin.jvm.internal.p pVar;
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                InterfaceC5198a interfaceC5198a = (InterfaceC5198a) this.L$0;
                kotlin.jvm.internal.p pVar2 = this.$canReceive;
                JSONObject jSONObject = this.$jsonPayload;
                this.L$0 = pVar2;
                this.label = 1;
                obj = interfaceC5198a.canReceiveNotification(jSONObject, this);
                if (obj == aVar) {
                    return aVar;
                }
                pVar = pVar2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = (kotlin.jvm.internal.p) this.L$0;
                com.bumptech.glide.d.k(obj);
            }
            pVar.f38715n = ((Boolean) obj).booleanValue();
            return v.f41353a;
        }

        @Override // I7.p
        public final Object invoke(InterfaceC5198a interfaceC5198a, InterfaceC5267d interfaceC5267d) {
            return ((f) create(interfaceC5198a, interfaceC5267d)).invokeSuspend(v.f41353a);
        }
    }

    public static final class g extends B7.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public g(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.confirmNotificationOpened(null, null, null, null, this);
        }
    }

    public static final class h extends kotlin.jvm.internal.i implements I7.l {
        final /* synthetic */ i5.m $willDisplayEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(i5.m mVar) {
            super(1);
            this.$willDisplayEvent = mVar;
        }

        @Override // I7.l
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((i5.j) null);
            return v.f41353a;
        }

        public final void invoke(i5.j it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.a();
        }
    }

    public static final class i extends kotlin.jvm.internal.i implements I7.l {
        final /* synthetic */ i5.k $notificationReceivedEvent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(i5.k kVar) {
            super(1);
            this.$notificationReceivedEvent = kVar;
        }

        @Override // I7.l
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((i5.l) null);
            return v.f41353a;
        }

        public final void invoke(i5.l it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.a();
        }
    }

    public static final class j extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public j(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.notificationOpened(null, null, this);
        }
    }

    public static final class k extends B7.h implements I7.l {
        final /* synthetic */ String $appId;
        final /* synthetic */ C4.a $deviceType;
        final /* synthetic */ String $notificationId;
        final /* synthetic */ String $subscriptionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, String str2, String str3, C4.a aVar, InterfaceC5267d interfaceC5267d) {
            super(1, interfaceC5267d);
            this.$appId = str;
            this.$notificationId = str2;
            this.$subscriptionId = str3;
            this.$deviceType = aVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(InterfaceC5267d interfaceC5267d) {
            return a.this.new k(this.$appId, this.$notificationId, this.$subscriptionId, this.$deviceType, interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
                a aVar2 = a.this;
                String str = this.$appId;
                String str2 = this.$notificationId;
                String str3 = this.$subscriptionId;
                C4.a aVar3 = this.$deviceType;
                this.label = 1;
                if (aVar2.confirmNotificationOpened(str, str2, str3, aVar3, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.d.k(obj);
            }
            return v.f41353a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5267d interfaceC5267d) {
            return ((k) create(interfaceC5267d)).invokeSuspend(v.f41353a);
        }
    }

    public static final class l extends kotlin.jvm.internal.i implements I7.l {
        public static final l INSTANCE = new l();

        public l() {
            super(1);
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Exception) obj);
            return v.f41353a;
        }

        public final void invoke(Exception ex) {
            kotlin.jvm.internal.h.e(ex, "ex");
            if (!(ex instanceof C5040a)) {
                com.onesignal.debug.internal.logging.b.info("Unexpected error in notification opened confirmation", ex);
                return;
            }
            StringBuilder sb = new StringBuilder("Notification opened confirmation failed with statusCode: ");
            C5040a c5040a = (C5040a) ex;
            sb.append(c5040a.getStatusCode());
            sb.append(" response: ");
            sb.append(c5040a.getResponse());
            com.onesignal.debug.internal.logging.b.info$default(sb.toString(), null, 2, null);
        }
    }

    public static final class m extends kotlin.jvm.internal.i implements I7.l {
        final /* synthetic */ com.onesignal.notifications.internal.d $openResult;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.onesignal.notifications.internal.d dVar) {
            super(1);
            this.$openResult = dVar;
        }

        @Override // I7.l
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((i5.h) null);
            return v.f41353a;
        }

        public final void invoke(i5.h it) {
            kotlin.jvm.internal.h.e(it, "it");
            it.a();
        }
    }

    public static final class n extends B7.c {
        int label;
        /* synthetic */ Object result;

        public n(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.openDestinationActivity(null, null, this);
        }
    }

    public static final class o extends B7.h implements p {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Intent $intent;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Activity activity, Intent intent, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$activity = activity;
            this.$intent = intent;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new o(this.$activity, this.$intent, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((o) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            this.$activity.startActivity(this.$intent);
            return v.f41353a;
        }
    }

    public a(x4.f _applicationService, K4.a _time, com.onesignal.core.internal.config.c _configModelStore, K5.a _influenceManager, Z5.b _subscriptionManager, C4.c _deviceService, InterfaceC4665a _backend, B5.b _receiveReceiptWorkManager, InterfaceC4611a _analyticsTracker) {
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
        this.unprocessedOpenedNotifs = new C5127h();
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
    public final Object confirmNotificationOpened(String str, String str2, String str3, C4.a aVar, InterfaceC5267d interfaceC5267d) {
        g gVar;
        a aVar2;
        int i6;
        String str4;
        String str5;
        String str6;
        C4.a aVar3;
        g gVar2;
        a aVar4;
        int i9;
        int i10;
        a aVar5;
        String str7;
        String str8;
        String str9;
        C4.a aVar6;
        int i11;
        int i12;
        C5040a e9;
        com.onesignal.common.g gVar3;
        char c9;
        if (interfaceC5267d instanceof g) {
            gVar = (g) interfaceC5267d;
            int i13 = gVar.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.label = i13 - Integer.MIN_VALUE;
                aVar2 = this;
                Object obj = gVar.result;
                A7.a aVar7 = A7.a.f58n;
                i6 = gVar.label;
                v vVar = v.f41353a;
                int i14 = 1;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    int maxNetworkRequestAttemptCount = com.onesignal.common.g.INSTANCE.getMaxNetworkRequestAttemptCount();
                    if (1 <= maxNetworkRequestAttemptCount) {
                        str4 = str;
                        str5 = str2;
                        str6 = str3;
                        aVar3 = aVar;
                        gVar2 = gVar;
                        aVar4 = aVar2;
                        i9 = 1;
                        i10 = maxNetworkRequestAttemptCount;
                        InterfaceC4665a interfaceC4665a = aVar4._backend;
                        gVar2.L$0 = aVar4;
                        gVar2.L$1 = str4;
                        gVar2.L$2 = str5;
                        gVar2.L$3 = str6;
                        gVar2.L$4 = aVar3;
                        gVar2.I$0 = i9;
                        gVar2.I$1 = i10;
                        gVar2.label = i14;
                        if (interfaceC4665a.updateNotificationAsOpened(str4, str5, str6, aVar3, gVar2) != aVar7) {
                        }
                    }
                    return vVar;
                }
                if (i6 == 1) {
                    i12 = gVar.I$1;
                    i11 = gVar.I$0;
                    aVar6 = (C4.a) gVar.L$4;
                    str9 = (String) gVar.L$3;
                    str8 = (String) gVar.L$2;
                    str7 = (String) gVar.L$1;
                    aVar5 = (a) gVar.L$0;
                    try {
                        com.bumptech.glide.d.k(obj);
                    } catch (C5040a e10) {
                        e9 = e10;
                        gVar3 = com.onesignal.common.g.INSTANCE;
                        if (gVar3.getResponseStatusType(e9.getStatusCode()) == g.a.RETRYABLE || i11 >= gVar3.getMaxNetworkRequestAttemptCount()) {
                            throw e9;
                        }
                        long max = Math.max(e9.getRetryAfterSeconds() != null ? r7.intValue() * MILLIS_PER_SECOND : 0L, i11 * 15000);
                        StringBuilder i15 = AbstractC4404f.i(i11, "Notification opened confirmation attempt ", " failed (statusCode: ");
                        i15.append(e9.getStatusCode());
                        i15.append("), retrying in ");
                        i15.append(max);
                        i15.append("ms");
                        c9 = 2;
                        com.onesignal.debug.internal.logging.b.info$default(i15.toString(), null, 2, null);
                        gVar.L$0 = aVar5;
                        gVar.L$1 = str7;
                        gVar.L$2 = str8;
                        gVar.L$3 = str9;
                        gVar.L$4 = aVar6;
                        gVar.I$0 = i11;
                        gVar.I$1 = i12;
                        gVar.label = 2;
                        if (AbstractC0406y.f(max, gVar) != aVar7) {
                            a aVar8 = aVar5;
                            gVar2 = gVar;
                            i10 = i12;
                            aVar4 = aVar8;
                            String str10 = str7;
                            aVar3 = aVar6;
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
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i16 = gVar.I$1;
                i11 = gVar.I$0;
                C4.a aVar9 = (C4.a) gVar.L$4;
                String str12 = (String) gVar.L$3;
                String str13 = (String) gVar.L$2;
                String str14 = (String) gVar.L$1;
                a aVar10 = (a) gVar.L$0;
                com.bumptech.glide.d.k(obj);
                gVar2 = gVar;
                i10 = i16;
                aVar4 = aVar10;
                aVar3 = aVar9;
                str4 = str14;
                str6 = str12;
                str5 = str13;
                c9 = 2;
                if (i11 != i10) {
                    i9 = i11 + 1;
                    i14 = 1;
                    try {
                    } catch (C5040a e11) {
                        e9 = e11;
                        a aVar11 = aVar4;
                        i12 = i10;
                        gVar = gVar2;
                        aVar5 = aVar11;
                        C4.a aVar12 = aVar3;
                        str7 = str4;
                        aVar6 = aVar12;
                        String str15 = str6;
                        str8 = str5;
                        str9 = str15;
                        i11 = i9;
                        gVar3 = com.onesignal.common.g.INSTANCE;
                        if (gVar3.getResponseStatusType(e9.getStatusCode()) == g.a.RETRYABLE) {
                        }
                        throw e9;
                    }
                    InterfaceC4665a interfaceC4665a2 = aVar4._backend;
                    gVar2.L$0 = aVar4;
                    gVar2.L$1 = str4;
                    gVar2.L$2 = str5;
                    gVar2.L$3 = str6;
                    gVar2.L$4 = aVar3;
                    gVar2.I$0 = i9;
                    gVar2.I$1 = i10;
                    gVar2.label = i14;
                    return interfaceC4665a2.updateNotificationAsOpened(str4, str5, str6, aVar3, gVar2) != aVar7 ? aVar7 : vVar;
                }
                return vVar;
            }
        }
        aVar2 = this;
        gVar = aVar2.new g(interfaceC5267d);
        Object obj2 = gVar.result;
        A7.a aVar72 = A7.a.f58n;
        i6 = gVar.label;
        v vVar2 = v.f41353a;
        int i142 = 1;
        if (i6 != 0) {
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
        return t5.c.INSTANCE.getOSNotificationIdFromJson(jSONObject);
    }

    private final boolean shouldInitDirectSessionFromNotificationOpen(Activity activity) {
        if (this._applicationService.isInForeground()) {
            return false;
        }
        try {
            return t5.g.INSTANCE.getShouldOpenActivity(activity);
        } catch (JSONException e9) {
            e9.printStackTrace();
            return true;
        }
    }

    @Override // x5.b
    public void addExternalClickListener(i5.h callback) {
        kotlin.jvm.internal.h.e(callback, "callback");
        this.extOpenedCallback.subscribe(callback);
        if (this.extOpenedCallback.getHasSubscribers()) {
            C5127h c5127h = this.unprocessedOpenedNotifs;
            kotlin.jvm.internal.h.e(c5127h, "<this>");
            if (c5127h.isEmpty()) {
                return;
            }
            Iterator<E> it = this.unprocessedOpenedNotifs.iterator();
            while (it.hasNext()) {
                this.extOpenedCallback.fireOnMain(new b(t5.e.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications((JSONArray) it.next(), this._time)));
            }
            this.unprocessedOpenedNotifs.clear();
        }
    }

    @Override // x5.b
    public void addExternalForegroundLifecycleListener(i5.j listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.extWillShowInForegroundCallback.subscribe(listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // x5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canOpenNotification(Activity activity, JSONObject jSONObject, InterfaceC5267d interfaceC5267d) {
        c cVar;
        int i6;
        kotlin.jvm.internal.p pVar;
        if (interfaceC5267d instanceof c) {
            cVar = (c) interfaceC5267d;
            int i9 = cVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                cVar.label = i9 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                A7.a aVar = A7.a.f58n;
                i6 = cVar.label;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    pVar2.f38715n = true;
                    com.onesignal.common.events.a aVar2 = this.intLifecycleCallback;
                    d dVar = new d(pVar2, activity, jSONObject, null);
                    cVar.L$0 = pVar2;
                    cVar.label = 1;
                    if (aVar2.suspendingFire(dVar, cVar) == aVar) {
                        return aVar;
                    }
                    pVar = pVar2;
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (kotlin.jvm.internal.p) cVar.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                return Boolean.valueOf(pVar.f38715n);
            }
        }
        cVar = new c(interfaceC5267d);
        Object obj2 = cVar.result;
        A7.a aVar3 = A7.a.f58n;
        i6 = cVar.label;
        if (i6 != 0) {
        }
        return Boolean.valueOf(pVar.f38715n);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // x5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object canReceiveNotification(JSONObject jSONObject, InterfaceC5267d interfaceC5267d) {
        e eVar;
        int i6;
        kotlin.jvm.internal.p pVar;
        if (interfaceC5267d instanceof e) {
            eVar = (e) interfaceC5267d;
            int i9 = eVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                eVar.label = i9 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                A7.a aVar = A7.a.f58n;
                i6 = eVar.label;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    pVar2.f38715n = true;
                    com.onesignal.common.events.a aVar2 = this.intLifecycleCallback;
                    f fVar = new f(pVar2, jSONObject, null);
                    eVar.L$0 = pVar2;
                    eVar.label = 1;
                    if (aVar2.suspendingFire(fVar, eVar) == aVar) {
                        return aVar;
                    }
                    pVar = pVar2;
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (kotlin.jvm.internal.p) eVar.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                return Boolean.valueOf(pVar.f38715n);
            }
        }
        eVar = new e(interfaceC5267d);
        Object obj2 = eVar.result;
        A7.a aVar3 = A7.a.f58n;
        i6 = eVar.label;
        if (i6 != 0) {
        }
        return Boolean.valueOf(pVar.f38715n);
    }

    @Override // x5.b
    public void externalNotificationWillShowInForeground(i5.m willDisplayEvent) {
        kotlin.jvm.internal.h.e(willDisplayEvent, "willDisplayEvent");
        this.extWillShowInForegroundCallback.fire(new h(willDisplayEvent));
    }

    @Override // x5.b
    public void externalRemoteNotificationReceived(i5.k notificationReceivedEvent) {
        kotlin.jvm.internal.h.e(notificationReceivedEvent, "notificationReceivedEvent");
        this.extRemoteReceivedCallback.fire(new i(notificationReceivedEvent));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // x5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object notificationOpened(Activity activity, JSONArray jSONArray, InterfaceC5267d interfaceC5267d) {
        j jVar;
        int i6;
        a aVar;
        JSONArray jSONArray2;
        if (interfaceC5267d instanceof j) {
            jVar = (j) interfaceC5267d;
            int i9 = jVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                jVar.label = i9 - Integer.MIN_VALUE;
                j jVar2 = jVar;
                Object obj = jVar2.result;
                A7.a aVar2 = A7.a.f58n;
                i6 = jVar2.label;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                    if (appId == null) {
                        appId = "";
                    }
                    String str = appId;
                    String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                    C4.a deviceType = this._deviceService.getDeviceType();
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String oSNotificationIdFromJson = t5.c.INSTANCE.getOSNotificationIdFromJson((JSONObject) jSONArray.get(i10));
                        if (oSNotificationIdFromJson != null && !this.postedOpenedNotifIds.contains(oSNotificationIdFromJson)) {
                            this.postedOpenedNotifIds.add(oSNotificationIdFromJson);
                            com.onesignal.common.threading.c.suspendifyWithErrorHandling$default(true, new k(str, oSNotificationIdFromJson, id, deviceType, null), l.INSTANCE, null, 8, null);
                        }
                    }
                    t5.e eVar = t5.e.INSTANCE;
                    com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications = eVar.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray, this._time);
                    InterfaceC4611a interfaceC4611a = this._analyticsTracker;
                    String notificationId = generateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
                    kotlin.jvm.internal.h.b(notificationId);
                    interfaceC4611a.trackOpenedEvent(notificationId, eVar.getCampaignNameFromNotification(generateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
                    String latestNotificationId = getLatestNotificationId(jSONArray);
                    if (shouldInitDirectSessionFromNotificationOpen(activity)) {
                        this._applicationService.setEntryState(x4.b.NOTIFICATION_CLICK);
                        if (latestNotificationId != null) {
                            this._influenceManager.onDirectInfluenceFromNotification(latestNotificationId);
                        }
                    }
                    jVar2.L$0 = this;
                    jVar2.L$1 = jSONArray;
                    jVar2.label = 1;
                    if (openDestinationActivity(activity, jSONArray, jVar2) == aVar2) {
                        return aVar2;
                    }
                    aVar = this;
                    jSONArray2 = jSONArray;
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jSONArray2 = (JSONArray) jVar2.L$1;
                    aVar = (a) jVar2.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                if (aVar.extOpenedCallback.getHasSubscribers()) {
                    aVar.unprocessedOpenedNotifs.addLast(jSONArray2);
                } else {
                    aVar.extOpenedCallback.fireOnMain(new m(t5.e.INSTANCE.generateNotificationOpenedResult$com_onesignal_notifications(jSONArray2, aVar._time)));
                }
                return v.f41353a;
            }
        }
        jVar = new j(interfaceC5267d);
        j jVar22 = jVar;
        Object obj2 = jVar22.result;
        A7.a aVar22 = A7.a.f58n;
        i6 = jVar22.label;
        if (i6 != 0) {
        }
        if (aVar.extOpenedCallback.getHasSubscribers()) {
        }
        return v.f41353a;
    }

    @Override // x5.b
    public Object notificationReceived(t5.d dVar, InterfaceC5267d interfaceC5267d) {
        this._receiveReceiptWorkManager.enqueueReceiveReceipt(dVar.getApiNotificationId());
        this._influenceManager.onNotificationReceived(dVar.getApiNotificationId());
        try {
            JSONObject jSONObject = new JSONObject(dVar.getJsonPayload().toString());
            jSONObject.put("androidNotificationId", dVar.getAndroidId());
            t5.e eVar = t5.e.INSTANCE;
            com.onesignal.notifications.internal.d generateNotificationOpenedResult$com_onesignal_notifications = eVar.generateNotificationOpenedResult$com_onesignal_notifications(com.onesignal.common.f.INSTANCE.wrapInJsonArray(jSONObject), this._time);
            InterfaceC4611a interfaceC4611a = this._analyticsTracker;
            String notificationId = generateNotificationOpenedResult$com_onesignal_notifications.getNotification().getNotificationId();
            kotlin.jvm.internal.h.b(notificationId);
            interfaceC4611a.trackReceivedEvent(notificationId, eVar.getCampaignNameFromNotification(generateNotificationOpenedResult$com_onesignal_notifications.getNotification()));
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
        return v.f41353a;
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
    public Object openDestinationActivity(Activity activity, JSONArray jSONArray, InterfaceC5267d interfaceC5267d) {
        n nVar;
        int i6;
        if (interfaceC5267d instanceof n) {
            nVar = (n) interfaceC5267d;
            int i9 = nVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                nVar.label = i9 - Integer.MIN_VALUE;
                Object obj = nVar.result;
                A7.a aVar = A7.a.f58n;
                i6 = nVar.label;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    JSONObject jSONObject = jSONArray.getJSONObject(0);
                    C5043b c5043b = C5043b.INSTANCE;
                    kotlin.jvm.internal.h.b(jSONObject);
                    Intent intentVisible = c5043b.create(activity, jSONObject).getIntentVisible();
                    if (intentVisible != null) {
                        com.onesignal.debug.internal.logging.b.debug$default("SDK running startActivity with Intent: " + intentVisible, null, 2, null);
                        T7.e eVar = X7.o.f3856a;
                        o oVar = new o(activity, intentVisible, null);
                        nVar.label = 1;
                        if (AbstractC0406y.y(eVar, oVar, nVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        com.onesignal.debug.internal.logging.b.debug$default("SDK not showing an Activity automatically due to it's settings.", null, 2, null);
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.d.k(obj);
                }
                return v.f41353a;
            }
        }
        nVar = new n(interfaceC5267d);
        Object obj2 = nVar.result;
        A7.a aVar2 = A7.a.f58n;
        i6 = nVar.label;
        if (i6 != 0) {
        }
        return v.f41353a;
    }

    @Override // x5.b
    public void removeExternalClickListener(i5.h listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.extOpenedCallback.unsubscribe(listener);
    }

    @Override // x5.b
    public void removeExternalForegroundLifecycleListener(i5.j listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        this.extWillShowInForegroundCallback.unsubscribe(listener);
    }

    @Override // x5.b
    public void setInternalNotificationLifecycleCallback(InterfaceC5198a interfaceC5198a) {
        this.intLifecycleCallback.set(interfaceC5198a);
    }

    public final void setupNotificationServiceExtension(Context context) {
        kotlin.jvm.internal.h.e(context, "context");
        String manifestMeta = AndroidUtils.INSTANCE.getManifestMeta(context, "com.onesignal.NotificationServiceExtension");
        if (manifestMeta == null) {
            com.onesignal.debug.internal.logging.b.verbose$default("No class found, not setting up OSRemoteNotificationReceivedHandler", null, 2, null);
            return;
        }
        com.onesignal.debug.internal.logging.b.verbose$default(y.o("Found class: ", manifestMeta, ", attempting to call constructor"), null, 2, null);
        try {
            Class.forName(manifestMeta).newInstance();
        } catch (ClassNotFoundException e9) {
            e9.printStackTrace();
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
        } catch (InstantiationException e11) {
            e11.printStackTrace();
        }
    }
}
