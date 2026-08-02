package defpackage;

import androidx.fragment.app.Fragment;
import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.feature.credit.deposit.api.CreditScreenParams;
import com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositFragment;
import com.ybsdk.feature.pdf.api.PdfLoaderScreenParams;
import com.ybsdk.feature.pdf.internal.ui.PdfLoaderFragment;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class tc9 implements kcs {
    public final /* synthetic */ int a;
    public final Object b;

    public tc9(Map map, int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new tc9(map, 10);
                break;
            case 8:
                this.b = new tc9(map, 10);
                break;
            case 10:
                this.b = map;
                break;
            default:
                this.b = new tc9(map, 10);
                break;
        }
    }

    public static FragmentScreen b(CreditScreenParams creditScreenParams) {
        return new FragmentScreen("CreditDepositScreen", false, creditScreenParams, null, qoi0.a(CreditDepositFragment.class), OpenScreenRequirement.WithBuid.INSTANCE, 10, null);
    }

    @Override // defpackage.kcs
    public final Fragment a(String str) {
        Object obj;
        yvf0 yvf0Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((tc9) obj2).a(str);
            case 1:
                return ((tc9) obj2).a(str);
            case 2:
                return ((tc9) obj2).a(str);
            case 3:
                return ((tc9) obj2).a(str);
            case 4:
                return ((tc9) obj2).a(str);
            case 5:
                return ((tc9) obj2).a(str);
            case 6:
                return ((tc9) obj2).a(str);
            case 7:
                return ((tc9) obj2).a(str);
            case 8:
                return ((tc9) obj2).a(str);
            case 9:
                return ((tc9) obj2).a(str);
            default:
                Iterator it = ((Map) obj2).entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((Class) ((Map.Entry) obj).getKey()).getName().equals(str)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                Map.Entry entry = (Map.Entry) obj;
                if (entry == null || (yvf0Var = (yvf0) entry.getValue()) == null) {
                    return null;
                }
                return (Fragment) yvf0Var.get();
        }
    }

    public FragmentScreen c(PdfLoaderScreenParams pdfLoaderScreenParams) {
        return new FragmentScreen("PdfLoadingScreen", false, pdfLoaderScreenParams, null, qoi0.a(PdfLoaderFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 10, null);
    }

    public tc9(dr10 dr10Var, Map map) {
        this.a = 4;
        this.b = new tc9(map, 10);
    }

    public tc9(ad9 ad9Var, Map map) {
        this.a = 0;
        this.b = new tc9(map, 10);
    }

    public tc9(fja0 fja0Var, Map map) {
        this.a = 5;
        this.b = new tc9(map, 10);
    }

    public tc9(hra0 hra0Var, Map map) {
        this.a = 6;
        this.b = new tc9(map, 10);
    }

    public tc9(bfi0 bfi0Var, Map map) {
        this.a = 7;
        this.b = new tc9(map, 10);
    }

    public tc9(sp10 sp10Var, Map map) {
        this.a = 3;
        this.b = new tc9(map, 10);
    }

    public tc9(hnu0 hnu0Var, Map map) {
        this.a = 9;
        this.b = new tc9(map, 10);
    }
}
