package ru.yandex.music.landing.autoplaylists.gag;

import android.graphics.Rect;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import defpackage.np2;
import defpackage.o82;
import defpackage.ou0;
import defpackage.q5g;
import defpackage.smk;
import defpackage.ssg;
import defpackage.su4;
import defpackage.z32;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class AutoPlaylistGagActivity extends np2 {
    public static final /* synthetic */ int v = 0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Rect rect = (Rect) getIntent().getParcelableExtra("extraClip");
        getWindow().setSharedElementEnterTransition(new z32(rect, true));
        getWindow().setSharedElementReturnTransition(new z32(rect, false));
        super.onCreate(bundle);
        q5g.I(getWindow(), false);
        smk smkVar = (smk) getIntent().getParcelableExtra("extra_playlist");
        if (smkVar == null) {
            ssg.a(7, "AutoPlaylistGagActivity", "can not show AutoPlaylistGagActivity without playlist data", null);
            finish();
        } else if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager, supportFragmentManager);
            o82 o82Var = new o82();
            Bundle bundle2 = new Bundle(1);
            bundle2.putParcelable("extra_playlist", smkVar);
            o82Var.setArguments(bundle2);
            l.d(R.id.content_frame, o82Var, null, 1);
            l.k(true, true);
        }
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        return R.style.AppTheme_Dark_EdgeToEdge;
    }
}
