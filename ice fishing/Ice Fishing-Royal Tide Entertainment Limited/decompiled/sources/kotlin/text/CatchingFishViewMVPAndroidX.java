package kotlin.text;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class CatchingFishViewMVPAndroidX {
    public boolean CatchingFishCoroutine;
    public CatchingFishHandlerRedux CatchingFishLayout;
    public final CatchingFishRoomDaggerHilt CatchingFishParcelableFAB;
    public CatchingFishLayoutCoroutine CatchingFishViewModelFAB;
    public final AtomicReference CatchingFishSnackbar = new AtomicReference(null);
    public final CatchingFishCoroutineLayout CatchingFishReduxKtor = new CatchingFishCoroutineLayout(4, this);
    public final CatchingFishFragmentFactory CatchingFishDaggerWebsocket = new CatchingFishFragmentFactory(16, this);
    public final CatchingFishFABToast CatchingFishWorkManager = new CatchingFishFABToast(new CatchingFishHandlerRedux[16]);
    public final Object CatchingFishViewModelScope = new Object();
    public long CatchingFishFragmentHandler = -1;

    public CatchingFishViewMVPAndroidX(CatchingFishRoomDaggerHilt catchingFishRoomDaggerHilt) {
        this.CatchingFishParcelableFAB = catchingFishRoomDaggerHilt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean CatchingFishParcelableFAB() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.CatchingFishViewModelScope) {
            z = this.CatchingFishCoroutine;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.CatchingFishSnackbar;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        CatchingFishUnitTestingFlux.CatchingFishReduxKtor("Unexpected notification");
                        throw new CatchingFishBiometricView();
                    }
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.CatchingFishViewModelScope) {
                CatchingFishFABToast catchingFishFABToast = this.CatchingFishWorkManager;
                Object[] objArr = catchingFishFABToast.CatchingFishReduxKtor;
                int i = catchingFishFABToast.CatchingFishWorkManager;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((CatchingFishHandlerRedux) objArr[i2]).CatchingFishSnackbar(set) || z2;
                }
            }
        }
    }
}
