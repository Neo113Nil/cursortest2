package defpackage;

import androidx.fragment.app.t;
import androidx.fragment.app.y;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class r0i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0i b;

    public /* synthetic */ r0i(s0i s0iVar, int i) {
        this.a = i;
        this.b = s0iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                s0i s0iVar = this.b;
                wjb wjbVar = wjb.MetatagScreen;
                hlb hlbVar = hlb.Fullscreen;
                String string = s0iVar.requireArguments().getString("arg.metatag_id");
                if (string != null) {
                    return new cvo(wjbVar, hlbVar, (glb) null, (dvo) null, new avo(pkb.MetaTag, string), 44);
                }
                xq0.x("Required value was null.");
                return null;
            case 1:
                String string2 = this.b.requireArguments().getString("arg.metatag_id");
                if (string2 != null) {
                    return new b1i(string2);
                }
                xq0.x("Required value was null.");
                return null;
            default:
                s0i s0iVar2 = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(s1i.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = s0iVar2.requireActivity();
                requireActivity.getClass();
                y childFragmentManager = s0iVar2.getChildFragmentManager();
                childFragmentManager.getClass();
                return new w0i(childFragmentManager, requireActivity);
        }
    }
}
