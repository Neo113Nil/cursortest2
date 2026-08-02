package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.common.media.context.Page;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.d;
import ru.yandex.music.common.media.context.h;

/* loaded from: classes3.dex */
public final class uv implements Function0 {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public uv(o5e o5eVar, t5e t5eVar) {
        this.a = 8;
        this.c = o5eVar;
        this.b = t5eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                hab habVar = (hab) obj2;
                String str = ((iab) obj).h;
                return new d85(habVar.a(!(str == null || StringsKt.U(str)), false));
            case 1:
                v40 v40Var = (v40) obj2;
                oq oqVar = ((d9j) obj).a;
                v40Var.getClass();
                oqVar.getClass();
                p40 p40Var = v40Var.c;
                p40Var.getClass();
                h k = d.k();
                t tVar = p40Var.a;
                tVar.startActivity(quj.U(tVar, new uq(oqVar, k.b(oqVar).a(), null, qq.a, 92), k));
                return Unit.a;
            case 2:
                ((Function1) obj2).invoke((b81) obj);
                return Unit.a;
            case 3:
                bp1 bp1Var = (bp1) obj2;
                so1 so1Var = (so1) obj;
                bp1Var.getClass();
                so1Var.getClass();
                uo1 uo1Var = bp1Var.b;
                u51 u51Var = so1Var.a;
                uo1Var.getClass();
                nmb nmbVar = uo1Var.c;
                String G = uo1Var.a.G();
                wjb wjbVar = wjb.ArtistScreen;
                wjb wjbVar2 = uo1.e;
                String str2 = u51Var.a;
                pkb pkbVar = pkb.Artist;
                String str3 = (String) uo1Var.d.get(str2);
                if (str3 == null) {
                    str3 = "";
                }
                nmbVar.n(wjbVar2, wjbVar, G, wjbVar2, (r60 & 16) != 0 ? ilb.Fullscreen : null, (r60 & 32) != 0 ? glb.Fullscreen : null, (r60 & 64) != 0 ? "" : null, (r60 & 128) != 0 ? pkb.NonApplicable : null, (r60 & 256) != 0 ? "" : null, pkbVar, str2, (r60 & 2048) != 0 ? 0 : 0, (r60 & 4096) != 0 ? 0 : 0, (r60 & RemoteCameraConfig.Notification.ID) != 0 ? "" : null, (r60 & 16384) != 0 ? 0 : 0, (32768 & r60) != 0 ? false : false, "ARTISTS_TOP", "collection_artists_top", 1, (524288 & r60) != 0 ? 1 : 0, (1048576 & r60) != 0 ? 0 : 0, (2097152 & r60) != 0 ? "" : null, (4194304 & r60) != 0 ? "" : null, (8388608 & r60) != 0 ? "" : null, (16777216 & r60) != 0 ? 0 : 0, str3, uo1Var.b.a(), "", (r60 & 268435456) != 0 ? "" : null);
                bp1Var.a.invoke(u51Var);
                return Unit.a;
            case 4:
                pu4 pu4Var = (pu4) obj2;
                oq oqVar2 = ((oab) obj).a;
                pu4Var.getClass();
                ju4 ju4Var = pu4Var.c;
                ju4Var.getClass();
                lwg C = g0g.C(oqVar2, null);
                y supportFragmentManager = ju4Var.a.getSupportFragmentManager();
                szf.R(supportFragmentManager, vz1.f(supportFragmentManager, C), d.a());
                return Unit.a;
            case 5:
                pu4 pu4Var2 = (pu4) obj2;
                kjm kjmVar = ((pab) obj).a;
                pu4Var2.getClass();
                ju4 ju4Var2 = pu4Var2.c;
                ju4Var2.getClass();
                y yVar = ju4Var2.b;
                PlaybackScope a = d.a();
                t tVar2 = ju4Var2.a;
                yVar.getClass();
                tVar2.getClass();
                sai saiVar = new sai(false);
                pu0 t = pd.t(new qzm[0]);
                qec qecVar = new qec(26, new dn9(a, new ebm(0, saiVar, sai.class, "hide", "hide()V", 0, 12)));
                cvo cvoVar = cvo.i;
                e3s.X(o6m.b(wjb.AlbumListScreen, new avo(pkb.UpcomingAlbum, kjmVar.b), 2), yVar, null, saiVar, null, new wn5(new lc(t, qecVar, kjmVar, tVar2, yVar, 16), -673053661, true), 52);
                return Unit.a;
            case 6:
                j25 j25Var = (j25) obj2;
                cvl cvlVar = ((dwl) obj).b;
                j25Var.getClass();
                mwl mwlVar = ((v25) j25Var.a.b).c;
                mwlVar.getClass();
                lwg G2 = g0g.G(cvlVar);
                y supportFragmentManager2 = mwlVar.a.getSupportFragmentManager();
                szf.R(supportFragmentManager2, vz1.f(supportFragmentManager2, G2), d.t());
                return Unit.a;
            case 7:
                hda hdaVar = (hda) obj2;
                oq oqVar3 = ((xt) obj).a;
                hdaVar.getClass();
                cda cdaVar = hdaVar.c;
                cdaVar.getClass();
                h hVar = new h(Page.DOWNLOADS_ALBUMS);
                t tVar3 = cdaVar.a;
                tVar3.startActivity(quj.U(tVar3, new uq(oqVar3, hVar.b(oqVar3).a(), null, qq.a, 92), hVar));
                return Unit.a;
            case 8:
                o5e o5eVar = (o5e) obj;
                t5e t5eVar = (t5e) obj2;
                try {
                } catch (IOException e) {
                    o5eVar.a(2, 2, e);
                } catch (Throwable th) {
                    o5eVar.a(3, 3, null);
                    cvt.d(t5eVar);
                    throw th;
                }
                if (!t5eVar.a(true, this)) {
                    throw new IOException("Required SETTINGS preface not received");
                }
                while (t5eVar.a(false, this)) {
                }
                o5eVar.a(1, 9, null);
                cvt.d(t5eVar);
                return Unit.a;
            case 9:
                bdf bdfVar = (bdf) obj2;
                oq oqVar4 = ((d9j) obj).a;
                bdfVar.getClass();
                oqVar4.getClass();
                scf scfVar = bdfVar.c;
                scfVar.getClass();
                h l = d.l();
                t tVar4 = scfVar.a;
                tVar4.startActivity(quj.U(tVar4, new uq(oqVar4, l.b(oqVar4).a(), null, qq.a, 92), l));
                return Unit.a;
            case 10:
                cdf cdfVar = (cdf) obj2;
                oq oqVar5 = ((e9j) obj).a;
                cdfVar.getClass();
                oqVar5.getClass();
                oy4 oy4Var = cdfVar.c;
                oy4Var.getClass();
                PlaybackScope a2 = d.a();
                t tVar5 = oy4Var.a;
                tVar5.startActivity(quj.U(tVar5, new uq(oqVar5, a2.b(oqVar5).a(), null, rq.a, 92), a2));
                return Unit.a;
            case 11:
                l9j l9jVar = (l9j) obj2;
                oq oqVar6 = ((x9j) obj).b;
                l9jVar.getClass();
                j35 j35Var = l9jVar.e;
                switch (j35Var.a) {
                    case 0:
                        tnb.d((tnb) j35Var.b.getValue(), wjb.AlbumScreen);
                        break;
                    default:
                        tnb.d((tnb) j35Var.b.getValue(), wjb.AlbumScreen);
                        break;
                }
                i35 i35Var = l9jVar.c;
                switch (i35Var.a) {
                    case 0:
                        t tVar6 = i35Var.b;
                        tVar6.startActivity(quj.T(tVar6, oqVar6, null));
                        break;
                    default:
                        t tVar7 = i35Var.b;
                        tVar7.startActivity(quj.T(tVar7, oqVar6, null));
                        break;
                }
                return Unit.a;
            case 12:
                ((i8l) obj2).x0((ypl) obj);
                return Unit.a;
            case 13:
                eha ehaVar = (eha) obj2;
                cvl cvlVar2 = ((ewl) obj).b;
                ehaVar.getClass();
                t tVar8 = ehaVar.c.a;
                h hVar2 = new h(ivf.I(cvlVar2) ? Page.DOWNLOADS_OWN_PLAYLISTS : Page.DOWNLOADS_PLAYLISTS);
                int i2 = PlaylistScreenActivity.B0;
                tVar8.startActivity(dxl.f(tVar8, cvlVar2, false, null, mxl.a, hVar2));
                return Unit.a;
            case 14:
                hab habVar2 = (hab) obj2;
                String str4 = ((dam) obj).a.h;
                return new d85(habVar2.a(!(str4 == null || StringsKt.U(str4)), false));
            case 15:
                sem semVar = (sem) obj2;
                oq oqVar7 = ((d9j) obj).a;
                semVar.getClass();
                oqVar7.getClass();
                jem jemVar = semVar.c;
                jemVar.getClass();
                h m = d.m();
                t tVar9 = jemVar.a;
                tVar9.startActivity(quj.U(tVar9, new uq(oqVar7, m.b(oqVar7).a(), null, qq.a, 92), m));
                return Unit.a;
            default:
                ((nru) obj2).e((hsu) obj);
                return Unit.a;
        }
    }

    public /* synthetic */ uv(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
