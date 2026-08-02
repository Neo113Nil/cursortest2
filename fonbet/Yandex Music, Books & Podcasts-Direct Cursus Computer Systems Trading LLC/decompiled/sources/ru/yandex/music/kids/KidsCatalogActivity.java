package ru.yandex.music.kids;

import android.os.Bundle;
import androidx.fragment.app.y;
import defpackage.cxb;
import defpackage.fqq;
import defpackage.gef;
import defpackage.hag;
import defpackage.jmd;
import defpackage.jyr;
import defpackage.l18;
import defpackage.o5j;
import defpackage.rf3;
import defpackage.tyf;
import defpackage.wyf;
import defpackage.x97;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes5.dex */
public final class KidsCatalogActivity extends a {
    public static final jyr Y = l18.b.b(hag.I(fqq.class), true);

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("kids.landing.tab.id");
            String stringExtra2 = getIntent().getStringExtra("kids.landing.block.id");
            boolean booleanExtra = getIntent().getBooleanExtra("kids.landing.back.nav", false);
            gef gefVar = new gef();
            gefVar.setArguments(cxb.K(new Pair("kids.landing.focus.on.tab.id", stringExtra), new Pair("kids.landing.focus.on.block.id", stringExtra2), new Pair("kids.landing.back.nav", Boolean.valueOf(booleanExtra))));
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.d(R.id.fragment_container_view, gefVar, "kids.catalog.fragment.tag", 1);
            aVar.j();
        }
        jyr jyrVar = o5j.e;
        if (tyf.v()) {
            return;
        }
        u(rf3.k);
    }

    @Override // ru.yandex.music.player.a, defpackage.np2, defpackage.gnb, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onStart() {
        super.onStart();
        x97.y(wyf.F(getLifecycle()), null, null, new jmd(this, null, 9), 3);
    }
}
