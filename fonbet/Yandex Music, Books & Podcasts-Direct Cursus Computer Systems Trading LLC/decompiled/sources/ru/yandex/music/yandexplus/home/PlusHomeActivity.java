package ru.yandex.music.yandexplus.home;

import android.R;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import defpackage.cxb;
import defpackage.hoe;
import defpackage.np2;
import defpackage.ou0;
import defpackage.su4;
import defpackage.yu0;
import defpackage.z9m;
import kotlin.Pair;

/* loaded from: classes6.dex */
public final class PlusHomeActivity extends np2 {
    public static final /* synthetic */ int v = 0;

    @Override // defpackage.np2
    public final boolean n() {
        return true;
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("deeplink");
        if (stringExtra == null) {
            finish();
            return;
        }
        if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager, supportFragmentManager);
            z9m z9mVar = new z9m();
            z9mVar.setArguments(cxb.K(new Pair("deeplink", stringExtra)));
            l.e(R.id.content, z9mVar, null);
            l.j();
        }
    }

    @Override // defpackage.np2
    public final void s(Bundle bundle) {
        super.s(bundle);
        hoe.c(this);
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        return yu0.a[ou0Var.ordinal()] == 1 ? ru.yandex.music.R.style.AppTheme_Transparent_EdgeToEdge : ru.yandex.music.R.style.AppTheme_Transparent_Dark_EdgeToEdge;
    }
}
