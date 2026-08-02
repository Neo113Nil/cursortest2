package ru.yandex.taxi.push.handlers;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.app.t;
import androidx.core.app.v;
import com.adjust.sdk.Constants;
import defpackage.avj0;
import defpackage.e3n;
import defpackage.h3y;
import defpackage.iw00;
import defpackage.jst;
import defpackage.jzs0;
import defpackage.ny61;
import defpackage.p1g0;
import defpackage.r85;
import defpackage.rqg0;
import defpackage.wnt;
import defpackage.xby;
import defpackage.xk60;
import defpackage.xnt;
import defpackage.xww0;
import java.util.Arrays;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;

/* loaded from: classes6.dex */
public final class c implements xww0 {
    public final wnt a;
    public final h3y b;
    public final h3y c;
    public final h3y d;

    public c(wnt wntVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3) {
        this.a = wntVar;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = h3yVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // defpackage.xww0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Map map, ContinuationImpl continuationImpl) {
        SmartPushHandler$handle$1 smartPushHandler$handle$1;
        int i;
        Object obj;
        jzs0 jzs0Var;
        Object a;
        String str;
        Bitmap bitmap;
        Uri uri;
        if (continuationImpl instanceof SmartPushHandler$handle$1) {
            smartPushHandler$handle$1 = (SmartPushHandler$handle$1) continuationImpl;
            int i2 = smartPushHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                smartPushHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                SmartPushHandler$handle$1 smartPushHandler$handle$12 = smartPushHandler$handle$1;
                Object obj2 = smartPushHandler$handle$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = smartPushHandler$handle$12.label;
                wnt wntVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!"smart_notification".equals((String) map.get("type"))) {
                        return Boolean.FALSE;
                    }
                    String str2 = (String) map.get(Constants.DEEPLINK);
                    String str3 = (String) map.get("extra");
                    KSerializer serializer = jzs0.Companion.serializer();
                    if (str3 != null && str3.length() != 0) {
                        try {
                            obj = ((xnt) wntVar).c(str3, serializer);
                        } catch (SerializationException e) {
                            jst.e.k(e, String.format("Failed to parse '%s' from gcm message", Arrays.copyOf(new Object[]{str3}, 1)));
                        }
                        jzs0Var = (jzs0) obj;
                        if (jzs0Var != null) {
                            return Boolean.FALSE;
                        }
                        ru.yandex.taxi.notifications.c cVar = (ru.yandex.taxi.notifications.c) this.b.get();
                        String str4 = jzs0Var.c.a;
                        smartPushHandler$handle$12.L$0 = map;
                        smartPushHandler$handle$12.L$1 = null;
                        smartPushHandler$handle$12.L$2 = str2;
                        smartPushHandler$handle$12.L$3 = null;
                        smartPushHandler$handle$12.L$4 = jzs0Var;
                        smartPushHandler$handle$12.label = 1;
                        a = cVar.a(e3n.c, str4, smartPushHandler$handle$12);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        str = str2;
                    }
                    obj = null;
                    jzs0Var = (jzs0) obj;
                    if (jzs0Var != null) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jzs0 jzs0Var2 = (jzs0) smartPushHandler$handle$12.L$4;
                    str = (String) smartPushHandler$handle$12.L$2;
                    Map map2 = (Map) smartPushHandler$handle$12.L$0;
                    kotlin.b.b(obj2);
                    jzs0Var = jzs0Var2;
                    map = map2;
                    a = obj2;
                }
                bitmap = (Bitmap) a;
                if (bitmap != null) {
                    return Boolean.FALSE;
                }
                String str5 = (String) map.get("local_channel_id");
                if (str5 == null) {
                    String str6 = (String) map.get("id");
                    if (str6 != null) {
                        ((p1g0) this.d.get()).a(str6, null);
                        xby.l(jst.e, "PUSH_ACK:ERROR:NO_CHANNEL_ID", null, null, "Failed to handle push with payload ".concat(kotlin.collections.a.X(iw00.x(map), null, null, null, null, 63)), 2);
                    }
                    return Boolean.TRUE;
                }
                xk60 xk60Var = (xk60) this.c.get();
                String str7 = jzs0Var.a;
                String str8 = jzs0Var.b;
                NotificationShareData.a a2 = r85.a(wntVar, map);
                if (str != null) {
                    xk60Var.getClass();
                    uri = Uri.parse(str);
                } else {
                    uri = null;
                }
                v vVar = new v(xk60Var.a, str5);
                vVar.e = v.d(str7);
                vVar.f = v.d(str8);
                vVar.h(16, true);
                vVar.h(2, false);
                vVar.g(-1);
                vVar.K.icon = xk60.n;
                vVar.z = ((avj0) xk60Var.c).a(rqg0.notification_tint_color);
                t.a aVar = new t.a();
                aVar.e(bitmap);
                vVar.l(aVar);
                if (uri != null) {
                    vVar.h = xk60Var.k(uri, null, null);
                }
                a2.a = 17534;
                xk60Var.l(a2, vVar);
                return Boolean.TRUE;
            }
        }
        smartPushHandler$handle$1 = new SmartPushHandler$handle$1(this, continuationImpl);
        SmartPushHandler$handle$1 smartPushHandler$handle$122 = smartPushHandler$handle$1;
        Object obj22 = smartPushHandler$handle$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = smartPushHandler$handle$122.label;
        wnt wntVar2 = this.a;
        if (i != 0) {
        }
        bitmap = (Bitmap) a;
        if (bitmap != null) {
        }
    }
}
