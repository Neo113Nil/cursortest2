package ru.yandex.music.nonmusic.shelf.screen;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import defpackage.b6e;
import defpackage.cxb;
import defpackage.jti;
import defpackage.psi;
import defpackage.rui;
import defpackage.uti;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes6.dex */
public final class MyShelfEntitiesScreenActivity extends a {
    public static final /* synthetic */ int Y = 0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o jtiVar;
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("extra.activityParams");
        psi psiVar = parcelableExtra instanceof psi ? (psi) parcelableExtra : null;
        if (psiVar == null) {
            Assertions.fail("activity launch params must not be null");
            finish();
            return;
        }
        String str = psiVar.a;
        int ordinal = psiVar.b.ordinal();
        if (ordinal == 0) {
            rui ruiVar = new rui(str);
            jtiVar = new jti();
            jtiVar.setArguments(cxb.K(new Pair("myShelfHistoryScreen:args", ruiVar)));
        } else if (ordinal != 1) {
            b6e.s();
            return;
        } else {
            rui ruiVar2 = new rui(str);
            jtiVar = new uti();
            jtiVar.setArguments(cxb.K(new Pair("myShelfLikesScreen:args", ruiVar2)));
        }
        if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.e(R.id.fragment_container_view, jtiVar, null);
            aVar.j();
        }
    }
}
