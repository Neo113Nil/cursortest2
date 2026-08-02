package defpackage;

import com.ybsdk.core.utils.text.d;
import com.ybsdk.feature.cashback.impl.views.OpenCashbackSelectorButtonView;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes3.dex */
public final /* synthetic */ class y00 implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ n70 c;

    public /* synthetic */ y00(n70 n70Var, Ref$ObjectRef ref$ObjectRef) {
        this.c = n70Var;
        this.b = ref$ObjectRef;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, hbv] */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 iconsAdapter$lambda$3$lambda$1;
        int i = this.a;
        n70 n70Var = this.c;
        Ref$ObjectRef ref$ObjectRef = this.b;
        List list = (List) obj;
        switch (i) {
            case 0:
                rz51 rz51Var = (rz51) n70Var.N;
                ref$ObjectRef.element = v4b1.k(((t29) n70Var.Z()).w, ((rz51) n70Var.N).b, null, null, 6);
                rz51Var.e.setText(d.a(n70Var.P, ((t29) n70Var.Z()).b));
                rz51Var.d.setText(rz51Var.a.getContext().getString(ezh0.ybsdk_percentage, ((t29) n70Var.Z()).x));
                rz51Var.c.setOnClickListener(new k5(2, n70Var, rz51Var));
                return zy11.a;
            default:
                iconsAdapter$lambda$3$lambda$1 = OpenCashbackSelectorButtonView.iconsAdapter$lambda$3$lambda$1(ref$ObjectRef, n70Var, list);
                return iconsAdapter$lambda$3$lambda$1;
        }
    }

    public /* synthetic */ y00(Ref$ObjectRef ref$ObjectRef, n70 n70Var) {
        this.b = ref$ObjectRef;
        this.c = n70Var;
    }
}
