package kotlin.text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class CatchingFishMVVMMVIRoom implements Iterable, CatchingFishCardViewFAB {
    public int CatchingFishCloudMessaging;
    public int CatchingFishDaggerWebsocket;
    public boolean CatchingFishFragmentHandler;
    public HashMap CatchingFishOkHttp;
    public CatchingFishLayoutGsonRoom CatchingFishUnitTesting;
    public int CatchingFishViewModelFAB;
    public int CatchingFishViewModelScope;
    public int[] CatchingFishReduxKtor = new int[0];
    public Object[] CatchingFishWorkManager = new Object[0];
    public final Object CatchingFishLayout = new Object();
    public ArrayList CatchingFishEspressoTesting = new ArrayList();

    public final CatchingFishAnimationMVP CatchingFishCoroutine() {
        if (this.CatchingFishFragmentHandler) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.CatchingFishViewModelFAB++;
        return new CatchingFishAnimationMVP(this);
    }

    public final CatchingFishGoogleMapsMVP CatchingFishDaggerWebsocket() {
        if (this.CatchingFishFragmentHandler) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Cannot start a writer when another writer is pending");
        }
        if (this.CatchingFishViewModelFAB > 0) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Cannot start a writer when a reader is pending");
        }
        this.CatchingFishFragmentHandler = true;
        this.CatchingFishCloudMessaging++;
        return new CatchingFishGoogleMapsMVP(this);
    }

    public final int CatchingFishParcelableFAB(CatchingFishMockkPicasso catchingFishMockkPicasso) {
        if (this.CatchingFishFragmentHandler) {
            CatchingFishUnitTestingFlux.CatchingFishCoroutine("Use active SlotWriter to determine anchor location instead");
        }
        if (!catchingFishMockkPicasso.CatchingFishParcelableFAB()) {
            CatchingFishMVPAndroidXKtor.CatchingFishParcelableFAB("Anchor refers to a group that was removed");
        }
        return catchingFishMockkPicasso.CatchingFishParcelableFAB;
    }

    public final void CatchingFishSnackbar() {
        this.CatchingFishOkHttp = new HashMap();
    }

    public final CatchingFishKtorHilt CatchingFishViewModelScope(int i) {
        int i2;
        ArrayList arrayList;
        int CatchingFishDaggerWebsocket;
        HashMap hashMap = this.CatchingFishOkHttp;
        if (hashMap != null) {
            if (this.CatchingFishFragmentHandler) {
                CatchingFishUnitTestingFlux.CatchingFishCoroutine("use active SlotWriter to crate an anchor for location instead");
            }
            CatchingFishMockkPicasso catchingFishMockkPicasso = (i < 0 || i >= (i2 = this.CatchingFishDaggerWebsocket) || (CatchingFishDaggerWebsocket = CatchingFishMockkKtorGlide.CatchingFishDaggerWebsocket((arrayList = this.CatchingFishEspressoTesting), i, i2)) < 0) ? null : (CatchingFishMockkPicasso) arrayList.get(CatchingFishDaggerWebsocket);
            if (catchingFishMockkPicasso != null) {
                return (CatchingFishKtorHilt) hashMap.get(catchingFishMockkPicasso);
            }
        }
        return null;
    }

    public final boolean CatchingFishWorkManager(CatchingFishMockkPicasso catchingFishMockkPicasso) {
        int CatchingFishDaggerWebsocket;
        return catchingFishMockkPicasso.CatchingFishParcelableFAB() && (CatchingFishDaggerWebsocket = CatchingFishMockkKtorGlide.CatchingFishDaggerWebsocket(this.CatchingFishEspressoTesting, catchingFishMockkPicasso.CatchingFishParcelableFAB, this.CatchingFishDaggerWebsocket)) >= 0 && CatchingFishFirebaseDagger.CatchingFishOkHttp(this.CatchingFishEspressoTesting.get(CatchingFishDaggerWebsocket), catchingFishMockkPicasso);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new CatchingFishDaggerDagger(this, 0, this.CatchingFishDaggerWebsocket);
    }
}
