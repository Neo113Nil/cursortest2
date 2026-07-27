package kotlin.text;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class CatchingFishManifestKtor {
    public Object CatchingFishParcelableFAB;

    public abstract String CatchingFishCoroutine();

    public abstract void CatchingFishParcelableFAB(CatchingFishFluxFluxBundle catchingFishFluxFluxBundle);

    public boolean CatchingFishSnackbar(CatchingFishKtorHilt catchingFishKtorHilt, Object obj) {
        ArrayList arrayList = catchingFishKtorHilt.CatchingFishParcelableFAB;
        if (arrayList == null) {
            return true;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = arrayList.get(i);
            if (obj2 instanceof CatchingFishMockkPicasso) {
                if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj2, obj)) {
                    return true;
                }
            } else {
                if (!(obj2 instanceof CatchingFishKtorHilt)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj2).toString());
                }
                if (CatchingFishSnackbar((CatchingFishKtorHilt) obj2, obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void CatchingFishReduxKtor(CatchingFishKtorHilt catchingFishKtorHilt, Object obj) {
    }
}
