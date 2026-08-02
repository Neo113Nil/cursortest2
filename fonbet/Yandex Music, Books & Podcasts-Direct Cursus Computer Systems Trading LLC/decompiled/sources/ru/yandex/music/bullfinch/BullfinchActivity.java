package ru.yandex.music.bullfinch;

import android.os.Bundle;
import androidx.fragment.app.a;
import androidx.fragment.app.y;
import defpackage.btf;
import defpackage.hag;
import defpackage.hoe;
import defpackage.ik3;
import defpackage.jyr;
import defpackage.l18;
import defpackage.np2;
import defpackage.ou0;
import defpackage.r93;
import defpackage.su4;
import defpackage.wj3;
import defpackage.yu0;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class BullfinchActivity extends np2 {
    public static final /* synthetic */ int x = 0;
    public final jyr v = l18.b.b(hag.I(ik3.class), true);
    public final jyr w = btf.b(new r93(2, this));

    @Override // defpackage.np2
    public final boolean n() {
        return true;
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        y supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        supportFragmentManager.B = new wj3(0, this);
        super.onCreate(bundle);
        if (bundle == null) {
            y supportFragmentManager2 = getSupportFragmentManager();
            a l = su4.l(supportFragmentManager2, supportFragmentManager2);
            l.f(R.id.fragment_container_view, (Class) this.w.getValue(), null);
            l.j();
        }
    }

    @Override // defpackage.np2
    public final int q() {
        return R.layout.simple_fragment_activity;
    }

    @Override // defpackage.np2
    public final void s(Bundle bundle) {
        super.s(bundle);
        hoe.c(this);
    }

    @Override // defpackage.np2
    public final void t(boolean z) {
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        return yu0.a[ou0Var.ordinal()] == 1 ? R.style.AppTheme_EdgeToEdge_TransparentLightStatusBar : R.style.AppTheme_Dark_EdgeToEdge_TransparentStatusBar;
    }
}
