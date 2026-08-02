package defpackage;

import android.os.Handler;
import androidx.media3.common.a;
import androidx.media3.exoplayer.dash.PlayerEmsgHandler;

/* loaded from: classes10.dex */
public final class syc0 implements g001 {
    public final uyl0 a;
    public final o7s b = new o7s();
    public final d920 c = new d920();
    public long d = -9223372036854775807L;
    public final /* synthetic */ PlayerEmsgHandler e;

    public syc0(PlayerEmsgHandler playerEmsgHandler, au1 au1Var) {
        this.e = playerEmsgHandler;
        this.a = new uyl0(au1Var, null, null);
    }

    @Override // defpackage.g001
    public final void a(ef90 ef90Var, int i, int i2) {
        this.a.a(ef90Var, i, 0);
    }

    @Override // defpackage.g001
    public final int b(apg apgVar, int i, boolean z) {
        return this.a.b(apgVar, i, z);
    }

    @Override // defpackage.g001
    public final void c(long j, int i, int i2, int i3, f001 f001Var) {
        long f;
        ngo ngoVar;
        boolean isPlayerEmsgEvent;
        long manifestPublishTimeMsInEmsg;
        Handler handler;
        Handler handler2;
        this.a.c(j, i, i2, i3, f001Var);
        while (this.a.t(false)) {
            d920 d920Var = this.c;
            d920Var.d();
            if (this.a.y(this.b, d920Var, 0, false) == -4) {
                d920Var.j();
            } else {
                d920Var = null;
            }
            if (d920Var != null) {
                long j2 = d920Var.y;
                ngoVar = this.e.decoder;
                w820 a = ngoVar.a(d920Var);
                if (a != null) {
                    mgo mgoVar = (mgo) a.a[0];
                    isPlayerEmsgEvent = PlayerEmsgHandler.isPlayerEmsgEvent(mgoVar.a, mgoVar.b);
                    if (isPlayerEmsgEvent) {
                        manifestPublishTimeMsInEmsg = PlayerEmsgHandler.getManifestPublishTimeMsInEmsg(mgoVar);
                        if (manifestPublishTimeMsInEmsg != -9223372036854775807L) {
                            qyc0 qyc0Var = new qyc0(j2, manifestPublishTimeMsInEmsg);
                            PlayerEmsgHandler playerEmsgHandler = this.e;
                            handler = playerEmsgHandler.handler;
                            handler2 = playerEmsgHandler.handler;
                            handler.sendMessage(handler2.obtainMessage(1, qyc0Var));
                        }
                    }
                }
            }
        }
        uyl0 uyl0Var = this.a;
        qyl0 qyl0Var = uyl0Var.a;
        synchronized (uyl0Var) {
            int i4 = uyl0Var.s;
            f = i4 == 0 ? -1L : uyl0Var.f(i4);
        }
        qyl0Var.b(f);
    }

    @Override // defpackage.g001
    public final void d(a aVar) {
        this.a.d(aVar);
    }
}
