package ru.yandex.music.catalog.artist.familiar;

import android.os.Bundle;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.cxb;
import defpackage.g71;
import defpackage.j71;
import defpackage.q5g;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes4.dex */
public final class ArtistFamiliarActivity extends a {
    public static final /* synthetic */ int Y = 0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        j71 j71Var;
        super.onCreate(bundle);
        q5g.I(getWindow(), false);
        if (bundle == null || (j71Var = (j71) bundle.getParcelable("artistFamiliarArgs")) == null) {
            j71Var = (j71) getIntent().getParcelableExtra("artistFamiliarArgs");
        }
        if (j71Var == null) {
            finish();
            Assertions.throwOrSkip$default(new FailedAssertionException("No args passed to ArtistFamiliarActivity"), null, 2, null);
        } else if (bundle == null) {
            g71 g71Var = new g71();
            g71Var.setArguments(cxb.K(new Pair("artistFamiliar:args", j71Var)));
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.e(R.id.fragment_container_view, g71Var, null);
            aVar.j();
        }
    }
}
