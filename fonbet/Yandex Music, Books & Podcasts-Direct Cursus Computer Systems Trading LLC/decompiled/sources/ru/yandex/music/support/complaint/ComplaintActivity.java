package ru.yandex.music.support.complaint;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.cxb;
import defpackage.ml5;
import defpackage.n;
import defpackage.np2;
import defpackage.su4;
import kotlin.Pair;

/* loaded from: classes6.dex */
public final class ComplaintActivity extends np2 {
    public static final int v = View.generateViewId();

    @Override // defpackage.np2
    public final boolean n() {
        return false;
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        p();
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(v);
        setContentView(frameLayout);
        if (bundle == null) {
            Bundle extras = getIntent().getExtras();
            String string = extras != null ? extras.getString("track_id") : null;
            if (string == null) {
                Assertions.throwOrSkip$default(new FailedAssertionException("No track id received"), null, 2, null);
                finish();
            } else {
                y supportFragmentManager = getSupportFragmentManager();
                a l = su4.l(supportFragmentManager, supportFragmentManager);
                int id = frameLayout.getId();
                ml5 ml5Var = new ml5();
                ml5Var.setArguments(cxb.K(new Pair("key_track_id", string)));
                l.d(id, ml5Var, null, 1);
                l.j();
            }
        }
        getSupportFragmentManager().f0("send_complaint", this, new n(14, this));
    }
}
