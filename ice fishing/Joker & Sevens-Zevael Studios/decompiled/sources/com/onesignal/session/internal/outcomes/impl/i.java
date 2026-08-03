package com.onesignal.session.internal.outcomes.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class i implements cb.b, d9.b, eb.a {
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final v8.c _deviceService;
    private final jb.b _identityModelStore;
    private final ab.a _influenceManager;
    private final com.onesignal.session.internal.outcomes.impl.b _outcomeEventsBackend;
    private final com.onesignal.session.internal.outcomes.impl.d _outcomeEventsCache;
    private final com.onesignal.session.internal.outcomes.impl.c _outcomeEventsPreferences;
    private final eb.b _session;
    private final ob.b _subscriptionManager;
    private final e9.a _time;
    private Set<String> unattributedUniqueOutcomeEventsSentOnSession;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends hc.c {
        int label;
        /* synthetic */ Object result;

        public a(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.getUniqueIds(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends hc.j implements oc.c {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.session.internal.outcomes.impl.f fVar, fc.d dVar) {
            super(1, dVar);
            this.$eventParams = fVar;
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return i.this.new b(this.$eventParams, dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((b) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                com.onesignal.session.internal.outcomes.impl.d dVar = i.this._outcomeEventsCache;
                com.onesignal.session.internal.outcomes.impl.f fVar = this.$eventParams;
                this.label = 1;
                Object saveUniqueOutcomeEventParams = dVar.saveUniqueOutcomeEventParams(fVar, this);
                gc.a aVar = gc.a.f2559g;
                if (saveUniqueOutcomeEventParams == aVar) {
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
    public static final class c extends hc.c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public c(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendAndCreateOutcomeEvent(null, 0.0f, 0L, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendSavedOutcomeEvent(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends hc.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public e(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendSavedOutcomes(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends hc.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public f(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendUniqueOutcomeEvent(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class g extends hc.j implements oc.c {
        int label;

        public g(fc.d dVar) {
            super(1, dVar);
        }

        @Override // hc.a
        public final fc.d create(fc.d dVar) {
            return i.this.new g(dVar);
        }

        @Override // oc.c
        public final Object invoke(fc.d dVar) {
            return ((g) create(dVar)).invokeSuspend(ac.o.f277a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (r5.cleanCachedUniqueOutcomeEventNotifications(r4) == r3) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
        
            if (r5.sendSavedOutcomes(r4) == r3) goto L15;
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
                i iVar = i.this;
                this.label = 1;
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return ac.o.f277a;
                }
                v6.a.W(obj);
            }
            com.onesignal.session.internal.outcomes.impl.d dVar = i.this._outcomeEventsCache;
            this.label = 2;
        }
    }

    public i(eb.b bVar, ab.a aVar, com.onesignal.session.internal.outcomes.impl.d dVar, com.onesignal.session.internal.outcomes.impl.c cVar, com.onesignal.session.internal.outcomes.impl.b bVar2, com.onesignal.core.internal.config.b bVar3, jb.b bVar4, ob.b bVar5, v8.c cVar2, e9.a aVar2) {
        pc.j.e(bVar, "_session");
        pc.j.e(aVar, "_influenceManager");
        pc.j.e(dVar, "_outcomeEventsCache");
        pc.j.e(cVar, "_outcomeEventsPreferences");
        pc.j.e(bVar2, "_outcomeEventsBackend");
        pc.j.e(bVar3, "_configModelStore");
        pc.j.e(bVar4, "_identityModelStore");
        pc.j.e(bVar5, "_subscriptionManager");
        pc.j.e(cVar2, "_deviceService");
        pc.j.e(aVar2, "_time");
        this._session = bVar;
        this._influenceManager = aVar;
        this._outcomeEventsCache = dVar;
        this._outcomeEventsPreferences = cVar;
        this._outcomeEventsBackend = bVar2;
        this._configModelStore = bVar3;
        this._identityModelStore = bVar4;
        this._subscriptionManager = bVar5;
        this._deviceService = cVar2;
        this._time = aVar2;
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        Set<String> unattributedUniqueOutcomeEventsSentByChannel = cVar.getUnattributedUniqueOutcomeEventsSentByChannel();
        this.unattributedUniqueOutcomeEventsSentOnSession = unattributedUniqueOutcomeEventsSentByChannel != null ? bc.m.h0(unattributedUniqueOutcomeEventsSentByChannel) : new LinkedHashSet<>();
        bVar.subscribe(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUniqueIds(String str, List<ab.b> list, fc.d dVar) {
        a aVar;
        int i10;
        List list2;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i11 = aVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.label = i11 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                i10 = aVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    com.onesignal.session.internal.outcomes.impl.d dVar2 = this._outcomeEventsCache;
                    aVar.label = 1;
                    obj = dVar2.getNotCachedUniqueInfluencesForOutcome(str, list, aVar);
                    gc.a aVar2 = gc.a.f2559g;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                }
                list2 = (List) obj;
                if (list2.isEmpty()) {
                    return list2;
                }
                return null;
            }
        }
        aVar = new a(dVar);
        Object obj2 = aVar.result;
        i10 = aVar.label;
        if (i10 != 0) {
        }
        list2 = (List) obj2;
        if (list2.isEmpty()) {
        }
    }

    private final List<ab.b> removeDisabledInfluences(List<ab.b> list) {
        ArrayList f02 = bc.m.f0(list);
        for (ab.b bVar : list) {
            if (bVar.getInfluenceType().isDisabled()) {
                com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.removeDisabledInfluences: Outcomes disabled for channel: " + bVar.getInfluenceChannel(), null, 2, null);
                f02.remove(bVar);
            }
        }
        return f02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestMeasureOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, fc.d dVar) {
        String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
        String id2 = this._subscriptionManager.getSubscriptions().getPush().getId();
        String value = gb.j.Companion.fromDeviceType(this._deviceService.getDeviceType()).getValue();
        if (id2.length() == 0 || value.length() == 0) {
            throw new l8.a(0, null, null, 6, null);
        }
        com.onesignal.session.internal.outcomes.impl.e fromOutcomeEventParamstoOutcomeEvent = com.onesignal.session.internal.outcomes.impl.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
        int i10 = h.$EnumSwitchMapping$0[fromOutcomeEventParamstoOutcomeEvent.getSession().ordinal()];
        Object sendOutcomeEvent = this._outcomeEventsBackend.sendOutcomeEvent(appId, ((jb.a) this._identityModelStore.getModel()).getOnesignalId(), id2, value, i10 != 1 ? i10 != 2 ? null : Boolean.FALSE : Boolean.TRUE, fromOutcomeEventParamstoOutcomeEvent, dVar);
        return sendOutcomeEvent == gc.a.f2559g ? sendOutcomeEvent : ac.o.f277a;
    }

    private final void saveAttributedUniqueOutcomeNotifications(com.onesignal.session.internal.outcomes.impl.f fVar) {
        com.onesignal.common.threading.b.suspendifyOnThread(10, new b(fVar, null));
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
    /* JADX WARN: Removed duplicated region for block: B:11:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendAndCreateOutcomeEvent(String str, float f10, long j3, List<ab.b> list, fc.d dVar) {
        c cVar;
        int i10;
        String str2;
        long j6;
        com.onesignal.session.internal.outcomes.impl.f fVar;
        i iVar;
        String str3;
        com.onesignal.session.internal.outcomes.impl.d dVar2;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i11 = cVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.label = i11 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                i10 = cVar.label;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    long currentTimeMillis = this._time.getCurrentTimeMillis() / 1000;
                    boolean z10 = false;
                    n nVar = null;
                    n nVar2 = null;
                    for (ab.b bVar : list) {
                        int i12 = h.$EnumSwitchMapping$0[bVar.getInfluenceType().ordinal()];
                        if (i12 == 1) {
                            if (nVar == null) {
                                nVar = new n(null, null, 3, null);
                            }
                            nVar = setSourceChannelIds(bVar, nVar);
                        } else if (i12 == 2) {
                            if (nVar2 == null) {
                                nVar2 = new n(null, null, 3, null);
                            }
                            nVar2 = setSourceChannelIds(bVar, nVar2);
                        } else if (i12 == 3) {
                            z10 = true;
                        } else if (i12 == 4) {
                            com.onesignal.debug.internal.logging.b.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for channel: " + bVar.getInfluenceChannel(), null, 2, null);
                        }
                    }
                    if (nVar == null && nVar2 == null && !z10) {
                        com.onesignal.debug.internal.logging.b.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for all channels", null, 2, null);
                        return null;
                    }
                    com.onesignal.session.internal.outcomes.impl.f fVar2 = new com.onesignal.session.internal.outcomes.impl.f(str, new m(nVar, nVar2), f10, j3, 0L);
                    try {
                        cVar.L$0 = this;
                        str2 = str;
                    } catch (l8.a e10) {
                        e = e10;
                        str2 = str;
                    }
                    try {
                        cVar.L$1 = str2;
                        cVar.L$2 = fVar2;
                        cVar.J$0 = currentTimeMillis;
                        cVar.label = 1;
                        if (requestMeasureOutcomeEvent(fVar2, cVar) != aVar) {
                            j6 = currentTimeMillis;
                            fVar = fVar2;
                            str3 = str2;
                            iVar = this;
                        }
                    } catch (l8.a e11) {
                        e = e11;
                        j6 = currentTimeMillis;
                        fVar = fVar2;
                        iVar = this;
                        com.onesignal.debug.internal.logging.b.warn$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: " + str2 + " failed with status code: " + e.getStatusCode() + " and response: " + e.getResponse() + "\nOutcome event was cached and will be reattempted on app cold start", null, 2, null);
                        fVar.setTimestamp(j6);
                        dVar2 = iVar._outcomeEventsCache;
                        cVar.L$0 = null;
                        cVar.L$1 = null;
                        cVar.L$2 = null;
                        cVar.label = 2;
                        if (dVar2.saveOutcomeEvent(fVar, cVar) != aVar) {
                        }
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return null;
                }
                j6 = cVar.J$0;
                fVar = (com.onesignal.session.internal.outcomes.impl.f) cVar.L$2;
                str3 = (String) cVar.L$1;
                iVar = (i) cVar.L$0;
                try {
                    v6.a.W(obj);
                } catch (l8.a e12) {
                    e = e12;
                    str2 = str3;
                    com.onesignal.debug.internal.logging.b.warn$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: " + str2 + " failed with status code: " + e.getStatusCode() + " and response: " + e.getResponse() + "\nOutcome event was cached and will be reattempted on app cold start", null, 2, null);
                    fVar.setTimestamp(j6);
                    dVar2 = iVar._outcomeEventsCache;
                    cVar.L$0 = null;
                    cVar.L$1 = null;
                    cVar.L$2 = null;
                    cVar.label = 2;
                    if (dVar2.saveOutcomeEvent(fVar, cVar) != aVar) {
                        return aVar;
                    }
                    return null;
                }
                iVar.saveUniqueOutcome(fVar);
                return com.onesignal.session.internal.outcomes.impl.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
            }
        }
        cVar = new c(dVar);
        Object obj2 = cVar.result;
        i10 = cVar.label;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        iVar.saveUniqueOutcome(fVar);
        return com.onesignal.session.internal.outcomes.impl.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(2:18|19))(3:23|24|(2:26|22)(1:27))|20))|30|6|7|(0)(0)|20) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r8.deleteOldOutcomeEvent(r7, r0) != r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002f, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        com.onesignal.debug.internal.logging.b.warn$default("OutcomeEventsController.sendSavedOutcomeEvent: Sending outcome with name: " + r7.getOutcomeId() + " failed with status code: " + r8.getStatusCode() + " and response: " + r8.getResponse() + "\nOutcome event was cached and will be reattempted on app cold start", null, 2, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSavedOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, fc.d dVar) {
        d dVar2;
        int i10;
        i iVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i11 = dVar2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.label = i11 - Integer.MIN_VALUE;
                Object obj = dVar2.result;
                i10 = dVar2.label;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    dVar2.L$0 = this;
                    dVar2.L$1 = fVar;
                    dVar2.label = 1;
                    if (requestMeasureOutcomeEvent(fVar, dVar2) == aVar) {
                        return aVar;
                    }
                    iVar = this;
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        v6.a.W(obj);
                        return ac.o.f277a;
                    }
                    fVar = (com.onesignal.session.internal.outcomes.impl.f) dVar2.L$1;
                    iVar = (i) dVar2.L$0;
                    v6.a.W(obj);
                }
                com.onesignal.session.internal.outcomes.impl.d dVar3 = iVar._outcomeEventsCache;
                dVar2.L$0 = fVar;
                dVar2.L$1 = null;
                dVar2.label = 2;
            }
        }
        dVar2 = new d(dVar);
        Object obj2 = dVar2.result;
        i10 = dVar2.label;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        com.onesignal.session.internal.outcomes.impl.d dVar32 = iVar._outcomeEventsCache;
        dVar2.L$0 = fVar;
        dVar2.L$1 = null;
        dVar2.label = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSavedOutcomes(fc.d dVar) {
        e eVar;
        int i10;
        i iVar;
        i iVar2;
        Iterator it;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i11 = eVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.label = i11 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                i10 = eVar.label;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    com.onesignal.session.internal.outcomes.impl.d dVar2 = this._outcomeEventsCache;
                    eVar.L$0 = this;
                    eVar.label = 1;
                    obj = dVar2.getAllEventsToSend(eVar);
                    if (obj != aVar) {
                        iVar = this;
                    }
                    return aVar;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) eVar.L$1;
                    iVar2 = (i) eVar.L$0;
                    v6.a.W(obj);
                    while (it.hasNext()) {
                        com.onesignal.session.internal.outcomes.impl.f fVar = (com.onesignal.session.internal.outcomes.impl.f) it.next();
                        eVar.L$0 = iVar2;
                        eVar.L$1 = it;
                        eVar.label = 2;
                        if (iVar2.sendSavedOutcomeEvent(fVar, eVar) == aVar) {
                            return aVar;
                        }
                    }
                    return ac.o.f277a;
                }
                iVar = (i) eVar.L$0;
                v6.a.W(obj);
                iVar2 = iVar;
                it = ((List) obj).iterator();
                while (it.hasNext()) {
                }
                return ac.o.f277a;
            }
        }
        eVar = new e(dVar);
        Object obj2 = eVar.result;
        i10 = eVar.label;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        iVar2 = iVar;
        it = ((List) obj2).iterator();
        while (it.hasNext()) {
        }
        return ac.o.f277a;
    }

    private final n setSourceChannelIds(ab.b bVar, n nVar) {
        int i10 = h.$EnumSwitchMapping$1[bVar.getInfluenceChannel().ordinal()];
        if (i10 == 1) {
            nVar.setInAppMessagesIds(bVar.getIds());
            return nVar;
        }
        if (i10 != 2) {
            return nVar;
        }
        nVar.setNotificationIds(bVar.getIds());
        return nVar;
    }

    @Override // eb.a
    public void onSessionStarted() {
        com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.sessionStarted: Cleaning outcomes for new session", null, 2, null);
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        saveUnattributedUniqueOutcomeEvents();
    }

    @Override // cb.b
    public Object sendOutcomeEvent(String str, fc.d dVar) {
        return sendAndCreateOutcomeEvent(str, 0.0f, 0L, this._influenceManager.getInfluences(), dVar);
    }

    @Override // cb.b
    public Object sendOutcomeEventWithValue(String str, float f10, fc.d dVar) {
        return sendAndCreateOutcomeEvent(str, f10, 0L, this._influenceManager.getInfluences(), dVar);
    }

    @Override // cb.b
    public Object sendSessionEndOutcomeEvent(long j3, fc.d dVar) {
        List<ab.b> influences = this._influenceManager.getInfluences();
        Iterator<ab.b> it = influences.iterator();
        while (it.hasNext()) {
            if (it.next().getIds() != null) {
                return sendAndCreateOutcomeEvent("os__session_duration", 0.0f, j3, influences, dVar);
            }
        }
        return null;
    }

    @Override // cb.b
    public Object sendUniqueOutcomeEvent(String str, fc.d dVar) {
        return sendUniqueOutcomeEvent(str, this._influenceManager.getInfluences(), dVar);
    }

    @Override // d9.b
    public void start() {
        com.onesignal.common.threading.b.suspendifyOnThread$default(0, new g(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendUniqueOutcomeEvent(String str, List<ab.b> list, fc.d dVar) {
        f fVar;
        int i10;
        List<ab.b> removeDisabledInfluences;
        i iVar;
        List<ab.b> list2;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i11 = fVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.label = i11 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj = fVar2.result;
                i10 = fVar2.label;
                gc.a aVar = gc.a.f2559g;
                if (i10 != 0) {
                    v6.a.W(obj);
                    removeDisabledInfluences = removeDisabledInfluences(list);
                    if (removeDisabledInfluences.isEmpty()) {
                        com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsController.sendUniqueOutcomeEvent: Unique Outcome disabled for current session", null, 2, null);
                        return null;
                    }
                    Iterator<ab.b> it = removeDisabledInfluences.iterator();
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
                                com.onesignal.debug.internal.logging.b.debug$default(xc.c.m("\n                    Measure endpoint will not send because unique outcome already sent for: \n                    Session: " + ab.d.UNATTRIBUTED + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
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
                if (i10 != 1) {
                    if (i10 == 2) {
                        v6.a.W(obj);
                        return obj;
                    }
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v6.a.W(obj);
                    return obj;
                }
                List<ab.b> list3 = (List) fVar2.L$2;
                String str2 = (String) fVar2.L$1;
                iVar = (i) fVar2.L$0;
                v6.a.W(obj);
                removeDisabledInfluences = list3;
                str = str2;
                list2 = (List) obj;
                if (list2 != null) {
                    com.onesignal.debug.internal.logging.b.debug$default(xc.c.m("\n                    Measure endpoint will not send because unique outcome already sent for: \n                    SessionInfluences: " + removeDisabledInfluences + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
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
        fVar = new f(dVar);
        f fVar22 = fVar;
        Object obj2 = fVar22.result;
        i10 = fVar22.label;
        gc.a aVar2 = gc.a.f2559g;
        if (i10 != 0) {
        }
        list2 = (List) obj2;
        if (list2 != null) {
        }
    }

    @Override // eb.a
    public void onSessionActive() {
    }

    @Override // eb.a
    public void onSessionEnded(long j3) {
    }
}
