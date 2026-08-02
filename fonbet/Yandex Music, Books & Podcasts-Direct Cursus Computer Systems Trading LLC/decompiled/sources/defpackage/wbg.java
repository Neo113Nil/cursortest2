package defpackage;

import android.os.Handler;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes6.dex */
public final class wbg implements rgl {
    public final acg a;
    public final Handler b;
    public final qdc c;
    public final String d;

    public wbg(acg acgVar, Handler handler, qdc qdcVar, String str) {
        this.a = acgVar;
        this.b = handler;
        this.c = qdcVar;
        this.d = str;
    }

    @Override // defpackage.rgl
    public final void P(PlaybackException playbackException) {
        dvt.c0(this.b, new juc(13, this, playbackException));
    }

    @Override // defpackage.rgl
    public final void Q(long j) {
        dvt.c0(this.b, new ubg(this, j, 2));
    }

    @Override // defpackage.rgl
    public final void T(VideoData videoData) {
        dvt.c0(this.b, new juc(14, this, videoData));
    }

    @Override // defpackage.rgl
    public final void U() {
        dvt.c0(this.b, new ubg(this, 3));
    }

    @Override // defpackage.rgl
    public final void a() {
        dvt.c0(this.b, new ubg(this, 8));
    }

    @Override // defpackage.rgl
    public final void e() {
        dvt.c0(this.b, new ubg(this, 5));
    }

    @Override // defpackage.rgl
    public final void f() {
        dvt.c0(this.b, new ubg(this, 6));
    }

    @Override // defpackage.rgl
    public final void g0() {
        dvt.c0(this.b, new ubg(this, 4));
    }

    @Override // defpackage.rgl
    public final void q() {
        dvt.c0(this.b, new ubg(this, 1));
    }

    @Override // defpackage.rgl
    public final void t(final long j, final long j2) {
        dvt.c0(this.b, new Runnable() { // from class: vbg
            @Override // java.lang.Runnable
            public final void run() {
                wbg wbgVar = wbg.this;
                qdc qdcVar = wbgVar.c;
                String str = wbgVar.d;
                StringBuilder sb = new StringBuilder();
                imh d = wbgVar.a.d();
                sb.append(d != null ? d.d : null);
                sb.append(" from=");
                sb.append(j2);
                sb.append(" to=");
                sb.append(j);
                qdcVar.H(str, "onSeek", sb.toString(), new Object[0]);
            }
        });
    }

    @Override // defpackage.rgl
    public final void v() {
        dvt.c0(this.b, new ubg(this, 7));
    }

    @Override // defpackage.rgl
    public final void z(long j) {
        dvt.c0(this.b, new ubg(this, j, 0));
    }
}
