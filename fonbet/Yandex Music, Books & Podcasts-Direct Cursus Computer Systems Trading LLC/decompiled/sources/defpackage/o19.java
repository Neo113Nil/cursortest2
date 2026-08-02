package defpackage;

import android.net.Uri;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class o19 extends p9 {
    public final a39 b;
    public final qe9 c;
    public final efb d;

    public o19(gp8 gp8Var, a39 a39Var, qe9 qe9Var, efb efbVar) {
        super(gp8Var);
        this.b = a39Var;
        this.c = qe9Var;
        this.d = efbVar;
    }

    public final void G(v19 v19Var, gc8 gc8Var, xzb xzbVar, i19 i19Var, dfb dfbVar) {
        Uri uri = (Uri) i19Var.u.a(xzbVar);
        if (Intrinsics.d(uri, v19Var.getGifUrl$div_release())) {
            return;
        }
        v19Var.q();
        ffg loadReference$div_release = v19Var.getLoadReference$div_release();
        if (loadReference$div_release != null) {
            loadReference$div_release.cancel();
        }
        szb szbVar = i19Var.H;
        String str = szbVar != null ? (String) szbVar.a(xzbVar) : null;
        this.c.a(v19Var, dfbVar, str, ((Number) i19Var.D.a(xzbVar)).intValue(), false, new n19(v19Var, gc8Var, 0), new n19(v19Var, gc8Var, 1));
        szb szbVar2 = i19Var.I;
        Uri uri2 = szbVar2 != null ? (Uri) szbVar2.a(xzbVar) : null;
        a39 a39Var = this.b;
        if (str == null && uri2 != null && !v19Var.o() && (!Intrinsics.d(v19Var.getTag(R.id.image_loaded_flag), Boolean.FALSE) || !Intrinsics.d(v19Var.getPreviewUrl$div_release(), uri2))) {
            v19Var.setPreviewUrl$div_release(uri2);
            String uri3 = uri2.toString();
            ffg loadPreviewReference$div_release = v19Var.getLoadPreviewReference$div_release();
            if (loadPreviewReference$div_release != null) {
                loadPreviewReference$div_release.cancel();
            }
            ffg b = a39Var.b(uri3, new m19(gc8Var, v19Var));
            gc8Var.p(b);
            v19Var.setLoadPreviewReference$div_release(b);
        }
        v19Var.setGifUrl$div_release(uri);
        ffg d = a39Var.d(uri.toString(), new m19(gc8Var, this, v19Var));
        gc8Var.p(d);
        v19Var.setLoadReference$div_release(d);
    }

    @Override // defpackage.p9
    public final void j(View view, e23 e23Var, dp8 dp8Var, dp8 dp8Var2) {
        v19 v19Var = (v19) view;
        i19 i19Var = (i19) dp8Var;
        i19 i19Var2 = (i19) dp8Var2;
        gc8 gc8Var = e23Var.a;
        xzb xzbVar = e23Var.b;
        dfb a = this.d.a(gc8Var.getDivData(), gc8Var.getDataTag());
        bg3.k(v19Var, e23Var, i19Var.b, i19Var.d, i19Var.A, i19Var.q, i19Var.x, i19Var.w, i19Var.G, i19Var.F, i19Var.c, i19Var.l);
        bg3.p(v19Var, i19Var.i, i19Var2 != null ? i19Var2.i : null, xzbVar);
        v19Var.i(i19Var.L.d(xzbVar, new az6(17, v19Var)));
        szb szbVar = i19Var.n;
        szb szbVar2 = i19Var.o;
        v19Var.setGravity(vq1.N((om8) szbVar.a(xzbVar), (pm8) szbVar2.a(xzbVar)));
        ak0 ak0Var = new ak0(this, v19Var, xzbVar, szbVar, szbVar2, 7);
        v19Var.i(szbVar.c(xzbVar, ak0Var));
        v19Var.i(szbVar2.c(xzbVar, ak0Var));
        v19Var.i(i19Var.u.d(xzbVar, new a03(this, v19Var, gc8Var, xzbVar, i19Var, a, 4)));
    }
}
