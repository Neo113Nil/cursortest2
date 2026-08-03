package com.onesignal.inAppMessages.internal.repositories.impl;

import ac.o;
import android.content.ContentValues;
import com.onesignal.common.g;
import com.onesignal.inAppMessages.internal.h;
import hc.j;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import pc.f;
import pc.k;
import yc.a0;
import yc.i0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements r9.a {
    public static final C0033a Companion = new C0033a(null);
    public static final long IAM_CACHE_DATA_LIFETIME = 15552000;
    private final t8.d _databaseProvider;
    private final o9.a _prefs;
    private final e9.a _time;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$a, reason: collision with other inner class name */
    public static final class C0033a {
        public /* synthetic */ C0033a(f fVar) {
            this();
        }

        private C0033a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends j implements oc.e {
        int label;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$b$a, reason: collision with other inner class name */
        public static final class C0034a extends k implements oc.c {
            final /* synthetic */ Set<String> $oldClickedClickIds;
            final /* synthetic */ Set<String> $oldMessageIds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0034a(Set<String> set, Set<String> set2) {
                super(1);
                this.$oldMessageIds = set;
                this.$oldClickedClickIds = set2;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t8.a) obj);
                return o.f277a;
            }

            public final void invoke(t8.a aVar) {
                pc.j.e(aVar, "it");
                if (aVar.getCount() == 0) {
                    com.onesignal.debug.internal.logging.b.debug$default("Attempted to clean 6 month old IAM data, but none exists!", null, 2, null);
                    return;
                }
                if (aVar.moveToFirst()) {
                    do {
                        String string = aVar.getString("message_id");
                        String string2 = aVar.getString("click_ids");
                        this.$oldMessageIds.add(string);
                        this.$oldClickedClickIds.addAll(g.INSTANCE.newStringSetFromJSONArray(new JSONArray(string2)));
                    } while (aVar.moveToNext());
                }
            }
        }

        public b(fc.d dVar) {
            super(2, dVar);
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return a.this.new b(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            String[] strArr = {"message_id", "click_ids"};
            String[] strArr2 = {String.valueOf((System.currentTimeMillis() / 1000) - a.IAM_CACHE_DATA_LIFETIME)};
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            try {
                t8.b.query$default(a.this._databaseProvider.getOs(), "in_app_message", strArr, "last_display < ?", strArr2, null, null, null, null, new C0034a(linkedHashSet, linkedHashSet2), 240, null);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            a.this._databaseProvider.getOs().delete("in_app_message", "last_display < ?", strArr2);
            a.this._prefs.cleanInAppMessageIds(linkedHashSet);
            a.this._prefs.cleanInAppMessageClickedClickIds(linkedHashSet2);
            return o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((b) create(yVar, dVar)).invokeSuspend(o.f277a);
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
            return a.this.listInAppMessages(this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends j implements oc.e {
        final /* synthetic */ List<com.onesignal.inAppMessages.internal.a> $inAppMessages;
        int label;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$d$a, reason: collision with other inner class name */
        public static final class C0035a extends k implements oc.c {
            final /* synthetic */ List<com.onesignal.inAppMessages.internal.a> $inAppMessages;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0035a(a aVar, List<com.onesignal.inAppMessages.internal.a> list) {
                super(1);
                this.this$0 = aVar;
                this.$inAppMessages = list;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t8.a) obj);
                return o.f277a;
            }

            public final void invoke(t8.a aVar) {
                pc.j.e(aVar, "it");
                if (aVar.moveToFirst()) {
                    do {
                        this.$inAppMessages.add(new com.onesignal.inAppMessages.internal.a(aVar.getString("message_id"), g.INSTANCE.newStringSetFromJSONArray(new JSONArray(aVar.getString("click_ids"))), aVar.getInt("displayed_in_session") == 1, new h(aVar.getInt("display_quantity"), aVar.getLong("last_display"), this.this$0._time), this.this$0._time));
                    } while (aVar.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<com.onesignal.inAppMessages.internal.a> list, fc.d dVar) {
            super(2, dVar);
            this.$inAppMessages = list;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return a.this.new d(this.$inAppMessages, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            try {
                t8.b.query$default(a.this._databaseProvider.getOs(), "in_app_message", null, null, null, null, null, null, null, new C0035a(a.this, this.$inAppMessages), 254, null);
            } catch (JSONException e10) {
                com.onesignal.debug.internal.logging.b.error("Generating JSONArray from iam click ids:JSON Failed.", e10);
            }
            return o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((d) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends j implements oc.e {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $inAppMessage;
        final /* synthetic */ ContentValues $values;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ContentValues contentValues, com.onesignal.inAppMessages.internal.a aVar, fc.d dVar) {
            super(2, dVar);
            this.$values = contentValues;
            this.$inAppMessage = aVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return a.this.new e(this.$values, this.$inAppMessage, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            if (a.this._databaseProvider.getOs().update("in_app_message", this.$values, "message_id = ?", new String[]{this.$inAppMessage.getMessageId()}) == 0) {
                a.this._databaseProvider.getOs().insert("in_app_message", null, this.$values);
            }
            return o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((e) create(yVar, dVar)).invokeSuspend(o.f277a);
        }
    }

    public a(t8.d dVar, e9.a aVar, o9.a aVar2) {
        pc.j.e(dVar, "_databaseProvider");
        pc.j.e(aVar, "_time");
        pc.j.e(aVar2, "_prefs");
        this._databaseProvider = dVar;
        this._time = aVar;
        this._prefs = aVar2;
    }

    @Override // r9.a
    public Object cleanCachedInAppMessages(fc.d dVar) {
        Object A = a0.A(i0.f8861c, new b(null), dVar);
        return A == gc.a.f2559g ? A : o.f277a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // r9.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessages(fc.d dVar) {
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

    @Override // r9.a
    public Object saveInAppMessage(com.onesignal.inAppMessages.internal.a aVar, fc.d dVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", aVar.getMessageId());
        contentValues.put("display_quantity", new Integer(aVar.getRedisplayStats().getDisplayQuantity()));
        contentValues.put("last_display", new Long(aVar.getRedisplayStats().getLastDisplayTime()));
        contentValues.put("click_ids", aVar.getClickedClickIds().toString());
        contentValues.put("displayed_in_session", Boolean.valueOf(aVar.isDisplayedInSession()));
        Object A = a0.A(i0.f8861c, new e(contentValues, aVar, null), dVar);
        return A == gc.a.f2559g ? A : o.f277a;
    }
}
