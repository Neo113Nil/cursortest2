package ru.yandex.music.landing.skeleton;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.y;
import defpackage.c0p;
import defpackage.cxb;
import defpackage.dqq;
import defpackage.fqq;
import defpackage.glp;
import defpackage.hag;
import defpackage.jyr;
import defpackage.l18;
import defpackage.nqq;
import defpackage.su4;
import defpackage.wyf;
import defpackage.x97;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes5.dex */
public final class SkeletonScreenActivity extends a {
    public static final /* synthetic */ int Z = 0;
    public final jyr Y = l18.b.b(hag.I(fqq.class), true);

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("extra.skeleton.id");
            if (stringExtra == null) {
                su4.s(2, null, "Skeleton id is not specified", null);
            }
            if (stringExtra == null) {
                return;
            }
            y supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager, supportFragmentManager);
            String stringExtra2 = getIntent().getStringExtra("extra.skeleton.tab.id");
            String stringExtra3 = getIntent().getStringExtra("extra.skeleton.block.id");
            Intent intent = getIntent();
            dqq dqqVar = new dqq(stringExtra, stringExtra2, stringExtra3, (c0p) (intent != null ? intent.getSerializableExtra("extra.search.context") : null));
            nqq nqqVar = new nqq();
            nqqVar.setArguments(cxb.K(new Pair("skeletonScreen:args", dqqVar)));
            l.e(R.id.fragment_container_view, nqqVar, null);
            l.j();
        }
    }

    @Override // ru.yandex.music.player.a, defpackage.np2, defpackage.gnb, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onStart() {
        super.onStart();
        x97.y(wyf.F(getLifecycle()), null, null, new glp(this, null, 9), 3);
    }
}
