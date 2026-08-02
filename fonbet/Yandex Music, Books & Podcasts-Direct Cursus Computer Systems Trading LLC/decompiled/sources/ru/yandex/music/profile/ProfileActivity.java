package ru.yandex.music.profile;

import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.y;
import defpackage.cxb;
import defpackage.d64;
import defpackage.fkn;
import defpackage.hag;
import defpackage.hmj;
import defpackage.jyr;
import defpackage.klx;
import defpackage.l18;
import defpackage.njf;
import defpackage.ou0;
import defpackage.ox6;
import defpackage.p6j;
import defpackage.pld;
import defpackage.ril;
import defpackage.sr7;
import defpackage.stm;
import defpackage.su4;
import defpackage.t1f;
import defpackage.u0j;
import defpackage.vx6;
import defpackage.wyf;
import defpackage.ytm;
import defpackage.z66;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.player.a;

/* loaded from: classes6.dex */
public final class ProfileActivity extends a {
    public static final /* synthetic */ int w0 = 0;
    public final jyr Y = l18.b.b(hag.I(z66.class), true);
    public t1f Z;
    public vx6 v0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [androidx.fragment.app.o, hmr, p6j] */
    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ytm ytmVar = new ytm();
            if (((fkn) ((z66) this.Y.getValue()).e()).a.getValue() == u0j.a) {
                hmj hmjVar = hmj.a;
                ?? p6jVar = new p6j();
                p6jVar.setArguments(cxb.K(new Pair("extra_hide_toolbar", Boolean.TRUE), new Pair("extra_mode", 3)));
                p6jVar.D(R.string.profile_title, ytmVar.getClass().getName(), ytmVar.getTag(), ytmVar.getArguments());
                ytmVar = p6jVar;
            }
            y supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a l = su4.l(supportFragmentManager, supportFragmentManager);
            l.d(R.id.fragment_container_view, ytmVar, null, 1);
            l.j();
        }
        t1f t1fVar = new t1f(this, wyf.F(getLifecycle()));
        this.Z = t1fVar;
        ox6.B((njf) t1fVar.d, wyf.F(getLifecycle()), new stm(this, 0));
        vx6 vx6Var = new vx6(this, wyf.F(getLifecycle()));
        this.v0 = vx6Var;
        ox6.B((d64) vx6Var.d, wyf.F(getLifecycle()), new stm(this, 1));
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [arf, java.lang.Object] */
    @Override // ru.yandex.music.player.a, androidx.fragment.app.t, android.app.Activity
    public final void onResume() {
        super.onResume();
        ou0 ou0Var = this.b;
        if (ou0Var == null) {
            Intrinsics.j("appTheme");
            throw null;
        }
        ou0.a.getClass();
        if (ou0Var != klx.Z(this)) {
            ((Handler) pld.a.getValue()).postAtFrontOfQueue(new sr7(18, new ril(25, this)));
        }
    }
}
