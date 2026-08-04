package com.gamericefishpro.space.fe;

import android.content.ContentValues;
import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.pi.a0;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.qd.h;
import com.gamericefishpro.space.vh.i;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.ee.a {
    public static final C0014a Companion = new C0014a(null);
    public static final long IAM_CACHE_DATA_LIFETIME = 15552000;
    private final com.gamericefishpro.space.tc.d _databaseProvider;
    private final com.gamericefishpro.space.zd.a _prefs;
    private final com.gamericefishpro.space.kd.a _time;

    /* JADX INFO: renamed from: com.gamericefishpro.space.fe.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0014a {
        public /* synthetic */ C0014a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0014a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends i implements Function2 {
        int label;

        /* JADX INFO: renamed from: com.gamericefishpro.space.fe.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class C0015a extends l implements Function1 {
            final /* synthetic */ Set<String> $oldClickedClickIds;
            final /* synthetic */ Set<String> $oldMessageIds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0015a(Set<String> set, Set<String> set2) {
                super(1);
                this.$oldMessageIds = set;
                this.$oldClickedClickIds = set2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.gamericefishpro.space.tc.a) obj);
                return Unit.a;
            }

            public final void invoke(com.gamericefishpro.space.tc.a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.getCount() == 0) {
                    com.gamericefishpro.space.od.b.debug$default("Attempted to clean 6 month old IAM data, but none exists!", null, 2, null);
                    return;
                }
                if (it.moveToFirst()) {
                    do {
                        String string = it.getString("message_id");
                        String string2 = it.getString("click_ids");
                        this.$oldMessageIds.add(string);
                        this.$oldClickedClickIds.addAll(com.gamericefishpro.space.yb.e.INSTANCE.newStringSetFromJSONArray(new JSONArray(string2)));
                    } while (it.moveToNext());
                }
            }
        }

        public b(com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return a.this.new b(aVar);
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
            String[] strArr = {"message_id", "click_ids"};
            String[] strArr2 = {String.valueOf((System.currentTimeMillis() / 1000) - a.IAM_CACHE_DATA_LIFETIME)};
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            try {
                com.gamericefishpro.space.tc.b.query$default(a.this._databaseProvider.getOs(), "in_app_message", strArr, "last_display < ?", strArr2, null, null, null, null, new C0015a(linkedHashSet, linkedHashSet2), 240, null);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            a.this._databaseProvider.getOs().delete("in_app_message", "last_display < ?", strArr2);
            a.this._prefs.cleanInAppMessageIds(linkedHashSet);
            a.this._prefs.cleanInAppMessageClickedClickIds(linkedHashSet2);
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
            return a.this.listInAppMessages(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends i implements Function2 {
        final /* synthetic */ List<com.gamericefishpro.space.qd.a> $inAppMessages;
        int label;

        /* JADX INFO: renamed from: com.gamericefishpro.space.fe.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class C0016a extends l implements Function1 {
            final /* synthetic */ List<com.gamericefishpro.space.qd.a> $inAppMessages;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0016a(a aVar, List<com.gamericefishpro.space.qd.a> list) {
                super(1);
                this.this$0 = aVar;
                this.$inAppMessages = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.gamericefishpro.space.tc.a) obj);
                return Unit.a;
            }

            public final void invoke(com.gamericefishpro.space.tc.a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.moveToFirst()) {
                    do {
                        this.$inAppMessages.add(new com.gamericefishpro.space.qd.a(it.getString("message_id"), com.gamericefishpro.space.yb.e.INSTANCE.newStringSetFromJSONArray(new JSONArray(it.getString("click_ids"))), it.getInt("displayed_in_session") == 1, new h(it.getInt("display_quantity"), it.getLong("last_display"), this.this$0._time), this.this$0._time));
                    } while (it.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<com.gamericefishpro.space.qd.a> list, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$inAppMessages = list;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return a.this.new d(this.$inAppMessages, aVar);
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
            try {
                com.gamericefishpro.space.tc.b.query$default(a.this._databaseProvider.getOs(), "in_app_message", null, null, null, null, null, null, null, new C0016a(a.this, this.$inAppMessages), 254, null);
            } catch (JSONException e) {
                com.gamericefishpro.space.od.b.error("Generating JSONArray from iam click ids:JSON Failed.", e);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends i implements Function2 {
        final /* synthetic */ com.gamericefishpro.space.qd.a $inAppMessage;
        final /* synthetic */ ContentValues $values;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ContentValues contentValues, com.gamericefishpro.space.qd.a aVar, com.gamericefishpro.space.th.a aVar2) {
            super(2, aVar2);
            this.$values = contentValues;
            this.$inAppMessage = aVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return a.this.new e(this.$values, this.$inAppMessage, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((e) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            if (a.this._databaseProvider.getOs().update("in_app_message", this.$values, "message_id = ?", new String[]{this.$inAppMessage.getMessageId()}) == 0) {
                a.this._databaseProvider.getOs().insert("in_app_message", null, this.$values);
            }
            return Unit.a;
        }
    }

    public a(com.gamericefishpro.space.tc.d _databaseProvider, com.gamericefishpro.space.kd.a _time, com.gamericefishpro.space.zd.a _prefs) {
        Intrinsics.checkNotNullParameter(_databaseProvider, "_databaseProvider");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._databaseProvider = _databaseProvider;
        this._time = _time;
        this._prefs = _prefs;
    }

    @Override // com.gamericefishpro.space.ee.a
    public Object cleanCachedInAppMessages(com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = a0.D(com.gamericefishpro.space.wi.d.i, new b(null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.ee.a
    public Object listInAppMessages(com.gamericefishpro.space.th.a aVar) {
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
        return a0.D(dVar, dVar2, cVar) == aVar2 ? aVar2 : arrayList;
    }

    @Override // com.gamericefishpro.space.ee.a
    public Object saveInAppMessage(com.gamericefishpro.space.qd.a aVar, com.gamericefishpro.space.th.a aVar2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", aVar.getMessageId());
        contentValues.put("display_quantity", new Integer(aVar.getRedisplayStats().getDisplayQuantity()));
        contentValues.put("last_display", new Long(aVar.getRedisplayStats().getLastDisplayTime()));
        contentValues.put("click_ids", aVar.getClickedClickIds().toString());
        contentValues.put("displayed_in_session", Boolean.valueOf(aVar.isDisplayedInSession()));
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = a0.D(com.gamericefishpro.space.wi.d.i, new e(contentValues, aVar, null), aVar2);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }
}
