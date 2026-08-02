package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class kdj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ldj b;

    public /* synthetic */ kdj(ldj ldjVar, int i) {
        this.a = i;
        this.b = ldjVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        wjb wjbVar;
        switch (this.a) {
            case 0:
                int ordinal = this.b.A().ordinal();
                if (ordinal == 0) {
                    wjbVar = wjb.AudiobookChapterListScreen;
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    wjbVar = wjb.PodcastEpisodeListScreen;
                }
                return new cvo(wjbVar, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
            case 1:
                return new udj(this.b.A());
            case 2:
                ldj ldjVar = this.b;
                jyr jyrVar = ldjVar.l;
                int ordinal2 = ldjVar.A().ordinal();
                if (ordinal2 == 0) {
                    naj najVar = (naj) jyrVar.getValue();
                    kxi d = ldjVar.d();
                    najVar.getClass();
                    return new ew4(d.a, 0);
                }
                if (ordinal2 != 1) {
                    b6e.s();
                    return null;
                }
                naj najVar2 = (naj) jyrVar.getValue();
                kxi d2 = ldjVar.d();
                najVar2.getClass();
                return new ew4(d2.a, 1);
            case 3:
                ldj ldjVar2 = this.b;
                jyr jyrVar2 = ldjVar2.l;
                int ordinal3 = ldjVar2.A().ordinal();
                if (ordinal3 == 0) {
                    naj najVar3 = (naj) jyrVar2.getValue();
                    t requireActivity = ldjVar2.requireActivity();
                    requireActivity.getClass();
                    kxi d3 = ldjVar2.d();
                    najVar3.getClass();
                    return new dw4(requireActivity, d3, 0);
                }
                if (ordinal3 != 1) {
                    b6e.s();
                    return null;
                }
                naj najVar4 = (naj) jyrVar2.getValue();
                t requireActivity2 = ldjVar2.requireActivity();
                requireActivity2.getClass();
                kxi d4 = ldjVar2.d();
                najVar4.getClass();
                return new dw4(requireActivity2, d4, 1);
            default:
                ldj ldjVar3 = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(ibc.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity3 = ldjVar3.requireActivity();
                requireActivity3.getClass();
                return ibc.a(requireActivity3);
        }
    }
}
