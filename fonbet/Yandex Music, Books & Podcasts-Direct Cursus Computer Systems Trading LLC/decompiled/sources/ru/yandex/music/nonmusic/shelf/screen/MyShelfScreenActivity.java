package ru.yandex.music.nonmusic.shelf.screen;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import defpackage.b6e;
import defpackage.cxb;
import defpackage.q3j;
import defpackage.qui;
import defpackage.rui;
import defpackage.wui;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes6.dex */
public final class MyShelfScreenActivity extends a {
    public static final /* synthetic */ int Y = 0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        o wuiVar;
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("extra.activityParams");
        qui quiVar = parcelableExtra instanceof qui ? (qui) parcelableExtra : null;
        if (quiVar == null) {
            Assertions.fail("My shelf screen activity params must not be null");
            finish();
            return;
        }
        String str = quiVar.a;
        int ordinal = quiVar.b.ordinal();
        if (ordinal == 0) {
            rui ruiVar = new rui(str);
            wuiVar = new wui();
            wuiVar.setArguments(cxb.K(new Pair("myShelfScreen:args", ruiVar)));
        } else if (ordinal != 1) {
            b6e.s();
            return;
        } else {
            rui ruiVar2 = new rui(str);
            wuiVar = new q3j();
            wuiVar.setArguments(cxb.K(new Pair("newEpisodesScreen:args", ruiVar2)));
        }
        if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.e(R.id.fragment_container_view, wuiVar, null);
            aVar.j();
        }
    }
}
