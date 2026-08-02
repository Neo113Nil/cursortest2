package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.pulse.metrics.o;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ugq implements f14 {
    public final kxi a;
    public final vgq b;
    public final hjl c;
    public final xdr d;
    public final fkn e;

    public ugq(kxi kxiVar, mm6 mm6Var, vgq vgqVar, s14 s14Var) {
        kxiVar.getClass();
        mm6Var.getClass();
        vgqVar.getClass();
        this.a = kxiVar;
        this.b = vgqVar;
        this.c = vgqVar.a;
        this.d = ydr.a(Boolean.FALSE);
        this.e = lg3.u0(new ail(27, vgqVar.f, this), mm6Var, new lgt(vgqVar.e, true));
    }

    @Override // defpackage.f14
    public final xdr a() {
        return this.d;
    }

    public final qkl b(int i) {
        gjl gjlVar;
        yit yitVar;
        thj thjVar;
        Object invoke = this.b.f.b.invoke();
        ahq ahqVar = invoke instanceof ahq ? (ahq) invoke : null;
        if (ahqVar != null && (gjlVar = ahqVar.c) != null && (yitVar = (yit) CollectionsKt.S(ahqVar.b, i)) != null) {
            if (yitVar instanceof o20) {
                thjVar = c3x.w(((o20) yitVar).a, i, 0);
            } else if (yitVar instanceof hm1) {
                thjVar = gld.I(((hm1) yitVar).a, i);
            } else if (yitVar instanceof te4) {
                thjVar = c3x.w(((te4) yitVar).a, i, 0);
            } else if (yitVar instanceof r1g) {
                thjVar = c3x.w(((r1g) yitVar).a, i, 0);
            } else if (yitVar instanceof a2g) {
                thjVar = t7g.m(((a2g) yitVar).a, i);
            } else if (yitVar instanceof fej) {
                thjVar = c3x.w(((fej) yitVar).a, i, 0);
            } else if (yitVar instanceof umk) {
                thjVar = t7g.m(((umk) yitVar).a, i);
            } else if (yitVar instanceof s3m) {
                thjVar = t7g.m(((s3m) yitVar).a, i);
            } else if (yitVar instanceof llu) {
                thjVar = new thj(pkb.Wave, o8g.Q(((llu) yitVar).a.b.a()), i + 1, 1, "");
            } else {
                if (!(yitVar instanceof e6i)) {
                    b6e.s();
                    return null;
                }
                thjVar = null;
            }
            if (thjVar != null) {
                return new qkl(gjlVar, thjVar);
            }
        }
        return null;
    }

    @Override // defpackage.f14
    public final void d(c24 c24Var, int i) {
        wjb wjbVar;
        c24Var.getClass();
        vgq vgqVar = this.b;
        dhq dhqVar = (dhq) vgqVar.f.b.invoke();
        if (dhqVar instanceof ahq) {
            yit yitVar = (yit) CollectionsKt.S(((ahq) dhqVar).b, i);
            qkl b = b(i);
            if (yitVar != null) {
                if (b != null) {
                    thj thjVar = b.b;
                    hjl hjlVar = vgqVar.a;
                    switch (thjVar.a.ordinal()) {
                        case 0:
                            wjbVar = wjb.AudiobookScreen;
                            break;
                        case 1:
                            wjbVar = wjb.AudiobookChapterListScreen;
                            break;
                        case 2:
                            wjbVar = wjb.PodcastScreen;
                            break;
                        case 3:
                            wjbVar = wjb.PodcastEpisodeListScreen;
                            break;
                        case 4:
                            wjbVar = wjb.TrackActionsScreen;
                            break;
                        case 5:
                            wjbVar = wjb.ArtistScreen;
                            break;
                        case 6:
                            wjbVar = wjb.AlbumScreen;
                            break;
                        case 7:
                            wjbVar = wjb.PlaylistScreen;
                            break;
                        case 8:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 17:
                        case 18:
                        case 19:
                        case 21:
                        case 23:
                        case 25:
                        case 26:
                        case 27:
                        case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                        case 29:
                        case 30:
                        case o.LOW_ENTROPY_SOURCE_FIELD_NUMBER /* 31 */:
                        case 32:
                        case 35:
                        case o.IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER /* 36 */:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case o.CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER /* 43 */:
                        case o.LTS_CHANNEL_FIELD_NUMBER /* 45 */:
                        case o.SESSION_HASH_FIELD_NUMBER /* 46 */:
                        case UibcKeyCode.TV_KEYCODE_1 /* 49 */:
                        case 50:
                        case UibcKeyCode.TV_KEYCODE_3 /* 51 */:
                        case UibcKeyCode.TV_KEYCODE_4 /* 52 */:
                        case UibcKeyCode.TV_KEYCODE_5 /* 53 */:
                        case UibcKeyCode.TV_KEYCODE_6 /* 54 */:
                            wjbVar = wjb.Link;
                            break;
                        case 9:
                            wjbVar = wjb.VideoScreen;
                            break;
                        case 15:
                            wjbVar = wjb.ConcertScreen;
                            break;
                        case 16:
                            wjbVar = wjb.ConcertsGridScreen;
                            break;
                        case 20:
                            wjbVar = wjb.AlbumScreen;
                            break;
                        case 22:
                            wjbVar = wjb.TrailerScreen;
                            break;
                        case 24:
                            wjbVar = wjb.MetatagScreen;
                            break;
                        case o.CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER /* 33 */:
                            wjbVar = wjb.StationScreen;
                            break;
                        case o.CLIENT_UUID_FIELD_NUMBER /* 34 */:
                            wjbVar = wjb.ShowScreen;
                            break;
                        case 41:
                        case 42:
                            wjbVar = wjb.SearchScreen;
                            break;
                        case o.METRICS_FILTERING_STATUS_FIELD_NUMBER /* 44 */:
                            wjbVar = wjb.SleepTimerScreen;
                            break;
                        case o.TPM_IDENTIFIER_FIELD_NUMBER /* 47 */:
                        case UibcKeyCode.TV_KEYCODE_0 /* 48 */:
                            wjbVar = wjb.SlidesScreen;
                            break;
                        default:
                            b6e.s();
                            return;
                    }
                    hjl.b(hjlVar, wjbVar, b.a.a, thjVar, 0, 24);
                }
                ((zit) vgqVar.c.b).a(yitVar);
            }
        }
    }

    @Override // defpackage.f14
    public final owu e(dou douVar, mm6 mm6Var, k6l k6lVar, uwu uwuVar, qwu qwuVar, int i, zy7 zy7Var) {
        mm6Var.getClass();
        s9p s9pVar = douVar.b;
        hsl hslVar = new hsl(this, douVar, i, 8);
        dhq dhqVar = (dhq) this.b.f.b.invoke();
        dhqVar.getClass();
        ahq ahqVar = dhqVar instanceof ahq ? (ahq) dhqVar : null;
        rr5 rr5Var = ahqVar != null ? ahqVar.a : null;
        kxi kxiVar = this.a;
        kxiVar.getClass();
        k7h k7hVar = (k7h) s9pVar.b.getValue();
        return (Intrinsics.d(k7hVar != null ? k7hVar.getType() : null, "track") && rr5Var != null && Intrinsics.d(k7hVar.getTag(), rr5Var.a)) ? new swu(rr5Var, kxiVar, hslVar, k6lVar, uwuVar, zy7Var, null, mm6Var) : new twu(mm6Var, kxiVar, k6lVar, null, null, qwuVar, uwuVar, o8g.R(s9pVar), hslVar, null);
    }

    @Override // defpackage.f14
    public final void f(boolean z, aab aabVar, int i, String str) {
        str.getClass();
        qkl b = b(i);
        vgq vgqVar = this.b;
        vgqVar.getClass();
        if (b == null) {
            return;
        }
        hjl hjlVar = vgqVar.a;
        gjl gjlVar = b.a;
        hjlVar.e(z, str, b.b, gjlVar.b, gjlVar.a, gjlVar.c);
    }

    @Override // defpackage.f14
    public final void g(c24 c24Var, int i) {
        c24Var.getClass();
        vgq vgqVar = this.b;
        dhq dhqVar = (dhq) vgqVar.f.b.invoke();
        if (dhqVar instanceof ahq) {
            yit yitVar = (yit) CollectionsKt.S(((ahq) dhqVar).b, i);
            qkl b = b(i);
            if (yitVar != null) {
                if (b != null) {
                    hjl.b(vgqVar.a, wjb.BottomsheetScreen, b.a.a, b.b, 0, 24);
                }
                ((zit) vgqVar.c.b).b(yitVar);
            }
        }
    }

    @Override // defpackage.f14
    public final vdr getState() {
        return this.e;
    }

    @Override // defpackage.f14
    public final void c() {
    }
}
