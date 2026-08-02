package com.yandex.plus.pay.ui.feature.tarifficator.mobile.api;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.n;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.o;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.TarifficatorBduiScenarioActivity;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.m;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.yandex.plus.pay.ui.yb.web.internal.ui.PlusPayYbWebActivity;
import defpackage.uh;
import defpackage.vq1;

/* loaded from: classes5.dex */
public final class f extends uh {
    public final /* synthetic */ int a;
    public final String b;

    public f(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                str.getClass();
                this.b = str;
                break;
            case 2:
                str.getClass();
                this.b = str;
                break;
            case 3:
                str.getClass();
                this.b = str;
                break;
            default:
                str.getClass();
                this.b = str;
                break;
        }
    }

    @Override // defpackage.uh
    public final Intent createIntent(Context context, Object obj) {
        switch (this.a) {
            case 0:
                d dVar = (d) obj;
                context.getClass();
                dVar.getClass();
                Intent putExtra = com.yandex.plus.bdui.plus.analytics.b.a(new Intent(context, (Class<?>) TarifficatorScenarioActivity.class), this.b).putExtra("args", dVar);
                putExtra.getClass();
                return putExtra;
            case 1:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.e eVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.e) obj;
                context.getClass();
                eVar.getClass();
                Intent putExtra2 = com.yandex.plus.bdui.plus.analytics.b.a(new Intent(context, (Class<?>) TarifficatorBduiScenarioActivity.class), this.b).putExtra("input", new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.k(eVar));
                putExtra2.getClass();
                return putExtra2;
            case 2:
                com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.h hVar = (com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.h) obj;
                context.getClass();
                hVar.getClass();
                Intent putExtra3 = com.yandex.plus.bdui.plus.analytics.b.a(new Intent(context, (Class<?>) TarifficatorBduiScenarioActivity.class), this.b).putExtra("input", new m(hVar));
                putExtra3.getClass();
                return putExtra3;
            default:
                com.yandex.plus.pay.ui.yb.web.internal.ui.b bVar = (com.yandex.plus.pay.ui.yb.web.internal.ui.b) obj;
                context.getClass();
                bVar.getClass();
                Intent putExtra4 = new Intent(context, (Class<?>) PlusPayYbWebActivity.class).putExtra("arguments", bVar);
                putExtra4.getClass();
                return com.yandex.plus.bdui.plus.analytics.b.a(putExtra4, this.b);
        }
    }

    @Override // defpackage.uh
    public final Object parseResult(int i, Intent intent) {
        k kVar;
        o oVar;
        o oVar2;
        com.yandex.plus.pay.ui.yb.web.internal.e eVar;
        switch (this.a) {
            case 0:
                return (intent == null || (kVar = (k) ((Parcelable) vq1.W(intent, CameraService.RESULT, k.class))) == null) ? g.a : kVar;
            case 1:
                return (intent == null || (oVar = (o) ((Parcelable) vq1.W(intent, CameraService.RESULT, o.class))) == null) ? new n(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.i(null)) : oVar;
            case 2:
                return (intent == null || (oVar2 = (o) ((Parcelable) vq1.W(intent, CameraService.RESULT, o.class))) == null) ? new n(new com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.api.i(null)) : oVar2;
            default:
                return (intent == null || (eVar = (com.yandex.plus.pay.ui.yb.web.internal.e) ((Parcelable) vq1.W(intent, "arguments", com.yandex.plus.pay.ui.yb.web.internal.e.class))) == null) ? com.yandex.plus.pay.ui.yb.web.internal.a.a : eVar;
        }
    }
}
