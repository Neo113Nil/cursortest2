package com.onesignal.session.internal.outcomes.impl;

import I7.p;
import K5.d;
import S7.AbstractC0406y;
import S7.F;
import S7.InterfaceC0404w;
import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import u7.v;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class l implements com.onesignal.session.internal.outcomes.impl.d {
    private final A4.d _databaseProvider;

    public static final class a extends B7.h implements p {
        final /* synthetic */ String $notificationIdColumnName;
        final /* synthetic */ String $notificationTableName;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, l lVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$notificationTableName = str;
            this.$notificationIdColumnName = str2;
            this.this$0 = lVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new a(this.$notificationTableName, this.$notificationIdColumnName, this.this$0, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((a) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            StringBuilder sb = new StringBuilder("NOT EXISTS(SELECT NULL FROM ");
            sb.append(this.$notificationTableName);
            sb.append(" n WHERE n.");
            sb.append(this.$notificationIdColumnName);
            sb.append(" = channel_influence_id AND channel_type = \"");
            String cVar = K5.c.NOTIFICATION.toString();
            Locale ROOT = Locale.ROOT;
            kotlin.jvm.internal.h.d(ROOT, "ROOT");
            String lowerCase = cVar.toLowerCase(ROOT);
            kotlin.jvm.internal.h.d(lowerCase, "toLowerCase(...)");
            this.this$0._databaseProvider.getOs().delete("cached_unique_outcome", u1.h.g(sb, lowerCase, "\")"), null);
            return v.f41353a;
        }
    }

    public static final class b extends B7.h implements p {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$event = fVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return l.this.new b(this.$event, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((b) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            l.this._databaseProvider.getOs().delete("outcome", "timestamp = ?", new String[]{String.valueOf(this.$event.getTimestamp())});
            return v.f41353a;
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
            return l.this.getAllEventsToSend(this);
        }
    }

    public static final class d extends B7.h implements p {
        final /* synthetic */ List<com.onesignal.session.internal.outcomes.impl.f> $events;
        int label;

        public static final class a extends kotlin.jvm.internal.i implements I7.l {
            final /* synthetic */ List<com.onesignal.session.internal.outcomes.impl.f> $events;
            final /* synthetic */ l this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar, List<com.onesignal.session.internal.outcomes.impl.f> list) {
                super(1);
                this.this$0 = lVar;
                this.$events = list;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((A4.a) obj);
                return v.f41353a;
            }

            public final void invoke(A4.a cursor) {
                kotlin.jvm.internal.h.e(cursor, "cursor");
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString("notification_influence_type");
                        d.a aVar = K5.d.Companion;
                        K5.d fromString = aVar.fromString(string);
                        K5.d fromString2 = aVar.fromString(cursor.getString("iam_influence_type"));
                        String optString = cursor.getOptString(L5.e.NOTIFICATIONS_IDS);
                        if (optString == null) {
                            optString = "[]";
                        }
                        String optString2 = cursor.getOptString("iam_ids");
                        String str = optString2 == null ? "[]" : optString2;
                        String string2 = cursor.getString("name");
                        float f3 = cursor.getFloat("weight");
                        long j6 = cursor.getLong(com.anythink.expressad.foundation.d.d.f18596u);
                        long j9 = cursor.getLong("session_time");
                        try {
                            n nVar = new n(null, null, 3, null);
                            n nVar2 = new n(null, null, 3, null);
                            m notificationInfluenceSource = this.this$0.getNotificationInfluenceSource(fromString, nVar, nVar2, optString);
                            this.this$0.getIAMInfluenceSource(fromString2, nVar, nVar2, str, notificationInfluenceSource);
                            if (notificationInfluenceSource == null) {
                                notificationInfluenceSource = new m(null, null);
                            }
                            this.$events.add(new com.onesignal.session.internal.outcomes.impl.f(string2, notificationInfluenceSource, f3, j9, j6));
                        } catch (JSONException e9) {
                            com.onesignal.debug.internal.logging.b.error("Generating JSONArray from notifications ids outcome:JSON Failed.", e9);
                        }
                    } while (cursor.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<com.onesignal.session.internal.outcomes.impl.f> list, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$events = list;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return l.this.new d(this.$events, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((d) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            N5.a.INSTANCE.run(l.this._databaseProvider);
            A4.b.query$default(l.this._databaseProvider.getOs(), "outcome", null, null, null, null, null, null, null, new a(l.this, this.$events), 254, null);
            return v.f41353a;
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
            return l.this.getNotCachedUniqueInfluencesForOutcome(null, null, this);
        }
    }

    public static final class f extends B7.h implements p {
        final /* synthetic */ List<K5.b> $influences;
        final /* synthetic */ String $name;
        final /* synthetic */ List<K5.b> $uniqueInfluences;
        int label;
        final /* synthetic */ l this$0;

        public static final class a extends kotlin.jvm.internal.i implements I7.l {
            final /* synthetic */ JSONArray $availableInfluenceIds;
            final /* synthetic */ String $channelInfluenceId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(JSONArray jSONArray, String str) {
                super(1);
                this.$availableInfluenceIds = jSONArray;
                this.$channelInfluenceId = str;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((A4.a) obj);
                return v.f41353a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.getCount() == 0) {
                    this.$availableInfluenceIds.put(this.$channelInfluenceId);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<K5.b> list, String str, l lVar, List<K5.b> list2, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$influences = list;
            this.$name = str;
            this.this$0 = lVar;
            this.$uniqueInfluences = list2;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new f(this.$influences, this.$name, this.this$0, this.$uniqueInfluences, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((f) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            try {
                for (K5.b bVar : this.$influences) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray ids = bVar.getIds();
                    if (ids != null) {
                        int length = ids.length();
                        for (int i = 0; i < length; i++) {
                            String string = ids.getString(i);
                            A4.b.query$default(this.this$0._databaseProvider.getOs(), "cached_unique_outcome", new String[0], "channel_influence_id = ? AND channel_type = ? AND name = ?", new String[]{string, bVar.getInfluenceChannel().toString(), this.$name}, null, null, null, "1", new a(jSONArray, string), 112, null);
                        }
                        if (jSONArray.length() > 0) {
                            K5.b copy = bVar.copy();
                            copy.setIds(jSONArray);
                            this.$uniqueInfluences.add(copy);
                        }
                    }
                }
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
            return v.f41353a;
        }
    }

    public static final class g extends B7.h implements p {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.onesignal.session.internal.outcomes.impl.f fVar, l lVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$eventParams = fVar;
            this.this$0 = lVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new g(this.$eventParams, this.this$0, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((g) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            K5.d dVar;
            n indirectBody;
            n directBody;
            K5.d dVar2;
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            K5.d dVar3 = K5.d.UNATTRIBUTED;
            m outcomeSource = this.$eventParams.getOutcomeSource();
            if (outcomeSource == null || (directBody = outcomeSource.getDirectBody()) == null) {
                dVar = dVar3;
            } else {
                JSONArray notificationIds = directBody.getNotificationIds();
                if (notificationIds == null || notificationIds.length() <= 0) {
                    dVar2 = dVar3;
                } else {
                    dVar2 = K5.d.DIRECT;
                    jSONArray = notificationIds;
                }
                JSONArray inAppMessagesIds = directBody.getInAppMessagesIds();
                if (inAppMessagesIds != null && inAppMessagesIds.length() > 0) {
                    dVar3 = K5.d.DIRECT;
                    jSONArray2 = inAppMessagesIds;
                }
                dVar = dVar3;
                dVar3 = dVar2;
            }
            m outcomeSource2 = this.$eventParams.getOutcomeSource();
            if (outcomeSource2 != null && (indirectBody = outcomeSource2.getIndirectBody()) != null) {
                JSONArray notificationIds2 = indirectBody.getNotificationIds();
                if (notificationIds2 != null && notificationIds2.length() > 0) {
                    dVar3 = K5.d.INDIRECT;
                    jSONArray = notificationIds2;
                }
                JSONArray inAppMessagesIds2 = indirectBody.getInAppMessagesIds();
                if (inAppMessagesIds2 != null && inAppMessagesIds2.length() > 0) {
                    dVar = K5.d.INDIRECT;
                    jSONArray2 = inAppMessagesIds2;
                }
            }
            ContentValues contentValues = new ContentValues();
            com.onesignal.session.internal.outcomes.impl.f fVar = this.$eventParams;
            contentValues.put(L5.e.NOTIFICATIONS_IDS, jSONArray.toString());
            contentValues.put("iam_ids", jSONArray2.toString());
            String obj2 = dVar3.toString();
            Locale ROOT = Locale.ROOT;
            kotlin.jvm.internal.h.d(ROOT, "ROOT");
            String lowerCase = obj2.toLowerCase(ROOT);
            kotlin.jvm.internal.h.d(lowerCase, "toLowerCase(...)");
            contentValues.put("notification_influence_type", lowerCase);
            String obj3 = dVar.toString();
            kotlin.jvm.internal.h.d(ROOT, "ROOT");
            String lowerCase2 = obj3.toLowerCase(ROOT);
            kotlin.jvm.internal.h.d(lowerCase2, "toLowerCase(...)");
            contentValues.put("iam_influence_type", lowerCase2);
            contentValues.put("name", fVar.getOutcomeId());
            contentValues.put("weight", new Float(fVar.getWeight()));
            contentValues.put(com.anythink.expressad.foundation.d.d.f18596u, new Long(fVar.getTimestamp()));
            contentValues.put("session_time", new Long(fVar.getSessionTime()));
            this.this$0._databaseProvider.getOs().insert("outcome", null, contentValues);
            return contentValues;
        }
    }

    public static final class h extends B7.h implements p {
        final /* synthetic */ com.onesignal.session.internal.outcomes.impl.f $eventParams;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.onesignal.session.internal.outcomes.impl.f fVar, l lVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$eventParams = fVar;
            this.this$0 = lVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new h(this.$eventParams, this.this$0, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((h) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(v.f41353a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            String outcomeId = this.$eventParams.getOutcomeId();
            ArrayList<com.onesignal.session.internal.outcomes.impl.a> arrayList = new ArrayList();
            m outcomeSource = this.$eventParams.getOutcomeSource();
            n directBody = outcomeSource != null ? outcomeSource.getDirectBody() : null;
            m outcomeSource2 = this.$eventParams.getOutcomeSource();
            n indirectBody = outcomeSource2 != null ? outcomeSource2.getIndirectBody() : null;
            this.this$0.addIdsToListFromSource(arrayList, directBody);
            this.this$0.addIdsToListFromSource(arrayList, indirectBody);
            for (com.onesignal.session.internal.outcomes.impl.a aVar2 : arrayList) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("channel_influence_id", aVar2.getInfluenceId());
                contentValues.put("channel_type", aVar2.getChannel().toString());
                contentValues.put("name", outcomeId);
                this.this$0._databaseProvider.getOs().insert("cached_unique_outcome", null, contentValues);
            }
            return v.f41353a;
        }
    }

    public l(A4.d _databaseProvider) {
        kotlin.jvm.internal.h.e(_databaseProvider, "_databaseProvider");
        this._databaseProvider = _databaseProvider;
    }

    private final void addIdToListFromChannel(List<com.onesignal.session.internal.outcomes.impl.a> list, JSONArray jSONArray, K5.c cVar) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    kotlin.jvm.internal.h.b(string);
                    list.add(new com.onesignal.session.internal.outcomes.impl.a(string, cVar));
                } catch (JSONException e9) {
                    e9.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addIdsToListFromSource(List<com.onesignal.session.internal.outcomes.impl.a> list, n nVar) {
        if (nVar != null) {
            JSONArray inAppMessagesIds = nVar.getInAppMessagesIds();
            JSONArray notificationIds = nVar.getNotificationIds();
            addIdToListFromChannel(list, inAppMessagesIds, K5.c.IAM);
            addIdToListFromChannel(list, notificationIds, K5.c.NOTIFICATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getIAMInfluenceSource(K5.d dVar, n nVar, n nVar2, String str, m mVar) {
        m directBody;
        m indirectBody;
        int i = k.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i == 1) {
            nVar.setInAppMessagesIds(new JSONArray(str));
            return (mVar == null || (directBody = mVar.setDirectBody(nVar)) == null) ? new m(nVar, null) : directBody;
        }
        if (i != 2) {
            return mVar;
        }
        nVar2.setInAppMessagesIds(new JSONArray(str));
        return (mVar == null || (indirectBody = mVar.setIndirectBody(nVar2)) == null) ? new m(null, nVar2) : indirectBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getNotificationInfluenceSource(K5.d dVar, n nVar, n nVar2, String str) {
        int i = k.$EnumSwitchMapping$0[dVar.ordinal()];
        if (i == 1) {
            nVar.setNotificationIds(new JSONArray(str));
            return new m(nVar, null);
        }
        if (i != 2) {
            return null;
        }
        nVar2.setNotificationIds(new JSONArray(str));
        return new m(null, nVar2);
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object cleanCachedUniqueOutcomeEventNotifications(InterfaceC5267d interfaceC5267d) {
        Object y7 = AbstractC0406y.y(F.f2917c, new a("notification", L5.e.NOTIFICATION_ID_TAG, this, null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : v.f41353a;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object deleteOldOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC5267d interfaceC5267d) {
        Object y7 = AbstractC0406y.y(F.f2917c, new b(fVar, null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : v.f41353a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.session.internal.outcomes.impl.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAllEventsToSend(InterfaceC5267d interfaceC5267d) {
        c cVar;
        int i;
        if (interfaceC5267d instanceof c) {
            cVar = (c) interfaceC5267d;
            int i6 = cVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cVar.label = i6 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                A7.a aVar = A7.a.f58n;
                i = cVar.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) cVar.L$0;
                    com.bumptech.glide.d.k(obj);
                    return list;
                }
                com.bumptech.glide.d.k(obj);
                ArrayList arrayList = new ArrayList();
                Z7.d dVar = F.f2917c;
                d dVar2 = new d(arrayList, null);
                cVar.L$0 = arrayList;
                cVar.label = 1;
                return AbstractC0406y.y(dVar, dVar2, cVar) == aVar ? aVar : arrayList;
            }
        }
        cVar = new c(interfaceC5267d);
        Object obj2 = cVar.result;
        A7.a aVar2 = A7.a.f58n;
        i = cVar.label;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // com.onesignal.session.internal.outcomes.impl.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getNotCachedUniqueInfluencesForOutcome(String str, List<K5.b> list, InterfaceC5267d interfaceC5267d) {
        e eVar;
        int i;
        if (interfaceC5267d instanceof e) {
            eVar = (e) interfaceC5267d;
            int i6 = eVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                eVar.label = i6 - Integer.MIN_VALUE;
                Object obj = eVar.result;
                A7.a aVar = A7.a.f58n;
                i = eVar.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) eVar.L$0;
                    com.bumptech.glide.d.k(obj);
                    return list2;
                }
                com.bumptech.glide.d.k(obj);
                ArrayList arrayList = new ArrayList();
                Z7.d dVar = F.f2917c;
                f fVar = new f(list, str, this, arrayList, null);
                eVar.L$0 = arrayList;
                eVar.label = 1;
                return AbstractC0406y.y(dVar, fVar, eVar) == aVar ? aVar : arrayList;
            }
        }
        eVar = new e(interfaceC5267d);
        Object obj2 = eVar.result;
        A7.a aVar2 = A7.a.f58n;
        i = eVar.label;
        if (i == 0) {
        }
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object saveOutcomeEvent(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC5267d interfaceC5267d) {
        Object y7 = AbstractC0406y.y(F.f2917c, new g(fVar, this, null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : v.f41353a;
    }

    @Override // com.onesignal.session.internal.outcomes.impl.d
    public Object saveUniqueOutcomeEventParams(com.onesignal.session.internal.outcomes.impl.f fVar, InterfaceC5267d interfaceC5267d) {
        com.onesignal.debug.internal.logging.b.debug$default("OutcomeEventsCache.saveUniqueOutcomeEventParams(eventParams: " + fVar + ')', null, 2, null);
        Object y7 = AbstractC0406y.y(F.f2917c, new h(fVar, this, null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : v.f41353a;
    }
}
