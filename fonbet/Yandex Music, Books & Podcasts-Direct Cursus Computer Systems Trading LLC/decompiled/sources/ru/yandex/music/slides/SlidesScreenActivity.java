package ru.yandex.music.slides;

import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import defpackage.btf;
import defpackage.cwq;
import defpackage.hag;
import defpackage.hoe;
import defpackage.jh1;
import defpackage.jyr;
import defpackage.l18;
import defpackage.np2;
import defpackage.ou0;
import defpackage.oxo;
import defpackage.su4;
import defpackage.uvq;
import defpackage.zvq;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class SlidesScreenActivity extends np2 {
    public static final /* synthetic */ int y = 0;
    public final jyr v;
    public final Class w;
    public final jyr x;

    public SlidesScreenActivity() {
        jyr b = l18.b.b(hag.I(cwq.class), true);
        this.v = b;
        ((cwq) b.getValue()).getClass();
        this.w = uvq.class;
        this.x = btf.b(new oxo(28, this));
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        zvq zvqVar = (zvq) this.x.getValue();
        if (zvqVar != null) {
            supportFragmentManager.B = new jh1(6, this, zvqVar);
        }
        super.onCreate(bundle);
        Configuration configuration = getResources().getConfiguration();
        configuration.getClass();
        if (configuration.smallestScreenWidthDp < 600) {
            setRequestedOrientation(1);
        }
        if (bundle == null) {
            y supportFragmentManager2 = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager2, supportFragmentManager2);
            l.f(R.id.content_frame, this.w, null);
            l.j();
        }
    }

    @Override // defpackage.np2
    public final void s(Bundle bundle) {
        super.s(bundle);
        hoe.c(this);
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        return R.style.AppTheme_Slides_Dark_EdgeToEdge;
    }
}
