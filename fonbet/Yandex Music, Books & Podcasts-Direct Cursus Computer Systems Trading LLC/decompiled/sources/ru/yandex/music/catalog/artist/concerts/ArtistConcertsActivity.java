package ru.yandex.music.catalog.artist.concerts;

import android.os.Bundle;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.c41;
import defpackage.cxb;
import defpackage.l31;
import defpackage.q5g;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes4.dex */
public final class ArtistConcertsActivity extends a {
    public static final /* synthetic */ int Y = 0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        q5g.I(getWindow(), false);
    }

    @Override // ru.yandex.music.player.a, defpackage.np2
    public final void s(Bundle bundle) {
        String stringExtra;
        super.s(bundle);
        if (bundle == null || (stringExtra = bundle.getString("artistConcerts_artistId")) == null) {
            stringExtra = getIntent().getStringExtra("artistConcerts_artistId");
        }
        if (stringExtra == null) {
            finish();
            Assertions.throwOrSkip$default(new FailedAssertionException("No args passed to ArtistConcertsActivity"), null, 2, null);
        } else if (bundle == null) {
            l31 l31Var = new l31(stringExtra);
            c41 c41Var = new c41();
            c41Var.setArguments(cxb.K(new Pair("artistConcerts:args", l31Var)));
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.e(R.id.fragment_container_view, c41Var, null);
            aVar.j();
        }
    }
}
