package ru.yandex.music.in_app_restore;

import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.age;
import defpackage.b6n;
import defpackage.bdt;
import defpackage.btf;
import defpackage.cxb;
import defpackage.hag;
import defpackage.hoe;
import defpackage.jyr;
import defpackage.l18;
import defpackage.np2;
import defpackage.ou0;
import defpackage.sek;
import defpackage.su4;
import defpackage.vek;
import defpackage.wj3;
import defpackage.xgr;
import defpackage.yu0;
import defpackage.zee;
import kotlin.Pair;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class RestorePurchasesActivity extends np2 {
    public static final /* synthetic */ int y = 0;
    public final jyr v;
    public final jyr w;
    public final jyr x;

    public RestorePurchasesActivity() {
        bdt I = hag.I(sek.class);
        l18 l18Var = l18.b;
        this.v = l18Var.b(I, true);
        this.w = l18Var.b(hag.I(age.class), true);
        this.x = btf.b(new b6n(21, this));
    }

    @Override // defpackage.np2
    public final boolean n() {
        return true;
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        jyr jyrVar = this.w;
        age ageVar = (age) jyrVar.getValue();
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        ageVar.getClass();
        supportFragmentManager.B = new wj3(6, ageVar);
        super.onCreate(bundle);
        zee zeeVar = (zee) getIntent().getParcelableExtra("extra.entrypoint");
        if (zeeVar == null) {
            Assertions.throwOrSkip$default(new FailedAssertionException("InAppRestoreEntryPoint must not be null"), null, 2, null);
            finish();
        } else if (bundle == null) {
            y supportFragmentManager2 = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager2, supportFragmentManager2);
            Class cls = (Class) this.x.getValue();
            ((age) jyrVar.getValue()).getClass();
            l.f(R.id.fragment_container_view, cls, cxb.K(new Pair("inapp_restore_screen_args", zeeVar)));
            l.j();
        }
    }

    @Override // defpackage.np2, defpackage.gnb, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onStart() {
        super.onStart();
        vek vekVar = (vek) ((sek) this.v.getValue());
        vekVar.getClass();
        vek.b(vekVar, xgr.n, null, 6);
    }

    @Override // defpackage.np2
    public final int q() {
        return R.layout.simple_fragment_activity;
    }

    @Override // defpackage.np2
    public final void s(Bundle bundle) {
        super.s(bundle);
        hoe.c(this);
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        return yu0.a[ou0Var.ordinal()] == 1 ? R.style.AppTheme_EdgeToEdge_TransparentStatusBar : R.style.AppTheme_Dark_EdgeToEdge_TransparentStatusBar;
    }
}
