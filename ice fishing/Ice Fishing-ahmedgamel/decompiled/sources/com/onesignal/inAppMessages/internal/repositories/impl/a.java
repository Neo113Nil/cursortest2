package com.onesignal.inAppMessages.internal.repositories.impl;

import B7.h;
import I7.l;
import I7.p;
import S7.AbstractC0410y;
import S7.F;
import S7.InterfaceC0408w;
import android.content.ContentValues;
import com.onesignal.common.f;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import u7.v;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class a implements X4.a {
    public static final C0211a Companion = new C0211a(null);
    public static final long IAM_CACHE_DATA_LIFETIME = 15552000;
    private final A4.d _databaseProvider;
    private final U4.a _prefs;
    private final K4.a _time;

    /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$a, reason: collision with other inner class name */
    public static final class C0211a {
        public /* synthetic */ C0211a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0211a() {
        }
    }

    public static final class b extends h implements p {
        int label;

        /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$b$a, reason: collision with other inner class name */
        public static final class C0212a extends i implements l {
            final /* synthetic */ Set<String> $oldClickedClickIds;
            final /* synthetic */ Set<String> $oldMessageIds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0212a(Set<String> set, Set<String> set2) {
                super(1);
                this.$oldMessageIds = set;
                this.$oldClickedClickIds = set2;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((A4.a) obj);
                return v.f41073a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.getCount() == 0) {
                    com.onesignal.debug.internal.logging.b.debug$default("Attempted to clean 6 month old IAM data, but none exists!", null, 2, null);
                    return;
                }
                if (it.moveToFirst()) {
                    do {
                        String string = it.getString("message_id");
                        String string2 = it.getString("click_ids");
                        this.$oldMessageIds.add(string);
                        this.$oldClickedClickIds.addAll(f.INSTANCE.newStringSetFromJSONArray(new JSONArray(string2)));
                    } while (it.moveToNext());
                }
            }
        }

        public b(InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return a.this.new b(interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((b) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            String[] strArr = {"message_id", "click_ids"};
            String[] strArr2 = {String.valueOf((System.currentTimeMillis() / 1000) - a.IAM_CACHE_DATA_LIFETIME)};
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            try {
                A4.b.query$default(a.this._databaseProvider.getOs(), "in_app_message", strArr, "last_display < ?", strArr2, null, null, null, null, new C0212a(linkedHashSet, linkedHashSet2), 240, null);
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
            a.this._databaseProvider.getOs().delete("in_app_message", "last_display < ?", strArr2);
            a.this._prefs.cleanInAppMessageIds(linkedHashSet);
            a.this._prefs.cleanInAppMessageClickedClickIds(linkedHashSet2);
            return v.f41073a;
        }
    }

    public static final class c extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.listInAppMessages(this);
        }
    }

    public static final class d extends h implements p {
        final /* synthetic */ List<com.onesignal.inAppMessages.internal.a> $inAppMessages;
        int label;

        /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$d$a, reason: collision with other inner class name */
        public static final class C0213a extends i implements l {
            final /* synthetic */ List<com.onesignal.inAppMessages.internal.a> $inAppMessages;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0213a(a aVar, List<com.onesignal.inAppMessages.internal.a> list) {
                super(1);
                this.this$0 = aVar;
                this.$inAppMessages = list;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((A4.a) obj);
                return v.f41073a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.moveToFirst()) {
                    do {
                        this.$inAppMessages.add(new com.onesignal.inAppMessages.internal.a(it.getString("message_id"), f.INSTANCE.newStringSetFromJSONArray(new JSONArray(it.getString("click_ids"))), it.getInt("displayed_in_session") == 1, new com.onesignal.inAppMessages.internal.h(it.getInt("display_quantity"), it.getLong("last_display"), this.this$0._time), this.this$0._time));
                    } while (it.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<com.onesignal.inAppMessages.internal.a> list, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$inAppMessages = list;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return a.this.new d(this.$inAppMessages, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((d) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            try {
                A4.b.query$default(a.this._databaseProvider.getOs(), "in_app_message", null, null, null, null, null, null, null, new C0213a(a.this, this.$inAppMessages), 254, null);
            } catch (JSONException e9) {
                com.onesignal.debug.internal.logging.b.error("Generating JSONArray from iam click ids:JSON Failed.", e9);
            }
            return v.f41073a;
        }
    }

    public static final class e extends h implements p {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $inAppMessage;
        final /* synthetic */ ContentValues $values;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ContentValues contentValues, com.onesignal.inAppMessages.internal.a aVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$values = contentValues;
            this.$inAppMessage = aVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return a.this.new e(this.$values, this.$inAppMessage, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((e) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            if (a.this._databaseProvider.getOs().update("in_app_message", this.$values, "message_id = ?", new String[]{this.$inAppMessage.getMessageId()}) == 0) {
                a.this._databaseProvider.getOs().insert("in_app_message", null, this.$values);
            }
            return v.f41073a;
        }
    }

    public a(A4.d _databaseProvider, K4.a _time, U4.a _prefs) {
        kotlin.jvm.internal.h.e(_databaseProvider, "_databaseProvider");
        kotlin.jvm.internal.h.e(_time, "_time");
        kotlin.jvm.internal.h.e(_prefs, "_prefs");
        this._databaseProvider = _databaseProvider;
        this._time = _time;
        this._prefs = _prefs;
    }

    @Override // X4.a
    public Object cleanCachedInAppMessages(InterfaceC5240d interfaceC5240d) {
        Object y7 = AbstractC0410y.y(F.f3000c, new b(null), interfaceC5240d);
        return y7 == A7.a.f215n ? y7 : v.f41073a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // X4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessages(InterfaceC5240d interfaceC5240d) {
        c cVar;
        int i;
        if (interfaceC5240d instanceof c) {
            cVar = (c) interfaceC5240d;
            int i4 = cVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cVar.label = i4 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                A7.a aVar = A7.a.f215n;
                i = cVar.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) cVar.L$0;
                    Q3.b.s(obj);
                    return list;
                }
                Q3.b.s(obj);
                ArrayList arrayList = new ArrayList();
                Z7.d dVar = F.f3000c;
                d dVar2 = new d(arrayList, null);
                cVar.L$0 = arrayList;
                cVar.label = 1;
                return AbstractC0410y.y(dVar, dVar2, cVar) == aVar ? aVar : arrayList;
            }
        }
        cVar = new c(interfaceC5240d);
        Object obj2 = cVar.result;
        A7.a aVar2 = A7.a.f215n;
        i = cVar.label;
        if (i == 0) {
        }
    }

    @Override // X4.a
    public Object saveInAppMessage(com.onesignal.inAppMessages.internal.a aVar, InterfaceC5240d interfaceC5240d) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", aVar.getMessageId());
        contentValues.put("display_quantity", new Integer(aVar.getRedisplayStats().getDisplayQuantity()));
        contentValues.put("last_display", new Long(aVar.getRedisplayStats().getLastDisplayTime()));
        contentValues.put("click_ids", aVar.getClickedClickIds().toString());
        contentValues.put("displayed_in_session", Boolean.valueOf(aVar.isDisplayedInSession()));
        Object y7 = AbstractC0410y.y(F.f3000c, new e(contentValues, aVar, null), interfaceC5240d);
        return y7 == A7.a.f215n ? y7 : v.f41073a;
    }
}
