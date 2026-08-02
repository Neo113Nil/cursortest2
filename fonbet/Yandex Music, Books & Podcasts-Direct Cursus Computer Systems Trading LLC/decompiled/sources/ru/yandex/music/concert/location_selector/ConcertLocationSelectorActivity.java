package ru.yandex.music.concert.location_selector;

import android.os.Bundle;
import androidx.fragment.app.y;
import defpackage.ax5;
import defpackage.hag;
import defpackage.jyr;
import defpackage.l18;
import defpackage.su4;
import defpackage.uw5;
import defpackage.wj3;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes5.dex */
public final class ConcertLocationSelectorActivity extends a {
    public static final /* synthetic */ int v0 = 0;
    public final jyr Y;
    public final Class Z;

    public ConcertLocationSelectorActivity() {
        jyr b = l18.b.b(hag.I(ax5.class), true);
        this.Y = b;
        ((ax5) b.getValue()).getClass();
        this.Z = uw5.class;
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        supportFragmentManager.B = new wj3(1, this);
        super.onCreate(bundle);
        if (bundle == null) {
            y supportFragmentManager2 = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager2, supportFragmentManager2);
            l.f(R.id.fragment_container_view, this.Z, null);
            l.j();
        }
    }
}
