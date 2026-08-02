package ru.yandex.taxi.push.handlers;

import android.graphics.Bitmap;
import android.net.Uri;
import defpackage.b4p;
import defpackage.cwq0;
import defpackage.e3n;
import defpackage.h1p;
import defpackage.h3y;
import defpackage.i5p;
import defpackage.ny61;
import defpackage.o501;
import defpackage.pux0;
import defpackage.r85;
import defpackage.wnt;
import defpackage.xk60;
import defpackage.xnt;
import defpackage.xww0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.eatskit.dto.ExternalServiceData;
import ru.yandex.taxi.vendor_api.google.push.FcmNotificationService;

/* loaded from: classes6.dex */
public final class b implements xww0 {
    public final wnt a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final cwq0 f = new cwq0();

    public b(wnt wntVar, h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4) {
        this.a = wntVar;
        this.b = h3yVar;
        this.c = h3yVar2;
        this.d = h3yVar3;
        this.e = h3yVar4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.xww0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Map map, ContinuationImpl continuationImpl) {
        ExternalServicePushHandler$handle$1 externalServicePushHandler$handle$1;
        int i;
        String str;
        h1p h1pVar;
        Map map2;
        ExternalServiceData externalServiceData;
        String str2;
        String str3;
        String str4;
        h1p h1pVar2;
        String value;
        if (continuationImpl instanceof ExternalServicePushHandler$handle$1) {
            externalServicePushHandler$handle$1 = (ExternalServicePushHandler$handle$1) continuationImpl;
            int i2 = externalServicePushHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                externalServicePushHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = externalServicePushHandler$handle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = externalServicePushHandler$handle$1.label;
                wnt wntVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i5p d = r85.d(wntVar, map);
                    str = (String) map.get(FcmNotificationService.KEY_TITLE);
                    String str5 = (String) map.get(FcmNotificationService.KEY_BODY);
                    String str6 = (String) map.get("notification_group");
                    if (d == null || str5 == null || str5.length() == 0) {
                        return Boolean.FALSE;
                    }
                    String str7 = d.h;
                    if (str7 != null) {
                        this.f.getClass();
                        h1pVar = cwq0.a(str7);
                    } else {
                        h1pVar = null;
                    }
                    ExternalServiceData externalServiceData2 = d.j;
                    if (h1pVar == null || externalServiceData2 == null) {
                        return Boolean.FALSE;
                    }
                    String str8 = (String) map.get("local_channel_id");
                    if (str8 == null) {
                        r85.e(this.e, map);
                        return Boolean.TRUE;
                    }
                    ru.yandex.taxi.notifications.c cVar = (ru.yandex.taxi.notifications.c) this.c.get();
                    String str9 = (String) map.get("image_tag");
                    externalServicePushHandler$handle$1.L$0 = map;
                    externalServicePushHandler$handle$1.L$1 = null;
                    externalServicePushHandler$handle$1.L$2 = str;
                    externalServicePushHandler$handle$1.L$3 = str5;
                    externalServicePushHandler$handle$1.L$4 = str6;
                    externalServicePushHandler$handle$1.L$5 = null;
                    externalServicePushHandler$handle$1.L$6 = h1pVar;
                    externalServicePushHandler$handle$1.L$7 = externalServiceData2;
                    externalServicePushHandler$handle$1.L$8 = str8;
                    externalServicePushHandler$handle$1.label = 1;
                    Object a = cVar.a(e3n.c, str9, externalServicePushHandler$handle$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    map2 = map;
                    externalServiceData = externalServiceData2;
                    obj = a;
                    str2 = str5;
                    str3 = str8;
                    str4 = str6;
                    h1pVar2 = h1pVar;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str10 = (String) externalServicePushHandler$handle$1.L$8;
                    externalServiceData = (ExternalServiceData) externalServicePushHandler$handle$1.L$7;
                    h1pVar2 = (h1p) externalServicePushHandler$handle$1.L$6;
                    str4 = (String) externalServicePushHandler$handle$1.L$4;
                    String str11 = (String) externalServicePushHandler$handle$1.L$3;
                    str = (String) externalServicePushHandler$handle$1.L$2;
                    Map map3 = (Map) externalServicePushHandler$handle$1.L$0;
                    kotlin.b.b(obj);
                    str3 = str10;
                    map2 = map3;
                    str2 = str11;
                }
                String str12 = str;
                Bitmap bitmap = (Bitmap) obj;
                b4p b4pVar = (b4p) this.b.get();
                b4pVar.getClass();
                Uri.Builder builder = new Uri.Builder();
                ((pux0) b4pVar.c).getClass();
                Uri.Builder authority = builder.scheme(pux0.c).authority("external");
                String e = ((xnt) b4pVar.a).e(externalServiceData, ExternalServiceData.Companion.serializer());
                value = h1pVar2 == null ? h1pVar2.getValue() : null;
                if (value == null) {
                    value = "";
                }
                authority.appendQueryParameter(Constants.KEY_SERVICE, value);
                authority.appendQueryParameter("service_data", e);
                authority.appendQueryParameter("href", null);
                ((xk60) this.d.get()).n(o501.D(b4pVar.b.a(authority.build()), str12, str2, str3, map2, bitmap, 32), r85.a(wntVar, map2), str4);
                return Boolean.TRUE;
            }
        }
        externalServicePushHandler$handle$1 = new ExternalServicePushHandler$handle$1(this, continuationImpl);
        Object obj2 = externalServicePushHandler$handle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = externalServicePushHandler$handle$1.label;
        wnt wntVar2 = this.a;
        if (i != 0) {
        }
        String str122 = str;
        Bitmap bitmap2 = (Bitmap) obj2;
        b4p b4pVar2 = (b4p) this.b.get();
        b4pVar2.getClass();
        Uri.Builder builder2 = new Uri.Builder();
        ((pux0) b4pVar2.c).getClass();
        Uri.Builder authority2 = builder2.scheme(pux0.c).authority("external");
        String e2 = ((xnt) b4pVar2.a).e(externalServiceData, ExternalServiceData.Companion.serializer());
        if (h1pVar2 == null) {
        }
        if (value == null) {
        }
        authority2.appendQueryParameter(Constants.KEY_SERVICE, value);
        authority2.appendQueryParameter("service_data", e2);
        authority2.appendQueryParameter("href", null);
        ((xk60) this.d.get()).n(o501.D(b4pVar2.b.a(authority2.build()), str122, str2, str3, map2, bitmap2, 32), r85.a(wntVar2, map2), str4);
        return Boolean.TRUE;
    }
}
