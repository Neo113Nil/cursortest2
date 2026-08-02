package ru.yandex.taxi.settings.handlers;

import android.graphics.Bitmap;
import defpackage.dt20;
import defpackage.e3n;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.iw00;
import defpackage.jst;
import defpackage.ny61;
import defpackage.p1g0;
import defpackage.r85;
import defpackage.wnt;
import defpackage.xby;
import defpackage.xk60;
import defpackage.xww0;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.notifications.c;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;
import ru.yandex.taxi.vendor_api.google.push.FcmNotificationService;

/* loaded from: classes6.dex */
public final class a implements xww0 {
    public final h3y a;
    public final h3y b;
    public final h3y c;
    public final wnt d;

    public a(wnt wntVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = wntVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.xww0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Map map, ContinuationImpl continuationImpl) {
        NotificationPushHandler$handle$1 notificationPushHandler$handle$1;
        int i;
        String str;
        String str2;
        String str3;
        long b;
        NotificationShareData.a a;
        xk60 xk60Var;
        String str4;
        Map map2 = map;
        if (continuationImpl instanceof NotificationPushHandler$handle$1) {
            notificationPushHandler$handle$1 = (NotificationPushHandler$handle$1) continuationImpl;
            int i2 = notificationPushHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationPushHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = notificationPushHandler$handle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = notificationPushHandler$handle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str5 = (String) map2.get(FcmNotificationService.KEY_TITLE);
                    str = str5 == null ? "" : str5;
                    String str6 = (String) map2.get(FcmNotificationService.KEY_BODY);
                    str2 = str6 == null ? "" : str6;
                    String str7 = (String) map2.get("title");
                    str3 = str7 == null ? "" : str7;
                    b = r85.b(map2);
                    xk60 xk60Var2 = (xk60) this.a.get();
                    a = r85.a(this.d, map2);
                    c cVar = (c) this.c.get();
                    String str8 = (String) map2.get("image_tag");
                    notificationPushHandler$handle$1.L$0 = map2;
                    notificationPushHandler$handle$1.L$1 = str;
                    notificationPushHandler$handle$1.L$2 = str2;
                    notificationPushHandler$handle$1.L$3 = str3;
                    notificationPushHandler$handle$1.L$4 = xk60Var2;
                    notificationPushHandler$handle$1.L$5 = a;
                    notificationPushHandler$handle$1.J$0 = b;
                    notificationPushHandler$handle$1.label = 1;
                    Object a2 = cVar.a(e3n.c, str8, notificationPushHandler$handle$1);
                    if (a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    xk60Var = xk60Var2;
                    obj = a2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j = notificationPushHandler$handle$1.J$0;
                    NotificationShareData.a aVar = (NotificationShareData.a) notificationPushHandler$handle$1.L$5;
                    xk60Var = (xk60) notificationPushHandler$handle$1.L$4;
                    str3 = (String) notificationPushHandler$handle$1.L$3;
                    str2 = (String) notificationPushHandler$handle$1.L$2;
                    str = (String) notificationPushHandler$handle$1.L$1;
                    Map map3 = (Map) notificationPushHandler$handle$1.L$0;
                    kotlin.b.b(obj);
                    b = j;
                    a = aVar;
                    map2 = map3;
                }
                Bitmap bitmap = (Bitmap) obj;
                if (!evu0.J(str) && evu0.J(str2) && evu0.J(str3)) {
                    return Boolean.FALSE;
                }
                str4 = (String) map2.get("local_channel_id");
                if (str4 == null) {
                    xk60Var.o((evu0.J(str2) && evu0.J(str3)) ? new dt20((String) null, str, str4, bitmap) : !evu0.J(str2) ? new dt20(str, str2, str4, bitmap) : new dt20((String) null, str3, str4, bitmap), a, b);
                    return Boolean.TRUE;
                }
                String str9 = (String) map2.get("id");
                if (str9 != null) {
                    ((p1g0) this.b.get()).a(str9, null);
                    xby.l(jst.e, "PUSH_ACK:ERROR:NO_CHANNEL_ID", null, null, "Failed to handle push with payload ".concat(kotlin.collections.a.X(iw00.x(map2), null, null, null, null, 63)), 2);
                }
                return Boolean.TRUE;
            }
        }
        notificationPushHandler$handle$1 = new NotificationPushHandler$handle$1(this, continuationImpl);
        Object obj2 = notificationPushHandler$handle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = notificationPushHandler$handle$1.label;
        if (i != 0) {
        }
        Bitmap bitmap2 = (Bitmap) obj2;
        if (!evu0.J(str)) {
        }
        str4 = (String) map2.get("local_channel_id");
        if (str4 == null) {
        }
    }
}
