package com.onesignal.session.internal.outcomes.impl;

import com.google.android.gms.internal.ads.Wv;
import com.onesignal.common.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import t4.C5041a;
import u7.v;
import v7.AbstractC5119j;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class i implements M5.b, com.onesignal.core.internal.startup.b, O5.a {
    private final com.onesignal.core.internal.config.c _configModelStore;
    private final C4.c _deviceService;
    private final U5.b _identityModelStore;
    private final K5.a _influenceManager;
    private final com.onesignal.session.internal.outcomes.impl.b _outcomeEventsBackend;
    private final com.onesignal.session.internal.outcomes.impl.d _outcomeEventsCache;
    private final com.onesignal.session.internal.outcomes.impl.c _outcomeEventsPreferences;
    private final O5.b _session;
    private final Z5.b _subscriptionManager;
    private final K4.a _time;
    private Set<String> unattributedUniqueOutcomeEventsSentOnSession;

    public static final class a extends B7.c {
        int label;
        /* synthetic */ Object result;

        public a(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.getUniqueIds(null, null, this);
        }
    }

    public static final class b extends B7.h implements I7.l {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
            this.$eventParams = fVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return i.this.new b(this.$eventParams, interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                com.onesignal.session.internal.outcomes.impl.d dVar = i.this._outcomeEventsCache;
                com.onesignal.session.internal.outcomes.impl.f fVar = this.$eventParams;
                this.label = 1;
                if (dVar.saveUniqueOutcomeEventParams(fVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Q3.b.s(obj);
            }
            return v.f41073a;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((b) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public static final class c extends B7.c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendAndCreateOutcomeEvent(null, 0.0f, 0L, null, this);
        }
    }

    public static final class d extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendSavedOutcomeEvent(null, this);
        }
    }

    public static final class e extends B7.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public e(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendSavedOutcomes(this);
        }
    }

    public static final class f extends B7.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public f(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendUniqueOutcomeEvent(null, null, this);
        }
    }

    public static final class g extends B7.h implements I7.l {
        int label;

        public g(InterfaceC5240d interfaceC5240d) {
            super(1, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(InterfaceC5240d interfaceC5240d) {
            return i.this.new g(interfaceC5240d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (r5.cleanCachedUniqueOutcomeEventNotifications(r4) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        
            if (r5.sendSavedOutcomes(r4) == r0) goto L15;
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
                i iVar = i.this;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                    return v.f41073a;
                }
                Q3.b.s(obj);
            }
            com.onesignal.session.internal.outcomes.impl.d dVar = i.this._outcomeEventsCache;
            this.label = 2;
        }

        @Override // I7.l
        public final Object invoke(InterfaceC5240d interfaceC5240d) {
            return ((g) create(interfaceC5240d)).invokeSuspend(v.f41073a);
        }
    }

    public i(O5.b _session, K5.a _influenceManager, com.onesignal.session.internal.outcomes.impl.d _outcomeEventsCache, com.onesignal.session.internal.outcomes.impl.c _outcomeEventsPreferences, com.onesignal.session.internal.outcomes.impl.b _outcomeEventsBackend, com.onesignal.core.internal.config.c _configModelStore, U5.b _identityModelStore, Z5.b _subscriptionManager, C4.c _deviceService, K4.a _time) {
        kotlin.jvm.internal.h.e(_session, "_session");
        kotlin.jvm.internal.h.e(_influenceManager, "_influenceManager");
        kotlin.jvm.internal.h.e(_outcomeEventsCache, "_outcomeEventsCache");
        kotlin.jvm.internal.h.e(_outcomeEventsPreferences, "_outcomeEventsPreferences");
        kotlin.jvm.internal.h.e(_outcomeEventsBackend, "_outcomeEventsBackend");
        kotlin.jvm.internal.h.e(_configModelStore, "_configModelStore");
        kotlin.jvm.internal.h.e(_identityModelStore, "_identityModelStore");
        kotlin.jvm.internal.h.e(_subscriptionManager, "_subscriptionManager");
        kotlin.jvm.internal.h.e(_deviceService, "_deviceService");
        kotlin.jvm.internal.h.e(_time, "_time");
        this._session = _session;
        this._influenceManager = _influenceManager;
        this._outcomeEventsCache = _outcomeEventsCache;
        this._outcomeEventsPreferences = _outcomeEventsPreferences;
        this._outcomeEventsBackend = _outcomeEventsBackend;
        this._configModelStore = _configModelStore;
        this._identityModelStore = _identityModelStore;
        this._subscriptionManager = _subscriptionManager;
        this._deviceService = _deviceService;
        this._time = _time;
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        Set<String> unattributedUniqueOutcomeEventsSentByChannel = _outcomeEventsPreferences.getUnattributedUniqueOutcomeEventsSentByChannel();
        this.unattributedUniqueOutcomeEventsSentOnSession = unattributedUniqueOutcomeEventsSentByChannel != null ? AbstractC5119j.M(unattributedUniqueOutcomeEventsSentByChannel) : new LinkedHashSet<>();
        _session.subscribe(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUniqueIds(String str, List<K5.b> list, InterfaceC5240d interfaceC5240d) {
        a aVar;
        int i;
        List list2;
        if (interfaceC5240d instanceof a) {
            aVar = (a) interfaceC5240d;
            int i4 = aVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.label = i4 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                A7.a aVar2 = A7.a.f215n;
                i = aVar.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    com.onesignal.session.internal.outcomes.impl.d dVar = this._outcomeEventsCache;
                    aVar.label = 1;
                    obj = dVar.getNotCachedUniqueInfluencesForOutcome(str, list, aVar);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                }
                list2 = (List) obj;
                if (list2.isEmpty()) {
                    return list2;
                }
                return null;
            }
        }
        aVar = new a(interfaceC5240d);
        Object obj2 = aVar.result;
        A7.a aVar22 = A7.a.f215n;
        i = aVar.label;
        if (i != 0) {
        }
        list2 = (List) obj2;
        if (list2.isEmpty()) {
        }
    }

    private final List<K5.b> removeDisabledInfluences(List<K5.b> list) {
        ArrayList K7 = AbstractC5119j.K(list);
        for (K5.b bVar : list) {
            if (bVar.getInfluenceType().isDisabled()) {
                com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.removeDisabledInfluences: Outcomes disabled for channel: " + bVar.getInfluenceChannel(), null, 2, null);
                K7.remove(bVar);
            }
        }
        return K7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestMeasureOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC5240d interfaceC5240d) {
        String appId = ((com.onesignal.core.internal.config.b) this._configModelStore.getModel()).getAppId();
        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
        String value = Q5.j.Companion.fromDeviceType(this._deviceService.getDeviceType()).getValue();
        if (id.length() == 0 || value.length() == 0) {
            throw new C5041a(0, null, null, 6, null);
        }
        com.onesignal.session.internal.outcomes.impl.e fromOutcomeEventParamstoOutcomeEvent = com.onesignal.session.internal.outcomes.impl.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
        int i = h.$EnumSwitchMapping$0[fromOutcomeEventParamstoOutcomeEvent.getSession().ordinal()];
        Object sendOutcomeEvent = this._outcomeEventsBackend.sendOutcomeEvent(appId, ((U5.a) this._identityModelStore.getModel()).getOnesignalId(), id, value, i != 1 ? i != 2 ? null : Boolean.FALSE : Boolean.TRUE, fromOutcomeEventParamstoOutcomeEvent, interfaceC5240d);
        return sendOutcomeEvent == A7.a.f215n ? sendOutcomeEvent : v.f41073a;
    }

    private final void saveAttributedUniqueOutcomeNotifications(com.onesignal.session.internal.outcomes.impl.f fVar) {
        com.onesignal.common.threading.c.suspendifyOnIO(new b(fVar, null));
    }

    private final void saveUnattributedUniqueOutcomeEvents() {
        this._outcomeEventsPreferences.setUnattributedUniqueOutcomeEventsSentByChannel(this.unattributedUniqueOutcomeEventsSentOnSession);
    }

    private final void saveUniqueOutcome(com.onesignal.session.internal.outcomes.impl.f fVar) {
        if (fVar.isUnattributed()) {
            saveUnattributedUniqueOutcomeEvents();
        } else {
            saveAttributedUniqueOutcomeNotifications(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x017c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendAndCreateOutcomeEvent(String str, float f2, long j6, List<K5.b> list, InterfaceC5240d interfaceC5240d) {
        c cVar;
        int i;
        String str2;
        long j9;
        com.onesignal.session.internal.outcomes.impl.f fVar;
        i iVar;
        String str3;
        g.a responseStatusType;
        if (interfaceC5240d instanceof c) {
            cVar = (c) interfaceC5240d;
            int i4 = cVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cVar.label = i4 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                A7.a aVar = A7.a.f215n;
                i = cVar.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
                    boolean z6 = false;
                    n nVar = null;
                    n nVar2 = null;
                    for (K5.b bVar : list) {
                        int i6 = h.$EnumSwitchMapping$0[bVar.getInfluenceType().ordinal()];
                        if (i6 == 1) {
                            if (nVar == null) {
                                nVar = new n(null, null, 3, null);
                            }
                            nVar = setSourceChannelIds(bVar, nVar);
                        } else if (i6 == 2) {
                            if (nVar2 == null) {
                                nVar2 = new n(null, null, 3, null);
                            }
                            nVar2 = setSourceChannelIds(bVar, nVar2);
                        } else if (i6 == 3) {
                            z6 = true;
                        } else if (i6 == 4) {
                            com.onesignal.debug.internal.logging.b.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for channel: " + bVar.getInfluenceChannel(), null, 2, null);
                        }
                    }
                    if (nVar == null && nVar2 == null && !z6) {
                        com.onesignal.debug.internal.logging.b.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for all channels", null, 2, null);
                        return null;
                    }
                    com.onesignal.session.internal.outcomes.impl.f fVar2 = new com.onesignal.session.internal.outcomes.impl.f(str, new m(nVar, nVar2), f2, j6, 0L);
                    try {
                        cVar.L$0 = this;
                        str2 = str;
                        try {
                            cVar.L$1 = str2;
                            cVar.L$2 = fVar2;
                            cVar.J$0 = currentTimeMillis;
                            cVar.label = 1;
                            if (requestMeasureOutcomeEvent(fVar2, cVar) != aVar) {
                                j9 = currentTimeMillis;
                                fVar = fVar2;
                                str3 = str2;
                                iVar = this;
                            }
                        } catch (C5041a e9) {
                            e = e9;
                            j9 = currentTimeMillis;
                            fVar = fVar2;
                            iVar = this;
                            responseStatusType = com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode());
                            StringBuilder l9 = Wv.l("OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: ", str2, " failed with status code: ");
                            l9.append(e.getStatusCode());
                            l9.append(" and response: ");
                            l9.append(e.getResponse());
                            String sb = l9.toString();
                            if (responseStatusType != g.a.RETRYABLE) {
                                com.onesignal.debug.internal.logging.b.info$default(sb + " Outcome event was cached and will be reattempted on app cold start", null, 2, null);
                                fVar.setTimestamp(j9);
                                com.onesignal.session.internal.outcomes.impl.d dVar = iVar._outcomeEventsCache;
                                cVar.L$0 = null;
                                cVar.L$1 = null;
                                cVar.L$2 = null;
                                cVar.label = 2;
                                if (dVar.saveOutcomeEvent(fVar, cVar) == aVar) {
                                    return aVar;
                                }
                                return null;
                            }
                            com.onesignal.debug.internal.logging.b.warn$default(sb + " Outcome event will be omitted!", null, 2, null);
                            com.onesignal.session.internal.outcomes.impl.d dVar2 = iVar._outcomeEventsCache;
                            cVar.L$0 = null;
                            cVar.L$1 = null;
                            cVar.L$2 = null;
                            cVar.label = 3;
                            if (dVar2.deleteOldOutcomeEvent(fVar, cVar) == aVar) {
                            }
                        }
                    } catch (C5041a e10) {
                        e = e10;
                        str2 = str;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2 && i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                    return null;
                }
                j9 = cVar.J$0;
                fVar = (com.onesignal.session.internal.outcomes.impl.f) cVar.L$2;
                str3 = (String) cVar.L$1;
                iVar = (i) cVar.L$0;
                try {
                    Q3.b.s(obj);
                } catch (C5041a e11) {
                    e = e11;
                    str2 = str3;
                    responseStatusType = com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode());
                    StringBuilder l92 = Wv.l("OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: ", str2, " failed with status code: ");
                    l92.append(e.getStatusCode());
                    l92.append(" and response: ");
                    l92.append(e.getResponse());
                    String sb2 = l92.toString();
                    if (responseStatusType != g.a.RETRYABLE) {
                    }
                }
                iVar.saveUniqueOutcome(fVar);
                return com.onesignal.session.internal.outcomes.impl.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
            }
        }
        cVar = new c(interfaceC5240d);
        Object obj2 = cVar.result;
        A7.a aVar2 = A7.a.f215n;
        i = cVar.label;
        if (i != 0) {
        }
        iVar.saveUniqueOutcome(fVar);
        return com.onesignal.session.internal.outcomes.impl.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(3:(1:(1:12)(2:16|17))(2:18|19)|13|14)(2:20|21))(5:25|26|27|(1:29)|24)|22))|39|6|7|(0)(0)|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r10.deleteOldOutcomeEvent(r9, r0) != r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        if (r10.deleteOldOutcomeEvent(r9, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0043, code lost:
    
        r10 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSavedOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC5240d interfaceC5240d) {
        d dVar;
        i iVar;
        i iVar2;
        if (interfaceC5240d instanceof d) {
            dVar = (d) interfaceC5240d;
            int i = dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.label = i - Integer.MIN_VALUE;
                Object obj = dVar.result;
                A7.a aVar = A7.a.f215n;
                iVar = dVar.label;
                if (iVar != 0) {
                    Q3.b.s(obj);
                    try {
                        dVar.L$0 = this;
                        dVar.L$1 = fVar;
                        dVar.label = 1;
                        if (requestMeasureOutcomeEvent(fVar, dVar) != aVar) {
                            iVar2 = this;
                        }
                    } catch (C5041a e9) {
                        e = e9;
                        iVar = this;
                        g.a responseStatusType = com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode());
                        String str = "OutcomeEventsController.sendSavedOutcomeEvent: Sending outcome with name: " + fVar.getOutcomeId() + " failed with status code: " + e.getStatusCode() + " and response: " + e.getResponse();
                        if (responseStatusType == g.a.RETRYABLE) {
                            com.onesignal.debug.internal.logging.b.info$default(str + " Outcome event was cached and will be reattempted on app cold start", null, 2, null);
                        } else {
                            com.onesignal.debug.internal.logging.b.warn$default(str + " Outcome event will be omitted!", null, 2, null);
                            com.onesignal.session.internal.outcomes.impl.d dVar2 = iVar._outcomeEventsCache;
                            dVar.L$0 = null;
                            dVar.L$1 = null;
                            dVar.label = 3;
                        }
                        return v.f41073a;
                    }
                    return aVar;
                }
                if (iVar != 1) {
                    if (iVar == 2) {
                        Q3.b.s(obj);
                    } else {
                        if (iVar != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Q3.b.s(obj);
                    }
                    return v.f41073a;
                }
                fVar = (com.onesignal.session.internal.outcomes.impl.f) dVar.L$1;
                iVar2 = (i) dVar.L$0;
                Q3.b.s(obj);
                com.onesignal.session.internal.outcomes.impl.d dVar3 = iVar2._outcomeEventsCache;
                dVar.L$0 = iVar2;
                dVar.L$1 = fVar;
                dVar.label = 2;
            }
        }
        dVar = new d(interfaceC5240d);
        Object obj2 = dVar.result;
        A7.a aVar2 = A7.a.f215n;
        iVar = dVar.label;
        if (iVar != 0) {
        }
        com.onesignal.session.internal.outcomes.impl.d dVar32 = iVar2._outcomeEventsCache;
        dVar.L$0 = iVar2;
        dVar.L$1 = fVar;
        dVar.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSavedOutcomes(InterfaceC5240d interfaceC5240d) {
        e eVar;
        int i;
        i iVar;
        i iVar2;
        Iterator it;
        if (interfaceC5240d instanceof e) {
            eVar = (e) interfaceC5240d;
            int i4 = eVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                eVar.label = i4 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                A7.a aVar = A7.a.f215n;
                i = eVar.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    com.onesignal.session.internal.outcomes.impl.d dVar = this._outcomeEventsCache;
                    eVar.L$0 = this;
                    eVar.label = 1;
                    obj = dVar.getAllEventsToSend(eVar);
                    if (obj != aVar) {
                        iVar = this;
                    }
                    return aVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) eVar.L$1;
                    iVar2 = (i) eVar.L$0;
                    Q3.b.s(obj);
                    while (it.hasNext()) {
                        com.onesignal.session.internal.outcomes.impl.f fVar = (com.onesignal.session.internal.outcomes.impl.f) it.next();
                        eVar.L$0 = iVar2;
                        eVar.L$1 = it;
                        eVar.label = 2;
                        if (iVar2.sendSavedOutcomeEvent(fVar, eVar) == aVar) {
                            return aVar;
                        }
                    }
                    return v.f41073a;
                }
                iVar = (i) eVar.L$0;
                Q3.b.s(obj);
                iVar2 = iVar;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                return v.f41073a;
            }
        }
        eVar = new e(interfaceC5240d);
        Object obj2 = eVar.result;
        A7.a aVar2 = A7.a.f215n;
        i = eVar.label;
        if (i != 0) {
        }
        iVar2 = iVar;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return v.f41073a;
    }

    private final n setSourceChannelIds(K5.b bVar, n nVar) {
        int i = h.$EnumSwitchMapping$1[bVar.getInfluenceChannel().ordinal()];
        if (i == 1) {
            nVar.setInAppMessagesIds(bVar.getIds());
            return nVar;
        }
        if (i != 2) {
            return nVar;
        }
        nVar.setNotificationIds(bVar.getIds());
        return nVar;
    }

    @Override // O5.a
    public void onSessionActive() {
    }

    @Override // O5.a
    public void onSessionEnded(long j6) {
    }

    @Override // O5.a
    public void onSessionStarted() {
        com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.sessionStarted: Cleaning outcomes for new session", null, 2, null);
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        saveUnattributedUniqueOutcomeEvents();
    }

    @Override // M5.b
    public Object sendOutcomeEvent(String str, InterfaceC5240d interfaceC5240d) {
        return sendAndCreateOutcomeEvent(str, 0.0f, 0L, this._influenceManager.getInfluences(), interfaceC5240d);
    }

    @Override // M5.b
    public Object sendOutcomeEventWithValue(String str, float f2, InterfaceC5240d interfaceC5240d) {
        return sendAndCreateOutcomeEvent(str, f2, 0L, this._influenceManager.getInfluences(), interfaceC5240d);
    }

    @Override // M5.b
    public Object sendSessionEndOutcomeEvent(long j6, InterfaceC5240d interfaceC5240d) {
        return sendAndCreateOutcomeEvent("os__session_duration", 0.0f, j6, this._influenceManager.getInfluences(), interfaceC5240d);
    }

    @Override // M5.b
    public Object sendUniqueOutcomeEvent(String str, InterfaceC5240d interfaceC5240d) {
        return sendUniqueOutcomeEvent(str, this._influenceManager.getInfluences(), interfaceC5240d);
    }

    @Override // com.onesignal.core.internal.startup.b
    public void start() {
        com.onesignal.common.threading.c.suspendifyOnIO(new g(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendUniqueOutcomeEvent(String str, List<K5.b> list, InterfaceC5240d interfaceC5240d) {
        f fVar;
        int i;
        List<K5.b> removeDisabledInfluences;
        i iVar;
        List<K5.b> list2;
        if (interfaceC5240d instanceof f) {
            fVar = (f) interfaceC5240d;
            int i4 = fVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                fVar.label = i4 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj = fVar2.result;
                A7.a aVar = A7.a.f215n;
                i = fVar2.label;
                if (i != 0) {
                    Q3.b.s(obj);
                    removeDisabledInfluences = removeDisabledInfluences(list);
                    if (removeDisabledInfluences.isEmpty()) {
                        com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.sendUniqueOutcomeEvent: Unique Outcome disabled for current session", null, 2, null);
                        return null;
                    }
                    Iterator<K5.b> it = removeDisabledInfluences.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().getInfluenceType().isAttributed()) {
                                fVar2.L$0 = this;
                                fVar2.L$1 = str;
                                fVar2.L$2 = removeDisabledInfluences;
                                fVar2.label = 1;
                                obj = getUniqueIds(str, removeDisabledInfluences, fVar2);
                                if (obj != aVar) {
                                    iVar = this;
                                }
                            }
                        } else {
                            if (this.unattributedUniqueOutcomeEventsSentOnSession.contains(str)) {
                                com.onesignal.debug.internal.logging.b.debug$default(Q7.k.X("\n                    Measure endpoint will not send because unique outcome already sent for:\n                    Session: " + K5.d.UNATTRIBUTED + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
                                return null;
                            }
                            this.unattributedUniqueOutcomeEventsSentOnSession.add(str);
                            fVar2.label = 3;
                            Object sendAndCreateOutcomeEvent = sendAndCreateOutcomeEvent(str, 0.0f, 0L, removeDisabledInfluences, fVar2);
                            if (sendAndCreateOutcomeEvent != aVar) {
                                return sendAndCreateOutcomeEvent;
                            }
                        }
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        Q3.b.s(obj);
                        return obj;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Q3.b.s(obj);
                    return obj;
                }
                List<K5.b> list3 = (List) fVar2.L$2;
                String str2 = (String) fVar2.L$1;
                iVar = (i) fVar2.L$0;
                Q3.b.s(obj);
                removeDisabledInfluences = list3;
                str = str2;
                list2 = (List) obj;
                if (list2 != null) {
                    com.onesignal.debug.internal.logging.b.debug$default(Q7.k.X("\n                    Measure endpoint will not send because unique outcome already sent for:\n                    SessionInfluences: " + removeDisabledInfluences + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
                    return null;
                }
                fVar2.L$0 = null;
                fVar2.L$1 = null;
                fVar2.L$2 = null;
                fVar2.label = 2;
                Object sendAndCreateOutcomeEvent2 = iVar.sendAndCreateOutcomeEvent(str, 0.0f, 0L, list2, fVar2);
                return sendAndCreateOutcomeEvent2 == aVar ? aVar : sendAndCreateOutcomeEvent2;
            }
        }
        fVar = new f(interfaceC5240d);
        f fVar22 = fVar;
        Object obj2 = fVar22.result;
        A7.a aVar2 = A7.a.f215n;
        i = fVar22.label;
        if (i != 0) {
        }
        list2 = (List) obj2;
        if (list2 != null) {
        }
    }
}
