package ru.yandex.music.catalog.artist.screen;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import defpackage.btf;
import defpackage.ih1;
import defpackage.jh1;
import defpackage.jyr;
import defpackage.lh1;
import defpackage.ni1;
import defpackage.ou0;
import defpackage.su4;
import defpackage.yu0;
import defpackage.z6n;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes4.dex */
public final class ArtistScreenActivity extends a {
    public static final /* synthetic */ int w0 = 0;
    public z6n Y;
    public final Class Z = ni1.class;
    public final jyr v0 = btf.b(new ih1(this, 0));

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        jyr jyrVar = this.v0;
        lh1 lh1Var = (lh1) jyrVar.getValue();
        if (lh1Var != null) {
            supportFragmentManager.B = new jh1(0, this, lh1Var);
        }
        super.onCreate(bundle);
        if (((lh1) jyrVar.getValue()) == null) {
            Assertions.fail("activity launch params must not be null");
            finish();
            return;
        }
        Intent intent = getIntent();
        intent.getClass();
        this.Y = new z6n(intent, bundle);
        if (bundle == null) {
            y supportFragmentManager2 = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager2, supportFragmentManager2);
            l.f(R.id.fragment_container_view, this.Z, null);
            l.j();
        }
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        return yu0.a[ou0Var.ordinal()] == 1 ? R.style.AppTheme_EdgeToEdge_TransparentStatusBar : R.style.AppTheme_Dark_EdgeToEdge_TransparentStatusBar;
    }
}
