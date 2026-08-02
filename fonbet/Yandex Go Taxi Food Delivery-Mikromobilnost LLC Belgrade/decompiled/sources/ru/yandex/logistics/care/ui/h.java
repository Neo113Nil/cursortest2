package ru.yandex.logistics.care.ui;

import android.util.Log;
import defpackage.b64;
import defpackage.ds31;
import defpackage.fc41;
import defpackage.geh;
import defpackage.or8;
import defpackage.p4c;
import defpackage.tje;
import defpackage.uq8;
import ru.yandex.logistics.care.web_view.impl.js.TaxiAppJsCallback$ErrorType;

/* loaded from: classes4.dex */
public final class h {
    public final /* synthetic */ l a;
    public final /* synthetic */ ru.yandex.taxi.logistics.care.impl.router.e b;
    public final /* synthetic */ or8 c;

    public h(or8 or8Var, l lVar, ru.yandex.taxi.logistics.care.impl.router.e eVar) {
        this.a = lVar;
        this.b = eVar;
        this.c = or8Var;
    }

    public final void a(String str, String str2, TaxiAppJsCallback$ErrorType taxiAppJsCallback$ErrorType) {
        this.c.k(new uq8(str, str2));
        TaxiAppJsCallback$ErrorType taxiAppJsCallback$ErrorType2 = TaxiAppJsCallback$ErrorType.Config;
        l lVar = this.a;
        if (taxiAppJsCallback$ErrorType == taxiAppJsCallback$ErrorType2) {
            lVar.d0(p4c.a);
        }
        geh gehVar = lVar.A;
        if (str2 == null) {
            str2 = "";
        }
        StringBuilder v = b64.v("JS Error: ", str, " ", str2, ", error type: ");
        v.append(taxiAppJsCallback$ErrorType);
        String sb = v.toString();
        gehVar.getClass();
        Log.e("Care_SDK", sb);
    }

    public final void c() {
        l lVar = this.a;
        lVar.E = c.a(lVar.E, CareWebViewViewModelImpl$SdkCloseType.JS_SIGNAL);
        this.b.a();
    }

    public final void d(fc41 fc41Var) {
        l lVar = this.a;
        tje.N(ds31.a(lVar), null, null, new CareWebViewViewModelImpl$createJsCallback$1$onShowCamera$1(lVar, fc41Var, this.c, null), 3);
    }
}
