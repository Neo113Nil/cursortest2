package kotlin.text;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishWebSocketView extends CatchingFishMockkRedux {
    public ArrayList CatchingFishCustomView;
    public boolean CatchingFishFragmentFactory;
    public boolean CatchingFishJobScheduler;
    public int CatchingFishMutableLiveData;
    public int CatchingFishPayPalService;

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishCardViewRealm() {
        if (this.CatchingFishCustomView.isEmpty()) {
            CatchingFishJobScheduler();
            CatchingFishOkHttp();
            return;
        }
        CatchingFishRoomFluxHilt catchingFishRoomFluxHilt = new CatchingFishRoomFluxHilt();
        catchingFishRoomFluxHilt.CatchingFishSnackbar = this;
        ArrayList arrayList = this.CatchingFishCustomView;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((CatchingFishMockkRedux) obj).CatchingFishParcelableFAB(catchingFishRoomFluxHilt);
        }
        this.CatchingFishMutableLiveData = this.CatchingFishCustomView.size();
        if (this.CatchingFishFragmentFactory) {
            ArrayList arrayList2 = this.CatchingFishCustomView;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((CatchingFishMockkRedux) obj2).CatchingFishCardViewRealm();
            }
            return;
        }
        for (int i3 = 1; i3 < this.CatchingFishCustomView.size(); i3++) {
            ((CatchingFishMockkRedux) this.CatchingFishCustomView.get(i3 - 1)).CatchingFishParcelableFAB(new CatchingFishRoomFluxHilt((CatchingFishMockkRedux) this.CatchingFishCustomView.get(i3)));
        }
        CatchingFishMockkRedux catchingFishMockkRedux = (CatchingFishMockkRedux) this.CatchingFishCustomView.get(0);
        if (catchingFishMockkRedux != null) {
            catchingFishMockkRedux.CatchingFishCardViewRealm();
        }
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishCardViewView(CatchingFishKtorViewModel catchingFishKtorViewModel) {
        this.CatchingFishPayPalService |= 8;
        int size = this.CatchingFishCustomView.size();
        for (int i = 0; i < size; i++) {
            ((CatchingFishMockkRedux) this.CatchingFishCustomView.get(i)).CatchingFishCardViewView(catchingFishKtorViewModel);
        }
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishCoroutine() {
        super.CatchingFishCoroutine();
        int size = this.CatchingFishCustomView.size();
        for (int i = 0; i < size; i++) {
            ((CatchingFishMockkRedux) this.CatchingFishCustomView.get(i)).CatchingFishCoroutine();
        }
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishCustomView(CatchingFishMoshiGson catchingFishMoshiGson) {
        super.CatchingFishCustomView(catchingFishMoshiGson);
        this.CatchingFishPayPalService |= 4;
        if (this.CatchingFishCustomView != null) {
            for (int i = 0; i < this.CatchingFishCustomView.size(); i++) {
                ((CatchingFishMockkRedux) this.CatchingFishCustomView.get(i)).CatchingFishCustomView(catchingFishMoshiGson);
            }
        }
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishEspressoTesting(ViewGroup viewGroup, CatchingFishFluxFluxBundle catchingFishFluxFluxBundle, CatchingFishFluxFluxBundle catchingFishFluxFluxBundle2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.CatchingFishDaggerWebsocket;
        int size = this.CatchingFishCustomView.size();
        for (int i = 0; i < size; i++) {
            CatchingFishMockkRedux catchingFishMockkRedux = (CatchingFishMockkRedux) this.CatchingFishCustomView.get(i);
            if (j > 0 && (this.CatchingFishFragmentFactory || i == 0)) {
                long j2 = catchingFishMockkRedux.CatchingFishDaggerWebsocket;
                if (j2 > 0) {
                    catchingFishMockkRedux.CatchingFishMutableLiveData(j2 + j);
                } else {
                    catchingFishMockkRedux.CatchingFishMutableLiveData(j);
                }
            }
            catchingFishMockkRedux.CatchingFishEspressoTesting(viewGroup, catchingFishFluxFluxBundle, catchingFishFluxFluxBundle2, arrayList, arrayList2);
        }
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishFragmentFactory() {
        this.CatchingFishPayPalService |= 2;
        int size = this.CatchingFishCustomView.size();
        for (int i = 0; i < size; i++) {
            ((CatchingFishMockkRedux) this.CatchingFishCustomView.get(i)).CatchingFishFragmentFactory();
        }
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    /* renamed from: CatchingFishFragmentHandler, reason: merged with bridge method [inline-methods] */
    public final CatchingFishMockkRedux clone() {
        CatchingFishWebSocketView catchingFishWebSocketView = (CatchingFishWebSocketView) super.clone();
        catchingFishWebSocketView.CatchingFishCustomView = new ArrayList();
        int size = this.CatchingFishCustomView.size();
        for (int i = 0; i < size; i++) {
            CatchingFishMockkRedux clone = ((CatchingFishMockkRedux) this.CatchingFishCustomView.get(i)).clone();
            catchingFishWebSocketView.CatchingFishCustomView.add(clone);
            clone.CatchingFishEspressoTesting = catchingFishWebSocketView;
        }
        return catchingFishWebSocketView;
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishGsonAppCompat(View view) {
        super.CatchingFishGsonAppCompat(view);
        int size = this.CatchingFishCustomView.size();
        for (int i = 0; i < size; i++) {
            ((CatchingFishMockkRedux) this.CatchingFishCustomView.get(i)).CatchingFishGsonAppCompat(view);
        }
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishMVPRobolectric(TimeInterpolator timeInterpolator) {
        this.CatchingFishPayPalService |= 1;
        ArrayList arrayList = this.CatchingFishCustomView;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((CatchingFishMockkRedux) this.CatchingFishCustomView.get(i)).CatchingFishMVPRobolectric(timeInterpolator);
            }
        }
        this.CatchingFishViewModelScope = timeInterpolator;
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishMutableLiveData(long j) {
        this.CatchingFishDaggerWebsocket = j;
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final CatchingFishMockkRedux CatchingFishParcelableFlux(CatchingFishRetrofitView catchingFishRetrofitView) {
        super.CatchingFishParcelableFlux(catchingFishRetrofitView);
        return this;
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishPayPal(long j) {
        ArrayList arrayList;
        this.CatchingFishWorkManager = j;
        if (j < 0 || (arrayList = this.CatchingFishCustomView) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((CatchingFishMockkRedux) this.CatchingFishCustomView.get(i)).CatchingFishPayPal(j);
        }
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final String CatchingFishPayPalService(String str) {
        String CatchingFishPayPalService = super.CatchingFishPayPalService(str);
        for (int i = 0; i < this.CatchingFishCustomView.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(CatchingFishPayPalService);
            sb.append("\n");
            sb.append(((CatchingFishMockkRedux) this.CatchingFishCustomView.get(i)).CatchingFishPayPalService(str + "  "));
            CatchingFishPayPalService = sb.toString();
        }
        return CatchingFishPayPalService;
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishReduxKtor(CatchingFishDaggerJUnit catchingFishDaggerJUnit) {
        if (CatchingFishJetpackCompose(catchingFishDaggerJUnit.CatchingFishSnackbar)) {
            ArrayList arrayList = this.CatchingFishCustomView;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                CatchingFishMockkRedux catchingFishMockkRedux = (CatchingFishMockkRedux) obj;
                if (catchingFishMockkRedux.CatchingFishJetpackCompose(catchingFishDaggerJUnit.CatchingFishSnackbar)) {
                    catchingFishMockkRedux.CatchingFishReduxKtor(catchingFishDaggerJUnit);
                    catchingFishDaggerJUnit.CatchingFishCoroutine.add(catchingFishMockkRedux);
                }
            }
        }
    }

    public final void CatchingFishSensorManager(CatchingFishMockkRedux catchingFishMockkRedux) {
        this.CatchingFishCustomView.add(catchingFishMockkRedux);
        catchingFishMockkRedux.CatchingFishEspressoTesting = this;
        long j = this.CatchingFishWorkManager;
        if (j >= 0) {
            catchingFishMockkRedux.CatchingFishPayPal(j);
        }
        if ((this.CatchingFishPayPalService & 1) != 0) {
            catchingFishMockkRedux.CatchingFishMVPRobolectric(this.CatchingFishViewModelScope);
        }
        if ((this.CatchingFishPayPalService & 2) != 0) {
            catchingFishMockkRedux.CatchingFishFragmentFactory();
        }
        if ((this.CatchingFishPayPalService & 4) != 0) {
            catchingFishMockkRedux.CatchingFishCustomView(this.CatchingFishGsonAppCompat);
        }
        if ((this.CatchingFishPayPalService & 8) != 0) {
            catchingFishMockkRedux.CatchingFishCardViewView(null);
        }
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishSpannableWidget(View view) {
        super.CatchingFishSpannableWidget(view);
        int size = this.CatchingFishCustomView.size();
        for (int i = 0; i < size; i++) {
            ((CatchingFishMockkRedux) this.CatchingFishCustomView.get(i)).CatchingFishSpannableWidget(view);
        }
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishViewModelScope(CatchingFishDaggerJUnit catchingFishDaggerJUnit) {
        if (CatchingFishJetpackCompose(catchingFishDaggerJUnit.CatchingFishSnackbar)) {
            ArrayList arrayList = this.CatchingFishCustomView;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                CatchingFishMockkRedux catchingFishMockkRedux = (CatchingFishMockkRedux) obj;
                if (catchingFishMockkRedux.CatchingFishJetpackCompose(catchingFishDaggerJUnit.CatchingFishSnackbar)) {
                    catchingFishMockkRedux.CatchingFishViewModelScope(catchingFishDaggerJUnit);
                    catchingFishDaggerJUnit.CatchingFishCoroutine.add(catchingFishMockkRedux);
                }
            }
        }
    }

    @Override // kotlin.text.CatchingFishMockkRedux
    public final void CatchingFishWorkManager(CatchingFishDaggerJUnit catchingFishDaggerJUnit) {
        int size = this.CatchingFishCustomView.size();
        for (int i = 0; i < size; i++) {
            ((CatchingFishMockkRedux) this.CatchingFishCustomView.get(i)).CatchingFishWorkManager(catchingFishDaggerJUnit);
        }
    }
}
