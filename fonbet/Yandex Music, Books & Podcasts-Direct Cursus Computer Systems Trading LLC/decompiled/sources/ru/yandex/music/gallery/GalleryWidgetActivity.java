package ru.yandex.music.gallery;

import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.btf;
import defpackage.g1d;
import defpackage.hag;
import defpackage.ita;
import defpackage.jh1;
import defpackage.jyr;
import defpackage.k1d;
import defpackage.l18;
import defpackage.np2;
import defpackage.ou0;
import defpackage.q5g;
import defpackage.su4;
import defpackage.yu0;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class GalleryWidgetActivity extends np2 {
    public static final /* synthetic */ int y = 0;
    public final jyr v = l18.b.b(hag.I(k1d.class), true);
    public final jyr w = btf.b(new ita(22, this));
    public g1d x;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g1d g1dVar;
        if (bundle == null || (g1dVar = (g1d) bundle.getParcelable("galleryWidgetArgs")) == null) {
            g1dVar = (g1d) getIntent().getParcelableExtra("galleryWidgetArgs");
        }
        this.x = g1dVar;
        if (g1dVar == null) {
            super.onCreate(bundle);
            finish();
            Assertions.throwOrSkip$default(new FailedAssertionException("No GalleryWidgetScreenArgs passed"), null, 2, null);
            return;
        }
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        supportFragmentManager.B = new jh1(4, this, g1dVar);
        super.onCreate(bundle);
        q5g.I(getWindow(), false);
        if (bundle == null) {
            y supportFragmentManager2 = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager2, supportFragmentManager2);
            l.f(R.id.fragment_container_view, (Class) this.w.getValue(), null);
            l.j();
        }
    }

    @Override // defpackage.np2, defpackage.gnb, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        g1d g1dVar = this.x;
        if (g1dVar != null) {
            bundle.putParcelable("galleryWidgetArgs", g1dVar);
        }
    }

    @Override // defpackage.np2
    public final int q() {
        return R.layout.container_activity;
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        return yu0.a[ou0Var.ordinal()] == 1 ? R.style.AppTheme_Transparent_EdgeToEdge : R.style.AppTheme_Transparent_Dark_EdgeToEdge;
    }
}
