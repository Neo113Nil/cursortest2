package ru.yandex.taxi.contacts;

import android.content.Context;
import defpackage.bgc;
import defpackage.bvf0;
import defpackage.ike;
import defpackage.jqr;
import defpackage.o400;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.y50;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final class g {
    public final Context a;
    public final y50 b;
    public final ru.yandex.taxi.activity.g c;
    public final ike d;
    public sls e;

    public g(Context context, y50 y50Var, ru.yandex.taxi.activity.g gVar, tt2 tt2Var) {
        this.a = context;
        this.b = y50Var;
        this.c = gVar;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        ike a = bvf0.a(o400.a);
        this.d = a;
        this.e = new bgc(12);
        kotlinx.coroutines.flow.e.H(a, new jqr(gVar.a(HProv.PP_DELETE_SAVED_PASSWD), new SettingsRouter$1(this, null), 3));
    }

    public final void a() {
        tje.N(this.d, null, null, new SettingsRouter$openSettings$1(this, null), 3);
    }
}
