package ru.yandex.music.metatag.album;

import android.os.Bundle;
import androidx.fragment.app.y;
import defpackage.cxb;
import defpackage.s0i;
import defpackage.su4;
import defpackage.xq0;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes.dex */
public final class MetaTagAlbumsActivity extends a {
    public static final /* synthetic */ int Y = 0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("extra_id");
            if (stringExtra == null) {
                xq0.x("metaTagId must be set");
                return;
            }
            y supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager, supportFragmentManager);
            s0i s0iVar = new s0i();
            s0iVar.setArguments(cxb.K(new Pair("arg.metatag_id", stringExtra)));
            l.e(R.id.fragment_container_view, s0iVar, null);
            l.j();
        }
    }
}
