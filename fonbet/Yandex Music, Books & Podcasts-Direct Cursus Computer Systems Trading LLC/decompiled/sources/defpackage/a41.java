package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a41 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c41 b;

    public /* synthetic */ a41(c41 c41Var, int i) {
        this.a = i;
        this.b = c41Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new cvo(wjb.ArtistConcertsScreen, hlb.Fullscreen, (glb) null, (dvo) null, new avo(pkb.Artist, this.b.A().a), 44);
            case 1:
                c41 c41Var = this.b;
                return new u41(c41Var.A().a, ((n41) c41Var.l.getValue()).a);
            default:
                c41 c41Var2 = this.b;
                m41 m41Var = (m41) c41Var2.n.getValue();
                t requireActivity = c41Var2.requireActivity();
                requireActivity.getClass();
                String str = c41Var2.A().a;
                m41Var.getClass();
                str.getClass();
                return new i41(requireActivity, str);
        }
    }
}
