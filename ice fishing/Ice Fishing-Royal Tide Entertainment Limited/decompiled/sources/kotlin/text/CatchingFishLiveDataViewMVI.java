package kotlin.text;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class CatchingFishLiveDataViewMVI implements Iterable {
    public CatchingFishPayPalGraphQL CatchingFishDaggerWebsocket;
    public CatchingFishPayPalGraphQL CatchingFishReduxKtor;
    public final WeakHashMap CatchingFishWorkManager = new WeakHashMap();
    public int CatchingFishViewModelScope = 0;

    public CatchingFishPayPalGraphQL CatchingFishParcelableFAB(Object obj) {
        CatchingFishPayPalGraphQL catchingFishPayPalGraphQL = this.CatchingFishReduxKtor;
        while (catchingFishPayPalGraphQL != null && !catchingFishPayPalGraphQL.CatchingFishReduxKtor.equals(obj)) {
            catchingFishPayPalGraphQL = catchingFishPayPalGraphQL.CatchingFishWorkManager;
        }
        return catchingFishPayPalGraphQL;
    }

    public Object CatchingFishSnackbar(Object obj) {
        CatchingFishPayPalGraphQL CatchingFishParcelableFAB = CatchingFishParcelableFAB(obj);
        if (CatchingFishParcelableFAB == null) {
            return null;
        }
        this.CatchingFishViewModelScope--;
        WeakHashMap weakHashMap = this.CatchingFishWorkManager;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((CatchingFishPicassoMockk) it.next()).CatchingFishParcelableFAB(CatchingFishParcelableFAB);
            }
        }
        CatchingFishPayPalGraphQL catchingFishPayPalGraphQL = CatchingFishParcelableFAB.CatchingFishViewModelScope;
        if (catchingFishPayPalGraphQL != null) {
            catchingFishPayPalGraphQL.CatchingFishWorkManager = CatchingFishParcelableFAB.CatchingFishWorkManager;
        } else {
            this.CatchingFishReduxKtor = CatchingFishParcelableFAB.CatchingFishWorkManager;
        }
        CatchingFishPayPalGraphQL catchingFishPayPalGraphQL2 = CatchingFishParcelableFAB.CatchingFishWorkManager;
        if (catchingFishPayPalGraphQL2 != null) {
            catchingFishPayPalGraphQL2.CatchingFishViewModelScope = catchingFishPayPalGraphQL;
        } else {
            this.CatchingFishDaggerWebsocket = catchingFishPayPalGraphQL;
        }
        CatchingFishParcelableFAB.CatchingFishWorkManager = null;
        CatchingFishParcelableFAB.CatchingFishViewModelScope = null;
        return CatchingFishParcelableFAB.CatchingFishDaggerWebsocket;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((kotlin.text.CatchingFishAnimationLayout) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishLiveDataViewMVI)) {
            return false;
        }
        CatchingFishLiveDataViewMVI catchingFishLiveDataViewMVI = (CatchingFishLiveDataViewMVI) obj;
        if (this.CatchingFishViewModelScope != catchingFishLiveDataViewMVI.CatchingFishViewModelScope) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = catchingFishLiveDataViewMVI.iterator();
        while (true) {
            CatchingFishAnimationLayout catchingFishAnimationLayout = (CatchingFishAnimationLayout) it;
            if (!catchingFishAnimationLayout.hasNext()) {
                break;
            }
            CatchingFishAnimationLayout catchingFishAnimationLayout2 = (CatchingFishAnimationLayout) it2;
            if (!catchingFishAnimationLayout2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) catchingFishAnimationLayout.next();
            Object next = catchingFishAnimationLayout2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            CatchingFishAnimationLayout catchingFishAnimationLayout = (CatchingFishAnimationLayout) it;
            if (!catchingFishAnimationLayout.hasNext()) {
                return i;
            }
            i += ((Map.Entry) catchingFishAnimationLayout.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        CatchingFishAnimationLayout catchingFishAnimationLayout = new CatchingFishAnimationLayout(this.CatchingFishReduxKtor, this.CatchingFishDaggerWebsocket, 0);
        this.CatchingFishWorkManager.put(catchingFishAnimationLayout, Boolean.FALSE);
        return catchingFishAnimationLayout;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            CatchingFishAnimationLayout catchingFishAnimationLayout = (CatchingFishAnimationLayout) it;
            if (!catchingFishAnimationLayout.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) catchingFishAnimationLayout.next()).toString());
            if (catchingFishAnimationLayout.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
