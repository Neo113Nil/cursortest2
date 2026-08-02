package ru.yandex.music.settings;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import defpackage.np2;
import defpackage.qdq;
import defpackage.su4;
import defpackage.y4;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class AboutActivity extends np2 {
    public static final /* synthetic */ int v = 0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager, supportFragmentManager);
            l.e(R.id.fragment_container_view, new y4(), null);
            l.j();
        }
        View findViewById = findViewById(android.R.id.content);
        findViewById.getClass();
        qdq.d(findViewById, true, false, true, true);
    }

    @Override // defpackage.np2
    public final int q() {
        return R.layout.simple_fragment_activity;
    }
}
