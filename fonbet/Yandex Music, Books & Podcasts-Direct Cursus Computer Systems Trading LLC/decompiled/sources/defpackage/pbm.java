package defpackage;

import android.content.Intent;
import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class pbm implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qbm b;

    public /* synthetic */ pbm(qbm qbmVar, int i) {
        this.a = i;
        this.b = qbmVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                qbm qbmVar = this.b;
                rbj A = qbmVar.A();
                Intent intent = qbmVar.requireActivity().getIntent();
                intent.getClass();
                return new gcm(A, (tmb) ((vbj) qbmVar.l.getValue()).b.getValue(), qbmVar.d(), intent);
            case 1:
                qbm qbmVar2 = this.b;
                return new cvo(wjb.PodcastScreen, hlb.Fullscreen, (glb) null, (dvo) null, new avo(pkb.Podcast, qbmVar2.A().b), 44);
            case 2:
                return new vbj(new iwe(this.b));
            default:
                qbm qbmVar3 = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(xbj.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = qbmVar3.requireActivity();
                requireActivity.getClass();
                return xbj.a(requireActivity, qbmVar3.A(), qbmVar3.d());
        }
    }
}
