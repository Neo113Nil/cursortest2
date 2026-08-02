package ru.yandex.music.settings.screen;

import android.os.Bundle;
import androidx.fragment.app.y;
import defpackage.d6n;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes6.dex */
public final class QualitySettingsActivity extends a {
    public static final /* synthetic */ int Y = 0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            d6n d6nVar = new d6n();
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.e(R.id.fragment_container_view, d6nVar, null);
            aVar.j();
        }
    }
}
