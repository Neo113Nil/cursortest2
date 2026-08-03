package com.onesignal.inAppMessages.internal;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import com.onesignal.common.AndroidUtils;
import com.onesignal.inAppMessages.internal.prompt.impl.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import yc.i0;
import yc.l1;
import yc.r1;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class k implements i9.j, d9.b, ob.a, com.onesignal.common.modeling.g, n9.a, t9.b, eb.a, q8.e {
    private final q8.f _applicationService;
    private final j9.b _backend;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final k8.c _consistencyManager;
    private final l9.a _displayer;
    private final jb.b _identityModelStore;
    private final ab.a _influenceManager;
    private final x8.a _languageContext;
    private final n9.b _lifecycle;
    private final cb.b _outcomeEventsController;
    private final o9.a _prefs;
    private final r9.a _repository;
    private final eb.b _sessionService;
    private final s9.a _state;
    private final ob.b _subscriptionManager;
    private final e9.a _time;
    private final t9.a _triggerController;
    private final t9.d _triggerModelStore;
    private final fb.a _userManager;
    private final Set<String> clickedClickIds;
    private final Set<String> dismissedMessages;
    private final gd.a fetchIAMMutex;
    private final j identityModelChangeHandler;
    private final Set<String> impressionedMessages;
    private Long lastTimeFetchedIAMs;
    private final com.onesignal.common.events.b lifecycleCallback;
    private final com.onesignal.common.events.b messageClickCallback;
    private final List<com.onesignal.inAppMessages.internal.a> messageDisplayQueue;
    private final gd.a messageDisplayQueueMutex;
    private List<com.onesignal.inAppMessages.internal.a> messages;
    private final List<com.onesignal.inAppMessages.internal.a> redisplayedInAppMessages;
    private final Set<String> viewedPageIds;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public a(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.attemptToShowInAppMessage(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a0 extends hc.j implements oc.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $inAppMessage;
        final /* synthetic */ List<com.onesignal.inAppMessages.internal.prompt.impl.b> $prompts;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a0(com.onesignal.inAppMessages.internal.a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, fc.d dVar) {
            super(1, dVar);
            this.$inAppMessage = aVar;
            this.$prompts = list;
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return k.this.new a0(this.$inAppMessage, this.$prompts, dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((a0) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                k kVar = k.this;
                com.onesignal.inAppMessages.internal.a aVar = this.$inAppMessage;
                List<com.onesignal.inAppMessages.internal.prompt.impl.b> list = this.$prompts;
                this.label = 1;
                Object showMultiplePrompts = kVar.showMultiplePrompts(aVar, list, this);
                gc.a aVar2 = gc.a.f2559g;
                if (showMultiplePrompts == aVar2) {
                    return aVar2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return ac.o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.evaluateInAppMessages(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b0 extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public b0(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.showMultiplePrompts(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public c(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fetchMessages(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c0 extends hc.j implements oc.c {
        Object L$0;
        int label;

        public c0(fc.d dVar) {
            super(1, dVar);
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return k.this.new c0(dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((c0) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        
            if (r5 == r3) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
        
            if (r5.cleanCachedInAppMessages(r4) == r3) goto L15;
         */
        @Override // hc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List list;
            int i10 = this.label;
            gc.a aVar = gc.a.f2559g;
            if (i10 == 0) {
                v6.a.W(obj);
                r9.a aVar2 = k.this._repository;
                this.label = 1;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.L$0;
                    v6.a.W(obj);
                    list.addAll((Collection) obj);
                    Iterator it = k.this.redisplayedInAppMessages.iterator();
                    while (it.hasNext()) {
                        ((com.onesignal.inAppMessages.internal.a) it.next()).setDisplayedInSession(false);
                    }
                    return ac.o.f277a;
                }
                v6.a.W(obj);
            }
            list = k.this.redisplayedInAppMessages;
            r9.a aVar3 = k.this._repository;
            this.L$0 = list;
            this.label = 2;
            obj = aVar3.listInAppMessages(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends pc.k implements oc.a {
        public d() {
            super(0);
        }

        @Override // oc.a
        public final Long invoke() {
            return Long.valueOf(k.this._time.getCurrentTimeMillis() - k.this._sessionService.getStartTime());
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends hc.j implements oc.c {
        int label;

        public e(fc.d dVar) {
            super(1, dVar);
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return k.this.new e(dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((e) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            if (r0.fetchMessages(r7, r6) == r4) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        
            return r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        
            if (r7 == r4) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        
            if (r7 == r4) goto L22;
         */
        @Override // hc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            gc.a aVar = gc.a.f2559g;
            if (i10 == 0) {
                v6.a.W(obj);
                String onesignalId = k.this._userManager.getOnesignalId();
                k8.c cVar = k.this._consistencyManager;
                i8.a aVar2 = new i8.a(onesignalId);
                this.label = 1;
                obj = cVar.getRywDataFromAwaitableCondition(aVar2, this);
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                        return ac.o.f277a;
                    }
                    v6.a.W(obj);
                    i8.b bVar = (i8.b) obj;
                    if (bVar != null) {
                        k kVar = k.this;
                        this.label = 3;
                    }
                    return ac.o.f277a;
                }
                v6.a.W(obj);
            }
            this.label = 2;
            obj = ((yc.m) ((yc.l) obj)).d0(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public f(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireOutcomesForClick(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class g extends hc.j implements oc.e {
        final /* synthetic */ com.onesignal.inAppMessages.internal.b $result;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.inAppMessages.internal.b bVar, fc.d dVar) {
            super(2, dVar);
            this.$result = bVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            g gVar = new g(this.$result, dVar);
            gVar.L$0 = obj;
            return gVar;
        }

        public final Object invoke(i9.c cVar, fc.d dVar) {
            return ((g) create(cVar, dVar)).invokeSuspend(ac.o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            throw v.f.c(this.L$0);
        }

        @Override // oc.e
        public /* synthetic */ Object invoke(Object obj, Object obj2) {
            if (obj == null) {
                return invoke((i9.c) null, (fc.d) obj2);
            }
            throw new ClassCastException();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class h extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public h(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireRESTCallForClick(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class i extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public i(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.fireRESTCallForPageChange(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class j implements com.onesignal.common.modeling.g {

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends hc.j implements oc.c {
            final /* synthetic */ String $newOneSignalId;
            int label;
            final /* synthetic */ k this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, String str, fc.d dVar) {
                super(1, dVar);
                this.this$0 = kVar;
                this.$newOneSignalId = str;
            }

            @Override // hc.a
            public final fc.d create(fc.d dVar) {
                return new a(this.this$0, this.$newOneSignalId, dVar);
            }

            @Override // oc.c
            public final Object invoke(fc.d dVar) {
                return ((a) create(dVar)).invokeSuspend(ac.o.f277a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
            
                if (r0.fetchMessages(r7, r6) == r4) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
            
                return r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
            
                if (r7 == r4) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
            
                if (r7 == r4) goto L22;
             */
            @Override // hc.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                int i10 = this.label;
                gc.a aVar = gc.a.f2559g;
                if (i10 == 0) {
                    v6.a.W(obj);
                    k8.c cVar = this.this$0._consistencyManager;
                    i8.a aVar2 = new i8.a(this.$newOneSignalId);
                    this.label = 1;
                    obj = cVar.getRywDataFromAwaitableCondition(aVar2, this);
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v6.a.W(obj);
                            return ac.o.f277a;
                        }
                        v6.a.W(obj);
                        i8.b bVar = (i8.b) obj;
                        if (bVar != null) {
                            k kVar = this.this$0;
                            this.label = 3;
                        }
                        return ac.o.f277a;
                    }
                    v6.a.W(obj);
                }
                this.label = 2;
                obj = ((yc.m) ((yc.l) obj)).d0(this);
            }
        }

        public j() {
        }

        @Override // com.onesignal.common.modeling.g
        public void onModelReplaced(jb.a aVar, String str) {
            pc.j.e(aVar, "model");
            pc.j.e(str, "tag");
        }

        @Override // com.onesignal.common.modeling.g
        public void onModelUpdated(com.onesignal.common.modeling.j jVar, String str) {
            pc.j.e(jVar, "args");
            pc.j.e(str, "tag");
            if (pc.j.a(jVar.getProperty(), "onesignal_id")) {
                Object oldValue = jVar.getOldValue();
                pc.j.c(oldValue, "null cannot be cast to non-null type kotlin.String");
                Object newValue = jVar.getNewValue();
                pc.j.c(newValue, "null cannot be cast to non-null type kotlin.String");
                String str2 = (String) newValue;
                com.onesignal.common.e eVar = com.onesignal.common.e.INSTANCE;
                if (!eVar.isLocalId((String) oldValue) || eVar.isLocalId(str2)) {
                    return;
                }
                com.onesignal.common.threading.b.suspendifyOnThread$default(0, new a(k.this, str2, null), 1, null);
            }
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.inAppMessages.internal.k$k, reason: collision with other inner class name */
    public static final class C0028k extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C0028k(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.messageWasDismissed(null, false, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class l extends pc.k implements oc.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // oc.c
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((i9.g) null);
            return ac.o.f277a;
        }

        public final void invoke(i9.g gVar) {
            pc.j.e(gVar, "it");
            new com.onesignal.inAppMessages.internal.e(this.$message);
            gVar.c();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class m extends hc.j implements oc.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(com.onesignal.inAppMessages.internal.c cVar, com.onesignal.inAppMessages.internal.a aVar, k kVar, fc.d dVar) {
            super(1, dVar);
            this.$action = cVar;
            this.$message = aVar;
            this.this$0 = kVar;
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return new m(this.$action, this.$message, this.this$0, dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((m) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
        
            if (r8.fireOutcomesForClick(r0, r2, r7) == r5) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
        
            return r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
        
            if (r8.fireRESTCallForClick(r0, r3, r7) == r5) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        
            if (r8.beginProcessingPrompts(r0, r4, r7) == r5) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        
            if (r8.firePublicClickHandler(r0, r6, r7) == r5) goto L25;
         */
        @Override // hc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            gc.a aVar = gc.a.f2559g;
            if (i10 == 0) {
                v6.a.W(obj);
                this.$action.setFirstClick(this.$message.takeActionAsUnique());
                k kVar = this.this$0;
                com.onesignal.inAppMessages.internal.a aVar2 = this.$message;
                com.onesignal.inAppMessages.internal.c cVar = this.$action;
                this.label = 1;
            } else if (i10 == 1) {
                v6.a.W(obj);
            } else if (i10 == 2) {
                v6.a.W(obj);
                this.this$0.fireClickAction(this.$action);
                k kVar2 = this.this$0;
                com.onesignal.inAppMessages.internal.a aVar3 = this.$message;
                com.onesignal.inAppMessages.internal.c cVar2 = this.$action;
                this.label = 3;
            } else {
                if (i10 != 3) {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return ac.o.f277a;
                }
                v6.a.W(obj);
                this.this$0.fireTagCallForClick(this.$action);
                k kVar3 = this.this$0;
                String messageId = this.$message.getMessageId();
                List<com.onesignal.inAppMessages.internal.f> outcomes = this.$action.getOutcomes();
                this.label = 4;
            }
            k kVar4 = this.this$0;
            com.onesignal.inAppMessages.internal.a aVar4 = this.$message;
            List<com.onesignal.inAppMessages.internal.prompt.impl.b> prompts = this.$action.getPrompts();
            this.label = 2;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class n extends hc.j implements oc.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.c $action;
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;
        int label;
        final /* synthetic */ k this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(com.onesignal.inAppMessages.internal.c cVar, com.onesignal.inAppMessages.internal.a aVar, k kVar, fc.d dVar) {
            super(1, dVar);
            this.$action = cVar;
            this.$message = aVar;
            this.this$0 = kVar;
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return new n(this.$action, this.$message, this.this$0, dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((n) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
        
            if (r6.beginProcessingPrompts(r0, r2, r5) == r3) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            if (r6.firePublicClickHandler(r0, r4, r5) == r3) goto L15;
         */
        @Override // hc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            gc.a aVar = gc.a.f2559g;
            if (i10 == 0) {
                v6.a.W(obj);
                this.$action.setFirstClick(this.$message.takeActionAsUnique());
                k kVar = this.this$0;
                com.onesignal.inAppMessages.internal.a aVar2 = this.$message;
                com.onesignal.inAppMessages.internal.c cVar = this.$action;
                this.label = 1;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    this.this$0.fireClickAction(this.$action);
                    this.this$0.logInAppMessagePreviewActions(this.$action);
                    return ac.o.f277a;
                }
                v6.a.W(obj);
            }
            k kVar2 = this.this$0;
            com.onesignal.inAppMessages.internal.a aVar3 = this.$message;
            List<com.onesignal.inAppMessages.internal.prompt.impl.b> prompts = this.$action.getPrompts();
            this.label = 2;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class o extends hc.j implements oc.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;
        final /* synthetic */ com.onesignal.inAppMessages.internal.g $page;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.g gVar, fc.d dVar) {
            super(1, dVar);
            this.$message = aVar;
            this.$page = gVar;
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return k.this.new o(this.$message, this.$page, dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((o) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                k kVar = k.this;
                com.onesignal.inAppMessages.internal.a aVar = this.$message;
                com.onesignal.inAppMessages.internal.g gVar = this.$page;
                this.label = 1;
                Object fireRESTCallForPageChange = kVar.fireRESTCallForPageChange(aVar, gVar, this);
                gc.a aVar2 = gc.a.f2559g;
                if (fireRESTCallForPageChange == aVar2) {
                    return aVar2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return ac.o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class p extends hc.j implements oc.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(com.onesignal.inAppMessages.internal.a aVar, fc.d dVar) {
            super(1, dVar);
            this.$message = aVar;
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return k.this.new p(this.$message, dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((p) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                k kVar = k.this;
                com.onesignal.inAppMessages.internal.a aVar = this.$message;
                this.label = 1;
                Object messageWasDismissed$default = k.messageWasDismissed$default(kVar, aVar, false, this, 2, null);
                gc.a aVar2 = gc.a.f2559g;
                if (messageWasDismissed$default == aVar2) {
                    return aVar2;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return ac.o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class q extends pc.k implements oc.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // oc.c
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((i9.g) null);
            return ac.o.f277a;
        }

        public final void invoke(i9.g gVar) {
            pc.j.e(gVar, "it");
            new com.onesignal.inAppMessages.internal.e(this.$message);
            gVar.d();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class r extends hc.j implements oc.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;
        final /* synthetic */ String $variantId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, com.onesignal.inAppMessages.internal.a aVar, fc.d dVar) {
            super(1, dVar);
            this.$variantId = str;
            this.$message = aVar;
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return k.this.new r(this.$variantId, this.$message, dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((r) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            r rVar;
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    v6.a.W(obj);
                    j9.b bVar = k.this._backend;
                    String appId = ((com.onesignal.core.internal.config.a) k.this._configModelStore.getModel()).getAppId();
                    String id2 = k.this._subscriptionManager.getSubscriptions().getPush().getId();
                    String str = this.$variantId;
                    String messageId = this.$message.getMessageId();
                    this.label = 1;
                    rVar = this;
                    try {
                        Object sendIAMImpression = bVar.sendIAMImpression(appId, id2, str, messageId, rVar);
                        gc.a aVar = gc.a.f2559g;
                        if (sendIAMImpression == aVar) {
                            return aVar;
                        }
                    } catch (l8.a unused) {
                        k.this.impressionedMessages.remove(rVar.$message.getMessageId());
                        return ac.o.f277a;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    rVar = this;
                }
                k.this._prefs.setImpressionesMessagesId(k.this.impressionedMessages);
            } catch (l8.a unused2) {
                rVar = this;
            }
            return ac.o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class s extends pc.k implements oc.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // oc.c
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((i9.g) null);
            return ac.o.f277a;
        }

        public final void invoke(i9.g gVar) {
            pc.j.e(gVar, "it");
            new com.onesignal.inAppMessages.internal.e(this.$message);
            gVar.b();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class t extends pc.k implements oc.c {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(com.onesignal.inAppMessages.internal.a aVar) {
            super(1);
            this.$message = aVar;
        }

        @Override // oc.c
        public /* synthetic */ Object invoke(Object obj) {
            if (obj != null) {
                throw new ClassCastException();
            }
            invoke((i9.g) null);
            return ac.o.f277a;
        }

        public final void invoke(i9.g gVar) {
            pc.j.e(gVar, "it");
            new com.onesignal.inAppMessages.internal.e(this.$message);
            gVar.a();
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class u extends hc.j implements oc.c {
        int label;

        public u(fc.d dVar) {
            super(1, dVar);
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return k.this.new u(dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((u) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                k kVar = k.this;
                this.label = 1;
                Object evaluateInAppMessages = kVar.evaluateInAppMessages(this);
                gc.a aVar = gc.a.f2559g;
                if (evaluateInAppMessages == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return ac.o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class v extends hc.j implements oc.c {
        int label;

        public v(fc.d dVar) {
            super(1, dVar);
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return k.this.new v(dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((v) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                k kVar = k.this;
                this.label = 1;
                Object evaluateInAppMessages = kVar.evaluateInAppMessages(this);
                gc.a aVar = gc.a.f2559g;
                if (evaluateInAppMessages == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return ac.o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class w extends hc.j implements oc.e {
        int label;

        public w(fc.d dVar) {
            super(2, dVar);
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return k.this.new w(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            k.this._displayer.dismissCurrentInAppMessage();
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(yc.y yVar, fc.d dVar) {
            return ((w) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class x extends hc.j implements oc.c {
        int label;

        public x(fc.d dVar) {
            super(1, dVar);
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return k.this.new x(dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((x) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                k kVar = k.this;
                this.label = 1;
                Object evaluateInAppMessages = kVar.evaluateInAppMessages(this);
                gc.a aVar = gc.a.f2559g;
                if (evaluateInAppMessages == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v6.a.W(obj);
            }
            return ac.o.f277a;
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class y extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public y(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.persistInAppMessage(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class z extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public z(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return k.this.queueMessageForDisplay(null, this);
        }
    }

    public k(q8.f fVar, eb.b bVar, ab.a aVar, com.onesignal.core.internal.config.b bVar2, fb.a aVar2, jb.b bVar3, ob.b bVar4, cb.b bVar5, s9.a aVar3, o9.a aVar4, r9.a aVar5, j9.b bVar6, t9.a aVar6, t9.d dVar, l9.a aVar7, n9.b bVar7, x8.a aVar8, e9.a aVar9, k8.c cVar) {
        pc.j.e(fVar, "_applicationService");
        pc.j.e(bVar, "_sessionService");
        pc.j.e(aVar, "_influenceManager");
        pc.j.e(bVar2, "_configModelStore");
        pc.j.e(aVar2, "_userManager");
        pc.j.e(bVar3, "_identityModelStore");
        pc.j.e(bVar4, "_subscriptionManager");
        pc.j.e(bVar5, "_outcomeEventsController");
        pc.j.e(aVar3, "_state");
        pc.j.e(aVar4, "_prefs");
        pc.j.e(aVar5, "_repository");
        pc.j.e(bVar6, "_backend");
        pc.j.e(aVar6, "_triggerController");
        pc.j.e(dVar, "_triggerModelStore");
        pc.j.e(aVar7, "_displayer");
        pc.j.e(bVar7, "_lifecycle");
        pc.j.e(aVar8, "_languageContext");
        pc.j.e(aVar9, "_time");
        pc.j.e(cVar, "_consistencyManager");
        this._applicationService = fVar;
        this._sessionService = bVar;
        this._influenceManager = aVar;
        this._configModelStore = bVar2;
        this._userManager = aVar2;
        this._identityModelStore = bVar3;
        this._subscriptionManager = bVar4;
        this._outcomeEventsController = bVar5;
        this._state = aVar3;
        this._prefs = aVar4;
        this._repository = aVar5;
        this._backend = bVar6;
        this._triggerController = aVar6;
        this._triggerModelStore = dVar;
        this._displayer = aVar7;
        this._lifecycle = bVar7;
        this._languageContext = aVar8;
        this._time = aVar9;
        this._consistencyManager = cVar;
        this.lifecycleCallback = new com.onesignal.common.events.b();
        this.messageClickCallback = new com.onesignal.common.events.b();
        this.messages = new ArrayList();
        this.dismissedMessages = new LinkedHashSet();
        this.impressionedMessages = new LinkedHashSet();
        this.viewedPageIds = new LinkedHashSet();
        this.clickedClickIds = new LinkedHashSet();
        this.messageDisplayQueue = new ArrayList();
        this.messageDisplayQueueMutex = new gd.d();
        this.redisplayedInAppMessages = new ArrayList();
        this.fetchIAMMutex = new gd.d();
        this.identityModelChangeHandler = new j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a1, code lost:
    
        if (r11.c(r1) == r10) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0164 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r2v8, types: [gd.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object attemptToShowInAppMessage(fc.d dVar) {
        a aVar;
        Object obj;
        int i10;
        k kVar;
        pc.s sVar;
        gd.d dVar2;
        pc.s sVar2;
        Boolean bool;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.label = i11 - Integer.MIN_VALUE;
                obj = aVar.result;
                i10 = aVar.label;
                ac.o oVar = ac.o.f277a;
                gc.a aVar2 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    q8.f fVar = this._applicationService;
                    aVar.L$0 = this;
                    aVar.label = 1;
                    obj = fVar.waitUntilSystemConditionsAvailable(aVar);
                    if (obj != aVar2) {
                        kVar = this;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                v6.a.W(obj);
                                return oVar;
                            }
                            if (i10 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v6.a.W(obj);
                            return oVar;
                        }
                        sVar2 = (pc.s) aVar.L$1;
                        kVar = (k) aVar.L$0;
                        v6.a.W(obj);
                        bool = (Boolean) obj;
                        if (bool != null) {
                            kVar._state.setInAppMessageIdShowing(null);
                            Object obj2 = sVar2.f5683g;
                            pc.j.b(obj2);
                            aVar.L$0 = null;
                            aVar.L$1 = null;
                            aVar.label = 4;
                            return kVar.queueMessageForDisplay((com.onesignal.inAppMessages.internal.a) obj2, aVar) == aVar2 ? aVar2 : oVar;
                        }
                        if (bool.equals(Boolean.FALSE)) {
                            kVar._state.setInAppMessageIdShowing(null);
                            pc.v.a(kVar.messages).remove(sVar2.f5683g);
                            Object obj3 = sVar2.f5683g;
                            pc.j.b(obj3);
                            aVar.L$0 = null;
                            aVar.L$1 = null;
                            aVar.label = 5;
                            if (kVar.messageWasDismissed((com.onesignal.inAppMessages.internal.a) obj3, true, aVar) == aVar2) {
                            }
                        }
                    }
                    ?? r22 = (gd.a) aVar.L$2;
                    pc.s sVar3 = (pc.s) aVar.L$1;
                    k kVar2 = (k) aVar.L$0;
                    v6.a.W(obj);
                    sVar = sVar3;
                    dVar2 = r22;
                    kVar = kVar2;
                    try {
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: " + kVar.messageDisplayQueue, null, 2, null);
                        if (kVar.getPaused()) {
                            com.onesignal.debug.internal.logging.b.warn$default("InAppMessagesManager.attemptToShowInAppMessage: In app messaging is currently paused, in app messages will not be shown!", null, 2, null);
                        } else if (kVar.messageDisplayQueue.isEmpty()) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There are no IAMs left in the queue!", null, 2, null);
                        } else if (kVar._state.getInAppMessageIdShowing() != null) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: There is an IAM currently showing!", null, 2, null);
                        } else {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.attemptToShowInAppMessage: No IAM showing currently, showing first item in the queue!", null, 2, null);
                            com.onesignal.inAppMessages.internal.a remove = kVar.messageDisplayQueue.remove(0);
                            sVar.f5683g = remove;
                            s9.a aVar3 = kVar._state;
                            pc.j.b(remove);
                            aVar3.setInAppMessageIdShowing(remove.getMessageId());
                        }
                        dVar2.d(null);
                        Object obj4 = sVar.f5683g;
                        if (obj4 != null) {
                            aVar.L$0 = kVar;
                            aVar.L$1 = sVar;
                            aVar.L$2 = null;
                            aVar.label = 3;
                            Object displayMessage = kVar._displayer.displayMessage((com.onesignal.inAppMessages.internal.a) obj4, aVar);
                            if (displayMessage != aVar2) {
                                sVar2 = sVar;
                                obj = displayMessage;
                                bool = (Boolean) obj;
                                if (bool != null) {
                                }
                            }
                        }
                    } catch (Throwable th) {
                        dVar2.d(null);
                        throw th;
                    }
                }
                kVar = (k) aVar.L$0;
                v6.a.W(obj);
                if (((Boolean) obj).booleanValue()) {
                    com.onesignal.debug.internal.logging.b.warn$default("InAppMessagesManager.attemptToShowInAppMessage: In app message not showing due to system condition not correct", null, 2, null);
                    return oVar;
                }
                sVar = new pc.s();
                gd.a aVar4 = kVar.messageDisplayQueueMutex;
                aVar.L$0 = kVar;
                aVar.L$1 = sVar;
                aVar.L$2 = aVar4;
                aVar.label = 2;
                dVar2 = (gd.d) aVar4;
            }
        }
        aVar = new a(dVar);
        obj = aVar.result;
        i10 = aVar.label;
        ac.o oVar2 = ac.o.f277a;
        gc.a aVar22 = gc.a.f2559g;
        if (i10 != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object beginProcessingPrompts(com.onesignal.inAppMessages.internal.a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, fc.d dVar) {
        boolean isEmpty = list.isEmpty();
        ac.o oVar = ac.o.f277a;
        if (!isEmpty) {
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.beginProcessingPrompts: IAM showing prompts from IAM: " + aVar, null, 2, null);
            this._displayer.dismissCurrentInAppMessage();
            Object showMultiplePrompts = showMultiplePrompts(aVar, list, dVar);
            if (showMultiplePrompts == gc.a.f2559g) {
                return showMultiplePrompts;
            }
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object evaluateInAppMessages(fc.d dVar) {
        b bVar;
        int i10;
        k kVar;
        Iterator it;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i11 = bVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.label = i11 - Integer.MIN_VALUE;
                Object obj = bVar.result;
                gc.a aVar = gc.a.f2559g;
                i10 = bVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.evaluateInAppMessages()", null, 2, null);
                    ArrayList arrayList = new ArrayList();
                    synchronized (this.messages) {
                        for (com.onesignal.inAppMessages.internal.a aVar2 : this.messages) {
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
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) bVar.L$1;
                    kVar = (k) bVar.L$0;
                    v6.a.W(obj);
                }
                while (it.hasNext()) {
                    com.onesignal.inAppMessages.internal.a aVar3 = (com.onesignal.inAppMessages.internal.a) it.next();
                    bVar.L$0 = kVar;
                    bVar.L$1 = it;
                    bVar.label = 1;
                    if (kVar.queueMessageForDisplay(aVar3, bVar) == aVar) {
                        return aVar;
                    }
                }
                return ac.o.f277a;
            }
        }
        bVar = new b(dVar);
        Object obj2 = bVar.result;
        gc.a aVar4 = gc.a.f2559g;
        i10 = bVar.label;
        if (i10 != 0) {
        }
        while (it.hasNext()) {
        }
        return ac.o.f277a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x010e, code lost:
    
        if (r0 != r12) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchMessages(i8.b bVar, fc.d dVar) {
        c cVar;
        c cVar2;
        Object obj;
        int i10;
        i8.b bVar2;
        String str;
        String str2;
        Object obj2;
        k kVar;
        long currentTimeMillis;
        Long l10;
        try {
            if (dVar instanceof c) {
                cVar = (c) dVar;
                int i11 = cVar.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    cVar.label = i11 - Integer.MIN_VALUE;
                    cVar2 = cVar;
                    obj = cVar2.result;
                    i10 = cVar2.label;
                    ac.o oVar = ac.o.f277a;
                    gc.a aVar = gc.a.f2559g;
                    if (i10 != 0) {
                        v6.a.W(obj);
                        if (this._applicationService.isInForeground()) {
                            String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
                            String id2 = this._subscriptionManager.getSubscriptions().getPush().getId();
                            if (id2.length() != 0 && !com.onesignal.common.e.INSTANCE.isLocalId(id2) && appId.length() != 0) {
                                gd.a aVar2 = this.fetchIAMMutex;
                                cVar2.L$0 = this;
                                bVar2 = bVar;
                                cVar2.L$1 = bVar2;
                                cVar2.L$2 = appId;
                                cVar2.L$3 = id2;
                                cVar2.L$4 = aVar2;
                                cVar2.label = 1;
                                gd.d dVar2 = (gd.d) aVar2;
                                if (dVar2.c(cVar2) != aVar) {
                                    str = id2;
                                    str2 = appId;
                                    obj2 = dVar2;
                                    kVar = this;
                                }
                                return aVar;
                            }
                        }
                        return oVar;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            v6.a.W(obj);
                            return oVar;
                        }
                        kVar = (k) cVar2.L$0;
                        v6.a.W(obj);
                        List<com.onesignal.inAppMessages.internal.a> list = (List) obj;
                        if (list != null) {
                            if ((list instanceof qc.a) && !(list instanceof qc.c)) {
                                pc.v.e(list, "kotlin.collections.MutableList");
                                throw null;
                            }
                            kVar.messages = list;
                            cVar2.L$0 = null;
                            cVar2.label = 3;
                            if (kVar.evaluateInAppMessages(cVar2) == aVar) {
                                return aVar;
                            }
                        }
                        return oVar;
                    }
                    Object obj3 = (gd.a) cVar2.L$4;
                    String str3 = (String) cVar2.L$3;
                    String str4 = (String) cVar2.L$2;
                    bVar2 = (i8.b) cVar2.L$1;
                    k kVar2 = (k) cVar2.L$0;
                    v6.a.W(obj);
                    str2 = str4;
                    str = str3;
                    obj2 = obj3;
                    kVar = kVar2;
                    currentTimeMillis = kVar._time.getCurrentTimeMillis();
                    l10 = kVar.lastTimeFetchedIAMs;
                    if (l10 == null && currentTimeMillis - l10.longValue() < ((com.onesignal.core.internal.config.a) kVar._configModelStore.getModel()).getFetchIAMMinInterval()) {
                        return oVar;
                    }
                    kVar.lastTimeFetchedIAMs = new Long(currentTimeMillis);
                    ((gd.d) obj2).d(null);
                    d dVar3 = kVar.new d();
                    j9.b bVar3 = kVar._backend;
                    cVar2.L$0 = kVar;
                    cVar2.L$1 = null;
                    cVar2.L$2 = null;
                    cVar2.L$3 = null;
                    cVar2.L$4 = null;
                    cVar2.label = 2;
                    obj = bVar3.listInAppMessages(str2, str, bVar2, dVar3, cVar2);
                }
            }
            currentTimeMillis = kVar._time.getCurrentTimeMillis();
            l10 = kVar.lastTimeFetchedIAMs;
            if (l10 == null) {
            }
            kVar.lastTimeFetchedIAMs = new Long(currentTimeMillis);
            ((gd.d) obj2).d(null);
            d dVar32 = kVar.new d();
            j9.b bVar32 = kVar._backend;
            cVar2.L$0 = kVar;
            cVar2.L$1 = null;
            cVar2.L$2 = null;
            cVar2.L$3 = null;
            cVar2.L$4 = null;
            cVar2.label = 2;
            obj = bVar32.listInAppMessages(str2, str, bVar2, dVar32, cVar2);
        } finally {
            ((gd.d) obj2).d(null);
        }
        cVar = new c(dVar);
        cVar2 = cVar;
        obj = cVar2.result;
        i10 = cVar2.label;
        ac.o oVar2 = ac.o.f277a;
        gc.a aVar3 = gc.a.f2559g;
        if (i10 != 0) {
        }
    }

    private final void fetchMessagesWhenConditionIsMet() {
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new e(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireClickAction(com.onesignal.inAppMessages.internal.c cVar) {
        if (cVar.getUrl() == null || cVar.getUrl().length() <= 0) {
            return;
        }
        if (cVar.getUrlTarget() == i9.k.BROWSER) {
            AndroidUtils.INSTANCE.openURLInBrowser(this._applicationService.getAppContext(), cVar.getUrl());
        } else if (cVar.getUrlTarget() == i9.k.IN_APP_WEBVIEW) {
            k9.b.INSTANCE.open$com_onesignal_inAppMessages(cVar.getUrl(), true, this._applicationService.getAppContext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireOutcomesForClick(String str, List<com.onesignal.inAppMessages.internal.f> list, fc.d dVar) {
        f fVar;
        int i10;
        Iterator<com.onesignal.inAppMessages.internal.f> it;
        k kVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i11 = fVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.label = i11 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                i10 = fVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    this._influenceManager.onDirectInfluenceFromIAM(str);
                    it = list.iterator();
                    kVar = this;
                } else {
                    if (i10 != 1 && i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) fVar.L$1;
                    kVar = (k) fVar.L$0;
                    v6.a.W(obj);
                }
                while (it.hasNext()) {
                    com.onesignal.inAppMessages.internal.f next = it.next();
                    String name = next.getName();
                    boolean isUnique = next.isUnique();
                    gc.a aVar = gc.a.f2559g;
                    if (isUnique) {
                        cb.b bVar = kVar._outcomeEventsController;
                        fVar.L$0 = kVar;
                        fVar.L$1 = it;
                        fVar.label = 1;
                        if (bVar.sendUniqueOutcomeEvent(name, fVar) == aVar) {
                            return aVar;
                        }
                    } else if (next.getWeight() > 0.0f) {
                        cb.b bVar2 = kVar._outcomeEventsController;
                        float weight = next.getWeight();
                        fVar.L$0 = kVar;
                        fVar.L$1 = it;
                        fVar.label = 2;
                        if (bVar2.sendOutcomeEventWithValue(name, weight, fVar) == aVar) {
                            return aVar;
                        }
                    } else {
                        cb.b bVar3 = kVar._outcomeEventsController;
                        fVar.L$0 = kVar;
                        fVar.L$1 = it;
                        fVar.label = 3;
                        if (bVar3.sendOutcomeEvent(name, fVar) == aVar) {
                            return aVar;
                        }
                    }
                }
                return ac.o.f277a;
            }
        }
        fVar = new f(dVar);
        Object obj2 = fVar.result;
        i10 = fVar.label;
        if (i10 != 0) {
        }
        while (it.hasNext()) {
        }
        return ac.o.f277a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object firePublicClickHandler(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar, fc.d dVar) {
        boolean hasSubscribers = this.messageClickCallback.getHasSubscribers();
        ac.o oVar = ac.o.f277a;
        if (!hasSubscribers) {
            return oVar;
        }
        this._influenceManager.onDirectInfluenceFromIAM(aVar.getMessageId());
        Object suspendingFireOnMain = this.messageClickCallback.suspendingFireOnMain(new g(new com.onesignal.inAppMessages.internal.b(aVar, cVar), null), dVar);
        return suspendingFireOnMain == gc.a.f2559g ? suspendingFireOnMain : oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(4:10|11|12|13)(2:27|28))(3:29|(2:31|(6:(1:37)|38|39|40|41|(1:43)(1:44)))|24)|14|15|16))|49|6|7|(0)(0)|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ce, code lost:
    
        r12.removeClickId(r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireRESTCallForClick(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar, fc.d dVar) {
        h hVar;
        int i10;
        String clickId;
        k kVar;
        com.onesignal.inAppMessages.internal.a aVar2;
        String str;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i11 = hVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.label = i11 - Integer.MIN_VALUE;
                h hVar2 = hVar;
                Object obj = hVar2.result;
                i10 = hVar2.label;
                ac.o oVar = ac.o.f277a;
                if (i10 != 0) {
                    v6.a.W(obj);
                    String variantIdForMessage = k9.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
                    if (variantIdForMessage != null) {
                        clickId = cVar.getClickId();
                        if ((aVar.getRedisplayStats().isRedisplayEnabled() && clickId != null && aVar.isClickAvailable(clickId)) || !bc.m.R(this.clickedClickIds, clickId)) {
                            if (clickId != null) {
                                this.clickedClickIds.add(clickId);
                                aVar.addClickId(clickId);
                            }
                            try {
                                j9.b bVar = this._backend;
                                String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
                                String id2 = this._subscriptionManager.getSubscriptions().getPush().getId();
                                String messageId = aVar.getMessageId();
                                boolean isFirstClick = cVar.isFirstClick();
                                hVar2.L$0 = this;
                                hVar2.L$1 = aVar;
                                hVar2.L$2 = clickId;
                                hVar2.label = 1;
                                Object sendIAMClick = bVar.sendIAMClick(appId, id2, variantIdForMessage, messageId, clickId, isFirstClick, hVar2);
                                gc.a aVar3 = gc.a.f2559g;
                                if (sendIAMClick == aVar3) {
                                    return aVar3;
                                }
                                kVar = this;
                            } catch (l8.a unused) {
                                kVar = this;
                                aVar2 = aVar;
                                str = clickId;
                                pc.v.a(kVar.clickedClickIds).remove(str);
                                if (str != null) {
                                }
                                return oVar;
                            }
                        }
                    }
                    return oVar;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) hVar2.L$2;
                aVar2 = (com.onesignal.inAppMessages.internal.a) hVar2.L$1;
                kVar = (k) hVar2.L$0;
                try {
                    v6.a.W(obj);
                    clickId = str;
                    aVar = aVar2;
                } catch (l8.a unused2) {
                    pc.v.a(kVar.clickedClickIds).remove(str);
                    if (str != null) {
                    }
                    return oVar;
                }
                kVar._prefs.setClickedMessagesId(kVar.clickedClickIds);
                return oVar;
            }
        }
        hVar = new h(dVar);
        h hVar22 = hVar;
        Object obj2 = hVar22.result;
        i10 = hVar22.label;
        ac.o oVar2 = ac.o.f277a;
        if (i10 != 0) {
        }
        kVar._prefs.setClickedMessagesId(kVar.clickedClickIds);
        return oVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fireRESTCallForPageChange(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.g gVar, fc.d dVar) {
        i iVar;
        int i10;
        String str;
        k kVar;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i11 = iVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.label = i11 - Integer.MIN_VALUE;
                i iVar2 = iVar;
                Object obj = iVar2.result;
                i10 = iVar2.label;
                ac.o oVar = ac.o.f277a;
                if (i10 != 0) {
                    v6.a.W(obj);
                    String variantIdForMessage = k9.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
                    if (variantIdForMessage == null) {
                        return oVar;
                    }
                    String pageId = gVar.getPageId();
                    String str2 = aVar.getMessageId() + pageId;
                    if (this.viewedPageIds.contains(str2)) {
                        com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager: Already sent page impression for id: " + pageId, null, 2, null);
                        return oVar;
                    }
                    this.viewedPageIds.add(str2);
                    try {
                        j9.b bVar = this._backend;
                        String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
                        String id2 = this._subscriptionManager.getSubscriptions().getPush().getId();
                        String messageId = aVar.getMessageId();
                        iVar2.L$0 = this;
                        iVar2.L$1 = str2;
                        iVar2.label = 1;
                        Object sendIAMPageImpression = bVar.sendIAMPageImpression(appId, id2, variantIdForMessage, messageId, pageId, iVar2);
                        gc.a aVar2 = gc.a.f2559g;
                        if (sendIAMPageImpression == aVar2) {
                            return aVar2;
                        }
                        str = str2;
                        kVar = this;
                    } catch (l8.a unused) {
                        str = str2;
                        kVar = this;
                        kVar.viewedPageIds.remove(str);
                        return oVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) iVar2.L$1;
                    kVar = (k) iVar2.L$0;
                    try {
                        v6.a.W(obj);
                    } catch (l8.a unused2) {
                        kVar.viewedPageIds.remove(str);
                        return oVar;
                    }
                }
                kVar._prefs.setViewPageImpressionedIds(kVar.viewedPageIds);
                return oVar;
            }
        }
        iVar = new i(dVar);
        i iVar22 = iVar;
        Object obj2 = iVar22.result;
        i10 = iVar22.label;
        ac.o oVar2 = ac.o.f277a;
        if (i10 != 0) {
        }
        kVar._prefs.setViewPageImpressionedIds(kVar.viewedPageIds);
        return oVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fireTagCallForClick(com.onesignal.inAppMessages.internal.c cVar) {
        if (cVar.getTags() != null) {
            com.onesignal.inAppMessages.internal.i tags = cVar.getTags();
            if ((tags != null ? tags.getTagsToAdd() : null) != null) {
                com.onesignal.common.g gVar = com.onesignal.common.g.INSTANCE;
                JSONObject tagsToAdd = tags.getTagsToAdd();
                pc.j.b(tagsToAdd);
                this._userManager.addTags(gVar.newStringMapFromJSONObject(tagsToAdd));
            }
            if ((tags != null ? tags.getTagsToRemove() : null) != null) {
                com.onesignal.common.g gVar2 = com.onesignal.common.g.INSTANCE;
                JSONArray tagsToRemove = tags != null ? tags.getTagsToRemove() : null;
                pc.j.b(tagsToRemove);
                this._userManager.removeTags(gVar2.newStringSetFromJSONArray(tagsToRemove));
            }
        }
    }

    private final boolean hasMessageTriggerChanged(com.onesignal.inAppMessages.internal.a aVar) {
        if (this._triggerController.messageHasOnlyDynamicTriggers(aVar)) {
            return !aVar.isDisplayedInSession();
        }
        return aVar.isTriggerChanged() || (!aVar.isDisplayedInSession() && aVar.getTriggers().isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logInAppMessagePreviewActions(com.onesignal.inAppMessages.internal.c cVar) {
        if (cVar.getTags() != null) {
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Tags detected inside of the action click payload, ignoring because action came from IAM preview:: " + cVar.getTags(), null, 2, null);
        }
        if (cVar.getOutcomes().size() > 0) {
            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.logInAppMessagePreviewActions: Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: " + cVar.getOutcomes(), null, 2, null);
        }
    }

    private final void makeRedisplayMessagesAvailableWithTriggers(Collection<String> collection, boolean z10) {
        synchronized (this.messages) {
            for (com.onesignal.inAppMessages.internal.a aVar : this.messages) {
                boolean contains = this.redisplayedInAppMessages.contains(aVar);
                boolean isTriggerOnMessage = this._triggerController.isTriggerOnMessage(aVar, collection);
                boolean messageHasOnlyDynamicTriggers = this._triggerController.messageHasOnlyDynamicTriggers(aVar);
                if (!aVar.isTriggerChanged() && contains && (isTriggerOnMessage || (z10 && messageHasOnlyDynamicTriggers))) {
                    com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.makeRedisplayMessagesAvailableWithTriggers: Trigger changed for message: " + aVar, null, 2, null);
                    aVar.setTriggerChanged(true);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        if (persistInAppMessage(r11, r0) == r7) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object messageWasDismissed(com.onesignal.inAppMessages.internal.a aVar, boolean z10, fc.d dVar) {
        C0028k c0028k;
        int i10;
        k kVar;
        if (dVar instanceof C0028k) {
            c0028k = (C0028k) dVar;
            int i11 = c0028k.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0028k.label = i11 - Integer.MIN_VALUE;
                Object obj = c0028k.result;
                i10 = c0028k.label;
                ac.o oVar = ac.o.f277a;
                gc.a aVar2 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    if (aVar.isPreview()) {
                        kVar = this;
                        kVar._influenceManager.onInAppMessageDismissed();
                        if (kVar._state.getCurrentPrompt() != null) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: Stop evaluateMessageDisplayQueue because prompt is currently displayed", null, 2, null);
                            return oVar;
                        }
                        if (kVar.lifecycleCallback.getHasSubscribers()) {
                            kVar.lifecycleCallback.fireOnMain(new l(aVar));
                        }
                        kVar._state.setInAppMessageIdShowing(null);
                        if (kVar.messageDisplayQueue.isEmpty()) {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: In app message dismissed evaluating messages", null, 2, null);
                            c0028k.L$0 = null;
                            c0028k.L$1 = null;
                            c0028k.label = 3;
                            if (kVar.evaluateInAppMessages(c0028k) != aVar2) {
                                return oVar;
                            }
                        } else {
                            com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: In app message on queue available, attempting to show", null, 2, null);
                            c0028k.L$0 = null;
                            c0028k.L$1 = null;
                            c0028k.label = 2;
                            if (kVar.attemptToShowInAppMessage(c0028k) != aVar2) {
                                return oVar;
                            }
                        }
                        return aVar2;
                    }
                    this.dismissedMessages.add(aVar.getMessageId());
                    if (!z10) {
                        this._prefs.setDismissedMessagesId(this.dismissedMessages);
                        this._state.setLastTimeInAppDismissed(new Long(this._time.getCurrentTimeMillis()));
                        c0028k.L$0 = this;
                        c0028k.L$1 = aVar;
                        c0028k.label = 1;
                    }
                    kVar = this;
                } else {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            v6.a.W(obj);
                            return oVar;
                        }
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                        return oVar;
                    }
                    aVar = (com.onesignal.inAppMessages.internal.a) c0028k.L$1;
                    kVar = (k) c0028k.L$0;
                    v6.a.W(obj);
                }
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: dismissedMessages: " + kVar.dismissedMessages, null, 2, null);
                kVar._influenceManager.onInAppMessageDismissed();
                if (kVar._state.getCurrentPrompt() != null) {
                }
            }
        }
        c0028k = new C0028k(dVar);
        Object obj2 = c0028k.result;
        i10 = c0028k.label;
        ac.o oVar2 = ac.o.f277a;
        gc.a aVar22 = gc.a.f2559g;
        if (i10 != 0) {
        }
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.messageWasDismissed: dismissedMessages: " + kVar.dismissedMessages, null, 2, null);
        kVar._influenceManager.onInAppMessageDismissed();
        if (kVar._state.getCurrentPrompt() != null) {
        }
    }

    public static /* synthetic */ Object messageWasDismissed$default(k kVar, com.onesignal.inAppMessages.internal.a aVar, boolean z10, fc.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return kVar.messageWasDismissed(aVar, z10, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object persistInAppMessage(com.onesignal.inAppMessages.internal.a aVar, fc.d dVar) {
        y yVar;
        int i10;
        k kVar;
        int indexOf;
        if (dVar instanceof y) {
            yVar = (y) dVar;
            int i11 = yVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                yVar.label = i11 - Integer.MIN_VALUE;
                Object obj = yVar.result;
                i10 = yVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    aVar.getRedisplayStats().setLastDisplayTime(this._time.getCurrentTimeMillis() / 1000);
                    aVar.getRedisplayStats().incrementDisplayQuantity();
                    aVar.setTriggerChanged(false);
                    aVar.setDisplayedInSession(true);
                    r9.a aVar2 = this._repository;
                    yVar.L$0 = this;
                    yVar.L$1 = aVar;
                    yVar.label = 1;
                    Object saveInAppMessage = aVar2.saveInAppMessage(aVar, yVar);
                    gc.a aVar3 = gc.a.f2559g;
                    if (saveInAppMessage == aVar3) {
                        return aVar3;
                    }
                    kVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (com.onesignal.inAppMessages.internal.a) yVar.L$1;
                    kVar = (k) yVar.L$0;
                    v6.a.W(obj);
                }
                kVar._prefs.setLastTimeInAppDismissed(kVar._state.getLastTimeInAppDismissed());
                indexOf = kVar.redisplayedInAppMessages.indexOf(aVar);
                if (indexOf == -1) {
                    kVar.redisplayedInAppMessages.set(indexOf, aVar);
                } else {
                    kVar.redisplayedInAppMessages.add(aVar);
                }
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.persistInAppMessage: " + aVar + " with msg array data: " + kVar.redisplayedInAppMessages, null, 2, null);
                return ac.o.f277a;
            }
        }
        yVar = new y(dVar);
        Object obj2 = yVar.result;
        i10 = yVar.label;
        if (i10 != 0) {
        }
        kVar._prefs.setLastTimeInAppDismissed(kVar._state.getLastTimeInAppDismissed());
        indexOf = kVar.redisplayedInAppMessages.indexOf(aVar);
        if (indexOf == -1) {
        }
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.persistInAppMessage: " + aVar + " with msg array data: " + kVar.redisplayedInAppMessages, null, 2, null);
        return ac.o.f277a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        if (r3.attemptToShowInAppMessage(r1) != r5) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v9, types: [gd.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object queueMessageForDisplay(com.onesignal.inAppMessages.internal.a aVar, fc.d dVar) {
        z zVar;
        int i10;
        gd.d dVar2;
        k kVar;
        try {
            if (dVar instanceof z) {
                zVar = (z) dVar;
                int i11 = zVar.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    zVar.label = i11 - Integer.MIN_VALUE;
                    Object obj = zVar.result;
                    i10 = zVar.label;
                    gc.a aVar2 = gc.a.f2559g;
                    if (i10 != 0) {
                        v6.a.W(obj);
                        gd.a aVar3 = this.messageDisplayQueueMutex;
                        zVar.L$0 = this;
                        zVar.L$1 = aVar;
                        zVar.L$2 = aVar3;
                        zVar.label = 1;
                        dVar2 = (gd.d) aVar3;
                        if (dVar2.c(zVar) != aVar2) {
                            kVar = this;
                        }
                        return aVar2;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                        return ac.o.f277a;
                    }
                    ?? r92 = (gd.a) zVar.L$2;
                    com.onesignal.inAppMessages.internal.a aVar4 = (com.onesignal.inAppMessages.internal.a) zVar.L$1;
                    kVar = (k) zVar.L$0;
                    v6.a.W(obj);
                    dVar2 = r92;
                    aVar = aVar4;
                    if (!kVar.messageDisplayQueue.contains(aVar) && !pc.j.a(kVar._state.getInAppMessageIdShowing(), aVar.getMessageId())) {
                        kVar.messageDisplayQueue.add(aVar);
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.queueMessageForDisplay: In app message with id: " + aVar.getMessageId() + ", added to the queue", null, 2, null);
                    }
                    dVar2.d(null);
                    zVar.L$0 = null;
                    zVar.L$1 = null;
                    zVar.L$2 = null;
                    zVar.label = 2;
                }
            }
            if (!kVar.messageDisplayQueue.contains(aVar)) {
                kVar.messageDisplayQueue.add(aVar);
                com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.queueMessageForDisplay: In app message with id: " + aVar.getMessageId() + ", added to the queue", null, 2, null);
            }
            dVar2.d(null);
            zVar.L$0 = null;
            zVar.L$1 = null;
            zVar.L$2 = null;
            zVar.label = 2;
        } catch (Throwable th) {
            dVar2.d(null);
            throw th;
        }
        zVar = new z(dVar);
        Object obj2 = zVar.result;
        i10 = zVar.label;
        gc.a aVar22 = gc.a.f2559g;
        if (i10 != 0) {
        }
    }

    private final void setDataForRedisplay(com.onesignal.inAppMessages.internal.a aVar) {
        boolean contains = this.dismissedMessages.contains(aVar.getMessageId());
        int indexOf = this.redisplayedInAppMessages.indexOf(aVar);
        if (!contains || indexOf == -1) {
            return;
        }
        com.onesignal.inAppMessages.internal.a aVar2 = this.redisplayedInAppMessages.get(indexOf);
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

    private final void showAlertDialogMessage(final com.onesignal.inAppMessages.internal.a aVar, final List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list) {
        String string = this._applicationService.getAppContext().getString(i9.l.location_permission_missing_title);
        pc.j.d(string, "_applicationService.appC…permission_missing_title)");
        String string2 = this._applicationService.getAppContext().getString(i9.l.location_permission_missing_message);
        pc.j.d(string2, "_applicationService.appC…rmission_missing_message)");
        new AlertDialog.Builder(this._applicationService.getCurrent()).setTitle(string).setMessage(string2).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.onesignal.inAppMessages.internal.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                k.m12showAlertDialogMessage$lambda7(k.this, aVar, list, dialogInterface, i10);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: showAlertDialogMessage$lambda-7, reason: not valid java name */
    public static final void m12showAlertDialogMessage$lambda7(k kVar, com.onesignal.inAppMessages.internal.a aVar, List list, DialogInterface dialogInterface, int i10) {
        pc.j.e(kVar, "this$0");
        pc.j.e(aVar, "$inAppMessage");
        pc.j.e(list, "$prompts");
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, kVar.new a0(aVar, list, null), 1, null);
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
    public final Object showMultiplePrompts(com.onesignal.inAppMessages.internal.a aVar, List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list, fc.d dVar) {
        b0 b0Var;
        k kVar;
        int i10;
        Iterator<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> it;
        b0 b0Var2;
        k kVar2;
        com.onesignal.inAppMessages.internal.a aVar2;
        List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list2;
        com.onesignal.inAppMessages.internal.a aVar3;
        k kVar3;
        if (dVar instanceof b0) {
            b0Var = (b0) dVar;
            int i11 = b0Var.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                b0Var.label = i11 - Integer.MIN_VALUE;
                kVar = this;
                Object obj = b0Var.result;
                i10 = b0Var.label;
                ac.o oVar = ac.o.f277a;
                gc.a aVar4 = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    it = list.iterator();
                    b0Var2 = b0Var;
                    kVar2 = kVar;
                    aVar2 = aVar;
                    list2 = list;
                    while (it.hasNext()) {
                    }
                    aVar3 = aVar2;
                    kVar3 = kVar2;
                    if (kVar3._state.getCurrentPrompt() == null) {
                    }
                    return oVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return oVar;
                }
                Iterator<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> it2 = (Iterator) b0Var.L$3;
                List<? extends com.onesignal.inAppMessages.internal.prompt.impl.b> list3 = (List) b0Var.L$2;
                com.onesignal.inAppMessages.internal.a aVar5 = (com.onesignal.inAppMessages.internal.a) b0Var.L$1;
                kVar2 = (k) b0Var.L$0;
                v6.a.W(obj);
                b0Var2 = b0Var;
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
                    return oVar;
                }
                aVar2 = aVar5;
                while (it.hasNext()) {
                    com.onesignal.inAppMessages.internal.prompt.impl.b next = it.next();
                    if (!next.hasPrompted()) {
                        kVar2._state.setCurrentPrompt(next);
                        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.showMultiplePrompts: IAM prompt to handle: " + kVar2._state.getCurrentPrompt(), null, 2, null);
                        com.onesignal.inAppMessages.internal.prompt.impl.b currentPrompt = kVar2._state.getCurrentPrompt();
                        pc.j.b(currentPrompt);
                        currentPrompt.setPrompted(true);
                        com.onesignal.inAppMessages.internal.prompt.impl.b currentPrompt2 = kVar2._state.getCurrentPrompt();
                        pc.j.b(currentPrompt2);
                        b0Var2.L$0 = kVar2;
                        b0Var2.L$1 = aVar2;
                        b0Var2.L$2 = list2;
                        b0Var2.L$3 = it;
                        b0Var2.label = 1;
                        Object handlePrompt = currentPrompt2.handlePrompt(b0Var2);
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
                    b0Var2.L$0 = null;
                    b0Var2.L$1 = null;
                    b0Var2.L$2 = null;
                    b0Var2.L$3 = null;
                    b0Var2.label = 2;
                    if (messageWasDismissed$default(kVar3, aVar3, false, b0Var2, 2, null) == aVar4) {
                        return aVar4;
                    }
                }
                return oVar;
            }
        }
        kVar = this;
        b0Var = kVar.new b0(dVar);
        Object obj2 = b0Var.result;
        i10 = b0Var.label;
        ac.o oVar2 = ac.o.f277a;
        gc.a aVar42 = gc.a.f2559g;
        if (i10 != 0) {
        }
    }

    @Override // i9.j
    /* renamed from: addClickListener */
    public void mo13addClickListener(i9.c cVar) {
        pc.j.e(cVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addClickListener(listener: " + cVar + ')', null, 2, null);
        this.messageClickCallback.subscribe(cVar);
    }

    @Override // i9.j
    /* renamed from: addLifecycleListener */
    public void mo14addLifecycleListener(i9.g gVar) {
        pc.j.e(gVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addLifecycleListener(listener: " + gVar + ')', null, 2, null);
        this.lifecycleCallback.subscribe(gVar);
    }

    @Override // i9.j
    /* renamed from: addTrigger */
    public void mo15addTrigger(String str, String str2) {
        pc.j.e(str, "key");
        pc.j.e(str2, "value");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addTrigger(key: " + str + ", value: " + str2 + ')', null, 2, null);
        t9.c cVar = (t9.c) this._triggerModelStore.get(str);
        if (cVar != null) {
            cVar.setValue(str2);
            return;
        }
        t9.c cVar2 = new t9.c();
        cVar2.setId(str);
        cVar2.setKey(str);
        cVar2.setValue(str2);
        com.onesignal.common.modeling.b.add$default(this._triggerModelStore, cVar2, null, 2, null);
    }

    @Override // i9.j
    /* renamed from: addTriggers */
    public void mo16addTriggers(Map<String, String> map) {
        pc.j.e(map, "triggers");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.addTriggers(triggers: " + map + ')', null, 2, null);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            mo15addTrigger(entry.getKey(), entry.getValue());
        }
    }

    @Override // i9.j
    /* renamed from: clearTriggers */
    public void mo17clearTriggers() {
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.clearTriggers()", null, 2, null);
        com.onesignal.common.modeling.b.clear$default(this._triggerModelStore, null, 1, null);
    }

    @Override // i9.j
    public boolean getPaused() {
        return this._state.getPaused();
    }

    @Override // n9.a
    public void onMessageActionOccurredOnMessage(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
        pc.j.e(aVar, "message");
        pc.j.e(cVar, "action");
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new m(cVar, aVar, this, null), 1, null);
    }

    @Override // n9.a
    public void onMessageActionOccurredOnPreview(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.c cVar) {
        pc.j.e(aVar, "message");
        pc.j.e(cVar, "action");
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new n(cVar, aVar, this, null), 1, null);
    }

    @Override // n9.a
    public void onMessagePageChanged(com.onesignal.inAppMessages.internal.a aVar, com.onesignal.inAppMessages.internal.g gVar) {
        pc.j.e(aVar, "message");
        pc.j.e(gVar, "page");
        if (aVar.isPreview()) {
            return;
        }
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new o(aVar, gVar, null), 1, null);
    }

    @Override // n9.a
    public void onMessageWasDismissed(com.onesignal.inAppMessages.internal.a aVar) {
        pc.j.e(aVar, "message");
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new p(aVar, null), 1, null);
    }

    @Override // n9.a
    public void onMessageWasDisplayed(com.onesignal.inAppMessages.internal.a aVar) {
        pc.j.e(aVar, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new q(aVar));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWasDisplayed: inAppMessageLifecycleHandler is null", null, 2, null);
        }
        if (aVar.isPreview() || this.impressionedMessages.contains(aVar.getMessageId())) {
            return;
        }
        this.impressionedMessages.add(aVar.getMessageId());
        String variantIdForMessage = k9.a.INSTANCE.variantIdForMessage(aVar, this._languageContext);
        if (variantIdForMessage == null) {
            return;
        }
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new r(variantIdForMessage, aVar, null), 1, null);
    }

    @Override // n9.a
    public void onMessageWillDismiss(com.onesignal.inAppMessages.internal.a aVar) {
        pc.j.e(aVar, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new s(aVar));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWillDismiss: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // n9.a
    public void onMessageWillDisplay(com.onesignal.inAppMessages.internal.a aVar) {
        pc.j.e(aVar, "message");
        if (this.lifecycleCallback.getHasSubscribers()) {
            this.lifecycleCallback.fireOnMain(new t(aVar));
        } else {
            com.onesignal.debug.internal.logging.b.verbose$default("InAppMessagesManager.onMessageWillDisplay: inAppMessageLifecycleHandler is null", null, 2, null);
        }
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(com.onesignal.common.modeling.j jVar, String str) {
        pc.j.e(jVar, "args");
        pc.j.e(str, "tag");
        if (pc.j.a(jVar.getProperty(), "appId")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // eb.a
    public void onSessionStarted() {
        Iterator<com.onesignal.inAppMessages.internal.a> it = this.redisplayedInAppMessages.iterator();
        while (it.hasNext()) {
            it.next().setDisplayedInSession(false);
        }
        fetchMessagesWhenConditionIsMet();
    }

    @Override // ob.a
    public void onSubscriptionAdded(qb.e eVar) {
        pc.j.e(eVar, "subscription");
    }

    @Override // ob.a
    public void onSubscriptionChanged(qb.e eVar, com.onesignal.common.modeling.j jVar) {
        pc.j.e(eVar, "subscription");
        pc.j.e(jVar, "args");
        if ((eVar instanceof qb.b) && pc.j.a(jVar.getPath(), "id")) {
            fetchMessagesWhenConditionIsMet();
        }
    }

    @Override // ob.a
    public void onSubscriptionRemoved(qb.e eVar) {
        pc.j.e(eVar, "subscription");
    }

    @Override // t9.b
    public void onTriggerChanged(String str) {
        pc.j.e(str, "newTriggerKey");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerChanged(newTriggerKey: " + str + ')', null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(i7.b.z(str), true);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new u(null), 1, null);
    }

    @Override // t9.b
    public void onTriggerCompleted(String str) {
        pc.j.e(str, "triggerId");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerCompleted: called with triggerId: ".concat(str), null, 2, null);
        new HashSet().add(str);
    }

    @Override // t9.b
    public void onTriggerConditionChanged(String str) {
        pc.j.e(str, "triggerId");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.onTriggerConditionChanged()", null, 2, null);
        makeRedisplayMessagesAvailableWithTriggers(i7.b.z(str), false);
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new v(null), 1, null);
    }

    @Override // i9.j
    /* renamed from: removeClickListener */
    public void mo18removeClickListener(i9.c cVar) {
        pc.j.e(cVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeClickListener(listener: " + cVar + ')', null, 2, null);
        this.messageClickCallback.unsubscribe(cVar);
    }

    @Override // i9.j
    /* renamed from: removeLifecycleListener */
    public void mo19removeLifecycleListener(i9.g gVar) {
        pc.j.e(gVar, "listener");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeLifecycleListener(listener: " + gVar + ')', null, 2, null);
        this.lifecycleCallback.unsubscribe(gVar);
    }

    @Override // i9.j
    /* renamed from: removeTrigger */
    public void mo20removeTrigger(String str) {
        pc.j.e(str, "key");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeTrigger(key: " + str + ')', null, 2, null);
        com.onesignal.common.modeling.b.remove$default(this._triggerModelStore, str, null, 2, null);
    }

    @Override // i9.j
    /* renamed from: removeTriggers */
    public void mo21removeTriggers(Collection<String> collection) {
        pc.j.e(collection, "keys");
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.removeTriggers(keys: " + collection + ')', null, 2, null);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            mo20removeTrigger((String) it.next());
        }
    }

    @Override // i9.j
    public void setPaused(boolean z10) {
        com.onesignal.debug.internal.logging.b.debug$default("InAppMessagesManager.setPaused(value: " + z10 + ')', null, 2, null);
        this._state.setPaused(z10);
        if (z10 && this._state.getInAppMessageIdShowing() != null) {
            fd.e eVar = i0.f8859a;
            fc.i iVar = dd.o.f1880a;
            w wVar = new w(null);
            int i10 = 2 & 1;
            fc.i iVar2 = fc.j.f2348g;
            if (i10 != 0) {
                iVar = iVar2;
            }
            yc.z zVar = (2 & 2) != 0 ? yc.z.f8921g : yc.z.f8924j;
            fc.i h10 = yc.a0.h(iVar2, iVar, true);
            fd.e eVar2 = i0.f8859a;
            if (h10 != eVar2 && h10.v(fc.e.f2347g) == null) {
                h10 = h10.d(eVar2);
            }
            yc.a l1Var = zVar == yc.z.f8922h ? new l1(h10, wVar) : new r1(h10, true);
            l1Var.f0(zVar, l1Var, wVar);
        }
        if (z10) {
            return;
        }
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new x(null), 1, null);
    }

    @Override // d9.b
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
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new c0(null), 1, null);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.a aVar, String str) {
        pc.j.e(aVar, "model");
        pc.j.e(str, "tag");
        fetchMessagesWhenConditionIsMet();
    }

    @Override // eb.a
    public void onSessionActive() {
    }

    @Override // q8.e
    public void onUnfocused() {
    }

    @Override // q8.e
    public void onFocus(boolean z10) {
    }

    @Override // eb.a
    public void onSessionEnded(long j3) {
    }
}
