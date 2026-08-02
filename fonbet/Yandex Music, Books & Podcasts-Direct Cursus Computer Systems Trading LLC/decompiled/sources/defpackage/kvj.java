package defpackage;

import android.os.Parcelable;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class kvj implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mvj b;

    public /* synthetic */ kvj(mvj mvjVar, int i) {
        this.a = i;
        this.b = mvjVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                mvj mvjVar = this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(ivj.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                bjk bjkVar = bjk.a;
                String string = mvjVar.requireArguments().getString("paywallScreenFragment:args.screenId");
                Parcelable parcelable = mvjVar.requireArguments().getParcelable("paywallScreenFragment:args.navigationSourceInfo");
                if (parcelable == null) {
                    xq0.x("Required value was null.");
                    break;
                } else {
                    break;
                }
            default:
                mvj mvjVar2 = this.b;
                String string2 = mvjVar2.requireArguments().getString("paywallScreenFragment:args.screenId");
                String string3 = mvjVar2.requireArguments().getString("paywallScreenFragment:args.campaignId");
                Parcelable parcelable2 = mvjVar2.requireArguments().getParcelable("paywallScreenFragment:args.option");
                if (parcelable2 == null) {
                    xq0.x("Required value was null.");
                    break;
                } else {
                    ad6 ad6Var = (ad6) parcelable2;
                    Parcelable parcelable3 = mvjVar2.requireArguments().getParcelable("paywallScreenFragment:args.navigationSourceInfo");
                    if (parcelable3 == null) {
                        xq0.x("Required value was null.");
                        break;
                    } else {
                        lik likVar = (lik) parcelable3;
                        gvj gvjVar = (gvj) mvjVar2.i.getValue();
                        l18 l18Var2 = l18.b;
                        bdt I2 = hag.I(qvj.class);
                        qdc qdcVar2 = l18Var2.a;
                        qdcVar2.getClass();
                        break;
                    }
                }
        }
        return null;
    }
}
