package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes3.dex */
public final class fwg extends bfu {
    public final g06 k;
    public final xdr l;
    public final xdr m;

    public fwg(lwg lwgVar, g06 g06Var, g06 g06Var2) {
        uf ufVar;
        List w;
        lwgVar.getClass();
        this.k = g06Var2;
        this.l = ydr.a(lwgVar);
        kwg kwgVar = (kwg) g06Var.c;
        if (kwgVar instanceof iwg) {
            iwg iwgVar = (iwg) kwgVar;
            w = xz0.w(new wf[]{new sf(), iwgVar.b ? new uf(tf.ARTIST) : null, new nf(g06Var.C(iwgVar)), new pf(g06Var.D(iwgVar))});
        } else if (kwgVar instanceof jwg) {
            jwg jwgVar = (jwg) kwgVar;
            sf sfVar = new sf();
            uf ufVar2 = jwgVar.b ? new uf(tf.PLAYLIST) : null;
            eul eulVar = jwgVar.a;
            eulVar.getClass();
            String str = eulVar.a;
            l18 l18Var = l18.b;
            bdt I = hag.I(frt.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            w = xz0.w(new wf[]{sfVar, ufVar2, Intrinsics.d(((frt) qdcVar.C(I)).c().a, str) ? null : new nf(g06Var.C(jwgVar)), new lf(g06Var.z(jwgVar)), new pf(g06Var.D(jwgVar))});
        } else {
            if (!(kwgVar instanceof hwg)) {
                b6e.s();
                throw null;
            }
            hwg hwgVar = (hwg) kwgVar;
            lt ltVar = hwgVar.a;
            if (lxe.w(ltVar)) {
                if (!lxe.w(ltVar)) {
                    xq0.x("entity is not a book");
                    throw null;
                }
                w = xz0.w(new wf[]{new sf(), new nf(g06Var.C(hwgVar)), new lf(g06Var.z(hwgVar))});
            } else if (!lxe.x(ltVar)) {
                sf sfVar2 = new sf();
                if (hwgVar.b) {
                    ufVar = new uf(ltVar.b == Album$AlbumType.SINGLE ? tf.SINGLE : tf.ALBUM);
                } else {
                    ufVar = null;
                }
                nf nfVar = new nf(g06Var.C(hwgVar));
                lf lfVar = new lf(g06Var.z(hwgVar));
                pf pfVar = new pf(g06Var.D(hwgVar));
                List list = hwgVar.c;
                if (list != null && !list.isEmpty()) {
                    if (list.isEmpty()) {
                        dfi.r("artists are empty!", "LongTapBottomSheetDependenciesImpl");
                    }
                    r5 = new rf(list.size() == 1 ? qf.ONE : qf.MANY);
                }
                w = xz0.w(new wf[]{sfVar2, ufVar, nfVar, lfVar, pfVar, r5});
            } else {
                if (!lxe.x(ltVar)) {
                    xq0.x("entity is not a podcast");
                    throw null;
                }
                w = xz0.w(new wf[]{new sf(), new nf(g06Var.C(hwgVar)), new lf(g06Var.z(hwgVar))});
            }
        }
        this.m = ydr.a(w);
    }
}
