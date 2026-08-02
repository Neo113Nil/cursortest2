package defpackage;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class g7q {
    public static final /* synthetic */ s9f[] g;
    public final ExoPlayer a;
    public final f7q b;
    public final r2e c;
    public final x0q d;
    public final xdr e;
    public final xdr f;

    static {
        opi opiVar = new opi(g7q.class, "isPreparing", "isPreparing$shared_player()Z", 0);
        ern.a.getClass();
        g = new s9f[]{opiVar};
    }

    public g7q(ExoPlayer exoPlayer, w1f w1fVar) {
        this.a = exoPlayer;
        f7q f7qVar = new f7q(this);
        this.b = f7qVar;
        mal.a();
        exoPlayer.j0(f7qVar);
        ((CopyOnWriteArrayList) w1fVar.c).add(new kzp(7, this));
        this.c = new r2e(this);
        x0q b = y0q.b(1, 0, oi3.b, 2);
        b.a(b(exoPlayer.c()));
        this.d = b;
        this.e = ydr.a(Boolean.valueOf(exoPlayer.g0()));
        this.f = ydr.a(Boolean.valueOf(((AtomicBoolean) w1fVar.b).get()));
    }

    public static final void a(g7q g7qVar, int i) {
        mal.a();
        h5q b = g7qVar.b(i);
        g7qVar.d.a(b);
        StringBuilder sb = new StringBuilder();
        sb.append("updateState() - " + b);
        if (b == h5q.c || b == h5q.d) {
            sb.append("; pos = " + g7qVar.a.J0());
        }
        ssg.a(2, "SharedPlayerStateHolder", sb.toString(), null);
    }

    public final h5q b(int i) {
        if (((Boolean) this.c.getValue(this, g[0])).booleanValue()) {
            return h5q.b;
        }
        if (i == 1) {
            return h5q.a;
        }
        if (i == 2) {
            return h5q.c;
        }
        if (i == 3) {
            return h5q.d;
        }
        if (i == 4) {
            return h5q.e;
        }
        xq0.q("unexpected playbackState from ExoPlayer");
        return null;
    }

    public final void c(boolean z) {
        this.c.setValue(this, g[0], Boolean.valueOf(z));
    }
}
