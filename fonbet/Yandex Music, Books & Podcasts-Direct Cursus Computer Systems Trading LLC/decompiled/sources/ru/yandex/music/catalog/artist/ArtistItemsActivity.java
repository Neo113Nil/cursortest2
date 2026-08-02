package ru.yandex.music.catalog.artist;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.b6e;
import defpackage.cxb;
import defpackage.mgq;
import defpackage.mm1;
import defpackage.nm1;
import defpackage.ou0;
import defpackage.u51;
import defpackage.vwb;
import defpackage.xq0;
import defpackage.yu0;
import defpackage.zb1;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.player.a;

/* loaded from: classes4.dex */
public final class ArtistItemsActivity extends a {
    public static final /* synthetic */ int Y = 0;

    public final zb1 F() {
        zb1 zb1Var = (zb1) getIntent().getSerializableExtra("extra.infoType");
        if (zb1Var != null) {
            return zb1Var;
        }
        Assertions.throwOrSkip$default(new FailedAssertionException("No info type received"), null, 2, null);
        finish();
        return zb1.a;
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o T;
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        Parcelable parcelableExtra = getIntent().getParcelableExtra("extra.artist");
        if (parcelableExtra == null) {
            xq0.x("Required value was null.");
            return;
        }
        u51 u51Var = (u51) parcelableExtra;
        String str = u51Var.a;
        PlaybackScope e = d.e(u51Var);
        int ordinal = F().ordinal();
        if (ordinal == 0) {
            T = vwb.T(nm1.a, u51Var, e);
        } else if (ordinal == 1) {
            T = vwb.T(nm1.b, u51Var, e);
        } else if (ordinal == 2) {
            T = vwb.S(str, mm1.a, e);
        } else if (ordinal == 3) {
            T = vwb.S(str, mm1.c, e);
        } else if (ordinal == 4) {
            T = vwb.S(str, mm1.b, e);
        } else if (ordinal != 5) {
            b6e.s();
            return;
        } else {
            str.getClass();
            T = new mgq();
            T.setArguments(cxb.K(new Pair("arg.artist_id", str), new Pair("arg.playback_scope", e)));
        }
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.e(R.id.fragment_container_view, T, null);
        aVar.j();
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        int ordinal = F().ordinal();
        return (ordinal == 0 || ordinal == 1) ? yu0.a[ou0Var.ordinal()] == 1 ? R.style.AppTheme_EdgeToEdge_TransparentStatusBar : R.style.AppTheme_Dark_EdgeToEdge_TransparentStatusBar : super.v(ou0Var);
    }
}
