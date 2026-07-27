package kotlin.text;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CatchingFishMVPDatabinding {
    public final CatchingFishGoogleMapsMoshi CatchingFishCoroutine;
    public final HashSet CatchingFishDaggerWebsocket;
    public int CatchingFishParcelableFAB;
    public final ArrayList CatchingFishReduxKtor;
    public int CatchingFishSnackbar;
    public final CatchingFishStateFlowMockk CatchingFishViewModelFAB;
    public boolean CatchingFishViewModelScope;
    public boolean CatchingFishWorkManager;

    public CatchingFishMVPDatabinding(int i, int i2, CatchingFishStateFlowMockk catchingFishStateFlowMockk, CatchingFishGraphQLMoshi catchingFishGraphQLMoshi) {
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = catchingFishStateFlowMockk.CatchingFishCoroutine;
        this.CatchingFishReduxKtor = new ArrayList();
        this.CatchingFishDaggerWebsocket = new HashSet();
        this.CatchingFishWorkManager = false;
        this.CatchingFishViewModelScope = false;
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = i2;
        this.CatchingFishCoroutine = catchingFishGoogleMapsMoshi;
        catchingFishGraphQLMoshi.CatchingFishParcelableFAB(new CatchingFishEspressoPayPal(7, this));
        this.CatchingFishViewModelFAB = catchingFishStateFlowMockk;
    }

    public final void CatchingFishCoroutine(int i, int i2) {
        int CatchingFishParcelableFlux = CatchingFishMVPLiveData.CatchingFishParcelableFlux(i2);
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = this.CatchingFishCoroutine;
        if (CatchingFishParcelableFlux == 0) {
            if (this.CatchingFishParcelableFAB != 1) {
                if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                    Objects.toString(catchingFishGoogleMapsMoshi);
                }
                this.CatchingFishParcelableFAB = i;
                return;
            }
            return;
        }
        if (CatchingFishParcelableFlux != 1) {
            if (CatchingFishParcelableFlux != 2) {
                return;
            }
            if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                Objects.toString(catchingFishGoogleMapsMoshi);
            }
            this.CatchingFishParcelableFAB = 1;
            this.CatchingFishSnackbar = 3;
            return;
        }
        if (this.CatchingFishParcelableFAB == 1) {
            if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                Objects.toString(catchingFishGoogleMapsMoshi);
            }
            this.CatchingFishParcelableFAB = 2;
            this.CatchingFishSnackbar = 2;
        }
    }

    public final void CatchingFishParcelableFAB() {
        HashSet hashSet = this.CatchingFishDaggerWebsocket;
        if (this.CatchingFishWorkManager) {
            return;
        }
        this.CatchingFishWorkManager = true;
        if (hashSet.isEmpty()) {
            CatchingFishSnackbar();
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CatchingFishGraphQLMoshi catchingFishGraphQLMoshi = (CatchingFishGraphQLMoshi) obj;
            synchronized (catchingFishGraphQLMoshi) {
                try {
                    if (!catchingFishGraphQLMoshi.CatchingFishParcelableFAB) {
                        catchingFishGraphQLMoshi.CatchingFishParcelableFAB = true;
                        catchingFishGraphQLMoshi.CatchingFishCoroutine = true;
                        CatchingFishMockkDaggerHilt catchingFishMockkDaggerHilt = catchingFishGraphQLMoshi.CatchingFishSnackbar;
                        if (catchingFishMockkDaggerHilt != null) {
                            try {
                                catchingFishMockkDaggerHilt.onCancel();
                            } catch (Throwable th) {
                                synchronized (catchingFishGraphQLMoshi) {
                                    catchingFishGraphQLMoshi.CatchingFishCoroutine = false;
                                    catchingFishGraphQLMoshi.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (catchingFishGraphQLMoshi) {
                            catchingFishGraphQLMoshi.CatchingFishCoroutine = false;
                            catchingFishGraphQLMoshi.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void CatchingFishReduxKtor() {
        int i = this.CatchingFishSnackbar;
        CatchingFishStateFlowMockk catchingFishStateFlowMockk = this.CatchingFishViewModelFAB;
        if (i != 2) {
            if (i == 3) {
                CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi = catchingFishStateFlowMockk.CatchingFishCoroutine;
                View CatchingFishMVPRobolectric = catchingFishGoogleMapsMoshi.CatchingFishMVPRobolectric();
                if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                    Objects.toString(CatchingFishMVPRobolectric.findFocus());
                    CatchingFishMVPRobolectric.toString();
                    catchingFishGoogleMapsMoshi.toString();
                }
                CatchingFishMVPRobolectric.clearFocus();
                return;
            }
            return;
        }
        CatchingFishGoogleMapsMoshi catchingFishGoogleMapsMoshi2 = catchingFishStateFlowMockk.CatchingFishCoroutine;
        View findFocus = catchingFishGoogleMapsMoshi2.CatchingFishPayPalService.findFocus();
        if (findFocus != null) {
            catchingFishGoogleMapsMoshi2.CatchingFishWorkManager().CatchingFishCloudMessaging = findFocus;
            if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                findFocus.toString();
                catchingFishGoogleMapsMoshi2.toString();
            }
        }
        View CatchingFishMVPRobolectric2 = this.CatchingFishCoroutine.CatchingFishMVPRobolectric();
        if (CatchingFishMVPRobolectric2.getParent() == null) {
            catchingFishStateFlowMockk.CatchingFishSnackbar();
            CatchingFishMVPRobolectric2.setAlpha(0.0f);
        }
        if (CatchingFishMVPRobolectric2.getAlpha() == 0.0f && CatchingFishMVPRobolectric2.getVisibility() == 0) {
            CatchingFishMVPRobolectric2.setVisibility(4);
        }
        CatchingFishGradleEspresso catchingFishGradleEspresso = catchingFishGoogleMapsMoshi2.CatchingFishDagger;
        CatchingFishMVPRobolectric2.setAlpha(catchingFishGradleEspresso == null ? 1.0f : catchingFishGradleEspresso.CatchingFishFragmentHandler);
    }

    public final void CatchingFishSnackbar() {
        if (!this.CatchingFishViewModelScope) {
            if (CatchingFishToastSharedFlow.CatchingFishFragmentFactory(2)) {
                toString();
            }
            this.CatchingFishViewModelScope = true;
            ArrayList arrayList = this.CatchingFishReduxKtor;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.CatchingFishViewModelFAB.CatchingFishCloudMessaging();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Operation {");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} {mFinalState = ");
        int i = this.CatchingFishParcelableFAB;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED");
        sb.append("} {mLifecycleImpact = ");
        int i2 = this.CatchingFishSnackbar;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE");
        sb.append("} {mFragment = ");
        sb.append(this.CatchingFishCoroutine);
        sb.append("}");
        return sb.toString();
    }
}
