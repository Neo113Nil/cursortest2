package defpackage;

import android.content.SharedPreferences;
import android.net.Uri;
import androidx.fragment.app.t;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.api.commands.SeekToFractionCommand;
import com.yandex.music.shared.playback.api.commands.SeekToPositionCommand;
import com.yandex.music.shared.playback.api.commands.SetPlaybackSpeedCommand;
import com.yandex.music.shared.playback.utils.api.commands.SeekBackwardNonMusicContentCommand;
import com.yandex.music.shared.playback.utils.api.commands.SeekForwardNonMusicContentCommand;
import com.yandex.passport.common.mvi.g;
import com.yandex.passport.common.mvi.h;
import com.yandex.pulse.metrics.o;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class o57 extends ezc implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o57(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        mqs a;
        mqs a2;
        olb olbVar;
        dyk dykVar;
        olb olbVar2;
        mqs a3;
        rar rarVar;
        switch (this.a) {
            case 0:
                ((y57) this.receiver).M(((Number) obj).intValue());
                break;
            case 1:
                ((gc8) this.receiver).I((Throwable) obj);
                break;
            case 2:
                obj.getClass();
                xr7 xr7Var = (xr7) this.receiver;
                if (xr7Var.f.b != null) {
                    h hVar = xr7Var.b;
                    hVar.getClass();
                    x97.y(hVar.b, null, null, new g(hVar, obj, null, 1), 3);
                }
                break;
            case 3:
                obj.getClass();
                xr7 xr7Var2 = (xr7) this.receiver;
                if (xr7Var2.f.b != null) {
                    h hVar2 = xr7Var2.b;
                    hVar2.getClass();
                    x97.y(hVar2.b, null, null, new g(hVar2, obj, null, 0), 3);
                }
                break;
            case 4:
                vbc vbcVar = (vbc) obj;
                vbcVar.getClass();
                ida idaVar = (ida) this.receiver;
                idaVar.getClass();
                x97.y(ot0.F(idaVar), null, null, new f98(idaVar, vbcVar, (Continuation) null, 9), 3);
                break;
            case 5:
                vbc vbcVar2 = (vbc) obj;
                vbcVar2.getClass();
                aea aeaVar = (aea) this.receiver;
                aeaVar.getClass();
                x97.y(ot0.F(aeaVar), null, null, new f98(aeaVar, vbcVar2, (Continuation) null, 11), 3);
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                vbc vbcVar3 = (vbc) obj;
                vbcVar3.getClass();
                gha ghaVar = (gha) this.receiver;
                ghaVar.getClass();
                x97.y(ot0.F(ghaVar), null, null, new fha(ghaVar, vbcVar3, null, 1), 3);
                break;
            case 9:
                vbc vbcVar4 = (vbc) obj;
                vbcVar4.getClass();
                gha ghaVar2 = (gha) this.receiver;
                ghaVar2.getClass();
                x97.y(ot0.F(ghaVar2), null, null, new fha(ghaVar2, vbcVar4, null, 0), 3);
                break;
            case 10:
                break;
            case 11:
                gn0 gn0Var = (gn0) obj;
                gn0Var.getClass();
                asa asaVar = (asa) this.receiver;
                asaVar.getClass();
                asaVar.d.add(gn0Var);
                break;
            case 12:
                vbc vbcVar5 = (vbc) obj;
                vbcVar5.getClass();
                leb lebVar = (leb) this.receiver;
                lebVar.getClass();
                x97.y(ot0.F(lebVar), null, null, new f98(lebVar, vbcVar5, (Continuation) null, 22), 3);
                break;
            case 13:
                yur yurVar = (yur) obj;
                yurVar.getClass();
                ((kub) this.receiver).f(yurVar);
                break;
            case 14:
                v84 v84Var = (v84) obj;
                v84Var.getClass();
                kub kubVar = (kub) this.receiver;
                kubVar.getClass();
                nwh nwhVar = kubVar.b.C;
                nwhVar.getClass();
                nwhVar.c(olb.PultWindow);
                break;
            case 15:
                Uri uri = (Uri) obj;
                uri.getClass();
                kub kubVar2 = (kub) this.receiver;
                kubVar2.getClass();
                a9l a9lVar = kubVar2.c;
                a9lVar.getClass();
                t tVar = a9lVar.a;
                String uri2 = uri.toString();
                uri2.getClass();
                w1g.y(tVar, uri2, true);
                break;
            case 16:
                yur yurVar2 = (yur) obj;
                yurVar2.getClass();
                ((kub) this.receiver).f(yurVar2);
                break;
            case 17:
                yi6 yi6Var = (yi6) obj;
                yi6Var.getClass();
                kub kubVar3 = (kub) this.receiver;
                grl grlVar = kubVar3.b;
                int ordinal = yi6Var.ordinal();
                if (ordinal == 0) {
                    grlVar.L(false);
                } else if (ordinal != 1) {
                    b6e.s();
                    break;
                } else {
                    grlVar.p.a(SeekBackwardNonMusicContentCommand.INSTANCE, new b3t("core_seek"));
                    nwh nwhVar2 = grlVar.C;
                    nwhVar2.getClass();
                    nwhVar2.c(olb.SeekBackPodcast);
                }
                kubVar3.g();
                break;
            case 18:
                yi6 yi6Var2 = (yi6) obj;
                yi6Var2.getClass();
                kub kubVar4 = (kub) this.receiver;
                grl grlVar2 = kubVar4.b;
                int ordinal2 = yi6Var2.ordinal();
                if (ordinal2 == 0) {
                    grlVar2.M(false);
                } else if (ordinal2 != 1) {
                    b6e.s();
                    break;
                } else {
                    grlVar2.p.a(SeekForwardNonMusicContentCommand.INSTANCE, new b3t("core_seek"));
                    nwh nwhVar3 = grlVar2.C;
                    nwhVar3.getClass();
                    nwhVar3.c(olb.SeekForwardPodcast);
                }
                kubVar4.g();
                break;
            case 19:
                zug zugVar = (zug) obj;
                zugVar.getClass();
                kub kubVar5 = (kub) this.receiver;
                kubVar5.getClass();
                grl grlVar3 = kubVar5.b;
                grlVar3.getClass();
                mwk G = grlVar3.G();
                Continuation continuation = null;
                if (G != null && (a = G.a()) != null) {
                    grlVar3.r.getClass();
                    if (!a4g.D(gys.UseSeekButtons, a)) {
                        ime imeVar = grlVar3.v;
                        h2l h2lVar = h2l.b;
                        imeVar.getClass();
                        x97.y((cq4) imeVar.c, null, null, new rlg(imeVar, zugVar, h2lVar, continuation, 27), 3);
                        nwh nwhVar4 = grlVar3.C;
                        nwhVar4.getClass();
                        nwhVar4.c(olb.SeekBack);
                    }
                }
                int ordinal3 = zugVar.ordinal();
                if (ordinal3 == 0) {
                    rar rarVar2 = kubVar5.p;
                    if (rarVar2 != null) {
                        rarVar2.g(null);
                    }
                } else if (ordinal3 != 1) {
                    b6e.s();
                    break;
                } else {
                    kubVar5.g();
                }
                break;
            case 20:
                zug zugVar2 = (zug) obj;
                zugVar2.getClass();
                kub kubVar6 = (kub) this.receiver;
                kubVar6.getClass();
                grl grlVar4 = kubVar6.b;
                grlVar4.getClass();
                mwk G2 = grlVar4.G();
                Continuation continuation2 = null;
                if (G2 != null && (a2 = G2.a()) != null) {
                    grlVar4.r.getClass();
                    if (!a4g.D(gys.UseSeekButtons, a2)) {
                        ime imeVar2 = grlVar4.v;
                        h2l h2lVar2 = h2l.a;
                        imeVar2.getClass();
                        x97.y((cq4) imeVar2.c, null, null, new rlg(imeVar2, zugVar2, h2lVar2, continuation2, 27), 3);
                        nwh nwhVar5 = grlVar4.C;
                        nwhVar5.getClass();
                        nwhVar5.c(olb.SeekForward);
                    }
                }
                int ordinal4 = zugVar2.ordinal();
                if (ordinal4 == 0) {
                    rar rarVar3 = kubVar6.p;
                    if (rarVar3 != null) {
                        rarVar3.g(null);
                    }
                } else if (ordinal4 != 1) {
                    b6e.s();
                    break;
                } else {
                    kubVar6.g();
                }
                break;
            case 21:
                yur yurVar3 = (yur) obj;
                yurVar3.getClass();
                ((kub) this.receiver).f(yurVar3);
                break;
            case 22:
                float floatValue = ((Number) obj).floatValue();
                kub kubVar7 = (kub) this.receiver;
                grl grlVar5 = kubVar7.b;
                grlVar5.p.a(new SeekToFractionCommand(floatValue), new b3t("core_seek"));
                nwh nwhVar6 = grlVar5.C;
                nwhVar6.getClass();
                nwhVar6.c(olb.SeekBarTouch);
                kubVar7.g();
                xdr xdrVar = kubVar7.m;
                Object value = xdrVar.getValue();
                s3h s3hVar = value instanceof s3h ? (s3h) value : null;
                if (s3hVar != null) {
                    xdrVar.m(null, s3h.a(s3hVar, a3h.b, false, 5));
                }
                break;
            case 23:
                nyn nynVar = (nyn) obj;
                nynVar.getClass();
                kub kubVar8 = (kub) this.receiver;
                kubVar8.getClass();
                grl grlVar6 = kubVar8.b;
                grlVar6.getClass();
                d6l x = p6g.x((e6l) grlVar6.o.a.c.getValue());
                Continuation continuation3 = null;
                n7q n7qVar = x != null ? x.a : null;
                nyn G3 = bzf.G(nynVar, n7qVar);
                g4q H = grlVar6.H();
                if (H != null) {
                    G3.getClass();
                    dyk dykVar2 = (dyk) zdg.p(H, new zb4(G3));
                    if (dykVar2 != null) {
                        grlVar6.p.a(dykVar2, new b3t("queue_repeat"));
                    }
                }
                n7b n7bVar = grlVar6.t;
                u3q g = n7qVar != null ? n7qVar.g() : null;
                n7bVar.getClass();
                G3.getClass();
                if (g != null && ((Boolean) ocg.k(g, imp.j)).booleanValue()) {
                    ubn ubnVar = (ubn) n7bVar.a;
                    hyn J = t7g.J(G3);
                    SharedPreferences.Editor edit = ubnVar.a.edit();
                    edit.putInt("repeat_mode", J.a);
                    edit.apply();
                }
                x97.y(ot0.F(grlVar6), null, null, new b5l(grlVar6, G3, continuation3, 15), 3);
                nwh nwhVar7 = grlVar6.C;
                nwhVar7.getClass();
                int ordinal5 = G3.ordinal();
                if (ordinal5 == 0) {
                    olbVar = olb.RepeatNone;
                } else if (ordinal5 == 1) {
                    olbVar = olb.RepeatTrack;
                } else if (ordinal5 != 2) {
                    b6e.s();
                    break;
                } else {
                    olbVar = olb.RepeatAll;
                }
                nwhVar7.c(olbVar);
                kubVar8.g();
                break;
            case 24:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                kub kubVar9 = (kub) this.receiver;
                grl grlVar7 = kubVar9.b;
                g4q H2 = grlVar7.H();
                if (H2 != null && (dykVar = (dyk) zdg.p(H2, new ac4(!booleanValue))) != null) {
                    grlVar7.p.a(dykVar, new b3t("queue_shuffle"));
                }
                SharedPreferences.Editor edit2 = ((ubn) grlVar7.t.a).a.edit();
                edit2.putBoolean("is_shuffle", !booleanValue);
                edit2.apply();
                x97.y(ot0.F(grlVar7), null, null, new z11(grlVar7, booleanValue, (Continuation) null, 14), 3);
                nwh nwhVar8 = grlVar7.C;
                nwhVar8.getClass();
                nwhVar8.c(!booleanValue ? olb.Shuffle : olb.Unshuffle);
                kubVar9.g();
                break;
            case 25:
                xgl xglVar = (xgl) obj;
                xglVar.getClass();
                kub kubVar10 = (kub) this.receiver;
                kubVar10.getClass();
                grl grlVar8 = kubVar10.b;
                grlVar8.getClass();
                nwh nwhVar9 = grlVar8.C;
                xgl a4 = xglVar.a();
                nwhVar9.getClass();
                int ordinal6 = a4.ordinal();
                if (ordinal6 == 0) {
                    olbVar2 = olb.Speed1x;
                } else if (ordinal6 == 1) {
                    olbVar2 = olb.Speed125x;
                } else if (ordinal6 == 2) {
                    olbVar2 = olb.Speed15x;
                } else if (ordinal6 != 3) {
                    b6e.s();
                    break;
                } else {
                    olbVar2 = olb.Speed2x;
                }
                nwhVar9.c(olbVar2);
                grlVar8.p.a(new SetPlaybackSpeedCommand(new h4q(xglVar.a().a)), new b3t("core_speed"));
                kubVar10.g();
                break;
            case 26:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                kub kubVar11 = (kub) this.receiver;
                if (((Boolean) kubVar11.f.invoke()).booleanValue()) {
                    v7g.L(kubVar11.c.a, new lik(vik.f, null, null));
                } else {
                    grl grlVar9 = kubVar11.b;
                    t1f t1fVar = grlVar9.s;
                    ((z1h) t1fVar.b).c(!booleanValue2 ? p2h.a : p2h.b);
                    if (!booleanValue2) {
                        ((z1h) t1fVar.b).d();
                    }
                    nwh nwhVar10 = grlVar9.C;
                    nwhVar10.getClass();
                    nwhVar10.c(!booleanValue2 ? olb.SwitchAnimatedTextOn : olb.SwitchAnimatedTextOff);
                    kubVar11.g();
                }
                break;
            case 27:
                ywr ywrVar = (ywr) obj;
                ywrVar.getClass();
                kub kubVar12 = (kub) this.receiver;
                grl grlVar10 = kubVar12.b;
                xdr xdrVar2 = kubVar12.m;
                Object value2 = xdrVar2.getValue();
                s3h s3hVar2 = value2 instanceof s3h ? (s3h) value2 : null;
                if (s3hVar2 != null) {
                    if (s3hVar2.c) {
                        grlVar10.p.a(new SeekToPositionCommand(ywrVar.a), new b3t("core_seek"));
                        boolean z = false;
                        grlVar10.p.a(new PlayCommand(false), new b3t("core_play"));
                        Object value3 = xdrVar2.getValue();
                        s3h s3hVar3 = value3 instanceof s3h ? (s3h) value3 : null;
                        if (s3hVar3 != null) {
                            xdrVar2.m(null, s3h.a(s3hVar3, a3h.b, false, 5));
                        }
                        nwh nwhVar11 = ((p9l) grlVar10.C.i).e;
                        mwk mwkVar = (mwk) nwhVar11.k;
                        if (mwkVar != null && (a3 = mwkVar.a()) != null) {
                            nmb nmbVar = (nmb) nwhVar11.h;
                            String str = a3.a;
                            String str2 = a3.c;
                            boolean o = a3.o();
                            hqs hqsVar = a3.o;
                            if (hqsVar != null && hqsVar.b) {
                                z = true;
                            }
                            boolean booleanValue3 = ((Boolean) ((vdr) nwhVar11.b).getValue()).booleanValue();
                            nmbVar.getClass();
                            str.getClass();
                            str2.getClass();
                            LinkedHashMap m = dfi.m("page_type", "object", "track_id", str);
                            eta.u(m, "track_name", str2, o, "with_videoshot");
                            m.put("with_animated_text", String.valueOf(z));
                            m.put("videoshot_on", String.valueOf(booleanValue3));
                            m.put("animated_text_on", String.valueOf(true));
                            m.put("_meta", nmb.u(1));
                            nmbVar.C("ExpandedPlayer.AnimatedText.Tapped", m);
                        }
                    } else {
                        Object value4 = xdrVar2.getValue();
                        s3h s3hVar4 = value4 instanceof s3h ? (s3h) value4 : null;
                        if (s3hVar4 != null) {
                            xdrVar2.m(null, s3h.a(s3hVar4, null, true, 3));
                        }
                    }
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                loa loaVar = (loa) obj;
                loaVar.getClass();
                kub kubVar13 = (kub) this.receiver;
                kubVar13.getClass();
                boolean z2 = loaVar instanceof joa;
                v3w.n(z2, kubVar13.r, null);
                if (z2 && (rarVar = kubVar13.q) != null) {
                    rarVar.g(null);
                }
                xdr xdrVar3 = kubVar13.m;
                Object value5 = xdrVar3.getValue();
                s3h s3hVar5 = value5 instanceof s3h ? (s3h) value5 : null;
                if (s3hVar5 != null) {
                    xdrVar3.m(null, s3h.a(s3hVar5, a3h.a, true, 1));
                }
                break;
            default:
                yur yurVar4 = (yur) obj;
                yurVar4.getClass();
                ((kub) this.receiver).f(yurVar4);
                break;
        }
        return Unit.a;
    }
}
