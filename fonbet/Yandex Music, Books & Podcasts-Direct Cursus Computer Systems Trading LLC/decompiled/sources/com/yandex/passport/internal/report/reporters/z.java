package com.yandex.passport.internal.report.reporters;

import com.yandex.passport.internal.report.b7;
import com.yandex.passport.internal.report.c7;
import com.yandex.passport.internal.report.d7;
import com.yandex.passport.internal.report.e7;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.g7;
import defpackage.b6e;
import defpackage.hrg;
import defpackage.n8g;
import defpackage.t75;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData$UgcLiveStatus;

/* loaded from: classes4.dex */
public final class z extends androidx.core.app.n0 {
    public final void u(com.yandex.passport.common.core.f fVar, x xVar) {
        fVar.getClass();
        d7 d7Var = d7.d;
        n8g b = t75.b();
        b.add(new ff(fVar));
        if (xVar != null) {
            b.add(new com.yandex.passport.internal.report.f(xVar.a, 2, false));
        }
        m(d7Var, t75.a(b));
    }

    public final void v(com.yandex.passport.common.core.f fVar, String str, String str2, x xVar) {
        fVar.getClass();
        e7 e7Var = e7.d;
        n8g b = t75.b();
        b.add(new ff(fVar));
        b.add(new com.yandex.passport.internal.report.f(hrg.l(' ', str, str2), 0, false));
        if (xVar != null) {
            b.add(new com.yandex.passport.internal.report.f(xVar.a, 2, false));
        }
        m(e7Var, t75.a(b));
    }

    public final void w(com.yandex.passport.common.core.f fVar, x xVar) {
        g7 g7Var = g7.d;
        n8g b = t75.b();
        if (fVar != null) {
            b.add(new ff(fVar));
        }
        if (xVar != null) {
            b.add(new com.yandex.passport.internal.report.f(xVar.a, 2, false));
        }
        m(g7Var, t75.a(b));
    }

    public final void x(com.yandex.passport.common.core.f fVar, y yVar, Throwable th) {
        n8g b = t75.b();
        if (fVar != null) {
            b.add(new ff(fVar));
        }
        if (th != null) {
            b.add(new ff(th));
        }
        int ordinal = yVar.ordinal();
        if (ordinal == 0) {
            b.add(new com.yandex.passport.internal.report.a("success", 29, false));
        } else if (ordinal == 1) {
            b.add(new com.yandex.passport.internal.report.a(UgcLiveVideoData$UgcLiveStatus.CANCELLED, 29, false));
        } else if (ordinal != 2) {
            b6e.s();
            return;
        } else {
            b.add(new com.yandex.passport.internal.report.a("error", 29, false));
        }
        m(b7.d, t75.a(b));
    }

    public final void y(com.yandex.passport.common.core.f fVar, x xVar) {
        c7 c7Var = c7.d;
        n8g b = t75.b();
        if (fVar != null) {
            b.add(new ff(fVar));
        }
        if (xVar != null) {
            b.add(new com.yandex.passport.internal.report.f(xVar.a, 2, false));
        }
        m(c7Var, t75.a(b));
    }
}
