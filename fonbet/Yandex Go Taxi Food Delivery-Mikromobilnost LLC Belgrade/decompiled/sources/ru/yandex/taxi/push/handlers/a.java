package ru.yandex.taxi.push.handlers;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.app.v;
import com.adjust.sdk.Constants;
import com.yandex.go.notifications.acknowledge.data.model.PushAckStatus;
import defpackage.aye0;
import defpackage.c1g0;
import defpackage.cpw0;
import defpackage.d1g0;
import defpackage.dkw0;
import defpackage.e1g0;
import defpackage.e3n;
import defpackage.evu0;
import defpackage.h3y;
import defpackage.iw00;
import defpackage.jst;
import defpackage.mg21;
import defpackage.ny61;
import defpackage.o48;
import defpackage.o501;
import defpackage.p1g0;
import defpackage.ppl0;
import defpackage.r85;
import defpackage.tse0;
import defpackage.u2h;
import defpackage.w511;
import defpackage.wnt;
import defpackage.x4e;
import defpackage.xby;
import defpackage.xk60;
import defpackage.xww0;
import java.util.HashMap;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;
import ru.yandex.taxi.deeplinks.f;
import ru.yandex.taxi.notifications.push.model.NotificationShareData;
import ru.yandex.taxi.settings.support.SupportPushMessageInteractor$UpdateMessagesStatus;
import ru.yandex.taxi.vendor_api.google.push.FcmNotificationService;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes6.dex */
public final class a implements xww0 {
    public final h3y a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public final h3y e;
    public final h3y f;
    public final c1g0 g;
    public final wnt h;

    public a(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6, c1g0 c1g0Var, wnt wntVar) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = h3yVar4;
        this.e = h3yVar5;
        this.f = h3yVar6;
        this.g = c1g0Var;
        this.h = wntVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f0  */
    @Override // defpackage.xww0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Map map, ContinuationImpl continuationImpl) {
        DeeplinkPushHandler$handle$1 deeplinkPushHandler$handle$1;
        int i;
        h3y h3yVar;
        Map map2;
        String str;
        String str2;
        Uri a;
        SupportPushMessageInteractor$UpdateMessagesStatus supportPushMessageInteractor$UpdateMessagesStatus;
        boolean a2;
        boolean z;
        int parseInt;
        String str3;
        if (continuationImpl instanceof DeeplinkPushHandler$handle$1) {
            deeplinkPushHandler$handle$1 = (DeeplinkPushHandler$handle$1) continuationImpl;
            int i2 = deeplinkPushHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deeplinkPushHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deeplinkPushHandler$handle$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deeplinkPushHandler$handle$1.label;
                h3yVar = this.f;
                PendingIntent pendingIntent = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String str4 = (String) map.get(Constants.DEEPLINK);
                    if (str4 == null || evu0.J(str4)) {
                        return Boolean.FALSE;
                    }
                    String str5 = (String) map.get("local_channel_id");
                    if (str5 == null) {
                        String str6 = (String) map.get("id");
                        if (str6 != null) {
                            ((p1g0) h3yVar.get()).a(str6, null);
                            xby.l(jst.e, "PUSH_ACK:ERROR:NO_CHANNEL_ID", null, null, "Failed to handle push with payload ".concat(kotlin.collections.a.X(iw00.x(map), null, null, null, null, 63)), 2);
                        }
                        return Boolean.TRUE;
                    }
                    ru.yandex.taxi.notifications.c cVar = (ru.yandex.taxi.notifications.c) this.e.get();
                    String str7 = (String) map.get("image_tag");
                    deeplinkPushHandler$handle$1.L$0 = map;
                    deeplinkPushHandler$handle$1.L$1 = str4;
                    deeplinkPushHandler$handle$1.L$2 = str5;
                    deeplinkPushHandler$handle$1.label = 1;
                    Object a3 = cVar.a(e3n.c, str7, deeplinkPushHandler$handle$1);
                    if (a3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    map2 = map;
                    str = str4;
                    obj = a3;
                    str2 = str5;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str8 = (String) deeplinkPushHandler$handle$1.L$2;
                    str = (String) deeplinkPushHandler$handle$1.L$1;
                    Map map3 = (Map) deeplinkPushHandler$handle$1.L$0;
                    kotlin.b.b(obj);
                    str2 = str8;
                    map2 = map3;
                }
                Bitmap bitmap = (Bitmap) obj;
                a = ((f) this.a.get()).a(Uri.parse(str));
                NotificationShareData.a a4 = r85.a(this.h, map2);
                String str9 = (String) map2.get("msg");
                String str10 = (String) map2.get("notification_group");
                if ("receipt".equalsIgnoreCase(a == null ? a.getAuthority() : null)) {
                    boolean equalsIgnoreCase = "accident".equalsIgnoreCase(a != null ? a.getAuthority() : null);
                    c1g0 c1g0Var = this.g;
                    if (equalsIgnoreCase) {
                        o48 o48Var = (o48) this.d.get();
                        aye0 aye0Var = o48Var.b;
                        boolean r = ((com.yandex.go.taxi.order.provider.a) o48Var.c).r();
                        ppl0 ppl0Var = (ppl0) aye0Var.b;
                        HashMap o = tse0.o(ppl0Var);
                        ppl0Var.a.a("SafetyCenter.CarCrash.AccidentDetected", o, 1, x4e.r(r, o, "has_active"));
                        if (!o48Var.d.a()) {
                            ((mg21) o48Var.a).b(a);
                        }
                        z = ((e1g0) c1g0Var).a(o501.D(a, null, str9 == null ? "" : str9, str2, map2, bitmap, 32), str10, false, a4);
                    } else {
                        u2h D = o501.D(a, null, str9 == null ? "" : str9, str2, map2, bitmap, 32);
                        e1g0 e1g0Var = (e1g0) c1g0Var;
                        dkw0 dkw0Var = (dkw0) e1g0Var.b.get();
                        Uri uri = D.d;
                        dkw0Var.getClass();
                        if (uri == null) {
                            supportPushMessageInteractor$UpdateMessagesStatus = SupportPushMessageInteractor$UpdateMessagesStatus.NOT_APPLICABLE;
                        } else if ("chat".equalsIgnoreCase(uri.getAuthority())) {
                            String str11 = (String) map2.get(ClidProvider.TIMESTAMP);
                            String str12 = (String) map2.get("new_messages");
                            if (str12 != null) {
                                try {
                                    parseInt = Integer.parseInt(str12);
                                } catch (NumberFormatException e) {
                                    jst.e.k(e, "Failed to parse 'new_messages'");
                                }
                                supportPushMessageInteractor$UpdateMessagesStatus = (str11 == null && str11.length() != 0 && dkw0Var.a.a(parseInt, str11)) ? parseInt < 0 ? SupportPushMessageInteractor$UpdateMessagesStatus.PARTIALLY : SupportPushMessageInteractor$UpdateMessagesStatus.UPDATED : SupportPushMessageInteractor$UpdateMessagesStatus.NOT_UPDATED;
                            }
                            parseInt = -1;
                            if (str11 == null) {
                            }
                        } else {
                            supportPushMessageInteractor$UpdateMessagesStatus = SupportPushMessageInteractor$UpdateMessagesStatus.NOT_APPLICABLE;
                        }
                        int i3 = d1g0.a[supportPushMessageInteractor$UpdateMessagesStatus.ordinal()];
                        if (i3 == 1) {
                            a2 = e1g0Var.a(D, str10, false, a4);
                            ((ru.yandex.taxi.startup.launch.c) e1g0Var.e.get()).c("GCM.handleOrderData.UpdateSupportMessages");
                        } else if (i3 == 2) {
                            a2 = e1g0Var.a(D, str10, false, a4);
                        } else if (i3 == 3) {
                            z = false;
                        } else {
                            if (i3 != 4) {
                                w511.b();
                                return null;
                            }
                            u2h u2hVar = new u2h(null, (String) map2.get(FcmNotificationService.KEY_TITLE), D.c, D.d, D.e, D.f, D.g, D.h);
                            String str13 = (String) map2.get("show_in_foreground");
                            a2 = e1g0Var.b(u2hVar, str10, str13 != null ? Boolean.parseBoolean(str13) : false, a4);
                        }
                        z = a2;
                    }
                } else {
                    long b = r85.b(map2);
                    xk60 xk60Var = (xk60) this.b.get();
                    String str14 = str9 == null ? "" : str9;
                    Application application = xk60Var.a;
                    String queryParameter = a.getQueryParameter("url");
                    if (queryParameter == null || queryParameter.length() == 0) {
                        jst.e.k(new IllegalArgumentException("Bad uri params"), "'url' param is missing in url: " + a);
                    } else {
                        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
                        aVar.b = queryParameter;
                        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
                        uiWebViewConfig.setHasTitleFromWeb(true);
                        uiWebViewConfig.setShouldShowCloseButton(true);
                        pendingIntent = PendingIntent.getActivity(application, 0, new Intent(application, (Class<?>) xk60Var.d.a(AndroidComponentRepository$Component.MAIN_ACTIVITY)).putExtra(UiWebViewConfig.EXTRAS_CONFIG, uiWebViewConfig).putExtra("notification_share_data_extra", a4.a()).setData(a).addFlags(SelfTester_JCP.IMITA), 201326592);
                    }
                    PendingIntent pendingIntent2 = pendingIntent;
                    if (pendingIntent2 == null) {
                        z = false;
                    } else {
                        a4.a = pendingIntent2.hashCode();
                        v h = xk60Var.h(str14, bitmap, "receipt", pendingIntent2, b);
                        if (str10 == null) {
                            str10 = String.valueOf(pendingIntent2.hashCode());
                        }
                        xk60Var.m(a4, h, str10, "receipt");
                        ((cpw0) this.c.get()).a = true;
                        z = true;
                    }
                }
                if (!z && (str3 = (String) map2.get("id")) != null) {
                    ((com.yandex.go.notifications.acknowledge.domain.a) ((p1g0) h3yVar.get()).a.get()).b(str3, PushAckStatus.HIDDEN);
                }
                return Boolean.TRUE;
            }
        }
        deeplinkPushHandler$handle$1 = new DeeplinkPushHandler$handle$1(this, continuationImpl);
        Object obj2 = deeplinkPushHandler$handle$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deeplinkPushHandler$handle$1.label;
        h3yVar = this.f;
        PendingIntent pendingIntent3 = null;
        if (i != 0) {
        }
        Bitmap bitmap2 = (Bitmap) obj2;
        a = ((f) this.a.get()).a(Uri.parse(str));
        NotificationShareData.a a42 = r85.a(this.h, map2);
        String str92 = (String) map2.get("msg");
        String str102 = (String) map2.get("notification_group");
        if ("receipt".equalsIgnoreCase(a == null ? a.getAuthority() : null)) {
        }
        if (!z) {
            ((com.yandex.go.notifications.acknowledge.domain.a) ((p1g0) h3yVar.get()).a.get()).b(str3, PushAckStatus.HIDDEN);
        }
        return Boolean.TRUE;
    }
}
