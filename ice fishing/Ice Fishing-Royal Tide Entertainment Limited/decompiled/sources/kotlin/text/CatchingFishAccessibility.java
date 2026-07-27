package kotlin.text;

import android.content.Context;
import android.view.MenuItem;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class CatchingFishAccessibility {
    public Object CatchingFishParcelableFAB;
    public Object CatchingFishSnackbar;

    public CatchingFishAccessibility(Context context) {
        this.CatchingFishParcelableFAB = context;
    }

    public void CatchingFishCoroutine() {
        CatchingFishMVPDatabinding catchingFishMVPDatabinding = (CatchingFishMVPDatabinding) this.CatchingFishParcelableFAB;
        CatchingFishGraphQLMoshi catchingFishGraphQLMoshi = (CatchingFishGraphQLMoshi) this.CatchingFishSnackbar;
        HashSet hashSet = catchingFishMVPDatabinding.CatchingFishDaggerWebsocket;
        if (hashSet.remove(catchingFishGraphQLMoshi) && hashSet.isEmpty()) {
            catchingFishMVPDatabinding.CatchingFishSnackbar();
        }
    }

    public MenuItem CatchingFishDaggerWebsocket(MenuItem menuItem) {
        if (!(menuItem instanceof CatchingFishGlideSpannable)) {
            return menuItem;
        }
        CatchingFishGlideSpannable catchingFishGlideSpannable = (CatchingFishGlideSpannable) menuItem;
        if (((CatchingFishGraphQLRealmFAB) this.CatchingFishSnackbar) == null) {
            this.CatchingFishSnackbar = new CatchingFishGraphQLRealmFAB(0);
        }
        MenuItem menuItem2 = (MenuItem) ((CatchingFishGraphQLRealmFAB) this.CatchingFishSnackbar).get(catchingFishGlideSpannable);
        if (menuItem2 != null) {
            return menuItem2;
        }
        CatchingFishFABHilt catchingFishFABHilt = new CatchingFishFABHilt((Context) this.CatchingFishParcelableFAB, catchingFishGlideSpannable);
        ((CatchingFishGraphQLRealmFAB) this.CatchingFishSnackbar).put(catchingFishGlideSpannable, catchingFishFABHilt);
        return catchingFishFABHilt;
    }

    public abstract int[] CatchingFishReduxKtor(int i);

    public abstract int[] CatchingFishViewModelFAB(int i);

    public String CatchingFishViewModelScope() {
        String str = (String) this.CatchingFishParcelableFAB;
        if (str != null) {
            return str;
        }
        CatchingFishFirebaseDagger.CatchingFishDataStoreIntent("text");
        throw null;
    }

    public int[] CatchingFishWorkManager(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = (int[]) this.CatchingFishSnackbar;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public CatchingFishAccessibility() {
        this.CatchingFishSnackbar = new int[2];
    }

    public CatchingFishAccessibility(CatchingFishMVPDatabinding catchingFishMVPDatabinding, CatchingFishGraphQLMoshi catchingFishGraphQLMoshi) {
        this.CatchingFishParcelableFAB = catchingFishMVPDatabinding;
        this.CatchingFishSnackbar = catchingFishGraphQLMoshi;
    }
}
