package ru.yandex.music.cards;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.cxb;
import defpackage.klx;
import defpackage.my3;
import defpackage.np2;
import defpackage.ou0;
import defpackage.rpt;
import defpackage.su4;
import defpackage.yu0;
import kotlin.Pair;
import ru.yandex.music.R;
import ru.yandex.music.url.ui.StubActivity;

/* loaded from: classes3.dex */
public final class CardsActivity extends np2 {
    public static final /* synthetic */ int v = 0;

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            if (intent == null || (stringExtra = intent.getStringExtra("CardsActivity.promoId")) == null) {
                startActivity(StubActivity.z(this, rpt.NOT_FOUND));
                Assertions.throwOrSkip("CardsActivity", new FailedAssertionException("CardsActivity required params"));
                finish();
            } else {
                y supportFragmentManager = getSupportFragmentManager();
                a l = su4.l(supportFragmentManager, supportFragmentManager);
                my3 my3Var = new my3();
                my3Var.setArguments(cxb.K(new Pair("CardsFragment.promoId", stringExtra)));
                l.d(R.id.content_frame, my3Var, null, 1);
                l.j();
            }
        }
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        klx klxVar = ou0.a;
        return yu0.a[0] == 1 ? R.style.AppTheme_EdgeToEdge : R.style.AppTheme_Dark_EdgeToEdge;
    }
}
