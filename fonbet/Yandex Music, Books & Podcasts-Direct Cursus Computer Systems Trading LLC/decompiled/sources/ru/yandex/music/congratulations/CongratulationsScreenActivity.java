package ru.yandex.music.congratulations;

import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import defpackage.btf;
import defpackage.hag;
import defpackage.hoe;
import defpackage.jyr;
import defpackage.k56;
import defpackage.l18;
import defpackage.np2;
import defpackage.r25;
import defpackage.su4;
import defpackage.wj3;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class CongratulationsScreenActivity extends np2 {
    public static final /* synthetic */ int x = 0;
    public final jyr v = l18.b.b(hag.I(k56.class), true);
    public final jyr w = btf.b(new r25(23, this));

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        k56 k56Var = (k56) this.v.getValue();
        k56Var.getClass();
        supportFragmentManager.B = new wj3(2, k56Var);
        super.onCreate(bundle);
        if (bundle == null) {
            y supportFragmentManager2 = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager2, supportFragmentManager2);
            l.f(R.id.fragment_container_view, (Class) this.w.getValue(), null);
            l.j();
        }
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
}
