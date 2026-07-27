package com.onesignal.notifications.internal.data.impl;

import D.y;
import S7.AbstractC0406y;
import S7.F;
import S7.InterfaceC0404w;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.e.n;
import com.icefishing.icefishinglive2.AbstractC4404f;
import java.util.ArrayList;
import java.util.List;
import m5.InterfaceC4733a;
import org.json.JSONException;
import u5.C5082c;
import u5.InterfaceC5080a;
import y5.C5242a;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class b implements u5.d {
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800;
    private final x4.f _applicationService;
    private final InterfaceC4733a _badgeCountUpdater;
    private final A4.d _databaseProvider;
    private final InterfaceC5080a _queryHelper;
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
            public a(int i, int i6, b bVar) {
                super(1);
                this.$maxNumberOfNotificationsInt = i;
                this.$notificationsToMakeRoomFor = i6;
                this.this$0 = bVar;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((A4.a) obj);
                return u7.v.f41350a;
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
        public C0229b(int i, b bVar, int i6, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$maxNumberOfNotificationsInt = i;
            this.this$0 = bVar;
            this.$notificationsToMakeRoomFor = i6;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new C0229b(this.$maxNumberOfNotificationsInt, this.this$0, this.$notificationsToMakeRoomFor, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((C0229b) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            String valueOf = String.valueOf(this.$maxNumberOfNotificationsInt);
            try {
                A4.b.query$default(this.this$0._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, this.this$0._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, "_id", valueOf + this.$notificationsToMakeRoomFor, new a(this.$maxNumberOfNotificationsInt, this.$notificationsToMakeRoomFor, this.this$0), 56, null);
            } catch (Throwable th) {
                com.onesignal.debug.internal.logging.b.warn("Error clearing oldest notifications over limit! ", th);
            }
            return u7.v.f41350a;
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
        public c(String str, boolean z3, int i, b bVar, String str2, String str3, boolean z6, String str4, String str5, long j6, String str6, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$id = str;
            this.$shouldDismissIdenticals = z3;
            this.$androidId = i;
            this.this$0 = bVar;
            this.$groupId = str2;
            this.$collapseKey = str3;
            this.$isOpened = z6;
            this.$title = str4;
            this.$body = str5;
            this.$expireTime = j6;
            this.$jsonPayload = str6;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new c(this.$id, this.$shouldDismissIdenticals, this.$androidId, this.this$0, this.$groupId, this.$collapseKey, this.$isOpened, this.$title, this.$body, this.$expireTime, this.$jsonPayload, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((c) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
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
                contentValues2.put(n.a.f13061g, new Long(this.$expireTime));
                contentValues2.put("full_data", this.$jsonPayload);
                this.this$0._databaseProvider.getOs().insertOrThrow("notification", null, contentValues2);
                com.onesignal.debug.internal.logging.b.debug$default("Notification saved values: " + contentValues2, null, 2, null);
                if (!this.$isOpened) {
                    this.this$0._badgeCountUpdater.update();
                }
            } catch (JSONException e9) {
                e9.printStackTrace();
            }
            return u7.v.f41350a;
        }
    }

    public static final class d extends B7.h implements I7.p {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $groupId;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, String str, b bVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$androidId = i;
            this.$groupId = str;
            this.this$0 = bVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new d(this.$androidId, this.$groupId, this.this$0, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((d) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            ContentValues contentValues = new ContentValues();
            contentValues.put("android_notification_id", new Integer(this.$androidId));
            contentValues.put("group_id", this.$groupId);
            contentValues.put("is_summary", new Integer(1));
            this.this$0._databaseProvider.getOs().insertOrThrow("notification", null, contentValues);
            return u7.v.f41350a;
        }
    }

    public static final class e extends B7.h implements I7.p {
        int label;

        public e(InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return b.this.new e(interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((e) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            String valueOf = String.valueOf((b.this._time.getCurrentTimeMillis() / 1000) - b.NOTIFICATION_CACHE_DATA_LIFETIME);
            kotlin.jvm.internal.h.d(valueOf, "valueOf(...)");
            b.this._databaseProvider.getOs().delete("notification", "created_time < ?", new String[]{valueOf});
            return u7.v.f41350a;
        }
    }

    public static final class f extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
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
                return u7.v.f41350a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.moveToFirst()) {
                    com.onesignal.debug.internal.logging.b.debug$default("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + this.$id, null, 2, null);
                    this.$result.f38715n = true;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, b bVar, kotlin.jvm.internal.p pVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$id = str;
            this.this$0 = bVar;
            this.$result = pVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new g(this.$id, this.this$0, this.$result, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((g) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            String[] strArr = {L5.e.NOTIFICATION_ID_TAG};
            String str = this.$id;
            kotlin.jvm.internal.h.b(str);
            A4.b.query$default(this.this$0._databaseProvider.getOs(), "notification", strArr, "notification_id = ?", new String[]{str}, null, null, null, null, new a(this.$id, this.$result), 240, null);
            return u7.v.f41350a;
        }
    }

    public static final class h extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
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
                return u7.v.f41350a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                boolean moveToFirst = it.moveToFirst();
                this.$recentId.f38717n = !moveToFirst ? null : Integer.valueOf(it.getInt("android_notification_id"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(kotlin.jvm.internal.r rVar, String[] strArr, kotlin.jvm.internal.r rVar2, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$whereStr = rVar;
            this.$whereArgs = strArr;
            this.$recentId = rVar2;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return b.this.new i(this.$whereStr, this.$whereArgs, this.$recentId, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((i) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            A4.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, (String) this.$whereStr.f38717n, this.$whereArgs, null, null, "created_time DESC", "1", new a(this.$recentId), 48, null);
            return u7.v.f41350a;
        }
    }

    public static final class j extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public j(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
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
                return u7.v.f41350a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.moveToFirst()) {
                    this.$androidId.f38717n = Integer.valueOf(it.getInt("android_notification_id"));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, kotlin.jvm.internal.r rVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$collapseKey = str;
            this.$androidId = rVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return b.this.new k(this.$collapseKey, this.$androidId, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((k) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            A4.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{this.$collapseKey}, null, null, null, null, new a(this.$androidId), 240, null);
            return u7.v.f41350a;
        }
    }

    public static final class l extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public l(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
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
                return u7.v.f41350a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.moveToFirst()) {
                    this.$groupId.f38717n = it.getOptString("group_id");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i, kotlin.jvm.internal.r rVar, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$androidId = i;
            this.$groupId = rVar;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return b.this.new m(this.$androidId, this.$groupId, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((m) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            A4.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"group_id"}, "android_notification_id = " + this.$androidId, null, null, null, null, null, new a(this.$groupId), 248, null);
            return u7.v.f41350a;
        }
    }

    public static final class n extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public n(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.listNotificationsForGroup(null, this);
        }
    }

    public static final class o extends B7.h implements I7.p {
        final /* synthetic */ List<C5082c> $listOfNotifications;
        final /* synthetic */ String $summaryGroup;
        int label;
        final /* synthetic */ b this$0;

        public static final class a extends kotlin.jvm.internal.i implements I7.l {
            final /* synthetic */ List<C5082c> $listOfNotifications;
            final /* synthetic */ String $summaryGroup;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<C5082c> list, String str) {
                super(1);
                this.$listOfNotifications = list;
                this.$summaryGroup = str;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((A4.a) obj);
                return u7.v.f41350a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                if (it.moveToFirst()) {
                    do {
                        try {
                            String optString = it.getOptString("title");
                            String optString2 = it.getOptString("message");
                            this.$listOfNotifications.add(new C5082c(it.getInt("android_notification_id"), it.getString(L5.e.NOTIFICATION_ID_TAG), it.getString("full_data"), it.getLong("created_time"), optString, optString2));
                        } catch (JSONException unused) {
                            com.onesignal.debug.internal.logging.b.error$default("Could not parse JSON of sub notification in group: " + this.$summaryGroup, null, 2, null);
                        }
                    } while (it.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, b bVar, List<C5082c> list, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$summaryGroup = str;
            this.this$0 = bVar;
            this.$listOfNotifications = list;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new o(this.$summaryGroup, this.this$0, this.$listOfNotifications, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((o) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            A4.b.query$default(this.this$0._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{this.$summaryGroup}, null, null, "_id DESC", null, new a(this.$listOfNotifications, this.$summaryGroup), 176, null);
            return u7.v.f41350a;
        }
    }

    public static final class p extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public p(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
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
        final /* synthetic */ List<C5082c> $listOfNotifications;
        int label;

        public static final class a extends kotlin.jvm.internal.i implements I7.l {
            final /* synthetic */ List<C5082c> $listOfNotifications;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<C5082c> list) {
                super(1);
                this.$listOfNotifications = list;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((A4.a) obj);
                return u7.v.f41350a;
            }

            public final void invoke(A4.a it) {
                kotlin.jvm.internal.h.e(it, "it");
                while (it.moveToNext()) {
                    String optString = it.getOptString("title");
                    String optString2 = it.getOptString("message");
                    String string = it.getString(L5.e.NOTIFICATION_ID_TAG);
                    this.$listOfNotifications.add(new C5082c(it.getInt("android_notification_id"), string, it.getString("full_data"), it.getLong("created_time"), optString, optString2));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List<Integer> list, List<C5082c> list2, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$excludeAndroidIds = list;
            this.$listOfNotifications = list2;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return b.this.new q(this.$excludeAndroidIds, this.$listOfNotifications, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((q) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            StringBuilder recentUninteractedWithNotificationsWhere = b.this._queryHelper.recentUninteractedWithNotificationsWhere();
            if (this.$excludeAndroidIds != null) {
                recentUninteractedWithNotificationsWhere.append(" AND android_notification_id NOT IN (");
                recentUninteractedWithNotificationsWhere.append(TextUtils.join(",", this.$excludeAndroidIds));
                recentUninteractedWithNotificationsWhere.append(")");
            }
            A4.b.query$default(b.this._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), recentUninteractedWithNotificationsWhere.toString(), null, null, null, "_id DESC", String.valueOf(C5242a.INSTANCE.getMaxNumberOfNotifications()), new a(this.$listOfNotifications), 56, null);
            return u7.v.f41350a;
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
        public r(String str, boolean z3, boolean z6, b bVar, int i, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$summaryGroup = str;
            this.$dismissed = z3;
            this.$clearGroupOnSummaryClick = z6;
            this.this$0 = bVar;
            this.$androidId = i;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new r(this.$summaryGroup, this.$dismissed, this.$clearGroupOnSummaryClick, this.this$0, this.$androidId, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((r) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41350a);
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
            boolean z3;
            A7.a aVar = A7.a.f58n;
            int i = this.label;
            if (i == 0) {
                com.bumptech.glide.d.k(obj);
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
                        z3 = a9;
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
                return u7.v.f41350a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z3 = this.Z$0;
            str = (String) this.L$0;
            com.bumptech.glide.d.k(obj);
            String valueOf = String.valueOf(obj);
            str = AbstractC4404f.f(str, " AND android_notification_id = ?");
            strArr = z3 ? new String[]{valueOf} : new String[]{this.$summaryGroup, valueOf};
            ContentValues contentValues2 = new ContentValues();
            if (this.$dismissed) {
            }
            this.this$0._databaseProvider.getOs().update("notification", contentValues2, str, strArr);
            this.this$0._badgeCountUpdater.update();
            return u7.v.f41350a;
        }
    }

    public static final class s extends B7.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public s(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
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
        public t(kotlin.jvm.internal.p pVar, b bVar, int i, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$didDismiss = pVar;
            this.this$0 = bVar;
            this.$androidId = i;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return new t(this.$didDismiss, this.this$0, this.$androidId, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((t) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            this.$didDismiss.f38715n = this.this$0.internalMarkAsDismissed(this.$androidId);
            return u7.v.f41350a;
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
                return u7.v.f41350a;
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
        public u(String str, InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
            this.$group = str;
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return b.this.new u(this.$group, interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((u) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            NotificationManager notificationManager = t5.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            String[] strArr = {this.$group};
            A4.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0", strArr, null, null, null, null, new a(notificationManager), 240, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "group_id = ? AND opened = 0 AND dismissed = 0", strArr);
            b.this._badgeCountUpdater.update();
            return u7.v.f41350a;
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
                return u7.v.f41350a;
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

        public v(InterfaceC5267d interfaceC5267d) {
            super(2, interfaceC5267d);
        }

        @Override // B7.a
        public final InterfaceC5267d create(Object obj, InterfaceC5267d interfaceC5267d) {
            return b.this.new v(interfaceC5267d);
        }

        @Override // I7.p
        public final Object invoke(InterfaceC0404w interfaceC0404w, InterfaceC5267d interfaceC5267d) {
            return ((v) create(interfaceC0404w, interfaceC5267d)).invokeSuspend(u7.v.f41350a);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            A7.a aVar = A7.a.f58n;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.d.k(obj);
            NotificationManager notificationManager = t5.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            A4.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "dismissed = 0 AND opened = 0", null, null, null, null, null, new a(notificationManager), 248, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "opened = 0", null);
            b.this._badgeCountUpdater.updateCount(0);
            return u7.v.f41350a;
        }
    }

    public b(x4.f _applicationService, InterfaceC5080a _queryHelper, A4.d _databaseProvider, K4.a _time, InterfaceC4733a _badgeCountUpdater) {
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
    public final boolean internalMarkAsDismissed(int i6) {
        Context appContext = this._applicationService.getAppContext();
        String k9 = y.k(i6, "android_notification_id = ", " AND opened = 0 AND dismissed = 0");
        ContentValues contentValues = new ContentValues();
        contentValues.put("dismissed", (Integer) 1);
        boolean z3 = this._databaseProvider.getOs().update("notification", contentValues, k9, null) > 0;
        this._badgeCountUpdater.update();
        t5.e.INSTANCE.getNotificationManager(appContext).cancel(i6);
        return z3;
    }

    @Override // u5.d
    public Object clearOldestOverLimitFallback(int i6, int i9, InterfaceC5267d interfaceC5267d) {
        Object y7 = AbstractC0406y.y(F.f2917c, new C0229b(i9, this, i6, null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : u7.v.f41350a;
    }

    @Override // u5.d
    public Object createNotification(String str, String str2, String str3, boolean z3, boolean z6, int i6, String str4, String str5, long j6, String str6, InterfaceC5267d interfaceC5267d) {
        Object y7 = AbstractC0406y.y(F.f2917c, new c(str, z3, i6, this, str2, str3, z6, str4, str5, j6, str6, null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : u7.v.f41350a;
    }

    @Override // u5.d
    public Object createSummaryNotification(int i6, String str, InterfaceC5267d interfaceC5267d) {
        Object y7 = AbstractC0406y.y(F.f2917c, new d(i6, str, this, null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : u7.v.f41350a;
    }

    @Override // u5.d
    public Object deleteExpiredNotifications(InterfaceC5267d interfaceC5267d) {
        Object y7 = AbstractC0406y.y(F.f2917c, new e(null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : u7.v.f41350a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doesNotificationExist(String str, InterfaceC5267d interfaceC5267d) {
        f fVar;
        int i6;
        kotlin.jvm.internal.p pVar;
        if (interfaceC5267d instanceof f) {
            fVar = (f) interfaceC5267d;
            int i9 = fVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                fVar.label = i9 - Integer.MIN_VALUE;
                Object obj = fVar.result;
                A7.a aVar = A7.a.f58n;
                i6 = fVar.label;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    if (str == null || "".equals(str)) {
                        return Boolean.FALSE;
                    }
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    Z7.d dVar = F.f2917c;
                    g gVar = new g(str, this, pVar2, null);
                    fVar.L$0 = pVar2;
                    fVar.label = 1;
                    if (AbstractC0406y.y(dVar, gVar, fVar) == aVar) {
                        return aVar;
                    }
                    pVar = pVar2;
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (kotlin.jvm.internal.p) fVar.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                return Boolean.valueOf(pVar.f38715n);
            }
        }
        fVar = new f(interfaceC5267d);
        Object obj2 = fVar.result;
        A7.a aVar2 = A7.a.f58n;
        i6 = fVar.label;
        if (i6 != 0) {
        }
        return Boolean.valueOf(pVar.f38715n);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdForGroup(String str, boolean z3, InterfaceC5267d interfaceC5267d) {
        h hVar;
        int i6;
        kotlin.jvm.internal.r rVar;
        if (interfaceC5267d instanceof h) {
            hVar = (h) interfaceC5267d;
            int i9 = hVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                hVar.label = i9 - Integer.MIN_VALUE;
                Object obj = hVar.result;
                A7.a aVar = A7.a.f58n;
                i6 = hVar.label;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                    boolean a9 = kotlin.jvm.internal.h.a(str, t5.e.GROUPLESS_SUMMARY_KEY);
                    kotlin.jvm.internal.r rVar3 = new kotlin.jvm.internal.r();
                    rVar3.f38717n = a9 ? "group_id IS NULL" : "group_id = ?";
                    rVar3.f38717n = u1.h.g(new StringBuilder(), (String) rVar3.f38717n, " AND dismissed = 0 AND opened = 0 AND ");
                    StringBuilder sb = new StringBuilder();
                    sb.append((String) rVar3.f38717n);
                    sb.append(z3 ? "is_summary = 1" : "is_summary = 0");
                    rVar3.f38717n = sb.toString();
                    String[] strArr = a9 ? null : new String[]{str};
                    Z7.d dVar = F.f2917c;
                    i iVar = new i(rVar3, strArr, rVar2, null);
                    hVar.L$0 = rVar2;
                    hVar.label = 1;
                    if (AbstractC0406y.y(dVar, iVar, hVar) == aVar) {
                        return aVar;
                    }
                    rVar = rVar2;
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (kotlin.jvm.internal.r) hVar.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                return rVar.f38717n;
            }
        }
        hVar = new h(interfaceC5267d);
        Object obj2 = hVar.result;
        A7.a aVar2 = A7.a.f58n;
        i6 = hVar.label;
        if (i6 != 0) {
        }
        return rVar.f38717n;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getAndroidIdFromCollapseKey(String str, InterfaceC5267d interfaceC5267d) {
        j jVar;
        int i6;
        kotlin.jvm.internal.r rVar;
        if (interfaceC5267d instanceof j) {
            jVar = (j) interfaceC5267d;
            int i9 = jVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                jVar.label = i9 - Integer.MIN_VALUE;
                Object obj = jVar.result;
                A7.a aVar = A7.a.f58n;
                i6 = jVar.label;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj);
                    kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                    Z7.d dVar = F.f2917c;
                    k kVar = new k(str, rVar2, null);
                    jVar.L$0 = rVar2;
                    jVar.label = 1;
                    if (AbstractC0406y.y(dVar, kVar, jVar) == aVar) {
                        return aVar;
                    }
                    rVar = rVar2;
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (kotlin.jvm.internal.r) jVar.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                return rVar.f38717n;
            }
        }
        jVar = new j(interfaceC5267d);
        Object obj2 = jVar.result;
        A7.a aVar2 = A7.a.f58n;
        i6 = jVar.label;
        if (i6 != 0) {
        }
        return rVar.f38717n;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getGroupId(int i6, InterfaceC5267d interfaceC5267d) {
        l lVar;
        int i9;
        kotlin.jvm.internal.r rVar;
        if (interfaceC5267d instanceof l) {
            lVar = (l) interfaceC5267d;
            int i10 = lVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                lVar.label = i10 - Integer.MIN_VALUE;
                Object obj = lVar.result;
                A7.a aVar = A7.a.f58n;
                i9 = lVar.label;
                if (i9 != 0) {
                    com.bumptech.glide.d.k(obj);
                    kotlin.jvm.internal.r rVar2 = new kotlin.jvm.internal.r();
                    Z7.d dVar = F.f2917c;
                    m mVar = new m(i6, rVar2, null);
                    lVar.L$0 = rVar2;
                    lVar.label = 1;
                    if (AbstractC0406y.y(dVar, mVar, lVar) == aVar) {
                        return aVar;
                    }
                    rVar = rVar2;
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = (kotlin.jvm.internal.r) lVar.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                return rVar.f38717n;
            }
        }
        lVar = new l(interfaceC5267d);
        Object obj2 = lVar.result;
        A7.a aVar2 = A7.a.f58n;
        i9 = lVar.label;
        if (i9 != 0) {
        }
        return rVar.f38717n;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForGroup(String str, InterfaceC5267d interfaceC5267d) {
        n nVar;
        int i6;
        if (interfaceC5267d instanceof n) {
            nVar = (n) interfaceC5267d;
            int i9 = nVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                nVar.label = i9 - Integer.MIN_VALUE;
                Object obj = nVar.result;
                A7.a aVar = A7.a.f58n;
                i6 = nVar.label;
                if (i6 == 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list = (List) nVar.L$0;
                    com.bumptech.glide.d.k(obj);
                    return list;
                }
                com.bumptech.glide.d.k(obj);
                ArrayList arrayList = new ArrayList();
                Z7.d dVar = F.f2917c;
                o oVar = new o(str, this, arrayList, null);
                nVar.L$0 = arrayList;
                nVar.label = 1;
                return AbstractC0406y.y(dVar, oVar, nVar) == aVar ? aVar : arrayList;
            }
        }
        nVar = new n(interfaceC5267d);
        Object obj2 = nVar.result;
        A7.a aVar2 = A7.a.f58n;
        i6 = nVar.label;
        if (i6 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object listNotificationsForOutstanding(List<Integer> list, InterfaceC5267d interfaceC5267d) {
        p pVar;
        int i6;
        if (interfaceC5267d instanceof p) {
            pVar = (p) interfaceC5267d;
            int i9 = pVar.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                pVar.label = i9 - Integer.MIN_VALUE;
                Object obj = pVar.result;
                A7.a aVar = A7.a.f58n;
                i6 = pVar.label;
                if (i6 == 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    List list2 = (List) pVar.L$0;
                    com.bumptech.glide.d.k(obj);
                    return list2;
                }
                com.bumptech.glide.d.k(obj);
                ArrayList arrayList = new ArrayList();
                Z7.d dVar = F.f2917c;
                q qVar = new q(list, arrayList, null);
                pVar.L$0 = arrayList;
                pVar.label = 1;
                return AbstractC0406y.y(dVar, qVar, pVar) == aVar ? aVar : arrayList;
            }
        }
        pVar = new p(interfaceC5267d);
        Object obj2 = pVar.result;
        A7.a aVar2 = A7.a.f58n;
        i6 = pVar.label;
        if (i6 == 0) {
        }
    }

    @Override // u5.d
    public Object markAsConsumed(int i6, boolean z3, String str, boolean z6, InterfaceC5267d interfaceC5267d) {
        Object y7 = AbstractC0406y.y(F.f2917c, new r(str, z3, z6, this, i6, null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : u7.v.f41350a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // u5.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object markAsDismissed(int i6, InterfaceC5267d interfaceC5267d) {
        s sVar;
        int i9;
        kotlin.jvm.internal.p pVar;
        if (interfaceC5267d instanceof s) {
            sVar = (s) interfaceC5267d;
            int i10 = sVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sVar.label = i10 - Integer.MIN_VALUE;
                Object obj = sVar.result;
                A7.a aVar = A7.a.f58n;
                i9 = sVar.label;
                if (i9 != 0) {
                    com.bumptech.glide.d.k(obj);
                    kotlin.jvm.internal.p pVar2 = new kotlin.jvm.internal.p();
                    Z7.d dVar = F.f2917c;
                    t tVar = new t(pVar2, this, i6, null);
                    sVar.L$0 = pVar2;
                    sVar.label = 1;
                    if (AbstractC0406y.y(dVar, tVar, sVar) == aVar) {
                        return aVar;
                    }
                    pVar = pVar2;
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    pVar = (kotlin.jvm.internal.p) sVar.L$0;
                    com.bumptech.glide.d.k(obj);
                }
                return Boolean.valueOf(pVar.f38715n);
            }
        }
        sVar = new s(interfaceC5267d);
        Object obj2 = sVar.result;
        A7.a aVar2 = A7.a.f58n;
        i9 = sVar.label;
        if (i9 != 0) {
        }
        return Boolean.valueOf(pVar.f38715n);
    }

    @Override // u5.d
    public Object markAsDismissedForGroup(String str, InterfaceC5267d interfaceC5267d) {
        Object y7 = AbstractC0406y.y(F.f2917c, new u(str, null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : u7.v.f41350a;
    }

    @Override // u5.d
    public Object markAsDismissedForOutstanding(InterfaceC5267d interfaceC5267d) {
        Object y7 = AbstractC0406y.y(F.f2917c, new v(null), interfaceC5267d);
        return y7 == A7.a.f58n ? y7 : u7.v.f41350a;
    }
}
