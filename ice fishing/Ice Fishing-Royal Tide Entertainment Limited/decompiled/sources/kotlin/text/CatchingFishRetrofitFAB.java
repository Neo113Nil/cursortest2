package kotlin.text;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class CatchingFishRetrofitFAB extends CatchingFishLayoutGlide {
    public static final CatchingFishContextRealm CatchingFishViewModelFAB = new CatchingFishContextRealm(0);
    public final boolean CatchingFishDaggerWebsocket;
    public final HashMap CatchingFishSnackbar = new HashMap();
    public final HashMap CatchingFishCoroutine = new HashMap();
    public final HashMap CatchingFishReduxKtor = new HashMap();
    public boolean CatchingFishWorkManager = false;
    public boolean CatchingFishViewModelScope = false;

    public CatchingFishRetrofitFAB(boolean z) {
        this.CatchingFishDaggerWebsocket = z;
    }

    public final void CatchingFishCoroutine(String str) {
        HashMap hashMap = this.CatchingFishCoroutine;
        CatchingFishRetrofitFAB catchingFishRetrofitFAB = (CatchingFishRetrofitFAB) hashMap.get(str);
        if (catchingFishRetrofitFAB != null) {
            catchingFishRetrofitFAB.CatchingFishSnackbar();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.CatchingFishReduxKtor;
        CatchingFishManifestService catchingFishManifestService = (CatchingFishManifestService) hashMap2.get(str);
        if (catchingFishManifestService != null) {
            catchingFishManifestService.CatchingFishParcelableFAB();
            hashMap2.remove(str);
        }
    }

    public final void CatchingFishReduxKtor(CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi) {
        if (this.CatchingFishViewModelScope || this.CatchingFishSnackbar.remove(catchingFishGoogleMapsMoshi.CatchingFishViewModelFAB) == null || !CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
            return;
        }
        catchingFishGoogleMapsMoshi.toString();
    }

    @Override // kotlin.text.CatchingFishLayoutGlide
    public final void CatchingFishSnackbar() {
        if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(3)) {
            toString();
        }
        this.CatchingFishWorkManager = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CatchingFishRetrofitFAB.class == obj.getClass()) {
            CatchingFishRetrofitFAB catchingFishRetrofitFAB = (CatchingFishRetrofitFAB) obj;
            if (this.CatchingFishSnackbar.equals(catchingFishRetrofitFAB.CatchingFishSnackbar) && this.CatchingFishCoroutine.equals(catchingFishRetrofitFAB.CatchingFishCoroutine) && this.CatchingFishReduxKtor.equals(catchingFishRetrofitFAB.CatchingFishReduxKtor)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.CatchingFishReduxKtor.hashCode() + ((this.CatchingFishCoroutine.hashCode() + (this.CatchingFishSnackbar.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.CatchingFishSnackbar.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.CatchingFishCoroutine.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.CatchingFishReduxKtor.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
