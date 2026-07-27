package kotlin.text;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class CatchingFishPayPalCardView {
    public static final List CatchingFishJetpackCompose = Collections.EMPTY_LIST;
    public CatchingFishToolbarBundle CatchingFish;
    public int CatchingFishFragmentHandler;
    public RecyclerView CatchingFishNavigation;
    public final View CatchingFishParcelableFAB;
    public WeakReference CatchingFishSnackbar;
    public int CatchingFishCoroutine = -1;
    public int CatchingFishReduxKtor = -1;
    public long CatchingFishDaggerWebsocket = -1;
    public int CatchingFishWorkManager = -1;
    public int CatchingFishViewModelScope = -1;
    public CatchingFishPayPalCardView CatchingFishViewModelFAB = null;
    public CatchingFishPayPalCardView CatchingFishLayout = null;
    public final ArrayList CatchingFishCloudMessaging = null;
    public final List CatchingFishEspressoTesting = null;
    public int CatchingFishOkHttp = 0;
    public CatchingFishSnackbarCameraX CatchingFishUnitTesting = null;
    public boolean CatchingFishAnimationMockk = false;
    public int CatchingFishStateLiveData = 0;
    public int CatchingFishRoomDatabase = -1;

    public CatchingFishPayPalCardView(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.CatchingFishParcelableFAB = view;
    }

    public final boolean CatchingFishAnimationMockk() {
        return (this.CatchingFishFragmentHandler & 128) != 0;
    }

    public final boolean CatchingFishCloudMessaging() {
        return (this.CatchingFishFragmentHandler & 2) != 0;
    }

    public final List CatchingFishCoroutine() {
        ArrayList arrayList;
        return ((this.CatchingFishFragmentHandler & 1024) != 0 || (arrayList = this.CatchingFishCloudMessaging) == null || arrayList.size() == 0) ? CatchingFishJetpackCompose : this.CatchingFishEspressoTesting;
    }

    public final boolean CatchingFishDaggerWebsocket() {
        return (this.CatchingFishFragmentHandler & 1) != 0;
    }

    public final void CatchingFishEspressoTesting(int i, boolean z) {
        if (this.CatchingFishReduxKtor == -1) {
            this.CatchingFishReduxKtor = this.CatchingFishCoroutine;
        }
        if (this.CatchingFishViewModelScope == -1) {
            this.CatchingFishViewModelScope = this.CatchingFishCoroutine;
        }
        if (z) {
            this.CatchingFishViewModelScope += i;
        }
        this.CatchingFishCoroutine += i;
        View view = this.CatchingFishParcelableFAB;
        if (view.getLayoutParams() != null) {
            ((CatchingFishGradleDagger) view.getLayoutParams()).CatchingFishCoroutine = true;
        }
    }

    public final boolean CatchingFishFragmentHandler() {
        return (this.CatchingFishFragmentHandler & 256) != 0;
    }

    public final boolean CatchingFishLayout() {
        return this.CatchingFishUnitTesting != null;
    }

    public final void CatchingFishOkHttp() {
        this.CatchingFishFragmentHandler = 0;
        this.CatchingFishCoroutine = -1;
        this.CatchingFishReduxKtor = -1;
        this.CatchingFishDaggerWebsocket = -1L;
        this.CatchingFishViewModelScope = -1;
        this.CatchingFishOkHttp = 0;
        this.CatchingFishViewModelFAB = null;
        this.CatchingFishLayout = null;
        ArrayList arrayList = this.CatchingFishCloudMessaging;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.CatchingFishFragmentHandler &= -1025;
        this.CatchingFishStateLiveData = 0;
        this.CatchingFishRoomDatabase = -1;
        RecyclerView.CatchingFishFragmentHandler(this);
    }

    public final void CatchingFishParcelableFAB(int i) {
        this.CatchingFishFragmentHandler = i | this.CatchingFishFragmentHandler;
    }

    public final boolean CatchingFishReduxKtor() {
        View view = this.CatchingFishParcelableFAB;
        return (view.getParent() == null || view.getParent() == this.CatchingFishNavigation) ? false : true;
    }

    public final int CatchingFishSnackbar() {
        int i = this.CatchingFishViewModelScope;
        return i == -1 ? this.CatchingFishCoroutine : i;
    }

    public final boolean CatchingFishStateLiveData() {
        return (this.CatchingFishFragmentHandler & 32) != 0;
    }

    public final void CatchingFishUnitTesting(boolean z) {
        int i = this.CatchingFishOkHttp;
        int i2 = z ? i - 1 : i + 1;
        this.CatchingFishOkHttp = i2;
        if (i2 < 0) {
            this.CatchingFishOkHttp = 0;
            toString();
        } else if (!z && i2 == 1) {
            this.CatchingFishFragmentHandler |= 16;
        } else if (z && i2 == 0) {
            this.CatchingFishFragmentHandler &= -17;
        }
    }

    public final boolean CatchingFishViewModelFAB() {
        return (this.CatchingFishFragmentHandler & 8) != 0;
    }

    public final boolean CatchingFishViewModelScope() {
        if ((this.CatchingFishFragmentHandler & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = CatchingFishFABCameraX.CatchingFishParcelableFAB;
        return !this.CatchingFishParcelableFAB.hasTransientState();
    }

    public final boolean CatchingFishWorkManager() {
        return (this.CatchingFishFragmentHandler & 4) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.CatchingFishCoroutine + " id=" + this.CatchingFishDaggerWebsocket + ", oldPos=" + this.CatchingFishReduxKtor + ", pLpos:" + this.CatchingFishViewModelScope);
        if (CatchingFishLayout()) {
            sb.append(" scrap ");
            sb.append(this.CatchingFishAnimationMockk ? "[changeScrap]" : "[attachedScrap]");
        }
        if (CatchingFishWorkManager()) {
            sb.append(" invalid");
        }
        if (!CatchingFishDaggerWebsocket()) {
            sb.append(" unbound");
        }
        if ((this.CatchingFishFragmentHandler & 2) != 0) {
            sb.append(" update");
        }
        if (CatchingFishViewModelFAB()) {
            sb.append(" removed");
        }
        if (CatchingFishAnimationMockk()) {
            sb.append(" ignored");
        }
        if (CatchingFishFragmentHandler()) {
            sb.append(" tmpDetached");
        }
        if (!CatchingFishViewModelScope()) {
            sb.append(" not recyclable(" + this.CatchingFishOkHttp + ")");
        }
        if ((this.CatchingFishFragmentHandler & 512) != 0 || CatchingFishWorkManager()) {
            sb.append(" undefined adapter position");
        }
        if (this.CatchingFishParcelableFAB.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
