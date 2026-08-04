package com.gamericefishpro.space.pg;

import android.content.ContentValues;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.t0.y0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements com.gamericefishpro.space.pg.d {
    private final com.gamericefishpro.space.tc.d _databaseProvider;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ String $notificationIdColumnName;
        final /* synthetic */ String $notificationTableName;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, l lVar, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$notificationTableName = str;
            this.$notificationIdColumnName = str2;
            this.this$0 = lVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new a(this.$notificationTableName, this.$notificationIdColumnName, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((a) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            StringBuilder sb = new StringBuilder("NOT EXISTS(SELECT NULL FROM ");
            sb.append(this.$notificationTableName);
            sb.append(" n WHERE n.");
            sb.append(this.$notificationIdColumnName);
            sb.append(" = channel_influence_id AND channel_type = \"");
            String string = com.gamericefishpro.space.mg.c.NOTIFICATION.toString();
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = string.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            this.this$0._databaseProvider.getOs().delete("cached_unique_outcome", y0.j(sb, lowerCase, "\")"), null);
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ com.gamericefishpro.space.pg.f $event;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.gamericefishpro.space.pg.f fVar, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$event = fVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return l.this.new b(this.$event, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((b) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            l.this._databaseProvider.getOs().delete("outcome", "timestamp = ?", new String[]{String.valueOf(this.$event.getTimestamp())});
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.getAllEventsToSend(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ List<com.gamericefishpro.space.pg.f> $events;
        int label;

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends com.gamericefishpro.space.ei.l implements Function1 {
            final /* synthetic */ List<com.gamericefishpro.space.pg.f> $events;
            final /* synthetic */ l this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l lVar, List<com.gamericefishpro.space.pg.f> list) {
                super(1);
                this.this$0 = lVar;
                this.$events = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.gamericefishpro.space.tc.a) obj);
                return Unit.a;
            }

            public final void invoke(com.gamericefishpro.space.tc.a cursor) {
                Intrinsics.checkNotNullParameter(cursor, "cursor");
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString("notification_influence_type");
                        com.gamericefishpro.space.mg.d.a aVar = com.gamericefishpro.space.mg.d.Companion;
                        com.gamericefishpro.space.mg.d dVarFromString = aVar.fromString(string);
                        com.gamericefishpro.space.mg.d dVarFromString2 = aVar.fromString(cursor.getString("iam_influence_type"));
                        String optString = cursor.getOptString(com.gamericefishpro.space.ng.e.NOTIFICATIONS_IDS);
                        if (optString == null) {
                            optString = "[]";
                        }
                        String optString2 = cursor.getOptString("iam_ids");
                        String str = optString2 == null ? "[]" : optString2;
                        String string2 = cursor.getString("name");
                        float f = cursor.getFloat("weight");
                        long j = cursor.getLong("timestamp");
                        long j2 = cursor.getLong("session_time");
                        try {
                            n nVar = new n(null, null, 3, null);
                            n nVar2 = new n(null, null, 3, null);
                            m notificationInfluenceSource = this.this$0.getNotificationInfluenceSource(dVarFromString, nVar, nVar2, optString);
                            this.this$0.getIAMInfluenceSource(dVarFromString2, nVar, nVar2, str, notificationInfluenceSource);
                            if (notificationInfluenceSource == null) {
                                notificationInfluenceSource = new m(null, null);
                            }
                            this.$events.add(new com.gamericefishpro.space.pg.f(string2, notificationInfluenceSource, f, j2, j));
                        } catch (JSONException e) {
                            com.gamericefishpro.space.od.b.error("Generating JSONArray from notifications ids outcome:JSON Failed.", e);
                        }
                    } while (cursor.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<com.gamericefishpro.space.pg.f> list, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$events = list;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return l.this.new d(this.$events, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((d) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.qg.a.INSTANCE.run(l.this._databaseProvider);
            com.gamericefishpro.space.tc.b.query$default(l.this._databaseProvider.getOs(), "outcome", null, null, null, null, null, null, null, new a(l.this, this.$events), 254, null);
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public e(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return l.this.getNotCachedUniqueInfluencesForOutcome(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ List<com.gamericefishpro.space.mg.b> $influences;
        final /* synthetic */ String $name;
        final /* synthetic */ List<com.gamericefishpro.space.mg.b> $uniqueInfluences;
        int label;
        final /* synthetic */ l this$0;

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends com.gamericefishpro.space.ei.l implements Function1 {
            final /* synthetic */ JSONArray $availableInfluenceIds;
            final /* synthetic */ String $channelInfluenceId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(JSONArray jSONArray, String str) {
                super(1);
                this.$availableInfluenceIds = jSONArray;
                this.$channelInfluenceId = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.gamericefishpro.space.tc.a) obj);
                return Unit.a;
            }

            public final void invoke(com.gamericefishpro.space.tc.a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getCount() == 0) {
                    this.$availableInfluenceIds.put(this.$channelInfluenceId);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<com.gamericefishpro.space.mg.b> list, String str, l lVar, List<com.gamericefishpro.space.mg.b> list2, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$influences = list;
            this.$name = str;
            this.this$0 = lVar;
            this.$uniqueInfluences = list2;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new f(this.$influences, this.$name, this.this$0, this.$uniqueInfluences, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((f) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            try {
                for (com.gamericefishpro.space.mg.b bVar : this.$influences) {
                    JSONArray jSONArray = new JSONArray();
                    JSONArray ids = bVar.getIds();
                    if (ids != null) {
                        int length = ids.length();
                        for (int i = 0; i < length; i++) {
                            String string = ids.getString(i);
                            com.gamericefishpro.space.tc.b.query$default(this.this$0._databaseProvider.getOs(), "cached_unique_outcome", new String[0], "channel_influence_id = ? AND channel_type = ? AND name = ?", new String[]{string, bVar.getInfluenceChannel().toString(), this.$name}, null, null, null, "1", new a(jSONArray, string), 112, null);
                        }
                        if (jSONArray.length() > 0) {
                            com.gamericefishpro.space.mg.b bVarCopy = bVar.copy();
                            bVarCopy.setIds(jSONArray);
                            this.$uniqueInfluences.add(bVarCopy);
                        }
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class g extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ com.gamericefishpro.space.pg.f $eventParams;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(com.gamericefishpro.space.pg.f fVar, l lVar, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$eventParams = fVar;
            this.this$0 = lVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new g(this.$eventParams, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((g) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            n indirectBody;
            n directBody;
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            a0 a0Var = new a0();
            a0Var.d = new JSONArray();
            a0 a0Var2 = new a0();
            a0Var2.d = new JSONArray();
            a0 a0Var3 = new a0();
            com.gamericefishpro.space.mg.d dVar = com.gamericefishpro.space.mg.d.UNATTRIBUTED;
            a0Var3.d = dVar;
            a0 a0Var4 = new a0();
            a0Var4.d = dVar;
            m outcomeSource = this.$eventParams.getOutcomeSource();
            if (outcomeSource != null && (directBody = outcomeSource.getDirectBody()) != null) {
                JSONArray notificationIds = directBody.getNotificationIds();
                if (notificationIds != null && notificationIds.length() > 0) {
                    a0Var3.d = com.gamericefishpro.space.mg.d.DIRECT;
                    a0Var.d = notificationIds;
                }
                JSONArray inAppMessagesIds = directBody.getInAppMessagesIds();
                if (inAppMessagesIds != null && inAppMessagesIds.length() > 0) {
                    a0Var4.d = com.gamericefishpro.space.mg.d.DIRECT;
                    a0Var2.d = inAppMessagesIds;
                }
            }
            m outcomeSource2 = this.$eventParams.getOutcomeSource();
            if (outcomeSource2 != null && (indirectBody = outcomeSource2.getIndirectBody()) != null) {
                JSONArray notificationIds2 = indirectBody.getNotificationIds();
                if (notificationIds2 != null && notificationIds2.length() > 0) {
                    a0Var3.d = com.gamericefishpro.space.mg.d.INDIRECT;
                    a0Var.d = notificationIds2;
                }
                JSONArray inAppMessagesIds2 = indirectBody.getInAppMessagesIds();
                if (inAppMessagesIds2 != null && inAppMessagesIds2.length() > 0) {
                    a0Var4.d = com.gamericefishpro.space.mg.d.INDIRECT;
                    a0Var2.d = inAppMessagesIds2;
                }
            }
            ContentValues contentValues = new ContentValues();
            com.gamericefishpro.space.pg.f fVar = this.$eventParams;
            contentValues.put(com.gamericefishpro.space.ng.e.NOTIFICATIONS_IDS, ((JSONArray) a0Var.d).toString());
            contentValues.put("iam_ids", ((JSONArray) a0Var2.d).toString());
            String string = ((com.gamericefishpro.space.mg.d) a0Var3.d).toString();
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = string.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            contentValues.put("notification_influence_type", lowerCase);
            String string2 = ((com.gamericefishpro.space.mg.d) a0Var4.d).toString();
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase2 = string2.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            contentValues.put("iam_influence_type", lowerCase2);
            contentValues.put("name", fVar.getOutcomeId());
            contentValues.put("weight", new Float(fVar.getWeight()));
            contentValues.put("timestamp", new Long(fVar.getTimestamp()));
            contentValues.put("session_time", new Long(fVar.getSessionTime()));
            this.this$0._databaseProvider.getOs().insert("outcome", null, contentValues);
            return contentValues;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class h extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ com.gamericefishpro.space.pg.f $eventParams;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(com.gamericefishpro.space.pg.f fVar, l lVar, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$eventParams = fVar;
            this.this$0 = lVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new h(this.$eventParams, this.this$0, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((h) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            String outcomeId = this.$eventParams.getOutcomeId();
            ArrayList arrayList = new ArrayList();
            m outcomeSource = this.$eventParams.getOutcomeSource();
            n directBody = outcomeSource != null ? outcomeSource.getDirectBody() : null;
            m outcomeSource2 = this.$eventParams.getOutcomeSource();
            n indirectBody = outcomeSource2 != null ? outcomeSource2.getIndirectBody() : null;
            this.this$0.addIdsToListFromSource(arrayList, directBody);
            this.this$0.addIdsToListFromSource(arrayList, indirectBody);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                com.gamericefishpro.space.pg.a aVar2 = (com.gamericefishpro.space.pg.a) obj2;
                ContentValues contentValues = new ContentValues();
                contentValues.put("channel_influence_id", aVar2.getInfluenceId());
                contentValues.put("channel_type", aVar2.getChannel().toString());
                contentValues.put("name", outcomeId);
                this.this$0._databaseProvider.getOs().insert("cached_unique_outcome", null, contentValues);
            }
            return Unit.a;
        }
    }

    public l(com.gamericefishpro.space.tc.d _databaseProvider) {
        Intrinsics.checkNotNullParameter(_databaseProvider, "_databaseProvider");
        this._databaseProvider = _databaseProvider;
    }

    private final void addIdToListFromChannel(List<com.gamericefishpro.space.pg.a> list, JSONArray jSONArray, com.gamericefishpro.space.mg.c cVar) {
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    String string = jSONArray.getString(i);
                    Intrinsics.b(string);
                    list.add(new com.gamericefishpro.space.pg.a(string, cVar));
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addIdsToListFromSource(List<com.gamericefishpro.space.pg.a> list, n nVar) {
        if (nVar != null) {
            JSONArray inAppMessagesIds = nVar.getInAppMessagesIds();
            JSONArray notificationIds = nVar.getNotificationIds();
            addIdToListFromChannel(list, inAppMessagesIds, com.gamericefishpro.space.mg.c.IAM);
            addIdToListFromChannel(list, notificationIds, com.gamericefishpro.space.mg.c.NOTIFICATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m getIAMInfluenceSource(com.gamericefishpro.space.mg.d dVar, n nVar, n nVar2, String str, m mVar) {
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
    public final m getNotificationInfluenceSource(com.gamericefishpro.space.mg.d dVar, n nVar, n nVar2, String str) {
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

    @Override // com.gamericefishpro.space.pg.d
    public Object cleanCachedUniqueOutcomeEventNotifications(com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = com.gamericefishpro.space.pi.a0.D(com.gamericefishpro.space.wi.d.i, new a("notification", com.gamericefishpro.space.ng.e.NOTIFICATION_ID_TAG, this, null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }

    @Override // com.gamericefishpro.space.pg.d
    public Object deleteOldOutcomeEvent(com.gamericefishpro.space.pg.f fVar, com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = com.gamericefishpro.space.pi.a0.D(com.gamericefishpro.space.wi.d.i, new b(fVar, null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.pg.d
    public Object getAllEventsToSend(com.gamericefishpro.space.th.a aVar) {
        c cVar;
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
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) cVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            return list;
        }
        com.gamericefishpro.space.wa.b.P(obj);
        ArrayList arrayList = new ArrayList();
        com.gamericefishpro.space.wi.e eVar = k0.a;
        com.gamericefishpro.space.wi.d dVar = com.gamericefishpro.space.wi.d.i;
        d dVar2 = new d(arrayList, null);
        cVar.L$0 = arrayList;
        cVar.label = 1;
        return com.gamericefishpro.space.pi.a0.D(dVar, dVar2, cVar) == aVar2 ? aVar2 : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.pg.d
    public Object getNotCachedUniqueInfluencesForOutcome(String str, List<com.gamericefishpro.space.mg.b> list, com.gamericefishpro.space.th.a aVar) {
        e eVar;
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
        Object obj = eVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i2 = eVar.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) eVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            return list2;
        }
        com.gamericefishpro.space.wa.b.P(obj);
        ArrayList arrayList = new ArrayList();
        com.gamericefishpro.space.wi.e eVar2 = k0.a;
        com.gamericefishpro.space.wi.d dVar = com.gamericefishpro.space.wi.d.i;
        f fVar = new f(list, str, this, arrayList, null);
        eVar.L$0 = arrayList;
        eVar.label = 1;
        return com.gamericefishpro.space.pi.a0.D(dVar, fVar, eVar) == aVar2 ? aVar2 : arrayList;
    }

    @Override // com.gamericefishpro.space.pg.d
    public Object saveOutcomeEvent(com.gamericefishpro.space.pg.f fVar, com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = com.gamericefishpro.space.pi.a0.D(com.gamericefishpro.space.wi.d.i, new g(fVar, this, null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }

    @Override // com.gamericefishpro.space.pg.d
    public Object saveUniqueOutcomeEventParams(com.gamericefishpro.space.pg.f fVar, com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.od.b.debug$default("OutcomeEventsCache.saveUniqueOutcomeEventParams(eventParams: " + fVar + ')', null, 2, null);
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = com.gamericefishpro.space.pi.a0.D(com.gamericefishpro.space.wi.d.i, new h(fVar, this, null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }
}
