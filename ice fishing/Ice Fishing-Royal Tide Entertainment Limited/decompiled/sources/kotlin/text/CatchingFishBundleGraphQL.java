package kotlin.text;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishBundleGraphQL implements Map.Entry, CatchingFishCardViewFAB {
    public final int CatchingFishDaggerWebsocket;
    public final CatchingFishToastView CatchingFishReduxKtor;
    public final int CatchingFishWorkManager;

    public CatchingFishBundleGraphQL(CatchingFishToastView catchingFishToastView, int i) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishToastView, "map");
        this.CatchingFishReduxKtor = catchingFishToastView;
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishToastView.CatchingFishCloudMessaging;
    }

    public final void CatchingFishParcelableFAB() {
        if (this.CatchingFishReduxKtor.CatchingFishCloudMessaging != this.CatchingFishWorkManager) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(entry.getKey(), getKey()) && CatchingFishFirebaseDagger.CatchingFishOkHttp(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        CatchingFishParcelableFAB();
        return this.CatchingFishReduxKtor.CatchingFishReduxKtor[this.CatchingFishDaggerWebsocket];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        CatchingFishParcelableFAB();
        Object[] objArr = this.CatchingFishReduxKtor.CatchingFishDaggerWebsocket;
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(objArr);
        return objArr[this.CatchingFishDaggerWebsocket];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        CatchingFishParcelableFAB();
        CatchingFishToastView catchingFishToastView = this.CatchingFishReduxKtor;
        catchingFishToastView.CatchingFishSnackbar();
        Object[] objArr = catchingFishToastView.CatchingFishDaggerWebsocket;
        if (objArr == null) {
            int length = catchingFishToastView.CatchingFishReduxKtor.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            catchingFishToastView.CatchingFishDaggerWebsocket = objArr;
        }
        int i = this.CatchingFishDaggerWebsocket;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
