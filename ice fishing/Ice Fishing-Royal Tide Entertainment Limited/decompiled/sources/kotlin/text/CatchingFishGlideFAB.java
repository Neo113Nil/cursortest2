package kotlin.text;

import java.util.ArrayDeque;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishGlideFAB {
    public Object CatchingFishCoroutine;
    public boolean CatchingFishParcelableFAB;
    public Object CatchingFishSnackbar;

    public CatchingFishGlideFAB(CatchingFishGlideFAB catchingFishGlideFAB, CatchingFishAppCompatPayPal[] catchingFishAppCompatPayPalArr, boolean z) {
        this.CatchingFishCoroutine = catchingFishGlideFAB;
        this.CatchingFishSnackbar = catchingFishAppCompatPayPalArr;
        boolean z2 = false;
        if (catchingFishAppCompatPayPalArr != null && z) {
            z2 = true;
        }
        this.CatchingFishParcelableFAB = z2;
    }

    public void CatchingFishCoroutine(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        CatchingFishMVPKtorWidget catchingFishMVPKtorWidget;
        synchronized (this.CatchingFishSnackbar) {
            if (((ArrayDeque) this.CatchingFishCoroutine) != null && !this.CatchingFishParcelableFAB) {
                this.CatchingFishParcelableFAB = true;
                while (true) {
                    synchronized (this.CatchingFishSnackbar) {
                        try {
                            catchingFishMVPKtorWidget = (CatchingFishMVPKtorWidget) ((ArrayDeque) this.CatchingFishCoroutine).poll();
                            if (catchingFishMVPKtorWidget == null) {
                                this.CatchingFishParcelableFAB = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    catchingFishMVPKtorWidget.CatchingFishReduxKtor(catchingFishWorkManagerMVP);
                }
            }
        }
    }

    public boolean CatchingFishParcelableFAB(long j) {
        Object obj;
        List list = (List) ((CatchingFishViewModelIntent) this.CatchingFishCoroutine).CatchingFishDaggerWebsocket;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (((CatchingFishDaggerSnackbar) obj).CatchingFishParcelableFAB == j) {
                break;
            }
            i++;
        }
        CatchingFishDaggerSnackbar catchingFishDaggerSnackbar = (CatchingFishDaggerSnackbar) obj;
        if (catchingFishDaggerSnackbar != null) {
            return catchingFishDaggerSnackbar.CatchingFishViewModelFAB;
        }
        return false;
    }

    public void CatchingFishSnackbar(CatchingFishMVPKtorWidget catchingFishMVPKtorWidget) {
        synchronized (this.CatchingFishSnackbar) {
            try {
                if (((ArrayDeque) this.CatchingFishCoroutine) == null) {
                    this.CatchingFishCoroutine = new ArrayDeque();
                }
                ((ArrayDeque) this.CatchingFishCoroutine).add(catchingFishMVPKtorWidget);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
