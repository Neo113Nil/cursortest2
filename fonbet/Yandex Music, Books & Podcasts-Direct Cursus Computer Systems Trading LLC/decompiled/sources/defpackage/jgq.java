package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class jgq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mgq b;

    public /* synthetic */ jgq(mgq mgqVar, int i) {
        this.a = i;
        this.b = mgqVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                mgq mgqVar = this.b;
                wjb wjbVar = wjb.ArtistSimilarArtistListScreen;
                hlb hlbVar = hlb.Fullscreen;
                String string = mgqVar.requireArguments().getString("arg.artist_id");
                if (string != null) {
                    return new cvo(wjbVar, hlbVar, (glb) null, (dvo) null, new avo(pkb.Artist, string), 44);
                }
                xq0.x("Required value was null.");
                return null;
            case 1:
                String string2 = this.b.requireArguments().getString("arg.artist_id");
                if (string2 != null) {
                    return new sgq(string2);
                }
                xq0.x("Required value was null.");
                return null;
            default:
                mgq mgqVar2 = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(gi1.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = mgqVar2.requireActivity();
                requireActivity.getClass();
                return new hgq(requireActivity);
        }
    }
}
