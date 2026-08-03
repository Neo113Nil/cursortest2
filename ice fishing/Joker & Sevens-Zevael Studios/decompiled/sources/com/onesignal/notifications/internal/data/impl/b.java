package com.onesignal.notifications.internal.data.impl;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import yc.a0;
import yc.i0;
import yc.y;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements oa.d {
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800;
    private final q8.f _applicationService;
    private final ga.a _badgeCountUpdater;
    private final t8.d _databaseProvider;
    private final oa.a _queryHelper;
    private final e9.a _time;
    public static final a Companion = new a(null);
    private static final String[] COLUMNS_FOR_LIST_NOTIFICATIONS = {"title", "message", bb.e.NOTIFICATION_ID_TAG, "android_notification_id", "full_data", "created_time"};

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        public final String[] getCOLUMNS_FOR_LIST_NOTIFICATIONS() {
            return b.COLUMNS_FOR_LIST_NOTIFICATIONS;
        }

        private a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.notifications.internal.data.impl.b$b, reason: collision with other inner class name */
    public static final class C0050b extends hc.j implements oc.e {
        final /* synthetic */ int $maxNumberOfNotificationsInt;
        final /* synthetic */ int $notificationsToMakeRoomFor;
        int label;
        final /* synthetic */ b this$0;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        /* renamed from: com.onesignal.notifications.internal.data.impl.b$b$a */
        public static final class a extends pc.k implements oc.c {
            final /* synthetic */ int $maxNumberOfNotificationsInt;
            final /* synthetic */ int $notificationsToMakeRoomFor;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i10, int i11, b bVar) {
                super(1);
                this.$maxNumberOfNotificationsInt = i10;
                this.$notificationsToMakeRoomFor = i11;
                this.this$0 = bVar;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t8.a) obj);
                return ac.o.f277a;
            }

            public final void invoke(t8.a aVar) {
                pc.j.e(aVar, "it");
                int count = (aVar.getCount() - this.$maxNumberOfNotificationsInt) + this.$notificationsToMakeRoomFor;
                if (count < 1) {
                    return;
                }
                while (aVar.moveToNext()) {
                    this.this$0.internalMarkAsDismissed(aVar.getInt("android_notification_id"));
                    count--;
                    if (count <= 0) {
                        return;
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0050b(int i10, b bVar, int i11, fc.d dVar) {
            super(2, dVar);
            this.$maxNumberOfNotificationsInt = i10;
            this.this$0 = bVar;
            this.$notificationsToMakeRoomFor = i11;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new C0050b(this.$maxNumberOfNotificationsInt, this.this$0, this.$notificationsToMakeRoomFor, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            String valueOf = String.valueOf(this.$maxNumberOfNotificationsInt);
            try {
                t8.b.query$default(this.this$0._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, this.this$0._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, "_id", valueOf + this.$notificationsToMakeRoomFor, new a(this.$maxNumberOfNotificationsInt, this.$notificationsToMakeRoomFor, this.this$0), 56, null);
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.error("Error clearing oldest notifications over limit! ", th);
            }
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((C0050b) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends hc.j implements oc.e {
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
        public c(String str, boolean z10, int i10, b bVar, String str2, String str3, boolean z11, String str4, String str5, long j3, String str6, fc.d dVar) {
            super(2, dVar);
            this.$id = str;
            this.$shouldDismissIdenticals = z10;
            this.$androidId = i10;
            this.this$0 = bVar;
            this.$groupId = str2;
            this.$collapseKey = str3;
            this.$isOpened = z11;
            this.$title = str4;
            this.$body = str5;
            this.$expireTime = j3;
            this.$jsonPayload = str6;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new c(this.$id, this.$shouldDismissIdenticals, this.$androidId, this.this$0, this.$groupId, this.$collapseKey, this.$isOpened, this.$title, this.$body, this.$expireTime, this.$jsonPayload, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
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
                contentValues2.put(bb.e.NOTIFICATION_ID_TAG, this.$id);
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
                contentValues2.put("expire_time", new Long(this.$expireTime));
                contentValues2.put("full_data", this.$jsonPayload);
                this.this$0._databaseProvider.getOs().insertOrThrow("notification", null, contentValues2);
                com.onesignal.debug.internal.logging.b.debug$default("Notification saved values: " + contentValues2, null, 2, null);
                if (!this.$isOpened) {
                    this.this$0._badgeCountUpdater.update();
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((c) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class d extends hc.j implements oc.e {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $groupId;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, String str, b bVar, fc.d dVar) {
            super(2, dVar);
            this.$androidId = i10;
            this.$groupId = str;
            this.this$0 = bVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new d(this.$androidId, this.$groupId, this.this$0, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            ContentValues contentValues = new ContentValues();
            contentValues.put("android_notification_id", new Integer(this.$androidId));
            contentValues.put("group_id", this.$groupId);
            contentValues.put("is_summary", new Integer(1));
            this.this$0._databaseProvider.getOs().insertOrThrow("notification", null, contentValues);
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((d) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class e extends hc.j implements oc.e {
        int label;

        public e(fc.d dVar) {
            super(2, dVar);
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return b.this.new e(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            String valueOf = String.valueOf((b.this._time.getCurrentTimeMillis() / 1000) - b.NOTIFICATION_CACHE_DATA_LIFETIME);
            pc.j.d(valueOf, "valueOf(\n               …FETIME,\n                )");
            b.this._databaseProvider.getOs().delete("notification", "created_time < ?", new String[]{valueOf});
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((e) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class f extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.doesNotificationExist(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class g extends hc.j implements oc.e {
        final /* synthetic */ String $id;
        final /* synthetic */ pc.o $result;
        int label;
        final /* synthetic */ b this$0;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends pc.k implements oc.c {
            final /* synthetic */ String $id;
            final /* synthetic */ pc.o $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, pc.o oVar) {
                super(1);
                this.$id = str;
                this.$result = oVar;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t8.a) obj);
                return ac.o.f277a;
            }

            public final void invoke(t8.a aVar) {
                pc.j.e(aVar, "it");
                if (aVar.moveToFirst()) {
                    com.onesignal.debug.internal.logging.b.debug$default("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + this.$id, null, 2, null);
                    this.$result.f5679g = true;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, b bVar, pc.o oVar, fc.d dVar) {
            super(2, dVar);
            this.$id = str;
            this.this$0 = bVar;
            this.$result = oVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new g(this.$id, this.this$0, this.$result, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            String[] strArr = {bb.e.NOTIFICATION_ID_TAG};
            String str = this.$id;
            pc.j.b(str);
            t8.b.query$default(this.this$0._databaseProvider.getOs(), "notification", strArr, "notification_id = ?", new String[]{str}, null, null, null, null, new a(this.$id, this.$result), 240, null);
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((g) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class h extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getAndroidIdForGroup(null, false, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class i extends hc.j implements oc.e {
        final /* synthetic */ pc.s $recentId;
        final /* synthetic */ String[] $whereArgs;
        final /* synthetic */ pc.s $whereStr;
        int label;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends pc.k implements oc.c {
            final /* synthetic */ pc.s $recentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(pc.s sVar) {
                super(1);
                this.$recentId = sVar;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t8.a) obj);
                return ac.o.f277a;
            }

            public final void invoke(t8.a aVar) {
                pc.j.e(aVar, "it");
                boolean moveToFirst = aVar.moveToFirst();
                this.$recentId.f5683g = !moveToFirst ? null : Integer.valueOf(aVar.getInt("android_notification_id"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(pc.s sVar, String[] strArr, pc.s sVar2, fc.d dVar) {
            super(2, dVar);
            this.$whereStr = sVar;
            this.$whereArgs = strArr;
            this.$recentId = sVar2;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return b.this.new i(this.$whereStr, this.$whereArgs, this.$recentId, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            t8.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, (String) this.$whereStr.f5683g, this.$whereArgs, null, null, "created_time DESC", "1", new a(this.$recentId), 48, null);
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((i) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class j extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public j(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getAndroidIdFromCollapseKey(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class k extends hc.j implements oc.e {
        final /* synthetic */ pc.s $androidId;
        final /* synthetic */ String $collapseKey;
        int label;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends pc.k implements oc.c {
            final /* synthetic */ pc.s $androidId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(pc.s sVar) {
                super(1);
                this.$androidId = sVar;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t8.a) obj);
                return ac.o.f277a;
            }

            public final void invoke(t8.a aVar) {
                pc.j.e(aVar, "it");
                if (aVar.moveToFirst()) {
                    this.$androidId.f5683g = Integer.valueOf(aVar.getInt("android_notification_id"));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, pc.s sVar, fc.d dVar) {
            super(2, dVar);
            this.$collapseKey = str;
            this.$androidId = sVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return b.this.new k(this.$collapseKey, this.$androidId, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            t8.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{this.$collapseKey}, null, null, null, null, new a(this.$androidId), 240, null);
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((k) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class l extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public l(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getGroupId(0, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class m extends hc.j implements oc.e {
        final /* synthetic */ int $androidId;
        final /* synthetic */ pc.s $groupId;
        int label;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends pc.k implements oc.c {
            final /* synthetic */ pc.s $groupId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(pc.s sVar) {
                super(1);
                this.$groupId = sVar;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t8.a) obj);
                return ac.o.f277a;
            }

            public final void invoke(t8.a aVar) {
                pc.j.e(aVar, "it");
                if (aVar.moveToFirst()) {
                    this.$groupId.f5683g = aVar.getOptString("group_id");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i10, pc.s sVar, fc.d dVar) {
            super(2, dVar);
            this.$androidId = i10;
            this.$groupId = sVar;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return b.this.new m(this.$androidId, this.$groupId, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            t8.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"group_id"}, "android_notification_id = " + this.$androidId, null, null, null, null, null, new a(this.$groupId), 248, null);
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((m) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class n extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public n(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.listNotificationsForGroup(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class o extends hc.j implements oc.e {
        final /* synthetic */ List<oa.c> $listOfNotifications;
        final /* synthetic */ String $summaryGroup;
        int label;
        final /* synthetic */ b this$0;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends pc.k implements oc.c {
            final /* synthetic */ List<oa.c> $listOfNotifications;
            final /* synthetic */ String $summaryGroup;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<oa.c> list, String str) {
                super(1);
                this.$listOfNotifications = list;
                this.$summaryGroup = str;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t8.a) obj);
                return ac.o.f277a;
            }

            public final void invoke(t8.a aVar) {
                pc.j.e(aVar, "it");
                if (aVar.moveToFirst()) {
                    do {
                        try {
                            String optString = aVar.getOptString("title");
                            String optString2 = aVar.getOptString("message");
                            this.$listOfNotifications.add(new oa.c(aVar.getInt("android_notification_id"), aVar.getString(bb.e.NOTIFICATION_ID_TAG), aVar.getString("full_data"), aVar.getLong("created_time"), optString, optString2));
                        } catch (JSONException unused) {
                            com.onesignal.debug.internal.logging.b.error$default("Could not parse JSON of sub notification in group: " + this.$summaryGroup, null, 2, null);
                        }
                    } while (aVar.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, b bVar, List<oa.c> list, fc.d dVar) {
            super(2, dVar);
            this.$summaryGroup = str;
            this.this$0 = bVar;
            this.$listOfNotifications = list;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new o(this.$summaryGroup, this.this$0, this.$listOfNotifications, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            t8.b.query$default(this.this$0._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{this.$summaryGroup}, null, null, "_id DESC", null, new a(this.$listOfNotifications, this.$summaryGroup), 176, null);
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((o) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class p extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public p(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.listNotificationsForOutstanding(null, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class q extends hc.j implements oc.e {
        final /* synthetic */ List<Integer> $excludeAndroidIds;
        final /* synthetic */ List<oa.c> $listOfNotifications;
        int label;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends pc.k implements oc.c {
            final /* synthetic */ List<oa.c> $listOfNotifications;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<oa.c> list) {
                super(1);
                this.$listOfNotifications = list;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t8.a) obj);
                return ac.o.f277a;
            }

            public final void invoke(t8.a aVar) {
                pc.j.e(aVar, "it");
                while (aVar.moveToNext()) {
                    String optString = aVar.getOptString("title");
                    String optString2 = aVar.getOptString("message");
                    String string = aVar.getString(bb.e.NOTIFICATION_ID_TAG);
                    this.$listOfNotifications.add(new oa.c(aVar.getInt("android_notification_id"), string, aVar.getString("full_data"), aVar.getLong("created_time"), optString, optString2));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List<Integer> list, List<oa.c> list2, fc.d dVar) {
            super(2, dVar);
            this.$excludeAndroidIds = list;
            this.$listOfNotifications = list2;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return b.this.new q(this.$excludeAndroidIds, this.$listOfNotifications, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            StringBuilder recentUninteractedWithNotificationsWhere = b.this._queryHelper.recentUninteractedWithNotificationsWhere();
            if (this.$excludeAndroidIds != null) {
                recentUninteractedWithNotificationsWhere.append(" AND android_notification_id NOT IN (");
                recentUninteractedWithNotificationsWhere.append(TextUtils.join(",", this.$excludeAndroidIds));
                recentUninteractedWithNotificationsWhere.append(")");
            }
            t8.b.query$default(b.this._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), recentUninteractedWithNotificationsWhere.toString(), null, null, null, "_id DESC", String.valueOf(sa.a.INSTANCE.getMaxNumberOfNotifications()), new a(this.$listOfNotifications), 56, null);
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((q) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class r extends hc.j implements oc.e {
        final /* synthetic */ int $androidId;
        final /* synthetic */ boolean $clearGroupOnSummaryClick;
        final /* synthetic */ boolean $dismissed;
        final /* synthetic */ String $summaryGroup;
        Object L$0;
        boolean Z$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, boolean z10, boolean z11, b bVar, int i10, fc.d dVar) {
            super(2, dVar);
            this.$summaryGroup = str;
            this.$dismissed = z10;
            this.$clearGroupOnSummaryClick = z11;
            this.this$0 = bVar;
            this.$androidId = i10;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new r(this.$summaryGroup, this.$dismissed, this.$clearGroupOnSummaryClick, this.this$0, this.$androidId, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0092  */
        @Override // hc.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            String[] strArr;
            String str;
            boolean z10;
            int i10 = this.label;
            if (i10 == 0) {
                v6.a.W(obj);
                String str2 = this.$summaryGroup;
                strArr = null;
                if (str2 != null) {
                    boolean a6 = pc.j.a(str2, na.e.GROUPLESS_SUMMARY_KEY);
                    if (a6) {
                        str = "group_id IS NULL";
                    } else {
                        strArr = new String[]{this.$summaryGroup};
                        str = "group_id = ?";
                    }
                    if (!this.$dismissed && !this.$clearGroupOnSummaryClick) {
                        b bVar = this.this$0;
                        String str3 = this.$summaryGroup;
                        this.L$0 = str;
                        this.Z$0 = a6;
                        this.label = 1;
                        Object androidIdForGroup = bVar.getAndroidIdForGroup(str3, false, this);
                        gc.a aVar = gc.a.f2559g;
                        if (androidIdForGroup == aVar) {
                            return aVar;
                        }
                        z10 = a6;
                        obj = androidIdForGroup;
                    }
                } else {
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
                return ac.o.f277a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = this.Z$0;
            str = (String) this.L$0;
            v6.a.W(obj);
            String valueOf = String.valueOf(obj);
            str = a4.d.i(str, " AND android_notification_id = ?");
            strArr = z10 ? new String[]{valueOf} : new String[]{this.$summaryGroup, valueOf};
            ContentValues contentValues2 = new ContentValues();
            if (this.$dismissed) {
            }
            this.this$0._databaseProvider.getOs().update("notification", contentValues2, str, strArr);
            this.this$0._badgeCountUpdater.update();
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((r) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class s extends hc.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public s(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.markAsDismissed(0, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class t extends hc.j implements oc.e {
        final /* synthetic */ int $androidId;
        final /* synthetic */ pc.o $didDismiss;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(pc.o oVar, b bVar, int i10, fc.d dVar) {
            super(2, dVar);
            this.$didDismiss = oVar;
            this.this$0 = bVar;
            this.$androidId = i10;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return new t(this.$didDismiss, this.this$0, this.$androidId, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            this.$didDismiss.f5679g = this.this$0.internalMarkAsDismissed(this.$androidId);
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((t) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class u extends hc.j implements oc.e {
        final /* synthetic */ String $group;
        int label;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends pc.k implements oc.c {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t8.a) obj);
                return ac.o.f277a;
            }

            public final void invoke(t8.a aVar) {
                pc.j.e(aVar, "it");
                while (aVar.moveToNext()) {
                    int i10 = aVar.getInt("android_notification_id");
                    if (i10 != -1) {
                        this.$notificationManager.cancel(i10);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, fc.d dVar) {
            super(2, dVar);
            this.$group = str;
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return b.this.new u(this.$group, dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            NotificationManager notificationManager = na.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            String[] strArr = {this.$group};
            t8.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0", strArr, null, null, null, null, new a(notificationManager), 240, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "group_id = ? AND opened = 0 AND dismissed = 0", strArr);
            b.this._badgeCountUpdater.update();
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((u) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class v extends hc.j implements oc.e {
        int label;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        public static final class a extends pc.k implements oc.c {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t8.a) obj);
                return ac.o.f277a;
            }

            public final void invoke(t8.a aVar) {
                pc.j.e(aVar, "it");
                if (aVar.moveToFirst()) {
                    do {
                        this.$notificationManager.cancel(aVar.getInt("android_notification_id"));
                    } while (aVar.moveToNext());
                }
            }
        }

        public v(fc.d dVar) {
            super(2, dVar);
        }

        @Override // hc.a
        public final fc.d create(Object obj, fc.d dVar) {
            return b.this.new v(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v6.a.W(obj);
            NotificationManager notificationManager = na.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            t8.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "dismissed = 0 AND opened = 0", null, null, null, null, null, new a(notificationManager), 248, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "opened = 0", null);
            b.this._badgeCountUpdater.updateCount(0);
            return ac.o.f277a;
        }

        @Override // oc.e
        public final Object invoke(y yVar, fc.d dVar) {
            return ((v) create(yVar, dVar)).invokeSuspend(ac.o.f277a);
        }
    }

    public b(q8.f fVar, oa.a aVar, t8.d dVar, e9.a aVar2, ga.a aVar3) {
        pc.j.e(fVar, "_applicationService");
        pc.j.e(aVar, "_queryHelper");
        pc.j.e(dVar, "_databaseProvider");
        pc.j.e(aVar2, "_time");
        pc.j.e(aVar3, "_badgeCountUpdater");
        this._applicationService = fVar;
        this._queryHelper = aVar;
        this._databaseProvider = dVar;
        this._time = aVar2;
        this._badgeCountUpdater = aVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean internalMarkAsDismissed(int i10) {
        Context appContext = this._applicationService.getAppContext();
        String h10 = a4.d.h("android_notification_id = ", i10, " AND opened = 0 AND dismissed = 0");
        ContentValues contentValues = new ContentValues();
        contentValues.put("dismissed", (Integer) 1);
        boolean z10 = this._databaseProvider.getOs().update("notification", contentValues, h10, null) > 0;
        this._badgeCountUpdater.update();
        na.e.INSTANCE.getNotificationManager(appContext).cancel(i10);
        return z10;
    }

    @Override // oa.d
    public Object clearOldestOverLimitFallback(int i10, int i11, fc.d dVar) {
        Object A = a0.A(i0.f8861c, new C0050b(i11, this, i10, null), dVar);
        return A == gc.a.f2559g ? A : ac.o.f277a;
    }

    @Override // oa.d
    public Object createNotification(String str, String str2, String str3, boolean z10, boolean z11, int i10, String str4, String str5, long j3, String str6, fc.d dVar) {
        Object A = a0.A(i0.f8861c, new c(str, z10, i10, this, str2, str3, z11, str4, str5, j3, str6, null), dVar);
        return A == gc.a.f2559g ? A : ac.o.f277a;
    }

    @Override // oa.d
    public Object createSummaryNotification(int i10, String str, fc.d dVar) {
        Object A = a0.A(i0.f8861c, new d(i10, str, this, null), dVar);
        return A == gc.a.f2559g ? A : ac.o.f277a;
    }

    @Override // oa.d
    public Object deleteExpiredNotifications(fc.d dVar) {
        Object A = a0.A(i0.f8861c, new e(null), dVar);
        return A == gc.a.f2559g ? A : ac.o.f277a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // oa.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doesNotificationExist(String str, fc.d dVar) {
        f fVar;
        int i10;
        pc.o oVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i11 = fVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.label = i11 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                i10 = fVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    if (str == null || "".equals(str)) {
                        return Boolean.FALSE;
                    }
                    pc.o oVar2 = new pc.o();
                    fd.d dVar2 = i0.f8861c;
                    g gVar = new g(str, this, oVar2, null);
                    fVar.L$0 = oVar2;
                    fVar.label = 1;
                    Object A = a0.A(dVar2, gVar, fVar);
                    gc.a aVar = gc.a.f2559g;
                    if (A == aVar) {
                        return aVar;
                    }
                    oVar = oVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = (pc.o) fVar.L$0;
                    v6.a.W(obj);
                }
                return Boolean.valueOf(oVar.f5679g);
            }
        }
        fVar = new f(dVar);
        Object obj2 = fVar.result;
        i10 = fVar.label;
        if (i10 != 0) {
        }
        return Boolean.valueOf(oVar.f5679g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // oa.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdForGroup(String str, boolean z10, fc.d dVar) {
        h hVar;
        int i10;
        pc.s sVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i11 = hVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                hVar.label = i11 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                i10 = hVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    pc.s sVar2 = new pc.s();
                    boolean a6 = pc.j.a(str, na.e.GROUPLESS_SUMMARY_KEY);
                    pc.s sVar3 = new pc.s();
                    sVar3.f5683g = a6 ? "group_id IS NULL" : "group_id = ?";
                    sVar3.f5683g = ((String) sVar3.f5683g) + " AND dismissed = 0 AND opened = 0 AND ";
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) sVar3.f5683g);
                    sb.append(z10 ? "is_summary = 1" : "is_summary = 0");
                    sVar3.f5683g = sb.toString();
                    String[] strArr = a6 ? null : new String[]{str};
                    fd.d dVar2 = i0.f8861c;
                    i iVar = new i(sVar3, strArr, sVar2, null);
                    hVar.L$0 = sVar2;
                    hVar.label = 1;
                    Object A = a0.A(dVar2, iVar, hVar);
                    gc.a aVar = gc.a.f2559g;
                    if (A == aVar) {
                        return aVar;
                    }
                    sVar = sVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (pc.s) hVar.L$0;
                    v6.a.W(obj);
                }
                return sVar.f5683g;
            }
        }
        hVar = new h(dVar);
        Object obj2 = hVar.result;
        i10 = hVar.label;
        if (i10 != 0) {
        }
        return sVar.f5683g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // oa.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdFromCollapseKey(String str, fc.d dVar) {
        j jVar;
        int i10;
        pc.s sVar;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i11 = jVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                jVar.label = i11 - Integer.MIN_VALUE;
                Object obj = jVar.result;
                i10 = jVar.label;
                if (i10 != 0) {
                    v6.a.W(obj);
                    pc.s sVar2 = new pc.s();
                    fd.d dVar2 = i0.f8861c;
                    k kVar = new k(str, sVar2, null);
                    jVar.L$0 = sVar2;
                    jVar.label = 1;
                    Object A = a0.A(dVar2, kVar, jVar);
                    gc.a aVar = gc.a.f2559g;
                    if (A == aVar) {
                        return aVar;
                    }
                    sVar = sVar2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (pc.s) jVar.L$0;
                    v6.a.W(obj);
                }
                return sVar.f5683g;
            }
        }
        jVar = new j(dVar);
        Object obj2 = jVar.result;
        i10 = jVar.label;
        if (i10 != 0) {
        }
        return sVar.f5683g;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // oa.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGroupId(int i10, fc.d dVar) {
        l lVar;
        int i11;
        pc.s sVar;
        if (dVar instanceof l) {
            lVar = (l) dVar;
            int i12 = lVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                lVar.label = i12 - Integer.MIN_VALUE;
                Object obj = lVar.result;
                i11 = lVar.label;
                if (i11 != 0) {
                    v6.a.W(obj);
                    pc.s sVar2 = new pc.s();
                    fd.d dVar2 = i0.f8861c;
                    m mVar = new m(i10, sVar2, null);
                    lVar.L$0 = sVar2;
                    lVar.label = 1;
                    Object A = a0.A(dVar2, mVar, lVar);
                    gc.a aVar = gc.a.f2559g;
                    if (A == aVar) {
                        return aVar;
                    }
                    sVar = sVar2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (pc.s) lVar.L$0;
                    v6.a.W(obj);
                }
                return sVar.f5683g;
            }
        }
        lVar = new l(dVar);
        Object obj2 = lVar.result;
        i11 = lVar.label;
        if (i11 != 0) {
        }
        return sVar.f5683g;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // oa.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForGroup(String str, fc.d dVar) {
        n nVar;
        int i10;
        if (dVar instanceof n) {
            nVar = (n) dVar;
            int i11 = nVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                nVar.label = i11 - Integer.MIN_VALUE;
                Object obj = nVar.result;
                i10 = nVar.label;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) nVar.L$0;
                    v6.a.W(obj);
                    return list;
                }
                v6.a.W(obj);
                ArrayList arrayList = new ArrayList();
                fd.d dVar2 = i0.f8861c;
                o oVar = new o(str, this, arrayList, null);
                nVar.L$0 = arrayList;
                nVar.label = 1;
                Object A = a0.A(dVar2, oVar, nVar);
                gc.a aVar = gc.a.f2559g;
                return A == aVar ? aVar : arrayList;
            }
        }
        nVar = new n(dVar);
        Object obj2 = nVar.result;
        i10 = nVar.label;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // oa.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForOutstanding(List<Integer> list, fc.d dVar) {
        p pVar;
        int i10;
        if (dVar instanceof p) {
            pVar = (p) dVar;
            int i11 = pVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                pVar.label = i11 - Integer.MIN_VALUE;
                Object obj = pVar.result;
                i10 = pVar.label;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) pVar.L$0;
                    v6.a.W(obj);
                    return list2;
                }
                v6.a.W(obj);
                ArrayList arrayList = new ArrayList();
                fd.d dVar2 = i0.f8861c;
                q qVar = new q(list, arrayList, null);
                pVar.L$0 = arrayList;
                pVar.label = 1;
                Object A = a0.A(dVar2, qVar, pVar);
                gc.a aVar = gc.a.f2559g;
                return A == aVar ? aVar : arrayList;
            }
        }
        pVar = new p(dVar);
        Object obj2 = pVar.result;
        i10 = pVar.label;
        if (i10 == 0) {
        }
    }

    @Override // oa.d
    public Object markAsConsumed(int i10, boolean z10, String str, boolean z11, fc.d dVar) {
        Object A = a0.A(i0.f8861c, new r(str, z10, z11, this, i10, null), dVar);
        return A == gc.a.f2559g ? A : ac.o.f277a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // oa.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object markAsDismissed(int i10, fc.d dVar) {
        s sVar;
        int i11;
        pc.o oVar;
        if (dVar instanceof s) {
            sVar = (s) dVar;
            int i12 = sVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                sVar.label = i12 - Integer.MIN_VALUE;
                Object obj = sVar.result;
                i11 = sVar.label;
                if (i11 != 0) {
                    v6.a.W(obj);
                    pc.o oVar2 = new pc.o();
                    fd.d dVar2 = i0.f8861c;
                    t tVar = new t(oVar2, this, i10, null);
                    sVar.L$0 = oVar2;
                    sVar.label = 1;
                    Object A = a0.A(dVar2, tVar, sVar);
                    gc.a aVar = gc.a.f2559g;
                    if (A == aVar) {
                        return aVar;
                    }
                    oVar = oVar2;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oVar = (pc.o) sVar.L$0;
                    v6.a.W(obj);
                }
                return Boolean.valueOf(oVar.f5679g);
            }
        }
        sVar = new s(dVar);
        Object obj2 = sVar.result;
        i11 = sVar.label;
        if (i11 != 0) {
        }
        return Boolean.valueOf(oVar.f5679g);
    }

    @Override // oa.d
    public Object markAsDismissedForGroup(String str, fc.d dVar) {
        Object A = a0.A(i0.f8861c, new u(str, null), dVar);
        return A == gc.a.f2559g ? A : ac.o.f277a;
    }

    @Override // oa.d
    public Object markAsDismissedForOutstanding(fc.d dVar) {
        Object A = a0.A(i0.f8861c, new v(null), dVar);
        return A == gc.a.f2559g ? A : ac.o.f277a;
    }
}
