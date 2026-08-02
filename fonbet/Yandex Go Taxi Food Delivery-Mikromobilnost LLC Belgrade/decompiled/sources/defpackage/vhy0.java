package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.l;

/* loaded from: classes3.dex */
public final class vhy0 implements ev31 {
    public static rbv a(ThemedImageUrlEntity themedImageUrlEntity) {
        rbv f = job1.f(themedImageUrlEntity, new bkx0(27));
        return f == null ? new nbv(txg0.ybsdk_ic_yb_placeholder, null) : f;
    }

    public static YbButtonView.a b(ygy0 ygy0Var) {
        return new YbButtonView.a(g8e.i(Text.Companion, ygy0Var.a), null, null, null, null, null, null, false, false, null, 4094);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d3  */
    @Override // defpackage.ev31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(Object obj) {
        mhy0 mhy0Var;
        ghy0 ghy0Var = (ghy0) obj;
        lhy0 lhy0Var = ghy0Var.b;
        mhy0 mhy0Var2 = null;
        mhy0Var2 = null;
        if (lhy0Var instanceof hhy0) {
            hhy0 hhy0Var = (hhy0) lhy0Var;
            rbv a = a(hhy0Var.a);
            Text.Constant i = g8e.i(Text.Companion, hhy0Var.b);
            Text.Constant constant = new Text.Constant(hhy0Var.c);
            l lVar = new l(OperationProgressView.StatusIcon.ERROR);
            YbButtonView.a b = b(hhy0Var.d);
            ygy0 ygy0Var = hhy0Var.e;
            mhy0Var = new mhy0(a, i, constant, lVar, new YbButtonViewGroup.b(null, b, ygy0Var != null ? b(ygy0Var) : null, null, 9));
        } else if (lhy0Var instanceof ihy0) {
            ihy0 ihy0Var = (ihy0) lhy0Var;
            mhy0Var = new mhy0(a(ihy0Var.a), g8e.i(Text.Companion, ihy0Var.b), new Text.Constant(ihy0Var.c), pc70.a, null);
        } else {
            if (!(lhy0Var instanceof jhy0)) {
                if (!(lhy0Var instanceof khy0) && lhy0Var != null) {
                    w511.b();
                    return null;
                }
                if (!(lhy0Var instanceof khy0)) {
                    return new shy0(r501.a(((khy0) lhy0Var).a, null, null, null, null, null, null, null, null, null, null, null, null, 65534));
                }
                kao kaoVar = ghy0Var.a;
                return kaoVar != null ? new shy0(kaoVar) : mhy0Var2 == null ? thy0.a : new rhy0(mhy0Var2);
            }
            jhy0 jhy0Var = (jhy0) lhy0Var;
            mhy0Var = new mhy0(a(jhy0Var.a), g8e.i(Text.Companion, jhy0Var.b), new Text.Constant(jhy0Var.c), new l(OperationProgressView.StatusIcon.SUCCESS), new YbButtonViewGroup.b(null, b(jhy0Var.d), null, null, 9));
        }
        mhy0Var2 = mhy0Var;
        if (!(lhy0Var instanceof khy0)) {
        }
    }
}
