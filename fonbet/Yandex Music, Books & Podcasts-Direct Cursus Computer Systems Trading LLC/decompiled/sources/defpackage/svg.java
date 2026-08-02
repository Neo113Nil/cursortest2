package defpackage;

import android.content.Context;
import android.os.Parcelable;
import androidx.fragment.app.y;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class svg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tvg b;

    public /* synthetic */ svg(tvg tvgVar, int i) {
        this.a = i;
        this.b = tvgVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        String str2;
        fkb fkbVar;
        ckb ckbVar;
        pkb pkbVar;
        switch (this.a) {
            case 0:
                Parcelable parcelable = this.b.requireArguments().getParcelable("long_tap_args");
                if (parcelable != null) {
                    return (qvg) parcelable;
                }
                xq0.x("Required value was null.");
                return null;
            case 1:
                return this.b.requireArguments().getSerializable("long_tap_playback_scope");
            case 2:
                tvg tvgVar = this.b;
                lwg lwgVar = ((qvg) tvgVar.l.getValue()).a;
                jyr jyrVar = tvgVar.j;
                rvg rvgVar = (rvg) jyrVar.getValue();
                kwg kwgVar = lwgVar.b;
                rvgVar.getClass();
                kwgVar.getClass();
                g06 g06Var = new g06(kwgVar);
                rvg rvgVar2 = (rvg) jyrVar.getValue();
                fnb m = tvgVar.g.m();
                kwg kwgVar2 = lwgVar.b;
                kwgVar2.getClass();
                gs4 gs4Var = new gs4();
                boolean z = kwgVar2 instanceof iwg;
                if (z) {
                    str = ((iwg) kwgVar2).a.a;
                } else if (kwgVar2 instanceof hwg) {
                    str = ((hwg) kwgVar2).a.a;
                } else {
                    if (!(kwgVar2 instanceof jwg)) {
                        b6e.s();
                        throw null;
                    }
                    str = ((jwg) kwgVar2).a.f;
                }
                gs4Var.a = str;
                if (z) {
                    str2 = "artist";
                } else if (kwgVar2 instanceof hwg) {
                    str2 = "album";
                } else {
                    if (!(kwgVar2 instanceof jwg)) {
                        b6e.s();
                        throw null;
                    }
                    str2 = "playlist";
                }
                gs4Var.b = str2;
                if (z) {
                    fkbVar = fkb.ArtistScreen;
                } else if (kwgVar2 instanceof hwg) {
                    fkbVar = fkb.AlbumScreen;
                } else {
                    if (!(kwgVar2 instanceof jwg)) {
                        b6e.s();
                        throw null;
                    }
                    fkbVar = fkb.PlaylistScreen;
                }
                gs4Var.c = fkbVar;
                if (z) {
                    ckbVar = ckb.Artist;
                } else if (kwgVar2 instanceof hwg) {
                    ckbVar = ckb.Album;
                } else {
                    if (!(kwgVar2 instanceof jwg)) {
                        b6e.s();
                        throw null;
                    }
                    ckbVar = ckb.Playlist;
                }
                gs4Var.d = ckbVar;
                if (z) {
                    pkbVar = pkb.Artist;
                } else if (kwgVar2 instanceof hwg) {
                    int i = pvg.a[((hwg) kwgVar2).a.b.ordinal()];
                    pkbVar = i != 1 ? i != 2 ? pkb.Album : pkb.Audiobook : pkb.Podcast;
                } else {
                    if (!(kwgVar2 instanceof jwg)) {
                        b6e.s();
                        throw null;
                    }
                    pkbVar = pkb.Playlist;
                }
                gs4Var.e = pkbVar;
                rvgVar2.getClass();
                return new fwg(lwgVar, g06Var, new g06(m, gs4Var));
            default:
                tvg tvgVar2 = this.b;
                fwg fwgVar = (fwg) tvgVar2.n.getValue();
                rvg rvgVar3 = (rvg) tvgVar2.j.getValue();
                Context requireContext = tvgVar2.requireContext();
                requireContext.getClass();
                y parentFragmentManager = tvgVar2.getParentFragmentManager();
                parentFragmentManager.getClass();
                Object value = tvgVar2.m.getValue();
                kxi d = tvgVar2.d();
                pef pefVar = new pef(0, (rvg) tvgVar2.j.getValue(), rvg.class, "isDownloadUnavailable", "isDownloadUnavailable()Z", 0, 23);
                rvgVar3.getClass();
                t1f t1fVar = new t1f(6, requireContext, parentFragmentManager, d);
                l18 l18Var = l18.b;
                bdt I = hag.I(bwg.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new cwg(fwgVar, new dn9((bwg) qdcVar.C(I), t1fVar, value, d, pefVar, 18));
        }
    }
}
