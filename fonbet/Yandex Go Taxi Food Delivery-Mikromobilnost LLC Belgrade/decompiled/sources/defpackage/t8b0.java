package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes3.dex */
public final /* synthetic */ class t8b0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ n70 b;

    public /* synthetic */ t8b0(n70 n70Var, int i) {
        this.a = i;
        this.b = n70Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        n70 n70Var = this.b;
        switch (i) {
            case 0:
                Object tag = ((i261) n70Var.N).a.getTag(lbh0.ybsdk_pfm_category_width_animator_tag);
                ValueAnimator valueAnimator = tag instanceof ValueAnimator ? (ValueAnimator) tag : null;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    break;
                }
                break;
            case 1:
                ((b461) n70Var.N).a.startShimmer();
                break;
            case 2:
                ((b461) n70Var.N).a.stopShimmer();
                break;
            case 3:
                ((d461) n70Var.N).a.startShimmer();
                break;
            case 4:
                ((d461) n70Var.N).a.stopShimmer();
                break;
            default:
                m.c(((a361) n70Var.N).c).dispose();
                break;
        }
        return zy11Var;
    }
}
