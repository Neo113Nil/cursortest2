package kotlin.text;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes.dex */
public final class CatchingFishWidgetViewModel {
    public static final ThreadPoolExecutor CatchingFishViewModelScope;
    public final CatchingFishMVPLayout CatchingFishCoroutine;
    public final CatchingFishEspressoPayPal CatchingFishDaggerWebsocket;
    public final int CatchingFishParcelableFAB;
    public final ArrayDeque CatchingFishReduxKtor;
    public final long CatchingFishSnackbar;
    public boolean CatchingFishWorkManager;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = CatchingFishEspressoDagger.CatchingFishParcelableFAB;
        CatchingFishViewModelScope = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new CatchingFishAdMobAsyncTask("OkHttp ConnectionPool", true));
    }

    public CatchingFishWidgetViewModel() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.CatchingFishCoroutine = new CatchingFishMVPLayout(16, this);
        this.CatchingFishReduxKtor = new ArrayDeque();
        this.CatchingFishDaggerWebsocket = new CatchingFishEspressoPayPal(2);
        this.CatchingFishParcelableFAB = 5;
        this.CatchingFishSnackbar = timeUnit.toNanos(5L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0006, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean CatchingFishCoroutine(CatchingFishRoomCardView catchingFishRoomCardView, CatchingFishDaggerHiltRedux catchingFishDaggerHiltRedux, ArrayList arrayList, boolean z) {
        CatchingFishAdMobGson catchingFishAdMobGson;
        ArrayList arrayList2;
        Iterator it = this.CatchingFishReduxKtor.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                return false;
            }
            catchingFishAdMobGson = (CatchingFishAdMobGson) it.next();
            if (!z || catchingFishAdMobGson.CatchingFishViewModelFAB != null) {
                CatchingFishHiltMVIEspresso catchingFishHiltMVIEspresso = catchingFishAdMobGson.CatchingFishCoroutine;
                arrayList2 = catchingFishAdMobGson.CatchingFishStateLiveData;
                if (arrayList2.size() < catchingFishAdMobGson.CatchingFishAnimationMockk && !catchingFishAdMobGson.CatchingFishCloudMessaging) {
                    CatchingFishWidgetContext catchingFishWidgetContext = CatchingFishWidgetContext.CatchingFishUnitTesting;
                    CatchingFishRoomCardView catchingFishRoomCardView2 = catchingFishHiltMVIEspresso.CatchingFishParcelableFAB;
                    catchingFishWidgetContext.getClass();
                    boolean CatchingFishParcelableFAB = catchingFishRoomCardView2.CatchingFishParcelableFAB(catchingFishRoomCardView);
                    CatchingFishBundleView catchingFishBundleView = catchingFishRoomCardView.CatchingFishParcelableFAB;
                    if (!CatchingFishParcelableFAB) {
                        continue;
                    } else {
                        if (catchingFishBundleView.CatchingFishReduxKtor.equals(catchingFishHiltMVIEspresso.CatchingFishParcelableFAB.CatchingFishParcelableFAB.CatchingFishReduxKtor)) {
                            break;
                        }
                        if (catchingFishAdMobGson.CatchingFishViewModelFAB != null && arrayList != null) {
                            int size = arrayList.size();
                            while (true) {
                                if (i < size) {
                                    CatchingFishHiltMVIEspresso catchingFishHiltMVIEspresso2 = (CatchingFishHiltMVIEspresso) arrayList.get(i);
                                    Proxy.Type type = catchingFishHiltMVIEspresso2.CatchingFishSnackbar.type();
                                    Proxy.Type type2 = Proxy.Type.DIRECT;
                                    if (type != type2 || catchingFishHiltMVIEspresso.CatchingFishSnackbar.type() != type2 || !catchingFishHiltMVIEspresso.CatchingFishCoroutine.equals(catchingFishHiltMVIEspresso2.CatchingFishCoroutine)) {
                                        i++;
                                    } else if (catchingFishRoomCardView.CatchingFishLayout == CatchingFishGlideOkHttp.CatchingFishParcelableFAB && catchingFishAdMobGson.CatchingFishFragmentHandler(catchingFishBundleView)) {
                                        try {
                                            catchingFishRoomCardView.CatchingFishFragmentHandler.CatchingFishParcelableFAB(catchingFishBundleView.CatchingFishReduxKtor, catchingFishAdMobGson.CatchingFishWorkManager.CatchingFishCoroutine);
                                            break;
                                        } catch (SSLPeerUnverifiedException unused) {
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (catchingFishDaggerHiltRedux.CatchingFishLayout != null) {
            throw new IllegalStateException();
        }
        catchingFishDaggerHiltRedux.CatchingFishLayout = catchingFishAdMobGson;
        arrayList2.add(new CatchingFishPayPalKtor(catchingFishDaggerHiltRedux, catchingFishDaggerHiltRedux.CatchingFishWorkManager));
        return true;
    }

    public final void CatchingFishParcelableFAB(CatchingFishHiltMVIEspresso catchingFishHiltMVIEspresso, IOException iOException) {
        if (catchingFishHiltMVIEspresso.CatchingFishSnackbar.type() != Proxy.Type.DIRECT) {
            CatchingFishRoomCardView catchingFishRoomCardView = catchingFishHiltMVIEspresso.CatchingFishParcelableFAB;
            catchingFishRoomCardView.CatchingFishViewModelScope.connectFailed(catchingFishRoomCardView.CatchingFishParcelableFAB.CatchingFishEspressoTesting(), catchingFishHiltMVIEspresso.CatchingFishSnackbar.address(), iOException);
        }
        CatchingFishEspressoPayPal catchingFishEspressoPayPal = this.CatchingFishDaggerWebsocket;
        synchronized (catchingFishEspressoPayPal) {
            ((LinkedHashSet) catchingFishEspressoPayPal.CatchingFishDaggerWebsocket).add(catchingFishHiltMVIEspresso);
        }
    }

    public final int CatchingFishSnackbar(CatchingFishAdMobGson catchingFishAdMobGson, long j) {
        ArrayList arrayList = catchingFishAdMobGson.CatchingFishStateLiveData;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                CatchingFishCoroutineRoom.CatchingFishParcelableFAB.CatchingFishUnitTesting(((CatchingFishPayPalKtor) reference).CatchingFishParcelableFAB, "A connection to " + catchingFishAdMobGson.CatchingFishCoroutine.CatchingFishParcelableFAB.CatchingFishParcelableFAB + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i);
                catchingFishAdMobGson.CatchingFishCloudMessaging = true;
                if (arrayList.isEmpty()) {
                    catchingFishAdMobGson.CatchingFishRoomDatabase = j - this.CatchingFishSnackbar;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
