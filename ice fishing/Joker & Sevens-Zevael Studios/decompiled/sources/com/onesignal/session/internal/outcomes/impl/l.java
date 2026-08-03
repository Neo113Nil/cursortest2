package com.onesignal.session.internal.outcomes.impl;

import ab.d;
import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import yc.a0;
import yc.i0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l implements com.onesignal.session.internal.outcomes.impl.d {
    private final t8.d _databaseProvider;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends hc.j implements oc.e {
        final /* synthetic */ String $notificationIdColumnName;
        final /* synthetic */ String $notificationTableName;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, l lVar, fc.d dVar) {
            super(2, dVar);
            this.$notificationTableName = str;
            this.$notificationIdColumnName = str2;
            this.this$0 = lVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new a(this.$notificationTableName, this.$notificationIdColumnName, this.this$0, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            StringBuilder sb = new StringBuilder("NOT EXISTS(SELECT NULL FROM ");
            sb.append(this.$notificationTableName);
            sb.append(" n WHERE n.");
            sb.append(this.$notificationIdColumnName);
            sb.append(" = channel_influence_id AND channel_type = \"");
            String cVar = ab.c.NOTIFICATION.toString();
            Locale locale = Locale.ROOT;
            pc.j.d(locale, "ROOT");
            String lowerCase = cVar.toLowerCase(locale);
            pc.j.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            sb.append(lowerCase);
            sb.append("\")");
            this.this$0._databaseProvider.getOs().delete("cached_unique_outcome", sb.toString(), null);
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((a) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends hc.j implements oc.e {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.session.internal.outcomes.impl.f fVar, fc.d dVar) {
            super(2, dVar);
            this.$event = fVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return l.this.new b(this.$event, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            l.this._databaseProvider.getOs().delete("outcome", "timestamp = ?", new String[]{String.valueOf(this.$event.getTimestamp())});
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((b) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.getAllEventsToSend(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends hc.j implements oc.e {
        final /* synthetic */ List<com.onesignal.session.internal.outcomes.impl.f> $events;
        int label;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends pc.k implements oc.c {
            final /* synthetic */ List<com.onesignal.session.internal.outcomes.impl.f> $events;
            final /* synthetic */ l this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar, List<com.onesignal.session.internal.outcomes.impl.f> list) {
                super(1);
                this.this$0 = lVar;
                this.$events = list;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t8.a) obj);
                return ac.o.f277a;
            }

            public final void invoke(t8.a aVar) {
                pc.j.e(aVar, "cursor");
                if (aVar.moveToFirst()) {
                    do {
                        String string = aVar.getString("notification_influence_type");
                        d.a aVar2 = ab.d.Companion;
                        ab.d fromString = aVar2.fromString(string);
                        ab.d fromString2 = aVar2.fromString(aVar.getString("iam_influence_type"));
                        String optString = aVar.getOptString(bb.e.NOTIFICATIONS_IDS);
                        if (optString == null) {
                            optString = "[]";
                        }
                        String optString2 = aVar.getOptString("iam_ids");
                        String str = optString2 == null ? "[]" : optString2;
                        String string2 = aVar.getString("name");
                        float f10 = aVar.getFloat("weight");
                        long j3 = aVar.getLong("timestamp");
                        long j6 = aVar.getLong("session_time");
                        try {
                            n nVar = new n(null, null, 3, null);
                            n nVar2 = new n(null, null, 3, null);
                            m notificationInfluenceSource = this.this$0.getNotificationInfluenceSource(fromString, nVar, nVar2, optString);
                            this.this$0.getIAMInfluenceSource(fromString2, nVar, nVar2, str, notificationInfluenceSource);
                            if (notificationInfluenceSource == null) {
                                notificationInfluenceSource = new m(null, null);
                            }
                            this.$events.add(new com.onesignal.session.internal.outcomes.impl.f(string2, notificationInfluenceSource, f10, j6, j3));
                        } catch (JSONException e10) {
                            com.onesignal.debug.internal.logging.b.error("Generating JSONArray from notifications ids outcome:JSON Failed.", e10);
                        }
                    } while (aVar.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<com.onesignal.session.internal.outcomes.impl.f> list, fc.d dVar) {
            super(2, dVar);
            this.$events = list;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return l.this.new d(this.$events, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            db.a.INSTANCE.run(l.this._databaseProvider);
            t8.b.query$default(l.this._databaseProvider.getOs(), "outcome", null, null, null, null, null, null, null, new a(l.this, this.$events), 254, null);
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((d) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.getNotCachedUniqueInfluencesForOutcome(null, null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends hc.j implements oc.e {
        final /* synthetic */ List<ab.b> $influences;
        final /* synthetic */ String $name;
        final /* synthetic */ List<ab.b> $uniqueInfluences;
        int label;
        final /* synthetic */ l this$0;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends pc.k implements oc.c {
            final /* synthetic */ JSONArray $availableInfluenceIds;
            final /* synthetic */ String $channelInfluenceId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(JSONArray jSONArray, String str) {
                super(1);
                this.$availableInfluenceIds = jSONArray;
                this.$channelInfluenceId = str;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t8.a) obj);
                return ac.o.f277a;
            }

            public final void invoke(t8.a aVar) {
                pc.j.e(aVar, "it");
                if (aVar.getCount() == 0) {
                    this.$availableInfluenceIds.put(this.$channelInfluenceId);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<ab.b> list, String str, l lVar, List<ab.b> list2, fc.d dVar) {
            super(2, dVar);
            this.$influences = list;
            this.$name = str;
            this.this$0 = lVar;
            this.$uniqueInfluences = list2;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new f(this.$influences, this.$name, this.this$0, this.$uniqueInfluences, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            try {
                for (ab.b bVar : this.$influences) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray ids = bVar.getIds();
                    if (ids != null) {
                        int length = ids.length();
                        for (int i10 = 0; i10 < length; i10++) {
                            String string = ids.getString(i10);
                            t8.b.query$default(this.this$0._databaseProvider.getOs(), "cached_unique_outcome", new String[0], "channel_influence_id = ? AND channel_type = ? AND name = ?", new String[]{string, bVar.getInfluenceChannel().toString(), this.$name}, null, null, null, "1", new a(jSONArray, string), 112, null);
                        }
                        if (jSONArray.length() > 0) {
                            ab.b copy = bVar.copy();
                            copy.setIds(jSONArray);
                            this.$uniqueInfluences.add(copy);
                        }
                    }
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((f) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class g extends hc.j implements oc.e {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.session.internal.outcomes.impl.f fVar, l lVar, fc.d dVar) {
            super(2, dVar);
            this.$eventParams = fVar;
            this.this$0 = lVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new g(this.$eventParams, this.this$0, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            ab.d dVar;
            n indirectBody;
            n directBody;
            ab.d dVar2;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            ab.d dVar3 = ab.d.UNATTRIBUTED;
            m outcomeSource = this.$eventParams.getOutcomeSource();
            if (outcomeSource == null || (directBody = outcomeSource.getDirectBody()) == null) {
                dVar = dVar3;
            } else {
                JSONArray notificationIds = directBody.getNotificationIds();
                if (notificationIds == null || notificationIds.length() <= 0) {
                    dVar2 = dVar3;
                } else {
                    dVar2 = ab.d.DIRECT;
                    jSONArray = notificationIds;
                }
                JSONArray inAppMessagesIds = directBody.getInAppMessagesIds();
                if (inAppMessagesIds != null && inAppMessagesIds.length() > 0) {
                    dVar3 = ab.d.DIRECT;
                    jSONArray2 = inAppMessagesIds;
                }
                dVar = dVar3;
                dVar3 = dVar2;
            }
            m outcomeSource2 = this.$eventParams.getOutcomeSource();
            if (outcomeSource2 != null && (indirectBody = outcomeSource2.getIndirectBody()) != null) {
                JSONArray notificationIds2 = indirectBody.getNotificationIds();
                if (notificationIds2 != null && notificationIds2.length() > 0) {
                    dVar3 = ab.d.INDIRECT;
                    jSONArray = notificationIds2;
                }
                JSONArray inAppMessagesIds2 = indirectBody.getInAppMessagesIds();
                if (inAppMessagesIds2 != null && inAppMessagesIds2.length() > 0) {
                    dVar = ab.d.INDIRECT;
                    jSONArray2 = inAppMessagesIds2;
                }
            }
            ContentValues contentValues = new ContentValues();
            com.onesignal.session.internal.outcomes.impl.f fVar = this.$eventParams;
            contentValues.put(bb.e.NOTIFICATIONS_IDS, jSONArray.toString());
            contentValues.put("iam_ids", jSONArray2.toString());
            String obj2 = dVar3.toString();
            Locale locale = Locale.ROOT;
            pc.j.d(locale, "ROOT");
            String lowerCase = obj2.toLowerCase(locale);
            pc.j.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            contentValues.put("notification_influence_type", lowerCase);
            String obj3 = dVar.toString();
            pc.j.d(locale, "ROOT");
            String lowerCase2 = obj3.toLowerCase(locale);
            pc.j.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            contentValues.put("iam_influence_type", lowerCase2);
            contentValues.put("name", fVar.getOutcomeId());
            contentValues.put("weight", new Float(fVar.getWeight()));
            contentValues.put("timestamp", new Long(fVar.getTimestamp()));
            contentValues.put("session_time", new Long(fVar.getSessionTime()));
            this.this$0._databaseProvider.getOs().insert("outcome", null, contentValues);
            return contentValues;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((g) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class h extends hc.j implements oc.e {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.onesignal.session.internal.outcomes.impl.f fVar, l lVar, fc.d dVar) {
            super(2, dVar);
            this.$eventParams = fVar;
            this.this$0 = lVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new h(this.$eventParams, this.this$0, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            String outcomeId = this.$eventParams.getOutcomeId();
            ArrayList arrayList = new ArrayList();
            m outcomeSource = this.$eventParams.getOutcomeSource();
            n directBody = outcomeSource != null ? outcomeSource.getDirectBody() : null;
            m outcomeSource2 = this.$eventParams.getOutcomeSource();
            n indirectBody = outcomeSource2 != null ? outcomeSource2.getIndirectBody() : null;
            this.this$0.addIdsToListFromSource(arrayList, directBody);
            this.this$0.addIdsToListFromSource(arrayList, indirectBody);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                com.onesignal.session.internal.outcomes.impl.a aVar = (com.onesignal.session.internal.outcomes.impl.a) obj2;
                ContentValues contentValues = new ContentValues();
                contentValues.put("channel_influence_id", aVar.getInfluenceId());
                contentValues.put("channel_type", aVar.getChannel().toString());
                contentValues.put("name", outcomeId);
                this.this$0._databaseProvider.getOs().insert("cached_unique_outcome", null, contentValues);
            }
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((h) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    public l(t8.d dVar) {
        pc.j.e(dVar, "_databaseProvider");
        this._databaseProvider = dVar;
    }

    private final void addIdToListFromChannel(List<com.onesignal.session.internal.outcomes.impl.a> list, JSONArray jSONArray, ab.c cVar) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    String string = jSONArray.getString(i10);
                    pc.j.d(string, "influenceId");
                    list.add(new com.onesignal.session.internal.outcomes.impl.a(string, cVar));
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addIdsToListFromSource(List<com.onesignal.session.internal.outcomes.impl.a> list, n nVar) {
        if (nVar != null) {
            JSONArray inAppMessagesIds = nVar.getInAppMessagesIds();
            JSONArray notificationIds = nVar.getNotificationIds();
            addIdToListFromChannel(list, inAppMessagesIds, ab.c.IAM);
            addIdToListFromChannel(list, notificationIds, ab.c.NOTIFICATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getIAMInfluenceSource(ab.d dVar, n nVar, n nVar2, String str, m mVar) {
        m directBody;
        m indirectBody;
        int i10 = k.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i10 == 1) {
            nVar.setInAppMessagesIds(new JSONArray(str));
            return (mVar == null || (directBody = mVar.setDirectBody(nVar)) == null) ? new m(nVar, null) : directBody;
        }
        if (i10 != 2) {
            return mVar;
        }
        nVar2.setInAppMessagesIds(new JSONArray(str));
        return (mVar == null || (indirectBody = mVar.setIndirectBody(nVar2)) == null) ? new m(null, nVar2) : indirectBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getNotificationInfluenceSource(ab.d dVar, n nVar, n nVar2, String str) {
        int i10 = k.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i10 == 1) {
            nVar.setNotificationIds(new JSONArray(str));
            return new m(nVar, null);
        }
        if (i10 != 2) {
            return null;
        }
        nVar2.setNotificationIds(new JSONArray(str));
        return new m(null, nVar2);
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object cleanCachedUniqueOutcomeEventNotifications(fc.d dVar) {
        Object A = a0.A(i0.f8861c, new a("notification", bb.e.NOTIFICATION_ID_TAG, this, null), dVar);
        return A == gc.a.f2559g ? A : ac.o.f277a;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object deleteOldOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, fc.d dVar) {
        Object A = a0.A(i0.f8861c, new b(fVar, null), dVar);
        return A == gc.a.f2559g ? A : ac.o.f277a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.onesignal.session.internal.outcomes.impl.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAllEventsToSend(fc.d dVar) {
        c cVar;
        int i10;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i11 = cVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar.label = i11 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                i10 = cVar.label;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) cVar.L$0;
                    v6.a.W(obj);
                    return list;
                }
                v6.a.W(obj);
                ArrayList arrayList = new ArrayList();
                fd.d dVar2 = i0.f8861c;
                d dVar3 = new d(arrayList, null);
                cVar.L$0 = arrayList;
                cVar.label = 1;
                Object A = a0.A(dVar2, dVar3, cVar);
                gc.a aVar = gc.a.f2559g;
                return A == aVar ? aVar : arrayList;
            }
        }
        cVar = new c(dVar);
        Object obj2 = cVar.result;
        i10 = cVar.label;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // com.onesignal.session.internal.outcomes.impl.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getNotCachedUniqueInfluencesForOutcome(String str, List<ab.b> list, fc.d dVar) {
        e eVar;
        int i10;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i11 = eVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.label = i11 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                i10 = eVar.label;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) eVar.L$0;
                    v6.a.W(obj);
                    return list2;
                }
                v6.a.W(obj);
                ArrayList arrayList = new ArrayList();
                fd.d dVar2 = i0.f8861c;
                f fVar = new f(list, str, this, arrayList, null);
                eVar.L$0 = arrayList;
                eVar.label = 1;
                Object A = a0.A(dVar2, fVar, eVar);
                gc.a aVar = gc.a.f2559g;
                return A == aVar ? aVar : arrayList;
            }
        }
        eVar = new e(dVar);
        Object obj2 = eVar.result;
        i10 = eVar.label;
        if (i10 == 0) {
        }
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object saveOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, fc.d dVar) {
        Object A = a0.A(i0.f8861c, new g(fVar, this, null), dVar);
        return A == gc.a.f2559g ? A : ac.o.f277a;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object saveUniqueOutcomeEventParams(com.onesignal.session.internal.outcomes.impl.f fVar, fc.d dVar) {
        com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsCache.saveUniqueOutcomeEventParams(eventParams: " + fVar + ')', null, 2, null);
        Object A = a0.A(i0.f8861c, new h(fVar, this, null), dVar);
        return A == gc.a.f2559g ? A : ac.o.f277a;
    }
}
