package defpackage;

import com.ybsdk.widgets.common.SkeletonView;

/* loaded from: classes4.dex */
public final /* synthetic */ class yls0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ams0 b;

    public /* synthetic */ yls0(ams0 ams0Var, int i) {
        this.a = i;
        this.b = ams0Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ams0 color$lambda$2;
        ams0 lambda$1$lambda$0;
        int i = this.a;
        ams0 ams0Var = this.b;
        ams0 ams0Var2 = (ams0) obj;
        switch (i) {
            case 0:
                color$lambda$2 = SkeletonView.setColor$lambda$2(ams0Var, ams0Var2);
                return color$lambda$2;
            default:
                lambda$1$lambda$0 = SkeletonView.lambda$1$lambda$0(ams0Var, ams0Var2);
                return lambda$1$lambda$0;
        }
    }
}
