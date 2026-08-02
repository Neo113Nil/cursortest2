package defpackage;

import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class e1i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1i b;

    public /* synthetic */ e1i(f1i f1iVar, int i) {
        this.a = i;
        this.b = f1iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                f1i f1iVar = this.b;
                wjb wjbVar = wjb.MetatagScreen;
                hlb hlbVar = hlb.Fullscreen;
                String string = f1iVar.requireArguments().getString("arg.metatag_id");
                if (string != null) {
                    return new cvo(wjbVar, hlbVar, (glb) null, (dvo) null, new avo(pkb.MetaTag, string), 44);
                }
                xq0.x("Required value was null.");
                return null;
            case 1:
                String string2 = this.b.requireArguments().getString("arg.metatag_id");
                if (string2 != null) {
                    return new o1i(string2);
                }
                xq0.x("Required value was null.");
                return null;
            default:
                f1i f1iVar2 = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(q1i.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = f1iVar2.requireActivity();
                requireActivity.getClass();
                return new j1i(requireActivity);
        }
    }
}
