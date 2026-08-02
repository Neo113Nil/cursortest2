package com.yandex.passport.internal.ui.social.mail;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.y;
import com.appsflyer.internal.k;
import com.yandex.passport.R;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.ui.util.s;
import com.yandex.passport.internal.util.p;
import defpackage.xq0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class MailPasswordLoginActivity extends com.yandex.passport.internal.ui.c implements a {
    public static final /* synthetic */ int e = 0;
    public l d;

    @Override // com.yandex.passport.internal.ui.c, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras = getIntent().getExtras();
        extras.getClass();
        l lVar = (l) k.h(extras, p.class, "passport-login-properties");
        if (lVar == null) {
            xq0.q(k.m("Bundle has no ", l.class));
            return;
        }
        this.d = lVar;
        setTheme(s.d(lVar.e, this));
        super.onCreate(bundle);
        setContentView(R.layout.passport_activity_rambler_login);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));
        j();
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("suggested-login");
            l lVar2 = this.d;
            if (lVar2 == null) {
                Intrinsics.j("loginProperties");
                throw null;
            }
            b bVar = new b();
            Bundle bundle2 = new Bundle();
            if (stringExtra != null) {
                bundle2.putString("suggested-login", stringExtra);
            }
            bundle2.putAll(lVar2.t());
            bVar.setArguments(bundle2);
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.e(R.id.container, bVar, "MailPasswordLoginActivity");
            aVar.j();
        }
    }
}
