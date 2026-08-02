package com.yandex.passport.internal.ui.tv;

import android.R;
import android.os.Bundle;
import androidx.fragment.app.y;
import com.yandex.passport.internal.ui.util.s;
import defpackage.cxb;
import defpackage.su4;
import defpackage.xq0;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class AuthInWebViewActivity extends com.yandex.passport.internal.ui.c {
    @Override // com.yandex.passport.internal.ui.c, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            xq0.q("Required value was null.");
            return;
        }
        com.yandex.passport.internal.properties.c cVar = (com.yandex.passport.internal.properties.c) extras.getParcelable("auth_by_qr_properties");
        if (cVar == null) {
            xq0.q("No auth_by_qr_properties in bundle");
            return;
        }
        setTheme(s.f(cVar.a, this));
        super.onCreate(bundle);
        if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager, supportFragmentManager);
            c cVar2 = new c();
            cVar2.setArguments(cxb.K(new Pair("auth_by_qr_properties", cVar)));
            l.e(R.id.content, cVar2, c.m);
            l.k(true, true);
        }
    }
}
