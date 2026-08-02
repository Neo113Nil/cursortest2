package defpackage;

import com.monetization.ads.nativeads.CustomizableMediaView;
import yads.gm1;
import yads.ij3;
import yads.qm1;
import yads.xz;

/* loaded from: classes7.dex */
public abstract class vd71 extends ia71 {
    public final j981 c;

    public vd71(CustomizableMediaView customizableMediaView, j981 j981Var) {
        super(customizableMediaView);
        this.c = j981Var;
    }

    public abstract void g(CustomizableMediaView customizableMediaView);

    @Override // defpackage.ia71
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void e(CustomizableMediaView customizableMediaView, d171 d171Var) {
        gm1 j = j();
        j981 j981Var = this.c;
        if (j981Var.c) {
            if (j981Var.a.a == xz.g) {
                qm1 qm1Var = new qm1(j981Var, customizableMediaView, j);
                am81 am81Var = sj71.a;
                customizableMediaView.getViewTreeObserver().addOnPreDrawListener(new ij3(qm1Var, customizableMediaView));
            }
            j981Var.c = false;
        }
    }

    public abstract void i(d171 d171Var);

    public abstract gm1 j();
}
