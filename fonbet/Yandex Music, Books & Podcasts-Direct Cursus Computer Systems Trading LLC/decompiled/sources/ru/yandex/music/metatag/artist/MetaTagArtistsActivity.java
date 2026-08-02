package ru.yandex.music.metatag.artist;

import android.os.Bundle;
import androidx.fragment.app.y;
import defpackage.cxb;
import defpackage.f1i;
import defpackage.su4;
import defpackage.xq0;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes.dex */
public final class MetaTagArtistsActivity extends a {
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
            f1i f1iVar = new f1i();
            f1iVar.setArguments(cxb.K(new Pair("arg.metatag_id", stringExtra)));
            l.e(R.id.fragment_container_view, f1iVar, null);
            l.j();
        }
    }
}
