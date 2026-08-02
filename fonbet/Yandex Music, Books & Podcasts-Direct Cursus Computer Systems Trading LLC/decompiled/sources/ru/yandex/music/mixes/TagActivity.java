package ru.yandex.music.mixes;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.y;
import defpackage.cxb;
import defpackage.d3s;
import defpackage.l3s;
import defpackage.nvl;
import defpackage.su4;
import defpackage.xq0;
import java.util.ArrayList;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes.dex */
public final class TagActivity extends a {
    public static final /* synthetic */ int Y = 0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("extra.tag");
        if (parcelableExtra == null) {
            xq0.x("Required value was null.");
            return;
        }
        d3s d3sVar = (d3s) parcelableExtra;
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("extra.playlists");
        if (parcelableArrayListExtra == null) {
            xq0.x("Required value was null.");
            return;
        }
        String stringExtra = getIntent().getStringExtra("extra.sort");
        if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager, supportFragmentManager);
            l3s l3sVar = new l3s();
            l3sVar.setArguments(cxb.K(new Pair("arg.tag", d3sVar), new Pair("arg.playlist_ids", parcelableArrayListExtra.toArray(new nvl[0])), new Pair("arg.sort_by", stringExtra)));
            l.e(R.id.fragment_container_view, l3sVar, null);
            l.j();
        }
    }
}
