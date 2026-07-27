package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLEspresso implements CatchingFishKtorKtorPayPal {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishGraphQLEspresso(int i, Object obj) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = obj;
    }

    @Override // kotlin.text.CatchingFishKtorKtorPayPal
    public final void accept(Object obj) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishLayoutBiometric catchingFishLayoutBiometric = (CatchingFishLayoutBiometric) obj;
                if (catchingFishLayoutBiometric == null) {
                    catchingFishLayoutBiometric = new CatchingFishLayoutBiometric(-3);
                }
                ((CatchingFishBundleGlide) this.CatchingFishSnackbar).CatchingFishCardViewView(catchingFishLayoutBiometric);
                return;
            default:
                CatchingFishLayoutBiometric catchingFishLayoutBiometric2 = (CatchingFishLayoutBiometric) obj;
                synchronized (CatchingFishAsyncTaskMVI.CatchingFishCoroutine) {
                    try {
                        CatchingFishGraphQLRealmFAB catchingFishGraphQLRealmFAB = CatchingFishAsyncTaskMVI.CatchingFishReduxKtor;
                        ArrayList arrayList = (ArrayList) catchingFishGraphQLRealmFAB.get((String) this.CatchingFishSnackbar);
                        if (arrayList == null) {
                            return;
                        }
                        catchingFishGraphQLRealmFAB.remove((String) this.CatchingFishSnackbar);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((CatchingFishKtorKtorPayPal) arrayList.get(i)).accept(catchingFishLayoutBiometric2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
