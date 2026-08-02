package com.onesignal.notifications.internal.data.impl;

import D.x;
import S7.AbstractC0410y;
import S7.F;
import S7.InterfaceC0408w;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.e.n;
import com.google.android.gms.internal.ads.Wv;
import java.util.ArrayList;
import java.util.List;
import m5.InterfaceC4747a;
import org.json.JSONException;
import u5.C5074c;
import u5.InterfaceC5072a;
import y5.C5209a;
import z7.InterfaceC5240d;

/* loaded from: classes2.dex */
public final class b implements u5.d {
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800;
    private final x4.f _applicationService;
    private final InterfaceC4747a _badgeCountUpdater;
    private final A4.d _databaseProvider;
    private final InterfaceC5072a _queryHelper;
    private final K4.a _time;
    public static final a Companion = new a(null);
    private static final String[] COLUMNS_FOR_LIST_NOTIFICATIONS = {"title", "message", L5.e.NOTIFICATION_ID_TAG, "android_notification_id", "full_data", "created_time"};

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final String[] getCOLUMNS_FOR_LIST_NOTIFICATIONS() {
            return b.COLUMNS_FOR_LIST_NOTIFICATIONS;
        }

        private a() {
        }
    }

    /* renamed from: com.onesignal.notifications.internal.data.impl.b$b, reason: collision with other inner class name */
    public static final class C0229b extends B7.h implements I7.p {
        final /* synthetic */ int $maxNumberOfNotificationsInt;
        final /* synthetic */ int $notificationsToMakeRoomFor;
        int label;
        final /* synthetic */ b this$0;

        /* renamed from: com.onesignal.notifications.internal.data.impl.b$b$a */
        public static final class a extends kotlin.jvm.internal.i implements I7.l {
            final /* synthetic */ int $maxNumberOfNotificationsInt;
            final /* synthetic */ int $notificationsToMakeRoomFor;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, int i4, b bVar) {
                super(1);
                this.$maxNumberOfNotificationsInt = i;
                this.$notificationsToMakeRoomFor = i4;
                this.this$0 = bVar;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((A4.a) obj);
                return u7.v.f41073a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                int count = (it.getCount() - this.$maxNumberOfNotificationsInt) + this.$notificationsToMakeRoomFor;
                if (count < 1) {
                    return;
                }
                while (it.moveToNext()) {
                    this.this$0.internalMarkAsDismissed(it.getInt("android_notification_id"));
                    count--;
                    if (count <= 0) {
                        return;
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0229b(int i, b bVar, int i4, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$maxNumberOfNotificationsInt = i;
            this.this$0 = bVar;
            this.$notificationsToMakeRoomFor = i4;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return new C0229b(this.$maxNumberOfNotificationsInt, this.this$0, this.$notificationsToMakeRoomFor, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((C0229b) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            String valueOf = String.valueOf(this.$maxNumberOfNotificationsInt);
            try {
                A4.b.query$default(this.this$0._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, this.this$0._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, "_id", valueOf + this.$notificationsToMakeRoomFor, new a(this.$maxNumberOfNotificationsInt, this.$notificationsToMakeRoomFor, this.this$0), 56, null);
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.warn("Error clearing oldest notifications over limit! ", th);
            }
            return u7.v.f41073a;
        }
    }

    public static final class c extends B7.h implements I7.p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $body;
        final /* synthetic */ String $collapseKey;
        final /* synthetic */ long $expireTime;
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $id;
        final /* synthetic */ boolean $isOpened;
        final /* synthetic */ String $jsonPayload;
        final /* synthetic */ boolean $shouldDismissIdenticals;
        final /* synthetic */ String $title;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, boolean z6, int i, b bVar, String str2, String str3, boolean z9, String str4, String str5, long j6, String str6, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$id = str;
            this.$shouldDismissIdenticals = z6;
            this.$androidId = i;
            this.this$0 = bVar;
            this.$groupId = str2;
            this.$collapseKey = str3;
            this.$isOpened = z9;
            this.$title = str4;
            this.$body = str5;
            this.$expireTime = j6;
            this.$jsonPayload = str6;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return new c(this.$id, this.$shouldDismissIdenticals, this.$androidId, this.this$0, this.$groupId, this.$collapseKey, this.$isOpened, this.$title, this.$body, this.$expireTime, this.$jsonPayload, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((c) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            com.onesignal.debug.internal.logging.b.debug$default("Saving Notification id=" + this.$id, null, 2, null);
            try {
                if (this.$shouldDismissIdenticals) {
                    String str = "android_notification_id = " + this.$androidId;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("dismissed", new Integer(1));
                    this.this$0._databaseProvider.getOs().update("notification", contentValues, str, null);
                    this.this$0._badgeCountUpdater.update();
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(L5.e.NOTIFICATION_ID_TAG, this.$id);
                String str2 = this.$groupId;
                if (str2 != null) {
                    contentValues2.put("group_id", str2);
                }
                String str3 = this.$collapseKey;
                if (str3 != null) {
                    contentValues2.put("collapse_id", str3);
                }
                contentValues2.put("opened", new Integer(this.$isOpened ? 1 : 0));
                if (!this.$isOpened) {
                    contentValues2.put("android_notification_id", new Integer(this.$androidId));
                }
                String str4 = this.$title;
                if (str4 != null) {
                    contentValues2.put("title", str4);
                }
                String str5 = this.$body;
                if (str5 != null) {
                    contentValues2.put("message", str5);
                }
                contentValues2.put(n.a.f13847g, new Long(this.$expireTime));
                contentValues2.put("full_data", this.$jsonPayload);
                this.this$0._databaseProvider.getOs().insertOrThrow("notification", null, contentValues2);
                com.onesignal.debug.internal.logging.b.debug$default("Notification saved values: " + contentValues2, null, 2, null);
                if (!this.$isOpened) {
                    this.this$0._badgeCountUpdater.update();
                }
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
            return u7.v.f41073a;
        }
    }

    public static final class d extends B7.h implements I7.p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $groupId;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, String str, b bVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$androidId = i;
            this.$groupId = str;
            this.this$0 = bVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return new d(this.$androidId, this.$groupId, this.this$0, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((d) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            ContentValues contentValues = new ContentValues();
            contentValues.put("android_notification_id", new Integer(this.$androidId));
            contentValues.put("group_id", this.$groupId);
            contentValues.put("is_summary", new Integer(1));
            this.this$0._databaseProvider.getOs().insertOrThrow("notification", null, contentValues);
            return u7.v.f41073a;
        }
    }

    public static final class e extends B7.h implements I7.p {
        int label;

        public e(InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return b.this.new e(interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((e) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            String valueOf = String.valueOf((b.this._time.getCurrentTimeMillis() / 1000) - b.NOTIFICATION_CACHE_DATA_LIFETIME);
            kotlin.jvm.internal.h.d(valueOf, "valueOf(...)");
            b.this._databaseProvider.getOs().delete("notification", "created_time < ?", new String[]{valueOf});
            return u7.v.f41073a;
        }
    }

    public static final class f extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.doesNotificationExist(null, this);
        }
    }

    public static final class g extends B7.h implements I7.p {
        final /* synthetic */ String $id;
        final /* synthetic */ kotlin.jvm.internal.p $result;
        int label;
        final /* synthetic */ b this$0;

        public static final class a extends kotlin.jvm.internal.i implements I7.l {
            final /* synthetic */ String $id;
            final /* synthetic */ kotlin.jvm.internal.p $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, kotlin.jvm.internal.p pVar) {
                super(1);
                this.$id = str;
                this.$result = pVar;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((A4.a) obj);
                return u7.v.f41073a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.moveToFirst()) {
                    com.onesignal.debug.internal.logging.b.debug$default("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + this.$id, null, 2, null);
                    this.$result.f38642n = true;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, b bVar, kotlin.jvm.internal.p pVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$id = str;
            this.this$0 = bVar;
            this.$result = pVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return new g(this.$id, this.this$0, this.$result, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((g) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            String[] strArr = {L5.e.NOTIFICATION_ID_TAG};
            String str = this.$id;
            kotlin.jvm.internal.h.b(str);
            A4.b.query$default(this.this$0._databaseProvider.getOs(), "notification", strArr, "notification_id = ?", new String[]{str}, null, null, null, null, new a(this.$id, this.$result), 240, null);
            return u7.v.f41073a;
        }
    }

    public static final class h extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getAndroidIdForGroup(null, false, this);
        }
    }

    public static final class i extends B7.h implements I7.p {
        final /* synthetic */ kotlin.jvm.internal.r $recentId;
        final /* synthetic */ String[] $whereArgs;
        final /* synthetic */ kotlin.jvm.internal.r $whereStr;
        int label;

        public static final class a extends kotlin.jvm.internal.i implements I7.l {
            final /* synthetic */ kotlin.jvm.internal.r $recentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.jvm.internal.r rVar) {
                super(1);
                this.$recentId = rVar;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((A4.a) obj);
                return u7.v.f41073a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                boolean moveToFirst = it.moveToFirst();
                this.$recentId.f38644n = !moveToFirst ? null : Integer.valueOf(it.getInt("android_notification_id"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(kotlin.jvm.internal.r rVar, String[] strArr, kotlin.jvm.internal.r rVar2, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$whereStr = rVar;
            this.$whereArgs = strArr;
            this.$recentId = rVar2;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return b.this.new i(this.$whereStr, this.$whereArgs, this.$recentId, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((i) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            A4.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, (String) this.$whereStr.f38644n, this.$whereArgs, null, null, "created_time DESC", "1", new a(this.$recentId), 48, null);
            return u7.v.f41073a;
        }
    }

    public static final class j extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public j(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getAndroidIdFromCollapseKey(null, this);
        }
    }

    public static final class k extends B7.h implements I7.p {
        final /* synthetic */ kotlin.jvm.internal.r $androidId;
        final /* synthetic */ String $collapseKey;
        int label;

        public static final class a extends kotlin.jvm.internal.i implements I7.l {
            final /* synthetic */ kotlin.jvm.internal.r $androidId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.jvm.internal.r rVar) {
                super(1);
                this.$androidId = rVar;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((A4.a) obj);
                return u7.v.f41073a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.moveToFirst()) {
                    this.$androidId.f38644n = Integer.valueOf(it.getInt("android_notification_id"));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, kotlin.jvm.internal.r rVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$collapseKey = str;
            this.$androidId = rVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return b.this.new k(this.$collapseKey, this.$androidId, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((k) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            A4.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{this.$collapseKey}, null, null, null, null, new a(this.$androidId), 240, null);
            return u7.v.f41073a;
        }
    }

    public static final class l extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public l(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getGroupId(0, this);
        }
    }

    public static final class m extends B7.h implements I7.p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ kotlin.jvm.internal.r $groupId;
        int label;

        public static final class a extends kotlin.jvm.internal.i implements I7.l {
            final /* synthetic */ kotlin.jvm.internal.r $groupId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.jvm.internal.r rVar) {
                super(1);
                this.$groupId = rVar;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((A4.a) obj);
                return u7.v.f41073a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.moveToFirst()) {
                    this.$groupId.f38644n = it.getOptString("group_id");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i, kotlin.jvm.internal.r rVar, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$androidId = i;
            this.$groupId = rVar;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return b.this.new m(this.$androidId, this.$groupId, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((m) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            A4.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"group_id"}, "android_notification_id = " + this.$androidId, null, null, null, null, null, new a(this.$groupId), 248, null);
            return u7.v.f41073a;
        }
    }

    public static final class n extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public n(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.listNotificationsForGroup(null, this);
        }
    }

    public static final class o extends B7.h implements I7.p {
        final /* synthetic */ List<C5074c> $listOfNotifications;
        final /* synthetic */ String $summaryGroup;
        int label;
        final /* synthetic */ b this$0;

        public static final class a extends kotlin.jvm.internal.i implements I7.l {
            final /* synthetic */ List<C5074c> $listOfNotifications;
            final /* synthetic */ String $summaryGroup;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<C5074c> list, String str) {
                super(1);
                this.$listOfNotifications = list;
                this.$summaryGroup = str;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((A4.a) obj);
                return u7.v.f41073a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.moveToFirst()) {
                    do {
                        try {
                            String optString = it.getOptString("title");
                            String optString2 = it.getOptString("message");
                            this.$listOfNotifications.add(new C5074c(it.getInt("android_notification_id"), it.getString(L5.e.NOTIFICATION_ID_TAG), it.getString("full_data"), it.getLong("created_time"), optString, optString2));
                        } catch (JSONException unused) {
                            com.onesignal.debug.internal.logging.b.error$default("Could not parse JSON of sub notification in group: " + this.$summaryGroup, null, 2, null);
                        }
                    } while (it.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, b bVar, List<C5074c> list, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$summaryGroup = str;
            this.this$0 = bVar;
            this.$listOfNotifications = list;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return new o(this.$summaryGroup, this.this$0, this.$listOfNotifications, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((o) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            A4.b.query$default(this.this$0._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{this.$summaryGroup}, null, null, "_id DESC", null, new a(this.$listOfNotifications, this.$summaryGroup), 176, null);
            return u7.v.f41073a;
        }
    }

    public static final class p extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public p(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.listNotificationsForOutstanding(null, this);
        }
    }

    public static final class q extends B7.h implements I7.p {
        final /* synthetic */ List<Integer> $excludeAndroidIds;
        final /* synthetic */ List<C5074c> $listOfNotifications;
        int label;

        public static final class a extends kotlin.jvm.internal.i implements I7.l {
            final /* synthetic */ List<C5074c> $listOfNotifications;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<C5074c> list) {
                super(1);
                this.$listOfNotifications = list;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((A4.a) obj);
                return u7.v.f41073a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                while (it.moveToNext()) {
                    String optString = it.getOptString("title");
                    String optString2 = it.getOptString("message");
                    String string = it.getString(L5.e.NOTIFICATION_ID_TAG);
                    this.$listOfNotifications.add(new C5074c(it.getInt("android_notification_id"), string, it.getString("full_data"), it.getLong("created_time"), optString, optString2));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List<Integer> list, List<C5074c> list2, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$excludeAndroidIds = list;
            this.$listOfNotifications = list2;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return b.this.new q(this.$excludeAndroidIds, this.$listOfNotifications, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((q) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            StringBuilder recentUninteractedWithNotificationsWhere = b.this._queryHelper.recentUninteractedWithNotificationsWhere();
            if (this.$excludeAndroidIds != null) {
                recentUninteractedWithNotificationsWhere.append(" AND android_notification_id NOT IN (");
                recentUninteractedWithNotificationsWhere.append(TextUtils.join(",", this.$excludeAndroidIds));
                recentUninteractedWithNotificationsWhere.append(")");
            }
            A4.b.query$default(b.this._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), recentUninteractedWithNotificationsWhere.toString(), null, null, null, "_id DESC", String.valueOf(C5209a.INSTANCE.getMaxNumberOfNotifications()), new a(this.$listOfNotifications), 56, null);
            return u7.v.f41073a;
        }
    }

    public static final class r extends B7.h implements I7.p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ boolean $clearGroupOnSummaryClick;
        final /* synthetic */ boolean $dismissed;
        final /* synthetic */ String $summaryGroup;
        Object L$0;
        boolean Z$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, boolean z6, boolean z9, b bVar, int i, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$summaryGroup = str;
            this.$dismissed = z6;
            this.$clearGroupOnSummaryClick = z9;
            this.this$0 = bVar;
            this.$androidId = i;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return new r(this.$summaryGroup, this.$dismissed, this.$clearGroupOnSummaryClick, this.this$0, this.$androidId, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((r) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0099  */
        @Override // B7.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String[] strArr;
            String str;
            String str2;
            boolean z6;
            A7.a aVar = A7.a.f215n;
            int i = this.label;
            if (i == 0) {
                Q3.b.s(obj);
                String str3 = this.$summaryGroup;
                String[] strArr2 = null;
                if (str3 != null) {
                    boolean a9 = kotlin.jvm.internal.h.a(str3, t5.e.GROUPLESS_SUMMARY_KEY);
                    if (a9) {
                        str2 = "group_id IS NULL";
                    } else {
                        strArr2 = new String[]{this.$summaryGroup};
                        str2 = "group_id = ?";
                    }
                    String str4 = str2;
                    String[] strArr3 = strArr2;
                    str = str4;
                    if (this.$dismissed || this.$clearGroupOnSummaryClick) {
                        strArr = strArr3;
                    } else {
                        b bVar = this.this$0;
                        String str5 = this.$summaryGroup;
                        this.L$0 = str;
                        this.Z$0 = a9;
                        this.label = 1;
                        Object androidIdForGroup = bVar.getAndroidIdForGroup(str5, false, this);
                        if (androidIdForGroup == aVar) {
                            return aVar;
                        }
                        z6 = a9;
                        obj = androidIdForGroup;
                    }
                } else {
                    strArr = null;
                    str = "android_notification_id = " + this.$androidId;
                }
                ContentValues contentValues = new ContentValues();
                if (this.$dismissed) {
                    contentValues.put("opened", new Integer(1));
                } else {
                    contentValues.put("dismissed", new Integer(1));
                }
                this.this$0._databaseProvider.getOs().update("notification", contentValues, str, strArr);
                this.this$0._badgeCountUpdater.update();
                return u7.v.f41073a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z6 = this.Z$0;
            str = (String) this.L$0;
            Q3.b.s(obj);
            String valueOf = String.valueOf(obj);
            str = Wv.g(str, " AND android_notification_id = ?");
            strArr = z6 ? new String[]{valueOf} : new String[]{this.$summaryGroup, valueOf};
            ContentValues contentValues2 = new ContentValues();
            if (this.$dismissed) {
            }
            this.this$0._databaseProvider.getOs().update("notification", contentValues2, str, strArr);
            this.this$0._badgeCountUpdater.update();
            return u7.v.f41073a;
        }
    }

    public static final class s extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public s(InterfaceC5240d interfaceC5240d) {
            super(interfaceC5240d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.markAsDismissed(0, this);
        }
    }

    public static final class t extends B7.h implements I7.p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ kotlin.jvm.internal.p $didDismiss;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(kotlin.jvm.internal.p pVar, b bVar, int i, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$didDismiss = pVar;
            this.this$0 = bVar;
            this.$androidId = i;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return new t(this.$didDismiss, this.this$0, this.$androidId, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((t) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            this.$didDismiss.f38642n = this.this$0.internalMarkAsDismissed(this.$androidId);
            return u7.v.f41073a;
        }
    }

    public static final class u extends B7.h implements I7.p {
        final /* synthetic */ String $group;
        int label;

        public static final class a extends kotlin.jvm.internal.i implements I7.l {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((A4.a) obj);
                return u7.v.f41073a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                while (it.moveToNext()) {
                    int i = it.getInt("android_notification_id");
                    if (i != -1) {
                        this.$notificationManager.cancel(i);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
            this.$group = str;
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return b.this.new u(this.$group, interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((u) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            NotificationManager notificationManager = t5.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            String[] strArr = {this.$group};
            A4.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0", strArr, null, null, null, null, new a(notificationManager), 240, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "group_id = ? AND opened = 0 AND dismissed = 0", strArr);
            b.this._badgeCountUpdater.update();
            return u7.v.f41073a;
        }
    }

    public static final class v extends B7.h implements I7.p {
        int label;

        public static final class a extends kotlin.jvm.internal.i implements I7.l {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((A4.a) obj);
                return u7.v.f41073a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.moveToFirst()) {
                    do {
                        this.$notificationManager.cancel(it.getInt("android_notification_id"));
                    } while (it.moveToNext());
                }
            }
        }

        public v(InterfaceC5240d interfaceC5240d) {
            super(2, interfaceC5240d);
        }

        @Override // B7.a
        public final InterfaceC5240d create(Object obj, InterfaceC5240d interfaceC5240d) {
            return b.this.new v(interfaceC5240d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0408w interfaceC0408w, InterfaceC5240d interfaceC5240d) {
            return ((v) create(interfaceC0408w, interfaceC5240d)).invokeSuspend(u7.v.f41073a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f215n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Q3.b.s(obj);
            NotificationManager notificationManager = t5.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            A4.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "dismissed = 0 AND opened = 0", null, null, null, null, null, new a(notificationManager), 248, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "opened = 0", null);
            b.this._badgeCountUpdater.updateCount(0);
            return u7.v.f41073a;
        }
    }

    public b(x4.f _applicationService, InterfaceC5072a _queryHelper, A4.d _databaseProvider, K4.a _time, InterfaceC4747a _badgeCountUpdater) {
        kotlin.jvm.internal.h.e(_applicationService, "_applicationService");
        kotlin.jvm.internal.h.e(_queryHelper, "_queryHelper");
        kotlin.jvm.internal.h.e(_databaseProvider, "_databaseProvider");
        kotlin.jvm.internal.h.e(_time, "_time");
        kotlin.jvm.internal.h.e(_badgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = _applicationService;
        this._queryHelper = _queryHelper;
        this._databaseProvider = _databaseProvider;
        this._time = _time;
        this._badgeCountUpdater = _badgeCountUpdater;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean internalMarkAsDismissed(int i4) {
        Context appContext = this._applicationService.getAppContext();
        String j6 = x.j(i4, "android_notification_id = ", " AND opened = 0 AND dismissed = 0");
        ContentValues contentValues = new ContentValues();
        contentValues.put("dismissed", (Integer) 1);
        boolean z6 = this._databaseProvider.getOs().update("notification", contentValues, j6, null) > 0;
        this._badgeCountUpdater.update();
        t5.e.INSTANCE.getNotificationManager(appContext).cancel(i4);
        return z6;
    }

    @Override // u5.d
    public Object clearOldestOverLimitFallback(int i4, int i6, InterfaceC5240d interfaceC5240d) {
        Object y7 = AbstractC0410y.y(F.f3000c, new C0229b(i6, this, i4, null), interfaceC5240d);
        return y7 == A7.a.f215n ? y7 : u7.v.f41073a;
    }

    @Override // u5.d
    public Object createNotification(String str, String str2, String str3, boolean z6, boolean z9, int i4, String str4, String str5, long j6, String str6, InterfaceC5240d interfaceC5240d) {
        Object y7 = AbstractC0410y.y(F.f3000c, new c(str, z6, i4, this, str2, str3, z9, str4, str5, j6, str6, null), interfaceC5240d);
        return y7 == A7.a.f215n ? y7 : u7.v.f41073a;
    }

    @Override // u5.d
    public Object createSummaryNotification(int i4, String str, InterfaceC5240d interfaceC5240d) {
        Object y7 = AbstractC0410y.y(F.f3000c, new d(i4, str, this, null), interfaceC5240d);
        return y7 == A7.a.f215n ? y7 : u7.v.f41073a;
    }

    @Override // u5.d
    public Object deleteExpiredNotifications(InterfaceC5240d interfaceC5240d) {
        Object y7 = AbstractC0410y.y(F.f3000c, new e(null), interfaceC5240d);
        return y7 == A7.a.f215n ? y7 : u7.v.f41073a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doesNotificationExist(String str, InterfaceC5240d interfaceC5240d) {
        f fVar;
        int i4;
        kotlin.jvm.internal.p pVar;
        if (interfaceC5240d instanceof f) {
            fVar = (f) interfaceC5240d;
            int i6 = fVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                fVar.label = i6 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                A7.a aVar = A7.a.f215n;
                i4 = fVar.label;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    if (str == null || "".equals(str)) {
                        return Boolean.FALSE;
                    }
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    Z7.d dVar = F.f3000c;
                    g gVar = new g(str, this, pVar2, null);
                    fVar.L$0 = pVar2;
                    fVar.label = 1;
                    if (AbstractC0410y.y(dVar, gVar, fVar) == aVar) {
                        return aVar;
                    }
                    pVar = pVar2;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (kotlin.jvm.internal.p) fVar.L$0;
                    Q3.b.s(obj);
                }
                return Boolean.valueOf(pVar.f38642n);
            }
        }
        fVar = new f(interfaceC5240d);
        Object obj2 = fVar.result;
        A7.a aVar2 = A7.a.f215n;
        i4 = fVar.label;
        if (i4 != 0) {
        }
        return Boolean.valueOf(pVar.f38642n);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdForGroup(String str, boolean z6, InterfaceC5240d interfaceC5240d) {
        h hVar;
        int i4;
        kotlin.jvm.internal.r rVar;
        if (interfaceC5240d instanceof h) {
            hVar = (h) interfaceC5240d;
            int i6 = hVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                hVar.label = i6 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                A7.a aVar = A7.a.f215n;
                i4 = hVar.label;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                    boolean a9 = kotlin.jvm.internal.h.a(str, t5.e.GROUPLESS_SUMMARY_KEY);
                    kotlin.jvm.internal.r rVar3 = new kotlin.jvm.internal.r();
                    rVar3.f38644n = a9 ? "group_id IS NULL" : "group_id = ?";
                    rVar3.f38644n = Wv.i(new StringBuilder(), (String) rVar3.f38644n, " AND dismissed = 0 AND opened = 0 AND ");
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) rVar3.f38644n);
                    sb.append(z6 ? "is_summary = 1" : "is_summary = 0");
                    rVar3.f38644n = sb.toString();
                    String[] strArr = a9 ? null : new String[]{str};
                    Z7.d dVar = F.f3000c;
                    i iVar = new i(rVar3, strArr, rVar2, null);
                    hVar.L$0 = rVar2;
                    hVar.label = 1;
                    if (AbstractC0410y.y(dVar, iVar, hVar) == aVar) {
                        return aVar;
                    }
                    rVar = rVar2;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (kotlin.jvm.internal.r) hVar.L$0;
                    Q3.b.s(obj);
                }
                return rVar.f38644n;
            }
        }
        hVar = new h(interfaceC5240d);
        Object obj2 = hVar.result;
        A7.a aVar2 = A7.a.f215n;
        i4 = hVar.label;
        if (i4 != 0) {
        }
        return rVar.f38644n;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdFromCollapseKey(String str, InterfaceC5240d interfaceC5240d) {
        j jVar;
        int i4;
        kotlin.jvm.internal.r rVar;
        if (interfaceC5240d instanceof j) {
            jVar = (j) interfaceC5240d;
            int i6 = jVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                jVar.label = i6 - Integer.MIN_VALUE;
                Object obj = jVar.result;
                A7.a aVar = A7.a.f215n;
                i4 = jVar.label;
                if (i4 != 0) {
                    Q3.b.s(obj);
                    kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                    Z7.d dVar = F.f3000c;
                    k kVar = new k(str, rVar2, null);
                    jVar.L$0 = rVar2;
                    jVar.label = 1;
                    if (AbstractC0410y.y(dVar, kVar, jVar) == aVar) {
                        return aVar;
                    }
                    rVar = rVar2;
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (kotlin.jvm.internal.r) jVar.L$0;
                    Q3.b.s(obj);
                }
                return rVar.f38644n;
            }
        }
        jVar = new j(interfaceC5240d);
        Object obj2 = jVar.result;
        A7.a aVar2 = A7.a.f215n;
        i4 = jVar.label;
        if (i4 != 0) {
        }
        return rVar.f38644n;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGroupId(int i4, InterfaceC5240d interfaceC5240d) {
        l lVar;
        int i6;
        kotlin.jvm.internal.r rVar;
        if (interfaceC5240d instanceof l) {
            lVar = (l) interfaceC5240d;
            int i9 = lVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                lVar.label = i9 - Integer.MIN_VALUE;
                Object obj = lVar.result;
                A7.a aVar = A7.a.f215n;
                i6 = lVar.label;
                if (i6 != 0) {
                    Q3.b.s(obj);
                    kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                    Z7.d dVar = F.f3000c;
                    m mVar = new m(i4, rVar2, null);
                    lVar.L$0 = rVar2;
                    lVar.label = 1;
                    if (AbstractC0410y.y(dVar, mVar, lVar) == aVar) {
                        return aVar;
                    }
                    rVar = rVar2;
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (kotlin.jvm.internal.r) lVar.L$0;
                    Q3.b.s(obj);
                }
                return rVar.f38644n;
            }
        }
        lVar = new l(interfaceC5240d);
        Object obj2 = lVar.result;
        A7.a aVar2 = A7.a.f215n;
        i6 = lVar.label;
        if (i6 != 0) {
        }
        return rVar.f38644n;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForGroup(String str, InterfaceC5240d interfaceC5240d) {
        n nVar;
        int i4;
        if (interfaceC5240d instanceof n) {
            nVar = (n) interfaceC5240d;
            int i6 = nVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                nVar.label = i6 - Integer.MIN_VALUE;
                Object obj = nVar.result;
                A7.a aVar = A7.a.f215n;
                i4 = nVar.label;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) nVar.L$0;
                    Q3.b.s(obj);
                    return list;
                }
                Q3.b.s(obj);
                ArrayList arrayList = new ArrayList();
                Z7.d dVar = F.f3000c;
                o oVar = new o(str, this, arrayList, null);
                nVar.L$0 = arrayList;
                nVar.label = 1;
                return AbstractC0410y.y(dVar, oVar, nVar) == aVar ? aVar : arrayList;
            }
        }
        nVar = new n(interfaceC5240d);
        Object obj2 = nVar.result;
        A7.a aVar2 = A7.a.f215n;
        i4 = nVar.label;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForOutstanding(List<Integer> list, InterfaceC5240d interfaceC5240d) {
        p pVar;
        int i4;
        if (interfaceC5240d instanceof p) {
            pVar = (p) interfaceC5240d;
            int i6 = pVar.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                pVar.label = i6 - Integer.MIN_VALUE;
                Object obj = pVar.result;
                A7.a aVar = A7.a.f215n;
                i4 = pVar.label;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) pVar.L$0;
                    Q3.b.s(obj);
                    return list2;
                }
                Q3.b.s(obj);
                ArrayList arrayList = new ArrayList();
                Z7.d dVar = F.f3000c;
                q qVar = new q(list, arrayList, null);
                pVar.L$0 = arrayList;
                pVar.label = 1;
                return AbstractC0410y.y(dVar, qVar, pVar) == aVar ? aVar : arrayList;
            }
        }
        pVar = new p(interfaceC5240d);
        Object obj2 = pVar.result;
        A7.a aVar2 = A7.a.f215n;
        i4 = pVar.label;
        if (i4 == 0) {
        }
    }

    @Override // u5.d
    public Object markAsConsumed(int i4, boolean z6, String str, boolean z9, InterfaceC5240d interfaceC5240d) {
        Object y7 = AbstractC0410y.y(F.f3000c, new r(str, z6, z9, this, i4, null), interfaceC5240d);
        return y7 == A7.a.f215n ? y7 : u7.v.f41073a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object markAsDismissed(int i4, InterfaceC5240d interfaceC5240d) {
        s sVar;
        int i6;
        kotlin.jvm.internal.p pVar;
        if (interfaceC5240d instanceof s) {
            sVar = (s) interfaceC5240d;
            int i9 = sVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                sVar.label = i9 - Integer.MIN_VALUE;
                Object obj = sVar.result;
                A7.a aVar = A7.a.f215n;
                i6 = sVar.label;
                if (i6 != 0) {
                    Q3.b.s(obj);
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    Z7.d dVar = F.f3000c;
                    t tVar = new t(pVar2, this, i4, null);
                    sVar.L$0 = pVar2;
                    sVar.label = 1;
                    if (AbstractC0410y.y(dVar, tVar, sVar) == aVar) {
                        return aVar;
                    }
                    pVar = pVar2;
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (kotlin.jvm.internal.p) sVar.L$0;
                    Q3.b.s(obj);
                }
                return Boolean.valueOf(pVar.f38642n);
            }
        }
        sVar = new s(interfaceC5240d);
        Object obj2 = sVar.result;
        A7.a aVar2 = A7.a.f215n;
        i6 = sVar.label;
        if (i6 != 0) {
        }
        return Boolean.valueOf(pVar.f38642n);
    }

    @Override // u5.d
    public Object markAsDismissedForGroup(String str, InterfaceC5240d interfaceC5240d) {
        Object y7 = AbstractC0410y.y(F.f3000c, new u(str, null), interfaceC5240d);
        return y7 == A7.a.f215n ? y7 : u7.v.f41073a;
    }

    @Override // u5.d
    public Object markAsDismissedForOutstanding(InterfaceC5240d interfaceC5240d) {
        Object y7 = AbstractC0410y.y(F.f3000c, new v(null), interfaceC5240d);
        return y7 == A7.a.f215n ? y7 : u7.v.f41073a;
    }
}
