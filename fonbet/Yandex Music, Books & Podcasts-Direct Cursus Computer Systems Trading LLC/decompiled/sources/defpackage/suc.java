package defpackage;

import android.os.Build;
import android.view.View;
import androidx.fragment.app.o;
import androidx.fragment.app.t;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviTimestamp;

/* loaded from: classes3.dex */
public final class suc {
    public final o a;
    public final ruc b;
    public final g3a c;
    public final lhs d;
    public final lhs e;
    public final lhs f;
    public final lhs g;
    public boolean h;

    public suc(o oVar, ruc rucVar) {
        oVar.getClass();
        this.a = oVar;
        this.b = rucVar;
        this.c = new g3a(17, this);
        lhs lhsVar = new lhs(rucVar.a.concat("Start"), 0, 30);
        this.d = lhsVar;
        this.e = lhs.b(lhsVar, "InitialRendering", 0, 0L, 30);
        this.f = lhs.b(lhsVar, "DataReceiving", 0, 0L, 30);
        this.g = lhs.b(lhsVar, "FinalRendering", 0, 0L, 30);
        oVar.getLifecycle().a(new quc(this));
    }

    public static void c(suc sucVar) {
        sucVar.f.c();
        sucVar.g.d();
    }

    public final void a() {
        t l;
        if (this.h) {
            return;
        }
        this.d.c();
        MviEventsReporter mviEventsReporter = hdg.b;
        if (mviEventsReporter != null) {
            mviEventsReporter.onFullyDrawn(this.c, MviTimestamp.now());
        }
        if (Build.VERSION.SDK_INT >= 29 && (l = this.a.l()) != null) {
            l.reportFullyDrawn();
        }
        this.h = true;
    }

    public final void b() {
        o oVar = this.a;
        View view = oVar.getView();
        if (view != null) {
            view.setOnTouchListener(new de8(3, this));
        }
        View view2 = oVar.getView();
        if (view2 != null) {
            view2.setOnKeyListener(new ouc(0, this));
        }
    }

    public final void d() {
        this.g.c();
        a();
    }
}
