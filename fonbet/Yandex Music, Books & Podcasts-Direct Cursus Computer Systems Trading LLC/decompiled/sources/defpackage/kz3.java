package defpackage;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.y;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import ru.yandex.music.catalog.artist.ArtistItemsActivity;
import ru.yandex.music.catalog.artist.familiar.ArtistFamiliarActivity;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.phonoteka.mymusic.CollectionMainActivity;

/* loaded from: classes5.dex */
public final class kz3 implements iz3 {
    public final jyr a;

    public kz3(r1l r1lVar) {
        this.a = l18.b.b(hag.I(oq7.class), true);
        x97.y(cmd.a, dm6.b, null, new h1j(this, r1lVar, (Continuation) null, 27), 2);
    }

    @Override // defpackage.iz3
    public void c(u51 u51Var) {
        np2 np2Var = (np2) this.a.getValue();
        if (np2Var == null) {
            return;
        }
        j71 j71Var = new j71(b81.Collection, u51Var);
        int i = ArtistFamiliarActivity.Y;
        np2Var.startActivity(quj.H(np2Var, j71Var));
    }

    @Override // defpackage.iz3
    public void e(u51 u51Var) {
        u51Var.getClass();
        np2 np2Var = (np2) this.a.getValue();
        if (np2Var == null) {
            return;
        }
        PlaybackScope f = d.f(u51Var.a, u51Var.b);
        int i = ArtistScreenActivity.w0;
        np2Var.startActivity(l48.p(np2Var, u51Var, f, null, 24));
    }

    @Override // defpackage.iz3
    public void i(ArrayList arrayList) {
        np2 np2Var = (np2) this.a.getValue();
        if (np2Var == null) {
            return;
        }
        int i = CollectionMainActivity.v0;
        Intent B = men.B(np2Var, v35.h);
        sb.D(np2Var, B);
        np2Var.startActivity(B);
    }

    @Override // defpackage.iz3
    public void k(u51 u51Var) {
        u51Var.getClass();
        np2 np2Var = (np2) this.a.getValue();
        if (np2Var == null) {
            np2Var = null;
        }
        if (np2Var != null) {
            lwg F = g0g.F(u51Var, false);
            y supportFragmentManager = np2Var.getSupportFragmentManager();
            szf.R(supportFragmentManager, vz1.f(supportFragmentManager, F), d.f(u51Var.a, u51Var.b));
        }
    }

    @Override // defpackage.iz3
    public void l(u51 u51Var) {
        np2 np2Var = (np2) this.a.getValue();
        if (np2Var == null) {
            return;
        }
        int i = ArtistItemsActivity.Y;
        np2Var.startActivity(kg5.z(np2Var, u51Var, zb1.a));
    }

    public kz3(Activity activity) {
        activity.getClass();
        this.a = btf.b(new jz3(activity, 0));
    }

    public kz3(jyr jyrVar) {
        this.a = jyrVar;
    }
}
