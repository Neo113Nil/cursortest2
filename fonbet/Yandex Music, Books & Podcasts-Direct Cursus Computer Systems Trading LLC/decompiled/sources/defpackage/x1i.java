package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class x1i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1i b;

    public /* synthetic */ x1i(z1i z1iVar, int i) {
        this.a = i;
        this.b = z1iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                z1i z1iVar = this.b;
                wjb wjbVar = wjb.MetatagScreen;
                hlb hlbVar = hlb.Fullscreen;
                String string = z1iVar.requireArguments().getString("arg.metatag_id");
                if (string != null) {
                    return new cvo(wjbVar, hlbVar, (glb) null, (dvo) null, new avo(pkb.MetaTag, string), 44);
                }
                xq0.x("Required value was null.");
                return null;
            case 1:
                String string2 = this.b.requireArguments().getString("arg.metatag_id");
                if (string2 != null) {
                    return new g2i(string2);
                }
                xq0.x("Required value was null.");
                return null;
            default:
                z1i z1iVar2 = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(r1i.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = z1iVar2.requireActivity();
                requireActivity.getClass();
                y childFragmentManager = z1iVar2.getChildFragmentManager();
                childFragmentManager.getClass();
                return new c2i(childFragmentManager, requireActivity);
        }
    }
}
