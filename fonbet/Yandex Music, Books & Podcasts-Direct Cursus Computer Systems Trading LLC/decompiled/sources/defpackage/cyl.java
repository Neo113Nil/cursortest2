package defpackage;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import java.util.List;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;

/* loaded from: classes3.dex */
public final class cyl {
    public final n0m a;
    public final Activity b;
    public final exl c;
    public final kxi d;
    public final tmb e;
    public cxl f;
    public zul g;
    public cvl h;
    public List i;
    public final xdr j;
    public final xdr k;
    public final dud l;
    public final xdr m;
    public final xdr n;

    public cyl(n0m n0mVar, t tVar, exl exlVar, kxi kxiVar, tmb tmbVar, kyl kylVar, mm6 mm6Var) {
        n0mVar.getClass();
        tVar.getClass();
        tmbVar.getClass();
        mm6Var.getClass();
        this.a = n0mVar;
        this.b = tVar;
        this.c = exlVar;
        this.d = kxiVar;
        this.e = tmbVar;
        this.f = a(new cvl("-1", "unknown", drt.f, 0, 0, false, 0, 0, 0, 0L, 0L, null, 0L, null, null, null, null, null, 0, null, null, null, false, null, false, null, null, 134217720), false);
        x97.y(mm6Var, null, null, new g2l(this, null, 8), 3);
        this.j = n0mVar.B;
        this.k = n0mVar.F;
        this.l = exlVar.b;
        this.m = n0mVar.E;
        this.n = n0mVar.D;
    }

    public final cxl a(cvl cvlVar, boolean z) {
        l18 l18Var = l18.b;
        bdt I = hag.I(kyl.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        Activity activity = this.b;
        kxi kxiVar = this.d;
        activity.getClass();
        cvlVar.getClass();
        PlaylistScreenActivity playlistScreenActivity = (PlaylistScreenActivity) activity;
        y supportFragmentManager = playlistScreenActivity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        int i = PlaylistScreenActivity.B0;
        Intent intent = playlistScreenActivity.getIntent();
        intent.getClass();
        return new cxl(playlistScreenActivity, supportFragmentManager, dxl.a(intent, cvlVar), new ayl(0, activity, PlaylistScreenActivity.class, "expand", "expand()V", 0, 6), z, kxiVar);
    }

    public final qzl b(cvl cvlVar, List list, ff ffVar, boolean z) {
        cxl a = a(cvlVar, z);
        this.f = a;
        this.h = cvlVar;
        this.i = list;
        Activity activity = this.b;
        activity.getClass();
        y supportFragmentManager = ((PlaylistScreenActivity) activity).getSupportFragmentManager();
        supportFragmentManager.getClass();
        qf1 qf1Var = new qf1(activity, supportFragmentManager, 1);
        n0m n0mVar = this.a;
        kxi kxiVar = this.d;
        tmb tmbVar = this.e;
        String str = this.c.c;
        l18 l18Var = l18.b;
        bdt I = hag.I(g0l.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return new qzl(n0mVar, a, kxiVar, cvlVar, ffVar, list, str, tmbVar, qf1Var, (g0l) qdcVar.C(I));
    }
}
