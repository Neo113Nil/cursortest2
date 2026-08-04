package com.gamericefishpro.space.pg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements com.gamericefishpro.space.og.b, com.gamericefishpro.space.jd.b, com.gamericefishpro.space.rg.a {
    private final com.gamericefishpro.space.rc.b _configModelStore;
    private final com.gamericefishpro.space.vc.c _deviceService;
    private final com.gamericefishpro.space.bh.b _identityModelStore;
    private final com.gamericefishpro.space.mg.a _influenceManager;
    private final com.gamericefishpro.space.pg.b _outcomeEventsBackend;
    private final com.gamericefishpro.space.pg.d _outcomeEventsCache;
    private final com.gamericefishpro.space.pg.c _outcomeEventsPreferences;
    private final com.gamericefishpro.space.rg.b _session;
    private final com.gamericefishpro.space.jh.b _subscriptionManager;
    private final com.gamericefishpro.space.kd.a _time;
    private Set<String> unattributedUniqueOutcomeEventsSentOnSession;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends com.gamericefishpro.space.vh.c {
        int label;
        /* synthetic */ Object result;

        public a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.getUniqueIds(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.vh.i implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.pg.f $eventParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.gamericefishpro.space.pg.f fVar, com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
            this.$eventParams = fVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return i.this.new b(this.$eventParams, aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((b) create(aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.pg.d dVar = i.this._outcomeEventsCache;
                com.gamericefishpro.space.pg.f fVar = this.$eventParams;
                this.label = 1;
                if (dVar.saveUniqueOutcomeEventParams(fVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.vh.c {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public c(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendAndCreateOutcomeEvent(null, 0.0f, 0L, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendSavedOutcomeEvent(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public e(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendSavedOutcomes(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends com.gamericefishpro.space.vh.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public f(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return i.this.sendUniqueOutcomeEvent(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class g extends com.gamericefishpro.space.vh.i implements Function1 {
        int label;

        public g(com.gamericefishpro.space.th.a aVar) {
            super(1, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(com.gamericefishpro.space.th.a aVar) {
            return i.this.new g(aVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(com.gamericefishpro.space.th.a aVar) {
            return ((g) create(aVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            if (r5.cleanCachedUniqueOutcomeEventNotifications(r4) == r0) goto L15;
         */
        @Override // com.gamericefishpro.space.vh.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                i iVar = i.this;
                this.label = 1;
                if (iVar.sendSavedOutcomes(this) != aVar) {
                }
                return aVar;
            }
            if (i == 1) {
                com.gamericefishpro.space.wa.b.P(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.gamericefishpro.space.wa.b.P(obj);
            }
            return Unit.a;
            com.gamericefishpro.space.pg.d dVar = i.this._outcomeEventsCache;
            this.label = 2;
        }
    }

    public i(com.gamericefishpro.space.rg.b _session, com.gamericefishpro.space.mg.a _influenceManager, com.gamericefishpro.space.pg.d _outcomeEventsCache, com.gamericefishpro.space.pg.c _outcomeEventsPreferences, com.gamericefishpro.space.pg.b _outcomeEventsBackend, com.gamericefishpro.space.rc.b _configModelStore, com.gamericefishpro.space.bh.b _identityModelStore, com.gamericefishpro.space.jh.b _subscriptionManager, com.gamericefishpro.space.vc.c _deviceService, com.gamericefishpro.space.kd.a _time) {
        Intrinsics.checkNotNullParameter(_session, "_session");
        Intrinsics.checkNotNullParameter(_influenceManager, "_influenceManager");
        Intrinsics.checkNotNullParameter(_outcomeEventsCache, "_outcomeEventsCache");
        Intrinsics.checkNotNullParameter(_outcomeEventsPreferences, "_outcomeEventsPreferences");
        Intrinsics.checkNotNullParameter(_outcomeEventsBackend, "_outcomeEventsBackend");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_identityModelStore, "_identityModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        Intrinsics.checkNotNullParameter(_deviceService, "_deviceService");
        Intrinsics.checkNotNullParameter(_time, "_time");
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
        this.unattributedUniqueOutcomeEventsSentOnSession = unattributedUniqueOutcomeEventsSentByChannel != null ? CollectionsKt.N(unattributedUniqueOutcomeEventsSentByChannel) : new LinkedHashSet();
        _session.subscribe(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getUniqueIds(String str, List<com.gamericefishpro.space.mg.b> list, com.gamericefishpro.space.th.a aVar) {
        a aVar2;
        if (aVar instanceof a) {
            aVar2 = (a) aVar;
            int i = aVar2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar2.label = i - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(aVar);
            }
        } else {
            aVar2 = new a(aVar);
        }
        Object notCachedUniqueInfluencesForOutcome = aVar2.result;
        com.gamericefishpro.space.uh.a aVar3 = com.gamericefishpro.space.uh.a.d;
        int i2 = aVar2.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(notCachedUniqueInfluencesForOutcome);
            com.gamericefishpro.space.pg.d dVar = this._outcomeEventsCache;
            aVar2.label = 1;
            notCachedUniqueInfluencesForOutcome = dVar.getNotCachedUniqueInfluencesForOutcome(str, list, aVar2);
            if (notCachedUniqueInfluencesForOutcome == aVar3) {
                return aVar3;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(notCachedUniqueInfluencesForOutcome);
        }
        List list2 = (List) notCachedUniqueInfluencesForOutcome;
        if (list2.isEmpty()) {
            return null;
        }
        return list2;
    }

    private final List<com.gamericefishpro.space.mg.b> removeDisabledInfluences(List<com.gamericefishpro.space.mg.b> list) {
        ArrayList arrayListM = CollectionsKt.M(list);
        for (com.gamericefishpro.space.mg.b bVar : list) {
            if (bVar.getInfluenceType().isDisabled()) {
                com.gamericefishpro.space.od.b.debug$default("OutcomeEventsController.removeDisabledInfluences: Outcomes disabled for channel: " + bVar.getInfluenceChannel(), null, 2, null);
                arrayListM.remove(bVar);
            }
        }
        return arrayListM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object requestMeasureOutcomeEvent(com.gamericefishpro.space.pg.f fVar, com.gamericefishpro.space.th.a aVar) throws com.gamericefishpro.space.ec.a {
        Boolean bool;
        String appId = ((com.gamericefishpro.space.rc.a) this._configModelStore.getModel()).getAppId();
        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
        String value = com.gamericefishpro.space.vg.j.Companion.fromDeviceType(this._deviceService.getDeviceType()).getValue();
        if (id.length() == 0 || value.length() == 0) {
            throw new com.gamericefishpro.space.ec.a(0, null, null, 6, null);
        }
        com.gamericefishpro.space.pg.e eVarFromOutcomeEventParamstoOutcomeEvent = com.gamericefishpro.space.pg.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
        int i = h.$EnumSwitchMapping$0[eVarFromOutcomeEventParamstoOutcomeEvent.getSession().ordinal()];
        if (i != 1) {
            bool = i != 2 ? null : Boolean.FALSE;
        } else {
            bool = Boolean.TRUE;
        }
        Object objSendOutcomeEvent = this._outcomeEventsBackend.sendOutcomeEvent(appId, ((com.gamericefishpro.space.bh.a) this._identityModelStore.getModel()).getOnesignalId(), id, value, bool, eVarFromOutcomeEventParamstoOutcomeEvent, aVar);
        return objSendOutcomeEvent == com.gamericefishpro.space.uh.a.d ? objSendOutcomeEvent : Unit.a;
    }

    private final void saveAttributedUniqueOutcomeNotifications(com.gamericefishpro.space.pg.f fVar) {
        com.gamericefishpro.space.ic.b.suspendifyOnThread(10, new b(fVar, null));
    }

    private final void saveUnattributedUniqueOutcomeEvents() {
        this._outcomeEventsPreferences.setUnattributedUniqueOutcomeEventsSentByChannel(this.unattributedUniqueOutcomeEventsSentOnSession);
    }

    private final void saveUniqueOutcome(com.gamericefishpro.space.pg.f fVar) {
        if (fVar.isUnattributed()) {
            saveUnattributedUniqueOutcomeEvents();
        } else {
            saveAttributedUniqueOutcomeNotifications(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:60:0x012f  */
    /* JADX WARN: Code duplicated, block: B:63:0x0157  */
    /* JADX WARN: Code duplicated, block: B:65:0x017b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x017c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x012f, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0157, please report this as an issue */
    public final Object sendAndCreateOutcomeEvent(String str, float f2, long j, List<com.gamericefishpro.space.mg.b> list, com.gamericefishpro.space.th.a aVar) {
        c cVar;
        String str2;
        long j2;
        com.gamericefishpro.space.pg.f fVar;
        i iVar;
        String str3;
        com.gamericefishpro.space.yb.f.a responseStatusType;
        String string;
        com.gamericefishpro.space.pg.d dVar;
        com.gamericefishpro.space.pg.d dVar2;
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
        Object obj = cVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = cVar.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            long currentTimeMillis = this._time.getCurrentTimeMillis() / ((long) 1000);
            boolean z = false;
            n sourceChannelIds = null;
            n sourceChannelIds2 = null;
            for (com.gamericefishpro.space.mg.b bVar : list) {
                int i3 = h.$EnumSwitchMapping$0[bVar.getInfluenceType().ordinal()];
                if (i3 == 1) {
                    if (sourceChannelIds == null) {
                        sourceChannelIds = new n(null, null, 3, null);
                    }
                    sourceChannelIds = setSourceChannelIds(bVar, sourceChannelIds);
                } else if (i3 == 2) {
                    if (sourceChannelIds2 == null) {
                        sourceChannelIds2 = new n(null, null, 3, null);
                    }
                    sourceChannelIds2 = setSourceChannelIds(bVar, sourceChannelIds2);
                } else if (i3 == 3) {
                    z = true;
                } else if (i3 == 4) {
                    com.gamericefishpro.space.od.b.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for channel: " + bVar.getInfluenceChannel(), null, 2, null);
                }
            }
            if (sourceChannelIds == null && sourceChannelIds2 == null && !z) {
                com.gamericefishpro.space.od.b.verbose$default("OutcomeEventsController.sendAndCreateOutcomeEvent: Outcomes disabled for all channels", null, 2, null);
                return null;
            }
            com.gamericefishpro.space.pg.f fVar2 = new com.gamericefishpro.space.pg.f(str, new m(sourceChannelIds, sourceChannelIds2), f2, j, 0L);
            try {
                cVar.L$0 = this;
                str2 = str;
                try {
                    cVar.L$1 = str2;
                    cVar.L$2 = fVar2;
                    cVar.J$0 = currentTimeMillis;
                    cVar.label = 1;
                    if (requestMeasureOutcomeEvent(fVar2, cVar) != aVar2) {
                        j2 = currentTimeMillis;
                        fVar = fVar2;
                        str3 = str2;
                        iVar = this;
                    }
                } catch (com.gamericefishpro.space.ec.a e2) {
                    e = e2;
                    j2 = currentTimeMillis;
                    fVar = fVar2;
                    iVar = this;
                    responseStatusType = com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode());
                    StringBuilder sbL = com.gamericefishpro.space.m5.a.l("OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: ", str2, " failed with status code: ");
                    sbL.append(e.getStatusCode());
                    sbL.append(" and response: ");
                    sbL.append(e.getResponse());
                    string = sbL.toString();
                    if (responseStatusType != com.gamericefishpro.space.yb.f.a.RETRYABLE) {
                        com.gamericefishpro.space.od.b.warn$default(string + " Outcome event was cached and will be reattempted on app cold start", null, 2, null);
                        fVar.setTimestamp(j2);
                        dVar2 = iVar._outcomeEventsCache;
                        cVar.L$0 = null;
                        cVar.L$1 = null;
                        cVar.L$2 = null;
                        cVar.label = 2;
                        if (dVar2.saveOutcomeEvent(fVar, cVar) != aVar2) {
                            return null;
                        }
                    } else {
                        com.gamericefishpro.space.od.b.error$default(string + " Outcome event will be omitted!", null, 2, null);
                        dVar = iVar._outcomeEventsCache;
                        cVar.L$0 = null;
                        cVar.L$1 = null;
                        cVar.L$2 = null;
                        cVar.label = 3;
                        if (dVar.deleteOldOutcomeEvent(fVar, cVar) != aVar2) {
                            return null;
                        }
                    }
                }
            } catch (com.gamericefishpro.space.ec.a e3) {
                e = e3;
                str2 = str;
            }
            return aVar2;
        }
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            return null;
        }
        j2 = cVar.J$0;
        fVar = (com.gamericefishpro.space.pg.f) cVar.L$2;
        str3 = (String) cVar.L$1;
        iVar = (i) cVar.L$0;
        try {
            com.gamericefishpro.space.wa.b.P(obj);
        } catch (com.gamericefishpro.space.ec.a e4) {
            e = e4;
            str2 = str3;
            responseStatusType = com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode());
            StringBuilder sbL2 = com.gamericefishpro.space.m5.a.l("OutcomeEventsController.sendAndCreateOutcomeEvent: Sending outcome with name: ", str2, " failed with status code: ");
            sbL2.append(e.getStatusCode());
            sbL2.append(" and response: ");
            sbL2.append(e.getResponse());
            string = sbL2.toString();
            if (responseStatusType != com.gamericefishpro.space.yb.f.a.RETRYABLE) {
                com.gamericefishpro.space.od.b.error$default(string + " Outcome event will be omitted!", null, 2, null);
                dVar = iVar._outcomeEventsCache;
                cVar.L$0 = null;
                cVar.L$1 = null;
                cVar.L$2 = null;
                cVar.label = 3;
                if (dVar.deleteOldOutcomeEvent(fVar, cVar) != aVar2) {
                    return aVar2;
                }
                return null;
            }
            com.gamericefishpro.space.od.b.warn$default(string + " Outcome event was cached and will be reattempted on app cold start", null, 2, null);
            fVar.setTimestamp(j2);
            dVar2 = iVar._outcomeEventsCache;
            cVar.L$0 = null;
            cVar.L$1 = null;
            cVar.L$2 = null;
            cVar.label = 2;
            if (dVar2.saveOutcomeEvent(fVar, cVar) != aVar2) {
                return aVar2;
            }
            return null;
        }
        iVar.saveUniqueOutcome(fVar);
        return com.gamericefishpro.space.pg.e.Companion.fromOutcomeEventParamstoOutcomeEvent(fVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
    
        if (r10.deleteOldOutcomeEvent(r9, r0) == r1) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e2, code lost:
    
        if (r10.deleteOldOutcomeEvent(r9, r0) == r1) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendSavedOutcomeEvent(com.gamericefishpro.space.pg.f fVar, com.gamericefishpro.space.th.a aVar) {
        d dVar;
        i iVar;
        if (aVar instanceof d) {
            dVar = (d) aVar;
            int i = dVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.label = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(aVar);
            }
        } else {
            dVar = new d(aVar);
        }
        Object obj = dVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        i iVar2 = dVar.label;
        try {
            if (iVar2 != 0) {
                if (iVar2 == 1) {
                    fVar = (com.gamericefishpro.space.pg.f) dVar.L$1;
                    iVar = (i) dVar.L$0;
                    com.gamericefishpro.space.wa.b.P(obj);
                } else if (iVar2 == 2) {
                    com.gamericefishpro.space.wa.b.P(obj);
                } else {
                    if (iVar2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.gamericefishpro.space.wa.b.P(obj);
                }
                return Unit.a;
            }
            com.gamericefishpro.space.wa.b.P(obj);
            try {
                dVar.L$0 = this;
                dVar.L$1 = fVar;
                dVar.label = 1;
                if (requestMeasureOutcomeEvent(fVar, dVar) != aVar2) {
                    iVar = this;
                }
            } catch (com.gamericefishpro.space.ec.a e2) {
                e = e2;
                iVar2 = this;
                com.gamericefishpro.space.yb.f.a responseStatusType = com.gamericefishpro.space.yb.f.INSTANCE.getResponseStatusType(e.getStatusCode());
                String str = "OutcomeEventsController.sendSavedOutcomeEvent: Sending outcome with name: " + fVar.getOutcomeId() + " failed with status code: " + e.getStatusCode() + " and response: " + e.getResponse();
                if (responseStatusType == com.gamericefishpro.space.yb.f.a.RETRYABLE) {
                    com.gamericefishpro.space.od.b.warn$default(str + " Outcome event was cached and will be reattempted on app cold start", null, 2, null);
                } else {
                    com.gamericefishpro.space.od.b.error$default(str + " Outcome event will be omitted!", null, 2, null);
                    com.gamericefishpro.space.pg.d dVar2 = iVar2._outcomeEventsCache;
                    dVar.L$0 = null;
                    dVar.L$1 = null;
                    dVar.label = 3;
                }
            }
            return aVar2;
            com.gamericefishpro.space.pg.d dVar3 = iVar._outcomeEventsCache;
            dVar.L$0 = iVar;
            dVar.L$1 = fVar;
            dVar.label = 2;
        } catch (com.gamericefishpro.space.ec.a e3) {
            e = e3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0061  */
    /* JADX WARN: Code duplicated, block: B:29:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:? A[LOOP:0: B:21:0x005b->B:31:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object sendSavedOutcomes(com.gamericefishpro.space.th.a aVar) {
        e eVar;
        i iVar;
        i iVar2;
        Iterator it;
        com.gamericefishpro.space.pg.f fVar;
        if (aVar instanceof e) {
            eVar = (e) aVar;
            int i = eVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                eVar.label = i - Integer.MIN_VALUE;
            } else {
                eVar = new e(aVar);
            }
        } else {
            eVar = new e(aVar);
        }
        Object allEventsToSend = eVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = eVar.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(allEventsToSend);
            com.gamericefishpro.space.pg.d dVar = this._outcomeEventsCache;
            eVar.L$0 = this;
            eVar.label = 1;
            allEventsToSend = dVar.getAllEventsToSend(eVar);
            if (allEventsToSend != aVar2) {
                iVar = this;
            }
            return aVar2;
        }
        if (i2 == 1) {
            iVar = (i) eVar.L$0;
            com.gamericefishpro.space.wa.b.P(allEventsToSend);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) eVar.L$1;
            iVar2 = (i) eVar.L$0;
            com.gamericefishpro.space.wa.b.P(allEventsToSend);
        }
        while (it.hasNext()) {
            fVar = (com.gamericefishpro.space.pg.f) it.next();
            eVar.L$0 = iVar2;
            eVar.L$1 = it;
            eVar.label = 2;
            if (iVar2.sendSavedOutcomeEvent(fVar, eVar) == aVar2) {
                return aVar2;
            }
        }
        return Unit.a;
        iVar2 = iVar;
        it = ((List) allEventsToSend).iterator();
        while (it.hasNext()) {
            fVar = (com.gamericefishpro.space.pg.f) it.next();
            eVar.L$0 = iVar2;
            eVar.L$1 = it;
            eVar.label = 2;
            if (iVar2.sendSavedOutcomeEvent(fVar, eVar) == aVar2) {
                return aVar2;
            }
        }
        return Unit.a;
    }

    private final n setSourceChannelIds(com.gamericefishpro.space.mg.b bVar, n nVar) {
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

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionStarted() {
        com.gamericefishpro.space.od.b.debug$default("OutcomeEventsController.sessionStarted: Cleaning outcomes for new session", null, 2, null);
        this.unattributedUniqueOutcomeEventsSentOnSession = new LinkedHashSet();
        saveUnattributedUniqueOutcomeEvents();
    }

    @Override // com.gamericefishpro.space.og.b
    public Object sendOutcomeEvent(String str, com.gamericefishpro.space.th.a aVar) {
        return sendAndCreateOutcomeEvent(str, 0.0f, 0L, this._influenceManager.getInfluences(), aVar);
    }

    @Override // com.gamericefishpro.space.og.b
    public Object sendOutcomeEventWithValue(String str, float f2, com.gamericefishpro.space.th.a aVar) {
        return sendAndCreateOutcomeEvent(str, f2, 0L, this._influenceManager.getInfluences(), aVar);
    }

    @Override // com.gamericefishpro.space.og.b
    public Object sendSessionEndOutcomeEvent(long j, com.gamericefishpro.space.th.a aVar) {
        List<com.gamericefishpro.space.mg.b> influences = this._influenceManager.getInfluences();
        Iterator<com.gamericefishpro.space.mg.b> it = influences.iterator();
        while (it.hasNext()) {
            if (it.next().getIds() != null) {
                return sendAndCreateOutcomeEvent("os__session_duration", 0.0f, j, influences, aVar);
            }
        }
        return null;
    }

    @Override // com.gamericefishpro.space.og.b
    public Object sendUniqueOutcomeEvent(String str, com.gamericefishpro.space.th.a aVar) {
        return sendUniqueOutcomeEvent(str, this._influenceManager.getInfluences(), aVar);
    }

    @Override // com.gamericefishpro.space.jd.b
    public void start() {
        com.gamericefishpro.space.ic.b.suspendifyOnThread$default(0, new g(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object sendUniqueOutcomeEvent(String str, List<com.gamericefishpro.space.mg.b> list, com.gamericefishpro.space.th.a aVar) {
        f fVar;
        List<com.gamericefishpro.space.mg.b> listRemoveDisabledInfluences;
        i iVar;
        if (aVar instanceof f) {
            fVar = (f) aVar;
            int i = fVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.label = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(aVar);
            }
        } else {
            fVar = new f(aVar);
        }
        f fVar2 = fVar;
        Object uniqueIds = fVar2.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = fVar2.label;
        if (i2 == 0) {
            com.gamericefishpro.space.wa.b.P(uniqueIds);
            listRemoveDisabledInfluences = removeDisabledInfluences(list);
            if (listRemoveDisabledInfluences.isEmpty()) {
                com.gamericefishpro.space.od.b.debug$default("OutcomeEventsController.sendUniqueOutcomeEvent: Unique Outcome disabled for current session", null, 2, null);
                return null;
            }
            Iterator<com.gamericefishpro.space.mg.b> it = listRemoveDisabledInfluences.iterator();
            do {
                if (!it.hasNext()) {
                    if (this.unattributedUniqueOutcomeEventsSentOnSession.contains(str)) {
                        com.gamericefishpro.space.od.b.debug$default(com.gamericefishpro.space.mi.h.c("\n                    Measure endpoint will not send because unique outcome already sent for:\n                    Session: " + com.gamericefishpro.space.mg.d.UNATTRIBUTED + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
                        return null;
                    }
                    this.unattributedUniqueOutcomeEventsSentOnSession.add(str);
                    fVar2.label = 3;
                    Object objSendAndCreateOutcomeEvent = sendAndCreateOutcomeEvent(str, 0.0f, 0L, listRemoveDisabledInfluences, fVar2);
                    if (objSendAndCreateOutcomeEvent != aVar2) {
                        return objSendAndCreateOutcomeEvent;
                    }
                }
            } while (!it.next().getInfluenceType().isAttributed());
            fVar2.L$0 = this;
            fVar2.L$1 = str;
            fVar2.L$2 = listRemoveDisabledInfluences;
            fVar2.label = 1;
            uniqueIds = getUniqueIds(str, listRemoveDisabledInfluences, fVar2);
            if (uniqueIds != aVar2) {
                iVar = this;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                com.gamericefishpro.space.wa.b.P(uniqueIds);
                return uniqueIds;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(uniqueIds);
            return uniqueIds;
        }
        List<com.gamericefishpro.space.mg.b> list2 = (List) fVar2.L$2;
        String str2 = (String) fVar2.L$1;
        iVar = (i) fVar2.L$0;
        com.gamericefishpro.space.wa.b.P(uniqueIds);
        listRemoveDisabledInfluences = list2;
        str = str2;
        List<com.gamericefishpro.space.mg.b> list3 = (List) uniqueIds;
        if (list3 == null) {
            com.gamericefishpro.space.od.b.debug$default(com.gamericefishpro.space.mi.h.c("\n                    Measure endpoint will not send because unique outcome already sent for:\n                    SessionInfluences: " + listRemoveDisabledInfluences + "\n                    Outcome name: " + str + "\n                    "), null, 2, null);
            return null;
        }
        fVar2.L$0 = null;
        fVar2.L$1 = null;
        fVar2.L$2 = null;
        fVar2.label = 2;
        Object objSendAndCreateOutcomeEvent2 = iVar.sendAndCreateOutcomeEvent(str, 0.0f, 0L, list3, fVar2);
        return objSendAndCreateOutcomeEvent2 == aVar2 ? aVar2 : objSendAndCreateOutcomeEvent2;
    }

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionActive() {
    }

    @Override // com.gamericefishpro.space.rg.a
    public void onSessionEnded(long j) {
    }
}
