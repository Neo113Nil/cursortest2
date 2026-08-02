package ru.yandex.music.catalog.universalentity;

import android.os.Bundle;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import defpackage.ckt;
import defpackage.cxb;
import defpackage.gjt;
import defpackage.su4;
import defpackage.ujt;
import defpackage.vjt;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes4.dex */
public final class UniversalEntityActivity extends a {
    public static final /* synthetic */ int Y = 0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        gjt gjtVar = (gjt) getIntent().getParcelableExtra("extra.entityContentType");
        ujt ujtVar = (ujt) getIntent().getParcelableExtra("extra.entityUrlType");
        if (gjtVar == null || ujtVar == null) {
            Assertions.fail("activity launch params must not be null");
            finish();
        } else if (bundle == null) {
            y supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager, supportFragmentManager);
            vjt vjtVar = new vjt(gjtVar, ujtVar);
            ckt cktVar = new ckt();
            cktVar.setArguments(cxb.K(new Pair("universalEntityScreen:args", vjtVar)));
            l.e(R.id.fragment_container_view, cktVar, null);
            l.j();
        }
    }
}
