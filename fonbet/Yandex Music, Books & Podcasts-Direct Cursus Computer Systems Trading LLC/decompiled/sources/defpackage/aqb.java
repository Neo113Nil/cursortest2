package defpackage;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import defpackage.gnh;
import defpackage.hra;
import defpackage.ltg;
import defpackage.onh;
import defpackage.tvh;
import defpackage.ujl;
import defpackage.w6t;
import defpackage.wvh;
import defpackage.yio;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import javax.net.SocketFactory;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class aqb implements se9 {
    public static final Throwable m = new Throwable("Attempt to create a player with an empty source");
    public final Context a;
    public List b;
    public final jyr d;
    public boolean g;
    public boolean i;
    public int j;
    public boolean k;
    public final uf2 l;
    public final jyr c = btf.b(new ypb(0, this));
    public final ckj e = new ckj();
    public final Handler f = new Handler(Looper.getMainLooper());
    public final float h = 1.0f;

    public aqb(Context context, List list, xe9 xe9Var, ip3 ip3Var) {
        this.a = context;
        this.b = list;
        this.d = btf.b(new qs6(28, this, ip3Var));
        boolean z = xe9Var.b;
        this.i = z;
        zpb zpbVar = new zpb(this);
        uf2 uf2Var = new uf2(1, this);
        this.l = uf2Var;
        if (this.b.isEmpty()) {
            this.k = true;
        } else {
            i().j0(zpbVar);
            e(z);
            i().w0(xe9Var.c ? 1 : 0);
            i().L(xe9Var.a);
        }
        i().t(this.i ? 0.0f : 1.0f);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(uf2Var);
    }

    @Override // defpackage.se9
    public final void a() {
        i().a();
        Context applicationContext = this.a.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this.l);
    }

    @Override // defpackage.se9
    public final void b() {
        i().b();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        tvh dashMediaSource$Factory;
        tvh tvhVar;
        if (this.b.isEmpty()) {
            return;
        }
        int i = 0;
        d0a d0aVar = null;
        for (d0a d0aVar2 : this.b) {
            zz9 zz9Var = d0aVar2.c;
            if (zz9Var != null) {
                int i2 = zz9Var.a;
                zz9Var.getClass();
                int i3 = i2 * zz9Var.b;
                if (this.j <= i3 && i3 < i) {
                    d0aVar = d0aVar2;
                    i = i3;
                }
            }
        }
        if (d0aVar == null) {
            d0aVar = (d0a) CollectionsKt.Q(this.b);
        }
        if (d0aVar == null) {
            return;
        }
        Uri uri = d0aVar.a;
        xpb xpbVar = (xpb) this.d.getValue();
        String uri2 = uri.toString();
        xpbVar.getClass();
        jyr jyrVar = xpbVar.a;
        int Q = dvt.Q(Uri.parse(uri2));
        if (Q == 0) {
            dashMediaSource$Factory = new DashMediaSource$Factory((va7) jyrVar.getValue());
        } else if (Q == 1) {
            dashMediaSource$Factory = new SsMediaSource$Factory((va7) jyrVar.getValue());
        } else if (Q == 2) {
            dashMediaSource$Factory = new HlsMediaSource$Factory((va7) jyrVar.getValue());
        } else if (Q == 3) {
            dashMediaSource$Factory = new tvh() { // from class: androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory
                public final SocketFactory a = SocketFactory.getDefault();

                @Override // defpackage.tvh
                public final wvh d(onh onhVar) {
                    onhVar.b.getClass();
                    gnh gnhVar = onhVar.b;
                    gnhVar.getClass();
                    String scheme = gnhVar.a.getScheme();
                    return new yio(onhVar, (scheme == null || !ltg.C("rtspt", scheme)) ? new ujl() : new w6t(), this.a);
                }

                @Override // defpackage.tvh
                public final tvh e(hra hraVar) {
                    return this;
                }
            };
        } else {
            if (Q != 4) {
                tvhVar = null;
                if (tvhVar == null) {
                    xmh xmhVar = new xmh();
                    bnh bnhVar = new bnh();
                    List list = Collections.EMPTY_LIST;
                    qsn qsnVar = qsn.e;
                    dnh dnhVar = new dnh();
                    jnh jnhVar = jnh.d;
                    String str = d0aVar.b;
                    vq1.A(((Uri) bnhVar.e) == null || ((UUID) bnhVar.d) != null);
                    i().T0(tvhVar.d(new onh("", new anh(xmhVar), new gnh(uri, str, ((UUID) bnhVar.d) != null ? new cnh(bnhVar) : null, null, list, null, qsnVar, -9223372036854775807L), new fnh(dnhVar), hoh.K, jnhVar)));
                    i().q();
                    return;
                }
                return;
            }
            dashMediaSource$Factory = new wvm((va7) jyrVar.getValue());
        }
        tvhVar = dashMediaSource$Factory;
        if (tvhVar == null) {
        }
    }

    @Override // defpackage.se9
    public final void d() {
        i().d();
    }

    @Override // defpackage.se9
    public final void e(boolean z) {
        if (this.i == z) {
            return;
        }
        i().t(z ? 0.0f : this.h);
        this.i = z;
    }

    @Override // defpackage.se9
    public final void f(re9 re9Var) {
        this.e.a(re9Var);
        if (this.k) {
            this.k = false;
            re9Var.c(m);
        }
    }

    @Override // defpackage.se9
    public final void g(long j) {
        i().s(j);
        ckj ckjVar = this.e;
        ckjVar.getClass();
        akj akjVar = new akj(ckjVar);
        while (akjVar.hasNext()) {
            ((re9) akjVar.next()).b(i().J0());
        }
    }

    @Override // defpackage.se9
    public final void h(List list, xe9 xe9Var) {
        e(xe9Var.b);
        i().w0(xe9Var.c ? 1 : 0);
        i().L(xe9Var.a);
        this.b = list;
        if (!list.isEmpty()) {
            ckj ckjVar = this.e;
            ckjVar.getClass();
            akj akjVar = new akj(ckjVar);
            while (akjVar.hasNext()) {
                ((re9) akjVar.next()).c(m);
            }
        }
        c();
    }

    public final ExoPlayer i() {
        return (ExoPlayer) this.c.getValue();
    }
}
