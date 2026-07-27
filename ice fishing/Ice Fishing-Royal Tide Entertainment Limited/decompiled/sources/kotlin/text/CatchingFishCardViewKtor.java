package kotlin.text;

import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class CatchingFishCardViewKtor {
    public final HashSet CatchingFishCoroutine;
    public int CatchingFishDaggerWebsocket;
    public String CatchingFishParcelableFAB = null;
    public int CatchingFishReduxKtor;
    public final HashSet CatchingFishSnackbar;
    public final HashSet CatchingFishViewModelScope;
    public CatchingFishMockkAsyncTask CatchingFishWorkManager;

    public CatchingFishCardViewKtor(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.CatchingFishSnackbar = hashSet;
        this.CatchingFishCoroutine = new HashSet();
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishDaggerWebsocket = 0;
        this.CatchingFishViewModelScope = new HashSet();
        hashSet.add(CatchingFishFABDagger.CatchingFishParcelableFAB(cls));
        for (Class cls2 : clsArr) {
            CatchingFishLayoutRoom.CatchingFishViewModelFAB(cls2, "Null interface");
            this.CatchingFishSnackbar.add(CatchingFishFABDagger.CatchingFishParcelableFAB(cls2));
        }
    }

    public final void CatchingFishParcelableFAB(CatchingFishGlideDaggerHilt catchingFishGlideDaggerHilt) {
        if (this.CatchingFishSnackbar.contains(catchingFishGlideDaggerHilt.CatchingFishParcelableFAB)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        this.CatchingFishCoroutine.add(catchingFishGlideDaggerHilt);
    }

    public final CatchingFishToastKtor CatchingFishSnackbar() {
        if (this.CatchingFishWorkManager != null) {
            return new CatchingFishToastKtor(this.CatchingFishParcelableFAB, new HashSet(this.CatchingFishSnackbar), new HashSet(this.CatchingFishCoroutine), this.CatchingFishReduxKtor, this.CatchingFishDaggerWebsocket, this.CatchingFishWorkManager, this.CatchingFishViewModelScope);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }

    public CatchingFishCardViewKtor(CatchingFishFABDagger catchingFishFABDagger, CatchingFishFABDagger[] catchingFishFABDaggerArr) {
        HashSet hashSet = new HashSet();
        this.CatchingFishSnackbar = hashSet;
        this.CatchingFishCoroutine = new HashSet();
        this.CatchingFishReduxKtor = 0;
        this.CatchingFishDaggerWebsocket = 0;
        this.CatchingFishViewModelScope = new HashSet();
        hashSet.add(catchingFishFABDagger);
        for (CatchingFishFABDagger catchingFishFABDagger2 : catchingFishFABDaggerArr) {
            CatchingFishLayoutRoom.CatchingFishViewModelFAB(catchingFishFABDagger2, "Null interface");
        }
        Collections.addAll(this.CatchingFishSnackbar, catchingFishFABDaggerArr);
    }
}
