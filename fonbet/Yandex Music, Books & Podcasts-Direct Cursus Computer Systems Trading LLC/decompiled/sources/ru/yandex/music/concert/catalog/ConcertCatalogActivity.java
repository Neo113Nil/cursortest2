package ru.yandex.music.concert.catalog;

import android.os.Bundle;
import androidx.fragment.app.y;
import defpackage.btf;
import defpackage.hag;
import defpackage.jh1;
import defpackage.jyr;
import defpackage.l18;
import defpackage.lt5;
import defpackage.qt5;
import defpackage.r25;
import defpackage.su4;
import defpackage.vt5;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes5.dex */
public final class ConcertCatalogActivity extends a {
    public static final /* synthetic */ int w0 = 0;
    public final jyr Y;
    public final Class Z;
    public final jyr v0;

    public ConcertCatalogActivity() {
        jyr b = l18.b.b(hag.I(vt5.class), true);
        this.Y = b;
        ((vt5) b.getValue()).getClass();
        this.Z = qt5.class;
        this.v0 = btf.b(new r25(9, this));
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        lt5 lt5Var = (lt5) this.v0.getValue();
        if (lt5Var != null) {
            supportFragmentManager.B = new jh1(3, this, lt5Var);
        }
        super.onCreate(bundle);
        if (bundle == null) {
            y supportFragmentManager2 = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager2, supportFragmentManager2);
            l.f(R.id.fragment_container_view, this.Z, null);
            l.j();
        }
    }
}
