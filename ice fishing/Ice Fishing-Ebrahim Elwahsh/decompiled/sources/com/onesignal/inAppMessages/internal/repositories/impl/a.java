package com.onesignal.inAppMessages.internal.repositories.impl;

import E7.l;
import E7.p;
import O7.AbstractC0399y;
import O7.F;
import O7.InterfaceC0397w;
import android.content.ContentValues;
import com.onesignal.common.f;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.i;
import org.json.JSONArray;
import org.json.JSONException;
import q7.v;
import v7.InterfaceC5133d;
import w4.AbstractC5171b;
import w4.InterfaceC5170a;
import w7.EnumC5179a;
import x7.AbstractC5219c;
import x7.h;

/* loaded from: classes2.dex */
public final class a implements T4.a {
    public static final C0210a Companion = new C0210a(null);
    public static final long IAM_CACHE_DATA_LIFETIME = 15552000;
    private final w4.d _databaseProvider;
    private final Q4.a _prefs;
    private final G4.a _time;

    /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$a, reason: collision with other inner class name */
    public static final class C0210a {
        public /* synthetic */ C0210a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0210a() {
        }
    }

    public static final class b extends h implements p {
        int label;

        /* renamed from: com.onesignal.inAppMessages.internal.repositories.impl.a$b$a, reason: collision with other inner class name */
        public static final class C0211a extends i implements l {
            final /* synthetic */ Set<String> $oldClickedClickIds;
            final /* synthetic */ Set<String> $oldMessageIds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0211a(Set<String> set, Set<String> set2) {
                super(1);
                this.$oldMessageIds = set;
                this.$oldClickedClickIds = set2;
            }

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC5170a) obj);
                return v.f40183a;
            }

            public final void invoke(InterfaceC5170a it) {
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

        public b(InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return a.this.new b(interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((b) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            String[] strArr = {"message_id", "click_ids"};
            String[] strArr2 = {String.valueOf((System.currentTimeMillis() / 1000) - a.IAM_CACHE_DATA_LIFETIME)};
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            try {
                AbstractC5171b.query$default(a.this._databaseProvider.getOs(), "in_app_message", strArr, "last_display < ?", strArr2, null, null, null, null, new C0211a(linkedHashSet, linkedHashSet2), 240, null);
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
            a.this._databaseProvider.getOs().delete("in_app_message", "last_display < ?", strArr2);
            a.this._prefs.cleanInAppMessageIds(linkedHashSet);
            a.this._prefs.cleanInAppMessageClickedClickIds(linkedHashSet2);
            return v.f40183a;
        }
    }

    public static final class c extends AbstractC5219c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public c(InterfaceC5133d interfaceC5133d) {
            super(interfaceC5133d);
        }

        @Override // x7.AbstractC5217a
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
        public static final class C0212a extends i implements l {
            final /* synthetic */ List<com.onesignal.inAppMessages.internal.a> $inAppMessages;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0212a(a aVar, List<com.onesignal.inAppMessages.internal.a> list) {
                super(1);
                this.this$0 = aVar;
                this.$inAppMessages = list;
            }

            @Override // E7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC5170a) obj);
                return v.f40183a;
            }

            public final void invoke(InterfaceC5170a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.moveToFirst()) {
                    do {
                        this.$inAppMessages.add(new com.onesignal.inAppMessages.internal.a(it.getString("message_id"), f.INSTANCE.newStringSetFromJSONArray(new JSONArray(it.getString("click_ids"))), it.getInt("displayed_in_session") == 1, new com.onesignal.inAppMessages.internal.h(it.getInt("display_quantity"), it.getLong("last_display"), this.this$0._time), this.this$0._time));
                    } while (it.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List<com.onesignal.inAppMessages.internal.a> list, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$inAppMessages = list;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return a.this.new d(this.$inAppMessages, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((d) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            try {
                AbstractC5171b.query$default(a.this._databaseProvider.getOs(), "in_app_message", null, null, null, null, null, null, null, new C0212a(a.this, this.$inAppMessages), 254, null);
            } catch (JSONException e6) {
                com.onesignal.debug.internal.logging.b.error("Generating JSONArray from iam click ids:JSON Failed.", e6);
            }
            return v.f40183a;
        }
    }

    public static final class e extends h implements p {
        final /* synthetic */ com.onesignal.inAppMessages.internal.a $inAppMessage;
        final /* synthetic */ ContentValues $values;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ContentValues contentValues, com.onesignal.inAppMessages.internal.a aVar, InterfaceC5133d interfaceC5133d) {
            super(2, interfaceC5133d);
            this.$values = contentValues;
            this.$inAppMessage = aVar;
        }

        @Override // x7.AbstractC5217a
        public final InterfaceC5133d create(Object obj, InterfaceC5133d interfaceC5133d) {
            return a.this.new e(this.$values, this.$inAppMessage, interfaceC5133d);
        }

        @Override // E7.p
        public final Object invoke(InterfaceC0397w interfaceC0397w, InterfaceC5133d interfaceC5133d) {
            return ((e) create(interfaceC0397w, interfaceC5133d)).invokeSuspend(v.f40183a);
        }

        @Override // x7.AbstractC5217a
        public final Object invokeSuspend(Object obj) {
            EnumC5179a enumC5179a = EnumC5179a.f41704n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.f.r(obj);
            if (a.this._databaseProvider.getOs().update("in_app_message", this.$values, "message_id = ?", new String[]{this.$inAppMessage.getMessageId()}) == 0) {
                a.this._databaseProvider.getOs().insert("in_app_message", null, this.$values);
            }
            return v.f40183a;
        }
    }

    public a(w4.d _databaseProvider, G4.a _time, Q4.a _prefs) {
        kotlin.jvm.internal.h.e(_databaseProvider, "_databaseProvider");
        kotlin.jvm.internal.h.e(_time, "_time");
        kotlin.jvm.internal.h.e(_prefs, "_prefs");
        this._databaseProvider = _databaseProvider;
        this._time = _time;
        this._prefs = _prefs;
    }

    @Override // T4.a
    public Object cleanCachedInAppMessages(InterfaceC5133d interfaceC5133d) {
        Object y6 = AbstractC0399y.y(F.f2553c, new b(null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : v.f40183a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // T4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listInAppMessages(InterfaceC5133d interfaceC5133d) {
        c cVar;
        int i;
        if (interfaceC5133d instanceof c) {
            cVar = (c) interfaceC5133d;
            int i4 = cVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cVar.label = i4 - Integer.MIN_VALUE;
                Object obj = cVar.result;
                EnumC5179a enumC5179a = EnumC5179a.f41704n;
                i = cVar.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) cVar.L$0;
                    com.bumptech.glide.f.r(obj);
                    return list;
                }
                com.bumptech.glide.f.r(obj);
                ArrayList arrayList = new ArrayList();
                V7.d dVar = F.f2553c;
                d dVar2 = new d(arrayList, null);
                cVar.L$0 = arrayList;
                cVar.label = 1;
                return AbstractC0399y.y(dVar, dVar2, cVar) == enumC5179a ? enumC5179a : arrayList;
            }
        }
        cVar = new c(interfaceC5133d);
        Object obj2 = cVar.result;
        EnumC5179a enumC5179a2 = EnumC5179a.f41704n;
        i = cVar.label;
        if (i == 0) {
        }
    }

    @Override // T4.a
    public Object saveInAppMessage(com.onesignal.inAppMessages.internal.a aVar, InterfaceC5133d interfaceC5133d) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("message_id", aVar.getMessageId());
        contentValues.put("display_quantity", new Integer(aVar.getRedisplayStats().getDisplayQuantity()));
        contentValues.put("last_display", new Long(aVar.getRedisplayStats().getLastDisplayTime()));
        contentValues.put("click_ids", aVar.getClickedClickIds().toString());
        contentValues.put("displayed_in_session", Boolean.valueOf(aVar.isDisplayedInSession()));
        Object y6 = AbstractC0399y.y(F.f2553c, new e(contentValues, aVar, null), interfaceC5133d);
        return y6 == EnumC5179a.f41704n ? y6 : v.f40183a;
    }
}
