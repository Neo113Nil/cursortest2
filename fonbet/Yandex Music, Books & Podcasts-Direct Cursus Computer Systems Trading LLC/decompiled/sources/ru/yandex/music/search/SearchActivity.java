package ru.yandex.music.search;

import android.os.Bundle;
import androidx.fragment.app.y;
import defpackage.b6p;
import defpackage.cxb;
import defpackage.ern;
import defpackage.lvj;
import defpackage.n5p;
import defpackage.ou0;
import defpackage.oxo;
import defpackage.rbb;
import defpackage.su4;
import defpackage.ybf;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes6.dex */
public final class SearchActivity extends a {
    public static final /* synthetic */ int Z = 0;
    public final ybf Y = new ybf(ern.a(rbb.class), new lvj(22, this), new lvj(23, new oxo(1, this)));

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle K;
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
        if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager, supportFragmentManager);
            boolean booleanExtra = getIntent().getBooleanExtra("extra.navigationRoot", false);
            boolean booleanExtra2 = getIntent().getBooleanExtra("extra.autoRecognition", false);
            String stringExtra = getIntent().getStringExtra("extra.initial.query");
            n5p n5pVar = (n5p) getIntent().getParcelableExtra("extra.for.entity.search");
            b6p b6pVar = new b6p();
            if (booleanExtra2) {
                Boolean bool = Boolean.TRUE;
                K = cxb.K(new Pair("arg.isNavigationRoot", bool), new Pair("arg.startRecognition", bool));
            } else {
                K = booleanExtra ? cxb.K(new Pair("arg.isNavigationRoot", Boolean.TRUE)) : n5pVar != null ? cxb.K(new Pair("arg.entitySearchType", n5pVar), new Pair("arg.searchContext", n5pVar.a)) : (stringExtra == null || stringExtra.length() == 0) ? cxb.K(new Pair("arg.isNavigationRoot", Boolean.TRUE)) : cxb.K(new Pair("arg.isNavigationRoot", Boolean.TRUE), new Pair("arg.initialQuery", stringExtra));
            }
            b6pVar.setArguments(K);
            l.d(R.id.fragment_container_view, b6pVar, null, 1);
            l.j();
        }
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        return ou0Var == ou0.d ? R.style.AppTheme_Search_EdgeToEdge : R.style.AppTheme_Search_Dark_EdgeToEdge;
    }
}
