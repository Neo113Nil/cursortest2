package com.onesignal.inAppMessages.internal;

import S7.C0399m;
import S7.InterfaceC0398l;
import a8.InterfaceC0451a;
import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import b6.InterfaceC0528b;
import com.onesignal.common.AndroidUtils;
import com.onesignal.inAppMessages.internal.prompt.impl.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import q4.C4874a;
import q4.C4875b;
import t4.C5041a;
import u7.C5086l;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class k implements O4.j, com.onesignal.core.internal.startup.b, Z5.a, com.onesignal.common.modeling.g, T4.a, Z4.b, O5.a, x4.e, com.onesignal.user.internal.jwt.a {
    private final x4.f _applicationService;
    private final P4.b _backend;
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final s4.c _consistencyManager;
    private final R4.a _displayer;
    private final U5.b _identityModelStore;
    private final com.onesignal.core.internal.config.impl.c _identityVerificationService;
    private final K5.a _influenceManager;
    private final com.onesignal.user.internal.jwt.c _jwtTokenStore;
    private final F4.a _languageContext;
    private final T4.b _lifecycle;
    private final M5.b _outcomeEventsController;
    private final U4.a _prefs;
    private final X4.a _repository;
    private final O5.b _sessionService;
    private final Y4.a _state;
    private final Z5.b _subscriptionManager;
    private final K4.a _time;
    private final Z4.a _triggerController;
    private final Z4.d _triggerModelStore;
    private final P5.a _userManager;
    private final Set<String> clickedClickIds;
    private final Set<String> dismissedMessages;
    private final Set<String> earlySessionTriggers;
    private final InterfaceC0451a fetchIAMMutex;
    private boolean hasCompletedFirstFetch;
    private final C0206k identityModelChangeHandler;
    private final Set<String> impressionedMessages;
    private volatile Long lastTimeFetchedIAMs;
    private final com.onesignal.common.events.b lifecycleCallback;
    private final com.onesignal.common.events.b messageClickCallback;
    private final List<a> messageDisplayQueue;
    private final InterfaceC0451a messageDisplayQueueMutex;
    private List<a> messages;
    private volatile String pendingJwtRetryExternalId;
    private volatile C4875b pendingJwtRetryRywData;
    private final List<a> redisplayedInAppMessages;
    private final Set<String> viewedPageIds;

    public static final class A extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public A(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.persistInAppMessage(null, this);
        }
    }

    public static final class B extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public B(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.queueMessageForDisplay(null, this);
        }
    }

    public static final class C extends B7.h implements I7.l {
        final /* synthetic */ a $inAppMessage;
        final /* synthetic */ List<com.onesignal.inAppMessages.internal.prompt.impl.b> $prompts;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C(a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$inAppMessage = aVar;
            this.$prompts = list;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return k.this.new C(this.$inAppMessage, this.$prompts, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                k kVar = k.this;
                a aVar2 = this.$inAppMessage;
                List<com.onesignal.inAppMessages.internal.prompt.impl.b> list = this.$prompts;
                this.label = 1;
                if (kVar.showMultiplePrompts(aVar2, list, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return u7.v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((C) create(interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }
    }

    public static final class D extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public D(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.showMultiplePrompts(null, null, this);
        }
    }

    public static final class E extends B7.h implements I7.l {
        Object L$0;
        int label;

        public E(InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return k.this.new E(interfaceC5240d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x002f, code lost:
        
            if (r5.cleanCachedInAppMessages(r4) == r0) goto L15;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0060 A[LOOP:0: B:7:0x005a->B:9:0x0060, LOOP_END] */
        @Override // B7.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            Iterator it;
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                X4.a aVar2 = k.this._repository;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.L$0;
                    Q3.b.s(obj);
                    list.addAll((Collection) obj);
                    it = k.this.redisplayedInAppMessages.iterator();
                    while (it.hasNext()) {
                        ((a) it.next()).setDisplayedInSession(false);
                    }
                    return u7.v.f41073a;
                }
                Q3.b.s(obj);
            }
            List list2 = k.this.redisplayedInAppMessages;
            X4.a aVar3 = k.this._repository;
            this.L$0 = list2;
            this.label = 2;
            Object listInAppMessages = aVar3.listInAppMessages(this);
            if (listInAppMessages != aVar) {
                list = list2;
                obj = listInAppMessages;
                list.addAll((Collection) obj);
                it = k.this.redisplayedInAppMessages.iterator();
                while (it.hasNext()) {
                }
                return u7.v.f41073a;
            }
            return aVar;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((E) create(interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$a, reason: case insensitive filesystem */
    public static final class C4423a extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C4423a(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.attemptToShowInAppMessage(this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$b, reason: case insensitive filesystem */
    public static final class C4424b extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C4424b(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.evaluateInAppMessages(this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$c, reason: case insensitive filesystem */
    public static final class C4425c extends B7.c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C4425c(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fetchIvOrSaveRetry(null, null, null, null, this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$d, reason: case insensitive filesystem */
    public static final class C4426d extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C4426d(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fetchMessages(null, this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$e, reason: case insensitive filesystem */
    public static final class C4427e extends kotlin.jvm.internal.i implements I7.a {
        public C4427e() {
            super(0);
        }

        @Override // I7.a
        public final Long invoke() {
            return Long.valueOf(k.this._time.getCurrentTimeMillis() - k.this._sessionService.getStartTime());
        }
    }

    public static final class f extends B7.h implements I7.l {
        int label;

        public f(InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return k.this.new f(interfaceC5240d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            if (r1.fetchMessages(r7, r6) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        
            if (r7 == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        
            if (r7 == r0) goto L22;
         */
        @Override // B7.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                String onesignalId = k.this._userManager.getOnesignalId();
                s4.c cVar = k.this._consistencyManager;
                C4874a c4874a = new C4874a(onesignalId);
                this.label = 1;
                obj = cVar.getRywDataFromAwaitableCondition(c4874a, this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Q3.b.s(obj);
                        return u7.v.f41073a;
                    }
                    Q3.b.s(obj);
                    C4875b c4875b = (C4875b) obj;
                    if (c4875b != null) {
                        k kVar = k.this;
                        this.label = 3;
                    }
                    return u7.v.f41073a;
                }
                Q3.b.s(obj);
            }
            this.label = 2;
            obj = ((C0399m) ((InterfaceC0398l) obj)).U(this);
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((f) create(interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }
    }

    public static final class g extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public g(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireOutcomesForClick(null, null, this);
        }
    }

    public static final class h extends B7.h implements I7.p {
        final /* synthetic */ b $result;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(b bVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$result = bVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            h hVar = new h(this.$result, interfaceC5240d);
            hVar.L$0 = obj;
            return hVar;
        }

        public final Object invoke(O4.c cVar, InterfaceC5240d interfaceC5240d) {
            return ((h) create(cVar, interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            throw D.x.h(this.L$0);
        }

        @Override // I7.p
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            if (obj == null) {
                return invoke((O4.c) null, (InterfaceC5240d) obj2);
            }
            throw new ClassCastException();
        }
    }

    public static final class i extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public i(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireRESTCallForClick(null, null, this);
        }
    }

    public static final class j extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public j(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireRESTCallForPageChange(null, null, this);
        }
    }

    /* renamed from: com.onesignal.inAppMessages.internal.k$k, reason: collision with other inner class name */
    public static final class C0206k implements com.onesignal.common.modeling.g {

        /* renamed from: com.onesignal.inAppMessages.internal.k$k$a */
        public static final class a extends B7.h implements I7.l {
            final /* synthetic */ String $newOneSignalId;
            int label;
            final /* synthetic */ k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, String str, InterfaceC5240d interfaceC5240d) {
                super(1, interfaceC5240d);
                this.this$0 = kVar;
                this.$newOneSignalId = str;
            }

            @Override // B7.a
            public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
                return new a(this.this$0, this.$newOneSignalId, interfaceC5240d);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
            
                if (r1.fetchMessages(r7, r6) == r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
            
                if (r7 == r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
            
                if (r7 == r0) goto L22;
             */
            @Override // B7.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                A7.a aVar = A7.a.f215n;
                int i = this.label;
                if (i == 0) {
                    Q3.b.s(obj);
                    s4.c cVar = this.this$0._consistencyManager;
                    C4874a c4874a = new C4874a(this.$newOneSignalId);
                    this.label = 1;
                    obj = cVar.getRywDataFromAwaitableCondition(c4874a, this);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Q3.b.s(obj);
                            return u7.v.f41073a;
                        }
                        Q3.b.s(obj);
                        C4875b c4875b = (C4875b) obj;
                        if (c4875b != null) {
                            k kVar = this.this$0;
                            this.label = 3;
                        }
                        return u7.v.f41073a;
                    }
                    Q3.b.s(obj);
                }
                this.label = 2;
                obj = ((C0399m) ((InterfaceC0398l) obj)).U(this);
            }

            @Override // I7.l
            public final Object invoke(InterfaceC5240d interfaceC5240d) {
                return ((a) create(interfaceC5240d)).invokeSuspend(u7.v.f41073a);
            }
        }

        public C0206k() {
        }

        @Override // com.onesignal.common.modeling.g
        public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
            kotlin.jvm.internal.h.e(args, "args");
            kotlin.jvm.internal.h.e(tag, "tag");
            if (kotlin.jvm.internal.h.a(args.getProperty(), "onesignal_id")) {
                Object oldValue = args.getOldValue();
                kotlin.jvm.internal.h.c(oldValue, "null cannot be cast to non-null type kotlin.String");
                Object newValue = args.getNewValue();
                kotlin.jvm.internal.h.c(newValue, "null cannot be cast to non-null type kotlin.String");
                String str = (String) newValue;
                com.onesignal.common.d dVar = com.onesignal.common.d.INSTANCE;
                if (!dVar.isLocalId((String) oldValue) || dVar.isLocalId(str)) {
                    return;
                }
                com.onesignal.common.threading.c.suspendifyOnIO(new a(k.this, str, null));
            }
        }

        @Override // com.onesignal.common.modeling.g
        public void onModelReplaced(U5.a model, String tag) {
            kotlin.jvm.internal.h.e(model, "model");
            kotlin.jvm.internal.h.e(tag, "tag");
            k.this.pendingJwtRetryExternalId = null;
            k.this.pendingJwtRetryRywData = null;
        }
    }

    public static final class l extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public l(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.messageWasDismissed(null, false, this);
        }
    }

    public static final class m extends kotlin.jvm.internal.i implements I7.l {
        final /* synthetic */ a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // I7.l
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((O4.g) null);
            return u7.v.f41073a;
        }

        public final void invoke(O4.g it) {
            kotlin.jvm.internal.h.e(it, "it");
            new e(this.$message);
            it.c();
        }
    }

    public static final class n extends B7.h implements I7.l {
        final /* synthetic */ C4875b $pendingRyw;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C4875b c4875b, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$pendingRyw = c4875b;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return k.this.new n(this.$pendingRyw, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                k kVar = k.this;
                C4875b c4875b = this.$pendingRyw;
                this.label = 1;
                if (kVar.fetchMessages(c4875b, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return u7.v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((n) create(interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }
    }

    public static final class o extends B7.h implements I7.l {
        final /* synthetic */ c $action;
        final /* synthetic */ a $message;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(c cVar, a aVar, k kVar, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$action = cVar;
            this.$message = aVar;
            this.this$0 = kVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new o(this.$action, this.$message, this.this$0, interfaceC5240d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
        
            if (r8.fireOutcomesForClick(r1, r3, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
        
            if (r8.fireRESTCallForClick(r1, r4, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        
            if (r8.beginProcessingPrompts(r1, r5, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        
            if (r8.firePublicClickHandler(r1, r6, r7) == r0) goto L25;
         */
        @Override // B7.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                this.$action.setFirstClick(this.$message.takeActionAsUnique());
                k kVar = this.this$0;
                a aVar2 = this.$message;
                c cVar = this.$action;
                this.label = 1;
            } else if (i == 1) {
                Q3.b.s(obj);
            } else if (i == 2) {
                Q3.b.s(obj);
                this.this$0.fireClickAction(this.$action);
                k kVar2 = this.this$0;
                a aVar3 = this.$message;
                c cVar2 = this.$action;
                this.label = 3;
            } else {
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                    return u7.v.f41073a;
                }
                Q3.b.s(obj);
                this.this$0.fireTagCallForClick(this.$action);
                k kVar3 = this.this$0;
                String messageId = this.$message.getMessageId();
                List<com.onesignal.inAppMessages.internal.f> outcomes = this.$action.getOutcomes();
                this.label = 4;
            }
            k kVar4 = this.this$0;
            a aVar4 = this.$message;
            List<com.onesignal.inAppMessages.internal.prompt.impl.b> prompts = this.$action.getPrompts();
            this.label = 2;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((o) create(interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }
    }

    public static final class p extends B7.h implements I7.l {
        final /* synthetic */ c $action;
        final /* synthetic */ a $message;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(c cVar, a aVar, k kVar, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$action = cVar;
            this.$message = aVar;
            this.this$0 = kVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return new p(this.$action, this.$message, this.this$0, interfaceC5240d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        
            if (r6.beginProcessingPrompts(r1, r3, r5) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            if (r6.firePublicClickHandler(r1, r4, r5) == r0) goto L15;
         */
        @Override // B7.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                this.$action.setFirstClick(this.$message.takeActionAsUnique());
                k kVar = this.this$0;
                a aVar2 = this.$message;
                c cVar = this.$action;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                    this.this$0.fireClickAction(this.$action);
                    this.this$0.logInAppMessagePreviewActions(this.$action);
                    return u7.v.f41073a;
                }
                Q3.b.s(obj);
            }
            k kVar2 = this.this$0;
            a aVar3 = this.$message;
            List<com.onesignal.inAppMessages.internal.prompt.impl.b> prompts = this.$action.getPrompts();
            this.label = 2;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((p) create(interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }
    }

    public static final class q extends B7.h implements I7.l {
        final /* synthetic */ a $message;
        final /* synthetic */ com.onesignal.inAppMessages.internal.g $page;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(a aVar, com.onesignal.inAppMessages.internal.g gVar, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$message = aVar;
            this.$page = gVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return k.this.new q(this.$message, this.$page, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                k kVar = k.this;
                a aVar2 = this.$message;
                com.onesignal.inAppMessages.internal.g gVar = this.$page;
                this.label = 1;
                if (kVar.fireRESTCallForPageChange(aVar2, gVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return u7.v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((q) create(interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }
    }

    public static final class r extends B7.h implements I7.l {
        final /* synthetic */ a $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(a aVar, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$message = aVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return k.this.new r(this.$message, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                k kVar = k.this;
                a aVar2 = this.$message;
                this.label = 1;
                if (k.messageWasDismissed$default(kVar, aVar2, false, this, 2, null) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return u7.v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((r) create(interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }
    }

    public static final class s extends kotlin.jvm.internal.i implements I7.l {
        final /* synthetic */ a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // I7.l
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((O4.g) null);
            return u7.v.f41073a;
        }

        public final void invoke(O4.g it) {
            kotlin.jvm.internal.h.e(it, "it");
            new e(this.$message);
            it.d();
        }
    }

    public static final class t extends B7.h implements I7.l {
        final /* synthetic */ a $message;
        final /* synthetic */ String $variantId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String str, a aVar, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$variantId = str;
            this.$message = aVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return k.this.new t(this.$variantId, this.$message, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            t tVar;
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            try {
                if (i == 0) {
                    Q3.b.s(obj);
                    P4.b bVar = k.this._backend;
                    String appId = ((com.onesignal.core.internal.config.b) k.this._configModelStore.getModel()).getAppId();
                    String id = k.this._subscriptionManager.getSubscriptions().getPush().getId();
                    String str = this.$variantId;
                    String messageId = this.$message.getMessageId();
                    this.label = 1;
                    tVar = this;
                    try {
                        if (bVar.sendIAMImpression(appId, id, str, messageId, tVar) == aVar) {
                            return aVar;
                        }
                    } catch (C5041a unused) {
                        k.this.impressionedMessages.remove(tVar.$message.getMessageId());
                        return u7.v.f41073a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                    tVar = this;
                }
                k.this._prefs.setImpressionesMessagesId(k.this.impressionedMessages);
            } catch (C5041a unused2) {
                tVar = this;
            }
            return u7.v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((t) create(interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }
    }

    public static final class u extends kotlin.jvm.internal.i implements I7.l {
        final /* synthetic */ a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // I7.l
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((O4.g) null);
            return u7.v.f41073a;
        }

        public final void invoke(O4.g it) {
            kotlin.jvm.internal.h.e(it, "it");
            new e(this.$message);
            it.b();
        }
    }

    public static final class v extends kotlin.jvm.internal.i implements I7.l {
        final /* synthetic */ a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // I7.l
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((O4.g) null);
            return u7.v.f41073a;
        }

        public final void invoke(O4.g it) {
            kotlin.jvm.internal.h.e(it, "it");
            new e(this.$message);
            it.a();
        }
    }

    public static final class w extends B7.h implements I7.l {
        int label;

        public w(InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return k.this.new w(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                k kVar = k.this;
                this.label = 1;
                if (kVar.evaluateInAppMessages(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return u7.v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((w) create(interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }
    }

    public static final class x extends B7.h implements I7.l {
        int label;

        public x(InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return k.this.new x(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                k kVar = k.this;
                this.label = 1;
                if (kVar.evaluateInAppMessages(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return u7.v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((x) create(interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }
    }

    public static final class y extends B7.h implements I7.l {
        int label;

        public y(InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return k.this.new y(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            k.this._displayer.dismissCurrentInAppMessage();
            return u7.v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((y) create(interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }
    }

    public static final class z extends B7.h implements I7.l {
        int label;

        public z(InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return k.this.new z(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                k kVar = k.this;
                this.label = 1;
                if (kVar.evaluateInAppMessages(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return u7.v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((z) create(interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }
    }

    public k(x4.f _applicationService, O5.b _sessionService, K5.a _influenceManager, com.onesignal.core.internal.config.c _configModelStore, P5.a _userManager, U5.b _identityModelStore, Z5.b _subscriptionManager, M5.b _outcomeEventsController, Y4.a _state, U4.a _prefs, X4.a _repository, P4.b _backend, Z4.a _triggerController, Z4.d _triggerModelStore, R4.a _displayer, T4.b _lifecycle, F4.a _languageContext, K4.a _time, s4.c _consistencyManager, com.onesignal.user.internal.jwt.c _jwtTokenStore, com.onesignal.core.internal.config.impl.c _identityVerificationService) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_sessionService, "_sessionService");
        kotlin.jvm.internal.h.e(_influenceManager, "_influenceManager");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(_userManager, "_userManager");
        kotlin.jvm.internal.h.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.h.e(_subscriptionManager, "_subscriptionManager");
        kotlin.jvm.internal.h.e(_outcomeEventsController, "_outcomeEventsController");
        kotlin.jvm.internal.h.e(_state, "_state");
        kotlin.jvm.internal.h.e(_prefs, "_prefs");
        kotlin.jvm.internal.h.e(_repository, "_repository");
        kotlin.jvm.internal.h.e(_backend, "_backend");
        kotlin.jvm.internal.h.e(_triggerController, "_triggerController");
        kotlin.jvm.internal.h.e(_triggerModelStore, "_triggerModelStore");
        kotlin.jvm.internal.h.e(_displayer, "_displayer");
        kotlin.jvm.internal.h.e(_lifecycle, "_lifecycle");
        kotlin.jvm.internal.h.e(_languageContext, "_languageContext");
        kotlin.jvm.internal.h.e(_time, "_time");
        kotlin.jvm.internal.h.e(_consistencyManager, "_consistencyManager");
        kotlin.jvm.internal.h.e(_jwtTokenStore, "_jwtTokenStore");
        kotlin.jvm.internal.h.e(_identityVerificationService, "_identityVerificationService");
        this._applicationService = _applicationService;
        this._sessionService = _sessionService;
        this._influenceManager = _influenceManager;
        this._configModelStore = _configModelStore;
        this._userManager = _userManager;
        this._identityModelStore = _identityModelStore;
        this._subscriptionManager = _subscriptionManager;
        this._outcomeEventsController = _outcomeEventsController;
        this._state = _state;
        this._prefs = _prefs;
        this._repository = _repository;
        this._backend = _backend;
        this._triggerController = _triggerController;
        this._triggerModelStore = _triggerModelStore;
        this._displayer = _displayer;
        this._lifecycle = _lifecycle;
        this._languageContext = _languageContext;
        this._time = _time;
        this._consistencyManager = _consistencyManager;
        this._jwtTokenStore = _jwtTokenStore;
        this._identityVerificationService = _identityVerificationService;
        this.lifecycleCallback = new com.onesignal.common.events.b();
        this.messageClickCallback = new com.onesignal.common.events.b();
        this.messages = new ArrayList();
        this.dismissedMessages = new LinkedHashSet();
        this.impressionedMessages = new LinkedHashSet();
        this.viewedPageIds = new LinkedHashSet();
        this.clickedClickIds = new LinkedHashSet();
        this.messageDisplayQueue = new ArrayList();
        this.messageDisplayQueueMutex = new a8.d();
        this.redisplayedInAppMessages = new ArrayList();
        this.fetchIAMMutex = new a8.d();
        Set<String> synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        kotlin.jvm.internal.h.d(synchronizedSet, "synchronizedSet(...)");
        this.earlySessionTriggers = synchronizedSet;
        this.identityModelChangeHandler = new C0206k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a1, code lost:
    
        if (r11.c(r1) == r2) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0163 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r3v8, types: [a8.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptToShowInAppMessage(InterfaceC5240d interfaceC5240d) {
        C4423a c4423a;
        Object obj;
        int i4;
        k kVar;
        kotlin.jvm.internal.r rVar;
        a8.d dVar;
        kotlin.jvm.internal.r rVar2;
        Boolean bool;
        if (interfaceC5240d instanceof C4423a) {
            c4423a = (C4423a) interfaceC5240d;
            int i6 = c4423a.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c4423a.label = i6 - Integer.MIN_VALUE;
                obj = c4423a.result;
                A7.a aVar = A7.a.f215n;
                i4 = c4423a.label;
                u7.v vVar = u7.v.f41073a;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    x4.f fVar = this._applicationService;
                    c4423a.L$0 = this;
                    c4423a.label = 1;
                    obj = fVar.waitUntilSystemConditionsAvailable(c4423a);
                    if (obj != aVar) {
                        kVar = this;
                    }
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 4) {
                                Q3.b.s(obj);
                                return vVar;
                            }
                            if (i4 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Q3.b.s(obj);
                            return vVar;
                        }
                        rVar2 = (kotlin.jvm.internal.r) c4423a.L$1;
                        kVar = (k) c4423a.L$0;
                        Q3.b.s(obj);
                        bool = (Boolean) obj;
                        if (bool != null) {
                            kVar._state.setInAppMessageIdShowing(null);
                            Object obj2 = rVar2.f38644n;
                            kotlin.jvm.internal.h.b(obj2);
                            c4423a.L$0 = null;
                            c4423a.L$1 = null;
                            c4423a.label = 4;
                            return kVar.queueMessageForDisplay((a) obj2, c4423a) == aVar ? aVar : vVar;
                        }
                        if (bool.equals(Boolean.FALSE)) {
                            kVar._state.setInAppMessageIdShowing(null);
                            List<a> list = kVar.messages;
                            Object obj3 = rVar2.f38644n;
                            kotlin.jvm.internal.u.a(list);
                            list.remove(obj3);
                            Object obj4 = rVar2.f38644n;
                            kotlin.jvm.internal.h.b(obj4);
                            c4423a.L$0 = null;
                            c4423a.L$1 = null;
                            c4423a.label = 5;
                            if (kVar.messageWasDismissed((a) obj4, true, c4423a) == aVar) {
                            }
                        }
                    }
                    ?? r32 = (InterfaceC0451a) c4423a.L$2;
                    kotlin.jvm.internal.r rVar3 = (kotlin.jvm.internal.r) c4423a.L$1;
                    k kVar2 = (k) c4423a.L$0;
                    Q3.b.s(obj);
                    rVar = rVar3;
                    dVar = r32;
                    kVar = kVar2;
                    try {
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: " + kVar.messageDisplayQueue, null, 2, null);
                        if (kVar.getPaused()) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: In app messaging is currently paused, in app messages will not be shown!", null, 2, null);
                        } else if (kVar.messageDisplayQueue.isEmpty()) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There are no IAMs left in the queue!", null, 2, null);
                        } else if (kVar._state.getInAppMessageIdShowing() != null) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There is an IAM currently showing!", null, 2, null);
                        } else {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: No IAM showing currently, showing first item in the queue!", null, 2, null);
                            a remove = kVar.messageDisplayQueue.remove(0);
                            rVar.f38644n = remove;
                            Y4.a aVar2 = kVar._state;
                            kotlin.jvm.internal.h.b(remove);
                            aVar2.setInAppMessageIdShowing(remove.getMessageId());
                        }
                        dVar.d(null);
                        Object obj5 = rVar.f38644n;
                        if (obj5 != null) {
                            c4423a.L$0 = kVar;
                            c4423a.L$1 = rVar;
                            c4423a.L$2 = null;
                            c4423a.label = 3;
                            Object displayMessage = kVar._displayer.displayMessage((a) obj5, c4423a);
                            if (displayMessage != aVar) {
                                rVar2 = rVar;
                                obj = displayMessage;
                                bool = (Boolean) obj;
                                if (bool != null) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        dVar.d(null);
                        throw th;
                    }
                }
                kVar = (k) c4423a.L$0;
                Q3.b.s(obj);
                if (((Boolean) obj).booleanValue()) {
                    com.onesignal.debug.internal.logging.b.warn$default("InAppMessagesManager.attemptToShowInAppMessage: In app message not showing due to system condition not correct", null, 2, null);
                    return vVar;
                }
                rVar = new kotlin.jvm.internal.r();
                InterfaceC0451a interfaceC0451a = kVar.messageDisplayQueueMutex;
                c4423a.L$0 = kVar;
                c4423a.L$1 = rVar;
                c4423a.L$2 = interfaceC0451a;
                c4423a.label = 2;
                dVar = (a8.d) interfaceC0451a;
            }
        }
        c4423a = new C4423a(interfaceC5240d);
        obj = c4423a.result;
        A7.a aVar3 = A7.a.f215n;
        i4 = c4423a.label;
        u7.v vVar2 = u7.v.f41073a;
        if (i4 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object beginProcessingPrompts(a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, InterfaceC5240d interfaceC5240d) {
        boolean isEmpty = list.isEmpty();
        u7.v vVar = u7.v.f41073a;
        if (!isEmpty) {
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.beginProcessingPrompts: IAM showing prompts from IAM: " + aVar, null, 2, null);
            this._displayer.dismissCurrentInAppMessage();
            Object showMultiplePrompts = showMultiplePrompts(aVar, list, interfaceC5240d);
            if (showMultiplePrompts == A7.a.f215n) {
                return showMultiplePrompts;
            }
        }
        return vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object evaluateInAppMessages(InterfaceC5240d interfaceC5240d) {
        C4424b c4424b;
        int i4;
        k kVar;
        Iterator it;
        if (interfaceC5240d instanceof C4424b) {
            c4424b = (C4424b) interfaceC5240d;
            int i6 = c4424b.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c4424b.label = i6 - Integer.MIN_VALUE;
                Object obj = c4424b.result;
                A7.a aVar = A7.a.f215n;
                i4 = c4424b.label;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.evaluateInAppMessages()", null, 2, null);
                    ArrayList arrayList = new ArrayList();
                    synchronized (this.messages) {
                        for (a aVar2 : this.messages) {
                            if (this._triggerController.evaluateMessageTriggers(aVar2)) {
                                setDataForRedisplay(aVar2);
                                if (!this.dismissedMessages.contains(aVar2.getMessageId()) && !aVar2.isFinished()) {
                                    arrayList.add(aVar2);
                                }
                            }
                        }
                    }
                    kVar = this;
                    it = arrayList.iterator();
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) c4424b.L$1;
                    kVar = (k) c4424b.L$0;
                    Q3.b.s(obj);
                }
                while (it.hasNext()) {
                    a aVar3 = (a) it.next();
                    c4424b.L$0 = kVar;
                    c4424b.L$1 = it;
                    c4424b.label = 1;
                    if (kVar.queueMessageForDisplay(aVar3, c4424b) == aVar) {
                        return aVar;
                    }
                }
                return u7.v.f41073a;
            }
        }
        c4424b = new C4424b(interfaceC5240d);
        Object obj2 = c4424b.result;
        A7.a aVar4 = A7.a.f215n;
        i4 = c4424b.label;
        if (i4 != 0) {
        }
        while (it.hasNext()) {
        }
        return u7.v.f41073a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchIvOrSaveRetry(String str, String str2, C4875b c4875b, I7.a aVar, InterfaceC5240d interfaceC5240d) {
        C4425c c4425c;
        int i4;
        C4875b c4875b2;
        k kVar;
        boolean z6;
        String str3;
        if (interfaceC5240d instanceof C4425c) {
            c4425c = (C4425c) interfaceC5240d;
            int i6 = c4425c.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                c4425c.label = i6 - Integer.MIN_VALUE;
                C4425c c4425c2 = c4425c;
                Object obj = c4425c2.result;
                A7.a aVar2 = A7.a.f215n;
                i4 = c4425c2.label;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    boolean ivBehaviorActive = this._identityVerificationService.getIvBehaviorActive();
                    String externalId = ((U5.a) this._identityModelStore.getModel()).getExternalId();
                    C5086l c5086l = (!ivBehaviorActive || externalId == null) ? new C5086l("onesignal_id", ((U5.a) this._identityModelStore.getModel()).getOnesignalId(), null) : new C5086l("external_id", externalId, this._jwtTokenStore.getJwt(externalId));
                    String str4 = c5086l.f41061n;
                    String str5 = c5086l.f41062u;
                    String str6 = c5086l.f41063v;
                    if (!ivBehaviorActive || externalId == null) {
                        c4875b2 = c4875b;
                    } else {
                        this.pendingJwtRetryExternalId = externalId;
                        c4875b2 = c4875b;
                        this.pendingJwtRetryRywData = c4875b2;
                    }
                    try {
                        P4.b bVar = this._backend;
                        c4425c2.L$0 = this;
                        c4425c2.L$1 = externalId;
                        c4425c2.Z$0 = ivBehaviorActive;
                        c4425c2.label = 1;
                        obj = bVar.listInAppMessagesIv(str, str4, str5, str2, c4875b2, aVar, str6, c4425c2);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        kVar = this;
                        z6 = ivBehaviorActive;
                        str3 = externalId;
                    } catch (C5041a e9) {
                        e = e9;
                        kVar = this;
                        z6 = ivBehaviorActive;
                        str3 = externalId;
                        if (z6 || str3 == null) {
                            com.onesignal.debug.internal.logging.b.warn$default("InAppMessagesManager: IAM fetch returned " + e.getStatusCode() + ": " + e.getResponse(), null, 2, null);
                        } else {
                            com.onesignal.debug.internal.logging.b.info$default("InAppMessagesManager: IAM fetch returned " + e.getStatusCode() + ", awaiting JWT refresh for " + str3, null, 2, null);
                            kVar.lastTimeFetchedIAMs = null;
                        }
                        return null;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z6 = c4425c2.Z$0;
                    str3 = (String) c4425c2.L$1;
                    kVar = (k) c4425c2.L$0;
                    try {
                        Q3.b.s(obj);
                    } catch (C5041a e10) {
                        e = e10;
                        if (z6) {
                        }
                        com.onesignal.debug.internal.logging.b.warn$default("InAppMessagesManager: IAM fetch returned " + e.getStatusCode() + ": " + e.getResponse(), null, 2, null);
                        return null;
                    }
                }
                List list = (List) obj;
                kVar.pendingJwtRetryExternalId = null;
                kVar.pendingJwtRetryRywData = null;
                return list;
            }
        }
        c4425c = new C4425c(interfaceC5240d);
        C4425c c4425c22 = c4425c;
        Object obj2 = c4425c22.result;
        A7.a aVar22 = A7.a.f215n;
        i4 = c4425c22.label;
        if (i4 != 0) {
        }
        List list2 = (List) obj2;
        kVar.pendingJwtRetryExternalId = null;
        kVar.pendingJwtRetryRywData = null;
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01cc, code lost:
    
        if (r4.evaluateInAppMessages(r9) == r3) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d9 A[Catch: all -> 0x00fc, TryCatch #1 {all -> 0x00fc, blocks: (B:63:0x00cf, B:65:0x00d9, B:67:0x00f4, B:70:0x00ff), top: B:62:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchMessages(C4875b c4875b, InterfaceC5240d interfaceC5240d) {
        C4426d c4426d;
        int i4;
        String id;
        InterfaceC0451a interfaceC0451a;
        String str;
        C4875b c4875b2;
        k kVar;
        k kVar2;
        List<a> list;
        try {
            if (interfaceC5240d instanceof C4426d) {
                c4426d = (C4426d) interfaceC5240d;
                int i6 = c4426d.label;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    c4426d.label = i6 - Integer.MIN_VALUE;
                    C4426d c4426d2 = c4426d;
                    Object obj = c4426d2.result;
                    A7.a aVar = A7.a.f215n;
                    i4 = c4426d2.label;
                    if (i4 != 0) {
                        Q3.b.s(obj);
                        if (!this._applicationService.isInForeground()) {
                            return u7.v.f41073a;
                        }
                        String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                        id = this._subscriptionManager.getSubscriptions().getPush().getId();
                        if (id.length() == 0 || com.onesignal.common.d.INSTANCE.isLocalId(id) || appId.length() == 0) {
                            return u7.v.f41073a;
                        }
                        InterfaceC0451a interfaceC0451a2 = this.fetchIAMMutex;
                        c4426d2.L$0 = this;
                        c4426d2.L$1 = c4875b;
                        c4426d2.L$2 = appId;
                        c4426d2.L$3 = id;
                        c4426d2.L$4 = interfaceC0451a2;
                        c4426d2.label = 1;
                        a8.d dVar = (a8.d) interfaceC0451a2;
                        if (dVar.c(c4426d2) != aVar) {
                            interfaceC0451a = dVar;
                            str = appId;
                            c4875b2 = c4875b;
                            kVar = this;
                        }
                        return aVar;
                    }
                    if (i4 == 1) {
                        interfaceC0451a = (InterfaceC0451a) c4426d2.L$4;
                        id = (String) c4426d2.L$3;
                        String str2 = (String) c4426d2.L$2;
                        C4875b c4875b3 = (C4875b) c4426d2.L$1;
                        kVar = (k) c4426d2.L$0;
                        Q3.b.s(obj);
                        str = str2;
                        c4875b2 = c4875b3;
                    } else if (i4 == 2) {
                        kVar2 = (k) c4426d2.L$0;
                        Q3.b.s(obj);
                        list = (List) obj;
                        if (list != null) {
                        }
                    } else {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Q3.b.s(obj);
                            return u7.v.f41073a;
                        }
                        kVar2 = (k) c4426d2.L$0;
                        Q3.b.s(obj);
                        list = (List) obj;
                        if (list != null) {
                            return u7.v.f41073a;
                        }
                        if ((list instanceof J7.a) && !(list instanceof J7.c)) {
                            kotlin.jvm.internal.u.d(list, "kotlin.collections.MutableList");
                            throw null;
                        }
                        kVar2.messages = list;
                        synchronized (kVar2.earlySessionTriggers) {
                            try {
                                if (!kVar2.earlySessionTriggers.isEmpty()) {
                                    com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Processing triggers added early on cold start: " + kVar2.earlySessionTriggers, null, 2, null);
                                    for (a aVar2 : kVar2.messages) {
                                        boolean contains = kVar2.redisplayedInAppMessages.contains(aVar2);
                                        boolean isTriggerOnMessage = kVar2._triggerController.isTriggerOnMessage(aVar2, kVar2.earlySessionTriggers);
                                        if (contains && isTriggerOnMessage) {
                                            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Setting isTriggerChanged=true for message " + aVar2.getMessageId(), null, 2, null);
                                            aVar2.setTriggerChanged(true);
                                        }
                                    }
                                    kVar2.earlySessionTriggers.clear();
                                }
                                kVar2.hasCompletedFirstFetch = true;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        c4426d2.L$0 = null;
                        c4426d2.label = 4;
                    }
                    long currentTimeMillis = kVar._time.getCurrentTimeMillis();
                    if (kVar.lastTimeFetchedIAMs != null) {
                        Long l9 = kVar.lastTimeFetchedIAMs;
                        kotlin.jvm.internal.h.b(l9);
                        if (currentTimeMillis - l9.longValue() < ((com.onesignal.core.internal.config.b) kVar._configModelStore.getModel()).getFetchIAMMinInterval()) {
                            return u7.v.f41073a;
                        }
                    }
                    kVar.lastTimeFetchedIAMs = new Long(currentTimeMillis);
                    ((a8.d) interfaceC0451a).d(null);
                    C4427e c4427e = kVar.new C4427e();
                    if (kVar._identityVerificationService.getNewCodePathsRun()) {
                        P4.b bVar = kVar._backend;
                        c4426d2.L$0 = kVar;
                        c4426d2.L$1 = null;
                        c4426d2.L$2 = null;
                        c4426d2.L$3 = null;
                        c4426d2.L$4 = null;
                        c4426d2.label = 3;
                        obj = bVar.listInAppMessages(str, id, c4875b2, c4427e, c4426d2);
                        if (obj != aVar) {
                            kVar2 = kVar;
                            list = (List) obj;
                            if (list != null) {
                            }
                        }
                    } else {
                        c4426d2.L$0 = kVar;
                        c4426d2.L$1 = null;
                        c4426d2.L$2 = null;
                        c4426d2.L$3 = null;
                        c4426d2.L$4 = null;
                        c4426d2.label = 2;
                        obj = kVar.fetchIvOrSaveRetry(str, id, c4875b2, c4427e, c4426d2);
                        if (obj != aVar) {
                            kVar2 = kVar;
                            list = (List) obj;
                            if (list != null) {
                            }
                        }
                    }
                    return aVar;
                }
            }
            long currentTimeMillis2 = kVar._time.getCurrentTimeMillis();
            if (kVar.lastTimeFetchedIAMs != null) {
            }
            kVar.lastTimeFetchedIAMs = new Long(currentTimeMillis2);
            ((a8.d) interfaceC0451a).d(null);
            C4427e c4427e2 = kVar.new C4427e();
            if (kVar._identityVerificationService.getNewCodePathsRun()) {
            }
            return aVar;
        } finally {
            ((a8.d) interfaceC0451a).d(null);
        }
        c4426d = new C4426d(interfaceC5240d);
        C4426d c4426d22 = c4426d;
        Object obj2 = c4426d22.result;
        A7.a aVar3 = A7.a.f215n;
        i4 = c4426d22.label;
        if (i4 != 0) {
        }
    }

    private final void fetchMessagesWhenConditionIsMet() {
        com.onesignal.common.threading.c.suspendifyOnIO(new f(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireClickAction(c cVar) {
        if (cVar.getUrl() == null || cVar.getUrl().length() <= 0) {
            return;
        }
        if (cVar.getUrlTarget() == O4.k.BROWSER) {
            AndroidUtils.INSTANCE.openURLInBrowser(this._applicationService.getAppContext(), cVar.getUrl());
        } else if (cVar.getUrlTarget() == O4.k.IN_APP_WEBVIEW) {
            Q4.b.INSTANCE.open$com_onesignal_inAppMessages(cVar.getUrl(), true, this._applicationService.getAppContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireOutcomesForClick(String str, List<com.onesignal.inAppMessages.internal.f> list, InterfaceC5240d interfaceC5240d) {
        g gVar;
        int i4;
        Iterator<com.onesignal.inAppMessages.internal.f> it;
        k kVar;
        if (interfaceC5240d instanceof g) {
            gVar = (g) interfaceC5240d;
            int i6 = gVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                gVar.label = i6 - Integer.MIN_VALUE;
                Object obj = gVar.result;
                A7.a aVar = A7.a.f215n;
                i4 = gVar.label;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    this._influenceManager.onDirectInfluenceFromIAM(str);
                    it = list.iterator();
                    kVar = this;
                } else {
                    if (i4 != 1 && i4 != 2 && i4 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) gVar.L$1;
                    kVar = (k) gVar.L$0;
                    Q3.b.s(obj);
                }
                while (it.hasNext()) {
                    com.onesignal.inAppMessages.internal.f next = it.next();
                    String name = next.getName();
                    if (next.isUnique()) {
                        M5.b bVar = kVar._outcomeEventsController;
                        gVar.L$0 = kVar;
                        gVar.L$1 = it;
                        gVar.label = 1;
                        if (bVar.sendUniqueOutcomeEvent(name, gVar) == aVar) {
                            return aVar;
                        }
                    } else if (next.getWeight() > 0.0f) {
                        M5.b bVar2 = kVar._outcomeEventsController;
                        float weight = next.getWeight();
                        gVar.L$0 = kVar;
                        gVar.L$1 = it;
                        gVar.label = 2;
                        if (bVar2.sendOutcomeEventWithValue(name, weight, gVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        M5.b bVar3 = kVar._outcomeEventsController;
                        gVar.L$0 = kVar;
                        gVar.L$1 = it;
                        gVar.label = 3;
                        if (bVar3.sendOutcomeEvent(name, gVar) == aVar) {
                            return aVar;
                        }
                    }
                }
                return u7.v.f41073a;
            }
        }
        gVar = new g(interfaceC5240d);
        Object obj2 = gVar.result;
        A7.a aVar2 = A7.a.f215n;
        i4 = gVar.label;
        if (i4 != 0) {
        }
        while (it.hasNext()) {
        }
        return u7.v.f41073a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object firePublicClickHandler(a aVar, c cVar, InterfaceC5240d interfaceC5240d) {
        boolean hasSubscribers = this.messageClickCallback.getHasSubscribers();
        u7.v vVar = u7.v.f41073a;
        if (!hasSubscribers) {
            return vVar;
        }
        this._influenceManager.onDirectInfluenceFromIAM(aVar.getMessageId());
        Object suspendingFireOnMain = this.messageClickCallback.suspendingFireOnMain(new h(new b(aVar, cVar), null), interfaceC5240d);
        return suspendingFireOnMain == A7.a.f215n ? suspendingFireOnMain : vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(4:10|11|12|13)(2:27|28))(3:29|(6:31|(1:45)|(1:37)|38|39|(1:41)(1:42))|24)|14|15|16))|47|6|7|(0)(0)|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0073, code lost:
    
        if (r13.contains(r6) != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireRESTCallForClick(a aVar, c cVar, InterfaceC5240d interfaceC5240d) {
        i iVar;
        int i4;
        String clickId;
        k kVar;
        a aVar2;
        String str;
        if (interfaceC5240d instanceof i) {
            iVar = (i) interfaceC5240d;
            int i6 = iVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                iVar.label = i6 - Integer.MIN_VALUE;
                i iVar2 = iVar;
                Object obj = iVar2.result;
                A7.a aVar3 = A7.a.f215n;
                i4 = iVar2.label;
                u7.v vVar = u7.v.f41073a;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    String variantIdForMessage = Q4.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
                    if (variantIdForMessage != null) {
                        clickId = cVar.getClickId();
                        if (!aVar.getRedisplayStats().isRedisplayEnabled() || clickId == null || !aVar.isClickAvailable(clickId)) {
                            Set<String> set = this.clickedClickIds;
                            kotlin.jvm.internal.h.e(set, "<this>");
                        }
                        if (clickId != null) {
                            this.clickedClickIds.add(clickId);
                            aVar.addClickId(clickId);
                        }
                        try {
                            P4.b bVar = this._backend;
                            String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                            String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                            String messageId = aVar.getMessageId();
                            boolean isFirstClick = cVar.isFirstClick();
                            iVar2.L$0 = this;
                            iVar2.L$1 = aVar;
                            iVar2.L$2 = clickId;
                            iVar2.label = 1;
                            if (bVar.sendIAMClick(appId, id, variantIdForMessage, messageId, clickId, isFirstClick, iVar2) == aVar3) {
                                return aVar3;
                            }
                            kVar = this;
                        } catch (C5041a unused) {
                            kVar = this;
                            aVar2 = aVar;
                            str = clickId;
                            Set<String> set2 = kVar.clickedClickIds;
                            kotlin.jvm.internal.u.a(set2);
                            set2.remove(str);
                            if (str != null) {
                                aVar2.removeClickId(str);
                            }
                            return vVar;
                        }
                    }
                    return vVar;
                }
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) iVar2.L$2;
                aVar2 = (a) iVar2.L$1;
                kVar = (k) iVar2.L$0;
                try {
                    Q3.b.s(obj);
                    clickId = str;
                    aVar = aVar2;
                } catch (C5041a unused2) {
                    Set<String> set22 = kVar.clickedClickIds;
                    kotlin.jvm.internal.u.a(set22);
                    set22.remove(str);
                    if (str != null) {
                    }
                    return vVar;
                }
                kVar._prefs.setClickedMessagesId(kVar.clickedClickIds);
                return vVar;
            }
        }
        iVar = new i(interfaceC5240d);
        i iVar22 = iVar;
        Object obj2 = iVar22.result;
        A7.a aVar32 = A7.a.f215n;
        i4 = iVar22.label;
        u7.v vVar2 = u7.v.f41073a;
        if (i4 != 0) {
        }
        kVar._prefs.setClickedMessagesId(kVar.clickedClickIds);
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireRESTCallForPageChange(a aVar, com.onesignal.inAppMessages.internal.g gVar, InterfaceC5240d interfaceC5240d) {
        j jVar;
        int i4;
        String str;
        k kVar;
        if (interfaceC5240d instanceof j) {
            jVar = (j) interfaceC5240d;
            int i6 = jVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                jVar.label = i6 - Integer.MIN_VALUE;
                j jVar2 = jVar;
                Object obj = jVar2.result;
                A7.a aVar2 = A7.a.f215n;
                i4 = jVar2.label;
                u7.v vVar = u7.v.f41073a;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    String variantIdForMessage = Q4.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
                    if (variantIdForMessage == null) {
                        return vVar;
                    }
                    String pageId = gVar.getPageId();
                    String str2 = aVar.getMessageId() + pageId;
                    if (this.viewedPageIds.contains(str2)) {
                        com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Already sent page impression for id: " + pageId, null, 2, null);
                        return vVar;
                    }
                    this.viewedPageIds.add(str2);
                    try {
                        P4.b bVar = this._backend;
                        String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
                        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
                        String messageId = aVar.getMessageId();
                        jVar2.L$0 = this;
                        jVar2.L$1 = str2;
                        jVar2.label = 1;
                        if (bVar.sendIAMPageImpression(appId, id, variantIdForMessage, messageId, pageId, jVar2) == aVar2) {
                            return aVar2;
                        }
                        str = str2;
                        kVar = this;
                    } catch (C5041a unused) {
                        str = str2;
                        kVar = this;
                        kVar.viewedPageIds.remove(str);
                        return vVar;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) jVar2.L$1;
                    kVar = (k) jVar2.L$0;
                    try {
                        Q3.b.s(obj);
                    } catch (C5041a unused2) {
                        kVar.viewedPageIds.remove(str);
                        return vVar;
                    }
                }
                kVar._prefs.setViewPageImpressionedIds(kVar.viewedPageIds);
                return vVar;
            }
        }
        jVar = new j(interfaceC5240d);
        j jVar22 = jVar;
        Object obj2 = jVar22.result;
        A7.a aVar22 = A7.a.f215n;
        i4 = jVar22.label;
        u7.v vVar2 = u7.v.f41073a;
        if (i4 != 0) {
        }
        kVar._prefs.setViewPageImpressionedIds(kVar.viewedPageIds);
        return vVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireTagCallForClick(c cVar) {
        if (cVar.getTags() != null) {
            com.onesignal.inAppMessages.internal.i tags = cVar.getTags();
            if ((tags != null ? tags.getTagsToAdd() : null) != null) {
                com.onesignal.common.f fVar = com.onesignal.common.f.INSTANCE;
                JSONObject tagsToAdd = tags.getTagsToAdd();
                kotlin.jvm.internal.h.b(tagsToAdd);
                this._userManager.addTags(fVar.newStringMapFromJSONObject(tagsToAdd));
            }
            if ((tags != null ? tags.getTagsToRemove() : null) != null) {
                com.onesignal.common.f fVar2 = com.onesignal.common.f.INSTANCE;
                JSONArray tagsToRemove = tags != null ? tags.getTagsToRemove() : null;
                kotlin.jvm.internal.h.b(tagsToRemove);
                this._userManager.removeTags(fVar2.newStringSetFromJSONArray(tagsToRemove));
            }
        }
    }

    private final boolean hasMessageTriggerChanged(a aVar) {
        if (this._triggerController.messageHasOnlyDynamicTriggers(aVar)) {
            return !aVar.isDisplayedInSession();
        }
        return aVar.isTriggerChanged() || (!aVar.isDisplayedInSession() && aVar.getTriggers().isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logInAppMessagePreviewActions(c cVar) {
        if (cVar.getTags() != null) {
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + cVar.getTags(), null, 2, null);
        }
        if (cVar.getOutcomes().size() > 0) {
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + cVar.getOutcomes(), null, 2, null);
        }
    }

    private final void makeRedisplayMessagesAvailableWithTriggers(Collection<String> collection, boolean z6) {
        synchronized (this.messages) {
            for (a aVar : this.messages) {
                boolean contains = this.redisplayedInAppMessages.contains(aVar);
                boolean isTriggerOnMessage = this._triggerController.isTriggerOnMessage(aVar, collection);
                boolean messageHasOnlyDynamicTriggers = this._triggerController.messageHasOnlyDynamicTriggers(aVar);
                if (!aVar.isTriggerChanged() && contains && (isTriggerOnMessage || (z6 && messageHasOnlyDynamicTriggers))) {
                    com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.makeRedisplayMessagesAvailableWithTriggers: Trigger changed for message: " + aVar, null, 2, null);
                    aVar.setTriggerChanged(true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        if (persistInAppMessage(r11, r0) == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object messageWasDismissed(a aVar, boolean z6, InterfaceC5240d interfaceC5240d) {
        l lVar;
        int i4;
        k kVar;
        if (interfaceC5240d instanceof l) {
            lVar = (l) interfaceC5240d;
            int i6 = lVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                lVar.label = i6 - Integer.MIN_VALUE;
                Object obj = lVar.result;
                A7.a aVar2 = A7.a.f215n;
                i4 = lVar.label;
                u7.v vVar = u7.v.f41073a;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    if (aVar.isPreview()) {
                        kVar = this;
                        kVar._influenceManager.onInAppMessageDismissed();
                        if (kVar._state.getCurrentPrompt() != null) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: Stop evaluateMessageDisplayQueue because prompt is currently displayed", null, 2, null);
                            return vVar;
                        }
                        if (kVar.lifecycleCallback.getHasSubscribers()) {
                            kVar.lifecycleCallback.fireOnMain(new m(aVar));
                        }
                        kVar._state.setInAppMessageIdShowing(null);
                        if (kVar.messageDisplayQueue.isEmpty()) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: In app message dismissed evaluating messages", null, 2, null);
                            lVar.L$0 = null;
                            lVar.L$1 = null;
                            lVar.label = 3;
                            if (kVar.evaluateInAppMessages(lVar) != aVar2) {
                                return vVar;
                            }
                        } else {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: In app message on queue available, attempting to show", null, 2, null);
                            lVar.L$0 = null;
                            lVar.L$1 = null;
                            lVar.label = 2;
                            if (kVar.attemptToShowInAppMessage(lVar) != aVar2) {
                                return vVar;
                            }
                        }
                        return aVar2;
                    }
                    this.dismissedMessages.add(aVar.getMessageId());
                    if (!z6) {
                        this._prefs.setDismissedMessagesId(this.dismissedMessages);
                        this._state.setLastTimeInAppDismissed(new Long(this._time.getCurrentTimeMillis()));
                        lVar.L$0 = this;
                        lVar.L$1 = aVar;
                        lVar.label = 1;
                    }
                    kVar = this;
                } else {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            Q3.b.s(obj);
                            return vVar;
                        }
                        if (i4 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Q3.b.s(obj);
                        return vVar;
                    }
                    aVar = (a) lVar.L$1;
                    kVar = (k) lVar.L$0;
                    Q3.b.s(obj);
                }
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: dismissedMessages: " + kVar.dismissedMessages, null, 2, null);
                kVar._influenceManager.onInAppMessageDismissed();
                if (kVar._state.getCurrentPrompt() != null) {
                }
            }
        }
        lVar = new l(interfaceC5240d);
        Object obj2 = lVar.result;
        A7.a aVar22 = A7.a.f215n;
        i4 = lVar.label;
        u7.v vVar2 = u7.v.f41073a;
        if (i4 != 0) {
        }
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: dismissedMessages: " + kVar.dismissedMessages, null, 2, null);
        kVar._influenceManager.onInAppMessageDismissed();
        if (kVar._state.getCurrentPrompt() != null) {
        }
    }

    public static /* synthetic */ Object messageWasDismissed$default(k kVar, a aVar, boolean z6, InterfaceC5240d interfaceC5240d, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z6 = false;
        }
        return kVar.messageWasDismissed(aVar, z6, interfaceC5240d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object persistInAppMessage(a aVar, InterfaceC5240d interfaceC5240d) {
        A a9;
        int i4;
        k kVar;
        int indexOf;
        if (interfaceC5240d instanceof A) {
            a9 = (A) interfaceC5240d;
            int i6 = a9.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                a9.label = i6 - Integer.MIN_VALUE;
                Object obj = a9.result;
                A7.a aVar2 = A7.a.f215n;
                i4 = a9.label;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    aVar.getRedisplayStats().setLastDisplayTime(this._time.getCurrentTimeMillis() / 1000);
                    aVar.getRedisplayStats().incrementDisplayQuantity();
                    aVar.setTriggerChanged(false);
                    aVar.setDisplayedInSession(true);
                    X4.a aVar3 = this._repository;
                    a9.L$0 = this;
                    a9.L$1 = aVar;
                    a9.label = 1;
                    if (aVar3.saveInAppMessage(aVar, a9) == aVar2) {
                        return aVar2;
                    }
                    kVar = this;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) a9.L$1;
                    kVar = (k) a9.L$0;
                    Q3.b.s(obj);
                }
                kVar._prefs.setLastTimeInAppDismissed(kVar._state.getLastTimeInAppDismissed());
                indexOf = kVar.redisplayedInAppMessages.indexOf(aVar);
                if (indexOf == -1) {
                    kVar.redisplayedInAppMessages.set(indexOf, aVar);
                } else {
                    kVar.redisplayedInAppMessages.add(aVar);
                }
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.persistInAppMessage: " + aVar + " with msg array data: " + kVar.redisplayedInAppMessages, null, 2, null);
                return u7.v.f41073a;
            }
        }
        a9 = new A(interfaceC5240d);
        Object obj2 = a9.result;
        A7.a aVar22 = A7.a.f215n;
        i4 = a9.label;
        if (i4 != 0) {
        }
        kVar._prefs.setLastTimeInAppDismissed(kVar._state.getLastTimeInAppDismissed());
        indexOf = kVar.redisplayedInAppMessages.indexOf(aVar);
        if (indexOf == -1) {
        }
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.persistInAppMessage: " + aVar + " with msg array data: " + kVar.redisplayedInAppMessages, null, 2, null);
        return u7.v.f41073a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (r4.attemptToShowInAppMessage(r1) != r2) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v9, types: [a8.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object queueMessageForDisplay(a aVar, InterfaceC5240d interfaceC5240d) {
        B b9;
        int i4;
        a8.d dVar;
        k kVar;
        try {
            if (interfaceC5240d instanceof B) {
                b9 = (B) interfaceC5240d;
                int i6 = b9.label;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    b9.label = i6 - Integer.MIN_VALUE;
                    Object obj = b9.result;
                    A7.a aVar2 = A7.a.f215n;
                    i4 = b9.label;
                    if (i4 != 0) {
                        Q3.b.s(obj);
                        InterfaceC0451a interfaceC0451a = this.messageDisplayQueueMutex;
                        b9.L$0 = this;
                        b9.L$1 = aVar;
                        b9.L$2 = interfaceC0451a;
                        b9.label = 1;
                        dVar = (a8.d) interfaceC0451a;
                        if (dVar.c(b9) != aVar2) {
                            kVar = this;
                        }
                        return aVar2;
                    }
                    if (i4 != 1) {
                        if (i4 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Q3.b.s(obj);
                        return u7.v.f41073a;
                    }
                    ?? r9 = (InterfaceC0451a) b9.L$2;
                    a aVar3 = (a) b9.L$1;
                    kVar = (k) b9.L$0;
                    Q3.b.s(obj);
                    dVar = r9;
                    aVar = aVar3;
                    if (!kVar.messageDisplayQueue.contains(aVar) && !kotlin.jvm.internal.h.a(kVar._state.getInAppMessageIdShowing(), aVar.getMessageId())) {
                        kVar.messageDisplayQueue.add(aVar);
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.queueMessageForDisplay: In app message with id: " + aVar.getMessageId() + ", added to the queue", null, 2, null);
                    }
                    dVar.d(null);
                    b9.L$0 = null;
                    b9.L$1 = null;
                    b9.L$2 = null;
                    b9.label = 2;
                }
            }
            if (!kVar.messageDisplayQueue.contains(aVar)) {
                kVar.messageDisplayQueue.add(aVar);
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.queueMessageForDisplay: In app message with id: " + aVar.getMessageId() + ", added to the queue", null, 2, null);
            }
            dVar.d(null);
            b9.L$0 = null;
            b9.L$1 = null;
            b9.L$2 = null;
            b9.label = 2;
        } catch (Throwable th) {
            dVar.d(null);
            throw th;
        }
        b9 = new B(interfaceC5240d);
        Object obj2 = b9.result;
        A7.a aVar22 = A7.a.f215n;
        i4 = b9.label;
        if (i4 != 0) {
        }
    }

    private final void setDataForRedisplay(a aVar) {
        boolean contains = this.dismissedMessages.contains(aVar.getMessageId());
        int indexOf = this.redisplayedInAppMessages.indexOf(aVar);
        if (!contains || indexOf == -1) {
            return;
        }
        a aVar2 = this.redisplayedInAppMessages.get(indexOf);
        aVar.getRedisplayStats().setDisplayStats(aVar2.getRedisplayStats());
        aVar.setDisplayedInSession(aVar2.isDisplayedInSession());
        boolean hasMessageTriggerChanged = hasMessageTriggerChanged(aVar);
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.setDataForRedisplay: " + aVar + " triggerHasChanged: " + hasMessageTriggerChanged, null, 2, null);
        if (hasMessageTriggerChanged && aVar.getRedisplayStats().isDelayTimeSatisfied() && aVar.getRedisplayStats().shouldDisplayAgain()) {
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.setDataForRedisplay message available for redisplay: " + aVar.getMessageId(), null, 2, null);
            this.dismissedMessages.remove(aVar.getMessageId());
            this.impressionedMessages.remove(aVar.getMessageId());
            this.viewedPageIds.clear();
            this._prefs.setViewPageImpressionedIds(this.viewedPageIds);
            aVar.clearClickIds();
        }
    }

    private final void showAlertDialogMessage(final a aVar, final List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list) {
        String string = this._applicationService.getAppContext().getString(O4.l.location_permission_missing_title);
        kotlin.jvm.internal.h.d(string, "getString(...)");
        String string2 = this._applicationService.getAppContext().getString(O4.l.location_permission_missing_message);
        kotlin.jvm.internal.h.d(string2, "getString(...)");
        new AlertDialog.Builder(this._applicationService.getCurrent()).setTitle(string).setMessage(string2).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onesignal.inAppMessages.internal.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                k.showAlertDialogMessage$lambda$11(k.this, aVar, list, dialogInterface, i4);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAlertDialogMessage$lambda$11(k this$0, a inAppMessage, List prompts, DialogInterface dialogInterface, int i4) {
        kotlin.jvm.internal.h.e(this$0, "this$0");
        kotlin.jvm.internal.h.e(inAppMessage, "$inAppMessage");
        kotlin.jvm.internal.h.e(prompts, "$prompts");
        com.onesignal.common.threading.c.suspendifyOnIO(this$0.new C(inAppMessage, prompts, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00b8 -> B:16:0x00bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object showMultiplePrompts(a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, InterfaceC5240d interfaceC5240d) {
        D d9;
        k kVar;
        int i4;
        Iterator<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> it;
        D d10;
        k kVar2;
        a aVar2;
        List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list2;
        a aVar3;
        k kVar3;
        if (interfaceC5240d instanceof D) {
            d9 = (D) interfaceC5240d;
            int i6 = d9.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                d9.label = i6 - Integer.MIN_VALUE;
                kVar = this;
                Object obj = d9.result;
                A7.a aVar4 = A7.a.f215n;
                i4 = d9.label;
                u7.v vVar = u7.v.f41073a;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    it = list.iterator();
                    d10 = d9;
                    kVar2 = kVar;
                    aVar2 = aVar;
                    list2 = list;
                    while (it.hasNext()) {
                    }
                    aVar3 = aVar2;
                    kVar3 = kVar2;
                    if (kVar3._state.getCurrentPrompt() == null) {
                    }
                    return vVar;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                    return vVar;
                }
                Iterator<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> it2 = (Iterator) d9.L$3;
                List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list3 = (List) d9.L$2;
                a aVar5 = (a) d9.L$1;
                kVar2 = (k) d9.L$0;
                Q3.b.s(obj);
                d10 = d9;
                list2 = list3;
                it = it2;
                b.a aVar6 = (b.a) obj;
                kVar2._state.setCurrentPrompt(null);
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle finished with result: " + aVar6, null, 2, null);
                if (!aVar5.isPreview() && aVar6 == b.a.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                    kVar2.showAlertDialogMessage(aVar5, list2);
                    aVar3 = aVar5;
                    kVar3 = kVar2;
                    if (kVar3._state.getCurrentPrompt() == null) {
                    }
                    return vVar;
                }
                aVar2 = aVar5;
                while (it.hasNext()) {
                    com.onesignal.inAppMessages.internal.prompt.impl.b next = it.next();
                    if (!next.hasPrompted()) {
                        kVar2._state.setCurrentPrompt(next);
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle: " + kVar2._state.getCurrentPrompt(), null, 2, null);
                        com.onesignal.inAppMessages.internal.prompt.impl.b currentPrompt = kVar2._state.getCurrentPrompt();
                        kotlin.jvm.internal.h.b(currentPrompt);
                        currentPrompt.setPrompted(true);
                        com.onesignal.inAppMessages.internal.prompt.impl.b currentPrompt2 = kVar2._state.getCurrentPrompt();
                        kotlin.jvm.internal.h.b(currentPrompt2);
                        d10.L$0 = kVar2;
                        d10.L$1 = aVar2;
                        d10.L$2 = list2;
                        d10.L$3 = it;
                        d10.label = 1;
                        Object handlePrompt = currentPrompt2.handlePrompt(d10);
                        if (handlePrompt != aVar4) {
                            aVar5 = aVar2;
                            obj = handlePrompt;
                            b.a aVar62 = (b.a) obj;
                            kVar2._state.setCurrentPrompt(null);
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle finished with result: " + aVar62, null, 2, null);
                            if (!aVar5.isPreview()) {
                            }
                            aVar2 = aVar5;
                            while (it.hasNext()) {
                            }
                        }
                        return aVar4;
                    }
                }
                aVar3 = aVar2;
                kVar3 = kVar2;
                if (kVar3._state.getCurrentPrompt() == null) {
                    com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.showMultiplePrompts: No IAM prompt to handle, dismiss message: " + aVar3.getMessageId(), null, 2, null);
                    d10.L$0 = null;
                    d10.L$1 = null;
                    d10.L$2 = null;
                    d10.L$3 = null;
                    d10.label = 2;
                    if (messageWasDismissed$default(kVar3, aVar3, false, d10, 2, null) == aVar4) {
                        return aVar4;
                    }
                }
                return vVar;
            }
        }
        kVar = this;
        d9 = kVar.new D(interfaceC5240d);
        Object obj2 = d9.result;
        A7.a aVar42 = A7.a.f215n;
        i4 = d9.label;
        u7.v vVar2 = u7.v.f41073a;
        if (i4 != 0) {
        }
    }

    @Override // O4.j
    /* renamed from: addClickListener */
    public void mo20addClickListener(O4.c listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addClickListener(listener: " + listener + ')', null, 2, null);
        this.messageClickCallback.subscribe(listener);
    }

    @Override // O4.j
    /* renamed from: addLifecycleListener */
    public void mo21addLifecycleListener(O4.g listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addLifecycleListener(listener: " + listener + ')', null, 2, null);
        this.lifecycleCallback.subscribe(listener);
    }

    @Override // O4.j
    /* renamed from: addTrigger */
    public void mo22addTrigger(String key, String value) {
        kotlin.jvm.internal.h.e(key, "key");
        kotlin.jvm.internal.h.e(value, "value");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addTrigger(key: " + key + ", value: " + value + ')', null, 2, null);
        synchronized (this.earlySessionTriggers) {
            if (!this.hasCompletedFirstFetch) {
                com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Tracking trigger added early on cold start: ".concat(key), null, 2, null);
                this.earlySessionTriggers.add(key);
            }
        }
        Z4.c cVar = (Z4.c) this._triggerModelStore.get(key);
        if (cVar != null) {
            cVar.setValue(value);
            return;
        }
        Z4.c cVar2 = new Z4.c();
        cVar2.setId(key);
        cVar2.setKey(key);
        cVar2.setValue(value);
        com.onesignal.common.modeling.b.add$default(this._triggerModelStore, cVar2, null, 2, null);
    }

    @Override // O4.j
    /* renamed from: addTriggers */
    public void mo23addTriggers(Map<String, String> triggers) {
        kotlin.jvm.internal.h.e(triggers, "triggers");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addTriggers(triggers: " + triggers + ')', null, 2, null);
        for (Map.Entry<String, String> entry : triggers.entrySet()) {
            mo22addTrigger(entry.getKey(), entry.getValue());
        }
    }

    @Override // O4.j
    /* renamed from: clearTriggers */
    public void mo24clearTriggers() {
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.clearTriggers()", null, 2, null);
        synchronized (this.earlySessionTriggers) {
            if (!this.hasCompletedFirstFetch) {
                this.earlySessionTriggers.clear();
            }
        }
        com.onesignal.common.modeling.b.clear$default(this._triggerModelStore, null, 1, null);
    }

    @Override // O4.j
    public boolean getPaused() {
        return this._state.getPaused();
    }

    @Override // x4.e
    public void onFocus(boolean z6) {
    }

    @Override // com.onesignal.user.internal.jwt.a
    public void onJwtUpdated(String externalId) {
        kotlin.jvm.internal.h.e(externalId, "externalId");
        String str = this.pendingJwtRetryExternalId;
        C4875b c4875b = this.pendingJwtRetryRywData;
        if (str == null || !str.equals(externalId) || c4875b == null) {
            return;
        }
        this.pendingJwtRetryExternalId = null;
        this.pendingJwtRetryRywData = null;
        com.onesignal.debug.internal.logging.b.info$default(D.x.l("InAppMessagesManager: JWT refreshed for ", externalId, ", retrying IAM fetch"), null, 2, null);
        com.onesignal.common.threading.c.suspendifyOnIO(new n(c4875b, null));
    }

    @Override // T4.a
    public void onMessageActionOccurredOnMessage(a message, c action) {
        kotlin.jvm.internal.h.e(message, "message");
        kotlin.jvm.internal.h.e(action, "action");
        com.onesignal.common.threading.c.suspendifyOnIO(new o(action, message, this, null));
    }

    @Override // T4.a
    public void onMessageActionOccurredOnPreview(a message, c action) {
        kotlin.jvm.internal.h.e(message, "message");
        kotlin.jvm.internal.h.e(action, "action");
        com.onesignal.common.threading.c.suspendifyOnIO(new p(action, message, this, null));
    }

    @Override // T4.a
    public void onMessagePageChanged(a message, com.onesignal.inAppMessages.internal.g page) {
        kotlin.jvm.internal.h.e(message, "message");
        kotlin.jvm.internal.h.e(page, "page");
        if (message.isPreview()) {
            return;
        }
        com.onesignal.common.threading.c.suspendifyOnIO(new q(message, page, null));
    }

    @Override // T4.a
    public void onMessageWasDismissed(a message) {
        kotlin.jvm.internal.h.e(message, "message");
        com.onesignal.common.threading.c.suspendifyOnIO(new r(message, null));
    }

    @Override // T4.a
    public void onMessageWasDisplayed(a message) {
        kotlin.jvm.internal.h.e(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new s(message));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWasDisplayed: inAppMessageLifecycleHandler is null", null, 2, null);
        }
        if (message.isPreview() || this.impressionedMessages.contains(message.getMessageId())) {
            return;
        }
        this.impressionedMessages.add(message.getMessageId());
        String variantIdForMessage = Q4.a.INSTANCE.variantIdForMessage(message, this._languageContext);
        if (variantIdForMessage == null) {
            return;
        }
        com.onesignal.common.threading.c.suspendifyOnIO(new t(variantIdForMessage, message, null));
    }

    @Override // T4.a
    public void onMessageWillDismiss(a message) {
        kotlin.jvm.internal.h.e(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new u(message));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWillDismiss: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // T4.a
    public void onMessageWillDisplay(a message) {
        kotlin.jvm.internal.h.e(message, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new v(message));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWillDisplay: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j args, String tag) {
        kotlin.jvm.internal.h.e(args, "args");
        kotlin.jvm.internal.h.e(tag, "tag");
        if (kotlin.jvm.internal.h.a(args.getProperty(), com.anythink.expressad.videocommon.e.b.f23194u)) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // O5.a
    public void onSessionActive() {
    }

    @Override // O5.a
    public void onSessionEnded(long j6) {
    }

    @Override // O5.a
    public void onSessionStarted() {
        Iterator<a> it = this.redisplayedInAppMessages.iterator();
        while (it.hasNext()) {
            it.next().setDisplayedInSession(false);
        }
        fetchMessagesWhenConditionIsMet();
    }

    @Override // Z5.a
    public void onSubscriptionAdded(b6.e subscription) {
        kotlin.jvm.internal.h.e(subscription, "subscription");
    }

    @Override // Z5.a
    public void onSubscriptionChanged(b6.e subscription, com.onesignal.common.modeling.j args) {
        kotlin.jvm.internal.h.e(subscription, "subscription");
        kotlin.jvm.internal.h.e(args, "args");
        if ((subscription instanceof InterfaceC0528b) && kotlin.jvm.internal.h.a(args.getPath(), "id")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // Z5.a
    public void onSubscriptionRemoved(b6.e subscription) {
        kotlin.jvm.internal.h.e(subscription, "subscription");
    }

    @Override // Z4.b
    public void onTriggerChanged(String newTriggerKey) {
        kotlin.jvm.internal.h.e(newTriggerKey, "newTriggerKey");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerChanged(newTriggerKey: " + newTriggerKey + ')', null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(Z2.d.n(newTriggerKey), true);
        com.onesignal.common.threading.c.suspendifyOnDefault(new w(null));
    }

    @Override // Z4.b
    public void onTriggerCompleted(String triggerId) {
        kotlin.jvm.internal.h.e(triggerId, "triggerId");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerCompleted: called with triggerId: ".concat(triggerId), null, 2, null);
        new HashSet().add(triggerId);
    }

    @Override // Z4.b
    public void onTriggerConditionChanged(String triggerId) {
        kotlin.jvm.internal.h.e(triggerId, "triggerId");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerConditionChanged()", null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(Z2.d.n(triggerId), false);
        com.onesignal.common.threading.c.suspendifyOnDefault(new x(null));
    }

    @Override // x4.e
    public void onUnfocused() {
    }

    @Override // O4.j
    /* renamed from: removeClickListener */
    public void mo25removeClickListener(O4.c listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeClickListener(listener: " + listener + ')', null, 2, null);
        this.messageClickCallback.unsubscribe(listener);
    }

    @Override // O4.j
    /* renamed from: removeLifecycleListener */
    public void mo26removeLifecycleListener(O4.g listener) {
        kotlin.jvm.internal.h.e(listener, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeLifecycleListener(listener: " + listener + ')', null, 2, null);
        this.lifecycleCallback.unsubscribe(listener);
    }

    @Override // O4.j
    /* renamed from: removeTrigger */
    public void mo27removeTrigger(String key) {
        kotlin.jvm.internal.h.e(key, "key");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeTrigger(key: " + key + ')', null, 2, null);
        synchronized (this.earlySessionTriggers) {
            if (!this.hasCompletedFirstFetch) {
                this.earlySessionTriggers.remove(key);
            }
        }
        com.onesignal.common.modeling.b.remove$default(this._triggerModelStore, key, null, 2, null);
    }

    @Override // O4.j
    /* renamed from: removeTriggers */
    public void mo28removeTriggers(Collection<String> keys) {
        kotlin.jvm.internal.h.e(keys, "keys");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeTriggers(keys: " + keys + ')', null, 2, null);
        Iterator<T> it = keys.iterator();
        while (it.hasNext()) {
            mo27removeTrigger((String) it.next());
        }
    }

    @Override // O4.j
    public void setPaused(boolean z6) {
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.setPaused(value: " + z6 + ')', null, 2, null);
        this._state.setPaused(z6);
        if (z6 && this._state.getInAppMessageIdShowing() != null) {
            com.onesignal.common.threading.c.suspendifyOnMain(new y(null));
        }
        if (z6) {
            return;
        }
        com.onesignal.common.threading.c.suspendifyOnDefault(new z(null));
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        Set<String> dismissedMessagesId = this._prefs.getDismissedMessagesId();
        if (dismissedMessagesId != null) {
            this.dismissedMessages.addAll(dismissedMessagesId);
        }
        Long lastTimeInAppDismissed = this._prefs.getLastTimeInAppDismissed();
        if (lastTimeInAppDismissed != null) {
            this._state.setLastTimeInAppDismissed(lastTimeInAppDismissed);
        }
        this._subscriptionManager.subscribe(this);
        this._configModelStore.subscribe((com.onesignal.common.modeling.g) this);
        this._lifecycle.subscribe(this);
        this._triggerController.subscribe(this);
        this._sessionService.subscribe(this);
        this._applicationService.addApplicationLifecycleHandler(this);
        this._identityModelStore.subscribe((com.onesignal.common.modeling.g) this.identityModelChangeHandler);
        this._jwtTokenStore.addInternalUpdateListener(this);
        com.onesignal.common.threading.c.suspendifyOnIO(new E(null));
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.b model, String tag) {
        kotlin.jvm.internal.h.e(model, "model");
        kotlin.jvm.internal.h.e(tag, "tag");
        fetchMessagesWhenConditionIsMet();
    }
}
