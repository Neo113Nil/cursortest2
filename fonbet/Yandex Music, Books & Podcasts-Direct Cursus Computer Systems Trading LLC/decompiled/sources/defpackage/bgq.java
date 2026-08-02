package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.source.b;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class bgq extends js2 {
    public static final dsc j;
    public static final onh k;
    public static final byte[] l;
    public final long h;
    public onh i;

    static {
        gnh gnhVar;
        bsc bscVar = new bsc();
        bscVar.m = l5i.p("audio/raw");
        bscVar.C = 2;
        bscVar.D = RemoteCameraConfig.Mic.SAMPLING_RATE;
        bscVar.E = 2;
        dsc dscVar = new dsc(bscVar);
        j = dscVar;
        xmh xmhVar = new xmh();
        bnh bnhVar = new bnh();
        List list = Collections.EMPTY_LIST;
        qsn qsnVar = qsn.e;
        dnh dnhVar = new dnh();
        jnh jnhVar = jnh.d;
        Uri uri = Uri.EMPTY;
        vq1.A(((Uri) bnhVar.e) == null || ((UUID) bnhVar.d) != null);
        cnh cnhVar = null;
        if (uri != null) {
            if (((UUID) bnhVar.d) != null) {
                cnhVar = new cnh(bnhVar);
            }
            gnhVar = new gnh(uri, dscVar.n, cnhVar, null, list, null, qsnVar, -9223372036854775807L);
        } else {
            gnhVar = null;
        }
        k = new onh("SilenceMediaSource", new anh(xmhVar), gnhVar, new fnh(dnhVar), hoh.K, jnhVar);
        l = new byte[4096];
    }

    public bgq(long j2) {
        vq1.v(j2 >= 0);
        this.h = j2;
        this.i = k;
    }

    @Override // defpackage.wvh
    public final synchronized onh f() {
        return this.i;
    }

    @Override // defpackage.wvh
    public final synchronized void i(onh onhVar) {
        this.i = onhVar;
    }

    @Override // defpackage.wvh
    public final woh n(uvh uvhVar, zi7 zi7Var, long j2) {
        return new zfq(this.h);
    }

    @Override // defpackage.js2
    public final void x(t6t t6tVar) {
        y(new b(this.h, true, false, f()));
    }

    @Override // defpackage.wvh
    public final void p() {
    }

    @Override // defpackage.js2
    public final void z() {
    }

    @Override // defpackage.wvh
    public final void s(woh wohVar) {
    }
}
