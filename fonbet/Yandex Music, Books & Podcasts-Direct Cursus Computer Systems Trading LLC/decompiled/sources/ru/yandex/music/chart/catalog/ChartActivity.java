package ru.yandex.music.chart.catalog;

import android.os.Bundle;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import defpackage.ff4;
import defpackage.q6k;
import defpackage.su4;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes5.dex */
public final class ChartActivity extends a {
    public static final /* synthetic */ int Y = 0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("transit.args");
        if (bundleExtra == null) {
            finish();
            return;
        }
        if (bundle == null) {
            ff4 ff4Var = new ff4();
            ff4Var.setArguments(bundleExtra);
            o v = q6k.v(this, ff4Var, true);
            y supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager, supportFragmentManager);
            l.d(R.id.fragment_container_view, v, null, 1);
            l.j();
        }
    }
}
