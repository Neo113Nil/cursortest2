package ru.yandex.music.gdpr;

import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import defpackage.btf;
import defpackage.hag;
import defpackage.ita;
import defpackage.jyr;
import defpackage.l18;
import defpackage.np2;
import defpackage.q2d;
import defpackage.su4;
import defpackage.wj3;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class GdprScreenActivity extends np2 {
    public static final /* synthetic */ int x = 0;
    public final jyr v = l18.b.b(hag.I(q2d.class), true);
    public final jyr w = btf.b(new ita(24, this));

    @Override // defpackage.np2
    public final boolean m() {
        return true;
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        supportFragmentManager.B = new wj3(5, this);
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
}
