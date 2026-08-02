package defpackage;

import android.content.Intent;
import androidx.fragment.app.t;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ia3 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ja3 b;

    public /* synthetic */ ia3(ja3 ja3Var, int i) {
        this.a = i;
        this.b = ja3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ja3 ja3Var = this.b;
                rbj A = ja3Var.A();
                Intent intent = ja3Var.requireActivity().getIntent();
                intent.getClass();
                return new ob3(A, (tmb) ((vbj) ja3Var.l.getValue()).b.getValue(), ja3Var.d(), intent);
            case 1:
                ja3 ja3Var2 = this.b;
                return new cvo(wjb.AudiobookScreen, hlb.Fullscreen, (glb) null, (dvo) null, new avo(pkb.Audiobook, ja3Var2.A().b), 44);
            case 2:
                ja3 ja3Var3 = this.b;
                nnk nnkVar = new nnk();
                nnkVar.a = ja3Var3.g.m();
                nnkVar.b = ja3Var3.getJ();
                return new vbj(nnkVar);
            default:
                ja3 ja3Var4 = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(xbj.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = ja3Var4.requireActivity();
                requireActivity.getClass();
                return xbj.a(requireActivity, ja3Var4.A(), ja3Var4.d());
        }
    }
}
