package com.gamericefishpro.space.of;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.ei.w;
import com.gamericefishpro.space.pi.k0;
import com.gamericefishpro.space.pi.x;
import com.gamericefishpro.space.t0.y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements com.gamericefishpro.space.nf.d {
    private static final long NOTIFICATION_CACHE_DATA_LIFETIME = 604800;
    private final com.gamericefishpro.space.lc.f _applicationService;
    private final com.gamericefishpro.space.df.a _badgeCountUpdater;
    private final com.gamericefishpro.space.tc.d _databaseProvider;
    private final com.gamericefishpro.space.nf.a _queryHelper;
    private final com.gamericefishpro.space.kd.a _time;
    public static final a Companion = new a(null);
    private static final String[] COLUMNS_FOR_LIST_NOTIFICATIONS = {"title", "message", com.gamericefishpro.space.ng.e.NOTIFICATION_ID_TAG, "android_notification_id", "full_data", "created_time"};

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String[] getCOLUMNS_FOR_LIST_NOTIFICATIONS() {
            return b.COLUMNS_FOR_LIST_NOTIFICATIONS;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.gamericefishpro.space.of.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0038b extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ int $maxNumberOfNotificationsInt;
        final /* synthetic */ int $notificationsToMakeRoomFor;
        int label;
        final /* synthetic */ b this$0;

        /* JADX INFO: renamed from: com.gamericefishpro.space.of.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends com.gamericefishpro.space.ei.l implements Function1 {
            final /* synthetic */ int $maxNumberOfNotificationsInt;
            final /* synthetic */ int $notificationsToMakeRoomFor;
            final /* synthetic */ b this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, int i2, b bVar) {
                super(1);
                this.$maxNumberOfNotificationsInt = i;
                this.$notificationsToMakeRoomFor = i2;
                this.this$0 = bVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.gamericefishpro.space.tc.a) obj);
                return Unit.a;
            }

            public final void invoke(com.gamericefishpro.space.tc.a it) {
                Intrinsics.checkNotNullParameter(it, "it");
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
        public C0038b(int i, b bVar, int i2, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$maxNumberOfNotificationsInt = i;
            this.this$0 = bVar;
            this.$notificationsToMakeRoomFor = i2;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new C0038b(this.$maxNumberOfNotificationsInt, this.this$0, this.$notificationsToMakeRoomFor, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((C0038b) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            String strValueOf = String.valueOf(this.$maxNumberOfNotificationsInt);
            try {
                com.gamericefishpro.space.tc.b.query$default(this.this$0._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, this.this$0._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, "_id", strValueOf + this.$notificationsToMakeRoomFor, new a(this.$maxNumberOfNotificationsInt, this.$notificationsToMakeRoomFor, this.this$0), 56, null);
            } catch (Throwable th) {
                com.gamericefishpro.space.od.b.error("Error clearing oldest notifications over limit! ", th);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends com.gamericefishpro.space.vh.i implements Function2 {
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
        public c(String str, boolean z, int i, b bVar, String str2, String str3, boolean z2, String str4, String str5, long j, String str6, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$id = str;
            this.$shouldDismissIdenticals = z;
            this.$androidId = i;
            this.this$0 = bVar;
            this.$groupId = str2;
            this.$collapseKey = str3;
            this.$isOpened = z2;
            this.$title = str4;
            this.$body = str5;
            this.$expireTime = j;
            this.$jsonPayload = str6;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new c(this.$id, this.$shouldDismissIdenticals, this.$androidId, this.this$0, this.$groupId, this.$collapseKey, this.$isOpened, this.$title, this.$body, this.$expireTime, this.$jsonPayload, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((c) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.od.b.debug$default("Saving Notification id=" + this.$id, null, 2, null);
            try {
                if (this.$shouldDismissIdenticals) {
                    String str = "android_notification_id = " + this.$androidId;
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("dismissed", new Integer(1));
                    this.this$0._databaseProvider.getOs().update("notification", contentValues, str, null);
                    this.this$0._badgeCountUpdater.update();
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(com.gamericefishpro.space.ng.e.NOTIFICATION_ID_TAG, this.$id);
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
                com.gamericefishpro.space.od.b.debug$default("Notification saved values: " + contentValues2, null, 2, null);
                if (!this.$isOpened) {
                    this.this$0._badgeCountUpdater.update();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class d extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ String $groupId;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i, String str, b bVar, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$androidId = i;
            this.$groupId = str;
            this.this$0 = bVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new d(this.$androidId, this.$groupId, this.this$0, aVar);
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
            ContentValues contentValues = new ContentValues();
            contentValues.put("android_notification_id", new Integer(this.$androidId));
            contentValues.put("group_id", this.$groupId);
            contentValues.put("is_summary", new Integer(1));
            this.this$0._databaseProvider.getOs().insertOrThrow("notification", null, contentValues);
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class e extends com.gamericefishpro.space.vh.i implements Function2 {
        int label;

        public e(com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return b.this.new e(aVar);
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
            String strValueOf = String.valueOf((b.this._time.getCurrentTimeMillis() / 1000) - b.NOTIFICATION_CACHE_DATA_LIFETIME);
            Intrinsics.checkNotNullExpressionValue(strValueOf, "valueOf(...)");
            b.this._databaseProvider.getOs().delete("notification", "created_time < ?", new String[]{strValueOf});
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class f extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public f(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.doesNotificationExist(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class g extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ String $id;
        final /* synthetic */ w $result;
        int label;
        final /* synthetic */ b this$0;

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends com.gamericefishpro.space.ei.l implements Function1 {
            final /* synthetic */ String $id;
            final /* synthetic */ w $result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, w wVar) {
                super(1);
                this.$id = str;
                this.$result = wVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.gamericefishpro.space.tc.a) obj);
                return Unit.a;
            }

            public final void invoke(com.gamericefishpro.space.tc.a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.moveToFirst()) {
                    com.gamericefishpro.space.od.b.debug$default("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + this.$id, null, 2, null);
                    this.$result.d = true;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, b bVar, w wVar, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$id = str;
            this.this$0 = bVar;
            this.$result = wVar;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new g(this.$id, this.this$0, this.$result, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((g) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            String[] strArr = {com.gamericefishpro.space.ng.e.NOTIFICATION_ID_TAG};
            String str = this.$id;
            Intrinsics.b(str);
            com.gamericefishpro.space.tc.b.query$default(this.this$0._databaseProvider.getOs(), "notification", strArr, "notification_id = ?", new String[]{str}, null, null, null, null, new a(this.$id, this.$result), 240, null);
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class h extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public h(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getAndroidIdForGroup(null, false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class i extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ a0 $recentId;
        final /* synthetic */ String[] $whereArgs;
        final /* synthetic */ a0 $whereStr;
        int label;

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends com.gamericefishpro.space.ei.l implements Function1 {
            final /* synthetic */ a0 $recentId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a0 a0Var) {
                super(1);
                this.$recentId = a0Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.gamericefishpro.space.tc.a) obj);
                return Unit.a;
            }

            public final void invoke(com.gamericefishpro.space.tc.a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                boolean zMoveToFirst = it.moveToFirst();
                this.$recentId.d = !zMoveToFirst ? null : Integer.valueOf(it.getInt("android_notification_id"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(a0 a0Var, String[] strArr, a0 a0Var2, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$whereStr = a0Var;
            this.$whereArgs = strArr;
            this.$recentId = a0Var2;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return b.this.new i(this.$whereStr, this.$whereArgs, this.$recentId, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((i) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.tc.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, (String) this.$whereStr.d, this.$whereArgs, null, null, "created_time DESC", "1", new a(this.$recentId), 48, null);
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class j extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public j(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getAndroidIdFromCollapseKey(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class k extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ a0 $androidId;
        final /* synthetic */ String $collapseKey;
        int label;

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends com.gamericefishpro.space.ei.l implements Function1 {
            final /* synthetic */ a0 $androidId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a0 a0Var) {
                super(1);
                this.$androidId = a0Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.gamericefishpro.space.tc.a) obj);
                return Unit.a;
            }

            public final void invoke(com.gamericefishpro.space.tc.a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.moveToFirst()) {
                    this.$androidId.d = Integer.valueOf(it.getInt("android_notification_id"));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, a0 a0Var, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$collapseKey = str;
            this.$androidId = a0Var;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return b.this.new k(this.$collapseKey, this.$androidId, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((k) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.tc.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "collapse_id = ? AND dismissed = 0 AND opened = 0 ", new String[]{this.$collapseKey}, null, null, null, null, new a(this.$androidId), 240, null);
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class l extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public l(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.getGroupId(0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class m extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ a0 $groupId;
        int label;

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends com.gamericefishpro.space.ei.l implements Function1 {
            final /* synthetic */ a0 $groupId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a0 a0Var) {
                super(1);
                this.$groupId = a0Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.gamericefishpro.space.tc.a) obj);
                return Unit.a;
            }

            public final void invoke(com.gamericefishpro.space.tc.a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.moveToFirst()) {
                    this.$groupId.d = it.getOptString("group_id");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(int i, a0 a0Var, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$androidId = i;
            this.$groupId = a0Var;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return b.this.new m(this.$androidId, this.$groupId, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((m) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.tc.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"group_id"}, "android_notification_id = " + this.$androidId, null, null, null, null, null, new a(this.$groupId), 248, null);
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class n extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public n(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.listNotificationsForGroup(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class o extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ List<com.gamericefishpro.space.nf.c> $listOfNotifications;
        final /* synthetic */ String $summaryGroup;
        int label;
        final /* synthetic */ b this$0;

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends com.gamericefishpro.space.ei.l implements Function1 {
            final /* synthetic */ List<com.gamericefishpro.space.nf.c> $listOfNotifications;
            final /* synthetic */ String $summaryGroup;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<com.gamericefishpro.space.nf.c> list, String str) {
                super(1);
                this.$listOfNotifications = list;
                this.$summaryGroup = str;
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
                        try {
                            String optString = it.getOptString("title");
                            String optString2 = it.getOptString("message");
                            this.$listOfNotifications.add(new com.gamericefishpro.space.nf.c(it.getInt("android_notification_id"), it.getString(com.gamericefishpro.space.ng.e.NOTIFICATION_ID_TAG), it.getString("full_data"), it.getLong("created_time"), optString, optString2));
                        } catch (JSONException unused) {
                            com.gamericefishpro.space.od.b.error$default("Could not parse JSON of sub notification in group: " + this.$summaryGroup, null, 2, null);
                        }
                    } while (it.moveToNext());
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, b bVar, List<com.gamericefishpro.space.nf.c> list, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$summaryGroup = str;
            this.this$0 = bVar;
            this.$listOfNotifications = list;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new o(this.$summaryGroup, this.this$0, this.$listOfNotifications, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((o) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            com.gamericefishpro.space.tc.b.query$default(this.this$0._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{this.$summaryGroup}, null, null, "_id DESC", null, new a(this.$listOfNotifications, this.$summaryGroup), 176, null);
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class p extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public p(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.listNotificationsForOutstanding(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class q extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ List<Integer> $excludeAndroidIds;
        final /* synthetic */ List<com.gamericefishpro.space.nf.c> $listOfNotifications;
        int label;

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends com.gamericefishpro.space.ei.l implements Function1 {
            final /* synthetic */ List<com.gamericefishpro.space.nf.c> $listOfNotifications;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<com.gamericefishpro.space.nf.c> list) {
                super(1);
                this.$listOfNotifications = list;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.gamericefishpro.space.tc.a) obj);
                return Unit.a;
            }

            public final void invoke(com.gamericefishpro.space.tc.a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                while (it.moveToNext()) {
                    String optString = it.getOptString("title");
                    String optString2 = it.getOptString("message");
                    String string = it.getString(com.gamericefishpro.space.ng.e.NOTIFICATION_ID_TAG);
                    this.$listOfNotifications.add(new com.gamericefishpro.space.nf.c(it.getInt("android_notification_id"), string, it.getString("full_data"), it.getLong("created_time"), optString, optString2));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List<Integer> list, List<com.gamericefishpro.space.nf.c> list2, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$excludeAndroidIds = list;
            this.$listOfNotifications = list2;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return b.this.new q(this.$excludeAndroidIds, this.$listOfNotifications, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((q) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            StringBuilder sbRecentUninteractedWithNotificationsWhere = b.this._queryHelper.recentUninteractedWithNotificationsWhere();
            if (this.$excludeAndroidIds != null) {
                sbRecentUninteractedWithNotificationsWhere.append(" AND android_notification_id NOT IN (");
                sbRecentUninteractedWithNotificationsWhere.append(TextUtils.join(",", this.$excludeAndroidIds));
                sbRecentUninteractedWithNotificationsWhere.append(")");
            }
            com.gamericefishpro.space.tc.b.query$default(b.this._databaseProvider.getOs(), "notification", b.Companion.getCOLUMNS_FOR_LIST_NOTIFICATIONS(), sbRecentUninteractedWithNotificationsWhere.toString(), null, null, null, "_id DESC", String.valueOf(com.gamericefishpro.space.vf.a.INSTANCE.getMaxNumberOfNotifications()), new a(this.$listOfNotifications), 56, null);
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class r extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ boolean $clearGroupOnSummaryClick;
        final /* synthetic */ boolean $dismissed;
        final /* synthetic */ String $summaryGroup;
        Object L$0;
        boolean Z$0;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String str, boolean z, boolean z2, b bVar, int i, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$summaryGroup = str;
            this.$dismissed = z;
            this.$clearGroupOnSummaryClick = z2;
            this.this$0 = bVar;
            this.$androidId = i;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new r(this.$summaryGroup, this.$dismissed, this.$clearGroupOnSummaryClick, this.this$0, this.$androidId, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((r) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x008e  */
        /* JADX WARN: Code duplicated, block: B:32:0x0099  */
        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            String[] strArr;
            String strH;
            String str;
            boolean z;
            ContentValues contentValues;
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            int i = this.label;
            if (i == 0) {
                com.gamericefishpro.space.wa.b.P(obj);
                String str2 = this.$summaryGroup;
                String[] strArr2 = null;
                if (str2 != null) {
                    boolean zA = Intrinsics.a(str2, com.gamericefishpro.space.mf.e.GROUPLESS_SUMMARY_KEY);
                    if (zA) {
                        str = "group_id IS NULL";
                    } else {
                        strArr2 = new String[]{this.$summaryGroup};
                        str = "group_id = ?";
                    }
                    String str3 = str;
                    String[] strArr3 = strArr2;
                    strH = str3;
                    if (this.$dismissed || this.$clearGroupOnSummaryClick) {
                        strArr = strArr3;
                    } else {
                        b bVar = this.this$0;
                        String str4 = this.$summaryGroup;
                        this.L$0 = strH;
                        this.Z$0 = zA;
                        this.label = 1;
                        Object androidIdForGroup = bVar.getAndroidIdForGroup(str4, false, this);
                        if (androidIdForGroup == aVar) {
                            return aVar;
                        }
                        z = zA;
                        obj = androidIdForGroup;
                    }
                } else {
                    strArr = null;
                    strH = "android_notification_id = " + this.$androidId;
                }
                contentValues = new ContentValues();
                if (this.$dismissed) {
                    contentValues.put("dismissed", new Integer(1));
                } else {
                    contentValues.put("opened", new Integer(1));
                }
                this.this$0._databaseProvider.getOs().update("notification", contentValues, strH, strArr);
                this.this$0._badgeCountUpdater.update();
                return Unit.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.Z$0;
            strH = (String) this.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            String strValueOf = String.valueOf(obj);
            strH = com.gamericefishpro.space.m5.a.h(strH, " AND android_notification_id = ?");
            strArr = z ? new String[]{strValueOf} : new String[]{this.$summaryGroup, strValueOf};
            contentValues = new ContentValues();
            if (this.$dismissed) {
                contentValues.put("dismissed", new Integer(1));
            } else {
                contentValues.put("opened", new Integer(1));
            }
            this.this$0._databaseProvider.getOs().update("notification", contentValues, strH, strArr);
            this.this$0._badgeCountUpdater.update();
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class s extends com.gamericefishpro.space.vh.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public s(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.markAsDismissed(0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class t extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ int $androidId;
        final /* synthetic */ w $didDismiss;
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(w wVar, b bVar, int i, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$didDismiss = wVar;
            this.this$0 = bVar;
            this.$androidId = i;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return new t(this.$didDismiss, this.this$0, this.$androidId, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((t) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            this.$didDismiss.d = this.this$0.internalMarkAsDismissed(this.$androidId);
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class u extends com.gamericefishpro.space.vh.i implements Function2 {
        final /* synthetic */ String $group;
        int label;

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends com.gamericefishpro.space.ei.l implements Function1 {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.gamericefishpro.space.tc.a) obj);
                return Unit.a;
            }

            public final void invoke(com.gamericefishpro.space.tc.a it) {
                Intrinsics.checkNotNullParameter(it, "it");
                while (it.moveToNext()) {
                    int i = it.getInt("android_notification_id");
                    if (i != -1) {
                        this.$notificationManager.cancel(i);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(String str, com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
            this.$group = str;
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return b.this.new u(this.$group, aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((u) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            NotificationManager notificationManager = com.gamericefishpro.space.mf.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            String[] strArr = {this.$group};
            com.gamericefishpro.space.tc.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0", strArr, null, null, null, null, new a(notificationManager), 240, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "group_id = ? AND opened = 0 AND dismissed = 0", strArr);
            b.this._badgeCountUpdater.update();
            return Unit.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class v extends com.gamericefishpro.space.vh.i implements Function2 {
        int label;

        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class a extends com.gamericefishpro.space.ei.l implements Function1 {
            final /* synthetic */ NotificationManager $notificationManager;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NotificationManager notificationManager) {
                super(1);
                this.$notificationManager = notificationManager;
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
                        this.$notificationManager.cancel(it.getInt("android_notification_id"));
                    } while (it.moveToNext());
                }
            }
        }

        public v(com.gamericefishpro.space.th.a aVar) {
            super(2, aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final com.gamericefishpro.space.th.a create(Object obj, com.gamericefishpro.space.th.a aVar) {
            return b.this.new v(aVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(x xVar, com.gamericefishpro.space.th.a aVar) {
            return ((v) create(xVar, aVar)).invokeSuspend(Unit.a);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            com.gamericefishpro.space.uh.a aVar = com.gamericefishpro.space.uh.a.d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.gamericefishpro.space.wa.b.P(obj);
            NotificationManager notificationManager = com.gamericefishpro.space.mf.e.INSTANCE.getNotificationManager(b.this._applicationService.getAppContext());
            com.gamericefishpro.space.tc.b.query$default(b.this._databaseProvider.getOs(), "notification", new String[]{"android_notification_id"}, "dismissed = 0 AND opened = 0", null, null, null, null, null, new a(notificationManager), 248, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", new Integer(1));
            b.this._databaseProvider.getOs().update("notification", contentValues, "opened = 0", null);
            b.this._badgeCountUpdater.updateCount(0);
            return Unit.a;
        }
    }

    public b(com.gamericefishpro.space.lc.f _applicationService, com.gamericefishpro.space.nf.a _queryHelper, com.gamericefishpro.space.tc.d _databaseProvider, com.gamericefishpro.space.kd.a _time, com.gamericefishpro.space.df.a _badgeCountUpdater) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_queryHelper, "_queryHelper");
        Intrinsics.checkNotNullParameter(_databaseProvider, "_databaseProvider");
        Intrinsics.checkNotNullParameter(_time, "_time");
        Intrinsics.checkNotNullParameter(_badgeCountUpdater, "_badgeCountUpdater");
        this._applicationService = _applicationService;
        this._queryHelper = _queryHelper;
        this._databaseProvider = _databaseProvider;
        this._time = _time;
        this._badgeCountUpdater = _badgeCountUpdater;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean internalMarkAsDismissed(int i2) {
        Context appContext = this._applicationService.getAppContext();
        String strF = y0.f(i2, "android_notification_id = ", " AND opened = 0 AND dismissed = 0");
        ContentValues contentValues = new ContentValues();
        contentValues.put("dismissed", (Integer) 1);
        boolean z = this._databaseProvider.getOs().update("notification", contentValues, strF, null) > 0;
        this._badgeCountUpdater.update();
        com.gamericefishpro.space.mf.e.INSTANCE.getNotificationManager(appContext).cancel(i2);
        return z;
    }

    @Override // com.gamericefishpro.space.nf.d
    public Object clearOldestOverLimitFallback(int i2, int i3, com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = com.gamericefishpro.space.pi.a0.D(com.gamericefishpro.space.wi.d.i, new C0038b(i3, this, i2, null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }

    @Override // com.gamericefishpro.space.nf.d
    public Object createNotification(String str, String str2, String str3, boolean z, boolean z2, int i2, String str4, String str5, long j2, String str6, com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = com.gamericefishpro.space.pi.a0.D(com.gamericefishpro.space.wi.d.i, new c(str, z, i2, this, str2, str3, z2, str4, str5, j2, str6, null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }

    @Override // com.gamericefishpro.space.nf.d
    public Object createSummaryNotification(int i2, String str, com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = com.gamericefishpro.space.pi.a0.D(com.gamericefishpro.space.wi.d.i, new d(i2, str, this, null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }

    @Override // com.gamericefishpro.space.nf.d
    public Object deleteExpiredNotifications(com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = com.gamericefishpro.space.pi.a0.D(com.gamericefishpro.space.wi.d.i, new e(null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.nf.d
    public Object doesNotificationExist(String str, com.gamericefishpro.space.th.a aVar) {
        f fVar;
        w wVar;
        if (aVar instanceof f) {
            fVar = (f) aVar;
            int i2 = fVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.label = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(aVar);
            }
        } else {
            fVar = new f(aVar);
        }
        Object obj = fVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = fVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            if (str == null || "".equals(str)) {
                return Boolean.FALSE;
            }
            w wVar2 = new w();
            com.gamericefishpro.space.wi.e eVar = k0.a;
            com.gamericefishpro.space.wi.d dVar = com.gamericefishpro.space.wi.d.i;
            g gVar = new g(str, this, wVar2, null);
            fVar.L$0 = wVar2;
            fVar.label = 1;
            if (com.gamericefishpro.space.pi.a0.D(dVar, gVar, fVar) == aVar2) {
                return aVar2;
            }
            wVar = wVar2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = (w) fVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return Boolean.valueOf(wVar.d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.nf.d
    public Object getAndroidIdForGroup(String str, boolean z, com.gamericefishpro.space.th.a aVar) {
        h hVar;
        a0 a0Var;
        if (aVar instanceof h) {
            hVar = (h) aVar;
            int i2 = hVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.label = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(aVar);
            }
        } else {
            hVar = new h(aVar);
        }
        Object obj = hVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = hVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            a0 a0Var2 = new a0();
            boolean zA = Intrinsics.a(str, com.gamericefishpro.space.mf.e.GROUPLESS_SUMMARY_KEY);
            a0 a0Var3 = new a0();
            a0Var3.d = zA ? "group_id IS NULL" : "group_id = ?";
            a0Var3.d = y0.j(new StringBuilder(), (String) a0Var3.d, " AND dismissed = 0 AND opened = 0 AND ");
            StringBuilder sb = new StringBuilder();
            sb.append((String) a0Var3.d);
            sb.append(z ? "is_summary = 1" : "is_summary = 0");
            a0Var3.d = sb.toString();
            String[] strArr = zA ? null : new String[]{str};
            com.gamericefishpro.space.wi.e eVar = k0.a;
            com.gamericefishpro.space.wi.d dVar = com.gamericefishpro.space.wi.d.i;
            i iVar = new i(a0Var3, strArr, a0Var2, null);
            hVar.L$0 = a0Var2;
            hVar.label = 1;
            if (com.gamericefishpro.space.pi.a0.D(dVar, iVar, hVar) == aVar2) {
                return aVar2;
            }
            a0Var = a0Var2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = (a0) hVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return a0Var.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.nf.d
    public Object getAndroidIdFromCollapseKey(String str, com.gamericefishpro.space.th.a aVar) {
        j jVar;
        a0 a0Var;
        if (aVar instanceof j) {
            jVar = (j) aVar;
            int i2 = jVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.label = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(aVar);
            }
        } else {
            jVar = new j(aVar);
        }
        Object obj = jVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = jVar.label;
        if (i3 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            a0 a0Var2 = new a0();
            com.gamericefishpro.space.wi.e eVar = k0.a;
            com.gamericefishpro.space.wi.d dVar = com.gamericefishpro.space.wi.d.i;
            k kVar = new k(str, a0Var2, null);
            jVar.L$0 = a0Var2;
            jVar.label = 1;
            if (com.gamericefishpro.space.pi.a0.D(dVar, kVar, jVar) == aVar2) {
                return aVar2;
            }
            a0Var = a0Var2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = (a0) jVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return a0Var.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.nf.d
    public Object getGroupId(int i2, com.gamericefishpro.space.th.a aVar) {
        l lVar;
        a0 a0Var;
        if (aVar instanceof l) {
            lVar = (l) aVar;
            int i3 = lVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lVar.label = i3 - Integer.MIN_VALUE;
            } else {
                lVar = new l(aVar);
            }
        } else {
            lVar = new l(aVar);
        }
        Object obj = lVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i4 = lVar.label;
        if (i4 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            a0 a0Var2 = new a0();
            com.gamericefishpro.space.wi.e eVar = k0.a;
            com.gamericefishpro.space.wi.d dVar = com.gamericefishpro.space.wi.d.i;
            m mVar = new m(i2, a0Var2, null);
            lVar.L$0 = a0Var2;
            lVar.label = 1;
            if (com.gamericefishpro.space.pi.a0.D(dVar, mVar, lVar) == aVar2) {
                return aVar2;
            }
            a0Var = a0Var2;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0Var = (a0) lVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return a0Var.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.nf.d
    public Object listNotificationsForGroup(String str, com.gamericefishpro.space.th.a aVar) {
        n nVar;
        if (aVar instanceof n) {
            nVar = (n) aVar;
            int i2 = nVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.label = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(aVar);
            }
        } else {
            nVar = new n(aVar);
        }
        Object obj = nVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = nVar.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) nVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            return list;
        }
        com.gamericefishpro.space.wa.b.P(obj);
        ArrayList arrayList = new ArrayList();
        com.gamericefishpro.space.wi.e eVar = k0.a;
        com.gamericefishpro.space.wi.d dVar = com.gamericefishpro.space.wi.d.i;
        o oVar = new o(str, this, arrayList, null);
        nVar.L$0 = arrayList;
        nVar.label = 1;
        return com.gamericefishpro.space.pi.a0.D(dVar, oVar, nVar) == aVar2 ? aVar2 : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.nf.d
    public Object listNotificationsForOutstanding(List<Integer> list, com.gamericefishpro.space.th.a aVar) {
        p pVar;
        if (aVar instanceof p) {
            pVar = (p) aVar;
            int i2 = pVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.label = i2 - Integer.MIN_VALUE;
            } else {
                pVar = new p(aVar);
            }
        } else {
            pVar = new p(aVar);
        }
        Object obj = pVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i3 = pVar.label;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) pVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            return list2;
        }
        com.gamericefishpro.space.wa.b.P(obj);
        ArrayList arrayList = new ArrayList();
        com.gamericefishpro.space.wi.e eVar = k0.a;
        com.gamericefishpro.space.wi.d dVar = com.gamericefishpro.space.wi.d.i;
        q qVar = new q(list, arrayList, null);
        pVar.L$0 = arrayList;
        pVar.label = 1;
        return com.gamericefishpro.space.pi.a0.D(dVar, qVar, pVar) == aVar2 ? aVar2 : arrayList;
    }

    @Override // com.gamericefishpro.space.nf.d
    public Object markAsConsumed(int i2, boolean z, String str, boolean z2, com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = com.gamericefishpro.space.pi.a0.D(com.gamericefishpro.space.wi.d.i, new r(str, z, z2, this, i2, null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.nf.d
    public Object markAsDismissed(int i2, com.gamericefishpro.space.th.a aVar) {
        s sVar;
        w wVar;
        if (aVar instanceof s) {
            sVar = (s) aVar;
            int i3 = sVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                sVar.label = i3 - Integer.MIN_VALUE;
            } else {
                sVar = new s(aVar);
            }
        } else {
            sVar = new s(aVar);
        }
        Object obj = sVar.result;
        com.gamericefishpro.space.uh.a aVar2 = com.gamericefishpro.space.uh.a.d;
        int i4 = sVar.label;
        if (i4 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            w wVar2 = new w();
            com.gamericefishpro.space.wi.e eVar = k0.a;
            com.gamericefishpro.space.wi.d dVar = com.gamericefishpro.space.wi.d.i;
            t tVar = new t(wVar2, this, i2, null);
            sVar.L$0 = wVar2;
            sVar.label = 1;
            if (com.gamericefishpro.space.pi.a0.D(dVar, tVar, sVar) == aVar2) {
                return aVar2;
            }
            wVar = wVar2;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = (w) sVar.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
        }
        return Boolean.valueOf(wVar.d);
    }

    @Override // com.gamericefishpro.space.nf.d
    public Object markAsDismissedForGroup(String str, com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = com.gamericefishpro.space.pi.a0.D(com.gamericefishpro.space.wi.d.i, new u(str, null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }

    @Override // com.gamericefishpro.space.nf.d
    public Object markAsDismissedForOutstanding(com.gamericefishpro.space.th.a aVar) {
        com.gamericefishpro.space.wi.e eVar = k0.a;
        Object objD = com.gamericefishpro.space.pi.a0.D(com.gamericefishpro.space.wi.d.i, new v(null), aVar);
        return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
    }
}
