package defpackage;

import com.ybsdk.feature.cashback.impl.views.OpenCashbackSelectorButtonView;
import java.io.Closeable;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes3.dex */
public final /* synthetic */ class z00 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Ref$ObjectRef b;

    public /* synthetic */ z00(int i, Ref$ObjectRef ref$ObjectRef) {
        this.a = i;
        this.b = ref$ObjectRef;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 iconsAdapter$lambda$3$lambda$2;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Ref$ObjectRef ref$ObjectRef = this.b;
        switch (i) {
            case 0:
                hbv hbvVar = (hbv) ref$ObjectRef.element;
                if (hbvVar != null) {
                    hbvVar.dispose();
                    break;
                }
                break;
            case 1:
                hbv hbvVar2 = (hbv) ref$ObjectRef.element;
                if (hbvVar2 != null) {
                    hbvVar2.dispose();
                    break;
                }
                break;
            case 2:
                hbv hbvVar3 = (hbv) ref$ObjectRef.element;
                if (hbvVar3 != null) {
                    hbvVar3.dispose();
                    break;
                }
                break;
            case 3:
                iconsAdapter$lambda$3$lambda$2 = OpenCashbackSelectorButtonView.iconsAdapter$lambda$3$lambda$2(ref$ObjectRef);
                break;
            case 4:
                yf61.b((Closeable) ref$ObjectRef.element);
                break;
            case 5:
                hbv hbvVar4 = (hbv) ref$ObjectRef.element;
                if (hbvVar4 != null) {
                    hbvVar4.dispose();
                    break;
                }
                break;
            default:
                hbv hbvVar5 = (hbv) ref$ObjectRef.element;
                if (hbvVar5 != null) {
                    hbvVar5.dispose();
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
