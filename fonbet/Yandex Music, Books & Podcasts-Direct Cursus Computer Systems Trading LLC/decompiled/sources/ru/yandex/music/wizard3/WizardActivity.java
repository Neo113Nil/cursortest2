package ru.yandex.music.wizard3;

import android.R;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import defpackage.cxb;
import defpackage.hoe;
import defpackage.klx;
import defpackage.np2;
import defpackage.ou0;
import defpackage.su4;
import defpackage.v0w;
import defpackage.yu0;
import kotlin.Pair;

/* loaded from: classes6.dex */
public final class WizardActivity extends np2 {
    public static final /* synthetic */ int v = 0;

    @Override // defpackage.np2
    public final boolean n() {
        return true;
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("show_onboarding", false);
        if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager, supportFragmentManager);
            v0w v0wVar = new v0w();
            v0wVar.setArguments(cxb.K(new Pair("show_onboarding", Boolean.valueOf(booleanExtra))));
            l.e(R.id.content, v0wVar, null);
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
        klx klxVar = ou0.a;
        return yu0.a[0] == 1 ? ru.yandex.music.R.style.AppTheme_EdgeToEdge_TransparentStatusBar_SystemNavigationBar : ru.yandex.music.R.style.AppTheme_Dark_EdgeToEdge_TransparentStatusBar_SystemNavigationBar;
    }
}
