package defpackage;

import android.graphics.Matrix;
import android.view.TextureView;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.WeakHashMap;

/* loaded from: classes4.dex */
public final class b7t implements f8l {
    public int a = -1;
    public int b = -1;
    public int c = -1;
    public int d = -1;
    public final /* synthetic */ jd6 e;
    public final /* synthetic */ g40 f;
    public final /* synthetic */ TextureView g;
    public final /* synthetic */ TextureView h;

    public b7t(jd6 jd6Var, g40 g40Var, TextureView textureView, TextureView textureView2) {
        this.e = jd6Var;
        this.f = g40Var;
        this.g = textureView;
        this.h = textureView2;
    }

    public final void c() {
        int i;
        int i2 = this.a;
        if (i2 <= 0 || (i = this.b) <= 0 || this.c <= 0 || this.d <= 0) {
            return;
        }
        long Q = nt0.Q(nt0.p(i2, i));
        long p = nt0.p(this.c, this.d);
        long Q2 = nt0.Q(p);
        ssg.a(3, null, hrg.r("TextureView: videoSize ", nmq.g(Q), " dstSize ", nmq.g(Q2)), null);
        long f = this.e.f(Q, Q2);
        long p2 = nt0.p((int) (sso.a(f) * ((int) (r1 >> 32))), (int) (sso.b(f) * ((int) (r1 & 4294967295L))));
        WeakHashMap weakHashMap = wdu.a;
        long a = this.f.a(p2, p, this.g.getLayoutDirection() == 1 ? xof.b : xof.a);
        float a2 = sso.a(f);
        float b = sso.b(f);
        String e = wpe.e(a);
        StringBuilder sb = new StringBuilder("TextureView: scale x ");
        sb.append(a2);
        sb.append(" scale y ");
        sb.append(b);
        sb.append(" offset ");
        v3w.m(sb, e, 3, null, null);
        float a3 = sso.a(f) / (this.c / this.a);
        float b2 = sso.b(f) / (this.d / this.b);
        Matrix matrix = new Matrix();
        matrix.preScale(a3, b2);
        matrix.postTranslate((int) (a >> 32), (int) (a & 4294967295L));
        this.h.setTransform(matrix);
    }

    @Override // defpackage.f8l
    public final void j(int i, int i2) {
        ssg.a(3, null, f1d.e(i, i2, "TextureView: onSurfaceSizeChanged ", StringUtil.SPACE), null);
        this.c = i;
        this.d = i2;
        c();
    }

    @Override // defpackage.f8l
    public final void k(tcu tcuVar) {
        tcuVar.getClass();
        int i = tcuVar.a;
        int i2 = tcuVar.b;
        float f = tcuVar.c;
        StringBuilder l = dfi.l("TextureView: onVideoSizeChanged ", i, i2, StringUtil.SPACE, StringUtil.SPACE);
        l.append(f);
        ssg.a(3, null, l.toString(), null);
        this.a = tcuVar.a;
        this.b = (int) (i2 * f);
        c();
    }
}
