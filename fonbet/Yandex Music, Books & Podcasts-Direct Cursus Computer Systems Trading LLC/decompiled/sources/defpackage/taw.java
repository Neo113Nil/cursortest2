package defpackage;

import java.util.ArrayList;
import java.util.Calendar;
import kotlin.coroutines.Continuation;
import ru.yandex.video.m3.data.Decoder;
import ru.yandex.video.m3.data.DrmType;
import ru.yandex.video.m3.data.PlaybackStats;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.VideoType;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.data.dto.OttVideoData;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.player.utils.network.NetworkType;

/* loaded from: classes6.dex */
public final class taw implements lzi {
    public final Calendar a = Calendar.getInstance();
    public final xdr b;
    public final xdr c;
    public final xdr d;
    public final xdr e;
    public final xdr f;
    public final xdr g;
    public final xdr h;
    public final xdr i;
    public final xdr j;
    public final xdr k;
    public final xdr l;
    public final xdr m;
    public final xdr n;
    public final xdr o;
    public final xdr p;
    public final xdr q;
    public final xdr r;
    public final ArrayList s;
    public final ArrayList t;
    public final ArrayList u;
    public final /* synthetic */ iz7 v;

    public taw(iz7 iz7Var) {
        this.v = iz7Var;
        xdr a = ydr.a(null);
        this.b = a;
        xdr a2 = ydr.a(null);
        this.c = a2;
        xdr a3 = ydr.a(null);
        this.d = a3;
        xdr a4 = ydr.a(null);
        this.e = a4;
        xdr a5 = ydr.a(null);
        this.f = a5;
        xdr a6 = ydr.a(null);
        this.g = a6;
        xdr a7 = ydr.a(null);
        this.h = a7;
        xdr a8 = ydr.a(null);
        this.i = a8;
        xdr a9 = ydr.a(0);
        this.j = a9;
        xdr a10 = ydr.a(null);
        this.k = a10;
        xdr a11 = ydr.a(null);
        this.l = a11;
        xdr a12 = ydr.a(null);
        this.m = a12;
        xdr a13 = ydr.a(null);
        this.n = a13;
        xdr a14 = ydr.a(null);
        this.o = a14;
        xdr a15 = ydr.a(null);
        this.p = a15;
        xdr a16 = ydr.a(null);
        this.q = a16;
        xdr a17 = ydr.a(null);
        this.r = a17;
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = new ArrayList();
        Continuation continuation = null;
        iz7Var.f = zsd.r0((tf6) iz7Var.a, new ub7(12, zsd.R(zsd.Q(a, a3, a2, new kdd(4, 4, continuation)), zsd.R(a4, a5, a6, a15, a16, new oia(1, continuation)), zsd.R(a7, a8, a9, a14, a17, new saw(null)), zsd.P(a10, a11, a12, a13, new tnv(5, 1, continuation)), new eno(new wzv(this, iz7Var, continuation, 5)), new raw(iz7Var, this, null)), new j9w(iz7Var, continuation, 3)));
        b();
    }

    @Override // defpackage.lzi
    public final void a(NetworkType networkType) {
        networkType.getClass();
        this.r.l(networkType.getNetworkTypeName());
    }

    public final void b() {
        iz7 iz7Var = this.v;
        jr5 jr5Var = (jr5) iz7Var.k;
        paw pawVar = (paw) iz7Var.e;
        if (pawVar != null) {
            VideoType B = pawVar.B();
            StreamType m = pawVar.m();
            if (B != null && m != null) {
                jr5Var.s(B, m);
            }
            nqs f = pawVar.f();
            nqs C = pawVar.C();
            nqs x = pawVar.x();
            if (f != null && C != null && x != null) {
                ((kr5) iz7Var.j).o(f, C, x);
            }
            PlaybackStats j = pawVar.j();
            if (j != null) {
                DrmType drmType = j.getDrmType();
                if (drmType != null) {
                    jr5Var.getClass();
                    jr5Var.d.y(drmType);
                }
                Decoder videoDecoder = j.getVideoDecoder();
                if (videoDecoder != null) {
                    jg7 jg7Var = new jg7(videoDecoder.getName(), videoDecoder.getInits(), videoDecoder.getReuses(), videoDecoder.getReleases(), videoDecoder.getIsHardwareAccelerated());
                    xdr xdrVar = this.p;
                    xdrVar.getClass();
                    xdrVar.m(null, jg7Var);
                }
                Decoder audioDecoder = j.getAudioDecoder();
                if (audioDecoder != null) {
                    jg7 jg7Var2 = new jg7(audioDecoder.getName(), audioDecoder.getInits(), audioDecoder.getReuses(), audioDecoder.getReleases(), audioDecoder.getIsHardwareAccelerated());
                    xdr xdrVar2 = this.q;
                    xdrVar2.getClass();
                    xdrVar2.m(null, jg7Var2);
                }
                Size surfaceSize = j.getSurfaceSize();
                if (surfaceSize != null) {
                    mmq mmqVar = new mmq(surfaceSize.getWidth(), surfaceSize.getHeight());
                    xdr xdrVar3 = this.h;
                    xdrVar3.getClass();
                    xdrVar3.m(null, mmqVar);
                }
            }
            VideoData G = pawVar.G();
            if (G != null) {
                boolean z = G instanceof VhVideoData;
                xdr xdrVar4 = this.b;
                if (z) {
                    xdrVar4.l(((VhVideoData) G).getContentId());
                } else if (G instanceof OttVideoData) {
                    xdrVar4.l(((OttVideoData) G).getContentId());
                } else {
                    xdrVar4.l(null);
                }
            }
        }
    }
}
