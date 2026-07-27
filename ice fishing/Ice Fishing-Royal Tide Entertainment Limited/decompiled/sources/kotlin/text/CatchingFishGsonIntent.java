package kotlin.text;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class CatchingFishGsonIntent {
    public int CatchingFishCoroutine;
    public int CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public int CatchingFishReduxKtor;
    public int CatchingFishSnackbar;
    public final Object CatchingFishViewModelScope;
    public final Object CatchingFishWorkManager;

    public CatchingFishGsonIntent(int i) {
        this.CatchingFishParcelableFAB = 0;
        this.CatchingFishSnackbar = i;
        if (i <= 0) {
            CatchingFishHiltMVPToast.CatchingFishPayPalLiveData("maxSize <= 0");
            throw null;
        }
        this.CatchingFishWorkManager = new CatchingFishViewPagerMockk(16);
        this.CatchingFishViewModelScope = new CatchingFishGradleMVVM(21);
    }

    public int CatchingFishCoroutine() {
        return ((StaggeredGridLayoutManager) this.CatchingFishViewModelScope).CatchingFishSpannableWidget ? CatchingFishDaggerWebsocket(r0.size() - 1, -1) : CatchingFishDaggerWebsocket(0, ((ArrayList) this.CatchingFishWorkManager).size());
    }

    public int CatchingFishDaggerWebsocket(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.CatchingFishViewModelScope;
        int CatchingFishCloudMessaging = staggeredGridLayoutManager.CatchingFishNavigation.CatchingFishCloudMessaging();
        int CatchingFishViewModelScope = staggeredGridLayoutManager.CatchingFishNavigation.CatchingFishViewModelScope();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.CatchingFishWorkManager).get(i);
            int CatchingFishDaggerWebsocket = staggeredGridLayoutManager.CatchingFishNavigation.CatchingFishDaggerWebsocket(view);
            int CatchingFishSnackbar = staggeredGridLayoutManager.CatchingFishNavigation.CatchingFishSnackbar(view);
            boolean z = CatchingFishDaggerWebsocket <= CatchingFishViewModelScope;
            boolean z2 = CatchingFishSnackbar >= CatchingFishCloudMessaging;
            if (z && z2 && (CatchingFishDaggerWebsocket < CatchingFishCloudMessaging || CatchingFishSnackbar > CatchingFishViewModelScope)) {
                return CatchingFishKtorDataStore.CatchingFishPayPalService(view);
            }
            i += i3;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c6, code lost:
    
        return r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object CatchingFishFragmentHandler(Object obj, Object obj2) {
        Object put;
        CatchingFishFirebaseDagger.CatchingFishNavigation(obj, "key");
        synchronized (((CatchingFishGradleMVVM) this.CatchingFishViewModelScope)) {
            this.CatchingFishCoroutine++;
            CatchingFishViewPagerMockk catchingFishViewPagerMockk = (CatchingFishViewPagerMockk) this.CatchingFishWorkManager;
            catchingFishViewPagerMockk.getClass();
            put = ((LinkedHashMap) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket).put(obj, obj2);
            if (put != null) {
                this.CatchingFishCoroutine--;
            }
        }
        int i = this.CatchingFishSnackbar;
        while (true) {
            synchronized (((CatchingFishGradleMVVM) this.CatchingFishViewModelScope)) {
                try {
                    if (this.CatchingFishCoroutine < 0 || (((LinkedHashMap) ((CatchingFishViewPagerMockk) this.CatchingFishWorkManager).CatchingFishDaggerWebsocket).isEmpty() && this.CatchingFishCoroutine != 0)) {
                        break;
                    }
                    if (this.CatchingFishCoroutine <= i || ((LinkedHashMap) ((CatchingFishViewPagerMockk) this.CatchingFishWorkManager).CatchingFishDaggerWebsocket).isEmpty()) {
                        break;
                    }
                    Set entrySet = ((LinkedHashMap) ((CatchingFishViewPagerMockk) this.CatchingFishWorkManager).CatchingFishDaggerWebsocket).entrySet();
                    CatchingFishFirebaseDagger.CatchingFishRoomDatabase(entrySet, "<get-entries>(...)");
                    Set set = entrySet;
                    Object obj3 = null;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (!list.isEmpty()) {
                            obj3 = list.get(0);
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            obj3 = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj3;
                    if (entry == null) {
                        return put;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    CatchingFishViewPagerMockk catchingFishViewPagerMockk2 = (CatchingFishViewPagerMockk) this.CatchingFishWorkManager;
                    catchingFishViewPagerMockk2.getClass();
                    CatchingFishFirebaseDagger.CatchingFishNavigation(key, "key");
                    ((LinkedHashMap) catchingFishViewPagerMockk2.CatchingFishDaggerWebsocket).remove(key);
                    int i2 = this.CatchingFishCoroutine;
                    CatchingFishFirebaseDagger.CatchingFishNavigation(value, "value");
                    this.CatchingFishCoroutine = i2 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
    }

    public int CatchingFishLayout(int i) {
        int i2 = this.CatchingFishSnackbar;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.CatchingFishWorkManager).size() == 0) {
            return i;
        }
        View view = (View) ((ArrayList) this.CatchingFishWorkManager).get(0);
        CatchingFishDataStoreKtor catchingFishDataStoreKtor = (CatchingFishDataStoreKtor) view.getLayoutParams();
        this.CatchingFishSnackbar = ((StaggeredGridLayoutManager) this.CatchingFishViewModelScope).CatchingFishNavigation.CatchingFishDaggerWebsocket(view);
        catchingFishDataStoreKtor.getClass();
        return this.CatchingFishSnackbar;
    }

    public void CatchingFishParcelableFAB() {
        View view = (View) ((ArrayList) this.CatchingFishWorkManager).get(r0.size() - 1);
        CatchingFishDataStoreKtor catchingFishDataStoreKtor = (CatchingFishDataStoreKtor) view.getLayoutParams();
        this.CatchingFishCoroutine = ((StaggeredGridLayoutManager) this.CatchingFishViewModelScope).CatchingFishNavigation.CatchingFishSnackbar(view);
        catchingFishDataStoreKtor.getClass();
    }

    public int CatchingFishReduxKtor() {
        return ((StaggeredGridLayoutManager) this.CatchingFishViewModelScope).CatchingFishSpannableWidget ? CatchingFishDaggerWebsocket(0, ((ArrayList) this.CatchingFishWorkManager).size()) : CatchingFishDaggerWebsocket(r0.size() - 1, -1);
    }

    public void CatchingFishSnackbar() {
        ((ArrayList) this.CatchingFishWorkManager).clear();
        this.CatchingFishSnackbar = Integer.MIN_VALUE;
        this.CatchingFishCoroutine = Integer.MIN_VALUE;
        this.CatchingFishReduxKtor = 0;
    }

    public View CatchingFishViewModelFAB(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.CatchingFishViewModelScope;
        ArrayList arrayList = (ArrayList) this.CatchingFishWorkManager;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.CatchingFishSpannableWidget && CatchingFishKtorDataStore.CatchingFishPayPalService(view2) >= i) || ((!staggeredGridLayoutManager.CatchingFishSpannableWidget && CatchingFishKtorDataStore.CatchingFishPayPalService(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.CatchingFishSpannableWidget && CatchingFishKtorDataStore.CatchingFishPayPalService(view3) <= i) || ((!staggeredGridLayoutManager.CatchingFishSpannableWidget && CatchingFishKtorDataStore.CatchingFishPayPalService(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public int CatchingFishViewModelScope(int i) {
        int i2 = this.CatchingFishCoroutine;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.CatchingFishWorkManager).size() == 0) {
            return i;
        }
        CatchingFishParcelableFAB();
        return this.CatchingFishCoroutine;
    }

    public Object CatchingFishWorkManager(Object obj) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(obj, "key");
        synchronized (((CatchingFishGradleMVVM) this.CatchingFishViewModelScope)) {
            CatchingFishViewPagerMockk catchingFishViewPagerMockk = (CatchingFishViewPagerMockk) this.CatchingFishWorkManager;
            catchingFishViewPagerMockk.getClass();
            Object obj2 = ((LinkedHashMap) catchingFishViewPagerMockk.CatchingFishDaggerWebsocket).get(obj);
            if (obj2 != null) {
                this.CatchingFishReduxKtor++;
                return obj2;
            }
            this.CatchingFishDaggerWebsocket++;
            return null;
        }
    }

    public String toString() {
        String str;
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                synchronized (((CatchingFishGradleMVVM) this.CatchingFishViewModelScope)) {
                    try {
                        int i = this.CatchingFishReduxKtor;
                        int i2 = this.CatchingFishDaggerWebsocket + i;
                        str = "LruCache[maxSize=" + this.CatchingFishSnackbar + ",hits=" + this.CatchingFishReduxKtor + ",misses=" + this.CatchingFishDaggerWebsocket + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public CatchingFishGsonIntent(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.CatchingFishParcelableFAB = 1;
        this.CatchingFishViewModelScope = staggeredGridLayoutManager;
        this.CatchingFishWorkManager = new ArrayList();
        this.CatchingFishSnackbar = Integer.MIN_VALUE;
        this.CatchingFishCoroutine = Integer.MIN_VALUE;
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishDaggerWebsocket = i;
    }
}
