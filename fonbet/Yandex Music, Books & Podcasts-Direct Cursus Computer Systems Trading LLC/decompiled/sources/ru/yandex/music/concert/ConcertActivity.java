package ru.yandex.music.concert;

import android.os.Bundle;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import defpackage.bdt;
import defpackage.btf;
import defpackage.byb;
import defpackage.dz5;
import defpackage.hag;
import defpackage.jh1;
import defpackage.jyr;
import defpackage.l18;
import defpackage.ou0;
import defpackage.qdc;
import defpackage.r25;
import defpackage.rz5;
import defpackage.su4;
import defpackage.vs5;
import defpackage.vu5;
import defpackage.xy5;
import defpackage.yu0;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes5.dex */
public final class ConcertActivity extends a {
    public static final /* synthetic */ int w0 = 0;
    public final jyr Y = btf.b(new r25(8, this));
    public final jyr Z;
    public final Class v0;

    public ConcertActivity() {
        jyr b = l18.b.b(hag.I(xy5.class), true);
        this.Z = b;
        ((xy5) b.getValue()).getClass();
        this.v0 = dz5.class;
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        vs5 vs5Var = (vs5) this.Y.getValue();
        if (vs5Var != null) {
            supportFragmentManager.B = new jh1(2, this, vs5Var);
        }
        super.onCreate(bundle);
        vs5 vs5Var2 = (vs5) this.Y.getValue();
        if (vs5Var2 == null) {
            Assertions.fail("activity launch params must not be null");
            finish();
            return;
        }
        if (bundle == null) {
            y supportFragmentManager2 = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager2, supportFragmentManager2);
            l18 l18Var = l18.b;
            bdt I = hag.I(byb.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            if (((rz5) ((byb) qdcVar.C(I)).b(rz5.class)).h()) {
                l.f(R.id.fragment_container_view, this.v0, null);
            } else {
                String str = vs5Var2.a;
                String str2 = vs5Var2.b;
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("arg.concert.id", str);
                bundle2.putString("arg.artist.id", str2);
                vu5 vu5Var = new vu5();
                vu5Var.setArguments(bundle2);
                l.e(R.id.fragment_container_view, vu5Var, null);
            }
            l.j();
        }
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        return yu0.a[ou0Var.ordinal()] == 1 ? R.style.AppTheme_EdgeToEdge_TransparentStatusBar : R.style.AppTheme_Dark_EdgeToEdge_TransparentStatusBar;
    }
}
