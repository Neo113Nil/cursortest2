package ru.yandex.music.novelties.podcasts.catalog;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.y;
import defpackage.bbj;
import defpackage.cxb;
import defpackage.fbj;
import defpackage.fqq;
import defpackage.g2l;
import defpackage.hag;
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

/* loaded from: classes6.dex */
public final class PodcastsCatalogActivity extends a {
    public static final jyr Y = l18.b.b(hag.I(fqq.class), true);

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            fbj fbjVar = (fbj) (intent != null ? intent.getSerializableExtra("non.music.landing.screen.content") : null);
            if (fbjVar == null) {
                fbjVar = fbj.c;
            }
            String stringExtra = getIntent().getStringExtra("non.music.landing.tab.id");
            String stringExtra2 = getIntent().getStringExtra("non.music.landing.block.id");
            boolean booleanExtra = getIntent().getBooleanExtra("non.music.landing.back.nav", false);
            bbj bbjVar = new bbj();
            bbjVar.setArguments(cxb.K(new Pair("landing.skeleton.id", fbjVar), new Pair("landing.focus.on.tab.id", stringExtra), new Pair("landing.focus.on.block.id", stringExtra2), new Pair("non.music.landing.back.nav", Boolean.valueOf(booleanExtra))));
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.d(R.id.fragment_container_view, bbjVar, null, 1);
            aVar.j();
        }
        jyr jyrVar = o5j.e;
        if (tyf.v()) {
            return;
        }
        u(rf3.i);
    }

    @Override // ru.yandex.music.player.a, defpackage.np2, defpackage.gnb, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onStart() {
        super.onStart();
        x97.y(wyf.F(getLifecycle()), null, null, new g2l(this, null, 17), 3);
    }
}
