package ru.yandex.music.novelties.podcasts;

import android.os.Bundle;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.b6e;
import defpackage.cxb;
import defpackage.kem;
import defpackage.ldm;
import defpackage.lem;
import defpackage.mem;
import defpackage.rf3;
import defpackage.su4;
import kotlin.Pair;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class PodcastsActivity extends ru.yandex.music.player.a {
    public static final /* synthetic */ int Y = 0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        kem kemVar;
        String stringExtra;
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        lem lemVar = (lem) getIntent().getSerializableExtra("entityType");
        mem memVar = (lemVar == null || (kemVar = (kem) getIntent().getSerializableExtra("catalogType")) == null || (stringExtra = getIntent().getStringExtra("entityId")) == null) ? null : new mem(lemVar, kemVar, stringExtra);
        if (memVar == null) {
            Assertions.throwOrSkip$default(new FailedAssertionException("args are empty: " + getIntent().getExtras()), null, 2, null);
            finish();
            return;
        }
        y supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a l = su4.l(supportFragmentManager, supportFragmentManager);
        ldm ldmVar = new ldm();
        ldmVar.setArguments(cxb.K(new Pair("arg.args", memVar)));
        l.d(R.id.fragment_container_view, ldmVar, null, 1);
        l.j();
        int ordinal = memVar.b.ordinal();
        if (ordinal == 0) {
            u(rf3.i);
        } else if (ordinal == 1) {
            u(rf3.k);
        } else {
            b6e.s();
        }
    }
}
