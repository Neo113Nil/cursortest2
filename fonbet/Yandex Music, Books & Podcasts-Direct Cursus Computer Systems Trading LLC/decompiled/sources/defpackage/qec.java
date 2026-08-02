package defpackage;

import android.content.ComponentName;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.widget.ScrollView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.music.payment.screen.promocode.viewmodel.a;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.text.c;
import okhttp3.OkHttpClient;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes6.dex */
public final /* synthetic */ class qec implements tqj, v3q, yke, zxk, cb7, wpd, ly1, ika, adu, x7o, udv {
    public final /* synthetic */ int a;
    public final Object b;

    public qec(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = new d7k(10);
                break;
            case 6:
                ydr.a(null);
                this.b = new fle(wke.a, z4b.a, gld.e(a4g.n()));
                break;
            case 22:
                this.b = new rnk(0);
                break;
            default:
                this.b = new xxc(5, 1.0f, false);
                break;
        }
    }

    public static qec U(String str, byte[] bArr) {
        oyj oyjVar;
        gbf t = hbf.t();
        t.d();
        hbf.m((hbf) t.b, str);
        jn3 n = mn3.n(bArr, 0, bArr.length);
        t.d();
        hbf.n((hbf) t.b, n);
        int D = ouj.D(1);
        if (D == 0) {
            oyjVar = oyj.TINK;
        } else if (D == 1) {
            oyjVar = oyj.LEGACY;
        } else if (D == 2) {
            oyjVar = oyj.RAW;
        } else {
            if (D != 3) {
                xq0.x("Unknown output prefix type");
                return null;
            }
            oyjVar = oyj.CRUNCHY;
        }
        t.d();
        hbf.o((hbf) t.b, oyjVar);
        return new qec(7, (hbf) t.b());
    }

    public static final v3g V(fvn fvnVar) {
        boolean z = fvnVar.a;
        if (z) {
            return b0l.b;
        }
        if (!z) {
            return c0l.b;
        }
        b6e.s();
        return null;
    }

    public static final kcr Y(fvn fvnVar) {
        Integer num = fvnVar.c;
        return num != null ? new icr(num.intValue()) : hcr.a;
    }

    @Override // defpackage.v3q
    public Object A(p3q p3qVar) {
        p3qVar.getClass();
        return Boolean.valueOf(a0());
    }

    @Override // defpackage.cb7
    public Object C(Object obj, wa7 wa7Var) {
        return Boolean.valueOf(((xin) obj) instanceof win);
    }

    @Override // defpackage.wpd
    public void D(Object obj) {
        cvl cvlVar = (cvl) obj;
        cvlVar.getClass();
        uy4 uy4Var = ((r5h) this.b).b;
        uy4Var.getClass();
        lwg G = g0g.G(cvlVar);
        y supportFragmentManager = uy4Var.a.getSupportFragmentManager();
        szf.R(supportFragmentManager, vz1.f(supportFragmentManager, G), d.w());
    }

    @Override // defpackage.v3q
    public Object E(e5q e5qVar) {
        boolean a0;
        e5qVar.getClass();
        int ordinal = hdg.W(e5qVar).ordinal();
        if (ordinal == 0) {
            a0 = a0();
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            a0 = a0();
        }
        return Boolean.valueOf(a0);
    }

    @Override // defpackage.v3q
    public Object H(l3q l3qVar) {
        l3qVar.getClass();
        return Boolean.valueOf(a0());
    }

    @Override // defpackage.ly1
    public void I(long j) {
        xiu xiuVar = ((jih) this.b).k1;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new ey1(xiuVar, j));
        }
    }

    @Override // defpackage.wpd
    public void J(Object obj) {
        cvl cvlVar = (cvl) obj;
        cvlVar.getClass();
        uy4 uy4Var = ((r5h) this.b).b;
        uy4Var.getClass();
        t tVar = uy4Var.a;
        tVar.startActivity(ixf.E(tVar, cvlVar, d.t()));
    }

    @Override // defpackage.v3q
    public Object K(j3q j3qVar) {
        j3qVar.getClass();
        return Boolean.valueOf(a0());
    }

    @Override // defpackage.cb7
    public Object M(cg6 cg6Var) {
        j6e j6eVar = (j6e) this.b;
        try {
            ((y9w) ((uiq) j6eVar.a).b).getClass();
            return new win((byte[]) x97.D(g.a, new jmd((OkHttpClient) j6eVar.b, null, 19)), null);
        } catch (Exception e) {
            String message = e.getMessage();
            return (message == null || !c.v(message, "InputStream exceeded maximum size", false)) ? new tin(e) : uin.a;
        }
    }

    @Override // defpackage.cb7
    public Object N(Object obj, cg6 cg6Var) {
        return Unit.a;
    }

    @Override // defpackage.v3q
    public Object O(z3q z3qVar) {
        boolean a0;
        z3qVar.getClass();
        if (z3qVar instanceof c1q) {
            a0 = a0();
        } else if (z3qVar instanceof e1q) {
            a0 = a0();
        } else if (z3qVar instanceof h1q) {
            a0 = a0();
        } else if (z3qVar instanceof k1q) {
            a0 = a0();
        } else if (z3qVar instanceof r1q) {
            a0 = a0();
        } else if (z3qVar instanceof u1q) {
            a0 = a0();
        } else {
            if (!(z3qVar instanceof a2q)) {
                b6e.s();
                return null;
            }
            a0 = a0();
        }
        return Boolean.valueOf(a0);
    }

    @Override // defpackage.v3q
    public Object P(f5q f5qVar) {
        boolean a0;
        f5qVar.getClass();
        if (f5qVar instanceof s9q) {
            a0 = a0();
        } else if (f5qVar instanceof bbq) {
            int ordinal = avf.J((bbq) f5qVar).ordinal();
            if (ordinal == 0) {
                a0 = a0();
            } else {
                if (ordinal != 1) {
                    b6e.s();
                    return null;
                }
                a0 = a0();
            }
        } else if (f5qVar instanceof taq) {
            a0 = a0();
        } else if (f5qVar instanceof baq) {
            a0 = a0();
        } else {
            if (!(f5qVar instanceof oaq)) {
                b6e.s();
                return null;
            }
            a0 = a0();
        }
        return Boolean.valueOf(a0);
    }

    @Override // defpackage.ly1
    public void Q(int i, long j, long j2) {
        xiu xiuVar = ((jih) this.b).k1;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new zx1(xiuVar, i, j, j2, 0));
        }
    }

    @Override // defpackage.cb7
    public ya7 S(qec qecVar) {
        return new ya7(this, qecVar);
    }

    @Override // defpackage.ly1
    public void T() {
        ((jih) this.b).y();
    }

    @Override // defpackage.ly1
    public void W() {
        ((jih) this.b).t1 = true;
    }

    @Override // defpackage.ly1
    public void X() {
        zrb zrbVar = ((jih) this.b).G;
        if (zrbVar != null) {
            zrbVar.a();
        }
    }

    @Override // defpackage.yke
    public pjc a(jx7 jx7Var) {
        jx7Var.getClass();
        return new fs(15, null);
    }

    public boolean a0() {
        yxc yxcVar = (yxc) this.b;
        return yxcVar != null && yxcVar.h;
    }

    @Override // defpackage.udv
    public void b(String str) {
        ((a) this.b).K(str);
    }

    public void b0(s2i s2iVar, byte[] bArr) {
        jkk.c();
        try {
            String str = "/" + ((io.grpc.okhttp.a) this.b).h.b;
            if (bArr != null) {
                ((io.grpc.okhttp.a) this.b).o = true;
                str = str + "?" + ar2.c.c(bArr);
            }
            synchronized (((io.grpc.okhttp.a) this.b).l.v) {
                koj.a(((io.grpc.okhttp.a) this.b).l, s2iVar, str);
            }
            jkk.a.getClass();
        } catch (Throwable th) {
            try {
                jkk.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.zxk
    /* renamed from: c */
    public void mo3c(foc focVar) {
        focVar.getClass();
    }

    @Override // defpackage.ika
    public void cancel() {
        ((ika) this.b).cancel();
    }

    @Override // defpackage.udv
    public void d(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        ((a) this.b).H(webResourceRequest, webResourceError);
    }

    @Override // defpackage.ly1
    public void e(boolean z) {
        xiu xiuVar = ((jih) this.b).k1;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new dy1(xiuVar, z, 0));
        }
    }

    @Override // defpackage.ly1
    public void f(Exception exc) {
        vq1.L("MediaCodecAudioRenderer", "Audio sink error", exc);
        xiu xiuVar = ((jih) this.b).k1;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new by1(xiuVar, exc, 0));
        }
    }

    @Override // defpackage.zxk
    /* renamed from: g */
    public void mo4g(faq faqVar) {
        t3g t3gVar = (t3g) this.b;
        faqVar.getClass();
        if (faqVar instanceof naq) {
            t3gVar.b(((naq) faqVar).e);
            return;
        }
        if (faqVar instanceof saq) {
            x1u x1uVar = ((saq) faqVar).e;
            x1uVar.getClass();
            x97.y(t3gVar.a, null, null, new e3g(t3gVar, x1uVar, null, 0), 3);
            return;
        }
        if (!(faqVar instanceof daq)) {
            if (faqVar instanceof qaq) {
                return;
            }
            b6e.s();
            return;
        }
        f4d f4dVar = (f4d) t3gVar.f.getValue();
        e5d e5dVar = ((daq) faqVar).e;
        f4dVar.getClass();
        e5dVar.getClass();
        j1g j1gVar = j1g.c;
        f4dVar.b(e5dVar, j1gVar);
        f4dVar.c(e5dVar, j1gVar);
    }

    @Override // defpackage.zxk
    /* renamed from: h */
    public void mo5h(jzs jzsVar) {
        jzsVar.getClass();
        ((t3g) this.b).b(jzsVar.a);
    }

    @Override // defpackage.zxk
    /* renamed from: i */
    public void mo6i(m1q m1qVar) {
        t3g t3gVar = (t3g) this.b;
        m1qVar.getClass();
        if (!(m1qVar instanceof j1q)) {
            if (m1qVar instanceof c2q) {
                t3gVar.b(((c2q) m1qVar).d);
                return;
            } else {
                if (m1qVar instanceof e2q) {
                    return;
                }
                b6e.s();
                return;
            }
        }
        f4d f4dVar = (f4d) t3gVar.f.getValue();
        e5d e5dVar = ((j1q) m1qVar).d;
        f4dVar.getClass();
        e5dVar.getClass();
        j1g j1gVar = j1g.c;
        f4dVar.b(e5dVar, j1gVar);
        f4dVar.c(e5dVar, j1gVar);
    }

    @Override // defpackage.zxk
    /* renamed from: j */
    public void mo7j(i5u i5uVar) {
        i5uVar.getClass();
        t3g t3gVar = (t3g) this.b;
        x1u x1uVar = i5uVar.a;
        x1uVar.getClass();
        x97.y(t3gVar.a, null, null, new e3g(t3gVar, x1uVar, null, 0), 3);
    }

    @Override // defpackage.zxk
    /* renamed from: k */
    public void mo8k(k4d k4dVar) {
        k4dVar.getClass();
        f4d f4dVar = (f4d) ((t3g) this.b).f.getValue();
        e5d e5dVar = k4dVar.a;
        f4dVar.getClass();
        e5dVar.getClass();
        j1g j1gVar = j1g.c;
        f4dVar.b(e5dVar, j1gVar);
        f4dVar.c(e5dVar, j1gVar);
    }

    @Override // defpackage.udv
    public void l(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        ((a) this.b).J(webResourceRequest, webResourceResponse);
    }

    @Override // defpackage.yke
    public fle m() {
        return (fle) this.b;
    }

    @Override // defpackage.ly1
    public void n() {
        ((jih) this.b).v1 = true;
    }

    @Override // defpackage.tqj
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                ((oec) this.b).invoke(obj);
                break;
            default:
                ((fg3) obj).getClass();
                lpm lpmVar = (lpm) this.b;
                j8o j8oVar = lpmVar.q;
                voi voiVar = lpmVar.t;
                boolean z = j8oVar.c || j8oVar.d();
                voi voiVar2 = lpmVar.r;
                hpm hpmVar = hpm.a;
                if (!z) {
                    voiVar2.l(new fpm(false));
                    voiVar.l(hpmVar);
                    lpmVar.o.postDelayed(new dsd(22, lpmVar), 1500L);
                    break;
                } else {
                    voiVar2.l(cpm.a);
                    voiVar.l(hpmVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.v3q
    public Object p(x3q x3qVar) {
        x3qVar.getClass();
        return Boolean.valueOf(a0());
    }

    @Override // defpackage.ly1
    public void q() {
        zrb zrbVar = ((jih) this.b).G;
        if (zrbVar != null) {
            zrbVar.a.Y = true;
        }
    }

    @Override // defpackage.ly1
    public void r(z9 z9Var) {
        xiu xiuVar = ((jih) this.b).k1;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new ay1(xiuVar, z9Var, 0));
        }
    }

    @Override // defpackage.ika
    public void remove() {
        ((ika) this.b).remove();
    }

    @Override // defpackage.ly1
    public void s(z9 z9Var) {
        xiu xiuVar = ((jih) this.b).k1;
        Handler handler = (Handler) xiuVar.b;
        if (handler != null) {
            handler.post(new ay1(xiuVar, z9Var, 1));
        }
    }

    @Override // defpackage.ika
    public void t(hka hkaVar) {
        try {
            ((ika) this.b).t(hkaVar);
        } catch (NullPointerException e) {
            Assertions.throwOrSkip$default(new FailedAssertionException("NullPointerException in downloader", e), null, 2, null);
            throw new IOException(e);
        }
    }

    public String toString() {
        switch (this.a) {
            case 14:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.udv
    public void u(SslError sslError, SslErrorHandler sslErrorHandler, hav havVar) {
        sslError.getClass();
        sslErrorHandler.getClass();
        a aVar = (a) this.b;
        aVar.getClass();
        aVar.m.a(sslError, sslErrorHandler, new cte(18, havVar, aVar, sslError));
    }

    @Override // defpackage.v3q
    public Object v(m3q m3qVar) {
        m3qVar.getClass();
        return Boolean.valueOf(a0());
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        lpm lpmVar = (lpm) this.b;
        j8o j8oVar = lpmVar.q;
        voi voiVar = lpmVar.t;
        boolean d = j8oVar.d();
        voi voiVar2 = lpmVar.r;
        hpm hpmVar = hpm.a;
        if (d) {
            voiVar2.l(cpm.a);
            voiVar.l(hpmVar);
        } else {
            voiVar2.l(new bpm(false, bfkVar));
            voiVar.l(hpmVar);
            lpmVar.o.postDelayed(new dsd(22, lpmVar), 1500L);
        }
    }

    @Override // defpackage.v3q
    public Object y(y3q y3qVar) {
        y3qVar.getClass();
        return Boolean.valueOf(a0());
    }

    @Override // defpackage.v3q
    public Object z(m4q m4qVar) {
        m4qVar.getClass();
        return Boolean.valueOf(a0());
    }

    public qec(g0l g0lVar) {
        this.a = 23;
        g0lVar.getClass();
        this.b = g0lVar;
    }

    public qec(ScrollView scrollView, ScrollView scrollView2) {
        this.a = 21;
        this.b = scrollView2;
    }

    public /* synthetic */ qec(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
