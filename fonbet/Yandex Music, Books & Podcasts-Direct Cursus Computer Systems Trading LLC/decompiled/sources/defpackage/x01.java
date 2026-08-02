package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class x01 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y01 b;

    public /* synthetic */ x01(y01 y01Var, int i) {
        this.a = i;
        this.b = y01Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        wjb wjbVar;
        switch (this.a) {
            case 0:
                y01 y01Var = this.b;
                int ordinal = y01Var.A().ordinal();
                if (ordinal == 0) {
                    wjbVar = wjb.ArtistAllAlbumsListScreen;
                } else if (ordinal == 1) {
                    wjbVar = wjb.CompilationsScreen;
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    wjbVar = wjb.ArtistStudioAlbumListScreen;
                }
                hlb hlbVar = hlb.Fullscreen;
                String string = y01Var.requireArguments().getString("arg.artist_id");
                if (string != null) {
                    return new cvo(wjbVar, hlbVar, (glb) null, (dvo) null, new avo(pkb.Artist, string), 44);
                }
                xq0.x("Required value was null.");
                return null;
            case 1:
                y01 y01Var2 = this.b;
                String string2 = y01Var2.requireArguments().getString("arg.artist_id");
                if (string2 != null) {
                    return new m11(string2, y01Var2.A());
                }
                xq0.x("Required value was null.");
                return null;
            default:
                y01 y01Var3 = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(hi1.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = y01Var3.requireActivity();
                requireActivity.getClass();
                return new v01(requireActivity);
        }
    }
}
