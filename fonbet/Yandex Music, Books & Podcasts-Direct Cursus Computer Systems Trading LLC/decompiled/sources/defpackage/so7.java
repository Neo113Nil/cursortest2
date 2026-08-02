package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import ru.yandex.video.m3.data.DataSourceParameters;
import ru.yandex.video.m3.data.DelegatePrepareParams;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.model.config.mediasource.LivePlaybackConfig;

/* loaded from: classes6.dex */
public final class so7 implements cwh {
    public final jb7 a;
    public final jb7 b;
    public final h1b c;
    public final ngl d;
    public final xvh e;
    public final tyi f;

    public so7(jb7 jb7Var, jb7 jb7Var2, h1b h1bVar, ngl nglVar, xvh xvhVar, tyi tyiVar) {
        this.a = jb7Var;
        this.b = jb7Var2;
        this.c = h1bVar;
        this.d = nglVar;
        this.e = xvhVar;
        this.f = tyiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cwh
    public final wvh a(hgp hgpVar) {
        Object t7oVar;
        fnh fnhVar;
        boolean z;
        Uri uri;
        boolean z2;
        boolean z3;
        boolean z4;
        wv7 wv7Var;
        String name;
        String str = (String) hgpVar.d;
        final eqb eqbVar = (eqb) hgpVar.b;
        bl2 bl2Var = (bl2) hgpVar.c;
        aw6 aw6Var = (aw6) hgpVar.e;
        ybr ybrVar = (ybr) hgpVar.f;
        ozk ozkVar = (ozk) hgpVar.a;
        DataSourceParameters dataSourceParameters = (DataSourceParameters) hgpVar.g;
        DataSourceParameters dataSourceParameters2 = (DataSourceParameters) hgpVar.h;
        DelegatePrepareParams delegatePrepareParams = (DelegatePrepareParams) hgpVar.i;
        PlaybackParameters playbackParameters = delegatePrepareParams != null ? delegatePrepareParams.getPlaybackParameters() : null;
        boolean P = ozkVar.P();
        yeg yegVar = new yeg();
        yegVar.a = P;
        if (dataSourceParameters == null) {
            dataSourceParameters = new DataSourceParameters(true, false, false, null, null);
        }
        va7 K = this.a.K(dataSourceParameters, playbackParameters);
        if (dataSourceParameters2 == null) {
            dataSourceParameters2 = new DataSourceParameters(true, false, false, null, null);
        }
        va7 K2 = this.b.K(dataSourceParameters2, playbackParameters);
        boolean z5 = K2 instanceof vyi;
        vyi vyiVar = z5 ? (vyi) K2 : null;
        boolean g = vyiVar != null ? vyiVar.g() : false;
        Uri parse = Uri.parse(str);
        int Q = dvt.Q(parse);
        try {
            r7o r7oVar = z7o.b;
            t7oVar = parse.getQueryParameter("vsid");
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar instanceof t7o) {
            t7oVar = null;
        }
        String str2 = (String) t7oVar;
        LivePlaybackConfig livePlaybackConfig = this.e.a;
        dnh dnhVar = new dnh();
        PlaybackParameters playbackParameters2 = playbackParameters;
        dnhVar.a = livePlaybackConfig.getTargetOffsetMs();
        dnhVar.b = livePlaybackConfig.getMinTargetOffsetMs();
        dnhVar.c = livePlaybackConfig.getMaxTargetOffsetMs();
        dnhVar.d = livePlaybackConfig.getMinPlaybackSpeed();
        dnhVar.e = livePlaybackConfig.getMaxPlaybackSpeed();
        fnh fnhVar2 = new fnh(dnhVar);
        final int i = 1;
        boolean z6 = g;
        h1b h1bVar = this.c;
        if (Q == 0) {
            boolean H = ozkVar.H();
            j7k j7kVar = new j7k();
            jtc jtcVar = new jtc(17);
            fnhVar = fnhVar2;
            osh oshVar = new osh(new c43(new nu2(K)));
            String queryParameter = parse.getQueryParameter(jpt.a(13).a);
            r8w r8wVar = K instanceof r8w ? (r8w) K : null;
            z = z6;
            ix6 ix6Var = new ix6(new f0c(j7kVar, jtcVar, str2, queryParameter, ybrVar, r8wVar != null ? r8wVar.a : null, r8wVar != null ? r8wVar.d : null, false), h1bVar, parse, playbackParameters2);
            uri = parse;
            z2 = z5;
            z3 = true;
            z4 = false;
            DashMediaSource$Factory dashMediaSource$Factory = new DashMediaSource$Factory(new w8w(j7kVar, jtcVar, oshVar, K2, aw6Var, this.d, H), new wq3(1, K, bl2Var));
            dashMediaSource$Factory.h = ix6Var;
            final int i2 = 3;
            dashMediaSource$Factory.c = new hra() { // from class: lo7
                @Override // defpackage.hra
                public final gra v(onh onhVar) {
                    switch (i2) {
                        case 0:
                            onhVar.getClass();
                            break;
                        case 1:
                            onhVar.getClass();
                            break;
                        case 2:
                            onhVar.getClass();
                            break;
                        default:
                            onhVar.getClass();
                            break;
                    }
                    return eqbVar;
                }
            };
            dashMediaSource$Factory.e = yegVar;
            wv7Var = new wv7(oshVar, dashMediaSource$Factory, this.f);
        } else if (Q != 1) {
            final int i3 = 2;
            if (Q == 2) {
                HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(K2);
                hlsMediaSource$Factory.e = new g06(h1bVar, parse, str2, ybrVar, playbackParameters2);
                hlsMediaSource$Factory.i = yegVar;
                hlsMediaSource$Factory.h = new hra() { // from class: lo7
                    @Override // defpackage.hra
                    public final gra v(onh onhVar) {
                        switch (i) {
                            case 0:
                                onhVar.getClass();
                                break;
                            case 1:
                                onhVar.getClass();
                                break;
                            case 2:
                                onhVar.getClass();
                                break;
                            default:
                                onhVar.getClass();
                                break;
                        }
                        return eqbVar;
                    }
                };
                hlsMediaSource$Factory.b = new vm7(false);
                fnhVar = fnhVar2;
                z = z6;
                z3 = true;
                z4 = false;
                uri = parse;
                z2 = z5;
                wv7Var = hlsMediaSource$Factory;
            } else {
                if (Q != 4) {
                    xq0.q(k5r.i(Q, "Unsupported type: "));
                    return null;
                }
                wvm wvmVar = new wvm(K2);
                wvmVar.d = yegVar;
                wvmVar.c = new hra() { // from class: lo7
                    @Override // defpackage.hra
                    public final gra v(onh onhVar) {
                        switch (i3) {
                            case 0:
                                onhVar.getClass();
                                break;
                            case 1:
                                onhVar.getClass();
                                break;
                            case 2:
                                onhVar.getClass();
                                break;
                            default:
                                onhVar.getClass();
                                break;
                        }
                        return eqbVar;
                    }
                };
                fnhVar = fnhVar2;
                z3 = true;
                z = z6;
                uri = parse;
                z2 = z5;
                z4 = false;
                wv7Var = wvmVar;
            }
        } else {
            final int i4 = 0;
            SsMediaSource$Factory ssMediaSource$Factory = new SsMediaSource$Factory(new r0o(K2), K);
            ssMediaSource$Factory.g = new ix6(new f4m(14), h1bVar, parse, playbackParameters2);
            ssMediaSource$Factory.e = yegVar;
            ssMediaSource$Factory.d = new hra() { // from class: lo7
                @Override // defpackage.hra
                public final gra v(onh onhVar) {
                    switch (i4) {
                        case 0:
                            onhVar.getClass();
                            break;
                        case 1:
                            onhVar.getClass();
                            break;
                        case 2:
                            onhVar.getClass();
                            break;
                        default:
                            onhVar.getClass();
                            break;
                    }
                    return eqbVar;
                }
            };
            fnhVar = fnhVar2;
            wv7Var = ssMediaSource$Factory;
            z3 = true;
            z4 = false;
            uri = parse;
            z2 = z5;
            z = z6;
        }
        xmh xmhVar = new xmh();
        bnh bnhVar = new bnh();
        List list = Collections.EMPTY_LIST;
        qsn qsnVar = qsn.e;
        jnh jnhVar = jnh.d;
        dnh a = fnhVar.a();
        vq1.A((((Uri) bnhVar.e) == null || ((UUID) bnhVar.d) != null) ? z3 : z4);
        wvh d = wv7Var.d(new onh("", new anh(xmhVar), new gnh(uri, null, ((UUID) bnhVar.d) != null ? new cnh(bnhVar) : null, null, list, null, qsnVar, -9223372036854775807L), new fnh(a), hoh.K, jnhVar));
        d.getClass();
        vyi vyiVar2 = z2 ? (vyi) K2 : null;
        if (vyiVar2 == null || (name = vyiVar2.d()) == null) {
            name = K2.getClass().getName();
        }
        return new wyi(z, name, d);
    }
}
