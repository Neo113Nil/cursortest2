package defpackage;

import android.content.Context;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class ayk {
    public final Context a;
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final jyr f;
    public final jyr g;

    public ayk(Context context) {
        context.getClass();
        this.a = context;
        bdt I = hag.I(z66.class);
        l18 l18Var = l18.b;
        this.b = l18Var.b(I, true);
        this.c = l18Var.b(hag.I(ezb.class), true);
        this.d = btf.b(new aok(7));
        this.e = btf.b(new d1j(17, this));
        this.f = btf.b(new aok(8));
        this.g = l18Var.b(hag.I(v8s.class), true);
    }

    public final t a() {
        return (t) this.e.getValue();
    }

    public final boolean b(String str, boolean z) {
        str.getClass();
        boolean a = ((gp4) this.f.getValue()).a(z);
        Context context = this.a;
        if (a) {
            jyr jyrVar = this.b;
            if (((z66) jyrVar.getValue()).a().a) {
                return false;
            }
            hld.I(context, (z66) jyrVar.getValue());
            return true;
        }
        if (!frc.a.a()) {
            context.getClass();
            hag.x(context, R.string.bottom_sheet_track_explicit_title, 0);
            return true;
        }
        t a2 = a();
        if (a2 == null) {
            ssg.a(5, null, "PlayableWarningDemonstrator is used from non-activity context", null);
            context.getClass();
            hag.x(context, R.string.bottom_sheet_track_explicit_title, 0);
            return true;
        }
        y supportFragmentManager = a2.getSupportFragmentManager();
        supportFragmentManager.getClass();
        xyb xybVar = new xyb();
        xybVar.setArguments(cxb.K(new Pair("ARG_CLIP_ID", str)));
        x7f.B(xybVar, supportFragmentManager, "CLIP_EXPLICIT_WARNING");
        return true;
    }

    public final void c(mqs mqsVar) {
        if (mqsVar == null) {
            return;
        }
        dg2 dg2Var = mqsVar.k;
        dg2 dg2Var2 = dg2.e;
        Context context = this.a;
        if (dg2Var == dg2Var2) {
            context.getClass();
            hag.x(context, R.string.local_track_not_available, 0);
            return;
        }
        if (n8w.a.apply(mqsVar)) {
            if (!frc.a.a()) {
                context.getClass();
                hag.x(context, R.string.bottom_sheet_track_no_rights_title, 0);
                return;
            }
            t a = a();
            if (a == null) {
                ssg.a(5, null, "PlayableWarningDemonstrator is used from non-activity context", null);
                context.getClass();
                hag.x(context, R.string.bottom_sheet_track_no_rights_title, 0);
                return;
            } else {
                lik likVar = new lik(vik.c, mqsVar.a, mqsVar.c);
                y supportFragmentManager = a.getSupportFragmentManager();
                supportFragmentManager.getClass();
                p8w p8wVar = new p8w();
                p8wVar.setArguments(cxb.K(new Pair("navigation_source_info", likVar)));
                x7f.B(p8wVar, supportFragmentManager, "BOOKMATE_UNAVAILABLE_BOTTOM_SHEET");
                return;
            }
        }
        if (dg2Var != dg2.b) {
            if (!frc.a.a()) {
                context.getClass();
                hag.x(context, R.string.bottom_sheet_track_no_rights_title, 0);
                return;
            }
            t a2 = a();
            if (a2 != null) {
                y supportFragmentManager2 = a2.getSupportFragmentManager();
                supportFragmentManager2.getClass();
                x7f.B(new u7j(), supportFragmentManager2, "TRACK_NO_RIGHTS_WARNING");
                return;
            } else {
                ssg.a(5, null, "PlayableWarningDemonstrator is used from non-activity context", null);
                context.getClass();
                hag.x(context, R.string.bottom_sheet_track_no_rights_title, 0);
                return;
            }
        }
        if (((dzs) this.d.getValue()).apply(mqsVar)) {
            if (((v8s) this.g.getValue()).a(mqsVar)) {
                CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
                return;
            } else {
                hld.I(context, (z66) this.b.getValue());
                return;
            }
        }
        boolean z = v3g.E((frt) ((ezb) this.c.getValue()).a.b.getValue()).f;
        if (z) {
            if (!frc.a.a()) {
                context.getClass();
                hag.x(context, R.string.bottom_sheet_track_explicit_title, 0);
                return;
            }
            t a3 = a();
            if (a3 == null) {
                ssg.a(5, null, "PlayableWarningDemonstrator is used from non-activity context", null);
                context.getClass();
                hag.x(context, R.string.bottom_sheet_track_explicit_title, 0);
                return;
            } else {
                y supportFragmentManager3 = a3.getSupportFragmentManager();
                supportFragmentManager3.getClass();
                izb izbVar = new izb();
                izbVar.setArguments(cxb.K(new Pair("ARG_TRACK", mqsVar)));
                x7f.B(izbVar, supportFragmentManager3, "TRACK_EXPLICIT_WARNING_KIDS");
                return;
            }
        }
        if (z) {
            b6e.s();
            return;
        }
        if (!frc.a.a()) {
            context.getClass();
            hag.x(context, R.string.bottom_sheet_track_explicit_title, 0);
            return;
        }
        t a4 = a();
        if (a4 == null) {
            ssg.a(5, null, "PlayableWarningDemonstrator is used from non-activity context", null);
            context.getClass();
            hag.x(context, R.string.bottom_sheet_track_explicit_title, 0);
        } else {
            y supportFragmentManager4 = a4.getSupportFragmentManager();
            supportFragmentManager4.getClass();
            hzb hzbVar = new hzb();
            hzbVar.setArguments(cxb.K(new Pair("ARG_TRACK", mqsVar)));
            x7f.B(hzbVar, supportFragmentManager4, "TRACK_EXPLICIT_WARNING");
        }
    }
}
