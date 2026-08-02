package ru.yandex.music.url.schemes.playVibe;

import android.os.Bundle;
import defpackage.btf;
import defpackage.c2e;
import defpackage.cmd;
import defpackage.cxb;
import defpackage.dm6;
import defpackage.gwk;
import defpackage.hag;
import defpackage.hi7;
import defpackage.imp;
import defpackage.ita;
import defpackage.j5b;
import defpackage.jyr;
import defpackage.kg5;
import defpackage.l18;
import defpackage.lhs;
import defpackage.m4l;
import defpackage.nmb;
import defpackage.np2;
import defpackage.pkb;
import defpackage.qvk;
import defpackage.rf3;
import defpackage.rhp;
import defpackage.rpt;
import defpackage.rvf;
import defpackage.weo;
import defpackage.wjb;
import defpackage.x97;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;
import ru.yandex.music.main.MainScreenActivity;
import ru.yandex.music.url.ui.StubActivity;

/* loaded from: classes6.dex */
public final class EmptyScreenInDeeplinkActivity extends np2 {
    public static final /* synthetic */ int z = 0;
    public final jyr v = l18.b.b(hag.I(m4l.class), true);
    public qvk w = new qvk();
    public final rhp x = new rhp();
    public final jyr y = btf.b(new ita(4, this));

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("open.player", false);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("wave.seeds");
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            startActivity(StubActivity.z(this, rpt.NOT_FOUND));
            finish();
            return;
        }
        Continuation continuation = null;
        if (isTaskRoot()) {
            jyr jyrVar = c2e.e;
            if (kg5.B()) {
                lhs lhsVar = MainScreenActivity.Q0;
                startActivity(imp.J(this, rf3.m, rvf.w(stringArrayListExtra, booleanExtra), null, 8));
            } else {
                lhs lhsVar2 = MainScreenActivity.Q0;
                startActivity(imp.J(this, rf3.h, cxb.K(new Pair("landing.type.queue", new hi7(stringArrayListExtra, booleanExtra))), null, 8));
            }
            finish();
            return;
        }
        String t = weo.t();
        this.x.c(x97.y(cmd.a, dm6.b(), null, new j5b(this, stringArrayListExtra, t, continuation, 1), 2));
        gwk gwkVar = (gwk) this.y.getValue();
        Object Q = CollectionsKt.Q(stringArrayListExtra);
        Q.getClass();
        String str = (String) Q;
        gwkVar.getClass();
        t.getClass();
        nmb nmbVar = gwkVar.b;
        String G = gwkVar.a.G();
        wjb wjbVar = wjb.MainScreen;
        pkb pkbVar = pkb.Audiobook;
        nmb.z(nmbVar, G, wjbVar, null, null, null, null, 0, false, "deeplink", "deeplink", 0, "wave", str, 0, t, 52476);
    }

    @Override // defpackage.np2, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onDestroy() {
        this.w = null;
        this.x.c(null);
        super.onDestroy();
    }

    @Override // defpackage.np2
    public final int q() {
        return R.layout.activity_relogin;
    }
}
