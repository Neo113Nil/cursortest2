package ru.yandex.music.mixes;

import android.os.Bundle;
import androidx.fragment.app.y;
import defpackage.su4;
import defpackage.v8i;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes.dex */
public final class MixesScreenActivity extends a {
    public static final /* synthetic */ int Y = 0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager, supportFragmentManager);
            l.e(R.id.fragment_container_view, new v8i(), null);
            l.j();
        }
    }
}
