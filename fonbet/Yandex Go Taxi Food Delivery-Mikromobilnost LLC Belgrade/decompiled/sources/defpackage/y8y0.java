package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.panorama.PanoramaAnalytics$UserInteractAction;
import ru.yandex.taxi.persuggest.source.g;
import ru.yandex.taxi.styling.c;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final class y8y0 extends ad5 {
    public final e A;
    public final tt2 B;
    public final pwy0 C;
    public final zuj0 D;
    public final g E;
    public final i8y0 F;
    public final c G;
    public String H;
    public pzt0 I;
    public final n0 J;
    public final n0 K;
    public final c1x0 x;
    public final s8y0 y;
    public final a8y0 z;

    public y8y0(c1x0 c1x0Var, s8y0 s8y0Var, a8y0 a8y0Var, e eVar, tt2 tt2Var, pwy0 pwy0Var, zuj0 zuj0Var, g gVar, i8y0 i8y0Var, c cVar) {
        super(r8y0.class);
        this.x = c1x0Var;
        this.y = s8y0Var;
        this.z = a8y0Var;
        this.A = eVar;
        this.B = tt2Var;
        this.C = pwy0Var;
        this.D = zuj0Var;
        this.E = gVar;
        this.F = i8y0Var;
        this.G = cVar;
        this.H = "";
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.J = ffx.b(0, 1, bufferOverflow);
        this.K = ffx.b(0, 1, bufferOverflow);
    }

    public final void Kg(String str) {
        s8y0 s8y0Var = this.y;
        this.z.a(str, s8y0Var.b, s8y0Var.c, s8y0Var.a.c);
        ((b9y0) this.x.a).r(new qu(9));
    }

    public final void Lg(PanoramaAnalytics$UserInteractAction panoramaAnalytics$UserInteractAction, String str) {
        int i = v8y0.a[panoramaAnalytics$UserInteractAction.ordinal()];
        if (i == 1) {
            this.K.g(panoramaAnalytics$UserInteractAction);
            return;
        }
        if (i == 2) {
            this.J.g(panoramaAnalytics$UserInteractAction);
            return;
        }
        if (i != 3 && i != 4) {
            w511.b();
            return;
        }
        s8y0 s8y0Var = this.y;
        this.z.e(str, s8y0Var.b, s8y0Var.c, s8y0Var.a.c, panoramaAnalytics$UserInteractAction);
    }
}
